package org.remus.cmdline.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.osgi.framework.Version;
import org.remus.cmdline.ui.wizards.NewProjectWizardPage.ProjectProperties;

public class NewProjectCreationOperation extends WorkspaceModifyOperation {
	private Display fDisplay;
	private IProject fProject;
	private IPath fPath;

	public static final String EDITOR_ID = "org.remus.cmdline.CommandLine";
	public static final String XTEXT_NATURE_ID = "org.eclipse.xtext.ui.shared.xtextNature";
	public static final String XTEXT_BUILDER_ID = "org.eclipse.xtext.ui.shared.xtextNature";
	private ProjectProperties fProperties;

	public NewProjectCreationOperation(Display display, IProject project,
			IPath path, ProjectProperties properties) {
		fDisplay = display;
		fProject = project;
		fPath = path;
		fProperties = properties;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.actions.WorkspaceModifyOperation#execute(org.eclipse.core
	 * .runtime.IProgressMonitor)
	 */
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {

		monitor.beginTask("Creating project...", 3);

		createProject(fProject, fPath, monitor);
		fProject.open(monitor);
		addNatureToProject(fProject, XTEXT_NATURE_ID, monitor);
		monitor.worked(1);

		monitor.subTask("Creating files...");
		createMainFile();
		if ((Boolean) fProperties.withExampleData.getValue()) {
			copyTemplate();
		}
		fProject.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
		monitor.worked(1);

		openFile(fProject.getFile("main.cmdline"));
		monitor.worked(1);

	}

	private void createMainFile() {
		StringWriter swriter = new StringWriter();
		PrintWriter writer = new PrintWriter(swriter);
		if ((Boolean) fProperties.withExampleData.getValue()) {
			writer.println("system "+fProperties.identifier.getValue()+" {\n" + 
					"	port -> "+fProperties.port.getValue()+"\n" + 
					"	version -> \""+Version.parseVersion((String) fProperties.version.getValue()).toString()+"\"\n" + 
					"	registerProgram -> cutycapt\n" + 
					"	registerProgram -> ffmpeg\n" + 
					"	registerProgram -> graphicksmagick\n" + 
					"} ");
		} else {
			writer.println("system "+fProperties.identifier.getValue()+" {\n" + 
					"	port -> "+fProperties.port.getValue()+"\n" + 
					"	version -> \""+Version.parseVersion((String) fProperties.version.getValue()).toString()+"\"\n" + 
					"} ");
		}
		writer.flush();
		writeFile(fProject.getFile("main.cmdline"), swriter); //$NON-NLS-1$
		
	}

	public void copyTemplate() {

		
		Enumeration<URL> findEntries = Platform.getBundle("org.remus.cmdline.ui")
				.findEntries("project-template", "*", true);
		while (findEntries.hasMoreElements()) {
			URL url = (URL) findEntries.nextElement();

			InputStream openStream = null;
			IPath removeFirstSegments = new Path(url.getFile())
					.removeFirstSegments(1);
			try {
				if (removeFirstSegments.getFileExtension() != null
						&& removeFirstSegments.getFileExtension().length() > 0) {
					openStream = url.openStream();
					fProject
							.getFile(removeFirstSegments)
							.create(openStream,
									true,
									new org.eclipse.core.runtime.NullProgressMonitor());
				} else {
					fProject.getProject()
							.getFolder(removeFirstSegments)
							.create(true,
									true,
									new org.eclipse.core.runtime.NullProgressMonitor());
				}

			} catch (IOException e) {
				//

			} catch (CoreException e) {
				// TODO error-handling
			} finally {
				try {
					if (openStream != null) {
						openStream.close();

					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	private void openFile(final IFile file) {
		fDisplay.asyncExec(new Runnable() {
			public void run() {
				IWorkbenchWindow ww = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow();
				if (ww == null) {
					return;
				}
				IWorkbenchPage page = ww.getActivePage();
				if (page == null || !file.exists())
					return;
				IWorkbenchPart focusPart = page.getActivePart();
				if (focusPart instanceof ISetSelectionTarget) {
					ISelection selection = new StructuredSelection(file);
					((ISetSelectionTarget) focusPart).selectReveal(selection);
				}
				try {
					page.openEditor(new FileEditorInput(file), EDITOR_ID);
				} catch (PartInitException e) {
				}
			}
		});
	}



	private void writeFile(IFile file, StringWriter swriter) {
		try {
			ByteArrayInputStream stream = new ByteArrayInputStream(swriter
					.toString().getBytes("UTF8")); //$NON-NLS-1$
			if (file.exists()) {
				file.setContents(stream, false, false, null);
			} else {
				file.create(stream, false, null);
			}
			stream.close();
			swriter.close();
		} catch (Exception e) {
			//
		}
	}

	public static void createProject(IProject project, IPath location,
			IProgressMonitor monitor) throws CoreException {
		if (!Platform.getLocation().equals(location)) {
			IProjectDescription desc = project.getWorkspace()
					.newProjectDescription(project.getName());
			desc.setLocation(location);
			ICommand[] commands = desc.getBuildSpec();
			// add builder to project
			ICommand command = desc.newCommand();
			command.setBuilderName(XTEXT_BUILDER_ID);
			ICommand[] nc = new ICommand[commands.length + 1];
			// Add it before other builders.
			System.arraycopy(commands, 0, nc, 1, commands.length);
			nc[0] = command;
			desc.setBuildSpec(nc);
			project.create(desc, monitor);
		} else {
			project.create(monitor);
		}
		
	}

	public static void addNatureToProject(IProject proj, String natureId,
			IProgressMonitor monitor) throws CoreException {
		IProjectDescription description = proj.getDescription();
		String[] prevNatures = description.getNatureIds();
		String[] newNatures = new String[prevNatures.length + 1];
		System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
		newNatures[prevNatures.length] = natureId;
		description.setNatureIds(newNatures);
		proj.setDescription(description, monitor);
	}

}

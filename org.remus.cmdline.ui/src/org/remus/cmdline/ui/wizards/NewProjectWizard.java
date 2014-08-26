/**
 * 
 */
package org.remus.cmdline.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.remus.cmdline.ui.wizards.NewProjectWizardPage.ProjectProperties;

/**
 * @author seidelt
 *
 */
public class NewProjectWizard extends Wizard implements INewWizard {

	private NewProjectWizardPage page1;

	/**
	 * 
	 */
	public NewProjectWizard() {
		setNeedsProgressMonitor(true);
		setWindowTitle("New Project");
	}
	
	@Override
	public void addPages() {
		addPage(this.page1 = new NewProjectWizardPage("newProject"));
		super.addPages();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		try {
			final IProject project = page1.getProjectHandle();
			final IPath location = page1.getLocationPath();
			final ProjectProperties properties = page1.getProperties();
			IRunnableWithProgress op = new NewProjectCreationOperation(getShell().getDisplay(), project, location, properties);
			getContainer().run(false, true, op);
		} catch (InvocationTargetException e) {
			// TODO log
			return false;
		} catch (InterruptedException e) {
			return false;
		}
		return true;
	}

}

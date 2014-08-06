/**
 * 
 */
package org.remus.cmdline.generator;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Tom
 *
 */
public class FileCopyUtil {
	
	

	public static void copyTemplate(Resource resource) {
		
		IPath path = new Path(resource.getURI().toPlatformString(true));//Here files[i] is the URI
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		file.getProject().getFolder("src-gen");
		Enumeration<URL> findEntries = Platform.getBundle("org.remus.cmdline").findEntries("template", "*", true);
		while (findEntries.hasMoreElements()) {
			URL url = (URL) findEntries.nextElement();
			
			InputStream openStream = null;
			IPath removeFirstSegments = new Path(url.getFile()).removeFirstSegments(1);
			try {
				openStream = url.openStream();
				file.getProject().getFolder("src-gen").getFile(removeFirstSegments).create(openStream, true, new org.eclipse.core.runtime.NullProgressMonitor());
			} catch (IOException e) {
				//this is the folder
				try {
					file.getProject().getFolder("src-gen").getFolder(removeFirstSegments).create(true, true, new org.eclipse.core.runtime.NullProgressMonitor());
				} catch (CoreException e1) {
					// TODO error-handling
				}
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

}

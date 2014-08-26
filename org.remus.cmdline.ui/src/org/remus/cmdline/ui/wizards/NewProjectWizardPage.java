/**
 * 
 */
package org.remus.cmdline.ui.wizards;

import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.osgi.framework.Version;
import org.remus.cmdline.ui.wizards.NewProjectWizardPage.ProjectProperties;

/**
 * @author seidelt
 *
 */
public class NewProjectWizardPage extends WizardNewProjectCreationPage {
	
	public class ProjectProperties {
		WritableValue identifier;
		
		WritableValue port;
		
		WritableValue version;
		
		WritableValue withExampleData;
	}

	private ProjectProperties properties;

	public NewProjectWizardPage(String pageName) {
		super(pageName);
		setTitle("Create new Commandline-Hero project");
		this.properties = new ProjectProperties();
		properties.identifier = new WritableValue("com.myproject.cmdline", null);
		properties.port = new WritableValue(8080, null);
		properties.version = new WritableValue("1.0.0", null);
		properties.withExampleData= new WritableValue(true, null);
		
	}
	
	@Override
	protected boolean validatePage() {
		boolean page = super.validatePage();
		if (page) {
			String identifier = (String) properties.identifier.getValue();
			if (identifier.trim().length() == 0 || identifier.split("\\.").length < 2) {
				setErrorMessage("Not a valid identifier (xxx.yyy.zzz)");
				return false;
			}
			String version = (String) properties.version.getValue();
			try {
				if (Version.parseVersion(version) == null) {
					setErrorMessage("Not a valid version (x.y.z)");
					return false;
					
				}
			} catch (IllegalArgumentException e) {
				setErrorMessage("Not a valid version (x.y.z)");
				return false;
			}
			
		}
		if (page) {
			setErrorMessage(null);
		}
		return page;
	}
	
	@Override
	public void createControl(Composite parent) {
		
		super.createControl(parent);
		Composite control = (Composite) getControl();
		GridLayout layout = new GridLayout(1,false);
		control.setLayout(layout);
		PropertiesComposite composite = new PropertiesComposite(control, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		composite.bindValues(properties);
		IValueChangeListener valueChangeListener = new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				setPageComplete(validatePage());
			}
		};
		properties.identifier.addValueChangeListener(valueChangeListener);
		properties.version.addValueChangeListener(valueChangeListener);
	}

	public ProjectProperties getProperties() {
		return properties;
	}

}

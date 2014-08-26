package org.remus.cmdline.ui.wizards;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.remus.cmdline.ui.wizards.NewProjectWizardPage.ProjectProperties;

public class PropertiesComposite extends Composite {
	private Text identifierText;
	private Text versionText;
	private Spinner portSpinner;
	private Button btnEmptyProject;
	private Button btnProjectWithExample;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public PropertiesComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, false));

		Group grpProperties = new Group(this, SWT.NONE);
		grpProperties.setLayout(new GridLayout(2, false));
		grpProperties.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		grpProperties.setText("Properties");

		Label lblIdentifier = new Label(grpProperties, SWT.NONE);
		lblIdentifier.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblIdentifier.setText("Identifier");

		identifierText = new Text(grpProperties, SWT.BORDER);
		identifierText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Label lblPort = new Label(grpProperties, SWT.NONE);
		lblPort.setText("Port");

		portSpinner = new Spinner(grpProperties, SWT.BORDER);
		portSpinner.setPageIncrement(1);
		portSpinner.setMaximum(9000);
		portSpinner.setMinimum(80);

		Label lblVersion = new Label(grpProperties, SWT.NONE);
		lblVersion.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblVersion.setText("Version");

		versionText = new Text(grpProperties, SWT.BORDER);
		versionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Group grpExampledata = new Group(this, SWT.NONE);
		grpExampledata.setLayout(new GridLayout(1, false));
		grpExampledata.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		grpExampledata.setText("Data");

		btnEmptyProject = new Button(grpExampledata, SWT.RADIO);
		btnEmptyProject.setText("Empty project");

		btnProjectWithExample = new Button(grpExampledata, SWT.RADIO);
		btnProjectWithExample.setText("Project with example data");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public void bindValues(ProjectProperties properties) {
		DataBindingContext context = new DataBindingContext();
		context.bindValue(
				WidgetProperties.text(SWT.Modify).observe(identifierText),
				properties.identifier);
		context.bindValue(WidgetProperties.selection().observe(portSpinner),
				properties.port);
		context.bindValue(
				WidgetProperties.text(SWT.Modify).observe(versionText),
				properties.version);
		context.bindValue(
				WidgetProperties.selection().observe(btnProjectWithExample),
				properties.withExampleData);

	}
}

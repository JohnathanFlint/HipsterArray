package hipster.view;

import hipster.controller.HipsterController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HipsterPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JComboBox dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private HipsterController baseController;
	
	public HipsterPanel (HipsterController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("Click the button");
		this.infoLabel = new JLabel ("Wow words!");
		this.dropDown = new JComboBox (baseController.getHipsters());
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void  setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(infoLabel);
		this.add(myButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, dropDown, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, myButton, 109, SpringLayout.SOUTH, infoLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 183, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 152, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		dropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				infoLabel.setText(dropDown.getSelectedItem().toString());
			}
		});
		
		myButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.impactHipsters();
				repaint();
			}
		});
	}
}

package hipster.view;

import javax.swing.*;
import hipster.controller.HipsterController;
import java.awt.Color;

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
		this.dropDown = new JComboBox (baseController.getWords());
		
		
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
		
	}
}

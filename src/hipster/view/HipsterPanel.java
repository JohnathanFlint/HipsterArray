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
		
	}
	
	private void setupListeners()
	{
		
	}
}

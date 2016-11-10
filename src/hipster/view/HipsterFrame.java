package hipster.view;

import javax.swing.*;
import hipster.controller.HipsterController;
import java.awt.Dimension;

public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel appPanel;
	
	public HipsterFrame (HipsterController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Wow a Window!?!");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
}

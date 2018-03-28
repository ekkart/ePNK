package dk.dtu.imm.se2.group6.visual;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class Window extends JFrame 
{
	private static final long serialVersionUID = 1L;

	public Window(final Animator canvas)
	{
		super("Animator");

		getContentPane().add(canvas, BorderLayout.CENTER);
		// buttons
		{
			JMenuBar menubar = new JMenuBar();
			FlowLayout layout = new FlowLayout();
			layout.setHgap(20);
			JPanel panel = new JPanel(layout);
			getContentPane().add(panel, BorderLayout.SOUTH);
			// start
			{
				JButton button = new JButton("Start");
				panel.add(button);

				ActionListener actionListener = new ActionListener()
				{
					public void actionPerformed(ActionEvent actionEvent)
					{
						canvas.setUpdatePosition(true);
						if(canvas.isInitStart())
						{
							canvas.getSimulator().start(canvas);
						}
						canvas.setInitStart(false);
					}
				};
				button.addActionListener(actionListener);  
			}
			// stop
			{
				JButton button = new JButton("Stop");
				panel.add(button);

				ActionListener actionListener = new ActionListener()
				{
					public void actionPerformed(ActionEvent actionEvent)
					{
						canvas.setUpdatePosition(false);
					}
				};
				button.addActionListener(actionListener);
			}
			// reset
			{
				JButton button = new JButton("Reset");
				panel.add(button);

				ActionListener actionListener = new ActionListener()
				{
					public void actionPerformed(ActionEvent actionEvent)
					{
						canvas.setReset(true);
						canvas.setInitStart(true);
					}
				};
				button.addActionListener(actionListener);
			}
			/**
			 *@author: Magnus Felix s093265
			 */
			{
				JMenu viewMenu = new JMenu("View");
				final JMenuItem collisionAction =   new JMenuItem("Hide Collision");
				viewMenu.add(collisionAction);
				menubar.add(viewMenu);
				this.setJMenuBar(menubar);
				ActionListener actionListener = new ActionListener()
				{
					public void actionPerformed(ActionEvent actionEvent)
					{
						if(canvas.isIndicateCollision()){
							canvas.setIndicateCollision(false);
							collisionAction.setText("Show Collision");
						}
						else{
							canvas.setIndicateCollision(true);
							collisionAction.setText("Hide Collisions");

						}
					}
				};
				collisionAction.addActionListener(actionListener);
			}

		}
		setSize(canvas.getSize());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
	}

}
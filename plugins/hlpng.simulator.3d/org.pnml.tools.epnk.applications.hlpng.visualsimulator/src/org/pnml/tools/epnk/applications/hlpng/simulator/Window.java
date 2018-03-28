/*******************************************************************************
 * Copyright (c) 2012 Mindaugas Laganeckas.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mindaugas Laganeckas - initial API and implementation
 ******************************************************************************/
package org.pnml.tools.epnk.applications.hlpng.simulator;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import dk.dtu.imm.se2.group6.visual.Animator;

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
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setAlwaysOnTop(true);
	}

}

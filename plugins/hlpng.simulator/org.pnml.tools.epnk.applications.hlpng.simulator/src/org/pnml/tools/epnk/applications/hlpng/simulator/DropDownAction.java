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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IMenuCreator;

/*
 * See http://www.eclipse.org/forums/index.php/m/455864/
 */

public class DropDownAction extends Action implements IMenuCreator
{
	private Menu fMenu;
	private final List<Action> actions = new ArrayList<Action>();
	
	public DropDownAction(final HLSimulator simulator)
	{
		setMenuCreator(this);
		
		// create actions
		{
			Action action = new Action("0 ms", Action.AS_CHECK_BOX)
			{
				public void run()
				{
					for(Action action : actions)
					{
						action.setChecked(false);
					}
					this.setChecked(true);
					
					simulator.setSimulationPause(0);
				}
			};
			actions.add(action);
		}
		{
			Action action = new Action("100 ms", Action.AS_CHECK_BOX)
			{
				public void run()
				{
					for(Action action : actions)
					{
						action.setChecked(false);
					}
					this.setChecked(true);
					
					simulator.setSimulationPause(100);
				}
			};
			actions.add(action);
			action.setChecked(true);
		}
		{
			Action action = new Action("500 ms", Action.AS_CHECK_BOX)
			{
				public void run()
				{
					for(Action action : actions)
					{
						action.setChecked(false);
					}
					this.setChecked(true);
					
					simulator.setSimulationPause(500);
				}
			};
			actions.add(action);
		}
		{
			Action action = new Action("1000 ms", Action.AS_CHECK_BOX)
			{
				public void run()
				{
					for(Action action : actions)
					{
						action.setChecked(false);
					}
					this.setChecked(true);
					
					simulator.setSimulationPause(1000);
				}
			};
			actions.add(action);
		}
		{
			Action action = new Action("2000 ms", Action.AS_CHECK_BOX)
			{
				public void run()
				{
					for(Action action : actions)
					{
						action.setChecked(false);
					}
					this.setChecked(true);
					
					simulator.setSimulationPause(2000);
				}
			};
			actions.add(action);
		}
	}

	@Override
	public void dispose()
	{
		if(fMenu != null)
		{
			fMenu.dispose();
			fMenu = null;
		}
	}

	@Override
	public Menu getMenu(Menu parent)
	{
		return null;
	}

	@Override
	public Menu getMenu(Control parent)
	{
		if(fMenu != null) fMenu.dispose();
		
		fMenu = new Menu(parent);
		
		for(Action a : actions)
		{
			addActionToMenu(fMenu, a);
		}

		return fMenu;
	}

	
	protected void addActionToMenu(Menu parent, Action action)
	{
		ActionContributionItem item = new ActionContributionItem(action);
		item.fill(parent, -1);
	}

	void clear()
	{
		dispose();
	}
}

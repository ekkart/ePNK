package dk.dtu.imm.se2.group6.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dk.dtu.imm.se2.group6.interfaces.IModel;

public class CollisionDetector
{
	private List<IModel> models = null;
	private Map<IModel, Boolean> colliding = null;
	
	public CollisionDetector()
	{
		this.models = new ArrayList<IModel>();
		this.colliding = new HashMap<IModel, Boolean>();
	}
	
	public void register(IModel item)
	{
		models.add(item);
		colliding.put(item, false);
	}
	
	public void unregister(IModel item)
	{
		if(colliding.containsKey(item))
		{
			colliding.remove(item);
		}
		if(models.contains(item))
		{
			models.remove(item);	
		}
	}
	
	public boolean isRegistered(IModel item)
	{
		return models.contains(item);
	}
	
	public boolean isColliding(IModel item)
	{
		if(!colliding.containsKey(item) || colliding.get(item) == null)
		{
			return false;
		}
		return colliding.get(item);
	}
	
	public void resetCollisionFlag()
	{
		for(IModel model : colliding.keySet())
		{
			colliding.put(model, false);
		}
	}
	
	public boolean checkCollision(IModel model)
	{
		for(IModel currModel : models)
		{
			if(currModel.getBoundingSurface() != null && currModel != model)
			{
				if(currModel.getBoundingSurface().checkCollision(model.getBoundingSurface()))
				{
					colliding.put(model, true);
					return true;
				}
			}
		}
		colliding.put(model, false);
		return false;
	}
}

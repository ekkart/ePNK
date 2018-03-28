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
package org.pnml.tools.epnk.applications.hlpng.runtime.operations.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IntValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.PosValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.ProductValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.RuntimeValueFactory;
import org.pnml.tools.epnk.applications.hlpng.runtime.operations.AbstractValueMath;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;

public class TestAbstractValueMath extends AbstractValueMath
{
	private RuntimeValueFactory factory = new RuntimeValueFactory();
	
	@Test
	public void testLightCopy()
    {
		IValue key = null;
		IMSValue initial = null;
		Integer multiplicity = 7;
		
		{
			initial = factory.createMSValue();
			initial.setSort(TermsFactory.eINSTANCE.createMultiSetSort());
			
			key = factory.createMSValue();

			initial.put(key, multiplicity);
		}
		
    	IMSValue testSet = AbstractValueMath.lightCopy(initial, factory);
    	
    	assertEquals(testSet.getSort(), initial.getSort());
    	assertEquals(initial.size(), 1);
    	assertEquals(testSet.size(), 1);
  
    	{
        	List<Entry<IValue, Integer>> initListValues = 
        			new ArrayList<Entry<IValue, Integer>>(initial.entrySet());

        	List<Entry<IValue, Integer>> testListValues = 
        			new ArrayList<Entry<IValue, Integer>>(testSet.entrySet());
        	
        	assertEquals(initListValues.get(0), testListValues.get(0));
    	}
    	{
    		initial.clear();
        	assertEquals(initial.size(), 0);
        	
        	assertEquals(testSet.size(), 1);
    	}
    }
	
	

	private IMSValue mainMs = null;
	
	private PosValue multiplicity = null;
	private IntValue intValue9 = null;
	
	private IMSValue msAppend = null;
	private IntValue intAppend9 = null;
	private IntValue intAppend19 = null;
	
	private IntValue tmpValue10 = null;
	
	@Before
	public void setUp() throws Exception
	{
		mainMs = factory.createMSValue();
        {
        	multiplicity = new PosValue();
    		multiplicity.setN(8);
    		multiplicity.setSort(IntegersFactory.eINSTANCE.createPositive());
    		
        	intValue9 = new IntValue();
            intValue9.setN(9);
            intValue9.setSort(IntegersFactory.eINSTANCE.createInteger());
            
            mainMs = AbstractValueMath.add(mainMs, intValue9, multiplicity.getN(), factory);
        }
        
        msAppend = factory.createMSValue();
        {
        	intAppend9 = new IntValue();
        	intAppend9.setN(9);
        	intAppend9.setSort(IntegersFactory.eINSTANCE.createInteger());
        	msAppend = AbstractValueMath.add(msAppend, intAppend9, 1, factory);
        	
        	intAppend19 = new IntValue();
        	intAppend19.setN(19);
        	intAppend19.setSort(IntegersFactory.eINSTANCE.createInteger());
        	
        	msAppend = AbstractValueMath.add(msAppend, intAppend19, 1, factory);
        }
        {
        	tmpValue10 = new IntValue();
        	tmpValue10.setN(10);
        	tmpValue10.setSort(IntegersFactory.eINSTANCE.createInteger());
        }
	}

	@After
	public void tearDown() throws Exception
	{
		multiplicity = null;
		
		intValue9 = null;
    	
    	msAppend = null;
    	intAppend9 = null;
    	intAppend19 = null;
    	
    	tmpValue10 = null;

    	mainMs = null;
	}

	@Test
	public void testGetMultiplicity()
    {
        assertEquals(multiplicity.getN(), getMultiplicity(mainMs, intValue9));
    }
	
	@Test
    public void testAdd__AbstractValue_int()
    {
    	// simple number
    	{
    		IMSValue test = AbstractValueMath.add(mainMs, tmpValue10, 1, factory);
    		
            assertEquals(1, getMultiplicity(test, tmpValue10));
    	}
    	// products
    	{
    		IMSValue IMSValue = factory.createMSValue();
    		ProductValue p1 = createProductValue(5, 6);
    		ProductValue p2 = createProductValue(5, 6);
    		ProductValue p3 = createProductValue(7, 8);
    		
    		ProductValue pTest1 = createProductValue(5, 6);
    		ProductValue pTest2 = createProductValue(7, 8);
    		
    		IMSValue = AbstractValueMath.add(IMSValue, p1, 1, factory);
    		IMSValue = AbstractValueMath.add(IMSValue, p2, 2, factory);
    		IMSValue = AbstractValueMath.add(IMSValue, p3, 1, factory);
    		

    		assertNotNull(getMultiplicity(IMSValue, pTest1));
    		assertEquals(3, getMultiplicity(IMSValue, pTest1));
    		assertEquals(1, getMultiplicity(IMSValue, pTest2));
    	}
    	// multisets of products
    	{
    		IMSValue IMSValue = factory.createMSValue();
    		{
        		IMSValue v1 = createIMSValue(6, 5, factory);
        		IMSValue = AbstractValueMath.add(IMSValue, v1, 1, factory);
        		IMSValue v2 = createIMSValue(6, 5, factory);
        		IMSValue = AbstractValueMath.add(IMSValue, v2, 2, factory);
        		IMSValue v22 = createIMSValue(5, 6, factory);
        		IMSValue = AbstractValueMath.add(IMSValue, v22, 1, factory);
        		
        		IMSValue test1 = createIMSValue(6, 5, factory);
        		assertNotNull(getMultiplicity(IMSValue, test1));
        		assertEquals(4, getMultiplicity(IMSValue, test1));
    		}
    		{
        		IMSValue v3 = createIMSValue(10, 15, factory);
        		IMSValue = AbstractValueMath.add(IMSValue, v3, 5, factory);
        		
        		IMSValue test2 = createIMSValue(10, 15, factory);

        		assertEquals(5, getMultiplicity(IMSValue, test2));	
    		}
    	}
    	// products of multisets of products
    	{
    		IMSValue msValue = factory.createMSValue();
    		{
    			ProductValue pValue = new ProductValue();
    			pValue.setSort(TermsFactory.eINSTANCE.createProductSort());
    			pValue.getComponents().add(createIMSValue(4, 5, factory));
    			msValue = AbstractValueMath.add(msValue, pValue, 1, factory);
    			
    		}
    		{
    			ProductValue pValue = new ProductValue();
    			pValue.setSort(TermsFactory.eINSTANCE.createProductSort());
    			pValue.getComponents().add(createIMSValue(4, 5, factory));
    			msValue = AbstractValueMath.add(msValue, pValue, 2, factory);
    		}
    		{
    			ProductValue pValue = new ProductValue();
    			pValue.setSort(TermsFactory.eINSTANCE.createProductSort());
    			pValue.getComponents().add(createIMSValue(5, 4, factory));
    			
    			assertEquals(3, getMultiplicity(msValue, pValue));
    		}
    	}
    }
	@Test
    public void testAppend__IMSValue()
    {
		IMSValue mainMs = factory.createMSValue();
		{
    		IntValue intValue9 = new IntValue();
            intValue9.setN(9);
            intValue9.setSort(IntegersFactory.eINSTANCE.createInteger());
            
            mainMs = AbstractValueMath.add(mainMs, intValue9, 8, factory);
		}
		
		IMSValue msAppend = factory.createMSValue();
        {
        	IntValue intAppend9 = new IntValue();
        	intAppend9.setN(9);
        	intAppend9.setSort(IntegersFactory.eINSTANCE.createInteger());
        	msAppend = AbstractValueMath.add(msAppend, intAppend9, 1, factory);
        	
        	IntValue intAppend19 = new IntValue();
        	intAppend19.setN(19);
        	intAppend19.setSort(IntegersFactory.eINSTANCE.createInteger());
        	msAppend = AbstractValueMath.add(msAppend, intAppend19, 1, factory);
        }
		
    	IMSValue test = AbstractValueMath.append(mainMs, msAppend, factory);
  
    	{
    		IntValue intAppend9 = new IntValue();
        	intAppend9.setN(9);
        	intAppend9.setSort(IntegersFactory.eINSTANCE.createInteger());
        	assertTrue(9 == getMultiplicity(test, intAppend9));
    	}
    	
    }
    
	private static int getMultiplicity(IMSValue set, IValue value)
	{
		return set.get(value);
	}
	
    private static IMSValue createIMSValue(int a, int b, RuntimeValueFactory factory)
    {
    	IMSValue IMSValue = factory.createMSValue();
    	//IMSValue.setSort(TermsFactory.eINSTANCE.createMultiSetSort());
    	IMSValue = AbstractValueMath.add(IMSValue, createProductValue(a, b), 1, factory);
    	IMSValue = AbstractValueMath.add(IMSValue, createProductValue(b, a), 1, factory);

		return IMSValue;
    }
    
    private static ProductValue createProductValue(int a, int b)
    {
    	ProductValue pValue = new ProductValue();
		pValue.setSort(TermsFactory.eINSTANCE.createProductSort());
		{
			IntValue v = new IntValue();
			v.setN(a);
			pValue.getComponents().add(v);
		}
		{
			IntValue v = new IntValue();
			v.setN(b);
			pValue.getComponents().add(v);
		}
		return pValue;
    }

}

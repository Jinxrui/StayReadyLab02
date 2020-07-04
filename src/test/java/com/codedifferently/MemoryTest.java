package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {
    
    @Test
    public void addMemoryTest(){
        Memory m = new Memory();
        CalcFeatures c = new CalcFeatures();

        m.addMem(c.getCurrentValue());

        Assert.assertEquals(c.getCurrentValue(), m.recall(), .1);
    }

    @Test
    public void recallTest(){
        Memory m = new Memory();
        m.recall();
        Assert.assertEquals(0, m.recall(), 0);
    }

    @Test
    public void resetTest(){
        Memory m = new Memory();
        CalcFeatures c = new CalcFeatures();
        m.addMem(c.getCurrentValue());
        m.reset();
        Assert.assertEquals(0, m.recall(), 0);
    }
}
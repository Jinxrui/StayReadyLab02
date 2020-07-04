package com.codedifferently;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest 
{
    /**
     * Rigorous Test :-)
     
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    */

    @Test
    public void changeDisplayModeTest(){
        Mode mode = new Mode();
        SciCalculator.changeDisplayMode(mode);

        Assert.assertEquals("Binary", mode.getDisplayMode());
    }
    
}

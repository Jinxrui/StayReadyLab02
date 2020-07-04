package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class ModeTest {
    
    @Test
    public void getDisplayModeTest(){
        Mode m = new Mode();

        Assert.assertEquals("decimal", m.getDisplayMode());
    }

    @Test
    public void switchDisplayModeTest(){
        Mode m = new Mode();
        m.switchDisplayMode();
        Assert.assertEquals("hexadecimal", m.getDisplayMode());
    }
    
    @Test
    public void switchDisplayMode2Test(){
        Mode m = new Mode();
        m.switchDisplayMode("Binary");
        Assert.assertEquals("binary", m.getDisplayMode());
    }

    @Test
    public void getUnitsModeTest(){
        Mode m = new Mode();
        Assert.assertEquals("degrees", m.getUnitsMode());
    }

    @Test
    public void switchUnitsModeTest(){
        Mode m = new Mode();
        m.switchUnitsMode();
        Assert.assertEquals("radians", m.getUnitsMode());
    }
    
    @Test
    public void switchUnitsMode2Test(){
        Mode m = new Mode();
        m.switchUnitsMode("Radians");
        Assert.assertEquals("radians", m.getUnitsMode());
    }
}
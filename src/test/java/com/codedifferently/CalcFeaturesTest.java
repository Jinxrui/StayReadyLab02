package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CalcFeaturesTest {
    @Test
    public void factorialTest(){
        CalcFeatures c = new CalcFeatures();

        Assert.assertEquals(6, c.fact(3));
    }

    @Test
    public void fibonnacciTest(){
        CalcFeatures c = new CalcFeatures();

        Assert.assertEquals(21, c.fib(8));
    }

    @Test
    public void getCurrentValueTest(){
        CalcFeatures c = new CalcFeatures();

        Assert.assertEquals(0.0, c.getCurrentValue(), 0);
    }

    @Test
    public void setCurrentValueTest(){
        CalcFeatures c = new CalcFeatures();

        c.setCurrentValue(30);
        Assert.assertEquals(30.0, c.getCurrentValue(), 0);
    }

    @Test
    public void resetTest(){
        CalcFeatures c = new CalcFeatures();

        c.setCurrentValue(30);
        c.reset();
        Assert.assertEquals(0.0, c.getCurrentValue(), 0);
    }

    @Test
    public void addTest(){
        CalcFeatures c = new CalcFeatures();

        c.add(30);
        Assert.assertEquals(30.0, c.getCurrentValue(), 0);
    }

    @Test
    public void subTest(){
        CalcFeatures c = new CalcFeatures();

        c.add(30);
        c.sub(20);
        Assert.assertEquals(10.0, c.getCurrentValue(), 0);
    }

    @Test
    public void multTest(){
        CalcFeatures c = new CalcFeatures();

        c.add(30);
        c.sub(20);
        c.mult(10);
        Assert.assertEquals(100.0, c.getCurrentValue(), 0);
    }

    @Test
    public void divTest(){
        CalcFeatures c = new CalcFeatures();

        c.add(30);
        c.sub(20);
        c.mult(10);
        c.div(5);
        Assert.assertEquals(20.0, c.getCurrentValue(), 0);
    }

    @Test
    public void expTest(){
        CalcFeatures c = new CalcFeatures();

        c.add(30);
        c.sub(20);
        c.exp(3);
        Assert.assertEquals(1000.0, c.getCurrentValue(), 0);
    }

    @Test
    public void squaredTest(){
        CalcFeatures c = new CalcFeatures();

        c.add(30);
        c.sub(20);
        c.squared();
        Assert.assertEquals(100.0, c.getCurrentValue(), 0);
    }

    @Test
    public void sqrtTest(){
        CalcFeatures c = new CalcFeatures();

        c.add(30);
        c.sub(20);
        c.squared();
        c.sqrt();
        Assert.assertEquals(10.0, c.getCurrentValue(), 0);
    }

    @Test
    public void modTest(){
        CalcFeatures c = new CalcFeatures();

        c.add(30);
        c.sub(20);
        c.squared();
        c.mod(10);
        Assert.assertEquals(0.0, c.getCurrentValue(), 0);
    }

    @Test
    public void invTest(){
        CalcFeatures c = new CalcFeatures();

        c.add(30);
        c.sub(20);
        c.squared();
        c.inv();
        Assert.assertEquals(0.1, c.getCurrentValue(), .1);
    }

    @Test
    public void changeSignsTest(){
        CalcFeatures c = new CalcFeatures();

        c.add(30);
        c.sub(20);
        c.squared();
        c.changeSign();
        Assert.assertEquals(-100.0, c.getCurrentValue(), 0);
    }

    @Test
    public void sineTest(){
        CalcFeatures c = new CalcFeatures();

        c.setCurrentValue(90);
        c.sine();
        Assert.assertEquals(Math.sin(90), c.getCurrentValue(), .0001);
    }

    @Test
    public void cosineTest(){
        CalcFeatures c = new CalcFeatures();

        c.setCurrentValue(90);
        c.cosine();
        Assert.assertEquals(Math.cos(90), c.getCurrentValue(), .0001);
    }

    @Test
    public void tangentTest(){
        CalcFeatures c = new CalcFeatures();

        c.setCurrentValue(90);
        c.tangent();
        Assert.assertEquals(Math.tan(90), c.getCurrentValue(), .0001);
    }

    @Test
    public void arcsineTest(){
        CalcFeatures c = new CalcFeatures();

        c.setCurrentValue(1);
        c.arcsine();
        Assert.assertEquals(Math.asin(1), c.getCurrentValue(), .0001);
    }

    @Test
    public void arccosineTest(){
        CalcFeatures c = new CalcFeatures();

        c.setCurrentValue(1);
        c.arccosine();
        Assert.assertEquals(Math.acos(1), c.getCurrentValue(), .0001);
    }

    @Test
    public void arctangentTest(){
        CalcFeatures c = new CalcFeatures();

        c.setCurrentValue(1);
        c.arctangent();
        Assert.assertEquals(Math.atan(1), c.getCurrentValue(), .0001);
    }

    @Test
    public void getPiTest(){
        CalcFeatures c = new CalcFeatures();

        c.getPi();

        Assert.assertEquals(3.14, c.getCurrentValue(), .01);
    }

    @Test
    public void setCurrentValue(){
        CalcFeatures c = new CalcFeatures();

        c.setCurrentValue(30);

        Assert.assertEquals(30.0, c.getCurrentValue(), 0);
    }
    
}
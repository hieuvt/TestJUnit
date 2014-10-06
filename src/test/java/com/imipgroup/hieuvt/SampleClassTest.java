package com.imipgroup.hieuvt;

import junit.framework.TestCase;

public class SampleClassTest extends TestCase {

    SampleClass sampleClass;
    @Override
    protected void setUp() throws Exception {
        sampleClass = new SampleClass();
    }

    public void testSampleAdd() throws Exception {
        assertEquals(6, sampleClass.sampleAdd(3,3));
    }
}
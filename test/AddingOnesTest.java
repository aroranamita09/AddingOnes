package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddingOnesTest {
    AddingOnes obj;

    @Before
    public void setUp() throws Exception {
        obj = new AddingOnes();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void printUpdatedArray() {
        assertArrayEquals(new int[] {0, 0, 0},obj.updateBy1(3,3, new int[] { 0,0,0 }));


    }
}

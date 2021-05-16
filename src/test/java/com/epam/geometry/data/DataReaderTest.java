package com.epam.geometry.data;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DataReaderTest {
    @Test
    public void testDataReader(){
        DataReader testDataReader = new DataReader();
        List<String> testList = testDataReader.readLines("data.txt");
        assertNotNull(testList);
        assertTrue(testList.size() == 9);
    }



}

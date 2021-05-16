package com.epam.geometry.data;

import org.junit.Test;
import static org.junit.Assert.*;

public class DataExceptionTest {
    @Test
    public void testDataException(){
        DataException testException = new DataException("test message",new Exception());
        assertEquals(testException.getMessage(),"test message");
        assertTrue(testException.getCause() instanceof Exception);
    }
}

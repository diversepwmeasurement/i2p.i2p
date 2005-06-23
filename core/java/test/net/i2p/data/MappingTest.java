package net.i2p.data;
/*
 * free (adj.): unencumbered; not under the control of others
 * Written by jrandom in 2003 and released into the public domain 
 * with no warranty of any kind, either expressed or implied.  
 * It probably won't make your computer catch on fire, or eat 
 * your children, but it might.  Use at your own risk.
 *
 */

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import net.i2p.data.DataFormatException;
import net.i2p.data.DataHelper;

import junit.framework.TestCase;

/**
 * Test harness for the date structure
 *
 * @author jrandom
 */
public class MappingTest extends TestCase{
    
    public void testProperties() throws Exception{
        byte[] temp = null;
        
        Properties orig = new Properties();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        orig.setProperty("key1", "val1");
        orig.setProperty("key2", "val2");
        orig.setProperty("key3", "val3");
        
        DataHelper.writeProperties(baos, orig);
        temp = baos.toByteArray();
        
        
        Properties p = null;
        ByteArrayInputStream bais = new ByteArrayInputStream(temp);
        
        p = DataHelper.readProperties(bais);
        
        assertEquals(orig, p);
    }
    
}
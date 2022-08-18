package org.simpleproject;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.simpleproject.impl.StringWriter;
import org.simpleproject.utils.StringLowerCase;
import org.simpleproject.utils.StringUpperCase;

public class UpperLowerCaseTest {
	

    @Test
    public void UpperCaseTest() throws IOException{
        IWriter caseConvertor = new StringWriter(new StringUpperCase());
        caseConvertor.write("ssss THIS IS So So Huge!");
        assertEquals("SSSS THIS IS SO SO HUGE!", caseConvertor.getContent());
    }
    
    @Test
    public void LowerCaseTest() throws IOException{
        IWriter caseConvertor = new StringWriter(new StringLowerCase());
        caseConvertor.write("ssss THIS IS So So Huge!");
        assertEquals("ssss this is so so huge!", caseConvertor.getContent());
    }

}

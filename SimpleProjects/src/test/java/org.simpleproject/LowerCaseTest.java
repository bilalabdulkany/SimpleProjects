package org.simpleproject;

import org.junit.*;
import org.simpleproject.impl.StringWriter;
import org.simpleproject.utils.StringUpperCase;


import java.io.IOException;

public class LowerCaseTest {

    @Test
    public void UpperCaseTest() throws IOException{
        IWriter caseConvertor = new StringWriter(new StringUpperCase());
        caseConvertor.write("ssss THIS IS So So Huge!");
        System.out.println( caseConvertor.getContent());

    }
}

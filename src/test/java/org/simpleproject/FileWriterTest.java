package org.simpleproject;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.simpleproject.impl.FileWriter;
import org.simpleproject.utils.StringStupidRemover;
import org.simpleproject.utils.StringUpperCase;

public class FileWriterTest {
	@Test
    public void FileWriterToLowerCase()  throws IOException{
        FileWriter writer=new FileWriter(new StringUpperCase(new StringStupidRemover()));
        writer.setFilePath("D:\\test.txt");
        writer.write("S S Stupid stupid stupid story story stupid! stupid!");
        assertEquals("S S STUPID S***** S***** STORY STORY S*****! S*****!", writer.getContent());
        writer.close();
        assertEquals("S S STUPID S***** S***** STORY STORY S*****! S*****!", writer.getContent());
       

    }
}

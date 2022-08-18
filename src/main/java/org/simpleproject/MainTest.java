package org.simpleproject;

import org.simpleproject.impl.FileWriter;
import org.simpleproject.impl.StringWriter;
import org.simpleproject.utils.StringDuplicateRemover;
import org.simpleproject.utils.StringLowerCase;
import org.simpleproject.utils.StringStupidRemover;
import org.simpleproject.utils.StringUpperCase;

import java.io.IOException;

public class MainTest {

   public static void main(String [] args) throws IOException {
    MainTest testMain = new MainTest();

/*
       testMain.WriteStringLowerCase();
       System.out.println("****-Stupid Remover-***");
       testMain.StupidRemoverTest();
       System.out.println("****-Duplicate Remover-***");
       testMain.DuplicateRemoverTest();
       System.out.println("****-UpperCase Converter-***");
       testMain.UpperCaseTest();
       System.out.println("****-Composite LowCase DupRem RemStupid Converter-***");
       testMain.Composite_LwCase_DupRem_StupidRem_Test();
       System.out.println("****-Composite upCase RemStupid Close stream Converter-***");
       testMain.Composite_UpCase_StupidCloseStreamTest();
*/
    testMain.FileWriterToLowerCase();
   }

   public void WriteStringLowerCase() throws IOException{
       IWriter stringWriter=new StringWriter(new StringLowerCase());
       stringWriter.write("THIS IS SIMPLE ssss SSssS!!");
       System.out.println(stringWriter.getContent());
       stringWriter.close();
       System.out.println("----After Closing");
       stringWriter.write("ABCHDHaaa aAaaaa stupid stupid!!");

       System.out.println(stringWriter.getContent());
       //stringWriter.close();

   }

    public void FileWriterToLowerCase()  throws IOException{
        FileWriter writer=new FileWriter(new StringUpperCase(new StringStupidRemover()));
        writer.setFilePath("D:\\test.txt");
        writer.write("S S Stupid stupid stupid story story stupid! stupid!");
        System.out.println( writer.getContent());
        writer.close();
        writer.write("Some mmore stupid stupid text!");
        System.out.println(writer.getContent());

    }
}


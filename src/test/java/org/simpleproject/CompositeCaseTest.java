package org.simpleproject;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.simpleproject.impl.StringWriter;
import org.simpleproject.utils.StringDuplicateRemover;
import org.simpleproject.utils.StringLowerCase;
import org.simpleproject.utils.StringStupidRemover;
import org.simpleproject.utils.StringUpperCase;

public class CompositeCaseTest {
	

	   @Test
	   public void StupidRemoverTest() throws IOException{
	       IWriter caseConvertor = new StringWriter(new StringStupidRemover());
	        caseConvertor.write("Stupid stupid stupiDD story stupid!");
	        assertEquals("Stupid s***** stupiDD story s*****!",caseConvertor.getContent());

	    }
	   @Test
	   public void DuplicateRemoverTest() throws IOException{

	        IWriter caseConvertor = new StringWriter(new StringDuplicateRemover());
	        caseConvertor.write("S S Stupid stupid stupid story  story stupid! stupid!");
	        assertEquals("S Stupid stupid story stupid!",caseConvertor.getContent());

	    }
	   
	   @Test	
	   public void Composite_LwCase_DupRem_StupidRem_Test() throws IOException{

	        IWriter caseConvertor = new StringWriter(new StringLowerCase(new StringDuplicateRemover(new StringStupidRemover())));
	       caseConvertor.write("S S Stupid stupid stupid story story stupid! stupid!");	       
	       assertEquals("s stupid s***** story s*****!",caseConvertor.getContent());

	    }
	   
	   @Test
	   public void Composite_UpCase_StupidCloseStreamTest() throws IOException{

	        IWriter writer=new StringWriter(new StringUpperCase(new StringStupidRemover()));
	       writer.write("S S Stupid stupid stupid story story stupid! stupid!");
	        assertEquals("S S STUPID S***** S***** STORY STORY S*****! S*****!",writer.getContent());
	        writer.close();
	        writer.write("Some mmore stupid stupid text!");
	        assertEquals("S S STUPID S***** S***** STORY STORY S*****! S*****!",writer.getContent());

	    }

}

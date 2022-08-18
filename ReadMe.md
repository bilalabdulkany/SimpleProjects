# Writer Test

This class would output contents based on the Functions provided.

**StringLowerCase()**: This converts the string being written to all lower case

**StringUpperCase()**: This converts the string being written to all upper case

**StringStupidRemover()**: This replaces the word stupid (only in lower case) to s*****

**StringDuplicateRemover()**: This removes consecutive duplicated words. For example,
 "This is is it" will replaced by "This is it" when this function is applied.

You can add composite functions as well like:

       IWriter writer=new StringWriter(new StringUpperCase(new StringStupidRemover()));
 
1. close() method will close the stream and will not allow any input to be parsed
2. getContent() method will show the contents of what needs to be printed

i. You can add any operation to the constructor of the IWriter concrete class
ii. By default there is StringWriter and FileWriter, you can have SocketWriter in the future by extending
iii. Decorator Pattern used as the structural pattern. Open for extension and closed for editing!

##### In Order to Test:


       IWriter stringWriter=new StringWriter(new StringLowerCase());
       stringWriter.write("THIS IS SIMPLE ssss SSssS!!");
       
       System.out.println(stringWriter.getContent());
       
       
       stringWriter.close();
       
       System.out.println("----After Closing");
       
       stringWriter.write("ABCHDHaaa aAaaaa stupid stupid!!");

       System.out.println(stringWriter.getContent());



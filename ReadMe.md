
In order to test:

IWriter stringWriter=new StringWriter(new StringLowerCase());
       stringWriter.write("THIS IS SIMPLE ssss SSssS!!");
       System.out.println(stringWriter.getContent());
       stringWriter.close();
       System.out.println("----After Closing");
       stringWriter.write("ABCHDHaaa aAaaaa stupid stupid!!");

       System.out.println(stringWriter.getContent());
      
1. close() will close the stream and will not allow any input to be parsed
2. You can add any operation to the constructore of the IWriter concrete class
3. By default there is StringWriter and FileWriter, you can have SocketWriter in the future by extending
4. Decorator Pattern used. Open for extension!

package org.simpleproject.impl;

import org.simpleproject.IWriter;

import java.io.IOException;
import java.util.Objects;

public class FileWriter implements IWriter {

    java.io.FileWriter fileWriter = null;
    private boolean isClosed = false;
    private String content=null;
    private String filePath=null;
    private final IWriter _writer;

    public FileWriter(IWriter writer){
       this._writer=writer;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath){
        this.filePath = filePath;
    }

    public String write(String content) throws IOException {
        if (!isClosed) {
            this.content=_writer.write(content);
            fileWriter = new java.io.FileWriter(Objects.requireNonNull(filePath,"File Path is missing!"));
            fileWriter.write(this.content);
            fileWriter.flush();
        }
        return "";
    }

    public void close() {
        this.isClosed = true;

    }
    public String getContent() {
        return this.content;
    }

    @Override
    public void setContent(String content) {
        this.content=content;
    }


}

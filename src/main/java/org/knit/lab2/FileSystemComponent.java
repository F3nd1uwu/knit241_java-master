package org.knit.lab2;

import java.util.ArrayList;

public abstract class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract String getName();
    public abstract long getSize();
    public abstract void add(FileSystemComponent component);
    public abstract void remove(FileSystemComponent component);
    public abstract void display(String indent);
}

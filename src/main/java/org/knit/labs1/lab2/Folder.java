package org.knit.labs1.lab2;

import java.util.ArrayList;

public class Folder extends FileSystemComponent {
    private ArrayList<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileSystemComponent component : children) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + getName());
        for (FileSystemComponent component : children) {
            component.display(indent + "\t");
        }
    }
}

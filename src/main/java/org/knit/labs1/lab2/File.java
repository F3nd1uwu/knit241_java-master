package org.knit.labs1.lab2;

public class File extends FileSystemComponent {
    private long size;

    public File(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("File does not support add operation.");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("File does not support remove operation.");
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + getName() + " (" + getSize() + " bytes)");
    }
}

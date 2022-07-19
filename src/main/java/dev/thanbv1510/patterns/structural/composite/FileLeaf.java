package dev.thanbv1510.patterns.structural.composite;

public class FileLeaf implements FileComponent {
    private String name;
    private long size;

    public FileLeaf(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showProperties() {
        System.out.println("Name: " + name + ", Size: " + size);
    }

    @Override
    public long totalSize() {
        return size;
    }
}

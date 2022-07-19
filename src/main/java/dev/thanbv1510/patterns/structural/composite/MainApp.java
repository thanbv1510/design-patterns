package dev.thanbv1510.patterns.structural.composite;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        FileComponent file1 = new FileLeaf("file 1", 100);
        FileComponent file2 = new FileLeaf("file 2", 131);
        FileComponent file3 = new FileLeaf("file 3", 31);

        List<FileComponent> files = Arrays.asList(file1, file2, file3);

        FileComponent folder = new FolderComposite(files);
        folder.showProperties();
        System.out.println("Total size: " + folder.totalSize());
    }
}

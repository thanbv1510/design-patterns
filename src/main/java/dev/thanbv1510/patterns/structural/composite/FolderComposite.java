package dev.thanbv1510.patterns.structural.composite;

import java.util.List;

public class FolderComposite implements FileComponent {
    private final List<FileComponent> fileComponents;

    public FolderComposite(List<FileComponent> fileComponents) {
        this.fileComponents = fileComponents;
    }

    @Override
    public void showProperties() {
        fileComponents.forEach(FileComponent::showProperties);
    }

    @Override
    public long totalSize() {
        return fileComponents.stream().mapToLong(FileComponent::totalSize).sum();
    }
}

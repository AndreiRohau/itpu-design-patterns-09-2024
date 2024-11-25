package com.arohau.visitor.ex1;

public class Main {
    public static void main(String[] args) {
        Directory directory1 = new Directory("Directory1");
        File file1 = new File("file1.txt", 100);
        directory1.addElement(file1);

        Directory directory2 = new Directory("Directory2");
        File file2 = new File("file2.txt", 200);
        directory2.addElement(file2);

        directory1.addElement(directory2);

        CalculateSizeVisitor visitor = new CalculateSizeVisitor();
        directory1.accept(visitor);

        System.out.println("Total size: " + visitor.getTotalSize());
    }
}

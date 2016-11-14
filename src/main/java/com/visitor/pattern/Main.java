package com.visitor.pattern;

public class Main {
    public static void main(String[] args) {
        ComputerPart part = new Computer();
        part.accept(new ComputerPartDisplayVisitor());
    }
}

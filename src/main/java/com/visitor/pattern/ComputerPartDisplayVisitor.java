package com.visitor.pattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying mouse");
    }

    public void visit(Computer computer) {
        System.out.println("Displaying computer");
    }
}

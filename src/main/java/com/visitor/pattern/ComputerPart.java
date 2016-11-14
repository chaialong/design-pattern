package com.visitor.pattern;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}

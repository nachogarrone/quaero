package com.ucu.teoria.dos.quaero.ast;

public abstract class Stmt {

    abstract public String unparse();

    @Override
    public abstract String toString();

    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object obj);
}

package org.example;

public abstract class AbstractIdentifier {

    public abstract boolean equals(Object o);
    public abstract int hashCode();

    public abstract String toLiteral();

}

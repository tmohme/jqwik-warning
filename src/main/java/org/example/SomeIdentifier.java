package org.example;

import java.util.Objects;

public class SomeIdentifier extends AbstractIdentifier {
    private final String id;

    static SomeIdentifier fromLiteral(String literal) {
        return new SomeIdentifier(literal);
    }

    private SomeIdentifier(String literal) {
        id = literal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeIdentifier that = (SomeIdentifier) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toLiteral() {
        return id;
    }
}

package org.example;

import java.util.Objects;

public class AnotherIdentifier extends AbstractIdentifier {
    private final String id;

    static AnotherIdentifier fromLiteral(String literal) {
        return new AnotherIdentifier(literal);
    }

    private AnotherIdentifier(String literal) {
        id = literal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnotherIdentifier that = (AnotherIdentifier) o;
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

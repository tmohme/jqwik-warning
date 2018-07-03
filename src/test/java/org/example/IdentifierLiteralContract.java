package org.example;

import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Label;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;

import static org.junit.jupiter.api.Assertions.assertEquals;

interface IdentifierLiteralContract<T extends AbstractIdentifier> {

    @Provide("validIdentifierLiterals")
    Arbitrary<String> validIdentifierLiterals();

    T fromLiteral(String literal);

    @Property
    @Label("equals another identifier when parsed from the same literal")
    default void equalsAnotherIdentifierWhenParsedFromTheSameLiteral(@ForAll("validIdentifierLiterals") String literal) {
        final T id1 = fromLiteral(literal);
        final T id2 = fromLiteral(literal);

        assertEquals(id1, id2);
    }

}

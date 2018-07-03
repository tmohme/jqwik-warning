package org.example;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Label;
import net.jqwik.api.Provide;

@Label("SomeIdentifierProperties")
class SomeIdentifierProperties implements IdentifierEqualsContract, IdentifierLiteralContract<SomeIdentifier> {
    @Provide("validIdentifierLiterals")
    public Arbitrary<String> validIdentifierLiterals() {
        return Arbitraries.strings().withCharRange('a', 'z');
    }

    public SomeIdentifier fromLiteral(String literal) {
        return SomeIdentifier.fromLiteral(literal);
    }
}

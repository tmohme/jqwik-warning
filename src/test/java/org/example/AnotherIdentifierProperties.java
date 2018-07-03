package org.example;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Label;
import net.jqwik.api.Provide;

@Label("AnotherIdentifierProperties")
class AnotherIdentifierProperties implements IdentifierEqualsContract, IdentifierLiteralContract<AnotherIdentifier> {
    @Provide("validIdentifierLiterals")
    public Arbitrary<String> validIdentifierLiterals() {
        return Arbitraries.strings().withCharRange('0', '9');
    }

    public AnotherIdentifier fromLiteral(String literal) {
        return AnotherIdentifier.fromLiteral(literal);
    }
}

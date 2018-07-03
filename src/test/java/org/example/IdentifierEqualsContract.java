package org.example;

import net.jqwik.api.Arbitrary;
import net.jqwik.api.Assume;
import net.jqwik.api.ForAll;
import net.jqwik.api.Label;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import org.junit.jupiter.api.Assertions;

interface IdentifierEqualsContract {

    @Provide("validIdentifierLiterals")
    Arbitrary<String> validIdentifierLiterals();

    @Property
    @Label("unequal is symmetric")
    default void unequalIsSymmetric(@ForAll("validIdentifierLiterals") String id, @ForAll("validIdentifierLiterals") String anotherId) {
        Assume.that(!id.equals(anotherId));

        Assertions.assertNotEquals(id, anotherId);
        Assertions.assertNotEquals(anotherId, id);
    }
}

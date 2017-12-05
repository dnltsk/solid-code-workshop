package org.dnltsk.solid.ocp.vin.solid.verifier;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsLenghtCorrectVerifierTest {

    VinVerifier vinVerifier = new IsLenghtCorrectVerifier();

    @Test
    public void only_17_digit_length_vins_are_correct() throws Exception {
        assertThat(vinVerifier.isVerified("12345678901234567")).isTrue();
        assertThat(vinVerifier.isVerified("1234567890123456")).isFalse();
        assertThat(vinVerifier.isVerified("123456789012345678")).isFalse();
    }
}
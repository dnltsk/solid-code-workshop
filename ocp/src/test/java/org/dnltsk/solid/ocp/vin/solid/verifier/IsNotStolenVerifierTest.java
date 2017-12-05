package org.dnltsk.solid.ocp.vin.solid.verifier;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class IsNotStolenVerifierTest {

    private VinVerifier verifier = new IsNotStolenVerifier();

    @Test
    public void stolen_cars_are_detected_correctly() throws Exception {
        assertThat(verifier.isVerified("xx_0")).isTrue();
        assertThat(verifier.isVerified("xx_1")).isFalse();
        assertThat(verifier.isVerified("xx_2")).isTrue();
    }

}
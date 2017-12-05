package org.dnltsk.solid.ocp.vin.solid.verifier;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsMercedesBenzCarVerifierTest {

    private VinVerifier verifier = new IsMercedesBenzCarVerifier();

    @Test
    public void mercedes_benz_vin_is_detected_correctly() throws Exception {
        assertThat(verifier.isVerified("xx_3")).isFalse();
        assertThat(verifier.isVerified("mb_3")).isTrue();
    }

}
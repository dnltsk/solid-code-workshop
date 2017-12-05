package org.dnltsk.solid.ocp.vin.solid.verifier;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class IsNotRecallCampaignAffectedVerifierTest {

    private VinVerifier verifier = new IsNotRecallCampaignAffectedVerifier();

    @Test
    public void recall_campaign_affected_cars_are_detected_correctly() throws Exception {
        assertThat(verifier.isVerified("xx_1")).isTrue();
        assertThat(verifier.isVerified("xx_2")).isFalse();
        assertThat(verifier.isVerified("xx_3")).isTrue();
    }

}
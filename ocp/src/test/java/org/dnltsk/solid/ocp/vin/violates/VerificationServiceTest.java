package org.dnltsk.solid.ocp.vin.violates;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VerificationServiceTest {

    private VerificationService verificationService = new VerificationService();

    @Test
    public void non_mercedes_benz_vin_is_detected_correctly() throws Exception {
        Boolean isVerified = verificationService.verify("xx_3");
        assertThat(isVerified).isFalse();
    }

    @Test
    public void stolen_cars_are_detected_correctly() throws Exception {
        Boolean isVerified = verificationService.verify("md_3");
        assertThat(isVerified).isFalse();
    }

    @Test
    public void recall_campaign_affected_cars_are_detected_correctly() throws Exception {
        Boolean isVerified = verificationService.verify("mb_2");
        assertThat(isVerified).isFalse();
    }

    @Test
    public void good_cars_are_detected_correctly() throws Exception {
        Boolean isVerified = verificationService.verify("mb_3");
        assertThat(isVerified).isTrue();
    }

}
package org.dnltsk.solid.ocp.vin.solid;

import org.dnltsk.solid.ocp.vin.solid.verifier.IsLenghtCorrectVerifier;
import org.dnltsk.solid.ocp.vin.solid.verifier.IsMercedesBenzCarVerifier;
import org.dnltsk.solid.ocp.vin.solid.verifier.IsNotRecallCampaignAffectedVerifier;
import org.dnltsk.solid.ocp.vin.solid.verifier.IsNotStolenVerifier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VerificationService2Test {

    @Autowired
    private VerificationService2 verificationService;

    @Test
    public void good_cars_are_detected_correctly() throws Exception {
        Boolean isVerified = verificationService.verify("mb_45678901234567");
        assertThat(isVerified).isTrue();
    }

    @Test
    public void bad_cars_are_detected_correctly() throws Exception {
        Boolean isVerified = verificationService.verify("xx_1");
        assertThat(isVerified).isFalse();
    }

    @Test
    public void all_verifiers_are_in_use() throws Exception {
        List<Class> expectedVerifier = Arrays.asList(
            IsMercedesBenzCarVerifier.class,
            IsNotStolenVerifier.class,
            IsNotRecallCampaignAffectedVerifier.class,
            IsLenghtCorrectVerifier.class
        );

        assertThat(verificationService.vinVerifiers).hasSameSizeAs(expectedVerifier);
        Arrays.stream(verificationService.vinVerifiers).forEach(
            vinVerifier -> {
                expectedVerifier.contains(vinVerifier.getClass());
            }
        );
    }

}
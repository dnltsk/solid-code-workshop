package org.dnltsk.solid.ocp.vin.solid;

import org.dnltsk.solid.ocp.vin.solid.VerificationResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class VerificationHttpController2Test {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void valid_vin_is_ok() {
        String validVin = "mb_3";
        ResponseEntity<VerificationResponse> verificationResponse = this.restTemplate.getForEntity("/vin/verification2?vin=" + validVin, VerificationResponse.class);
        assertThat(verificationResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(verificationResponse.getBody().isVerified).isTrue();
    }

    @Test
    public void invalid_vin_is_ok_too() {
        String invalidVin = "xx_1";
        ResponseEntity<VerificationResponse> verificationResponse = this.restTemplate.getForEntity("/vin/verification2?vin=" + invalidVin, VerificationResponse.class);
        assertThat(verificationResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(verificationResponse.getBody().isVerified).isFalse();
    }

    @Test
    public void no_vin_is_bad_request() {
        ResponseEntity<VerificationResponse> verificationResponse = this.restTemplate.getForEntity("/vin/verification2", VerificationResponse.class);
        assertThat(verificationResponse.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
    }

}
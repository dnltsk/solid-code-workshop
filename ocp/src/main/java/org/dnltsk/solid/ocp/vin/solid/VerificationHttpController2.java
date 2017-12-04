package org.dnltsk.solid.ocp.vin.solid;

import org.dnltsk.solid.ocp.vin.violates.VerificationResponse;
import org.dnltsk.solid.ocp.vin.violates.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationHttpController2 {

    @Autowired
    private VerificationService verificationService;

    @RequestMapping("/vin/verification2")
    public ResponseEntity<VerificationResponse> getVerification(@RequestParam String vin) {
        VerificationResponse response = new VerificationResponse();
        response.isVerified = verificationService.verify(vin);
        return ResponseEntity.ok(response);
    }

}

package org.dnltsk.solid.ocp.vin.violates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationHttpController {

    @Autowired
    private VerificationService verificationService;

    @RequestMapping("/vin/verification")
    public ResponseEntity<VerificationResponse> getVerification(@RequestParam String vin) {
        VerificationResponse response = new VerificationResponse();
        response.isVerified = verificationService.verify(vin);
        return ResponseEntity.ok(response);
    }

}

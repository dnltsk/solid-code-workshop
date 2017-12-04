package org.dnltsk.solid.ocp.vin.solid;

import org.dnltsk.solid.ocp.vin.solid.verifier.VinVerifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class VerificationService2 {

    @Autowired
    VinVerifier[] vinVerifiers;

    public Boolean verify(String vin) {
        return Arrays.stream(vinVerifiers)
            .allMatch(vinVerifier -> vinVerifier.isVerified(vin));
    }

}

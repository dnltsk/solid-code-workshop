package org.dnltsk.solid.ocp.vin.solid.verifier;

import org.springframework.stereotype.Component;

@Component
public class IsNotRecallCampaignAffectedVerifier implements VinVerifier{
    @Override
    public boolean isVerified(String vin) {
        return !vin.endsWith("2");
    }
}

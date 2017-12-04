package org.dnltsk.solid.ocp.vin.violates;

import org.springframework.stereotype.Service;

@Service
public class VerificationService {

    public Boolean verify(String vin) {
        return isMercedesBenzCar(vin) && isNotStolen(vin) && isNotRecallCampaignAffected(vin);
    }

    private boolean isMercedesBenzCar(String vin) {
        return vin.toLowerCase().startsWith("mb");
    }

    private boolean isNotStolen(String vin) {
        return !vin.endsWith("1");
    }

    private boolean isNotRecallCampaignAffected(String vin) {
        return !vin.endsWith("2");
    }

}

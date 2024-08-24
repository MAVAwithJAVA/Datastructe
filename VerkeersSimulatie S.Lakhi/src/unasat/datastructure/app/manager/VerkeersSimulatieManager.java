package unasat.datastructure.app.manager;

import unasat.datastructure.app.model.Voertuig;
import unasat.datastructure.app.service.SimulatieService;
import unasat.datastructure.app.voertuiginitializer.VoertuigInitializer;
import java.util.Arrays;
import java.util.List;

public class VerkeersSimulatieManager {

    public void startSimulatie() {
        VoertuigInitializer initializer = new VoertuigInitializer();

        List<Voertuig> voertuigenNoordList = Arrays.asList(initializer.initVoertuigenNoordArray());
        List<Voertuig> voertuigenZuidList = Arrays.asList(initializer.initVoertuigenZuidArray());
        List<Voertuig> voertuigenOostList = Arrays.asList(initializer.initVoertuigenOostArray());
        List<Voertuig> voertuigenWestList = Arrays.asList(initializer.initVoertuigenWestArray());

        SimulatieService simulatieService = new SimulatieService();
        simulatieService.sorteerVoertuigenOpPrioriteit(voertuigenNoordList, voertuigenZuidList, voertuigenOostList, voertuigenWestList);
    }
}

package unasat.datastructure.app;

import unasat.datastructure.app.manager.VerkeersSimulatieManager;


public class App {
        public static void main(String[] args) {
            VerkeersSimulatieManager simulatieManager = new VerkeersSimulatieManager();
            simulatieManager.startSimulatie();
        }
}

package org.no.experiment

import org.no.experiment.interfaces.Nice
import org.no.experiment.interfaces.Steady

class NiceAndSteadyInternetGiant {
    @Delegate
    private Nice niceGiantDelegate

    @Delegate
    private Steady steadyGiantDelegate

    NiceAndSteadyInternetGiant(def delegatingGiant) {
        steadyGiantDelegate = niceGiantDelegate = delegatingGiant
    }

    void commonBehavior() {
        println "Internet Giant"
    }
}

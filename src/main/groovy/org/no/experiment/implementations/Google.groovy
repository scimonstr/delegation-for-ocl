package org.no.experiment.implementations

import org.no.experiment.interfaces.Nice
import org.no.experiment.interfaces.Steady

class Google implements Nice, Steady{
    @Override
    void beNice() {
        println "Google is very nice"
    }

    @Override
    void beSteady() {
        println "Google tries to be steady"
    }
}

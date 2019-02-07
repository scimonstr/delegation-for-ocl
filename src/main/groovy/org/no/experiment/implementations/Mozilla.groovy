package org.no.experiment.implementations

import org.no.experiment.interfaces.Nice
import org.no.experiment.interfaces.Steady

class Mozilla implements Nice, Steady{
    @Override
    void beNice() {
        println "Mozilla is nice"
    }

    @Override
    void beSteady() {
        println "Mozilla is ultra steady"
    }
}

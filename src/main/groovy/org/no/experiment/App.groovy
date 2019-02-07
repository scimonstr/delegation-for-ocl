package org.no.experiment

import org.no.experiment.implementations.Google
import org.no.experiment.implementations.Mozilla

class App {
    public static void main(String[] args) {
        def inetGiant = new NiceAndSteadyInternetGiant(new Google())

        inetGiant.with{
            beSteady()
            beNice()
            commonBehavior()
        }

        println "====="

        inetGiant = new NiceAndSteadyInternetGiant(new Mozilla())

        inetGiant.with{
            beSteady()
            beNice()
            commonBehavior()
        }
    }
}

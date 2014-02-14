/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import net.pvschools.robotics.javabot.practice.IO;

/**
 *
 * @author student
 */
public class InfeedPickupRetract extends RoboCommand {
    
    public InfeedPickupRetract(){
        this.setTimeout(1);
    }

    protected void initialize() {
        IO.getInstance().getPickupPiston().retract();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return this.isTimedOut();
    }

    protected void end() {
        IO.getInstance().getFeedRoller().set(0);
    }

    protected void interrupted() {
    }
    
}

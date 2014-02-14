/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import net.pvschools.robotics.javabot.practice.IO;

/**
 * Opens and closes the side arms
 * @author Bryce
 */
public class Arms extends RoboCommand {
    
    private boolean isOpening;
    
    /**
     * Opens and closes the arms
     * @param isOpening True - Open; False - Close
     */
    public Arms(boolean isOpening){
        this.isOpening = isOpening;
    }

    protected void initialize() {
        if(!isOpening){
            IO.getInstance().getSideArmPiston().extend();
        }else{
            IO.getInstance().getSideArmPiston().retract();
        }
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}

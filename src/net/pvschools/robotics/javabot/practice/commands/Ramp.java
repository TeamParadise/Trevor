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
public class Ramp extends RoboCommand {
    
    private boolean isRaising;
    
    public Ramp(boolean isRaising){
        this.isRaising = isRaising;
    }

    protected void initialize() {
        if(isRaising){
            IO.getInstance().getRampLiftPiston().open();
        }else{
            IO.getInstance().getRampLiftPiston().close();
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

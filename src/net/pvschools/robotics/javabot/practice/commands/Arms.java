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
public class Arms extends RoboCommand {
    
    private boolean isOpening;
    
    public Arms(boolean isOpening){
        this.isOpening = isOpening;
    }

    protected void initialize() {
        if(!isOpening){
            IO.getInstance().getSideArmPiston().open();
        }else{
            IO.getInstance().getSideArmPiston().close();
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

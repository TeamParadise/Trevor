/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import net.pvschools.robotics.javabot.practice.Systems.Piston;

/**
 *
 * @author student
 */
public class OpenPiston extends RoboCommand{
    
    private Piston piston;
    
    public OpenPiston(Piston p, double time){
        super(time);
        piston = p;
    }
    
    public OpenPiston(Piston p){
        this(p, 1);
    }

    protected void initialize() {
    }

    protected void execute() {
        piston.getSolenoid().set(true);
    }

    protected boolean isFinished() {
        return this.isTimedOut();
    }

    protected void end() {
        piston.getSolenoid().set(false);
    }

    protected void interrupted() {
    }
    
}

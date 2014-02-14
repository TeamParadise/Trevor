/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import net.pvschools.robotics.javabot.practice.Systems.Piston;

/**
 *
 * @author Trevor
 */
public class PistonCommand extends RoboCommand {
    
    private boolean isExtending;
    private Piston piston;
    
    public PistonCommand(boolean isExtending, Piston piston){
        this.piston = piston;
        this.isExtending = isExtending;
    }
    
    public PistonCommand(boolean isExtending, Piston piston, double timeOut){
        this.piston = piston;
        this.isExtending = isExtending;
        this.setTimeout(timeOut);
    }

    protected void initialize() 
    {
        if(isExtending) 
        {
            piston.extend();
        } else 
        {
            piston.retract();
        }
    }

    protected void execute() 
    {
    }

    protected boolean isFinished() 
    {
        return this.isTimedOut();
    }

    protected void end() 
    {
    }

    protected void interrupted() 
    {
    }
    
}

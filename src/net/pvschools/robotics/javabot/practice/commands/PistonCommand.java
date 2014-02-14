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
    
    private boolean isOpening;
    private Piston piston;
    
    public PistonCommand(boolean isOpening, Piston piston){
        this.piston = piston;
        this.isOpening = isOpening;
    }
    
    public PistonCommand(boolean isOpening, Piston piston, double timeOut){
        this.piston = piston;
        this.isOpening = isOpening;
        this.setTimeout(timeOut);
    }

    protected void initialize() 
    {
        if(isOpening) 
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

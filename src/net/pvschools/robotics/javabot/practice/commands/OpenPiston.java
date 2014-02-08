/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import net.pvschools.robotics.javabot.practice.Systems.Piston;

/**
 * Opens a piston for a specified amount of time.
 *
 * @author student
 */
public class OpenPiston extends RoboCommand
{
    private Piston piston;
    
    public OpenPiston(Piston p, double time)
    {
        super(time);
        piston = p;
    }
    
    // Default open time of 1 second.
    // TODO: 1 second sounds arbitrary - do we really want this constructor?
    public OpenPiston(Piston p)
    {
        this(p, 1);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        piston.getSolenoid().set(true);
    }

    protected boolean isFinished()
    {
        return this.isTimedOut();
    }

    protected void end()
    {
        close();
    }

    protected void interrupted()
    {
        close();
    }

    private void close()
    {
        piston.getSolenoid().set(false);
    }
    
}

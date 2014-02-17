/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to raise the ramp and retract the feed arms
 *
 * @author Bryce
 */
public class CloseIntake extends PistonCommand
{

    public CloseIntake()
    {
        super(intakePistons, retract);
    }

    public CloseIntake(double timeout)
    {
        this();
        setTimeout(timeout);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Resets the kickers to uncharged state
 *
 * @author Bryce
 */
public class ResetKickers extends PistonCommand
{

    public ResetKickers()
    {
        super(kickerPistons, retract);
    }

    public ResetKickers(double timeout)
    {
        this();
        setTimeout(timeout);
    }
}

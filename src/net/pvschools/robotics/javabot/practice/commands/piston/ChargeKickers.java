/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Charges the kickers in preparation of a shot
 *
 * @author Bryce
 */
public class ChargeKickers extends PistonCommand
{

    public ChargeKickers()
    {
        super(kickerPistons, extend);
    }

    public ChargeKickers(double timeout)
    {
        this();
        setTimeout(timeout);
    }
}

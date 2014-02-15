/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

import net.pvschools.robotics.javabot.practice.Map;
import net.pvschools.robotics.javabot.practice.subsystems.Piston;
import net.pvschools.robotics.javabot.practice.commands.RoboCommand;

/**
 *
 * @author Trevor
 */
public abstract class PistonCommand extends RoboCommand
{
    /** Piston subsystems */
    public static Piston bigKickerPiston     = new Piston(Map.bigKickerPistonIn,    Map.bigKickerPistonOut);
    public static Piston littleKickerPiston  = new Piston(Map.littleKickerPistonIn, Map.littleKickerPistonOut);
    public static Piston latchPiston         = new Piston(Map.latchPistonIn,        Map.latchPistonOut);
    public static Piston pickupPistons       = new Piston(Map.pickupPistonsIn,      Map.pickupPistonsOut);
    public static Piston rampPiston			 = new Piston(Map.rampPistonIn,         Map.rampPistonOut);
    public static Piston catcherPiston       = new Piston(Map.catcherPistonIn,      Map.catcherPistonOut);
    
    private boolean isExtending;
    private Piston piston;
	
	final static boolean extend = true;
	final static boolean retract = false;
    
    public PistonCommand(Piston piston, boolean isExtending)
	{
		requires(piston);
        this.piston = piston;
        this.isExtending = isExtending;
    }

    protected void initialize() 
    {
        if(isExtending) 
        {
            piston.extend();
        }
		else 
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
		idle();
    }

    protected void interrupted() 
    {
		idle();
    }
    
	private void idle()
	{
		// TODO: Uncomment if want to idle the pistion when the command is finished or interrupted.
		//piston.idle();
	}
}

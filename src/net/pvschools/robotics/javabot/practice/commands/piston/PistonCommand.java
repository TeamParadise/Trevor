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
    public static Piston pickupPistons =
        new Piston(Map.pickupPistonsInSlot, Map.pickupPistonsInChnl, Map.pickupPistonsOutSlot, Map.pickupPistonsOutChnl);
    
    public static Piston littleKickerPiston =
        new Piston(Map.littleKickerPistonInSlot, Map.littleKickerPistonInChnl, Map.littleKickerPistonOutSlot, Map.littleKickerPistonOutChnl);
    
    public static Piston bigKickerPiston =
        new Piston(Map.bigKickerPistonInSlot, Map.bigKickerPistonInChnl, Map.bigKickerPistonOutSlot, Map.bigKickerPistonOutChnl);
    
    public static Piston latchPiston =
        new Piston(Map.latchPistonInSlot, Map.latchPistonInChnl, Map.latchPistonOutSlot, Map.latchPistonOutChnl);
    
    public static Piston rampPiston =
        new Piston(Map.rampPistonInSlot, Map.rampPistonInChnl, Map.rampPistonOutSlot, Map.rampPistonOutChnl);
    
    public static Piston catcherPiston =
        new Piston(Map.catcherPistonInSlot, Map.catcherPistonInChnl, Map.catcherPistonOutSlot, Map.catcherPistonOutChnl);
    
    private final boolean isExtending;
    private final Piston piston;
	
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

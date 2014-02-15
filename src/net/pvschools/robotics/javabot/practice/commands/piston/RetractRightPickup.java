/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to retract the right pickup piston.
 * 
 * @author jkoehring
 */
public class RetractRightPickup extends PistonCommand
{
	public RetractRightPickup()
	{
		super(pickupRightPiston, retract);
	}
	
	public RetractRightPickup(double timeout)
	{
		this();
		setTimeout(timeout);
	}
}

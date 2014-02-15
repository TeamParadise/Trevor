/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to retract the left pickup piston.
 * 
 * @author jkoehring
 */
public class RetractLeftPickup extends PistonCommand
{
	public RetractLeftPickup()
	{
		super(pickupLeftPiston, retract);
	}
	
	public RetractLeftPickup(double timeout)
	{
		this();
		setTimeout(timeout);
	}
}

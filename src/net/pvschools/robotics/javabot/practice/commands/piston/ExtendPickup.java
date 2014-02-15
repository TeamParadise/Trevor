/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to extend the pickup pistons.
 * 
 * @author jkoehring
 */
public class ExtendPickup extends PistonCommand
{
	public ExtendPickup()
	{
		super(pickupPistons, retract);
	}
	
	public ExtendPickup(double timeout)
	{
		this();
		setTimeout(timeout);
	}
}

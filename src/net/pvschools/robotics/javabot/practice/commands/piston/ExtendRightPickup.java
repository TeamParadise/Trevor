/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to extend the right pickup piston.
 * 
 * @author jkoehring
 */
public class ExtendRightPickup extends PistonCommand
{
	public ExtendRightPickup()
	{
		super(pickupRightPiston, extend);
	}
	
	public ExtendRightPickup(double timeout)
	{
		this();
		setTimeout(timeout);
	}
}

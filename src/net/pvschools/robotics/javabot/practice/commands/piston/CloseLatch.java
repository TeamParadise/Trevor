/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to extend the latch piston to close the latch
 * 
 * @author jkoehring
 */
public class CloseLatch extends PistonCommand
{
	public CloseLatch()
	{
		super(latchPiston, extend);
	}
	
	public CloseLatch(double timeout)
	{
		this();
		setTimeout(timeout);
	}
	
}

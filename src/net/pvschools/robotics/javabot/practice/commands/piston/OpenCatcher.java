/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to extend the side arm piston.
 * 
 * @author jkoehring
 */
public class OpenCatcher extends PistonCommand
{
	public OpenCatcher()
	{
            //Backwards
		super(catcherPiston, retract);
	}
	
	public OpenCatcher(double timeout)
	{
		this();
		setTimeout(timeout);
	}
}

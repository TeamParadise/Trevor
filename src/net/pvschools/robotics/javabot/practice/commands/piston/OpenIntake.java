/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to lower the ramp and extend the feed arms
 * 
 * @author Bryce
 */
public class OpenIntake extends PistonCommand
{
	public OpenIntake()
	{
		super(intakePistons, extend);
	}
	
	public OpenIntake(double timeout)
	{
		this();
		setTimeout(timeout);
	}
	
}

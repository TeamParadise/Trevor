/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractLeftPickup;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractRightPickup;

/**
 *
 * @author jkoehring
 */
public class RetractPickup extends CommandGroup
{
	public RetractPickup()
	{
		addParallel(new RetractLeftPickup());
		addSequential(new RetractRightPickup());
	}
}

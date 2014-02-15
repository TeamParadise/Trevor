/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendLeftPickup;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendRightPickup;

/**
 *
 * @author jkoehring
 */
public class ExtendPickup extends CommandGroup
{
	public ExtendPickup()
	{
		addParallel(new ExtendLeftPickup());
		addSequential(new ExtendRightPickup());
	}
}

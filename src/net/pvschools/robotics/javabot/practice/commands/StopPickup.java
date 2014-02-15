/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import net.pvschools.robotics.javabot.practice.subsystems.FeedRoller;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.RaiseRamp;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractPickup;

/**
 *
 * @author student
 */
public class StopPickup extends CommandGroup
{    
    public StopPickup()
	{
        addSequential(new SetFeedRollerSpeed(FeedRoller.stopSpeed));
        addSequential(new RaiseRamp(), 0.5);
        addParallel(new CloseCatcher());
        addSequential(new RetractPickup(), 0.5);
    }
}

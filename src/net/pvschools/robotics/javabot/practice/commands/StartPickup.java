/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenIntake;
import net.pvschools.robotics.javabot.practice.subsystems.FeedRoller;

/**
 * Turns the feed rollers on and opens the intake
 * @author Bryce
 */
public class StartPickup extends CommandGroup
{

    public StartPickup()
    {
        addParallel(new SetFeedRollerSpeed(FeedRoller.feedSpeed));
        addSequential(new OpenIntake(), 0.2);
        addParallel(new OpenCatcher());
    }
}

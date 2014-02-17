/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import net.pvschools.robotics.javabot.practice.subsystems.FeedRoller;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseIntake;

/**
 * Turns the feed rollers off and closes the intake
 * @author Bryce
 */
public class StopPickup extends CommandGroup
{

    public StopPickup()
    {
        addSequential(new SetFeedRollerSpeed(FeedRoller.stopSpeed));
        addSequential(new CloseIntake(), 0.5);
        addParallel(new CloseCatcher());
    }
}

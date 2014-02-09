/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Trevor
 */
public class RunAutonomous extends CommandGroup
{
    public RunAutonomous()
    {
		// Add elements to smart dashboard for driving sideways:
		SmartDashboard.putNumber("Sideways Spd", 0);
		SmartDashboard.putNumber("Sideways Dir", 0);
		SmartDashboard.putNumber("Sideways Sec", 0);
		
		// Note: 0 = left, 90 = backward, 180 = right, 270 = forward 
		// TODO: Replace 0 speed used for testing with real speed
        addSequential(new DriveDirectional(0, 270), 1);
		
		// Intended for driving sideways:
		addSequential(new DriveDirectional("Sideways Spd", "Sideways Dir", "Sideways Sec"));
		
        addSequential(new WaitForGoal(), 6);
        addSequential(new Shoot());
    }    
}

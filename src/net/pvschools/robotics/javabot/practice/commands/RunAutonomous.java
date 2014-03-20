/*
 * 
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
        addSequential(new DriveDirectional(0, 270, 0), 1);
		
		// Intended for driving sideways:
		addSequential(new DriveDirectional("Sideways Spd", "Sideways Dir", "Sideways Sec", "Sideways Rot"));
		
        addSequential(new WaitForGoal(), 6);
        addSequential(new Shoot(false, "Extend Pickup"));
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Trevor
 */
public class AutonomousCommand extends CommandGroup {
    
    public AutonomousCommand(){
        addSequential(new DriveDirectional(.3, 0), 1);
        addSequential(new WaitForGoal(), 6);
        addSequential(new ShootCommand());
    }
    
}

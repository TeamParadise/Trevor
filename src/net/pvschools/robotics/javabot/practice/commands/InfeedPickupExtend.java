/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.buttons.Button;
import net.pvschools.robotics.javabot.practice.IO;

/**
 *
 * @author student
 */
public class InfeedPickupExtend extends RoboCommand {
    
    private static final double motorSpeed = 0.8;
    
    public InfeedPickupExtend()
    {
    }

    protected void initialize() {
        IO.getInstance().getPickupPiston().extend();
        IO.getInstance().getFeedRoller().set(motorSpeed);
    }

    protected void execute() 
    {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
        
    }
    
}

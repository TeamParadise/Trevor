/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.Command;
import net.pvschools.robotics.javabot.practice.IO;

/**
 *
 * @author student
 */
class WaitForGoal extends RoboCommand
{
    
    private boolean finished = true;

    public WaitForGoal()
    {
    }

    protected void initialize()
    {
        finished = false;
    }

    protected void execute()
    {
        if(isHot()){
            end();
        }
    }

    protected boolean isFinished()
    {
        return finished;
    }

    protected void end()
    {
    }

    protected void interrupted()
    {
    }

    private boolean isHot()
    {
        //TODO Check if goal is hot
        return false;
    }
    
}

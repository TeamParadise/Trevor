/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

/**
 *
 * @author student
 */
class WaitForGoal extends RoboCommand
{
    public WaitForGoal()
    {
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
    }

    protected boolean isFinished()
    {
        return isHot();
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

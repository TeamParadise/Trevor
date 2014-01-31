/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author student
 */
class WaitForGoal extends Command {
    
    private boolean finished = true;

    public WaitForGoal() {
    }

    protected void initialize() {
        finished = false;
    }

    protected void execute() {
        //TODO Add hot goal check
    }

    protected boolean isFinished() {
        return finished;
    }

    protected void end() {
        finished = true;
    }

    protected void interrupted() {
    }
    
}

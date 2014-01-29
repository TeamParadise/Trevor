/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

/**
 *
 * @author Trevor
 */
public class MoveForwardCommand extends RoboCommand {
    
    private boolean finished = true;

    protected void initialize() {
        finished = false;
    }

    protected void execute() {
        
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

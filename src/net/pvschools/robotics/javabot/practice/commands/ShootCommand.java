/*
 * 
 */

package net.pvschools.robotics.javabot.practice.commands;

/**
 *
 * @author Trevor
 */
public class ShootCommand extends RoboCommand {
    
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

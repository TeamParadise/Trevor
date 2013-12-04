/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands;

/**
 *
 * @author student
 */
public class MecanumDrive extends RoboCommand {
    
    boolean complete = false;
	
    public MecanumDrive()
    {
		requires(driveTrain);
    }

    protected void initialize() 
    {
        complete = false;
    }

    protected void execute() 
    {
        double calX = oi.getDriveX();
        double calY = oi.getDriveY();
        double calTwist = oi.getDriveTwist();

        calX = Math.abs(calX) < .15
            ? 0
            : (1.04167 * calX * Math.abs(calX)) - .0416667;

        calY = Math.abs(calY) < .2
            ? 0
            : (1.04167 * calY * Math.abs(calY)) - .0416667;

        double twistfactor = (oi.getDriveThrottle() + 1) / 2 + 1;
        calTwist = Math.abs(calTwist) < .2
            ? 0
            : -((1.04167 * calTwist * Math.abs(calTwist)) - .0416667) / twistfactor;
        
        driveTrain.driveCartesian(calX, calY, calTwist, 0.0);
        complete = false;
    }

    protected boolean isFinished() 
    {
        return complete;
    }

    protected void end() 
    {
        complete = true;
    }

    protected void interrupted() 
    {
        
    }
    
}

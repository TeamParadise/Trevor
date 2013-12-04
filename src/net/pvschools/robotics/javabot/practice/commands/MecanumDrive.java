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
        double calX     = oi.getDriveY(); 
        double calY     = oi.getDriveX(); 
        double calTwist = oi.getDriveTwist(); 

        calX     = Math.abs(calX)     < 0.15 ? 0 : calX; 
        calY     = Math.abs(calY)     < 0.15 ? 0 : calY; 
        calTwist = Math.abs(calTwist) < 0.15 ? 0 : calTwist;         

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

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
        double dampingFactor = oi.getDamping();       // Between 0 and 1; 0 = No damping 

        double calX     = oi.getDriveY(); 
        double calY     = oi.getDriveX(); 
        double calTwist = oi.getDriveTwist(); 

        calX     = dampingFactor*calX*calX*calX             + (1-dampingFactor)*calX; 
        calY     = dampingFactor*calY*calY*calY             + (1-dampingFactor)*calY; 
        calTwist = dampingFactor*calTwist*calTwist*calTwist + (1-dampingFactor)*calTwist; 

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

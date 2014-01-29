/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.sun.squawk.util.MathUtils;
import net.pvschools.robotics.javabot.practice.OI;

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
        double dampingFactor = OI.getInstance().getDamping();       // Between 0 and 1; 0 = No damping 

        double calX     = OI.getInstance().getDriveX();
        double calY     = OI.getInstance().getDriveY(); 
        double calTwist = OI.getInstance().getDriveTwist(); 
        
//        SmartDashboard.putNumber(" x ", calX);
//        SmartDashboard.putNumber(" y ", calY);
//        SmartDashboard.putNumber(" Twist ", calTwist);

        calX     = dampingFactor*calX*calX*calX             + (1-dampingFactor)*calX; 
        calY     = dampingFactor*calY*calY*calY             + (1-dampingFactor)*calY; 
        calTwist = dampingFactor*calTwist*calTwist*calTwist + (1-dampingFactor)*calTwist; 

        SmartDashboard.putNumber(" damp x ", calX);
        SmartDashboard.putNumber(" damp y ", calY);
        SmartDashboard.putNumber(" damp Twist ", calTwist);
        
        //driveTrain.driveCartesian(calX, calY, calTwist, 0.0);

        driveTrain.drivePolar(
            Math.sqrt((calY * calY) + (calX * calX)),           //Magnitude
            Math.toDegrees(MathUtils.atan2(calY, calX)) + 90,        //Angle
            calTwist);                                          //Rotation                                                //Rotation
        
        //driveTrain.drivePolar(Math.sqrt((calY * calY) + (calX * calX)), MathUtils.atan2(calY, calX), calTwist);
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Class for driving the robot at a fixed speed and direction.
 *
 * @author robostud
 */
public class DriveDirectional extends RoboCommand
{
    private double magnitude;
    private double direction;
	
	// The following are smart dashboard keys:
	private String magnitudeKey = null;
	private String directionKey = null;
	private String timeoutKey = null;
    
    // Specifies speed and direction to drive the robot.
    public DriveDirectional(double magnitude, double direction)
    {
        requires(driveTrain);
        this.magnitude = magnitude;
        this.direction = direction;
    }

    // Uses values from the smart dashboard to drive the robot.
    public DriveDirectional(String magnitudeKey, String directionKey, String timeoutKey)
    {
        requires(driveTrain);
        this.magnitudeKey = magnitudeKey;
        this.directionKey = directionKey;
		this.timeoutKey = timeoutKey;
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
		// See if we are using values from the smart dashboard:
		if (null != magnitudeKey)
		{
			magnitude = SmartDashboard.getNumber(magnitudeKey);
			direction = SmartDashboard.getNumber(directionKey);
			setTimeout(SmartDashboard.getNumber(timeoutKey));
		}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        driveTrain.drivePolar(magnitude, direction, 0);
    }

    // Note that when there is no timeout value set, this will return false.
    protected boolean isFinished()
    {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end()
    {
        stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
        stop();
    }
    
    // Stop all drive motion.
    private void stop()
    {
        driveTrain.drivePolar(0, 0, 0);
    }
}

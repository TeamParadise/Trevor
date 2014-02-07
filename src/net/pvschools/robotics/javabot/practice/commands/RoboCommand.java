/*
 * Robotic command basics.
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.Command;
import net.pvschools.robotics.javabot.practice.Systems.DriveTrain;

public abstract class RoboCommand extends Command
{

    public static DriveTrain driveTrain = new DriveTrain();

    public static void init()
    {
    }

    // Automatically created constructors.
    public RoboCommand(String name)
    {
        super(name);
    }

    public RoboCommand()
    {
        super();
    }

    public RoboCommand(double timeOut)
    {
        super(timeOut);
    }

}

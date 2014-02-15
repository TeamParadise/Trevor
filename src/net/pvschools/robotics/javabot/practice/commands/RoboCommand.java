/*
 * Robotic command basics.
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.Command;
import net.pvschools.robotics.javabot.practice.Systems.DriveTrain;
import net.pvschools.robotics.javabot.practice.Systems.FeedRoller;
import net.pvschools.robotics.javabot.practice.Systems.VisionTargetSpotter;

public abstract class RoboCommand extends Command
{
    public static DriveTrain driveTrain = new DriveTrain();
	public static VisionTargetSpotter visionTargetSpotter = new VisionTargetSpotter();
	public static FeedRoller feedRoller = new FeedRoller();

    public static void init()
    {
    }

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

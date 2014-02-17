/*
 * 
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

import net.pvschools.robotics.javabot.practice.commands.piston.OpenCatcher;

import net.pvschools.robotics.javabot.practice.commands.piston.OpenLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseLatch;

/**
 *
 * @author Trevor
 * @author Bryce
 */
public class Shoot extends CommandGroup {

    /**
     * @since 12/21/2012
     * @param quickshot Shoot fast
     */
    public Shoot(boolean quickshot)
    {
        addSequential(new OpenCatcher());
        addSequential(new WaitCommand(0.2));

        /**
         * Pull latch & shoot
         */
        addSequential(new OpenLatch());
        addSequential(new WaitCommand((quickshot) ? 0.1 : 0.2));

        addSequential(new ResetKicker());
        addSequential(new WaitCommand(1.5));

        addSequential(new CloseLatch());
		addSequential(new WaitCommand(1));

        addParallel(new ChargeKicker());
        addSequential(new CloseCatcher());
    }
}

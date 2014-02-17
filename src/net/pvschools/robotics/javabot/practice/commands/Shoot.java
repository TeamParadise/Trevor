/*
 * 
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import net.pvschools.robotics.javabot.practice.commands.piston.ChargeKickers;

import net.pvschools.robotics.javabot.practice.commands.piston.OpenCatcher;

import net.pvschools.robotics.javabot.practice.commands.piston.OpenLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.ResetKickers;

/**
 *
 * @author Trevor
 * @author Bryce
 */
public class Shoot extends CommandGroup
{
    /** 
     * @param quickshot Shoot fast
     */
    public Shoot(boolean quickshot)
    {
        addSequential(new OpenCatcher(), 0.2);
        
        /** Pull latch & shoot */
        addSequential(new OpenLatch(), (quickshot) ? 0.1 : 0.2);
        
        addSequential(new ResetKickers(), 0.75);
        
        addSequential(new CloseLatch(), 0.5);
                
        addParallel(new ChargeKickers());
        addSequential(new CloseCatcher());
    }
}

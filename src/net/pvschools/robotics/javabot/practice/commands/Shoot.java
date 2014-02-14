/*
 * 
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Trever
 * @author Bryce
 */
public class Shoot extends CommandGroup
{
    
    private final boolean extend = true;
    private final   boolean retract = false;
    
    /** 
     * @since 12/21/2012
     * @param quickshot Shoot fast
     */
    public Shoot(boolean quickshot)
    {
        addSequential(new Arms(true), .3);
        
        /** Pull latch & shoot */
        addSequential(new LatchPiston(retract), (quickshot) ? 0.5 : 1);
        
        /** Reset Kickers */
        addSequential(new KickerPiston(extend), 1);
        addParallel(new ReturnPiston(retract));
        
        /** Close Latch */
        addSequential(new LatchPiston(extend), 0.5);
                
        /** Charge pistons */
        addSequential(new KickerPiston(retract));
        addParallel(new ReturnPiston(extend));
        
        
        addSequential(new Arms(false));
    }
    
}

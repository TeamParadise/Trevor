/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author student
 */
public class PickupRelease extends CommandGroup {
    
    private final boolean extend = true;
    private final boolean retract = false;
    
    public PickupRelease(){
        addSequential(new Arms(retract));
        addSequential(new Ramp(retract));
        addSequential(new InfeedPickupRetract());
    }
    
}

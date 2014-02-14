/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import net.pvschools.robotics.javabot.practice.IO;

/**
 *
 * @author student
 */
public class ExtentionArmPiston extends PistonCommand {

    public ExtentionArmPiston(boolean isOpening) {
        super(isOpening, IO.getInstance().getPickupPiston());
    }
    
}

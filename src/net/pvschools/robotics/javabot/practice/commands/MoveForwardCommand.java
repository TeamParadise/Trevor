/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

/**
 *
 * @author Trevor
 */
public class MoveForwardCommand extends RoboCommand {
    
    private boolean finished = true;
    private long startTime;
    private double runTime;
            
    public MoveForwardCommand(double runTime){
        this.runTime = runTime;
    }
    
    protected void initialize() {
        finished = false;
        startTime = System.currentTimeMillis();
    }

    protected void execute() {
        if(!isFinished()){
        }
    }

    protected boolean isFinished() {
        return finished || (System.currentTimeMillis() > startTime + runTime*1000);
    }

    protected void end() {
        finished = true;
    }

    protected void interrupted() {
    }
    
}

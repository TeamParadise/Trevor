/*
 * The Piston class is for getting and opening different pistons on the Robot.
 */

package net.pvschools.robotics.javabot.practice.Systems;

import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 * @author Trevor
 */
public class Piston
{
    private final Solenoid solenoidOut;
    private final Solenoid solenoidIn;
    private final long waitMillis;
    
    public Piston(int solenoidInPort, int solenoidOutPort, long waitMillis)
    {
        this.solenoidIn = new Solenoid(solenoidInPort);
        this.solenoidOut = new Solenoid(solenoidOutPort);
        this.waitMillis = waitMillis;
    }
    
    public void open()
    {
        solenoidIn.set(true);
        solenoidOut.set(false);
    }
    
    public void close()
    {
        solenoidIn.set(false);
        solenoidOut.set(true);
    }
    
    public void idle()
    {
        solenoidIn.set(false);
        solenoidOut.set(false);
    }
    
    public void idleWhenReady(){
        Thread idleWhenReady = new IdleWhenReady();
        idleWhenReady.start();
    }
    
    public Solenoid getInSolenoid(){
        return solenoidIn;
    }
    
    public Solenoid getOutSolenoid(){
        return solenoidOut;
    }
    
    private class IdleWhenReady extends Thread {
        
        public void run(){
            try {
                Thread.sleep(waitMillis);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            idle();
        }
        
    }
    
}

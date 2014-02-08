/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.Systems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 * @author Trevor
 */
public class Piston
{
    private Relay relay;
    private Solenoid solenoid;
    
    public Piston(int relayPort, int solenoidPort){
        this.relay = new Relay(relayPort);
        this.solenoid = new Solenoid(solenoidPort);
    }
    
    public Relay getRelay()
    {
        return relay;
    }
    
    public Solenoid getSolenoid()
    {
        return solenoid;
    }
    
}

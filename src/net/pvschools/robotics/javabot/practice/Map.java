/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice;

/**
 *
 * @author student
 */
public class Map
{
   // Wheel motors: Digital I/O PWM
   public static final int frontleft             = 1;
   public static final int frontright            = 2;
   public static final int backleft              = 3;
   public static final int backright             = 4;
   
   //Feed Motor: Digital I/O PWM
   public static final int feedMotor             = 5;
   
   //Joystick Ports
   public static final int joystickPort          = 1;
           
   //Joystick Ports
   public static final int gyroPort              = 1;
           
   //Ultrasonic Sensor Port
   public static final int ultrasonic            = 4;
   
   //Compressor Ports
   public static final int compressorSwitch      = 1;   // Digital I/O
   public static final int compressorRelay       = 1;   // relay
   
   // Solenoid Ports
   // TODO: Are channel numbers on slot 3 off by one?
   //       They are 0-based while channels on slot 7 are 1-based.
   public static final int pickupPistonsInSlot       = 7;
   public static final int pickupPistonsInChnl       = 3;
   public static final int pickupPistonsOutSlot      = 7;
   public static final int pickupPistonsOutChnl      = 6;
   
   public static final int latchPistonInSlot         = 3;
   public static final int latchPistonInChnl         = 4;
   public static final int latchPistonOutSlot        = 3;
   public static final int latchPistonOutChnl        = 1;
   
   public static final int bigKickerPistonInSlot     = 3;
   public static final int bigKickerPistonInChnl     = 5;
   public static final int bigKickerPistonOutSlot    = 3;
   public static final int bigKickerPistonOutChnl    = 2;
   
   public static final int littleKickerPistonInSlot  = 3;
   public static final int littleKickerPistonInChnl  = 3;
   public static final int littleKickerPistonOutSlot = 3;
   public static final int littleKickerPistonOutChnl = 0;
   
   public static final int rampPistonInSlot          = 7;
   public static final int rampPistonInChnl          = 4;
   public static final int rampPistonOutSlot         = 7;
   public static final int rampPistonOutChnl         = 1;
   
   public static final int catcherPistonInSlot       = 7;
   public static final int catcherPistonInChnl       = 2;
   public static final int catcherPistonOutSlot      = 7;
   public static final int catcherPistonOutChnl      = 5;
}

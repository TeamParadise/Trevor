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
   // Solenoid ports are referenced by MODULE and channel.
   // The solenoid module in slot 3 is module 1.
   // The solenoid module in slot 7 is module 2.
//   public static final int pickupPistonsInSlot          = 2;
//   public static final int pickupPistonsInChnl          = 3;
//   public static final int pickupPistonsOutSlot         = 2;
//   public static final int pickupPistonsOutChnl         = 6;
//
//   public static final int latchPistonInSlot            = 1;
//   public static final int latchPistonInChnl            = 5;
//   public static final int latchPistonOutSlot           = 1;
//   public static final int latchPistonOutChnl           = 2;
//
//   public static final int bigKickerPistonInSlot        = 1;
//   public static final int bigKickerPistonInChnl        = 6;
//   public static final int bigKickerPistonOutSlot       = 1;
//   public static final int bigKickerPistonOutChnl       = 3;
//
//   public static final int littleKickerPistonInSlot     = 1;
//   public static final int littleKickerPistonInChnl     = 4;
//   public static final int littleKickerPistonOutSlot    = 1;
//   public static final int littleKickerPistonOutChnl    = 1;
//
//   public static final int rampPistonInSlot             = 2;
//   public static final int rampPistonInChnl             = 4;
//   public static final int rampPistonOutSlot            = 2;
//   public static final int rampPistonOutChnl            = 1;
//
//   public static final int catcherPistonInSlot          = 2;
//   public static final int catcherPistonInChnl          = 5;
//   public static final int catcherPistonOutSlot         = 2;
//   public static final int catcherPistonOutChnl         = 2;

   public static final int kickerPistonsInChannel       = 1;
   public static final int kickerPistonsOutChannel      = 2;

   public static final int latchPistonInChannel         = 3;
   public static final int latchPistonOutChannel        = 4;
   
   public static final int intakePistonsInChannel       = 5;
   public static final int intakePistonsOutChannel      = 6;
   
   public static final int catcherPistonInChannel       = 7;
   public static final int catcherPistonOutChannel      = 8;

//   public static final int kickerPistonInSlot        = 1;
//   public static final int kickerPistonInSlot        = 1;

   
   //Sonar Ports
    public static final int SonarPingChannel        = 2;   // Digital I/O
    public static final int SonarEchoChannel      = 3;   // Digital I/O
}

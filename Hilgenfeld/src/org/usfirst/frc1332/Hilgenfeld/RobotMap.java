// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1332.Hilgenfeld;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.AnalogGyro;
//import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;

import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveBaseLF;
    public static SpeedController driveBaseLR;
    public static SpeedController driveBaseRF;
    public static SpeedController driveBaseRR;
    public static RobotDrive driveBaseRobotDrive41;
    public static AnalogGyro driveBaseAnalogGyro1;
    public static CANTalon liftBaseCANTalonSRX1;
    public static CANTalon liftBaseCANTalonSRX2;
    public static RobotDrive liftBaseRobotDrive21;
    public static Encoder liftBaseQuadEncode;
    public static DigitalInput liftBaseLimitSwitch1;
    public static Compressor gripBaseCompressor1;
    public static Solenoid gripBaseSoleLF;
    public static Solenoid gripBaseSoleRT;
    public static Solenoid gripBaseSoleLF2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveBaseLF = new Talon(0);
        LiveWindow.addActuator("DriveBase", "LF", (Talon) driveBaseLF);
        
        driveBaseLR = new Talon(1);
        LiveWindow.addActuator("DriveBase", "LR", (Talon) driveBaseLR);
        
        driveBaseRF = new Talon(2);
        LiveWindow.addActuator("DriveBase", "RF", (Talon) driveBaseRF);
        
        driveBaseRR = new Talon(3);
        LiveWindow.addActuator("DriveBase", "RR", (Talon) driveBaseRR);
        
        driveBaseRobotDrive41 = new RobotDrive(driveBaseLF, driveBaseLR,
              driveBaseRF, driveBaseRR);
        
        driveBaseRobotDrive41.setSafetyEnabled(true);
        driveBaseRobotDrive41.setExpiration(0.1);
        driveBaseRobotDrive41.setSensitivity(0.5);
        driveBaseRobotDrive41.setMaxOutput(0.7);
        driveBaseRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveBaseRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveBaseRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveBaseRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        liftBaseCANTalonSRX1 = new CANTalon(2);
        driveBaseAnalogGyro1 = new AnalogGyro(0);
        LiveWindow.addSensor("Drive Base", "AnalogGyro 1", driveBaseAnalogGyro1);
        driveBaseAnalogGyro1.setSensitivity(0.007);

        
        liftBaseCANTalonSRX2 = new CANTalon(3);
        
        
        liftBaseRobotDrive21 = new RobotDrive(liftBaseCANTalonSRX1, liftBaseCANTalonSRX2);
        
        liftBaseRobotDrive21.setSafetyEnabled(true);
        liftBaseRobotDrive21.setExpiration(0.1);
        liftBaseRobotDrive21.setSensitivity(0.5);
        liftBaseRobotDrive21.setMaxOutput(1.0);
        

        liftBaseQuadEncode = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("LiftBase", "QuadEncode", liftBaseQuadEncode);
        liftBaseQuadEncode.setDistancePerPulse(1.0);
        //liftBaseQuadEncode.setPIDSourceParameter(PIDSourceParameter.kRate);
        liftBaseLimitSwitch1 = new DigitalInput(2);
        LiveWindow.addSensor("LiftBase", "Limit Switch 1", liftBaseLimitSwitch1);
        
        gripBaseCompressor1 = new Compressor(0);
        
        
        gripBaseSoleLF = new Solenoid(0, 0);
        LiveWindow.addActuator("GripBase", "SoleLF", gripBaseSoleLF);
        
        gripBaseSoleRT = new Solenoid(0, 1);
        LiveWindow.addActuator("GripBase", "SoleRT", gripBaseSoleRT);
        
        gripBaseSoleLF2 = new Solenoid(0, 2);
        LiveWindow.addActuator("GripBase", "SoleLF2", gripBaseSoleLF2);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}

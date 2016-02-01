// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1332.Hilgenfeld.subsystems;

import org.usfirst.frc1332.Hilgenfeld.Robot;
import org.usfirst.frc1332.Hilgenfeld.RobotMap;
import org.usfirst.frc1332.Hilgenfeld.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; 
//import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class LiftBase extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANTalon cANTalonSRX1 = RobotMap.liftBaseCANTalonSRX1;
    CANTalon cANTalonSRX2 = RobotMap.liftBaseCANTalonSRX2;
    RobotDrive robotDrive21 = RobotMap.liftBaseRobotDrive21;
    Encoder quadEncode = RobotMap.liftBaseQuadEncode;
    DigitalInput limitSwitch1 = RobotMap.liftBaseLimitSwitch1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public boolean everySecond;
	public long saveTime;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new T1PU());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    
    public void LiftDrive (){
    	robotDrive21.tankDrive(Robot.oi.getOpPad(), 1, Robot.oi.getOpPad(), 3);
    	Robot.liftBase.GetData();
    }
    
    public void AutoLift(){
    	robotDrive21.tankDrive(-.8, 0);
    }
    
    public void AutoReturn(){
    	robotDrive21.tankDrive(.8, 0);
    }
    
    public void SoptLift(){
    	robotDrive21.stopMotor();
    }
    
    public void GetData(){ 
    	System.currentTimeMillis();
    	if (System.currentTimeMillis()-saveTime>1000){
    		everySecond = true;
    		saveTime = System.currentTimeMillis();
    	} 
    	else{
    		everySecond = false;
    	}
    	
    	if(everySecond){
    	
    		//double quadEncoderPos = cANTalonSRX1.getEncPosition();
    		//System.out.println("quadEncoderPos:" + quadEncoderPos);
    	
    		//double currentAmps = cANTalonSRX1.getOutputCurrent();
    		//System.out.println("currentAmps:" + currentAmps);
    		
    		//double selectedSensorPos = cANTalonSRX1.getPosition();
    		//System.out.println("selectedSensorPos:" + selectedSensorPos);
    		
    		//int analogPos = cANTalonSRX1.getAnalogInPosition();
    		//System.out.println("analogPos:" + analogPos);
    		
    	
    	}
    }
}



package org.usfirst.frc1332.Robot2016.subsystems;

import org.usfirst.frc1332.Robot2016.commands.*;
import org.usfirst.frc1332.Robot2016.RobotMap;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Encoder;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class DriveTrain extends PIDSubsystem  {

    private final SpeedController frontLeft = RobotMap.driveTrainFrontLeft;
    private final SpeedController rearLeft = RobotMap.driveTrainFrontLeft;
    private final SpeedController frontRight = RobotMap.driveTrainFrontRight;
    private final SpeedController rearRight = RobotMap.driveTrainFrontLeft;
    private final RobotDrive robotDrive4 = RobotMap.driveTrainDrive4;
    private final Encoder quad1 = RobotMap.driveTrainQuad1;
    private final Encoder quad2 = RobotMap.driveTrainQuad2;
    private final AnalogGyro gyro = RobotMap.driveTrainAnalogGyro1;


    // Initialize your subsystem here
    public DriveTrain () {

    	super("PIDSubsystem1", 1.0, 0.0, 0.0);
        setAbsoluteTolerance(0.2);
        getPIDController().setContinuous(false);
        LiveWindow.addActuator("PID Subsystem 1", "PIDSubsystem Controller", getPIDController());


        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
        enable();
    }
    public double getGyroAngle() { 
    	return gyro.getAngle();
    	
    }
    public void initDefaultCommand() {
    	setDefaultCommand(new ArcadeDrive());
    }

        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    

    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;

    	double value = gyro.pidGet();
    	System.out.println("Pin: "  + value);
        return value;
    }
    
    protected double returnPIDInput1(){
    	
    	double val = quad1.getDistance();
    	System.out.println("Q1Pin: " + val);
    	return val;
    }
    
    protected void q1reset(){
    	quad1.reset();
    }
  
    protected double returnPIDInput2(){
    	double v = quad2.getDistance();
    	System.out.println("Q2Pin:" + v);
    	return v;
    }

    protected void q2reset(){
    	quad2.reset();
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    	System.out.println("Pout: " + output);
        

        double setPoint = getPIDController().getSetpoint();
    	System.out.println("Set: " + setPoint);
    	
    	double leftS = setPoint;
    	double rightS = setPoint;
    	
    	leftS = leftS + output;
    	rightS = rightS - output;
    	
    	System.out.println("Left: " + leftS);
    	System.out.println("Right: " + rightS);
    	frontRight.pidWrite(rightS);
        rearRight.pidWrite(rightS);
    	frontLeft.pidWrite(leftS);
    	rearLeft.pidWrite(leftS);
    }
    
    public void TankDrive(Joystick drivePad){
    	robotDrive4.tankDrive(drivePad, 1,drivePad, 5, true);
    }
    
    public void drivestop (double speed){
    	robotDrive4.stopMotor();
    }
    
    public void ArcadeDrive(Joystick arcadeStick){
    	robotDrive4.arcadeDrive(arcadeStick, true); 
    }
    
    public void driveStraight(){
    	robotDrive4.tankDrive(-.6, -.6); 
    }
}

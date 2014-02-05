// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc4915.ArcadeDriveRobot.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4915.ArcadeDriveRobot.Robot;
/**
 * TODO: Finish code!
 */
public class  ReleaseBall extends Command {
    public ReleaseBall() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.harvester);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        setTimeout(2.0); // runs the motors for at least 2.0 seconds
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        if(Robot.harvester.getLimitSwitchBallLoaded() && Robot.harvester.getMagneticSwitchPneumatics()){ // the ball is loaded and the pneumatics are fully retracted
            Robot.harvester.startWheels(-0.50); // kick the ball out
        }
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !Robot.harvester.getLimitSwitchBallLoaded();
    }
    // Called once after isFinished returns true
    protected void end() {
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

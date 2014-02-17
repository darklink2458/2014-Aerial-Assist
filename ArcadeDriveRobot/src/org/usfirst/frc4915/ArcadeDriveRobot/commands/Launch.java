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
 *
 */
public class Launch extends Command {

    private boolean shouldQuit;

    public Launch() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.launcher);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this hns the first time

    protected void initialize() {
        System.out.println("Initialize Launcher SUBCommand");
        shouldQuit = false;
        // Preconditions: Harvester is down
        if ((Robot.harvester.isHarvesterUp())) {
            shouldQuit = true;
            System.out.println("No shooting because the harvester is up");
        } else {
            Robot.launcher.setLaunchedBall(true);
            Robot.launcher.pneumaticsForward();
            setTimeout(2);
        }
    }
    // Called repeatedly when this Command is scheduled to run

    protected void execute() {
    }
    // Make this return true when this Command no longer needs to run execute()

    protected boolean isFinished() {
        return (isTimedOut() || shouldQuit);
    }
    // Called once after isFinished returns true

    protected void end() {
        Robot.launcher.pneumaticsReverse();
        System.out.println("Finished Launch SUBCommand");
        Robot.launcher.setLaunchedBall(true);
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run

    protected void interrupted() {
        System.out.println("INTERRUPTED LAUNCH COMMAND -- \nDOESN'T call END");
    }
}

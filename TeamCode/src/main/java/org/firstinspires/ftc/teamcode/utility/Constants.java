package org.firstinspires.ftc.teamcode.utility;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Constants {
    // Create subclasses for the Drivetrain and each control item such as servos and motors.

    public static final class Drivetrain {
        // Hardware Configuration for Drivetrain Items
        // ------------------------------------------------------------

        // Drivetrain Motors, Define configured name and direction
        public static final String MOTOR_LF = "leftFrontDrive";
        public static final DcMotorSimple.Direction LF_Direction =DcMotorSimple.Direction.FORWARD;
        public static final String MOTOR_LB = "leftBackDrive";
        public static final DcMotorSimple.Direction LB_Direction =DcMotorSimple.Direction.FORWARD;
        public static final String MOTOR_RF = "rightFrontDrive";
        public static final DcMotorSimple.Direction RF_Direction =DcMotorSimple.Direction.FORWARD;
        public static final String MOTOR_RB = "rightBackDrive";
        public static final DcMotorSimple.Direction RB_Direction =DcMotorSimple.Direction.FORWARD;

        //Define name of IMU on Control hub and Control lHub Orientation
        public static final String IMU = "imu";
        public static final RevHubOrientationOnRobot.LogoFacingDirection HUB_LOGO = RevHubOrientationOnRobot.LogoFacingDirection.RIGHT;
        public static final RevHubOrientationOnRobot.UsbFacingDirection HUB_USB = RevHubOrientationOnRobot.UsbFacingDirection.DOWN;

        // Define Devicename for Otos
        public static final String Otos ="otos";

        // Position Tuning constants
        // TODO Tune gains and accels for robot. Currnently moves in an odd rhomboid way.

        public static final double DRIVE_GAIN          = 0.03;    // Strength of axial position control
        public static final double DRIVE_ACCEL         = 2.0;     // Acceleration limit.  Percent Power change per second.  1.0 = 0-100% power in 1 sec.
        public static final double DRIVE_TOLERANCE     = 0.5;     // Controller is is "inPosition" if position error is < +/- this amount
        public static final double DRIVE_DEADBAND      = 0.2;     // Error less than this causes zero output.  Must be smaller than DRIVE_TOLERANCE
        public static final double DRIVE_MAX_AUTO      = 0.9;     // "default" Maximum Axial power limit during autonomous

        public static final double STRAFE_GAIN         = 0.03;    // Strength of lateral position control
        public static final double STRAFE_ACCEL        = 1.5;     // Acceleration limit.  Percent Power change per second.  1.0 = 0-100% power in 1 sec.
        public static final double STRAFE_TOLERANCE    = 0.5;     // Controller is is "inPosition" if position error is < +/- this amount
        public static final double STRAFE_DEADBAND     = 0.2;     // Error less than this causes zero output.  Must be smaller than DRIVE_TOLERANCE
        public static final double STRAFE_MAX_AUTO     = 0.6;     // "default" Maximum Lateral power limit during autonomous

        public static final double YAW_GAIN            = 0.018;    // Strength of Yaw position control
        public static final double YAW_ACCEL           = 3.0;     // Acceleration limit.  Percent Power change per second.  1.0 = 0-100% power in 1 sec.
        public static final double YAW_TOLERANCE       = 1.0;     // Controller is is "inPosition" if position error is < +/- this amount
        public static final double YAW_DEADBAND        = 0.25;    // Error less than this causes zero output.  Must be smaller than DRIVE_TOLERANCE
        public static final double YAW_MAX_AUTO        = 0.6;     // "default" Maximum Yaw power limit during autonomous

    }
    public static final class Specimen {
        // Drivetrain Motors, Define configured name and direction
        public static final String MOTOR = "speicmenMotor";
        public static final DcMotorSimple.Direction Direction =DcMotorSimple.Direction.FORWARD;

        public static final double defaultPower         =0.5;

        public static final int DownPosition            = 0;
        public static final int LowBarPosition          = 100;
        public static final int HighBarPosition         = 200;
        public static final int HookMove                = 25;
    }







}
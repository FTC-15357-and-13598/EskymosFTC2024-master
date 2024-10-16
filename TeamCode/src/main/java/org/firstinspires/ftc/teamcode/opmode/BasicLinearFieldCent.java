
/* Copyright (c) 2021 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/*
    * This file contains the MoBots / MoreBots Field Centric Linear "OpMode". This is the base
    * template for both robots. Built in functionality includes: field centric motion, via
    * MoreMoBOts drivetrain creating the bones for a full Tele Op.
    *
    * Field Centric is a method of driving a robot where the robot moves in the direction of the
    * joystick regardless of the robot's orientation. This is done by rotating the joystick input
    * by the robot's heading.
    *
    * This is READ ONLY. If you want to make your own, copy this class and paste it with a new name.
    *
    *
 */

package org.firstinspires.ftc.teamcode.opmode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.robomossystem.MoMoreBotsDrivetrain;

@TeleOp(name="MOBots Core Basic Field Centered Template", group="Linear OpMode")


public class BasicLinearFieldCent extends LinearOpMode {
//get an instance of the "drivetrain" class.
    private MoMoreBotsDrivetrain drivetrain = new MoMoreBotsDrivetrain(this);

    private Servo servoTest = null;

    @Override
    public void runOpMode() {

        /* Initialize the hardware variables. Note that the strings used here must correspond
         * to the names assigned during the robot configuration step on the DS or RC devices.
         * These names are critical, label the front of the robot as FRONT. This will be
         * important later! Don't Iinitialize motors or IMU, they are part of the drivedrain.
         */

        /*
        * This initializes the servoTest servo. You would initialize other servos using the same method.
         */

        servoTest = hardwareMap.get(Servo.class, "servoTest");

        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            //If gamepad1 a is pressed move servotest to 0.05
            //Servo is a 5 rotation servo so 1 rotation is 360 degrees and 0.05 is 18 degrees
            if (gamepad1.a) {
                servoTest.setPosition(0.05);
            }

            //If gamepad1 b is pressed move servotest to 0.0
            if (gamepad1.b) {
                servoTest.setPosition(0.0);
            }

            /* Call Field Centric drive from drive train after calculating the speed factor
            the speed factor will be the fraction of full speed that full stick will result
            in. For example 1 is full speed, 0.5 is half speed. THe intention is to use the
            right trigger to to create a "Turbo" mode while allowing the driver to release
            the trigger and slow the robot down giving more control for small moves.
             */
            double speedfact = 0.4;
            //If trigger pulled set speed factor to higher value
            if (gamepad1.right_trigger>0.1){speedfact =0.8;}
            //Call Field Centric void in drivetrain.
            drivetrain.moveRobotFC(gamepad1.left_stick_x,-gamepad1.left_stick_y,gamepad1.right_stick_x,speedfact);
        }
    }
    }



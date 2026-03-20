package org.firstinspires.ftc.teamcode.teleop
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit.normalizeDegrees
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorEx
import com.qualcomm.robotcore.hardware.DcMotorSimple
import com.qualcomm.robotcore.hardware.PIDFCoefficients
import com.qualcomm.robotcore.hardware.Servo
import org.firstinspires.ftc.teamcode.api.sampleServoMotor

@TeleOp(name = "teleopSample")

class teleopSample : OpMode() {
    override fun init() {
        telemetry.addData("Sample", "sample")
        sampleServoMotor.init(this)
            }

    override fun loop() {
        if (gamepad1.a && !sampleServoMotor.lastA){
            sampleServoMotor.motorOn=!sampleServoMotor.motorOn
        }
        sampleServoMotor.lastA=gamepad1.a
        val x=gamepad1.left_stick_x.toDouble()
        if (sampleServoMotor.motorOn){
            sampleServoMotor.spinMotor(x)
        } else{
            sampleServoMotor.spinMotor(0.0)
        }

    }
}
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
        sampleServoMotor.init(this)
            }

    override fun loop() {
        //this is all for the button logic and motor and servo control
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
        //the following under is code for the encoder
        sampleServoMotor.sampleMotor.setTargetPosition(1000)
        //idk the ticks per inch for the specefic motor, so i didn't do that, i did give u the formula tho
        telemetry.addData("Sample", "sample")
        telemetry.addData("Encoder", sampleServoMotor.sampleMotor.getCurrentPosition())
        telemetry.update()

    }
}
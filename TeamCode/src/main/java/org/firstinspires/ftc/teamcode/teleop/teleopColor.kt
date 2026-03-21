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
import org.firstinspires.ftc.teamcode.api.*

@TeleOp(name = "teleopColor")

class teleopColor : OpMode() {

    override fun init() {
        Color.init(this)
    }

    override fun loop() {
        
            if(Color.color.red()>Color.color.green()&&Color.color.red()>Color.color.blue()) {
                telemetry.addLine("red")
            } else if(Color.color.green()>Color.color.red() && Color.color.green()>Color.color.blue()) {
                telemetry.addLine("green")
            } else {
                telemetry.addLine("blue")
            }
            telemetry.update()
        
    }
}
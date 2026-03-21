package org.firstinspires.ftc.teamcode.teleop

import org.firstinspires.ftc.teamcode.api.*

import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.DcMotor

@TeleOp(name = "tankkkyyy")
class teleopTankDrive : OpMode() {

    override fun init() {
        sampleServoMotor.init(this)
    }

    override fun loop() {
        TankDrive.leftWheel.power = -gamepad1.left_stick_y.toDouble()
        TankDrive.rightWheel.power = -gamepad1.right_stick_y.toDouble()
    }
}

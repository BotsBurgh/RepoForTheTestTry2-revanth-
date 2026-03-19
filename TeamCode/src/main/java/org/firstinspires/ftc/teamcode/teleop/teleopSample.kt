package org.firstinspires.ftc.teamcode.teleop
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit.normalizeDegrees
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit

@TeleOp(name = "teleopSample")

class teleopSample : OpMode() {
    override fun init() {
        telemetry.addData("Sample", "sample")
    }

    override fun loop() {
    }
}
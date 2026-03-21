package org.firstinspires.ftc.teamcode.api
import org.firstinspires.ftc.teamcode.core.API
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.Servo
import com.qualcomm.robotcore.hardware.DcMotorEx
//import org.firstinspires.ftc.teamcode.api.Turret.aimer

object TankDrive : API() {
    lateinit var leftWheel: DcMotorEx
    lateinit var rightWheel: DcMotorEx

    override fun init(opMode: OpMode) {
        super.init(opMode)


        leftWheel = this.opMode.hardwareMap.get(DcMotorEx::class.java, "leftWheel")
        rightWheel = this.opMode.hardwareMap.get(DcMotorEx::class.java, "rightWheel")
        leftWheel.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER)
        rightWheel.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER)
        leftWheel.setMode(DcMotor.RunMode.RUN_USING_ENCODER)

        rightWheel.setMode(DcMotor.RunMode.RUN_USING_ENCODER)


    }


}
package org.firstinspires.ftc.teamcode.api
import org.firstinspires.ftc.teamcode.core.API
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.Servo
import com.qualcomm.robotcore.hardware.DcMotorEx
//import org.firstinspires.ftc.teamcode.api.Turret.aimer

object sampleServoMotor : API() {
    lateinit var sampleServo: Servo
        private set
    lateinit var sampleMotor: DcMotorEx
        private set
    var motorOn = false
    var lastA = false
    override fun init(opMode: OpMode) {
        super.init(opMode)

        sampleServo = this.opMode.hardwareMap.get(Servo::class.java, "sampleServo")
        sampleMotor = this.opMode.hardwareMap.get(DcMotorEx::class.java, "sampleMotor")



    }
    fun spinMotor(power: Double){
        sampleMotor.power = power
    }
    fun spinServo(pos :Double) {
        sampleServo.position = pos
    }


}
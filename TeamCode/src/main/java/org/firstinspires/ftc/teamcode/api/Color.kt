package org.firstinspires.ftc.teamcode.api
//import com.qualcomm.robotcore.hardware.HardwareDevice.*
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.hardware.ColorSensor
import com.qualcomm.robotcore.hardware.DistanceSensor
import org.firstinspires.ftc.robotcontroller.external.samples.SensorColor
import org.firstinspires.ftc.teamcode.core.API


//import org.firstinspires.ftc.teamcode.api.Turret.aimer

object Color : API() {
    lateinit var color: ColorSensor
    lateinit var distance: DistanceSensor
    override fun init(opMode : OpMode){
        super.init(opMode)

        color = this.opMode.hardwareMap.get(ColorSensor::class.java, "color")
        distance = this.opMode.hardwareMap.get(DistanceSensor::class.java, "distance")


    }


}
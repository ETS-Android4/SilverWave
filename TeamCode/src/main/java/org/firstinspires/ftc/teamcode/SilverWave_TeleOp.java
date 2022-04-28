package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name="SilverWave TeleOp", group="Iterative Opmode")

public class SilverWave_TeleOp extends OpMode
{
    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    
    private Servo leftProp = null;
    private Servo rightProp = null; 
    
    double rightPower;
    double leftPower;
    
    


    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        telemetry.addData("Status", "Initialized");
        
        rightProp = hardwareMap.get(Servo.class, "right_propeller");
        leftProp = hardwareMap.get(Servo.class, "left_propeller"); 

     

    //    rightProp.setDirection(Servo.Direction(FORWARD));
    //    leftProp.setDirection(Servo.Direction(FORWARD));



        // Tell the driver that initialization is complete.
        telemetry.addData("Status", "Initialized");

    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }


    @Override
    public void start() {
        runtime.reset();
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
    double j_LeftY = gamepad1.left_stick_y;
    double j_RightY = gamepad1.right_stick_y;
    
    rightPower = j_RightY/2 + 0.5;
    leftPower = j_LeftY/2 + 0.5;
   
   rightProp.setPosition(rightPower);
   leftProp.setPosition(leftPower);
    
    
    
    telemetry.addData("Right Servo Direction", rightProp.getDirection());
    telemetry.addData("Right Power", rightPower);
    telemetry.addData("Left Power", leftPower);
    telemetry.update();


    
}
    @Override
    public void stop() {
    }
//

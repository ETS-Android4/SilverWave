package org.firstinspires.ftc.teamcode;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@TeleOp(name = "Arnav", group = "AtlAtl")
public class AtlAtl_TeleOp_final extends OpMode {

    DcMotor leftFrontMotor;
    DcMotor rightFrontMotor;
    DcMotor leftBackMotor;
    DcMotor rightBackMotor;
    DcMotor carouselMotor;
    public void moveDriveTrain(){
        double vertical = 0;
        double horizontal = 0;
        double pivot = 0;
        boolean carouselButtonRight = FALSE;
        boolean carouselButtonLeft = FALSE;
        vertical = -gamepad1.left_stick_y;
        horizontal = gamepad1.left_stick_x;
        pivot = gamepad1.right_stick_x;
        carouselButtonRight = gamepad1.right_bumper;
        carouselButtonLeft = gamepad1.left_bumper;

        leftFrontMotor.setPower(pivot +(-vertical - horizontal));
        rightFrontMotor.setPower(pivot +(-vertical + horizontal));
        leftBackMotor.setPower(pivot +(-vertical + horizontal));
        rightBackMotor.setPower(pivot +(-vertical - horizontal));
        if(carouselButtonRight == TRUE){
            carouselMotor.setPower(0.5);
        }
        if (carouselButtonLeft == TRUE){
            carouselMotor.setPower(-0.5);
        }
    }

    @Override
    public void init() {
        leftFrontMotor = hardwareMap.get(DcMotor.class, "leftFrontMotor");
        rightFrontMotor = hardwareMap.get(DcMotor.class, "rightFrontMotor");
        leftBackMotor = hardwareMap.get(DcMotor.class, "leftBackMotor");
        rightBackMotor = hardwareMap.get(DcMotor.class, "rightBackMotor");
        carouselMotor = hardwareMap.get(DcMotor.class, "carousel");
    }
    @Override
    public void init_loop() {

    }

    @Override
    public void loop(){

    }

}

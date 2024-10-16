package org.firstinspires.ftc.teamcode.hardwareSystems;

import java.util.HashMap;
import java.util.HashSet;

import com.qualcomm.robotcore.hardware.*;

public class ExtendableArm extends Arm {
    // The motor the arm up and down.
    private final DcMotor ROTATION_MOTOR;
    // The motor that extends and retracts the arm.
    private final DcMotor EXTENSION_MOTOR;

    // The servo that rotates the claw about the X-axis
    private final Servo CLAW_X_SERVO;
    // The servo that rotates the claw about the Y-axis
    private final Servo CLAW_Y_SERVO;
    // The servo that rotates the claw about the Z-axis
    private final Servo CLAW_Z_SERVO;
    // The servo that opens and closes the grip.
    private final CRServo INTAKE_SERVO;

    /**
     * Instantiate the motors using HashMaps.
     * Each key should be the name of the motor as defined by the configuration.
     * Note that the provided keys should be replaced with the current season's.
     * 
     * @param motors A HashMap with motor names as keys and `DcMotor`s as values.
     * @param servos A HashMap with servo names as keys and `Servo`s as values.
     */
    public ExtendableArm(HashMap<String, DcMotor> motors, HashMap<String, Servo> servos, CRServo intakeServo) {
        super(new HashSet<>(motors.values()), new HashSet<>(servos.values()));

        ROTATION_MOTOR = null;
        EXTENSION_MOTOR = null;

        CLAW_X_SERVO = null;
        CLAW_Y_SERVO = null;
        CLAW_Z_SERVO = null;
        INTAKE_SERVO = intakeServo;
    }

    /**
     * Instantiate each motor and servo individually.
     * 
     * @param rotationMotor  The motor that rotates the arm up and down.
     * @param extensionMotor The motor that extends and retracts the arm.
     * @param clawXServo     The servo that rotates the claw about the X-axis.
     * @param clawYServo     The servo that rotates the claw about the Y-axis.
     * @param clawZServo     The servo that rotates the claw about the Z-axis.
     * @param intakeServo    The servo that opens and closes the claw.
     */
    public ExtendableArm(DcMotor rotationMotor, DcMotor extensionMotor, Servo clawXServo, Servo clawYServo,
            Servo clawZServo, CRServo intakeServo) {
        super();
        
        /* Motors */
        this.ROTATION_MOTOR = rotationMotor;
        this.EXTENSION_MOTOR = extensionMotor;

        super.MOTORS.add(rotationMotor);
        super.MOTORS.add(extensionMotor);
        
        /* Servos */
        this.CLAW_X_SERVO = clawXServo;
        this.CLAW_Y_SERVO = clawYServo;
        this.CLAW_Z_SERVO = clawZServo;
        this.INTAKE_SERVO = intakeServo;
        
        super.SERVOS.add(clawXServo);
        super.SERVOS.add(clawYServo);
        super.SERVOS.add(clawZServo);
    }

    public CRServo getIntakeServo() {
        return INTAKE_SERVO;
    }
}
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
  /*Creating instance variables that will be initalized as VictorSPX motors */
  public WPI_VictorSPX frontRight;
  public WPI_VictorSPX frontLeft;
  public WPI_VictorSPX backRight;
  public WPI_VictorSPX backLeft;
  /** Creates a new Motor. */
  public Motor() {

    /*(Initalizes motors and assigns them device numbers) */
    frontRight = new WPI_VictorSPX(0);
    frontLeft = new WPI_VictorSPX(1);
    backRight = new WPI_VictorSPX(2);
    backLeft = new WPI_VictorSPX(3);
    

    /*(Initallizes and assigns motors to controller groups) */
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
/* TO-DO
 *  Use Pheoinix Tuner to assign each motor an ID.
 * Test to make sure motors work and are properly identified.
 */
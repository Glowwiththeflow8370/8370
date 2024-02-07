// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.Motor;
import edu.wpi.first.wpilibj.XboxController;
public class DT extends SubsystemBase {
  /* Creates a new Motor Object */
  Motor motor = new Motor();
  /** Creates a new Drivetrain. (Note the args passed through are getting the axis of the controller joystick) */
  public DT(double xAxis, double yAxis) {
    DifferentialDrive driveTrain = new DifferentialDrive(motor.rightMotorControlGroup, motor.leftMotorCotnrolGroup);
    driveTrain.arcadeDrive(xAxis, yAxis);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

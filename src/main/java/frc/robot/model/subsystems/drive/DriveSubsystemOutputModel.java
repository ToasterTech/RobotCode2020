/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.model.subsystems.drive;

import frc.robot.model.Model;
import frc.robot.model.devices.output.DeviceOutput;
import frc.robot.model.devices.output.DeviceOutputCommand;
import frc.robot.model.devices.output.GenericMotorPWM;
import frc.robot.model.subsystems.SubsystemOutput;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A model to control a differential drive train.
 */
public class DriveSubsystemOutputModel extends SubsystemOutput {
  public final DeviceOutput<GenericMotorPWM> leftMotor1;
  public final DeviceOutput<GenericMotorPWM> leftMotor2;
  public final DeviceOutput<GenericMotorPWM> rightMotor1;
  public final DeviceOutput<GenericMotorPWM> rightMotor2;

  /**
   * Build a new Drive Output Model based on differential drive.
   * 
   * @param leftSide  setpoint for left side of drive train
   * @param rightSide setpoint for right side of drive train
   */
  public DriveSubsystemOutputModel(double leftSide, double rightSide) {
    this.leftMotor1 = new DeviceOutput<GenericMotorPWM>("leftMotor1", new GenericMotorPWM(leftSide));
    this.leftMotor2 = new DeviceOutput<GenericMotorPWM>("leftMotor2", new GenericMotorPWM(leftSide));
    this.rightMotor1 = new DeviceOutput<GenericMotorPWM>("rightMotor1", new GenericMotorPWM(rightSide));
    this.rightMotor2 = new DeviceOutput<GenericMotorPWM>("rightMotor2", new GenericMotorPWM(rightSide));
  }

  @Override
  public Set<DeviceOutput<? extends DeviceOutputCommand>> getDeviceOutputs() {
    return new HashSet<DeviceOutput<? extends DeviceOutputCommand>>(
        Arrays.asList(this.leftMotor1, this.leftMotor2, this.rightMotor1, this.rightMotor2));
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof DriveSubsystemOutputModel)) {
      return false;
    }
    DriveSubsystemOutputModel otherVal = (DriveSubsystemOutputModel)other;
    return (
      this.leftMotor1.equals(otherVal.leftMotor1)
      & this.leftMotor2.equals(otherVal.leftMotor2)
      & this.rightMotor1.equals(otherVal.rightMotor1)
      & this.rightMotor2.equals(otherVal.rightMotor2));
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.leftMotor1, this.leftMotor2, this.rightMotor1, this.rightMotor2);
  }
}

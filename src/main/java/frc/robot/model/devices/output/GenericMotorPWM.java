/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.model.devices.output;

import frc.robot.model.devices.DeviceType;

import java.util.Objects;


/**
 * Model to control PWM Motors.
 */
public class GenericMotorPWM extends DeviceOutputCommand {
  public final double setpoint;

  public GenericMotorPWM(double setpoint) {
    this.setpoint = setpoint;
  }

  @Override
  public DeviceType getDeviceType() {
    return DeviceType.PWM_MOTOR;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof GenericMotorPWM)) {
      return false;
    }
    GenericMotorPWM otherVal = (GenericMotorPWM)other;
    return this.setpoint == otherVal.setpoint & this.getDeviceType() == otherVal.getDeviceType();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.setpoint, this.getDeviceType()); 
  }
}

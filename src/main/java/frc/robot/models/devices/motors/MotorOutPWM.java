/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.models.devices.motors;

import frc.robot.models.Model;
import frc.robot.models.devices.DeviceOutputModel;
import frc.robot.models.devices.DeviceType;

/**
 * Model Representing Output To a PWM Motor Controller.
 * 
 * @param outputVoltage the target voltage for motor from -1 to 1.
 */
public class MotorOutPWM extends DeviceOutputModel {
  public final double outputVoltage;

  public MotorOutPWM(double outputVoltage) {
    super(DeviceType.MotorPWM);
    this.outputVoltage = outputVoltage;
  }

  @Override
  public Model defaultModel() {
    return new MotorOutPWM(0);
  }
}
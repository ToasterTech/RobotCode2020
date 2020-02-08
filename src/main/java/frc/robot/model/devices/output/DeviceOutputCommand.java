/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.model.devices.output;

import frc.robot.model.Model;
import frc.robot.model.devices.DeviceType;

/**
 * Interface for Device Output Commands.
 */
public abstract class DeviceOutputCommand extends Model {
  public abstract DeviceType getDeviceType();
}

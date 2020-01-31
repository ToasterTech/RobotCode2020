/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.models.devices;

import frc.robot.models.Model;

/**
 * Model representing the output to a device. 
 * 
 */
public abstract class DeviceOutputModel implements Model {
  public final DeviceType deviceType;

  public DeviceOutputModel(DeviceType deviceType) {
    this.deviceType = deviceType;
  }
}
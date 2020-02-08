/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.model.subsystems;

import frc.robot.model.Model;
import frc.robot.model.devices.output.DeviceOutput;
import frc.robot.model.devices.output.DeviceOutputCommand;
import java.util.Set;


/**
 * Interface for a subsystem output model.
 */
public abstract class SubsystemOutput extends Model {
  /**
   * Returns the set of DeviceOutput Commands for this model.
   * @return
   */
  public abstract Set<DeviceOutput<? extends DeviceOutputCommand>> getDeviceOutputs();
}

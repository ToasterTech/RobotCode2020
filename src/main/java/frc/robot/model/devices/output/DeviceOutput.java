/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.model.devices.output;

import java.util.Objects;

import frc.robot.model.Model;

/**
 * Model for outputting to a device to pass to the hardware abstraction
 * interface. Contains name of device, and a deviceCommand to send to that
 * deviceName.
 */
public class DeviceOutput<DeviceCommandT extends DeviceOutputCommand> extends Model{
  public final String deviceName;
  public final DeviceCommandT deviceCommand;

  public DeviceOutput(String deviceName, DeviceCommandT deviceCommand) {
    this.deviceName = deviceName;
    this.deviceCommand = deviceCommand;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof DeviceOutput)) {
      return false;
    }
    DeviceOutput<?> otherVal = (DeviceOutput<?>)other;
    return this.deviceName.equals(otherVal.deviceName) & this.deviceCommand.equals(otherVal.deviceCommand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.deviceName, this.deviceCommand);
  }
}

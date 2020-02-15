/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import java.util.HashMap;
import java.util.List;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import frc.robot.devices.commands.DeviceOutputCommand;
import frc.robot.devices.output.DeviceOutput;
import frc.robot.devices.output.DevicePWMTalonSRX;

/**
 * Add your docs here.
 */
public class HardwareInterface {
  private HashMap<String, DeviceOutput> deviceMap; 

  private PWMTalonSRX motor1 = new PWMTalonSRX(1);
  private PWMTalonSRX motor2 = new PWMTalonSRX(2);
  private PWMTalonSRX motor3 = new PWMTalonSRX(3);
  private PWMTalonSRX motor4 = new PWMTalonSRX(4);

  public HardwareInterface(){
    this.deviceMap = new HashMap<String, DeviceOutput>();
    this.deviceMap.put("leftMotor", new DevicePWMTalonSRX(1));
    this.deviceMap.put("rightMotor", new DevicePWMTalonSRX(2));
  }

  /**
   * Sets motor motorName to motorValue.
   * @param motorName Name of the motor.
   * @param motorValue Value to set the motor to.
   */
  public void setMotor(String motorName, double motorValue) {
    if (motorName.equals("motor1")) {
      this.motor1.set(motorValue);
    }
    if (motorName.equals("motor2")) {
      this.motor2.set(motorValue);
    }
    if (motorName.equals("motor3")) {
      this.motor3.set(motorValue);
    }
    if (motorName.equals("motor4")) {
      this.motor4.set(motorValue);
    }
  }

  /**
   * Run the hardware interface to set device commands to the devices.
   * @param commands a list of device output commands.
   */
  public void run(List<DeviceOutputCommand> commands) {
    for (DeviceOutputCommand command: commands) {
      DeviceOutput output = this.deviceMap.get(command.getDeviceId());
      if (output.isValidCommand(command)) {
        output.run(command);
      }
      else {
        throw new IllegalArgumentException(
          String.format("%s is not a valid DeviceOutputCommand for %s", command.getClass(), output.getClass())
        );
      }
    }
  }

}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem;

import frc.robot.model.Model;
import frc.robot.model.ModelTransform;
import frc.robot.model.devices.output.DeviceOutput;
import frc.robot.model.devices.output.DeviceOutputCommand;
import frc.robot.model.subsystems.SubsystemOutput;

import java.util.Set;


/**
 * Abstract base class for robot subsystems.
 */
public abstract class RobotSubsystem<InputModelT extends Model, OutputModelT extends SubsystemOutput>
              implements ModelTransform<InputModelT, OutputModelT> {
  protected OutputModelT currentState;

  /** Run the robot subsystem for one iteration. Takes in an input model
   *  representing all required inputs 
   *  
   * @param input The subsystem input state for this iteration
   * @return The output commands for the subsystem
   */
  public Set<DeviceOutput<? extends DeviceOutputCommand>> run(InputModelT input) {
    this.currentState = this.convertModel(input);
    return this.currentState.getDeviceOutputs();
  }
}

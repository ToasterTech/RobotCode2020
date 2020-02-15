/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem.drive;

import java.util.List;

import frc.robot.devices.commands.BaseOutputCommand;
import frc.robot.subsystem.RobotSubsystem;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends RobotSubsystem<DriveModel> {


  @Override
  public List<BaseOutputCommand> run(DriveModel input) {
    if(input instanceof DifferentialDriveModel) {
      return 
    }
    return null;
  }

}

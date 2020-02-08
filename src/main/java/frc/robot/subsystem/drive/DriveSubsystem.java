/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem.drive;

import frc.robot.model.subsystems.drive.DifferentialDriveModel;
import frc.robot.model.subsystems.drive.DriveSubsystemOutputModel;
import frc.robot.subsystem.RobotSubsystem;

/**
 * Handle creating motor commands for the drive subsystem.
 */
public class DriveSubsystem extends RobotSubsystem<DifferentialDriveModel, DriveSubsystemOutputModel> {
  @Override
  public DriveSubsystemOutputModel convertModel(DifferentialDriveModel sourceModel) {
    return new DriveSubsystemOutputModel(
      sourceModel.leftSide,
      sourceModel.rightSide
    );
  }
}


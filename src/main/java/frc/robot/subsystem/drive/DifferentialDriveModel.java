/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem.drive;

/**
 * Build a .
 */
public class DifferentialDriveModel {
  public final double left;
  public final double right;

  public DifferentialDriveModel(double left, double right) {
    this.left = left;
    this.right = right;
  }
}

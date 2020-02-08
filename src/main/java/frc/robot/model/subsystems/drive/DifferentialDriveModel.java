/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.model.subsystems.drive;

import frc.robot.model.Model;

import java.util.Objects;


/**
 * A model to control a differential drive train.
 */
public class DifferentialDriveModel extends Model {
  public final Double leftSide;
  public final Double rightSide;

  public DifferentialDriveModel(double leftSide, double rightSide) {
    this.leftSide = leftSide;
    this.rightSide = rightSide;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof DifferentialDriveModel)) {
      return false;
    }
    DifferentialDriveModel otherVal = (DifferentialDriveModel)other;
    return (
      this.leftSide == otherVal.leftSide 
      & this.rightSide == otherVal.rightSide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.leftSide, this.rightSide);
  }
}

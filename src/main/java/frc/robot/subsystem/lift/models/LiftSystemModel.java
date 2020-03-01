/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem.lift.models;

import java.util.Objects;

/**
 * A simple model for the conveyor system on the 2020 robot. 
 */
public class LiftSystemModel extends LiftModel {
  public enum IntakeState {
    INTAKE, OUTTAKE, STOPPED
  }

  public final IntakeState intakeState;

  public LiftSystemModel(IntakeState intakeState) {
    this.intakeState = intakeState;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof LiftSystemModel)) {
      return false;
    }
    LiftSystemModel otherVal = (LiftSystemModel) other;
    return this.intakeState == otherVal.intakeState;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.intakeState);
  }
}

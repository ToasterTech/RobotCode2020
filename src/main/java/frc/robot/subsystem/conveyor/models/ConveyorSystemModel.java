/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem.conveyor.models;

import java.util.Objects;

/**
 * A simple model for the conveyor system on the 2020 robot. 
 */
public class ConveyorSystemModel extends ConveyorModel {
  public enum IntakeState {
    INTAKE, OUTTAKE, STOPPED
  }

  public final IntakeState intakeState; 


  public ConveyorSystemModel(IntakeState intakeState) {
    //Initalize the variables here
    this.intakeState = intakeState;
  }

  @Override
  public boolean equals(Object other) {
    // Implement this, should check if both of these objects are equal
    if (!(other instanceof ConveyorSystemModel)) {
      return false;
    }
    ConveyorSystemModel otherVal = (ConveyorSystemModel)other;
    return this.intakeState == otherVal.intakeState;
  }

  @Override
  public int hashCode() {
    // For the sake this just pass whatever variables into this method
    return Objects.hash();
  }
}

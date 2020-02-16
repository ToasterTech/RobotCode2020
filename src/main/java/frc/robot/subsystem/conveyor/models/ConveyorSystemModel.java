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
  // Put some variables here that indicate the behavior of the conveyor belt.
  // For now I see it going up, down and stopped, but there could do more. 
  // This is pretty simple so I will let you think through and figure it out.
  // Commit the changes once you make progress
  public final String yourVariableHere; 


  public ConveyorSystemModel() {
    //Initalize the variables here
    this.yourVariableHere = "yourVariableValue";
  }

  @Override
  public boolean equals(Object other) {
    // Implement this, should check if both of these objects are equal
    return false;
  }

  @Override
  public int hashCode() {
    // For the sake this just pass whatever variables into this method
    return Objects.hash();
  }
}

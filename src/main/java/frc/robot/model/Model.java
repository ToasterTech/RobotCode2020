/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.model;

/**
 * Interface for all models.
 * There is currently no methods here because we haven't figured out what is needed yet.
 * Probably need some serilization methods once we figure that out.
 */
public abstract class Model {
  @Override
  public abstract boolean equals(Object other);
  
  @Override
  public abstract int hashCode();

}

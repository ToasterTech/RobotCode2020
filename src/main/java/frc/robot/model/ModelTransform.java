/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.model;

/**
 * Interface for transforming models from one type to another.
 */
public interface ModelTransform<ModelFromT extends Model, ModelToT extends Model> {
  public ModelToT convertModel(ModelFromT sourceModel);
}

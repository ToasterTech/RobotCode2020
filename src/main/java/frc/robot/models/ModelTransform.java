/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.models;

/**
 * Interface to convert one model to another type using a custom defined transformation.
 */
public interface ModelTransform<ModelInT extends Model, ModelOutT extends Model> {
  /*
   * Convert from ModelInT to ModelOutT
   * @return: Default value for model
   */
  public ModelOutT transform(ModelInT model);
}
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.models;

/**
 * Interface for defining robot models. Any class that should 
 * be a model of robot state should implement this method to 
 * to fit in the type system and provide implementations of 
 * some key functions.
 * 
 * <p>This is suppossed to be more like a trait in scala, but java is very
 * limited so some workarounds have to be done. <\p>
 * TODO: Serialization method interface for logging models, probably to json.
 */
public interface Model {
  /*
   * Create a default value for this model. It has to be an instance 
   * method because you can't extend static methods. This has to be 
   * an instance method because of how java handles generics (disgusting).
   * @return: Default value for model
   */
  public Model defaultModel();
}
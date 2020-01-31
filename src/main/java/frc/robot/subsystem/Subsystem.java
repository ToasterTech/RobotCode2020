/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem;

import frc.robot.models.Model;
import frc.robot.models.ModelTransform;


/**
 * Add your docs here.
 */
public abstract class Subsystem<SubsystemInputT extends Model, SubsystemOutputT extends Model> 
                      implements ModelTransform<SubsystemInputT,SubsystemOutputT>  {

  public SubsystemOutputT run(SubsystemInputT inputModel) {
    return ;
  }
}

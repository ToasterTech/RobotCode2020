/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem;

import frc.robot.controllers.Controller;
import frc.robot.models.Model;


/**
 * Add your docs here.
 */
public abstract class Subsystem<SubsystemInputT extends Model,
                                SubsystemOutputT extends Model> extends 
                                  Controller<SubsystemInputT,SubsystemOutputT>  {

  public SubsystemOutputT run(SubsystemInputT inputModel) {
    return this.convertInputToOutput(inputModel);
  }
}

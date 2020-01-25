/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.controllers;

import frc.robot.models.Model;

/**
 * Controls subsystems by transforming input models to output models.
 */
public abstract class Controller<InputT extends Model,
                                 OutputT extends Model> {

  public abstract OutputT convertInputToOutput(InputT model);
}

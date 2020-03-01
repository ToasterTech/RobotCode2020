/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem.lift;

import frc.robot.devices.commands.DeviceOutputCommand;
import frc.robot.devices.commands.GenericMotorPWM;
import frc.robot.subsystem.RobotSubsystem;
import frc.robot.subsystem.lift.models.LiftModel;
import frc.robot.subsystem.lift.models.LiftSystemModel;

import java.util.Arrays;
import java.util.List;

/**
 * Subsystem for transforming intake models to motor commands.
 */
public class LiftSubsystem extends RobotSubsystem<LiftModel> {
  @Override
  public List<DeviceOutputCommand> run(LiftModel input) {
    if (input instanceof LiftSystemModel) {
      LiftSystemModel liftSystemModel = (LiftSystemModel) input;
      if (liftSystemModel.intakeState == LiftSystemModel.IntakeState.STOPPED) {
        return Arrays.asList(
          new GenericMotorPWM("liftMotor", 0.0)
        );
      }
      if (liftSystemModel.intakeState == LiftSystemModel.IntakeState.INTAKE) {
        return Arrays.asList(
          new GenericMotorPWM("liftMotor", 1)
        );
      }
      if (liftSystemModel.intakeState == LiftSystemModel.IntakeState.OUTTAKE) {
        return Arrays.asList(
          new GenericMotorPWM("liftMotor", -1)
        );
      }
    }
    return null;
  }
}

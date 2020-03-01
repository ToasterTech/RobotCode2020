package frc.robot.controllers;

import frc.robot.subsystem.conveyor.models.ConveyorSystemModel;

public class IntakeDutyCycle {
  private boolean on;
  private double endOfCycle;
  private double cycleTime;

  /**
   * Create a duty cycle for the intake. 
   * @param cycleTime cycle time in ms
   */
  public IntakeDutyCycle(double cycleTime) {
    this.cycleTime = cycleTime;
  }

  /**
   * Get Intake state for current duty cycle.
   * @param currentTime current time in ms.
   * @return
   */
  public ConveyorSystemModel.IntakeState run(double currentTime) {
    if (currentTime > endOfCycle) {
      this.on = !this.on;
      this.endOfCycle = currentTime + this.cycleTime;
    }
    if (this.on) {
      return ConveyorSystemModel.IntakeState.INTAKE;
    }
    return ConveyorSystemModel.IntakeState.STOPPED;
  }
}
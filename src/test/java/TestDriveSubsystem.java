import static org.junit.Assert.assertEquals;

import frc.robot.model.devices.output.DeviceOutput;
import frc.robot.model.devices.output.DeviceOutputCommand;
import frc.robot.model.devices.output.GenericMotorPWM;
import frc.robot.model.subsystems.drive.DifferentialDriveModel;
import frc.robot.model.subsystems.drive.DriveSubsystemOutputModel;
import frc.robot.subsystem.drive.DriveSubsystem;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestDriveSubsystem {

  /**
   * Build expected motor outputs for a differential drive robot.
   * 
   * @param left  left side of the drive train
   * @param right right side of the drive train
   * @return
   */
  public static HashSet<DeviceOutput<? extends DeviceOutputCommand>> buildExpectedMotorOutputs(double left, 
                                                                                               double right) {
    return new HashSet<DeviceOutput<? extends DeviceOutputCommand>>(
        Arrays.asList(new DeviceOutput<GenericMotorPWM>("leftMotor1", new GenericMotorPWM(left)),
            new DeviceOutput<GenericMotorPWM>("leftMotor2", new GenericMotorPWM(left)),
            new DeviceOutput<GenericMotorPWM>("rightMotor1", new GenericMotorPWM(right)),
            new DeviceOutput<GenericMotorPWM>("rightMotor2", new GenericMotorPWM(right))));
  }

  private DifferentialDriveModel driveModel;
  private DriveSubsystemOutputModel subsystemModel;
  private HashSet<DeviceOutput<? extends DeviceOutputCommand>> expectedOutputs;
  private DriveSubsystem driveSubsystem;

  public TestDriveSubsystem(DifferentialDriveModel driveModel, DriveSubsystemOutputModel subsystemModel,
                            HashSet<DeviceOutput<? extends DeviceOutputCommand>> expectedOutputs) {
    this.driveModel = driveModel;
    this.subsystemModel = subsystemModel;
    this.expectedOutputs = expectedOutputs;
    this.driveSubsystem = new DriveSubsystem();
  }

  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
        {new DifferentialDriveModel(0, 0), new DriveSubsystemOutputModel(0, 0), buildExpectedMotorOutputs(0, 0)},
        {new DifferentialDriveModel(1, 1), new DriveSubsystemOutputModel(1, 1), buildExpectedMotorOutputs(1, 1)},
        {new DifferentialDriveModel(-1, -1), new DriveSubsystemOutputModel(-1, -1), buildExpectedMotorOutputs(-1, -1)} 
    });

  }

  @Test
  public void testDriveModelConversion() {
    assertEquals(this.driveSubsystem.convertModel(this.driveModel), this.subsystemModel);
  }

  @Test
  public void testSubsystemToDriveCommands() {
    assertEquals(this.subsystemModel.getDeviceOutputs(), this.expectedOutputs);
  }

  @Test
  public void testSubsystemRun() {
    assertEquals(this.driveSubsystem.run(this.driveModel), this.expectedOutputs);
  }

}

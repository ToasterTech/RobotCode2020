/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.devices.input.gamepad;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.devices.input.DeviceInput;
import frc.robot.util.InputContainer;
import frc.robot.util.SimpleInputContainer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

//TODO: The wildcard type parameter is nasty and leads to unchecked exceptions, which are fine 
// because we actually know what they are, but we should avoid anyway.
/**
 * Playstation Controller.
 */
public class GamepadInput implements DeviceInput<HashMap<String, InputContainer<?>>> {
  private Joystick joystick;
  private HashMap<String, GamepadInputComponent<?>> joystickMap;
  private String name;

  /**
   * Create a playstation controller. 
   * 
   * @param joystick joystick reference
   */
  public GamepadInput(String name, Joystick joystick) {
    this.joystick = joystick;
    this.joystickMap = new HashMap<String, GamepadInputComponent<?>>();
    this.name = name;

    //TODO: These mappings are most certainly wrong.
    this.addGamepadComponent("left", new GamepadAxis(this.joystick, 0, "AxisX"));
    this.addGamepadComponent("left", new GamepadAxis(this.joystick, 1, "AxisY"));
    this.addGamepadComponent("right", new GamepadAxis(this.joystick, 4, "AxisX"));
    this.addGamepadComponent("right", new GamepadAxis(this.joystick, 5, "AxisY"));

    this.addGamepadComponent("left", new GamepadAxis(this.joystick, 2, "Trigger"));
    this.addGamepadComponent("right", new GamepadAxis(this.joystick, 3, "Trigger"));

    this.addGamepadComponent("left", new GamepadButton(this.joystick, 6, "Shoulder"));
    this.addGamepadComponent("right", new GamepadButton(this.joystick, 5, "Shoulder"));
    this.addGamepadComponent("y", new GamepadButton(this.joystick, 4, "Button"));
    this.addGamepadComponent("x", new GamepadButton(this.joystick, 3, "Button"));
    this.addGamepadComponent("b", new GamepadButton(this.joystick, 2, "Button"));
    this.addGamepadComponent("a", new GamepadButton(this.joystick, 1, "Button"));
    // this.addGamepadComponent("dpad", new GamepadPOV(this.joystick, 1, "POV"));

  }

  public void addGamepadComponent(String prefix, GamepadInputComponent<?> component) {
    this.joystickMap.put(prefix + component.getComponentName(), component);
  }

  public InputContainer<HashMap<String, InputContainer<?>>> getValue() {
    HashMap<String, InputContainer<?>> inputValueMap = new HashMap<String, InputContainer<?>>();
    for (Map.Entry<String, GamepadInputComponent<?>> entry: this.joystickMap.entrySet()) {
      inputValueMap.put(entry.getKey(), entry.getValue().getValue());
    }
    return new SimpleInputContainer<HashMap<String,InputContainer<?>>>(inputValueMap);
  }

  public HashMap<String, GamepadInputComponent<?>> getDeviceMap() {
    HashMap<String, GamepadInputComponent<?>> namedMap = new HashMap<String, GamepadInputComponent<?>>();
    for (Map.Entry<String, GamepadInputComponent<?>> entry: this.joystickMap.entrySet()) {
      namedMap.put(this.name + StringUtils.capitalize(entry.getKey()), entry.getValue());
    }
    return namedMap;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof GamepadInput)) {
      return false;
    }
    GamepadInput otherValue = (GamepadInput) other;
    return (this.joystickMap.equals(otherValue.joystickMap)
      && this.joystick.equals(otherValue.joystick) 
      && this.name.equals(otherValue.name));
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      this.name,
      this.joystick,
      this.joystickMap
    );
  }

}

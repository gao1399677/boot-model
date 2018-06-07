package com.spring.boot.command.head.first;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RemoteControlTest {

    @Test
    public void basicCommandPattern() {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Command command = new LightOnCommand(light);
        remoteControl.setCommand(command);
        remoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        command = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(command);
        remoteControl.buttonWasPressed();
    }

    @Test
    public void macroCommandPatter() {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);


        Command[] partyOn = { lightOnCommand, garageDoorOpenCommand};
        MacroCommand macroCommand = new MacroCommand(partyOn);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(macroCommand);

        remoteControl.buttonWasPressed();
    }
}
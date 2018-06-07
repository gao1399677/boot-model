package com.spring.boot.command.head.first;

public class RemoteControl {
    MacroCommand macroCommand;

    public RemoteControl() {
    }

    public void setCommand(MacroCommand macroCommand) {
        this.macroCommand = macroCommand;
    }

    public void buttonWasPressed() {
        macroCommand.execute();
    }
}
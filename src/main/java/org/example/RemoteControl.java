package org.example;

public class RemoteControl {
    private Command onCommand;
    private Command offCommand;
    private Command setHotCommand;
    private Command setColdCommand;

    public void setSetHotCommand(Command setHotCommand) {
        this.setHotCommand = setHotCommand;
    }

    public void setSetColdCommand(Command setColdCommand) {
        this.setColdCommand = setColdCommand;
    }

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }
    public void pressOnButton() {
        onCommand.execute();
    }

    public void pressOffButton() {
        offCommand.execute();
    }
    public void pressHotButton() {
        setHotCommand.execute();
    }

    public void pressColdButton() {
        setColdCommand.execute();
    }
}

package org.example;

public class ACOffCommand implements Command{
    private  AC ac;

    public ACOffCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        AC.turnOff();


    }

}

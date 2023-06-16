package org.example;

public class SetToHeat implements Command {
    private  AC ac;

    public SetToHeat(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        AC.setToHot();

    }
}

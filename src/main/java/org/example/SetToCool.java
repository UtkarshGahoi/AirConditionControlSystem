package org.example;

public class SetToCool implements Command {
    private  AC ac;

    public SetToCool(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
            ac.setToCool(16);
    }
}

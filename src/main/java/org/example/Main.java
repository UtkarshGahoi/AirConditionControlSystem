package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        AC ac=new AC();
        Command tvOnCommand = new ACOnCommand(ac);
        Command tvOffCommand = new ACOffCommand(ac);
        remoteControl.setOnCommand(tvOnCommand);
        remoteControl.setOffCommand(tvOffCommand);

        Command hotCommand = new SetToHeat(ac);
        Command coldCommand = new SetToCool(ac);


        remoteControl.pressOnButton();
      //  remoteControl.pressOffButton();


        remoteControl.setSetHotCommand(hotCommand);
        remoteControl.setSetColdCommand(coldCommand);
      //  remoteControl.pressHotButton();
        remoteControl.pressColdButton();
          remoteControl.pressOffButton();
      //  System.out.println("the cureent state is"+ac.state);
    }
}
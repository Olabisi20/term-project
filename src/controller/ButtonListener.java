package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainWindow;

public class ButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
       // if (ae.getSource() == MainWindow.startGame) {
         //   Main.gameData.add(20);
           // Main.gameData.addUFO();
           // Main.gameData.addDragon();
      //  }else if (ae.getSource()== MainWindow.addUfoButton){
        //    Main.gameData.addUFO();
       // } else
        if (ae.getSource() == MainWindow.quitButton) {
            if (Main.animator.running) {
                Main.animator.running = false;
            } else {
                System.exit(0);
            }
        }
    }

}

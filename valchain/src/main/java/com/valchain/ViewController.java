package com.valchain;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;

@FXMLController
public class ViewController {
    
    public void showFirstView(Event event) {
        ValMain.showView(FirstView.class);
    }

    public void showSecondView(Event event) {
        ValMain.showView(SecondView.class);
    }
}

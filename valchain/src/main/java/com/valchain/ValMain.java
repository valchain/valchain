package com.valchain;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValMain extends AbstractJavaFxApplicationSupport{

    public static void main(String[] args) {
        launchApp(ValMain.class, FirstView.class, args);
    }
}

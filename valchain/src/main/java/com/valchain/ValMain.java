package com.valchain;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;

@SpringBootApplication
public class ValMain extends AbstractJavaFxApplicationSupport{

    public static void main(String[] args) {
        launchApp(ValMain.class, FirstView.class, args);
    }
}

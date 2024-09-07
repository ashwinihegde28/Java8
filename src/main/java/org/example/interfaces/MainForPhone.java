package org.example.interfaces;

public class MainForPhone {

    public static void main(String[] args) {
        SmartPhone iphone = new Iphone() ;
        iphone.appStore();
        iphone.browse();
        iphone.calculate();
        iphone.call();
        iphone.playMusic();
        iphone.takePicture();
    }
}

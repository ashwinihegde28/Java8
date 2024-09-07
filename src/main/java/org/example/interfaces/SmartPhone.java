package org.example.interfaces;

public abstract class SmartPhone implements Calculator, ComputerFeature ,Camera,Telephone, MusicPlayer{

    @Override
    public void calculate() {
        System.out.println("Caculator feature : Calculating 1234..... \n");
    }

    @Override
    public void takePicture() {
        System.out.println("Camera feature : Say Cheese, Picture clicked and Quality is " + DEFAULT_PICTURE_QUALITY + "\n");
    }

    @Override
    public void browse() {
        System.out.println("Using Browse feature : Googling .... \n");
    }

    @Override
    public void playMusic() {
        System.out.println("Using Music Player : Playing Music \n");
    }

    @Override
    public void call() {
        System.out.println("Telephone Feature : Trin trin!!!  hellooooooooooo \n");
    }

    public abstract void appStore();
}

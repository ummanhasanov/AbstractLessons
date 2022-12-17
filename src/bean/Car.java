/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Umman Hasan
 */
public abstract class Car
{

    public abstract void start(); //abstract method

    public abstract void stop(); //abstract method

    public abstract void speedUp(); //abstract method

    public void startAndSpeedUp() {// concrete method
        start();
        speedUp();
    }
}

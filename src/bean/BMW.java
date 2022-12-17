/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Umman Hasan
 */
public class BMW extends Car
{

    public class A
    {// inner class => daxili class, BMW classinin ixindeki Obyekte aid class

    }

    public static class A1
    {// nested class => daxili class, BMW classina aid class-dir

    }

    @Override
    public void start() {
        System.out.println("BMW start");
    }

    @Override
    public void stop() {
        System.out.println("BMW stop");
    }

    @Override
    public void speedUp() {
        System.out.println("BMW speed up");
    }
}

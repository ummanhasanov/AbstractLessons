/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Umman Hasan
 */
public class Mercedes extends Car
{

    @Override
    public void start() {
        System.out.println("Mercedes start");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes stop");
    }

    @Override
    public void speedUp() {
        System.out.println("Mercedes speed up");
    }
}

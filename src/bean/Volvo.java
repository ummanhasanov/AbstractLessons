/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Umman Hasan
 */
public class Volvo extends Car// implement override
{

    @Override
    public void start() {
        System.out.println("Volvo start");
    }

    @Override
    public void stop() {
        System.out.println("Volvo stop");
    }

    @Override
    public void speedUp() {
        System.out.println("Volvo speed up");
    }

}

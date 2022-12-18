/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacelesson;

import bean.BMW;
import bean.Car;
import bean.Kia;
import bean.Startable;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {// extends => strict, restrict     implements(interface)=> daha bosdur , daha flexi ble
//        BMW b = new BMW();
        Car b = new BMW();// 
        Startable s = (Startable) b;// BMW startable cast olundu, downcasting
        
       Kia kk = (Kia) b;// extends compile safety,     interface runtime safety
        
        Startable k = new Kia();
        Startable[] startables = {k};
        startAllCars(startables);
    }

    public static void startAllCars(Startable[] cars) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].start();
        }
    }
}

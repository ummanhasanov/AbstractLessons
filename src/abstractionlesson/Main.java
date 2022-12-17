/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractionlesson;

import bean.BMW;
import bean.Car;
import bean.Volvo;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car bmw = new BMW();
        bmw.start();
        Car v = new Volvo();

        Car[] cars = {v};
        startAllCars(cars);

        v.startAndSpeedUp();
    }

    public static void startAllCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].start();
        }
    }

}

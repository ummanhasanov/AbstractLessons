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

        // inner classa aid misal asagi
        BMW b = new BMW();
        b.speedUp();
        BMW.A a2 = b.new A(); //eynidir asagidaki ile ve obyekte aiddir
        BMW.A a = new BMW().new A(); //eynidir yuxaridaki ile ve obyekte aiddir
        // inner classa aid misal yuxari

        // nested classa aid misal asagi
        BMW.A1 a1 = new BMW.A1();// classa aiddir
        // nested classa aid misal yuxari

        Car bmw = new BMW();
        System.out.println(bmw.getClass().getName());// bean.BMW class name
        bmw.start();
        Car v = new Volvo();

        Car[] cars = {v};
        startAllCars(cars);

        v.startAndSpeedUp();
        class Main$1 extends Car
        {

            @Override
            public void start() {
                System.out.println("start");
            }

            @Override
            public void stop() {
                System.out.println("stop");

            }

            @Override
            public void speedUp() {
                System.out.println("speed up");

            }
        }
        Car c = new Main$1(); // OOP ye gore abstract Car class-in JVM ucun bir classini
        //yaradir Main$1 ve her yaranan obyekte gore artir Main$2 ve s
       
        System.out.println(c.getClass().getName()); // Main$1 class name ve bu class-a anonymous class deyilir

        c = new Car()
        {
            @Override
            public void start() {
            }

            @Override
            public void stop() {
            }

            @Override
            public void speedUp() {
            }
        };
        System.out.println(c.getClass().getName());// Main$2 class name ve bu class-a anonymous class deyilir

        c = new Car()
        {
            @Override
            public void start() {
            }

            @Override
            public void stop() {
            }

            @Override
            public void speedUp() {
            }
        };
        System.out.println(c.getClass().getName());// Main$3 class name ve bu class-a anonymous class deyilir

        c = new Car()
        {
            @Override
            public void start() {
            }

            @Override
            public void stop() {
            }

            @Override
            public void speedUp() {
            }
        };
        System.out.println(c.getClass().getName());// Main$4 class name ve bu class-a anonymous class deyilir
    }

    public static void startAllCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].start();
        }
    }

}

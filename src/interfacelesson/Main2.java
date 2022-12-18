/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacelesson;

import bean.BMW;
import bean.Kia;
import bean.Startable;

/**
 *
 * @author Umman Hasan
 */
public class Main2
{

    public static void main(String[] args) {
//        Object ob = new BMW();
        BMW ob = new BMW();// BMW bir Car-dir
//        Kia k = (Kia) ob; // Kia bir BMW deyil , extend halinda tipin yoxlanmasi daha deqiqdir,
        //interface de ise deqiq deyil

        Startable s = (Startable) ob;// BMW startable deyil, amma BMW-den extend 
        //eden bir class olsa o startable ola biler

    }
}

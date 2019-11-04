/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan11841720209Abdulloh;

/**
 *
 * @author Abror
 */
public class Owner1841720209Abdulloh {

    public void pay(IPayable1841720209Abdulloh p) {
        System.out.println("Total payment = " + p.getIPaymentAmountAbdulloh());
        if (p instanceof ElectricityBill1841720209Abdulloh) {
            ElectricityBill1841720209Abdulloh eb = (ElectricityBill1841720209Abdulloh) p;
            System.out.println("" + eb.getBillInfoAbdulloh());
        } else if (p instanceof PermanentEmployee1841720209Abdulloh) {
            PermanentEmployee1841720209Abdulloh pe = (PermanentEmployee1841720209Abdulloh) p;
            pe.getEmployeeInfoAbdulloh();
            System.out.println("" + pe.getEmployeeInfoAbdulloh());
        }
    }

    public void showMyEmployeeAbdulloh(Employee1841720209Abdulloh e) {
        System.out.println("" + e.getEmployeeInfoAbdulloh());
        if (e instanceof PermanentEmployee1841720209Abdulloh) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No neet to pay her/him :)");
        }
    }
}

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
public class Tester41841720209Abdulloh {

    public static void main(String[] args) {
        Owner1841720209Abdulloh ow = new Owner1841720209Abdulloh();
        ElectricityBill1841720209Abdulloh eBill = new ElectricityBill1841720209Abdulloh(5, "R-2");
        ow.pay(eBill);//pay for electricity bill
        System.out.println("-----------------------------------");

        PermanentEmployee1841720209Abdulloh pEmp = new PermanentEmployee1841720209Abdulloh("Dedik", 500);
        ow.pay(pEmp);//pay for permanent employee
        System.out.println("-----------------------------------");

        InternshipEmployee1841720209Abdulloh iEmp = new InternshipEmployee1841720209Abdulloh("Sunarto", 5);
        ow.showMyEmployeeAbdulloh(pEmp);//show permanent employee info
        System.out.println("------------------------------------");
        ow.showMyEmployeeAbdulloh(iEmp);//show intership employee info
    }
}

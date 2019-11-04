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
public class Tester31841720209Abdulloh {

    public static void main(String[] args) {
        PermanentEmployee1841720209Abdulloh pEmp = new PermanentEmployee1841720209Abdulloh("Dedik", 500);
        InternshipEmployee1841720209Abdulloh iEmp = new InternshipEmployee1841720209Abdulloh("Sunarto", 5);
        ElectricityBill1841720209Abdulloh eBill = new ElectricityBill1841720209Abdulloh(5, "A-1");
        Employee1841720209Abdulloh e[] = {pEmp, iEmp};
        IPayable1841720209Abdulloh p[] = {pEmp, eBill};
        Employee1841720209Abdulloh e2[] = {pEmp, iEmp, eBill};

    }
}

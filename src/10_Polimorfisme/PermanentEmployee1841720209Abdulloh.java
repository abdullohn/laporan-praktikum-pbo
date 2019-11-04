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
public class PermanentEmployee1841720209Abdulloh extends Employee1841720209Abdulloh implements IPayable1841720209Abdulloh {

    private int mSalary;

    public PermanentEmployee1841720209Abdulloh(String mName, int mSalary) {
        this.mName = mName;
        this.mSalary = mSalary;
    }

    public int getSalaryAbdulloh() {
        return mSalary;
    }

    public void setSalaryAbdulloh(int mSalary) {
        this.mSalary = mSalary;
    }

    @Override
    public String getEmployeeInfoAbdulloh() {
        String info = super.getEmployeeInfoAbdulloh() + "\n";
        info += "Registered as permanent employee with salary " + mSalary + "\n";
        return info;
    }

    @Override
    public int getIPaymentAmountAbdulloh() {
        {
            return (int) (mSalary + 0.5 * mSalary);
        }
    }
}

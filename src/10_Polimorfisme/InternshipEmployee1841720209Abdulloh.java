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
public class InternshipEmployee1841720209Abdulloh extends Employee1841720209Abdulloh {

    private int mLength;

    public InternshipEmployee1841720209Abdulloh(String mName, int mLength) {
        this.mLength = mLength;
        this.mName = mName;
    }

    public int getLengthAbdulloh() {
        return mLength;
    }

    public void setLengthAbdulloh(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public String getEmployeeInfoAbdulloh() {
        String info = super.getEmployeeInfoAbdulloh() + "\n";
        info += "Registered as internship employee for " + mLength + " month/s\n";
        return info;
    }
}

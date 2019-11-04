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
public class ElectricityBill1841720209Abdulloh implements IPayable1841720209Abdulloh {

    private int mKwh;
    private String mCategory;

    public ElectricityBill1841720209Abdulloh(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getKwhAbdulloh() {
        return mKwh;
    }

    public void setKwhAbdulloh(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getCategoryAbdulloh() {
        return mCategory;
    }

    public void setCategoryAbdulloh(String mCategory) {
        this.mCategory = mCategory;
    }

    public int getBasePriceAbdulloh() {
        int bPrice = 0;
        switch (mCategory) {
            case "R-1":
                bPrice = 100;
                break;

            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }

    public String getBillInfoAbdulloh() {
        return "kWH = " + mKwh + "\n"
                + "Category = " + mCategory + "(" + getBasePriceAbdulloh() + " per kWH)\n";
    }

    @Override
    public int getIPaymentAmountAbdulloh() {
        {
            return mKwh * getBasePriceAbdulloh();
        }
    }
}

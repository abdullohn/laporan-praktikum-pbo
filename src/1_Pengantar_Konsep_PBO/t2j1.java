/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class mobilmain {
	public static void main(String[] args) {
		Mobil myMobil = new Mobil();

		myMobil.setMerek("Toyota");
		myMobil.setTransmisi(6);
		myMobil.setTipe(2);

		System.out.println("Merek: " + myMobil.getMerek());
		System.out.println("Transmisi: " + myMobil.getTransmisi() + " gigi");
		System.out.println("Tipe: " + myMobil.getTipe());
	}
}

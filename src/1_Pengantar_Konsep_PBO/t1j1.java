/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
class Mobil {
	private String merek;
	private double transmisi;
	private int tipe;

	// Getter methods
	public String getMerek() {
		return merek;
	}
	public double getTransmisi() {
		return transmisi;
	}
	public int getTipe() {
		return tipe;
	}

	// Setter methods
	public void setMerek(String merek) {
		this.merek = merek;
	}
	public void setTransmisi(double transmisi) {
		this.transmisi = transmisi;
	}
	public void setTipe(int tipe) {
		this.tipe = tipe;
	}
}
package main;

import javax.swing.JOptionPane;

import controller.VezesapareceController;

public class Principal {

	public static void main(String[] args) {
		VezesapareceController va = new VezesapareceController();
		int num = Integer.parseInt(JOptionPane.showInputDialog("insira um número entre 10 e 999 mil"));
		while (num < 10 || num > 999999) {
			num = Integer.parseInt(JOptionPane.showInputDialog("insira um número entre 10 e 999 mil"));
		}
		int numa = Integer.parseInt(JOptionPane.showInputDialog("insira um número entre 0 e 9"));
		while (numa < 0 || numa > 9) {
			 numa = Integer.parseInt(JOptionPane.showInputDialog("insira um número entre 0 e 9"));
		}
		int cont = 0;
		int resultado = va.Aparece(num, numa, cont);
		System.out.println(resultado);
	}

}

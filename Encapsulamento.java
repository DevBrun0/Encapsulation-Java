package Encapsulamento;

import javax.swing.*;

public class Encapsulamento {
	
public static ControleRemoto c =  new ControleRemoto();

/*-------------------------------------MENU---------------------------------------------------*/
public static void Menu() {
	
	String perguntabesta = JOptionPane.showInputDialog( "Deseja ligar a televisão");
	
	switch(perguntabesta) {
	case "sim":
		System.out.println("*Ligando a televisão*\n");
		c.ligar();
		c.abrirMenu();
		OpcoesComando();
		break;
	case "nao":
		System.out.println( "*Saindo do local*");
		break;
	}
	
}
/*----------------------------------------------------------------------------------------------*/

public static void OpcoesComando() {
	
	
	String pergunta = JOptionPane.showInputDialog(null, "----------------------Oque deseja fazer?-------------------\n"
														+ "- Desligar\n"
														+ "- Mudo\n"
														+ "- Mais volume\n"
														+ "- Menos volume\n");
	
	switch (pergunta) {
	
	case "Desligar":
		System.out.println( "*Desligado a televisão*");
		c.desligar();
		break;
	
	case "Mudo":
		System.out.println( "\n*Alterando som para mudo*\n");
		c.ligarMudo();
		JOptionPane.showMessageDialog(null,"Voltando para as opções de comando");
		OpcoesComando();
		break;
		
	case "Mais volume":
		System.out.println( "\n*Aumentando o volume*\n");
		c.maisVolume();
		JOptionPane.showMessageDialog(null,"Voltando para as opções de comando");
		OpcoesComando();
		break;
		
	case "Menos volume":
		System.out.println( "\n*Diminuindo o volume*\n");
		c.menosVolume();
		JOptionPane.showMessageDialog(null,"Voltando para as opções de comando");
		OpcoesComando();
		break;
	}
	
}
	


	public static void main(String[] args) {
		Menu();
		
	}

}

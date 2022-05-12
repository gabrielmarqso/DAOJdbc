package controller;

import java.util.Scanner;

import model.db.Db;
import view.TelaPrincipal;

public class Program {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
		try {
			console = TelaPrincipal.menuPrincipal(console);
		}catch(Exception e){
			System.out.println("Erro: " + e);
			
		}finally {
			Db.fechaConexao();
		}
		
		
	}

}

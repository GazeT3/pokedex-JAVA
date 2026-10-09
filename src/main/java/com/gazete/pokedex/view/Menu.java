package com.gazete.pokedex.view;

import java.util.Scanner;

public class Menu {
    
    Scanner scanner = new Scanner(System.in);
    int menuOP=0;

    public int menuInicial(){
        
        System.out.println("============================");
        System.out.println("                            ");
        System.out.println("    Bem Vindo a Pokedex!    ");
        System.out.println("                            ");
        System.out.println("============================");
        System.out.println("                            ");
        System.out.println("  1 - Ver Coleção           ");
        System.out.println("  2 - Capturar Pokemon      ");
        System.out.println("      (Registrar)           ");
        System.out.println("  3 - Editar Pokemon        ");
        System.out.println("      Capturado             ");
        System.out.println("  4 - Libertar Pokemon      ");
        System.out.println("      (Excluir)             ");
        System.out.println("                            ");
        System.out.println("============================");
        System.out.println("(Insira apenas um número)");
        System.out.print("Qual opção é a sua escolha?: ");
            
        try {
            menuOP=scanner.nextInt();
        }catch (Exception e){
            System.out.println("Erro, Resposta Inválida");
        }
        return menuOP;
    }
}

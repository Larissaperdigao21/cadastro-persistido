package org.example;

import java.io.IOException;
import java.util.Scanner;

public class UsuarioUtil {

    public void abrirMenu() throws IOException {
        boolean visto = true;
        Scanner scanner = new Scanner(System.in);
        while(visto){
            System.out.println("CADASTRO PERSISTIDO");
            System.out.println("--------MENU-------");
            System.out.println("(1)PARA GRAVAR USUARIO");
            System.out.println("(2)PARA LER USUARIO(S)");
            System.out.println("(3)PARA SAIR");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();

            if(opcao !=3) {
                switch (opcao) {
                    case 1: {
                        UsuarioService usuarioService = new UsuarioService();
                        usuarioService.addUsers();
                        break;
                    }
                    case 2: {
                        UsuarioService usuarioService = new UsuarioService();
                        usuarioService.printUsers();
                        break;
                    }
                }
            }else{
                System.out.println("Saindo......");
                break;
            }
        }
    }
}

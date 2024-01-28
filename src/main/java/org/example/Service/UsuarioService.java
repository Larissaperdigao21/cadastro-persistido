package org.example.Service;

import org.example.Model.UsuarioModel;

import java.io.*;
import java.util.Scanner;

public class UsuarioService {
    public UsuarioService(){
    }
    public void printUsers(){

        try{
            FileReader fileReader;
            fileReader = new FileReader("arquivo.txt");
            BufferedReader bufferedReader;
            bufferedReader = new BufferedReader(fileReader);
            String linha = " ";
            while(linha != null){
                System.out.println(linha);
                linha = bufferedReader.readLine();
                System.out.println("------------------------------");
            }

        }catch (Exception e){
            System.out.println("ERRO.");
        }
    }

    public void addUsers() throws IOException {
        UsuarioModel usuarioModel = new UsuarioModel();
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter fileWriter = new FileWriter("arquivo.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            System.out.println("-----------------");
            System.out.println("Insira seu nome: ");
            usuarioModel.setNome(scanner.next());
            System.out.println("Agora me informe sua profissao: ");
            usuarioModel.setProfissao(scanner.next());
            System.out.println("Por fim sua idade: ");
            usuarioModel.setIdade(scanner.nextInt());

            printWriter.println(usuarioModel.toString());

            printWriter.flush();
            printWriter.close();
            System.out.println("Seu arquivo foi escrito com SUCESSO!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}


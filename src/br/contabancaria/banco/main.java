package br.contabancaria.banco;

import br.contabancaria.banco.*;
import java.util.Scanner;
import java.util.ArrayList;


public class main {
    private static br.contabancaria.banco.Usuario Usuario;

    public static void main(String[] args) {


        // Solicitar e validar e-mail
        String email = String.valueOf(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Cadastre seu e-mail: ");
            email = scanner.nextLine();
            if (Utils.validarEmail(email)) {
                break;
            }
            System.out.println("E-mail inválido! Tente novamente.");
        }

        // Solicitar e validar senha

        String confirmarSenha;
        String senha = String.valueOf(new ArrayList<>());
        while (true) {
            System.out.print("Cadastre sua senha: ");
            senha = scanner.nextLine();
            if (!Utils.validarSenha(senha)) {
                System.out.println("Senha inválida! Deve ter pelo menos 8 caracteres e incluir números e letras.");
                continue;
            }

            System.out.print("Confirme sua senha: ");
            confirmarSenha = scanner.nextLine();
            if (senha.equals(confirmarSenha)) {
                break;
            }
            System.out.println("As senhas não coincidem! Tente novamente.");
        }

        // Criar usuário e conta bancária
        Usuario usuario = new Usuario(email, senha);
        ContaBancaria conta = new ContaBancaria(usuario);

        System.out.println("\nConta criada com sucesso!\n");

        System.out.println("Para acessar sua conta, faça o login\n");

        while (true) {
            System.out.print("Digite seu e-mail: ");
            String emailLogin = scanner.nextLine();

            // Verifica se o e-mail digitado corresponde ao registrado
            if (emailLogin.equals(usuario.getEmail())) {
                break;
            } else {
                System.out.println("E-mail incorreto! Tente novamente.");
            }
        }

        while (true) {
            System.out.print("Digite sua senha: ");
            String senhaLogin = scanner.nextLine();

            // Verifica se a senha digitada corresponde à registrada
            if (senhaLogin.equals(Usuario.getSenha())) {
                System.out.println("\nLogin efetuado com sucesso!\n");

            } else {
                System.out.println("Senha incorreta! Tente novamente.");
            }

            while (true){
                if (senhaLogin.equals(Usuario.getSenha()) == true){

                    ContaBancaria contaBancaria = new ContaBancaria(Usuario);
                    System.out.println("Qual valor deseja depositar? ");
                    double depositar = scanner.nextDouble();
                    System.out.println("Seu saldo agora é: " + depositar);
                    break;

                }
            }

        }

    }

}


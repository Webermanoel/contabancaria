package br.contabancaria.banco;

public class Usuario {
    private String email;
    private static String senha;

    // Construtor
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    // Getters
    public String getEmail() {
        return email;
    }

    public static String getSenha(){
        return senha;
    }

    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }
}


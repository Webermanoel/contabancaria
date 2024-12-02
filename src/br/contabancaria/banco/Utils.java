package br.contabancaria.banco;

import java.util.regex.*;

public class Utils {

    // Valida o e-mail usando regex
    public static boolean validarEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Valida a senha (mínimo 8 caracteres, letras e números)
    public static boolean validarSenha(String senha) {
        return senha.matches("^(?=.*[0-9])(?=.*[a-zA-Z]).{8,}$");
    }

}

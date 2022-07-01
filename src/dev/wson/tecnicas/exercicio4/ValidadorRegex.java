package dev.wson.tecnicas.exercicio4;

import java.util.regex.Pattern;

public class ValidadorRegex {
    private final String REGEX_NOME_COMPLETO = "^[A-Z]{1}[a-z]+[\\s[A-Z][a-z]+]+$";
    private final String REGEX_TELEFONE = "^\\(\\d{2}\\)\\s\\d{4,5}-\\d{4}$";
    private final String REGEX_EMAIL = "^\\p{L}{2,}@\\p{L}{2,}.\\p{L}{3}[.\\p{L}{2}]*$";
    private final String REGEX_CPF = "^\\d{3}.\\d{3}.\\d{3}-\\d{2}$";
    private final String REGEX_CNPJ = "^\\d{2}.\\d{3}.\\d{3}/\\d{4}.\\d{2}$";
    private final String REGEX_DATA = "^\\d{1,2}/\\d{1,2}/\\d{4}$";
    
    public boolean validarNomeCompleto(String nome) {
        return Pattern.matches(REGEX_NOME_COMPLETO, nome);
    }
    public boolean validarTelefone(String telefone) {
        return Pattern.matches(REGEX_TELEFONE, telefone);
    }
    public boolean validarEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }
    public boolean validarCpf(String cpf) {
        return Pattern.matches(REGEX_CPF, cpf);
    }
    public boolean validarCnpj(String cnpj) {
        return Pattern.matches(REGEX_CNPJ, cnpj);
    }
    public boolean validarData(String data) {
        return Pattern.matches(REGEX_DATA, data);
    }    
}
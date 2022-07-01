package dev.wson.tecnicas.exercicio4;

import java.util.List;
import java.util.stream.Collectors;

public class Exercicio4 {
    private List<String> nomesCompletos;
    private List<String> enderecosDeEmail;
    private List<String> telefones;
    private List<String> numerosDeCpf;
    private List<String> numerosDeCnpj;
    private List<String> datas;
    private final ValidadorRegex validador;
    
    public Exercicio4() {
        validador = new ValidadorRegex();
    }
    public void iniciar() {
        System.out.println("------ Técnicas de Programação: Exercício 4 ------");
        iniciarAmostras();
        validarNomes();
        validarEnderecosDeEmail();
        validarTelefones();
        validarNumerosDeCpf();
        validarNumerosDeCnpj();
        validarDatas();
        System.out.println("------");
    }
    private void validarDatas() {
        System.out.println("Validação das datas:");
        datas.stream()
                .collect(Collectors.toMap(
                        data -> data,
                        data -> validador.validarData(data) ? "VÁLIDO" : "INVÁLIDO"
                ))
                .forEach((k, v) -> System.out.println(k + " -> " + v));
    }
    private void validarNumerosDeCnpj() {
        System.out.println("Validação dos números de CNPJ:");
        numerosDeCnpj.stream()
                .collect(Collectors.toMap(
                        cnpj -> cnpj,
                        cnpj -> validador.validarCnpj(cnpj) ? "VÁLIDO" : "INVÁLIDO"
                ))
                .forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println("----");
    }
    private void validarNumerosDeCpf() {
        System.out.println("Validação dos números de CPF:");
        numerosDeCpf.stream()
                .collect(Collectors.toMap(
                        cpf -> cpf,
                        cpf -> validador.validarCpf(cpf) ? "VÁLIDO" : "INVÁLIDO"
                ))
                .forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println("----");
    }
    private void validarTelefones() {
        System.out.println("Validação dos números de telefone:");
        telefones.stream()
                .collect(Collectors.toMap(
                        telefone -> telefone,
                        telefone -> validador.validarTelefone(telefone) ? "VÁLIDO" : "INVÁLIDO"
                ))
                .forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println("----");
    }
    private void validarEnderecosDeEmail() {
        System.out.println("Validação dos endereços de e-mail:");
        enderecosDeEmail.stream()
                .collect(Collectors.toMap(
                        email -> email,
                        email -> validador.validarEmail(email) ? "VÁLIDO" : "INVÁLIDO"
                ))
                .forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println("----");
    }
    private void validarNomes() {
        System.out.println("Validação dos nomes:");
        nomesCompletos.stream()
                .collect(Collectors.toMap(
                        nome -> nome,
                        nome -> validador.validarNomeCompleto(nome) ? "VÁLIDO" : "INVÁLIDO"
                ))
                .forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println("----");
    }
    private void iniciarAmostras() {
        nomesCompletos = List.of(
                "Wanderson Sousa Alves",
                "2João Carlos Silva",
                "M@ria Rita Chaves!",
                "Liana Cordova Silva",
                "_Thiago Melo Brito",
                "Juliana Dias Machado",
                "Tatiana Brito-Maia",
                "Karla Bianca5Telles"
        );
        telefones = List.of(
                "(99) 99100-2233",
                "88 8200-4015",
                "81239000",
                "(98) 3524-2560",
                "1125670089",
                "(62) 94567-9009"
        );
        enderecosDeEmail = List.of(
                "wsonalves@hotmail.com",
                "Juliana_Oliveira@mail.com",
                "usMarket@dev.stz",
                "reitoria@ifma.edu.br",
                "234bets_@@jogos.net",
                "faleconosco@letscode.com"
        );
        numerosDeCpf = List.of(
                "021.345.789-33",
                "120.345-450.12",
                "20.100.230-5",
                "200.400.600-20",
                "890230900-66",
                "12390055584"
        );
        numerosDeCnpj = List.of(
                "00.000.001/1002-20",
                "20.300.60/123-50",
                "12098345/0350-18",
                "30.300.004/5000-60",
                "6.200.400/4004-40",
                "90.888.454-200/55"
        );
        datas = List.of(
                "01/03/2000",
                "27-11-1990",
                "2/10/95",
                "10/05/2008",
                "15_08_1985",
                "20/04/2015"
        );
    }
}
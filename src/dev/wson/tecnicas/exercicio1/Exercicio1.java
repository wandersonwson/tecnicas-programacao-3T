package dev.wson.tecnicas.exercicio1;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercicio1 {
    public void iniciar(){
        System.out.println("------ Técnicas de Programação: Exercício 1 ------");
        //Tempo decorrido entre duas datas
        LocalDate dataNascimento = LocalDate.of(1993, 5, 27);
        Period periodo = Period.between(dataNascimento, LocalDate.now());
        System.out.printf("Meu tempo de vida: %d anos, %d meses e %d dias.%n", periodo.getYears(), periodo.getMonths(), periodo.getDays());
        //Questão 7
        OffsetDateTime data1 = OffsetDateTime.parse("2022-03-13T19:01:45.768149722-03:00");
        System.out.println("Data 1: " + data1);
        System.out.println("Data 1: " + data1.withOffsetSameLocal(ZoneOffset.ofHours(5)));
        //Questão 8
        OffsetDateTime data2 = OffsetDateTime.of(2022, 3, 13, 19, 1, 45, 768149722, ZoneOffset.ofHoursMinutes(-3, 0));
        System.out.println("Data 2: " + data2);
        OffsetDateTime data3 = OffsetDateTime.of(2022, 3, 13, 19, 1, 45, 768149722, ZoneOffset.ofHoursMinutes(3, 0));
        System.out.println("Data 3: " + data3);
        System.out.println("Diferença: " + data2.until(data3, ChronoUnit.HOURS));
        //Questão 9
        ZonedDateTime data4 = ZonedDateTime.parse("2022-03-13T20:17:43.936594508Z[Europe/London]");
        System.out.println("Data 4: " + data4);
        //Questão 10
        ZonedDateTime data5 = ZonedDateTime.parse("2022-03-13T20:27:32.414122038-03:00[America/Sao_Paulo]");
        System.out.println("Data 5: " + data5.format(DateTimeFormatter.ofPattern("EEEE, dd/L/Y - HH:mm:ss VV")));
        System.out.println("------");
    }
}
package dev.wson.tecnicas.exercicio3;

import java.time.LocalDate;

public record Order(Long amount, Currency currency, LocalDate date) {}
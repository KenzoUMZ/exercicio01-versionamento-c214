package com.kenzoumz.inatel.br.model;
import lombok.Data;

@Data
public class Game {

    // Atributos dos objetos que se quer realizar a leitura
    private int rank;
    private String name;
    private String year;
    private String platform;
    private String publisher;
    private String global_sales;

}

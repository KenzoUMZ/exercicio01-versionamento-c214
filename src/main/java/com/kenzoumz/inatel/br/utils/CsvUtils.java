package com.kenzoumz.inatel.br.utils;

import com.kenzoumz.inatel.br.model.Game;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

// Classe para ler o arquivo .csv a partir do endereço do arquivo dado
public class CsvUtils {

    //Metodo para retornar uma lista com os objetos de jogos contidos no arquivo
    public static List<Game> readGameCsv(Path csvFilePath){

        List<Game> listaJogos = new ArrayList<>();

        try{
            Reader reader = Files.newBufferedReader(csvFilePath);
            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader).
                    withType(Game.class).
                    withIgnoreLeadingWhiteSpace(true).
                    build();
            listaJogos = csvToBean.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaJogos;
    }
}

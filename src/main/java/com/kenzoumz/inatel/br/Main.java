package com.kenzoumz.inatel.br;


import com.kenzoumz.inatel.br.model.Game;
import com.kenzoumz.inatel.br.utils.CsvUtils;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Path caminho = null;

        try {
            caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        List<Game> gameList = CsvUtils.readGameCsv(caminho);

        // Mostrando objetos encontrados no arquivo
        for (Game g:
             gameList) {
            System.out.println(g);
        }

    }
}

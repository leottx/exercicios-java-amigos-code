package com.leonardotx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ExtractorAndReport {
    public abstract Pattern getPattern();
    public abstract String getReportName();

    /*
        Esse método é responsável encontrar o arquivo no caminho passado como argumento e extrair os dados pertinentes.
        Obs: Se não for encontrado o arquivo, será lançada uma exceção do tipo FileNotFoundException.
    */
    public String parse(String path) throws FileNotFoundException {
        String out = "";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        /*
            Verifica se o arquivo contém linhas. Caso sim, pula a primeira linha que contém o cabeçalho do arquivo,
            senão retorna uma String dizendo que o arquivo é vazio.
        */

        if (scanner.hasNext()) {
            scanner.nextLine();
        } else {
            return "Empty file";
        }

        /*
            Percorre cada linha do arquivo checando se o conteúdo da linha atual corresponde ao padrão regex
            retornado pela função getPattern(). Caso corresponda, a linha atual é concatenada com o valor da
            variável out.
        */
        while(scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);

            boolean matches = matcher.matches();

            if (matches) {
                out += nextLine + "\n";
            }
        }

        /*
            Se nenhuma linha correspondeu ao padrão regex, será retornado uma String dizendo que o arquivo é
            vazio, senão será retornado o valor contido na variável out.
         */
        return out.isBlank() ? "Empty file" : out;
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.println("Starting report " + getReportName() + " ...");
        System.out.println(parse(path));
        System.out.println("End report " + getReportName());
    }
}

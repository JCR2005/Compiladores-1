package com.compiladores_1.notebookmovil.Backend;

public class AnalisisMArcado {


    public Double anailisHeader(String header){

        System.out.println(header+"dkjdhsghiudg");
        if (header.startsWith("######")){
            return 60.00;
        }else if (header.startsWith("#####")){
            return 450.00;
        }else if (header.startsWith("####")){
            return 35.00;
        }else if (header.startsWith("###")){
            return 25.00;
        }else if (header.startsWith("##")){
            return 16.00;
        }else if (header.startsWith("·")){
            return 10.00;
        }
        return 0.00;
    }

    public double formato(String format){

        System.out.println(format+"dkjdhsghiudg");
        if (format.startsWith("***")){
            return 3.0;
        }else if (format.startsWith("**")){
            return 2.0;
        }else if (format.startsWith("*")){
            return 1.0;
        }
        return 0.0;
    }

    public String[] lista(String listaCaadena){

        String lista[] = listaCaadena.split("(?=\\+)");

        for (String elemento : lista) {
            System.out.println(elemento + "\n");
        }

        return lista;
    }
    public String[] listaNumerica(String listaCaadena) {
        String lista[] = listaCaadena.split("(?=\\d+\\.)");

        for (int i = 1; i < lista.length; i++) {
            String actual = lista[i].trim();
            int j = i - 1;

            int numActual = Integer.parseInt(actual.split("\\.", 2)[0].trim());

            while (j >= 0 && Integer.parseInt(lista[j].split("\\.", 2)[0].trim()) > numActual) {
                lista[j + 1] = lista[j];
                j--;
            }

            lista[j + 1] = actual;
        }

        return lista;
    }
}

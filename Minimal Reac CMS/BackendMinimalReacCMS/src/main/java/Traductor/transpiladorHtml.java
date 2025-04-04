package Traductor;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author carlos
 */
public class transpiladorHtml {

     ArrayList<String> instruccionesHTML = new ArrayList<>();
     ArrayList<String> instruccionesJavaScript = new ArrayList<>();
     ArrayList<String> instruccionesdeActualizacion = new ArrayList<>();

     int cont1 = 0;

    public String getCodigoTransiladoJavaScript() {

        String javaScript = funcionActualizar() + "\n";
        for (int i = 0; i < instruccionesJavaScript.size(); i++) {
            javaScript += instruccionesJavaScript.get(i) + "\n";

        }

        return javaScript;

    }

    public String getCodigoTransiladoHtml() {
        String html = "";
        for (int i = 0; i < instruccionesHTML.size(); i++) {
            html += instruccionesHTML.get(i) + "\n";

        }
        return html;

    }

    public void trampilar(ArrayList<Integer> tipo, ArrayList<String> instrucciones) {
        
        

        for (int i = 0; i < tipo.size(); i++) {

            int opcion = tipo.get(i);

            switch (opcion) {
                case 1 ->
                    transpiladoEncabezadoHtml(instrucciones.get(i));
                case 2 ->
                    transpiladoParrafo(instrucciones.get(i));
                case 3 ->
                    transpiladoBoton(instrucciones.get(i));
                case 4 ->
                    transpiladoImput(instrucciones.get(i));
                case 5 ->
                    transpiladoCreacionVariable(instrucciones.get(i));
                case 6 ->
                    transpiladoSinCabios(instrucciones.get(i));
                case 7 ->
                    transpiladoSinCabios(instrucciones.get(i));
                case 8 ->
                    transpiladoFuncion(instrucciones.get(i));
                case 9 ->
                    transpiladoSinCabios(instrucciones.get(i));
                case 10 ->
                    transpiladoSinCabios(instrucciones.get(i));
                case 11 ->
                    transpiladoSinCabios(instrucciones.get(i));
                case 12 ->
                    transpiladoSinCabios(instrucciones.get(i));
                case 0 ->
                    transpiladoSinCabios(instrucciones.get(i));
                default ->
                    throw new AssertionError();
            }

        }

        for (int i = 0; i < instruccionesHTML.size(); i++) {
            System.out.println(instruccionesHTML.get(i));

        }

        for (int i = 0; i < instruccionesJavaScript.size(); i++) {
            System.out.println(instruccionesJavaScript.get(i));

        }

    }

    public  void main(String[] args) {
        transpiladoEncabezadoHtml(" < h1 > { variable } \"Hola mi nombre es\" { variable } \" mi  es\" </ h1 >");
        transpiladoParrafo(" < p > { variable } \"Hola mi nombre es\" { variable } \" mi  es\" </ p >");
        transpiladoBoton("< button onClick = { condicion ( 5 ) ; } > \"Sumar\" </ button >");
        transpiladoImput("< input value = { variable } />");
        transpiladoCreacionVariable(" var variable : number = 10 ;");
        transpiladoFuncion(" function condicion (variable:number) : number {");
        transpiladoSinCabios("   if(variable>5){");
    }

    public  void transpiladoEncabezadoHtml(String instruccion) {

        String intrucion_html = "";
        String id = " id=\"id" + cont1 + "\"";
        String js = "document.getElementById(\"id" + cont1 + "\").innerHTML = `";

        instruccion = instruccion.replace("\"", "");
        instruccion = instruccion.replaceAll("<\\s*h", "<h")
                .replaceAll("</\\s*h", "</h")
                .replaceAll("\\s*>", ">");

        intrucion_html = instruccion;

        if (instruccion.contains("{") | instruccion.contains("}")) {
            String regex = ">([^<]+)<";
            String texto = "";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(instruccion);
            if (matcher.find()) {
                texto = matcher.group();
                texto = texto.replace(">", "");
                texto = texto.replace("<", "");
                instruccion = instruccion.replace(texto, "");
                texto = texto.replace("{", "${");

            }
            String[] partes = instruccion.split(">", 2);
            intrucion_html = partes[0] + id + ">" + partes[1];
            js += texto + "`;";
            cont1++;
            instruccionesJavaScript.add(js);

            instruccionesdeActualizacion.add(js);
        }
        instruccionesHTML.add(intrucion_html);
    }

    public  void transpiladoParrafo(String instruccion) {

        String intrucion_html = "";
        String id = " id=\"id" + cont1 + "\"";
        String js = "document.getElementById(\"id" + cont1 + "\").innerHTML = `";

        instruccion = instruccion.replace("\"", "");
        instruccion = instruccion.replaceAll("<\\s*p", "<p")
                .replaceAll("</\\s*p", "</p")
                .replaceAll("\\s*>", ">");

        intrucion_html = instruccion;

        if (instruccion.contains("{") | instruccion.contains("}")) {
            String regex = ">([^<]+)<";
            String texto = "";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(instruccion);

            if (matcher.find()) {
                texto = matcher.group();
                texto = texto.replace(">", "");
                texto = texto.replace("<", "");
                instruccion = instruccion.replace(texto, "");

                texto = texto.replace("{", "${");
            }
            String[] partes = instruccion.split(">", 2);
            intrucion_html = partes[0] + id + ">" + partes[1];
            js += texto + "`;";
            cont1++;
            instruccionesJavaScript.add(js);
            instruccionesdeActualizacion.add(js);
        }
        instruccionesHTML.add(intrucion_html);
    }

    public  void transpiladoBoton(String instruccion) {

        String intrucion_html = "";
        String id = " id=\"id" + cont1 + "\"";
        String js = "document.getElementById(\"id" + cont1 + "\").addEventListener(\"click\", function() {";

        instruccion = instruccion.replace("\"", "");
        instruccion = instruccion.replace(";", "");
        instruccion = instruccion.replaceAll("<\\s*button", "<button")
                .replaceAll("</\\s*button", "</button")
                .replaceAll("\\s*>", ">");

        intrucion_html = instruccion;

        if (instruccion.contains("{") | instruccion.contains("}")) {
            String regex2 = "<button([^>]+)>";
            String regex = "\\{([^\\}]+)\\}";
            String texto = "";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(instruccion);

            Pattern pattern2 = Pattern.compile(regex2);
            Matcher matcher2 = pattern2.matcher(instruccion);

            if (matcher2.find()) {
                instruccion = instruccion.replace(matcher2.group(), "");

            }
            if (matcher.find()) {
                texto = matcher.group();

                texto = texto.replace("{", "");
                texto = texto.replace("}", "");

            }
            instruccion = "<button>" + instruccion;
            String[] partes = instruccion.split(">", 2);
            intrucion_html = partes[0] + id + ">" + partes[1];
            js += texto + ";  actulizar(); });";
            cont1++;
            instruccionesJavaScript.add(js);

        }
        instruccionesHTML.add(intrucion_html);

    }

    public  void transpiladoImput(String instruccion) {

        String intrucion_html = "";
        String id = " id=\"id" + cont1 + "\"";
        String js = "document.getElementById(\"id" + cont1 + "\").value =";

        instruccion = instruccion.replaceAll("<\\s*input", "<input");
        intrucion_html = instruccion;

        if (instruccion.contains("{") | instruccion.contains("}")) {
            String regex2 = "value\\s+([^}]*)\\}";

            String regex = "\\{([^\\}]+)\\}";
            String texto = "";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(instruccion);

            Pattern pattern2 = Pattern.compile(regex2);
            Matcher matcher2 = pattern2.matcher(instruccion);

            if (matcher2.find()) {
                instruccion = instruccion.replace(matcher2.group(), "");

            }
            if (matcher.find()) {
                texto = matcher.group();

                texto = texto.replace("{", "");
                texto = texto.replace("}", "");

            }
            String[] partes = instruccion.split("/", 2);
            intrucion_html = partes[0] + id + "/" + partes[1];
            js += texto + ";";
            cont1++;
            instruccionesJavaScript.add(js);

            instruccionesdeActualizacion.add(js);
        }
        instruccionesHTML.add(intrucion_html);
    }

    public  String funcionActualizar() {
        String Funciona = "function actulizar () {\n";

        for (int i = 0; i < instruccionesdeActualizacion.size(); i++) {
            Funciona += "     " + instruccionesdeActualizacion.get(i) + "\n";
        }

        Funciona += "}";

        return Funciona;
    }

    public  void transpiladoCreacionVariable(String instruccion) {
        String js = "";
        String regex = ":\\s([^=]+)=";
        String texto = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(instruccion);
        if (matcher.find()) {
            texto = matcher.group();
            js = instruccion.replace(texto, "=");
        }

        instruccionesJavaScript.add(js);
    }

    public  void transpiladoFuncion(String instruccion) {

        String regex = ":\\s([^\\{]+)\\{";
        String regex2 = ":\\s*([^\\)]+)\\)";
        String texto = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(instruccion);
        if (matcher.find()) {
            texto = matcher.group();
            instruccion = instruccion.replace(texto, "{");
        }

        pattern = Pattern.compile(regex2);
        matcher = pattern.matcher(instruccion);

        if (matcher.find()) {
            texto = matcher.group();
            transpiladoImput(matcher.group());
            instruccion = instruccion.replace(texto, ")");
        }
        instruccionesJavaScript.add(instruccion);
        System.out.println(instruccion);
    }

    public  void transpiladoSinCabios(String instruccion) {

        instruccionesJavaScript.add(instruccion);
        System.out.println(instruccion);
    }

}

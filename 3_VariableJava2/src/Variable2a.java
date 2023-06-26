public class Variable2a {
    public static void main(String[] args) throws Exception {
        // Var: Inferencia de tipos en JAVA
        String miVariableCadena = "Siempre desde buenos aires";
        System.out.println(miVariableCadena);
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2= " + miVariableCadena2);

        var usuario = "Valeria Florisblello";
        var titulo = "Abogada";
        var union = titulo + " " + usuario;
        System.out.println("Quien es esa? = " + union);

    }
}

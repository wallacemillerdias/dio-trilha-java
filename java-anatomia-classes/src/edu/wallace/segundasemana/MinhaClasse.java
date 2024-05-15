package edu.wallace.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Wallace";
        String segundoNome = "Miller";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    } 
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        // return primeiroNome.concat(" ").concat(segundoNome);
        return "Resultado do método " + primeiroNome + " " + segundoNome;
    }
}

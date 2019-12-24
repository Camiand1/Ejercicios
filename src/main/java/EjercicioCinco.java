public class EjercicioCinco {

    private int primerNumero = 1;
    private int ultimoNumero = 100;
    private String numeroPares = "";
    private String numerosImpares = "";

    public void numerosParImpar() {

        System.out.println("Números impares y pares del 1 al 100:\n");
        while (primerNumero <= ultimoNumero) {
            if (primerNumero % 2 == 0) {
                numeroPares = numeroPares + primerNumero  + ", ";
                primerNumero = primerNumero + 1;
            } else {
                numerosImpares = numerosImpares + primerNumero + ", ";
                primerNumero = primerNumero + 1;
            }
        }
        System.out.println("Numeros pares: " + numeroPares+ "\n");
        System.out.println("Numeros numeros impares: " + numerosImpares+ "\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}



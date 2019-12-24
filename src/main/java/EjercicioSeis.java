public class EjercicioSeis {

    private String numerosPares = "";
    private String numerosImpares = "";

    public void numeroParImpar(){
        System.out.println("Números impares y pares del 1 al 100\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                numerosPares = numerosPares + i + ", ";
            } else {
                numerosImpares = numerosImpares + i + ", ";
            }
        }
        System.out.println("Numeros pares: "+numerosPares+ "\n");
        System.out.println("Numeros numerosImpares: "+numerosImpares+ "\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}


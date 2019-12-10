public class EjercicioUno {

    public void compararNumero(){

        int primerNumero=1;
        int segundoNumero=2;
        System.out.println("Indica que numero es mayor entre "+primerNumero+" y "+segundoNumero);
        if (primerNumero == segundoNumero) {
            System.out.println("Los números son iguales\n");
        }
        else if (primerNumero > segundoNumero) {
            System.out.println("El número mayor es: " + primerNumero + "\n");
        }else {
            System.out.println("El número mayor es: " + segundoNumero+ "\n");
        }
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}

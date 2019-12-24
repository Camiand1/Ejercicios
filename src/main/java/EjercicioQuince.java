import java.util.Scanner;

public class EjercicioQuince {
    int numero;

    public void ejercicioQuince(){

        ValidacionEntradaScanner validadorNumero = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("*****GESTIÓN CINEMATROGRÁFICA*****");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6-VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");

            System.out.println("Digite un número");
            validadorNumero.validacionNumero(teclado);
            numero = teclado.nextInt();
            if (numero > 8) {
                System.out.println("OPCION INCORRECTA");
                Menu volverMenu = new Menu();
                volverMenu.preguntarMenu();
            }
            if (numero == 8){
                Menu volverMenu = new Menu();
                volverMenu.preguntarMenu();
            }
        }while(numero<8);
    }
}

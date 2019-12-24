import java.util.Scanner;

public class EjercicioOcho {

    private String dia;

    public void diaSemana() {

        ValidacionEntradaScanner validadorPalabra = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un dia de la semana y se mostrará si es día laboral o no:");
        dia = validadorPalabra.validacionPalabra(teclado);
    }

    public void tipoDiaSemana() {

        switch (dia.toLowerCase()) {
            case ("lunes"):
            case ("martes"):
            case ("miercoles"):
            case ("jueves"):
            case ("viernes"):
                System.out.println("Dia laboral\n");
                Menu volverMenu = new Menu();
                volverMenu.preguntarMenu();
                break;

            case ("sabado"):
            case ("domingo"):
                System.out.println("No se labora\n");
                Menu volveraMenu = new Menu();
                volveraMenu.preguntarMenu();
                break;
            default:
                System.out.println("Invalido");
                EjercicioOcho pedirDia = new EjercicioOcho();
                pedirDia.diaSemana();
                pedirDia.tipoDiaSemana();
        }
    }
}


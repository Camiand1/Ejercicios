import java.util.Calendar;

public class EjercicioTrece {

    public void obtenerFechaHora(){

        System.out.println("Fecha y hora actual:");
        Calendar calendario = Calendar.getInstance();

        int anio = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DATE);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);

        System.out.println("(" + anio + "/" + mes + "/" + dia + ") (" + hora + ":" + minutos + ":" + segundos + ")\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}

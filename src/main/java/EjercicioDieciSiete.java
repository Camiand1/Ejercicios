public class EjercicioDieciSiete {
    public void ejercicioDieciSiete() {

        Electrodomestico[] tipoElectrodomestico = new Electrodomestico[10];
        tipoElectrodomestico[0] = new Electrodomestico(100,20);
        tipoElectrodomestico[1] = new Television(90, 55);
        tipoElectrodomestico[2] = new Lavadora(70, 50);
        tipoElectrodomestico[3] = new Lavadora(45, 40);
        tipoElectrodomestico[4] = new Television(55, "rojo", 'D', 48, 55, false);
        tipoElectrodomestico[5] = new Television(99, "gris", 'C', 75, 30, true);
        tipoElectrodomestico[6] = new Television(60, "morado", 'B', 29, 30, false);
        tipoElectrodomestico[7] = new Television(80, "blanco", 'E', 40, 55, true);
        tipoElectrodomestico[8] = new Lavadora(80, 50);
        tipoElectrodomestico[9] = new Lavadora(99, "gris", 'D', 65, 60);

        String precioFinalElectrodomestico = "";
        String precioFinalLavadora = "";
        String precioFinalTelevision = "";
        int sumaTotalElectrodomesticos = 0;

        for (int i = 0; i < tipoElectrodomestico.length; i++) {

            if (tipoElectrodomestico[i] instanceof Lavadora) {
                precioFinalLavadora = precioFinalLavadora + tipoElectrodomestico[i].precioFinal() + ", ";


            } else if (tipoElectrodomestico[i] instanceof Television) {
                precioFinalTelevision = precioFinalTelevision + tipoElectrodomestico[i].precioFinal() + ", ";

            } else if (tipoElectrodomestico[i] != null) {
                precioFinalElectrodomestico = precioFinalElectrodomestico + tipoElectrodomestico[i].precioFinal() + ", ";

                for (int j = 0; j < tipoElectrodomestico.length; j++) {
                    sumaTotalElectrodomesticos += tipoElectrodomestico[j].precioFinal;
                }
            }
        }
        System.out.println("Se mostrará el precio de todos los televisores, lavadoras y la suma del precio de todos los Electrodomésticos.\n");
        System.out.println("El precio de la lavadora es: " + precioFinalLavadora);
        System.out.println("El precio del televisor es: " + precioFinalTelevision);
        System.out.println("El precio del electrodomestico es: " + precioFinalElectrodomestico);
        System.out.println("El precio total de los Electrdomésticos es: " + sumaTotalElectrodomesticos+ "\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}
public class EjercicioDieciOcho {

    public void creacionArrays() {

        Serie[] serie = new Serie[5];
        serie[0] = new Serie("13 Reasons Why","Netflix");
        serie[1] = new Serie("Stranger things",3,"Science Fiction","Netflix");
        serie[2] = new Serie("The Walking Dead",10,"Horror","Frank Darabont and " +
                "Robert Kirkman");
        serie[3] = new Serie("Vikings","Michael Hirst");
        serie[4] = new Serie("Friends",10,"Comedy","David Crane and Marta Kauffman");



        VideoJuego[] videoJuego = new VideoJuego[5];
        videoJuego[0] = new VideoJuego("Mario Bross",100,"Aventura","Nintendo");
        videoJuego[1] = new VideoJuego("Resident Evil",60,"Horror","Capcom");
        videoJuego[2] = new VideoJuego("Crash",75);
        videoJuego[3] = new VideoJuego("Pacman",30,"Arcade","Namco");
        videoJuego[4] = new VideoJuego("Need for Speed",40);


        serie[1].entregar();
        serie[2].entregar();
        serie[3].entregar();

        videoJuego[0].entregar();
        videoJuego[1].entregar();
        videoJuego[2].entregar();

        int cuantasSeries = 0;
        for(int i=0; i<serie.length; i++){
            if (serie[i].isEntregado()){
                cuantasSeries = cuantasSeries+ 1;
                serie[i].devolver();
            }
        }
        int cuantosVideoJuegos=0;
        for(int i=0; i<videoJuego.length; i++){

            if(videoJuego[i].isEntregado()){
                cuantosVideoJuegos = cuantosVideoJuegos + 1;
                videoJuego[i].devolver();
            }
        }

        System.out.println("De acuerdo a los datos del array de video juego y series, indicará el número de la serie que más\n" +
                "tiene temporadas y el número mayor de horas del video juego.\n");
        int imprimirSerie = serie[2].compareTo(serie);
        System.out.println("La serie que más tiene temporadas tiene: "+ imprimirSerie);

        int imprimir = videoJuego[1].compareTo(videoJuego);
        System.out.println("El mayor numero de horas es: " + imprimir + "\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}

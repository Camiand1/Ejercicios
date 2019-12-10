

import java.util.Scanner;

public class Persona {

    private  int PESOBAJO = -1;

    private String nombre="";
    private int edad = 0;
    private int DNI = 0;
    private char sexo = 'H';
    private int peso = 0;
    private int altura = 0;


    public Persona(){
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

    }


    public Persona(String nombre, int edad, int DNI, char sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        double calculoIMC;
        calculoIMC = (peso/(Math.pow(altura,2)));
        if(calculoIMC<20){
            System.out.println(PESOBAJO + " - Su peso es ideal\n");
        }else if (calculoIMC >=20 &&  calculoIMC <=25){
            System.out.println("0 - Está por debajo de su peso ideal\n");
        }else if(calculoIMC >25){
            System.out.println("1 - Tiene sobrepeso\n");
        }return calculoIMC;
    }

    public boolean esMayorDeEdad(){
        boolean mayorEdad = false;
        if (edad>17){
            mayorEdad=true;
            System.out.println("Ya tiene la mayoría de edad\n");
        }return mayorEdad;
    }

    public char comprobarSexo(){
        char sex=sexo;
        if(sexo!='H'){
            sex='H';
        }return sex;
    }

    public String toString() {
        String informacion;
        informacion = ("Nombre: "+nombre+ ", edad: "+edad+", DNI: "+DNI+", sexo:"+sexo+", peso:"+peso+", altura:"+altura);
        System.out.println("Su información es: "+informacion);
        return informacion;
    }

    public double generaDNI(){
        double numeroDNI = 0;
        long nif = 0;
        numeroDNI = ((Math.random()*(999999999-100000000))+1);
        nif = Math.round(numeroDNI%23);
        int numnif = (int)nif;
        char [] cadena = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        char letra;
        letra=cadena[numnif];
        return letra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public void ejercicioDieciSeis(){

        String nombreIngresado;
        int pesoIngresado;
        int edadIngresado;
        char sexoIngresado;
        int alturaIngresado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        nombreIngresado = teclado.nextLine();
        System.out.println("Digite su edad: ");
        edadIngresado = teclado.nextInt();
        System.out.println("Digite su peso: ");
        pesoIngresado = teclado.nextInt();
        System.out.println("Digite su sexo: ");
        sexoIngresado = teclado.next().charAt(0);
        System.out.println("Digite su altura: ");
        alturaIngresado = teclado.nextInt();


        Persona persona1 = new Persona();
        persona1.nombre=nombreIngresado;
        persona1.edad=edadIngresado;
        persona1.peso=pesoIngresado;
        persona1.sexo=sexoIngresado;
        persona1.altura=alturaIngresado;
        persona1.calcularIMC();
        persona1.esMayorDeEdad();
        persona1.toString();



        int pesoIngresado1;
        int edadIngresado1;
        char sexoIngresado1;
        int alturaIngresado1;
        String nombreIngresado1;

        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        nombreIngresado1 = teclado1.nextLine();
        System.out.println("Digite su edad: ");
        edadIngresado1 = teclado1.nextInt();
        System.out.println("Digite su sexo: ");
        sexoIngresado1 = teclado1.next().charAt(0);


        Persona persona2 = new Persona();
        persona2.nombre=nombreIngresado1;
        persona2.edad=edadIngresado1;
        persona2.sexo=sexoIngresado1;
        persona2.calcularIMC();
        persona2.esMayorDeEdad();
        persona2.toString();



        Persona persona3 = new Persona();
        persona3.setNombre("Jaime");
        persona3.setEdad(24);
        persona3.setPeso(80);
        persona3.setSexo('H');
        persona3.setAltura(180);
        persona3.calcularIMC();
        persona3.esMayorDeEdad();
        persona3.toString();




    }
}


public class Electrodomestico {

    int PESOBASE = 5;
    int PRECIOBASE = 100;

    private int precioBase = PRECIOBASE;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private int peso = PESOBASE;
    int precioFinal = precioFinal();

    public Electrodomestico() {

    }


    public Electrodomestico(int precioBase, int peso) {
        this.precioFinal = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
        precioFinal();
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char letra) {

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            consumoEnergetico = letra;
        } else {
            consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {
        if ("blanco".equals(color) || "negro".equals(color) || "rojo".equals(color) || "azul".equals(color) || "gris".equals(color)) {
        } else {
            color = "blanco";
        }
    }

    public int precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                this.precioFinal = precioBase + 100;
            case 'B':
                this.precioFinal = precioBase + 80;
            case 'C':
                this.precioFinal = precioBase + 60;
            case 'D':
                this.precioFinal = precioBase + 50;
            case 'E':
                this.precioFinal = precioBase + 60;
            case 'F':
                this.precioFinal = precioBase + 10;
            default:
                this.precioFinal = 100;
        }
        if (peso >= 0 && peso <= 19) {
            this.precioFinal = precioFinal + 10;
        }
        if (peso >= 20 && peso <= 49) {
            this.precioFinal = precioFinal + 50;
        }
        if (peso >= 50 && peso <= 79) {
            this.precioFinal = precioFinal + 80;
        }
        if (peso > 80) {
            this.precioFinal = precioFinal + 100;
        }
        return this.precioFinal;
    }
}
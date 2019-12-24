public class Television extends Electrodomestico{
    private int resolucion = 20;
    private boolean sincronizadorTDT = false;

    public Television(){

    }

    public Television(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Television(int resolucion, boolean sincronizadorTDT) {
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    public Television(int precioBase, int peso, int resolucion, boolean sincronizadorTDT) {
        super(precioBase, peso);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sincronizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSincronizadorTDT() {
        return sincronizadorTDT;
    }

    @Override
    public int precioFinal() {
        precioFinal = getPrecioBase();
        if (resolucion>40){

            this.precioFinal = (int) (precioFinal +(precioFinal *0.3));
        }
        if (sincronizadorTDT=true){
            this.precioFinal = precioFinal + 50;
        }
        return precioFinal;
    }
}
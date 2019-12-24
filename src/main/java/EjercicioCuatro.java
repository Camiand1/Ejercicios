import java.util.Scanner;

public class EjercicioCuatro {

    private double precioProducto;

    public void ejercicioCuatro() {

        System.out.println("Se calculará el precio del producto que digite con el IVA del 21%");
        ValidacionEntradaScanner validadorNumero = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto: ");
        validadorNumero.validacionNumero(teclado);
        precioProducto = teclado.nextDouble();
    }
    public void precioProductoMasIVA(){
        int IVA = 21;
        double precioIva = ((precioProducto * IVA) / 100);
        double precioProductoIva = (precioIva + precioProducto);
        System.out.println("El precio del producto mas el iva del 21% es: " + precioProductoIva+ "\n");
        Menu volverMenu = new Menu();
        volverMenu.preguntarMenu();
    }
}

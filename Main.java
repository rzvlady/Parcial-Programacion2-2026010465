public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Juan Perez", 2000.0, new ComisionEstandar());
        System.out.println("--- Detalles del Vendedor ---");
        vendedor.mostrarDetalle();
    }
}

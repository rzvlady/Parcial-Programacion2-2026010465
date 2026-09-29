public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Vladimir", 1000.0, new ComisionPersonalizada("Vladimir"));
        System.out.println("--- Detalles del Vendedor ---");
        vendedor.mostrarDetalle();
    }
}

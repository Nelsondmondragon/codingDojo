package cafejava;

public class TestPedido {

    public static void main(String[] args) {
        // Elementos del menú

        // Ordenar variables -- orden1, orden2, etc.

        // Simulaciones de aplicaciones
        // Utiliza este código de ejemplo para probar las actualizaciones de varios
        // pedidos

        Articulo articulo1 = new Articulo("moka", 360000);
        Articulo articulo2 = new Articulo("latter", 40000);
        // Articulo articulo3 = new Articulo("cafe de goteo", 260000);
        Articulo articulo4 = new Articulo("capuchino", 50000);

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido();
        Pedido pedido4 = new Pedido();

        pedido1.name = "Cindhuri";
        pedido2.name = "Jimmy";
        pedido3.name = "Noah";
        pedido4.name = "Sam";

        pedido2.items.add(articulo1);

        pedido3.items.add(articulo4);
        pedido3.total += articulo4.price;

        pedido4.items.add(articulo2);
        pedido4.total += articulo2.price;

        pedido1.state = true;

        pedido4.items.add(articulo2);
        pedido4.items.add(articulo2);

        pedido4.total += articulo2.price;
        pedido4.total += articulo2.price;

        pedido2.state = true;

        System.out.println(pedido1);
        System.out.println("llllllllllllllllllllllllll");
        // 0

        // System.out.println();
        System.out.printf("Nombre: %s\n", pedido1.name);
        System.out.printf("Total: %s\n", pedido1.total);
        System.out.printf("Listo: %s\n", pedido1.state);
    }
}

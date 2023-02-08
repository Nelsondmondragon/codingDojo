package desafiobarista;

public class TestPedido {

    public static void main(String[] args) {
        // Elementos del menú

        // Ordenar variables -- orden1, orden2, etc.

        // Simulaciones de aplicaciones
        // Utiliza este código de ejemplo para probar las actualizaciones de varios
        // pedidos

        Articulo articulo1 = new Articulo("moka", 360000);
        Articulo articulo2 = new Articulo("latter", 40000);
        Articulo articulo3 = new Articulo("cafe de goteo", 260000);
        Articulo articulo4 = new Articulo("capuchino", 50000);

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido("Nelson");
        Pedido pedido4 = new Pedido("Juan");
        Pedido pedido5 = new Pedido("Gustavo");

        pedido1.addArticulo(articulo1);
        pedido1.addArticulo(articulo2);

        pedido2.addArticulo(articulo3);
        pedido2.addArticulo(articulo4);

        pedido3.addArticulo(articulo2);
        pedido3.addArticulo(articulo3);

        pedido4.addArticulo(articulo4);
        pedido4.addArticulo(articulo1);

        pedido5.addArticulo(articulo2);
        pedido5.addArticulo(articulo4);

        pedido3.display();

        System.out.println(pedido3.getStatusMessage());

    }
}

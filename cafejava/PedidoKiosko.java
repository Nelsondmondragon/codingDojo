package cafejava;

import java.util.ArrayList;

public class PedidoKiosko {

    ArrayList<Articulo> menu;
    ArrayList<Pedido> pedidos;

    PedidoKiosko() {
        menu = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public void addMenuItem(String name, double price) {
        Articulo articulo = new Articulo(name, price);
        articulo.setIndex(menu.size());
        menu.add(articulo);
    }

    public void displayMenu() {
        for (int i = 0; i < this.menu.size(); i++) {
            Articulo articulo = menu.get(i);
            System.out.println(i + " " + articulo.getName() + " -- " + articulo.getPrice());
        }
    }

    public void newOrder() {

        // Mostrar al usuario un aviso de mensaje y luego establece su entrada en una
        // variable, nombre
        System.out.println("Ingrese el nombre del cliente para el nuevo pedido:");
        String name = System.console().readLine();

        // Tu código:
        // Crea un nuevo pedido con la cadena de entrada dada
        // Muestra el menú al usuario, para que puedan elegir artículos para agregar

        this.pedidos.add(new Pedido(name));
        displayMenu();

        addMenuItemByInput();
        // Pedir al usuario que ingrese un número de artículo
        displayMenu();
        System.out.println("Ingrese un índice de artículo del menú o q para salir:");
        String itemNumber = System.console().readLine();

        // Escribir un bucle while para recopilar todos los artículos del pedido del
        // usuario
        while (!itemNumber.equals("q")) {

            // Obtén el objeto del artículo del menú y agrega el artículo al pedido
            this.pedidos.get(this.pedidos.size() - 1).addArticulo(this.menu.get(Integer.parseInt(itemNumber)));
            itemNumber = System.console().readLine();

            // Pídales que ingresen un nuevo índice de artículo o q nuevamente, y toma su
            // entrada
        }
        // Después de haber completado su pedido, imprime los detalles del pedido
        // como el ejemplo de abajo. Puedes utilizar el método de visualización del
        // pedido
        this.pedidos.get(this.pedidos.size() - 1).display();

    }

    public void addMenuItemByInput() {
        System.out.println("Ingrese el nombre del articulo");
        String name = System.console().readLine();
        System.out.println("Ingrese el precio del articulo");
        double price = Double.parseDouble(System.console().readLine());
        Articulo articulo = new Articulo(name, price);

        articulo.setIndex(menu.size());
        menu.add(articulo);
    }

}

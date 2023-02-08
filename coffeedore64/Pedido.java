package coffeedore64;

import java.util.ArrayList;

class Pedido {
    private String name;
    private boolean state;
    private ArrayList<Articulo> items;

    Pedido() {
        this.name = "invitado";
        this.items = new ArrayList<>();
    }

    Pedido(String name) {
        this.items = new ArrayList<>();
        this.name = name;

    }

    public double getOrderTotal() {
        return items.stream().map(item -> item.getPrice()).reduce(Double::sum).get();
    }

    public void display() {
        System.out.println("Nombre Cliente: " + this.name);
        this.items.forEach(item -> {
            System.out.println(item.getName() + ": " + item.getPrice());
        });
        System.out.println("Total: " + this.getOrderTotal());
    }

    public String getStatusMessage() {
        return this.state ? "Tu pedido está listo" : "Gracias por esperar. Tu pedido estará listo pronto";
    }

    public void addArticulo(Articulo articulo) {
        this.items.add(articulo);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean iState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public ArrayList<Articulo> getItems() {
        return this.items;
    }

    public void setState(ArrayList<Articulo> items) {
        this.items = items;
    }

}

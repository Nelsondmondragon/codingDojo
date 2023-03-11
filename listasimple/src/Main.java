public class Main {
    public static void main(String[] args) {

        ListaSimpleEnlazada sll = new ListaSimpleEnlazada();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.eliminar();
        sll.eliminar();
        sll.eliminarEn(1);

        sll.imprimirValores();

        Nodo nodo = sll.encontrar(10);
        System.out.println(nodo == null ? "No esta" : nodo.value + " Encontrado");
    }
}
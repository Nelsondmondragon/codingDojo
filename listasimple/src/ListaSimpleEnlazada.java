public class ListaSimpleEnlazada {
    public Nodo head;

    public ListaSimpleEnlazada() {
        this.head = null;
    }

    // Los métodos de SLL van aquí. Para empezar, te mostraremos cómo agregar un nodo a la lista.
    public void add(int value) {
        Nodo newNodo = new Nodo(value);
        if (head == null) {
            head = newNodo;
        } else {
            Nodo runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNodo;
        }
    }

    public void imprimirValores() {
        Nodo runner = head;

        while (runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
    }

    public void eliminar() {
        Nodo runner = head;
        Nodo aux = null;
        while (runner.next != null) {
            aux = runner;
            runner = runner.next;
        }
        aux.next = null;
    }


    public Nodo encontrar(int number) {
        Nodo runner = head;
        while (runner != null) {
            if (runner.value == number) {
                return runner;
            }
            runner = runner.next;
        }
        return null;
    }

    public void eliminarEn(int num) {
        if (num == 0) {
            this.head = this.head.next;
        }
        int i = 0;
        Nodo runner = head;
        Nodo ant = runner;
        while (runner != null) {
            if (i == num) {
                ant.next = runner.next;
                break;
            }
            ant = runner;
            runner = runner.next;
            i++;
        }
    }

}


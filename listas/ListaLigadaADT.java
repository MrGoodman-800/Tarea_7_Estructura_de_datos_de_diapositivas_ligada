package mx.unam.aragon.ico.edd.listas;

public class ListaLigadaADT<T> {
    private Nodo<T> head;

    public ListaLigadaADT() {
        this.head = null;
    }

    public boolean EstaVacia() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getTamanio() {
        int contador = 0;
        if (head == null) {
            return contador;
        } else {
            Nodo<T> actual = head;
            do {
                contador++;
                actual = actual.getSiguiente();
            } while (actual != null);
            return contador;
        }
    }


    public void agregar(T dato) {
        if (head == null) {
            this.head = new Nodo<>(dato);
        } else {
            Nodo<T> actual = head;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(new Nodo<>(dato));

        }
    }

    public void agregarAlFinal(T valor) {
        if (head == null) {
            this.head = new Nodo<>(valor);
        } else {
            Nodo<T> actual = head;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            Nodo<T> nuevoNodo = new Nodo<>(valor);
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void agregarAntesDe(T valor, Pequeniocesar pedido2) {
        if (head == null) {
            this.head = new Nodo<>(valor);
        } else {
            Nodo<T> nuevoNodo = new Nodo<>(valor);
            nuevoNodo.setSiguiente(this.head);
            this.head = nuevoNodo;
        }
    }

    public void agregarDespuesDe(T referencia, T valor) {
        if (EstaVacia()) {
            return;
        }

        Nodo<T> actual = this.head;

        while (actual != null && !actual.getDato().equals(referencia)) {
            actual = actual.getSiguiente();
        }

        if (actual != null) {
            Nodo<T> nuevoNodo = new Nodo<>(valor);
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void eliminarElPrimero() {
        if (head != null) {
            this.head = this.head.getSiguiente();
        }
    }

    public void eliminarElFinal() {
        if (head == null) {
            return;
        }

        if (head.getSiguiente() == null) {
            this.head = null;
        } else {
            Nodo<T> actual = head;
            while (actual.getSiguiente().getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
        }
    }

    public int buscar(T valor) {
        Nodo<T> actual = head;
        int posicion = 0;

        while (actual != null) {
            if (actual.getDato().equals(valor)) {
                return posicion;
            }
            actual = actual.getSiguiente();
            posicion++;
        }

        return -1;
    }

    public void actualizar(T nuevoValor , T aBuscar) {
        if (head == null) {
            System.out.println("Vacia");
        } else {
            Nodo<T> actual = this.head;
            while (!actual.getDato().equals(aBuscar)) {
                actual = actual.getSiguiente();
            }
            actual.setDato(nuevoValor);
        }
    }

    public void transversal() {
        if (head == null) {
            System.out.println("Vacia");
        } else {
            Nodo<T> actual = head;
            //           while (actual.getSiguiente() != null) {
            //               System.out.print("|" + actual.getDato());
            //              actual = actual.getSiguiente();
            //           }
            do {
                System.out.print("|" + actual.getDato());
                actual = actual.getSiguiente();
            } while (actual != null);
        }
    }


    // El ide me ayudo :(

    public void agregarDespuesDe(T pedido1) {
    }

    public void agregarAlFinal(T pedido2, T pedido3) {
    }
}


package mx.unam.aragon.ico.edd.listas;

public class ListaLigada {
    public static void main(String[] args) {
        ListaLigadaADT<Pequeniocesar> lista = new ListaLigadaADT<>();
        Pequeniocesar pedido1 = new Pequeniocesar("Pepperoni-grande", 99.0);
        Pequeniocesar pedido2 = new Pequeniocesar("Queso-grande", 89.0);
        Pequeniocesar pedido3 = new Pequeniocesar("3 Meat Treat ", 159.0);
        Pequeniocesar pedido4 = new Pequeniocesar("Crazy Bread", 42.0);

        System.out.println("¿La Lista de pedidos está vacía?: " + lista.EstaVacia());

        lista.agregarAlFinal(pedido1);
        lista.agregarAlFinal(pedido2);

        System.out.println("¿La Lista de pedidos sigue vacía?: " + lista.EstaVacia());

        lista.agregarAntesDe(pedido2, pedido3);
        lista.agregarDespuesDe(pedido2, pedido4);

        System.out.println("El tamaño es: " + lista.getTamanio());
        System.out.println();
        lista.transversal();

        int pos = lista.buscar(pedido2);
        System.out.println("Posición de 'Queso-grande': " + pos);

        System.out.println();
        lista.eliminarElFinal();
        lista.eliminarElPrimero();

        System.out.println();
        lista.transversal();

        lista.eliminarElPrimero();
        lista.eliminarElPrimero();

        System.out.println("El tamaño de la lista es: " + lista.getTamanio());
        System.out.println("¿La Lista de pedidos está vacía?: " + lista.EstaVacia());
        System.out.println("Ya no hay pedidos por cumplir.");
    }


}

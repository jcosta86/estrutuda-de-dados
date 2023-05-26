public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println("Lista vazia? " + lista.vazia());
        lista.inserePrimeiro(3);
        lista.inserePrimeiro(2);
        lista.inserePrimeiro(1);
        lista.mostrar(); 

        lista.insereDepois(lista.getPrimeiro(), 4);
        lista.insereUltimo(5);
        lista.mostrar(); 

        No noRemovido = lista.removeUltimo();
        System.out.println("Nó removido: " + noRemovido.getInfo());
        lista.mostrar(); 

        lista.remove(lista.removePrimeiro());
        lista.mostrar();
        System.out.println("Lista vazia? " + lista.vazia());
    
    }
}
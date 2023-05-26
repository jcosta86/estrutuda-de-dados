public class Lista {
    private No primeiro;

    public boolean vazia() {
        return primeiro == null;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void inserePrimeiro(int info) {
        No novoNo = new No(info);
        novoNo.setProximo(primeiro);
        primeiro = novoNo;
    }

    public void insereDepois(No no, int info) {
        if (no == null) {
            return; // Não é possível inserir depois de um nó nulo
        }
        No novoNo = new No(info);
        novoNo.setProximo(no.getProximo());
        no.setProximo(novoNo);
    }

    public void insereUltimo(int info) {
        No novoNo = new No(info);
        if (vazia()) {
            primeiro = novoNo;
        } else {
            No atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }

    public No removePrimeiro() {
        if (vazia()) {
            return null;
        }
        No removido = primeiro;
        primeiro = primeiro.getProximo();
        removido.setProximo(null);
        return removido;
    }

    public No removeUltimo() {
        if (vazia()) {
            return null;
        }
        if (primeiro.getProximo() == null) {
            return removePrimeiro();
        }
        No atual = primeiro;
        No anterior = null;
        while (atual.getProximo() != null) {
            anterior = atual;
            atual = atual.getProximo();
        }
        anterior.setProximo(null);
        return atual;
    }

    public No remove(No no) {
        if (vazia()) {
            return null;
        }
        if (no == primeiro) {
            return removePrimeiro();
        }
        No atual = primeiro;
        No anterior = null;
        while (atual != null && atual != no) {
            anterior = atual;
            atual = atual.getProximo();
        }
        if (atual == null) {
            return null; // O nó não foi encontrado
        }
        anterior.setProximo(atual.getProximo());
        atual.setProximo(null);
        return atual;
    }

    public void mostrar() {
        No atual = primeiro;
        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
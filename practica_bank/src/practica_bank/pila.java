package practica_bank;

public class pila {
    nodo_pila top;

    public pila() {
        top = null;

    }

    void apilar(nodo_pila nuevo) {
        if (top == null) {
            top = nuevo;
        } else {
            nuevo.siguiente = top;
            top = nuevo;
        }

    }

    public nodo_pila desapilar() {
        nodo_pila saliente = new nodo_pila();
        if (top == null) {
            saliente = null;
        } else {
            saliente = top;
            top = top.siguiente;
        }
        return saliente;
    }
}

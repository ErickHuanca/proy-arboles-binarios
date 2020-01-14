package ejerExpo317;

public class arbolBinarioB {

    public nodoArbol raiz;

    public boolean esVacio() {

        return (raiz == null);

    }

    public void insertar(int a) {

        if (esVacio()) {

            nodoArbol nuevo = new nodoArbol();
            nuevo.setDato(a);
            nuevo.setHd(new arbolBinarioB());
            nuevo.setHi(new arbolBinarioB());
            raiz = nuevo;

        }
        else {
            if (a > raiz.getDato()) {
                (raiz.getHd()).insertar(a);
            }
            if (a < raiz.getDato()) {
                (raiz.getHi()).insertar(a);
            }
        }
    }

    public void preOrder() {

        if (!esVacio()) {

            System.out.print(raiz.getDato() + ", ");
            raiz.getHi().preOrder();
            raiz.getHd().preOrder();
        }

    }

    public void inOrder() {

        if (!esVacio()) {

            raiz.getHi().inOrder();
            System.out.print(raiz.getDato() + ", ");
            raiz.getHd().inOrder();
        }
    }

    public void posOrder() {

        if (!esVacio()) {

            raiz.getHi().posOrder();
            raiz.getHd().posOrder();
            System.out.print(raiz.getDato() + ", ");
        }

    }

    public arbolBinarioB buscar(int a) {

        arbolBinarioB arbolito = null;
        if (!esVacio()) {
            if (a == raiz.getDato()) {
                return this;
            }
            else {
                if (a < raiz.getDato()) {
                    arbolito = raiz.getHi().buscar(a);
                }
                else {
                    arbolito = raiz.getHd().buscar(a);
                }
            }
        }
        return arbolito;
    }




    public void eliminar(int a) {

        arbolBinarioB paraEliminar = buscar(a);
        if (!paraEliminar.esVacio()) {
            if (paraEliminar.esHoja()) {
                paraEliminar.raiz = null;
            }
            else {
                if (!paraEliminar.raiz.getHi().esVacio()
                 && !paraEliminar.raiz.getHd().esVacio()){
                    	paraEliminar.raiz.setDato(paraEliminar.raiz.getHd().buscarMin());
                }

                else {

                    if (paraEliminar.raiz.getHi().esVacio()) {

                        paraEliminar.raiz = paraEliminar.raiz.getHd().raiz;

                    } else {

                        paraEliminar.raiz = paraEliminar.raiz.getHi().raiz;

                    }
                }
            }
        }
    }
    public int buscarMin() {

        arbolBinarioB arbolActual = this;

        while( !arbolActual.raiz.getHi().esVacio() ) {

            arbolActual = arbolActual.raiz.getHi();
        }
        
        int devuelvo= arbolActual.raiz.getDato();
        arbolActual.raiz=null;
        return devuelvo;
    }
    
    public boolean esHoja() {

        boolean hoja = false;

        if( (raiz.getHi()).esVacio() && (raiz.getHd()).esVacio() ) {

            hoja = true;

        }
        return hoja;
    }

}


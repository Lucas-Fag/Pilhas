package PilhaDinamica;

import PilhaException.PilhaVaziaException;

public class PilhaDinamica {
    private ElementoDaPilha topo;

    class ElementoDaPilha {
        private Object valor;
        private ElementoDaPilha elementoAnterior;

        public Object getValor() {
            return valor;
        }

        public void setValor(Object valor) {
            this.valor = valor;
        }

        public ElementoDaPilha getElementoAnterior() {
            return elementoAnterior;
        }

        public void setElementoAnterior(ElementoDaPilha elementoAnterior) {
            this.elementoAnterior = elementoAnterior;
        }

        public ElementoDaPilha(Object valor) {
            this.valor = valor;
        }
        
    }
    
    public void push(Object valor) {
        ElementoDaPilha elemento = new ElementoDaPilha(valor);
        elemento.setElementoAnterior(this.topo);
        this.topo = elemento;
    }
    
    public boolean isEmpty() {
        return this.topo == null;
    }
    
    public Object pop() throws PilhaVaziaException {
        if (this.isEmpty()) {
            throw new PilhaVaziaException();
        } else {
            Object valor = this.topo.getValor();
            this.topo = this.topo.getElementoAnterior();
            return valor;
        }
    }
    
    public void percorrer() {
        ElementoDaPilha elemento = this.topo;
    
        while (elemento != null) {
            System.out.println(elemento.getValor());
            elemento = elemento.getElementoAnterior();
        }
    }

    public void esvaziar() {
        this.topo = null;
    }

}

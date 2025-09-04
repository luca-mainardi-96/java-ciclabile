public class Ciclabile {

    private int[] numeri;

    private int elementoCorrente = 0;

    public Ciclabile(int[] numeri){
        this.numeri = numeri;
    }
    
    public int getElementoSuccessivo(){                        //da rivedere, non funziona
        this.elementoCorrente = numeri[0];
        elementoCorrente++;
        return elementoCorrente;
    }



    }


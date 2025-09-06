public class Ciclabile {

    private int[] numeri;

    private int elementoCorrente;

    //private int elementoCorrente2;

    public Ciclabile(int[] numeri){
        this.numeri = numeri;
    }
    
    public int getElementoSuccessivo(){                       
       if(hasAncoraElementi()){
            int numero = numeri[elementoCorrente];
            elementoCorrente++;
            return numero;
       } else {
            System.out.println("Non ci sono più elementi.");
            return -1;
       }
    }

    public boolean hasAncoraElementi(){
        return this.elementoCorrente < numeri.length;
    }

    //BONUS

    //array dinamico, funziona, ma non da consegna.

    public Ciclabile(){
        this.numeri = new int[0];
    }

    public void addElemento(int nuovoNumero){
        int[]nuovoArray = new int[numeri.length+1];
        for(int i=0; i <numeri.length; i++){
            nuovoArray[i] = numeri[i];
        }
            nuovoArray[numeri.length] = nuovoNumero;
            this.numeri = nuovoArray;
        }

    /*

    array corretto da consegna.

    public Ciclabile(){
        this.numeri = new int[10];
    } 
    
    public void addElemento(int numero){
        if(elementoCorrente2 < numeri.length){
            this.numeri[elementoCorrente2] = numero;
        } else {
            system.out.println("Raggiunto il limite massimo.") 
        }
     }
     */
    
}



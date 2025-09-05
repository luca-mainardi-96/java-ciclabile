public class Ciclabile {

    private int[] numeri;

    private int elementoCorrente = 0;

    public Ciclabile(int[] numeri){
        this.numeri = numeri;
    }
    
    public int getElementoSuccessivo(){                       
       int numero = numeri[elementoCorrente];
       elementoCorrente++;
       return numero;
    }

    public boolean hasAncoraElementi(){
        if(elementoCorrente <= numeri.length-1){
            return true;
        }else{
            return false;
        }
    }

    //BONUS

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

    
    
}



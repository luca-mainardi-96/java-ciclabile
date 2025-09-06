public class Main {
    public static void main(String[] args) {
    
        Ciclabile n1 = new Ciclabile();
        //Ciclabile n1 = new Ciclabile(new int {15, 65, 28, 415, 235, 9, 44});

        n1.addElemento(15);
        n1.addElemento(65);
        n1.addElemento(28);
        n1.addElemento(415);
        n1.addElemento(235);
        n1.addElemento(9);
        n1.addElemento(44);

        //for (int i=0; i <10; i++)
        //col ciclo for rispetto al while si può testare se funziona has ancora elementi, perché una volta raggiunto il limite dell'array, inizia a stampare la condizione else dell'if di getElementoSuccessivo finoa raggiungere il numero di interazioni specificate nel for.
        //for(int i=0; n1.hasAncoraElementi; i++)
        //questo for cicla l'elemto mettendo come numero di interazioni un metodo che ritorna un booleano, questo fa in modo che finché il booleano è true il ciclo farà interazioni.


        while(n1.hasAncoraElementi()){
            System.out.println(n1.getElementoSuccessivo());
        }

        Ciclabile n2 = new Ciclabile(new int[5]);
        
    }
}

public class Main {
    public static void main(String[] args) {
    
        Ciclabile n1 = new Ciclabile();

        n1.addElemento(15);
        n1.addElemento(65);
        n1.addElemento(28);
        n1.addElemento(415);
        n1.addElemento(235);
        n1.addElemento(9);
        n1.addElemento(44);

        while(n1.hasAncoraElementi()){
            System.out.println(n1.getElementoSuccessivo());
        }

        Ciclabile n2 = new Ciclabile(new int[5]);
        
    }
}

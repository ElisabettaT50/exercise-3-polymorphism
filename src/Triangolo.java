public class Triangolo extends Forma {
    public Triangolo (int dimensione1, int dimensione2){
        super(dimensione1, dimensione2);
    }

    @Override
    public void calcolaArea() {
        System.out.println((dimensione1 * dimensione2) / 2);
    }
}

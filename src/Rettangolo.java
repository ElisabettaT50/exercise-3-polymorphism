public class Rettangolo extends Forma {
    public Rettangolo(int dimensione1, int dimensione2) {
        super(dimensione1, dimensione2);
    }

    @Override
    public void calcolaArea(){
       System.out.println(dimensione1 * dimensione2);
    }
}

public abstract class Forma {
   public int dimensione1;
    public int dimensione2;

    Forma(int dimensione1, int dimensione2){
        this.dimensione1 = dimensione1;
        this.dimensione2 = dimensione2;
    }

    public abstract void calcolaArea();

    public int getDimensione1() {
        return dimensione1;
    }
    public void setDimensione1(int dimensione1) {
        this.dimensione1 = dimensione1;
    }
    public int getDimensione2(){
        return dimensione2;
    }
    public void setDimensione2(int dimensione2){
        this.dimensione2 = dimensione2;
    }
}

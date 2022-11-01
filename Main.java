public class Main {
    public static void main(String[] args) {
        Mesa n1 = new Mesa(5);
        int i = 1;
        for(i = 1; i < 6; i++){
            FilosofosClase f = new FilosofosClase(n1 , i);
            f.start();
        }
    }
}

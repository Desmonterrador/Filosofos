public class Mesa {
    private boolean[] palillos;
    public Mesa(int npalillos){
        this.palillos = new boolean[npalillos];
    }
    public int palilloIzquierdo(int n1){
        return n1;
    }
    public int palilloDerecho(int n2){
        if(n2 == 0){
            return this.palillos.length - 1;
        }else{
            return n2 - 1;
        }
    }
    public synchronized void tomarPalillo(int filosofo){
        while(palillos[palilloIzquierdo(filosofo)] || palillos[palilloDerecho(filosofo)]){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        palillos[palilloIzquierdo(filosofo)] = true;
        palillos[palilloDerecho(filosofo)] = true;
    }
    public synchronized void soltarPalillo(int filosofo){
        palillos[palilloIzquierdo(filosofo)] = false;
        palillos[palilloDerecho(filosofo)] = false;
        notifyAll();
    }
}

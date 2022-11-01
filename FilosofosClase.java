public class FilosofosClase extends Thread{
    private Mesa mesa;
    private int filosofo;
    private int indiceFilosofo;
    public FilosofosClase(Mesa n1, int filosofo){
        this.mesa = n1;
        this.filosofo = filosofo;
        this.indiceFilosofo = filosofo - 1;
    }
    @Override
    public void run() {
        while(true){
            this.pensar();
            this.mesa.tomarPalillo(this.indiceFilosofo);
            this.comer();
            System.out.println("El filosofo " + filosofo + " dejo de comer.");
            System.out.println("Los palillos libre son: " + (this.mesa.palilloDerecho(this.indiceFilosofo) + 1) + " y " + (this.mesa.palilloIzquierdo(this.indiceFilosofo) + 1) + ".");
            this.mesa.soltarPalillo(this.indiceFilosofo);
        }
    }
    public void pensar(){
        System.out.println("El filosofo " + filosofo + " esta pensando.");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            
        }
    }
    public void comer(){
        System.out.println("El filosofo " + filosofo + " esta comiendo.");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            
        }
    }
}
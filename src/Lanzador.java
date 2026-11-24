public class Lanzador {

    public static void main(String[] args) {

        int numFilosofos = 5;

        GestorPalillos gestor = new GestorPalillos(numFilosofos);

        Filosofo[] filosofos = new Filosofo[numFilosofos];
        Thread[] hebras = new Thread[numFilosofos];

        for (int i = 0; i < numFilosofos; i++) {

            filosofos[i] = new Filosofo(gestor, i, (i + 1) % numFilosofos);

            hebras[i] = new Thread(filosofos[i]);

            hebras[i].start();
        }
    }
}

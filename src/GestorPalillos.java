public class GestorPalillos {

    private boolean[] palillos;

    public GestorPalillos(int numPalillos) {
        palillos = new boolean[numPalillos];

        for (int i = 0; i < numPalillos; i++) {
            palillos[i] = true;
        }
    }

    public synchronized boolean intentarCogerPalillos(int p1, int p2) {

        if (palillos[p1] && palillos[p2]) {
            palillos[p1] = false;
            palillos[p2] = false;
            return true;
        }

        return false;
    }

    public synchronized void liberarPalillos(int p1, int p2) {
        palillos[p1] = true;
        palillos[p2] = true;
    }
}

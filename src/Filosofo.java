public class Filosofo implements Runnable {

    private GestorPalillos gestor;
    private int palillo1;
    private int palillo2;

    public Filosofo(GestorPalillos gestor, int palillo1, int palillo2) {
        this.gestor = gestor;
        this.palillo1 = palillo1;
        this.palillo2 = palillo2;
    }

    public void run() {

        while (true) {

            if (gestor.intentarCogerPalillos(palillo1, palillo2)) {

                System.out.println("Filosofo " + (palillo1 + 1) + " comiendo");

                try {
                    Thread.sleep((int)(Math.random() * 3000) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                gestor.liberarPalillos(palillo1, palillo2);
            }

            System.out.println("Filosofo " + (palillo1 + 1) + " pensando");

            try {
                Thread.sleep((int)(Math.random() * 4000) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

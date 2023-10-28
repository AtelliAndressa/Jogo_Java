
package jogo;

public class Jogo {


    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];        
        
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        l[1] = new Lutador("Puts", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snap", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("shed", "china", 29, 1.91f, 103.1f, 7, 0, 4);
        l[5] = new Lutador("yhed", "Bulgaria", 27, 1.92f, 104.41f, 5, 2, 4);
        
        Luta marcar = new Luta();
        marcar.marcarLuta(l[0], l[1]);
        marcar.lutar();
    }
    
}

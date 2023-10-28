
package jogo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Luta {
    //agregação
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;    

    //construtor
    public Luta() {
        this.aprovada = false;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    
    //metodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if((l1.getCategoria().equals(l2.getCategoria())) 
                && l1 != l2) {
            this.setAprovada(true);      
            this.setDesafiante(l1);
            this.setDesafiado(l2);
            System.out.println("Luta aprovada!");
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null); 
            System.out.println("Não foi possível aprovar essa luta.");
        }         
    };
    
    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("Desafiante: ");
            this.getDesafiante().apresentar();
            System.out.println("Desafiado: ");
            this.getDesafiado().apresentar();
            
            Random aleatorio = new Random(); // importando numero randômico
            
            int vencedor = aleatorio.nextInt(3);//vai gerar 3 resultados.
            
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1: 
                    System.out.println("Vitória do lutador: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do lutador: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    };
}

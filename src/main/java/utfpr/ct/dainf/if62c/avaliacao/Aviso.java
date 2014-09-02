package utfpr.ct.dainf.if62c.avaliacao;

import java.util.TimerTask;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class Aviso extends TimerTask{
    
    protected final Compromisso compromisso;

    public Aviso(Compromisso compromisso) {
       this.compromisso = compromisso;
    }

    @Override
    public void run() {
       System.out.println("Aviso " + compromisso.toString());       
    }
        
}

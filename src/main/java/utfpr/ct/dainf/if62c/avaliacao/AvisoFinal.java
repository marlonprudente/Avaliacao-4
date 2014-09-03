package utfpr.ct.dainf.if62c.avaliacao;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author Marlon Mateus Prudente de Oliveira  marlonmateuspr@gmail.com
 */
public class AvisoFinal extends Aviso {

    public AvisoFinal(Compromisso compromisso) {
        super(compromisso);
    }
 @Override
    public void run() {
        System.out.println( compromisso.getDescricao() + " Começa Agora.");
        
        for(Aviso i : compromisso.getAvisos()){
            i.cancel();
        }
        
    }
}

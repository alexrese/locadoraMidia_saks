/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author 3223612
 */
public class Dvd extends Midia{
    private String produtor;
    private String diretor;

    public Dvd(String titulo, int codigo, int ano, String genero, String sinopse, int disponivel, float valor, String produtor, String diretor) {
        super(titulo, codigo, ano, genero, sinopse, disponivel, valor);
        this.produtor = produtor;
        this.diretor = diretor;
    }
    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
}

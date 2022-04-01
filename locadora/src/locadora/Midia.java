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
public class Midia {
    private String titulo;
    private int codigo;
    private int ano;
    private String genero;
    private String sinopse;
    private int disponivel;
    private float valor;

    public Midia(String titulo, int codigo, int ano, String genero, String sinopse, int disponivel, float valor) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.ano = ano;
        this.genero = genero;
        this.sinopse = sinopse;
        this.disponivel = disponivel;
        this.valor = valor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(int disponivel) {
        this.disponivel = disponivel;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
}

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
public class Livro extends Midia{
    private String isbn;
    private String autor;

    public Livro(String titulo, int codigo, int ano, String genero, String sinopse, int disponivel, float valor, String isbn, String autor) {
        super(titulo, codigo, ano, genero, sinopse, disponivel, valor);
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
   
}

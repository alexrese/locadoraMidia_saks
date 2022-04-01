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
public class Locadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro livro = new Livro("Prog Java", 45, 2022, "tecnico", "Livro de prog", 1, 100.0f, "AS54544", "Alencar, Pedro");
        Dvd dvd = new Dvd("O Batman", 43, 2022, "acao", "Filme de um heroi", 0, 0, "Joel", "Alisson");
        
        System.out.println("Nome do livro" + livro.getTitulo());
    }
    
}

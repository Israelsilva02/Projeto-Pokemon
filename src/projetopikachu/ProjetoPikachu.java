/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopikachu;

/**
 *
 * @author israel.bsilva8
 */
public class ProjetoPikachu {

    public static void main(String[] args) {
        
        Charmander pikachu = new Charmander();
        
        Jogador jogo = new Jogador();
        System.out.println(pikachu.getHp());
        jogo.sofreDano(pikachu);
        System.out.println(pikachu.getHp());
        

        

    }
    
}

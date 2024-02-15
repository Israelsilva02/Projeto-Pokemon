/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopikachu;

/**
 *
 * @author israel.bsilva8
 */
public class Pikachu implements PokemonInterface{

    private int hp;
    private int ataque;
    private int defesa;

    private String tipo;
    private String[] fraco;
    private String[] forte;

    public Pikachu() {
        this.hp = 1;
        this.ataque = 2;
        this.defesa = 3;

        this.tipo = "elemento";
        this.fraco = new String[2];
        this.fraco[0] = "fogo";
        this.fraco[0] = "pedra";

        this.forte = new String[2];
        this.forte[0] = "agua";
        this.forte[1] = "voador";

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp =  hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public String getTipo() {
        return tipo;
    }

    public String[] getFraco() {
        return fraco;
    }

    public String[] getForte() {
        return forte;
    }
}

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int forca;

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

}
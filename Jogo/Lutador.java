package Jogo;

public class Lutador {
    public String nome;
    public int energia;
    public int forca;

    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }


	public void reduzirEnergia(int valor) {
        energia -= valor;
        if (energia < 0) {
            energia = 0;
        }
    }
    
    public void aplicarGolpe(Lutador oponente) {
        oponente.reduzirEnergia(forca);
    }

}

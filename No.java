public class No {
  
	private No esquerda;
	private No direita;
	private No pai;
	private Carro chave;
	private int balanceamento;

	public No(Carro k) {
		setEsquerda(setDireita(setPai(null)));
		setBalanceamento(0);
		setChave(k);
	}

	public Carro getCarro() {
		return chave;
	}

	public String getChave() {
		return chave.getPlaca();
	}

	public void setChave(Carro chave) {
		this.chave = chave;
	}

	public int getBalanceamento() {
		return balanceamento;
	}

	public void setBalanceamento(int balanceamento) {
		this.balanceamento = balanceamento;
	}

	public No getPai() {
		return pai;
	}

	public No setPai(No pai) {
		this.pai = pai;
		return pai;
	}

	public No getDireita() {
		return direita;
	}

	public No setDireita(No direita) {
		this.direita = direita;
		return direita;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
}
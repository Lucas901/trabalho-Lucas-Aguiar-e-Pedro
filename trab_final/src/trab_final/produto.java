package trab_final;

public class produto {
	private String nome;
	private int cod;
	private float pre�o;
	
	public produto(String nome, int cod, float pre�o) {
		this.nome = nome;
		this.cod = cod;
		this.pre�o = pre�o;
	}
	
	public void info() {
		System.out.printf("=================================\n");
		System.out.printf("nome: %s\ncodigo: %d\npre�o: %f\n", this.nome, this.cod, this.pre�o);
		System.out.printf("=================================\n");
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public float getPre�o() {
		return pre�o;
	}

	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
	}
}

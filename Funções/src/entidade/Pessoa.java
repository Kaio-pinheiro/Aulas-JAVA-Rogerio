
package entidade;

public class Pessoa {

	// Atributos da classe
	private String nome;
	private double altura;
	private int idade;
	private double peso;

	// Construtor da classe que inicializa os atributos
	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome; // Inicializa o nome
		this.altura = altura; // Inicializa a idade
		this.idade = idade; // Inicializa a idade
		
	}

	// Métodos getters para acessar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura < 0) {
			System.out.println("ERROR");
		} else {
			this.altura = altura;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("ERROR");
		} else {
			this.idade = idade;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso < 0) {
			System.out.println("ERROR");
		} else {
			this.peso = peso;
		}
	}

	public double calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}

	public boolean ehMaiorDeIdade() {
		if (this.idade >= 16) {
			return true;
		} else {
			return false;
		}
	}

}

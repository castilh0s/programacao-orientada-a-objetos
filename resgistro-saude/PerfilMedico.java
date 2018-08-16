
public class PerfilMedico {
	private String nome;
	private String sobrenome;
	private String sexo;
	private int dia;
	private int mes;
	private int ano;
	private Double altura;
	private Double peso;

	public PerfilMedico(String nome, String sobrenome, String sexo, int dia, int mes, int ano, Double altura,
			Double peso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.ano = ano;

		if (dia > 0 && 31 > dia) {
			this.dia = dia;
		}
		if (mes > 0 && 12 > mes) {
			this.mes = mes;
		}
		if (altura > 0.0) {
			this.altura = altura;
		}
		if (peso > 0.0) {
			this.peso = peso;
		}
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getSexo() {
		return sexo;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public Double getAltura() {
		return altura;
	}

	public Double getPeso() {
		return peso;
	}
}


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

	public int getIdade() {
		return (2018 - ano);
	}

	public int getFcm() {
		int idade = getIdade();

		return (220 - idade);
	}

	public int getFcaMax() {
		int fcm = getFcm();

		return ((fcm * 85) / 100);
	}

	public int getFcaMin() {
		int fcm = getFcm();

		return ((fcm * 50) / 100);
	}

	public Double getImc() {
		return (getPeso() / (getAltura() * getAltura()));
	}

	public String getImcRate() {
		imc = getImc();

		if (imc < 18.5) {
			return "abaixo do peso";
		} else if (imc < 25) {
			return "peso normal";
		} else if (imc < 30) {
			return "sobrepeso";
		} else {
			return "obeso";
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setDia(int dia) {
		if (dia > 0 && 31 > dia) {
			this.dia = dia;
		}
	}

	public void setMes(int mes) {
		if (mes > 0 && 12 > mes) {
			this.mes = mes;
		}
	}

	public void setAno(int ano) {
		if (ano > 0) {			
			this.ano = ano;
		}
	}

	public void setAltura(altura) {
		if (altura > 0.0) {
			this.altura = altura;
		}
	}

	public void setPeso(peso) {
		if (peso > 0.0) {
			this.peso = peso;
		}
	}
}

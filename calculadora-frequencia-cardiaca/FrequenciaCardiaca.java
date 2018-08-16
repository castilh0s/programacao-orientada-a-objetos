
public class FrequenciaCardiaca {
	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;

	public FrequenciaCardiaca(String nome, String sobrenome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.ano = ano;

		if (dia > 0 && 31 > dia) {
			this.dia = dia;
		}
		if (mes > 0 && 12 > mes) {
			this.mes = mes;
		}
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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
		this.ano = ano;
	}
}

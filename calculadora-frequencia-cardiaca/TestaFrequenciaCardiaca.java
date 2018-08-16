
import java.util.Scanner;

public class TestaFrequenciaCardiaca {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		FrequenciaCardiaca perfil = new FrequenciaCardiaca(null, null, 0, 0, 0);

		System.out.printf("Insira o nome da pessoa: ");
		String nome = entrada.nextLine();
		perfil.setNome(nome);

		System.out.printf("Insiro o sobrenome da pessoa: ");
		String sobrenome = entrada.nextLine();
		perfil.setSobrenome(sobrenome);

		System.out.printf("%nInsira o dia de nascimento: ");
		int dia = entrada.nextInt();
		perfil.setDia(dia);

		System.out.printf("Insira o mês de nascimento: ");
		int mes = entrada.nextInt();
		perfil.setMes(mes);

		System.out.printf("Insira o ano de nascimento: ");
		int ano = entrada.nextInt();
		perfil.setAno(ano);

		System.out.printf("%nIdade: %d", perfil.getIdade());
		System.out.printf("%nFCM: %d", perfil.getFcm());
		System.out.printf("%nFCA máximo: %d", perfil.getFcaMax());
		System.out.printf("FCA mínimo: %d", perfil.getFcaMin());

		entrada.close();
	}
}

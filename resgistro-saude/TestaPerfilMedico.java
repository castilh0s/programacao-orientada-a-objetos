
import java.util.Scanner;

public class TestaFrequenciaCardiaca {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		PerfilMedico perfil = new PerfilMedico(null, null, null, 0, 0, 0, 0.0, 0.0);

		System.out.printf("Insira o nome da pessoa: ");
		String nome = entrada.nextLine();
		perfil.setNome(nome);

		System.out.printf("Insiro o sobrenome da pessoa: ");
		String sobrenome = entrada.nextLine();
		perfil.setSobrenome(sobrenome);
		
		System.out.printf("Insiro o sexo da pessoa: ");
		String sexo = entrada.nextLine();
		perfil.setSexo(sexo);

		System.out.printf("%nInsira o dia de nascimento: ");
		int dia = entrada.nextInt();
		perfil.setDia(dia);

		System.out.printf("Insira o mês de nascimento: ");
		int mes = entrada.nextInt();
		perfil.setMes(mes);

		System.out.printf("Insira o ano de nascimento: ");
		int ano = entrada.nextInt();
		perfil.setAno(ano);
		
		System.out.printf("Insira a altura da pessoa: ");
		Double altura = entrada.nextInt();
		perfil.setAltura(altura);
		
		System.out.printf("Insira o peso da pessoa: ");
		Double peso = entrada.nextInt();
		perfil.setPeso(peso);

		System.out.printf("%nIdade: %d", perfil.getIdade());
		System.out.printf("%nFCM: %d", perfil.getFcm());
		System.out.printf("%nFCA máximo: %d", perfil.getFcaMax());
		System.out.printf("%nFCA mínimo: %d", perfil.getFcaMin());
		System.out.printf("%nIMC: %f, %s", perfil.getImc(), perfil.getImcRate());
		entrada.close();
	}
}

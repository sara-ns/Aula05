import java.util.Random;
import java.util.Scanner;

public class TeacherHelper {

	
	public static void main(String[] args) {
		int opcao=0, numeroAulas, qtdeAlunos, i;
		double salarioBase, horaAtividade, descansoSemanalRemunerado, salario, notaAluno, mediaAlunos, horaAula;
		
		//Aqui esta criando um gerador de numeros pseudoaleatorios//
		Random gerador = new Random();
		
		Scanner leitor = new Scanner(System.in);
		
		while(opcao!=4) {
			System.out.println("FERRAMENTA DE AUXILIO AO PROFESSOR!");
			System.out.println("Selecione a opcao desejada:");
			System.out.println("1 - Calcular salario");
			System.out.println("2 - Calcular media de notas dos alunos");
			System.out.println("3 - Exibir a motivacao do dia!");
			System.out.println("4 - Sair do sistema");
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 1:
				/*O salario dos professores de escolas particulares em
				 * Sao Paulo ? composto da seguinte forma 
				 * http://www1.sinprosp.org.br/guia_consultas.asp?mat=8*/
				System.out.println("Para calcular seu salario base precisamos saber quantas aulas semanais o professor tem na instituicao");
				numeroAulas = leitor.nextInt();
				System.out.println("- preciso informar, também, o valor da hora-aula praticado na instituicao");
				horaAula = leitor.nextDouble();
				salarioBase = numeroAulas * 4.5 * horaAula;
				horaAtividade = salarioBase * 0.05;
				descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
				salario = salarioBase + horaAtividade + descansoSemanalRemunerado;
				
				System.out.println("O salario do professor esta composto da seguinte forma:");
				System.out.println("Salario base R$" + salarioBase);
				System.out.println("Hora-atividade R$" + horaAtividade);
				System.out.println("DSR R$" + descansoSemanalRemunerado);
				System.out.println("Salario total R$" + salario);
				
				break;
			case 2:
				System.out.println("Para calcularmos a media das notas dos alunos é preciso saber, primeiramente, quantos alunos estao na turma:");
				qtdeAlunos = leitor.nextInt();
				i = 0;
				mediaAlunos=0;
				while (i<qtdeAlunos) {
					System.out.println("Digite a nota do " + (i+1) + "o aluno:");
					notaAluno = leitor.nextDouble();
					mediaAlunos = mediaAlunos + notaAluno;
					i++;
				}
				mediaAlunos = mediaAlunos / qtdeAlunos;
				System.out.println("A media de notas dos alunos dessa turma! " + mediaAlunos);
				
				break;
			case 3:
				
				//Aqui ele vai sortear um numero de 0 a 6//
				switch(gerador.nextInt(7)) {
				case 0:
					System.out.println("Nao ha bug que voce nao possa superar!");
					break;
				case 1:
					System.out.println("Voce é um professor incrivel!");
					break;
				case 2:
					System.out.println("Que o seu dia seja produtivo!");
					break;
				case 3:
					System.out.println("Que os seus alunos notem a paixao com que voce ensina!");
					break;
				case 4:
					System.out.println("Seu trabalho ajuda a fazer do mundo um lugar melhor!");
					break;
				case 5:
					System.out.println("Quem ensina com o coracao cria um tesouro para a vida toda!");
					break;
				case 6:
					System.out.println("Obrigado por se colocar no dispositivo do saber!");
					break;
					
				}
				
				break;
			case 4:
				System.out.println("Encerrando o sistema...");
				break;
				
			}
		}
	
		leitor.close();

	}

}

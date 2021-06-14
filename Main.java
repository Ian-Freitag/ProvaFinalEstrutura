import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static final ArrayList<No> ArrayList = null;
	static ArvoreAvl arvore = new ArvoreAvl();
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha entre 1 e 5");
		System.out.println("1. Registar um novo veiculo no sistema");
		System.out.println("2. Pesquisar o veiculo pela placa");
		System.out.println("3. Atualizar pontuação");
		System.out.println("4. Relatório dos veículos ordenados pela placa. ");
		System.out.println("5. Relatório dos veículos ordenados pelo nome do proprietário. ");
		System.out.println("6. Parar o programa.");
		int num = input.nextInt();
		
		while(num != 6) {
			
			switch (num) {
			case 1:
				Carro novoCarro = new Carro();
				String cor;
				String placa;
				String nome;
				String marca;
				
				System.out.println("Cor do carro");
				cor = input.next();
				System.out.println("Placa do carro");
				placa = input.next();
				System.out.println("Nome do proprietario do carro");
				nome = input.next();
				System.out.println("Marca do carro");
				marca = input.next();
				
				novoCarro.setCor(cor);
				novoCarro.setPlaca(placa);
				novoCarro.setNomeProprietario(nome);
				novoCarro.setMarca(marca);
				novoCarro.setPontos(0);
				
				//arvore.inserir(novoCarro);
				registrar(novoCarro);
				
				break;
			case 2:
				System.out.println("Digite a placa a ser pesquisada");
				Pesquisar(input.next());
				
				break;
			case 3:
				System.out.println("Digite a placa a ser pesquisada");
				Pesquisar(input.next());
				break;
			case 4:
				OrdemPlaca(ArrayList);
				break;
			case 5:
				System.out.println("Você escolheu 5");
				break;
			default:
				System.out.println("Número inválido");
			}
			System.out.println("Selecione uma nova opção: ");
			num = input.nextInt();
		}
	}
	
	public static void registrar(Carro c) {
		arvore.inserir(c);
	}
	
	public static void Pesquisar(String placa) {
		No novo = arvore.buscar(placa);
		if(novo != null)
		{
			System.out.println("Placa: " + novo.getCarro().getPlaca());
			System.out.println("Cor: " + novo.getCarro().getCor());
			System.out.println("Marca: " + novo.getCarro().getMarca());
			System.out.println("Nome do proprietario: " + novo.getCarro().getNomeProprietario());
			System.out.println("Pontos: " + novo.getCarro().getPontos());
		}
		else
			System.out.println("Placa não encontrada.");
	}
	
	public static void Pontos(int pontos, String placa) {
		Scanner teclado = new Scanner(System.in);
		No novo = arvore.buscar(placa);
		int num; 
		num = teclado.nextInt();
		
		if(novo != null) {
			novo.getCarro().setPontos(novo.getCarro().getPontos() + num);
			
		}
		
	}
	
	public static void OrdemPlaca(ArrayList<No> ArrayList) {
		ArrayList = arvore.inorder();
		System.out.println(ArrayList);
	}
}

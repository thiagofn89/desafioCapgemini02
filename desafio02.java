import java.util.Scanner;
import java.util.Arrays;

class Desafio02 {
    
	/* 	Funcao utilizada para calcular a quantidade de pares existentes em que a diferença seja igual a 'x'
		Entrada: Integer[] - Vetor de inteiros contendo os elementos
				 int - inteiro que indica o tamanho que devera ser a diferenca
		Saida: int - contador indicando a quantidade de pares que a diferenca é a indicada
	*/
    public static int diferenca(Integer[] v, int x){
        int cont = 0;
        
		// Laços que percorrem todos os elementos do vetor em par
		// para encontrar a diferença entre eles
        for(int i=0; i<v.length; i++){
            for(int j=0; j<v.length; j++){
                // Caso a diferença entre eles seja igual a 'x'
				// é acrescentado no contador
                if(v[i]-v[j] == x){
                    cont++;
                }
            }
        }
        
        return cont;
        
    }
    
    public static void main(String args[]) {

      System.out.println("Digite o vetor de inteiros separado por virgula: ");
      // Leitura do vetor de inteiros
	  Scanner stdin = new Scanner(System.in);
      String s = stdin.nextLine();
	  // Separação da string de entrada utilizando o delimitador ","
      String[] vetor = s.split(",");
      Integer[] v = new Integer[vetor.length];
      
	  // Leitura do inteiro 'x'
      System.out.println("Digite um inteiro: ");
      int x = stdin.nextInt();
      
	  // Transformação do vetor de string para inteiro
      for(int i=0; i<vetor.length ; i++){
            String num = vetor[i].trim();
            v[i] = Integer.parseInt(num);
      }
      
      System.out.println("Quantidade de pares= " + diferenca(v,x));
      
    }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Desafio01 {
    
	/* 	Funcao utilizada para calcular a mediana
		Entrada: Integer[] - Vetor com elementos
		Saida: int - Mediana
	*/
    public static int mediana(Integer[] v){
        int m=0;
        int n = v.length;
		// Se a quantidade de elementos no vetor for um numero impar
		// a mediana será o valor central do vetor
    	if(n % 2 == 1){
    		m =v[(n+1)/2-1];
		// Senao, a mediana e a media aritmetica dos dois numeros centrais
    	} else {
    		m=(v[n/2-1]+v[n/2])/2;
    	}
    	
    	return m;
    }
    
    public static void main(String args[]) {

      System.out.println("Digite o vetor de inteiros separado por virgula: ");
	  // Leitura do vetor de inteiros
      Scanner stdin = new Scanner(System.in);
      String s = stdin.nextLine();
	  // Separação da string de entrada utilizando o delimitador ","
      String[] vetor = s.split(",");
      Integer[] v = new Integer[vetor.length];
      
      // Transformação do vetor de string para inteiro
	  for(int i=0; i<vetor.length ; i++){
            String num = vetor[i].trim();
            v[i] = Integer.parseInt(num);
      }
      
	  // Ordenando o vetor de inteiros
      Arrays.sort(v);
      
      System.out.println("Mediana: "+ mediana(v));
      
    }
}
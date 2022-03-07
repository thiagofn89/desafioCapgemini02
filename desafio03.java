import java.util.Scanner;

class Desafio03 {
    
	/*  Funcao utilizada para encriptografar a frase
	    Entrada: String - Frase sem os espacos
				inteiro - raiz do tamanho da frase
		Saida: String - Frase encriptograda
	*/
    public static String encriptografar(String s, int n){
        
        String[] grid = obterGrid(s, n);
        String s_encriptografado = "";
        
		// Laco que percorrera os elementos da frase
        for(int i = 0 ; i < grid[0].length(); i++){
			// Laco que percorrera as frases
            for(int j = 0; j < grid.length; j++) {
                if(grid[j].length() > i){
                    s_encriptografado += grid[j].charAt(i);
                }
            }
            s_encriptografado += " ";
        }
        
        return s_encriptografado;
        
    }
    
	/*  Funcao utilizada para reescrita da frase formando um grid de acordo com a raiz do tamanho
	    Entrada: String - Frase sem os espacos
				inteiro - raiz do tamanho da frase
		Saida: String[] - grid de acordo com a raiz do tamanho
	*/
    public static String[] obterGrid(String s, int n){
		// Criacao de vetor de string que armazenara o grid
		// O tamanho do vetor e o arredondamento para cima da 
		// divisão entre o tamanho da frase sem os espaços e a raiz do tamanho	
        String[] grid = new String[(int) Math.ceil((double)s.length()/n)];
        
		// Laco para percorrer o vetor criado
       for(int i = 0 ; i < grid.length; i++){
		   // Se 'i * n + n' for menor ou igual ao tamanho da frase, a substring gerada será 
		   // os elementos da frase de 'i * n' até 'i * n + n'
           if(i * n + n <= s.length()){
                grid[i] = s.substring(i * n, i * n + n);    
		   // Senao, a substring gerada será os elementos da frase de 'i * n' até o final
           } else {
               grid[i] = s.substring(i * n, s.length());    
           }
           
       }
       
       return grid;
    }
    
    public static void main(String args[]) {

      System.out.println("Insira uma frase para ser encriptografada: ");
	  // Leitura da frase a ser encriptografada
      Scanner stdin = new Scanner(System.in);
      String s = stdin.nextLine();
	  // Retirando os espaços da frase
      s = s.replaceAll(" ", "");
	  
	  // Calculo do tamanho da frase e a raiz do tamanho
      int tamanho = s.length();
      int raiz = (int) Math.ceil(Math.sqrt(tamanho));
      
      System.out.println("Frase criptografada: ");
      System.out.println(encriptografar(s, raiz));
    }
}
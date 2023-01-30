// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class DownloadPacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download
        switch (tamanho) {
     case 0:
        System.out.println();
        break;
     case 1:
        System.out.println("/");
        break;
     case 2:
        System.out.println("//");
        break;
     case 3:
        System.out.println("///");
        break;
        case 4:
        System.out.println("////");
        break;
        case 5:
        System.out.println("/////");
        break;
        case 6:
        System.out.println("//////");
        break;
        case 7:
        System.out.println("///////");
        break;
        case 8:
        System.out.println("////////");
        break;
        case 9:
        System.out.println("/////////");
        break;
        case 10:
        System.out.println("//////////");
        break;
     
      }
    }
}
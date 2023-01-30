import java.util.Scanner;

public class MesadaSobrinho {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        
        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada
        int acumulado = mesada * entrada;
        System.out.println("Voce tera " + acumulado + " reais");
    }
}

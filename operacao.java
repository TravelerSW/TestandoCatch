import java.util.Scanner;

public class operacao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quer dar inicio? 1 para sim e 2 para não\n");
        int res = scanner.nextInt();
        
        if(res !=1){
          scanner.close();
          System.exit(res);  
        }

        do{
            System.out.print("Insira um dividendo: ");
            int dividendo = scanner.nextInt();
            System.out.print("Insira um divisor: ");
            int divisor = scanner.nextInt();
               try{ 
                    int resul = dividendo / divisor;
                    System.out.println("O resultado da operação é: " + resul);
                    System.out.println("Continuar? ");
                    res = scanner.nextInt();

                    
               }catch(ArithmeticException e){
                System.out.println("Não pode ser divido por zero");
               }
        } while(res == 1);
            scanner.close();
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class operacao{
    public static void main(String[] args) {
        int continuar = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qualquer comando para prosseguir ou 'close' para encerrar\n");
        String res = scanner.next();
        
        if(res.equalsIgnoreCase ("close")){
          scanner.close();
          System.exit(0);
          continuar = 1;  
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
                    res = scanner.next();
                    
                if(res.equalsIgnoreCase ("close")){
                    System.exit(0);
                }

                    
                    }   catch(ArithmeticException e){
                            System.out.println("Não pode ser divido por zero");
                        }
                        catch(InputMismatchException e){
                            System.out.println("Insira apenas números.");
                        }
        } while(continuar == 0);
            scanner.close();
    }
}

package projetosalario;

/**
 *
 * @author Aluno
 */
public class ProjetoSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dias = 17;
        double porcentagem = 0.85;
        double valor = 954.00;
        double resultado; 
        resultado = (valor * porcentagem)/100;
 
        System.out.print("Informe os dias trabalhados: ");
         
        System.out.print("Informe o salário: ");
        
     if( dias >= 15 ){
         System.out.println("Recebe o salario de acordo com os dias trabalhados: " + dias);
         System.out.println("A porcentagem encima dos dias trabalhados é: "  + resultado);
     }
     
     else 
        System.out.println("Recebe apenas os dias trabalhados ");
    }
}
    


package exercicio1;

/**
 * @author Yan Vitor
 */
public class BalancoTrimestral 
{
    public static void main(String[] args)
    {
        int gastosJaneiro = 15000, gastosFevereiro = 23000, gastoMarco = 17000;
        
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastoMarco;
        
        System.out.println("O gasto do primeiro trimestre foi de " + gastosTrimestre);
        System.out.println("");
        
        int mediaMensal = (gastosTrimestre)/3;
        
        System.out.println("Valor da média mensal = " + mediaMensal);
    }    
}

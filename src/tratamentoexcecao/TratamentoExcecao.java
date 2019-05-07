/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexcecao;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class TratamentoExcecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MinhaExceptionCustomizada {
        TestesException meuTeste = new TestesException();
        
        
        
        try
        {
            new DivisoraString().divideStringEmDuas("1234567");
            meuTeste.geraExcecaoNull(new TestesException());
            
            meuTeste.geraExcecaoPointer("12345", 4);
            
            meuTeste.geraExcecaoCustomizada();
            
            System.out.println("A execucao terminou completamente sem erro");
        }
        catch (NullPointerException ex)
        {
            ex.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        } 
        catch (MinhaExceptionCustomizada ex) 
        {
            System.out.println(ex.getMessage() + " data do ocorrido " + ex.getDataOcorrido() );
        }
        catch(Exception ex)
        {
             System.out.println("Aconteceu algo estranho, vei ai!" + " " + ex.getMessage());
        }
        finally
        {
            meuTeste= null;
            System.out.println("A execucao terminou");
        }
    }
    
}

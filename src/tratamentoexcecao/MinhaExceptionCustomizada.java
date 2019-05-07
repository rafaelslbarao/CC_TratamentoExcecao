/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexcecao;

/**
 *
 * @author Rafael
 */
public class MinhaExceptionCustomizada extends Exception{
    private String dataOcorrido;
    
    public String getMessage()
    {
        return "Deu ruim"; 
    }

    public String getDataOcorrido() {
        return dataOcorrido;
    }

    public void setDataOcorrido(String dataOcorrido) {
        this.dataOcorrido = dataOcorrido;
    }
    
    
}

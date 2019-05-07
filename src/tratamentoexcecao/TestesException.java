/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexcecao;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public class TestesException {
    
    public void geraExcecaoNull(TestesException teste)
    {
        teste.toString();
    }
    
    public void geraExcecaoPointer(String teste, int posicao)
    {
        char charPego = teste.toCharArray()[posicao];
    }
    
    public void geraExcecaoCustomizada() throws MinhaExceptionCustomizada
    {
        MinhaExceptionCustomizada minhaExcecao = new MinhaExceptionCustomizada();
        minhaExcecao.setDataOcorrido(new Date().toString());
        throw minhaExcecao;
    }
    
}

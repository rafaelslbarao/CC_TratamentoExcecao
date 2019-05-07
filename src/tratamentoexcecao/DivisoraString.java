/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexcecao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class DivisoraString {

    public List<String> divideStringEmDuas(String stringParaDividir) throws Exception {
        ArrayList<String> retorno = null;
        if (stringParaDividir.length() % 2 == 0) {
            retorno = new ArrayList<>();

            String primeiraMetade = stringParaDividir.substring(0, stringParaDividir.length() / 2);
            String segundaMetade = stringParaDividir.substring(stringParaDividir.length() / 2);

            retorno.add(primeiraMetade);
            retorno.add(segundaMetade);
        } else {
            throw new Exception("String deveria ser par");
        }
        return retorno;
    }
}

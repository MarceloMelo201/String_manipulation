package entities;

import java.util.Locale;

public class StringManipulator {

    public static int countVowels(String phrase){

        //Inicializando variável contador
        int count = 0;

        //Transformando a variável phrase totalmente escrita em minúsculo
        String _phrase = phrase.toLowerCase(Locale.ROOT);

        //Varrendo toda a String utilizando um for
        for(int i = 0; i < _phrase.length(); i++){

            //Selecionando cada letra e armazenando em uma variável Char
            char letter = _phrase.charAt(i);

            //Verificando se a letra é vogal
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){

                //Contando o número de vogais
                count ++;
            }
        }

        //Retornando variável contador
        return count;
    }

}

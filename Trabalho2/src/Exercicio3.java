public class Exercicio3 {
    public static boolean palindromo(int numero){
        //converter o numero em string
        String numTexto = Integer.toString(numero);
        String numInvertido = "";
        boolean negativo = numero < 0;

        if (negativo == true) {
            numTexto = Integer.toString(Integer.parseInt(numTexto) * -1);
        }

        //enquanto a variavel "numTexto" tiver mais q 0 caractere rodar o loop
        while(numTexto.length() > 0){
            //aqui ele pega o ultimo caractere do "numTexto" que nesse caso e o numero ultimo numero.
            String valor = numTexto.substring(numTexto.length() -1, numTexto.length());

            //estou adicionando o ultimo caractere e adicionando na "numInvertido"
            numInvertido = numInvertido + valor;
            // estou apagando o ultimo caractere da variavel "numTexto" que nesse caso foi o caractere que tiramos e colocamos na "numInvertido"
            numTexto = numTexto.substring(0, numTexto.length() -1);
        }

        //se o numero incial for negativo, ele ira tranformar o numInvertido em negativo
        if (negativo == true) {
            numInvertido = Integer.toString(Integer.parseInt(numInvertido) * -1);
        }

        //verificar se o numero inserido e igual ao numInvertido
        if(numero == Integer.parseInt(numInvertido)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindromo(-211)?"É UM PALÍNDROMO":"NÃO É UM PALÍNDROMO");
        

    }
}

public class Exercicio1 {
    //verificar se o numero e primo
    public static boolean ePrimo(int num){
        if(num <= 1){
            return false;
        }
        for (int x = 2; x <= num/2; x++) {
            if (num % x == 0){
                return false;
            }
        }
        return true;
    }

    public static int[] VetoresPrimos(int num){
        int[] limite = new int[num];
        int numMais = num + 1;
        for(int i = 0; i < limite.length; i++){
            while(i != num){
                if(ePrimo(numMais) == true){
                    limite[i] = numMais;
                    numMais++;
                    break;
                }
                numMais++;
            }
            
        }
        return limite;
    }
    public static void main(String[] args) {
        int num = 2;
        
        int[] nums= VetoresPrimos(num);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]); 
        }
        

    }
}

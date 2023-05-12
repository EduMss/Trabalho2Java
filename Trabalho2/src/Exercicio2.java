public class Exercicio2 {
    public static String IntervaloDeTempo(int segundos){
        int minutos = 0;

        if (((float)segundos / 60) % 0 == 0){
            minutos = segundos / 60;
        } else {
            minutos = segundos / 60;
            segundos = segundos - (minutos * 60);
        }
        
        int horas = 0;

        if (((float)minutos / 60) % 0 == 0){
            horas = minutos / 60;
        } else {
            horas = minutos / 60;
            minutos = minutos - (horas * 60);
        }

        String tempo = "o tempo foi : " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.";
        return tempo;
    }

    public static void main(String[] args) {
        System.out.println(IntervaloDeTempo(3864)); 
    }
}

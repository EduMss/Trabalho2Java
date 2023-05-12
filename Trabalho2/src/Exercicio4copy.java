public class Exercicio4copy {

    public static class ArCondicionados {
        private int serie;
        private int btu;
        private String arQuente;
        private String cor;
        private String voltagem;
        private String controleRemoto;

        public void SetArCondicionados(int serie, int btu, String arQuente,String cor,String voltagem,String controleRemoto){
            this.serie = serie;
            this.btu = btu;
            this.arQuente = arQuente;
            this.cor = cor;
            this.voltagem = voltagem;
            this.controleRemoto = controleRemoto;
        }

        public String GetArCondicionado(){
            String texto = "serie: " + this.serie + " | BTU: " + this.btu + " | ArQuente: " + this.arQuente +" | cor: " + this.cor +" | voltagem: " + this.voltagem +" | controleRemoto: " + this.controleRemoto;
            return texto;
        }


    }

    public static void main(String[] args) {

        ArCondicionados ar1 = new ArCondicionados();
        ar1.SetArCondicionados(1, 7500, "Não", "-", "-", "-");

        ArCondicionados ar2 = new ArCondicionados();
        ar2.SetArCondicionados(2, 15000, "Sim", "-", "-", "-");

        ArCondicionados ar3 = new ArCondicionados();
        ar3.SetArCondicionados(3, 5000, "Não", "Branco", "110", "Não");

        ArCondicionados ar4 = new ArCondicionados();
        ar4.SetArCondicionados(4, 10000, "Não", "Preta", "220", "Não");


        System.out.println(ar1.GetArCondicionado());
        System.out.println(ar2.GetArCondicionado());
        System.out.println(ar3.GetArCondicionado());
        System.out.println(ar4.GetArCondicionado());

    }
}

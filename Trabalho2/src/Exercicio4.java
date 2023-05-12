public class Exercicio4 {

    public static class ArCondicionados {
        private int serie;
        private int btu;
        private String arQuente;

        public ArCondicionados(int serie, int btu, String arQuente){
            this.serie = serie;
            this.btu = btu;
            this.arQuente = arQuente;
        }

        public String GetArCondicionado(){
            String texto = "serie: " + this.serie + " | BTU: " + this.btu + " | ArQuente: " + this.arQuente;
            return texto;
        }
    }

    public static class ArCondicionadosTunados extends ArCondicionados {
        private String cor;
        private String voltagem;
        private String controleRemoto;

        public ArCondicionadosTunados(int serie, int btu, String arQuente,String cor,String voltagem,String controleRemoto){
            super(serie, btu, arQuente);
            this.cor = cor;
            this.voltagem = voltagem;
            this.controleRemoto = controleRemoto;
        }

        public String GetArCondicionadoTunados(){
            String texto = GetArCondicionado() + " | cor: " + this.cor +" | voltagem: " + this.voltagem +" | controleRemoto: " + this.controleRemoto;
            return texto;
        }
    }

    public static void main(String[] args) {
        
        ArCondicionados ar1 = new ArCondicionados(1, 7500, "Não");

        ArCondicionados ar2 = new ArCondicionados(2, 15000, "Sim");

        ArCondicionadosTunados ar3 = new ArCondicionadosTunados(3, 5000, "Não", "Branco", "110", "Não");

        ArCondicionadosTunados ar4 = new ArCondicionadosTunados(4, 10000, "Não", "Preta", "220", "Não");

        System.out.println(ar1.GetArCondicionado());
        System.out.println(ar2.GetArCondicionado());
        System.out.println(ar3.GetArCondicionadoTunados());
        System.out.println(ar4.GetArCondicionadoTunados());

    }
}

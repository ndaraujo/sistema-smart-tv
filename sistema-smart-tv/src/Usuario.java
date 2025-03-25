public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        smartTv.desligar();

        smartTv.aumentarVolume();

        smartTv.diminuirVolume();
        
        smartTv.aumentarCanal();

        smartTv.diminuirCanal();

        smartTv.mudarCanal(13);

        smartTv.diminuirCanal();
    }
}

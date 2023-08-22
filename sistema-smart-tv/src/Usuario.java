public class Usuario {
    public static void main(String [] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("TV ligada -> Novo status: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(5);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("TV ligada -> Novo status: " + smartTv.ligada);


    }
}

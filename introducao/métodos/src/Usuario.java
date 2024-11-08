public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);
        System.out.println(smartTv.ligado);

        smartTv.ligar();
        smartTv.configurarCanal(5);
        smartTv.configurarVolume(50);
        smartTv.desligar();
    };
};

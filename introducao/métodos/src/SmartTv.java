public class SmartTv {

    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligado = true;
        System.out.println("Ligando TV...");
    };
    
    public void desligar(){
        ligado = false;
        System.out.println("Desligando TV...");
    };

    public void configurarVolume(int valor){
        volume = valor;
        System.out.println("Trocado para o volume para "+ volume);

    };

    public void configurarCanal(int canalNovo){
        canal = canalNovo;
        System.out.println("Trocado para o canal "+ canal);
    }


}

package sistema_smart_tv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.avancarCanal();
        System.out.println("Novo status -> Canal atual? " + smartTv.canal);
        smartTv.avancarCanal();
        System.out.println("Novo status -> Canal atual? " + smartTv.canal);
        smartTv.avancarCanal();
        System.out.println("Novo status -> Canal atual? " + smartTv.canal);
        smartTv.voltarCanal();
        System.out.println("Novo status -> Canal atual? " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo status -> Canal atual? " + smartTv.canal);


        smartTv.diminuirVolume();
        System.out.println("Novo volume -> Volume atual? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo volume -> Volume atual? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo volume -> Volume atual? " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Novo volume -> Volume atual? " + smartTv.volume);
    }
}

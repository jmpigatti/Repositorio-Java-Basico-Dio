public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar (){
        ligada = true;
    }
    public void desligar (){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println (volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println (volume);
    }
    public void proximoCanal(){
        canal++;
        System.out.println (canal);
    }
    public void anteriorCanal(){
        canal--;
        System.out.println (canal);
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println(novoCanal);

    }

}
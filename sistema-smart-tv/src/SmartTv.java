public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;

    }

    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;

    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume ++;
        System.out.println("aumentando o volume para:" + volume);
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume --;
        System.out.println("diminuindo o volume para:" + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Mudando o canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Mudando o canal para: " + canal);
    }




}

package sample.model;

import java.util.Random;

public class Dado {

    //Atributo
    private int face;

    //Construtor inicializando com 0 no valor da face
    public Dado(){
        this.face = 0;
    }

    //Lançar dado e gerar número randomicamente
    public void lancar() {
        Random random = new Random();
        //random = 7 => 0,1,2,3,4,5,6
        while (this.face == 0) this.face = random.nextInt(7);
    }

    //pegar o falor da face
    public int getFace(){
        if(face > 0 && face < 7){
            return this.face;
        }else{
            System.out.println("Jogue o dado novamente");
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(this.face);
    }
}

package Ejercicio7;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

public class FuncionesdeBender {
    private Robot Bender;
    private City PlanetExpress;
    private Thing Entrega;

    public FuncionesdeBender(Robot Bender, City PlanetExpress, Thing Entrega) {
        this.Bender = Bender;
        this.PlanetExpress = PlanetExpress;
        this.Entrega = Entrega;
    }

    public Thing getEntrega() {
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                if((i == 1)||(i==2)||(i==3)||(i==4)||(i==5)||(i==6)||(i==7)||(i==8)||(i==9)||(i==0)){
                    this.Entrega = new Thing(PlanetExpress,i, j);
                }
            }
        }        
        return Entrega;
    }
    
   public FuncionesdeBender(){
       this.PlanetExpress = new City(12,12);
       this.Bender = new Robot(PlanetExpress, 0,0, Direction.EAST);
       getEntrega();
   }
    void Recoger(){
        if(Bender.canPickThing()==true){
            Bender.pickThing();
        }
        Bender.move();
    }
    void RecogerStop(){
        if(Bender.canPickThing()==true){
            Bender.pickThing();
        }
    }
    void Muevete(){
        Bender.move();
    }
    void GiroDerecho(){
        Bender.turnLeft();
        Bender.turnLeft();
        Bender.turnLeft();
    }
    void GiroIzquierda(){
        Bender.turnLeft();
    }
    void Dejar(){
        Bender.putThing();
    }
    int PosicionA(){
        int n = Bender.getAvenue();
        return n;
    }
    int PosicionC(){
        int n = Bender.getStreet();
        return n;
    }     
}

package Ejercicio2;
import becker.robots.*;

public class numeros {
    
    private City Bogota;
    private Wall muro;
    private Thing bola;
    private Robot robot;
    private boolean a=false;
    private boolean a1=false;
    private boolean a2=false;
    private boolean b=false;
    private boolean b1=false;
    private boolean b2=false;
    private boolean c=false;
    private boolean c1=false;
    private boolean c2=false;
    private boolean d=false;
    private boolean d1=false;
    private boolean d2=false;
    private boolean e=false;
    private boolean e1=false;
    private boolean e2=false;
    private boolean f=false;
    private boolean f1=false;
    private boolean f2=false;
    private boolean g=false;
    private boolean g1=false;
    private boolean g2=false;
    private int cajon1 = 0;
    private int cajon2 = 5;
    private int cajon3 = 0;
    private int numeroOculto;
    private int numeroOculto2;
    private int numeroOculto3;

    public numeros () {
        this.Bogota = new City(12,12);
        
        for (int i=1; i<6; i++){ this.muro = new Wall(Bogota, i, 1, Direction.WEST); }
        for (int i=1; i<6; i++){ this.muro = new Wall(Bogota, i, 4, Direction.WEST); }      
        for (int i=1; i<6; i++){ this.muro = new Wall(Bogota, i, 7, Direction.WEST); }
        for (int i=1; i<6; i++){ this.muro = new Wall(Bogota, i, 9, Direction.EAST); }            
        for (int j=1; j<10; j++){ this.muro = new Wall(Bogota, 1, j, Direction.NORTH); } 
        for (int j=3; j<5; j++){ this.muro = new Wall(Bogota, 5, j, Direction.SOUTH); }               
        for (int j=6; j<8; j++){ this.muro = new Wall(Bogota, 5, j, Direction.SOUTH); }                
        this.muro = new Wall(Bogota, 5, 1, Direction.SOUTH);
        this.muro = new Wall(Bogota, 5, 9, Direction.SOUTH);
  
         //cajon 1
        
        if((cajon1==0) || (cajon1==2) || (cajon1==3) || (cajon1==5) || (cajon1==6) || (cajon1==7) || (cajon1==8) || (cajon1==9)){
            a=true;
            for (int j=1; j<4; j++){ this.bola = new Thing (Bogota, 1, j);}     
        }
        if((cajon1==0) || (cajon1==1) || (cajon1==2) || (cajon1==3) || (cajon1==4) || (cajon1==7) || (cajon1==8) || (cajon1==9)){
            b=true;
            for (int i=1; i<4; i++){ this.bola = new Thing (Bogota, i, 3); }
        }
        if((cajon1==0) || (cajon1==1) || (cajon1==3) || (cajon1==4) || (cajon1==5) || (cajon1==6) || (cajon1==7) || (cajon1==8) || (cajon1==9)){
            c=true;
            for (int i=3; i<6; i++){ this.bola = new Thing (Bogota, i, 3);}
        }
        if((cajon1==0) || (cajon1==2) || (cajon1==3) || (cajon1==5) || (cajon1==6) || (cajon1==8) || (cajon1==9)){
            d=true;
            for (int j=1; j<4; j++){ this.bola = new Thing (Bogota, 5, j);}
        }
        if((cajon1==0) || (cajon1==2) || (cajon1==6) || (cajon1==8)){
            e=true;
            for (int i=5; i>2; i--){ this.bola = new Thing (Bogota, i, 1);}
        }
        if((cajon1==0) || (cajon1==4) || (cajon1==5) || (cajon1==6) || (cajon1==8) || (cajon1==9)){
            f=true;
            for (int i=1; i<4; i++){ this.bola = new Thing (Bogota, i, 1);}
        }
        if((cajon1==2) || (cajon1==3) || (cajon1==4) || (cajon1==5) || (cajon1==6) || (cajon1==8) || (cajon1==9)){
            g=true;
            for (int j=1; j<4; j++){ this.bola = new Thing (Bogota, 3, j);}
        }
        
          //cajon 2
        
        if((cajon2==0) || (cajon2==2) || (cajon2==3) || (cajon2==5) || (cajon2==6) || (cajon2==7) || (cajon2==8) || (cajon2==9)){
            a1=true;
            for (int j=4; j<7; j++){ this.bola = new Thing (Bogota, 1, j);}
        }
        if((cajon2==0) || (cajon2==1) || (cajon2==2) || (cajon2==3) || (cajon2==4) || (cajon2==7) || (cajon2==8) || (cajon2==9)){
            b1=true;
            for (int i=1; i<4; i++){ this.bola = new Thing (Bogota, i, 6);}
        } 
        if((cajon2==0) || (cajon2==1) || (cajon2==3) || (cajon2==4) || (cajon2==5) || (cajon2==6) || (cajon2==7) || (cajon2==8) || (cajon1==9)){
            c1=true;
            for (int i=3; i<6; i++){ this.bola = new Thing (Bogota, i, 6);}
        }
        if((cajon2==0) || (cajon2==2) || (cajon2==3) || (cajon2==5) || (cajon2==6) || (cajon2==8) || (cajon2==9)){
            d1=true;
            for (int j=4; j<7; j++){ this.bola = new Thing (Bogota, 5, j);}
        }
        if((cajon2==0) || (cajon2==2) || (cajon2==6) || (cajon2==8)){
            e1=true;
            for (int i=5; i>2; i--){ this.bola = new Thing (Bogota, i, 4);}
        }
        if((cajon2==0) || (cajon2==4) || (cajon2==5) || (cajon2==6) || (cajon2==8) || (cajon2==9)){
            f1=true;
            for (int i=1; i<4; i++){ this.bola = new Thing (Bogota, i, 4);}
        }
        if((cajon2==2) || (cajon2==3) || (cajon2==4) || (cajon2==5) || (cajon2==6) || (cajon2==8) || (cajon2==9)){
            g1=true;
            for (int j=4; j<7; j++){ this.bola = new Thing (Bogota, 3, j);}
        }
        
          //cajon 3
        
        if((cajon3==0) || (cajon3==2) || (cajon3==3) || (cajon3==5) || (cajon3==6) || (cajon3==7) || (cajon3==8) || (cajon3==9)){
            a2=true;
            for (int j=7; j<10; j++){ this.bola = new Thing (Bogota, 1, j);}
        }
        if((cajon3==0) || (cajon3==1) || (cajon3==2) || (cajon3==3) || (cajon3==4) || (cajon3==7) || (cajon3==8) || (cajon3==9)){
            b2=true;
            for (int i=1; i<4; i++){ this.bola = new Thing (Bogota, i, 9);}
        }
        if((cajon3==0) || (cajon3==1) || (cajon3==3) || (cajon3==4) || (cajon3==5) || (cajon3==6) || (cajon3==7) || (cajon3==8) || (cajon1==9)){
            c2=true;
            for (int i=3; i<6; i++){this.bola = new Thing (Bogota, i, 9);}
        }
        if((cajon3)==0 || (cajon3)==2 || (cajon3)==3 || (cajon3)==5 || (cajon3)==6 || (cajon3)==8 || (cajon3==9)){
            d2=true;
            for (int j=7; j<10; j++){ this.bola = new Thing (Bogota, 5, j);}
        }
        if((cajon3==0) || (cajon3==2) || (cajon3==6) || (cajon3==8)){
            e2=true;
            for (int i=5; i>2; i--){ this.bola = new Thing (Bogota, i, 7);}
        }
        if((cajon3==0) || (cajon3==4) || (cajon3==5) || (cajon3==6) || (cajon3==8) || (cajon3==9)){
            f2=true;
            for (int i=1; i<4; i++){ this.bola = new Thing (Bogota, i, 7);}
        }
        if((cajon3==2) || (cajon3==3) || (cajon3==4) || (cajon3==5) || (cajon3==6) || (cajon3==8) || (cajon3==9)){
            g2=true;
            for (int j=7; j<10; j++){ this.bola = new Thing (Bogota, 3, j);}
        }
        
        //robot
        this.robot = new Robot(Bogota, 6, 2, Direction.NORTH);
        }

    public int getNumeroOculto() {
               
        if((a==true) && (b==true) && (c==true) && (d==true) && (e==true) && (f==true) && (g==false)){this.numeroOculto = 0;} 
        if((a==false) && (b==true) && (c==true) && (d==false) && (e==false) && (f==false) && (g=false)){this.numeroOculto = 1;}
        if((a==true) && (b==true) && (c==false) && (f=false) && (g==true) && (e==true) && (d==true)){this.numeroOculto = 2;}
        if((a==true) && (b==true) && (c==true) && (d==true) && (e==false) && (f=false) && (g==true)){this.numeroOculto = 3;}
        if((f==true) && (g==true) && (b==true) && (c==true) && (a==false) && (d==false) && (e==false)){this.numeroOculto = 4;}
        if((a==true) && (b==false) && (c==true) && (d==true) && (e==false) && (f==true) && (g==true)){this.numeroOculto = 5;}
        if((a==true) && (b==false) && (f==true) && (g==true) && (c==true) && (d==true) && (e==true)){this.numeroOculto = 6;}
        if((a==true) && (b==true) && (c==true) && (d==false) && (e==false) && (f==false) && (g==false)){this.numeroOculto = 7;}
        if((a==true) && (b==true) && (c==true) && (d==true) && (e==true) && (f==true) && (g==true)){this.numeroOculto = 8;}
        if((a==true) && (b==true) && (c==true) && (d==true) && (e==false) && (f==true) && (g==true)){this.numeroOculto = 9;}

        return numeroOculto;
    }

    public void setNumeroOculto(int numeroOculto) {
        this.numeroOculto = numeroOculto;
    }
    
      public int getNumeroOculto2() {
               
        if((a1==true) && (b1==true) && (c1==true) && (d1==true) && (e1==true) && (f1==true) && (g1==false)){this.numeroOculto2 = 0;} 
        if((a1==false) && (b1==true) && (c1==true) && (d1==false) && (e1==false) && (f1==false) && (g1=false)){this.numeroOculto2 = 1;}
        if((a1==true) && (b1==true) && (c1==false) && (f1=false) && (g1==true) && (e1==true) && (d1==true)){this.numeroOculto2 = 2;}
        if((a1==true) && (b1==true) && (c1==true) && (d1==true) && (e1==false) && (f1=false) && (g1==true)){this.numeroOculto2 = 3;}
        if((f1==true) && (g1==true) && (b1==true) && (c1==true) && (a1==false) && (d1==false) && (e1==false)){this.numeroOculto2 = 4;}
        if((a1==true) && (b1==false) && (c1==true) && (d1==true) && (e1==false) && (f1==true) && (g1==true)){this.numeroOculto2 = 5;}
        if((a1==true) && (b1==false) && (f1==true) && (g1==true) && (c1==true) && (d1==true) && (e1==true)){this.numeroOculto2 = 6;}
        if((a1==true) && (b1==true) && (c1==true) && (d1==false) && (e1==false) && (f1==false) && (g1==false)){this.numeroOculto2 = 7;}
        if((a1==true) && (b1==true) && (c1==true) && (d1==true) && (e1==true) && (f1==true) && (g1==true)){this.numeroOculto2 = 8;}
        if((a1==true) && (b1==true) && (c1==true) && (d1==true) && (e1==false) && (f1==true) && (g1==true)){this.numeroOculto2 = 9;}

        return numeroOculto2;
    }

    public void setNumeroOculto2(int numeroOculto2) {
        this.numeroOculto2 = numeroOculto2;
    }
    
    public int getNumeroOculto3() {
               
        if((a2==true) && (b2==true) && (c2==true) && (d2==true) && (e2==true) && (f2==true) && (g2==false)){this.numeroOculto3 = 0;} 
        if((a2==false) && (b2==true) && (c2==true) && (d2==false) && (e2==false) && (f2==false) && (g2=false)){this.numeroOculto3 = 1;}
        if((a2==true) && (b2==true) && (c2==false) && (f2=false) && (g2==true) && (e2==true) && (d2==true)){this.numeroOculto3 = 2;}
        if((a2==true) && (b2==true) && (c2==true) && (d2==true) && (e2==false) && (f2=false) && (g2==true)){this.numeroOculto3 = 3;}
        if((f2==true) && (g2==true) && (b2==true) && (c2==true) && (a2=false) && (d2==false) && (e2==false)){this.numeroOculto3 = 4;}
        if((a2==true) && (b2==false) && (c2==true) && (d2==true) && (e2==false) && (f2==true) && (g2==true)){this.numeroOculto3 = 5;}
        if((a2==true) && (b2==false) && (f2==true) && (g2==true) && (c2==true) && (d2==true) && (e2==true)){this.numeroOculto3 = 6;}
        if((a2==true) && (b2==true) && (c2==true) && (d2==false) && (e2==false) && (f2==false) && (g2==false)){this.numeroOculto3 = 7;}
        if((a2==true) && (b2==true) && (c2==true) && (d2==true) && (e2==true) && (f2==true) && (g2==true)){this.numeroOculto3 = 8;}
        if((a2==true) && (b2==true) && (c2==true) && (d2==true) && (e2==false) && (f2==true) && (g2==true)){this.numeroOculto3 = 9;}

        return numeroOculto3;
    }
    public void setNumeroOculto3(int numeroOculto3) {
        this.numeroOculto3 = numeroOculto3;
    }
    public void avanzar(){
            this.robot.move();
    }
    public void girarIzquierda(){
            this.robot.turnLeft();
    }
    public void girarDerecha(){
        for (int i=0; i<3; i=i+1){
            this.robot.turnLeft();
        }
    }
    public void validar(){
            this.robot.examineThings();
    }
}
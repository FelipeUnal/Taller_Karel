
package Ejercicio7;


public class Figuras {
    
    FuncionesdeBender a = new FuncionesdeBender();
    
    void RecogerTodo(){
        for(int i = 0; i<=144; i++){
            if((a.PosicionC() == 11)&&(a.PosicionA() == 0)){
                a.RecogerStop();
            }
            else{
                if(a.PosicionA() == 11){
                    a.GiroDerecho();
                }
                if((a.PosicionA() == 0)&&(a.PosicionC()!=0)){
                    a.GiroIzquierda();
                }
                a.RecogerStop();
                a.Muevete();
            }
        }
    }
    void SpaceInvaders(){
         for(int i = 0; i<=144; i++){
            if((a.PosicionC() == 11)&&(a.PosicionA() == 0)){
                a.GiroIzquierda();
                a.GiroIzquierda();
                a.Muevete();
            }else 
            if((a.PosicionC() == 0)&&(a.PosicionA() == 0)){
                a.RecogerStop();
                a.GiroIzquierda();
            }else{
                if((a.PosicionA() == 0)&&(a.PosicionC()!=11)){
                    a.GiroDerecho();
                }
                if((a.PosicionA() == 11)){
                    a.GiroIzquierda();
                }
                if((a.PosicionC()==8)&&((a.PosicionA()==4)||(a.PosicionA()==5)||(a.PosicionA()==7)||(a.PosicionA()==8))){
                    a.Dejar();
                }
                if((a.PosicionC()==7)&&((a.PosicionA()==1)||(a.PosicionA()==3)||(a.PosicionA()==9)||(a.PosicionA()==11))){
                    a.Dejar();
                }
                if((a.PosicionC()==6)&&((a.PosicionA()>=1)&&(a.PosicionA()<=11))){
                    a.Dejar();
                }
                if((a.PosicionC()==5)&&((a.PosicionA()!=0)&&(a.PosicionA()!=1)&&(a.PosicionA()!=4)&&(a.PosicionA()!=8)&&(a.PosicionA()!=11))){
                    a.Dejar();
                }
                if((a.PosicionC()==4)&&((a.PosicionA()>=3)&&(a.PosicionA()<=9))){
                    a.Dejar();
                }
                if((a.PosicionC()==3)&&((a.PosicionA()==4)||(a.PosicionA()==8))){
                    a.Dejar();
                }
                if((a.PosicionC()==2)&&((a.PosicionA()==3)||(a.PosicionA()==9))){
                    a.Dejar();
                }
                a.Muevete();
            }
        }
    }
}

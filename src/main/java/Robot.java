
public class Robot {
    private int num;
    private int vida;
    public Robot(int numero,int porcentaje){
        num = numero;
        vida = porcentaje;
    }
    
    public void mostrar()
    {
        System.out.println("Numero de Robot: " + num);
        System.out.println("Porcentaje de Vida" + vida);
    }
    public int getvida(){
     return vida;
    }
    public int getnumero(){
     return num;
    }
    public void setvida (int vid){
    this.vida = vid;
    }
    public void setnumero(int num){
    this.num = num;
    }
    
}

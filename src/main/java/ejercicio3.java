
import java.util.ArrayList;
import java.util.List;


public class ejercicio3{
    public static void main(String[] args) {
        int n = (int)(Math.random()*(10-5+1)+5);
        System.out.println("cantidad = " + n);
        Robot Objetos[]=new Robot[n];
        int vida;
        int i =0;
        for(i=0;i<n;i++)
        {
            vida = (int)(Math.random()*(100-1+1)+1);
            Objetos[i]= new Robot(i,vida);
        }
        //ordenar por vida
        int j=0;
        int tempv =0;
        int tempn=0;
        
        for ( i = 0; i < n; i++) {
            for (j = 0; j < n-1; j++) {
            if(Objetos[j].getvida() > Objetos[j+1].getvida() ){
                tempv= Objetos[j+1].getvida();
                tempn= Objetos[j+1].getnumero();
                
                Objetos[j+1].setnumero(Objetos[j].getnumero());
                Objetos[j+1].setvida(Objetos[j].getvida());
                
                Objetos[j].setvida(tempv);
                Objetos[j].setnumero(tempn);
            }
        }
        }        
        
        for(i=0;i<n;i++)
        {
            Objetos[i].mostrar();  
        }
        
        System.out.println("=================================================================================");
        int contador=0;
        for(i=0;i<n;i++)
        {
            if(Objetos[i].getvida() > 50)
            {
                contador = contador +1;
            }
        }
        System.out.println("El numero de robots con mas del 50% de vida es = " + contador);
        System.out.println("Los robots con mayor porcentaje de vida son los numeros: " + Objetos[n-1].getnumero()+ ", " + Objetos[n-2].getnumero() + ", " + Objetos[n-3].getnumero());
        
        
        
    }
    
}

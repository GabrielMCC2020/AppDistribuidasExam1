package productores;

public class Productor implements Runnable{
    Cola colaCompartida;
    public Productor(Cola cola){
            this.colaCompartida=cola;
    }
    public void run() {
       while (true){
               int num=Utilidades.numAzar(10);
               while (colaCompartida.encolar(num)==false){
                       Utilidades.esperarTiempoAzar(3000);
               } /*Fin del while*/

               System.out.println("Productor encol� el numero:"+num);
       } /*Fin del while externo*/
    } /*Fin de run()*/
} /*Fin de la clase*/
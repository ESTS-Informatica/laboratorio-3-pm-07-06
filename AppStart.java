
/**
 * Escreva uma descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppStart
{
    public static void main (String[] args){
        ShippingCompany sc = new ShippingCompany("RELIABLE-MOVING");
        
        sc.add(new GroundTransportation());
        sc.add(new AirTransportation());
        sc.add(new AirTransportation());
        sc.add(new Lorry());
        sc.add(new Van());
        System.out.print(sc.toString());
    }
}

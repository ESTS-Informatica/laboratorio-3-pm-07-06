import java.util.ArrayList;
import java.util.HashSet;
/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private ArrayList<Transport> inService;
    /**
     * Construtor para objetos da classe ShippingCompany
     */
     public ShippingCompany()
    {
        // inicializa variáveis de instância
        this.name = "";
        inService = new ArrayList<>();
    }
    public ShippingCompany(String name)
    {
        // inicializa variáveis de instância
        this.name = name;
        inService = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Transport> getInService(){
        return inService;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da Compania: " + getName() + "\n");
        for(Transport transport : this){
            sb.append(transport.toString());
        }
        return sb.toString();
    }
    public Transport getTransport(String id){
        for(Transport transport : this){
            if(transport.getId().equals(id)){return transport;}
        }
        return null;
    }
    public Transport getTransportInService(String id){
        for(Transport transport : inService){
            if(transport.getId().equals(id)){return transport;}
        }
        return null;
    }
    public void makeTransportation(String id, String origin, String destination, double price){
        Transport transport = getTransport(id);
        if(transport != null && transport.isAvailable()){
                transport.setOrigin(origin);
                transport.setDestination(destination);
                transport.setPrice(price);
                transport.setAvailable(false);
                inService.add(transport);
                this.remove(transport);
        }
    }
    public void finalizeTransportation(String id){
        Transport transport = getTransportInService(id);
        if(transport != null){
            transport.setOrigin("");
            transport.setDestination("");
            transport.setPrice(0.0);
            transport.setAvailable(true);
            this.add(transport);
            inService.remove(transport);
        }
    }
}
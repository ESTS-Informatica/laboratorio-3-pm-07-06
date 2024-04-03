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
    private Transport getTransportation(String id){
        for(Transport transport : this){
            if(transport.getId() == id)return transport;
        }
        return null;
    }
    private Transport getTransport(String id){
        for(Transport transport : inService){
            if(transport.getId() == id)return transport;
        }
        return null;
    }
    public void makeTransportation(String id, String origin, String destination, double price){
           Transport transport = getTransportation(id);
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
        Transport transport = getTransport(id);
        if(transport != null){
            inService.remove(transport);
            transport.setOrigin("");
            transport.setDestination("");
            transport.setPrice(0.0);
            transport.setAvailable(true);
            this.add(transport);
        }
    }
    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
}

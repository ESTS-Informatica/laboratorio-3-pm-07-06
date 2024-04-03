
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private int numberOfContainers;
    private final double airFee = 0.04;
    /**
     * Construtor para objetos da classe AirTransportation
     */
    public AirTransportation()
    {
        // inicializa variáveis de instância
        super();
        this.name = "";
        this.numberOfContainers = 0;
    }
    public AirTransportation(String name, int NumberOfContainers)
    {
        // inicializa variáveis de instância
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNumberOfContainers(){
        return numberOfContainers;
    }
    public void setContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }
    public double getPriceWithFees(){
        return getPrice() * airFee;
    }
    public String getTransportType(){
        return "Air";
    }
}


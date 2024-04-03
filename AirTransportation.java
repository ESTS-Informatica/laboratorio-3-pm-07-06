import java.lang.StringBuilder;
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
    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }
    public double getPriceWithFees(){
        return getPrice() * airFee;
    }
    
    @Override
    public String getTransportType(){
        return "Air";
    }
    
    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("matricula: " + getName() + "\n");
        sb.append("Numero de contentores: " + getNumberOfContainers() + "\n");
        return sb.toString();
    }
}


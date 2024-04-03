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
        setFees(airFee*100);
    }
    public AirTransportation(String name, int numberOfContainers)
    {
        // inicializa variáveis de instância
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(airFee*100);
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
        if(numberOfContainers>0){
            this.numberOfContainers = numberOfContainers;
        }
    }
    public double getPriceWithFees(){
        return getPrice() * (airFee+1);
    }
    
    @Override
    public String getTransportType(){
        return "Transporte Aereo";
    }
    
    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("           Nome: " + getName() + "\n");
        sb.append("  NºContentores: " + getNumberOfContainers() + "\n");
        return sb.toString();
    }
}


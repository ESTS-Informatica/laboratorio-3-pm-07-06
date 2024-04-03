import java.lang.StringBuilder;
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String licensePlate;
    private final double fee = 0.03;
    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation()
    {
        // inicializa variáveis de instância
        super();
        this.licensePlate = "";
    }
    public GroundTransportation(String licensePlate)
    {
        // inicializa variáveis de instância
        super();
        this.licensePlate = licensePlate;
    }
    public String getLicensePlate(){
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    public double getPriceWithFees(){
        return getPrice() * fee;
    }
    @Override
    public String getTransportType(){
        return "Ground";
    }
    
    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("matricula: " + getLicensePlate() + "\n");
        return sb.toString();
    }
}


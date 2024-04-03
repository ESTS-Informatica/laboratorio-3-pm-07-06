import java.lang.StringBuilder;
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int numberOfPallets;
    private int trailers;
    /**
     * Construtor para objetos da classe Lorry
     */
    public Lorry()
    {
        // inicializa variáveis de instância
        super();
        this.numberOfPallets = 0;
        this.trailers = 0;
    }
    public Lorry(int numberOfPallets, int trailers, String licensePlate)
    {
        // inicializa variáveis de instância
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }
    public int getTrailers(){
        return trailers;
    }
    public void setTrailers(int trailers){
        this.trailers = trailers;
    }
    
    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Numero de Paletes: " + getNumberOfPallets()));
        sb.append(String.format("Numero de atrelados " + getTrailers()));
        return sb.toString();
    }
    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
}

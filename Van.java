import java.lang.StringBuilder;
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int packages;

    /**
     * Construtor para objetos da classe Van
     */
    public Van()
    {
        // inicializa variáveis de instância
        super();
        this.packages = 0;
    }
    public Van(int packages, String licensePlate)
    {
        // inicializa variáveis de instância
        super(licensePlate);
        this.packages = packages;
    }
    public int getPackages(){
        return packages;
    }
    public void setPackages(int packages){
        this.packages = packages;
    }
    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Numero de Pacotes: " + getPackages() + "\n");
        return sb.toString();
    }
    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
}

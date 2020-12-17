package atividadementorama2;

import java.time.Year;
/**
 *
 * @author Victor
 */
public class Carro {
    
    
    private int pneus;
    private int portas;
    private int airBags;
    private int lugares;
    private String combustivel;
    private long numeroChassi;
    private String marca;
    private String modelo;
    private String cor;
    private Boolean som;
    private Boolean direcaoHidraulica;
    private Boolean vidroEletrico;
    private Boolean arCondicionado;
    private Year anoDeFabricacao;

    public Carro(String modelo, String marca, int pneus, int portas, int airBags, int lugares, String combustivel, long numeroChassi, Year anoDeFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.pneus = pneus;
        this.portas = portas;
        this.airBags = airBags;
        this.lugares = lugares;
        this.combustivel = combustivel;
        this.numeroChassi = numeroChassi;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    
    
    public int getPneus() {
        return pneus;
    }

    public void setPneus(int pneus) {
        this.pneus = pneus;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getAirBags() {
        return airBags;
    }

    public void setAirBags(int airBags) {
        this.airBags = airBags;
    }

    public int getLugares() {
        return lugares;
    }
    
        public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public long getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(long numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getSom() {
        return som;
    }

    public void setSom(Boolean som) {
        this.som = som;
    }

    public Boolean getDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(Boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public Boolean getVidroEletrico() {
        return vidroEletrico;
    }

    public void setVidroEletrico(Boolean vidroEletrico) {
        this.vidroEletrico = vidroEletrico;
    }

    public Boolean getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(Boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public Year getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(Year anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Carro{"  +  " Marca = " + marca 
                + ",\n Modelo = " + modelo 
                + ",\n Quantidade de Pneus = " + pneus 
                + ",\n Portas = " + portas 
                + ",\n Quantidade de Airbags? " + airBags 
                + ",\n Lugares = " + lugares 
                + ",\n Combustivel = " + combustivel 
                + ",\n Número do Chassi = " + numeroChassi 
                + ",\n cor = " + cor 
                + ",\n som = " + som 
                + ",\n Direção Hidraulica?" + direcaoHidraulica 
                + ",\n Vidro Eletrico:" + vidroEletrico 
                + ",\n arCondicionado = " + arCondicionado 
                + ",\n anoDeFabricacao = " + anoDeFabricacao + '}';
    }
    
    
    
}

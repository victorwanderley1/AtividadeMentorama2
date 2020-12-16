/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadementorama2;

import java.util.Date;

/**
 *
 * @author Victor-Vanessa
 */
public class Carro {
    
    public final int GASOLINA = 1;
    public final int ALCOOL = 2;
    public final int DIESEL = 3;
    public final int GNV = 4;
    
    private int pneus;
    private int portas;
    private int airBags;
    private int lugares;
    private int combustivel;
    private long numeroChassi;
    private String marca;
    private String modelo;
    private String cor;
    private Boolean som;
    private Boolean direcaoHidraulica;
    private Boolean vidroEletrico;
    private Boolean arCondicionado;
    private Date anoDeFabricacao;

    public Carro(int pneus, int portas, int airBags, int lugares, int combustivel, long numeroChassi, Date anoDeFabricacao) {
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
    
        public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
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

    public Date getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(Date anoDeFabricacao) {
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
    
}

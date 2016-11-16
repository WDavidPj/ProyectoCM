/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Wdavid
 */
public class Ropa implements java.io.Serializable {

    private String TelaColor;
    private String TipodeTela;
    private String MetrodeTela;
    private String Sexo;
    private String Talla;
    private String Hilo;
    private String Botones;
    private String Moda;
    private String Corredera;

    public Ropa(String TelaColor, String TipodeTela, String MetrodeTela, String Sexo, String Talla, String Hilo, String Botones, String Moda, String Corredera) {
        this.TelaColor = TelaColor;
        this.TipodeTela = TipodeTela;
        this.MetrodeTela = MetrodeTela;
        this.Sexo = Sexo;
        this.Talla = Talla;
        this.Hilo = Hilo;
        this.Botones = Botones;
        this.Moda = Moda;
        this.Corredera = Corredera;
    }

    public String getTelaColor() {
        return TelaColor;
    }

    public void setTelaColor(String TelaColor) {
        this.TelaColor = TelaColor;
    }

    public String getTipodeTela() {
        return TipodeTela;
    }

    public void setTipodeTela(String TipodeTela) {
        this.TipodeTela = TipodeTela;
    }

    public String getMetrodeTela() {
        return MetrodeTela;
    }

    public void setMetrodeTela(String MetrodeTela) {
        this.MetrodeTela = MetrodeTela;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getHilo() {
        return Hilo;
    }

    public void setHilo(String Hilo) {
        this.Hilo = Hilo;
    }

    public String getBotones() {
        return Botones;
    }

    public void setBotones(String Botones) {
        this.Botones = Botones;
    }

    public String getModa() {
        return Moda;
    }

    public void setModa(String Moda) {
        this.Moda = Moda;
    }

    public String getCorredera() {
        return Corredera;
    }

    public void setCorredera(String Corredera) {
        this.Corredera = Corredera;
    }

    
    
    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);

    }
}

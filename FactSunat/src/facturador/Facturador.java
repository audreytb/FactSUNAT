/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Usuario
 */
@XmlRootElement
public class Facturador {
    private int NumBol;
    private String NombCli;
    private String DirCli;
    private int DNICli;
    private String Fecha;
    
    public Facturador(){}

    public int getNumBol() {
        return NumBol;
    }
    @XmlElement
    public void setNumBol(int NumBol) {
        this.NumBol = NumBol;
    }

    public String getNombCli() {
        return NombCli;
    }
@XmlElement   
    public void setNombCli(String NombCli) {
        this.NombCli = NombCli;
    }

    public String getDirCli() {
        return DirCli;
    }
 @XmlElement   
    public void setDirCli(String DirCli) {
        this.DirCli = DirCli;
    }

    public int getDNICli() {
        return DNICli;
    }
@XmlElement
    public void setDNICli(int DNICli) {
        this.DNICli = DNICli;
    }

    public String getFecha() {
        return Fecha;
    }
@XmlElement
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
}

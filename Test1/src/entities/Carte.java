package entities;

import java.sql.Date;

public class Carte {
    private int id;
    private String numero; 
    private Date dateexpiration;
    private int code;
    Cheque cheque=new Cheque();
    
    public Cheque getCheque() {
        return cheque;
    }
    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }
    public Carte() {
    }
 public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Date getDateexpiration() {
        return dateexpiration;
    }
    public void setDateexpiration(Date dateexpiration) {
        this.dateexpiration = dateexpiration;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    
}

    


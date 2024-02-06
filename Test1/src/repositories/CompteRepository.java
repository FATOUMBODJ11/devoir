package repositories;

import java.util.ArrayList;

import entities.Compte;

public class CompteRepository {
    private ArrayList<Compte> Compte;

    public void insert(Compte compte){
        Compte.add(compte);
    }
    public ArrayList<Compte> selectAll(){
        return Compte;
    }
    
}

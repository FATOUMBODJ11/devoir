package services;

import java.util.ArrayList;

import repositories.CompteRepository;
import entities.Compte;
import entities.Client;

public class CompteService {
    private CompteRepository compteRepository;
    public void ajoutercompte(Compte compte){
    compteRepository.insert(compte);
    }
    public ArrayList<Compte> listerCompte(){
        return null;
    }

    public ArrayList<Compte> listerCompte(Client client){
         return null;
    }
}


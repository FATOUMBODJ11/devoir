package services;

import entities.Carte;
import repositories.CarteRepository;

public class CarteService {
    private CarteRepository carteRepository= new CarteRepository();
    public void addcarte(Carte carte){
        carteRepository.insert(carte);
    }
    
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Agence;
import entities.Cheque;
import entities.Client;
import entities.Compte;
import entities.ETypeCompte;
import entities.Epargne;
import services.AgenceService;
import services.ClientService;
import services.CompteService;


public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);
        AgenceService agenceService = new AgenceService();
        ClientService clientService = new ClientService();
        CompteService compteService = new CompteService();
        do{
            System.out.println("1-Ajouter une Agence");
            System.out.println("2-Lister Toutes les Agences");
            System.out.println("3-Lister une Agence Par un numero");
            System.out.println("4-Creer un  Client");
            System.out.println("5-Lister Toutes les Clients");
            System.out.println("6-Ajouter un compte ");
            System.out.println("7-Lister les comptes d'un clients ");
            System.out.println("8-Lister les comptes ");
            System.out.println("9-affecter les cartes");
            System.out.println("10-Quitter");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix){
                case 1:
                System.out.println("Entrer un numero");
                String numero = sc.nextLine();
                System.out.println("Entrer un Telephone");
                String tel = sc.nextLine();
                System.out.println("Entrer une Adresse");
                String adresse = sc.nextLine();
                Agence ag = new Agence();
                ag.setNumero(numero);
                ag.setTelephone(tel);
                ag.setAdresse(adresse);
                agenceService.ajouterAgence(ag);
                break;

                case 2:
                    List<Agence> agences = agenceService.listerAgence();
                    for (Agence agence : agences) {
                        System.out.println("Numero " + agence.getNumero());
                        System.out.println("Telephone " + agence.getTelephone());
                        System.out.println("Adresse " + agence.getAdresse());
                        System.out.println("=================================");
                    }
                    break;
                case 3:
                    System.out.println("Entrer un numero");
                    numero = sc.nextLine();
                    Agence agence = agenceService.listerAgence(numero);
                    if (agence != null) {
                        System.out.println("Numero " + agence.getNumero());
                        System.out.println("Telephone " + agence.getTelephone());
                        System.out.println("Adresse " + agence.getAdresse());
                    } else {
                        System.out.println("Erreur sur le numero");
                    }
                    System.out.println("=================================");
                    break;

                case 4:
                    System.out.println("Entrer un Nom");
                    String nom = sc.nextLine();
                    System.out.println("Entrer un Prenom");
                    String prenom = sc.nextLine();
                    System.out.println("Entrer le Telephone");
                    tel = sc.nextLine();
                    Client client = new Client();
                    client.setNom(nom);
                    client.setPrenom(prenom);
                    client.setTelephone(tel);
                    clientService.ajouterClient(client);
                    break;
                case 5:
                    List<Client> clients = clientService.listerClient();
                    for (Client cl : clients) {
                        System.out.println("Nom " + cl.getNom());
                        System.out.println("Prenom " + cl.getPrenom());
                        System.out.println("Telephone " + cl.getTelephone());
                        System.out.println("=================================");
                    }
                    break;
                case 6:
                    System.out.println("Saisir le numero du client ");
                    numero=sc.nextLine();
                    System.out.println("Entrer le solde");
                    double solde=sc.nextDouble();
                      System.out.println("Veuillez selectionner un type");
                      System.out.println("1-Cheque");
                      System.out.println("2-Epargne");

                      int type=sc.nextInt();
                      if(type==1){
                        System.out.println("Entrer les Frais");
                        double frais=sc.nextDouble();
                        Cheque compte=new Cheque();
                        compte.setNumero(numero);
                        compte.setSolde(solde);
                        compte.setFrais(frais);
                        compte.setType(ETypeCompte.Cheque);

                      }else if (type==2) {
                        System.out.println("Entrer le taux ");
                        double taux=sc.nextDouble();
                        Epargne compte=new Epargne();
                        compte.setNumero(numero);
                        compte.setSolde(solde);
                        compte.setTaux(taux);
                        compte.setType(ETypeCompte.Epargne);
                      }
                    break;

                case 7:
                    ArrayList<Compte> comptes = new ArrayList<>();
                    comptes = compteService.listerCompte();
                    for (Compte cpt : comptes) {
                        System.out.println(cpt);
                    }
                    break;
                case 8:
                List<Compte> comptes = compteService.listerCompte();
                for (Compte compte : comptes) {
                    System.out.println("Nom " + compte.getNumero());
                    System.out.println("Prenom " + compte.getSolde());
                    System.out.println("=================================");
                }
                    break;
                default:
                    break;
            
            }

        }while (2 != 10); 
    }
}

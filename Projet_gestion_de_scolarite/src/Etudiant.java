import java.io.NotActiveException;

public class Etudiant extends Personne{
    private int matricule;
   private Departement departement;
   public float []listnot ;

    public Etudiant(int id, String nom, String prenom, int matricule, Departement departement, float[] listnot) {
        super(id, nom, prenom);
        this.matricule = matricule;
        this.departement = departement;
        this.listnot = listnot;
    }
    public void ajouterNote(float a){
        listnot[listnot.length]=a;

    }
    public double calculerMoyenne(){
        double c=0;
        for (int i = 0; i<listnot.length; ++i){
            c+=listnot[i];
        }
        c=c/listnot.length;
        return(c);


    }
    public void afficherMoyenne(){
        System.out.println(calculerMoyenne());

    }

    public Departement getDepartement() {
        return departement;
    }
}

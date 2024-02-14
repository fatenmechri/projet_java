public class Enseignant extends Personne{
    private Departement departement;
    private Matiere[]listmatier;

    public Enseignant(int id, String nom, String prenom, Departement departement, Matiere[] listmatier) {
        super(id, nom, prenom);
        this.departement = departement;
        this.listmatier = listmatier;
    }

    public void enseigner( Matiere matiere){

            listmatier[listmatier.length]=matiere;
    }

    public Departement getDepartement() {
        return departement;
    }
}

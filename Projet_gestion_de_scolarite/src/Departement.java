public class Departement {
    private String nom;
    private Enseignant[]listEnsignant;
    private Etudiant[]listEtudiant;

    public Departement(String nom) {
        this.nom = nom;
    }
    public void ajouteuEensegnant(Enseignant enseignant){
        listEnsignant[listEnsignant.length]=  enseignant;
    }
    public void rechercheEnseignant(Enseignant enseignant){
        for (int i=0;i<listEnsignant.length;++i ){
            if (enseignant==listEnsignant[i]){
                System.out.println(listEnsignant[i].getDepartement());
            }
        }

    }
    public void rechercherEtudiant(Etudiant etudiant){
        for(int i=0;i<listEtudiant.length;++i){
            if (etudiant==listEtudiant[i]){
                System.out.println(listEtudiant[i].getDepartement());
                break;
            }
        }

    }
}

package champollion;

public class Enseignant extends Personne {

    public void ajouteIntervention(Intervention intervention) {

    }


    public boolean enSousService(){
            throw new UnsupportedOperationException("Pas encore implémenté");
    }
    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {

        throw new UnsupportedOperationException("Pas encore implémenté");
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        // TODO: Implémenter cette méthode
        throw new UnsupportedOperationException("Pas encore implémenté");
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
           if (volumeCM == 0 || volumeTD == 0 || volumeTP == 0 ){
               throw new UnsupportedOperationException("Attention ");
           }else{
               ServicePrevu s = new ServicePrevu();
               s.volumeCM = volumeCM;
               s.volumeTD = volumeTD;
               s.volumeTP =  volumeTP;



           }
    }

    public int resteAplanifier(UE ue, TypeIntervention type){
    float planifiee = 0f;
        throw new UnsupportedOperationException("Pas encore implémenté");

    }


}

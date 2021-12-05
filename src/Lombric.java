import java.util.ArrayList;

public class Lombric {
    public int longueur =1 ;
    private static ArrayList<Lombric> listLombric = new ArrayList<Lombric>();
    public Lombric(){
        listLombric.add(this);

    }

    public int getLongueur() {

        return longueur;
    }
    public void setLongueur(int n){
        longueur = n;

    }

    public  void grandit(int n){
        grandissons(n);
        //longueur = this.getLongueur()+ n;
    }

    public Lombric accouplement(Lombric b){
        if(this.getLongueur()>=10 && b.getLongueur()>=10){
            return new Lombric();
        }
        return null;
    }

    public Lombric coupe(){
        this.longueur =this.getLongueur()/2;
        Lombric clone = new Lombric();
        clone.longueur = this.longueur;
        return clone;
    }

    public static void grandissons(int n){
         for(Lombric lombric : listLombric){
             lombric.longueur = lombric.getLongueur()+n;
         }

    }
}

import java.util.ArrayList;

public class LombricSain extends Lombric{
    private ArrayList<Lombric> lombricParent = new ArrayList<Lombric>();

    public LombricSain(){
        this.lombricParent.add(this);

    }
    public ArrayList<Lombric> getLombricParent(){
        return lombricParent;
    }
    public void setLombricParent(Lombric lombric){
        lombricParent.add(lombric);
    }

    @Override
    public LombricSain accouplement(Lombric b) {
        if(!this.getLombricParent().contains(b)){
            if(this.getLongueur()>=10 && b.getLongueur()>=10){
                return new LombricSain();
            }
        }
        return null;

    }

    @Override
    public LombricSain coupe() {
        this.longueur =this.getLongueur()/2;
        LombricSain clone = new LombricSain();
        clone.longueur = this.longueur;
        clone.setLombricParent(this);
        this.setLombricParent(clone);

        return clone;
    }
}

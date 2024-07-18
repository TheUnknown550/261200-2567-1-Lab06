
public class Pig extends Animal implements Pettable{
    @Override
    void sound(){
        System.out.println("OINKKKK");
    }

    public void Chopping(){
        System.out.println("CHOP CHOP YUMMYY PIGGY");
    }

    @Override
    public void pet(){
        System.out.println("Awww Cute little thing...");
    }
}

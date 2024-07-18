public class Duck extends Animal implements Flyable,Pettable{

    @Override
    void sound(){
        System.out.println("Quack");    
    }

    public void beWhite(){
        System.out.println("IM WHITE N***");
    }

    @Override
    public void fly(){
        System.out.println("I Believe I can FLYYYYY!!");
    }
    @Override
    public void glide(){
        System.out.println("I Can GLIDE SO FARRRRR!");
    }

    public void clean(Animal animal){
        System.out.println(this.toString()+" is cleaning "+animal.toString());
    }

    @Override
    public void pet(){
        System.out.println("Awww Cute little thing...");
    }
}

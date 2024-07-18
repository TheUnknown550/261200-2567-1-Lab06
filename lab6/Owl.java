public class Owl extends Animal implements Flyable{
    
    @Override
    void sound(){
        System.out.println("Hoot");
    }

    public void nightSeeing(){
        System.out.println("WOW NIGHT SO BRIGHT!!");
    }

    @Override
    public void fly(){
        System.out.println("I Believe I can FLYYYYY!!");
    }
    @Override
    public void glide(){
        System.out.println("I Can GLIDE SO FARRRRR!");
    }
}

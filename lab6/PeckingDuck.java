
public class PeckingDuck extends Duck {

    public void beCrispy() {
        System.out.println("Grob grob! (sound effect)");
    }

    @Override
    public void clean(Animal animal) { // overriding
        System.out.println("I cannot clean. I died already.");
    }

}

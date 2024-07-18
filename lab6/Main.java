public class Main{
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sound();
        duck.beWhite();
        duck.fly();
        duck.pet();

        Owl headWig = new Owl();
        headWig.sound();
        headWig.nightSeeing();
        headWig.glide();

        Cow cow = new Cow();
        cow.sound();
        cow.milking();

        Pig Oinker = new Pig();
        Oinker.sound();
        Oinker.Chopping();
        Oinker.pet();

        duck.clean(Oinker);

        PeckingDuck food = new PeckingDuck();
        food.beCrispy();
        food.clean(Oinker);
    }
}
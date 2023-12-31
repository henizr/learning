public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly(){
        this.flyBehavior.fly();
    }
    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

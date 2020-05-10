package part2;

public abstract class Pizza
{
    public abstract void preHeatOven();
    public abstract void makeCrust();
    public abstract void addToppings();
    public abstract void cook();
    
    public void makeFromScrath() 
    {
        preHeatOven();
        makeCrust();
        addToppings();
        cook();
    }
}

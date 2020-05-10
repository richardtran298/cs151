package part2;

public class CaliforniaStyle extends Pizza
{

    @Override
    public void preHeatOven()
    {
        System.out.println("Preheating Oven");
    }

    @Override
    public void makeCrust()
    {
        System.out.println("Making Crust");        
        
    }

    @Override
    public void addToppings()
    {
        System.out.println("Adding Toppings");        
        
    }

    @Override
    public void cook()
    {
        System.out.println("Cooking");        
        
    }

}

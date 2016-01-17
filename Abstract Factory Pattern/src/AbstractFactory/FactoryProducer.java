/**
 * Created by root on 1/17/2016.
 */


package AbstractFactory;

public class FactoryProducer
{
    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("Shape"))
        {
            return new ShapeFactory();
        }
        else if(choice.equalsIgnoreCase("Color"))
        {
            return new ColorFactory();
        }
        return null;
    }
}

public class Cat
{
    private Double originWeight;
    private double weight;
    private String name;
    public static final double MIN_WEIGHT_COUNT = 1000.0;
    public static final double MAX_WEIGHT_COUNT = 9000.0;
    public static final int EYES_NUMBER_COUNT = 2;
    private Double minWeight;
    private Double maxWeight;
    private double eatenFood;
    private static int count;
    private ColorCats color;


    public Cat()
    {
        count++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = MIN_WEIGHT_COUNT;
        maxWeight = MAX_WEIGHT_COUNT;

    }

    public Cat(double weight){
        count++;
        this.weight = weight;
        originWeight = weight;
        minWeight = MIN_WEIGHT_COUNT;
        maxWeight = MAX_WEIGHT_COUNT;
    }

    public static Cat createClone (Cat donor)  {
        Cat cat = new Cat(donor.weight);
        cat.originWeight  = donor.originWeight;
        cat.maxWeight = MAX_WEIGHT_COUNT;
        cat.minWeight = MIN_WEIGHT_COUNT;
        cat.eatenFood = donor.eatenFood;
        return cat;
    }

    public Cat createClone ()
    {
        return Cat.createClone(this);

    }

    public ColorCats getColor() {
        return color;
    }

    public void setColor(ColorCats color) {
        this.color = color;
    }

    public void meow()
    {
        setWeight(-1.0);
        //System.out.println("Meow");
    }

    public void feed(double amount)
    {
        setWeight(amount);
        eatenFood = eatenFood + amount;
    }

    public double getAmountFeed(){
        return eatenFood;
    }

    public void toilet(){
        setWeight(-1.0);
        System.out.println("Что-нибудь печатает");
    }

    public void drink(Double amount)
    {
        setWeight(amount);
        weight = weight + amount;
    }

    public Double getWeight(){
        return weight;
    }



    public void setWeight(Double weight)
    {
        if(!getStatus().equals("Dead") && !getStatus().equals("Exploded") && !getStatus().equals("Sleeping"))
        {
            this.weight += weight;
            if(getStatus().equals("Dead") || getStatus().equals("Exploded"))
                count--;
        }
    }

    public static int getCount(){
        return count;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}
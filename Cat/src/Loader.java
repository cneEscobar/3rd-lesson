
public class Loader
{
    public static void main(String[] args)
    {
        boolean ravenstvo;
        Cat vasya = new Cat();
        Cat pasha = new Cat();
        System.out.println("Вес Васи: " + vasya.getWeight());
        System.out.println("Вес Паши: " + pasha.getWeight());
        pasha.toilet();
        System.out.println("Вес Паши после туалета: " + pasha.getWeight());
        pasha.meow();
        System.out.println("Вес Паши после мяуканья: " + pasha.getWeight());
        pasha.feed(231222);
        System.out.println("Вес Паши после кормления: " + pasha.getWeight());
        System.out.println("Статус Паши: " + pasha.getStatus());
        System.out.println("Кол-во кошек: "+Cat.getCount());
        System.out.println("===============================");

        Cat clonVasya = vasya.createClone();

        ravenstvo = vasya.equals(clonVasya);
        System.out.println(ravenstvo);
        System.out.println(vasya==clonVasya);

        System.out.println("Вес Васи: " + vasya.getWeight());
        System.out.println("Вес Клона Васи: " + clonVasya.getWeight());
        System.out.println("Кол-во кошек: "+Cat.getCount());
        System.out.println("===============================");

        vasya.feed(231.591);
        System.out.println("Количество еды:  " + vasya.getAmountFeed());
        System.out.println("Вес Васи после кормления: " + vasya.getWeight());
        System.out.println("Вес Клона Васи: " + clonVasya.getWeight());
        System.out.println("===============================");

        do {
            clonVasya.meow();
        } while (clonVasya.getWeight() > 1000);


        System.out.println("Вес Клона Васи: " + clonVasya.getWeight());
        System.out.println("статус Клона Васи: " + clonVasya.getStatus());
        System.out.println("===============================");

        System.out.println("Вес Васи: " + vasya.getWeight());
        System.out.println("статус Васи: " + vasya.getStatus());
        System.out.println("Кол-во кошек: " + Cat.getCount());
        System.out.println("===============================");

        Cat kitten = getKitten();
        System.out.println("Вес котёнка: " + kitten.getWeight());
        System.out.println("Кол-во кошек: " + Cat.getCount());
        System.out.println("===============================");

        ravenstvo = vasya.equals(clonVasya);
        System.out.println(ravenstvo);
        System.out.println(vasya==clonVasya);
        /*
        если сравнивать объекты друг с другом - то проверяется, одинакова ли ссылка этих 2 объектов
        в моем случае, ссылки разные. Но содержимое одинаково.
        Вывод: объекты разные (оба объекта ссылаются по-разному), но одинаковы по содержанию.
         */
    }


    public static Cat getKitten()
    {
        return new Cat(100 + 100 * Math.random());
    }

}
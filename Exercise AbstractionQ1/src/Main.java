//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Book b1 = new Book("Calculus",250,"Enstien");
        Book b2 = new Book();

        System.out.println("Book name: "+b1.getName()+", authored by "+b1.getAuthor()+".\n" +
                "Price: "+ b1.getPrice());
        System.out.println("Price after discount 20%: "+b1.getDiscount());

        System.out.println("---------------------------");
        b2.setName("Phsyics");
        b2.setAuthor("Oppenhiemr");
        b2.setPrice(185.5);
        System.out.println("Book name: "+b2.getName()+", authored by "+b2.getAuthor()+".\n" +
                "Price: "+ b2.getPrice());
        System.out.println("Price after discount 20%: "+b2.getDiscount());

        System.out.println("---------------------------");

        Movie m1 = new Movie("Zombie Apocalypse",45,"John Doe");
        Movie m2 = new Movie();

        System.out.println("Boom1k name: "+m1.getName()+", authored by "+m1.getDirector()+".\n" +
                "Price: "+ m1.getPrice());
        System.out.println("Price after discount 30%: "+m1.getDiscount());

        System.out.println("---------------------------");
        m2.setName("Among Wolves");
        m2.setDirector("Maukly");
        m2.setPrice(55);
        System.out.println("Book name: "+m2.getName()+", authored by "+m2.getDirector()+".\n" +
                "Price: "+ m2.getPrice());
        System.out.println("Price after discount 30%: "+m2.getDiscount());
    }
}
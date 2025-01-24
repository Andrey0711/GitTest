public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setAuthor("Andrey");
        car.getAuthor();
        car.getId();
        car.getId();
        car.getId();
        car.getId();
        car.setAuthor("Andreu");
        car.setAuthor("Andreu");
        car.setAuthor("Andreu");
        car.setAuthor("Andreuu");
        car.setAuthor("Andreyuuuuuuuu");
        car.setAuthor("Andreuyyyuuyuy");
        car.setAuthor("Andreuyyyuuyuy");
        String str = "lg700444@gmail.com";
        boolean isEmail = str.matches("[a-zA-z0-9]+@[a-zA-z0-9]+\\.(com|ru)");
        System.out.println(isEmail);
    }
}
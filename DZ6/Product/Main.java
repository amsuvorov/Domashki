public class Main {
    public static void main(String[] args) {
        product salt = new product();
          salt.setName("salt");
          salt.setArtNumber("AV12");
          salt.setDescription("Pig salt");
          salt.setPrice(20);
          salt.setStock(2);

        System.out.println(salt.getName());
        System.out.println(salt.getArtNumber());
        System.out.println(salt.getDescription());
        System.out.println(salt.getprice());
        System.out.println(salt.getStock());


    }
}
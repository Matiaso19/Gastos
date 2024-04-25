public class Main {
    public static void main(String[] args) {

        Categoria ocio = new Categoria("Ocio");

        Gasto gasto1 = new Gasto("25-04-2024", 50.0, ocio);
        System.out.println(gasto1.getMonto());
        System.out.println(gasto1.getFecha());
        System.out.println(gasto1.getCategoria());
    }
}
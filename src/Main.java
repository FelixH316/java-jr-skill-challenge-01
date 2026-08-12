public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Chucho", "perro",
                "dorado", "caramelo",
                "Medium");
        perro1.hacerRuido();

        Ave ave1 = new Ave("Chuy", "Perico",
                "verde", "Triangulo");

        ave1.hacerRuido();
    }
}
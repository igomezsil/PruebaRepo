package prueba;

public class ClasePrueba {
    private int a;
    private String bebe;
    private int b;

    public ClasePrueba(int a, String bebe, int b) {
        this.a = a;
        this.bebe = bebe;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public String getBebe() {
        return bebe;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
        System.out.println("Este es un código de prueba ejecutándose correctamente en Java.");

        ClasePrueba objeto1 = new ClasePrueba(1, "Pedro", 10);
        ClasePrueba objeto2 = new ClasePrueba(2, "Lucía", 20);

        System.out.println(objeto1.getBebe());  
        System.out.println(objeto2.getBebe());  
        System.out.println(objeto1.getB());    
    }
}
public class Main {
    public record Color(int red, int green, int blue, int alpha) {

        public Color {
            if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255 || alpha < 0 || alpha > 255) {
                throw new IllegalArgumentException("Wartości RGB i Alpha muszą być w zakresie 0-255");
            }
        }

        public Color(int red, int green, int blue) {
            this(red, green, blue, 0);
        }
    }


    public static void main(String[] args) {
        Color kolor1 = new Color(255, 0, 0);
        Color kolor2 = new Color(0, 255, 0, 128);

        System.out.println("Kolor 1 - czerwony: " + kolor1.red() + ", zielony: " + kolor1.green() + ", niebieski: " + kolor1.blue() + ", alpha: " + kolor1.alpha());
        System.out.println("Kolor 2 - czerwony: " + kolor2.red() + ", zielony: " + kolor2.green() + ", niebieski: " + kolor2.blue() + ", alpha: " + kolor2.alpha());

        System.out.println("Kolor 1: " + kolor1);
        System.out.println("Kolor 2: " + kolor2);
    }
}

import lombok.AllArgsConstructor;

public class Fraction {

    int up, down;
    public Fraction(int up, int down){
        int gcd = gcd(up, down);
        this.up=up/gcd;
        this.down=down/gcd;
    }

    public Fraction add(int n){
        return add(new Fraction(n,1));
    }
    public Fraction sub(int n){
        return sub(new Fraction(n,1));
    }
    public Fraction mul(int n){
        return mul(new Fraction(n,1));
    }
    public Fraction div(int n){
        return div(new Fraction(n,1));
    }

    public Fraction sub(Fraction f){
        return add(new Fraction(-f.up, f.down));
    }

    public Fraction div(Fraction f){
        return mul(new Fraction(f.down, f.up));
    }

    public Fraction mul(Fraction f){
        int up2 = f.up*this.up;
        int down2 = f.down*this.down;
        return new Fraction(up2, down2);
    }

    public Fraction add(Fraction f) {
        int down2 = lcm(f.down, this.down);
        int up2 = this.up*(down2/this.down)+f.up*(down2/f.down);
        return new Fraction(up2, down2);
    }

    private static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    @Override
    public String toString() {
        return up+"/"+down;
    }
}

public class RationalClient {
    
    public static void main(String[] args) {
//        Rational r = new Rational(1, 2);
//        System.out.println(r);
//
//        // We can use dot notation to access the integer values
//        // of the numerator and denominator directly
//        System.out.println(r.numerator);
//        System.out.println(r.denominator);

        // Rational s = new Rational(1, 3);
        // System.out.println(s);
        // Rational t = Rational.add(r, s);
        // System.out.println(t);

        Rational r = new Rational(3,4);
         System.out.println(r.calculateDecimalValue()); // 0.75

        Rational s = new Rational(3,4);
         System.out.println(s.calculateDecimalValue()) // 0.75

        String x = "hello";
         char c = x.charAt(0);

         Rational q = new Rational(2,5);
         System.out.println(q.pow(2)) // 4/25
    }
}

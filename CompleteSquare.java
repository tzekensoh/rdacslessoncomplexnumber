/**
 * For an equation in the form of (ax + b)^2 = c, there is a "complete" square and such equation can be solved
 */
public class CompleteSquare {
    private double a, b, c;
    private ComplexNumber solution1, solution2;

    public CompleteSquare(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solve()
    {
        ComplexNumber sqRoot;
        ComplexNumber neqSqRoot;
        if (c > 0)
        {
            sqRoot = new ComplexNumber(Math.sqrt(c),0);
            neqSqRoot = new ComplexNumber(-1 * Math.sqrt(c),0);
        } else {
            sqRoot = new ComplexNumber(0,Math.sqrt(-c));
            neqSqRoot = new ComplexNumber(0,-1 * Math.sqrt(-c));
        }

        // Convert b into a ComplexNumber too
        ComplexNumber comNb = new ComplexNumber(b,0);
        solution1 = neqSqRoot.subtract(comNb).divide(a);
        solution2 = sqRoot.subtract(comNb).divide(a);
    }

    @Override
    public String toString() {
        return "Equation{" +
                "(" + a +
                "x+" + b +
                ")^2=" + c +
                '}';
    }

    public String getSolutionString()
    {
        return "Solutions are " + solution1 + " and " + solution2;
    }

    public static void main(String argv[])
    {
        CompleteSquare comSq = new CompleteSquare(1,0,-9);
        System.out.print(comSq);
        comSq.solve();
        System.out.println(comSq.getSolutionString());

        ComplexNumber comNum1 = new ComplexNumber(2,3);
        ComplexNumber comNum2 = new ComplexNumber(2,-3);
        System.out.print(comNum1);
        System.out.print(" x ");
        System.out.print(comNum2);
        System.out.print(" = ");
        System.out.println(comNum1.multiply(comNum2));

        System.out.print(comNum1);
        System.out.print(" / ");
        System.out.print(3);
        System.out.print(" = ");
        System.out.println(comNum1.divide(3.0));
    }
}

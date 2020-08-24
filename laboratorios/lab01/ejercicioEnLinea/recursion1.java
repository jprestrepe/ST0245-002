public class Recursion1 {
    public int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);

    }

    public int bunnyEars(int bunnies) {
        return bunnies * 2;
    }

    public int fibonacci(int n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    int suma = 0;

    public int bunnyEars2(int bunnies) {

        if (bunnies == 0) {
            return 0;
        }

        if (bunnies % 2 == 0) {

            return bunnyEars2(bunnies - 1) + 3;
        }
        if (bunnies % 2 != 0)
            return bunnyEars2(bunnies - 1) + 2;

        return bunnyEars2(bunnies - 1);

    }

    public int triangle(int rows) {
        if (rows == 0)
            return 0;
        return triangle(rows - 1) + rows;
    }

}

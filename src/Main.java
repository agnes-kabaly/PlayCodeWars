public class Main {

    public static void main(String[] args) {
        FactDecomp factDecomp = new FactDecomp();
        System.out.println(factDecomp.decomp(3));
        System.out.println(factDecomp.decomp(5));
        System.out.println(factDecomp.decomp(12));
        System.out.println(factDecomp.decomp(4000));

        Solution solution = new Solution();
        System.out.println(solution.factors(7775460));
        System.out.println(solution.factors(86240));
        System.out.println(solution.factors(18195729));
        System.out.println(solution.factors(120));

        Sudoku sudoku = new Sudoku();
        System.out.println(sudoku.check(new int[][]{
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        }));
        System.out.println(sudoku.check(new int[][]{
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 0}
        }));

        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(25));
        System.out.println(factorial.factorial(5));

        System.out.println(factorial.zeros(6));
        System.out.println(factorial.zeros(12));
        System.out.println(factorial.zeros(100));
        System.out.println(factorial.zeros(1000));

    }


}

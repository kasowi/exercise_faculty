public class Faculty {

    public static void main(String[] args) {
        facultyFor(10);
        facultyWhile(10);
    }

    public static int facultyFor (int z) {
        int fact = 1;
        for (int i = 2; i <= z; ++i) {
            fact = fact * i;
        }
        System.out.println("ForLoop says: factorial of "+z+" is "+fact+".");
        return fact;
    }

    public static int facultyWhile (int input) {
        int i = 1;
        int fact = 1;
        while (i<=input) {
            fact = fact * i;
            i++;
        }
        System.out.println("WhileLoop says: factorial of " +input+" is "+fact+".");
        return fact;
    }
}

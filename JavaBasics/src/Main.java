public class Main {

    public static void main(String[] args) {
	// Lesson 1
        String driver;
        driver = "Hamish";
        int driverLength = driver.length();
        driver = driver.toUpperCase();
        System.out.println(driver + ", liter: " + driverLength);

        //Data Types
        int maxInt = 2147483647;
        long muchMore = 4219*42194921;
        double fraction = 21.2;
        String textHere = "Haha";
        char answer = 'b';
        boolean fact = true;

        //Casting - rzutowanie zmiennych
        double current = 17;
        double rate = 1.5;
        double future = current * rate;
        System.out.println(future);
        int approx = (int) future;
        System.out.println(approx);

        //Comments - // = 1 line comment; /* */ = multiline comment

    // Lesson 2
        //if statement
        boolean isCold = true;
        if(isCold) System.out.println("It's cold, wear a coat");

        /*boolean expressions
        <   >   <=  >=  ==  != */

        /*Logical operators
        and = &&; or = ||; not = !(3<5)
         */

        //switch statement
        int passcode = 312;
        String coffeType = "";
        switch(passcode){
            case 111: coffeType = "Kawka"; break;
            case 312: coffeType = "Espresso"; break;
        };
        System.out.println(coffeType);

//Lesson 3

        // Random numbers
        double rndNmb = Math.random();
        System.out.println(rndNmb);

//Lesson 4

    //while - tworzy pętle aż coś zmieni się na false
    //for - pętla z warunkami
    for(int i = 1; i <= 3; i++){
        i = i+1;
        System.out.println(i);
    }

    //Arrays - tablice
        int [] numbers = {12,1,777,3,4,0,0,121,1,-4,0,-100,2};
    System.out.println(numbers[2]);

    String [] newsOutlet = {"abc","bbc","CNN","CBS","AP","NBC","FOX","npr","sky","Aljazeera"};
    double lucky = Math.random();
    lucky*=10;
    int luckyIndex = (int) lucky;
    System.out.println(newsOutlet[luckyIndex]);

    double [] temperatures = {74,73,72,80};
    int tempSize = temperatures.length;

    if(10<tempSize){
        System.out.println(temperatures[10]);
    }
    System.out.println("Temperatura średnia: " + calcAverage(temperatures));

    //2D Arrays - tablica 2D czyli tabela, np. [2][3] = [wiersz][kolumna]

    //Nested loops - pętla w pętli; for(i...){for(j...){}}

    }

    public static double calcAverage(double [] temperatures){
        int size = temperatures.length;
        double total = 0;
        for(int i=0; i<size; i++){
            total+=temperatures[i];
        }
        double average = total/size;
        return average;
    }

    public static double search(double[] speed) {
        int size = speed.length;
        double min = speed[0];
        for (int i = 1; i < size; i++) {
            if (speed[i] < min) {
                min = speed[i];
            }
        }
        return min;
    }

    public static String findLongestName(String [] names){
        int size = names.length;
        String longestName = names[0];
        for (int i=1; i<size; i++){
            if(names[i].length()>longestName.length()){
                longestName = names[i];
            }
        }
        return longestName;
        }

     public static double studentAverage(int [][] grades, int student){
        int total = 0;
        int subjects = grades.length;
        for (int i=0; i<subjects; i++){
            total+=grades[i][student];
        }
        double average = total/(double)subjects;
        return average;
     }
}

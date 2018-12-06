# Android-native-
Android development class


This was a training class, nothing interesting



1.	Introduction to java programming
2.	Course Introduction
3.	Getting started with java
4.	Language Fundamentals
5.	Objects and Classes
6.	Using Java Objects
7.	Inheritance in Java
8.	Packages
9.	Exception Handling
10.	Core Collection Classes


1.	Introduction to java programming

Shortcuts:
 sout – System.out.println();  //  System.out.println(”Hello world of Java”);
psvm - public static void main(String[] args) {}  


File names is caps with Java i.e FirstClass
For program execution needs a main function, which will be inside the class i.e psvm

o	If
o	Switch
o	Length
o	Upper
o	Concat
o	Isempty
o	Convert
o	Math
o	Scanner
o	Joptionpane
o	loops
Variables
This are used to store data.
I.e. int age = 70; // age is a variable

If && else if statement
public static void main(String[] args) {
    double weight = 109;
    double height = 1.8;

    double bmi = weight / (height*height);
    System.out.println(bmi);

    if (bmi < 15){
        System.out.println("Very severely underweight");
    }
    else if (bmi >= 15 && bmi < 16){
        System.out.println("Severely underweight");
    }

   else {
        System.out.println("Obese Class  VI (Hyper Obese)");
    }

}


Switch case statement
public static void main(String[] args) {
 // Switch case statement
    int x;
    x = 21;

    switch (x){
        case 10:
        case 9:
        case 8:
        case 7:
            System.out.println("The answer is 10");
            break;
        case 11:
            System.out.println("The answer is 11");
            break;
        case 12:
            System.out.println("The answer is 12");
            break;
        default:
            System.out.println("Hapo uko inje brathe");
    }
}


Length, toUpperCase, Trim, toLowerCase, concat(concatenate), equals


public static void main(String[] args) {
//Length, toUpperCase, Trim, toLowerCase, concat(concatenate)
    String x;
    int y = 10;
    String z = "Years";
    String w, p;
    x = "       Hello King     ";
    w = "Hello";
    p = "hey";

    System.out.println(x.length());
    System.out.println(x.toUpperCase());
    System.out.println(x.trim());
    System.out.println(x.toLowerCase());
    System.out.println(y + " " + z);
    System.out.println(z.concat(String.valueOf(y)));

    if(w.equals(p)){
        System.out.println("Congrats");
    } else {
        System.out.println("Umeshindwa");
    }
}


		
Data type Conversion

public static void main(String[] args) {
// Data type Conversion
    String x, y;
    x = "10";
    y = "20";
    int xc, yc;
    xc = Integer.parseInt(x);
    yc = Integer.parseInt(y);
    System.out.println(xc + yc);
    System.out.println(x + y);

    String one, two;
    Double oneC, twoC;
    one = "10.5";
    two = "67.30";

    oneC = Double.parseDouble(one);
    twoC = Double.parseDouble(two);

    System.out.println("The answer is: " + oneC * twoC);

}

Scanner (Get user input)
public static void main(String[] args) {
    Double num1, num2, Answer;
    Scanner chukua;
    chukua = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    num1 = chukua.nextDouble();
    System.out.println("Enter the second number: ");
    num2 = chukua.nextDouble();
    Answer = num1 * num2;
    System.out.println("Your answer is: " + Answer);
}

joptionpen 
public static void main(String[] args) {
    String num1, num2;
    Double num1Con, num2Con, answer;
    num1 = JOptionPane.showInputDialog("Enter Num1");
    num2 = JOptionPane.showInputDialog("Enter num2");
    num1Con = Double.parseDouble(num1);
    num2Con = Double.parseDouble(num2);

    answer = num1Con + num2Con;
    JOptionPane.showMessageDialog(null,String.valueOf(answer));
    
}

Arrays

Is a variable that stores values in indexes.

public static void main(String[] args) {
    String[] names;
    names = new String[5];
    names[0] = "King";
    names[1] = "James";
    names[2] = "Lodwa";
    names[3] = "Austine";
    names[4] = "Liz";

    System.out.println(names[0]);
    System.out.println(names[4]);
    System.out.println(names[0] + " " + names[1] + " " +names[2] + " " + names[3] + " " + names[4]);
}

for loop
public static void main(String[] args) {
    String[] names;
    Scanner chukua;
    int number;
    chukua = new Scanner(System.in);
    System.out.println("How many names do you have?");
    number = chukua.nextInt();
    names = new String[number];
    System.out.println("Enter the " +number+ " names");
    for (int x=0; x<number; x++){
        names[x] = chukua.next();
    }
    
    for (int x=0; x<number; x++){
        System.out.println(names[x]);
    }


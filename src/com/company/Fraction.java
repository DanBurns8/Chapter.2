package com.company;

public class Fraction {
    private int numerator;		//attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d)	// constructor
    {
        numerator = n;
        denominator = d;
    }

    public Fraction(){
        numerator=1;
        denominator=2;
    }

    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }

    public Fraction add(Fraction other) {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    public Fraction subtract(Fraction other){
        int n=this.numerator*other.denominator - this.denominator*other.numerator;
        int d=this.denominator*other.denominator;
        Fraction result = new Fraction(n,d);
        return result;
    }

    public Fraction multiply(Fraction other) {
    int n=this.numerator*other.numerator;
    int d=this.denominator*other.denominator;
    Fraction result = new Fraction(n,d);
    return result;
    }

    public String toString(){
    String s= numerator + "/" + denominator;
    return s;
    }

    public Fraction reciprocal(){
    int n= denominator;
    int d= numerator;
    Fraction result = new Fraction(n,d);
    return result;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);    // create an instance of fraction
        Fraction f2 = new Fraction(4, 5);
        Fraction f8 = new Fraction(7,12);
        Fraction f9 = new Fraction(6,20);

        Fraction f3 = f1.add(f2);            // add 2 fractions
        System.out.println("3/4 + 4/5 = " + f3);    // print the answer

        Fraction f4 = f1.subtract(f2);
        System.out.println(f1 + " - " + f2 + " = " + f4);

        Fraction f5 = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + f5);

        Fraction f6 = f1.reciprocal();
        System.out.println(f6 + " is the reciprocal of " + f1);

        Fraction f7 = f8.add(f9);
        System.out.println(f8 + " + " + f9 + " = " + f7);
    }
		/*Add code to multiply f1 and f2 here

		Add code to call reciprocal here

		create 2 new fractions and add them here.

		*/
    //3/4 + 4/5 = 31/20
    //3/4 - 4/5 = -1/20
    //3/4 * 4/5 = 12/20
    //4/3 is the reciprocal of 3/4
    //7/12 + 6/20 = 212/240
}

/* 
 * Fraction with reduce
 * 
 * Arnav Pawar
 * 10/18/18
 */
public class Client
{
    public static void main(String[] args)
    {
        //initial
        Fractions frac1 = new Fractions(1,2);
        Fractions frac2 = new Fractions(3,4);
        //den=0
        Fractions frac3 = new Fractions(8,0);
        Fractions frac4 = new Fractions(1,3);
        //num=0
        Fractions frac5 = new Fractions(0,5);
        Fractions frac6 = new Fractions(1,5);
        //den=1
        Fractions frac7 = new Fractions(7,1);
        Fractions frac8 = new Fractions(4,6);
        
        //2ED PART OF FRACTION LAB
        //REDUCE
        Fractions frac9 = new Fractions(12, 3);//when num>den
        Fractions frac10 = new Fractions(10, 30);//when den>num
        Fractions frac11= new Fractions(12000, 320000);//large #

        
        //EQUALS
        Fractions frac12 = new Fractions(4,12);
        Fractions frac13 = new Fractions(1, 3); 

        Fractions frac14 = new Fractions(19,9);
        Fractions frac15 = new Fractions(2,4); 
        
        Fractions sum;
        Fractions subtract;
        Fractions multiply;
        Fractions divide;
        Fractions reduce;
        
        //FRAC1-8 is normal
        sum=frac1.add(frac2);
        subtract = frac1.subtract(frac2);
        multiply = frac1.mult(frac2);
        divide = frac1.divide(frac2);       
        System.out.println(frac1.toString() + " + " +frac2.toString() + " = " + sum.toString());
        System.out.println(frac1.toString() + " - " +frac2.toString() + " = " + subtract.toString());
        System.out.println(frac1.toString() + " * " +frac2.toString() + " = " + multiply.toString());
        System.out.println(frac1.toString() + " / " +frac2.toString() + " = " + divide.toString());
       
        sum=frac3.add(frac4);
        subtract = frac3.subtract(frac4);
        multiply = frac3.mult(frac4);
        divide = frac3.divide(frac4);        
        System.out.println(frac3.toString() + " + " +frac4.toString() + " = " + sum.toString());
        System.out.println(frac3.toString() + " - " +frac4.toString() + " = " + subtract.toString());
        System.out.println(frac3.toString() + " * " +frac4.toString() + " = " + multiply.toString());
        System.out.println(frac3.toString() + " / " +frac4.toString() + " = " + divide.toString());
       
        sum=frac5.add(frac6);
        subtract = frac5.subtract(frac6);
        multiply = frac5.mult(frac6);
        divide = frac5.divide(frac6);        
        System.out.println(frac5.toString() + " + " +frac6.toString() + " = " + sum.toString());
        System.out.println(frac5.toString() + " - " +frac6.toString() + " = " + subtract.toString());
        System.out.println(frac5.toString() + " * " +frac6.toString() + " = " + multiply.toString());
        System.out.println(frac5.toString() + " / " +frac6.toString() + " = " + divide.toString());

         
        sum=frac7.add(frac8);
        subtract = frac7.subtract(frac8);
        multiply = frac7.mult(frac8);
        divide = frac7.divide(frac8);
        System.out.println(frac7.toString() + " + " +frac8.toString() + " = " + sum.toString());
        System.out.println(frac7.toString() + " - " +frac8.toString() + " = " + subtract.toString());
        System.out.println(frac7.toString() + " * " +frac8.toString() + " = " + multiply.toString());
        System.out.println(frac7.toString() + " / " +frac8.toString() + " = " + divide.toString());
        
        //REDUCE METHOD
        reduce = Fractions.reduce(frac9);
        System.out.println("original is "+frac9.toString() + " and the reduced formation will be " + reduce.toString());
        reduce = Fractions.reduce(frac10);
        System.out.println("original is "+frac10.toString() + " and the reduced formation will be " + reduce.toString());
        reduce = Fractions.reduce(frac11);
        System.out.println("original is "+frac11.toString() + " and the reduced formation will be " + reduce.toString());
       
        //TESTS THE EQUAL METHOD
        System.out.println(frac12.toString() + " and " + frac13.toString() + " is  " + frac12.equals(frac13));//TRUE
        
        System.out.println(frac14.toString() + " and " + frac15.toString() + " is  " + frac14.equals(frac15));//FALSE

       }




}

//OUTPUTS
/*
 1 / 2 + 3 / 4 = 10 / 8
1 / 2 - 3 / 4 = 2 / 8
1 / 2 * 3 / 4 = 3 / 8
1 / 2 / 3 / 4 = 2 / 3
fraction is undifined + 1 / 3 = fraction is undifined
fraction is undifined - 1 / 3 = fraction is undifined
fraction is undifined * 1 / 3 = fraction is undifined
fraction is undifined / 1 / 3 = fraction is undifined
0 + 1 / 5 = 5 / 25
0 - 1 / 5 = 5 / 25
0 * 1 / 5 = 0
0 / 1 / 5 = 0
7 + 4 / 6 = 46 / 6
7 - 4 / 6 = 38 / 6
7 * 4 / 6 = 14 / 3
7 / 4 / 6 = 21 / 2
original is 12 / 3 and the reduced formation will be 4
original is 10 / 30 and the reduced formation will be 1 / 3
original is 12000 / 320000 and the reduced formation will be 3 / 80
4 / 12 and 1 / 3 is  true
19 / 9 and 2 / 4 is  false
 */


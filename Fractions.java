/* *
 * FractionSimplifier with reduce
 * 
 * Arnav Pawar
 * 10/18/18
 */
public class Fractions
{
  private int num;
  private int den;
    Fractions()
    {
        den=1;
        num=0;
    }
    public Fractions(int num,int den)
    {
      this.num=num;
      this.den=den;
    }
    public Fractions add(Fractions other)
    { 
        int num;
        int den;
        
        den = other.den * this.den;
        num = (this.num * other.den) + (other.num * this.den);
    
        if (num < 0)
        {
            num = num * -1;            
        }
        
        Fractions add = new Fractions(num, den);
        
        add.reduce(num, den);//REDUCES THE FRAC

        return this.reduce(num, den);
    }
    
    public Fractions subtract(Fractions other)
    {
        int subNum;
        int subDen;
        
        subNum = other.num * -1;
        subDen = other.den;

        Fractions frac = new Fractions(subNum, subDen);
        return this.add(frac);
    }
    public Fractions mult(Fractions other)
    {        
        int Multnum;
        int Multden;

        Multnum = this.num * other.num;
        Multden = this.den * other.den;
        Fractions mult = new Fractions(Multnum, Multden);
        
        return this.reduce(mult);//Reduce method
    }
    public Fractions divide(Fractions other)
    {
        int Divnum;
        int Divden;
        Divnum = other.den;
        Divden = other.num;
        Fractions div = new Fractions(Divnum, Divden);
        return this.mult(div);
    } 
    public Fractions reduce(int num, int den) 
    {        
        if (num < 0){
            num = num * -1;            
        }
        
        int gcd = 1;
        int num1 = this.num;
        int num2 = this.den;
                
        for (int a = 1; a <= num1 && a <= num2; a++)
        {
            if (num1 % a == 0 && num2 % a == 0)
            {              
            gcd = a;
            }
        }   
        int FinalNum = num / gcd;
        int FinalDen = den / gcd;
        
        Fractions frac = new Fractions(FinalNum,FinalDen);
        return frac;
     }

     public static Fractions reduce(Fractions other) 
     //STATIC REDUCE
     {      
        if (other.num < 0)
        {
            other.num = other.num * -1;            
        }
        
        int gcd = 1;
        int num1 = other.num;
        int num2 = other.den;
        
        for (int a = 1; a <= num1 && a <= num2; a++) 
        {
            if (num1 % a == 0 && num2 % a == 0)
                gcd = a;
        }      
        int Addnum = other.num / gcd;
        int Addden = other.den / gcd;
        
        Fractions newfrac = new Fractions(Addnum, Addden);
        return newfrac;
    }    
    public String toString()
    {       
        if(num==0)
        {
            return "0";
        }
        else if(den==0)
        {
            return"fraction is undifined";
        }
        else if(den==1)
        {
            return num+"";//Has to have quotes because it has to reurn a string
        }
        else
        {
            return num+ " / "+den;
        }        
    }
    public boolean equals(Fractions other)
    //EQUALS METHOD
    {
        Fractions f1 = new Fractions(num,den);
        Fractions f2 = new Fractions(other.num,other.den);
        
        if(Fractions.reduce(f1).num==Fractions.reduce(f2).num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}        
   


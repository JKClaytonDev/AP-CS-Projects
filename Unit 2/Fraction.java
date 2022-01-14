//Jackson Clayton
//10/1/19
//Fraction Lab
public class Fraction{
   private int n;
   private int d;
   
   //Constructs Fraction with Numerator and Denominator
   public Fraction (int nInput, int dInput){
      n = nInput;
      d = dInput;
   } 
   
   //Creates default Fraction (0)
   public Fraction(){
      n = 0;
      d = 0;
   }
   
   //sets denominator
   public void setDenominator(int dInput){
      d = dInput;
   }
   
   //sets numerator
   public void setNumerator(int nInput){
      n = nInput;
   }
   
   //returns numerator
   public int getNumerator(){
      return n;
   }
   
   //returns denominator
   public int getDenominator(){
      return d;
   }
   
   //Multiplies the fractions
   public Fraction multiply (Fraction aFraction){
      int Numerator = (aFraction.getNumerator())  *  (n);
      int Denominator = aFraction.getDenominator()*d;
      Fraction newFrac = new Fraction(Numerator, Denominator);
      return newFrac; 
   }
   
   //Divides the fractions
   public Fraction divide (Fraction aFraction){
      int Numerator = (aFraction.getNumerator())  *  d;
      int Denominator = aFraction.getDenominator()*n;
      Fraction newFrac = new Fraction(Numerator, Denominator);
      return newFrac; 
   }
   
   //Adds the fractions
   public Fraction add (Fraction aFraction){
      int Numerator = aFraction.getNumerator()*d  +  aFraction.getDenominator()*n;
      int Denominator = aFraction.getDenominator()*d;
      Fraction newFrac = new Fraction(Numerator, Denominator);
      return newFrac; 
   }
   
   //Subtracts the fractions
   public Fraction subtract (Fraction aFraction){
      int Numerator = aFraction.getNumerator()*d  -  aFraction.getDenominator()*n;
      int Denominator = aFraction.getDenominator()*d;
      Fraction newFrac = new Fraction(Numerator, Denominator);
      return newFrac; 
   }
   
   //Simplifies the fraction with the GCF
   public Fraction Simplify(Fraction input){
      int n = input.getNumerator();
      int d = input.getDenominator();
      if (n!=0 ){
         if (d%n == 0){
            d/=n;
            n=1;
         }
      }
      int lowestNumber;
      if (n > d)
         lowestNumber = n;
      else
         lowestNumber = d;
      for (int i = 1; i<=lowestNumber; i++){
         if (n%i  == 0 && d%i == 0){
            n/=i;
            d/=i;
         }
      }
      return new Fraction(n, d);
   }
   
   //returns the decimal value
   public double  decimalValue(){
      return (double)n / (double)d;
   }
   
   //returns the GCF
   public int GCF(int n1, int n2){
      int factor = 0;
      for(int i = 1; i<d; i++){
         if (n1%i == 0 && n2%i == 0){
            factor=i;
         }
      }
      return factor;
   }
   
   //Finds the GCF
   public int gcf(int a, int b){
      int h = 0;
      if (a > b)
         h = a;
      else
         h = b;
      
      int factor = 0;
      if (h > 1){
         for(int i = 1; i<=h; i++){
            if (a%i == 0 && b%i == 0)
               factor=i;
         }
      }
      else{
         for(int i = h; i>=1; i--){
            System.out.println(i);
            if (a%i == 0 && b%i == 0){
               factor=i;
            }
         }
      }
      return factor;
   }
   
   //Simplifies the faction with the GCF
   void simplify(){
      int h = 0;
      if (n > d)
         h = n;
      else
         h = d;
      
      int factor = 0;
      if (h > 1){
         for(int i = 1; i<=h; i++){
            if (n%i == 0 && d%i == 0){
               factor=i;
            }
         }
      }
      else{
         for(int i = h; i>=1; i--){
            if (n%i == 0 && d%i == 0){
               factor=i;
            }
         }
      }
      if (factor != 0){
         n/=factor;
         d/=factor;
      }
   }
   
   //Figures out if the fractions are equal to eachother with their decimal values
   public boolean equals(Fraction F2){
      Fraction F1 = new Fraction(n, d);
      F1.simplify();
      F2.simplify();
      return (F1.decimalValue() == F2.decimalValue());
   }
   
   //Converts them to string
   public String toString(){
      return(n+"/"+d);
   }
}
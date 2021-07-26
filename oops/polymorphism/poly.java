

 class poly {
 
     
  public int add (int a , int b)

  {
    
    return a+b;
}
public double add (double x , double y)
{
   
    return x+y ;
}

public float add (float f1, float f2 )
{
   return f1+f2;

}
public int sub (int a , int b)

{
  
  return a-b;
}
public double sub (double x , double y)
{
 
  return x-y ;
}

public float sub (float f1, float f2 )
{
 return f1-f2;

}
 
public static void main(String[]args){
    poly p =new poly();
    poly p1 = new poly();
  int z= p.add(5, 5);
  double z1= p.add(3, 5);
  float z2= p.add(3.3f, 8.9f);

  int c= p1.sub(5, 5);
  double c1= p1.sub(3, 5);
  float  c2=  p1.sub(3.3f, 8.9f);

    System.out.println(z);
    System.out.println(z1);
    System.out.println(z2);
    
    System.out.println(c);
    System.out.println(c1);
    System.out.println(c2);

}
 }



 



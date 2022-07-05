public class Vector
{
  public static void main(String[] args) 
  {
    int [] v1 = { 1, 3, 5};
    int [] v2 = { -1, -3, -5};
    int [] v3 = { 1, 2, 3, 4};
    int [] v4 = { 1, 1, 1, 1};
    int i=0;
    int a[]=add(v1,v2);
    if(a==null)
    {
      System.out.print("Sum not defined, Vectors of different length ");
    }
    System.out.print(" <");
    for(i=0;i<v1.length;i++)
    {
      System.out.print(v1[i]);
       if(i<v1.length-1)
       {
           System.out.print(",");
       }
    }
    System.out.print("> + ");
    System.out.print("<");
    for(i=0;i<v2.length;i++)
    {
      System.out.print(v2[i]);
       if(i<v2.length-1)
       {
          System.out.print(",");
       }
    }
    System.out.print(">");
    vectorToString(a);
    System.out.println();
    int b[]=add(v1,v3);
    if(b==null)
    {
      System.out.print("Sum not defined, Vectors of different length ");
    }
    System.out.print(" <");
    for(i=0;i<v1.length;i++)
    {
      System.out.print(v1[i]);
       if(i<v1.length-1)
       {
           System.out.print(",");
       }
    }
    System.out.print("> + ");
    System.out.print("<");
    for(i=0;i<v3.length;i++)
    {
      System.out.print(v3[i]);
       if(i<v3.length-1)
       {
          System.out.print(",");
       }
    }
    System.out.print(">");
    vectorToString(b);
    System.out.println();
    int c[]=add(v1,v3);
    if(c==null)
    {
      System.out.print("Sum not defined, Vectors of different length ");
    }
    System.out.print(" <");
    for(i=0;i<v2.length;i++)
    {
      System.out.print(v2[i]);
       if(i<v2.length-1)
       {
           System.out.print(",");
       }
    }
    System.out.print("> + ");
    System.out.print("<");
    for(i=0;i<v3.length;i++)
    {
      System.out.print(v3[i]);
       if(i<v3.length-1)
       {
          System.out.print(",");
       }
    }
    System.out.print(">");
    vectorToString(c);
    System.out.println();
    int d[]=add(v3,v4);
    if(d==null)
    {
      System.out.print("Sum not defined, Vectors of different length ");
    }
    System.out.print(" <");
    for(i=0;i<v3.length;i++)
    {
      System.out.print(v3[i]);
       if(i<v3.length-1)
       {
           System.out.print(",");
       }
    }
    System.out.print("> + ");
    System.out.print("<");
    for(i=0;i<v4.length;i++)
    {
      System.out.print(v4[i]);
       if(i<v4.length-1)
       {
          System.out.print(",");
       }
    }
    System.out.print(">");
    vectorToString(d);
    System.out.println();
    
    int dotResult1=dotProduct(v1,v2);
    if(dotResult1==0)
    {
      System.out.print("Dot product not defined, Vectors of different length ");
    }
    System.out.print(" <");
    for(i=0;i<v1.length;i++)
    {
      System.out.print(v1[i]);
       if(i<v1.length-1)
       {
         System.out.print(",");
       }
    }
    System.out.print("> . ");
    System.out.print("<");
    for(i=0;i<v2.length;i++)
    {
      System.out.print(v2[i]);
       if(i<v2.length-1)
       {
            System.out.print(",");
       }
    }
    System.out.println(" > = "+dotResult1);
    int dotResult2=dotProduct(v1,v3);
    if(dotResult2==0)
    {
      System.out.print("Dot product not defined, Vectors of different length ");
    }
    System.out.print(" <");
    for(i=0;i<v1.length;i++)
    {
      System.out.print(v1[i]);
       if(i<v1.length-1)
       {
         System.out.print(",");
       }
    }
    System.out.print("> . ");
    System.out.print("<");
    for(i=0;i<v3.length;i++)
    {
      System.out.print(v3[i]);
       if(i<v3.length-1)
       {
            System.out.print(",");
       }
    }
    System.out.println(" > = "+dotResult2);  
      int dotResult3=dotProduct(v2,v3);
    if(dotResult3==0)
    {
      System.out.print("Dot product not defined, Vectors of different length ");
    }
    System.out.print(" <");
    for(i=0;i<v2.length;i++)
    {
      System.out.print(v2[i]);
       if(i<v2.length-1)
       {
         System.out.print(",");
       }
    }
    System.out.print("> . ");
    System.out.print("<");
    for(i=0;i<v3.length;i++)
    {
      System.out.print(v3[i]);
       if(i<v3.length-1)
       {
            System.out.print(",");
       }
    }
    System.out.println(" > = "+dotResult3);
    int dotResult4=dotProduct(v3,v4);
    if(dotResult4==0)
    {
      System.out.print("Dot product not defined, Vectors of different length ");
    }
    System.out.print(" <");
    for(i=0;i<v3.length;i++)
    {
      System.out.print(v3[i]);
       if(i<v3.length-1)
       {
         System.out.print(",");
       }
    }
    System.out.print("> . ");
    System.out.print("<");
    for(i=0;i<v4.length;i++)
    {
      System.out.print(v4[i]);
       if(i<v4.length-1)
       {
            System.out.print(",");
       }
    }
    System.out.print(" > = "+dotResult4);
  }
     public static int[] add(int a1[],int a2[])
  {
    int a3[]=new int[a1.length];
     if(a1.length!=a2.length)
     {
       return null;
     }else
     {
        int i=0,index=0;
        for(i=0;i<a1.length ;i++)
        {
           a3[index++]=a1[i]+a2[i];
        }
     }
    return a3;
   }
  public static void vectorToString(int a[])
  {
    if(a==null)
    {
        System.out.print(" = <>");
    }
    else
    {
     System.out.print("= <");
       for(int i=0;i<a.length;i++)
       {
         System.out.print(a[i]);
           if(i<a.length-1)
           {
              System.out.print(",");
           }
       }
     System.out.print(">");
    }
  }
  public static int dotProduct(int a1[],int a2[])
  {
    int result=0;
     if(a1.length!=a2.length)
     {
         return 0;
     }
     else
     {
       for(int i=0;i<a1.length ;i++)
       {
         result+=a1[i]*a2[i];
       }
     }
    return result;
  }
}
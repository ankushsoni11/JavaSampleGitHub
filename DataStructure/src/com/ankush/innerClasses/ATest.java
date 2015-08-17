package com.ankush.innerClasses;

public class ATest
{
	 class AClass
	 {
	  public int iMember;
	  public float fMember;
	 }
 public void aMethod( int i, Object o )
 {
  i = 0;
  if( o instanceof AClass )
  {
   AClass aClass = (AClass)o;
   aClass.iMember = 1;
   aClass.fMember = 2.5f;
   }
 }
 public void test()
 {
  int iVariable = 10;
  AClass aClass = new AClass();
    
  aClass.iMember = 11;
  aClass.fMember = 12.5f;
  aMethod( iVariable, aClass );
  System.out.print(iVariable );
  System.out.print(",");
  System.out.print( aClass.iMember );
  System.out.print(",");
  System.out.print( aClass.fMember );
 }
 public static void main( String[] args )
 {
    ATest aTest = new ATest();
    aTest.test();
 }
}

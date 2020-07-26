import java.io.PrintStream;

public final class al
{
  private static int jdField_do = -1;
  public static int jdField_if = -1;
  public static int a = -1;
  public static int[] jdField_for;

  public static byte[] a(int paramInt)
  {
    a5.fR = true;
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 2297615:
      localac.jdField_do(jdField_do);
      localac.jdField_if(a5.hC[0]);
      localac.jdField_if(a5.hC[1]);
      a5.A();
      break;
    case 2293874:
      localac.jdField_do(jdField_if);
      break;
    case 2293875:
      localac.jdField_do(a);
      localac.a(bv.j9);
      localac.a(bv.j8);
      break;
    case 2293876:
      localac.jdField_do(ah.aQ);
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2145128208:
      jdField_do = paramac.jdMethod_byte();
      return;
    case -2145127951:
      System.out.println("玩家点击活动========");
      paramInt = paramac.jdField_if();
      int i = 0;
      int[] arrayOfInt = new int[paramInt];
      String[] arrayOfString = new String[paramInt];
      jdField_for = new int[paramInt];
      for (int j = 0; j < paramInt; j++)
      {
        arrayOfInt[j] = paramac.jdMethod_byte();
        i = 1;
        arrayOfString[j] = paramac.jdMethod_goto();
        jdField_for[j] = paramac.jdMethod_byte();
        System.out.println("功能ID: " + jdField_for[j]);
      }
      if (i == 0)
        break;
      (br.iW = new br(2)).a(arrayOfString, arrayOfInt);
      br.iW.m(false);
      a5.jdMethod_try(5);
      a5.fR = false;
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     al
 * JD-Core Version:    0.6.0
 */
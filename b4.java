import java.io.PrintStream;

public final class b4
{
  public static int e = 0;
  public static int jdField_do = 0;
  public static String f;
  public static int jdField_case = 0;
  public static String jdField_byte;
  public static String jdField_goto;
  public static String d;
  public static String jdField_if;
  private static byte c = 0;
  public static boolean jdField_else = false;
  public static boolean jdField_char = true;

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 2621441:
      bo.b = 1;
      a5.fR = true;
      break;
    case 2621442:
      bo.b = 0;
      a5.fR = true;
      break;
    case 2621443:
    case 2621444:
    case 2621447:
    case 2621448:
      a5.fR = true;
      break;
    case 2621445:
      a5.fR = true;
      localac.jdField_do(jdField_do);
      localac.a(bo.b);
      break;
    case 2621446:
      a5.fR = true;
      localac.a(bo.b);
      if (e == -100)
        localac.jdField_do(jdField_do);
      else
        localac.jdField_do(0);
      if (e == -100)
        localac.jdField_do(jdField_case);
      else
        localac.jdField_do(e);
      localac.jdField_if(d);
      localac.jdField_if(jdField_if);
      localac.jdField_if(jdField_goto);
      localac.jdField_if(jdField_byte);
      if (jdField_char)
        localac.jdField_if("p");
      else
        localac.jdField_if("k");
      break;
    case 2621451:
      a5.fR = true;
      if (e == -100)
        localac.jdField_do(jdField_do);
      else
        localac.jdField_do(0);
      break;
    case 2621449:
      a5.fR = true;
      if (e == -100)
        localac.jdField_do(jdField_do);
      else
        localac.jdField_do(0);
      localac.a(bo.b);
      localac.jdField_if(jdField_byte);
      break;
    case 2621450:
      a5.fR = true;
      a5.A();
      a5.eQ.a(2425024);
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2144796673:
      System.out.println("~~~~~~~~~~~~~~充值失败~~~~~~~~~~~~~~~");
      if ((b4.c = (byte)(c + 1)) == 2)
      {
        System.out.println("第二次充值失败");
        c = 0;
        jdField_char = true;
        a5.eQ.a(2424998);
        return;
      }
      System.out.println("第一次充值失败");
      a5.eQ.a(2621446);
      return;
    case -2144862206:
      jdField_else = paramac.jdField_case();
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     b4
 * JD-Core Version:    0.6.0
 */
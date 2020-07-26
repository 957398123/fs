import java.util.Vector;

public final class am
{
  public static long jdField_if;
  public static long c;
  public static short jdField_byte;
  public static int jdField_new;
  public static String[] jdField_case = new String[5];
  public static byte jdField_try = 0;
  public static boolean jdField_else;
  private static int d;
  private static long jdField_int;
  private static boolean jdField_char;
  public static byte jdField_goto;
  public static boolean a = true;
  public static boolean jdField_void;
  public static String[] b = new String[2];
  public static byte jdField_for = -1;
  private static byte jdField_long = -1;
  public static byte jdField_do = -1;

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 3342337:
    case 3342339:
      localac.a(r.mp);
      a5.fR = true;
      break;
    case 3342338:
      localac.a(a7.fF);
      a5.fR = true;
      break;
    case 3342340:
      localac.jdField_do(d);
      localac.a(jdField_int);
      localac.a(jdField_char);
      a5.fR = true;
      break;
    case 3342341:
    case 3342343:
      localac.a(jdField_goto);
      localac.jdField_do(d);
      localac.a(jdField_int);
      localac.a(jdField_char);
      a5.fR = true;
      break;
    case 3342342:
    case 3342344:
      paramInt = (r)a5.es.cf().elementAt(10);
      localac.a(paramInt.mz);
      localac.a(jdField_goto);
      localac.jdField_do(d);
      localac.a(jdField_int);
      localac.a(jdField_char);
      a5.fR = true;
      break;
    case 3342352:
      jdField_long = r.mp;
      localac.a(r.mp);
      a5.fR = true;
      break;
    case 3342353:
      localac.a(jdField_for);
      localac.a(jdField_long);
      a5.fR = true;
      break;
    case 3342354:
    case 3342356:
    case 3342361:
      a5.fR = true;
      break;
    case 3342357:
    case 3342358:
      localac.a(jdField_do);
      a5.fR = true;
      break;
    case 3342359:
      a5.fR = true;
      localac.a(aq.a);
      localac.a(aq.jdField_int);
      break;
    case 3342360:
      a5.fR = true;
      localac.a(aq.a);
      localac.a(aq.jdField_int);
      aq.jdField_if();
    case 3342345:
    case 3342346:
    case 3342347:
    case 3342348:
    case 3342349:
    case 3342350:
    case 3342351:
    case 3342355:
    }
    return localac.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2144141311:
      jdField_if = paramac.jdField_char();
      c = paramac.jdField_char();
      jdField_byte = paramac.jdField_new();
      jdField_new = paramac.jdField_byte();
      d = paramac.jdField_byte();
      jdField_int = paramac.jdField_char();
      jdField_char = paramac.jdField_case();
      jdField_else = true;
      return;
    case -2144141310:
      jdField_void = paramac.jdField_case();
      b[0] = paramac.jdField_goto();
      b[1] = paramac.jdField_goto();
      if (jdField_void)
        break;
      jdField_for = -1;
      jdField_long = -1;
      return;
    case -2144141309:
      aq.a = paramac.jdField_if();
      aq.a(4, true, 0, false);
      return;
    case -2144141308:
      aq.jdField_int = paramac.jdField_if();
      aq.a(6, true, 0, true);
    }
  }

  public static void jdField_if()
  {
    if (jdField_new != 0)
      jdField_new = 0;
    if (jdField_else)
      jdField_else = false;
    if (!a)
      a = true;
  }

  public static void a()
  {
    if (jdField_void)
    {
      jdField_void = false;
      for (int i = 0; i < 2; i++)
        b[i] = "";
      jdField_for = -1;
      jdField_long = -1;
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     am
 * JD-Core Version:    0.6.0
 */
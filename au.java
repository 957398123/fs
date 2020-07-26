import java.util.Vector;

public final class au
{
  public static byte jdField_if = 0;
  public static byte jdField_for = 0;
  public static byte jdField_int = -1;
  public static byte jdField_try = -1;
  public static int[] jdField_new;
  public static byte a = 0;
  public static byte jdField_else = 0;
  public static byte jdField_char = -1;
  public static byte jdField_case = 0;
  public static byte jdField_byte = -1;
  public static byte jdField_do = -1;

  public static byte[] a(int paramInt)
  {
    a5.fR = true;
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 1966081:
      localac.a(jdField_int);
      localac.a(jdField_if);
      break;
    case 1966083:
      localac.a(jdField_for);
      break;
    case 1966082:
      break;
    case 1966084:
      localac.a(jdField_try);
      break;
    case 1966087:
      localac.a(jdField_if);
      localac.a(jdField_int);
      break;
    case 1966088:
      localac.a(jdField_int);
      localac.a(jdField_if);
      localac.a(jdField_try);
      break;
    case 1966085:
      localac.a(jdField_int);
      localac.a(jdField_if);
      localac.a(jdField_for);
      localac.a(jdField_try);
      jdField_case = 1;
      break;
    case 1966089:
      localac.a(jdField_int);
      localac.a(jdField_if);
      localac.a(jdField_for);
      localac.a(jdField_try);
      break;
    case 1966090:
      localac.a(jdField_int);
      localac.a(jdField_if);
      localac.a(jdField_for);
      localac.a(jdField_try);
      break;
    case 1966092:
      localac.a(jdField_int);
      localac.a(jdField_if);
      localac.a(jdField_for);
      localac.a(jdField_try);
      break;
    case 1966098:
      localac.a(jdField_int);
      break;
    case 1966099:
      localac.a(jdField_int);
      localac.a(jdField_try);
      break;
    case 1966100:
      localac.a(jdField_int);
      break;
    case 1966102:
    case 1966104:
      localac.a(jdField_int);
      localac.a(jdField_for);
      localac.a(jdField_try);
      break;
    case 1966103:
    case 1966105:
      localac.a(jdField_int);
      localac.a(jdField_for);
      break;
    case 1966113:
      localac.a(jdField_byte);
      break;
    case 1966101:
      localac.a(jdField_for);
      localac.a(jdField_int);
      break;
    case 1966093:
      localac.a(jdField_int);
      localac.a(jdField_if);
    case 1966086:
    case 1966091:
    case 1966094:
    case 1966095:
    case 1966096:
    case 1966097:
    case 1966106:
    case 1966107:
    case 1966108:
    case 1966109:
    case 1966110:
    case 1966111:
    case 1966112:
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2145517564:
      be.cn();
      return;
    case -2145517550:
      if ((paramInt = paramac.jdField_case()) != true)
        break;
      (paramInt = (a7)a5.es.cf().elementAt(4)).g(false);
      paramInt.fC = (byte)r.mY[2];
      paramac = r.mY[1];
      paramInt.ft = true;
      paramInt.jdField_if(paramac, false);
      paramInt.a(a5.gg);
      return;
    case -2145517536:
      a5.dh = paramInt;
      a5.gb = paramac.jdField_int((paramInt = paramac).jdField_do.length - 6);
    }
  }

  public static void a()
  {
    jdField_if = 0;
    jdField_for = 0;
    jdField_int = -1;
    jdField_try = -1;
    jdField_else = 0;
    jdField_char = -1;
    jdField_case = 0;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     au
 * JD-Core Version:    0.6.0
 */
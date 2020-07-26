import java.util.Vector;

public final class aj
{
  public static byte jdField_byte = -1;
  private static byte jdField_int = -1;
  public static byte jdField_for = 0;
  private static byte[] jdField_long = { -1, -1 };
  private static byte jdField_if = 0;
  public static byte jdField_do = 0;
  public static byte jdField_goto = -1;
  public static Vector jdField_new = new Vector();
  public static Vector a = new Vector();
  public static byte jdField_case = -1;
  public static byte jdField_void = 0;
  private static boolean jdField_else;
  public static String jdField_try;
  public static byte jdField_char;

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 2228226:
      a5.fR = true;
      localac.a(jdField_int);
      localac.a(jdField_byte);
      localac.a(jdField_for);
      localac.a(jdField_void);
      break;
    case 2228227:
      a5.fR = true;
      localac.a(jdField_byte);
      localac.a(jdField_for);
      if ((jdField_long[0] == -1) && (jdField_long[1] != -1))
      {
        jdField_long[0] = jdField_long[1];
        jdField_long[1] = -1;
      }
      localac.a(jdField_long[0]);
      localac.a(jdField_long[1]);
      break;
    case 2228228:
      a5.fR = true;
      localac.a(jdField_byte);
      localac.a(0);
      localac.a(jdField_for);
      break;
    case 2228229:
    case 2228230:
      a5.fR = true;
      localac.a(jdField_byte);
      localac.a(0);
      int i = 0;
      localac.a((byte)jdField_new.size());
      for (i = 0; i < jdField_new.size(); i++)
        localac.a(((Byte)jdField_new.elementAt(i)).byteValue());
      for (i = 0; i < a.size(); i++)
        localac.a(((Byte)a.elementAt(i)).byteValue());
      if (paramInt != 2228229)
        break;
      localac.a(jdField_for);
      break;
    case 2228231:
      a5.fR = true;
      localac.a(jdField_case);
      break;
    case 2228225:
    case 2228240:
      a5.fR = true;
      if (paramInt != 2228240)
        break;
      jdField_else = true;
      break;
    case 2228242:
    case 2228256:
    case 2228258:
    case 2228260:
      a5.fR = true;
      break;
    case 2228257:
      jdField_byte = (byte)r.mY[0];
      a5.fR = true;
      localac.a(jdField_byte);
    case 2228232:
    case 2228233:
    case 2228234:
    case 2228235:
    case 2228236:
    case 2228237:
    case 2228238:
    case 2228239:
    case 2228241:
    case 2228243:
    case 2228244:
    case 2228245:
    case 2228246:
    case 2228247:
    case 2228248:
    case 2228249:
    case 2228250:
    case 2228251:
    case 2228252:
    case 2228253:
    case 2228254:
    case 2228255:
    case 2228259:
    }
    return localac.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    short s2;
    short s3;
    Object localObject;
    switch (paramInt)
    {
    case -2145255416:
      if ((aj.jdField_int = paramac.jdField_if()) < 0)
        break;
      paramInt = (a7)a5.es.cf().elementAt(4);
      r localr1 = (r)a5.es.cf().elementAt(7);
      if (jdField_do > 5)
        paramInt.a(true, 5);
      else
        paramInt.a(true, jdField_do);
      paramInt.fC = (byte)r.mY[2];
      s2 = r.mY[1];
      paramInt.ft = true;
      paramInt.jdField_if(s2, false);
      paramInt.a(a5.gg);
      paramInt.a(true, a5.es);
      localr1.a(false, a5.es);
      jdField_try = localr1.mV[localr1.mz];
      jdField_char = localr1.ne[localr1.mz];
      return;
    case -2145255415:
      paramInt = (r)a5.es.cf().elementAt(7);
      short s1 = paramac.jdField_if();
      for (s2 = 0; s2 < s1; s2 = (byte)(s2 + 1))
      {
        int i = paramac.jdField_if();
        paramInt.mQ[i] = paramac.jdField_byte();
        s3 = paramac.jdField_new();
        paramInt.mW[i] = s3;
        paramInt.mI[i] = r.k((short)(s3 % 1000));
        paramInt.nu[i] = paramac.jdField_if();
        paramInt.mV[i] = paramac.jdField_goto();
        paramInt.ne[i] = paramac.jdField_if();
        paramInt.jdField_do(i, s3);
        paramInt.jdField_if(paramInt.mV[paramInt.ep()], r.E(paramInt.ne[paramInt.ep()]));
      }
      if (jdField_else)
      {
        (localObject = (ah)a5.es.cf().elementAt(14)).jdField_char(bm.bP);
        ((ah)localObject).a("此处放置原石");
        jdField_else = false;
      }
      a();
      return;
    case -2145255407:
      a();
      return;
    case -2145255391:
      if ((aj.jdField_int = paramac.jdField_if()) < 0)
        break;
      localObject = (a7)a5.es.cf().elementAt(4);
      r localr2 = (r)a5.es.cf().elementAt(7);
      ((a7)localObject).g(false);
      ((a7)localObject).fC = (byte)r.mY[2];
      s3 = r.mY[1];
      ((a7)localObject).ft = true;
      ((a7)localObject).jdField_if(s3, false);
      ((a7)localObject).a(a5.gg);
      ((ba)localObject).a(true, a5.es);
      localr2.a(false, a5.es);
    }
  }

  public static void jdField_if()
  {
    jdField_do = (byte)(jdField_do + jdField_void);
    if (jdField_new.size() < 5)
    {
      jdField_byte = (byte)r.mY[0];
      jdField_new.addElement(new Byte(jdField_byte));
      a.addElement(new Byte(jdField_void));
    }
    a5.eQ.a(2228226);
  }

  public static void a()
  {
    if (jdField_byte != -1)
    {
      r localr;
      (localr = (r)a5.es.cf().elementAt(7)).a(false, a5.es);
      int i = 1;
      i = 4;
      a7 locala7;
      (locala7 = (a7)a5.es.cf().elementAt(4)).a(true, a5.es);
      locala7.g(false);
      locala7.ft = false;
      locala7.a(null);
      jdField_byte = -1;
      jdField_int = -1;
      jdField_for = 0;
      jdField_if = 0;
      jdField_do = 0;
      jdField_goto = -1;
      jdField_new = new Vector();
      a = new Vector();
      for (int j = 0; j < jdField_long.length; j++)
        jdField_long[j] = -1;
      for (j = 0; j < r.mY.length; j++)
        r.mY[j] = -1;
      ah localah1 = (ah)a5.es.cf().elementAt(14);
      ah localah2;
      if (a5.es.g9 != 2228256)
      {
        (localah2 = (ah)a5.es.cf().elementAt(12)).jdField_case(jdField_do);
        localah1.jdField_char(bm.bP);
        localah1.a("此处放置原石");
      }
      else
      {
        localah1.jdField_char(bm.bP);
        localah1.a("此处放置宝石");
      }
      (localah2 = (ah)a5.es.cf().elementAt(11)).a("0");
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     aj
 * JD-Core Version:    0.6.0
 */
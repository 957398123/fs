import java.util.Vector;

public final class by
{
  public static boolean jdField_do = false;
  public static a9[] jdField_try = new a9[7];
  public static int c = 0;
  public static final byte[] jdField_byte = { 1, 3, 5, 7, 9, 11, 13 };
  public static a7[] jdField_goto = new a7[7];
  public static byte jdField_case = 0;
  public static int jdField_new = 0;
  public static byte a = 0;
  public static int e = 0;
  public static int jdField_long = 0;
  public static byte jdField_int = 0;
  private static int jdField_for;
  public static boolean b = false;
  public static boolean jdField_void = false;
  public static boolean f = false;
  public static boolean d = false;
  public static byte jdField_if = 0;
  public static boolean jdField_else = false;

  public static byte[] a(int paramInt)
  {
    ac localac1;
    (localac1 = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 2097155:
      a5.fR = true;
      break;
    case 2097153:
      a5.fR = true;
      for (paramInt = 0; paramInt < 7; paramInt++)
      {
        int i = jdField_try[paramInt].b3();
        ac localac2;
        (localac2 = localac1).a((byte)i);
      }
      localac1.jdField_do(c);
      break;
    case 2097154:
      a5.fR = true;
      localac1.jdField_do(jdField_for);
      localac1.jdField_do(c);
      localac1.a(jdField_case);
      localac1.jdField_do(jdField_for);
    }
    return localac1.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2145386495:
      a5.fR = false;
      b = paramac.jdField_case();
      c = paramac.jdField_byte();
      jdField_for = paramac.jdField_byte();
      a = paramac.jdField_if();
      jdField_do = true;
      f = true;
      jdField_int = 0;
      b5.jdField_case("-------award-------=" + b);
      b5.jdField_case("-------m_nJetton-------=" + c);
      b5.jdField_case("-------jetton-------=" + jdField_for);
      b5.jdField_case("-------index1-------=" + a);
      return;
    case -2145386494:
      a5.fR = false;
      jdField_void = paramac.jdField_case();
      c = paramac.jdField_byte();
      jdField_for = paramac.jdField_byte();
      d = true;
      b5.jdField_case("-------award_1-------=" + jdField_void);
      b5.jdField_case("-------m_nJetton-------=" + c);
      b5.jdField_case("-------jetton-------=" + jdField_for);
    }
  }

  public static void a(byte paramByte)
  {
    ah localah = (ah)a5.es.cf().elementAt(37);
    for (int j = 0; j < 7; j++)
    {
      jdField_try[j] = ((a9)a5.es.cf().elementAt(j + 24));
      if ((jdField_try[j].b3() == 0) || (!jdField_try[j].q()))
        continue;
      b5.jdField_case("textfield[i].getNumber()=" + jdField_try[j].b3());
      int i;
      if (paramByte == 1)
      {
        i = Integer.parseInt(localah.aj()) - jdField_try[j].b3();
        localah.a("" + i);
      }
      else
      {
        if (paramByte != 2)
          continue;
        i = Integer.parseInt(localah.aj()) + jdField_try[j].b3();
        localah.a("" + i);
      }
    }
  }

  public static void a()
  {
    ah localah1 = (ah)a5.es.cf().elementAt(32);
    ah localah2 = (ah)a5.es.cf().elementAt(36);
    a7 locala71 = (a7)a5.es.cf().elementAt(7);
    a7 locala72 = (a7)a5.es.cf().elementAt(9);
    a7 locala73 = (a7)a5.es.cf().elementAt(31);
    a7 locala74 = (a7)a5.es.cf().elementAt(33);
    ao localao = (ao)a5.es.cf().elementAt(1);
    f = false;
    e = 0;
    jdField_long = 0;
    if ((b) && (jdField_if == 0))
    {
      localah2.a("" + jdField_for);
      localah1.a("结算");
      localao.a("结算", 0);
      jdField_if = 1;
      as.a(0, "恭喜您获得了" + jdField_for + "枚代币，您可以结算该代币，也可以按左右键来猜阴阳，如果猜中，你获得代币会翻倍！", "确定", "", -1, -2);
    }
    else
    {
      int i;
      if (((!b) && (jdField_if == 0)) || ((!jdField_void) && (jdField_if == 1)))
      {
        localah1.a("开局");
        localao.a("开局", 0);
        as.a(0, "很遗憾，您没有获得代币，请继续努力！", "确定", "", -1, -2);
        jdField_do = false;
        localah2.a("0");
        for (i = 0; i < 7; i++)
          jdField_try[i].jdField_void("0");
        jdField_if = 0;
        jdField_new = 0;
        a = 0;
      }
      else if ((jdField_void) && (jdField_if == 1))
      {
        i.a("" + jdField_for);
        localah1.a("结算");
        localao.a("结算", 0);
        as.a(0, "恭喜您获得了" + jdField_for + "枚代币，您可以结算该代币，也可以继续猜阴阳！", "确定", "", -1, -2);
      }
    }
    locala71.a(false, a5.es);
    locala72.a(false, a5.es);
    locala73.a(false, a5.es);
    locala74.a(false, a5.es);
    localah1.a(true, a5.es);
    jdField_else = false;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     by
 * JD-Core Version:    0.6.0
 */
public final class u
{
  private static int b = 30;
  private byte jdField_int = 0;
  String jdField_case = "";
  private byte[] c = null;
  private String jdField_void = "";
  private String h = "";
  private static byte p = 0;
  static int t = 0;
  static String m = "";
  private byte o = 0;
  int jdField_for = 0;
  private byte n = 0;
  private static byte jdField_if = 0;
  private static boolean e = false;
  private short[] jdField_try = null;
  private String[] jdField_do = null;
  private int[] k = null;
  private byte[] g = null;
  private static u q;
  public static String d;
  public static String[] u;
  public static int l;
  private static int[] jdField_goto;
  private static int[] j;
  public static byte jdField_long;
  public static boolean[] r;
  public static boolean jdField_byte;

  public static u jdField_if()
  {
    if (q == null)
      q = new u();
    return q;
  }

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    int i1;
    int i;
    switch (paramInt)
    {
    case 2686977:
      localac.jdField_if(f.jdField_case());
      localac.a(jdField_if().jdField_int);
      localac.jdField_do(jdField_if().jdField_for);
      localac.a(jdField_if().o);
      localac.jdField_if(m);
      localac.jdField_if(jdField_if().jdField_case);
      i1 = t;
      (paramInt = localac).a((byte)i1);
      if (b > 4)
        b -= 4;
      as.a(0, "命令发送中，预计需要等待" + b + "秒", "", "", -2, -2);
      break;
    case 2686978:
      localac.a(p);
      paramInt = 0;
      if (t > 0)
      {
        if (t == 1)
          paramInt = bk.H.d().length;
        else if (p == t)
          paramInt = bk.H.d().length - (p - 1 << 8);
        else
          paramInt = 256;
        byte[] arrayOfByte = new byte[paramInt];
        for (i1 = 0; i1 < paramInt; i1++)
          arrayOfByte[i1] = bk.H.d()[(i1 + (p - 1 << 8))];
        jdField_if().c = arrayOfByte;
      }
      localac.a((short)paramInt);
      localac.jdField_if(jdField_if().c);
      break;
    case 2686979:
      jdField_if = (byte)jdField_if().jdField_do.length;
      jdField_if().n = 0;
      e = false;
      localac.a(jdField_if);
      for (i = 0; i < jdField_if; i++)
      {
        jdField_if();
        i1 = null[i] != 0 ? 0 : 1;
        (paramInt = localac).a((byte)i1);
        localac.jdField_do(jdField_if().jdField_try[i]);
        localac.jdField_do(jdField_if().k[i]);
        if (jdField_if().g[i] != 1)
          continue;
        jdField_if().n = (byte)i;
      }
      for (i = 0; i < jdField_if().n; i++)
      {
        jdField_if();
        if (null[i] == 0)
          continue;
        jdField_if().a(1, jdField_if().jdField_try[i]);
        a5.eQ.a(2686977);
        break;
      }
      i = jdField_if().n;
    case 2686980:
      while (true)
        if (i < jdField_if)
        {
          jdField_if();
          if (null[i] != 0)
          {
            jdField_if().a(1, jdField_if().jdField_try[i]);
            a5.eQ.a(2686977);
            e = true;
          }
          else
          {
            i++;
            continue;
          }
        }
        else
        {
          break;
          localac.a(jdField_long);
          for (i = 0; i < jdField_long; i = (byte)(i + 1))
          {
            localac.a(r[i]);
            localac.jdField_do(jdField_goto[i]);
            localac.jdField_do(j[i]);
          }
        }
    }
    return localac.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2144796671:
      if ((paramInt = paramac.jdField_if()) == 1)
      {
        p = 1;
        a5.eQ.a(2686978);
        return;
      }
      as.a(0, "请求失败，请重试", "确定", "", -1, -2);
      a5.fR = false;
      return;
    case -2144796670:
      switch (paramInt = paramac.jdField_if())
      {
      case 1:
        jdField_if().jdField_int = paramac.jdField_if();
        jdField_if().jdField_void = paramac.jdField_goto();
        jdField_if().h = paramac.jdField_goto();
        a5.fR = true;
        bk.a(jdField_if().jdField_void, jdField_if().h);
        m = "http://" + jdField_if().jdField_void + jdField_if().h;
        if (b > 4)
          b -= 4;
        as.a(0, "信息获取中，预计需要等待" + b + "秒", "", "", -2, -2);
        return;
      case 2:
        return;
      case 3:
        as.a(0, paramac.jdField_goto(), "确定", "", -1, -2);
        return;
      case 4:
        if (!e)
          paramInt = jdField_if().n;
      case 5:
      }
    case -2144796669:
    case -2144796668:
    case -2144796667:
    case -2144796666:
      while (true)
        if (paramInt < jdField_if)
        {
          jdField_if();
          if (null[paramInt] != 0)
          {
            jdField_if().a(1, jdField_if().jdField_try[paramInt]);
            a5.eQ.a(2686977);
          }
          else
          {
            paramInt++;
            continue;
          }
        }
        else
        {
          return;
          p = (byte)(p + 1);
          a5.eQ.a(2686978);
          return;
          as.a(0, "请求失败，请重试", "确定", "", -1, -2);
          a5.fR = false;
          return;
          jdField_if();
          if ((paramInt = paramac.jdField_if()) != 1)
            break;
          bk.jdField_byte();
          jdField_if();
          paramac.jdField_goto();
          if ((paramInt = paramac.jdField_if()) > 0)
          {
            jdField_if();
            jdField_if().jdField_try = null;
            jdField_if().jdField_do = null;
            jdField_if().k = null;
            jdField_if().g = null;
            jdField_if().jdField_try = new short[paramInt];
            jdField_if().jdField_do = new String[paramInt];
            jdField_if().k = new int[paramInt];
            jdField_if().g = new byte[paramInt];
            for (int i = 0; i < paramInt; i++)
            {
              jdField_if().jdField_try[i] = paramac.jdMethod_new();
              jdField_if().jdField_do[i] = paramac.jdField_goto();
              jdField_if().k[i] = paramac.jdField_byte();
              jdField_if().g[i] = paramac.jdField_if();
            }
          }
          return;
          d = paramac.jdField_goto();
          l = paramac.jdField_byte();
          jdField_goto = new int[u.jdField_long = paramac.jdField_if()];
          j = new int[jdField_long];
          u = new String[jdField_long];
          r = new boolean[jdField_long];
          for (paramInt = 0; paramInt < jdField_long; paramInt++)
          {
            jdField_goto[paramInt] = paramac.jdField_byte();
            j[paramInt] = paramac.jdField_byte();
            u[paramInt] = paramac.jdField_goto();
          }
          jdField_byte = true;
          return;
          if (a5.gQ != null)
            as.a8();
          be.ci();
          return;
          jdField_if().jdField_int = 0;
          p = 0;
          t = 0;
        }
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    b = 45;
    this.jdField_int = 0;
    t = 0;
    m = "";
    this.o = 1;
    this.jdField_for = paramInt2;
    a5.fR = true;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     u
 * JD-Core Version:    0.6.0
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class bw
{
  private static int jdField_byte = 0;
  private static int g = 0;
  public static int f = 0;
  private static byte h = 0;
  public static byte d = 0;
  public static byte a = 0;
  public static short jdField_void = 1;
  public static short c = 1;
  public static long jdField_goto = -1L;
  public static int i = 0;
  public static int jdField_int = 0;
  public static int jdField_case = 0;
  public static int jdField_if = 0;
  public static byte jdField_do = 0;
  public static boolean jdField_char = false;
  public static String jdField_new = "";
  public static boolean e = true;
  public static byte jdField_for = -1;
  public static byte jdField_long = -1;
  public static byte jdField_try = -1;
  public static byte jdField_else = -1;
  public static byte b = -1;

  public static byte[] a(int paramInt)
  {
    a5.fR = true;
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 1900545:
      localac.jdField_do(l.g.jdField_new());
      break;
    case 1900546:
      localac.a(jdField_for);
      localac.a(jdField_long);
      localac.a(jdField_try);
      localac.a(jdField_else);
      localac.a(b);
      localac.a(jdField_void);
      break;
    case 1900547:
      break;
    case 1900548:
      break;
    case 1900550:
      localac.a((byte)r.mY[0]);
      localac.a(h);
      localac.jdField_do(jdField_byte);
      localac.jdField_do(g);
      localac.a(d);
      break;
    case 1900552:
      r.E((paramInt = (m)(paramInt = (bv)a5.es.cf().elementAt(2)).dt().elementAt(paramInt.dw())).v);
      localac.a(jdField_goto);
      am.a = false;
      break;
    case 1900553:
      localac.a(jdField_goto);
      localac.jdField_do(jdField_if);
      localac.a(jdField_for);
      localac.a(jdField_long);
      localac.a(jdField_try);
      localac.a(jdField_else);
      localac.a(b);
      localac.a(jdField_void);
      b5.jdField_case("出价");
      break;
    case 1900554:
      localac.jdField_if(jdField_new);
      localac.a(jdField_void);
      break;
    case 1900555:
      localac.a(jdField_goto);
      localac.jdField_do(jdField_if);
      localac.jdField_if(jdField_new);
      localac.a(jdField_void);
      b5.jdField_case("搜索出价");
    case 1900549:
    case 1900551:
    }
    return localac.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2145583099:
    case -2145583097:
      b5.jdField_case("Auction.rec_Parse() S_AUCTION_HANG...");
      a5.dh = paramInt;
      a5.gb = paramac.jdField_int((paramInt = paramac).jdField_do.length - 6);
    }
  }

  public static void jdField_if(byte paramByte)
  {
    a7 locala7 = (a7)a5.es.cf().elementAt(3);
    if ((paramByte == 1) && (locala7.ft == true))
    {
      jdField_for();
      locala7.g(false);
      locala7.ft = false;
      locala7.a(null);
      return;
    }
    if ((paramByte == 1) && (!locala7.ft))
    {
      as.a(0, "请选择拍卖物品!", "确定", "", -1, -2);
      return;
    }
    if (paramByte == 2)
    {
      jdField_do = 0;
      jdField_for();
      locala7.g(false);
      locala7.ft = false;
      locala7.a(null);
    }
  }

  public static void jdField_do()
  {
    a5.es.cf().elementAt(3);
    a9 locala91 = (a9)a5.es.cf().elementAt(4);
    a9 locala92 = (a9)a5.es.cf().elementAt(5);
    if (locala91.cc().toString().trim().equals("0"))
    {
      as.a(0, "竞拍价不能为零", "确定", "", -1, -2);
      return;
    }
    if (locala92.cc().toString().trim().equals("0"))
    {
      as.a(0, "一口价不能为零", "确定", "", -1, -2);
      return;
    }
    try
    {
      jdField_byte = Integer.parseInt(locala91.cc().toString().trim());
      g = Integer.parseInt(locala92.cc().toString().trim());
    }
    catch (NumberFormatException localNumberFormatException)
    {
      jdField_byte = 0;
      g = 0;
      localNumberFormatException.printStackTrace();
    }
    if (jdField_byte >= g)
    {
      as.a(0, "一口价不能小于或等于竞拍价", "确定", "", -1, -2);
      return;
    }
    int j = 0;
    switch (d)
    {
    case 0:
      j = 6;
      break;
    case 1:
      j = 12;
      break;
    case 2:
      j = 24;
      break;
    case 3:
      j = 48;
      break;
    case 4:
      j = 72;
    }
    as.a(0, "要扣除" + j + "个金币的保证金，您是否确定拍卖", "确定", "取消", 1900550, -1);
  }

  private static void jdField_for()
  {
    ao localao = (ao)a5.es.cf().elementAt(1);
    a9 locala91 = (a9)a5.es.cf().elementAt(4);
    a9 locala92 = (a9)a5.es.cf().elementAt(5);
    ay localay = (ay)a5.es.cf().elementAt(6);
    r localr = (r)a5.es.cf().elementAt(8);
    ah localah = (ah)a5.es.cf().elementAt(9);
    locala91.jdField_void("0");
    locala92.jdField_void("0");
    localah.a("");
    localay.jdField_case(0);
    r.m2 = "";
    d = 0;
    h = 0;
    jdField_byte = 0;
    g = 0;
    jdField_char = false;
    for (int j = 0; j < r.mY.length; j++)
      r.mY[j] = -1;
    a = 0;
    if (localr.q() == true)
    {
      localao.a("操作", 0);
      return;
    }
    localao.a("", 0);
  }

  public static void a(byte paramByte)
  {
    ao localao = (ao)a5.es.cf().elementAt(1);
    a7 locala7 = (a7)a5.es.cf().elementAt(3);
    r localr = (r)a5.es.cf().elementAt(8);
    ah localah;
    (localah = (ah)a5.es.cf().elementAt(9)).a(r.m2);
    if ((paramByte >= 1) && (jdField_char == true))
      locala7.a(true, paramByte);
    else
      locala7.a(false, paramByte);
    h = paramByte;
    locala7.fC = (byte)r.mY[2];
    paramByte = r.mY[1];
    locala7.ft = true;
    locala7.jdField_if(paramByte, false);
    locala7.a(a5.gg);
    locala7.a(true, a5.es);
    localr.a(false, a5.es);
    a = 1;
    localao.a("操作", 0);
  }

  public static void a()
  {
    jdField_void = 1;
  }

  public static void a(be parambe, Graphics paramGraphics, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean1) && (!paramBoolean2))
      return;
    int j = (parambe = (ah)parambe.cf().elementAt(15)).jdField_long();
    parambe = parambe.v() - 5 - 6;
    if (paramBoolean1)
    {
      paramGraphics.setColor(10188618);
      paramGraphics.fillTriangle(parambe + 5, j - 1, parambe + 1, j + 3, parambe + 5, j + 7);
      paramGraphics.fillRect(parambe + 5, j + 2, 3, 3);
    }
    if (paramBoolean2)
    {
      paramGraphics.setColor(10188618);
      paramGraphics.fillTriangle(parambe + 42, j, parambe + 46, j + 3, parambe + 42, j + 7);
      paramGraphics.fillRect(parambe + 40, j + 2, 3, 3);
    }
  }

  public static void jdField_int()
  {
    jdField_byte = 0;
    g = 0;
    f = 0;
    h = 0;
    d = 0;
    jdField_void = 1;
    c = 1;
    jdField_goto = -1L;
    i = 0;
    jdField_int = 0;
    jdField_case = 0;
    jdField_if = 0;
    jdField_do = 0;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bw
 * JD-Core Version:    0.6.0
 */
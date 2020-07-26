import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ai
{
  private static String[] jdField_new = { "网络设置:<自动选择>", "请按左软键", "请按右软键", "请按中间键完成设置" };
  private static int jdField_do = 0;
  static int jdField_byte = 2;
  static int[] jdField_if = new int[3];
  private static String jdField_int = null;
  private static String a = null;
  private static String jdField_for = null;
  private static int jdField_try;

  public static void a(Graphics paramGraphics)
  {
    paramGraphics.setColor(13808780);
    paramGraphics.drawString("按键设置", a5.ic >> 1, 5, 17);
    paramGraphics.setColor(16766720);
    if (jdField_try % 3 == 0)
      paramGraphics.fillRect(8, 30 + jdField_do * (a5.iG + 4) + 4, 8, 8);
    else
      paramGraphics.fillRect(7, 30 + jdField_do * (a5.iG + 4) + 3, 6, 6);
    int i = 0;
    int j = jdField_new.length;
    while (i < j)
    {
      if (i == jdField_do)
        paramGraphics.setColor(16766720);
      else
        paramGraphics.setColor(12092939);
      paramGraphics.drawString(jdField_new[i], 20, 30 + i * (a5.iG + 4), 20);
      i++;
    }
    paramGraphics.setColor(3100495);
    paramGraphics.fillRect((a5.ic >> 1) - 25, a5.il >> 1, 50, 80);
    paramGraphics.setColor(6266528);
    paramGraphics.fillRect((a5.ic >> 1) - 22, (a5.il >> 1) + 3, 44, 50);
    paramGraphics.fillRect((a5.ic >> 1) - 25 + 2, (a5.il >> 1) + 55, 15, 10);
    paramGraphics.fillRect((a5.ic >> 1) + 25 - 2 - 15, (a5.il >> 1) + 55, 15, 10);
    paramGraphics.fillRect((a5.ic >> 1) - 4, (a5.il >> 1) + 56, 8, 8);
    if (jdField_try % 3 == 0)
    {
      paramGraphics.setColor(65535);
      switch (jdField_do)
      {
      case 1:
        paramGraphics.fillRect((a5.ic >> 1) - 25 + 2, (a5.il >> 1) + 55, 15, 10);
        return;
      case 2:
        paramGraphics.fillRect((a5.ic >> 1) + 25 - 2 - 15, (a5.il >> 1) + 55, 15, 10);
        return;
      case 3:
        paramGraphics.fillRect((a5.ic >> 1) - 4, (a5.il >> 1) + 56, 8, 8);
      }
    }
  }

  private static boolean jdField_if(int paramInt)
  {
    int i = 1;
    int[] arrayOfInt = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 42, 35, a5.e8.getKeyCode(2), a5.e8.getKeyCode(5), a5.e8.getKeyCode(1), a5.e8.getKeyCode(6), a5.e8.getKeyCode(8) };
    for (int j = 0; j < arrayOfInt.length; j++)
    {
      if (paramInt != arrayOfInt[j])
        continue;
      i = 0;
    }
    return i;
  }

  public static void jdField_for()
  {
    if (++jdField_try > 100)
      jdField_try = 0;
  }

  public static void a(int paramInt)
  {
    byte[] arrayOfByte = new byte[1];
    int i;
    if ((i = a5.e8.getGameAction(paramInt)) == 1)
    {
      if (jdField_do > 0)
        jdField_do -= 1;
      return;
    }
    if (i == 6)
    {
      if (jdField_do < jdField_new.length - 1)
        jdField_do += 1;
      return;
    }
    if (i == 8)
    {
      if (jdField_int == null)
      {
        jdField_do = 1;
        return;
      }
      if (a == null)
      {
        jdField_do = 2;
        return;
      }
      jdField_if[2] = paramInt;
      arrayOfByte[0] = (byte)jdField_byte;
      b5.a(jdField_if, "keyValue");
      b5.a(arrayOfByte, "gamemount");
      if (jdField_byte == 0)
      {
        a5.hM = false;
        a5.dU = true;
      }
      else if (jdField_byte == 1)
      {
        a5.hM = false;
        a5.dU = false;
      }
      else if (jdField_byte == 2)
      {
        a5.hM = true;
        a5.dU = true;
      }
      a5.gw = b5.jdField_int("keyValue", jdField_if.length);
      a5.jdField_do(4);
    }
    switch (jdField_do)
    {
    case 0:
      if (i == 2)
      {
        if (jdField_byte > 0)
          jdField_byte -= 1;
        else
          jdField_byte = 2;
      }
      else if (i == 5)
        if (jdField_byte < 2)
          jdField_byte += 1;
        else
          jdField_byte = 0;
      paramInt = null;
      switch (jdField_byte)
      {
      case 0:
        paramInt = "网络设置:<CMWAP>";
        break;
      case 1:
        paramInt = "网络设置:<CMNET>";
        break;
      case 2:
        paramInt = "网络设置:<自动选择>";
      }
      jdField_new[jdField_do] = paramInt;
      return;
    case 1:
      if (!jdField_if(paramInt))
        break;
      jdField_if[0] = paramInt;
      if (paramInt == jdField_if[1])
      {
        jdField_do = 2;
        return;
      }
      if (jdField_int == null)
      {
        jdField_int = "ok";
        jdField_new[jdField_do] = (jdField_new[jdField_do] + jdField_int);
      }
      jdField_do += 1;
      return;
    case 2:
      if (!jdField_if(paramInt))
        break;
      if (paramInt == jdField_if[0])
      {
        jdField_do = 1;
        return;
      }
      jdField_if[1] = paramInt;
      if (a == null)
      {
        a = "ok";
        jdField_new[jdField_do] = (jdField_new[jdField_do] + a);
      }
      jdField_do += 1;
    }
  }

  public static void jdField_for(int paramInt)
  {
    ay localay = (ay)a5.es.cf().elementAt(2);
    ah localah1 = (ah)a5.es.cf().elementAt(3);
    ah localah2 = (ah)a5.es.cf().elementAt(4);
    ah localah3 = (ah)a5.es.cf().elementAt(5);
    ak localak = (ak)a5.es.cf().elementAt(7);
    int i;
    if (((i = a5.e8.getGameAction(paramInt)) == 1) && (!localak.q()))
    {
      if (jdField_do > 0)
        jdField_do -= 1;
      if (localay.q())
        return;
      if (localah1.q())
      {
        localak.a(true, a5.es);
        localah1.a(false, a5.es);
        return;
      }
      if (localah2.q())
      {
        localah1.a(true, a5.es);
        localah2.a(false, a5.es);
        return;
      }
      if (localah3.q())
      {
        localah2.a(true, a5.es);
        localah3.a(false, a5.es);
      }
      return;
    }
    if ((i == 6) && (!localak.q()))
    {
      if (jdField_do < 3)
        jdField_do += 1;
      if (localay.q())
      {
        localay.a(false, a5.es);
        localak.a(true, a5.es);
        return;
      }
      if (localah1.q())
      {
        localah1.a(false, a5.es);
        localah2.a(true, a5.es);
        return;
      }
      if (localah2.q())
      {
        localah2.a(false, a5.es);
        localah3.a(true, a5.es);
        return;
      }
      if (localah3.q())
        return;
      return;
    }
    if (localah3.q())
    {
      if (i == 8)
      {
        if (jdField_int == null)
        {
          jdField_do = 1;
          localah1.a(true, a5.es);
          localah3.a(false, a5.es);
          return;
        }
        if (a == null)
        {
          jdField_do = 2;
          localah2.a(true, a5.es);
          localah3.a(false, a5.es);
          return;
        }
        if (jdField_for == null)
        {
          jdField_for = "ok";
          localah3.a(localah3.aj() + a);
        }
        jdField_if[2] = paramInt;
        return;
      }
      if (a5.jdField_byte(262144))
      {
        jdField_if();
        return;
      }
    }
    else if (localay.q())
    {
      if (i == 2)
      {
        if (jdField_byte > 0)
          jdField_byte -= 1;
        else
          jdField_byte = 2;
        jdField_int();
        return;
      }
      if (i == 5)
      {
        if (jdField_byte < 2)
          jdField_byte += 1;
        else
          jdField_byte = 0;
        jdField_int();
        return;
      }
      if (a5.jdField_byte(262144))
      {
        jdField_if();
        return;
      }
    }
    else if (localah1.q())
    {
      if (jdField_if(paramInt))
      {
        jdField_if[0] = paramInt;
        if (paramInt == jdField_if[1])
        {
          localah1.a(false, a5.es);
          localah2.a(true, a5.es);
          return;
        }
        if (jdField_int == null)
        {
          jdField_int = "ok";
          localah1.a(localah1.aj() + jdField_int);
        }
        localah1.a(false, a5.es);
        localah2.a(true, a5.es);
        return;
      }
    }
    else if (localah2.q())
    {
      if (jdField_if(paramInt))
      {
        if (paramInt == jdField_if[0])
        {
          localah2.a(false, a5.es);
          localah1.a(true, a5.es);
          return;
        }
        jdField_if[1] = paramInt;
        if (a == null)
        {
          a = "ok";
          localah2.a(localah2.aj() + a);
        }
        localah2.a(false, a5.es);
        localah3.a(true, a5.es);
        return;
      }
    }
    else if (localak.q())
    {
      a5.es.cw();
    }
  }

  public static void jdField_do(int paramInt)
  {
    ay localay = (ay)a5.es.cf().elementAt(2);
    ak localak = (ak)a5.es.cf().elementAt(7);
    paramInt = a5.e8.getGameAction(paramInt);
    if (localay.q())
    {
      if (paramInt == 1)
        return;
      if (paramInt == 6)
      {
        localay.a(false, a5.es);
      }
      else
      {
        if (paramInt == 2)
        {
          if (jdField_byte > 0)
            jdField_byte -= 1;
          else
            jdField_byte = 2;
          jdField_int();
          return;
        }
        if (paramInt == 5)
        {
          if (jdField_byte < 2)
            jdField_byte += 1;
          else
            jdField_byte = 0;
          jdField_int();
          return;
        }
        if (!a5.jdField_byte(262144))
          return;
        jdField_if();
        return;
      }
    }
    else if (localak.q())
    {
      a5.es.cw();
      return;
    }
    localak.a(true, a5.es);
  }

  public static void jdField_int()
  {
    Object localObject = (ay)a5.es.cf().elementAt(2);
    int i = 0;
    switch (jdField_byte)
    {
    case 0:
      i = 1;
      break;
    case 1:
      i = 2;
      break;
    case 2:
      i = 0;
    }
    ((ay)localObject).jdMethod_case((byte)i);
    (localObject = (ak)a5.es.cf().elementAt(7)).jdField_if(bm.al[i]);
  }

  public static void jdField_if()
  {
    byte[] arrayOfByte = new byte[1];
    int[] arrayOfInt;
    if ((!a5.gZ) && ((arrayOfInt = b5.jdField_int("keyValue", jdField_if.length)) != null))
    {
      int i = 0;
      int j = arrayOfInt.length;
      while (i < j)
      {
        if (jdField_if[i] != 0)
          arrayOfInt[i] = jdField_if[i];
        i++;
      }
      b5.a(arrayOfInt, "keyValue");
      a5.gw = b5.jdField_int("keyValue", jdField_if.length);
    }
    arrayOfByte[0] = (byte)jdField_byte;
    b5.a(arrayOfByte, "gamemount");
    if (jdField_byte == 0)
    {
      a5.hM = false;
      a5.dU = true;
    }
    else if (jdField_byte == 1)
    {
      a5.hM = false;
      a5.dU = false;
    }
    else if (jdField_byte == 2)
    {
      a5.hM = true;
      a5.dU = true;
    }
    if (be.g8)
    {
      if (a5.jdMethod_case() == 11)
        a5.jdField_do(11);
      else
        a5.jdField_do(4);
      be.g8 = false;
      return;
    }
    a5.jdField_do(4);
  }

  public static void a()
  {
    if ((a5.gZ) && (a5.jdField_byte(268435456)))
    {
      int i = a5.ic - (a5.iA + 4 << 1);
      int j = a5.il - 18;
      int k = a5.iA + 4 << 1;
      ay localay = (ay)a5.es.cf().elementAt(2);
      if (a5.a(i, j, k, 18))
        jdField_if();
      i = localay.k;
      if ((localay.d7 != null) && (!localay.d7.equals("")))
        i += localay.d7.length() * a5.iA + 8;
      if (a5.a(i, localay.j, a5.eb.getWidth(), a5.eb.getHeight()))
      {
        if (jdField_byte > 0)
          jdField_byte -= 1;
        else
          jdField_byte = 2;
        jdField_int();
        return;
      }
      if (a5.a(i + a5.eb.getWidth() + 8 + b5.jdField_do((String)localay.d9.elementAt(jdField_do)), localay.j, a5.eb.getWidth(), a5.eb.getHeight()))
      {
        if (jdField_byte < 2)
          jdField_byte += 1;
        else
          jdField_byte = 0;
        jdField_int();
      }
    }
  }

  public static void jdField_do()
  {
    jdField_int = null;
    a = null;
    jdField_for = null;
    jdField_if = new int[3];
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     ai
 * JD-Core Version:    0.6.0
 */
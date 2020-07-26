import java.io.PrintStream;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ad
{
  public static byte a = 1;
  private static String[] e = { "", "[私]", "[世]", "[族]", "[场]", "[队]", "[系]", "", "", "", "", "[喇]" };
  private static int d = 0;
  private static String[] v = new String[0];
  private static int[][] u = new int[0][];
  private static String[] E = new String[3];
  private static int[][] w = new int[3][];
  public static short I = 4095;
  private static int A = 0;
  private static int q = 0;
  private static int B = 0;
  public static Image jdField_long = null;
  private static Graphics J = null;
  public static final int m = a5.iG * 3;
  private long jdField_char = 0L;
  public static int k = -1;
  public static byte jdField_new = 0;
  public static long jdField_if = -1L;
  private int s = 0;
  private int t = 0;
  static int b = 0;
  private static String j = null;
  private static int y = 0;
  private static int jdField_byte = 0;
  private static String C = null;
  private static int H = 0;
  private static byte jdField_goto = 3;
  private static int jdField_else = a5.il;
  private static String[] jdField_int;
  private static int[][] n = new int[0][];
  private static String[] jdField_case = new String[0];
  private static int[][] f = new int[0][];
  private static int[] g;

  public ad()
  {
    jdMethod_do();
  }

  private static void jdMethod_do()
  {
    J = (ad.jdField_long = Image.createImage(a5.ic, m)).getGraphics();
    for (int i = 0; i < 3; i++)
      E[i] = "";
    jdMethod_for();
  }

  public static void jdField_int()
  {
    a3.t = new String[0];
    a3.u = new String[0];
    a3.ak = new int[0];
    a3.aB = new byte[0];
    a3.aE = new Object[0];
    a3.W = new Object[0];
    a3.ai = new String[5][0];
    a3.z = new String[5][0];
    a3.aq = new int[5][0];
    a3.jdField_int = new Object[5][0];
    a3.H = new Object[5][0];
    a3.d = new String[0];
    a3.af = new String[0];
    a3.y = new int[0];
    a3.aH = new byte[0];
    a3.as = new Object[0];
    a3.jdField_long = new Object[0];
    a3.aI = new String[0];
    a3.aJ = new String[0];
    a3.s = new int[0];
    a3.K = new byte[0];
    a3.jdField_if = new Object[0];
    a3.l = new Object[0];
    a3.jdField_new = new String[0];
    a3.for = new int[0];
    a3.c = new int[0];
    v = new String[0];
    u = new int[0][];
    E = new String[3];
    w = new int[3][];
    jdField_long = null;
  }

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdMethod_do(paramInt);
    switch (paramInt)
    {
    case 655361:
      a3.Q = a3.Q.replace('\n', ' ').replace('\r', ' ');
      localac.a(a3.T);
      localac.jdMethod_do(a3.aD);
      localac.jdField_if(a3.Q);
      int i = a3.ag.length;
      (paramInt = localac).a((byte)i);
      b5.jdField_case("UIChat.chatSendGoods.length" + a3.ag.length);
      for (paramInt = 0; paramInt < a3.ag.length; paramInt++)
      {
        Vector localVector = a3.ag[paramInt];
        localac.a(((Short)localVector.elementAt(0)).shortValue());
        localac.a(((Byte)localVector.elementAt(1)).byteValue());
        localac.a(((Byte)localVector.elementAt(2)).byteValue());
      }
      a3.Q = "";
      a3.ag = new Vector[0];
      break;
    case 655362:
      localac.a(I);
      break;
    case 655363:
      localac.a(jdField_if);
      localac.jdMethod_do(k);
      localac.a(jdField_new);
      if (jdField_new == 20)
        bv.jI = (int)jdField_if;
      k = -1;
      jdField_if = -1L;
      jdField_new = 0;
      am.a = false;
      a5.fR = true;
    }
    b5.a((paramInt = localac).jdField_do.length);
    return localac.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2146828287:
      paramInt = paramac.jdField_if();
      ac localac1 = paramac.jdField_byte();
      ac localac2 = paramac.jdField_byte();
      String str1 = paramac.jdField_goto();
      String str2 = paramac.jdField_goto();
      int i = paramac.jdField_if();
      Vector[] arrayOfVector = null;
      if (i > 0)
      {
        arrayOfVector = new Vector[i];
        for (int i1 = 0; i1 < i; i1++)
        {
          (localVector = new Vector()).addElement(new Short(paramac.jdField_new()));
          localVector.addElement("[" + paramac.jdField_goto() + "]");
          localVector.addElement(new Long(paramac.jdField_char()));
          localVector.addElement(new Byte(paramac.jdField_if()));
          localVector.addElement(new Byte(paramac.jdField_if()));
          arrayOfVector[i1] = localVector;
        }
      }
      String str3 = null;
      Vector localVector = new Vector();
      paramac = localac1;
      if (paramInt == 1)
      {
        if (bp.ag().jdField_new() == localac1)
        {
          localVector.addElement(new Integer(5));
          str3 = "你对" + str1 + "说";
          localac1 = localac2;
        }
        else
        {
          localVector.addElement(new Integer(3));
          str3 = str1 + "对你说";
        }
        localVector.addElement(new Integer(str1.length()));
      }
      else
      {
        if ((str1 == null) || (str1.length() == 0) || (bp.ag().jdField_new() == localac1))
        {
          localVector = null;
        }
        else
        {
          localVector.addElement(new Integer(3));
          localVector.addElement(new Integer(str1.length()));
        }
        str3 = str1;
      }
      if ((paramInt <= 5) && ((str2 = jdField_if(str2, paramac)).length() != 0))
        a(str1, localac1);
      paramac = a(e[paramInt], str3, str2, arrayOfVector);
      jdField_int(paramInt, paramac, localac1, str1, localVector, arrayOfVector);
      return;
    case -2146828286:
      I = paramac.jdField_new();
      b5.jdField_case("channelOpen" + I);
      return;
    case -2146828285:
      System.out.println("接收喇叭文字滚动速度");
      jdField_goto = paramac.jdField_if();
      return;
    case -2146828282:
      bo.j = true;
      a7.fF = 23;
    case -2146828284:
    case -2146828283:
    }
  }

  private static final String a(String paramString1, String paramString2, String paramString3, Vector[] paramArrayOfVector)
  {
    paramString1 = paramString1 + paramString2 + (paramString2.equals("") ? "" : ":");
    if (paramArrayOfVector != null)
    {
      paramString2 = 0;
      paramString3 = new StringBuffer(paramString3);
      int i = paramString1.length();
      for (int i1 = 0; i1 < paramArrayOfVector.length; i1++)
      {
        Vector localVector;
        String str1 = ((Short)(localVector = paramArrayOfVector[i1]).elementAt(0)).shortValue();
        localVector.setElementAt(new Short((short)(str1 + paramString2 + i)), 0);
        String str2 = (String)localVector.elementAt(1);
        paramString3.insert(paramString2 + str1, str2);
        paramString2 += str2.length();
        int i2 = ((Short)localVector.elementAt(0)).shortValue();
        int i3 = str2.length();
        int i4 = ((Byte)localVector.elementAt(4)).byteValue();
        int[] arrayOfInt = { i2, i2 + i3 - 1, bm.c0[i4] };
        localVector.addElement(arrayOfInt);
      }
      paramString3 = paramString3.toString();
    }
    return paramString2 = paramString1 + paramString3;
  }

  private static final void a(String paramString, int paramInt)
  {
    if ((paramInt == bp.ag().jdField_new()) || (paramInt == 0) || (paramString == null) || (paramString.equals("")))
      return;
    for (int i = a3.for.length - 1; i >= 0; i--)
      if (a3.for[i] == paramInt)
        return;
    a3.for = b5.a(a3.for, 0, paramInt);
    a3.jdField_new = b5.a(a3.jdField_new, 0, paramString);
    if (a3.for.length > 4)
    {
      a3.for = b5.a(a3.for, a3.for.length - 1);
      a3.jdField_new = b5.a(a3.jdField_new, a3.jdField_new.length - 1);
    }
  }

  public static void jdField_int(byte paramByte, String paramString1, int paramInt, String paramString2, Vector paramVector, Vector[] paramArrayOfVector)
  {
    int i = 1;
    Vector[] arrayOfVector2;
    Vector localVector;
    Object localObject;
    String str3;
    int i1;
    switch (paramByte)
    {
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
      i = 0;
      arrayOfVector2 = paramArrayOfVector;
      localVector = paramVector;
      localObject = paramString2;
      int i2 = paramInt;
      str3 = paramString1;
      i1 = (byte)(paramByte - 1);
      if ((str3 != null) && (str3.equals("")))
        break;
      a3.ai[i1] = b5.a(a3.ai[i1], 0, str3);
      a3.aq[i1] = b5.a(a3.aq[i1], 0, i2);
      a3.z[i1] = b5.a(a3.z[i1], 0, (String)localObject);
      a3.jdField_int[i1] = b5.a(a3.jdField_int[i1], 0, arrayOfVector2);
      a3.H[i1] = b5.a(a3.H[i1], 0, localVector);
      if (a3.ai[i1].length > 10)
      {
        a3.ai[i1] = b5.a(a3.ai[i1], a3.ai[i1].length - 1);
        a3.aq[i1] = b5.a(a3.aq[i1], a3.aq[i1].length - 1);
        a3.z[i1] = b5.a(a3.z[i1], a3.z[i1].length - 1);
        a3.jdField_int[i1] = b5.a(a3.jdField_int[i1], a3.jdField_int[i1].length - 1);
        a3.H[i1] = b5.a(a3.H[i1], a3.H[i1].length - 1);
      }
      if ((be.gu == null) || (be.gu.C != i1))
        break;
      if ((be.gu.m == 2) || (be.gu.m == 3) || (be.gu.m == 4))
      {
        a3 tmp384_381 = be.gu;
        if ((tmp384_381.n = (byte)(tmp384_381.n + 1)) > a3.ai[i1].length - 1)
        {
          be.gu.n = (byte)(a3.ai[i1].length - 1);
          be.gu.G = null;
          be.gu.a(2);
        }
      }
      be.gu.k = a3.ai[i1];
      be.gu.jdMethod_try();
    case 6:
      if (i != 0)
        a(paramByte, paramString1, paramInt, paramString2, paramVector, paramArrayOfVector);
    case 10:
      jdField_if(paramByte, paramString1, paramInt, paramString2, paramVector, paramArrayOfVector);
      Vector[] arrayOfVector1 = paramArrayOfVector;
      str3 = paramString1;
      localObject = jdField_if(i1 = paramByte, str3, arrayOfVector1);
      if (d <= 0)
      {
        a(str3, localObject);
      }
      else
      {
        u = b5.a(u, u.length, localObject);
        if ((ad.v = b5.a(v, v.length, str3)).length > 10)
        {
          u = b5.a(u, 0);
          v = b5.a(v, 0);
        }
        return;
      }
    case 8:
      jdField_if(paramByte, paramString1, paramInt, paramString2, paramVector, paramArrayOfVector);
      a(paramString1, paramArrayOfVector);
      a(paramByte, paramString1, paramInt, paramString2, paramVector, paramArrayOfVector);
      return;
    case 7:
      a(paramString1);
      return;
    case 9:
      String str1;
      j = str1 = paramString1;
      b = a5.ic;
      y = a5.fq.stringWidth(str1);
      a(paramByte, paramString1, paramInt, paramString2, paramVector, paramArrayOfVector);
      return;
    case 11:
      arrayOfVector2 = paramArrayOfVector;
      localVector = paramVector;
      localObject = paramString2;
      int i3 = paramInt;
      str3 = paramString1;
      byte b1 = paramByte;
      if ((str3 == null) || (!str3.equals("")))
      {
        a3.aI = b5.a(a3.aI, 0, str3);
        a3.s = b5.a(a3.s, 0, i3);
        a3.aJ = b5.a(a3.aJ, 0, (String)localObject);
        a3.K = b5.a(a3.K, 0, b1);
        a3.jdField_if = b5.a(a3.jdField_if, 0, arrayOfVector2);
        a3.l = b5.a(a3.l, 0, localVector);
        if (a3.aI.length > (a5.d8 ? 20 : 10))
        {
          a3.aI = b5.a(a3.aI, a3.aI.length - 1);
          a3.s = b5.a(a3.s, a3.s.length - 1);
          a3.aJ = b5.a(a3.aJ, a3.aJ.length - 1);
          a3.K = b5.jdField_if(a3.K, a3.K.length - 1);
          a3.jdField_if = b5.a(a3.jdField_if, a3.jdField_if.length - 1);
          a3.l = b5.a(a3.l, a3.l.length - 1);
        }
        if ((be.gu != null) && (be.gu.C == 6))
        {
          if ((be.gu.m == 2) || (be.gu.m == 3) || (be.gu.m == 4))
          {
            a3 tmp916_913 = be.gu;
            if ((tmp916_913.n = (byte)(tmp916_913.n + 1)) > a3.aI.length - 1)
            {
              be.gu.n = (byte)(a3.aI.length - 1);
              be.gu.G = null;
              be.gu.a(2);
            }
          }
          be.gu.k = a3.aI;
          be.gu.jdMethod_try();
        }
      }
      jdField_if(paramByte, paramString1, paramInt, paramString2, paramVector, paramArrayOfVector);
      String str2;
      C = str2 = paramString1;
      jdField_byte = a5.ic;
      H = a5.fq.stringWidth(str2);
    }
  }

  public final void jdField_if()
  {
    if ((!a5.fR) && (this.t <= 20))
    {
      long l = System.currentTimeMillis() - this.jdField_char;
      this.jdField_char = System.currentTimeMillis();
      this.t += 1;
      if (l < 89L)
      {
        this.s += 1;
        if (this.s > 10);
      }
    }
    if ((ad.b = b - 3) + y <= 0)
      j = null;
    if ((ad.jdField_byte = jdField_byte - jdField_goto) + H <= 0)
      C = null;
    if (a == 1)
      if (q <= B)
      {
        if (!a())
          B = 0;
      }
      else if (A > 0)
        A -= 1;
      else if (q != 0)
        a();
    if (--d < 0)
    {
      d = 0;
      if (v.length > 0)
      {
        a(v[0], u[0]);
        u = b5.a(u, 0);
        v = b5.a(v, 0);
      }
    }
    if ((jdField_case.length == 0) || (f.length == 0))
      return;
    int i = a5.iG;
    if (((ad.jdField_else = jdField_else - 2) + i < a5.il - 36) && (jdField_case.length != 0))
    {
      jdField_case = b5.a(jdField_case, 0);
      f = b5.a(f, 0);
      n = new int[0][];
      if ((jdField_case.length == 0) || (f.length == 0))
        return;
      jdField_int = b5.a(jdField_case[0], a5.ic - 4, a5.fq);
      g = f[0];
      n = a(jdField_int, g);
      jdField_else = a5.il;
    }
  }

  private static boolean a()
  {
    int i;
    if ((i = Math.min(4, Math.abs(B - q))) != 4)
      return false;
    q += (B > q ? i : -i);
    return true;
  }

  private static void jdField_if(byte paramByte, String paramString1, int paramInt, String paramString2, Vector paramVector, Vector[] paramArrayOfVector)
  {
    if ((paramString1 == null) || (paramString1.equals("")))
      return;
    a3.t = b5.a(a3.t, 0, paramString1);
    a3.ak = b5.a(a3.ak, 0, paramInt);
    a3.u = b5.a(a3.u, 0, paramString2);
    a3.aB = b5.a(a3.aB, 0, paramByte);
    a3.aE = b5.a(a3.aE, 0, paramArrayOfVector);
    a3.W = b5.a(a3.W, 0, paramVector);
    if (a3.t.length > 20)
    {
      a3.t = b5.a(a3.t, a3.t.length - 1);
      a3.ak = b5.a(a3.ak, a3.ak.length - 1);
      a3.u = b5.a(a3.u, a3.u.length - 1);
      a3.aB = b5.jdField_if(a3.aB, a3.aB.length - 1);
      a3.aE = b5.a(a3.aE, a3.aE.length - 1);
      a3.W = b5.a(a3.W, a3.W.length - 1);
    }
    if ((be.gu != null) && (be.gu.C == 100))
    {
      if ((be.gu.m == 2) || (be.gu.m == 3) || (be.gu.m == 4))
      {
        a3 tmp231_228 = be.gu;
        if ((tmp231_228.n = (byte)(tmp231_228.n + 1)) > a3.t.length - 1)
        {
          be.gu.n = (byte)(a3.t.length - 1);
          be.gu.G = null;
          be.gu.a(2);
        }
      }
      be.gu.k = a3.t;
      be.gu.jdMethod_try();
    }
  }

  private static void a(byte paramByte, String paramString1, int paramInt, String paramString2, Vector paramVector, Vector[] paramArrayOfVector)
  {
    if ((paramString1 == null) || (paramString1.equals("")))
      return;
    a3.d = b5.a(a3.d, 0, paramString1);
    a3.y = b5.a(a3.y, 0, paramInt);
    a3.af = b5.a(a3.af, 0, paramString2);
    a3.aH = b5.a(a3.aH, 0, paramByte);
    a3.as = b5.a(a3.as, 0, paramArrayOfVector);
    a3.jdField_long = b5.a(a3.jdField_long, 0, paramVector);
    if (a3.d.length > (a5.d8 ? 20 : 10))
    {
      a3.d = b5.a(a3.d, a3.d.length - 1);
      a3.y = b5.a(a3.y, a3.y.length - 1);
      a3.af = b5.a(a3.af, a3.af.length - 1);
      a3.aH = b5.jdField_if(a3.aH, a3.aH.length - 1);
      a3.as = b5.a(a3.as, a3.as.length - 1);
      a3.jdField_long = b5.a(a3.jdField_long, a3.jdField_long.length - 1);
    }
    if ((be.gu != null) && (be.gu.C == 5))
    {
      if ((be.gu.m == 2) || (be.gu.m == 3) || (be.gu.m == 4))
      {
        a3 tmp241_238 = be.gu;
        if ((tmp241_238.n = (byte)(tmp241_238.n + 1)) > a3.d.length - 1)
        {
          be.gu.n = (byte)(a3.d.length - 1);
          be.gu.G = null;
          be.gu.a(2);
        }
      }
      be.gu.k = a3.d;
      be.gu.jdMethod_try();
    }
  }

  public static final void a(String paramString)
  {
    ao.bX = paramString;
    ao.b3 = 0;
    ao.ch = 0;
    ao.cg = true;
    ao.cf = false;
    ao.cd = false;
  }

  public static final void a(String paramString, boolean paramBoolean)
  {
    ao.bX = paramString;
    ao.b3 = 0;
    ao.ch = 0;
    ao.cg = true;
    ao.cf = false;
    ao.cd = true;
  }

  public static final void a(Graphics paramGraphics, boolean paramBoolean)
  {
    if (j != null)
    {
      int i = a5.il - m - 36 - a5.iG - 2;
      if (!paramBoolean)
      {
        paramGraphics.setColor(8519935);
        paramGraphics.fillRect(0, i, a5.ic, a5.iG);
        paramGraphics.setColor(bm.bR[9]);
      }
      else
      {
        paramGraphics.setColor(16711680);
      }
      paramGraphics.drawString(j, b, i, 0);
    }
  }

  public static final void jdField_if(Graphics paramGraphics, boolean paramBoolean)
  {
    if (C != null)
    {
      int i = 2 + b2.jdField_if;
      if (!paramBoolean)
      {
        paramGraphics.setColor(8519935);
        paramGraphics.fillRect(0, i, a5.ic, a5.iG);
        paramGraphics.setColor(bm.bR[9]);
      }
      else
      {
        paramGraphics.setColor(16711680);
      }
      paramBoolean = jdField_byte;
      char[] arrayOfChar;
      int i1 = (arrayOfChar = C.toCharArray()).length;
      for (int i2 = 0; i2 < i1; i2++)
        if ((i2 != i1 - 1) && (arrayOfChar[i2] == '#') && (arrayOfChar[(i2 + 1)] >= '0') && (arrayOfChar[(i2 + 1)] <= '9'))
        {
          a5.cJ.jdField_if(paramGraphics, paramBoolean, i, arrayOfChar[(i2 + 1)] - '0');
          i2++;
          paramBoolean += a5.cJ.jdField_try;
        }
        else
        {
          paramGraphics.drawChar(arrayOfChar[i2], paramBoolean, i, 20);
          boolean bool = paramGraphics.getFont().charWidth(arrayOfChar[i2]);
          paramBoolean += bool;
        }
    }
  }

  public static final void jdField_new()
  {
    ao.bX = "";
    ao.b3 = 0;
    ao.ch = 0;
    ao.cg = true;
    ao.cf = false;
  }

  private static final int[] jdField_if(byte paramByte, String paramString, Vector[] paramArrayOfVector)
  {
    int[] arrayOfInt = new int[paramString = paramString.length()];
    for (String str = 0; str < paramString; str++)
      arrayOfInt[str] = bm.bR[paramByte];
    if (paramArrayOfVector != null)
      for (int i = 0; i < paramArrayOfVector.length; i++)
        for (paramString = (paramByte = (int[])(int[])paramArrayOfVector[i].elementAt(5))[0]; paramString <= paramByte[1]; paramString++)
          arrayOfInt[paramString] = paramByte[2];
    return arrayOfInt;
  }

  private static void a(String paramString, int[] paramArrayOfInt)
  {
    d = 7;
    paramString = b5.a(paramString, a5.ic - 4, a5.fq);
    int i = 0;
    int i1 = paramString.length;
    while (i < i1)
    {
      i2 = 0;
      i3 = paramString[i].length();
      if ((i1 > 1) && (i != i1 - 1) && ((i2 = paramString[i].lastIndexOf('#')) == i3 - 1))
      {
        paramString[i] = paramString[i].substring(0, i2);
        paramString[(i + 1)] = ("#" + paramString[(i + 1)]);
      }
      i++;
    }
    i = paramString.length;
    Object localObject = new int[0][];
    int i2 = 0;
    for (int i3 = 0; i3 < i; i3++)
    {
      int[] arrayOfInt = new int[paramString[i3].length()];
      System.arraycopy(paramArrayOfInt, i2, arrayOfInt, 0, arrayOfInt.length);
      localObject = b5.a(localObject, localObject.length, arrayOfInt);
      i2 += arrayOfInt.length;
    }
    int i4;
    if (a == 0)
    {
      i3 = paramString.length;
      for (i4 = 0; i4 + i3 < E.length; i4++)
      {
        E[i4] = E[(i4 + i3)];
        w[i4] = w[(i4 + i3)];
      }
      i4 = E.length - 1;
      paramArrayOfInt = paramString.length - 1;
      while ((i4 >= 0) && (paramArrayOfInt >= 0))
      {
        E[i4] = paramString[paramArrayOfInt];
        w[i4] = localObject[paramArrayOfInt];
        paramArrayOfInt--;
        i4--;
      }
    }
    else if (a == 1)
    {
      i3 = Math.min(E.length, paramString.length);
      for (i4 = 0; i4 < i3; i4++)
      {
        E[i4] = paramString[i4];
        w[i4] = localObject[i4];
      }
      q = 0;
      if ((i4 = paramString.length) > 3)
        i4 = 3;
      B = i4 * a5.iG;
      A = 20;
    }
    jdMethod_for();
  }

  private static void jdMethod_for()
  {
    if (J == null)
      return;
    b5.a(J, 0, 0, jdField_long.getWidth(), jdField_long.getHeight(), 2167563);
    J.setColor(5190176);
    for (int i = 0; i < 2; i++)
      J.drawLine(0, a5.iG * (i + 1), jdField_long.getWidth(), a5.iG * (i + 1));
    J.setFont(a5.fq);
    for (i = 0; i < 3; i++)
      a$579467b(J, E[i], w[i], 2, a5.iG * i);
  }

  private static void a$579467b(Graphics paramGraphics, String paramString, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    paramInt1 = 2;
    int i = (paramString = paramString.toCharArray()).length;
    for (int i1 = 0; i1 < i; i1++)
      if ((i1 != i - 1) && (paramString[i1] == '#') && (paramString[(i1 + 1)] >= '0') && (paramString[(i1 + 1)] <= '9'))
      {
        a5.cJ.jdField_if(paramGraphics, paramInt1, paramInt2, paramString[(i1 + 1)] - '0');
        i1++;
        paramInt1 += a5.cJ.jdField_try;
      }
      else
      {
        paramGraphics.setColor(paramArrayOfInt[i1]);
        paramGraphics.drawChar(paramString[i1], paramInt1, paramInt2, 20);
        int i2 = paramGraphics.getFont().charWidth(paramString[i1]);
        paramInt1 += i2;
      }
  }

  public static final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int[][] paramArrayOfInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    paramInt2 = paramInt2;
    int i = (paramString = paramString.toCharArray()).length;
    for (int i1 = 0; i1 < i; i1++)
      if ((i1 != i - 1) && (paramString[i1] == '#') && (paramString[(i1 + 1)] >= '0') && (paramString[(i1 + 1)] <= '9'))
      {
        a5.cJ.jdField_if(paramGraphics, paramInt2, paramInt3, paramString[(i1 + 1)] - '0');
        i1++;
        paramInt2 += a5.cJ.jdField_try;
      }
      else
      {
        paramGraphics.setColor(paramInt1);
        if (paramArrayOfInt != null)
        {
          i2 = paramArrayOfInt.length;
          for (int i3 = 0; i3 < i2; i3++)
          {
            if ((i1 < paramArrayOfInt[i3][0]) || (i1 > paramArrayOfInt[i3][1]))
              continue;
            paramGraphics.setColor(paramArrayOfInt[i3][2]);
          }
        }
        int i2 = paramGraphics.getFont().charWidth(paramString[i1]);
        paramGraphics.drawChar(paramString[i1], paramInt2, paramInt3, 20);
        if ((paramArrayOfInt2 != null) && (i1 >= paramArrayOfInt2[0]) && (i1 < paramArrayOfInt2[1]))
        {
          paramGraphics.setColor(16776960);
          paramGraphics.drawLine(paramInt2, paramInt3 + a5.iG, paramInt2 + i2, paramInt3 + a5.iG);
        }
        if ((paramArrayOfInt1 != null) && (i1 >= paramArrayOfInt1[0]) && (i1 <= paramArrayOfInt1[1]))
          paramGraphics.drawLine(paramInt2, paramInt3 + a5.iG, paramInt2 + i2, paramInt3 + a5.iG);
        paramInt2 += i2;
      }
  }

  private static final String jdField_if(String paramString, int paramInt)
  {
    int i = -1;
    b5.jdField_case("senderId" + paramInt);
    for (int i1 = l.jdField_else.length - 1; i1 >= 0; i1--)
    {
      if (l.jdField_else[i1].jdField_new() != paramInt)
        continue;
      i = i1;
      break;
    }
    b5.jdField_case("tmpIndex" + i);
    b localb = null;
    if (i != -1)
      localb = (b)l.jdField_else[i];
    else
      return paramString;
    i = (paramInt = paramString.toCharArray()).length;
    for (int i2 = 0; i2 < i; i2++)
    {
      if ((i2 == i - 1) || (paramInt[i2] != '#') || (paramInt[(i2 + 1)] < '0') || (paramInt[(i2 + 1)] > '9') || (localb == null))
        continue;
      localb.dw = (byte)(paramInt[(i2 + 1)] - '0');
      localb.cK = 48;
    }
    return paramString;
  }

  public static void jdField_if(Graphics paramGraphics)
  {
    if (a == 0)
    {
      paramGraphics.drawImage(jdField_long, 0, a5.il - 36 - jdField_long.getHeight(), 20);
      return;
    }
    if ((a == 1) && (q != 0))
      paramGraphics.drawImage(jdField_long, 0, a5.il - 36 - q, 20);
  }

  public static final void a(String paramString, Vector[] paramArrayOfVector)
  {
    if (jdField_case.length == 0)
      jdField_else = a5.il;
    if (jdField_case.length != 0)
      for (int i = jdField_case.length - 1; i >= 0; i--)
        if (paramString.equals(jdField_case[i]))
          return;
    jdField_case = b5.a(jdField_case, jdField_case.length, paramString);
    int[] arrayOfInt = jdField_if(8, paramString, paramArrayOfVector);
    f = b5.a(f, f.length, arrayOfInt);
    jdField_int = b5.a(jdField_case[0], a5.ic - 4, a5.fq);
    g = f[0];
    n = a(jdField_int, g);
  }

  private static int[][] a(String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = paramArrayOfString.length;
    int i1 = 0;
    for (int i2 = 0; i2 < i; i2++)
    {
      int[] arrayOfInt = new int[paramArrayOfString[i2].length()];
      System.arraycopy(paramArrayOfInt, i1, arrayOfInt, 0, arrayOfInt.length);
      n = b5.a(n, n.length, arrayOfInt);
      i1 += arrayOfInt.length;
    }
    return n;
  }

  public static void a(Graphics paramGraphics)
  {
    if ((jdField_case.length == 0) || (f.length == 0))
      return;
    paramGraphics.setFont(a5.fq);
    paramGraphics.setClip(0, a5.il - 72 - m, a5.ic, 36);
    int i = jdField_int.length;
    int i1;
    if (a == 0)
      for (i1 = 0; i1 < i; i1++)
        a$579467b(paramGraphics, jdField_int[i1], n[i1], 2, jdField_else - m - 36 + a5.iG * i1);
    else
      for (i1 = 0; i1 < i; i1++)
        a$579467b(paramGraphics, jdField_int[i1], n[i1], 2, jdField_else - m - 36 + a5.iG * i1);
    paramGraphics.setClip(0, 0, a5.ic, a5.il);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     ad
 * JD-Core Version:    0.6.0
 */
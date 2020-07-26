import java.io.PrintStream;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.ImageItem;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

public final class a3
{
  private ao a = null;
  private ao A = null;
  private af Z = null;
  private br i = null;
  private String[] w = null;
  private int[] h = null;
  private byte[] ao = null;
  public String[] k = null;
  public byte C;
  private int[][][] aF = null;
  public static String[] t = new String[0];
  public static String[] u = new String[0];
  public static int[] ak = new int[0];
  public static byte[] aB = new byte[0];
  public static Object[] aE = new Object[0];
  public static Object[] W = new Object[0];
  public static String[] aI = new String[0];
  public static String[] aJ = new String[0];
  public static int[] s = new int[0];
  public static byte[] K = new byte[0];
  public static Object[] jdField_if = new Object[0];
  public static Object[] l = new Object[0];
  public static String[][] ai = new String[5][0];
  public static String[][] z = new String[5][0];
  public static int[][] aq = new int[5][0];
  public static Object[][] jdField_int = new Object[5][0];
  public static Object[][] H = new Object[5][0];
  public static String[] d = new String[0];
  public static String[] af = new String[0];
  public static int[] y = new int[0];
  public static byte[] aH = new byte[0];
  public static Object[] as = new Object[0];
  public static Object[] jdField_long = new Object[0];
  public static String[] jdField_new = new String[0];
  public static int[] jdField_for = new int[0];
  public static int[] c = new int[0];
  private String[] ad = { "私聊频道", "世界频道", "氏族测试", "场景频道", "队伍频道", "系统频道" };
  private short ap;
  private short an;
  private short R;
  private short az;
  private byte jdField_try;
  private short ar;
  private short b;
  private byte O;
  private byte jdField_char;
  private byte at;
  public byte n = 0;
  private byte aa = -1;
  private byte aA = -1;
  private int[] P = null;
  public int[] G = null;
  private short N;
  private short ay;
  private byte U = 0;
  public byte m = 0;
  public static byte T = 4;
  public static String Q = "";
  public static Vector[] ag = new Vector[0];
  public static int aD = -1;
  private static String Y = null;
  private int[][][] ax;
  private int[][][] jdField_void;
  private int[][] v;
  private int ae = 100;
  private int[][] o;
  private int[][] j;
  private boolean F;
  String B = "";

  public a3(byte paramByte)
  {
    this.C = paramByte;
  }

  public final void jdMethod_byte()
  {
    a3 locala3 = this;
    if (bp.ag().aS() == 0)
      locala3.ad[2] = "氏族频道";
    else
      locala3.ad[2] = "诸侯频道";
    a5.fE.addElement(e.a("/ui/chatface.ui"));
    a5.fE.addElement(null);
    a5.fE.addElement(null);
    a5.es = (be)a5.fE.elementAt(0);
    br.c6();
    if (bp.ag() != null)
      bp.ag().jdField_if(false);
    ad.a("");
    locala3 = this;
    this.a = new ao(0, null);
    locala3.A = new ao(1, null);
    if (locala3.C == 100)
    {
      locala3.k = t;
      locala3.a.jdMethod_do("综合频道");
    }
    else if (locala3.C == 5)
    {
      locala3.k = d;
      locala3.a.jdMethod_do(locala3.ad[locala3.C]);
    }
    else if (locala3.C == 6)
    {
      locala3.k = aI;
      locala3.a.jdMethod_do("喇叭频道");
    }
    else
    {
      locala3.k = ai[locala3.C];
      locala3.a.jdMethod_do(locala3.ad[locala3.C]);
    }
    if (((locala3.C >= 1) && (locala3.C <= 4)) || (locala3.C == 6))
    {
      locala3.m = 1;
      locala3.A.a("输入", 0);
      locala3.b = (short)(a5.iG << 1);
    }
    else
    {
      if (locala3.k.length > 0)
        locala3.m = 2;
      else
        locala3.m = 0;
      if (locala3.C == 5)
        locala3.A.a("", 0);
      else
        locala3.A.a("操作", 0);
      locala3.b = 0;
    }
    locala3.ar = locala3.a.jdField_int;
    locala3.an = (short)(locala3.ar + locala3.b);
    locala3.az = (short)(a5.il - locala3.ar - locala3.b - locala3.A.jdField_int);
    locala3.Z = new af(0, locala3.an, 0, locala3.az, 0, true, null);
    locala3.Z.k = (short)(a5.ic - locala3.Z.a);
    locala3.ap = locala3.Z.a;
    locala3.R = (short)(a5.ic - (locala3.Z.a << 1));
    locala3.jdField_try = (byte)(locala3.az / a5.iG);
    locala3 = this;
    this.n = 0;
    locala3.aa = -1;
    locala3.aA = -1;
    locala3.w = new String[0];
    locala3.aF = new int[0][][];
    locala3.ao = new byte[0];
    locala3.h = new int[0];
    jdField_try();
  }

  public final void jdField_if(Graphics paramGraphics)
  {
    Graphics localGraphics = paramGraphics;
    a3 locala3 = this;
    if ((this.C < 1) || (locala3.C > 4))
    {
      if (locala3.C == 6)
      {
        localGraphics.setColor(2167563);
        localGraphics.fillRect(0, locala3.ar, a5.ic, locala3.b);
        localGraphics.setColor(locala3.m == 1 ? 16776960 : bm.bR[11]);
        localGraphics.drawString("发送到喇叭频道:", locala3.ap, locala3.ar, 20);
        localGraphics.drawRect(locala3.ap, locala3.ar + a5.iG + 1, locala3.R - 1, a5.iG - 5);
      }
    }
    else
    {
      localGraphics.setColor(2167563);
      localGraphics.fillRect(0, locala3.ar, a5.ic, locala3.b);
      localGraphics.setColor(locala3.m == 1 ? 16776960 : bm.bR[(locala3.C + 1)]);
      localGraphics.drawString("发送到" + locala3.ad[locala3.C] + ":", locala3.ap, locala3.ar, 20);
      localGraphics.drawRect(locala3.ap, locala3.ar + a5.iG + 1, locala3.R - 1, a5.iG - 5);
    }
    localGraphics = paramGraphics;
    locala3 = this;
    localGraphics.setColor(2167563);
    localGraphics.fillRect(0, locala3.an, a5.ic, locala3.az);
    locala3.a(localGraphics, locala3.N);
    paramGraphics.setColor(bm.bY);
    paramGraphics.fillRect(0, 0, a5.ic, this.a.jdField_int);
    this.a.a(paramGraphics);
    this.A.a(paramGraphics);
    if (this.w.length > this.jdField_try)
      this.Z.a(paramGraphics);
    if (this.i != null)
      this.i.a(paramGraphics);
  }

  public final void jdField_try()
  {
    if ((this.k == null) || (this.k.length == 0))
      return;
    if (this.m == 0)
      this.m = 2;
    this.O = 0;
    this.jdField_char = 0;
    this.at = 0;
    this.N = 0;
    this.w = new String[0];
    this.ao = new byte[0];
    this.h = new int[0];
    this.aF = new int[0][][];
    this.ax = new int[this.k.length][][];
    this.jdField_void = new int[this.k.length][][];
    this.v = new int[this.k.length][];
    if (this.k.length > 0)
    {
      int i1;
      int i2;
      if (this.U == 0)
      {
        this.ae = 100;
        i1 = 0;
        this.jdField_char = this.n;
        this.O = this.n;
        for (i2 = this.n; i2 < this.k.length; i2 = (byte)(i2 + 1))
        {
          a(i2, true, a(i2));
          if (this.w.length > this.jdField_try)
          {
            i1 = 1;
            break;
          }
          this.at = i2;
        }
        this.N = 0;
        if (i1 == 0)
        {
          i1 = 0;
          for (i2 = (byte)(this.n - 1); i2 >= 0; i2 = (byte)(i2 - 1))
          {
            a(i2, false, a(i2));
            this.O = i2;
            if (this.w.length > this.jdField_try)
            {
              i1 = 1;
              break;
            }
            this.jdField_char = i2;
          }
          if (i1 != 0)
          {
            this.N = (short)(this.az - this.w.length * a5.iG);
            break label471;
          }
          this.N = 0;
        }
      }
      else if (this.U == 1)
      {
        this.ae = 100;
        i1 = 0;
        this.at = this.n;
        for (i2 = this.n; i2 >= 0; i2 = (byte)(i2 - 1))
        {
          a(i2, false, a(i2));
          this.O = i2;
          if (this.w.length > this.jdField_try)
          {
            i1 = 1;
            break;
          }
          this.jdField_char = i2;
        }
        this.N = (short)(this.az - this.w.length * a5.iG);
        if (i1 == 0)
        {
          for (i2 = (byte)(this.n + 1); i2 < this.k.length; i2 = (byte)(i2 + 1))
          {
            a(i2, true, a(i2));
            if (this.w.length > this.jdField_try)
              break;
            this.at = i2;
          }
          this.N = 0;
        }
      }
    }
    label471: jdMethod_do();
    a3 locala3 = this;
    this.Z.a((short)locala3.k.length, (short)(locala3.ao.length - 1), (short)locala3.jdField_char);
    c();
  }

  private final int a(int paramInt)
  {
    int i1 = 0;
    if (this.C == 100)
      i1 = bm.bR[aB[paramInt]];
    else if (this.C == 5)
      i1 = bm.bR[aH[paramInt]];
    else if (this.C == 6)
      i1 = bm.bR[K[paramInt]];
    else
      i1 = bm.bR[(this.C + 1)];
    return i1;
  }

  private final void jdMethod_do()
  {
    this.ay = 0;
    for (int i1 = 0; i1 < this.n - this.O; i1++)
      this.ay = (short)(this.ay + this.ao[i1]);
  }

  private final void a(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    Object localObject1 = new int[0][];
    Object localObject2 = new int[0][];
    int[] arrayOfInt1 = new int[2];
    if (this.ae > paramInt1)
      this.ae = paramInt1;
    String[] arrayOfString = b5.a(this.k[paramInt1], this.R, a5.fq);
    int i1 = 0;
    int i2 = arrayOfString.length;
    while (i1 < i2)
    {
      int i3 = 0;
      int i5 = arrayOfString[i1].length();
      if ((i2 > 1) && (i1 != i2 - 1) && ((i3 = arrayOfString[i1].lastIndexOf('#')) == i5 - 1))
      {
        arrayOfString[i1] = arrayOfString[i1].substring(0, i3);
        arrayOfString[(i1 + 1)] = ("#" + arrayOfString[(i1 + 1)]);
      }
      i1++;
    }
    Object localObject3 = new int[arrayOfString.length];
    for (i2 = 0; i2 < localObject3.length; i2++)
      localObject3[i2] = paramInt2;
    this.w = b5.a(this.w, paramBoolean ? this.w.length : 0, arrayOfString);
    this.ao = b5.a(this.ao, paramBoolean ? this.ao.length : 0, (byte)arrayOfString.length);
    this.h = b5.a(this.h, paramBoolean ? this.h.length : 0, localObject3);
    Vector[] arrayOfVector = null;
    Vector localVector = null;
    if (this.C == 100)
    {
      arrayOfVector = (Vector[])(Vector[])aE[paramInt1];
      localVector = (Vector)W[paramInt1];
    }
    else if (this.C == 5)
    {
      arrayOfVector = (Vector[])(Vector[])as[paramInt1];
      localVector = (Vector)jdField_long[paramInt1];
    }
    else if (this.C == 6)
    {
      arrayOfVector = (Vector[])(Vector[])jdField_if[paramInt1];
      localVector = (Vector)l[paramInt1];
    }
    else
    {
      arrayOfVector = (Vector[])(Vector[])jdField_int[this.C][paramInt1];
      localVector = (Vector)H[this.C][paramInt1];
    }
    if (localVector != null)
    {
      arrayOfInt1[0] = Integer.parseInt(localVector.elementAt(0).toString());
      arrayOfInt1[1] = Integer.parseInt(localVector.elementAt(1).toString());
    }
    else
    {
      arrayOfInt1 = null;
    }
    int[][][] arrayOfInt = new int[arrayOfString.length][][];
    if (arrayOfVector != null)
    {
      paramInt2 = 0;
      localObject3 = new int[0][];
      for (int i4 = 0; i4 < arrayOfVector.length; i4++)
      {
        int[] arrayOfInt2;
        int i6 = (arrayOfInt2 = (int[])(int[])arrayOfVector[i4].elementAt(5))[0];
        int i7 = arrayOfInt2[1];
        int i8 = 0;
        for (int i9 = 0; i9 < paramInt2; i9++)
        {
          i6 -= arrayOfString[i9].length();
          i7 -= arrayOfString[i9].length();
        }
        while (true)
        {
          int i10 = 0;
          if (i6 < 0)
          {
            if (i7 < 0)
              break;
            if (i7 < arrayOfString[paramInt2].length())
            {
              i9 = 0;
              i10 = i7;
            }
            else
            {
              i9 = 0;
              i10 = arrayOfString[paramInt2].length() - 1;
              i8 = 1;
            }
          }
          else if (i6 < arrayOfString[paramInt2].length())
          {
            if (i7 < 0)
            {
              i9 = -1;
              i10 = -1;
            }
            else if (i7 < arrayOfString[paramInt2].length())
            {
              i9 = i6;
              i10 = i7;
            }
            else
            {
              i9 = i6;
              i10 = arrayOfString[paramInt2].length() - 1;
              i8 = 1;
            }
          }
          else
          {
            i9 = -1;
            i10 = -1;
            i8 = 1;
          }
          if ((i9 >= 0) && (i10 >= 0))
          {
            String str;
            if ((str = arrayOfString[paramInt2]).charAt(i9) == '[')
              localObject1 = b5.a(localObject1, localObject1.length, new int[] { paramInt2, i9 });
            if (str.charAt(i10) == ']')
              localObject2 = b5.a(localObject2, localObject2.length, new int[] { paramInt2, i10 });
            localObject3 = b5.a(localObject3, localObject3.length, new int[] { i9, i10, arrayOfInt2[2] });
          }
          if (i8 == 0)
            break;
          i8 = 0;
          arrayOfInt[paramInt2] = localObject3;
          localObject3 = new int[0][];
          i6 -= arrayOfString[paramInt2].length();
          i7 -= arrayOfString[paramInt2].length();
          paramInt2++;
        }
      }
      arrayOfInt[paramInt2] = localObject3;
    }
    else
    {
      localObject1 = null;
      localObject2 = null;
    }
    this.v[paramInt1] = arrayOfInt1;
    this.ax[paramInt1] = localObject1;
    this.jdField_void[paramInt1] = localObject2;
    this.aF = b5.a(this.aF, paramBoolean ? this.aF.length : 0, arrayOfInt);
  }

  private void c()
  {
    int i1 = this.w.length;
    this.o = new int[i1][];
    this.j = new int[i1][];
    for (int i2 = 0; i2 < i1; i2++)
    {
      if (((this.m != 2) && (this.m != 3) && (this.m != 4)) || (i2 < this.ay) || (i2 >= this.ay + this.ao[(this.n - this.O)]))
        continue;
      if ((this.P != null) && (this.m == 3))
      {
        i3 = this.ay + this.ao[(this.n - this.O)];
        i4 = this.P[0];
        i5 = this.P[1];
        for (int i6 = this.ay; i6 < i3; i6++)
        {
          int i7 = this.w[i6].length();
          if (i2 == i6)
          {
            i3 = 0;
            i6 = 0;
            if (i4 < 0)
            {
              if (i5 >= 0)
              {
                if (i5 < i7)
                {
                  i3 = 0;
                  i6 = i5;
                  break label253;
                }
                i3 = 0;
                i6 = i7 - 1;
                break label253;
              }
            }
            else if ((i4 < i7) && (i5 >= 0))
            {
              if (i5 < i7)
              {
                i3 = i4;
                i6 = i5;
                break label253;
              }
              i3 = i4;
              i6 = i7 - 1;
              break label253;
            }
            i3 = -1;
            i6 = -1;
            label253: if ((i3 < 0) || (i6 < 0))
              break;
            this.o[i2] = { i3, i6 };
            break;
          }
          i4 -= i7;
          i5 -= i7;
        }
      }
      if (this.G == null)
        continue;
      int i3 = this.G[0];
      int i4 = this.G[1];
      int i5 = this.ay;
      if (i2 != i5)
        continue;
      this.j[i2] = { i3, i3 + i4 };
    }
  }

  private final void a(Graphics paramGraphics, int paramInt)
  {
    int i1 = paramGraphics.getClipX();
    int i2 = paramGraphics.getClipY();
    int i3 = paramGraphics.getClipWidth();
    int i4 = paramGraphics.getClipHeight();
    paramGraphics.setClip(this.ap, this.an, this.R, this.az);
    for (int i5 = 0; i5 < this.w.length; i5++)
    {
      int i6 = this.h[i5];
      if (((this.m == 2) || (this.m == 3) || (this.m == 4)) && (i5 >= this.ay) && (i5 < this.ay + this.ao[(this.n - this.O)]))
        i6 = 16776960;
      ad.a(paramGraphics, this.w[i5], i6, this.ap, paramInt + this.an + a5.iG * i5, this.aF[i5], this.o[i5], this.j[i5]);
    }
    paramGraphics.setClip(i1, i2, i3, i4);
  }

  private void jdField_new()
  {
    int i1 = this.ap;
    int i3 = this.an;
    int i4 = this.R;
    int i6 = this.az;
    int i7 = this.ar;
    int i9 = this.an - this.ar;
    int i10 = -1;
    int i11 = 0;
    int i12 = 0;
    int i13 = -1;
    if (a5.a(i1, i7, i4, i9))
    {
      if (this.k.length == 0)
      {
        a5.a(131072);
        return;
      }
      this.F = (!this.F);
      if (!this.F)
        a5.a(131072);
      else if ((this.C >= 1) && (this.C <= 4))
        a(1);
    }
    if (a5.a(i1, i3, i4, i6))
    {
      if (this.k.length == 0)
        return;
      this.F = false;
      a3 locala31 = this;
      i6 = 0;
      int i2;
      i3 = i2 = i6 = (byte)((a5.cU - locala31.an - locala31.N) / a5.iG);
      if (this.ae > 0)
      {
        i4 = jdField_if(this.ae);
        i3 += i4;
      }
      i4 = 0;
      i6 = 0;
      i7 = 0;
      i9 = this.k.length;
      while (i7 < i9)
      {
        String[] arrayOfString;
        int i5 = (arrayOfString = b5.a(this.k[i7], this.R, a5.fq)).length;
        if (i6 += i5 >= i3 + 1)
        {
          if ((this.m != 1) && (this.m != 3))
            i10 = this.n;
          i13 = this.n;
          this.n = (byte)i7;
          break;
        }
        i7++;
      }
      if ((this.m == 2) || (this.m == 3) || (this.m == 1) || (this.m == 4))
      {
        if ((this.m == 1) && (this.k.length > 0))
          a(2);
        i11 = this.aa;
        i12 = this.aA;
        this.U = 1;
        if ((this.n < this.jdField_char) || (this.n > this.at))
          jdField_try();
        else
          jdMethod_do();
        String str1 = this.w[i2];
        Object localObject2 = null;
        Object localObject1 = null;
        if (this.C == 100)
        {
          localObject2 = aE[this.n];
          localObject1 = W[this.n];
        }
        else if (this.C == 6)
        {
          localObject2 = jdField_if[this.n];
          localObject1 = l[this.n];
        }
        else if (this.C == 5)
        {
          localObject2 = as[this.n];
          localObject1 = jdField_long[this.n];
        }
        else
        {
          localObject2 = jdField_int[this.C][this.n];
          localObject1 = H[this.C][this.n];
        }
        if ((localObject2 != null) || (localObject1 != null))
        {
          String str2 = str1;
          i6 = i3;
          a3 locala32 = this;
          int i15 = -1;
          int i16 = 0;
          if (locala32.n > 0)
            i16 = locala32.jdField_if(locala32.n);
          char[] arrayOfChar = str2.toCharArray();
          int i18 = i16;
          int i19 = 0;
          int i14 = 0;
          if (i18 == i6)
          {
            i19 = a5.fq.charsWidth(arrayOfChar, 0, localObject4[0]);
            i14 = a5.fq.charsWidth(arrayOfChar, 0, localObject4[0] + localObject4[1]);
            if ((a5.cV >= i19 + locala32.ap) && (a5.cV <= i14 + locala32.ap))
              i15 = 0;
          }
          this.aA = ((localObject4 = locala32.v[locala32.n]) == null ? -1 : i15);
          Object localObject3 = str1;
          i6 = i3;
          locala32 = this;
          i15 = 0;
          if (locala32.n > 0)
            i15 = locala32.jdField_if(locala32.n);
          int[][] arrayOfInt = locala32.ax[locala32.n];
          Object localObject4 = locala32.jdField_void[locala32.n];
          i17 = -1;
          i18 = 0;
          i19 = 0;
          localObject3 = ((String)localObject3).toCharArray();
          i3 = 0;
          if (i3 < arrayOfInt.length)
          {
            int i8 = arrayOfInt[i3][0] + i15;
            int i20 = localObject4[i3][0] + i15;
            if ((i8 == i6) && (i20 != i6))
            {
              i18 = a5.fq.charsWidth(localObject3, 0, arrayOfInt[i3][1]);
              if (a5.cV >= i18 + locala32.ap)
                i17 = i3;
            }
            if ((i8 != i6) && (i20 == i6))
            {
              i19 = a5.fq.charsWidth(localObject3, 0, localObject4[i3][1]);
              if (a5.cV <= i19 + locala32.ap)
                i17 = i3;
            }
            if ((i8 == i6) && (i20 == i6))
            {
              i18 = a5.fq.charsWidth(localObject3, 0, arrayOfInt[i3][1]);
              i19 = a5.fq.charsWidth(localObject3, 0, localObject4[i3][1]);
              if ((a5.cV >= i18 + locala32.ap) && (a5.cV <= i19 + locala32.ap))
                i17 = i3;
            }
            i3 = (byte)(i3 + 1);
            tmpTernaryOp = this;
            while (true);
          }
        }
      }
    }
  }

  private int jdField_if(int paramInt)
  {
    int i1 = 0;
    for (int i2 = 0; i2 < paramInt; i2++)
    {
      String[] arrayOfString;
      int i3 = (arrayOfString = b5.a(this.k[i2], this.R, a5.fq)).length;
      i1 += i3;
    }
    return i1;
  }

  public final void jdField_for()
  {
    Object localObject1 = this;
    int i5;
    if ((a5.gZ) && (a5.jdMethod_byte(268435456)))
    {
      int i2 = 0;
      if (((a3)localObject1).i != null)
      {
        if (((a3)localObject1).i.df())
        {
          a5.a(131072);
          i2 = 1;
        }
        else
        {
          ((a3)localObject1).i = null;
          ((a3)localObject1).jdField_new();
          i2 = 1;
        }
      }
      else
        ((a3)localObject1).jdField_new();
      i5 = a5.il - 18;
      int i6 = a5.iA + 4 << 1;
      if (a5.a(0, i5, i6, 18))
        a5.a(131072);
      if ((((a3)localObject1).Z != null) && (((a3)localObject1).w.length > ((a3)localObject1).jdField_try) && (((a3)localObject1).Z.b()))
        i2 = 1;
      if (i2 == 0)
      {
        i2 = a5.ic - (a5.iA + 4 << 1);
        i5 = a5.il - 18;
        i6 = a5.iA + 4 << 1;
        if (a5.a(i2, i5, i6, 18))
          a5.a(262144);
      }
    }
    ((a3)localObject1).c();
    if (a5.jdField_try(4096))
    {
      if (this.i != null)
      {
        this.i.c8();
      }
      else if ((this.m == 2) || (this.m == 3) || (this.m == 4))
      {
        if (this.G != null)
          this.G = null;
        a(2);
        this.U = 0;
        if ((this.n = (byte)(this.n - 1)) < 0)
        {
          this.U = 1;
          this.n = 0;
          if (((this.C >= 1) && (this.C <= 4)) || (this.C == 6))
            a(1);
        }
        else if (this.n < this.jdField_char)
        {
          jdField_try();
        }
        else
        {
          jdMethod_do();
        }
      }
      c();
      return;
    }
    if (a5.jdField_try(8192))
    {
      if (this.i != null)
      {
        this.i.c9();
      }
      else if (this.m == 1)
      {
        if (this.k.length > 0)
          a(2);
      }
      else if ((this.m == 2) || (this.m == 3) || (this.m == 4))
      {
        if (this.G != null)
          this.G = null;
        a(2);
        this.U = 1;
        if ((this.n = (byte)(this.n + 1)) > this.k.length - 1)
          this.n = (byte)(this.k.length - 1);
        else if (this.n > this.at)
          jdField_try();
        else
          jdMethod_do();
      }
      c();
      return;
    }
    if (a5.jdField_try(16384))
    {
      if (this.i != null)
        return;
      localObject1 = null;
      Object localObject3 = null;
      if ((this.m == 3) || (this.m == 4))
      {
        if (this.C == 100)
        {
          localObject1 = aE[this.n];
          localObject3 = W[this.n];
        }
        else if (this.C == 5)
        {
          localObject1 = as[this.n];
          localObject3 = jdField_long[this.n];
        }
        else if (this.C == 6)
        {
          localObject1 = jdField_if[this.n];
          localObject3 = l[this.n];
        }
        else
        {
          localObject1 = jdField_int[this.C][this.n];
          localObject3 = H[this.C][this.n];
        }
        if ((localObject1 != null) && (this.m == 3))
        {
          if (this.aa >= 0)
          {
            this.aa = (byte)(this.aa - 1);
            int i3;
            if (this.aa == -1)
            {
              if (localObject3 != null)
              {
                a(4);
                i3 = Integer.parseInt((localObject1 = (Vector)localObject3).elementAt(0).toString());
                i5 = Integer.parseInt(((Vector)localObject1).elementAt(1).toString());
                this.G = new int[] { i3, i5 };
              }
              else
              {
                a(2);
              }
              this.P = null;
            }
            else
            {
              i3 = ((Short)(Short)(localObject1 = (Vector[])(Vector[])localObject1)[this.aa].elementAt(0)).shortValue();
              i5 = ((String)(String)localObject1[this.aa].elementAt(1)).length();
              this.P = new int[] { i3, i3 + i5 - 1 };
            }
          }
        }
        else if (this.m == 4)
        {
          a(2);
          this.G = null;
        }
      }
      c();
      return;
    }
    int i4;
    if (a5.jdField_try(32768))
    {
      if (this.i != null)
        return;
      if ((this.m == 2) || (this.m == 3) || (this.m == 4))
      {
        localObject1 = null;
        Object localObject4 = null;
        if (this.C == 100)
        {
          localObject4 = aE[this.n];
          localObject1 = W[this.n];
        }
        else if (this.C == 5)
        {
          localObject4 = as[this.n];
          localObject1 = jdField_long[this.n];
        }
        else if (this.C == 6)
        {
          localObject4 = jdField_if[this.n];
          localObject1 = l[this.n];
        }
        else
        {
          localObject4 = jdField_int[this.C][this.n];
          localObject1 = H[this.C][this.n];
        }
        if ((localObject1 != null) && (this.m == 2))
        {
          a(4);
          i4 = Integer.parseInt((localObject1 = (Vector)localObject1).elementAt(0).toString());
          i5 = Integer.parseInt(((Vector)localObject1).elementAt(1).toString());
          this.G = new int[] { i4, i5 };
        }
        else if (i4 != null)
        {
          if (this.aa == -1)
          {
            a(3);
            this.G = null;
          }
          this.aa = (byte)(this.aa + 1);
          i4 = (localObject1 = (Vector[])(Vector[])i4).length;
          if (this.aa >= i4)
          {
            this.aa = (byte)(i4 - 1);
          }
          else
          {
            i5 = ((Short)(Short)localObject1[this.aa].elementAt(0)).shortValue();
            int i1 = ((String)(String)localObject1[this.aa].elementAt(1)).length();
            this.P = new int[] { i5, i5 + i1 - 1 };
          }
        }
      }
      c();
      return;
    }
    Object localObject2;
    if (a5.jdMethod_byte(196608))
    {
      if (this.i != null)
      {
        localObject2 = this;
        switch (i4 = ((Integer)(Integer)this.i.db().elementAt(((a3)localObject2).i.de())).intValue())
        {
        case 589831:
          be.gJ = true;
          if (((a3)localObject2).C == 100)
            bu.k = ak[localObject2.n];
          else if (((a3)localObject2).C == 6)
            bu.k = s[localObject2.n];
          else
            bu.k = aq[localObject2.C][localObject2.n];
          bg.hP = bu.k;
          a5.eQ.a(i4);
          br.c6();
          break;
        case 1638405:
          b5.jdMethod_case("聊天加氏族--------------------------");
          if (((a3)localObject2).C == 100)
            bt.f = ak[localObject2.n];
          else if (((a3)localObject2).C == 6)
            bt.f = s[localObject2.n];
          else
            bt.f = aq[localObject2.C][localObject2.n];
          a5.eQ.a(i4);
          break;
        case 1835013:
          b5.jdMethod_case("聊天加诸侯--------------------------");
          if (((a3)localObject2).C == 100)
            i.jdField_long = ak[localObject2.n];
          else if (((a3)localObject2).C == 6)
            i.jdField_long = s[localObject2.n];
          else
            i.jdField_long = aq[localObject2.C][localObject2.n];
          a5.eQ.a(i4);
          break;
        case 589834:
          a5.eQ.a(589834);
          br.c6();
          break;
        case 720897:
          if (((a3)localObject2).C == 100)
            bu.k = ak[localObject2.n];
          else if (((a3)localObject2).C == 6)
            bu.k = s[localObject2.n];
          else
            bu.k = aq[localObject2.C][localObject2.n];
          a5.eQ.a(720897);
          break;
        case 589836:
          if (((a3)localObject2).C == 100)
            bg.hP = ak[localObject2.n];
          else if (((a3)localObject2).C == 6)
            bg.hP = s[localObject2.n];
          else
            bg.hP = aq[localObject2.C][localObject2.n];
          a5.eQ.a(589836);
          break;
        case 589835:
          if (((a3)localObject2).C == 100)
            bg.hP = ak[localObject2.n];
          else if (((a3)localObject2).C == 6)
            bg.hP = s[localObject2.n];
          else
            bg.hP = aq[localObject2.C][localObject2.n];
          a5.eQ.a(589835);
          break;
        case 196638:
          if (((a3)localObject2).C == 100)
            l.jdField_try = ak[localObject2.n];
          else if (((a3)localObject2).C == 6)
            l.jdField_try = s[localObject2.n];
          else
            l.jdField_try = aq[localObject2.C][localObject2.n];
          a5.eQ.a(196638);
          if (((a3)localObject2).i == null)
            break;
          ((a3)localObject2).i = null;
          break;
        case -268435456:
          if (((a3)localObject2).C == 100)
            a(ak[localObject2.n], u[localObject2.n], false);
          else if (((a3)localObject2).C == 6)
            a(s[localObject2.n], aJ[localObject2.n], false);
          else
            a(aq[localObject2.C][localObject2.n], z[localObject2.C][localObject2.n], false);
          break;
        case -268435455:
          if (((a3)localObject2).C == 6)
            T = 11;
          else
            T = (byte)(((a3)localObject2).C + 1);
          aD = -1;
          Y = null;
          ((a3)localObject2).jdField_if(true);
          break;
        case -268435454:
        case -268435453:
        case -268435452:
        case -268435451:
        case -268435450:
          if (i4 == -268435450)
            T = 11;
          else
            T = (byte)(i4 - -268435454 + 2);
          aD = -1;
          Y = null;
          ((a3)localObject2).jdField_if(true);
          break;
        default:
          if (((this = i4 - -16777216) < 0) || (this >= c.length))
            break;
          a(c[this], (String)(String)((a3)localObject2).i.dj().elementAt(((a3)localObject2).i.de()), false);
        }
        ((a3)localObject2).i = null;
        return;
      }
      Object localObject5;
      switch (this.m)
      {
      case 0:
        switch (this.C)
        {
        case 100:
          a(false);
          break;
        case 0:
          jdMethod_do(false);
        }
        break;
      case 1:
        if (this.C == 6)
          T = 11;
        else
          T = (byte)(this.C + 1);
        aD = -1;
        Y = null;
        jdField_if(true);
        break;
      case 2:
        switch (this.C)
        {
        case 100:
          a(false);
          break;
        case 5:
          break;
        case 0:
          jdMethod_do(bp.ag().jdField_new() != aq[this.C][this.n]);
          break;
        default:
          localObject2 = null;
          localObject5 = null;
          if ((this.C != 6) && (bp.ag().jdField_new() != aq[this.C][this.n]) && (u[this.n].length() != 0))
          {
            localObject2 = new String[] { "回复", "输入" };
            localObject5 = new int[] { -268435456, -268435455 };
          }
          else
          {
            localObject2 = new String[] { "输入" };
            localObject5 = new int[] { -268435455 };
          }
          this.i = new br(0);
          this.i.a(localObject2, localObject5);
        }
        break;
      case 3:
        br.c6();
        localObject2 = null;
        if (this.C == 100)
        {
          ad.k = ak[this.n];
          localObject2 = aE[this.n];
        }
        else if (this.C == 5)
        {
          ad.k = y[this.n];
          localObject2 = as[this.n];
        }
        else if (this.C == 6)
        {
          ad.k = s[this.n];
          localObject2 = jdField_if[this.n];
        }
        else
        {
          ad.k = aq[this.C][this.n];
          localObject2 = jdField_int[this.C][this.n];
        }
        if (localObject2 == null)
          break;
        ad.jdField_if = ((Long)(Long)(localObject5 = (Vector[])(Vector[])localObject2)[this.aa].elementAt(2)).longValue();
        ad.jdField_new = ((Byte)(Byte)localObject5[this.aa].elementAt(3)).byteValue();
        r.mg = ((int[])(int[])localObject5[this.aa].elementAt(5))[2];
        a5.eQ.a(655363);
        break;
      case 4:
        a(true);
      }
      return;
    }
    else if (a5.jdMethod_byte(262144))
    {
      if (this.i != null)
      {
        this.i = null;
        return;
      }
      localObject2 = this;
      be.gu = null;
      ((a3)localObject2).a = null;
      ((a3)localObject2).A = null;
      ((a3)localObject2).Z = null;
      ((a3)localObject2).i = null;
      ((a3)localObject2).w = null;
      ((a3)localObject2).h = null;
      ((a3)localObject2).ao = null;
      ((a3)localObject2).k = null;
      ((a3)localObject2).aF = null;
      ((a3)localObject2).ax = null;
      ((a3)localObject2).v = null;
      ((a3)localObject2).jdField_void = null;
      ((a3)localObject2).o = null;
      ((a3)localObject2).j = null;
      a5.fE.removeAllElements();
      be.cn();
      be.cn();
      if ((a5.es != null) && ((a5.es.g9 == -1610612687) || (a5.es.g9 == 458773) || (a5.es.g9 == 262193)))
        a5.A();
      if (a5.es != null)
      {
        a5.jdMethod_case(4);
        return;
      }
      if (a5.ea != null)
      {
        a5.jdMethod_case(1);
        return;
      }
      a5.jdMethod_case(0);
    }
  }

  private final void a(boolean paramBoolean)
  {
    String[] arrayOfString = null;
    int[] arrayOfInt = null;
    if (paramBoolean)
    {
      arrayOfString = new String[] { "回复", "查看详情", "加为好友", "屏蔽玩家", "举报玩家" };
      arrayOfInt = new int[] { -268435456, 589831, 589835, 589836, 196638 };
      int i1;
      if ((bu.e == 0) || (bu.h == bp.ag().jdField_new()))
      {
        paramBoolean = "组队邀请";
        i1 = 720897;
        arrayOfString = b5.a(arrayOfString, arrayOfString.length, paramBoolean);
        arrayOfInt = b5.a(arrayOfInt, arrayOfInt.length, i1);
      }
      if ((bp.ag().as() == i.jdField_for) || (bp.ag().as() == i.jdField_void))
      {
        paramBoolean = "招入麾下";
        i1 = 1835013;
        arrayOfString = b5.a(arrayOfString, arrayOfString.length, paramBoolean);
        arrayOfInt = b5.a(arrayOfInt, arrayOfInt.length, i1);
      }
      else if ((bp.ag().aT() == bt.d) || (bp.ag().aT() == bt.jdField_long))
      {
        paramBoolean = "招入麾下";
        i1 = 1638405;
        arrayOfString = b5.a(arrayOfString, arrayOfString.length, paramBoolean);
        arrayOfInt = b5.a(arrayOfInt, arrayOfInt.length, i1);
      }
    }
    else if ((t.length != 0) && (u[this.n].length() != 0) && (bp.ag().jdField_new() != ak[this.n]))
    {
      if (z.case)
      {
        arrayOfString = new String[] { "回复", "世界频道", "氏族频道", "场景频道", "组队频道", "喇叭频道" };
        arrayOfInt = new int[] { -268435456, -268435454, -268435453, -268435452, -268435451, -268435450 };
      }
      else
      {
        arrayOfString = new String[] { "回复", "世界频道", "氏族频道", "场景频道", "组队频道", "喇叭频道", "[好友]" };
        arrayOfInt = new int[] { -268435456, -268435454, -268435453, -268435452, -268435451, -268435450, 589834 };
      }
    }
    else if (z.case)
    {
      arrayOfString = new String[] { "世界频道", "氏族频道", "场景频道", "组队频道", "喇叭频道" };
      arrayOfInt = new int[] { -268435454, -268435453, -268435452, -268435451, -268435450 };
    }
    else
    {
      arrayOfString = new String[] { "世界频道", "氏族频道", "场景频道", "组队频道", "喇叭频道", "[好友]" };
      arrayOfInt = new int[] { -268435454, -268435453, -268435452, -268435451, -268435450, 589834 };
    }
    this.i = new br(0);
    this.i.a(arrayOfString, arrayOfInt);
  }

  private final void jdMethod_do(boolean paramBoolean)
  {
    String[] arrayOfString = null;
    int[] arrayOfInt = null;
    if (paramBoolean)
    {
      paramBoolean = (bu.e == 0) || (bu.h == bp.ag().jdField_new());
      arrayOfInt = new int[(arrayOfString = new String[jdField_new.length + (paramBoolean ? 3 : 2)]).length];
      arrayOfString[0] = "回复";
      arrayOfInt[0] = -268435456;
      System.arraycopy(jdField_new, 0, arrayOfString, 1, jdField_new.length);
      for (int i1 = 0; i1 < jdField_for.length; i1++)
        arrayOfInt[(i1 + 1)] = (i1 + -16777216);
      i1++;
      if (!z.case)
      {
        arrayOfString[i1] = "[好友]";
        arrayOfInt[i1] = 589834;
      }
      if (paramBoolean)
      {
        i1++;
        arrayOfString[i1] = "组队邀请";
        arrayOfInt[i1] = 720897;
      }
      c = new int[jdField_for.length];
      System.arraycopy(jdField_for, 0, c, 0, jdField_for.length);
    }
    else
    {
      if (z.case)
        return;
      arrayOfInt = new int[(arrayOfString = new String[jdField_new.length + 1]).length];
      System.arraycopy(jdField_new, 0, arrayOfString, 0, jdField_new.length);
      for (paramBoolean = false; paramBoolean < arrayOfInt.length - 1; paramBoolean++)
        arrayOfInt[paramBoolean] = (paramBoolean + -16777216);
      arrayOfString[(arrayOfString.length - 1)] = "[好友]";
      arrayOfInt[(arrayOfInt.length - 1)] = 589834;
      c = new int[jdField_for.length];
      System.arraycopy(jdField_for, 0, c, 0, jdField_for.length);
    }
    this.i = new br(0);
    this.i.a(arrayOfString, arrayOfInt);
  }

  public final void a(byte paramByte)
  {
    this.m = paramByte;
    switch (paramByte)
    {
    case 1:
      this.aa = -1;
      this.aA = -1;
      this.A.a("输入", 0);
      return;
    case 2:
      this.aa = -1;
      this.aA = -1;
      if (this.C == 5)
      {
        this.A.a("", 0);
        return;
      }
      this.A.a("操作", 0);
      return;
    case 3:
      this.aA = -1;
      this.A.a("查看", 0);
      return;
    case 4:
      this.aa = -1;
      this.A.a("操作", 0);
    }
  }

  public final void jdField_if(boolean paramBoolean)
  {
    if (paramBoolean)
      be.cn();
    paramBoolean = new Form(this.a.aC());
    Object localObject1 = b5.a("/special/face.png");
    TextField localTextField = new TextField("", this.B, 30, 0);
    Object localObject2 = new StringItem("输入物品及任务方式:\n[b数字]背包物品: [b1]", "");
    Object localObject3 = new StringItem("[c数字]仓库物品: [c1]", "");
    Object localObject4 = new StringItem("[z数字]装备物品: [z1]", "");
    Object localObject5 = new StringItem("[r数字]任务名字: [r1]", "");
    StringItem localStringItem = new StringItem("输入#0~9显示人物表情: #0", "");
    localObject1 = new ImageItem(null, (Image)localObject1, 3, null);
    System.out.println("频道：" + T);
    if (T == 1)
      localTextField.setLabel("与" + Y + "聊天:");
    else if (T == 11)
      localTextField.setLabel("发送到喇叭频道");
    else
      localTextField.setLabel("发送到" + this.ad[(T - 1)]);
    paramBoolean.append(localTextField);
    paramBoolean.append(localStringItem);
    paramBoolean.append((Item)localObject1);
    paramBoolean.append((Item)localObject2);
    paramBoolean.append((Item)localObject3);
    paramBoolean.append((Item)localObject4);
    paramBoolean.append((Item)localObject5);
    localObject1 = new Command("发送", 4, 0);
    localObject2 = new Command(bm.a2[1], 2, 1);
    localObject3 = new Command("插入表情", 4, 1);
    localObject4 = new Command("插入物品", 4, 1);
    localObject5 = new Command("插入任务", 4, 1);
    paramBoolean.addCommand((Command)localObject1);
    paramBoolean.addCommand((Command)localObject2);
    paramBoolean.addCommand((Command)localObject3);
    paramBoolean.addCommand((Command)localObject4);
    paramBoolean.addCommand((Command)localObject5);
    paramBoolean.setCommandListener(new CommandListener((Command)localObject1, localTextField, (Command)localObject2, (Command)localObject3, (Command)localObject4, (Command)localObject5)
    {
      private final Command val$okCmd;
      private final TextField val$tf;
      private final Command val$exitCmd;
      private final Command val$insertFace;
      private final Command val$insertGoods;
      private final Command val$insertTask;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        if (paramCommand == this.val$okCmd)
        {
          if ("".equals(this.val$tf.getString().trim()))
            return;
          paramCommand = this.val$tf.getString();
          this.val$tf.setString("");
          a3.this.B = "";
          if (paramCommand.trim().equals(""))
            return;
          if ((a3.T != 11) && (System.currentTimeMillis() - bm.br[a3.T] < bm.c[a3.T]))
          {
            as.a(0, "您的发言太频繁！", bm.a2[2], "", -1, -2);
            br.c6();
            a5.jdMethod_case(3);
            a5.e8.setFullScreenMode(true);
            a5.dI.display.setCurrent(a5.e8);
            return;
          }
          a3.access$000(a3.this, paramCommand);
          if (a3.T != 11)
            bm.br[a3.T] = System.currentTimeMillis();
          if ((a3.T == 1) && (a3.this.C >= 1) && (a3.this.C <= 4))
            (be.gu = new a3(0)).jdMethod_byte();
          else
            br.c6();
          a5.jdMethod_case(3);
        }
        else
        {
          if (paramCommand == this.val$exitCmd)
          {
            a3.this.B = "";
            a5.jdMethod_case(3);
            a5.e8.setFullScreenMode(true);
            a5.dI.display.setCurrent(a5.e8);
            br.c6();
            return;
          }
          if (paramCommand == this.val$insertFace)
          {
            a3.this.B = this.val$tf.getString();
            a5.es = (be)a5.fE.elementAt(0);
            a5.jdMethod_case(4);
            a5.es.g9 = -1610612687;
          }
          else
          {
            if (paramCommand == this.val$insertGoods)
            {
              a3.this.B = this.val$tf.getString();
              a5.es = (be)a5.fE.elementAt(1);
              if (a5.fE.elementAt(1) == null)
              {
                a5.dK = 1;
                a5.eQ.a(458773);
                a5.jdMethod_case(3);
              }
              else
              {
                a5.jdMethod_case(4);
                a5.es.ck();
              }
              a5.e8.setFullScreenMode(true);
              a5.dI.display.setCurrent(a5.e8);
              return;
            }
            if (paramCommand != this.val$insertTask)
              return;
            a3.this.B = this.val$tf.getString();
            a5.es = (be)a5.fE.elementAt(2);
            if (a5.fE.elementAt(2) == null)
            {
              a5.dK = 2;
              a5.eQ.a(262193);
              a5.jdMethod_case(3);
            }
            else
            {
              a5.jdMethod_case(4);
              a5.es.ck();
            }
          }
        }
        a5.e8.setFullScreenMode(true);
        a5.dI.display.setCurrent(a5.e8);
      }
    });
    a5.dI.display.setCurrent(paramBoolean);
  }

  public static final void a(int paramInt, String paramString, boolean paramBoolean)
  {
    T = 1;
    aD = paramInt;
    Y = paramString;
    if (paramBoolean)
      (be.gu = new a3(0)).jdMethod_byte();
    a5.jdMethod_case(3);
    be.gu.jdField_if(true);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     a3
 * JD-Core Version:    0.6.0
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class z
{
  public static short jdField_try;
  public static short U;
  public static short aE;
  public static short aD;
  private static short aY;
  private byte[][] a6;
  private short[][] a2;
  private short[][] aN;
  private short[][] Z;
  private static int aF;
  private static int u;
  private static int az;
  private static int d;
  private static Image[] aX = null;
  private static String[] aR = null;
  public static boolean F = false;
  public static int aS = 0;
  private boolean jdField_long = true;
  private String A = "";
  private String af = "";
  private static byte[] W = null;
  public static short jdField_do = 0;
  public static short jdField_if = 0;
  private static byte k = 0;
  private static byte aQ = 0;
  public static Image ak = null;
  public static Image[] ao = new Image[30];
  public static Image[] m = new Image[8];
  private static byte[][] n = null;
  public static short b = 0;
  private static short aU = 0;
  static short[] ay = null;
  static String[] o = null;
  private static byte[] aG = null;
  private static byte[] l = null;
  private static byte[] f = null;
  static short[][] v = null;
  private static byte[] X = null;
  static short[] a3 = null;
  static short[] a1 = null;
  private static short Q = 0;
  public static short au = 0;
  private static boolean V = false;
  private static short R = 0;
  public static short p = 0;
  public static byte T = 0;
  public static byte ai = 0;
  public static short[][] ah = null;
  private static byte e = 0;
  private static String[] q = null;
  private static byte[] jdField_for = null;
  private static boolean[] a4 = null;
  private static short[] O = null;
  private static short[] N = null;
  private static byte[] aw = null;
  public static boolean jdField_case = false;
  private static int an;
  private static int al;
  private static int aj;
  private static int L;
  private static int a0;
  public static int[] ad = new int[2];
  public static Vector ag = new Vector();
  public static boolean aK;
  private static z aV = null;
  private short E = 0;
  private int[] am = null;
  private int aT = 0;
  private static final int z = a5.ic - 29;
  private static final int y = a5.d8 ? a5.il - 36 - ad.m - 25 : a5.il - 36 - 25;
  private int aC = z;
  private int aA = y;
  private int as = 0;
  private int jdField_void = 0;
  private int aL = 0;
  private int aa = 0;
  private int aq = 0;
  private int t = 0;
  private static boolean at;
  private static byte ac;
  private static byte ax;
  private int jdField_else = 0;
  static boolean jdField_int = true;
  private static byte[][] ap;
  private static byte[][] a;
  private Image r = null;
  public static byte aI;
  public static byte w;

  private z()
  {
    aS = a5.il - 36 - (a5.d8 ? ad.m : 0);
  }

  public static z a()
  {
    if (aV == null)
      aV = new z();
    return aV;
  }

  public static void jdField_do()
  {
    aV = null;
  }

  public final void jdField_for(Graphics paramGraphics)
  {
    Graphics localGraphics1;
    z localz1;
    int i14;
    int i15;
    int i19;
    int i21;
    int i24;
    int i26;
    int i30;
    int i31;
    int i35;
    int i36;
    int i37;
    int i38;
    int i39;
    if (a5.cf)
    {
      localGraphics1 = paramGraphics;
      localz1 = this;
      aF = (aD + (aE - aY) * 10 / 20) / 10;
      u = (aD + aS + (aE + a5.ic - aY) * 10 / 20) / 10 + 1;
      az = (aD - (aE + a5.ic - aY) * 10 / 20) / 10;
      d = (aD + aS - (aE - aY) * 10 / 20) / 10 + 1;
      if (aF < 0)
        aF = 0;
      if (az < 0)
        az = 0;
      if (u >= jdField_try)
        u = jdField_try;
      if (d >= U)
        d = U;
      try
      {
        localGraphics1.setColor(a5.cX);
        localGraphics1.fillRect(0, 0, a5.ic, aS + 10);
        i14 = aS + 10;
        i12 = a5.ic;
        int i10 = aD;
        i9 = aE;
        Graphics localGraphics3 = localGraphics1;
        z localz2 = localz1;
        i15 = 0;
        int i16 = 0;
        i19 = (i10 + (i9 - aY) * 10 / 20) / 10;
        i21 = (i10 - (i9 - aY) * 10 / 20) / 10;
        i19--;
        i21--;
        i15 = (20 * (i19 - i21) >> 1) + aY - aE;
        i16 = (10 * (i19 + i21) >> 1) + 10 - aD;
        i24 = 0;
        i26 = i14 / 10 + 2;
        while (i24 < i26)
        {
          int i28 = -1;
          i30 = i12 / 20 + 2;
          while (i28 < i30)
          {
            for (i31 = 1; i31 >= 0; i31--)
            {
              int i32 = i19 + i28;
              i35 = i21 - i28 - i31;
              if ((i32 < 0) || (i32 >= jdField_try) || (i35 < 0) || (i35 >= U))
                continue;
              i36 = localz2.a2[i32][i35];
              i37 = localz2.a6[i32][i35] >> 1 & 0x3;
              i38 = i15 + i28 * 20 - localz2.aN[i36][2] + i31 * 10;
              i39 = i16 - localz2.aN[i36][3] - i31 * 5;
              i35 = i37;
              i14 = i39;
              i10 = i38;
              i9 = i36;
              localObject2 = localGraphics3;
              z localz6 = localz2;
              if ((i9 == 0) || (i9 < 1))
                continue;
              if (i35 == 0)
                b5.a((Graphics)localObject2, aX[(i9 - 1)], i10, i14, 0);
              else if (i35 == 1)
                b5.a((Graphics)localObject2, aX[(i9 - 1)], i10 + 0 + (2 * (localz6.aN[i9][2] + 1) - aX[(i9 - 1)].getWidth()), i14, 2);
              else if (i35 == 2)
                b5.a((Graphics)localObject2, aX[(i9 - 1)], i10, i14 + aX[(i9 - 1)].getHeight() - 10, 1);
              else if (i35 == 3)
                b5.a((Graphics)localObject2, aX[(i9 - 1)], i10 + 0 + (2 * (localz6.aN[i9][2] + 1) - aX[(i9 - 1)].getWidth()), i14 + aX[(i9 - 1)].getHeight() - 9, 3);
              else
                b5.jdField_case("Error!! Map:drawBufferTileTemp()");
            }
            i28++;
          }
          i16 += 10;
          i19++;
          i21++;
          i24++;
        }
        if ((jdField_case) && (!jdField_int) && ((aI == 3) || ((aI == 2) && (w == 1))))
          localz1.jdField_case(localGraphics1);
      }
      catch (Exception localException)
      {
        Object localObject2;
        (localObject2 = localException).printStackTrace();
      }
    }
    if (l.char != null)
    {
      l.char.jdField_do();
      if (!l.char.jdField_if())
        l.char.a(paramGraphics);
    }
    if (bp.ef > -a5.hN.jdField_new)
    {
      bp.ef = (byte)(bp.ef - 1);
      a5.hN.jdField_if(paramGraphics, bp.fE - aE, bp.fD - aD, a5.hN.jdField_new - Math.abs(bp.ef) - 1);
    }
    int i4;
    if (a5.fA)
    {
      i9 = d;
      i7 = u;
      i4 = az;
      i2 = aF;
      localGraphics1 = paramGraphics;
      localz1 = this;
      if (i2 < 0)
        i2 = 0;
      if (i4 < 0)
        i4 = 0;
      if (i7 > jdField_try)
        i7 = jdField_try;
      if (i9 > U)
        i9 = U;
      boolean[] arrayOfBoolean1 = new boolean[localz1.Z.length];
      localz1.E = 0;
      for (i12 = i4; i12 < i9; i12++)
        for (i14 = i2; i14 < i7; i14++)
        {
          if ((localz1.a6[i14][i12] & 0x10) == 0)
            continue;
          i21 = i12;
          i19 = i14;
          z localz3;
          i24 = (localz3 = localz1).Z.length;
          for (i26 = 0; i26 < i24; i26++)
          {
            if ((localz3.Z[i26][0] != i19) || (localz3.Z[i26][1] != i21))
              continue;
            i30 = i26;
            z localz5;
            i31 = (localz5 = localz3).Z[i30][0];
            int i33 = localz5.Z[i30][1];
            i35 = localz5.Z[i30][3];
            if ((i36 = localz5.a6[i31][i33] >>> 3 & 0x1) == 1)
              i37 = (20 * (i31 - i33) >> 1) + aY - aE + (localz5.aN[i35][2] + 2) - aX[(i35 - 1)].getWidth();
            else
              i37 = (20 * (i31 - i33) >> 1) + aY - aE - localz5.aN[i35][2];
            i38 = (10 * (i31 + i33) >> 1) + 10 - aD - localz5.aN[i35][3];
            i39 = i37 + aX[(i35 - 1)].getWidth();
            i33 = i38 + aX[(i35 - 1)].getHeight();
            z tmp1299_1297 = localz3;
            tmp1299_1297.E = (short)(tmp1299_1297.E + 1);
          }
          if ((i15 = ((i39 > 0) && (i37 < a5.ic) && (i33 > 0) && (i38 < aS) ? 1 : 0) != 0 ? i26 : -1) == -1)
            continue;
          arrayOfBoolean1[i15] = true;
        }
      for (int i17 = l.jdField_else.length - 1; i17 > 0; i17--)
        for (i19 = i17 - 1; i19 >= 0; i19--)
        {
          if (l.jdField_else[i17].b() >= l.jdField_else[i19].b())
            continue;
          localObject6 = l.jdField_else[i17];
          l.jdField_else[i17] = l.jdField_else[i19];
          l.jdField_else[i19] = localObject6;
        }
      boolean[] arrayOfBoolean2 = arrayOfBoolean1;
      z localz4 = localz1;
      Object localObject6 = l.jdField_else;
      localz4.am = new int[localz4.E + localObject6.length];
      localz4.aT = (localz4.am.length - 1);
      for (i24 = localz4.Z.length - 1; i24 >= 0; i24--)
      {
        if (arrayOfBoolean2[i24] == 0)
          continue;
        i26 = localz4.Z[i24][0];
        int i29 = localz4.Z[i24][1];
        i30 = localz4.Z[i24][3];
        i31 = localz4.a6[i26][i29] >>> 3 & 0x1;
        i37 = i29 - localz4.aN[i30][(1 - i31)] + 1;
        i36 = i26 - localz4.aN[i30][i31] + 1;
        i35 = i24;
        z localz7 = localz4;
        for (i38 = l.jdField_else.length - 1; i38 >= 0; i38--)
        {
          a4 locala43;
          if (((locala43 = l.jdField_else[i38]) == null) || (locala43.jdField_void() < i36) || (locala43.e() < i37) || (locala43.jdMethod_char() != -1))
            continue;
          locala43.a(i35);
          localz7.am[(localz7.aT--)] = (-i38 - 1);
        }
        localz4.am[(localz4.aT--)] = i24;
      }
      for (i24 = l.jdField_else.length - 1; i24 >= 0; i24--)
      {
        a4 locala42;
        if (((locala42 = l.jdField_else[i24]) == null) || (locala42.jdMethod_char() != -1))
          continue;
        locala42.a(-5);
        localz4.am[(localz4.aT--)] = (-i24 - 1);
      }
      localz1.jdField_try(localGraphics1);
    }
    if (a5.g9)
    {
      i4 = d;
      i2 = u;
      int j = az;
      int i = aF;
      for (i11 = 0; i11 < e; i11++)
      {
        if ((N[i11] < j) || (N[i11] > i4) || (O[i11] < i) || (O[i11] > i2))
          continue;
        int tmp1867_1865 = i11;
        byte[] tmp1867_1862 = aw;
        tmp1867_1862[tmp1867_1865] = (byte)(tmp1867_1862[tmp1867_1865] ^ 0x1);
      }
    }
    Object localObject1 = paramGraphics;
    a4 locala41 = null;
    for (int i2 = l.jdField_else.length - 1; i2 >= 0; i2--)
    {
      if (!a(locala41 = l.jdField_else[i2]))
        continue;
      if (((l.jdField_for) && (locala41.jdField_for() != 2)) || (l.g == locala41) || (locala41 == bp.ag()) || (locala41.jdField_for() == 3) || ((locala41.jdField_for() == 2) && (l.new)))
        locala41.jdField_if((Graphics)localObject1);
      w localw;
      if ((locala41.jdField_try == 3) && ((localw = (w)locala41).Q() != 0))
        localw.jdField_int((Graphics)localObject1);
      if ((locala41.jdField_for() != 1) && (locala41.jdField_for() != 3) && (locala41.jdField_for() != 2))
        continue;
      ((bz)locala41).a$11c44857((Graphics)localObject1);
    }
    int i7 = d;
    int i5 = u;
    i2 = az;
    int i1 = aF;
    localObject1 = paramGraphics;
    int i9 = 0;
    int i11 = 0;
    for (int i12 = 0; i12 < e; i12++)
    {
      if ((N[i12] < i2) || (N[i12] > i7) || (O[i12] < i1) || (O[i12] > i5))
        continue;
      i9 = jdField_for(O[i12], N[i12]);
      i11 = jdField_try(O[i12], N[i12]);
      i14 = i9 - aE - (b5.jdField_do(q[i12]) >> 1);
      i15 = i11 - aD - 70;
      ((Graphics)localObject1).setColor(16768941);
      ((Graphics)localObject1).fillRoundRect(i14 - 2, i15 - 2, b5.jdField_do(q[i12]) + 4, a5.iG + 4, 6, 6);
      ((Graphics)localObject1).setColor(2955522);
      ((Graphics)localObject1).drawRoundRect(i14 - 2, i15 - 2, b5.jdField_do(q[i12]) + 4, a5.iG + 4, 6, 6);
      ((Graphics)localObject1).drawString(q[i12], i14, i15, 20);
    }
    Graphics localGraphics2 = paramGraphics;
    localObject1 = this;
    int i27;
    int i25;
    if (this.jdField_long)
    {
      int[][] arrayOfInt1 = { { 0, 0 }, { ((z)localObject1).aq, 0 }, { ((z)localObject1).aq, ((z)localObject1).t }, { 0, ((z)localObject1).t } };
      int[] arrayOfInt2 = new int[4];
      int[] arrayOfInt3 = new int[4];
      for (i9 = 0; i9 < 4; i9++)
      {
        arrayOfInt2[i9] = ((z)localObject1).a(arrayOfInt1[i9][0], arrayOfInt1[i9][1]);
        arrayOfInt3[i9] = ((z)localObject1).jdMethod_new(arrayOfInt1[i9][0], arrayOfInt1[i9][1]);
      }
      localGraphics2.setColor(16777173);
      localGraphics2.drawLine(arrayOfInt2[0], arrayOfInt3[0] + 1, arrayOfInt2[1] - 1, arrayOfInt3[1]);
      localGraphics2.drawLine(arrayOfInt2[1] - 1, arrayOfInt3[1], arrayOfInt2[2], arrayOfInt3[2] - 1);
      localGraphics2.drawLine(arrayOfInt2[2], arrayOfInt3[2] - 1, arrayOfInt2[3] + 1, arrayOfInt3[3]);
      localGraphics2.drawLine(arrayOfInt2[0], arrayOfInt3[0] + 1, arrayOfInt2[3] + 1, arrayOfInt3[3]);
      Graphics localGraphics4 = localGraphics2;
      Object localObject3 = localObject1;
      int i20;
      if (ah != null)
      {
        localGraphics4.setColor(16524288);
        i14 = 0;
        i15 = 0;
        int i18 = 0;
        i20 = ah.length;
        while (i18 < i20)
        {
          int i22 = ah[i18][0];
          i24 = ah[i18][1];
          if ((i22 != -1) || (i24 != -1))
          {
            i14 = localObject3.a(i22, i24);
            i15 = localObject3.jdMethod_new(i22, i24);
            localGraphics4.fillRect(i14 - 1, i15 - 1, 3, 3);
          }
          i18++;
        }
      }
      localGraphics4 = localGraphics2;
      localObject3 = localObject1;
      Graphics localGraphics5;
      Object localObject4;
      Object localObject5;
      int i23;
      if (jdField_case)
      {
        i20 = aI;
        localGraphics5 = localGraphics4;
        localObject4 = localObject3;
        switch (i20)
        {
        case 1:
          break;
        case 2:
          localObject4.a(localGraphics5, 130823, bp.ag().l, bp.ag().q);
          break;
        case 3:
          b localb1 = null;
          b localb2 = null;
          localb1 = (b)l.a(ad[0]);
          localb2 = (b)l.a(ad[1]);
          if ((localb1 == null) || (localb2 == null))
            localObject4.a(localGraphics5, 130823, bp.ag().l, bp.ag().q);
          if ((localb1 != null) && (localb2 == null))
          {
            if (!localb1.eb)
              break;
            i27 = 0;
            if (localb1.dp == 1)
              i27 = 14024807;
            else
              i27 = 87551;
            if ((localb1.jdMethod_new() != bp.ag().jdMethod_new()) || (localb2 == null))
              localObject4.a(localGraphics5, 130823, bp.ag().l, bp.ag().q);
            localObject4.a(localGraphics5, i27, localb1.jdField_void(), localb1.e());
          }
          else if ((localb1 == null) && (localb2 != null))
          {
            if (!localb2.eb)
              break;
            i27 = 0;
            if (localb2.dp == 1)
              i27 = 14024807;
            else
              i27 = 87551;
            if ((localb2.jdMethod_new() != bp.ag().jdMethod_new()) || (localb1 == null))
              localObject4.a(localGraphics5, 130823, bp.ag().l, bp.ag().q);
            localObject4.a(localGraphics5, i27, localb2.jdField_void(), localb2.e());
          }
          else
          {
            if ((localb1 == null) || (localb2 == null))
              break;
            if (((localb1.jdMethod_new() != bp.ag().jdMethod_new()) && (localb2.jdMethod_new() != bp.ag().jdMethod_new())) || ((localb1.jdMethod_new() == bp.ag().jdMethod_new()) && (!localb1.eb)) || ((localb2.jdMethod_new() == bp.ag().jdMethod_new()) && (!localb2.eb)))
              localObject4.a(localGraphics5, 130823, bp.ag().l, bp.ag().q);
            if ((localb1.jdMethod_new() != bp.ag().jdMethod_new()) && (localb1.eb))
              localObject4.a(localGraphics5, 14024807, localb1.jdField_void(), localb1.e());
            if ((localb2.jdMethod_new() != bp.ag().jdMethod_new()) && (localb2.eb))
              localObject4.a(localGraphics5, 87551, localb2.jdField_void(), localb2.e());
            if ((localb1.jdMethod_new() == bp.ag().jdMethod_new()) && (localb1.eb))
              localObject4.a(localGraphics5, 14024807, bp.ag().l, bp.ag().q);
            if ((localb2.jdMethod_new() != bp.ag().jdMethod_new()) || (!localb2.eb))
              break;
            localObject4.a(localGraphics5, 87551, bp.ag().l, bp.ag().q);
          }
        case 4:
        }
        localGraphics5 = localGraphics4;
        localObject4 = localObject3;
        localObject5 = null;
        for (i23 = 0; i23 < ag.size(); i23++)
        {
          if ((localObject5 = (ag)l.a(((Integer)ag.elementAt(i23)).intValue())) == null)
            continue;
          if ((localObject1 = localObject5).r == 5)
            localGraphics5.setColor(14024807);
          else if ((localObject1 = localObject5).r == 6)
            localGraphics5.setColor(87551);
          else if ((localObject1 = localObject5).r == 7)
            localGraphics5.setColor(8157496);
          localGraphics5.fillRect(localObject4.a(((a4)localObject5).l, ((a4)localObject5).q), localObject4.jdMethod_new(((a4)localObject5).l, ((a4)localObject5).q), 3, 3);
        }
      }
      else
      {
        localObject3.a(localGraphics4, 130823, bp.ag().l, bp.ag().q);
        localGraphics4.setColor(87551);
        if (bu.n != null)
          for (i14 = 0; i14 < bu.n.length; i14++)
          {
            if (bp.ag().aa() != bu.n[i14].aa())
              continue;
            localObject5 = bu.n[i14];
            localGraphics5 = localGraphics4;
            localObject4 = localObject3;
            if (localObject5 == null)
              continue;
            i23 = a(((a4)localObject5).jdField_void, ((a4)localObject5).c);
            i25 = jdField_if(((a4)localObject5).jdField_void, ((a4)localObject5).c);
            if ((i23 >= 0) && (i25 < 0))
              continue;
            localGraphics5.fillRect(localObject4.a(i23, i25), localObject4.jdMethod_new(i23, i25), 3, 3);
          }
      }
    }
    localGraphics2 = paramGraphics;
    localObject1 = this;
    if (q.h)
      be.a(localGraphics2, a5.ic - 10 - 2, ((z)localObject1).aA - 10, 1);
    localGraphics2 = paramGraphics;
    localObject1 = this;
    if (at)
    {
      int i3 = a5.fq.stringWidth(((z)localObject1).A);
      int i6 = a5.fq.stringWidth(((z)localObject1).af);
      int i8 = (i3 > i6 ? i3 : i6) + 20;
      i9 = 76 > i8 ? 76 : i8;
      int i13;
      i14 = (i13 = (short)((a5.il - 60 - 36 >> 1) - 40)) + (60 - (a5.iG << 1) >> 1);
      int[][] arrayOfInt4 = { { 16765320, 13740650, 8023640, 4866613, 4866613, 8023640, 13740650, 16765320 }, { 1461506, 2392068, 3455750, 4718344, 4718344, 3455750, 2392068, 1461506 }, { 5046786, 8389892, 12257286, 16714504, 16714504, 12257286, 8389892, 5046786 }, { 5064450, 8418820, 12299782, 16772360, 16772360, 12299782, 8418820, 5064450 } };
      i25 = a5.ic - i9 >> 1;
      i27 = i13;
      if ((z.ac = (byte)(ac + 1)) == 16)
      {
        ac = 0;
        at = false;
        ax = 0;
      }
      else if (ac % 2 == 0)
      {
        ax = (byte)(ax + 1);
      }
      localGraphics2.setColor(bm.aG);
      localGraphics2.fillRect(i25 + 1, i27 + 1, i9 - 2, 58);
      int[] arrayOfInt5 = { bm.cW, bm.cV, bm.cU };
      for (int i34 = 0; i34 < 3; i34++)
      {
        localGraphics2.setColor(arrayOfInt5[i34]);
        localGraphics2.drawRect(i25 + i34, i27 + i34, i9 - i34 * 2, 60 - i34 * 2);
      }
      int[] arrayOfInt6 = { bm.a9, bm.a8, bm.a7, bm.a5 };
      for (i35 = 0; i35 < 4; i35++)
      {
        localGraphics2.setColor(arrayOfInt6[i35]);
        localGraphics2.drawRect(i25 + 3 + 2 + i35, i27 + 3 + 2 + i35, i9 - 4 - 2 * (5 + i35), 56 - 2 * (5 + i35));
      }
      localGraphics2.setColor(arrayOfInt4[0][ax]);
      localGraphics2.drawString(((z)localObject1).A, a5.ic >> 1, i14, 17);
      localGraphics2.drawString(((z)localObject1).af, a5.ic >> 1, i14 + a5.iG + 2, 17);
    }
    if ((jdField_case) && (!jdField_int) && (aI == 2) && (w == 2))
      jdField_case(paramGraphics);
    as.b(paramGraphics);
  }

  private final void jdField_try(Graphics paramGraphics)
  {
    int i = this.am.length;
    for (int j = 0; j < i; j++)
    {
      int i1;
      int i2;
      if ((i1 = this.am[j]) >= 0)
      {
        int i3 = i1;
        Graphics localGraphics = paramGraphics;
        z localz = this;
        int i4 = this.Z[i3][0];
        int i5 = localz.Z[i3][1];
        i3 = localz.Z[i3][3];
        int i6;
        int i7;
        if ((i6 = localz.a6[i4][i5] >>> 3 & 0x1) == 1)
          i7 = (20 * (i4 - i5) >> 1) + aY - aE + (localz.aN[i3][2] + 2) - aX[(i3 - 1)].getWidth();
        else
          i7 = (20 * (i4 - i5) >> 1) + aY - aE - localz.aN[i3][2];
        if ((i2 = (10 * (i4 + i5) >> 1) + 10 - aD - localz.aN[i3][3]) < aS)
        {
          if (i6 == 1)
          {
            b5.a(localGraphics, aX[(i3 - 1)], i7, i2, 2);
            continue;
          }
          b5.a(localGraphics, aX[(i3 - 1)], i7, i2, 0);
        }
      }
      else
      {
        try
        {
          a4 locala4;
          if (a(locala4 = l.jdField_else[(-i2 - 1)]))
            if (locala4.jdField_try == 1)
            {
              if (!l.jdField_long)
                a(paramGraphics, locala4, true);
              else
                a(paramGraphics, locala4, false);
            }
            else
              locala4.a(paramGraphics);
          locala4.a(-1);
        }
        catch (Exception localException)
        {
          b5.jdField_case("线程同步出错");
        }
      }
    }
  }

  private static void a(Graphics paramGraphics, a4 parama4, boolean paramBoolean)
  {
    if ((paramBoolean) && (parama4.jdMethod_new() != bp.ag().jdMethod_new()))
      return;
    if (((paramBoolean = (b)parama4).W != null) && (paramBoolean.ap == 1))
    {
      if (paramBoolean.W.b() <= parama4.b())
      {
        paramBoolean.W.a(paramGraphics, paramBoolean.x, paramBoolean.w);
        paramBoolean.a(paramGraphics);
        return;
      }
      paramBoolean.a(paramGraphics);
      paramBoolean.W.a(paramGraphics, paramBoolean.x, paramBoolean.w);
      return;
    }
    paramBoolean.W = null;
    parama4.a(paramGraphics);
  }

  private static boolean a(a4 parama4)
  {
    if ((parama4.jdField_try == 1) || (parama4.jdField_try == 2) || (parama4.jdField_try == 3) || (parama4.jdField_try == 9))
      return ((parama4 = (bz)parama4).D() + parama4.jdField_long() < a5.ic) && (parama4.D() + parama4.jdField_long() + parama4.G() > 0) && (parama4.M() + parama4.a() < aS) && (parama4.M() + parama4.a() + parama4.x() > 0);
    if ((parama4.jdField_try == 4) || (parama4.jdField_try == 5) || (parama4.jdField_try == 6) || (parama4.jdField_try == 7) || (parama4.jdField_try == 8))
      return (parama4.o - (a5.ch.jdField_try >> 1) < a5.ic) && (parama4.o - (a5.ch.jdField_try >> 1) + a5.ch.jdField_try > 0) && (parama4.n - (a5.ch.a >> 1) < aS) && (parama4.n - (a5.ch.a >> 1) + a5.ch.a > 0);
    if ((parama4.jdField_try == 10) || (parama4.jdField_try == 11))
      return (parama4.o - (a5.hk.jdField_try >> 1) < a5.ic) && (parama4.o - (a5.hk.jdField_try >> 1) + a5.hk.jdField_try > 0) && (parama4.n - (a5.hk.a >> 1) < aS) && (parama4.n - (a5.hk.a >> 1) + a5.hk.a > 0);
    return false;
  }

  private int a(int paramInt1, int paramInt2)
  {
    return (paramInt1 - paramInt2) * this.as / 2000 + (this.aL >> 1) + this.aC;
  }

  private int jdMethod_new(int paramInt1, int paramInt2)
  {
    return (paramInt1 + paramInt2) * this.jdField_void / 2000 + this.aA;
  }

  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    paramGraphics.setColor(paramInt1);
    paramGraphics.fillRect(a(paramInt2, paramInt3), jdMethod_new(paramInt2, paramInt3), 3, 3);
  }

  public static void jdField_do(int paramInt1, int paramInt2)
  {
    aE = (short)(paramInt1 - (a5.ic >> 1));
    aD = (short)(paramInt2 - (aS >> 1));
  }

  public final String jdField_try()
  {
    return this.A;
  }

  public static short jdField_if(short paramShort1, short paramShort2)
  {
    return (short)((paramShort1 - (paramShort2 - aY) * 10 / 20) / 10);
  }

  public static short a(short paramShort1, short paramShort2)
  {
    return (short)((paramShort1 + (paramShort2 - aY) * 10 / 20) / 10);
  }

  public static short jdField_for(int paramInt1, int paramInt2)
  {
    return (short)((20 * (paramInt1 - paramInt2) >> 1) + aY);
  }

  public static short jdField_try(int paramInt1, int paramInt2)
  {
    return (short)((10 * (paramInt1 + paramInt2) >> 1) + 5);
  }

  public final boolean jdField_int(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= jdField_try) || (paramInt2 >= U) || (paramInt1 < 0) || (paramInt2 < 0))
      return false;
    return (this = this.a6[paramInt1][paramInt2] >>> 5 & 0x1) == 0;
  }

  private boolean a(byte[] paramArrayOfByte)
  {
    try
    {
      if (aX == null)
      {
        aX = new Image[this.aN.length - 1];
        aR = new String[this.aN.length - 1];
      }
      paramArrayOfByte = new ByteArrayInputStream(paramArrayOfByte);
      (paramArrayOfByte = new DataInputStream(paramArrayOfByte)).readUTF();
      jdField_try = (short)paramArrayOfByte.readInt();
      U = (short)paramArrayOfByte.readInt();
      this.a6 = new byte[jdField_try][U];
      this.a2 = new short[jdField_try][U];
      this.Z = new short[0][];
      int j;
      for (int i = 0; i < U; i++)
        for (j = 0; j < jdField_try; j++)
        {
          this.a6[j][i] = paramArrayOfByte.readByte();
          int i1;
          if ((i1 = this.a6[j][i] >>> 4 & 0x1) == 0)
          {
            this.a2[j][i] = (short)(paramArrayOfByte.readShort() >>> 6);
          }
          else
          {
            if ((i1 != 1) || ((i3 = paramArrayOfByte.readInt()) == 0))
              continue;
            this.a2[j][i] = (short)(i3 >>> 22);
            short[] arrayOfShort;
            (arrayOfShort = new short[4])[0] = (short)j;
            arrayOfShort[1] = (short)i;
            arrayOfShort[2] = (short)(i3 >> 10 & 0xFFF);
            arrayOfShort[3] = (short)(i3 & 0x3FF);
            this.Z = b5.a(this.Z, arrayOfShort);
          }
        }
      a5.cX = paramArrayOfByte.readInt();
      jdField_for();
      while ((j = paramArrayOfByte.readShort()) != -1)
        aR[(j - 1)] = ("f-" + j + ".png");
      for (int i2 = 0; i2 < aX.length; i2++)
      {
        if ((aX[i2] == null) || (aR[i2] != null))
          continue;
        aX[i2] = null;
      }
      Object localObject = null;
      for (int i3 = 0; i3 < aR.length; i3++)
      {
        if (aR[i3] == null)
          continue;
        localObject = new Object().getClass().getResourceAsStream("/pkg_npc/tiles/" + aR[i3]);
        this = new byte[(localObject = new DataInputStream((InputStream)localObject)).available()];
        ((DataInputStream)localObject).read(this);
        aX[i3] = j.jdField_if(this);
      }
      for (i3 = 0; i3 < aR.length; i3++)
        aR[i3] = null;
      paramArrayOfByte.close();
    }
    catch (Exception localException)
    {
      (paramArrayOfByte = localException).printStackTrace();
      return false;
    }
    return true;
  }

  private final void jdField_for()
  {
    for (int i = this.Z.length - 1; i > 0; i--)
      for (int j = i - 1; j >= 0; j--)
      {
        if (this.Z[i][2] >= this.Z[j][2])
          continue;
        short[] arrayOfShort = this.Z[i];
        this.Z[i] = this.Z[j];
        this.Z[j] = arrayOfShort;
      }
  }

  private static void a(ac paramac)
  {
    try
    {
      V = false;
      paramac.jdMethod_new();
      byte b1 = k;
      byte b2 = aQ;
      k = paramac.jdField_if();
      aQ = paramac.jdField_if();
      System.err.println("WorldMap--cols=" + k + "---rows=" + aQ);
      byte[][] arrayOfByte = null;
      arrayOfByte = n;
      n = null;
      n = new byte[k][aQ];
      for (int i = 0; i < k; i++)
        for (int j = 0; j < aQ; j++)
        {
          int i1 = paramac.jdField_if();
          i1 = (byte)(0xFF & i1);
          n[i][j] = i1;
        }
      aU = b;
      b = (short)paramac.jdField_if();
      System.err.println("regionCount=" + b);
      if (b == 0)
      {
        if (a5.es != null)
          a5.es.g9 = 131078;
        k = b1;
        aQ = b2;
        n = arrayOfByte;
        V = true;
        as.a(0, "该地图尚未开放，无法查看", "确定", "", -1, -2);
        return;
      }
      ay = null;
      o = null;
      aG = null;
      l = null;
      f = null;
      v = null;
      X = null;
      a3 = null;
      a1 = null;
      ay = new short[b];
      o = new String[b];
      aG = new byte[b];
      l = new byte[b];
      f = new byte[b];
      v = new short[b][4];
      X = new byte[b];
      a3 = new short[b];
      a1 = new short[b];
      for (i = 0; i < b; i++)
      {
        ay[i] = paramac.jdMethod_new();
        o[i] = paramac.jdMethod_goto();
        aG[i] = paramac.jdField_if();
        l[i] = paramac.jdField_if();
        f[i] = paramac.jdField_if();
        v[i][0] = paramac.jdMethod_new();
        v[i][1] = paramac.jdMethod_new();
        v[i][2] = paramac.jdMethod_new();
        v[i][3] = paramac.jdMethod_new();
        X[i] = 2;
        a3[i] = (short)(16 * aG[i]);
        a1[i] = (short)(16 * l[i]);
      }
      V = true;
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }

  public final void jdField_if(Graphics paramGraphics, int paramInt)
  {
    paramGraphics.setClip(0, ao.aA(), a5.ic, a5.il - ao.aA() - 18);
    if ((paramInt == 131078) || (paramInt == 131079))
    {
      this = paramGraphics;
      if (V)
      {
        setColor(0);
        fillRect(0, 0, a5.ic, a5.il);
        for (int j = 0; j < n.length; j++)
          for (int i1 = 0; i1 < n[j].length; i1++)
          {
            if (n[j][i1] == -1)
              continue;
            paramInt = j << 4;
            int i = i1 << 4;
            paramInt -= jdField_do;
            i -= jdField_if;
            if ((paramInt < -16) || (paramInt > a5.ic + 16) || (i < -16) || (i > a5.il + 16))
              continue;
            int i2 = n[j][i1] & 0x1F;
            switch ((n[j][i1] & 0xE0) >> 5)
            {
            case 0:
              b5.a(this, ao[i2], paramInt, i, 0);
              break;
            case 1:
              b5.a(this, ao[i2], paramInt, i, 5);
              break;
            case 2:
              b5.a(this, ao[i2], paramInt, i, 3);
              break;
            case 3:
              b5.a(this, ao[i2], paramInt, i, 6);
              break;
            case 4:
              b5.a(this, ao[i2], paramInt, i, 2);
              break;
            case 5:
              b5.a(this, ao[i2], paramInt, i, 4);
              break;
            case 6:
              b5.a(this, ao[i2], paramInt, i, 1);
              break;
            case 7:
              b5.a(this, ao[i2], paramInt, i, 7);
            }
          }
        for (j = 0; j < b; j++)
          drawImage(m[f[j]], a3[j] - jdField_do, a1[j] - jdField_if, 20);
        if ((Q != -1) && (a3.length != 0))
          drawImage(ak, a3[Q] - jdField_do, a1[Q] - jdField_if, 20);
        if (a3.length != 0)
          drawImage(a5.gA, a3[au] - jdField_do + a5.gA.getWidth() / 2 + 1, a1[au] - jdField_if + a5.gA.getHeight() / 2, 20);
      }
    }
    paramGraphics.setClip(0, 0, a5.ic, a5.il);
  }

  public static void jdField_do(int paramInt)
  {
    try
    {
      if ((paramInt == 131078) || (paramInt == 131079))
      {
        int i;
        if ((i = (short)(a3[au] - jdField_do - (a5.ic >> 1))) < 0)
        {
          if (Math.abs(i) < 16)
            jdField_do = (short)(jdField_do - Math.abs(i));
          else
            jdField_do = (short)(jdField_do - 16);
        }
        else if (i > 0)
          if (i < 16)
            jdField_do = (short)(jdField_do + i);
          else
            jdField_do = (short)(jdField_do + 16);
        if ((i = (short)(a1[au] - jdField_if - (a5.il - ao.aA() - 18 >> 1))) < 0)
        {
          if (Math.abs(i) < 16)
          {
            jdField_if = (short)(jdField_if - Math.abs(i));
            break label211;
          }
          jdField_if = (short)(jdField_if - 16);
          break label211;
        }
        if (i > 0)
        {
          if (i < 16)
          {
            jdField_if = (short)(jdField_if + i);
            break label211;
          }
          jdField_if = (short)(jdField_if + 16);
        }
      }
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
    label211: if ((paramInt == 131078) || (paramInt == 131079))
    {
      if (jdField_do < 0)
        jdField_do = 0;
      else if ((0 < (k << 4) - a5.ic) && (jdField_do > (k << 4) - a5.ic))
        jdField_do = (short)((k << 4) - a5.ic);
      if (jdField_if < -ao.aA())
      {
        jdField_if = (short)(-ao.aA());
        return;
      }
      if ((0 < (aQ << 4) - (a5.il - 18)) && (jdField_if > (aQ << 4) - (a5.il - 18)))
        jdField_if = (short)((aQ << 4) - (a5.il - 18));
    }
  }

  public static short a(short paramShort)
  {
    int i = -1;
    for (int j = 0; j < b; j = (short)(j + 1))
    {
      if (ay[j] != paramShort)
        continue;
      i = j;
      break;
    }
    if (i == -1)
      b5.jdField_case("出错了，没有找到服务器传送过来的地图ID=" + paramShort);
    return i;
  }

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 131075:
      a5.fR = true;
      localac.jdField_do(l.a().jdMethod_new());
      b5.jdField_case("C_TRANSMITTAL_DK=" + l.a().jdMethod_new());
      break;
    case 131076:
      a5.fR = true;
      localac.jdField_do(bv.ks);
      localac.a(bv.k6);
      b5.jdField_case("GOManager-cmd-C_TRANSMITTAL_MAP=" + bv.ks + "---dian=" + bv.k6);
      break;
    case 131078:
      a5.fR = true;
      b5.jdField_case("C_WORLDMAPREGION=");
      break;
    case 131079:
      a5.fR = true;
      if (T == 1)
      {
        if (!F)
        {
          F = true;
          p = 32767;
          b5.jdField_case("第一次进入右键菜单-地图-本地，");
        }
        localac.a(p);
        p = 32767;
      }
      else if (T == 2)
      {
        localac.a(p);
      }
      b5.jdField_case("请求区域地图C_REGION_INFO=" + p);
      break;
    case 131080:
    case 131081:
      localac.a(ay[au]);
      b5.jdField_case("C_SEARCH_NPCLIST=" + ay[au]);
      break;
    case 131103:
      localac.jdField_do(an);
      localac.jdField_do(al);
      localac.jdField_do(aj);
      localac.jdField_do(L);
      localac.jdField_do(a0);
      if (bu.d == 0)
      {
        localac.jdField_do(4122);
      }
      else if (bu.d == 1)
      {
        localac.jdField_do(4123);
      }
      else
      {
        if (bu.d != 2)
          break;
        localac.jdField_do(4124);
      }
    }
    return localac.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    int i;
    int i4;
    int i5;
    Object localObject1;
    Object localObject2;
    switch (paramInt)
    {
    case -2147352575:
      if ((a5.gQ != null) && (a5.gQ.y == 0))
        a5.gQ = null;
      a5.jdField_void();
      b5.jdField_case("Map-cmd-S_LOAD_MAP");
      a5.dA = 0;
      ac = 0;
      at = false;
      ax = 0;
      a5.jdField_do(2);
      a5.jdField_if();
      a5.dA = 10;
      a5.dA = 20;
      bp.ag().cF = false;
      l.jdField_for();
      a5.dA = 30;
      a5.eg = 0;
      a5.hg = 0;
      a5.d6.removeAllElements();
      a5.ep = true;
      a5.fE.removeAllElements();
      a5.dK = -1;
      a5.a(null);
      a5.dA = 40;
      a5.A();
      a5.aj();
      bp.ag().ap = 0;
      bp.ag().jdField_do(paramac.jdMethod_new());
      paramInt = paramac.jdMethod_goto();
      i = paramac.jdMethod_byte();
      W = null;
      W = paramac.jdField_int(i);
      a5.ir = true;
      z localz = a();
      try
      {
        if (localz.aN == null)
        {
          Object localObject4 = "/refe.dat";
          localObject3 = localz;
          int i6 = 0;
          try
          {
            localObject4 = b5.int$3b9f0c8((String)localObject4);
            (localObject4 = new DataInputStream((InputStream)localObject4)).readByte();
            ((DataInputStream)localObject4).readByte();
            i6 = ((DataInputStream)localObject4).readShort();
            int i7 = ((DataInputStream)localObject4).readByte();
            i6++;
            b5.jdField_case("*****iconCount=" + i6 + "******refeCount=" + i7);
            ((z)localObject3).aN = new short[i6][i7];
            for (int i8 = 0; i8 < i6; i8++)
              for (int i9 = 0; i9 < i7; i9++)
                localObject3.aN[i8][i9] = ((DataInputStream)localObject4).readShort();
            ((DataInputStream)localObject4).close();
          }
          catch (Exception localException1)
          {
            (localObject4 = localException1).printStackTrace();
          }
        }
        localz.a(b5.a$1cf9d9ca(W));
        (localObject3 = localz).aq = jdField_try;
        ((z)localObject3).t = U;
        if ((((z)localObject3).aq != 0) && (((z)localObject3).t != 0))
        {
          if (((z)localObject3).aq > ((z)localObject3).t)
          {
            ((z)localObject3).aL = 50;
            ((z)localObject3).as = (((z)localObject3).aL * 1000);
            localObject3.as /= ((z)localObject3).aq;
            ((z)localObject3).jdField_void = (((z)localObject3).as >> 1);
            ((z)localObject3).aa = (((z)localObject3).jdField_void * ((z)localObject3).t);
            localObject3.aa /= 1000;
          }
          else
          {
            ((z)localObject3).aa = 25;
            ((z)localObject3).jdField_void = (((z)localObject3).aa * 1000);
            localObject3.jdField_void /= ((z)localObject3).t;
            ((z)localObject3).as = (((z)localObject3).jdField_void << 1);
            ((z)localObject3).aL = (((z)localObject3).as * ((z)localObject3).aq);
            localObject3.aL /= 1000;
          }
          ((z)localObject3).aC = (z - (((z)localObject3).aL >> 1));
          ((z)localObject3).aA = (y - (((z)localObject3).aa >> 1));
        }
        aY = (short)(20 * (U >> 1));
        a5.fR = false;
      }
      catch (Exception localException2)
      {
        (localObject3 = localException2).printStackTrace();
      }
      a5.dA = 50;
      Object localObject3 = paramInt;
      (localz = a()).A = ((String)localObject3);
      b5.jdField_case("---------MapName=" + paramInt + "--dl=" + i + "--=" + bp.ag().aa());
      l.jdField_do(bp.ag());
      paramInt = paramac.jdField_if();
      e = paramac.jdField_if();
      b5.jdField_case("传送点小块的数量=" + paramInt + "   传送点大门的数量=" + e);
      ah = new short[paramInt][2];
      q = new String[e];
      jdField_for = new byte[e];
      O = new short[e];
      N = new short[e];
      aw = new byte[e];
      a4 = new boolean[e];
      i = 0;
      int i1 = 0;
      while (i < paramInt)
      {
        ah[i][0] = paramac.jdMethod_new();
        ah[i][1] = paramac.jdMethod_new();
        b5.jdField_case("CarryPoint[" + i + "]=-Col=" + ah[i][0] + "--Row=" + ah[i][1]);
        if (paramac.jdField_case())
        {
          q[i1] = paramac.jdMethod_goto();
          jdField_for[i1] = paramac.jdField_if();
          O[i1] = ah[i][0];
          N[i1] = ah[i][1];
          a4[i1] = false;
          i1 = (byte)(i1 + 1);
        }
        i = (byte)(i + 1);
      }
      paramac.jdField_if();
      paramac.jdField_if();
      a().af = paramac.jdMethod_goto();
      System.out.println("收到地图等级：" + a().af);
      a5.dA = 100;
      at = true;
      return;
    case -2147352562:
      paramInt = paramac.jdMethod_new();
      System.out.println("mapImgNum" + paramInt);
      for (i = 0; i < paramInt; i++)
      {
        String str = "f-" + paramac.jdMethod_new() + ".png";
        i4 = 0;
        for (i5 = 0; i5 < aX.length; i5++)
        {
          if ((aR[i5] == null) || (!aR[i5].equals(str)))
            continue;
          int i2;
          if ((i2 = paramac.jdMethod_new()) > 0)
          {
            localObject1 = paramac.jdField_int(i2);
            aX[i5] = j.jdField_if(localObject1);
          }
          i4 = 1;
          break;
        }
        if ((i4 != 0) || ((i5 = paramac.jdMethod_new()) <= 0))
          continue;
        paramac.jdField_int(i5);
      }
      return;
    case -2147352563:
      paramInt = paramac.jdMethod_new();
      System.out.println("MonsterImgNum" + paramInt);
      for (i = 0; i < paramInt; i++)
      {
        localObject1 = paramac.jdMethod_new() + ".png";
        i4 = 0;
        for (i5 = 0; i5 < t.bR.length; i5++)
        {
          if ((t.bU[i5] == null) || (!t.bU[i5].equals(localObject1)))
            continue;
          int i3;
          if ((i3 = paramac.jdMethod_new()) > 0)
          {
            localObject2 = paramac.jdField_int(i3);
            t.bR[i5] = j.jdField_if(localObject2);
          }
          i4 = 1;
          break;
        }
        if ((i4 != 0) || ((i5 = paramac.jdMethod_new()) <= 0))
          continue;
        paramac.jdField_int(i5);
      }
      return;
    case -2147352574:
      l.jdField_for();
      t.a(paramac);
      return;
    case -2147352570:
      a5.fR = false;
      if ((a5.es != null) && (a5.d6.size() > 0) && (T != 1))
        a5.d6.removeAllElements();
      a5.fE.removeAllElements();
      paramInt = paramac.jdMethod_new();
      a(paramac);
      Q = z.au = a(paramInt);
      b5.jdField_case("Map-cmd-S_WORLDMAPREGION=" + paramInt + "--selRegionIND=" + au);
      jdField_do = (short)(a3[au] - (a5.ic >> 1));
      jdField_if = (short)(a1[au] - (a5.il - ao.aA() - 18 >> 1));
      be localbe1 = new be(0, 0, (short)a5.ic, (short)a5.il);
      (localObject2 = new ao(0, localbe1)).jdField_do(o[au]);
      ((ba)localObject2).jdField_for(true);
      ((ba)localObject2).a(true, localbe1);
      ((ba)localObject2).w();
      localbe1.jdField_if((ba)localObject2);
      ao localao;
      (localao = new ao(1, localbe1)).jdField_do(new String[] { "进入", "返回" });
      localbe1.jdField_if(localao);
      localbe1.g9 = 131078;
      a5.es = localbe1;
      if (a5.V() == 4)
        break;
      a5.jdField_try(4);
      return;
    case -2147352569:
      a5.fR = false;
      i5 = paramac.jdMethod_new();
      short s = R;
      R = paramac.jdMethod_new();
      a(paramac);
      if (b == 0)
      {
        b = aU;
        R = s;
        return;
      }
      if ((T == 2) && (ai == 0))
      {
        ad.jdMethod_new();
        br.dm();
      }
      else if (ai == 1)
      {
        ai = 0;
      }
      if ((a5.es != null) && (a5.d6.size() > 0) && (T != 2))
        a5.d6.removeAllElements();
      a5.fE.removeAllElements();
      Q = z.au = a(i5);
      b5.jdField_case("区域地图-人物玩家所在的具体地图=" + i5 + "--selRegionIND=" + au + "--playerMT=" + R);
      if (Q == -1)
        au = 0;
      jdField_do = (short)(a3[au] - (a5.ic >> 1));
      jdField_if = (short)(a1[au] - (a5.il - ao.aA() - 18 >> 1));
      be localbe2 = new be(0, 0, (short)a5.ic, (short)a5.il);
      (paramInt = new ao(0, localbe2)).jdField_do(o[au]);
      paramInt.jdField_for(true);
      paramInt.a(true, localbe2);
      paramInt.w();
      (paramac = new ao(1, localbe2)).jdField_do(new String[] { "操作", "返回" });
      localbe2.jdField_if(paramInt);
      localbe2.jdField_if(paramac);
      localbe2.g9 = 131079;
      a5.es = localbe2;
      if (a5.V() == 4)
        break;
      a5.jdField_try(4);
      return;
    case -2147352561:
      jdField_case = true;
      if (!(z.jdField_int = paramac.jdField_case()))
      {
        ap = new byte[paramInt = paramac.jdField_if()][2];
        a = new byte[paramInt][2];
        for (paramInt = 0; paramInt < ap.length; paramInt++)
        {
          for (int j = 0; j < 2; j++)
            ap[paramInt][j] = paramac.jdField_if();
          a[paramInt][0] = (byte)(ap[paramInt][0] - 4);
          a[paramInt][1] = (byte)(ap[paramInt][1] - 5);
        }
      }
      aI = paramac.jdField_if();
      w = paramac.jdField_if();
      return;
    case -2147352545:
      an = paramac.jdMethod_byte();
      al = paramac.jdMethod_byte();
      aj = paramac.jdMethod_byte();
      L = paramac.jdMethod_byte();
      a0 = paramac.jdMethod_byte();
      a5.eQ.a(131103);
      return;
    case -2147352544:
      aK = paramac.jdField_case();
    case -2147352573:
    case -2147352572:
    case -2147352571:
    case -2147352568:
    case -2147352567:
    case -2147352566:
    case -2147352565:
    case -2147352564:
    case -2147352560:
    case -2147352559:
    case -2147352558:
    case -2147352557:
    case -2147352556:
    case -2147352555:
    case -2147352554:
    case -2147352553:
    case -2147352552:
    case -2147352551:
    case -2147352550:
    case -2147352549:
    case -2147352548:
    case -2147352547:
    case -2147352546:
    }
  }

  public static boolean jdMethod_new()
  {
    int i = bp.ag().e();
    int j = bp.ag().jdField_void();
    for (int i1 = 0; i1 < ap.length; i1++)
      if ((i == ap[i1][0]) && (j == ap[i1][1]))
        return false;
    return true;
  }

  private void jdField_case(Graphics paramGraphics)
  {
    if (this.r == null)
      this.r = b5.a("/special/gate.png");
    if (aI != 1)
    {
      int i;
      int j;
      int i1;
      if (aI == 2)
      {
        for (i = 0; i < a.length; i++)
        {
          j = jdField_for(a[i][1], a[i][0]) - aE;
          i1 = jdField_try(a[i][1], a[i][0]) - aD;
          b5.a(paramGraphics, this.r, j, i1, 2);
        }
        return;
      }
      if ((aI == 3) && ((w == 1) || (w == 2)))
        for (i = 0; i < a.length; i++)
        {
          j = jdField_for(a[i][1], a[i][0]) - aE;
          i1 = jdField_try(a[i][1], a[i][0]) - aD;
          b5.a(paramGraphics, this.r, j, i1, 0);
        }
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     z
 * JD-Core Version:    0.6.0
 */
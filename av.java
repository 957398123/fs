import java.io.PrintStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class av
{
  public static int g = -1;
  private static int D;
  private Image jdField_long = null;
  private static Graphics G = null;
  private byte m = 0;
  private byte jdField_if = 0;
  private int E = 0;
  private int v = 0;
  public static int C = 0;
  static int t = 0;
  public static int l = 0;
  public byte[][] jdField_else = null;
  public int[][] F = null;
  private short[][] d = null;
  private byte[][] z = null;
  private String[][] n = null;
  private boolean[][] jdField_char = null;
  public byte jdField_try = 0;
  public byte p;

  public av()
  {
    jdField_try();
  }

  private void jdField_try()
  {
    this.jdField_long = Image.createImage(a5.ic, 36);
    b5.a(av.G = this.jdField_long.getGraphics(), 0, 0, this.jdField_long.getWidth(), this.jdField_long.getHeight(), bm.cF);
    b5.jdField_if(G, 0, 0, this.jdField_long.getWidth(), this.jdField_long.getHeight(), bm.cD);
    b5.jdField_if(G, 1, 1, this.jdField_long.getWidth() - 2, this.jdField_long.getHeight() - 2, bm.cA);
    this.E = ((this.jdField_long.getWidth() >> 1) - a5.ge.getWidth() - 3 - 1 - 1);
    int i = this.E / a5.ed.getWidth();
    int j = this.jdField_long.getWidth() - 3 - a5.ed.getWidth();
    for (int k = 0; k < i; k++)
    {
      b5.a(G, a5.ed, 3 + k * (a5.ed.getWidth() + 1), 3, 0);
      b5.a(G, a5.ed, j + 0 - k * (a5.ed.getWidth() + 1), 3, 0);
    }
    j = (i = (k = this.E / 5) * 5 + 1) - 2;
    this.v = (a5.ic - 3 - i);
    b5.a(G, 4, 13, j, 2, bm.cH);
    b5.a(G, this.v + 1, 13, j, 2, bm.cH);
    b5.jdField_if(G, 3, 12, i, 4, bm.av);
    b5.jdField_if(G, this.v, 12, i, 4, bm.av);
    D = k - 1;
    for (i = 1; i < 5; i++)
    {
      G.drawLine(3 + k * i, 13, 3 + k * i, 15);
      G.drawLine(this.v + k * i, 13, this.v + k * i, 15);
    }
    C = this.jdField_long.getHeight() - 3 - 16;
    t = (this.E + 1 - 64) / 4;
    l = this.jdField_long.getWidth() - 3 - 16;
    if (a5.d8)
      for (i = 0; i < 4; i++)
      {
        b5.a(G, a5.ed, 19 + (t - a5.ed.getHeight() >> 1) + i * (t + 16), C + (16 - a5.ed.getWidth() >> 1), 6);
        b5.a(G, a5.ed, l - t + (t - a5.ed.getHeight() >> 1) - i * (t + 16), C + (16 - a5.ed.getWidth() >> 1), 6);
      }
    b5.a(G, a5.ge, (this.jdField_long.getWidth() >> 1) - a5.ge.getWidth(), 33 - a5.ge.getHeight() + 1, 0);
    b5.a(G, a5.ge, this.jdField_long.getWidth() >> 1, 33 - a5.ge.getHeight() + 1, 2);
    jdMethod_goto();
  }

  public final void a(byte paramByte, int paramInt, boolean paramBoolean)
  {
    for (int i = 0; i < this.p; i++)
      for (int j = 0; j < 8; j++)
      {
        if ((this.jdField_else[i][j] != paramByte) || (this.F[i][j] != paramInt))
          continue;
        this.jdField_char[i][j] = paramBoolean;
      }
  }

  public final void a(int paramInt)
  {
    int i = 0;
    for (int j = 0; j < this.p; j++)
      for (int k = 0; k < 8; k++)
      {
        if ((this.jdField_else[j][k] != 2) || (this.F[j][k] != paramInt))
          continue;
        this.jdField_else[j][k] = 0;
        this.F[j][k] = -1;
        this.d[j][k] = -1;
        this.z[j][k] = -1;
        this.n[j][k] = "";
        this.jdField_char[j][k] = 0;
        i = 1;
      }
    if (i == 0)
      return;
    a5.eQ.a(196633);
    jdMethod_goto();
  }

  public final void jdMethod_goto()
  {
    for (int i = 0; i < 8; i = (byte)(i + 1))
    {
      int j = i;
      av localav = this;
      if (this.d == null)
        continue;
      int k = r.k((short)((k = localav.d[localav.jdField_try][j]) % 1000));
      int i1 = jdField_if(localav.d[localav.jdField_try][j]);
      int i2;
      if (j < 4)
      {
        i2 = 3 + j * (t + 16);
        if ((localav.jdField_else[localav.jdField_try][j] > 0) && (k >= 0))
        {
          b5.a(G, i2 + 1, C + 1, 14, 14, bm.O[i1][0]);
          a5.gg.jdField_if(G, i2 + 1, C + 1, k);
          b5.jdField_if(G, i2, C, 16, 16, bm.O[i1][1]);
          if (localav.jdField_char[localav.jdField_try][j] != 0)
            G.drawImage(a5.fT, i2 + 1, C + 1, 0);
        }
        else
        {
          b5.a(G, i2 + 1, C + 1, 14, 14, bm.cH);
          b5.jdField_if(G, i2, C, 16, 16, bm.av);
        }
        a5.cG.jdField_if(G, i2, C, j + 1);
      }
      else
      {
        i2 = l - (7 - j) * (t + 16);
        if ((localav.jdField_else[localav.jdField_try][j] > 0) && (k >= 0))
        {
          b5.a(G, i2 + 1, C + 1, 14, 14, bm.O[i1][0]);
          a5.gg.jdField_if(G, i2 + 1, C + 1, k);
          b5.jdField_if(G, i2, C, 16, 16, bm.O[i1][1]);
          if (localav.jdField_char[localav.jdField_try][j] != 0)
            G.drawImage(a5.fT, i2 + 1, C + 1, 0);
        }
        else
        {
          b5.a(G, i2 + 1, C + 1, 14, 14, bm.cH);
          b5.jdField_if(G, i2, C, 16, 16, bm.av);
        }
        a5.cG.jdField_if(G, i2, C, 8 - (7 - j));
      }
    }
  }

  public final void a(Graphics paramGraphics)
  {
    int i = a5.il - this.jdField_long.getHeight();
    paramGraphics.drawImage(this.jdField_long, 0, i, 20);
    a5.dx.jdField_if(paramGraphics, 0 + (this.jdField_long.getWidth() >> 1) - a5.dx.jdField_try, i + 4 + (a5.e4.getHeight() >> 1) - (a5.dx.a >> 1), bp.ag().r() / 10);
    a5.dx.jdField_if(paramGraphics, 0 + (this.jdField_long.getWidth() >> 1), i + 4 + (a5.e4.getHeight() >> 1) - (a5.dx.a >> 1), bp.ag().r() % 10);
    if (bp.ag().ep)
    {
      this.jdField_if = (byte)(this.jdField_if ^ 0x1);
      b5.jdMethod_for(paramGraphics, this.jdField_long.getWidth() >> 1, a5.ge.getWidth() >> 1, i + 2, this.jdField_if + 2);
    }
    else
    {
      j = 0;
      if (bp.ag().cH)
        j = 4;
      if (bp.ag().aM() >= bp.ag().aD())
        if ((this.m >= 31) && (this.m <= 36))
        {
          this.jdField_if = (byte)(this.jdField_if ^ 0x1);
          this.m = (byte)(this.m + 1);
        }
        else if (this.m > 36)
        {
          this.jdField_if = 0;
          this.m = 0;
        }
        else
        {
          this.m = (byte)(this.m + 1);
          this.jdField_if = (byte)(this.m % 31 == 0 ? 1 : 0);
        }
      b5.jdMethod_for(paramGraphics, this.jdField_long.getWidth() >> 1, a5.ge.getWidth() >> 1, i + 2, this.jdField_if + j);
    }
    int k;
    if (bp.ag().s() != 0)
    {
      j = a5.e4.getHeight() * bp.ag().J() / bp.ag().s();
      k = a5.e4.getHeight() - j;
      b5.a(paramGraphics, a5.e4, 0, k, a5.e4.getWidth() >> 1, j, 0 + (this.jdField_long.getWidth() >> 1) - a5.ge.getWidth() + 2, i + 36 - 3 - a5.ge.getHeight() + k + 2);
      if (bp.ag().N() != 0)
      {
        j = a5.e4.getHeight() * bp.ag().v() / bp.ag().N();
        k = a5.e4.getHeight() - j;
        b5.a(paramGraphics, a5.e4, a5.e4.getWidth() >> 1, k, (a5.e4.getWidth() >> 1) + 1, j, 0 + (this.jdField_long.getWidth() >> 1) + 1 - 1, i + 36 - 3 - a5.ge.getHeight() + k + 2);
      }
      paramGraphics.setClip(0, 0, a5.ic, a5.il);
    }
    if (bp.ag().aD() > 0L)
    {
      if ((j = (int)(bp.ag().aM() * 10L / bp.ag().aD())) > 10)
        j = 10;
      for (k = 0; k < j; k++)
      {
        if (k >= 10)
          continue;
        b5.a(paramGraphics, k < 5 ? 4 + (D + 1) * k : 0 + this.v + 1 + (D + 1) * (k - 5), i + 13, D, 2, bm.bK);
      }
      if (j < 10)
      {
        k = (int)((bp.ag().aM() * 10L - j * bp.ag().aD()) * D / bp.ag().aD());
        b5.a(paramGraphics, j < 5 ? 4 + (D + 1) * j : 0 + this.v + 1 + (D + 1) * (j - 5), i + 13, k, 2, bm.bK);
      }
    }
    i = i + 12 - a5.ed.getHeight() - 2;
    paramGraphics = paramGraphics;
    this = this;
    for (int j = 0; j < a5.fj.jdField_int; j = (byte)(j + 1))
    {
      if (bp.ag().aH[j] == 0)
        continue;
      if (j < 6)
        a5.fj.jdField_if(paramGraphics, 3 + j * 10, i, bp.ag().aH[j] - 1);
      else
        a5.fj.jdField_if(paramGraphics, (this.jdField_long.getWidth() >> 1) + 1 + a5.ge.getWidth() + 1 + (j - 6) * 10, i, bp.ag().aH[j] - 1);
    }
  }

  public final void jdMethod_for()
  {
    this.jdField_try = (byte)(this.jdField_try + 1);
    if (this.jdField_try >= this.p)
      this.jdField_try = 0;
    jdMethod_goto();
  }

  public final void jdField_if(byte paramByte)
  {
    for (byte b = 0; b < 3; b++)
    {
      r localr;
      (localr = (r)a5.es.cf().elementAt(b + 3)).jdMethod_int(6);
      localr.j(8);
      int i;
      if (b < paramByte)
        for (i = 0; i < localr.dY(); i++)
        {
          localr.jdField_if(i, (short)this.jdField_else[b][i]);
          if (this.jdField_else[b][i] > 0)
          {
            localr.jdField_if(i, this.F[b][i]);
            int j;
            localr.jdMethod_do(i, (short)((j = this.d[b][i]) % 1000));
            localr.jdField_if(i, jdField_if(this.d[b][i]));
            localr.a(i, this.z[b][i]);
            localr.jdField_if(i, this.n[b][i]);
            localr.jdField_if(i, this.jdField_char[b][i]);
            localr.mW[i] = this.d[b][i];
          }
          else
          {
            localr.jdField_if(i, -1);
            localr.jdMethod_do(i, -1);
            localr.jdField_if(i, -1);
            localr.jdField_if(i, "");
            localr.jdField_if(i, false);
          }
        }
      else
        for (i = 0; i < localr.dY(); i++)
          a(localr, i);
      if (b < paramByte)
      {
        localr.mt = 8;
        localr.jdMethod_for(true);
      }
      else
      {
        localr.mt = 0;
        localr.jdMethod_for(false);
      }
      localr.dT().jdField_char(r.E(localr.ne[localr.ep()]));
    }
  }

  public static void a(byte paramByte)
  {
    for (byte b = 0; b < 3; b++)
    {
      r localr = (r)a5.es.cf().elementAt(b + 3);
      if (b < paramByte)
      {
        localr.mt = 8;
        localr.jdMethod_for(true);
      }
      else
      {
        localr.mt = 0;
        localr.jdMethod_for(false);
      }
    }
  }

  public final void jdField_else()
  {
    ay localay = (ay)a5.es.cf().elementAt(6);
    this.p = (byte)(localay.bm() + 1);
    this.jdField_else = new byte[this.p][8];
    this.F = new int[this.p][8];
    this.d = new short[this.p][8];
    this.n = new String[this.p][8];
    this.z = new byte[this.p][8];
    this.jdField_char = new boolean[this.p][8];
    for (int i = 0; i < this.p; i++)
    {
      r localr = (r)a5.es.cf().elementAt(i + 3);
      for (int j = 0; j < 8; j++)
      {
        this.jdField_else[i][j] = (byte)localr.A(j);
        this.F[i][j] = localr.G(j);
        this.d[i][j] = localr.mW[j];
        this.n[i][j] = localr.z(j);
        this.z[i][j] = localr.F(j);
        if (localr.A(j) == 1)
        {
          bp.ag();
          int k = bp.jdMethod_void(localr.G(j));
          bp.ag();
          this.jdField_char[i][j] = (bp.et[k] > 0L ? 1 : 0);
        }
        else
        {
          this.jdField_char[i][j] = localr.E(j);
        }
      }
    }
    if (this.jdField_try >= this.p)
      this.jdField_try = 0;
    a5.eQ.a(196633);
    jdMethod_goto();
  }

  public final void jdMethod_byte()
  {
    for (int i = 0; i < this.p; i++)
    {
      r localr = (r)a5.es.cf().elementAt(i + 3);
      for (int j = 0; j < localr.dY(); j++)
        a(localr, j);
    }
  }

  public static void a(r paramr, int paramInt)
  {
    paramr.jdField_if(paramInt, -1);
    paramr.jdField_if(paramInt, -1);
    paramr.jdMethod_do(paramInt, -1);
    paramr.jdField_if(paramInt, -1);
    paramr.jdField_if(paramInt, "");
  }

  public static void jdMethod_int()
  {
    a5.es.ht = 1;
    if (a5.fE.elementAt(1) == null)
    {
      b1.w(-1610612732);
      a5.fE.setElementAt(a5.es, 1);
    }
    else
    {
      (a5.es = (be)a5.fE.elementAt(1)).ck();
    }
    a5.d6.addElement(new Byte(0));
  }

  public static void a()
  {
    a5.es.ht = 2;
    if (a5.fE.elementAt(2) == null)
    {
      a5.fR = true;
      a5.dK = 2;
      a5.eQ.a(458761);
    }
    else
    {
      (a5.es = (be)a5.fE.elementAt(2)).ck();
    }
    a5.d6.addElement(new Byte(0));
  }

  public final void jdField_if()
  {
    this.p = 2;
    this.jdField_else = new byte[this.p][8];
    this.F = new int[this.p][8];
    this.d = new short[this.p][8];
    this.n = new String[this.p][8];
    this.z = new byte[this.p][8];
    this.jdField_char = new boolean[this.p][8];
    for (int i = 0; i < this.p; i++)
      for (j = 0; j < 8; j++)
        this.F[i][j] = -1;
    i = 0;
    this.jdField_else[0][0] = 1;
    this.F[0][0] = 0;
    this.d[0][0] = 1000;
    this.n[0][0] = "普通攻击";
    this.z[0][0] = 1;
    i++;
    for (int j = 0; j < bp.ag().aj(); j = (short)(j + 1))
    {
      bp.ag();
      int k;
      if ((k = bp.jdMethod_void(bp.ag().fG[j])) == -1)
        continue;
      this.jdField_else[0][i] = 1;
      bp.ag();
      this.F[0][i] = bp.fj[k];
      bp.ag();
      this.d[0][i] = bp.eD[k];
      bp.ag();
      this.n[0][i] = bp.eQ[k];
      this.z[0][i] = 1;
      i++;
      if (i >= 8)
        break;
    }
    a5.eQ.a(196633);
    b2.a();
    b2.jdField_try.jdMethod_goto();
  }

  public final void jdMethod_do()
  {
    int i = 65520;
    for (int j = 0; j < this.p; j++)
      for (int k = 0; k < 8; k++)
      {
        if (this.jdField_else[j][k] != 1)
          continue;
        for (int i1 = 0; i1 < bp.ag().aj(); i1 = (short)(i1 + 1))
        {
          if ((bp.ag().fG[i1] & i) != (this.F[j][k] & i))
            continue;
          bp.ag();
          i1 = bp.jdMethod_void(bp.ag().fG[i1]);
          bp.ag();
          this.F[j][k] = bp.fj[i1];
          bp.ag();
          this.z[j][k] = (byte)(bp.eD[i1] / 1000 - 1);
          bp.ag();
          this.n[j][k] = bp.eQ[i1];
          break;
        }
      }
    a5.eQ.a(196633);
    jdMethod_goto();
  }

  public final String jdMethod_case()
  {
    String str = this.p + "";
    for (int i = 0; i < this.p; i++)
      for (int j = 0; j < 8; j++)
        str = str + "," + this.F[i][j];
    return str;
  }

  public final void a(String paramString)
  {
    try
    {
      paramString = b5.a(paramString, ',');
      try
      {
        this.p = Byte.parseByte(paramString[0]);
      }
      catch (Exception localException1)
      {
        jdField_if();
        return;
      }
      if (this.p <= 0)
      {
        jdField_if();
        return;
      }
      this.p = Byte.parseByte(paramString[0]);
      this.jdField_else = new byte[this.p][8];
      this.F = new int[this.p][8];
      this.d = new short[this.p][8];
      this.n = new String[this.p][8];
      this.z = new byte[this.p][8];
      this.jdField_char = new boolean[this.p][8];
      if (this.p <= 0)
      {
        jdField_if();
        return;
      }
      int i = 0;
      int j = 1;
      for (int k = 0; k < this.p; k++)
        for (int i1 = 0; i1 < 8; i1++)
        {
          this.F[k][i1] = Integer.parseInt(paramString[j]);
          if (this.F[k][i1] < 0)
          {
            this.jdField_else[k][i1] = 0;
            this.d[k][i1] = -1;
            this.n[k][i1] = "";
            this.z[k][i1] = -1;
          }
          else if (paramString[j].length() <= 5)
          {
            this.jdField_else[k][i1] = 1;
            if (this.F[k][i1] == 0)
            {
              this.d[k][i1] = 1000;
              this.n[k][i1] = "普通攻击";
              this.z[k][i1] = 1;
            }
            else
            {
              bp.ag();
              int i2 = bp.jdMethod_void(this.F[k][i1]);
              bp.ag();
              this.d[k][i1] = bp.eD[i2];
              System.out.println(this.d[k][i1]);
              bp.ag();
              this.n[k][i1] = bp.eQ[i2];
              this.z[k][i1] = 1;
            }
          }
          else
          {
            this.jdField_else[k][i1] = 2;
            this.d[k][i1] = -1;
            this.n[k][i1] = "";
            this.z[k][i1] = -1;
            i = 1;
          }
          j++;
        }
      if (i != 0)
        a5.eQ.a(196634);
      jdMethod_goto();
      return;
    }
    catch (Exception localException2)
    {
      jdField_if();
    }
  }

  public final int[] jdMethod_new()
  {
    int[] arrayOfInt = new int[0];
    for (int i = 0; i < this.p; i++)
      for (int j = 0; j < 8; j++)
      {
        if (this.jdField_else[i][j] != 2)
          continue;
        arrayOfInt = b5.a(arrayOfInt, arrayOfInt.length, this.F[i][j]);
      }
    return arrayOfInt;
  }

  public final void a(int paramInt1, short paramShort, String paramString, byte paramByte, int paramInt2)
  {
    for (int i = 0; i < this.p; i++)
      for (int j = 0; j < 8; j++)
      {
        if (this.F[i][j] != paramInt1)
          continue;
        this.d[i][j] = paramShort;
        this.n[i][j] = paramString;
        this.z[i][j] = paramByte;
        this.jdField_char[i][j] = (paramInt2 != 0 ? 1 : 0);
      }
  }

  private static byte jdField_if(short paramShort)
  {
    return (byte)(paramShort / 1000 - 1);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     av
 * JD-Core Version:    0.6.0
 */
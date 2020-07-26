import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class r extends ba
{
  private byte nc = 0;
  private ah mA;
  private af na;
  private short mO;
  private short ms;
  private short nx = 8;
  public short mt = 16;
  public int[] mQ = null;
  public short[] mW = null;
  public short[] mI = null;
  public byte[] nu = null;
  public String[] mV = null;
  public byte[] ne = null;
  public short[] mM = null;
  public boolean[] m5 = null;
  public boolean[] nq = null;
  public byte[] nD = null;
  public int[] mN = null;
  public boolean[] nv = null;
  public byte[] nm = null;
  public byte[] mu = null;
  public byte[] mo = null;
  public byte[] mx = null;
  public boolean[] m4 = null;
  public boolean[] mZ = null;
  public boolean[] mS = null;
  public static int m3 = 0;
  public static byte mv = -1;
  public byte mz;
  public static byte mp;
  private byte nb = -1;
  private byte nA = -1;
  private short nz = 0;
  private boolean mw = true;
  private static byte m0 = 0;
  public static int mg = 0;
  private byte ng = 0;
  public int[] mF = { -1, -1 };
  public static boolean nf = false;
  private int me = 0;
  private int mc = 0;
  private int mT = 0;
  public static int m8 = -1;
  public static int ny = 0;
  public static byte nj = 0;
  public static byte[] mG = { -1, -1, -1, -1, -1, -1 };
  public static short[][] mE = { { -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 } };
  public static byte[] md = { 1, 1, 1, 1, 1, 1 };
  public static short[] mY = { -1, -1, -1, -1 };
  public static String m2 = "";
  private static short[] mj = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 33, 33, 25, 26, 27, 28, 28, 29, 30, 30, 31, 32, 33, 34, 35, 37, 36, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53 };

  public static byte dS()
  {
    return m0;
  }

  private void I(byte paramByte)
  {
    m0 = paramByte;
    b5.jdMethod_case("背包里第 " + this.mz + " 格 = " + m0);
  }

  public final void F(byte paramByte)
  {
    this.nc = paramByte;
  }

  public final byte el()
  {
    return this.ng;
  }

  public final void J(byte paramByte)
  {
    this.ng = paramByte;
  }

  private r(short paramShort1, short paramShort2, short paramShort3, short paramShort4, String paramString, short paramShort5, short paramShort6, short paramShort7, byte paramByte, be parambe)
  {
    super(paramShort1, paramShort2, 0, 0, parambe);
    paramShort4 = paramByte;
    paramShort3 = this;
    this.nc = paramShort4;
    this.k = (short)(a5.ic - (18 * a5.ic / 176 * paramShort7 + a5.ca.getWidth()) >> 1);
    this.b = true;
    this.mQ = new int[this.mt];
    this.mW = new short[this.mt];
    this.mI = new short[this.mt];
    this.nu = new byte[this.mt];
    this.mV = new String[this.mt];
    this.ne = new byte[this.mt];
    this.mM = new short[this.mt];
    this.m5 = new boolean[this.mt];
    this.nq = new boolean[this.mt];
    this.nD = new byte[this.mt];
    this.mN = new int[this.mt];
    this.nv = new boolean[this.mt];
    this.nm = new byte[this.mt];
    this.mu = new byte[this.mt];
    this.mo = new byte[this.mt];
    this.mx = new byte[this.mt];
    this.m4 = new boolean[this.mt];
    this.mZ = new boolean[this.mt];
    this.mS = new boolean[this.mt];
    for (paramShort3 = 0; paramShort3 < this.mt; paramShort3++)
    {
      byte tmp437_436 = -1;
      this.mI[paramShort3] = tmp437_436;
      this.mQ[paramShort3] = tmp437_436;
    }
    this.ms = paramShort5;
    this.mO = paramShort6;
    this.nx = paramShort7;
    if (paramShort1 < 0)
      paramShort1 = 8;
    this.a = (short)(d2() * a5.ic / 176);
    paramShort3 = this;
    this.jdField_int = (short)((this.mw ? (short)(ah.ad() + 2 + 18 * paramShort3.ms) : (short)(2 + 18 * paramShort3.ms)) * a5.il / 208);
    paramShort3 = (short)(d2() - 6);
    paramShort4 = (short)ah.ad();
    paramShort1 = (short)(paramShort1 + 3);
    paramShort2 = paramShort2;
    this.mA = new ah(paramShort1, paramShort2, paramShort3, paramShort4, 1, paramString, parambe);
    this.mA.a(false);
    jdMethod_do(parambe);
  }

  private void jdMethod_do(be parambe)
  {
    if (this.ms > 2)
    {
      if (this.mw)
      {
        this.na = new af((short)(this.k + 18 * a5.ic / 176 * this.nx), (short)(this.j + ah.ad() + 2), 0, (short)(18 * a5.il / 208 * this.ms - 2 * a5.il / 208), 0, false, parambe);
      }
      else
      {
        this.na = new af((short)(this.k + 18 * a5.ic / 176 * this.nx), (short)(this.j + 2), 0, (short)(18 * a5.il / 208 * this.ms - 2 * a5.il / 208), 0, false, parambe);
        return;
      }
    }
    else
      this.na = null;
  }

  public r(short paramShort1, short paramShort2, String paramString, short paramShort3, short paramShort4, short paramShort5, byte paramByte, be parambe)
  {
    this(paramShort1, paramShort2, 0, 0, paramString, paramShort3, paramShort4, paramShort5, 0, parambe);
  }

  public final void a(Graphics paramGraphics)
  {
    if (this.mV.length > 0)
    {
      i = this.mz / this.nx;
      this.mz = (byte)(i * this.nx + this.jdField_new.hD);
      if (q())
        d(this.mV[this.mz]);
      else
        d("");
    }
    if (this.mw)
      this.mT = (this.j + ah.ad() + 2);
    else
      this.mT = (this.j + 2);
    int i = this.mt % this.nx == 0 ? this.mt / this.nx : this.mt / this.nx + 1;
    if ((i = this.nz + this.ms > i ? i : this.nz + this.ms) < this.ms)
      i = this.ms;
    int j = 18 * a5.ic / 176;
    int k = 18 * a5.il / 208;
    int m = this.ms <= 2 ? 1 : 0;
    for (int n = this.nz; n < i; n++)
      for (int i1 = 0; i1 < this.nx; i1++)
      {
        if (n * this.nx + i1 + 1 <= this.mt)
        {
          a7.jdMethod_if(paramGraphics, this.k + (m != 0 ? 5 : 0) + i1 * j, this.mT + (n - this.nz) * k, 14, 14);
          if ((this.mI != null) && (this.mI[(n * this.nx + i1)] != -1))
          {
            paramGraphics.setColor(bm.O[this.mo[(n * this.nx + i1)]][0]);
            paramGraphics.fillRect(this.k + (m != 0 ? 5 : 0) + i1 * j, this.mT + (n - this.nz) * k, 16, 16);
            a5.gg.jdMethod_if(paramGraphics, this.k + (m != 0 ? 5 : 0) + i1 * j + 1, this.mT + (n - this.nz) * k + 1, this.mI[(n * this.nx + i1)]);
            paramGraphics.setColor(bm.O[this.mo[(n * this.nx + i1)]][1]);
            paramGraphics.drawRect(this.k + (m != 0 ? 5 : 0) + i1 * j, this.mT + (n - this.nz) * k, 15, 15);
            if ((this.nu != null) && (this.nu[(n * this.nx + i1)] != -1) && (this.nv[(n * this.nx + i1)] != 0))
              a7.a(paramGraphics, this.k + (m != 0 ? 5 : 0) + i1 * j, this.mT + (n - this.nz) * k, this.nu[(n * this.nx + i1)]);
            if (this.m4[(n * this.nx + i1)] != 0)
              paramGraphics.drawImage(a5.fT, this.k + (m != 0 ? 5 : 0) + i1 * j + 1, this.mT + (n - this.nz) * k + 1, 20);
          }
          if (this.mZ[(n * this.nx + i1)] != 0)
            paramGraphics.drawImage(a5.fz, this.k + (m != 0 ? 5 : 0) + i1 * j, this.mT + (n - this.nz) * k, 20);
          if (a5.es.g9 == -1610612734)
            a5.cG.jdMethod_if(paramGraphics, this.k + (m != 0 ? 5 : 0) + i1 * j, this.mT + (n - this.nz) * k, i1 + 1);
        }
        else
        {
          paramGraphics.drawImage(a5.e3, this.k + (m != 0 ? 5 : 0) + i1 * j, this.mT + (n - this.nz) * k, 20);
        }
        if (this.mF[0] != -1)
        {
          r localr = this;
          if (this.mF[0] / this.nx >= this.nz)
          {
            localr = this;
            if (this.mF[0] / this.nx - this.nz < this.ms)
              b5.jdMethod_int(paramGraphics, this.k + (m != 0 ? 5 : 0) + this.mF[0] % this.nx * j, this.mT + (this.mF[0] / this.nx - this.nz) * k, 16, 16);
          }
        }
        int i2;
        int i3;
        switch (a5.es.g9)
        {
        case 1376263:
          i2 = 0;
          i3 = mG.length;
          while (i2 < i3)
          {
            if (mG[i2] != -1)
              b5.jdMethod_int(paramGraphics, this.k + mG[i2] % this.nx * j, this.mT + (mG[i2] / this.nx - this.nz) * k, 16, 16);
            i2++;
          }
          break;
        case 1703946:
          i2 = 0;
          i3 = mE.length;
          while (i2 < i3)
          {
            if (mE[i2][0] != -1)
              b5.jdMethod_int(paramGraphics, this.k + mE[i2][0] % this.nx * j, this.mT + (mE[i2][0] / this.nx - this.nz) * k, 16, 16);
            i2++;
          }
          break;
        case 458760:
        case 2555911:
          if ((this.nb == -1) || (this.nA == -1) || (n * this.nx + i1 < this.nb) || (n * this.nx + i1 >= this.nA))
            break;
          b5.jdMethod_int(paramGraphics, this.k + i1 * j, this.mT + (n - this.nz) * k, 16, 16);
        }
        if (n * this.nx + i1 != this.mz)
          continue;
        if ((this.mA != null) && (this.mw))
          this.mA.a(paramGraphics);
        this.me = n;
        this.mc = i1;
      }
    if (this.na != null)
      this.na.a(paramGraphics);
  }

  public final void p(Graphics paramGraphics)
  {
    if (this.me * this.nx + this.mc == this.mz)
      b5.a(paramGraphics, this.k + this.mc * 18 * a5.ic / 176 + 10, this.mT + (this.me - this.nz) * 18 * a5.il / 208 + 12);
  }

  public final ah dT()
  {
    return this.mA;
  }

  public final short dY()
  {
    return this.mt;
  }

  public final void l(short paramShort)
  {
    if (paramShort > this.mt)
    {
      this.mt = paramShort;
      int[] arrayOfInt1 = this.mQ;
      short[] arrayOfShort1 = this.mI;
      byte[] arrayOfByte1 = this.nu;
      String[] arrayOfString = this.mV;
      byte[] arrayOfByte2 = this.ne;
      short[] arrayOfShort2 = this.mM;
      boolean[] arrayOfBoolean1 = this.m5;
      boolean[] arrayOfBoolean2 = this.nq;
      byte[] arrayOfByte3 = this.nD;
      int[] arrayOfInt2 = this.mN;
      boolean[] arrayOfBoolean3 = this.nv;
      byte[] arrayOfByte4 = this.nm;
      byte[] arrayOfByte5 = this.mu;
      byte[] arrayOfByte6 = this.mo;
      byte[] arrayOfByte7 = this.mx;
      boolean[] arrayOfBoolean4 = this.m4;
      boolean[] arrayOfBoolean5 = this.mS;
      boolean[] arrayOfBoolean6 = this.mZ;
      this.mQ = new int[paramShort];
      this.mW = new short[paramShort];
      this.mI = new short[paramShort];
      this.nu = new byte[paramShort];
      this.mV = new String[paramShort];
      this.ne = new byte[paramShort];
      this.mM = new short[paramShort];
      this.m5 = new boolean[paramShort];
      this.nq = new boolean[paramShort];
      this.nD = new byte[paramShort];
      this.mN = new int[paramShort];
      this.nv = new boolean[paramShort];
      this.nm = new byte[paramShort];
      this.mu = new byte[paramShort];
      this.mo = new byte[paramShort];
      this.mx = new byte[paramShort];
      this.m4 = new boolean[paramShort];
      this.mS = new boolean[paramShort];
      this.mZ = new boolean[paramShort];
      System.arraycopy(arrayOfInt1, 0, this.mQ, 0, arrayOfInt1.length);
      System.arraycopy(arrayOfShort1, 0, this.mI, 0, arrayOfShort1.length);
      System.arraycopy(arrayOfByte1, 0, this.nu, 0, arrayOfByte1.length);
      System.arraycopy(arrayOfString, 0, this.mV, 0, arrayOfString.length);
      System.arraycopy(arrayOfByte2, 0, this.ne, 0, arrayOfByte2.length);
      System.arraycopy(arrayOfShort2, 0, this.mM, 0, arrayOfShort2.length);
      System.arraycopy(arrayOfBoolean1, 0, this.m5, 0, arrayOfBoolean1.length);
      System.arraycopy(arrayOfBoolean2, 0, this.nq, 0, arrayOfBoolean2.length);
      System.arraycopy(arrayOfByte3, 0, this.nD, 0, arrayOfByte3.length);
      System.arraycopy(arrayOfInt2, 0, this.mN, 0, arrayOfInt2.length);
      System.arraycopy(arrayOfBoolean3, 0, this.nv, 0, arrayOfBoolean3.length);
      System.arraycopy(arrayOfByte4, 0, this.nm, 0, arrayOfByte4.length);
      System.arraycopy(arrayOfByte5, 0, this.mu, 0, arrayOfByte5.length);
      System.arraycopy(arrayOfByte6, 0, this.mo, 0, arrayOfByte6.length);
      System.arraycopy(arrayOfByte7, 0, this.mx, 0, arrayOfByte7.length);
      System.arraycopy(arrayOfBoolean4, 0, this.m4, 0, arrayOfBoolean4.length);
      System.arraycopy(arrayOfBoolean5, 0, this.mS, 0, arrayOfBoolean5.length);
      System.arraycopy(arrayOfBoolean6, 0, this.mZ, 0, arrayOfBoolean6.length);
    }
  }

  public final void j(short paramShort)
  {
    this.mt = paramShort;
    this.mQ = new int[paramShort];
    this.mW = new short[paramShort];
    this.mI = new short[paramShort];
    this.nu = new byte[paramShort];
    this.mV = new String[paramShort];
    this.ne = new byte[paramShort];
    this.mM = new short[paramShort];
    this.m5 = new boolean[paramShort];
    this.nq = new boolean[paramShort];
    this.nD = new byte[paramShort];
    this.mN = new int[paramShort];
    this.nv = new boolean[paramShort];
    this.nm = new byte[paramShort];
    this.mu = new byte[paramShort];
    this.mo = new byte[paramShort];
    this.mx = new byte[paramShort];
    this.m4 = new boolean[paramShort];
    this.mS = new boolean[paramShort];
    this.mZ = new boolean[paramShort];
  }

  public final void jdMethod_do(int paramInt, short paramShort)
  {
    if ((paramInt < 0) || (paramInt > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    this.mI[paramInt] = k(paramShort);
  }

  public final void a(int paramInt, byte paramByte)
  {
    if ((paramInt < 0) || (paramInt > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    this.ne[paramInt] = paramByte;
  }

  public final byte F(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    return this.ne[paramInt];
  }

  public final void jdMethod_if(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    this.mQ[paramInt1] = paramInt2;
  }

  public final int G(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    return this.mQ[paramInt];
  }

  public final void jdMethod_if(int paramInt, short paramShort)
  {
    if ((paramInt < 0) || (paramInt > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    this.mM[paramInt] = paramShort;
  }

  public final boolean E(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    return this.m4[paramInt];
  }

  public final void jdMethod_if(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    this.m4[paramInt] = paramBoolean;
  }

  public final short A(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    return this.mM[paramInt];
  }

  public final void jdMethod_if(int paramInt, String paramString)
  {
    if ((paramInt < 0) || (paramInt > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    this.mV[paramInt] = paramString;
  }

  public final String z(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    return this.mV[paramInt];
  }

  public final void jdMethod_if(int paramInt, byte paramByte)
  {
    if ((paramInt < 0) || (paramInt > this.mt - 1))
      throw new IndexOutOfBoundsException("设定值超出范围！");
    this.mo[paramInt] = paramByte;
  }

  private short d2()
  {
    return (short)(18 * this.nx + a5.ca.getWidth());
  }

  public final void jdMethod_if(String paramString, int paramInt)
  {
    if (this.mA != null)
    {
      this.mA.jdMethod_char(paramInt);
      this.mA.a(paramString);
    }
  }

  private void d(String paramString)
  {
    if (this.mA != null)
      this.mA.a(paramString);
  }

  public final short ep()
  {
    return (short)this.mz;
  }

  public final void K(byte paramByte)
  {
    int i = paramByte;
    r localr = this;
    b5.for$505cff1c("当前格越界");
    if (((i < 0) || (i > localr.mt - 1) ? 1 : 0) != 0)
      return;
    this.mz = paramByte;
    mp = this.mz;
    b5.jdMethod_case("======当前背包格子索引 = " + this.mz);
  }

  private void G(byte paramByte)
  {
    be localbe = (be)a5.fE.elementAt(0);
    Object localObject2;
    for (int i = 0; i < 3; localObject2++)
    {
      r localr;
      if (!(localr = (r)localbe.cf().elementAt(i + 3)).q())
        continue;
      Object localObject1;
      int j = (short)(localObject1 = localr).mz;
      localr.mQ[j] = this.mQ[this.mz];
      localr.mW[j] = this.mW[this.mz];
      localr.mI[j] = this.mI[this.mz];
      localr.ne[j] = this.ne[this.mz];
      localr.mV[j] = this.mV[this.mz];
      localr.mM[j] = (short)paramByte;
      localr.mo[j] = this.mo[this.mz];
      localr.m4[j] = this.m4[this.mz];
      localr.d(localr.mV[j]);
      (localObject2 = localr).mA.jdMethod_char(E(localr.ne[(short)(localObject2 = localr).mz]));
      break;
    }
    a5.es = localbe;
  }

  public final boolean b()
  {
    if (a5.gZ)
    {
      if ((this.na != null) && (this.na.b()))
        return true;
      if (this.mw)
        this.mT = (this.j + ah.ad() + 2);
      else
        this.mT = (this.j + 2);
      int i = this.mt % this.nx == 0 ? this.mt / this.nx : this.mt / this.nx + 1;
      if ((i = this.nz + this.ms > i ? i : this.nz + this.ms) < this.ms)
        i = this.ms;
      int j = 18 * a5.ic / 176;
      int k = 18 * a5.il / 208;
      int m = this.ms <= 2 ? 1 : 0;
      for (int n = this.nz; n < i; n++)
        for (int i1 = 0; i1 < this.nx; i1++)
        {
          if (!a5.a(this.k + (m != 0 ? 5 : 0) + i1 * j, this.mT + (n - this.nz) * k, 18, 18))
            continue;
          if ((i = n * this.nx + i1) >= this.mt)
            i = this.mt - 1;
          if (this.mz == i)
            return false;
          K((byte)i);
          a5.es.hD = (byte)(this.mz % this.nx);
          dV();
          if ((a5.es.g9 == 2424994) || (a5.es.g9 == 2425072))
          {
            ah localah = (ah)a5.es.cf().elementAt(6);
            if (bo.q != 3)
            {
              localah.jdMethod_case(bo.G[this.mz]);
            }
            else
            {
              localah.a(0);
              localah.a(bo.P[this.mz]);
            }
          }
          return true;
        }
    }
    return true;
  }

  private void dV()
  {
    Object localObject = this;
    if (this.ng != 5)
    {
      localObject = this;
      if (this.ng != 10)
      {
        localObject = this;
        if (this.ng != 11)
        {
          localObject = this;
          if (this.ng != 12)
          {
            localObject = this;
            if (this.ng != 13)
            {
              localObject = this;
              if (this.ng != 14)
              {
                localObject = this;
                if (this.ng != 19)
                {
                  localObject = this;
                  if (this.ng != 20)
                  {
                    localObject = this;
                    if (this.ng != 18)
                      break label142;
                  }
                }
              }
            }
          }
        }
      }
    }
    localObject = (ao)a5.es.cf().elementAt(1);
    if (this.mQ[this.mz] != -1)
      ((ao)localObject).a("操作", 0);
    else
      ((ao)localObject).a("", 0);
    label142: this.mA.a(this.mV[this.mz]);
    this.mA.jdMethod_char(E(this.ne[this.mz]));
    switch (a5.es.g9)
    {
    case -1610612733:
    case -1610612732:
    case -1610612620:
    case -1610612618:
      d1();
    }
    ba.g();
  }

  public final void f()
  {
    if (this.jdField_byte)
    {
      s();
      return;
    }
    int i4;
    if (a5.jdMethod_try(4096))
    {
      int i = this.mz / this.nx - 1;
      int n = this.mz = (byte)(i * this.nx + a5.es.hD);
      if (this.mz < 0)
      {
        i++;
        this.mz = (byte)(i * this.nx + a5.es.hD);
      }
      Object localObject1;
      if (n < 0)
      {
        if (a5.es.g9 == 3342341)
          return;
        if ((localObject1 = jdMethod_if(a5.es, 0)) != this)
        {
          if (a5.es.g9 == 1966097)
            au.char = -1;
          else if (a5.es.g9 == 2228225)
            aj.goto = -1;
          else if ((a5.es.g9 == 2031621) || (a5.es.g9 == 2031636))
            aq.for = -1;
          a(false, a5.es);
          ((ba)localObject1).a(true, a5.es);
          if ((localObject1 instanceof r))
          {
            r localr;
            byte b;
            if ((b = (byte)((i4 = (localObject5 = localr = (r)localObject1).mt / (localObject5 = localr).nx + 1) * (localObject5 = localr).nx - 1 - ((localObject5 = localr).nx - 1 - a5.es.hD))) >= (localObject5 = localr).mt)
            {
              if (((b = (byte)((i4 - 1) * (localObject5 = localr).nx - 1 - ((localObject5 = localr).nx - 1 - a5.es.hD))) >= (localObject5 = localr).mt) || (b < 0))
              {
                a(true, a5.es);
                ((ba)localObject1).a(false, a5.es);
              }
              else
              {
                localr.K(b);
                (localObject5 = localr).mA.jdMethod_char(E(localr.ne[localr.mz]));
              }
            }
            else
            {
              localr.K(b);
              (localObject5 = localr).mA.jdMethod_char(E(localr.ne[localr.mz]));
            }
          }
        }
      }
      ee();
      if ((a5.es.g9 == 2424994) || (a5.es.g9 == 2425072))
      {
        localObject1 = (ah)a5.es.cf().elementAt(6);
        if (bo.q != 3)
        {
          ((ah)localObject1).jdMethod_case(bo.G[this.mz]);
        }
        else
        {
          ((ah)localObject1).a(0);
          ((ah)localObject1).a(bo.P[this.mz]);
        }
      }
      dV();
      if (a5.es.g9 == 3342341)
      {
        localObject1 = (ao)a5.es.cf().elementAt(1);
        if (this.mQ[this.mz] != -1)
        {
          ((ao)localObject1).a("使用", 0);
          break label2314;
        }
        ((ao)localObject1).a("", 0);
      }
    }
    else
    {
      Object localObject4;
      if (a5.jdMethod_try(8192))
      {
        int j = this.mz / this.nx + 1;
        int i1 = this.mz = (byte)(j * this.nx + a5.es.hD);
        if (this.mz >= this.mt)
        {
          j--;
          this.mz = (byte)(j * this.nx + a5.es.hD);
        }
        Object localObject2;
        if ((i1 >= this.mt) && ((localObject2 = jdMethod_if(a5.es, 1)) != this))
        {
          a(false, a5.es);
          ((ba)localObject2).a(true, a5.es);
          if ((localObject2 instanceof r))
          {
            localObject4 = (r)localObject2;
            if ((i4 = a5.es.hD) >= (localObject5 = localObject4).mt)
            {
              a(true, a5.es);
              ((ba)localObject2).a(false, a5.es);
            }
            else
            {
              ((r)localObject4).K(i4);
            }
            (localObject5 = localObject4).mA.jdMethod_char(E(localObject4.ne[localObject4.mz]));
          }
        }
        ea();
        if ((a5.es.g9 == 2424994) || (a5.es.g9 == 2425072))
        {
          localObject2 = (ah)a5.es.cf().elementAt(6);
          if (bo.q != 3)
          {
            ((ah)localObject2).jdMethod_case(bo.G[this.mz]);
          }
          else
          {
            ((ah)localObject2).a(0);
            ((ah)localObject2).a(bo.P[this.mz]);
          }
        }
        dV();
        if (a5.es.g9 == 3342341)
        {
          localObject2 = (ao)a5.es.cf().elementAt(1);
          if (this.mQ[this.mz] != -1)
          {
            ((ao)localObject2).a("使用", 0);
            break label2314;
          }
          ((ao)localObject2).a("", 0);
        }
      }
      else
      {
        int k;
        if (a5.jdMethod_try(16384))
        {
          k = this.mz / this.nx;
          be tmp881_878 = a5.es;
          tmp881_878.hD = (byte)(tmp881_878.hD - 1);
          if (a5.es.hD < 0)
          {
            if (k == 0)
              a5.es.hD = 0;
            else
              a5.es.hD = (byte)(this.nx - 1);
            k--;
            if (k < 0)
              k = 0;
          }
          this.mz = (byte)(k * this.nx + a5.es.hD);
          ee();
          if ((a5.es.g9 == 2424994) || (a5.es.g9 == 2425072))
          {
            localObject4 = (ah)a5.es.cf().elementAt(6);
            if (bo.q != 3)
            {
              ((ah)localObject4).jdMethod_case(bo.G[this.mz]);
            }
            else
            {
              ((ah)localObject4).a(0);
              ((ah)localObject4).a(bo.P[this.mz]);
            }
          }
          dV();
          if (a5.es.g9 == 3342341)
          {
            localObject4 = (ao)a5.es.cf().elementAt(1);
            if (this.mQ[this.mz] != -1)
            {
              ((ao)localObject4).a("使用", 0);
              break label2314;
            }
            ((ao)localObject4).a("", 0);
          }
        }
        else if (a5.jdMethod_try(32768))
        {
          k = this.mz / this.nx;
          be tmp1117_1114 = a5.es;
          tmp1117_1114.hD = (byte)(tmp1117_1114.hD + 1);
          if (a5.es.hD >= this.nx)
          {
            if (k >= this.mO - 1)
              a5.es.hD = (byte)(this.nx - 1);
            else
              a5.es.hD = 0;
            k++;
            if (k >= this.mO)
              k = this.mO - 1;
          }
          this.mz = (byte)(k * this.nx + a5.es.hD);
          if (this.mz >= this.mt)
          {
            this.mz = (byte)(this.mt - 1);
            a5.es.hD = (byte)(this.mz % this.nx);
          }
          ea();
          if ((a5.es.g9 == 2424994) || (a5.es.g9 == 2425072))
          {
            localObject4 = (ah)a5.es.cf().elementAt(6);
            if (bo.q != 3)
            {
              ((ah)localObject4).jdMethod_case(bo.G[this.mz]);
            }
            else
            {
              ((ah)localObject4).a(0);
              ((ah)localObject4).a(bo.P[this.mz]);
            }
          }
          dV();
          if (a5.es.g9 == 3342341)
          {
            localObject4 = (ao)a5.es.cf().elementAt(1);
            if (this.mQ[this.mz] != -1)
            {
              ((ao)localObject4).a("使用", 0);
              break label2314;
            }
            ((ao)localObject4).a("", 0);
          }
        }
        else
        {
          Object localObject3;
          int i2;
          if (a5.jdMethod_byte(196608))
          {
            localObject5 = this;
            switch (this.nc)
            {
            case 0:
              if (this.mZ[this.mz] != 0)
                break;
              eb();
              break;
            case 1:
              if (a5.es.g9 == -1610612732)
              {
                a5.d6.removeElementAt(a5.d6.size() - 1);
                G(1);
                a5.es.ht = 0;
                a5.es.ck();
              }
              else
              {
                if ((a5.es.g9 != -1610612620) && (a5.es.g9 != -1610612618))
                  break;
                if (a5.es.g9 == -1610612620)
                  aa.goto[aa.case] = this.mQ[this.mz];
                else if (a5.es.g9 == -1610612618)
                  aa.try[aa.case] = this.mQ[this.mz];
                be.ci();
                (localObject3 = (a7)a5.es.cf().elementAt(aa.case + 3)).a(false, 1);
                ((a7)localObject3).fC = this.mo[this.mz];
                i2 = this.mI[this.mz];
                ((a7)localObject3).ft = true;
                ((a7)localObject3).jdMethod_if(i2, false);
                ((a7)localObject3).a(a5.gg);
                if (a5.d6.size() <= 0)
                  break;
                a5.d6.removeElementAt(a5.d6.size() - 1);
              }
            }
            switch (a5.es.g9)
            {
            case 458773:
              if (be.gu.B.length() + 4 >= 30)
              {
                as.a(5, "您输入的聊天字数已达上限！", "确定", "", -1, -2);
              }
              else
              {
                a3 tmp1734_1731 = be.gu;
                tmp1734_1731.B = (tmp1734_1731.B + "[b" + (this.mz + 1) + "]");
                be.gu.jdMethod_if(false);
              }
            }
            ba.g();
          }
          else if (a5.jdMethod_byte(2048))
          {
            localObject5 = this;
            switch (this.nc)
            {
            case 1:
              if ((localObject3 = (ak)a5.es.cf().elementAt(4)) == null)
                break;
              ((ak)localObject3).jdMethod_new(1);
              a(false, a5.es);
              ((ba)localObject3).a(true, a5.es);
            }
            switch (a5.es.g9)
            {
            case 1376263:
              a5.eQ.a(1376261);
              break;
            case 1703946:
              d5();
              break;
            case -1610612734:
              av.a();
            }
            ba.g();
          }
          else if (a5.jdMethod_byte(1024))
          {
            int m;
            int i3;
            switch (a5.es.g9)
            {
            case 1376263:
              d7();
              break;
            case 1703946:
              if (this.mQ[this.mz] == -1)
              {
                b5.jdMethod_case("无物品");
                return;
              }
              if ((this.mQ[this.mz] != -1) && (this.nq[this.mz] == 0))
              {
                as.a(0, "此物品不可邮寄", "确定", "", -1, -2);
                return;
              }
              m = 0;
              for (i2 = 0; i2 < mE.length; i2++)
              {
                if (mE[i2][0] != this.mz)
                  continue;
                m = 1;
                break;
              }
              i3 = 0;
            case -1610612734:
              while (true)
              {
                if (i3 < mE.length)
                  if (mE[i3][0] == this.mz)
                  {
                    mE[i3][0] = -1;
                    mE[i3][1] = -1;
                    mE[i3][2] = -1;
                    mE[i3][3] = -1;
                    if (q.j > 0)
                    {
                      q.j = (byte)(q.j - 1);
                      break;
                    }
                  }
                  else if ((mE[i3][0] == -1) && (m == 0))
                  {
                    if (q.j < mE.length)
                      q.j = (byte)(q.j + 1);
                    mE[i3][0] = (short)this.mz;
                    mE[i3][1] = this.mI[this.mz];
                    mE[i3][2] = (short)this.mo[this.mz];
                    mE[i3][3] = (short)this.nu[this.mz];
                    if ((this.nv[this.mz] == 1) && (this.nu[this.mz] > 1))
                    {
                      as.cH = this.nu[this.mz];
                      as.a(1, "物品数量:", "确定", "返回", -1, -1, i3, this.mz);
                      break;
                    }
                  }
                  else
                  {
                    i3++;
                    continue;
                  }
                break;
                av.jdMethod_int();
              }
            }
            ba.g();
          }
        }
      }
    }
    label2314: Object localObject5 = this;
    if (this.na != null)
    {
      localObject5 = this;
      this.na.a((short)(this.mz / this.nx), true);
    }
  }

  private void s()
  {
    if (a5.jdMethod_try(4096))
    {
      y().c8();
      return;
    }
    if (a5.jdMethod_try(8192))
    {
      y().c9();
      return;
    }
    if (a5.jdMethod_byte(196608))
    {
      y().dc();
      mp = this.mz;
      int j;
      switch (this.r)
      {
      case 6:
        int i;
        switch (el())
        {
        case 0:
          switch (a5.es.g9)
          {
          case 458761:
            if ((i = ((Integer)y().db().elementAt(y().de())).intValue()) != -1)
              switch (i)
              {
              case 0:
                if (this.mM[this.mz] == 1)
                {
                  b5.jdMethod_case("1111111111111111111111111111");
                  a5.d6.removeElementAt(a5.d6.size() - 1);
                  G(2);
                  a5.es.ht = 0;
                  a5.es.ck();
                }
                else
                {
                  b5.jdMethod_case("22222222222222222222222");
                }
                break;
              case 458753:
                a5.eQ.a(458753);
              }
            this.jdField_byte = false;
            break;
          case -1610612734:
            if ((i = ((Integer)y().db().elementAt(y().de())).intValue()) != -1)
              switch (i)
              {
              case -268435449:
                b1.dM();
                break;
              case -268435451:
                av.jdMethod_int();
                break;
              case -268435450:
                av.a();
                break;
              case -268435455:
                b2.a();
                av.a(this, this.mz);
                break;
              case -268435454:
                b2.a();
                b2.try.jdMethod_byte();
                break;
              case -268435453:
                switch (this.mM[this.mz])
                {
                case 1:
                  bp.ag();
                  bv.a(-1610612730, bp.jdMethod_void(this.mQ[this.mz]));
                  break;
                case 2:
                  av.g = this.mQ[this.mz];
                  a5.eQ.a(458762);
                }
              case -268435452:
              }
            this.jdField_byte = false;
            break;
          case 1966082:
            i = ((Integer)y().db().elementAt(y().de())).intValue();
            au.try = this.mz;
            a5.eQ.a(i);
            this.jdField_byte = false;
            break;
          default:
            if (this.mQ[this.mz] != -1)
            {
              i = ((Integer)y().db().elementAt(y().de())).intValue();
              if (am.void)
              {
                a5.eQ.a(i);
                this.jdField_byte = false;
                return;
              }
              switch (i)
              {
              case 458753:
                if (((r.m3 = this.mQ[this.mz]) / 10000 >= 101) && (m3 / 10000 <= 120))
                {
                  mv = this.mz;
                  au.case = 0;
                  au.a = 1;
                }
                else
                {
                  mv = -1;
                  au.a = 0;
                  au.case = 0;
                }
                a5.eQ.a(i);
                this.jdField_byte = false;
                break;
              case 458754:
                if (((this.mQ[this.mz] / 10000 >= 1011) && (this.mQ[this.mz] / 10000 <= 1016)) || (this.mQ[this.mz] / 10000 == 1027))
                {
                  au.try = this.mz;
                  au.case = 0;
                  au.a = 0;
                }
                else if (this.mQ[this.mz] / 10000 == 1204)
                {
                  bx.if = this.mz;
                }
                else
                {
                  au.try = -1;
                  au.case = 0;
                  au.a = 0;
                }
                nj = this.mz;
                break;
              case 458755:
                au.a = 0;
                a5.eQ.a(i);
                I(this.mx[this.mz]);
                this.jdField_byte = false;
                break;
              case 458756:
                if (this.mF[0] == -1)
                {
                  at.int[0] = this.mz;
                  this.mF[0] = this.mz;
                }
                this.jdField_byte = false;
                break;
              case 1245185:
                be.a(0, this.mz);
                this.jdField_byte = false;
                break;
              case 458758:
                a5.eQ.a(i);
                this.jdField_byte = false;
                break;
              case 458759:
                a5.gQ = new as(0, null);
                m8 = this.mz;
                a5.gQ.a(5, bm.dt, "确定丢掉此物品吗？", bm.a2[2], bm.a2[3], i, -1);
                this.jdField_byte = false;
                break;
              case 3342337:
                a5.eQ.a(i);
                this.jdField_byte = false;
              }
            }
            else
            {
              a5.eQ.a(458758);
              this.jdField_byte = false;
            }
          }
          break;
        case 8:
          if (this.mQ[this.mz] != -1)
          {
            switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
            {
            case 458755:
              I(this.mx[this.mz]);
              switch (m0)
              {
              case 1:
              case 2:
              case 3:
                be.cx();
                break;
              default:
                a5.eQ.a(i);
              }
              this.jdField_byte = false;
              break;
            case 458753:
              if ((this.mQ[this.mz] / 10000 >= 101) && (this.mQ[this.mz] / 10000 <= 120))
              {
                m3 = this.mQ[this.mz];
                mv = this.mz;
                au.case = 0;
              }
              else
              {
                mv = -1;
                m3 = 0;
                au.case = 0;
              }
              a5.eQ.a(i);
              this.jdField_byte = false;
              break;
            case 458757:
              be.a(0, this.mz);
              this.jdField_byte = false;
              break;
            case 917510:
              a5.eQ.a(i);
              this.jdField_byte = false;
              break;
            case 917511:
              a5.gQ = new as(0, null);
              m8 = this.mz;
              a5.gQ.a(5, bm.dt, "确定丢掉此物品吗？", bm.a2[2], bm.a2[3], i, -1);
              this.jdField_byte = false;
              break;
            case 2031636:
              nf = true;
              aq.a = this.mz;
            case 3342337:
              a5.eQ.a(i);
              this.jdField_byte = false;
            default:
              break;
            }
          }
          else
          {
            a5.eQ.a(917510);
            this.jdField_byte = false;
          }
          break;
        case 1:
          if (this.mQ[this.mz] != -1)
          {
            switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
            {
            case 983043:
              if (this.nv[this.mz] == 0)
              {
                as.c4 = 1;
                if ((this.ne[this.mz] == 4) || (this.ne[this.mz] == 5) || (this.ne[this.mz] == 6))
                  as.a(0, "你是否确定要卖掉" + this.mV[this.mz], "确定", "取消", i, -18);
                else
                  a5.eQ.a(i);
              }
              else if (this.nu[this.mz] == 1)
              {
                as.c4 = 1;
                a5.eQ.a(i);
              }
              else
              {
                as.cH = this.nu[this.mz];
                as.a(1, "卖出数量：", "确定", "取消", i, -1);
                a5.gQ.jdMethod_goto(this.nu[this.mz]);
              }
              this.jdField_byte = false;
              break;
            case 458753:
              a5.eQ.a(i);
              this.jdField_byte = false;
              break;
            case 1245185:
              be.a(0, this.mz);
              this.jdField_byte = false;
              break;
            case 983044:
              a5.eQ.a(i);
              this.jdField_byte = false;
              break;
            case 983045:
              a5.gQ = new as(0, null);
              m8 = this.mz;
              a5.gQ.a(5, bm.dt, "确定丢掉此物品吗？", bm.a2[2], bm.a2[3], i, -1);
              this.jdField_byte = false;
              break;
            case 983201:
              a5.eQ.a(i);
              this.jdField_byte = false;
              break;
            case 3342337:
              am.a = false;
              a5.eQ.a(i);
              this.jdField_byte = false;
            default:
              break;
            }
          }
          else
          {
            a5.eQ.a(983044);
            this.jdField_byte = false;
          }
          break;
        case 2:
          if (this.mQ[this.mz] != -1)
            switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
            {
            case 458753:
              a5.eQ.a(i);
              this.jdField_byte = false;
              break;
            case 1245185:
              be.a(0, this.mz);
              this.jdField_byte = false;
              break;
            case 1179657:
              a5.eQ.a(i);
              this.jdField_byte = false;
              break;
            case 1179651:
              if (this.nu[this.mz] == 1)
              {
                bs.if = 1;
                a5.eQ.a(i);
              }
              else
              {
                as.cH = this.nu[this.mz];
                as.a(1, "请输入存入物品的个数：", "确定", "取消", i, -1);
                a5.gQ.jdMethod_goto(this.nu[this.mz]);
              }
              this.jdField_byte = false;
              break;
            case 1179652:
              int k = 0;
              ah localah3 = (ah)a5.es.cf().elementAt(10);
              try
              {
                ny = localah3.ag();
              }
              catch (NumberFormatException localNumberFormatException1)
              {
                ny = 0;
              }
              as.cH = ny;
              as.a(1, "存入金额：", "确定", "取消", i, -1);
              this.jdField_byte = false;
              break;
            case 1179658:
              a5.eQ.a(i);
              this.jdField_byte = false;
              break;
            case 1179656:
              bs.a = 1;
              if (this.mF[0] == -1)
              {
                at.int[0] = this.mz;
                this.mF[0] = this.mz;
                bs.jdMethod_if(false);
              }
              this.jdField_byte = false;
              break;
            case 3342337:
              a5.eQ.a(i);
              this.jdField_byte = false;
            default:
              break;
            }
          else
            switch (y().de())
            {
            case 0:
              i = 0;
              ah localah1 = (ah)a5.es.cf().elementAt(10);
              try
              {
                ny = localah1.ag();
              }
              catch (NumberFormatException localNumberFormatException2)
              {
                ny = 0;
              }
              as.cH = ny;
              as.a(1, "存入金额：", "确定", "取消", 1179652, -1);
              this.jdField_byte = false;
              break;
            case 1:
              a5.eQ.a(1179657);
              this.jdField_byte = false;
              break;
            case 2:
              a5.eQ.a(1179658);
              this.jdField_byte = false;
            }
          break;
        case 9:
          i = ((Integer)y().db().elementAt(y().de())).intValue();
          a5.eQ.a(i);
          break;
        case 4:
          if (this.mQ[this.mz] != -1)
            if ((i = ((Integer)y().db().elementAt(y().de())).intValue()) == 0)
            {
              this.jdField_byte = false;
              d7();
            }
            else
            {
              if (i == 3342337)
                am.a = false;
              a5.eQ.a(i);
              this.jdField_byte = false;
            }
          break;
        case 5:
          int m;
          if ((i = ((Integer)y().db().elementAt(y().de())).intValue()) == -1610612702)
          {
            if (this.mQ[this.mz] == -1)
            {
              b5.jdMethod_case("无物品");
              return;
            }
            if ((this.mQ[this.mz] != -1) && (this.nq[this.mz] == 0))
            {
              this.jdField_byte = false;
              as.a(0, "此物品不可邮寄", "确定", "", -1, -2);
              return;
            }
            for (m = 0; m < mE.length; m++)
            {
              if (mE[m][0] != -1)
                continue;
              mE[m][0] = (short)this.mz;
              mE[m][1] = this.mI[this.mz];
              mE[m][2] = (short)this.mo[this.mz];
              mE[m][3] = (short)this.nu[this.mz];
              if ((this.nv[this.mz] != 1) || (this.nu[this.mz] <= 1))
                break;
              as.cH = this.nu[this.mz];
              as.a(1, "物品数量:", "确定", "返回", -1, -1, m, this.mz);
              a5.gQ.jdMethod_goto(this.nu[this.mz]);
              break;
            }
            if (q.j < mE.length)
            {
              q.j = (byte)(q.j + 1);
              b5.jdMethod_case("PCMail.m_bAccessoriesAmount=" + q.j);
            }
            this.jdField_byte = false;
          }
          else if (i == -1610612701)
          {
            this.jdField_byte = false;
            d5();
          }
          else if (i == 458753)
          {
            a5.eQ.a(458753);
            q.m = 1;
          }
          else
          {
            if (i == -1610612700)
            {
              this.jdField_byte = false;
              for (m = 0; m < mE.length; m++)
              {
                if (mE[m][0] != this.mz)
                  continue;
                mE[m][0] = -1;
                mE[m][1] = -1;
                mE[m][2] = -1;
                mE[m][3] = -1;
                break;
              }
              if (q.j <= 0)
                return;
              q.j = (byte)(q.j - 1);
              break label9492;
            }
            if (i != 3342337)
              return;
          }
          break;
        case 6:
          if ((i = ((Integer)y().db().elementAt(y().de())).intValue()) == 3342337)
            am.a = false;
          a5.eQ.a(i);
          break;
        case 7:
          switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case -1610612715:
            if ((this.mQ[this.mz] != -1) && (this.nq[this.mz] == 0))
            {
              as.a(0, "此物品不可进行拍卖！", "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            mY[0] = (short)this.mz;
            mY[1] = this.mI[this.mz];
            mY[2] = (short)this.mo[this.mz];
            mY[3] = (short)this.nu[this.mz];
            m2 = this.mV[this.mz];
            bw.char = false;
            if (this.nv[this.mz] == 1)
            {
              bw.char = true;
              b5.jdMethod_case("----------------------------PCAuction.m_bWhetherAccumulate=" + bw.char);
            }
            if ((mY[3] == 1) && (this.nv[this.mz] == 1))
            {
              as.cH = this.nu[this.mz];
              bw.a(1);
              this.jdField_byte = false;
            }
            else if (mY[3] > 1)
            {
              as.cH = this.nu[this.mz];
              as.a(1, "请输入数量", "确定", "返回", -1, -1);
              a5.gQ.jdMethod_goto(this.nu[this.mz]);
              this.jdField_byte = false;
            }
            else
            {
              this.nv[this.mz] = false;
              bw.a((byte)mY[3]);
            }
            break;
          case -1610612713:
            bw.jdMethod_do();
            break;
          case -1610612714:
            bw.jdMethod_if(1);
            break;
          default:
            if (i == 3342337)
              am.a = false;
            bw.do = 1;
            a5.eQ.a(i);
          }
          this.jdField_byte = false;
          break;
        case 10:
          i = ((Integer)y().db().elementAt(y().de())).intValue();
          au.if = 1;
          au.int = this.mz;
          switch (i)
          {
          case 1966087:
            a5.eQ.a(1966087);
            break;
          case 1966093:
            a5.eQ.a(1966093);
            break;
          case 3342337:
            am.a = false;
            a5.eQ.a(3342337);
          }
          this.jdField_byte = false;
          break;
        case 11:
          switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case -1610612705:
            dU();
            break;
          case 2031617:
            aq.do = this.mz;
            a5.eQ.a(2031617);
            break;
          case 2031618:
            if (aq.a == -1)
            {
              as.a(0, "请选择要开封的装备。", "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            if (aq.int == -1)
            {
              as.a(0, "请选择开封卷轴对装备进行开封。", "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            a5.eQ.a(2031618);
            break;
          case 2031648:
            a5.eQ.a(2031648);
            break;
          case 3342337:
            am.a = false;
            a5.eQ.a(3342337);
          }
          this.jdField_byte = false;
          break;
        case 19:
          switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case 3342357:
          case 3342358:
            ek();
            break;
          case 3342359:
            break;
          case 3342361:
            break;
          case 3342337:
            am.a = false;
            break;
          case 2031617:
            aq.do = this.mz;
          }
          a5.eQ.a(i);
          break;
        case 20:
          switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case 917526:
          case 917527:
            ek();
            break;
          case 917528:
            break;
          case 917530:
            break;
          case 3342337:
            am.a = false;
            break;
          case 2031617:
            aq.do = this.mz;
          }
          a5.eQ.a(i);
          break;
        case 12:
          switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case -1610612705:
            mY[0] = (short)this.mz;
            mY[1] = this.mI[this.mz];
            mY[2] = (short)this.mo[this.mz];
            mY[3] = (short)this.nu[this.mz];
            if (aq.for == 1)
            {
              if ((this.mQ[this.mz] / 10000 >= 1014) && (this.mQ[this.mz] / 10000 <= 1016))
              {
                aq.a(4, true, 3, true);
                a5.eQ.a(2031622);
              }
              else
              {
                as.a(0, "只有原石才可放入当前位置。", "确定", "", -1, -2);
              }
            }
            else if (aq.for == 2)
            {
              if ((this.mQ[this.mz] / 10000 >= 1017) && (this.mQ[this.mz] / 10000 <= 1019))
                aq.a(6, true, 1, true);
              else
                as.a(0, "只有雕琢符才能放入当前位置。", "确定", "", -1, -2);
            }
            else if (aq.for == 3)
            {
              if (this.mQ[this.mz] / 10000 == 1021)
                aq.a(8, true, 2, true);
              else
                as.a(0, "只有原石雕琢安全符才能放入当前位置。", "确定", "", -1, -2);
            }
            else if (((this.mQ[this.mz] / 10000 < 1014) || (this.mQ[this.mz] / 10000 > 1016)) && (this.mQ[this.mz] / 10000 != 1021) && ((this.mQ[this.mz] / 10000 < 1017) || (this.mQ[this.mz] / 10000 > 1019)))
            {
              as.a(0, "此物品不能用于物品雕琢。", "确定", "", -1, -2);
            }
            else if ((this.mQ[this.mz] / 10000 >= 1014) && (this.mQ[this.mz] / 10000 <= 1016))
            {
              if (aq.a == -1)
              {
                aq.a(4, true, 3, true);
                a5.eQ.a(2031622);
              }
              else
              {
                if (aq.a == this.mz)
                  break;
                as.a(0, "是否覆盖当前所选的原石？", "确定", "取消", -6, -9);
              }
            }
            else if ((this.mQ[this.mz] / 10000 >= 1017) && (this.mQ[this.mz] / 10000 <= 1019))
            {
              if (aq.int == -1)
              {
                aq.a(6, true, 1, true);
              }
              else
              {
                if (aq.int == this.mz)
                  break;
                as.a(0, "是否覆盖当前所选的雕琢符？", "确定", "取消", -7, -9);
              }
            }
            else
            {
              if (this.mQ[this.mz] / 10000 != 1021)
                break;
              if (aq.if == -1)
              {
                aq.a(8, true, 2, true);
              }
              else
              {
                if (aq.if == this.mz)
                  break;
                as.a(0, "是否覆盖当前所选的原石雕琢安全符？", "确定", "取消", -8, -9);
              }
            }
            break;
          case 2031649:
            a5.eQ.a(2031649);
            break;
          case 2031623:
            if (aq.a == -1)
            {
              as.a(0, "请选择要雕琢的原石。", "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            if (aq.int == -1)
            {
              as.a(0, "请选择雕琢符对原石进行雕琢。", "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            a5.eQ.a(2031623);
            break;
          case 2031635:
            aq.do = this.mz;
            a5.eQ.a(2031635);
            break;
          case 3342337:
            am.a = false;
            a5.eQ.a(3342337);
          }
          this.jdField_byte = false;
          break;
        case 13:
          switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case -1610612705:
            mY[0] = (short)this.mz;
            mY[1] = this.mI[this.mz];
            mY[2] = (short)this.mo[this.mz];
            mY[3] = (short)this.nu[this.mz];
            if (aj.goto == 1)
            {
              if ((this.mQ[this.mz] / 10000 >= 1014) && (this.mQ[this.mz] / 10000 <= 1016))
              {
                if (aj.do >= 5)
                {
                  as.a(0, "已经放入5颗原石，不可再添加。", "确定", "", -1, -2);
                  this.jdField_byte = false;
                  return;
                }
                if (aj.do == 0)
                  as.cH = this.nu[this.mz];
                else if (this.nu[this.mz] <= (byte)(5 - aj.do))
                  as.cH = this.nu[this.mz];
                else if (this.nu[this.mz] > (byte)(5 - aj.do))
                  as.cH = (byte)(5 - aj.do);
                as.a(1, "请输入原石数量：", "确定", "取消", -1610612617, -1);
              }
              else
              {
                as.a(0, "只有原石才可放入当前位置。", "确定", "", -1, -2);
              }
            }
            else
            {
              if (((this.mQ[this.mz] / 10000 < 1014) || (this.mQ[this.mz] / 10000 > 1016)) && (this.mQ[this.mz] / 10000 != 1024))
              {
                as.a(0, "此物品不能用于原石合成。", "确定", "", -1, -2);
                this.jdField_byte = false;
                return;
              }
              if ((this.mQ[this.mz] / 10000 < 1014) || (this.mQ[this.mz] / 10000 > 1016))
                break;
              if (aj.do >= 5)
              {
                as.a(0, "已经放入5颗原石，不可再添加。", "确定", "", -1, -2);
                this.jdField_byte = false;
                return;
              }
              if (aj.do == 0)
                as.cH = this.nu[this.mz];
              else if (this.nu[this.mz] <= (byte)(5 - aj.do))
                as.cH = this.nu[this.mz];
              else if (this.nu[this.mz] > (byte)(5 - aj.do))
                as.cH = (byte)(5 - aj.do);
              as.a(1, "请输入原石数量：", "确定", "取消", -1610612617, -1);
            }
            break;
          case 2228231:
            aj.case = this.mz;
            a5.eQ.a(2228231);
            break;
          case 2228227:
            if (aj.byte == -1)
            {
              as.a(0, "请放入原石进行合成。", "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            a5.eQ.a(2228227);
            break;
          case 2031650:
            a5.eQ.a(2031650);
            break;
          case 3342337:
            am.a = false;
            a5.eQ.a(3342337);
          }
          this.jdField_byte = false;
          break;
        case 14:
          a7 locala71 = (a7)a5.es.cf().elementAt(4);
          a7 locala72 = (a7)a5.es.cf().elementAt(6);
          int i1;
          switch (i1 = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case -1610612705:
            mY[0] = (short)this.mz;
            mY[1] = this.mI[this.mz];
            mY[2] = (short)this.mo[this.mz];
            mY[3] = (short)this.nu[this.mz];
            if (au.char == 1)
            {
              if (this.mQ[this.mz] / 10000 == 118)
              {
                as.a(0, "只有装备才能放入当前位置。", "确定", "", -1, -2);
                this.jdField_byte = false;
                return;
              }
              if ((this.mQ[this.mz] / 10000 >= 101) && (this.mQ[this.mz] / 10000 <= 120))
              {
                au.int = this.mz;
                locala71.a(true, a5.es);
                a(false, a5.es);
                a5.eQ.a(1966098);
              }
              else
              {
                as.a(0, "只有装备才能放入当前位置。", "确定", "", -1, -2);
              }
            }
            else if (au.char == 2)
            {
              if (this.mQ[this.mz] / 10000 == 1025)
              {
                au.try = this.mz;
                locala72.a(true, 1);
                locala72.fC = (byte)mY[2];
                i1 = mY[1];
                locala72.ft = true;
                locala72.jdMethod_if(i1, false);
                locala72.a(a5.gg);
                locala72.a(true, a5.es);
                a(false, a5.es);
              }
              else
              {
                as.a(0, "只有宝石解除符才能放入当前位置。", "确定", "", -1, -2);
              }
            }
            else
            {
              if (this.mQ[this.mz] / 10000 == 118)
              {
                as.a(0, "此物品不能用于宝石解除。", "确定", "", -1, -2);
                this.jdField_byte = false;
                return;
              }
              if (((this.mQ[this.mz] / 10000 < 101) || (this.mQ[this.mz] / 10000 > 120)) && (this.mQ[this.mz] / 10000 != 1025))
              {
                as.a(0, "此物品不能用于宝石解除。", "确定", "", -1, -2);
              }
              else if ((this.mQ[this.mz] / 10000 >= 101) && (this.mQ[this.mz] / 10000 <= 120))
              {
                if (au.int == -1)
                {
                  au.int = this.mz;
                  locala71.a(true, a5.es);
                  a(false, a5.es);
                  a5.eQ.a(1966098);
                }
                else
                {
                  if (au.int == this.mz)
                    break;
                  as.a(0, "是否覆盖当前所选的装备？", "确定", "取消", -13, -9);
                }
              }
              else
              {
                if (this.mQ[this.mz] / 10000 != 1025)
                  break;
                if (au.try == -1)
                {
                  au.try = this.mz;
                  locala72.a(true, 1);
                  locala72.fC = (byte)mY[2];
                  short s = mY[1];
                  locala72.ft = true;
                  locala72.jdMethod_if(s, false);
                  locala72.a(a5.gg);
                  locala72.a(true, a5.es);
                  a(false, a5.es);
                }
                else
                {
                  if (au.try == this.mz)
                    break;
                  as.a(0, "是否覆盖当前所选的宝石解除符？", "确定", "取消", -14, -9);
                }
              }
            }
            break;
          case 1966113:
            au.byte = this.mz;
            a5.eQ.a(1966113);
            break;
          case 1966099:
            if (au.int == -1)
            {
              if (a5.d6.size() > 0)
                a5.d6.removeElementAt(a5.d6.size() - 1);
              as.a(0, "请放入装备进行宝石解除。", "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            a5.eQ.a(1966099);
            break;
          case 2031651:
            a5.eQ.a(2031651);
            break;
          case 3342337:
            am.a = false;
            a5.eQ.a(3342337);
          }
          this.jdField_byte = false;
          break;
        case 15:
          j = ((Integer)y().db().elementAt(y().de())).intValue();
          bb.void = mp;
          bb.do = 1;
          if (j == 3342337)
            am.a = false;
          a5.eQ.a(j);
          break;
        case 17:
          j = ((Integer)y().db().elementAt(y().de())).intValue();
          bx.a = 0;
          bx.for = mp;
          if (j == 3342337)
            am.a = false;
          a5.eQ.a(j);
          break;
        case 18:
          switch (j = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case -1610612705:
            mY[0] = (short)this.mz;
            mY[1] = this.mI[this.mz];
            mY[2] = (short)this.mo[this.mz];
            mY[3] = (short)this.nu[this.mz];
            aj.try = this.mV[this.mz];
            aj.char = this.ne[this.mz];
            a5.eQ.a(2228257);
            this.jdField_byte = false;
            break;
          case 2228258:
            if (aj.byte == -1)
            {
              as.a(0, "请放入宝石进行还原。", "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            a5.eQ.a(2228258);
            break;
          case 2228231:
            aj.case = this.mz;
            a5.eQ.a(2228231);
            break;
          case 2228227:
            if (aj.byte == -1)
            {
              as.a(0, "请放入原石进行合成。", "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            a5.eQ.a(2228227);
            break;
          case 2228260:
            a5.eQ.a(2228260);
            break;
          case 3342337:
            am.a = false;
            a5.eQ.a(3342337);
          }
          this.jdField_byte = false;
        case 3:
        case 16:
        }
        break;
      case 15:
      case 42:
        if (this.mQ[this.mz] == -1)
          break;
        switch (j = ((Integer)y().db().elementAt(y().de())).intValue())
        {
        case 983041:
          a5.eQ.a(j);
          break;
        case 1245185:
          be.a(2, this.mz);
          break;
        case 983042:
          if (this.nv[this.mz] == 0)
          {
            if (this.nm[this.mz] == 1)
            {
              as.c4 = 1;
              a5.eQ.a(j);
            }
            else
            {
              as.cH = this.nm[this.mz];
              (a5.gQ = new as(1, null)).a(5, bm.dt, "请输入个数", bm.a2[2], bm.a2[3], j, -1);
              a5.gQ.jdMethod_goto(1);
            }
          }
          else if (this.nu[this.mz] == 1)
          {
            as.c4 = 1;
            a5.eQ.a(j);
          }
          else
          {
            if (this.nm[this.mz] < this.nu[this.mz])
              as.cH = this.nm[this.mz];
            else
              as.cH = this.nu[this.mz];
            (a5.gQ = new as(1, null)).a(5, bm.dt, "请输入个数", bm.a2[2], bm.a2[3], j, -1);
            a5.gQ.jdMethod_goto(1);
          }
          this.jdField_byte = false;
          break;
        case 3:
          this.jdField_byte = false;
        }
        break;
      case 29:
        int n;
        ah localah4;
        if (this.mQ[this.mz] != -1)
          switch (j = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case 1179650:
            a5.eQ.a(j);
            this.jdField_byte = false;
            break;
          case 1245185:
            be.a(3, this.mz);
            this.jdField_byte = false;
            break;
          case 1179655:
            a5.eQ.a(j);
            this.jdField_byte = false;
            break;
          case 1179653:
            if (this.nu[this.mz] == 1)
            {
              bs.if = 1;
              a5.eQ.a(j);
            }
            else
            {
              as.cH = this.nu[this.mz];
              as.a(1, "请输入取出物品的个数：", "确定", "取消", j, -1);
              a5.gQ.jdMethod_goto(this.nu[this.mz]);
            }
            this.jdField_byte = false;
            break;
          case 1179654:
            n = 0;
            as.cH = r.ny = Integer.parseInt((localah4 = (ah)a5.es.cf().elementAt(5)).aj());
            as.a(1, "取出金额：", "确定", "取消", j, -1);
            this.jdField_byte = false;
            break;
          case 1179656:
            bs.a = 0;
            if (this.mF[0] == -1)
            {
              at.int[0] = this.mz;
              this.mF[0] = this.mz;
              bs.jdMethod_if(false);
            }
            this.jdField_byte = false;
            break;
          case 3342339:
            a5.eQ.a(j);
            this.jdField_byte = false;
          default:
            break;
          }
        else
          switch (j = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case 1179655:
            a5.eQ.a(j);
            this.jdField_byte = false;
            break;
          case 1179654:
            n = 0;
            as.cH = r.ny = Integer.parseInt((localah4 = (ah)a5.es.cf().elementAt(5)).aj());
            as.a(1, "取出金额：", "确定", "取消", j, -1);
            this.jdField_byte = false;
          }
        break;
      case 53:
        if (this.mQ[this.mz] == -1)
          break;
        switch (y().de())
        {
        case 0:
          a5.eQ.a(1769475);
          this.jdField_byte = false;
          break;
        case 1:
          a5.eQ.a(1769481);
          this.jdField_byte = false;
        }
        break;
      case 148:
        if (this.mQ[this.mz] == -1)
          break;
        j = ((Integer)y().db().elementAt(y().de())).intValue();
        bo.N = this.mz;
        bo.char = 8;
        switch (j)
        {
        case 2424993:
          bo.D = true;
          if (bo.g[this.mz] == 0)
          {
            if ((a5.dU) || ((bo.q != 3) && (bo.q != 8)))
            {
              as.cH = 20;
              as.a(1, "请您输入数量", "确定", "返回", 2424993, -1, -1, -1);
              a5.gQ.jdMethod_goto(1);
            }
            else
            {
              as.aY();
            }
          }
          else if (bo.g[this.mz] == 1)
            if ((a5.dU) || ((bo.q != 3) && (bo.q != 8)))
              a5.eQ.a(2424993);
            else
              as.aY();
          this.jdField_byte = false;
          break;
        case 2686977:
          u.jdMethod_if().jdField_for = this.mQ[this.mz];
          a5.eQ.a(2686977);
          this.jdField_byte = false;
          break;
        case 2424995:
          a5.eQ.a(2424995);
          this.jdField_byte = false;
          break;
        case 2425079:
          a5.eQ.a(2425079);
          this.jdField_byte = false;
          break;
        case 2425080:
          a5.eQ.a(2425080);
          this.jdField_byte = false;
        }
        break;
      case 160:
        ah localah2;
        switch (a5.es.g9)
        {
        case 2555908:
          if (this.mQ[this.mz] == -1)
            break;
          switch (j = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case 2555909:
            localah2 = (ah)a5.es.cf().elementAt(9);
            if (az.a[this.mz] > localah2.ag())
            {
              as.a(0, "您的菜币不足无法购买" + this.mV[this.mz], "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            az.long = this.mz;
            if ((as.cH = localah2.ag() / az.a[this.mz]) >= 99)
              as.cH = 99;
            as.a(1, "请输入购买数量", "确定", "取消", j, -1);
            a5.gQ.jdMethod_goto(1);
            break;
          case 2555968:
            az.long = this.mz;
            a5.eQ.a(j);
          }
          break;
        case 2555957:
          if (this.mQ[this.mz] == -1)
            break;
          switch (j = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case 2555958:
            localah2 = (ah)a5.es.cf().elementAt(9);
            if (az.a[this.mz] > localah2.ag())
            {
              as.a(0, "您的菜币不足无法购买" + this.mV[this.mz], "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            az.long = this.mz;
            if ((as.cH = localah2.ag() / az.a[this.mz]) >= 99)
              as.cH = 99;
            as.a(1, "请输入购买数量", "确定", "取消", j, -1);
            a5.gQ.jdMethod_goto(1);
            break;
          case 2555969:
            az.long = this.mz;
            a5.eQ.a(j);
          }
        }
        this.jdField_byte = false;
        break;
      case 164:
        switch (a5.es.g9)
        {
        case 2555907:
          if ((this.mV[this.mz].equals("")) || (this.mV[this.mz] == null))
            break;
          if ((j = ((Integer)y().db().elementAt(y().de())).intValue()) == 2555962)
          {
            az.long = this.mz;
          }
          else
          {
            if (j == 2555963)
            {
              az.long = this.mz;
              as.cH = this.nu[this.mz];
              as.a(1, "请输入丢弃数量", "确定", "取消", 2555963, -1);
              a5.gQ.jdMethod_goto(this.nu[this.mz]);
              this.jdField_byte = false;
              return;
            }
            if (j == 2555943)
            {
              az.long = this.mz;
              as.cH = this.nu[this.mz];
              as.a(1, "请输入赠送数量", "确定", "取消", 2555943, -16);
              a5.gQ.jdMethod_goto(this.nu[this.mz]);
              this.jdField_byte = false;
              return;
            }
          }
          a5.eQ.a(j);
          break;
        case 2555908:
          if ((this.mV[this.mz].equals("")) || (this.mV[this.mz] == null))
            break;
          if ((j = ((Integer)y().db().elementAt(y().de())).intValue()) == 2555962)
          {
            az.long = this.mz;
          }
          else if (j == 2555970)
          {
            az.long = this.mz;
            as.cH = this.nu[this.mz];
            as.a(1, "请输入贩卖数量", "确定", "取消", 2555970, -16);
            a5.gQ.jdMethod_goto(this.nu[this.mz]);
            this.jdField_byte = false;
            return;
          }
          a5.eQ.a(j);
          break;
        case 2555936:
          if ((this.mV[this.mz].equals("")) || (this.mV[this.mz] == null))
            break;
          j = ((Integer)y().db().elementAt(y().de())).intValue();
          az.long = this.mz;
          a5.eQ.a(j);
        }
        this.jdField_byte = false;
        break;
      case 165:
        if (this.mQ[this.mz] == -1)
          break;
        switch (j = ((Integer)y().db().elementAt(y().de())).intValue())
        {
        case 2555954:
          as.cH = this.nu[this.mz];
          az.int = this.mz;
          as.a(1, "请输入贩卖数量", "确定", "取消", j, -1);
          a5.gQ.jdMethod_goto(this.nu[this.mz]);
          this.jdField_byte = false;
          break;
        case 2555955:
          as.a(0, "是否贩卖掉仓库中的所有作物？", "确定", "取消", -29, -1);
          this.jdField_byte = false;
          break;
        case 2555956:
          az.long = this.mz;
          a5.eQ.a(2555956);
          this.jdField_byte = false;
          break;
        case 2555945:
          az.long = this.mz;
          as.cH = this.nu[this.mz];
          as.a(1, "请输入赠送数量", "确定", "取消", 2555945, -16);
          a5.gQ.jdMethod_goto(this.nu[this.mz]);
          this.jdField_byte = false;
          break;
        case 2555972:
          a5.eQ.a(2555972);
          this.jdField_byte = false;
          break;
        case 2555975:
          as.cH = this.nu[this.mz];
          az.int = this.mz;
          as.a(1, "请输入要移动的数量", "确定", "取消", j, -1);
          a5.gQ.jdMethod_goto(this.nu[this.mz]);
          this.jdField_byte = false;
        }
        break;
      case 167:
        switch (a5.es.g9)
        {
        case 2555957:
          if ((this.mV[this.mz].equals("")) || (this.mV[this.mz] == null))
            break;
          if ((j = ((Integer)y().db().elementAt(y().de())).intValue()) == 2555939)
          {
            az.long = this.mz;
          }
          else if (j == 2555971)
          {
            az.long = this.mz;
            as.cH = this.nu[this.mz];
            as.a(1, "请输入贩卖数量", "确定", "取消", 2555971, -16);
            a5.gQ.jdMethod_goto(this.nu[this.mz]);
            this.jdField_byte = false;
            return;
          }
          a5.eQ.a(j);
          break;
        case 2555915:
        case 2555936:
          if ((this.mV[this.mz].equals("")) || (this.mV[this.mz] == null))
            break;
          if ((j = ((Integer)y().db().elementAt(y().de())).intValue()) == 2555940)
          {
            az.long = this.mz;
            as.cH = this.nu[this.mz];
            as.a(1, "请输入丢弃数量", "确定", "取消", 2555940, -1);
            a5.gQ.jdMethod_goto(this.nu[this.mz]);
            this.jdField_byte = false;
            return;
          }
          if (j == 2555941)
          {
            az.long = this.mz;
            as.cH = this.nu[this.mz];
            as.a(1, "请输入赠送数量", "确定", "取消", 2555941, -16);
            a5.gQ.jdMethod_goto(this.nu[this.mz]);
            this.jdField_byte = false;
            return;
          }
          if ((j == 2555938) || (j == 2555939))
            az.long = this.mz;
          a5.eQ.a(j);
        }
        this.jdField_byte = false;
      }
      label9492: return;
    }
    if (a5.jdMethod_byte(262144))
      this.jdField_byte = false;
  }

  public static void dX()
  {
    for (int i = 0; i < mG.length; i++)
    {
      mG[i] = -1;
      md[i] = 1;
    }
  }

  public static void ed()
  {
    for (int i = 0; i < 6; i++)
      for (int j = 0; j < 4; j++)
      {
        mE[i][j] = -1;
        q.int[i][j] = -1;
      }
    for (i = 0; i < q.int.length; i++)
    {
      a7 locala7;
      (locala7 = (a7)a5.es.cf().elementAt(i + 7)).fC = 0;
      locala7.ft = false;
      locala7.jdMethod_if(-1, false);
      locala7.a(null);
      locala7.g(false);
    }
    a5.es.cf().elementAt(13);
  }

  public static void eg()
  {
    for (int i = 0; i < mE.length; i++)
    {
      if (i != a5.em)
        continue;
      mE[i][0] = -1;
      mE[i][1] = -1;
      mE[i][2] = -1;
      mE[i][3] = -1;
      q.int[i][0] = mE[i][0];
      q.int[i][1] = mE[i][1];
      q.int[i][2] = mE[i][2];
      q.int[i][3] = mE[i][3];
      if (q.j <= 0)
        continue;
      q.j = (byte)(q.j - 1);
    }
    a7 locala7;
    (locala7 = (a7)a5.es.cf().elementAt(a5.em + 7)).g(false);
    a5.es.cf().elementAt(13);
  }

  private void eb()
  {
    if (a5.es.g9 == 458773)
      return;
    Object localObject6;
    Object localObject3;
    br localbr;
    Object localObject5;
    switch (this.r)
    {
    case 6:
      Object localObject1 = this;
      Object localObject4;
      int[] arrayOfInt1;
      int[] arrayOfInt2;
      switch (this.ng)
      {
      case 0:
        localObject1 = this;
        b5.jdMethod_case("******************背包*****************" + a5.es.g9 + "---------" + this.ng);
        Object localObject2;
        switch (a5.es.g9)
        {
        case 458761:
          if (this.mQ[this.mz] == -1)
            break;
          localObject1 = new br(0);
          localObject2 = new String[] { "查看" };
          localObject4 = new int[] { 458753 };
          localObject6 = new int[] { 2 };
          if (this.mM[this.mz] == 1)
          {
            localObject2 = b5.a(localObject2, 0, "选择");
            localObject4 = b5.a(localObject4, 0, 0);
            localObject6 = b5.a(localObject6, 0, 4);
          }
          ((br)localObject1).a(localObject2, localObject4, localObject6);
          a((br)localObject1);
          this.jdField_byte = true;
          break;
        case -1610612734:
          if (this.mQ[this.mz] != -1)
          {
            localObject1 = new br(0);
            localObject2 = new String[] { "设置技能", "设置物品", "设置功能", "清空本键", "清空所有", "查看" };
            localObject4 = new int[] { -268435451, -268435450, -268435449, -268435455, -268435454, -268435453 };
            localObject6 = new int[] { 3, 3, 0, 3, 3, 2 };
            ((br)localObject1).a(localObject2, localObject4, localObject6);
            a((br)localObject1);
          }
          else
          {
            localObject1 = new br(0);
            localObject2 = new String[] { "设置技能", "设置物品", "设置功能", "清空所有" };
            localObject4 = new int[] { -268435451, -268435450, -268435449, -268435454 };
            localObject6 = new int[] { 3, 3, 0, 3 };
            ((br)localObject1).a(localObject2, localObject4, localObject6);
            a((br)localObject1);
          }
          this.jdField_byte = true;
          break;
        case 1966082:
          if ((this.mQ[this.mz] != -1) && (((this.mQ[this.mz] / 10000 >= 1011) && (this.mQ[this.mz] / 10000 <= 1016)) || (this.mQ[this.mz] / 10000 == 1027)))
          {
            localObject1 = new br(0);
            localObject2 = new int[] { au.else == 0 ? 1966084 : 1966090 };
            localObject4 = new int[] { 3 };
            ((br)localObject1).a(bm.ak, localObject2, localObject4);
            a((br)localObject1);
            this.jdField_byte = true;
            return;
          }
          as.a(0, "此物品不可镶嵌！", "确定", "", -1, -2);
          break;
        case 3342341:
          if (this.mQ[this.mz] == -1)
            break;
          a5.eQ.a(3342342);
          break;
        default:
          if (this.mF[0] != -1)
          {
            if (this.mF[0] != this.mz)
            {
              this.mF[1] = this.mz;
              at.int[0] = this.mF[0];
              at.int[1] = this.mF[1];
              if ((this.mQ[this.mz] != -1) || (this.nm[this.mF[0]] == 1) || (this.nu[this.mF[0]] == 1))
              {
                at.new = this.nu[this.mF[0]];
                a5.eQ.a(458756);
                return;
              }
              as.cH = this.nu[this.mF[0]];
              as.a(1, "请输入移动物品的个数：", "确定", "取消", 458756, -1);
              a5.gQ.jdMethod_goto(this.nu[this.mF[0]]);
              return;
            }
            return;
          }
          if (this.mQ[this.mz] != -1)
          {
            localObject1 = new br(0);
            if (am.void)
            {
              ((br)localObject1).a(am.b[0], 3342352, 3);
              ((br)localObject1).a(am.b[1], 3342354, 3);
              a((br)localObject1);
              this.jdField_byte = true;
              y().da();
              return;
            }
            am.for = this.mz;
            localObject2 = this;
            if (((y(this.mQ[localObject2.mz])) || (localObject2.m5[localObject2.mz] != 0) ? 1 : 0) != 0)
            {
              int j = 0;
              if (((this.mQ[this.mz] / 10000 >= 1011) && (this.mQ[this.mz] / 10000 <= 1016)) || (this.mQ[this.mz] / 10000 == 1027) || (this.mQ[this.mz] / 10000 == 1204))
              {
                j = 1;
                au.case = 0;
              }
              else
              {
                j = 3;
              }
              ((br)localObject1).a("使　用", 458754, j);
            }
            if (d3())
              ((br)localObject1).a("装　备", 458755, 3);
            ((br)localObject1).a("查　看", this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, this.mQ[this.mz] / 10000 != 118 ? 2 : 1);
            ((br)localObject1).a("移　动", 458756, 3);
            if ((d3()) && (this.mQ[this.mz] / 10000 != 118))
              ((br)localObject1).a("比　较", 1245185, 2);
            ((br)localObject1).a("整　理", 458758, 3);
            ((br)localObject1).a("丢　弃", 458759, 3);
            a((br)localObject1);
          }
          else
          {
            if (am.void)
              return;
            localObject1 = new br(0);
            arrayOfInt1 = new int[] { 458758 };
            localObject4 = new String[] { "整理" };
            ((br)localObject1).a(localObject4, arrayOfInt1);
            a((br)localObject1);
          }
          this.jdField_byte = true;
          y().da();
        }
        break;
      case 8:
        if (a7.bU())
          return;
        b5.jdMethod_case("************* 装备背包 ****************");
        if (this.mQ[this.mz] != -1)
        {
          localObject1 = new br(0);
          if (y(this.mQ[this.mz]))
          {
            arrayOfInt1 = new int[] { 458753, 917510, 917511 };
            localObject4 = new int[] { 2, 3, 3 };
            localObject6 = new String[] { "查看物品", "整　理", "丢　弃" };
            ((br)localObject1).a(localObject6, arrayOfInt1, localObject4);
          }
          else
          {
            ((br)localObject1).a("装备物品", 458755, 3);
            ((br)localObject1).a("查看物品", this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, this.mQ[this.mz] / 10000 != 118 ? 2 : 1);
            if (this.mQ[this.mz] / 10000 != 118)
            {
              ((br)localObject1).a("开　封", 2031636, 1);
              ((br)localObject1).a("比　较", 458757, 2);
            }
            ((br)localObject1).a("整　理", 917510, 3);
            ((br)localObject1).a("丢　弃", 917511, 3);
          }
          a((br)localObject1);
        }
        else
        {
          localObject1 = new br(0);
          arrayOfInt1 = new int[] { 917510 };
          localObject4 = new String[] { "整理" };
          ((br)localObject1).a(localObject4, arrayOfInt1);
          a((br)localObject1);
        }
        this.jdField_byte = true;
        y().da();
        break;
      case 1:
        b5.jdMethod_case("***************商店背包***************");
        if (this.mQ[this.mz] != -1)
        {
          localObject1 = new br(0);
          if (a5.es.g9 == 983046)
          {
            ((br)localObject1).a("卖出物品", 983043, 3);
            ((br)localObject1).a("自动出售", 983201, 3);
          }
          ((br)localObject1).a("查看详情", this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, 2);
          if ((!y(this.mQ[this.mz])) && (this.mQ[this.mz] / 10000 != 118))
            ((br)localObject1).a("比　较", 1245185, 2);
          ((br)localObject1).a("整　理", 983044, 3);
          ((br)localObject1).a("丢　弃", 983045, 3);
          a((br)localObject1);
        }
        else
        {
          localObject1 = new br(0);
          arrayOfInt1 = new int[] { 983044 };
          localObject4 = new String[] { "整理" };
          ((br)localObject1).a(localObject4, arrayOfInt1);
          a((br)localObject1);
        }
        this.jdField_byte = true;
        y().da();
        break;
      case 2:
        b5.jdMethod_case("***************仓库背包***************");
        if (this.mF[0] != -1)
        {
          if (this.mF[0] != this.mz)
          {
            this.mF[1] = this.mz;
            at.int[0] = this.mF[0];
            at.int[1] = this.mF[1];
            if ((this.mQ[this.mz] != -1) || (this.nm[this.mF[0]] == 1) || (this.nu[this.mF[0]] == 1))
            {
              at.new = this.nu[this.mF[0]];
              a5.eQ.a(1179656);
              return;
            }
            as.cH = this.nu[this.mF[0]];
            as.a(1, "请输入移动物品的个数：", "确定", "取消", 1179656, -1);
            a5.gQ.jdMethod_goto(this.nu[this.mF[0]]);
            return;
          }
          return;
        }
        if (this.mQ[this.mz] != -1)
        {
          (localObject1 = new br(0)).a("存入物品", 1179651, 3);
          ((br)localObject1).a("存入金钱", 1179652, 3);
          ((br)localObject1).a("查看物品", this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, this.mQ[this.mz] / 10000 != 118 ? 2 : 1);
          if ((!y(this.mQ[this.mz])) && (this.mQ[this.mz] / 10000 != 118))
            ((br)localObject1).a("比　较", 1245185, 2);
          ((br)localObject1).a("整　理", 1179657, 3);
          ((br)localObject1).a("移　动", 1179656, 3);
          if (a5.es.g9 == 1179649)
            ((br)localObject1).a("仓库扩容", 1179658, 1);
          a((br)localObject1);
        }
        else
        {
          localObject1 = new br(0);
          arrayOfInt1 = new int[] { 1179652, 1179657 };
          localObject4 = new String[] { "存入金钱", "整　理" };
          localObject6 = new int[] { 3, 3 };
          ((br)localObject1).a(localObject4, arrayOfInt1, localObject6);
          if (a5.es.g9 == 1179649)
            ((br)localObject1).a("仓库扩容", 1179658, 1);
          a((br)localObject1);
        }
        this.jdField_byte = true;
        y().da();
        break;
      case 9:
        b5.jdMethod_case("************* 仓库扩容背包 ****************");
        if (this.mQ[this.mz] == -1)
          break;
        localObject1 = new br(0);
        arrayOfInt1 = new int[] { 458753, 1179659 };
        localObject4 = new String[] { "查　看", "使　用" };
        localObject6 = new int[] { 2, 2 };
        ((br)localObject1).a(localObject4, arrayOfInt1, localObject6);
        a((br)localObject1);
        this.jdField_byte = true;
        y().da();
        break;
      case 3:
        if (this.mQ[this.mz] == -1)
          break;
        be.a(0, this.mz);
        break;
      case 5:
        int i = 0;
        if (this.mQ[this.mz] == -1)
          break;
        for (int k = 0; k < mE.length; k++)
        {
          if ((mE[k][0] == -1) || (mE[k][0] != this.mz))
            continue;
          i = 1;
        }
        localObject3 = new br(0);
        localObject4 = new int[] { i != 0 ? -1610612700 : -1610612702, -1610612701, this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337 };
        if (i == 0)
          bm.goto[0] = "选择物品";
        else
          bm.goto[0] = "取回物品";
        localObject6 = new int[] { 3, 3, 2 };
        ((br)localObject3).a(bm.goto, localObject4, localObject6);
        a((br)localObject3);
        this.jdField_byte = true;
        y().da();
        break;
      case 4:
        if (this.mQ[this.mz] != -1)
        {
          localbr = new br(0);
          localObject3 = "";
          for (int m = 0; m < mG.length; m++)
          {
            if (mG[m] == this.mz)
            {
              localObject3 = "取消选择";
              break;
            }
            localObject3 = "选择物品";
          }
          localObject5 = new String[] { localObject3, "确认放置", "查　看" };
          localObject6 = new int[] { 0, 1376261, this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337 };
          arrayOfInt2 = new int[] { 3, 3, 2 };
          localbr.a(localObject5, localObject6, arrayOfInt2);
          a(localbr);
        }
        else
        {
          return;
        }
        this.jdField_byte = true;
        y().da();
        break;
      case 6:
        if (this.mQ[this.mz] != -1)
        {
          localbr = new br(0);
          localObject3 = new int[] { this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, 1769477 };
          localObject5 = new int[] { 2, 3 };
          localbr.a(bm.a4, localObject3, localObject5);
          a(localbr);
        }
        else
        {
          localbr = new br(0);
          localObject3 = new int[] { 1769477 };
          localObject5 = new int[] { 3 };
          localbr.a(bm.e, localObject3, localObject5);
          a(localbr);
        }
        this.jdField_byte = true;
        y().da();
        break;
      case 7:
        if (this.mQ[this.mz] == -1)
          break;
        localbr = new br(0);
        localObject3 = new String[] { "查　看", "选择物品" };
        localObject5 = new String[] { "查　看", "替换物品", "确定拍卖", "取回物品" };
        localObject6 = new int[] { this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, -1610612715 };
        arrayOfInt2 = new int[] { this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, -1610612715, -1610612713, -1610612714 };
        int[] arrayOfInt3 = { 2, 3 };
        int[] arrayOfInt4 = { 2, 3, 3, 3 };
        localbr.a(bw.a == 0 ? localObject3 : localObject5, bw.a == 0 ? localObject6 : arrayOfInt2, bw.a == 0 ? arrayOfInt3 : arrayOfInt4);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 10:
        if ((this.mQ[this.mz] != -1) && (this.mQ[this.mz] / 10000 >= 101) && (this.mQ[this.mz] / 10000 <= 120))
        {
          localbr = new br(0);
          localObject3 = new int[] { 1966087, this.mQ[this.mz] / 10000 != 118 ? 1966093 : 3342337 };
          localObject5 = new int[] { 2, 2 };
          localbr.a(bm.f, localObject3, localObject5);
          a(localbr);
          this.jdField_byte = true;
          y().da();
          return;
        }
        as.a(0, "此物品不可镶嵌宝石。", "确定", "", -1, -2);
        break;
      case 11:
        if (this.mQ[this.mz] == -1)
          break;
        localbr = new br(0);
        localObject3 = new int[] { -1610612705, this.mQ[this.mz] / 10000 != 118 ? 2031617 : 3342337, 2031618, 2031648 };
        localObject5 = new int[] { 3, 2, 3, 2 };
        localbr.a(bm.bU, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 19:
        if (this.mQ[this.mz] == -1)
          break;
        localbr = new br(0);
        localObject3 = new int[] { 3342357, 3342358, this.mQ[this.mz] / 10000 != 118 ? 2031617 : 3342337, 3342359, 3342361 };
        localObject5 = new int[] { 3, 3, 2, 3, 2 };
        localObject6 = new String[] { "放置法宝", "放置铭文", "查看详情", "法宝铭刻", "铭刻说明" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 20:
        if (this.mQ[this.mz] == -1)
          break;
        localbr = new br(0);
        localObject3 = new int[] { 917526, 917527, this.mQ[this.mz] / 10000 != 118 ? 2031617 : 3342337, 917528, 917530 };
        localObject5 = new int[] { 3, 3, 2, 3, 2 };
        localObject6 = new String[] { "放置装备", "放置强化符", "查看详情", "装备强化", "强化说明" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 12:
        if (this.mQ[this.mz] == -1)
          break;
        localbr = new br(0);
        localObject3 = new int[] { -1610612705, this.mQ[this.mz] / 10000 != 118 ? 2031635 : 3342337, 2031623, 2031649 };
        localObject5 = new int[] { 3, 2, 3, 2 };
        localbr.a(bm.c6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 13:
        if (this.mQ[this.mz] == -1)
          break;
        localbr = new br(0);
        localObject3 = new int[] { -1610612705, this.mQ[this.mz] / 10000 != 118 ? 2228231 : 3342337, 2228227, 2031650 };
        localObject5 = new int[] { 3, 2, 3, 2 };
        localbr.a(bm.cp, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 14:
        if (this.mQ[this.mz] == -1)
          break;
        localbr = new br(0);
        localObject3 = new int[] { -1610612705, this.mQ[this.mz] / 10000 != 118 ? 1966113 : 3342337, 1966099, 2031651 };
        localObject5 = new int[] { 3, 2, 1, 2 };
        localbr.a(bm.dc, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 15:
        if (this.mQ[this.mz] == -1)
          break;
        localbr = new br(0);
        localObject3 = new int[] { this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337, 2162754 };
        localObject5 = new int[] { 2, 3 };
        localObject6 = new String[] { "查　看", "凝　元" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 17:
        if (this.mQ[this.mz] == -1)
          break;
        if (bx.if != -1)
        {
          if ((this.mQ[this.mz] / 10000 >= 101) && (this.mQ[this.mz] / 10000 <= 120))
          {
            localbr = new br(0);
            localObject3 = new int[] { 917524, this.mQ[this.mz] / 10000 != 118 ? 458753 : 3342337 };
            localObject5 = new int[] { 3, 2 };
            localObject6 = new String[] { "修理", "查看" };
            localbr.a(localObject6, localObject3, localObject5);
            a(localbr);
            this.jdField_byte = true;
            y().da();
            return;
          }
          localbr = new br(0);
          localObject3 = new int[] { 458753 };
          localObject5 = new int[] { 2 };
          localObject6 = new String[] { "查看" };
          localbr.a(localObject6, localObject3, localObject5);
          a(localbr);
          this.jdField_byte = true;
          y().da();
          return;
        }
        localbr = new br(0);
        localObject3 = new int[] { 458753 };
        localObject5 = new int[] { 2 };
        localObject6 = new String[] { "查看" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 18:
        if (this.mQ[this.mz] == -1)
          break;
        localbr = new br(0);
        localObject3 = new int[] { -1610612705, this.mQ[this.mz] / 10000 != 118 ? 2228231 : 3342337, 2228258, 2228260 };
        localObject5 = new int[] { 3, 2, 1, 2 };
        localObject6 = new String[] { "放置道具", "查看详情", "宝石还原", "还原说明" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
      case 16:
      }
      return;
    case 15:
    case 42:
      b5.jdMethod_case("****************商店*******************");
      if (this.mQ[this.mz] == -1)
        break;
      (localbr = new br(0)).a("买入物品", 983042, 3);
      localbr.a("查看详情", 983041, 2);
      if ((!y(this.mQ[this.mz])) && (this.mQ[this.mz] / 10000 != 118))
        localbr.a("比　较", 1245185, 2);
      a(localbr);
      this.jdField_byte = true;
      y().da();
      return;
    case 29:
      b5.jdMethod_case("****************仓库*******************");
      if (this.mF[0] != -1)
      {
        if (this.mF[0] != this.mz)
        {
          this.mF[1] = this.mz;
          at.int[0] = this.mF[0];
          at.int[1] = this.mF[1];
          if ((this.mQ[this.mz] != -1) || (this.nm[this.mF[0]] == 1) || (this.nu[this.mF[0]] == 1))
          {
            at.new = this.nu[this.mF[0]];
            a5.eQ.a(1179656);
            return;
          }
          as.cH = this.nu[this.mF[0]];
          as.a(1, "请输入移动物品的个数：", "确定", "取消", 1179656, -1);
          a5.gQ.jdMethod_goto(this.nu[this.mF[0]]);
          return;
        }
        return;
      }
      if (this.mQ[this.mz] != -1)
      {
        (localbr = new br(0)).a("取出物品", 1179653, 3);
        localbr.a("取出金钱", 1179654, 3);
        localbr.a("查看物品", this.mQ[this.mz] / 10000 != 118 ? 1179650 : 3342339, this.mQ[this.mz] / 10000 != 118 ? 2 : 1);
        if ((!y(this.mQ[this.mz])) && (this.mQ[this.mz] / 10000 != 118))
          localbr.a("比　较", 1245185, 2);
        localbr.a("整　理", 1179655, 3);
        localbr.a("移　动", 1179656, 3);
        a(localbr);
      }
      else
      {
        (localbr = new br(0)).a("取出金钱", 1179654, 3);
        localbr.a("整　理", 1179655, 3);
        a(localbr);
      }
      this.jdField_byte = true;
      y().da();
      return;
    case 53:
      b5.jdMethod_case("****************物品兑换商店*******************");
      if (this.mQ[this.mz] == -1)
        break;
      localbr = new br(0);
      localObject3 = new int[] { 1769475, 1 };
      localObject5 = new int[] { 2, 3 };
      localbr.a(bm.ap, localObject3, localObject5);
      a(localbr);
      this.jdField_byte = true;
      y().da();
      return;
    case 148:
      if (this.mQ[this.mz] == -1)
        break;
      localbr = new br(0);
      if (a5.es.g9 == 2425078)
      {
        localObject3 = new int[] { 2425080, 2425079 };
        localObject5 = new int[] { 3, 1 };
        localObject6 = new String[] { "5折购买", "查    看" };
        localbr.a(localObject6, localObject3, localObject5);
      }
      else if (this.mQ[this.mz] / 10000 == 1616)
      {
        localObject3 = new int[] { 2424993, 2686977, 2424995 };
        localObject5 = new int[] { 3, 3, 1 };
        localObject6 = new String[] { "购    买", "包    月", "查    看" };
        localbr.a(localObject6, localObject3, localObject5);
      }
      else
      {
        localObject3 = new int[] { 2424993, 2424995 };
        localObject5 = new int[] { 3, 1 };
        localObject6 = new String[] { "购    买", "查    看" };
        localbr.a(localObject6, localObject3, localObject5);
      }
      a(localbr);
      this.jdField_byte = true;
      y().da();
      return;
    case 160:
      switch (a5.es.g9)
      {
      case 2555908:
        if (this.mQ[this.mz] == -1)
          break;
        localbr = new br(0);
        localObject3 = new int[] { 2555909, 2555968 };
        localObject5 = new int[] { 3, 2 };
        localObject6 = new String[] { "购    买", "查    看" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 2555957:
        if (this.mQ[this.mz] == -1)
          break;
        localbr = new br(0);
        localObject3 = new int[] { 2555958, 2555969 };
        localObject5 = new int[] { 3, 2 };
        localObject6 = new String[] { "购    买", "查    看" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
      }
      return;
    case 164:
      switch (a5.es.g9)
      {
      case 2555907:
        if ((this.mV[this.mz].equals("")) || (this.mV[this.mz] == null))
          break;
        localbr = new br(0);
        localObject3 = new int[] { 2555962, 2555963, 2555943 };
        localObject5 = new int[] { 2, 3, 2 };
        localObject6 = new String[] { "查    看", "丢    弃", "赠送好友" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 2555936:
        if ((this.mV[this.mz].equals("")) || (this.mV[this.mz] == null))
          break;
        localbr = new br(0);
        localObject3 = new int[] { 2555937, 2555962 };
        localObject5 = new int[] { 3, 2 };
        localObject6 = new String[] { "播    种", "查    看" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        break;
      case 2555908:
        if ((this.mV[this.mz].equals("")) || (this.mV[this.mz] == null))
          break;
        localbr = new br(0);
        localObject3 = new int[] { 2555962, 2555970 };
        localObject5 = new int[] { 2, 3 };
        localObject6 = new String[] { "查    看", "贩    卖" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
      }
      return;
    case 165:
      if (this.mQ[this.mz] != -1)
      {
        localbr = new br(0);
        if (this.mQ[this.mz] / 10000 == 1613)
        {
          localObject3 = new int[] { 2555954, 2555956, 2555955, 2555945, -1610612636, 2555972, 2555975 };
          localObject5 = new int[] { 3, 2, 3, 2, 2, 3, 3 };
          localObject6 = new String[] { "贩    卖", "查    看", "全部贩卖", "赠送好友", "作物加工", "整   理", "放入背包" };
          localbr.a(localObject6, localObject3, localObject5);
        }
        else
        {
          localObject3 = new int[] { 2555954, 2555956, 2555955, 2555945, 2555972, 2555975 };
          localObject5 = new int[] { 3, 2, 3, 2, 3, 3 };
          localObject6 = new String[] { "贩    卖", "查    看", "全部贩卖", "赠送好友", "整   理", "放入背包" };
          localbr.a(localObject6, localObject3, localObject5);
        }
        a(localbr);
        this.jdField_byte = true;
        y().da();
        return;
      }
      a5.eQ.a(2555972);
      return;
    case 167:
      switch (a5.es.g9)
      {
      case 2555957:
        if ((this.mV[this.mz].equals("")) || (this.mV[this.mz] == null))
          break;
        localbr = new br(0);
        localObject3 = new int[] { 2555939, 2555971 };
        localObject5 = new int[] { 2, 3 };
        localObject6 = new String[] { "查    看", "贩    卖" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        return;
      case 2555915:
        if ((this.mV[this.mz].equals("")) || (this.mV[this.mz] == null))
          break;
        localbr = new br(0);
        localObject3 = new int[] { 2555939, 2555940, 2555941 };
        localObject5 = new int[] { 2, 3, 2 };
        localObject6 = new String[] { "查    看", "丢    弃", "赠送好友" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
        return;
      case 2555936:
        if ((this.mV[this.mz].equals("")) || (this.mV[this.mz] == null))
          break;
        localbr = new br(0);
        localObject3 = new int[] { 2555939, 2555940, 2555938, 2555941 };
        localObject5 = new int[] { 2, 3, 3, 2 };
        localObject6 = new String[] { "查    看", "丢    弃", "使用道具", "赠送好友" };
        localbr.a(localObject6, localObject3, localObject5);
        a(localbr);
        this.jdField_byte = true;
        y().da();
      }
    }
  }

  public final af ei()
  {
    return this.na;
  }

  private void ea()
  {
    int i;
    if ((i = this.mz / this.nx + 1) > this.nz + this.ms)
    {
      this.nz = (short)(this.nz + 1);
      i = this.mt % this.nx == 0 ? this.mt / this.nx : this.mt / this.nx + 1;
      if (this.nz > i - this.ms)
        this.nz = (short)(i - this.ms);
    }
  }

  private void ee()
  {
    int i;
    if ((i = this.mz / this.nx) < this.nz)
      this.nz = (short)(this.nz - 1);
  }

  public final void q(boolean paramBoolean)
  {
    this.mw = paramBoolean;
    if (paramBoolean)
    {
      if (this.na != null)
        this.na.jdMethod_for((short)(this.j + ah.ad() + 2));
    }
    else if (this.na != null)
      this.na.jdMethod_for((short)(this.j + 2));
    if (this.na != null)
      this.na.aa();
  }

  public final void jdMethod_do(int paramInt1, int paramInt2)
  {
    this.mo[paramInt1] = (byte)(paramInt2 / 1000 - 1);
    b5.jdMethod_case("------(" + paramInt2 + ") stuffQuality[" + paramInt1 + "] = " + this.mo[paramInt1]);
  }

  public final void d9()
  {
    Object localObject = this;
    if (this.na == null)
      return;
    localObject = this;
    localObject = this;
    localObject = this;
    localObject = this;
    this.na.az = (short)(this.mt % this.nx == 0 ? this.mt / this.nx : this.mt / this.nx + 1);
    localObject = this;
    localObject = this;
    this.na.ay = this.ms;
    localObject = this;
    this = 0;
    (localObject = this.na).aj = this;
  }

  public final void d1()
  {
    Object localObject = this;
    if (this.mt != 0)
    {
      localObject = (ak)a5.es.cf().elementAt(4);
      this = bp.jdMethod_void(this.mQ[this.mz]);
      this = bp.fu[this] + "\n";
      ((ak)localObject).jdMethod_if(this);
      ((ak)localObject).ap();
    }
  }

  public static void d6()
  {
    a7[] arrayOfa7 = { (a7)a5.es.cf().elementAt(3), (a7)a5.es.cf().elementAt(5), (a7)a5.es.cf().elementAt(7), (a7)a5.es.cf().elementAt(9) };
    r localr = (r)a5.es.cf().elementAt(10);
    for (int i = 0; i < arrayOfa7.length; i++)
    {
      if (arrayOfa7[i].q())
      {
        localr.nb = 0;
        for (int j = 0; j < i; j++)
        {
          r tmp116_115 = localr;
          tmp116_115.nb = (byte)(tmp116_115.nb + arrayOfa7[j].b0());
        }
        localr.nA = (byte)(localr.nb + arrayOfa7[i].b0());
        b5.jdMethod_case("beginShockIndex = " + localr.nb + " endShockIndex = " + localr.nA);
        return;
      }
      localr.nb = (localr.nA = -1);
    }
  }

  public static int E(byte paramByte)
  {
    int i = 0;
    if (paramByte < 0)
      i = bm.bP;
    else if (paramByte != 1)
      i = bm.c0[paramByte];
    else
      i = 0;
    mg = i;
    return i;
  }

  private static boolean y(int paramInt)
  {
    return (paramInt = paramInt + "").length() == 8;
  }

  private boolean d3()
  {
    return !y(this.mQ[this.mz]);
  }

  private void d7()
  {
    if (this.mQ[this.mz] == -1)
    {
      b5.jdMethod_case("无物品");
      return;
    }
    int i = 0;
    for (int j = 0; j < mG.length; j++)
    {
      if (mG[j] != this.mz)
        continue;
      i = 1;
      break;
    }
    for (j = 0; j < mG.length; j++)
    {
      if (mG[j] == this.mz)
      {
        mG[j] = -1;
        md[j] = 1;
        return;
      }
      if ((mG[j] != -1) || (i != 0))
        continue;
      if (this.nq[this.mz] == 0)
      {
        as.a(0, "该物品已经被$绑定$不能交易！", "确定", "", -1, -2);
        return;
      }
      if (this.nu[this.mz] != 1)
      {
        as.cH = this.nu[this.mz];
        as.a(1, "交易数量:", "确定", "返回", -1, -1, j, this.mz);
        return;
      }
      mG[j] = this.mz;
      return;
    }
  }

  private void d5()
  {
    be.cn();
    for (int i = 0; i < 6; i++)
      for (int j = 0; j < 4; j++)
        q.int[i][j] = mE[i][j];
    for (i = 0; i < q.int.length; i++)
    {
      a7 locala7;
      (locala7 = (a7)a5.es.cf().elementAt(i + 7)).fC = (byte)q.int[i][2];
      short s = q.int[i][1];
      locala7.ft = true;
      locala7.jdMethod_if(s, false);
      locala7.a(a5.gg);
      if (q.int[i][3] == 1)
      {
        if (this.nv[q.int[i][0]] != 0)
          locala7.a(true, 1);
        else
          locala7.g(false);
      }
      else
      {
        this.nv[i] = true;
        if (q.int[i][3] > 0)
          locala7.a(true, (byte)q.int[i][3]);
        else
          locala7.g(false);
      }
    }
    q.jdMethod_if();
  }

  public final void d0()
  {
    for (int i = 0; i < this.mt; i++)
    {
      this.mQ[i] = -1;
      this.mI[i] = -1;
      this.nu[i] = -1;
      this.mV[i] = null;
      this.ne[i] = -1;
      this.mM[i] = -1;
      this.m5[i] = false;
      this.nq[i] = false;
      this.nD[i] = -1;
      this.mN[i] = -1;
      this.nm[i] = -1;
      this.mx[i] = -1;
      this.m4[i] = false;
      this.mS[i] = false;
      this.mZ[i] = false;
      this.nv[i] = false;
      this.mo[i] = -1;
    }
  }

  public final void jdMethod_new(short paramShort)
  {
    super.jdMethod_new(paramShort);
    if (this.mA != null)
      this.mA.jdMethod_new((short)(paramShort + 3));
    jdMethod_do(this.jdField_new);
  }

  public final void jdMethod_for(short paramShort)
  {
    super.jdMethod_for(paramShort);
    if (this.mA != null)
      this.mA.jdMethod_for(paramShort);
    jdMethod_do(this.jdField_new);
  }

  public static short k(short paramShort)
  {
    if (paramShort == -1)
      return paramShort;
    for (short s = 0; s < mj.length; s++)
      if (s == paramShort)
        return mj[s];
    b5.jdMethod_case("imgId = " + paramShort);
    throw new IllegalArgumentException("物品ID参数不匹配");
  }

  public final void dU()
  {
    a7 locala7 = (a7)a5.es.cf().elementAt(4);
    mY[0] = (short)this.mz;
    mY[1] = this.mI[this.mz];
    mY[2] = (short)this.mo[this.mz];
    mY[3] = (short)this.nu[this.mz];
    if (aq.for == 1)
    {
      if ((this.mQ[this.mz] / 10000 >= 101) && (this.mQ[this.mz] / 10000 <= 120))
      {
        locala7.a(true, a5.es);
        a(false, a5.es);
        aq.a = this.mz;
        a5.eQ.a(2031637);
        return;
      }
      as.a(0, "这不是一件装备，不能开封。", "确定", "", -1, -2);
      return;
    }
    if (aq.for == 2)
    {
      if (this.mQ[this.mz] / 10000 == 1023)
      {
        aq.a(6, true, 1, true);
        return;
      }
      as.a(0, "只有开封卷轴才能放入当前位置。", "确定", "", -1, -2);
      return;
    }
    if (aq.for == 3)
    {
      if (this.mQ[this.mz] / 10000 == 1022)
      {
        aq.a(8, true, 2, true);
        return;
      }
      as.a(0, "只有机率提升符才能放入当前位置。", "确定", "", -1, -2);
      return;
    }
    if (((this.mQ[this.mz] / 10000 < 101) || (this.mQ[this.mz] / 10000 > 120)) && (this.mQ[this.mz] / 10000 != 1023) && (this.mQ[this.mz] / 10000 != 1022))
    {
      as.a(0, "此物品不能用于装备开封。", "确定", "", -1, -2);
      return;
    }
    if ((this.mQ[this.mz] / 10000 >= 101) && (this.mQ[this.mz] / 10000 <= 120))
    {
      if (aq.a == -1)
      {
        aq.a = this.mz;
        a5.eQ.a(2031637);
        return;
      }
      if (aq.a != this.mz)
      {
        as.a(0, "是否覆盖当前所选的装备？", "确定", "取消", -10, -9);
        return;
      }
    }
    else if (this.mQ[this.mz] / 10000 == 1023)
    {
      if (aq.int == -1)
      {
        aq.a(6, true, 1, true);
        return;
      }
      if (aq.a != this.mz)
      {
        as.a(0, "是否覆盖当前所选的开封卷轴？", "确定", "取消", -7, -9);
        return;
      }
    }
    else if (this.mQ[this.mz] / 10000 == 1022)
    {
      if (aq.if == -1)
      {
        aq.a(8, true, 2, true);
        return;
      }
      if (aq.a != this.mz)
        as.a(0, "是否覆盖当前所选的机率提升符？", "确定", "取消", -8, -9);
    }
  }

  private void ek()
  {
    am.do = this.mz;
    mY[0] = (short)this.mz;
    mY[1] = this.mI[this.mz];
    mY[2] = (short)this.mo[this.mz];
    mY[3] = (short)this.nu[this.mz];
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     r
 * JD-Core Version:    0.6.0
 */
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class bz extends a4
{
  public short[][] aR = null;
  public b W = null;
  byte ap = 0;
  short[][] al = null;
  short x = 0;
  short w = 0;
  short[][] aw = new short[10][4];
  byte X = 1;
  byte bo = 0;
  private static String[] au = { "未命中", "躲闪", "招架", "格挡", "吸收" };
  public byte[] aH = new byte[20];
  public static final byte[][] bj = { { 5, 4, 4, 2 }, { 2, 2, 2, 1 }, { 7, 6, 6, 3 }, { 7, 6, 8, 4 }, { 7, 6, 8, 4 }, { 7, 6, 8, 4 }, { 0, 0, 0, 0 } };
  public static final short[][] aL = { { 369, 370, 371 }, { 25, 27, 28, 29, 30, 31, 32, 33, 34 }, { 46, 53, 54, 55 }, { 372 }, { 373, 377 }, { 374 }, { 369, 370, 371 }, { 225, 226, 227, 228, 229, 230, 231, 232, 233 }, { 46, 53, 54, 55 }, { 372 }, { 373, 377 }, { 374 } };
  public byte bq = 0;
  public boolean a4 = false;
  private byte aa = 1;
  private byte a6 = 1;
  private byte ai = 0;
  byte aq = 1;
  private byte av = 0;
  short aO;
  private byte V = 0;
  short bm = 0;
  short bi = 0;
  int a2 = 0;
  int L = 0;
  int bg = 0;
  int ad = 0;
  public byte aT;
  public boolean aB = false;
  public boolean B = false;
  public boolean Y = false;
  public boolean J = false;
  public boolean A = false;
  private boolean a8 = false;
  public byte a7;
  public short bt;
  public short ax;
  protected int[][] aA = new int[0][];
  private byte y;
  private static byte[][] bs = { { 5, 5 }, { 11, 9 }, { 16, 11 }, { 17, 12 }, { 18, 13 }, { 19, 13 }, { 20, 13 }, { 21, 12 }, { 23, 10 }, { 25, 8 }, { 29, 2 } };
  private static byte[][] af = { { 17, -5 }, { 0, 10 }, { 0, 11 }, { 0, 12 }, { 0, 13 }, { 0, 14 }, { 0, 15 }, { 0, 16 }, { 0, 21 }, { 0, 29 }, { 0, 39 } };
  private static byte aK = (byte)bs.length;
  private Vector aG = new Vector();
  private static int aQ = 53;
  public static int z = 60;
  public static int bf = 3;
  private byte az = 0;
  public Vector aI = new Vector();
  private byte U = 1;
  private int bd = 0;

  public final void jdMethod_byte(byte paramByte)
  {
    this.aa = paramByte;
  }

  public final byte o()
  {
    return this.aa;
  }

  public final void jdMethod_char(byte paramByte)
  {
    this.a6 = paramByte;
  }

  public final byte C()
  {
    return this.a6;
  }

  public final void b(byte paramByte)
  {
    this.ai = paramByte;
  }

  public final byte K()
  {
    return this.ai;
  }

  public final void jdMethod_case(byte paramByte)
  {
    this.aq = paramByte;
  }

  public final byte i()
  {
    return this.aq;
  }

  public final void jdMethod_void(byte paramByte)
  {
    this.av = paramByte;
  }

  public final byte m()
  {
    return this.av;
  }

  public final void jdMethod_if(short paramShort)
  {
    this.aO = paramShort;
  }

  public final short r()
  {
    return this.aO;
  }

  public final void jdMethod_else(byte paramByte)
  {
    this.V = paramByte;
  }

  public final void jdMethod_try(short paramShort1, short paramShort2)
  {
    this.bm = paramShort1;
    this.bi = paramShort2;
  }

  public final short n()
  {
    return this.bm;
  }

  public final short A()
  {
    return this.bi;
  }

  public final boolean jdMethod_case(short paramShort1, short paramShort2)
  {
    this.ax = paramShort2;
    this.bt = paramShort1;
    if ((this.l != this.ax) || (this.q != this.bt))
    {
      this.aA = new b0().a(this.l, this.q, this.ax, this.bt);
      return true;
    }
    this.aA = new int[0][];
    return false;
  }

  public final void jdMethod_byte(short paramShort1, short paramShort2)
  {
    this.bt = paramShort1;
    this.ax = paramShort2;
  }

  public final short F()
  {
    return this.bt;
  }

  public final short z()
  {
    return this.ax;
  }

  public final byte y()
  {
    return this.a7;
  }

  public final void jdMethod_int(int paramInt)
  {
    this.a2 = paramInt;
  }

  public final void jdMethod_for(int paramInt)
  {
    this.L = paramInt;
  }

  public final int J()
  {
    return this.a2;
  }

  public final int s()
  {
    return this.L;
  }

  public final void jdMethod_try(int paramInt)
  {
    this.bg = paramInt;
  }

  public final void jdMethod_byte(int paramInt)
  {
    this.ad = paramInt;
  }

  public final int v()
  {
    return this.bg;
  }

  public final int N()
  {
    return this.ad;
  }

  public final boolean L()
  {
    return this.a8;
  }

  public final void a(boolean paramBoolean)
  {
    this.a8 = paramBoolean;
  }

  public void jdMethod_goto(byte paramByte)
  {
  }

  public final void l()
  {
    bz localbz = this;
    int i;
    int j;
    while (true)
    {
      i = localbz.aA[0][0] - localbz.l;
      j = localbz.aA[0][1] - localbz.q;
      if ((i != 0) || (j != 0))
        break;
      localbz.aA = b0.a(localbz.aA, 0, -1);
    }
    if (i > 0)
    {
      if (j > 0)
        localbz.jdMethod_new(1);
      else if (j < 0)
        localbz.jdMethod_new(4);
      else
        localbz.jdMethod_new(8);
    }
    else if (i < 0)
    {
      if (j > 0)
        localbz.jdMethod_new(2);
      else if (j < 0)
        localbz.jdMethod_new(3);
      else
        localbz.jdMethod_new(5);
    }
    else if (j > 0)
      localbz.jdMethod_new(7);
    else if (j < 0)
      localbz.jdMethod_new(6);
    if (localbz.jdMethod_do() == 104)
      bp.ag().ax();
    localbz.aA = new int[0][];
    (localbz = localbz).jdMethod_do(0);
    if ((localbz.aA.length > 0 ? 1 : 0) != 0)
    {
      localbz = this;
      jdMethod_long(this.a7);
    }
    this.y = (byte)(this.y + 1);
    jdMethod_if(a4.jdMethod_for(this.c, this.jdField_void), a4.jdMethod_int(this.c, this.jdField_void));
  }

  protected final void jdMethod_long(byte paramByte)
  {
    int i = this.aT % 7;
    switch (paramByte)
    {
    case 3:
      this.jdField_void = (short)(this.jdField_void - bj[i][1]);
      break;
    case 1:
      this.jdField_void = (short)(this.jdField_void + bj[i][1]);
      break;
    case 2:
      this.c = (short)(this.c - bj[i][0]);
      break;
    case 4:
      this.c = (short)(this.c + bj[i][0]);
      break;
    case 5:
      this.c = (short)(this.c - bj[i][2]);
      this.jdField_void = (short)(this.jdField_void - bj[i][3]);
      break;
    case 6:
      this.c = (short)(this.c + bj[i][2]);
      this.jdField_void = (short)(this.jdField_void - bj[i][3]);
      break;
    case 7:
      this.c = (short)(this.c - bj[i][2]);
      this.jdField_void = (short)(this.jdField_void + bj[i][3]);
      break;
    case 8:
      this.c = (short)(this.c + bj[i][2]);
      this.jdField_void = (short)(this.jdField_void + bj[i][3]);
    }
    this.Y = true;
  }

  public final void u()
  {
    jdMethod_do(1);
  }

  public final void h()
  {
    jdMethod_do(0);
  }

  public abstract void jdMethod_new(byte paramByte);

  public abstract byte D();

  public abstract byte M();

  public abstract byte G();

  public abstract byte x();

  public void jdMethod_if(Graphics paramGraphics)
  {
    int i = a5.iG + bf - M();
    int j = 0;
    if (this.ap != 0)
    {
      i = z;
      j = 12;
    }
    bz localbz;
    if (jdMethod_int().length() == 0)
    {
      if (jdMethod_new() == bp.ag().jdMethod_new())
      {
        this.az = (byte)(this.az ^ 0x1);
        if (!z.case)
        {
          paramGraphics.setColor(1479680);
          paramGraphics.fillTriangle(this.o - 4 - 1, this.n - aQ - this.az - j + 12, this.o + 4 + 1, this.n - aQ - this.az - j + 12, this.o, this.n - aQ - this.az - j + 13 + 6);
        }
        if (bp.ag().aI() != 0)
        {
          paramGraphics.setColor(2625633);
          paramGraphics.drawRect(this.o + 3 - 13, this.n - aQ - this.az - j + 21, 21, 2);
          paramGraphics.setColor(16776960);
          if ((bp.ag().aI() == 5) && (this.az == 0))
            paramGraphics.setColor(16711680);
          paramGraphics.fillRect(this.o + 3 - 13 + 1, this.n - aQ - this.az - j + 21 + 1, bp.ag().aI() << 2, 1);
          return;
        }
      }
      else
      {
        if (jdMethod_for() == 3)
        {
          localbz = this;
          if (this.av <= 0)
          {
            localbz = this;
            b5.jdMethod_if(paramGraphics, jdMethod_byte(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - i, jdMethod_do(this.av), 0);
          }
          else
          {
            b5.jdMethod_if(paramGraphics, jdMethod_byte(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - i, 55551, 0);
          }
          a(paramGraphics, i);
          return;
        }
        localbz = this;
        b5.jdMethod_if(paramGraphics, jdMethod_byte(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - i, jdMethod_do(this.av), 0);
        return;
      }
    }
    else
    {
      if (jdMethod_for() == 3)
      {
        localbz = this;
        if (this.av <= 0)
        {
          localbz = this;
          b5.jdMethod_if(paramGraphics, jdMethod_byte(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - i - a5.iG, jdMethod_do(this.av), 0);
          localbz = this;
          b5.jdMethod_if(paramGraphics, jdMethod_int(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_int()) >> 1), this.n - i, jdMethod_do(this.av), 0);
        }
        else
        {
          b5.jdMethod_if(paramGraphics, jdMethod_byte(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - i - a5.iG, 55551, 0);
          b5.jdMethod_if(paramGraphics, jdMethod_int(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_int()) >> 1), this.n - i, 55551, 0);
        }
        a(paramGraphics, i + a5.iG);
        return;
      }
      if (jdMethod_new() == bp.ag().jdMethod_new())
      {
        this.az = (byte)(this.az ^ 0x1);
        if (!z.case)
        {
          paramGraphics.setColor(1479680);
          paramGraphics.fillTriangle(this.o - 4 - 1, this.n - aQ - this.az - localbz + 12, this.o + 4 + 1, this.n - aQ - this.az - localbz + 12, this.o, this.n - aQ - this.az - localbz + 13 + 6);
        }
        if (bp.ag().aI() != 0)
        {
          paramGraphics.setColor(2625633);
          paramGraphics.drawRect(this.o + 3 - 13, this.n - aQ - this.az - localbz + 21, 21, 2);
          paramGraphics.setColor(16776960);
          if ((bp.ag().aI() == 5) && (this.az == 0))
            paramGraphics.setColor(16711680);
          paramGraphics.fillRect(this.o + 3 - 13 + 1, this.n - aQ - this.az - localbz + 21 + 1, bp.ag().aI() << 2, 1);
        }
      }
      else
      {
        localbz = this;
        b5.jdMethod_if(paramGraphics, jdMethod_byte(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - i - a5.iG, jdMethod_do(this.av), 0);
      }
      localbz = this;
      b5.jdMethod_if(paramGraphics, jdMethod_int(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_int()) >> 1), this.n - i, jdMethod_do(this.av), 0);
    }
  }

  public static int jdMethod_do(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    case -4:
    case -3:
    case -2:
      i = bm.cf[0];
      break;
    case -1:
      i = bm.cf[1];
      break;
    case 0:
      i = bm.cf[2];
      break;
    case 1:
    case 2:
    case 3:
    case 4:
      i = bm.cf[3];
    }
    return i;
  }

  public abstract void jdMethod_do(byte paramByte);

  public abstract void d();

  public final void a$11c44857(Graphics paramGraphics)
  {
    if (this.aI.size() == 0)
      return;
    paramGraphics.setColor(16711680);
    for (int i = 0; i < this.aI.size(); i++)
    {
      int[] arrayOfInt = (int[])(int[])this.aI.elementAt(i);
      Object localObject = null;
      int j;
      int k = j = arrayOfInt[2];
      int m = 0;
      int n = 0;
      if (arrayOfInt[1] < 0)
        m = -1;
      else if (arrayOfInt[1] > 0)
        m = 1;
      int i1 = (byte)Math.abs(arrayOfInt[1]);
      if (j == 0)
      {
        localObject = this;
        switch (this.V)
        {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
          localObject = this;
          localObject = this;
          b5.jdMethod_if(paramGraphics, au[(this.V - 1)], this.c - (paramGraphics.getFont().stringWidth(au[(this.V - 1)]) >> 1) - z.aE, this.jdField_void - z.aD - af[i1][1] - 18, 16777215, 0);
        }
      }
      else
      {
        if (j < 0)
          k = j = -j;
        localObject = new int[i2 = new String(j + "").length()];
        i2 -= 1;
        while (i2 >= 0)
        {
          localObject[i2] = (j % 10 + 1);
          j /= 10;
          i2--;
        }
        int i2 = 0;
        localObject = this;
        switch (this.V)
        {
        case 4:
        case 5:
          localObject = this;
          localObject = this;
          b5.jdMethod_if(paramGraphics, au[(this.V - 1)], this.c - (paramGraphics.getFont().stringWidth(au[(this.V - 1)]) >> 1) - z.aE, this.jdField_void - z.aD - af[i1][1] - 18, 16777215, 0);
          localObject = this;
          b5.jdMethod_case("getChanHPType()" + this.V);
          if (jdMethod_new() == bp.ag().jdMethod_new())
            i2 = 16711680;
          else if (arrayOfInt[0] == 1)
            i2 = 16776960;
          else
            i2 = 16777215;
          b5.jdMethod_if(paramGraphics, "-", this.c - z.aE - 6 + m * bs[i1][0], this.jdField_void - z.aD - bs[i1][1] - 18, i2, 0);
          b5.jdMethod_if(paramGraphics, "" + k, this.c - z.aE + m * bs[i1][0], this.jdField_void - z.aD - bs[i1][1] - 18, i2, 0);
          break;
        default:
          localObject = this;
          if (this.V == 6)
          {
            if (arrayOfInt[2] > 0)
            {
              if (i1 == 0)
              {
                n = 3;
                i2 = 65280;
              }
              else
              {
                localObject = Font.getFont(0, 0, 16);
                paramGraphics.setFont((Font)localObject);
                n = 7;
                i2 = 65280;
              }
            }
            else if (arrayOfInt[2] < 0)
              if (i1 == 0)
              {
                if (jdMethod_new() == bp.ag().jdMethod_new())
                {
                  n = 0;
                  i2 = 16711680;
                }
                else if (arrayOfInt[0] == 1)
                {
                  n = 1;
                  i2 = 16776960;
                }
                else
                {
                  n = 2;
                  i2 = 16777215;
                }
              }
              else
              {
                localObject = Font.getFont(0, 0, 16);
                paramGraphics.setFont((Font)localObject);
                if (jdMethod_new() == bp.ag().jdMethod_new())
                {
                  n = 4;
                  i2 = 16711680;
                }
                else if (arrayOfInt[0] == 1)
                {
                  n = 5;
                  i2 = 16776960;
                }
                else
                {
                  n = 6;
                  i2 = 16777215;
                }
              }
            paramGraphics.setColor(i2);
            switch (n)
            {
            case 3:
            case 7:
              b5.jdMethod_if(paramGraphics, "+", this.c - z.aE - 6 + m * af[i1][0], this.jdField_void - z.aD - af[i1][1] - 18, i2, 0);
              break;
            default:
              b5.jdMethod_if(paramGraphics, "-", this.c - z.aE - 6 + m * af[i1][0], this.jdField_void - z.aD - af[i1][1] - 18, i2, 0);
            }
            b5.jdMethod_if(paramGraphics, "" + k, this.c - z.aE + m * af[i1][0], this.jdField_void - z.aD - af[i1][1] - 18, i2, 0);
            paramGraphics.setFont(a5.fq);
          }
          else
          {
            if (arrayOfInt[2] > 0)
            {
              n = 3;
              i2 = 65280;
            }
            else if (arrayOfInt[2] < 0)
            {
              if (jdMethod_new() == bp.ag().jdMethod_new())
              {
                n = 0;
                i2 = 16711680;
              }
              else if (arrayOfInt[0] == 1)
              {
                n = 1;
                i2 = 16776960;
              }
              else
              {
                n = 2;
                i2 = 16777215;
              }
            }
            switch (n)
            {
            case 3:
              b5.jdMethod_if(paramGraphics, "+", this.c - z.aE - 6 + m * bs[i1][0], this.jdField_void - z.aD - bs[i1][1] - 18, i2, 0);
              break;
            default:
              b5.jdMethod_if(paramGraphics, "-", this.c - z.aE - 6 + m * bs[i1][0], this.jdField_void - z.aD - bs[i1][1] - 18, i2, 0);
            }
            b5.jdMethod_if(paramGraphics, "" + k, this.c - z.aE + m * bs[i1][0], this.jdField_void - z.aD - bs[i1][1] - 18, i2, 0);
          }
        }
      }
    }
  }

  public final void a(int[] paramArrayOfInt)
  {
    this.aI.addElement(paramArrayOfInt);
  }

  public final void I()
  {
    if (this.aI.size() == 0)
      return;
    for (int i = 0; i < this.aI.size(); i++)
    {
      this.U = (byte)(-this.U);
      int[] arrayOfInt;
      if ((arrayOfInt = (int[])(int[])this.aI.elementAt(i))[1] >= aK - 1)
      {
        arrayOfInt[1] = (byte)(aK - 1);
        this.aI.removeElementAt(i);
      }
      else if (arrayOfInt[1] <= -(aK - 1))
      {
        arrayOfInt[1] = (byte)(-(aK - 1));
        this.aI.removeElementAt(i);
      }
      else
      {
        if (arrayOfInt[1] == 0)
          arrayOfInt[1] = this.U;
        else if (arrayOfInt[1] < 0)
          arrayOfInt[1] -= 1;
        else
          arrayOfInt[1] += 1;
        this.aI.setElementAt(arrayOfInt, i);
      }
    }
  }

  public static bz a(a4 parama4, byte paramByte)
  {
    Object localObject;
    switch (paramByte)
    {
    case 0:
      switch (parama4.jdField_try)
      {
      case 1:
        paramByte = (b)parama4;
        (localObject = new b()).jdField_try = parama4.jdMethod_for();
        ((a4)localObject).h = 0;
        ((b)localObject).co = paramByte.co;
        ((bz)localObject).aR = paramByte.aR;
        ((bz)localObject).aT = paramByte.aT;
        ((b)localObject).jdMethod_do(0);
        ((b)localObject).jdMethod_new(1);
        return localObject;
      case 3:
        paramByte = (w)parama4;
        (localObject = new w()).jdField_try = parama4.jdMethod_for();
        ((t)localObject).bI = paramByte.bI;
        ((t)localObject).bH = paramByte.bH;
        b5.jdMethod_case("copyGameObject__type=" + ((a4)localObject).jdField_try);
        ((a4)localObject).h = 0;
        ((t)localObject).bZ = 0;
        ((t)localObject).bE = 0;
        ((bz)localObject).aT = paramByte.aT;
        ((t)localObject).jdMethod_do(0);
        ((t)localObject).jdMethod_new(1);
        return localObject;
      }
    case 1:
      paramByte = (b)parama4;
      (localObject = new b()).jdField_try = 9;
      ((a4)localObject).jdField_goto = 0;
      ((bz)localObject).aR = paramByte.aR;
      ((b)localObject).co = paramByte.co;
      ((a4)localObject).h = 0;
      ((b)localObject).dt = paramByte.dt;
      ((bz)localObject).ap = 2;
      ((b)localObject).jdMethod_do(0);
      ((bz)localObject).aT = paramByte.aT;
      ((b)localObject).jdMethod_new((parama4 = paramByte).a7);
      ((bz)localObject).W = null;
      return localObject;
    }
    return (bz)null;
  }

  public final void p()
  {
    if (this.W == null)
    {
      E();
      return;
    }
    g();
  }

  public final void a$7efcb6ee(byte paramByte, short[][] paramArrayOfShort)
  {
    int i;
    for (byte b1 = 94; b1 < 124; b1 = (short)(b1 + 1))
    {
      i = this.aR[b1].length;
      for (int j = 0; j < i; j = (byte)(j + 1))
        for (byte b2 = 0; b2 < paramByte; b2++)
          for (int k = 0; k < this.al[b2].length; k++)
          {
            if (this.aR[b1][j] != this.al[b2][k])
              continue;
            this.aR[b1][j] = paramArrayOfShort[b2][k];
          }
    }
    for (b1 = 0; b1 < paramByte; b1++)
      for (i = 0; i < paramArrayOfShort[b1].length; i++)
        this.al[b1][i] = paramArrayOfShort[b1][i];
  }

  public final void k()
  {
    l.jdMethod_if(this.W);
    this.W = null;
    this.x = 0;
    this.w = 0;
    this.Y = false;
    this.X = 1;
    this.bo = 0;
    this.ap = 1;
    jdMethod_do(0);
  }

  public final void j()
  {
    g();
    this.W = ((b)a(this, 1));
    this.W.c = (this.aw[0][0] = this.c);
    this.W.jdField_void = (this.aw[0][1] = this.jdField_void);
    bz localbz = this;
    this.aw[0][2] = (short)this.a7;
    this.W.jdMethod_new((byte)this.aw[0][2]);
    this.ap = 1;
    jdMethod_do(0);
  }

  public final void E()
  {
    this.ap = 0;
    if (jdMethod_do() != 9)
      jdMethod_do(0);
    short[][] arrayOfShort = { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 }, { 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 }, { 607, 608 } };
    a$7efcb6ee(6, arrayOfShort);
  }

  public final void g()
  {
    l.jdMethod_if(this.W);
    this.W = null;
    this.x = 0;
    this.w = 0;
    this.Y = false;
    for (int i = 0; i < this.aw.length; i++)
      for (int j = 0; j < this.aw[i].length; j++)
        this.aw[i][j] = 0;
    this.X = 1;
    this.bo = 0;
    this.ap = 0;
    if (jdMethod_do() != 9)
      jdMethod_do(0);
    short[][] arrayOfShort = { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 }, { 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 }, { 607, 608 }, { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 }, { 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
    a$7efcb6ee(13, arrayOfShort);
  }

  public final boolean a(a4 parama4, short paramShort, byte paramByte1, byte paramByte2)
  {
    parama4 = new a6(parama4, paramShort, paramByte1, paramByte2);
    this.aG.addElement(parama4);
    return true;
  }

  public final void jdMethod_new(int paramInt)
  {
    for (int i = 0; i < this.aG.size(); i++)
    {
      a6 locala6;
      if (((locala6 = (a6)this.aG.elementAt(i)) == null) || (locala6.jdField_byte == null) || (locala6.jdField_byte.jdMethod_new() != paramInt) || (locala6.a == 2))
        continue;
      this.aG.removeElement(locala6);
      i--;
    }
  }

  public final void t()
  {
    Object localObject1 = this;
    int j = 0;
    for (int i = 0; i < ((bz)localObject1).aG.size(); i++)
    {
      a6 locala6;
      if ((locala6 = (a6)((bz)localObject1).aG.elementAt(i)).a == 0)
      {
        ((bz)localObject1).aG.removeElementAt(i);
        ((bz)localObject1).aG.insertElementAt(locala6, 0);
        j = (byte)(j + 1);
      }
      else
      {
        if (locala6.a != 1)
          continue;
        ((bz)localObject1).aG.removeElementAt(i);
        ((bz)localObject1).aG.insertElementAt(locala6, j);
      }
    }
    for (i = this.aG.size() - 1; i >= 0; i--)
    {
      (localObject1 = (a6)this.aG.elementAt(i)).jdMethod_do();
      if (!((a6)localObject1).jdMethod_if())
        continue;
      Object localObject2 = localObject1;
      localObject1 = this;
      this.aG.removeElement(localObject2);
    }
  }

  public final void jdMethod_do(Graphics paramGraphics)
  {
    for (int i = 0; i < this.aG.size(); i++)
    {
      a6 locala6 = (a6)this.aG.elementAt(i);
      if ((this instanceof bp))
      {
        bp.ag();
        if ((bp.c(locala6.jdField_if)) && ((a5.V() != 0) || (a5.gQ != null)))
          continue;
      }
      locala6.a(paramGraphics);
    }
  }

  private void a(Graphics paramGraphics, int paramInt)
  {
    if (((this instanceof w)) && (((w)this).Q() != 0))
    {
      int i = a5.iG - a5.gz.a >> 1;
      switch (((w)this).Q())
      {
      case 4:
        if (a5.ht % 6 < 3)
          break;
        a5.gz.jdMethod_if(paramGraphics, this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - paramInt + i, 0);
        return;
      case 6:
        if (a5.ht % 6 < 3)
          break;
        a5.gz.jdMethod_if(paramGraphics, this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - paramInt + i, 1);
      }
    }
  }

  public final void jdMethod_for(Graphics paramGraphics)
  {
    if ((bp.ag().fK) && (a5.V() == 0) && (a5.gQ == null))
    {
      int i = this.o - (a5.eP.getWidth() >> 1);
      int j = this.n - (a5.eP.getHeight() << 2);
      b5.a(paramGraphics, a5.eP, i, j - this.bd, 0);
      this.bd += 1;
    }
    if ((this.bd != 0) && (this.bd > 6))
    {
      this.bd = 0;
      if (bp.ag().fK)
        bp.ag().fK = false;
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bz
 * JD-Core Version:    0.6.0
 */
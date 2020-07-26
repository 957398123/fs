import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public final class a7 extends ba
{
  private short fK;
  private short fA;
  private bi eW;
  private String fx;
  private byte fL = -1;
  private bz fe = null;
  private boolean e5 = false;
  private byte eA = 0;
  private boolean eI = false;
  private Image[] eV = new Image[3];
  private Image e0 = null;
  private short ff = 1;
  public boolean eT = false;
  public byte ei = -1;
  public boolean ft = false;
  private short eC = -1;
  public boolean fz = false;
  private short fm = -1;
  public byte fd = -1;
  private boolean fG = false;
  private String eH = null;
  private short et = 0;
  private short eU = 0;
  private int fD = 0;
  private byte fy = -1;
  private byte ew = -1;
  public static byte fF;
  public byte el = -1;
  private boolean fI = false;
  public byte eK = -1;
  public byte eD = -1;
  public int fg = 0;
  private short eu = 0;
  private short eF = 0;
  private short es = 0;
  private short er = 0;
  public byte eJ = -1;
  public static byte fs;
  public static byte eB;
  public static byte e3;
  public b eo;
  private short eQ = 0;
  public boolean eY = false;
  private byte e8 = 0;
  private String en = "";
  private String eR = "";
  private byte eG = 0;
  private String fq = "";
  private byte fB = 0;
  private int eE = 0;
  private int e6 = 0;
  private byte e2 = 1;
  private byte eO = 0;
  public byte fC = 0;
  public static boolean ej;
  public static boolean em;

  public final void jdMethod_if(short paramShort, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.eC = r.k(paramShort);
      return;
    }
    this.eC = paramShort;
  }

  public final short bK()
  {
    return this.fm;
  }

  public final void e(short paramShort)
  {
    this.fm = r.k(paramShort);
  }

  public final short bu()
  {
    return this.eQ;
  }

  public final void c(short paramShort)
  {
    this.eQ = paramShort;
  }

  public final void jdMethod_void(short paramShort)
  {
    this.ff = paramShort;
  }

  public a7(short paramShort1, short paramShort2, short paramShort3, short paramShort4, String paramString, byte paramByte, be parambe)
  {
    super(paramShort1, paramShort2, paramShort3, paramShort4, parambe);
    try
    {
      be.gf.getClass();
    }
    catch (Exception localException)
    {
      (paramShort1 = a5.dI).notifyDestroyed();
    }
    this.y = paramByte;
    if ((paramByte != 4) && (paramByte != 5))
      if ((paramString == null) || (paramString.equals("")))
      {
        this.eW = null;
      }
      else if (paramString.equals("exp.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        jdMethod_if(43, true);
      }
      else if (paramString.equals("t-0.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        jdMethod_if(10, true);
      }
      else if (paramString.equals("u-6.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        jdMethod_if(57, true);
      }
      else if (paramString.equals("u-7.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        jdMethod_if(58, true);
      }
      else if (paramString.equals("u-8.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        jdMethod_if(67, true);
      }
      else if (paramString.equals("u-9.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        jdMethod_if(64, true);
      }
      else if (paramString.equals("u-4.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        if ((bo.q == 1) || (bo.q == 9))
          jdMethod_if(65, true);
        else if ((bo.q == 0) || (bo.q == 10))
          jdMethod_if(63, true);
      }
      else if (paramString.equals("u-1.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        jdMethod_if(65, true);
      }
      else if (paramString.equals("u-3.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        jdMethod_if(63, true);
      }
      else if (paramString.equals("long.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        jdMethod_if(72, true);
        this.fC = 5;
      }
      else if (paramString.equals("cross.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        jdMethod_if(73, true);
        this.fC = 4;
      }
      else if (paramString.equals("clanctr.png"))
      {
        paramShort2 = a5.gg;
        paramShort1 = this;
        this.eW = paramShort2;
        this.ft = true;
        this.eC = 44;
        this.fC = 2;
      }
    if ((paramByte == 3) || (paramByte == 1) || (paramByte == 2) || (paramByte == 0))
      this.b = true;
    paramShort1 = this;
    if ((this.y == 1) || (paramShort1.y == 3))
    {
      if ((paramShort1.eW == null) || (paramShort1.eW.jdField_if == null) || (paramShort1.ft))
        paramShort1.fK = 14;
      else
        paramShort1.fK = (short)paramShort1.eW.jdField_if.getWidth();
      paramShort1.a = paramShort1.fK;
    }
    paramShort1 = this;
    if ((this.y == 1) || (paramShort1.y == 3))
    {
      if ((paramShort1.eW == null) || (paramShort1.eW.jdField_if == null) || (paramShort1.ft))
        paramShort1.fA = 14;
      else
        paramShort1.fA = (short)paramShort1.eW.jdField_if.getHeight();
      paramShort1.jdField_int = paramShort1.fA;
    }
  }

  public a7(short paramShort1, short paramShort2, String paramString1, String paramString2, byte paramByte, be parambe)
  {
    this(paramShort1, paramShort2, 0, 0, paramString1, paramByte, parambe);
  }

  public a7(short paramShort1, short paramShort2, be parambe)
  {
    this(21, paramShort2, 0, 0, "", 5, parambe);
  }

  public final void a(Graphics paramGraphics)
  {
    int m;
    if (this.y == 0)
    {
      paramGraphics.setColor(bm.an);
      paramGraphics.drawRect(this.k, this.j, this.a - 1, this.jdField_int - 1);
      paramGraphics.setColor(bm.am);
      paramGraphics.drawRect(this.k + 1, this.j + 1, this.a - 3, this.jdField_int - 3);
      paramGraphics.setColor(bm.an);
      paramGraphics.drawRect(this.k + 2, this.j + 2, this.a - 5, this.jdField_int - 5);
      paramGraphics.setColor(bm.o);
      paramGraphics.fillRect(this.k + 3, this.j + 3, this.a - 6, this.jdField_int - 6);
      paramGraphics.drawImage(a5.gr, this.k, this.j, 20);
      b5.a(paramGraphics, a5.gr, this.k + this.a - a5.gr.getWidth(), this.j, 2);
      b5.a(paramGraphics, a5.gr, this.k, this.j + this.jdField_int - a5.gr.getHeight(), 1);
      b5.a(paramGraphics, a5.gr, this.k + this.a - a5.gr.getWidth(), this.j + this.jdField_int - a5.gr.getHeight(), 3);
      int i = 0;
      m = 0;
      if (a5.jdMethod_else() == 5)
      {
        if (this.fG)
        {
          if (this.ff < 100)
            i = this.k + (this.a - (a5.eR.jdField_try << 1) - 2) / 2;
          else if ((i = this.k + (this.a - a5.eR.jdField_try * 3 - 4) / 2) < this.k)
            i = this.k;
          if ((m = this.j + (this.jdField_int - 30 - a5.eR.a - 3) / 2) < this.j)
            m = this.j;
          b5.a(paramGraphics, this.ff, i, m - 1);
          this.eu = 27;
          this.eF = 30;
          this.es = (short)(this.a >= this.eu ? this.k + (this.a - this.eu) / 2 : this.k - (this.eu - this.a) / 2);
          this.er = (short)(m + a5.eR.a + 3);
        }
        else
        {
          this.eu = 27;
          this.eF = 30;
          this.es = (short)(this.a >= this.eu ? this.k + (this.a - this.eu) / 2 : this.k - (this.eu - this.a) / 2);
          this.er = (short)(this.j + (this.jdField_int - 30) / 2);
        }
        if (this.fe != null)
        {
          this.fe.d();
          this.fe.a(paramGraphics, (short)(this.eu / 2 + this.es), (short)(this.er + 30));
        }
        if (am.new > 0)
        {
          this.eu = (short)a5.fh.getWidth();
          this.eF = (short)a5.fh.getHeight();
          this.es = (short)(this.a >= this.eu ? this.k + (this.a - this.eu) / 2 : this.k - (this.eu - this.a) / 2);
          this.er = (short)(this.j + (this.jdField_int - a5.fh.getHeight()) / 2);
          this.e2 = (byte)(this.e2 ^ 0x1);
          int i1 = (short)(this.er + this.e2);
          m = this.es;
          Graphics localGraphics1;
          (localGraphics1 = paramGraphics).drawImage(a5.fh, m, i1, 20);
        }
      }
      if ((a5.gA != null) && ((a5.jdMethod_else() == 17) || (a5.df == 17)))
      {
        this.eu = 27;
        this.eF = 30;
        this.es = (short)(this.a >= this.eu ? this.k + (this.a - this.eu) / 2 : this.k - (this.eu - this.a) / 2);
        if ((this.eW != null) && (this.eW.jdField_if != null))
        {
          if ((m = this.j + (this.jdField_int - this.eW.jdField_if.getHeight()) / 2) < this.j)
            m = this.j;
          this.er = (short)m;
          this.er = (short)(this.er + (this.eF / 2 + 12));
        }
        else
        {
          if ((m = this.j + (this.jdField_int - this.eF) / 2) < this.j)
            m = this.j;
          this.er = (short)m;
          this.er = (short)(this.er + (this.eF / 2 + 15));
        }
        if (this.eo != null)
          this.eo.a(paramGraphics, (short)(this.eu / 2 + this.es), this.er, true);
        if (q())
          paramGraphics.drawImage(a5.gA, this.k + this.a - a5.gA.getWidth() / 2, this.j + this.jdField_int - a5.gA.getHeight() / 2, 20);
      }
      else if ((a5.jdMethod_else() == 18) || (a5.df == 18) || (a5.jdMethod_else() == 18))
      {
        this.eu = 27;
        this.eF = 30;
        this.es = (short)(this.a >= this.eu ? this.k + (this.a - this.eu) / 2 : this.k - (this.eu - this.a) / 2);
        this.er = (short)(this.j + (this.jdField_int - this.eF) / 2 + this.eF / 2 + 15);
        if (this.eo != null)
          this.eo.a(paramGraphics, (short)(this.eu / 2 + this.es), this.er, true);
      }
      if ((a5.es != null) && (a5.es.g9 == 2097155))
        for (this = 0; this < 7; this++)
        {
          by.goto[this] = ((a7)a5.es.cf().elementAt(this + 10));
          a5.gg.jdMethod_if(paramGraphics, by.goto[this].k + (by.goto[this].jdMethod_for() >> 1) - 7, by.goto[this].j + (by.goto[this].z() >> 1) - 7, by.byte[this]);
        }
      return;
    }
    if (this.y == 1)
    {
      if (!this.eI)
        jdMethod_if(paramGraphics, this.fK, this.fA);
      if (this.eW != null)
        if (this.eW.jdField_if != null)
        {
          int j = this.eI ? this.k : this.k + 1;
          m = this.eI ? this.j : this.j + 1;
          if (this.ft)
          {
            if (this.fC > -1)
            {
              paramGraphics.setColor(bm.O[this.fC][0]);
              paramGraphics.fillRect(j, m, this.eW.jdField_try, this.eW.a);
              this.eW.jdMethod_if(paramGraphics, j, m, this.eC);
              paramGraphics.setColor(bm.O[this.fC][1]);
              paramGraphics.drawRect(j - 1, m - 1, this.eW.jdField_try + 1, this.eW.a + 1);
              break label1531;
            }
          }
          else
            this.eW.a(paramGraphics, j, m, 0);
        }
        else
        {
          throw new IllegalArgumentException("图像不存在");
        }
      label1531: a7 locala7;
      if (this.eI)
      {
        Graphics localGraphics2 = paramGraphics;
        locala7 = this;
        localGraphics2.setColor(bm.V);
        localGraphics2.drawRect(locala7.k, locala7.j, locala7.fK - 1, locala7.fA - 1);
      }
      if (this.e5)
        a(paramGraphics, this.k, this.j, this.eA);
      if (a5.es.g9 == 2555905)
      {
        locala7 = this;
        if (this.e8 == 0)
        {
          paramGraphics.drawImage(a5.e3, this.k, this.j, 20);
        }
        else
        {
          locala7 = this;
          paramGraphics.setColor(this.eE);
          paramGraphics.drawRect(this.k, this.j, jdMethod_for() + 1, z() + 1);
        }
      }
      if (a5.es.g9 == 3342340)
      {
        locala7 = this;
        if (this.e8 == 0)
          paramGraphics.drawImage(a5.e3, this.k, this.j, 20);
      }
      if ((q()) && (a5.gA != null))
        if (this.eJ != -1)
          b5.a(paramGraphics, a5.gA, this.k - 12, this.j + 2, 2);
        else if ((a5.es.g9 == 1900547) || (a5.es.g9 == 2031621) || (a5.es.g9 == 2031636) || (a5.es.g9 == 2228225) || (a5.es.g9 == 1966097) || (a5.es.g9 == 458760) || (a5.es.g9 == 1179658) || (a5.es.g9 == 2555905) || (a5.es.g9 == 2555911) || (a5.es.g9 == 3145729) || (a5.es.g9 == 3145730) || (a5.es.g9 == 2228256) || (a5.es.g9 == 3342340) || (a5.es.g9 == 3342356) || (a5.es.g9 == 917525))
          b5.jdMethod_int(paramGraphics, this.k, this.j, this.a + 2, this.jdField_int + 2);
        else
          paramGraphics.drawImage(a5.gA, this.k + 10, this.j + 10, 20);
      if (this.fI)
      {
        b5.jdMethod_int(paramGraphics, this.k, this.j, this.fK + 2, this.fA + 2);
        return;
      }
    }
    else if (this.y == 2)
    {
      if (this.eW != null)
        if (this.eW.jdField_if != null)
        {
          if (this.eT)
            this.eW.jdMethod_if(paramGraphics, this.k, this.j, this.ei);
          else
            this.eW.a(paramGraphics, this.k, this.j, this.fg);
        }
        else
          throw new IllegalArgumentException("图像不存在");
      if ((q()) && (a5.gA != null))
      {
        paramGraphics.drawImage(a5.gA, this.k + 10, this.j + 10, 20);
        return;
      }
    }
    else
    {
      int k;
      if (this.y == 3)
      {
        jdMethod_if(paramGraphics, 14, 14);
        if ((this.fx != null) && (!this.fx.equals("")))
        {
          k = this.k + (16 - b5.jdMethod_do(this.fx)) / 2;
          int n = this.j + (16 - a5.iG) / 2;
          paramGraphics.setColor(bm.a1);
          paramGraphics.drawString(this.fx, k, n, 20);
        }
        if (this.eW != null)
          if (this.eW.jdField_if != null)
          {
            if (this.fz)
            {
              if (this.fC > -1)
              {
                paramGraphics.setColor(bm.O[this.fC][0]);
                paramGraphics.fillRect(this.k + 1, this.j + 1, this.eW.jdField_try, this.eW.a);
                this.eW.jdMethod_if(paramGraphics, this.k + 1, this.j + 1, this.fm);
                paramGraphics.setColor(bm.O[this.fC][1]);
                paramGraphics.drawRect(this.k, this.j, this.eW.jdField_try + 1, this.eW.a + 1);
              }
            }
            else
              this.eW.a(paramGraphics, this.k + 1, this.j + 1, 0);
          }
          else
            throw new IllegalArgumentException("图像不存在");
        if (this.fI)
        {
          b5.jdMethod_int(paramGraphics, this.k, this.j, this.eW.jdField_try + 1, this.eW.a + 1);
          return;
        }
      }
      else
      {
        if (this.y == 4)
        {
          switch (this.fL)
          {
          case 0:
            this.eV[0] = a5.e9;
            this.eV[1] = a5.e9;
            this.eV[2] = a5.e9;
            break;
          case 1:
            this.eV[0] = a5.f7;
            this.eV[1] = a5.f7;
            this.eV[2] = a5.f7;
            break;
          case 2:
            this.eV[0] = a5.f7;
            this.eV[1] = a5.f7;
            this.eV[2] = a5.e9;
            break;
          case 3:
            this.eV[0] = a5.e9;
            this.eV[1] = a5.f7;
            this.eV[2] = a5.f7;
            break;
          case 4:
            this.eV[0] = a5.e9;
            this.eV[1] = a5.f7;
            this.eV[2] = a5.e9;
            break;
          case 5:
            this.eV[0] = a5.f7;
            this.eV[1] = a5.e9;
            this.eV[2] = a5.f7;
            break;
          case 6:
            this.eV[0] = a5.f7;
            this.eV[1] = a5.e9;
            this.eV[2] = a5.e9;
            break;
          case 7:
            this.eV[0] = a5.e9;
            this.eV[1] = a5.e9;
            this.eV[2] = a5.f7;
          }
          for (k = 0; k < this.eV.length; k++)
            paramGraphics.drawImage(this.eV[k], this.k, this.j + k * (a5.e9.getHeight() + 1), 20);
          return;
        }
        if (this.y == 5)
        {
          this.e0 = a5.fv;
          paramGraphics.drawImage(this.e0, this.k, this.j, 20);
        }
      }
    }
  }

  public final void f(Graphics paramGraphics)
  {
    if (a5.es.g9 == 2097155)
    {
      paramGraphics = paramGraphics;
      this = this;
      if (q())
        b5.a(paramGraphics, this.fx, this.k + (16 - b5.jdMethod_do(this.fx)) / 2, this.j + (16 - a5.iG) / 2, bm.a1, bm.cE);
      return;
    }
    if ((q()) && (a5.gA != null))
      paramGraphics.drawImage(a5.gA, this.k + 10, this.j + 10, 20);
  }

  public final bi bE()
  {
    return this.eW;
  }

  public final void a(bi parambi)
  {
    this.eW = parambi;
  }

  public final void jdMethod_case(String paramString)
  {
    if ((paramString == null) || (paramString.length() != 1) || (this.y != 3))
      return;
    b5.jdMethod_case("---设置文字 = " + paramString);
    this.fx = paramString;
  }

  private void jdMethod_if(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    jdMethod_if(paramGraphics, this.k, this.j, paramInt1, paramInt2);
  }

  public static void jdMethod_if(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(bm.V);
    paramGraphics.drawRect(paramInt1, paramInt2, paramInt3 + 1, paramInt4 + 1);
    paramGraphics.setColor(bm.bX);
    paramGraphics.fillRect(paramInt1 + 1, paramInt2 + 1, paramInt3, paramInt4);
  }

  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt1 = paramInt1 + 14 + 2 - 2 * a5.cG.jdField_try + 1;
    paramInt2 = paramInt2 + 14 + 2 - a5.cG.a;
    a5.cG.jdMethod_if(paramGraphics, paramInt1, paramInt2, paramInt3 / 10);
    a5.cG.jdMethod_if(paramGraphics, paramInt1 + a5.cG.jdField_try - 1, paramInt2, paramInt3 % 10);
  }

  public final void f(byte paramByte)
  {
    if ((paramByte < 0) || (paramByte > 7))
      throw new IllegalArgumentException("八卦类型不符合");
    this.fL = paramByte;
  }

  public final void g(boolean paramBoolean)
  {
    this.e5 = paramBoolean;
  }

  public final void a(boolean paramBoolean, byte paramByte)
  {
    this.e5 = paramBoolean;
    if (paramBoolean)
      jdMethod_long(paramByte);
  }

  public final byte b0()
  {
    return this.eA;
  }

  public final void jdMethod_long(byte paramByte)
  {
    if ((paramByte < 0) || (paramByte > 99))
      throw new IllegalArgumentException("物品数量参数不符合要求");
    this.eA = paramByte;
  }

  public final void i(boolean paramBoolean)
  {
    this.eI = paramBoolean;
  }

  public final void f(boolean paramBoolean)
  {
    this.fG = paramBoolean;
  }

  public final String bv()
  {
    return this.eH;
  }

  public final void jdMethod_else(String paramString)
  {
    this.eH = paramString;
  }

  public final void f()
  {
    if (!q())
      return;
    label1488: Object localObject4;
    Object localObject13;
    Object localObject6;
    if (this.jdField_byte)
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
      if ((a5.jdMethod_byte(65536)) || (a5.jdMethod_byte(131072)))
      {
        y().dc();
        int i;
        if (this.y == 3)
        {
          switch (this.r)
          {
          case 16:
            switch (this.eO)
            {
            case 0:
              switch (a5.es.g9)
              {
              case 1966086:
                i = ((Integer)y().db().elementAt(y().de())).intValue();
                au.if = 2;
                au.int = fF;
                if (i == 3342338)
                  am.a = false;
                a5.eQ.a(i);
                this.jdField_byte = false;
                break;
              case 458817:
                i = ((Integer)y().db().elementAt(y().de())).intValue();
                bb.void = fF;
                bb.do = 2;
                if (i == 3342338)
                  am.a = false;
                a5.eQ.a(i);
                this.jdField_byte = false;
                break;
              case 939349:
                i = ((Integer)y().db().elementAt(y().de())).intValue();
                bx.a = 1;
                bx.for = fF;
                if (i == 3342338)
                  am.a = false;
                a5.eQ.a(i);
                this.jdField_byte = false;
                break;
              default:
                if (this.fm == -1)
                {
                  a5.eQ.a(2425072);
                  this.jdField_byte = false;
                }
                else
                {
                  switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
                  {
                  case 2425072:
                    a5.eQ.a(i);
                    this.jdField_byte = false;
                    break;
                  case 917507:
                    au.if = 2;
                    au.case = 0;
                    break;
                  case 917506:
                    a5.eQ.a(i);
                    this.jdField_byte = false;
                    break;
                  case 1245185:
                    be.a(1, this.ew);
                    this.jdField_byte = false;
                    break;
                  case 3342338:
                    a5.eQ.a(i);
                    this.jdField_byte = false;
                  }
                }
              }
            }
            break;
          case 115:
            switch (this.eO)
            {
            case 0:
              if ((i = ((Integer)y().db().elementAt(y().de())).intValue()) == 3342338)
                am.a = false;
              a5.eQ.a(i);
              this.jdField_byte = false;
            }
          }
          return;
        }
        if (this.y == 1)
        {
          int i1;
          if (this.eJ != -1)
          {
            fs = this.eK;
            eB = this.eD;
            if ((i = ((Integer)y().db().elementAt(y().de())).intValue()) == 0)
            {
              if (this.eK == 1)
              {
                b5.jdMethod_int();
                e3 = this.eD;
                this.fI = true;
                this.jdField_byte = false;
                break label1488;
              }
            }
            else
            {
              if (i == 262150)
              {
                if (bf.for)
                {
                  if (e3 == -1)
                  {
                    (a5.gQ = new as(0, null)).a(5, bm.dt, "请于下方选择一样物品作为您的附加奖励", bm.a2[2], "", -1, -1);
                    this.jdField_byte = false;
                    break label1488;
                  }
                  a5.eQ.a(i);
                  this.jdField_byte = false;
                  break label1488;
                }
                a5.eQ.a(i);
                this.jdField_byte = false;
                break label1488;
              }
              if (i == 1245185)
              {
                i1 = fs * 10 + eB;
                b5.jdMethod_case("物品IDEX " + i1);
                an.a = true;
                be.a(5, i1);
                this.jdField_byte = false;
                break label1488;
              }
              if (i == -1)
              {
                this.jdField_byte = false;
                break label1488;
              }
              a5.eQ.a(i);
              this.jdField_byte = false;
            }
          }
          else
          {
            switch (this.r)
            {
            case 34:
              if ((ej) && (em))
              {
                if (this.eC != -1)
                  switch (y().de())
                  {
                  case 0:
                    ba.i();
                    a5.eQ.a(1376267);
                    this.jdField_byte = false;
                    break;
                  case 1:
                    a5.eQ.a(1376266);
                    this.jdField_byte = false;
                  default:
                    break;
                  }
                else
                  switch (y().de())
                  {
                  case 0:
                    a5.eQ.a(1376266);
                    this.jdField_byte = false;
                  }
              }
              else if ((ej) && (!em))
              {
                if (this.eC == -1)
                  break;
                switch (y().de())
                {
                case 0:
                  ba.i();
                  a5.eQ.a(1376267);
                  this.jdField_byte = false;
                }
              }
              else
              {
                if (ej)
                  break;
                if (this.eC != -1)
                  switch (y().de())
                  {
                  case 0:
                    ba.i();
                    a5.eQ.a(1376267);
                    this.jdField_byte = false;
                    break;
                  case 1:
                    ba.i();
                    a5.eQ.a(1376268);
                    this.jdField_byte = false;
                    break;
                  case 2:
                    a5.eQ.a(1376264);
                    this.jdField_byte = false;
                    break;
                  case 3:
                    a5.eQ.a(1376265);
                    this.jdField_byte = false;
                    break;
                  case 4:
                    a5.eQ.a(1376266);
                    this.jdField_byte = false;
                  default:
                    break;
                  }
                else
                  switch (y().de())
                  {
                  case 0:
                    if (a5.fE.size() == 0)
                      a5.eQ.a(1376263);
                    else
                      a5.es = (be)a5.fE.elementAt(0);
                    this.jdField_byte = false;
                    break;
                  case 1:
                    a5.eQ.a(1376264);
                    this.jdField_byte = false;
                    break;
                  case 2:
                    a5.eQ.a(1376265);
                    this.jdField_byte = false;
                    break;
                  case 3:
                    a5.eQ.a(1376266);
                    this.jdField_byte = false;
                  }
              }
              break;
            case 35:
              if ((em) && (ej))
                if (this.eC == -1)
                  break;
              else
                switch (y().de())
                {
                case 0:
                  ba.i();
                  a5.eQ.a(1376267);
                  this.jdField_byte = false;
                  break;
                case 1:
                  a5.eQ.a(1376266);
                  this.jdField_byte = false;
                default:
                  break;
                  if (this.eC == -1)
                    break;
                  switch (y().de())
                  {
                  case 0:
                    ba.i();
                    a5.eQ.a(1376267);
                    this.jdField_byte = false;
                  }
                }
            }
          }
          a7 locala73;
          if ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952) || (a5.es.g9 == 1703938))
          {
            i = ((Integer)y().db().elementAt(y().de())).intValue();
            if (this.eC == -1)
              switch (i)
              {
              case -1610612712:
                q.j = 0;
                r.ed();
                q.jdMethod_if();
                break;
              case -1610612711:
                q.jdMethod_for();
                break;
              case 1703946:
                q.j = 0;
                for (i1 = 0; i1 < 6; i1++)
                  for (int i3 = 0; i3 < 4; i3++)
                    r.mE[i1][i3] = q.int[i1][i3];
                for (i1 = 0; i1 < r.mE.length; i1++)
                {
                  if ((r.mE[i1][0] == -1) || (q.j >= r.mE.length))
                    continue;
                  q.j = (byte)(q.j + 1);
                }
                a5.eQ.a(1703946);
                break;
              default:
                a5.eQ.a(i);
                break;
              }
            else if (this.eC != -1)
              switch (i)
              {
              case -1610612710:
                this.fC = 0;
                this.ft = false;
                this.eC = -1;
                Object localObject14 = null;
                locala73 = this;
                this.eW = localObject14;
                r.eg();
                q.jdMethod_if();
                break;
              case -1610612712:
                q.j = 0;
                r.ed();
                q.jdMethod_if();
                break;
              case -1610612711:
                q.jdMethod_for();
                break;
              default:
                a5.eQ.a(i);
              }
            this.jdField_byte = false;
            return;
          }
          if ((a5.es.g9 == 1703940) || (a5.es.g9 == 1703941))
          {
            i = ((Integer)y().db().elementAt(y().de())).intValue();
            q.a = this.fd;
            locala73 = this;
            r.E(this.fy);
            if (i == 1703952)
            {
              q.l = true;
              a5.eQ.a(i);
              this.jdField_byte = false;
            }
            else
            {
              if (i != -1)
              {
                a5.eQ.a(i);
                this.jdField_byte = false;
              }
              return;
            }
          }
          else if (a5.es.g9 == 1900547)
          {
            if (bw.a == 1)
            {
              switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
              {
              case -1610612713:
                bw.jdMethod_do();
                break;
              case -1610612714:
                bw.jdMethod_if(1);
              }
              this.jdField_byte = false;
              return;
            }
          }
          else
          {
            Object localObject1;
            a7 locala71;
            Object localObject5;
            int i5;
            if (a5.es.g9 == 2031621)
            {
              localObject1 = (a7)a5.es.cf().elementAt(4);
              locala71 = (a7)a5.es.cf().elementAt(6);
              localObject5 = (ah)a5.es.cf().elementAt(14);
              switch (i5 = ((Integer)y().db().elementAt(y().de())).intValue())
              {
              case -1610612707:
                if (((ba)localObject1).q())
                {
                  aq.for = 1;
                  ((ba)localObject1).a(false, a5.es);
                }
                else if (locala71.q())
                {
                  aq.for = 2;
                  locala71.a(false, a5.es);
                }
                (localObject1 = (r)a5.es.cf().elementAt(9)).a(true, a5.es);
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
              case -1610612704:
                for (int i8 = 0; i8 < r.mY.length; i8++)
                  r.mY[i8] = -1;
                Object localObject8;
                if (((ba)localObject1).q())
                {
                  boolean bool1 = false;
                  (localObject8 = localObject1).e5 = bool1;
                  ((a7)localObject1).ft = false;
                  Object localObject15 = null;
                  (localObject8 = localObject1).eW = localObject15;
                  aq.a = -1;
                  ((ah)localObject5).jdMethod_char(bm.bP);
                  ((ah)localObject5).a("此处放置原石");
                }
                else
                {
                  if (!locala71.q())
                    break;
                  boolean bool2 = false;
                  (localObject8 = locala71).e5 = bool2;
                  locala71.ft = false;
                  Object localObject16 = null;
                  (localObject8 = locala71).eW = localObject16;
                  aq.int = -1;
                  ((ah)localObject5).jdMethod_char(bm.bP);
                  ((ah)localObject5).a("此处放置雕琢符");
                }
                break;
              case 2031635:
                if (((ba)localObject1).q())
                  aq.do = aq.a;
                else if (locala71.q())
                  aq.do = aq.int;
                a5.eQ.a(2031635);
              }
              this.jdField_byte = false;
              return;
            }
            if (a5.es.g9 == 2031636)
            {
              localObject1 = (a7)a5.es.cf().elementAt(4);
              locala71 = (a7)a5.es.cf().elementAt(6);
              localObject5 = (ah)a5.es.cf().elementAt(14);
              switch (i5 = ((Integer)y().db().elementAt(y().de())).intValue())
              {
              case -1610612707:
                if (((ba)localObject1).q())
                {
                  aq.for = 1;
                  ((ba)localObject1).a(false, a5.es);
                }
                else if (locala71.q())
                {
                  aq.for = 2;
                  locala71.a(false, a5.es);
                }
                (localObject1 = (r)a5.es.cf().elementAt(9)).a(true, a5.es);
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
              case -1610612704:
                ((ah)localObject5).jdMethod_char(bm.bP);
                ((ah)localObject5).a("此处放置开封的装备");
                for (int i9 = 0; i9 < r.mY.length; i9++)
                  r.mY[i9] = -1;
                Object localObject9;
                if (((ba)localObject1).q())
                {
                  boolean bool3 = false;
                  (localObject9 = localObject1).e5 = bool3;
                  ((a7)localObject1).ft = false;
                  Object localObject17 = null;
                  (localObject9 = localObject1).eW = localObject17;
                  aq.a = -1;
                  ((ah)localObject5).jdMethod_char(bm.bP);
                  ((ah)localObject5).a("此处放置开封的装备");
                }
                else
                {
                  if (!locala71.q())
                    break;
                  boolean bool4 = false;
                  (localObject9 = locala71).e5 = bool4;
                  locala71.ft = false;
                  Object localObject18 = null;
                  (localObject9 = locala71).eW = localObject18;
                  aq.int = -1;
                  ((ah)localObject5).jdMethod_char(bm.bP);
                  ((ah)localObject5).a("此处放置开封卷轴");
                }
                break;
              case 2031617:
                if (((ba)localObject1).q())
                  aq.do = aq.a;
                else if (locala71.q())
                  aq.do = aq.int;
                a5.eQ.a(2031635);
                break;
              case -1610612635:
                fF = 20;
                r.nf = true;
                a5.eQ.a(2425072);
                break;
              case -1610612634:
                fF = 21;
                r.nf = true;
                a5.eQ.a(2425072);
              }
              this.jdField_byte = false;
              return;
            }
            int i11;
            if (a5.es.g9 == 3342356)
            {
              localObject1 = (a7)a5.es.cf().elementAt(4);
              locala71 = (a7)a5.es.cf().elementAt(6);
              localObject5 = (ah)a5.es.cf().elementAt(14);
              switch (i5 = ((Integer)y().db().elementAt(y().de())).intValue())
              {
              case -1610612707:
                if (((ba)localObject1).q())
                  ((ba)localObject1).a(false, a5.es);
                else if (locala71.q())
                  locala71.a(false, a5.es);
                (localObject1 = (r)a5.es.cf().elementAt(9)).a(true, a5.es);
                break;
              case -1610612704:
                ((ah)localObject5).jdMethod_char(bm.bP);
                ((ah)localObject5).a("此处放置需要铭刻的法宝");
                for (int i10 = 0; i10 < r.mY.length; i10++)
                  r.mY[i10] = -1;
                Object localObject10;
                if (((ba)localObject1).q())
                {
                  boolean bool5 = false;
                  (localObject10 = localObject1).e5 = bool5;
                  ((a7)localObject1).ft = false;
                  Object localObject19 = null;
                  (localObject10 = localObject1).eW = localObject19;
                  aq.a = -1;
                  ((ah)localObject5).jdMethod_char(bm.bP);
                  ((ah)localObject5).a("此处放置需要铭刻的法宝");
                }
                else
                {
                  if (!locala71.q())
                    break;
                  boolean bool6 = false;
                  (localObject10 = locala71).e5 = bool6;
                  locala71.ft = false;
                  Object localObject20 = null;
                  (localObject10 = locala71).eW = localObject20;
                  aq.int = -1;
                  ((ah)localObject5).jdMethod_char(bm.bP);
                  ((ah)localObject5).a("此处放置法宝铭文");
                }
                break;
              case 3342359:
                if (aq.a == -1)
                {
                  as.a(0, "您还没有放入法宝，无法进行铭刻。", "确定", "", -1, -2);
                  this.jdField_byte = false;
                  return;
                }
                if (aq.int == -1)
                {
                  as.a(0, "您还没有放入法宝铭文，无法进行铭刻。。", "确定", "", -1, -2);
                  this.jdField_byte = false;
                  return;
                }
                a5.eQ.a(3342359);
                break;
              case 3342361:
                a5.eQ.a(3342361);
                break;
              case 2031617:
                if (((ba)localObject1).q())
                {
                  aq.do = aq.a;
                  i11 = r.mp;
                  r.mp = aq.a;
                  am.a = false;
                  a5.eQ.a(3342337);
                  r.mp = i11;
                }
                else
                {
                  if (!locala71.q())
                    break;
                  aq.do = aq.int;
                  a5.eQ.a(2031635);
                }
              }
              this.jdField_byte = false;
              return;
            }
            if (a5.es.g9 == 917525)
            {
              localObject1 = (a7)a5.es.cf().elementAt(4);
              locala71 = (a7)a5.es.cf().elementAt(6);
              localObject5 = (ah)a5.es.cf().elementAt(14);
              switch (i5 = ((Integer)y().db().elementAt(y().de())).intValue())
              {
              case -1610612707:
                if (((ba)localObject1).q())
                  ((ba)localObject1).a(false, a5.es);
                else if (locala71.q())
                  locala71.a(false, a5.es);
                (localObject1 = (r)a5.es.cf().elementAt(9)).a(true, a5.es);
                break;
              case -1610612704:
                ((ah)localObject5).jdMethod_char(bm.bP);
                ((ah)localObject5).a("此处放置需要强化的装备");
                for (i11 = 0; i11 < r.mY.length; i11++)
                  r.mY[i11] = -1;
                Object localObject11;
                if (((ba)localObject1).q())
                {
                  boolean bool7 = false;
                  (localObject11 = localObject1).e5 = bool7;
                  ((a7)localObject1).ft = false;
                  Object localObject21 = null;
                  (localObject11 = localObject1).eW = localObject21;
                  aq.a = -1;
                  ((ah)localObject5).jdMethod_char(bm.bP);
                  ((ah)localObject5).a("此处放置需要强化的装备");
                }
                else
                {
                  if (!locala71.q())
                    break;
                  boolean bool8 = false;
                  (localObject11 = locala71).e5 = bool8;
                  locala71.ft = false;
                  Object localObject22 = null;
                  (localObject11 = locala71).eW = localObject22;
                  aq.int = -1;
                  ((ah)localObject5).jdMethod_char(bm.bP);
                  ((ah)localObject5).a("此处放置装备强化符");
                }
                break;
              case 917528:
                a5.eQ.a(917528);
                break;
              case 917530:
                a5.eQ.a(917530);
                break;
              case 2031617:
                if (((ba)localObject1).q())
                  aq.do = aq.a;
                else if (locala71.q())
                  aq.do = aq.int;
                a5.eQ.a(2031635);
              }
              this.jdField_byte = false;
              return;
            }
            int j;
            if (a5.es.g9 == 2228225)
            {
              j = ((Integer)y().db().elementAt(y().de())).intValue();
              locala71 = (a7)a5.es.cf().elementAt(4);
              switch (j)
              {
              case -1610612707:
                if (locala71.q())
                {
                  aj.goto = 1;
                  locala71.a(false, a5.es);
                }
                (localObject5 = (r)a5.es.cf().elementAt(7)).a(true, a5.es);
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
              case 2228240:
                a5.eQ.a(2228240);
                break;
              case 2228231:
                if (locala71.q())
                  aj.case = aj.byte;
                a5.eQ.a(2228231);
              }
              this.jdField_byte = false;
              return;
            }
            Object localObject12;
            if (a5.es.g9 == 1966097)
            {
              j = ((Integer)y().db().elementAt(y().de())).intValue();
              locala71 = (a7)a5.es.cf().elementAt(4);
              localObject5 = (a7)a5.es.cf().elementAt(6);
              ah localah = (ah)a5.es.cf().elementAt(10);
              switch (j)
              {
              case -1610612707:
                if (locala71.q())
                {
                  locala71.a(false, a5.es);
                  au.char = 1;
                }
                else if (((ba)localObject5).q())
                {
                  au.char = 2;
                  ((ba)localObject5).a(false, a5.es);
                }
                r localr;
                (localr = (r)a5.es.cf().elementAt(7)).a(true, a5.es);
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
              case -1610612704:
                for (int i12 = 0; i12 < r.mY.length; i12++)
                  r.mY[i12] = -1;
                if (locala71.q())
                {
                  boolean bool9 = false;
                  (localObject12 = locala71).e5 = bool9;
                  locala71.ft = false;
                  Object localObject23 = null;
                  (localObject12 = locala71).eW = localObject23;
                  au.int = -1;
                  localah.jdMethod_char(bm.bP);
                  localah.a("此处放置装备");
                }
                else
                {
                  if (!((ba)localObject5).q())
                    break;
                  boolean bool10 = false;
                  (localObject12 = localObject5).e5 = bool10;
                  ((a7)localObject5).ft = false;
                  Object localObject24 = null;
                  (localObject12 = localObject5).eW = localObject24;
                  au.try = -1;
                  localah.jdMethod_char(bm.bP);
                  localah.a("此处放置解除符");
                }
                break;
              case 1966113:
                if (locala71.q())
                  au.byte = au.int;
                else if (((ba)localObject5).q())
                  au.byte = au.try;
                a5.eQ.a(1966113);
              }
              this.jdField_byte = false;
              return;
            }
            int k;
            if (a5.es.g9 == 458760)
            {
              k = ((Integer)y().db().elementAt(y().de())).intValue();
              at.try = at.a();
              a5.eQ.a(k);
              this.jdField_byte = false;
              return;
            }
            if (a5.es.g9 == 1179658)
            {
              k = ((Integer)y().db().elementAt(y().de())).intValue();
              at.try = bs.a();
              fF = 22;
              a5.eQ.a(k);
              this.jdField_byte = false;
              return;
            }
            if (a5.es.g9 == 2555905)
            {
              k = ((Integer)y().db().elementAt(y().de())).intValue();
              for (int i2 = 0; i2 < 12; i2++)
              {
                if (!(localObject5 = (a7)a5.es.cf().elementAt(i2 + 11)).q())
                  continue;
                az.if = 0;
                az.f = (byte)i2;
              }
              for (i2 = 0; i2 < 6; i2++)
              {
                if (!(localObject5 = (a7)a5.es.cf().elementAt(i2 + 25)).q())
                  continue;
                az.if = 1;
                az.f = (byte)i2;
              }
              if ((((az.o = ((Byte)az.g.elementAt(y().de())).byteValue()) == 0) || (az.o == 10) || (az.o == 4)) && (az.o == 4))
                az.for = 1;
              a5.eQ.a(k);
              this.jdField_byte = false;
              return;
            }
            if (a5.es.g9 == 2555906)
            {
              if (az.h == 0)
              {
                k = ((Integer)y().db().elementAt(y().de())).intValue();
                a5.eQ.a(k);
                this.jdField_byte = false;
                return;
              }
            }
            else
            {
              if ((a5.es.g9 == 3145729) || (a5.es.g9 == 3145730))
              {
                k = ((Integer)y().db().elementAt(y().de())).intValue();
                localObject5 = new a7[(localObject4 = new int[] { 3, 4, 5, 6, 7, 8, 9, 10 }).length];
                for (int i6 = 0; i6 < localObject4.length; i6++)
                {
                  localObject5[i6] = ((a7)a5.es.cf().elementAt(localObject4[i6]));
                  if (!localObject5[i6].q())
                    continue;
                  aa.case = (byte)i6;
                }
                switch (k)
                {
                case -1610612620:
                  b1.x(-1610612620);
                  break;
                case -1610612618:
                  b1.x(-1610612618);
                  break;
                case -1610612619:
                  boolean bool11 = false;
                  localObject12 = this;
                  this.e5 = bool11;
                  this.ft = false;
                  Object localObject25 = null;
                  localObject12 = this;
                  this.eW = localObject25;
                  if (a5.es.g9 == 3145729)
                  {
                    aa.goto[aa.case] = -1;
                  }
                  else
                  {
                    if (a5.es.g9 != 3145730)
                      break;
                    i6 = 0;
                    k = (byte)aa.try.length;
                    aa.try[aa.case] = -1;
                    for (int i13 = 0; i13 < k; i13 = (byte)(i13 + 1))
                    {
                      if (aa.try[i13] != -1)
                        continue;
                      i6 = (byte)(i6 + 1);
                    }
                    if (i6 == k)
                    {
                      aa.if = 0;
                      (localObject13 = (ay)a5.es.cf().elementAt(13)).jdMethod_char(aa.if);
                      ((ay)localObject13).jdMethod_case(aa.if);
                    }
                  }
                  break;
                case -1610612730:
                  if (a5.es.g9 == 3145729)
                  {
                    bp.ag();
                    bv.a(-1610612730, bp.jdMethod_void(aa.goto[aa.case]));
                  }
                  else
                  {
                    if (a5.es.g9 != 3145730)
                      break;
                    bp.ag();
                    bv.a(-1610612730, bp.jdMethod_void(aa.try[aa.case]));
                  }
                }
                this.jdField_byte = false;
                return;
              }
              if (a5.es.g9 == 2228256)
              {
                Object localObject2 = (ah)a5.es.cf().elementAt(14);
                localObject4 = (ah)a5.es.cf().elementAt(11);
                int i4 = ((Integer)y().db().elementAt(y().de())).intValue();
                a7 locala72 = (a7)a5.es.cf().elementAt(4);
                switch (i4)
                {
                case -1610612707:
                  if (locala72.q())
                    locala72.a(false, a5.es);
                  (localObject2 = (r)a5.es.cf().elementAt(7)).a(true, a5.es);
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
                case 2228260:
                  a5.eQ.a(2228260);
                  break;
                case -1610612704:
                  if (!locala72.q())
                    break;
                  boolean bool12 = false;
                  (localObject13 = locala72).e5 = bool12;
                  locala72.ft = false;
                  Object localObject26 = null;
                  (localObject13 = locala72).eW = localObject26;
                  aj.byte = -1;
                  ((ah)localObject4).a("0");
                  ((ah)localObject2).jdMethod_char(bm.bP);
                  ((ah)localObject2).a("此处放置宝石");
                  break;
                case 2228231:
                  if (locala72.q())
                    aj.case = aj.byte;
                  a5.eQ.a(2228231);
                }
                this.jdField_byte = false;
                return;
              }
              if ((a5.es.g9 == 3342340) && (am.a))
              {
                int m = ((Integer)y().db().elementAt(y().de())).intValue();
                localObject6 = new a7[(localObject4 = new int[] { 3, 5, 7, 9, 11 }).length];
                for (int i7 = 0; i7 < localObject4.length; i7++)
                {
                  localObject6[i7] = ((a7)a5.es.cf().elementAt(localObject4[i7]));
                  if (!localObject6[i7].q())
                    continue;
                  am.goto = (byte)i7;
                }
                if (m == 3342341)
                  am.try = 0;
                a5.eQ.a(m);
                this.jdField_byte = false;
                return;
              }
            }
          }
        }
        else if (this.y == 0)
        {
          return;
        }
      }
      else if (a5.jdMethod_byte(262144))
      {
        this.jdField_byte = false;
        y().da();
        return;
      }
    }
    else if ((a5.jdMethod_byte(65536)) || (a5.jdMethod_byte(131072)))
    {
      b5.jdMethod_case("---------------- clientType" + this.r);
      b5.jdMethod_case("---------------- clientCommand = " + a5.es.g9);
      Object localObject3;
      if (this.y == 3)
      {
        this = this;
        Object localObject7;
        switch (this.r)
        {
        case 16:
          switch (this.eO)
          {
          case 0:
            br localbr;
            switch (a5.es.g9)
            {
            case 1966086:
              if (this.fm == -1)
                break;
              localbr = new br(0);
              localObject4 = null;
              if ((fF == 14) || (fF == 15))
                localObject4 = new int[] { 1966087, 3342338 };
              else
                localObject4 = new int[] { 1966087, 1966093 };
              localObject6 = new int[] { 2, 2 };
              localbr.a(bm.f, localObject4, localObject6);
              a(localbr);
              this.jdField_byte = true;
              y().da();
              break;
            case 458817:
              if (this.fm == -1)
                break;
              localbr = new br(0);
              localObject4 = null;
              if ((fF == 14) || (fF == 15))
                localObject4 = new int[] { 3342338, 2162754 };
              else
                localObject4 = new int[] { 917507, 2162754 };
              localObject6 = new int[] { 2, 3 };
              localObject7 = new String[] { "查　看", "凝　元" };
              localbr.a(localObject7, localObject4, localObject6);
              a(localbr);
              this.jdField_byte = true;
              y().da();
              break;
            case 939349:
              if (this.fm == -1)
                break;
              if (bx.if != -1)
              {
                localbr = new br(0);
                localObject4 = null;
                if ((fF == 14) || (fF == 15))
                  localObject4 = new int[] { 917524, 3342338 };
                else
                  localObject4 = new int[] { 917524, 917507 };
                localObject6 = new int[] { 3, 2 };
                localObject7 = new String[] { "修理", "查看" };
                localbr.a(localObject7, localObject4, localObject6);
                a(localbr);
                this.jdField_byte = true;
                y().da();
              }
              else
              {
                localbr = new br(0);
                localObject4 = new int[] { 917507 };
                localObject6 = new int[] { 2 };
                localObject7 = new String[] { "查看" };
                localbr.a(localObject7, localObject4, localObject6);
                a(localbr);
                this.jdField_byte = true;
                y().da();
              }
              break;
            default:
              if (q())
              {
                localObject13 = this;
                if (this.fI)
                {
                  a5.eQ.a(917509);
                  bF();
                  return;
                }
              }
              if (this.fm != -1)
              {
                localbr = new br(0);
                if ((a5.hQ == 0) && (fF != 14) && (fF != 15))
                  if (a5.es.g9 == 458755)
                    localbr.a("购　买", 2425072, 3);
                  else
                    localbr.a("购　买", 2425072, 1);
                if ((fF == 14) || (fF == 15))
                {
                  if (a5.es.g9 == 458755)
                    localbr.a("查　看", 3342338, 3);
                  else
                    localbr.a("查　看", 3342338, 1);
                }
                else
                  localbr.a("查　看", 917507, 2);
                localbr.a("卸　下", 917506, 3);
                if ((fF != 14) && (fF != 15))
                  localbr.a("比　较", 1245185, 2);
                a(localbr);
                this.jdField_byte = true;
                y().da();
              }
              else
              {
                if ((a5.hQ != 0) || (fF == 14) || (fF == 15))
                  break;
                localbr = new br(0);
                if (a5.es.g9 == 458755)
                  localbr.a("购　买", 2425072, 3);
                else
                  localbr.a("购　买", 2425072, 1);
                a(localbr);
                this.jdField_byte = true;
                y().da();
              }
            }
            break;
          case 1:
            if (this.fm == -1)
              break;
            be.a(1, this.ew);
            break;
          case 2:
            if (this.fm != -1)
            {
              a5.eQ.a(393231);
              br.c6();
            }
            else
            {
              as.a(0, "此位置无装备", "确定", "", -1, -2);
            }
          }
        case 115:
          switch (this.eO)
          {
          case 0:
            switch (a5.es.g9)
            {
            case 917520:
            case 1638431:
              int n = 0;
              if (a5.es.g9 == 1638431)
                n = 1;
              if (this.fm != -1)
              {
                localObject4 = new br(0);
                localObject6 = new String[] { "修理单个", "修理全部", "查　看" };
                localObject7 = null;
                if ((fF == 14) || (fF == 15))
                  localObject7 = new int[] { n != 0 ? 1638432 : 917521, n != 0 ? 1638433 : 917522, 3342338 };
                else
                  localObject7 = new int[] { n != 0 ? 1638432 : 917521, n != 0 ? 1638433 : 917522, 917507 };
                localObject3 = new int[] { 3, 3, 2 };
                ((br)localObject4).a(localObject6, localObject7, localObject3);
                a((br)localObject4);
                this.jdField_byte = true;
                y().da();
              }
              else
              {
                localObject4 = new br(0);
                localObject6 = new String[] { "修理全部" };
                localObject7 = new int[] { localObject3 != 0 ? 1638433 : 917522 };
                localObject3 = new int[] { 3 };
                ((br)localObject4).a(localObject6, localObject7, localObject3);
                a((br)localObject4);
                this.jdField_byte = true;
                y().da();
              }
            }
          }
        }
        if ((a5.es.g9 == 2097155) && (!by.d))
        {
          localObject3 = (a7)a5.es.cf().elementAt(31);
          localObject4 = (a7)a5.es.cf().elementAt(33);
          by.else = true;
          if (((ba)localObject3).q())
          {
            by.case = 1;
            ((ba)localObject3).a(false, a5.es);
            a5.eQ.a(2097154);
            return;
          }
          if (((ba)localObject4).q())
          {
            by.case = 2;
            ((ba)localObject4).a(false, a5.es);
            a5.eQ.a(2097154);
          }
        }
        return;
      }
      else
      {
        if (this.y == 1)
        {
          bV();
          return;
        }
        if ((this.y == 0) && (a5.jdMethod_else() == 17))
          if (a5.iC[a5.hg].eo != null)
          {
            localObject3 = "正在进入游戏，请等待...";
            a5.a(0, (String)localObject3, "", "", -120, -120);
            a5.eQ.a(65539);
            a5.jdMethod_for(a5.e0[a5.hg]);
            a5.e8.fo[0] = 1;
            if ((a5.e8.cP[0] == 1) && (a5.e8.fo[0] == 1))
            {
              a5.e8.ia = true;
              b5.jdMethod_case("MainCanvas.mc.Debarkation=" + a5.e8.ia);
            }
            else
            {
              if (a5.e8.fo[0] == 1)
              {
                a5.e8.ia = false;
                b5.jdMethod_case("MainCanvas.mc.Debarkation=" + a5.e8.ia);
              }
              return;
            }
          }
          else
          {
            a5.G();
            a5.d();
            a5.jdMethod_do(18);
          }
      }
    }
  }

  public final void k(byte paramByte)
  {
    this.eO = paramByte;
  }

  public static void bF()
  {
    try
    {
      boolean bool = false;
      a7 locala7;
      (locala7 = (a7)(a7)a5.es.cf().elementAt(9)).fI = bool;
      bool = false;
      (locala7 = (a7)(a7)a5.es.cf().elementAt(10)).fI = bool;
      bool = false;
      (locala7 = (a7)(a7)a5.es.cf().elementAt(17)).fI = bool;
      bool = false;
      (locala7 = (a7)(a7)a5.es.cf().elementAt(16)).fI = bool;
      bool = false;
      (locala7 = (a7)(a7)a5.es.cf().elementAt(19)).fI = bool;
      bool = false;
      (locala7 = (a7)(a7)a5.es.cf().elementAt(18)).fI = bool;
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static boolean bU()
  {
    a7 locala7;
    return ((locala7 = (a7)(a7)a5.es.cf().elementAt(9)).fI) || ((locala7 = (a7)(a7)a5.es.cf().elementAt(10)).fI) || ((locala7 = (a7)(a7)a5.es.cf().elementAt(17)).fI) || ((locala7 = (a7)(a7)a5.es.cf().elementAt(16)).fI) || ((locala7 = (a7)(a7)a5.es.cf().elementAt(19)).fI) || ((locala7 = (a7)(a7)a5.es.cf().elementAt(18)).fI);
  }

  private void bV()
  {
    Object localObject1;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    if (this.eJ != -1)
    {
      localObject1 = new br(0);
      localObject4 = null;
      localObject5 = null;
      localObject6 = null;
      if ((this.eJ == 0) && (bv.jp))
      {
        localObject4 = this;
        if ((this.el == 1 ? 1 : 0) != 0)
        {
          localObject6 = new String[] { "完成任务", "选择报酬", "查看物品" };
          localObject4 = new int[] { 262150, 0, 262156 };
          localObject5 = new int[] { 0, 3, 2 };
          ((br)localObject1).a(localObject6, localObject4, localObject5);
        }
        else
        {
          localObject6 = new String[] { "完成任务", "选择报酬" };
          localObject4 = new int[] { 262150, 0 };
          localObject5 = new int[] { 0, 3 };
          ((br)localObject1).a(localObject6, localObject4, localObject5);
        }
      }
      if (((br)localObject1).dj().size() > 0)
      {
        a((br)localObject1);
        this.jdField_byte = true;
        y().da();
      }
    }
    else
    {
      switch (this.r)
      {
      case 34:
        if ((ej) && (em))
        {
          if (this.eC != -1)
          {
            localObject1 = new br(0);
            localObject4 = new int[] { 1376267, 1376266 };
            localObject5 = new int[] { 3, 3 };
            ((br)localObject1).a(bm.a6, localObject4, localObject5);
            a((br)localObject1);
            this.jdField_byte = true;
            y().da();
          }
          else
          {
            localObject1 = new br(0);
            localObject4 = new int[] { 1376266 };
            localObject5 = new int[] { 3 };
            ((br)localObject1).a(bm.aY, localObject4, localObject5);
            a((br)localObject1);
            this.jdField_byte = true;
            y().da();
          }
        }
        else if ((ej) && (!em))
        {
          if (this.eC == -1)
            break;
          localObject1 = new br(0);
          localObject4 = new int[] { 1376267 };
          localObject5 = new int[] { 3 };
          localObject6 = new String[] { "查看" };
          ((br)localObject1).a(localObject6, localObject4, localObject5);
          a((br)localObject1);
          this.jdField_byte = true;
          y().da();
        }
        else
        {
          if (ej)
            break;
          if (this.eC != -1)
          {
            localObject1 = new br(0);
            localObject4 = new int[] { 1376267, 1376268, 1376264, 1376265 };
            localObject5 = new int[] { 3, 3, 3, 3 };
            ((br)localObject1).a(bm.ac, localObject4, localObject5);
            a((br)localObject1);
            this.jdField_byte = true;
            y().da();
          }
          else
          {
            localObject1 = new br(0);
            localObject4 = new int[] { 1376263, 1376264, 1376265 };
            localObject5 = new int[] { 2, 3, 3 };
            ((br)localObject1).a(bm.w, localObject4, localObject5);
            a((br)localObject1);
            this.jdField_byte = true;
            y().da();
          }
        }
        break;
      case 35:
        if ((em) && (ej))
        {
          if (this.eC == -1)
            break;
          localObject1 = new br(0);
          localObject4 = new int[] { 1376267, 1376266 };
          localObject5 = new int[] { 3, 3 };
          ((br)localObject1).a(bm.a6, localObject4, localObject5);
          a((br)localObject1);
          this.jdField_byte = true;
          y().da();
        }
        else
        {
          if (this.eC == -1)
            break;
          localObject1 = new br(0);
          localObject4 = new int[] { 1376267 };
          localObject5 = new int[] { 3 };
          localObject6 = new String[] { "查看" };
          ((br)localObject1).a(localObject6, localObject4, localObject5);
          a((br)localObject1);
          this.jdField_byte = true;
          y().da();
        }
      }
    }
    if ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952) || (a5.es.g9 == 1703938))
    {
      if (q())
      {
        if (this.eC == -1)
        {
          localObject1 = new br(0);
          localObject4 = new int[] { 1703946, -1610612712, -1610612711 };
          localObject5 = new int[] { 2, 3, 3 };
          ((br)localObject1).a(bm.m, localObject4, localObject5);
          a((br)localObject1);
          y().da();
          this.jdField_byte = true;
          return;
        }
        if (this.eC != -1)
        {
          localObject1 = new br(0);
          localObject4 = new int[] { 1703954, -1610612710, -1610612712, -1610612711 };
          localObject5 = new int[] { 2, 3, 3, 3 };
          ((br)localObject1).a(bm.dl, localObject4, localObject5);
          a((br)localObject1);
          y().da();
          this.jdField_byte = true;
          return;
        }
      }
    }
    else if ((a5.es.g9 == 1703940) || (a5.es.g9 == 1703941))
    {
      if (this.eQ == 0)
      {
        if (a5.es.g9 == 1703940)
        {
          localObject1 = new br(0);
          if (q.char > 0)
            ((br)localObject1).a("接收金钱", 1703951, 3);
          if ((q.for) || (q.char > 0))
            ((br)localObject1).a("接收所有", 1703950, 3);
          if (q.r)
            ((br)localObject1).a("回复邮件", 1703952, 2);
          if (((br)localObject1).dj().size() > 0)
          {
            a((br)localObject1);
            y().da();
            this.jdField_byte = true;
          }
          return;
        }
        if (a5.es.g9 == 1703941)
        {
          localObject1 = new br(0);
          if (q.else)
          {
            if ((q.for) || (q.char > 0))
              ((br)localObject1).a("接收所有", 1703950, 3);
            if (q.r)
              ((br)localObject1).a("回复邮件", 1703952, 2);
          }
          else
          {
            ((br)localObject1).a("付　款", 1703953, 3);
            ((br)localObject1).a("退　信", 1703957, 0);
            if (q.r)
              ((br)localObject1).a("回复邮件", 1703952, 2);
          }
          if (((br)localObject1).dj().size() > 0)
          {
            a((br)localObject1);
            y().da();
            this.jdField_byte = true;
          }
          return;
        }
      }
      else
      {
        if (a5.es.g9 == 1703940)
        {
          (localObject1 = new br(0)).a("查看物品", 1703948, 2);
          ((br)localObject1).a("接收物品", 1703949, 3);
          if (q.char > 0)
            ((br)localObject1).a("接收金钱", 1703951, 3);
          if ((q.for) || (q.char > 0))
            ((br)localObject1).a("接收所有", 1703950, 3);
          if (q.r)
            ((br)localObject1).a("回复邮件", 1703952, 2);
          if (((br)localObject1).dj().size() > 0)
          {
            a((br)localObject1);
            y().da();
            this.jdField_byte = true;
          }
          return;
        }
        if (a5.es.g9 == 1703941)
        {
          localObject1 = new br(0);
          if (q.else)
          {
            ((br)localObject1).a("查看物品", 1703948, 2);
            ((br)localObject1).a("接收物品", 1703949, 3);
            if ((q.for) || (q.char > 0))
              ((br)localObject1).a("接收所有", 1703950, 3);
            if (q.r)
              ((br)localObject1).a("回复邮件", 1703952, 2);
          }
          else
          {
            ((br)localObject1).a("查看物品", 1703948, 2);
            ((br)localObject1).a("付　款", 1703953, 3);
            ((br)localObject1).a("退　信", 1703957, 0);
            if (q.r)
              ((br)localObject1).a("回复邮件", 1703952, 2);
          }
          if (((br)localObject1).dj().size() > 0)
          {
            a((br)localObject1);
            y().da();
            this.jdField_byte = true;
          }
          return;
        }
      }
    }
    else if (a5.es.g9 == 1900547)
    {
      if (bw.a == 1)
      {
        localObject1 = new br(0);
        localObject4 = new int[] { -1610612713, -1610612714 };
        localObject5 = new int[] { 3, 3 };
        ((br)localObject1).a(bm.at, localObject4, localObject5);
        a((br)localObject1);
        y().da();
        this.jdField_byte = true;
        return;
      }
    }
    else
    {
      if (a5.es.g9 == 2031621)
      {
        localObject1 = (a7)a5.es.cf().elementAt(4);
        localObject4 = (a7)a5.es.cf().elementAt(6);
        if (((ba)localObject1).q())
          jdMethod_void(aq.a);
        else if (((ba)localObject4).q())
          jdMethod_void(aq.int);
        y().da();
        this.jdField_byte = true;
        return;
      }
      if (a5.es.g9 == 2031636)
      {
        localObject1 = (a7)a5.es.cf().elementAt(4);
        localObject4 = (a7)a5.es.cf().elementAt(6);
        if (((ba)localObject1).q())
          jdMethod_if(aq.a, 1);
        else if (((ba)localObject4).q())
          jdMethod_if(aq.int, 2);
        y().da();
        this.jdField_byte = true;
        return;
      }
      if (a5.es.g9 == 3342356)
      {
        localObject1 = (a7)a5.es.cf().elementAt(4);
        localObject4 = (a7)a5.es.cf().elementAt(6);
        if (((ba)localObject1).q())
          i(aq.a);
        else if (((ba)localObject4).q())
          i(aq.int);
        y().da();
        this.jdField_byte = true;
        return;
      }
      if (a5.es.g9 == 917525)
      {
        localObject1 = (a7)a5.es.cf().elementAt(4);
        localObject4 = (a7)a5.es.cf().elementAt(6);
        if (((ba)localObject1).q())
          o(aq.a);
        else if (((ba)localObject4).q())
          o(aq.int);
        y().da();
        this.jdField_byte = true;
        return;
      }
      Object localObject7;
      if (a5.es.g9 == 2228225)
      {
        if ((localObject1 = (a7)a5.es.cf().elementAt(4)).q())
        {
          int i = aj.byte;
          localObject4 = this;
          localObject5 = new br(0);
          if (i == -1)
          {
            localObject6 = new int[] { -1610612707, 2228227, 2031650 };
            localObject7 = new int[] { 3, 3, 2 };
            ((br)localObject5).a(bm.ct, localObject6, localObject7);
          }
          else
          {
            localObject6 = new int[] { a5.es.g9 == 2228225 ? 2228240 : -1610612704, 2228231, 2228227, 2031650 };
            localObject7 = new int[] { 3, 2, 3, 2 };
            ((br)localObject5).a(bm.cr, localObject6, localObject7);
          }
          ((ba)localObject4).a((br)localObject5);
        }
        y().da();
        this.jdField_byte = true;
        return;
      }
      Object localObject2;
      if (a5.es.g9 == 1966097)
      {
        localObject2 = (a7)a5.es.cf().elementAt(4);
        localObject4 = (a7)a5.es.cf().elementAt(6);
        if (((ba)localObject2).q())
          p(au.int);
        else if (((ba)localObject4).q())
          p(au.try);
        y().da();
        this.jdField_byte = true;
        return;
      }
      if (a5.es.g9 == 458760)
      {
        localObject2 = new br(0);
        if ((at.byte) && (this.eY))
          ((br)localObject2).a("扩　容", 458769, 3);
        ((br)localObject2).a("查　看", 458770, 2);
        a((br)localObject2);
        y().da();
        this.jdField_byte = true;
        return;
      }
      if (a5.es.g9 == 1179658)
      {
        localObject2 = new br(0);
        if ((at.byte) && (this.eY))
          ((br)localObject2).a("扩　容", 1179661, 2);
        else
          ((br)localObject2).a("购　买", 2425072, 1);
        ((br)localObject2).a("查　看", 1179662, 2);
        a((br)localObject2);
        y().da();
        this.jdField_byte = true;
        return;
      }
      Object localObject8;
      if (a5.es.g9 == 2555905)
      {
        localObject4 = this;
        az.g = new Vector();
        for (int j = 0; j < az.do.length; j++)
        {
          if (((this = localObject4).e6 & 1 << j) != 0)
            az.g.addElement(new Byte((byte)j));
          localObject5 = new int[az.g.size()];
          localObject6 = new int[az.g.size()];
          localObject7 = new String[az.g.size()];
          for (int m = 0; m < az.g.size(); m++)
          {
            localObject5[m] = 2555936;
            localObject6[m] = az.e[((Byte)az.g.elementAt(m)).byteValue()];
            localObject7[m] = az.do[((Byte)az.g.elementAt(m)).byteValue()];
          }
          (localObject8 = new br(0)).a(localObject7, localObject5, localObject6);
          ((ba)localObject4).a((br)localObject8);
          ((ba)localObject4).jdField_byte = true;
          ((ba)localObject4).y().da();
        }
        return;
      }
      Object localObject3;
      if (a5.es.g9 == 2555906)
      {
        if (az.h == 0)
        {
          localObject3 = new br(0);
          localObject4 = new int[] { 2555959, 2555960, 2555961 };
          localObject5 = new int[] { 3, 3, 3 };
          localObject6 = new String[] { "查    看", "撤    销", "添    加" };
          ((br)localObject3).a(localObject6, localObject4, localObject5);
          a((br)localObject3);
          y().da();
          this.jdField_byte = true;
          return;
        }
        if (az.h == 1)
        {
          a5.eQ.a(2555959);
          return;
        }
      }
      else
      {
        if ((a5.es.g9 == 3145729) || (a5.es.g9 == 3145730))
        {
          localObject3 = new br(0);
          localObject4 = this;
          if (this.eW == null)
          {
            localObject4 = new int[] { a5.es.g9 == 3145729 ? -1610612620 : -1610612618 };
            localObject5 = new int[] { 2 };
            localObject6 = new String[] { "设置技能" };
            ((br)localObject3).a(localObject6, localObject4, localObject5);
            a((br)localObject3);
          }
          else
          {
            localObject4 = new int[] { a5.es.g9 == 3145729 ? -1610612620 : -1610612618, -1610612619, -1610612730 };
            localObject5 = new int[] { 2, 3, 2 };
            localObject6 = new String[] { "设置技能", "清空本键", "技能详情" };
            ((br)localObject3).a(localObject6, localObject4, localObject5);
            a((br)localObject3);
          }
          this.jdField_byte = true;
          y().da();
          return;
        }
        if (a5.es.g9 == 2228256)
        {
          if ((localObject3 = (a7)a5.es.cf().elementAt(4)).q())
          {
            int k = aj.byte;
            localObject4 = this;
            localObject5 = new br(0);
            if (k == -1)
            {
              localObject6 = new int[] { -1610612707, 2228258, 2228260 };
              localObject7 = new int[] { 3, 3, 2 };
              localObject8 = new String[] { "选择道具", "宝石还原", "还原说明" };
              ((br)localObject5).a(localObject8, localObject6, localObject7);
            }
            else
            {
              localObject6 = new int[] { -1610612704, 2228231, 2228258, 2228260 };
              localObject7 = new int[] { 3, 2, 3, 2 };
              localObject8 = new String[] { "重置道具", "查看详情", "宝石还原", "还原说明" };
              ((br)localObject5).a(localObject8, localObject6, localObject7);
            }
            ((ba)localObject4).a((br)localObject5);
          }
          y().da();
          this.jdField_byte = true;
          return;
        }
        if ((a5.es.g9 == 3342340) && (am.a))
        {
          br localbr = new br(0);
          localObject4 = new String[] { "学习技能", "技能解封" };
          localObject5 = new int[] { 3342341, 3342343 };
          localObject6 = new int[] { 1, 3 };
          localbr.a(localObject4, localObject5, localObject6);
          a(localbr);
          this.jdField_byte = true;
          y().da();
        }
      }
    }
  }

  public final byte bC()
  {
    return this.ew;
  }

  public final void h(byte paramByte)
  {
    this.ew = paramByte;
  }

  public final void h(boolean paramBoolean)
  {
    this.fI = paramBoolean;
  }

  public final void g(int paramInt)
  {
    this.fC = (byte)(paramInt / 1000 - 1);
  }

  public final byte bD()
  {
    return this.fy;
  }

  public final void l(byte paramByte)
  {
    this.fy = paramByte;
  }

  public final void k(int paramInt)
  {
    if (l.a().jdMethod_new() == paramInt)
    {
      this.fe = bz.a(l.a(), 0);
      return;
    }
    if (bp.ag().jdMethod_new() == paramInt)
    {
      this.fe = bz.a(bp.ag(), 0);
      return;
    }
    for (int i = l.else.length - 1; i >= 0; i--)
    {
      if (l.else[i].jdMethod_new() != paramInt)
        continue;
      this.fe = bz.a(l.else[i], 0);
      return;
    }
  }

  private void jdMethod_void(byte paramByte)
  {
    br localbr = new br(0);
    int[] arrayOfInt;
    if (paramByte == -1)
    {
      paramByte = new int[] { -1610612707, 2031623, 2031649 };
      arrayOfInt = new int[] { 3, 3, 2 };
      localbr.a(bm.c7, paramByte, arrayOfInt);
    }
    else
    {
      paramByte = new int[] { -1610612704, 2031635, 2031623, 2031649 };
      arrayOfInt = new int[] { 3, 2, 3, 2 };
      localbr.a(bm.c4, paramByte, arrayOfInt);
    }
    a(localbr);
  }

  private void jdMethod_if(byte paramByte1, byte paramByte2)
  {
    br localbr = new br(0);
    if (paramByte1 == -1)
    {
      if (paramByte2 == 2)
        localbr.a("购　买", -1610612635, 1);
      if (paramByte2 == 3)
        localbr.a("购　买", -1610612634, 1);
      localbr.a("选择道具", -1610612707, 3);
      localbr.a("装备开封", 2031618, 3);
      localbr.a("开封说明", 2031648, 2);
    }
    else
    {
      if (paramByte2 == 2)
        localbr.a("购　买", -1610612635, 1);
      if (paramByte2 == 3)
        localbr.a("购　买", -1610612634, 1);
      localbr.a("重置道具", -1610612704, 3);
      localbr.a("查看详情", 2031617, 2);
      localbr.a("装备开封", 2031618, 3);
      localbr.a("开封说明", 2031648, 2);
    }
    a(localbr);
  }

  private void i(byte paramByte)
  {
    br localbr = new br(0);
    if (paramByte == -1)
    {
      localbr.a("选择道具", -1610612707, 3);
      localbr.a("法宝铭刻", 3342359, 3);
      localbr.a("铭刻说明", 3342361, 2);
    }
    else
    {
      localbr.a("重置道具", -1610612704, 3);
      localbr.a("查看详情", 2031617, 2);
      localbr.a("法宝铭刻", 3342359, 3);
      localbr.a("铭刻说明", 3342361, 2);
    }
    a(localbr);
  }

  private void o(byte paramByte)
  {
    br localbr = new br(0);
    if (paramByte == -1)
    {
      localbr.a("选择道具", -1610612707, 3);
      localbr.a("装备强化", 917528, 3);
      localbr.a("强化说明", 917530, 2);
    }
    else
    {
      localbr.a("重置道具", -1610612704, 3);
      localbr.a("查看详情", 2031617, 2);
      localbr.a("装备强化", 917528, 3);
      localbr.a("强化说明", 917530, 2);
    }
    a(localbr);
  }

  private void p(byte paramByte)
  {
    br localbr = new br(0);
    int[] arrayOfInt;
    if (paramByte == -1)
    {
      paramByte = new int[] { -1610612707, 1966099, 2031651 };
      arrayOfInt = new int[] { 3, 1, 2 };
      localbr.a(bm.de, paramByte, arrayOfInt);
    }
    else
    {
      paramByte = new int[] { -1610612704, 1966113, 1966099, 2031651 };
      arrayOfInt = new int[] { 3, 2, 1, 2 };
      localbr.a(bm.dd, paramByte, arrayOfInt);
    }
    a(localbr);
  }

  public final short bH()
  {
    return this.et;
  }

  public final void f(short paramShort)
  {
    this.et = paramShort;
  }

  public final short br()
  {
    return this.eU;
  }

  public final void d(short paramShort)
  {
    this.eU = paramShort;
  }

  public final int bo()
  {
    return this.fD;
  }

  public final void h(int paramInt)
  {
    this.fD = paramInt;
  }

  public final byte bN()
  {
    return this.e8;
  }

  public final void jdMethod_goto(byte paramByte)
  {
    this.e8 = paramByte;
  }

  public final String bn()
  {
    return this.en;
  }

  public final void jdMethod_long(String paramString)
  {
    this.en = paramString;
  }

  public final String bY()
  {
    return this.eR;
  }

  public final void jdMethod_goto(String paramString)
  {
    this.eR = paramString;
  }

  public final byte bz()
  {
    return this.eG;
  }

  public final void d(byte paramByte)
  {
    this.eG = paramByte;
  }

  public final String by()
  {
    return this.fq;
  }

  public final void jdMethod_char(String paramString)
  {
    this.fq = paramString;
  }

  public final byte bJ()
  {
    return this.fB;
  }

  public final void m(byte paramByte)
  {
    this.fB = paramByte;
  }

  public final void i(int paramInt)
  {
    this.eE = paramInt;
  }

  public final void j(int paramInt)
  {
    this.e6 = paramInt;
  }

  static
  {
    { "乾", "坤", "震", "艮", "离", "坎", "兑" }[7] = "巽";
    fF = -1;
    e3 = -1;
    ej = false;
    em = false;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     a7
 * JD-Core Version:    0.6.0
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class b extends bz
{
  byte dw = -1;
  int cK = 0;
  private short cC = -1;
  private byte[][] cW = { { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 }, { 0, 1, 10, 11, 12, 13, 14, 15, 16, 19, 20 }, { 4, 5, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 } };
  private static short[][] cY = null;
  private static byte[][] d5 = null;
  private static short[][] d8 = null;
  private static byte[][] dn = null;
  private short[][] c0 = null;
  private boolean cm = true;
  public static Image[] cw = null;
  public static byte[] dZ = null;
  public static short[] cI = null;
  public static byte[] c4 = null;
  private static byte[] df = null;
  public byte[][] co = null;
  public byte ct = 0;
  public short dt = -1;
  public byte cL = 0;
  private boolean ci = false;
  private short d7 = 0;
  private short dc = -1;
  public short dF = 0;
  public boolean cA = false;
  public boolean cF = false;
  public boolean cH = false;
  protected static g dJ = null;
  public boolean eb = false;
  public byte dp;
  private byte dV;
  private int cj;
  private static byte ch = 10;
  private static byte cg = 40;
  private static byte c9 = 18;
  private static byte c7 = 37;
  private static byte[][] dG = { { 10, 20 }, { 10, 20 }, { 10, 20 }, { 10, 22 }, { 10, 20 }, { 10, 20 } };
  private static int[] dl;
  private byte[][] cV = new byte[20][7];
  private byte dP = 0;
  private byte db = 1;
  private short c8;
  private short c6;

  public b(short paramShort1, short paramShort2, byte paramByte1, byte paramByte2, byte paramByte3)
  {
    this.jdField_try = 1;
    this.ct = 0;
    this.dt = 0;
    this.bq = 0;
    this.aI = new Vector();
    jdMethod_char(paramByte1);
    b5.jdMethod_case("ADD_OtherPlayer--phyle=" + paramByte1 + "---pro=" + paramByte2 + "--sex2=" + paramByte3);
    f(paramByte3);
    d(a(paramByte1, paramByte3));
    V();
    this.c = (this.bm = paramShort1);
    this.jdField_void = (this.bi = paramShort2);
    this.q = (this.bt = z.jdMethod_if(paramShort2, paramShort1));
    this.l = (this.ax = z.a(paramShort2, paramShort1));
    jdMethod_new(1);
    b5.jdMethod_case("zhan_X=" + this.c + "----zhan_Y=" + this.jdField_void + "zhan_col=" + this.l + "----zhan_row=" + this.q);
    this.aT = 49;
    this.ap = 0;
    jdMethod_do(0);
  }

  protected b()
  {
  }

  public static void S()
  {
    Object localObject = b5.int$3b9f0c8("/m_refe00.dat");
    localObject = new DataInputStream((InputStream)localObject);
    try
    {
      int i = ((DataInputStream)localObject).readShort();
      b5.jdMethod_case("GameObject.LoadStaticTiles()=" + i);
      cw = new Image[i];
      dZ = new byte[i << 1];
      cI = new short[i];
      c4 = new byte[i];
      df = new byte[i];
      String[] arrayOfString = new String[i];
      for (int j = 0; j < i; j = (short)(j + 1))
      {
        cI[j] = ((DataInputStream)localObject).readShort();
        c4[j] = 0;
        int k = j;
        while ((k = (short)(k - 1)) >= 0)
        {
          if ((c4[k] == 1) || (cI[k] != cI[j]))
            continue;
          cI[j] = k;
          c4[j] = 1;
        }
        if (c4[j] == 0)
          arrayOfString[j] = (cI[j] + ".png");
        dZ[(j * 2)] = ((DataInputStream)localObject).readByte();
        dZ[(j * 2 + 1)] = ((DataInputStream)localObject).readByte();
        k = ((DataInputStream)localObject).readInt();
        k = k;
        int m = 0;
        String str;
        byte tmp261_258 = Integer.valueOf(str = (str = Integer.toString(k)).substring(1, 3)).byteValue();
        m = k < 1000000 ? -1 : tmp261_258;
        df[j] = tmp261_258;
      }
      cw = b5.a(cw, "/mimage/rolebody.pkg", arrayOfString);
      ((DataInputStream)localObject).close();
      return;
    }
    catch (IOException localIOException2)
    {
      IOException localIOException1;
      (localIOException1 = localIOException2).printStackTrace();
    }
  }

  public static void ac()
  {
    try
    {
      b5.jdMethod_case("loadNPC_HUMANData");
      cY = new short[992][];
      d5 = new byte[992][];
      localObject = null;
      localObject = null;
      for (int i = 0; i < 8; i++)
      {
        localObject = b5.int$3b9f0c8("/pd/npc" + (i + 1) + ".dat");
        (localObject = new DataInputStream((InputStream)localObject)).readShort();
        for (int j = i * 124; j < 124 * (i + 1); j++)
        {
          ((DataInputStream)localObject).readShort();
          int k = ((DataInputStream)localObject).readByte();
          cY[j] = new short[k];
          d5[j] = new byte[k];
          for (int m = 0; m < k; m = (byte)(m + 1))
          {
            cY[j][m] = ((DataInputStream)localObject).readShort();
            d5[j][m] = ((DataInputStream)localObject).readByte();
          }
        }
        ((DataInputStream)localObject).close();
      }
      return;
    }
    catch (IOException localIOException)
    {
      Object localObject;
      (localObject = localIOException).printStackTrace();
    }
  }

  public static void T()
  {
    try
    {
      localObject = b5.int$3b9f0c8("/pd/npc4444.dat");
      (localObject = new DataInputStream((InputStream)localObject)).readShort();
      d8 = new short[''][];
      dn = new byte[''][];
      for (int i = 0; i < 132; i = (short)(i + 1))
      {
        ((DataInputStream)localObject).readShort();
        int j = ((DataInputStream)localObject).readByte();
        d8[i] = new short[j];
        dn[i] = new byte[j];
        for (int k = 0; k < j; k = (byte)(k + 1))
        {
          d8[i][k] = ((DataInputStream)localObject).readShort();
          dn[i][k] = ((DataInputStream)localObject).readByte();
        }
      }
      ((DataInputStream)localObject).close();
      return;
    }
    catch (IOException localIOException)
    {
      Object localObject;
      (localObject = localIOException).printStackTrace();
    }
  }

  public final void d(byte paramByte)
  {
    b5.jdMethod_case("NPCXXXX_______load_humanIMG()=" + paramByte);
    this.aR = new short[124][];
    this.co = new byte[124][];
    int j;
    for (int i = 124 * (paramByte - 1); i < paramByte * 124; i++)
    {
      this.aR[(i - 124 * (paramByte - 1))] = new short[cY[i].length];
      for (j = 0; j < cY[i].length; j = (byte)(j + 1))
        this.aR[(i - 124 * (paramByte - 1))][j] = cY[i][j];
    }
    for (i = 124 * (paramByte - 1); i < paramByte * 124; i++)
    {
      this.co[(i - 124 * (paramByte - 1))] = new byte[d5[i].length];
      for (j = 0; j < d5[i].length; j = (byte)(j + 1))
        this.co[(i - 124 * (paramByte - 1))][j] = d5[i][j];
    }
  }

  public final void f(byte paramByte)
  {
    b5.jdMethod_case("load_OrgEquip=" + paramByte);
    byte b = bz.aL.length / 2;
    this.c0 = new short[b][];
    for (int i = paramByte * b; i < b * (paramByte + 1); i++)
    {
      this.c0[(i - paramByte * b)] = new short[bz.aL[i].length];
      for (int j = 0; j < bz.aL[i].length; j++)
        this.c0[(i - paramByte * b)][j] = bz.aL[i][j];
    }
  }

  public static byte a(int paramInt1, int paramInt2)
  {
    return (byte)(paramInt1 + (paramInt1 - 1) + paramInt2);
  }

  public final void a(byte paramByte, boolean paramBoolean)
  {
    this.cL = paramByte;
    this.ci = paramBoolean;
  }

  public final short ad()
  {
    return (short)this.cL;
  }

  public final void jdMethod_int(short paramShort)
  {
    this.d7 = paramShort;
  }

  public final short Y()
  {
    return this.d7;
  }

  public final void jdMethod_for(short paramShort)
  {
    this.dc = paramShort;
  }

  public final short ab()
  {
    return this.dc;
  }

  public final void jdMethod_char(int paramInt)
  {
    this.cj = paramInt;
  }

  public final void a(byte[] paramArrayOfByte, short[][] paramArrayOfShort)
  {
    int j;
    for (int i = 0; i < 124; i = (short)(i + 1))
    {
      j = this.aR[i].length;
      for (int k = 0; k < j; k = (byte)(k + 1))
        for (int m = 0; m < paramArrayOfByte.length; m++)
          for (int n = 0; n < this.c0[(Math.abs(paramArrayOfByte[m]) - 1)].length; n++)
          {
            if ((Math.abs(paramArrayOfByte[m]) == 1) || (Math.abs(paramArrayOfByte[m]) == 2) || (Math.abs(paramArrayOfByte[m]) == 3) || (this.aR[i][k] != this.c0[(Math.abs(paramArrayOfByte[m]) - 1)][n]))
              continue;
            this.aR[i][k] = paramArrayOfShort[m][n];
            if ((paramArrayOfByte[m] < 0) || (paramArrayOfByte[m] <= 0))
              continue;
            int tmp160_158 = k;
            byte[] tmp160_157 = this.co[i];
            tmp160_157[tmp160_158] = (byte)(tmp160_157[tmp160_158] & 0xEF);
          }
    }
    for (i = 0; i < paramArrayOfByte.length; i++)
      for (j = 0; j < paramArrayOfShort[i].length; j++)
        this.c0[(Math.abs(paramArrayOfByte[i]) - 1)][j] = paramArrayOfShort[i][j];
  }

  public final void V()
  {
    int i = 0;
    if (this.bq == 1)
      i = 29;
    else if (this.bq > 1)
      i = 29 + (this.bq - 1) * 9;
    if (this.ct + i >= dJ.jdField_for.length)
    {
      this.ct = 0;
      b5.jdMethod_case("GameObject.checkState()...invalid");
    }
  }

  public void jdMethod_case()
  {
    if (this.jdField_try != 9)
    {
      switch (this.jdField_byte)
      {
      case 0:
        break;
      case 1:
        l();
      }
      d();
      I();
    }
    t();
    U();
  }

  protected final void U()
  {
    this.o = (short)(this.c - z.aE);
    this.n = (short)(this.jdField_void - z.aD + 3);
    if (this.W != null)
    {
      b localb = this;
      int i = (byte)(this.X - 1);
      if (localb.Y)
      {
        if (i < 0)
          i = (byte)(localb.aw.length - 1);
        if ((localb.c != localb.aw[i][0]) || (localb.jdField_void != localb.aw[i][1]))
        {
          localb.aw[localb.X][0] = localb.c;
          localb.aw[localb.X][1] = localb.jdField_void;
          localb.aw[localb.X][2] = (short)localb.y();
          localb.aw[localb.X][3] = (short)localb.jdMethod_do();
          b tmp159_158 = localb;
          localb.X = ((tmp159_158.X = (byte)(tmp159_158.X + 1)) >= localb.aw.length ? 0 : localb.X);
          if (Math.abs(localb.X - localb.bo) == 5)
          {
            localb.W.c = localb.aw[localb.bo][0];
            localb.W.jdField_void = localb.aw[localb.bo][1];
            localb.W.jdMethod_new((byte)localb.aw[localb.bo][2]);
            if (localb.W.jdMethod_do() != 1)
              localb.W.jdMethod_do(1);
            b tmp281_280 = localb;
            localb.bo = ((tmp281_280.bo = (byte)(tmp281_280.bo + 1)) >= localb.aw.length ? 0 : localb.bo);
          }
        }
        localb.Y = false;
        localb.W.jdMethod_if(a4.jdMethod_for(localb.W.c, localb.W.jdField_void), a4.jdMethod_int(localb.W.c, localb.W.jdField_void));
      }
      else if (localb.W.jdMethod_do() != 0)
      {
        b5.jdMethod_case("cartPlayer.!=STATE_STAND=" + localb.W.ct);
        localb.W.jdMethod_do(0);
      }
      this.x = (short)(this.W.c - z.aE);
      this.w = (short)(this.W.jdField_void - z.aD + 3);
    }
    if (this.cK > 0)
    {
      this.cK -= 1;
      return;
    }
    this.dw = -1;
  }

  public final void W()
  {
    this.jdField_int = this.l;
    this.jdField_new = this.q;
  }

  public final void d()
  {
    if (this.A)
    {
      if (this.h == -1)
        this.h = 0;
      return;
    }
    int i = 0;
    int j = 0;
    if (this.bq >= 1)
    {
      i = (short)(41 + (this.bq - 1) * 9);
      j = 0;
    }
    b localb;
    if ((this.bq == 0) && (this.ct >= 6) && (this.ct <= 8))
    {
      localb = this;
      if ((short)this.cL == 4)
        j = 3;
      else
        j = (short)(this.cL * 3);
    }
    if ((this.bq == 0) && (this.ct >= 3) && (this.ct <= 5) && (this.a4))
      j = (short)(j + 23);
    this.dt = (short)(this.ct + i + j);
    if (this.dt >= dJ.jdField_for.length)
      this.dt = 0;
    if (this.h < dJ.jdField_for[this.dt].length - 1)
    {
      this.h = (byte)(this.h + 1);
    }
    else
    {
      switch (jdMethod_do())
      {
      case 2:
        localb = this;
        if ((short)this.cL == 4)
        {
          if (!this.ci)
            break;
          a(3, true);
        }
        else
        {
          j = 0;
          localb = this;
          if (((short)this.cL == 3) && (this.ci))
            a(4, true);
          if (this == bp.ag())
          {
            if ((l.g.jdField_try != 2) && (l.g.jdField_try != 1) && (l.g.jdField_try != 3))
              break;
            if ((l.g.jdField_try == 2) && (l.g.jdMethod_do() != 9))
              jdMethod_do(102);
            else if (((bz)l.g).m() < 0)
            {
              if (l.g.jdMethod_do() != 9)
                jdMethod_do(102);
              else
                jdMethod_do(0);
            }
            else
              jdMethod_do(0);
          }
          else if (this.aA.length > 0)
          {
            jdMethod_do(1);
          }
          else
          {
            jdMethod_do(0);
          }
        }
        break;
      case 3:
        break;
      case 4:
        if (l.a() != null)
        {
          localb = this;
          if ((this.d7 == 0) && ((l.a().jdMethod_for() == 4) || (l.a().jdMethod_for() == 5) || (l.a().jdMethod_for() == 6) || (l.a().jdMethod_for() == 7) || (l.a().jdMethod_for() == 8)))
          {
            if (bp.ag().eK)
            {
              jdMethod_do(3);
              break;
            }
            jdMethod_do(0);
            break;
          }
        }
        jdMethod_do(0);
      }
      this.h = 0;
      if (this.ct == 24)
        this.ct = 25;
      this.dt = (short)(this.ct + i + j);
    }
    if (this.W != null)
    {
      if (this.W.h < dJ.jdField_for[this.W.dt].length - 1)
      {
        b tmp596_593 = this.W;
        tmp596_593.h = (byte)(tmp596_593.h + 1);
        return;
      }
      this.W.h = 0;
      this.W.dt = (short)(this.W.ct + i + j);
    }
  }

  public void a(Graphics paramGraphics)
  {
    if ((l.long) || (bp.ag() == this))
    {
      a(paramGraphics, this.o, this.n);
      jdMethod_do(paramGraphics);
    }
  }

  public final void a(Graphics paramGraphics, short paramShort1, short paramShort2)
  {
    if (this.J)
      return;
    if (this.W != null)
    {
      a(paramGraphics, paramShort1, paramShort2, false);
      return;
    }
    a(paramGraphics, paramShort1, paramShort2, true);
  }

  public final void a(Graphics paramGraphics, short paramShort1, short paramShort2, boolean paramBoolean)
  {
    int i = dJ.jdField_for[this.dt][this.h];
    int j = dJ.jdField_do[i].length;
    for (int n = 0; n < j; n += 2)
    {
      int i1;
      int i2;
      if (!paramBoolean)
      {
        i1 = n >> 1;
        m = i;
        b localb = this;
        i2 = 0;
        if (localb.W != null)
          switch (m)
          {
          case 94:
          case 97:
          case 98:
          case 99:
          case 100:
            m = 0;
          case 95:
          case 101:
          case 102:
          case 103:
          case 104:
          case 96:
          case 105:
          case 106:
          case 107:
          case 108:
            while (true)
              if (m < localb.cW[0].length)
              {
                if (i1 == localb.cW[0][m])
                {
                  i2 = 1;
                }
                else
                {
                  m++;
                  continue;
                }
              }
              else
              {
                break;
                m = 0;
                while (true)
                  if (m < localb.cW[1].length)
                  {
                    if (i1 == localb.cW[1][m])
                    {
                      i2 = 1;
                    }
                    else
                    {
                      m++;
                      continue;
                    }
                  }
                  else
                  {
                    break;
                    for (m = 0; m < localb.cW[2].length; m++)
                    {
                      if (i1 != localb.cW[2][m])
                        continue;
                      i2 = 1;
                      break;
                    }
                  }
              }
          }
        else
          i2 = 1;
        if (i2 != 0)
          continue;
      }
      int m = paramShort2 + dJ.jdField_do[i][(n + 1)];
      int k;
      if (this.g)
        k = paramShort1 - dJ.jdField_do[i][n] + 2;
      else
        k = paramShort1 + dJ.jdField_do[i][n];
      try
      {
        i1 = 0;
        i2 = 0;
        int i3 = 0;
        if (this.bq == 0)
        {
          i1 = this.aR[i][(n >> 1)];
          i2 = (byte)((i3 = this.co[i][(n >> 1)]) & 0x7);
        }
        else
        {
          if (i - 124 < 0)
            return;
          i1 = d8[(i - 124)][(n >> 1)];
          i2 = (byte)((i3 = dn[(i - 124)][(n >> 1)]) & 0x7);
        }
        if ((i3 & 0x10) != 0)
          continue;
        Image localImage = null;
        if (c4[i1] == 0)
          localImage = cw[i1];
        else
          localImage = cw[cI[i1]];
        int i4 = 0;
        int i5 = 0;
        switch (i2)
        {
        case 0:
          i5 = m - dZ[(i1 * 2 + 1)];
          if (this.g)
          {
            i4 = k - (localImage.getWidth() - dZ[(i1 * 2)]);
            b5.a(paramGraphics, localImage, i4, i5, 2);
          }
          else
          {
            i4 = k - dZ[(i1 * 2)];
            b5.a(paramGraphics, localImage, i4, i5, 0);
          }
          break;
        case 1:
          i5 = m - dZ[(i1 * 2)];
          if (this.g)
          {
            i4 = k - dZ[(i1 * 2 + 1)] - 1;
            b5.a(paramGraphics, localImage, i4, i5, 4);
          }
          else
          {
            i4 = k - (localImage.getHeight() - dZ[(i1 * 2 + 1)]) + 1;
            b5.a(paramGraphics, localImage, i4, i5, 5);
          }
          break;
        case 2:
          i5 = m - (localImage.getHeight() - dZ[(i1 * 2 + 1)]) + 1;
          if (this.g)
          {
            i4 = k - dZ[(i1 * 2)] - 1;
            b5.a(paramGraphics, localImage, i4, i5, 1);
          }
          else
          {
            i4 = k - (localImage.getWidth() - dZ[(i1 * 2)]) + 1;
            b5.a(paramGraphics, localImage, i4, i5, 3);
          }
          break;
        case 3:
          i5 = m - (localImage.getWidth() - dZ[(i1 * 2)]) + 1;
          if (this.g)
          {
            i4 = k - (localImage.getHeight() - dZ[(i1 * 2 + 1)]);
            b5.a(paramGraphics, localImage, i4, i5, 7);
          }
          else
          {
            i4 = k - dZ[(i1 * 2 + 1)];
            b5.a(paramGraphics, localImage, i4, i5, 6);
          }
          break;
        case 4:
          i5 = m - dZ[(i1 * 2 + 1)];
          if (this.g)
          {
            i4 = k - dZ[(i1 * 2)] - 1;
            b5.a(paramGraphics, localImage, i4, i5, 0);
          }
          else
          {
            i4 = k - (localImage.getWidth() - dZ[(i1 * 2)]) + 1;
            b5.a(paramGraphics, localImage, i4, i5, 2);
          }
          break;
        case 5:
          i5 = m - dZ[(i1 * 2)];
          if (this.g)
          {
            i4 = k - (localImage.getHeight() - dZ[(i1 * 2 + 1)]);
            b5.a(paramGraphics, localImage, i4, i5, 5);
          }
          else
          {
            i4 = k - dZ[(i1 * 2 + 1)];
            b5.a(paramGraphics, localImage, i4, i5, 4);
          }
          break;
        case 6:
          i5 = m - (localImage.getHeight() - dZ[(i1 * 2 + 1)]) + 1;
          if (this.g)
          {
            i4 = k - (localImage.getWidth() - dZ[(i1 * 2)]);
            b5.a(paramGraphics, localImage, i4, i5, 3);
          }
          else
          {
            i4 = k - dZ[(i1 * 2)];
            b5.a(paramGraphics, localImage, i4, i5, 1);
          }
          break;
        case 7:
          i5 = m - (localImage.getWidth() - dZ[(i1 * 2)]) + 1;
          if (this.g)
          {
            i4 = k - dZ[(i1 * 2 + 1)] - 1;
            b5.a(paramGraphics, localImage, i4, i5, 6);
          }
          else
          {
            i4 = k - (localImage.getHeight() - dZ[(i1 * 2 + 1)]) + 1;
            b5.a(paramGraphics, localImage, i4, i5, 7);
          }
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        b5.jdMethod_case("NullPointerGameObject.DrawHORSE()..." + i + "..." + (n >> 1));
        localNullPointerException.printStackTrace();
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        b5.jdMethod_case("ArrayGameObject.DrawHORSE()..." + i + "..." + (n >> 1));
        localArrayIndexOutOfBoundsException.printStackTrace();
      }
    }
  }

  public final void jdMethod_if(Graphics paramGraphics)
  {
    if (l.long)
    {
      int i = a5.iG + bz.bf - M();
      if (this.ap != 0)
        i = bz.z;
      if (m() == -4)
      {
        if (jdMethod_int().length() == 0)
        {
          b5.jdMethod_if(paramGraphics, jdMethod_byte(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - i, 16711680, 0);
        }
        else
        {
          b5.jdMethod_if(paramGraphics, jdMethod_byte(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - i - a5.iG, 16711680, 0);
          b5.jdMethod_if(paramGraphics, jdMethod_int(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_int()) >> 1), this.n - i, 16711680, 0);
        }
      }
      else if ((bp.ag() == this) || (this.cH))
      {
        super.jdMethod_if(paramGraphics);
      }
      else if (jdMethod_int().length() == 0)
      {
        b5.jdMethod_if(paramGraphics, jdMethod_byte(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - i, 16765952, 0);
      }
      else
      {
        b5.jdMethod_if(paramGraphics, jdMethod_byte(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - i - a5.iG, 16765952, 0);
        b5.jdMethod_if(paramGraphics, jdMethod_int(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_int()) >> 1), this.n - i, 16765952, 0);
      }
    }
    else if (((bp.ag() == this) || (this.cH)) && (bp.ag().aI() != 0))
    {
      super.jdMethod_if(paramGraphics);
    }
    Graphics localGraphics = paramGraphics;
    b localb = this;
    if (this.dw >= 0)
    {
      localGraphics.setColor(0);
      localGraphics.drawLine(localb.o + ch, localb.n - cg + 18, localb.o + ch + 7, localb.n - cg + 18);
      localGraphics.drawLine(localb.o + ch, localb.n - cg + 18, localb.o + ch + 4, localb.n - cg + 13);
      localGraphics.drawRoundRect(localb.o + ch + 4, localb.n - cg, 24, 18, 15, 15);
      localGraphics.setColor(16777215);
      localGraphics.fillRoundRect(localb.o + ch + 5, localb.n - cg + 1, 23, 17, 16, 16);
      a5.cJ.jdMethod_if(localGraphics, localb.o + c9 + 2, localb.n - c7 + (localb.cK % 4 > 1 ? 0 : -1) + 1, localb.dw);
    }
    if ((z.case) && (this.eb))
    {
      if (jdMethod_new() == bp.ag().jdMethod_new())
      {
        if (this.dp == 1)
          a5.cO.jdMethod_if(paramGraphics, this.o - 7, this.n - (a5.iG + bz.bf - M()) + (jdMethod_int().length() == 0 ? 5 : -10), this.dV);
        else
          a5.fQ.jdMethod_if(paramGraphics, this.o - 7, this.n - (a5.iG + bz.bf - M()) + (jdMethod_int().length() == 0 ? 5 : -10), this.dV);
      }
      else if (this.dp == 1)
        a5.cO.jdMethod_if(paramGraphics, this.o - 7, this.n - (a5.iG + bz.bf - M()) + (jdMethod_int().length() == 0 ? -10 : -20), this.dV);
      else
        a5.fQ.jdMethod_if(paramGraphics, this.o - 7, this.n - (a5.iG + bz.bf - M()) + (jdMethod_int().length() == 0 ? -10 : -20), this.dV);
      this.dV = (byte)(this.dV + 1);
      if (this.dV > 3)
        this.dV = 0;
    }
    localGraphics = paramGraphics;
    localb = this;
    this.db = (byte)(this.db ^ 0x1);
    Object localObject;
    if ((localObject = localb).cj > 0)
    {
      localb.c6 = (short)(localb.n - 25 + localb.db);
      if ((localb.y() == 1) || (localb.y() == 7) || (localb.y() == 8))
        localb.c8 = (short)(localb.o + 13);
      else if ((localb.y() == 3) || (localb.y() == 5) || (localb.y() == 6))
        localb.c8 = (short)(localb.o - 20);
      else if (localb.y() == 2)
        localb.c8 = (short)(localb.o + 12);
      else if (localb.y() == 4)
        localb.c8 = (short)(localb.o - 18);
      int k = localb.c6;
      int j = localb.c8;
      (localObject = localGraphics).drawImage(a5.fh, j, k, 20);
    }
    jdMethod_for(paramGraphics);
  }

  public final void e$132be7()
  {
    for (int i = this.dP; i < this.cV.length; i = (byte)(i + 1))
    {
      this.dP = i;
      int j = (byte)b5.jdMethod_new(2);
      this.cV[i][0] = j;
      if (j == 0)
        this.cV[i][0] = -1;
      j = (byte)b5.jdMethod_new(2);
      this.cV[i][1] = j;
      if (j == 0)
        this.cV[i][1] = -1;
      this.cV[i][4] = (byte)(b5.jdMethod_new(3) + 1);
      this.cV[i][5] = 0;
      this.cV[i][6] = (byte)b5.jdMethod_new(dl.length);
      if (this.dP % 2 != 1)
        continue;
      if (this.dP != (byte)(this.cV.length - 1))
        break;
      this.dP = 0;
      return;
    }
  }

  private void a(byte paramByte)
  {
    switch (paramByte)
    {
    case 0:
    case 101:
    case 105:
      switch (this.ap)
      {
      case 0:
        switch (y())
        {
        case 3:
        case 5:
          this.ct = 2;
          this.g = false;
          break;
        case 1:
        case 8:
          this.ct = 0;
          this.g = false;
          break;
        case 2:
        case 7:
          this.ct = 1;
          this.g = false;
          break;
        case 4:
        case 6:
          this.ct = 1;
          this.g = true;
        }
        break;
      case 1:
        switch (y())
        {
        case 3:
        case 5:
          this.ct = 31;
          this.g = false;
          break;
        case 1:
        case 8:
          this.ct = 29;
          this.g = false;
          break;
        case 2:
        case 7:
          this.ct = 30;
          this.g = false;
          break;
        case 4:
        case 6:
          this.ct = 30;
          this.g = true;
        }
        break;
      case 2:
        switch (y())
        {
        case 3:
        case 5:
          this.ct = 37;
          this.g = false;
          break;
        case 1:
        case 8:
          this.ct = 35;
          this.g = false;
          break;
        case 2:
        case 7:
          this.ct = 36;
          this.g = false;
          break;
        case 4:
        case 6:
          this.ct = 36;
          this.g = true;
        }
      }
      break;
    case 1:
    case 10:
    case 100:
    case 102:
    case 103:
    case 104:
      switch (this.ap)
      {
      case 0:
        switch (y())
        {
        case 3:
        case 5:
          this.ct = 5;
          this.g = false;
          break;
        case 1:
        case 8:
          this.ct = 3;
          this.g = false;
          break;
        case 2:
        case 7:
          this.ct = 4;
          this.g = false;
          break;
        case 4:
        case 6:
          this.ct = 4;
          this.g = true;
        }
        break;
      case 1:
        switch (y())
        {
        case 3:
        case 5:
          this.ct = 34;
          this.g = false;
          break;
        case 1:
        case 8:
          this.ct = 32;
          this.g = false;
          break;
        case 2:
        case 7:
          this.ct = 33;
          this.g = false;
          break;
        case 4:
        case 6:
          this.ct = 33;
          this.g = true;
        }
        break;
      case 2:
        switch (y())
        {
        case 3:
        case 5:
          this.ct = 40;
          this.g = false;
          break;
        case 1:
        case 8:
          this.ct = 38;
          this.g = false;
          break;
        case 2:
        case 7:
          this.ct = 39;
          this.g = false;
          break;
        case 4:
        case 6:
          this.ct = 39;
          this.g = true;
        }
      }
      break;
    case 2:
      if (this.cm)
        break;
      this.cm = true;
      switch (y())
      {
      case 3:
      case 5:
        this.ct = 8;
        this.g = false;
        break;
      case 1:
      case 8:
        this.ct = 6;
        this.g = false;
        break;
      case 2:
      case 7:
        this.ct = 7;
        this.g = false;
        break;
      case 4:
      case 6:
        this.ct = 7;
        this.g = true;
      }
      break;
    case 3:
      if (this.bq != 0)
        break;
      this.dF = 0;
      switch (y())
      {
      case 3:
      case 5:
        this.ct = 20;
        this.g = false;
        break;
      case 1:
      case 8:
        this.ct = 18;
        this.g = false;
        break;
      case 2:
      case 7:
        this.ct = 19;
        this.g = false;
        break;
      case 4:
      case 6:
        this.ct = 19;
        this.g = true;
      }
      break;
    case 4:
      if (this.bq != 0)
        break;
      switch (y())
      {
      case 3:
      case 5:
        this.ct = 23;
        this.g = false;
        break;
      case 1:
      case 8:
        this.ct = 21;
        this.g = false;
        break;
      case 2:
      case 7:
        this.ct = 22;
        this.g = false;
        break;
      case 4:
      case 6:
        this.ct = 22;
        this.g = true;
      }
      break;
    case 9:
      this.ct = 24;
    }
    paramByte = 0;
    int i = 0;
    if (this.bq >= 1)
    {
      paramByte = (short)(41 + (this.bq - 1) * 9);
      i = 0;
    }
    int j;
    if ((this.bq == 0) && (this.ct >= 6) && (this.ct <= 8))
    {
      b localb = this;
      if ((short)this.cL == 4)
        j = 3;
      else
        j = (short)(this.cL * 3);
    }
    if ((this.bq == 0) && (this.ct >= 3) && (this.ct <= 5) && (this.a4))
      j = (short)(j + 23);
    this.dt = (short)(this.ct + paramByte + j);
  }

  public final void jdMethod_do(byte paramByte)
  {
    this.cm = false;
    this.jdField_byte = paramByte;
    this.h = 0;
    a(this.jdField_byte);
  }

  public final void jdMethod_new(byte paramByte)
  {
    if (this.a7 != paramByte)
    {
      this.a7 = paramByte;
      a(this.jdField_byte);
    }
  }

  public final short aa()
  {
    return this.cC;
  }

  public final void jdMethod_do(short paramShort)
  {
    this.cC = paramShort;
  }

  public final byte D()
  {
    return g.a[dJ.jdField_if][0];
  }

  public final byte M()
  {
    return g.a[dJ.jdField_if][1];
  }

  public final byte G()
  {
    return g.a[dJ.jdField_if][2];
  }

  public final byte x()
  {
    return g.a[dJ.jdField_if][3];
  }

  static
  {
    { { 1, 1 }, { 3, 3 }, { 6, 6 }, { 7, 8 }, { 8, 6 } }[5] = { 9, 8 };
    dl = new int[] { 16446976, 16523786, 1506314 };
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     b
 * JD-Core Version:    0.6.0
 */
import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public final class bp extends b
{
  public static int em = 0;
  public static bp fI = null;
  public static byte ef = 0;
  public static short fE = 0;
  public static short fD = 0;
  private byte fP = 0;
  private int eV = 0;
  private String eN = "";
  private int ft = 0;
  private byte eE = 0;
  private int ev = 0;
  private byte er = 0;
  long eY = 0L;
  long fR = 0L;
  public int fS = 0;
  public int eC = 0;
  private byte fJ = 0;
  public boolean ep = false;
  public int eU = 0;
  public byte eS = 0;
  private static byte ew = 0;
  private static int[] fe = new int[63];
  public static short[] fj = null;
  public static String[] eQ = null;
  private static short[] eB = null;
  public static short[] el = null;
  public static int[] fg = null;
  public static String[] fu = null;
  public static short[] eD = null;
  private static byte[] eZ = null;
  private static short[] fo = null;
  private static short[] fm = null;
  private static short[] ex = null;
  public static byte[] eW = null;
  public static int[] fN = null;
  public static byte[] en = null;
  private static byte[] eG = null;
  private static short[] eI = null;
  public static long[] et = null;
  public short e1 = 0;
  public short e0 = 0;
  public short e3 = 0;
  public short fb = 0;
  public byte eR = 0;
  public String[] ff = null;
  public byte[][] fc = null;
  public String[][] eF = null;
  public short[][] fO = null;
  public String[][] fl = null;
  private byte[][] eg = null;
  public boolean[][] eO = null;
  public byte[][] eH = null;
  public byte[][] ee = null;
  public byte[][] fL = null;
  public byte e7 = 0;
  public short[] ez = null;
  public byte[] fC = null;
  private byte[] eT = null;
  private static Vector eX = new Vector();
  private byte fF = 0;
  public short[] fG = new short[0];
  private short es = 6000;
  private short fs = 2000;
  private static int fd = 1000;
  private static int eo = 3600;
  private static int ey = 8100;
  private static int e8 = eo;
  private static int fa = ey;
  private static int fB = e8;
  private static int ej = fa;
  private boolean eA = false;
  public boolean eK = true;
  private static int[] e4 = { 27, 44, 93 };
  public boolean fK;
  private static String[] fh = null;
  private long fp = 0L;
  static int fz = 0;
  static int fM = 0;
  private short fA = 200;
  private short e5;
  byte ei = 0;
  static boolean fq = false;

  public static bp ag()
  {
    if (fI == null)
      fI = new bp();
    return fI;
  }

  public static void af()
  {
    fI = null;
  }

  private bp()
  {
    this.jdField_try = 1;
    this.ct = 0;
    this.dt = 0;
    this.aI = new Vector();
    V();
    this.l = z.a(this.jdField_void, this.c);
    this.q = z.jdMethod_if(this.jdField_void, this.c);
    W();
    this.aT = 49;
    this.ap = 0;
    e$132be7();
  }

  public static void a(ac paramac, boolean paramBoolean)
  {
    if (paramBoolean)
      try
      {
        paramBoolean = b5.int$3b9f0c8("/special/sk_des.data");
        DataInputStream localDataInputStream;
        paramBoolean = (localDataInputStream = new DataInputStream(paramBoolean)).readShort();
        ac localac = localDataInputStream.readShort();
        b5.jdMethod_case("skillConCount=" + localac + "   tc_lengh=" + paramBoolean);
        fh = new String[paramBoolean];
        for (paramac = 0; paramac < localac; paramac++)
        {
          paramBoolean = localDataInputStream.readShort();
          fh[paramBoolean] = localDataInputStream.readUTF();
        }
        return;
      }
      catch (Exception paramBoolean)
      {
        return;
      }
    paramBoolean = paramac.jdMethod_new();
    boolean bool = paramac.jdMethod_new();
    b5.jdMethod_case("skillConCount=" + bool + "   tc_lengh=" + paramBoolean);
    fh = new String[paramBoolean];
    for (paramBoolean = false; paramBoolean < bool; paramBoolean++)
    {
      int i = paramac.jdMethod_new();
      fh[i] = paramac.jdMethod_goto();
    }
  }

  public static void a(byte paramByte, ac paramac)
  {
    try
    {
      int i;
      if (ew != paramByte)
      {
        ew = paramByte;
        i = paramac.jdMethod_new();
        b5.jdMethod_case("skillCount=" + i + "--pro=" + paramByte);
        fj = new short[i + 1];
        eQ = new String[i + 1];
        eB = new short[i + 1];
        el = new short[i + 1];
        fg = new int[i + 1];
        fu = new String[i + 1];
        eD = new short[i + 1];
        eZ = new byte[i + 1];
        fo = new short[i + 1];
        fm = new short[i + 1];
        ex = new short[i + 1];
        eW = new byte[i + 1];
        fN = new int[i + 1];
        en = new byte[i + 1];
        eG = new byte[i + 1];
        eI = new short[i + 1];
        et = new long[i + 1];
        for (paramByte = 0; paramByte < i + 1; paramByte++)
          if (paramByte == 0)
          {
            fj[paramByte] = 0;
            eQ[paramByte] = "普通攻击";
            eB[paramByte] = 0;
            el[paramByte] = 0;
            fg[paramByte] = 2000;
            fu[paramByte] = fh[0];
            eD[paramByte] = 0;
            eZ[paramByte] = 2;
            fo[paramByte] = 50;
            fm[paramByte] = 0;
            ex[paramByte] = 0;
            eW[paramByte] = 9;
            fN[paramByte] = 1;
            en[paramByte] = 1;
            eG[paramByte] = 0;
            eI[paramByte] = 32767;
            et[paramByte] = 0L;
          }
          else
          {
            fj[paramByte] = paramac.jdMethod_new();
            eQ[paramByte] = paramac.jdMethod_goto();
            eB[paramByte] = paramac.jdMethod_new();
            el[paramByte] = paramac.jdMethod_new();
            fg[paramByte] = paramac.jdMethod_byte();
            int j = paramac.jdMethod_new();
            try
            {
              fu[paramByte] = fh[j];
            }
            catch (Exception localException2)
            {
              fu[paramByte] = "此技能缺少策划数据";
            }
            eD[paramByte] = paramac.jdMethod_new();
            eZ[paramByte] = paramac.jdMethod_if();
            fo[paramByte] = paramac.jdMethod_new();
            fm[paramByte] = paramac.jdMethod_new();
            ex[paramByte] = paramac.jdMethod_new();
            eW[paramByte] = paramac.jdMethod_if();
            fN[paramByte] = paramac.jdMethod_byte();
            en[paramByte] = paramac.jdMethod_if();
            eG[paramByte] = paramac.jdMethod_if();
            eI[paramByte] = paramac.jdMethod_new();
            et[paramByte] = 0L;
          }
        fh = null;
        (paramByte = paramac).jdField_do = null;
      }
      else
      {
        for (i = 0; i < et.length; i++)
          et[i] = 0L;
        return;
      }
    }
    catch (Exception localException3)
    {
      Exception localException1;
      (localException1 = localException3).printStackTrace();
    }
  }

  public final void a(long[] paramArrayOfLong)
  {
    fe = null;
    long[] arrayOfLong = paramArrayOfLong;
    paramArrayOfLong = ag().i();
    paramArrayOfLong <<= 12;
    int[] arrayOfInt = new int[63];
    for (int j = 0; j < 63; j++)
    {
      int k = j >> 4;
      int m = (m = j & 0xF) << 2;
      long l;
      if ((l = (l = (l = (l = 15L) << m) & arrayOfLong[k]) >>> m) == 0L)
        continue;
      arrayOfInt[j] = paramArrayOfLong;
      arrayOfInt[j] |= j << 4;
      int tmp107_105 = j;
      int[] tmp107_104 = arrayOfInt;
      tmp107_104[tmp107_105] = (int)(tmp107_104[tmp107_105] | tmp107_104);
    }
    fe = arrayOfLong.length == 4 ? arrayOfInt : new int[0];
    eX.removeAllElements();
    for (paramArrayOfLong = 0; paramArrayOfLong < 63; paramArrayOfLong = (byte)(paramArrayOfLong + 1))
    {
      if ((fe[paramArrayOfLong] == 0) || ((i = jdMethod_void(fe[paramArrayOfLong])) == -1))
        continue;
      eX.addElement(new Integer(fe[paramArrayOfLong]));
    }
    int i = (byte)eX.size();
    paramArrayOfLong = this;
    this.fF = i;
    paramArrayOfLong = this;
    this.fG = new short[this.fF];
    for (paramArrayOfLong = 0; paramArrayOfLong < eX.size(); paramArrayOfLong = (short)(paramArrayOfLong + 1))
      this.fG[paramArrayOfLong] = (short)((Integer)eX.elementAt(paramArrayOfLong)).intValue();
  }

  public final int[] aH()
  {
    int i = fj.length - 1;
    int j = 65520;
    int k = 0;
    eX.removeAllElements();
    int n;
    for (int m = 1; m <= i; n = (short)(m + 1))
    {
      if (ag().r() < en[m])
        continue;
      k = 0;
      bp localbp;
      for (i1 = 0; ; i1 = (short)(i1 + 1))
      {
        localbp = this;
        if (i1 >= this.fF)
          break;
        if (((this.fG[i1] & j) != (fj[m] & j)) || (this.fG[i1] < fj[m]))
          continue;
        k = 1;
        break;
      }
      if (k != 0)
        continue;
      if (ex[m] == 0)
        eX.addElement(new Short(m));
      else
        for (i1 = 0; ; i1 = (short)(i1 + 1))
        {
          localbp = this;
          if (i1 >= this.fF)
            break;
          if (((this.fG[i1] & j) != (ex[m] & j)) || (this.fG[i1] < ex[m]))
            continue;
          eX.addElement(new Short(m));
          break;
        }
    }
    int[] arrayOfInt = new int[eX.size()];
    for (int i1 = 0; i1 < eX.size(); i1 = (short)(i1 + 1))
      arrayOfInt[i1] = ((Short)eX.elementAt(i1)).shortValue();
    return arrayOfInt;
  }

  public final int[] m(byte paramByte)
  {
    b5.jdMethod_case("所选等级 = " + paramByte);
    int i = fj.length - 1;
    int j = 65520;
    int k = 0;
    paramByte *= 10;
    eX.removeAllElements();
    int n;
    for (int m = 1; m <= i; n = (short)(m + 1))
    {
      if ((en[m] < paramByte - 9) || (en[m] > paramByte))
        continue;
      k = 0;
      bp localbp;
      for (i1 = 0; ; i1 = (short)(i1 + 1))
      {
        localbp = this;
        if (i1 >= this.fF)
          break;
        if (((this.fG[i1] & j) != (fj[m] & j)) || (this.fG[i1] < fj[m]))
          continue;
        k = 1;
        break;
      }
      if (k != 0)
        continue;
      i1 = 0;
      for (k = 0; ; k = (short)(k + 1))
      {
        localbp = this;
        if (k >= this.fF)
          break;
        if ((this.fG[k] & j) != (fj[m] & j))
          continue;
        i1 = 1;
        if ((this.fG[k] == ex[m]) && (en[m] > r()))
        {
          eX.addElement(new Short(m));
          break;
        }
        if (this.fG[k] == ex[m])
          break;
        eX.addElement(new Short(m));
        break;
      }
      if ((i1 != 0) || (en[m] <= r()))
        continue;
      eX.addElement(new Short(m));
    }
    int[] arrayOfInt = new int[eX.size()];
    for (int i1 = 0; i1 < eX.size(); i1 = (short)(i1 + 1))
      arrayOfInt[i1] = ((Short)eX.elementAt(i1)).shortValue();
    return arrayOfInt;
  }

  public static short jdMethod_void(int paramInt)
  {
    int i = -1;
    int j = (short)fj.length;
    for (int k = 0; k < j; k = (short)(k + 1))
    {
      if (paramInt != fj[k])
        continue;
      i = k;
      break;
    }
    return i;
  }

  public final void jdMethod_do(ac paramac)
  {
    try
    {
      this.eR = paramac.jdMethod_if();
      b5.jdMethod_case("talentTypeCount=" + this.eR);
      this.ff = new String[this.eR];
      this.fc = new byte[this.eR][];
      this.eF = new String[this.eR][];
      this.fO = new short[this.eR][];
      this.fl = new String[this.eR][];
      this.eg = new byte[this.eR][];
      this.eO = new boolean[this.eR][];
      this.eH = new byte[this.eR][];
      this.ee = new byte[this.eR][];
      this.fL = new byte[this.eR][];
      this.eT = new byte[this.eR];
      this.ez = new short[this.eR];
      this.fC = new byte[this.eR];
      for (int i = 0; i < this.eR; i++)
      {
        String str = paramac.jdMethod_goto();
        this.ff[i] = str;
        int k = paramac.jdMethod_if();
        b5.jdMethod_case("talentTypeName=" + str + "  本系天赋个数=" + k);
        this.fc[i] = new byte[k];
        this.eF[i] = new String[k];
        this.fO[i] = new short[k];
        this.fl[i] = new String[k];
        this.eg[i] = new byte[k];
        this.eO[i] = new boolean[k];
        this.eH[i] = new byte[k];
        this.ee[i] = new byte[k];
        this.fL[i] = new byte[k];
        for (int j = 0; j < k; j++)
        {
          this.fc[i][j] = paramac.jdMethod_if();
          if (this.eT[i] < this.fc[i][j])
            this.eT[i] = this.fc[i][j];
          this.eF[i][j] = paramac.jdMethod_goto();
          this.fO[i][j] = paramac.jdMethod_new();
          this.fl[i][j] = paramac.jdMethod_goto();
          this.eg[i][j] = paramac.jdMethod_if();
          this.eH[i][j] = paramac.jdMethod_if();
          b5.jdMethod_case("talentPosition=" + this.fc[i][j] + " talentSuperPosition=" + this.eg[i][j]);
        }
        if (k == 0)
          continue;
        this.fC[i] = this.fc[i][0];
      }
      jdMethod_if(paramac);
      (this = paramac).jdField_do = null;
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }

  public final void jdMethod_if(ac paramac)
  {
    paramac.jdMethod_if();
    for (int i = 0; i < this.eR; i++)
    {
      paramac.jdMethod_if();
      this.ez[i] = 0;
      for (int j = 0; j < this.ee[i].length; j++)
      {
        this.ee[i][j] = paramac.jdMethod_if();
        int tmp57_56 = i;
        short[] tmp57_53 = this.ez;
        tmp57_53[tmp57_56] = (short)(tmp57_53[tmp57_56] + this.ee[i][j]);
        jdMethod_if(i, j);
      }
    }
    this.e7 = paramac.jdMethod_if();
  }

  public final void jdMethod_do(Graphics paramGraphics, int paramInt)
  {
    int i = 0;
    int k = 0;
    if (paramInt == 524292)
    {
      paramGraphics.setColor(bm.dt);
      paramGraphics.drawRect(this.e1, this.e0, this.e3 - 1, this.fb - 1);
      paramGraphics.fillRect(this.e1, this.e0, 3, this.fb);
      paramGraphics.fillRect(this.e1 + this.e3 - 3, this.e0, 3, this.fb);
      paramGraphics.drawRect(this.e1 + 3 + 1, this.e0 + 1 + 1, this.e3 - 8 - 1, this.fb - 4 - 1);
      paramInt = (short)((a5.ic >> 1) - 27 - (a5.gg.jdField_try >> 1));
      paramGraphics.setClip(0, this.e0 + 2, a5.ic, this.fb - 5);
      be localbe;
      int m = (localbe = (be)a5.fE.elementAt(0)).ht;
      ao localao = (ao)a5.es.cf().elementAt(0);
      int n = this.fc[m].length;
      int i1 = 0;
      int i2 = 0;
      for (int i3 = 0; i3 < n; i3++)
      {
        int j = (short)(paramInt + (this.fc[m][i3] - 1) % 3 * 27);
        k = (short)(8 + this.e0 + ((this.fc[m][i3] - 1) / 3 - localao.cb) * 27);
        paramGraphics.setColor(bm.O[(this.fO[m][i3] / 1000 - 1)][0]);
        paramGraphics.fillRect(j - 1, k - 1, 16, 16);
        a5.gg.jdMethod_if(paramGraphics, j, k, r.k((short)(this.fO[m][i3] % 1000)));
        paramGraphics.setColor(bm.O[(this.fO[m][i3] / 1000 - 1)][1]);
        paramGraphics.drawRect(j - 1, k - 1, 15, 15);
        if (this.eO[m][i3] != 0)
          a5.cG.jdMethod_if(paramGraphics, j + a5.gg.jdField_try - a5.cG.jdField_try, k + a5.gg.a - a5.cG.a, this.ee[m][i3]);
        else
          paramGraphics.drawImage(a5.fT, j, k, 0);
        if (this.eg[m][i3] != 0)
        {
          int i4 = (byte)((this.fc[m][i3] - this.eg[m][i3]) / 3 - 1);
          paramGraphics.setColor(6045209);
          int i5 = j + (a5.gg.jdField_try - 8 >> 1);
          int i6 = k - 3 - 8;
          paramGraphics.fillRect(i5 + 2, i6 - i4 * 27, 4, i4 * 27);
          paramGraphics.fillTriangle(i5, i6, i5 + 4 + 4, i6, i5 + 4, i6 + 4);
        }
        if (this.fC[m] != this.fc[m][i3])
          continue;
        i1 = j;
        i2 = k;
      }
      paramGraphics.setColor(16711680);
      paramGraphics.drawRect(i1 - 3, i2 - 3, 19, 19);
      localao.cq.a(paramGraphics);
      paramGraphics.setClip(0, 0, a5.ic, a5.il);
    }
  }

  public final void jdMethod_if(int paramInt1, int paramInt2)
  {
    if ((this.fc[paramInt1][paramInt2] - 1) / 3 * 5 <= this.ez[paramInt1])
    {
      int i = -1;
      for (int j = 0; j < paramInt2; j++)
      {
        if (this.fc[paramInt1][j] != this.eg[paramInt1][paramInt2])
          continue;
        i = j;
        break;
      }
      if (i == -1)
      {
        this.eO[paramInt1][paramInt2] = 1;
      }
      else if (this.ee[paramInt1][i] == this.eH[paramInt1][i])
      {
        this.eO[paramInt1][paramInt2] = 1;
      }
      else
      {
        this.eO[paramInt1][paramInt2] = 0;
        return;
      }
    }
    else
    {
      this.eO[paramInt1][paramInt2] = 0;
    }
  }

  public final void jdMethod_goto(int paramInt)
  {
    int i = 0;
    be localbe;
    byte b1 = (localbe = (be)a5.fE.elementAt(0)).ht;
    int k = this.fC[b1];
    ao localao = (ao)a5.es.cf().elementAt(0);
    int j;
    do
    {
      byte b2;
      switch (paramInt)
      {
      case 0:
        ao tmp76_74 = localao;
        localao.cl = ((tmp76_74.cl = (byte)(tmp76_74.cl - 1)) < 0 ? 0 : localao.cl);
        k = (byte)(k - 3);
        if (k(k))
        {
          this.fC[b1] = k;
          a5.es.c(ag().fl[b1][a(b1, this.fC[b1])]);
        }
        else
        {
          for (i = 0; i < 3; i = (byte)(i + 1))
          {
            b2 = (byte)(localao.cl * 3 + i + 1);
            if (!k(b2))
              continue;
            this.fC[b1] = b2;
            a5.es.c(ag().fl[b1][a(b1, this.fC[b1])]);
            break;
          }
          i = 1;
        }
        break;
      case 1:
        ao tmp239_237 = localao;
        localao.cl = (byte)((tmp239_237.cl = (byte)(tmp239_237.cl + 1)) >= localao.b6 ? localao.b6 - 1 : localao.cl);
        k = (byte)(k + 3);
        if (k(k))
        {
          this.fC[b1] = k;
          a5.es.c(ag().fl[b1][a(b1, this.fC[b1])]);
        }
        else
        {
          for (i = 0; i < 3; i = (byte)(i + 1))
          {
            b2 = (byte)(localao.cl * 3 + i + 1);
            if (!k(b2))
              continue;
            this.fC[b1] = b2;
            a5.es.c(ag().fl[b1][a(b1, this.fC[b1])]);
            break;
          }
          i = 1;
        }
        break;
      case 2:
        i = (byte)((this.fc[b1][a(b1, this.fC[b1])] - 1) % 3);
        if (((k = (byte)(k - 1)) < 1) || (i == 0))
        {
          i = 1;
        }
        else if (k(k))
        {
          this.fC[b1] = k;
          a5.es.c(ag().fl[b1][a(b1, this.fC[b1])]);
        }
        else
        {
          for (b2 = 1; b2 < 2; b2 = 2)
          {
            i = (byte)(k - 1);
            if (!k(i))
              continue;
            this.fC[b1] = i;
            a5.es.c(ag().fl[b1][a(b1, this.fC[b1])]);
            break;
          }
          j = 1;
        }
        break;
      case 3:
        b2 = (byte)((this.fc[b1][a(b1, this.fC[b1])] - 1) % 3);
        if (((k = (byte)(k + 1)) > this.eT[b1]) || (b2 == 2))
        {
          j = 1;
        }
        else
        {
          if (k(k))
          {
            this.fC[b1] = k;
            a5.es.c(ag().fl[b1][a(b1, this.fC[b1])]);
          }
          else
          {
            if (b2 == 2)
              break;
            for (j = 1; j < 3 - b2 - 1; j = (byte)(j + 1))
            {
              byte b3 = (byte)(k + j);
              if (!k(b3))
                continue;
              this.fC[b1] = b3;
              a5.es.c(ag().fl[b1][a(b1, this.fC[b1])]);
              break;
            }
          }
          j = 1;
        }
      }
    }
    while (j == 0);
    ah localah;
    (localah = (ah)a5.es.cf().elementAt(6)).a(this.eF[b1][a(b1, this.fC[b1])]);
    localao.cq.a((short)localao.cl, true);
  }

  private boolean k(byte paramByte)
  {
    int i = 0;
    be localbe;
    int j = (localbe = (be)a5.fE.elementAt(0)).ht;
    for (int k = 0; k < this.fc[j].length; k++)
    {
      if (this.fc[j][k] != paramByte)
        continue;
      i = 1;
      break;
    }
    return i;
  }

  public final int a(byte paramByte1, byte paramByte2)
  {
    int i = -1;
    for (int j = 0; j < this.fc[paramByte1].length; j++)
    {
      if (this.fc[paramByte1][j] != paramByte2)
        continue;
      i = j;
      break;
    }
    return i;
  }

  public final void jdMethod_case()
  {
    this.fA = (short)(this.fA + 1);
    if (this.fA > 200)
    {
      this.fA = 0;
      a5.eQ.a(196639);
    }
    Object localObject1;
    if ((!a5.fR) && (fM <= 20))
    {
      long l = System.currentTimeMillis() - this.fp;
      this.fp = System.currentTimeMillis();
      fM += 1;
      if ((l < 92L) && (++fz > 10))
        (localObject1 = a5.dI).notifyDestroyed();
    }
    if (!aa.int)
    {
      bp localbp = this;
      if (!a5.fR)
        if (z.case)
        {
          if (a5.gQ != null)
            localbp.jdMethod_do(0);
          else if (localbp.jdField_byte == 9);
        }
        else
        {
          int i;
          switch ((localObject1 = localbp).jdField_byte)
          {
          case 3:
            Object tmp217_216 = localObject1;
            tmp217_216.dF = (short)(tmp217_216.dF + 1);
            Object tmp228_227 = localObject1;
            tmp228_227.e5 = (short)(tmp228_227.e5 + 1);
            if ((((b)localObject1).Y() == 0) && ((l.a().jdMethod_for() == 4) || (l.a().jdMethod_for() == 5) || (l.a().jdMethod_for() == 6) || (l.a().jdMethod_for() == 7) || (l.a().jdMethod_for() == 8) || (l.a().jdMethod_for() == 11)))
            {
              if (((b)localObject1).dF <= ((bp)localObject1).es / 120)
                break;
              ((b)localObject1).dF = 0;
              ((b)localObject1).jdMethod_do(4);
              a5.eQ.a(1572866);
            }
            else if ((l.a().jdMethod_for() == 10) && (((bp)localObject1).ei != 0))
            {
              if (((bp)localObject1).e5 <= ((bp)localObject1).fs / 120)
                break;
              ((bp)localObject1).e5 = 0;
              ((b)localObject1).jdMethod_do(0);
              if (((bp)localObject1).ei == 1)
                a5.eQ.a(852000);
              else if (((bp)localObject1).ei == 2)
                a5.eQ.a(852009);
              else if (((bp)localObject1).ei == 3)
                a5.eQ.a(852003);
              ((bp)localObject1).ei = 0;
            }
            else if ((i = ((b)localObject1).ab()) != -1)
            {
              if (((b)localObject1).dF > el[i] / 120)
              {
                ((b)localObject1).dF = 0;
                et[i] = System.currentTimeMillis();
                b5.jdMethod_case("到施法时间CD_Count[" + i + "] =" + et[i]);
                switch (((bz)localObject1).i())
                {
                case 1:
                case 2:
                  ((b)localObject1).jdMethod_do(2);
                  break;
                default:
                  ((b)localObject1).jdMethod_do(4);
                }
                ((bp)localObject1).aG();
                a5.eQ.a(196614);
                b2.a();
                (localObject1 = b2.try).a(1, fj[i], true);
                et[0] = System.currentTimeMillis();
                ((av)localObject1).a(1, 0, true);
                ((av)localObject1).jdMethod_goto();
                break;
              }
            }
            else
            {
              ((b)localObject1).jdMethod_do(0);
            }
            break;
          case 100:
          case 101:
            ((bz)localObject1).l();
            if ((((a4)localObject1).jdField_byte != 0) && (((a4)localObject1).jdField_byte != 101))
              break;
            ((bz)localObject1).jdMethod_case(((bz)l.g).F(), ((bz)l.g).z());
            if (((bz)localObject1).aA.length > 0)
              ((b)localObject1).jdMethod_do(100);
            else
              ((b)localObject1).jdMethod_do(101);
            break;
          case 102:
          case 103:
          case 105:
            i = ((a4)localObject1).jdField_byte;
            bz localbz;
            if ((localObject1 = localObject1).am())
            {
              switch (i)
              {
              case 102:
                if (((bz)localObject1).aB)
                  break label1161;
                if (!((bp)localObject1).at())
                  break;
                ((bp)localObject1).aL();
                break;
              case 105:
                if (((bz)localObject1).aB)
                  break label1161;
                ag();
                if (et[0] > 0L)
                  break;
                ((bp)localObject1).aL();
                break;
              case 103:
                switch (l.g.jdField_try)
                {
                case 2:
                case 3:
                  if ((localbz = (bz)(bz)l.g).m() < 0)
                  {
                    ((bp)localObject1).az();
                  }
                  else
                  {
                    a5.eQ.a(851969);
                    ((b)localObject1).jdMethod_do(0);
                  }
                  break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                  ((bp)localObject1).eK = true;
                  ((bp)localObject1).av();
                  ((b)localObject1).jdMethod_do(3);
                }
              case 104:
              }
              ((bz)localObject1).jdMethod_byte(((a4)localObject1).e(), ((a4)localObject1).jdMethod_void());
              ((bz)localObject1).aA = new int[0][];
            }
            else
            {
              ((bz)localObject1).l();
              if (((a4)localObject1).jdField_byte == 0)
              {
                ((bz)localObject1).jdMethod_case(l.g.e(), l.g.jdMethod_void());
                if (((bz)localObject1).aA.length == 0)
                {
                  Object localObject2;
                  switch ((localObject2 = localObject1).y())
                  {
                  case 3:
                    localObject2.jdMethod_new(1);
                    localObject2.g = false;
                    break;
                  case 1:
                    localObject2.jdMethod_new(3);
                    localObject2.g = false;
                    break;
                  case 2:
                    localObject2.jdMethod_new(4);
                    localObject2.g = true;
                    break;
                  case 4:
                    localObject2.jdMethod_new(2);
                    localObject2.g = false;
                    break;
                  case 5:
                    localObject2.jdMethod_new(8);
                    localObject2.g = true;
                    break;
                  case 6:
                    localObject2.jdMethod_new(7);
                    localObject2.g = false;
                    break;
                  case 7:
                    localObject2.jdMethod_new(6);
                    localObject2.g = true;
                    break;
                  case 8:
                    localObject2.jdMethod_new(5);
                    localObject2.g = false;
                  }
                }
                if (localbz == 105)
                {
                  if (((bz)localObject1).aA.length > 0)
                  {
                    ((b)localObject1).jdMethod_do(102);
                    break;
                  }
                  ((b)localObject1).jdMethod_do(105);
                  break;
                }
                ((b)localObject1).jdMethod_do(localbz);
              }
            }
            break;
          case 104:
            label1161: ((bz)localObject1).l();
          }
          if ((a5.V() != 0) || (a5.gQ != null) || (a5.h4 != null))
          {
            if (localbp.jdField_byte == 10)
              localbp.l(localbp.a7);
          }
          else
          {
            if (a5.jdMethod_byte(a5.iq[17]))
              localbp.e(0);
            else if (a5.jdMethod_byte(a5.iq[18]))
              localbp.e(1);
            else if (a5.jdMethod_byte(a5.iq[19]))
              localbp.e(2);
            else if (a5.jdMethod_byte(a5.iq[20]))
              localbp.e(3);
            else
              if (localbp.ay())
                break label2458;
            switch (localbp.jdField_byte)
            {
            case 0:
              if (a5.jdMethod_try(a5.iq[0]))
              {
                if (localbp.a7 == 3)
                {
                  localbp.jdMethod_do(1);
                  localbp.l(3);
                  b5.jdMethod_case("direction == DIRECT_UP");
                }
                else
                {
                  localbp.jdMethod_new(3);
                }
              }
              else if (a5.jdMethod_try(a5.iq[1]))
              {
                if (localbp.a7 == 1)
                {
                  localbp.jdMethod_do(1);
                  localbp.l(1);
                }
                else
                {
                  localbp.jdMethod_new(1);
                }
              }
              else if (a5.jdMethod_try(a5.iq[2]))
              {
                if (localbp.a7 == 2)
                {
                  localbp.jdMethod_do(1);
                  localbp.l(2);
                }
                else
                {
                  localbp.jdMethod_new(2);
                }
              }
              else if (a5.jdMethod_try(a5.iq[3]))
              {
                if (localbp.a7 == 4)
                {
                  localbp.jdMethod_do(1);
                  localbp.l(4);
                }
                else
                {
                  localbp.jdMethod_new(4);
                }
              }
              else if (a5.jdMethod_byte(a5.iq[4]))
              {
                switch (localbp.a7)
                {
                case 3:
                case 5:
                  localbp.a7 = 3;
                  break;
                case 1:
                case 8:
                  localbp.a7 = 1;
                  break;
                case 2:
                case 7:
                  localbp.a7 = 2;
                  break;
                case 4:
                case 6:
                  localbp.a7 = 4;
                }
                localbp.jdMethod_do(10);
              }
              else if (a5.jdMethod_byte(a5.iq[5]))
              {
                localbp.jdMethod_do(false);
              }
              else if (a5.jdMethod_byte(131072))
              {
                localbp.jdMethod_do(true);
              }
              else
              {
                localbp.au();
                if ((localbp.ab() == -1) || (!fq) || (localbp.dF != 0))
                  break;
                localbp.az();
              }
              break;
            case 1:
              fq = false;
              if (a5.jdMethod_try(a5.iq[0]))
              {
                localbp.l(3);
              }
              else if (a5.jdMethod_try(a5.iq[1]))
              {
                localbp.l(1);
              }
              else if (a5.jdMethod_try(a5.iq[2]))
              {
                localbp.l(2);
              }
              else if (a5.jdMethod_try(a5.iq[3]))
              {
                localbp.l(4);
              }
              else
              {
                localbp.jdMethod_do(0);
                if (localbp.W == null)
                  break;
                localbp.W.jdMethod_do(0);
              }
              break;
            case 10:
              if (a5.V() == 0)
                if (a5.jdMethod_byte(a5.iq[0]))
                {
                  localbp.jdMethod_new(3);
                }
                else if (a5.jdMethod_byte(a5.iq[1]))
                {
                  localbp.jdMethod_new(1);
                }
                else if (a5.jdMethod_byte(a5.iq[2]))
                {
                  localbp.jdMethod_new(2);
                }
                else if (a5.jdMethod_byte(a5.iq[3]))
                {
                  localbp.jdMethod_new(4);
                }
                else if ((a5.jdMethod_byte(a5.iq[5] | 0x20000)) || (a5.jdMethod_byte(a5.iq[4])) || (a5.jdMethod_byte(a5.iq[17] | a5.iq[18] | a5.iq[19] | a5.iq[20])))
                {
                  localbp.jdMethod_do(0);
                  if (localbp.W != null)
                    localbp.W.jdMethod_do(0);
                }
                else
                {
                  localbp.au();
                }
              localbp.l(localbp.a7);
              break;
            case 2:
              if (!a5.jdMethod_byte(a5.iq[0] | a5.iq[1] | a5.iq[2] | a5.iq[3]))
                break;
              localbp.jdMethod_do(0);
              break;
            case 3:
              if (a5.jdMethod_try(a5.iq[0]))
              {
                localbp.dF = 0;
                localbp.e5 = 0;
                localbp.jdMethod_do(1);
                localbp.l(3);
              }
              else if (a5.jdMethod_try(a5.iq[1]))
              {
                localbp.dF = 0;
                localbp.e5 = 0;
                localbp.jdMethod_do(1);
                localbp.l(1);
              }
              else if (a5.jdMethod_try(a5.iq[2]))
              {
                localbp.dF = 0;
                localbp.e5 = 0;
                localbp.jdMethod_do(1);
                localbp.l(2);
              }
              else if (a5.jdMethod_try(a5.iq[3]))
              {
                localbp.dF = 0;
                localbp.e5 = 0;
                localbp.jdMethod_do(1);
                localbp.l(4);
              }
              else if (a5.jdMethod_byte(a5.iq[17] | a5.iq[18] | a5.iq[19] | a5.iq[20]))
              {
                localbp.dF = 0;
                localbp.e5 = 0;
                localbp.jdMethod_do(0);
              }
              else if (z.case)
              {
                if ((l.a().jdMethod_for() != 10) || (localbp.ei == 0) || (!(localObject1 = localbp).eA))
                  break;
                localbp.dF = 0;
                localbp.e5 = 0;
                localbp.ei = 0;
                localbp.jdMethod_if(false);
                localbp.jdMethod_do(0);
              }
              else
              {
                if ((l.a().jdMethod_for() != 11) || (!(localObject1 = localbp).eA))
                  break;
                localbp.dF = 0;
                localbp.e5 = 0;
                localbp.jdMethod_if(false);
                localbp.jdMethod_do(0);
              }
              break;
            case 100:
            case 101:
              if (!a5.jdMethod_byte(-262145))
                break;
              localbp.ar();
              localbp.jdMethod_byte(localbp.e(), localbp.jdMethod_void());
              localbp.aA = new int[0][];
              break;
            case 102:
            case 103:
            case 105:
              if ((!a5.jdMethod_byte(-262145)) || (a5.jdMethod_byte(a5.iq[5] | 0x20000)))
                break;
              localbp.ar();
              localbp.jdMethod_byte(localbp.e(), localbp.jdMethod_void());
              localbp.aA = new int[0][];
              break;
            case 104:
              fq = false;
              if (!a5.jdMethod_byte(-262145))
                break;
              localbp.ar();
              localbp.jdMethod_byte(localbp.e(), localbp.jdMethod_void());
              localbp.aA = new int[0][];
            }
          }
        }
    }
    label2458: d();
    if ((!z.int) && (!z.jdMethod_new()))
    {
      short s1 = a4.jdMethod_for(this.c, this.jdField_void);
      short s2 = a4.jdMethod_int(this.c, this.jdField_void);
      if (z.aI == 2)
      {
        if (z.w == 1)
          jdMethod_if(s1, (short)(s2 + 1));
        else if (z.w == 2)
          jdMethod_if(s1, (short)(s2 - 1));
      }
      else if (z.aI == 3)
        jdMethod_if((short)(s1 + 1), s2);
      this.c = z.jdMethod_for(jdMethod_void(), e());
      this.jdField_void = z.jdMethod_try(jdMethod_void(), e());
      as.a(0, "战场门没有开启,请稍等.", "确定", "", -1, -2);
    }
    else
    {
      jdMethod_if(a4.jdMethod_for(this.c, this.jdField_void), a4.jdMethod_int(this.c, this.jdField_void));
    }
    if (!aP())
    {
      if (!this.cF)
      {
        this.cF = aU();
        if (this.cF)
        {
          a5.fR = true;
          W();
          a5.eQ.a(196612);
        }
      }
      else
      {
        this.cF = false;
      }
      if ((a5.ht % 8 == 0) && (f.else != null) && (this.cA) && (a5.fR != true))
      {
        W();
        a5.eQ.a(196612);
      }
    }
    ap();
    I();
    t();
    U();
  }

  private void aG()
  {
    if (!aP())
    {
      a5.eQ.a(196612);
      W();
    }
  }

  private boolean aU()
  {
    for (int i = 0; i < z.ah.length; i++)
    {
      if ((jdMethod_void() != z.ah[i][0]) || (e() != z.ah[i][1]))
        continue;
      if (jdMethod_do() >= 100)
        return false;
      h();
      a5.fR = true;
      return true;
    }
    return false;
  }

  private boolean aP()
  {
    return (this.jdField_int == this.l) && (this.jdField_new == this.q);
  }

  private void au()
  {
    bp localbp = this;
    if (a5.gZ)
    {
      byte b;
      if (a5.jdMethod_byte(268435456))
      {
        if ((b = aN()) >= 0)
          localbp.p(b);
      }
      else if ((a5.jdMethod_if(268435456)) && (a5.jdMethod_char()) && (a5.a(0, a5.il - 36, a5.ic, 36)) && ((b = aN()) < 0))
      {
        b2.a();
        b2.try.jdMethod_for();
      }
    }
    if (a5.jdMethod_byte(a5.iq[14]))
    {
      b2.a();
      b2.try.jdMethod_for();
      return;
    }
    if (a5.jdMethod_byte(a5.iq[6]))
    {
      p(0);
      return;
    }
    if (a5.jdMethod_byte(a5.iq[7]))
    {
      p(1);
      return;
    }
    if (a5.jdMethod_byte(a5.iq[8]))
    {
      p(2);
      return;
    }
    if (a5.jdMethod_byte(a5.iq[9]))
    {
      p(3);
      return;
    }
    if (a5.jdMethod_byte(a5.iq[10]))
    {
      p(4);
      return;
    }
    if (a5.jdMethod_byte(a5.iq[11]))
    {
      p(5);
      return;
    }
    if (a5.jdMethod_byte(a5.iq[12]))
    {
      p(6);
      return;
    }
    if (a5.jdMethod_byte(a5.iq[13]))
      p(7);
  }

  private static byte aN()
  {
    int i = av.C;
    if (a5.a(0, a5.il - i, a5.ic, 36))
    {
      int j = 0;
      i = a5.il - i - 4;
      int k = a5.cV;
      int m = a5.cU;
      int n = 16 + av.t;
      for (int i1 = 0; i1 < 8; i1 = (byte)(i1 + 1))
      {
        if (i1 < 4)
          j = 3 + i1 * (av.t + 16) - (av.t >> 1);
        else
          j = av.l - (7 - i1) * (av.t + 16) - (av.t >> 1);
        if ((k >= j) && (k <= j + n) && (m >= i) && (m <= i + 20))
          return i1;
      }
    }
    return -1;
  }

  private final void ar()
  {
    jdMethod_do(0);
    au();
  }

  private final void az()
  {
    this.eU = l.g.jdMethod_new();
    if ((l.g == this) || (l.a().jdMethod_for() == 4) || (l.a().jdMethod_for() == 5) || (l.a().jdMethod_for() == 6) || (l.a().jdMethod_for() == 7) || (l.a().jdMethod_for() == 8))
    {
      av();
      jdMethod_do(2);
      this.h = -1;
      return;
    }
    if (am())
    {
      if (this.aB)
        return;
      if (at())
      {
        aL();
        return;
      }
    }
    else
    {
      jdMethod_do(102);
      jdMethod_case(((bz)l.g).e(), ((bz)l.g).jdMethod_void());
    }
  }

  private final boolean at()
  {
    if (et[0] > 0L)
    {
      if (jdMethod_do() != 105)
        jdMethod_do(105);
      return false;
    }
    return true;
  }

  private final void aL()
  {
    av();
    et[0] = System.currentTimeMillis();
    jdMethod_do(2);
    ag().jdMethod_int(0);
    this.h = -1;
    this.eU = l.g.jdMethod_new();
    aG();
    a5.eQ.a(196614);
    b2.a();
    (this = b2.try).a(1, 0, true);
    jdMethod_goto();
  }

  private void jdMethod_do(boolean paramBoolean)
  {
    Object localObject2;
    Object localObject1;
    if (l.g == this)
    {
      this = this;
      localObject2 = this;
      a4 locala4 = null;
      paramBoolean = ey;
      int i;
      boolean bool;
      if (l.long)
        for (i = l.else.length - 1; i >= 0; i--)
        {
          if ((l.else[i].jdField_try != 1) || (((bz)(bz)l.else[i]).m() >= 0) || (l.else[i].jdMethod_do() == 9) || ((bool = (((a4)localObject2).c - l.else[i].jdMethod_try()) * (((a4)localObject2).c - l.else[i].jdMethod_try()) + (((a4)localObject2).jdField_void - l.else[i].b()) * (((a4)localObject2).jdField_void - l.else[i].b())) >= paramBoolean))
            continue;
          paramBoolean = bool;
          locala4 = l.else[i];
        }
      if (locala4 == null)
      {
        for (i = l.else.length - 1; i >= 0; i--)
        {
          if (((l.else[i].jdField_try != 2) && (l.else[i].jdField_try != 3)) || (((bz)(bz)l.else[i]).m() >= 0) || (l.else[i].jdMethod_do() == 9) || ((bool = (((a4)localObject2).c - l.else[i].jdMethod_try()) * (((a4)localObject2).c - l.else[i].jdMethod_try()) + (((a4)localObject2).jdField_void - l.else[i].b()) * (((a4)localObject2).jdField_void - l.else[i].b())) >= paramBoolean))
            continue;
          paramBoolean = bool;
          locala4 = l.else[i];
        }
        if (locala4 == null)
        {
          paramBoolean = eo;
          for (i = l.else.length - 1; i >= 0; i--)
          {
            if (((l.else[i].jdField_try != 4) && (l.else[i].jdField_try != 5) && (l.else[i].jdField_try != 6) && (l.else[i].jdField_try != 7) && (l.else[i].jdField_try != 8)) || ((bool = (((a4)localObject2).c - l.else[i].jdMethod_try()) * (((a4)localObject2).c - l.else[i].jdMethod_try()) + (((a4)localObject2).jdField_void - l.else[i].b()) * (((a4)localObject2).jdField_void - l.else[i].b())) >= paramBoolean))
              continue;
            paramBoolean = bool;
            locala4 = l.else[i];
          }
          if (locala4 == null)
          {
            for (i = l.else.length - 1; i >= 0; i--)
            {
              if (((l.else[i].jdField_try != 2) && (l.else[i].jdField_try != 3)) || (((bz)(bz)l.else[i]).m() < 0) || (l.else[i].jdMethod_do() == 9) || ((bool = (((a4)localObject2).c - l.else[i].jdMethod_try()) * (((a4)localObject2).c - l.else[i].jdMethod_try()) + (((a4)localObject2).jdField_void - l.else[i].b()) * (((a4)localObject2).jdField_void - l.else[i].b())) >= paramBoolean))
                continue;
              paramBoolean = bool;
              locala4 = l.else[i];
            }
            if (locala4 == null)
              if (l.long)
                for (i = l.else.length - 1; i >= 0; i--)
                {
                  if ((l.else[i] == localObject2) || (l.else[i].jdField_try != 1) || (((bz)(bz)l.else[i]).m() < 0) || (l.else[i].jdMethod_do() == 9) || ((bool = (((a4)localObject2).c - l.else[i].jdMethod_try()) * (((a4)localObject2).c - l.else[i].jdMethod_try()) + (((a4)localObject2).jdField_void - l.else[i].b()) * (((a4)localObject2).jdField_void - l.else[i].b())) >= paramBoolean))
                    continue;
                  paramBoolean = bool;
                  locala4 = l.else[i];
                }
          }
        }
      }
      if ((paramBoolean = locala4) != null)
      {
        l.g = paramBoolean;
        switch (paramBoolean.jdField_try)
        {
        case 1:
          if ((localObject1 = (bz)(bz)l.g).m() >= 0)
            break;
          fq = true;
          az();
          break;
        case 2:
        case 3:
          if ((localObject1 = (bz)(bz)l.g).m() < 0)
          {
            fq = true;
            az();
          }
          else if (am())
          {
            a5.eQ.a(851969);
            jdMethod_do(0);
          }
          else
          {
            jdMethod_do(103);
            jdMethod_case(((bz)l.g).F(), ((bz)l.g).z());
          }
          break;
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
          if (am())
          {
            this.eK = true;
            av();
            jdMethod_do(3);
          }
          else
          {
            jdMethod_do(103);
            jdMethod_case(((ag)l.g).e(), ((ag)l.g).jdMethod_void());
          }
        }
        aA();
      }
      else
      {
        if (!this.aB)
        {
          av();
          jdMethod_do(2);
          this.h = -1;
        }
        return;
      }
    }
    else if (l.g.jdField_try == 1)
    {
      if (((bz)l.g).m() >= 0)
      {
        this = this;
        br.iZ = new br(1);
        paramBoolean = new String[] { "查看", "好友资料", "加为好友", "屏蔽玩家", "私聊", "交易", "切磋邀请", "举报" };
        localObject1 = new int[] { 393230, 393229, 589835, 589836, -268435452, 1376269, 196626, 196638 };
        int j;
        if ((bu.e == 0) || (bu.h == ag().jdMethod_new()))
        {
          localObject2 = "组队邀请";
          j = 720897;
          paramBoolean = b5.a(paramBoolean, paramBoolean.length, (String)localObject2);
          localObject1 = b5.a(localObject1, localObject1.length, j);
        }
        b5.jdMethod_case("clanRight" + this.eE);
        b5.jdMethod_case("kingRight" + this.er);
        if ((this.er == i.for) || (this.er == i.void))
        {
          localObject2 = "招入麾下";
          j = 1835013;
          paramBoolean = b5.a(paramBoolean, paramBoolean.length, (String)localObject2);
          localObject1 = b5.a(localObject1, localObject1.length, j);
        }
        else if ((this.eE == bt.long) || (this.eE == bt.d))
        {
          localObject2 = "招入麾下";
          j = 1638405;
          paramBoolean = b5.a(paramBoolean, paramBoolean.length, (String)localObject2);
          localObject1 = b5.a(localObject1, localObject1.length, j);
        }
        br.iZ.a(paramBoolean, localObject1);
        a5.jdMethod_try(6);
        return;
      }
      if (((bz)l.g).m() < 0)
      {
        if ((paramBoolean) && (((bz)l.g).m() != -4) && (!((bz)l.g).L()))
        {
          br.iZ = new br(1);
          this = new String[] { "查看", "示好", "挑衅", "举报" };
          paramBoolean = new int[] { 393230, -268435451, -268435450, 196638 };
          br.iZ.a(this, paramBoolean);
          a5.jdMethod_try(6);
          return;
        }
        fq = true;
        az();
        return;
      }
    }
    else if (((l.g.jdField_try == 3) || (l.g.jdField_try == 2)) && (l.g.jdMethod_do() != 9))
    {
      if ((paramBoolean = (bz)(bz)l.g).m() < 0)
      {
        fq = true;
        az();
      }
      else if (am())
      {
        a5.eQ.a(851969);
        jdMethod_do(0);
      }
      else
      {
        jdMethod_do(103);
        jdMethod_case(((bz)l.g).F(), ((bz)l.g).z());
        return;
      }
    }
    else
    {
      if ((l.g.jdField_try == 4) || (l.g.jdField_try == 5) || (l.g.jdField_try == 6) || (l.g.jdField_try == 7) || (l.g.jdField_try == 8))
      {
        jdMethod_do(103);
        jdMethod_case(((ag)l.g).e(), ((ag)l.g).jdMethod_void());
        return;
      }
      if (l.g.jdField_try == 10)
      {
        a5.eQ.a(851969);
        jdMethod_do(0);
        return;
      }
      if (l.g.jdField_try == 11)
      {
        a5.eQ.a(852071);
        jdMethod_do(0);
      }
    }
  }

  private final void p(byte paramByte)
  {
    b2.a();
    av localav;
    int i = (localav = b2.try).jdField_else[localav.jdField_try][paramByte];
    if ((paramByte = localav.F[localav.jdField_try][paramByte]) >= 0)
      switch (i)
      {
      case 1:
        av();
        paramByte = (short)paramByte;
        this = this;
        short s = jdMethod_void(paramByte);
        if (et[s] <= 0L)
        {
          if (this.B)
            if (i() == 1)
            {
              if ((paramByte < 4480) || (paramByte > 4495))
                break;
            }
            else if (i() == 5)
            {
              if ((paramByte < 21040) || (paramByte > 21055))
                break;
            }
            else if (i() == 2)
            {
              if ((paramByte < 8512) || (paramByte > 8527))
                break;
            }
            else if (i() == 4)
            {
              if ((paramByte < 16768) || (paramByte > 16783))
                break;
            }
            else
              break;
          if (paramByte > 0)
          {
            int k = eI[s];
            bp localbp1 = this;
            int m = 0;
            int n = 0;
            short[] arrayOfShort = { 1, 2, 4, 8, 16, 32 };
            for (int i1 = 0; i1 < arrayOfShort.length; i1 = (byte)(i1 + 1))
            {
              if ((k & arrayOfShort[i1]) != arrayOfShort[i1])
                continue;
              switch (n = i1)
              {
              case 0:
                if ((localbp1.bq != 0) || (localbp1.a4))
                  break;
                m = 1;
                break;
              case 1:
                if ((localbp1.bq != 4) || (localbp1.a4))
                  break;
                m = 1;
                break;
              case 2:
                if ((localbp1.bq != 1) || (localbp1.a4))
                  break;
                m = 1;
                break;
              case 3:
                if ((localbp1.bq != 3) || (localbp1.a4))
                  break;
                m = 1;
                break;
              case 4:
                if ((localbp1.bq != 2) || (localbp1.a4))
                  break;
                m = 1;
                break;
              case 5:
                if ((localbp1.bq != 0) || (!localbp1.a4))
                  break;
                m = 1;
              }
              if (m != 0)
                break;
            }
            if (m == 0)
            {
              ad.a("当前形态不正确，无法使用" + eQ[s] + "！", null);
              break;
            }
            if (i() == 2)
              switch (eG[s])
              {
              case 1:
                localbp1 = this;
                if (this.fJ != 0)
                  break;
                ad.a("连击点数不够，无法使用" + eQ[s] + "！", null);
                break;
              }
            int j = 0;
            switch (eZ[s])
            {
            case 1:
              j = 1;
              this.eU = jdMethod_new();
              break;
            case 2:
              if ((!(l.a() instanceof bz)) || (((bz)(bz)l.a()).m() >= 0))
                break;
              j = 1;
              this.eU = l.a().jdMethod_new();
              break;
            case 3:
              if ((l.a() instanceof bz))
              {
                if (((bz)(bz)l.a()).m() >= 0)
                {
                  if ((jdMethod_char(paramByte)) && (((bz)(bz)l.a()).jdMethod_do() != 9))
                  {
                    j = 0;
                  }
                  else
                  {
                    j = 1;
                    this.eU = l.a().jdMethod_new();
                  }
                }
                else
                {
                  if (jdMethod_char(paramByte))
                    break;
                  j = 1;
                  this.eU = jdMethod_new();
                }
              }
              else
              {
                if (jdMethod_char(paramByte))
                  break;
                j = 1;
                this.eU = jdMethod_new();
              }
              break;
            case 4:
              this.eU = jdMethod_new();
              j = 1;
            }
            if (j == 0)
            {
              ad.a("施法对象错误，无法使用" + eQ[s] + "！", null);
              break;
            }
            if (this.eU != jdMethod_new())
            {
              k = s;
              bp localbp2 = this;
              m = 0;
              if ((n = (localbp2.c - l.a().jdMethod_try()) * (localbp2.c - l.a().jdMethod_try()) + (localbp2.jdField_void - l.a().b()) * (localbp2.jdField_void - l.a().b())) > fm[k] * fm[k])
                m = 1;
              if (m != 0)
              {
                ad.a("超出施法距离，无法使用" + eQ[s] + "！", null);
                break;
              }
            }
            if (v() >= eB[s])
            {
              jdMethod_int(paramByte);
              b5.jdMethod_case("使用  ID=" + paramByte);
              jdMethod_for(s);
              jdMethod_do(3);
            }
            else
            {
              ad.a("魔法值不足！", null);
              break;
            }
          }
          else
          {
            az();
          }
        }
        return;
      case 2:
        av.g = paramByte;
        a5.eQ.a(458763);
      }
  }

  private void av()
  {
    if (this.ap == 1)
    {
      a5.eQ.a(458766);
      if (this.W == null)
      {
        E();
        return;
      }
      g();
    }
  }

  private static void ap()
  {
    b2.a();
    av localav = b2.try;
    eX.size();
    int i = 0;
    for (int j = 0; j < 63; j = (byte)(j + 1))
    {
      int k;
      long l2;
      if (((k = jdMethod_void(fe[j])) == -1) || (fe[j] == 0) || (et[k] <= 0L) || ((l2 = System.currentTimeMillis()) - et[k] < fg[k]))
        continue;
      et[k] = 0L;
      localav.a(1, fe[j], false);
      i = 1;
    }
    long l1;
    if ((et[0] > 0L) && ((l1 = System.currentTimeMillis()) - et[0] >= fg[0]))
    {
      et[0] = 0L;
      localav.a(1, 0, false);
      i = 1;
    }
    if (i != 0)
      localav.jdMethod_goto();
  }

  private static boolean jdMethod_char(short paramShort)
  {
    return ((paramShort >= 16496) && (paramShort <= 16511)) || ((paramShort >= 20656) && (paramShort <= 20671));
  }

  private void e(int paramInt)
  {
    if ((l.g == null) || (paramInt == 1))
    {
      l.g = this;
    }
    else
    {
      int i = l.else.length;
      int j = b5.jdMethod_if(l.else, l.g);
      for (int k = i - 1; k >= 0; k--)
      {
        int m = (m = k + j) % i;
        if (l.else[m].jdField_try == 9)
          continue;
        switch (paramInt)
        {
        case 2:
        case 3:
        case 0:
          if (((l.else[m] instanceof bz)) && (((bz)l.else[m]).m() < 0) && ((goto 236) || ((l.else[m] instanceof ag)) || (((l.else[m] instanceof bz)) && (((bz)l.else[m]).m() >= 0) && (l.else[m] != this) && ((goto 236) || ((!l.long) && (l.else[m].jdField_try == 1) && (l.else[m] != this))))))
            continue;
        case 1:
        default:
          if (!a(l.else[m]))
            continue;
          l.g = l.else[m];
          break label242;
        }
      }
    }
    label242: aA();
  }

  public final void aA()
  {
    switch (l.g.jdMethod_for())
    {
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 10:
    case 11:
      l.char.a(l.g, 0, -1);
      return;
    case 1:
    case 2:
    case 3:
      switch (((bz)l.g).m())
      {
      case -4:
      case -3:
      case -2:
      case -1:
      case 0:
        if (r() > ((bz)l.g).r() + 20)
        {
          l.char.a(l.g, 2, -1);
          return;
        }
        l.char.a(l.g, 1, -1);
        return;
      case 1:
      case 2:
      case 3:
      case 4:
        fq = false;
        l.char.a(l.g, 0, -1);
      }
    case 9:
    }
  }

  private boolean a(a4 parama4)
  {
    int i = 0;
    int j;
    if ((parama4 instanceof bz))
    {
      bz localbz;
      if ((localbz = (bz)parama4).m() < 0)
        j = ej;
      else
        j = fB;
    }
    else
    {
      j = fB;
    }
    return (this.c - parama4.jdMethod_try()) * (this.c - parama4.jdMethod_try()) + (this.jdField_void - parama4.b()) * (this.jdField_void - parama4.b()) < j;
  }

  public final boolean aF()
  {
    int i = 0;
    int j;
    if ((l.g instanceof bz))
    {
      bz localbz;
      if ((localbz = (bz)l.g).m() < 0)
        j = fa;
      else
        j = e8;
    }
    else
    {
      j = e8;
    }
    return (jdMethod_do() != 102) && ((this.c - l.g.jdMethod_try()) * (this.c - l.g.jdMethod_try()) + (this.jdField_void - l.g.b()) * (this.jdField_void - l.g.b()) > j);
  }

  public final void ax()
  {
    bz localbz;
    for (int i = l.else.length - 1; i >= 0; localbz--)
    {
      if ((l.else[i].l != this.l) || (l.else[i].q != this.q) || (l.else[i].jdField_try != 3))
        continue;
      localbz = (bz)(bz)(l.g = l.else[i]);
      aA();
      if (localbz.m() >= 0)
        a5.eQ.a(851969);
      return;
    }
  }

  private boolean am()
  {
    a4 locala4 = l.g;
    this = this;
    if ((this.c - locala4.jdMethod_try()) * (this.c - locala4.jdMethod_try()) + (this.jdField_void - locala4.b()) * (this.jdField_void - locala4.b()) <= fd)
    {
      int j = this.c >= locala4.jdMethod_try() ? 1 : 0;
      int i = this.jdField_void >= locala4.b() ? 1 : 0;
      switch (this.a7)
      {
      case 3:
      case 5:
        return i != 0;
      case 1:
      case 8:
        return i == 0;
      case 2:
      case 7:
        return j != 0;
      case 4:
      case 6:
        return j == 0;
      }
      return false;
    }
    return false;
  }

  public final void a(long paramLong)
  {
    this.eY = paramLong;
  }

  public final void jdMethod_if(long paramLong)
  {
    this.fR = paramLong;
  }

  public final long aM()
  {
    return this.eY;
  }

  public final long aD()
  {
    return this.fR;
  }

  public final byte aj()
  {
    return this.fF;
  }

  public final int an()
  {
    return this.eV;
  }

  public final void jdMethod_long(int paramInt)
  {
    this.eV = paramInt;
  }

  public final int aR()
  {
    return this.fP;
  }

  public final void g(byte paramByte)
  {
    this.fP = paramByte;
  }

  public final String ah()
  {
    return this.eN;
  }

  public final void jdMethod_do(String paramString)
  {
    this.eN = paramString;
  }

  public final byte aI()
  {
    return this.fJ;
  }

  public final void n(byte paramByte)
  {
    this.fJ = paramByte;
  }

  public final boolean al()
  {
    return this.eA;
  }

  public final void jdMethod_if(boolean paramBoolean)
  {
    this.eA = paramBoolean;
    if ((paramBoolean) && (!be.hp))
    {
      be.hp = true;
      ad.a("你正在遭到攻击！", true);
      return;
    }
    be.hp = false;
  }

  public final void a(Graphics paramGraphics)
  {
    super.a(paramGraphics);
  }

  public final void jdMethod_char(Graphics paramGraphics)
  {
    int i = 0;
    if (a5.d8)
      i = a5.il - 36 - ad.long.getHeight() - 7 - 20;
    else
      i = a5.il - 36 - 2 * a5.iG - 8;
    if ((Y() == 0) && ((l.a().jdMethod_for() == 4) || (l.a().jdMethod_for() == 5) || (l.a().jdMethod_for() == 6) || (l.a().jdMethod_for() == 7) || (l.a().jdMethod_for() == 8) || (l.a().jdMethod_for() == 11)))
    {
      jdMethod_if(paramGraphics, i);
      b5.a(paramGraphics, a5.ic - 50 >> 1, i + 2, this.dF * 50 / (this.es / 120), 3, 16776960);
      return;
    }
    if ((l.a().jdMethod_for() == 10) && (this.ei != 0))
    {
      jdMethod_if(paramGraphics, i);
      b5.a(paramGraphics, a5.ic - 50 >> 1, i + 2, this.e5 * 50 / (this.fs / 120), 3, 16776960);
      return;
    }
    if (el[ab()] != 0)
    {
      jdMethod_if(paramGraphics, i);
      b5.a(paramGraphics, a5.ic - 50 >> 1, i + 2, this.dF * 50 / (el[ab()] / 120), 3, 16776960);
    }
  }

  private static void jdMethod_if(Graphics paramGraphics, int paramInt)
  {
    b5.jdMethod_if(paramGraphics, a5.ic - 50 - 4 >> 1, paramInt, 54, 7, bm.aR);
    b5.jdMethod_if(paramGraphics, (a5.ic - 50 - 4 >> 1) + 1, paramInt + 1, 52, 5, bm.aP);
    b5.a(paramGraphics, a5.ic - 50 >> 1, paramInt + 2, 50, 3, 0);
  }

  private void l(byte paramByte)
  {
    if (this.a7 != paramByte)
      jdMethod_new(paramByte);
    jdMethod_long(paramByte);
    this = this;
    paramByte = this.aT % 7;
    switch (this.a7)
    {
    case 2:
      if (!z.a().jdMethod_int(this.l - 1, this.q + 1))
      {
        if (this.jdField_void <= z.jdMethod_try(this.l, this.q))
        {
          if (!z.a().jdMethod_int(this.l - 1, this.q))
          {
            if (z.a().jdMethod_int(this.l, this.q + 1))
              jdMethod_long(7);
          }
          else
            jdMethod_long(5);
        }
        else if (!z.a().jdMethod_int(this.l, this.q + 1))
        {
          if (z.a().jdMethod_int(this.l - 1, this.q))
            jdMethod_long(5);
        }
        else
          jdMethod_long(7);
        this.c = (short)(this.c + bz.bj[paramByte][0]);
      }
      else if (!z.a().jdMethod_int(this.l - 1, this.q))
      {
        if (z.a().jdMethod_int(this.l, this.q + 1))
          jdMethod_long(7);
        this.c = (short)(this.c + bz.bj[paramByte][0]);
      }
      else
      {
        if (z.a().jdMethod_int(this.l, this.q + 1))
          break;
        if (z.a().jdMethod_int(this.l - 1, this.q))
          jdMethod_long(5);
        this.c = (short)(this.c + bz.bj[paramByte][0]);
      }
      break;
    case 4:
      if (!z.a().jdMethod_int(this.l + 1, this.q - 1))
      {
        if (this.jdField_void <= z.jdMethod_try(this.l, this.q))
        {
          if (!z.a().jdMethod_int(this.l, this.q - 1))
          {
            if (z.a().jdMethod_int(this.l + 1, this.q))
              jdMethod_long(8);
          }
          else
            jdMethod_long(6);
        }
        else if (!z.a().jdMethod_int(this.l + 1, this.q))
        {
          if (z.a().jdMethod_int(this.l, this.q - 1))
            jdMethod_long(6);
        }
        else
          jdMethod_long(8);
        this.c = (short)(this.c - bz.bj[paramByte][0]);
      }
      else if (!z.a().jdMethod_int(this.l, this.q - 1))
      {
        if (z.a().jdMethod_int(this.l + 1, this.q))
          jdMethod_long(8);
        this.c = (short)(this.c - bz.bj[paramByte][0]);
      }
      else
      {
        if (z.a().jdMethod_int(this.l + 1, this.q))
          break;
        if (z.a().jdMethod_int(this.l, this.q - 1))
          jdMethod_long(6);
        this.c = (short)(this.c - bz.bj[paramByte][0]);
      }
      break;
    case 3:
      if (!z.a().jdMethod_int(this.l - 1, this.q - 1))
      {
        if (this.c <= z.jdMethod_for(this.l, this.q))
        {
          if (!z.a().jdMethod_int(this.l - 1, this.q))
          {
            if (z.a().jdMethod_int(this.l, this.q - 1))
              jdMethod_long(6);
          }
          else
            jdMethod_long(5);
        }
        else if (!z.a().jdMethod_int(this.l, this.q - 1))
        {
          if (z.a().jdMethod_int(this.l - 1, this.q))
            jdMethod_long(5);
        }
        else
          jdMethod_long(6);
        this.jdField_void = (short)(this.jdField_void + bz.bj[paramByte][1]);
      }
      else if (!z.a().jdMethod_int(this.l - 1, this.q))
      {
        if (z.a().jdMethod_int(this.l, this.q - 1))
          jdMethod_long(6);
        this.jdField_void = (short)(this.jdField_void + bz.bj[paramByte][1]);
      }
      else
      {
        if (z.a().jdMethod_int(this.l, this.q - 1))
          break;
        if (z.a().jdMethod_int(this.l - 1, this.q))
          jdMethod_long(5);
        this.jdField_void = (short)(this.jdField_void + bz.bj[paramByte][1]);
      }
      break;
    case 1:
      if (!z.a().jdMethod_int(this.l + 1, this.q + 1))
      {
        if (this.c <= z.jdMethod_for(this.l, this.q))
        {
          if (!z.a().jdMethod_int(this.l, this.q + 1))
          {
            if (z.a().jdMethod_int(this.l + 1, this.q))
              jdMethod_long(8);
          }
          else
            jdMethod_long(7);
        }
        else if (!z.a().jdMethod_int(this.l + 1, this.q))
        {
          if (z.a().jdMethod_int(this.l, this.q + 1))
            jdMethod_long(7);
        }
        else
          jdMethod_long(8);
        this.jdField_void = (short)(this.jdField_void - bz.bj[paramByte][1]);
      }
      else if (!z.a().jdMethod_int(this.l, this.q + 1))
      {
        if (z.a().jdMethod_int(this.l + 1, this.q))
          jdMethod_long(8);
        this.jdField_void = (short)(this.jdField_void - bz.bj[paramByte][1]);
      }
      else
      {
        if (z.a().jdMethod_int(this.l + 1, this.q))
          break;
        if (z.a().jdMethod_int(this.l, this.q + 1))
          jdMethod_long(7);
        this.jdField_void = (short)(this.jdField_void - bz.bj[paramByte][1]);
      }
    }
    0;
  }

  public final void aq()
  {
    if ((a5.gZ) && (a5.jdMethod_byte(268435456)) && (br.iZ.df()))
      a5.a(131072);
    int i;
    switch (i = ((Integer)(Integer)br.iZ.db().elementAt(br.iZ.de())).intValue())
    {
    case 720897:
      bu.k = l.g.jdMethod_new();
      a5.eQ.a(i);
      a5.jdMethod_try(0);
      break;
    case 393229:
      a5.eQ.a(i);
      a5.jdMethod_try(0);
      break;
    case 1638405:
      b5.jdMethod_case("加氏族--------------------------");
      bt.f = l.g.jdMethod_new();
      a5.eQ.a(i);
      a5.jdMethod_try(0);
      break;
    case 1835013:
      b5.jdMethod_case("加诸侯--------------------------");
      i.long = l.g.jdMethod_new();
      a5.eQ.a(i);
      a5.jdMethod_try(0);
      break;
    case 589835:
    case 589836:
      bg.hP = l.g.jdMethod_new();
      a5.eQ.a(i);
      a5.jdMethod_try(0);
      break;
    case 1376269:
      a5.eQ.a(i);
      a5.jdMethod_try(0);
      break;
    case 393230:
      a5.eQ.a(i);
      a5.jdMethod_try(0);
      break;
    case -268435451:
      this.eS = 1;
      a5.eQ.a(393233);
      a5.jdMethod_try(0);
      break;
    case -268435450:
      this.eS = 2;
      a5.eQ.a(393233);
      a5.jdMethod_try(0);
      break;
    case 196638:
      l.try = l.g.jdMethod_new();
      a5.eQ.a(i);
      a5.jdMethod_try(0);
      break;
    case -268435452:
      a3.a(l.g.jdMethod_new(), l.g.jdMethod_byte(), true);
      break;
    case 196626:
      a5.eQ.a(i);
      a5.jdMethod_try(0);
      break;
    default:
      ad.jdMethod_int(7, "此功能尚未开启。", -1, "", null, null);
      a5.jdMethod_try(0);
    }
    br.iZ = null;
  }

  public final int ai()
  {
    return this.ft;
  }

  public final void b(int paramInt)
  {
    this.ft = paramInt;
  }

  public final byte aT()
  {
    return this.eE;
  }

  public final void i(byte paramByte)
  {
    this.eE = paramByte;
  }

  public final int aS()
  {
    return this.ev;
  }

  public final void d(int paramInt)
  {
    this.ev = paramInt;
  }

  public final byte as()
  {
    return this.er;
  }

  public final void h(byte paramByte)
  {
    this.er = paramByte;
  }

  private boolean ay()
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if ((a5.gZ) && (a5.jdMethod_byte(268435456)))
    {
      int n;
      if ((a5.jdMethod_else() == 5) && (a5.V() == 0) && (ad.a == 0))
      {
        n = 0;
        i1 = a5.il - 36 - ad.long.getHeight();
        i2 = a5.ic;
        i3 = ad.long.getHeight();
        if (a5.a(0, i1, i2, i3))
        {
          m = 1;
          a5.a(a5.iq[16]);
        }
      }
      int i7;
      if (bu.n != null)
      {
        n = -1;
        i1 = 26;
        i2 = 2 + b2.if;
        if (bu.c)
        {
          i1 = 26 + a5.iG;
          i2 += a5.iG;
        }
        i3 = 0;
        i4 = 0;
        i5 = 0;
        int i6 = 0;
        i3 = bu.n.length;
        while (i6 < i3)
        {
          i4 = i2 + i6 * i1;
          if (a5.a(2, i4, 48, 14))
          {
            i = 1;
            n = i6;
            break;
          }
          i6++;
        }
        if (i != 0)
          for (i7 = l.else.length - 1; i7 >= 0; i7--)
          {
            if (l.else[i7].jdField_goto != bu.n[n].jdField_goto)
              continue;
            if ((i3 = (this.c - l.else[i7].jdMethod_try()) * (this.c - l.else[i7].jdMethod_try()) + (this.jdField_void - l.else[i7].b()) * (this.jdField_void - l.else[i7].b())) > eo)
              break;
            l.jdMethod_do(l.else[i7]);
            aA();
            break;
          }
      }
      int i1 = a5.gF.jdField_try;
      int i2 = a5.gF.a;
      int i3 = -1;
      int i4 = a5.gF.jdField_int;
      for (int i5 = 0; i5 < i4; i5++)
      {
        if (!a5.a(i7 = b2.new + i1 * i5, 2, i1, i2))
          continue;
        j = 1;
        i3 = i5;
        break;
      }
      if (j != 0)
      {
        b1.a locala;
        switch (i3)
        {
        case 0:
          a5.a(a5.iq[16]);
          break;
        case 1:
          b1.v(1);
          break;
        case 2:
          a5.eQ.a(458760);
          break;
        case 3:
          b1.v(3);
          break;
        case 4:
          b1.v(4);
          break;
        case 5:
          b1.v(8);
          break;
        case 6:
          b1.v(6);
          break;
        case 7:
          b1.dK();
          break;
        case 8:
          b1.v(9);
          break;
        case 9:
          b1.dN();
          b1.lx.jdMethod_if(10);
          b1.lx.jdMethod_char();
          i1 = 0;
          (locala = b1.lx).jdField_new = i1;
          break;
        case 10:
          a5.eQ.a(2425024);
          break;
        case 11:
          b1.dN();
          b1.lx.jdMethod_if(11);
          b1.lx.jdMethod_char();
          i1 = 0;
          (locala = b1.lx).jdField_new = i1;
          break;
        case 12:
          a5.eQ.a(2355697);
        }
      }
      if ((j == 0) && (i == 0) && (a5.jdMethod_for(0, 0, a5.ic, z.aS)))
      {
        k = 1;
        this = this;
        short s1 = 0;
        i1 = l.else.length - 1;
        while (true)
          if (i1 >= 0)
          {
            bz localbz;
            if (((l.else[i1].jdField_try != 1) && (l.else[i1].jdField_try != 2) && (l.else[i1].jdField_try != 3)) || ((l.else[i1].jdMethod_do() != 9) || ((l.else[i1].jdField_try == 1) && (l.else[i1].jdMethod_do() == 9))))
            {
              if (a5.a((localbz = (bz)l.else[i1]).D() + localbz.jdMethod_long(), localbz.M() + localbz.a(), localbz.G(), localbz.x()))
              {
                s1 = 1;
                if ((localbz.jdField_try == 1) && (localbz != ag()) && (!l.long))
                  s1 = 0;
              }
            }
            else if ((l.else[i1].jdField_try == 4) || (l.else[i1].jdField_try == 5) || (l.else[i1].jdField_try == 6) || (l.else[i1].jdField_try == 7) || (l.else[i1].jdField_try == 8))
            {
              if (a5.a(l.else[i1].o - (a5.ch.jdField_try >> 1), l.else[i1].n - (a5.ch.a >> 1), a5.ch.jdField_try, a5.ch.a))
                s1 = 1;
            }
            else if (((l.else[i1].jdField_try == 10) || (l.else[i1].jdField_try == 11)) && (a5.a(l.else[i1].o - (a5.hk.jdField_try >> 1), l.else[i1].n - (a5.hk.a >> 1), a5.hk.jdField_try, a5.hk.a)))
              s1 = 1;
            if (s1 != 0)
            {
              if (a(l.else[i1]))
                if (l.else[i1] == l.a())
                {
                  if ((l.else[i1].jdField_try == 2) || ((l.else[i1].jdField_try == 1) && (l.else[i1] != ag())))
                  {
                    if (!fq)
                    {
                      jdMethod_do(false);
                      fq = true;
                    }
                    if (l.else[i1].jdField_try == 1)
                    {
                      if ((localbz = (bz)(bz)l.else[i1]).m() >= 0)
                        fq = false;
                      break;
                    }
                  }
                  else
                  {
                    jdMethod_do(false);
                    break;
                  }
                }
                else
                {
                  fq = false;
                  l.jdMethod_do(l.else[i1]);
                  aA();
                  this.dF = 0;
                  this.e5 = 0;
                  jdMethod_do(0);
                }
            }
            else
            {
              i1--;
              continue;
            }
          }
          else
          {
            i1 = (short)(a5.eF + z.aE);
            short s3;
            s1 = z.a(s3 = (short)(a5.eD + z.aD), i1);
            short s2 = z.jdMethod_if(s3, i1);
            if (!z.a().jdMethod_int(s1, s2))
              break;
            this.dF = 0;
            this.e5 = 0;
            fq = false;
            jdMethod_do(104);
            jdMethod_case(s2, s1);
            ef = a5.hN.jdField_new;
            fE = (short)(a5.eF - (a5.hN.jdField_try >> 1) + z.aE);
            fD = (short)(a5.eD - (a5.hN.a >> 1) + z.aD);
          }
      }
    }
    return (j != 0) || (i != 0) || (k != 0) || (m != 0);
  }

  public static boolean c(int paramInt)
  {
    for (int i = 0; i < e4.length; i++)
      if (paramInt == e4[i])
        return true;
    return false;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bp
 * JD-Core Version:    0.6.0
 */
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class t extends bz
{
  byte bH = -1;
  public static String[] bU = null;
  public static Image[] bR = null;
  private static byte[] bA = null;
  private static short[] bN = null;
  private static byte[] bD = null;
  private static short[][][] bF = null;
  private static byte[][][] bL = null;
  private static byte[] bz = null;
  short bZ = -1;
  short bE = -1;
  public g bI = null;
  private int bB = 0;
  private static Hashtable bV;

  protected t()
  {
  }

  public t(byte paramByte1, byte paramByte2)
  {
    this.jdField_try = paramByte1;
    this.bI = a4.d.jdMethod_if(a4.d.jdMethod_for(bz[paramByte2]));
    this.h = 0;
    this.bZ = 0;
    this.bE = 0;
    this.aT = 49;
    jdMethod_do(0);
    jdMethod_new(1);
    this.aI = new Vector();
  }

  public static void a(ac paramac)
  {
    try
    {
      int i = paramac.jdMethod_if();
      b5.jdMethod_case("Neighbor.LoadStaticTiles-neiYICount=" + i);
      bF = new short[i][][];
      bL = new byte[i][][];
      bz = new byte[i];
      short s = 0;
      Hashtable localHashtable = new Hashtable();
      b5.jdMethod_case("--------------MonsterRefe.size()" + bV.size());
      int n;
      for (int j = 0; j < i; j++)
      {
        boolean bool;
        int i1;
        int i2;
        if ((bool = paramac.jdMethod_case()))
        {
          int k = (n = paramac.jdMethod_byte()) / 100000;
          n %= 100000;
          bz[j] = (byte)k;
          i1 = paramac.jdMethod_new();
          bF[j] = new short[i1][];
          bL[j] = new byte[i1][];
          InputStream localInputStream = null;
          DataInputStream localDataInputStream = null;
          localInputStream = b5.int$3b9f0c8("/pkg_npc/npcdata/npc" + n + ".dat");
          (localDataInputStream = new DataInputStream(localInputStream)).readShort();
          for (n = 0; n < i1; n++)
          {
            localDataInputStream.readShort();
            i2 = localDataInputStream.readByte();
            bF[j][n] = new short[i2];
            bL[j][n] = new byte[i2];
            for (int i3 = 0; i3 < i2; i3 = (byte)(i3 + 1))
            {
              bF[j][n][i3] = localDataInputStream.readShort();
              bL[j][n][i3] = localDataInputStream.readByte();
              if ((bL[j][n][i3] & 0x8) == 0)
              {
                if (localHashtable.containsKey(new String(bF[j][n][i3] + "P")))
                  continue;
                localHashtable.put(new String(bF[j][n][i3] + "P"), new Short(bF[j][n][i3]));
              }
              else
              {
                if (localHashtable.containsKey(new String(bF[j][n][i3] + "M")))
                  continue;
                s = (short)(s + 1);
                localHashtable.put(new String(bF[j][n][i3] + "M"), new Short(s));
              }
            }
          }
          for (n = 0; n < i1; n++)
            for (i2 = 0; i2 < bF[j][n].length; i2 = (byte)(i2 + 1))
              if ((bL[j][n][i2] & 0x8) == 0)
                bF[j][n][i2] = ((Short)localHashtable.get(new String(bF[j][n][i2] + "P"))).shortValue();
              else
                bF[j][n][i2] = ((Short)localHashtable.get(new String(bF[j][n][i2] + "M"))).shortValue();
          localDataInputStream.close();
        }
        else
        {
          n = paramac.jdMethod_new();
          bz[j] = (byte)n;
          m = paramac.jdMethod_new();
          b5.jdMethod_case("Neighbor.LoadStaticTiles-frmCount=" + m + "--dddd=" + n);
          bF[j] = new short[m][];
          bL[j] = new byte[m][];
          for (n = 0; n < m; n++)
          {
            paramac.jdMethod_new();
            i1 = paramac.jdMethod_if();
            bF[j][n] = new short[i1];
            bL[j][n] = new byte[i1];
            for (i2 = 0; i2 < i1; i2 = (byte)(i2 + 1))
            {
              bF[j][n][i2] = paramac.jdMethod_new();
              bL[j][n][i2] = paramac.jdMethod_if();
              if ((bL[j][n][i2] & 0x8) == 0)
              {
                if (localHashtable.containsKey(new String(bF[j][n][i2] + "P")))
                  continue;
                localHashtable.put(new String(bF[j][n][i2] + "P"), new Short(bF[j][n][i2]));
              }
              else
              {
                if (localHashtable.containsKey(new String(bF[j][n][i2] + "M")))
                  continue;
                s = (short)(s + 1);
                localHashtable.put(new String(bF[j][n][i2] + "M"), new Short(s));
              }
            }
          }
          for (n = 0; n < m; n++)
            for (i1 = 0; i1 < bF[j][n].length; i1 = (byte)(i1 + 1))
              if ((bL[j][n][i1] & 0x8) == 0)
                bF[j][n][i1] = ((Short)localHashtable.get(new String(bF[j][n][i1] + "P"))).shortValue();
              else
                bF[j][n][i1] = ((Short)localHashtable.get(new String(bF[j][n][i1] + "M"))).shortValue();
        }
      }
      localHashtable.clear();
      j = paramac.jdMethod_new();
      b5.jdMethod_case("Neighbor.LoadStaticTiles-refe01count=" + j);
      bR = new Image[j];
      bA = new byte[j << 1];
      bN = new short[j];
      bD = new byte[j];
      bU = new String[j];
      for (int m = 0; m < j; m = (short)(m + 1))
      {
        bN[m] = paramac.jdMethod_new();
        bD[m] = 0;
        n = m;
        while ((n = (short)(n - 1)) >= 0)
        {
          if ((bD[n] == 1) || (bN[n] != bN[m]))
            continue;
          bN[m] = n;
          bD[m] = 1;
        }
        if (bD[m] == 0)
          bU[m] = (bN[m] + ".png");
        bA[(m * 2)] = paramac.jdMethod_if();
        bA[(m * 2 + 1)] = paramac.jdMethod_if();
      }
      bR = b5.jdMethod_if(bR, "/pkg_npc/mimage/monsterbody.pkg", bU);
      paramac = paramac;
      paramac.jdField_do = null;
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }

  public final void jdMethod_new(byte paramByte)
  {
    this.a7 = paramByte;
    a(this.jdField_byte);
  }

  public final void jdMethod_do(byte paramByte)
  {
    this.jdField_byte = paramByte;
    this.h = 0;
    a(this.jdField_byte);
  }

  public final void jdMethod_case(int paramInt)
  {
    this.bB = paramInt;
  }

  public final int O()
  {
    return this.bB;
  }

  public void a(Graphics paramGraphics)
  {
    a(paramGraphics, this.o, this.n);
    jdMethod_do(paramGraphics);
  }

  public final void a(Graphics paramGraphics, short paramShort1, short paramShort2)
  {
    if (this.J)
      return;
    try
    {
      int i = (byte)this.bI.jdField_do[this.bZ].length;
      int j = 0;
      int k = 0;
      int m = 0;
      int n = 0;
      for (int i1 = 0; i1 < i; i1 = (byte)(i1 + 2))
      {
        if (this.g)
          j = (short)(paramShort1 - this.bI.jdField_do[this.bZ][i1]);
        else
          j = (short)(paramShort1 + this.bI.jdField_do[this.bZ][i1]);
        k = (short)(paramShort2 + this.bI.jdField_do[this.bZ][(i1 + 1)]);
        m = bF[this.bH][this.bZ][(i1 >> 1)];
        if (((n = bL[this.bH][this.bZ][(i1 >> 1)]) & 0x10) != 0)
          continue;
        Image localImage = null;
        int i2 = 0;
        int i3 = 0;
        if ((n & 0x8) == 0)
        {
          if (b.c4[m] == 0)
            localImage = b.cw[m];
          else
            localImage = b.cw[b.cI[m]];
          switch (n)
          {
          case 0:
            i3 = (short)(k - b.dZ[(m * 2 + 1)]);
            if (this.g)
            {
              i2 = (short)(j - (localImage.getWidth() - b.dZ[(m * 2)]));
              b5.a(paramGraphics, localImage, i2, i3, 2);
              continue;
            }
            i2 = (short)(j - b.dZ[(m * 2)]);
            b5.a(paramGraphics, localImage, i2, i3, 0);
            break;
          case 1:
            i3 = (short)(k - b.dZ[(m * 2)]);
            if (this.g)
            {
              i2 = (short)(j - b.dZ[(m * 2 + 1)] - 1);
              b5.a(paramGraphics, localImage, i2, i3, 4);
              continue;
            }
            i2 = (short)(j - (localImage.getHeight() - b.dZ[(m * 2 + 1)]) + 1);
            b5.a(paramGraphics, localImage, i2, i3, 5);
            break;
          case 2:
            i3 = (short)(k - (localImage.getHeight() - b.dZ[(m * 2 + 1)]) + 1);
            if (this.g)
            {
              i2 = (short)(j - b.dZ[(m * 2)] - 1);
              b5.a(paramGraphics, localImage, i2, i3, 1);
              continue;
            }
            i2 = (short)(j - (localImage.getWidth() - b.dZ[(m * 2)]) + 1);
            b5.a(paramGraphics, localImage, i2, i3, 3);
            break;
          case 3:
            i3 = (short)(k - (localImage.getWidth() - b.dZ[(m * 2)]) + 1);
            if (this.g)
            {
              i2 = (short)(j - (localImage.getHeight() - b.dZ[(m * 2 + 1)]));
              b5.a(paramGraphics, localImage, i2, i3, 7);
              continue;
            }
            i2 = (short)(j - b.dZ[(m * 2 + 1)]);
            b5.a(paramGraphics, localImage, i2, i3, 6);
            break;
          case 4:
            i3 = (short)(k - b.dZ[(m * 2 + 1)]);
            if (this.g)
            {
              i2 = (short)(j - b.dZ[(m * 2)] - 1);
              b5.a(paramGraphics, localImage, i2, i3, 0);
              continue;
            }
            i2 = (short)(j - (localImage.getWidth() - b.dZ[(m * 2)]) + 1);
            b5.a(paramGraphics, localImage, i2, i3, 2);
            break;
          case 5:
            i3 = (short)(k - b.dZ[(m * 2)]);
            if (this.g)
            {
              i2 = (short)(j - (localImage.getHeight() - b.dZ[(m * 2 + 1)]) - 1);
              b5.a(paramGraphics, localImage, i2, i3, 5);
              continue;
            }
            i2 = (short)(j - b.dZ[(m * 2 + 1)]);
            b5.a(paramGraphics, localImage, i2, i3, 4);
            break;
          case 6:
            i3 = (short)(k - (localImage.getHeight() - b.dZ[(m * 2 + 1)]) + 1);
            if (this.g)
            {
              i2 = (short)(j - (localImage.getWidth() - b.dZ[(m * 2)]));
              b5.a(paramGraphics, localImage, i2, i3, 3);
              continue;
            }
            i2 = (short)(j - b.dZ[(m * 2)]);
            b5.a(paramGraphics, localImage, i2, i3, 1);
            break;
          case 7:
            i3 = (short)(k - (localImage.getWidth() - b.dZ[(m * 2)]) + 1);
            if (this.g)
            {
              i2 = (short)(j - b.dZ[(m * 2 + 1)] - 1);
              b5.a(paramGraphics, localImage, i2, i3, 6);
              continue;
            }
            i2 = (short)(j - (localImage.getHeight() - b.dZ[(m * 2 + 1)]) + 1);
            b5.a(paramGraphics, localImage, i2, i3, 7);
            break;
          default:
            b5.jdMethod_case("NullPointer玩家GameObject.Draw()..." + this.bZ + "..." + (m >> 1) + "--mirror=" + n);
            break;
          }
        }
        else
        {
          n = (byte)(n & 0x7);
          if (bD[m] == 0)
            localImage = bR[m];
          else
            localImage = bR[bN[m]];
          switch (n)
          {
          case 0:
            i3 = (short)(k - bA[(m * 2 + 1)]);
            if (this.g)
            {
              i2 = (short)(j - (localImage.getWidth() - bA[(m * 2)]));
              b5.a(paramGraphics, localImage, i2, i3, 2);
            }
            else
            {
              i2 = (short)(j - bA[(m * 2)]);
              paramGraphics.drawImage(localImage, i2, i3, 20);
            }
            break;
          case 1:
            i3 = (short)(k - bA[(m * 2)]);
            if (this.g)
            {
              i2 = (short)(j - bA[(m * 2 + 1)] - 1);
              b5.a(paramGraphics, localImage, i2, i3, 4);
            }
            else
            {
              i2 = (short)(j - (localImage.getHeight() - bA[(m * 2 + 1)]) + 1);
              b5.a(paramGraphics, localImage, i2, i3, 5);
            }
            break;
          case 2:
            i3 = (short)(k - (localImage.getHeight() - bA[(m * 2 + 1)]) + 1);
            if (this.g)
            {
              i2 = (short)(j - bA[(m * 2)] - 1);
              b5.a(paramGraphics, localImage, i2, i3, 1);
            }
            else
            {
              i2 = (short)(j - (localImage.getWidth() - bA[(m * 2)]) + 1);
              b5.a(paramGraphics, localImage, i2, i3, 3);
            }
            break;
          case 3:
            i3 = (short)(k - (localImage.getWidth() - bA[(m * 2)]) + 1);
            if (this.g)
            {
              i2 = (short)(j - (localImage.getHeight() - bA[(m * 2 + 1)]));
              b5.a(paramGraphics, localImage, i2, i3, 7);
            }
            else
            {
              i2 = (short)(j - bA[(m * 2 + 1)]);
              b5.a(paramGraphics, localImage, i2, i3, 6);
            }
            break;
          case 4:
            i3 = (short)(k - bA[(m * 2 + 1)]);
            if (this.g)
            {
              i2 = (short)(j - bA[(m * 2)] - 1);
              paramGraphics.drawImage(localImage, i2, i3, 20);
            }
            else
            {
              i2 = (short)(j - (localImage.getWidth() - bA[(m * 2)]) + 1);
              b5.a(paramGraphics, localImage, i2, i3, 2);
            }
            break;
          case 5:
            i3 = (short)(k - bA[(m * 2)]);
            if (this.g)
            {
              i2 = (short)(j - (localImage.getHeight() - bA[(m * 2 + 1)]) - 1);
              b5.a(paramGraphics, localImage, i2, i3, 5);
            }
            else
            {
              i2 = (short)(j - bA[(m * 2 + 1)]);
              b5.a(paramGraphics, localImage, i2, i3, 4);
            }
            break;
          case 6:
            i3 = (short)(k - (localImage.getHeight() - bA[(m * 2 + 1)]) + 1);
            if (this.g)
            {
              i2 = (short)(j - (localImage.getWidth() - bA[(m * 2)]));
              b5.a(paramGraphics, localImage, i2, i3, 3);
            }
            else
            {
              i2 = (short)(j - bA[(m * 2)]);
              b5.a(paramGraphics, localImage, i2, i3, 1);
            }
            break;
          case 7:
            i3 = (short)(k - (localImage.getWidth() - bA[(m * 2)]) + 1);
            if (this.g)
            {
              i2 = (short)(j - bA[(m * 2 + 1)] - 1);
              b5.a(paramGraphics, localImage, i2, i3, 6);
            }
            else
            {
              i2 = (short)(j - (localImage.getHeight() - bA[(m * 2 + 1)]) + 1);
              b5.a(paramGraphics, localImage, i2, i3, 7);
            }
            break;
          default:
            b5.jdMethod_case("NullPointer怪NPCGameObject.Draw()..." + this.bZ + "..." + (m >> 1) + "--mirror=" + n);
          }
        }
      }
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
      b5.jdMethod_case(jdMethod_byte() + "出错了！");
    }
  }

  public final void jdMethod_case()
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
    t();
    this.o = (short)(this.c - z.aE);
    this.n = (short)(this.jdField_void - z.aD + 3);
  }

  private void a(byte paramByte)
  {
    int i = 0;
    switch (paramByte)
    {
    case 0:
      switch (y())
      {
      case 3:
      case 5:
        i = 2;
        this.g = false;
        break;
      case 1:
      case 8:
        i = 0;
        this.g = false;
        break;
      case 2:
      case 7:
        i = 1;
        this.g = false;
        break;
      case 4:
      case 6:
        i = 1;
        this.g = true;
      }
      break;
    case 1:
      switch (y())
      {
      case 3:
      case 5:
        i = 5;
        this.g = false;
        break;
      case 1:
      case 8:
        i = 3;
        this.g = false;
        break;
      case 2:
      case 7:
        i = 4;
        this.g = false;
        break;
      case 4:
      case 6:
        i = 4;
        this.g = true;
      }
      break;
    case 2:
      switch (y())
      {
      case 3:
      case 5:
        i = 8;
        this.g = false;
        break;
      case 1:
      case 8:
        i = 6;
        this.g = false;
        break;
      case 2:
      case 7:
        i = 7;
        this.g = false;
        break;
      case 4:
      case 6:
        i = 7;
        this.g = true;
      }
      break;
    case 3:
      switch (y())
      {
      case 3:
      case 5:
        i = 11;
        this.g = false;
        break;
      case 1:
      case 8:
        i = 9;
        this.g = false;
        break;
      case 2:
      case 7:
        i = 10;
        this.g = false;
        break;
      case 4:
      case 6:
        i = 10;
        this.g = true;
      }
      break;
    case 4:
      switch (y())
      {
      case 3:
      case 5:
        i = 14;
        this.g = false;
        break;
      case 1:
      case 8:
        i = 12;
        this.g = false;
        break;
      case 2:
      case 7:
        i = 13;
        this.g = false;
        break;
      case 4:
      case 6:
        i = 13;
        this.g = true;
      }
      break;
    case 9:
      i = 15;
    case 5:
    case 6:
    case 7:
    case 8:
    }
    this.bE = (short)i;
  }

  public final void d()
  {
    if (this.A)
      return;
    if (this.h >= this.bI.jdField_for[this.bE].length)
    {
      this.h = 0;
      switch (jdMethod_do())
      {
      case 2:
        if (jdMethod_case(z.jdMethod_if(A(), n()), z.a(A(), n())))
          jdMethod_do(1);
        else
          jdMethod_do(0);
        break;
      case 3:
        jdMethod_do(4);
        break;
      case 4:
        jdMethod_do(0);
        break;
      case 9:
        this.h = (byte)(this.bI.jdField_for[this.bE].length - 1);
      case 5:
      case 6:
      case 7:
      case 8:
      }
    }
    this.bZ = this.bI.jdField_for[this.bE][(this.h++)];
  }

  public final byte D()
  {
    return g.a[this.bI.jdField_if][0];
  }

  public final byte M()
  {
    return g.a[this.bI.jdField_if][1];
  }

  public final byte G()
  {
    return g.a[this.bI.jdField_if][2];
  }

  public final byte x()
  {
    return g.a[this.bI.jdField_if][3];
  }

  static
  {
    new Hashtable();
    bV = new Hashtable();
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     t
 * JD-Core Version:    0.6.0
 */
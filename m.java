import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class m
{
  private byte G;
  private String Z;
  public byte A = -1;
  private short E = -1;
  private int k;
  private byte Q;
  private byte e = -1;
  private byte O = -1;
  private boolean n = true;
  private byte x = -1;
  private boolean c;
  public int J = -1;
  public short K = -1;
  public short I = -1;
  private String C = "";
  public int q = 0;
  public long aa = 0L;
  public byte Y = 0;
  public short w = 0;
  public short jdField_else = 0;
  public String m = null;
  public int L = -1;
  private boolean jdField_long = false;
  private short U = -1;
  private short jdField_for = -1;
  private int o = -1;
  private int M = -1;
  private int N = -1;
  private int jdField_byte = -1;
  private int S;
  public long jdField_char = -1L;
  public short B = -1;
  public byte g = -1;
  public byte v = -1;
  public short f = -1;
  public byte y = -1;
  public int r = -1;
  public int i = -1;
  public String l;
  private int R = 0;
  private int jdField_void = 0;
  private int u = 0;
  private static int s = 45;
  private static int a = 8;

  public final byte g()
  {
    return this.O;
  }

  public final void jdField_for(byte paramByte)
  {
    this.O = paramByte;
  }

  public final void jdMethod_if(short paramShort)
  {
    this.E = paramShort;
  }

  public final boolean a()
  {
    return this.n;
  }

  public final void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  public final byte jdField_long()
  {
    return this.x;
  }

  public final void jdMethod_do(byte paramByte)
  {
    this.x = paramByte;
  }

  public final boolean jdMethod_new()
  {
    return this.c;
  }

  public final void jdMethod_if(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public final void jdMethod_if(String paramString)
  {
    this.C = paramString;
  }

  public static String a(int paramInt)
  {
    if (paramInt == 0)
      return "";
    for (int j = 0; ; j++)
      if (paramInt >>= 1 == 0)
        return a5.f9[j];
  }

  public m(String paramString, byte paramByte1, byte paramByte2, int paramInt)
  {
    this.Z = paramString;
    this.G = paramByte1;
    this.Q = paramByte2;
    this.S = a5.fq.stringWidth(this.Z);
    if (this.S > paramInt - 6)
      this.S = (paramInt - 6);
  }

  public m(byte paramByte)
  {
    this.G = paramByte;
  }

  public final String jdMethod_case()
  {
    return this.Z;
  }

  public final void a(String paramString)
  {
    this.Z = paramString;
  }

  public final void a(byte paramByte)
  {
    this.G = 4;
  }

  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, af paramaf, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j;
    int i1;
    int i2;
    int i3;
    switch (this.G)
    {
    case 0:
    case 5:
      if ((paramBoolean1) && (this.G == 0))
      {
        paramGraphics.setColor(bm.try);
      }
      else
      {
        paramaf = 0;
        switch (this.Q)
        {
        case 0:
          paramaf = bm.bP;
          break;
        case 1:
          paramaf = bm.bP;
          break;
        case 2:
          paramaf = bm.c0[0];
          break;
        case 3:
          paramaf = 0;
          break;
        case 4:
          paramaf = bm.c0[2];
          break;
        case 5:
          paramaf = bm.c0[3];
          break;
        case 6:
          paramaf = bm.c0[4];
          break;
        case 7:
          paramaf = bm.c0[5];
          break;
        case 8:
          paramaf = bm.c0[6];
        }
        paramGraphics.setColor(paramaf);
      }
      if (paramBoolean1)
      {
        b5.a(paramGraphics, this.Z, paramInt1, paramInt2, paramInt3 - 6, 0, 3);
        return;
      }
      if (6 + b5.jdMethod_do(this.Z) <= paramInt3)
      {
        paramGraphics.drawString(this.Z, paramInt1, paramInt2, 20);
        return;
      }
      paramaf = 1;
      for (j = b5.jdMethod_do(this.Z.substring(0, 1)); j < paramInt3; j = b5.jdMethod_do(this.Z.substring(0, paramaf)))
      {
        paramaf++;
        if (paramaf > this.Z.length())
          break;
      }
      paramaf--;
      paramGraphics.drawString(this.Z.substring(0, paramaf) + "...", paramInt1, paramInt2, 20);
      return;
    case 7:
      if (paramBoolean1)
      {
        if (this.c)
          paramGraphics.setColor(bm.try);
        else
          paramGraphics.setColor(8224125);
      }
      else if (this.c)
        paramGraphics.setColor(bm.bP);
      else
        paramGraphics.setColor(8224125);
      if (paramBoolean1)
      {
        b5.a(paramGraphics, this.Z, paramInt1, paramInt2, paramInt3 - 6, 0, 3);
        return;
      }
      if (6 + b5.jdMethod_do(this.Z) <= paramInt3)
      {
        paramGraphics.drawString(this.Z, paramInt1, paramInt2, 20);
        return;
      }
      paramaf = paramInt3 / a5.iA - 1;
      paramGraphics.drawString(this.Z.substring(0, paramaf) + "...", paramInt1, paramInt2, 20);
      return;
    case 1:
      if (paramBoolean1)
        paramGraphics.setColor(bm.try);
      else
        paramGraphics.setColor(bm.bP);
      paramaf = -1;
      switch (this.e)
      {
      case 2:
        paramaf = 6;
        break;
      case 1:
        paramaf = 5;
        break;
      case 4:
        paramaf = 4;
        break;
      case 3:
        paramaf = 3;
        break;
      case 5:
        paramaf = 0;
        break;
      case 6:
        paramaf = 1;
        break;
      case 7:
        paramaf = 2;
        break;
      case 8:
        paramaf = 6;
      }
      a5.eq.jdMethod_if(paramGraphics, paramInt1, paramInt2, paramaf);
      if (paramBoolean1)
      {
        b5.a(paramGraphics, this.Z, paramInt1 + a5.eq.jdField_try + 4, paramInt2, paramInt3 - 6 - a5.eq.jdField_try - 4, 0, 3);
        return;
      }
      if (6 + a5.eq.jdField_try + 4 + b5.jdMethod_do(this.Z) <= paramInt3)
      {
        paramGraphics.drawString(this.Z, paramInt1 + a5.eq.jdField_try + 4, paramInt2, 20);
        return;
      }
      j = paramInt3 / a5.iA - 1;
      paramGraphics.drawString(this.Z.substring(0, j) + "...", paramInt1 + a5.eq.jdField_try + 4, paramInt2, 20);
      return;
    case 2:
      j = 0;
      if (paramaf != null)
        j = paramaf.jdField_for();
      paramaf = 27 * a5.ic / 176;
      i1 = 14 * a5.il / 208;
      if (paramBoolean1)
      {
        b5.a(paramGraphics, paramInt1 + paramaf + 1, paramInt2, paramInt3 - paramaf - j - 1, i1, bm.bP);
        paramGraphics.setColor(bm.try);
      }
      else
      {
        b5.a(paramGraphics, paramInt1 + paramaf + 1, paramInt2, paramInt3 - paramaf - j - 1, i1, bm.dw);
        paramGraphics.setColor(bm.bP);
      }
      paramGraphics.drawString(this.m, paramInt1 + paramaf + 3, paramInt2, 20);
      if (this.jdField_long)
      {
        String str = "（队长）";
        if (bu.e == 2)
          str = "（团长）";
        paramGraphics.drawString(str, paramInt1 + paramaf + 3 + paramGraphics.getFont().stringWidth(this.m), paramInt2, 20);
      }
      paramGraphics.setColor(bm.bP);
      paramGraphics.drawLine(paramInt1, paramInt2 - 1, paramInt1 + paramInt3 - j - 1, paramInt2 - 1);
      paramGraphics.drawLine(paramInt1, paramInt2 + i1, paramInt1 + paramInt3 - j - 1, paramInt2 + i1);
      paramGraphics.drawLine(paramInt1 + paramaf, paramInt2, paramInt1 + paramaf, paramInt2 + i1);
      if (j != 0)
        paramGraphics.drawLine(paramInt1 + paramInt3 - j - 1, paramInt2, paramInt1 + paramInt3 - j - 1, paramInt2 + i1);
      a5.hL.jdMethod_if(paramGraphics, paramInt1 + 1, paramInt2 + (i1 - a5.hL.a >> 1), this.U);
      i2 = paramInt1 + 15;
      paramInt3 = paramInt2 + (i1 - a5.dY.a >> 1);
      b5.a(paramGraphics, a5.dY, this.jdField_for, i2, paramInt3);
      paramaf = "生命";
      j = paramInt1 + 2 + paramGraphics.getFont().stringWidth(paramaf);
      i3 = a5.dY.jdField_try * 11 + 12;
      paramGraphics.drawString("生命", paramInt1 + 1, paramInt2 + i1 + 1, 20);
      i2 = ((paramBoolean1 = String.valueOf(this.o).length() + String.valueOf(this.M).length()) + 1) * a5.dY.jdField_try + paramBoolean1 + 2;
      b5.jdMethod_do(paramGraphics, this.o, this.M, j + (i3 - i2 >> 1), paramInt2 + 1 + i1 + (i1 - a5.dY.a >> 1));
      paramaf = "法力";
      paramGraphics.drawString(paramaf, paramInt1 + 1, paramInt2 + (i1 << 1), 20);
      i2 = ((paramBoolean1 = String.valueOf(this.N).length() + String.valueOf(this.jdField_byte).length()) + 1) * a5.dY.jdField_try + paramBoolean1 + 2;
      b5.jdMethod_do(paramGraphics, this.N, this.jdField_byte, j + (i3 - i2 >> 1), paramInt2 + (i1 << 1) + (i1 - a5.dY.a >> 1));
      j += i3 + 2;
      paramInt3 = (paramInt1 = s * a5.ic / 176) - 2;
      paramaf = a - 2;
      b5.jdMethod_if(paramGraphics, j, paramInt2 + 1 + i1 + (i1 - a >> 1), paramInt1, a, bm.bP);
      b5.jdMethod_if(paramGraphics, j, paramInt2 + (i1 << 1) + (i1 - a >> 1), paramInt1, a, bm.bP);
      b5.a(paramGraphics, j + 1, paramInt2 + 1 + i1 + (i1 - a >> 1) + 1, Math.min(this.o * paramInt3 / this.M, paramInt3), paramaf, 15728640);
      b5.a(paramGraphics, j + 1, paramInt2 + 1 + (i1 << 1) + (i1 - a >> 1), Math.min(this.N * paramInt3 / this.jdField_byte, paramInt3), paramaf, 18416);
      return;
    case 3:
      paramGraphics.setColor(bm.bP);
      paramInt3 = this;
      paramGraphics.drawString(this.Z, paramInt1, paramInt2, 20);
      paramaf = this;
      paramInt3 = this;
      b5.a(paramGraphics, this.k, a5.fq.stringWidth(this.Z) + paramInt1, paramInt2 + (a5.iG - a5.dY.a >> 1));
      return;
    case 4:
      j = 0;
      if (paramaf != null)
        j = paramaf.jdField_for();
      i1 = (paramaf = paramInt3 - j - 4) - 2 >> 1;
      i2 = paramInt1 + 2;
      paramInt3 = i1;
      paramaf = i2 + i1 + 2;
      j = a5.fq.stringWidth(this.Z);
      i3 = (short)(a5.iG + 9);
      if (paramBoolean1)
      {
        paramGraphics.setColor(bm.bP);
        b5.a(paramGraphics, i2 - 1 + (i1 - j >> 1), paramInt2 + 1, j + 2, i3 - 2, bm.bP);
        paramGraphics.setColor(bm.try);
      }
      else
      {
        paramGraphics.setColor(bm.bP);
      }
      paramGraphics.drawString(this.Z, i2 + (i1 - j >> 1), paramInt2 + (i3 - a5.iG >> 1), 20);
      b5.jdMethod_if(paramGraphics, paramaf + 1, paramInt2 + 1, paramInt3 - 2, i3 - 2, bm.ci);
      paramBoolean1 = true;
      i2 = bm.y;
      if (paramBoolean2)
      {
        paramBoolean1 = false;
        if (a5.ht % 4 > 1)
          i2 = 16777215;
      }
      b5.a(paramGraphics, paramaf + 2, paramInt2 + 2, paramInt3 - 4, i3 - 4, i2);
      if (!paramBoolean1)
        break;
      paramGraphics.setColor(bm.bP);
      paramGraphics.drawString(this.C, paramaf + (paramInt3 - a5.fq.stringWidth(this.C) >> 1), paramInt2 + (i3 - a5.iG >> 1), 20);
      return;
    case 8:
      paramaf = this;
      j = this.E;
      paramGraphics.setColor(bm.O[(j / 1000 - 1)][0]);
      paramGraphics.fillRect(paramInt1, paramInt2, a5.gg.jdField_try, a5.gg.a);
      paramaf = r.k((short)(j % 1000));
      a5.gg.jdMethod_if(paramGraphics, paramInt1, paramInt2, paramaf);
      paramGraphics.setColor(bm.O[(j / 1000 - 1)][1]);
      paramGraphics.drawRect(paramInt1 - 1, paramInt2 - 1, a5.gg.jdField_try + 1, a5.gg.a + 1);
      if ((paramBoolean1) && (this.G == 8))
        paramGraphics.setColor(bm.try);
      else
        paramGraphics.setColor(bm.bP);
      if (paramBoolean1)
      {
        b5.a(paramGraphics, this.Z, paramInt1 + a5.gg.jdField_try + 4, paramInt2, paramInt3 - 6, 0, 3);
        return;
      }
      if (6 + b5.jdMethod_do(this.Z) <= paramInt3)
      {
        paramGraphics.drawString(this.Z, paramInt1 + a5.gg.jdField_try + 4, paramInt2, 20);
        return;
      }
      i1 = paramInt3 / a5.iA - 1;
      paramGraphics.drawString(this.Z.substring(0, i1) + "...", paramInt1 + a5.gg.jdField_try + 4, paramInt2, 20);
      return;
    case 9:
      if ((paramBoolean1) && (this.G == 9))
      {
        paramaf = this;
        paramGraphics.setColor(this.u);
      }
      else
      {
        paramGraphics.setColor(bm.bP);
      }
      if (paramBoolean1)
      {
        b5.a(paramGraphics, this.Z, paramInt1, paramInt2, paramInt3 - 6, 0, 3);
        return;
      }
      if (6 + b5.jdMethod_do(this.Z) <= paramInt3)
      {
        paramGraphics.drawString(this.Z, paramInt1, paramInt2, 20);
        return;
      }
      j = paramInt3 / a5.iA - 1;
      paramGraphics.drawString(this.Z.substring(0, j) + "...", paramInt1, paramInt2, 20);
    case 6:
    }
  }

  public static short jdField_else()
  {
    return (short)(44 * a5.il / 208);
  }

  public static short jdMethod_do()
  {
    return (short)(a5.iG + 9);
  }

  public final byte jdField_char()
  {
    return this.e;
  }

  public final void jdMethod_int(byte paramByte)
  {
    this.e = paramByte;
  }

  public final void a(String paramString, int paramInt1, boolean paramBoolean, byte paramByte, short paramShort, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.m = paramString;
    this.L = paramInt1;
    this.jdField_long = paramBoolean;
    this.U = (short)paramByte;
    this.jdField_for = paramShort;
    this.o = paramInt2;
    this.M = paramInt3;
    this.N = paramInt4;
    this.jdField_byte = paramInt5;
  }

  public final void a(String paramString, long paramLong, short paramShort1, byte paramByte1, byte paramByte2, short paramShort2, byte paramByte3, int paramInt1, int paramInt2, byte paramByte4)
  {
    this.Z = paramString;
    this.jdField_char = paramLong;
    this.B = paramShort1;
    this.g = paramByte1;
    this.v = paramByte2;
    this.Q = (byte)(paramByte2 + 2);
    r.E(this.v);
    this.f = paramShort2;
    this.y = paramByte3;
    this.r = paramInt1;
    this.i = paramInt2;
    switch (paramByte4)
    {
    case 0:
      this.l = "很短";
      return;
    case 1:
      this.l = "短";
      return;
    case 2:
      this.l = "中";
      return;
    case 3:
      this.l = "长";
      return;
    case 4:
      this.l = "很长";
    }
  }

  public final void jdMethod_if(int paramInt)
  {
    this.k = paramInt;
  }

  public final int jdMethod_int()
  {
    return this.S;
  }

  public final int b()
  {
    return this.R;
  }

  public final void jdMethod_int(int paramInt)
  {
    this.R = paramInt;
  }

  public final int e()
  {
    return this.jdField_void;
  }

  public final void jdMethod_new(int paramInt)
  {
    this.jdField_void = paramInt;
  }

  public final void jdMethod_do(int paramInt)
  {
    this.u = paramInt;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     m
 * JD-Core Version:    0.6.0
 */
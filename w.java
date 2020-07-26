import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class w extends t
{
  private byte b4 = 0;
  public static boolean ca = false;
  public static String[] b6 = null;
  public static int b7 = a5.iA * 7 + 18;
  public static int cc = 0;
  public static int[] b9 = new int[10];
  public static int[] b3 = new int[10];
  private static byte b5 = 0;
  public static boolean cd = false;
  private static boolean cb = false;
  private static int b8 = 0;
  private static short b2 = 0;

  public w()
  {
  }

  public w(byte paramByte1, byte paramByte2)
  {
    super(paramByte1, paramByte2);
  }

  public final void jdMethod_goto(byte paramByte)
  {
    this.b4 = paramByte;
  }

  public final byte Q()
  {
    return this.b4;
  }

  public final void jdMethod_if(Graphics paramGraphics)
  {
    super.jdMethod_if(paramGraphics);
  }

  public final void jdMethod_int(Graphics paramGraphics)
  {
    int i = (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1) + a5.b9.jdField_try;
    int j = a5.iG + bz.bf - M() + (jdMethod_int().length() == 0 ? 0 : a5.iG);
    int k = 0;
    w localw = this;
    switch (this.b4)
    {
    case 1:
      k = 0;
      break;
    case 4:
      k = 2;
      break;
    case 3:
      k = 4;
      break;
    case 2:
      k = 1;
      break;
    case 6:
      k = 3;
      break;
    case 5:
      k = 5;
    }
    a5.b9.jdMethod_if(paramGraphics, this.o - i, this.n - j, k);
  }

  public final void a(Graphics paramGraphics)
  {
    super.a(paramGraphics);
  }

  public static void jdMethod_new(Graphics paramGraphics)
  {
    if (ca)
    {
      paramGraphics.setColor(0);
      int i = (a5.ic - b7) / 2;
      int j = (a5.il - cc) / 6;
      paramGraphics.drawRoundRect(i, j, b9[b5], b3[b5], 12, 12);
      paramGraphics.setColor(16777215);
      paramGraphics.fillRoundRect(i + 1, j + 1, b9[b5] - 1, b3[b5] - 1, 12, 12);
      int k = i + 5;
      int m = j + 2;
      int n = 0;
      n = b6.length;
      int i1 = paramGraphics.getClipX();
      int i2 = paramGraphics.getClipY();
      int i3 = paramGraphics.getClipWidth();
      int i4 = paramGraphics.getClipHeight();
      paramGraphics.setClip(i, j, b9[b5], b3[b5]);
      i = 0;
      for (j = 0; i < n; j++)
      {
        int i5 = 0;
        char[] arrayOfChar = b6[i].toCharArray();
        for (int i6 = 0; i6 < arrayOfChar.length; i6++)
        {
          if (b5.c[i][i6] == 0)
            paramGraphics.setColor(0);
          else
            paramGraphics.setColor(65280);
          paramGraphics.drawChar(arrayOfChar[i6], k + i5, m + 3 + j * (a5.iG + 1), 20);
          i5 += a5.fq.charWidth(arrayOfChar[i6]);
        }
        i++;
      }
      paramGraphics.setClip(i1, i2, i3, i4);
    }
  }

  public static void P()
  {
    if (ca)
    {
      b8 += 1;
      if ((cd) && (cb))
      {
        if ((w.b5 = (byte)(b5 - 1)) == 0)
        {
          b8 = 0;
          ca = false;
          b5 = 0;
          cd = false;
          cb = false;
          return;
        }
      }
      else
      {
        if (b8 < 10)
        {
          b5 = (byte)b8;
          return;
        }
        b9[9] = b7;
        b3[9] = cc;
        cb = true;
      }
    }
  }
}
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ah extends ba
{
  public byte aK = 0;
  private String aS;
  private int aH = bm.bP;
  private int aG;
  private int aF;
  private long a4;
  private boolean aP;
  private boolean aJ;
  private boolean aR;
  public String[] a1;
  public boolean a2;
  public short aN;
  private int aW;
  private boolean a0;
  public boolean aC;
  public static int aQ = 0;

  public ah(short paramShort1, short paramShort2, short paramShort3, short paramShort4, byte paramByte, String paramString, be parambe)
  {
    super(paramShort1, paramShort2, paramShort3, paramShort4, parambe);
    new Vector();
    this.aP = false;
    this.aJ = true;
    this.aR = true;
    this.a1 = new String[0];
    this.a2 = false;
    this.aN = 0;
    this.aW = 0;
    this.a0 = true;
    this.y = paramByte;
    a(paramString);
    if (paramByte == 0)
      this.b = true;
  }

  public ah(short paramShort1, short paramShort2, short paramShort3, byte paramByte, String paramString, be parambe)
  {
    this(paramShort1, paramShort2, paramShort3, 16, paramByte, paramString, parambe);
  }

  public ah(short paramShort1, short paramShort2, byte paramByte, String paramString, be parambe)
  {
    this(paramShort1, paramShort2, 0, 16, paramByte, paramString, parambe);
  }

  public ah(short paramShort1, short paramShort2, byte paramByte, String paramString, boolean paramBoolean, be parambe)
  {
    this(paramShort1, paramShort2, 0, 16, 0, paramString, parambe);
    paramShort1 = 1;
    this = this;
    this.aP = paramShort1;
  }

  public ah(short paramShort1, short paramShort2, byte paramByte1, be parambe, byte paramByte2)
  {
    this(paramShort1, paramShort2, 0, 16, paramByte1, "", parambe);
  }

  public ah(short paramShort1, short paramShort2, byte paramByte, be parambe)
  {
    this(paramShort1, paramShort2, 0, 16, paramByte, "", parambe);
  }

  public final void a(byte paramByte)
  {
    this.y = paramByte;
  }

  public final byte jdMethod_char()
  {
    return this.y;
  }

  public final void a(Graphics paramGraphics)
  {
    if (this.y == 0)
    {
      if ((this.aS != null) && (!this.aS.equals("")))
      {
        if (!this.aR)
          paramGraphics.setColor(8224125);
        else if (!this.aJ)
          paramGraphics.setColor(16711680);
        else if (this.d)
          paramGraphics.setColor(bm.try);
        else
          paramGraphics.setColor(bm.bP);
        if (q())
        {
          if (this.aP)
            b5.a(paramGraphics, (a5.ic - b5.jdMethod_do(aj())) / 2 - 2, this.j - 1, b5.jdMethod_do(aj()) + 3, a5.iG + 1);
          else
            b5.a(paramGraphics, this.k - 2, this.j - 1, aj().length() * a5.iA + 3, a5.iG + 1);
          if (aj().equals("修改昵称"))
            paramGraphics.setColor(16711680);
          else
            paramGraphics.setColor(bm.try);
        }
        if (this.aP)
          paramGraphics.drawString(this.aS, this.k, this.j, 17);
        else if (this.a2)
        {
          if ((this.d) || (this.aC))
            a(paramGraphics, this.aS, this.k, this.j, this.aN, 1, 3, false);
          else
            a(paramGraphics, this.aS, this.k, this.j, this.aN);
        }
        else
          paramGraphics.drawString(this.aS, this.k, this.j, 20);
        if ((a5.es != null) && (a5.es.g9 == 3145731))
        {
          int[] arrayOfInt1 = { 4, 6, 10, 12 };
          int[] arrayOfInt2 = { 3, 5, 9, 11 };
          ay[] arrayOfay = new ay[arrayOfInt1.length];
          this = new ah[arrayOfInt2.length];
          for (int m = 0; m < arrayOfInt1.length; m++)
          {
            arrayOfay[m] = ((ay)a5.es.cf().elementAt(arrayOfInt1[m]));
            this[m] = ((ah)a5.es.cf().elementAt(arrayOfInt2[m]));
            if (arrayOfay[m].q())
            {
              b5.a(paramGraphics, this[m].k - 2, this[m].j - 1, this[m].aj().length() * a5.iA + 3, a5.iG + 1);
              paramGraphics.setColor(bm.try);
              paramGraphics.drawString(this[m].aS, this[m].k, this[m].j, 20);
            }
            else
            {
              paramGraphics.setColor(bm.bo);
              paramGraphics.drawString(this[m].aS, this[m].k, this[m].j, 20);
            }
          }
          return;
        }
      }
    }
    else
    {
      int i;
      int j;
      if (this.y == 1)
      {
        i = a5.cY.getHeight();
        paramGraphics.setColor(bm.aS);
        paramGraphics.drawRect(this.k, this.j, this.a - 1, i - 1);
        paramGraphics.setColor(bm.cv);
        paramGraphics.fillRect(this.k + 1, this.j + 1, this.a - 2, i - 2);
        paramGraphics.drawImage(a5.cY, this.k, this.j, 20);
        b5.a(paramGraphics, a5.cY, this.k + this.a - a5.cY.getWidth(), this.j, 2);
        if ((this.aS != null) && (!this.aS.equals("")))
        {
          j = this.j + (i - a5.iG) / 2;
          if (b5.jdMethod_do(this.aS) <= this.a - 2 * a5.cY.getWidth())
          {
            b5.jdMethod_do(paramGraphics, this.aS, this.a, this.k, j, this.aH);
          }
          else
          {
            paramGraphics.setColor(this.aH);
            b5.a(paramGraphics, this.aS, this.k + a5.cY.getWidth(), j, this.a - 2 * a5.cY.getWidth(), 1, 3);
          }
        }
        else
        {
          return;
        }
      }
      else
      {
        if (this.y == 2)
        {
          b5.jdMethod_do(paramGraphics, this.aG, this.aF, this.k, this.j);
          return;
        }
        if (this.y == 3)
        {
          b5.a(paramGraphics, this.aG, this.k, this.j);
          return;
        }
        if (this.y == 7)
        {
          b5.a(paramGraphics, this.a4, this.k, this.j);
          return;
        }
        if (this.y == 4)
        {
          i = this.k;
          j = this.a;
          paramGraphics.setColor(bm.ci);
          paramGraphics.drawRect(i, this.j, j - 1, this.jdField_int - 1);
          paramGraphics.setColor(bm.y);
          paramGraphics.fillRect(i + 1, this.j + 1, j - 2, this.jdField_int - 2);
          int k = (short)(this.k + (this.a / 2 - a5.fq.stringWidth(this.aS) / 2));
          if ((this.aS != null) && (!this.aS.equals("")))
          {
            paramGraphics.setColor(bm.F);
            paramGraphics.drawString(this.aS, k, this.j + 2, 20);
          }
          return;
        }
        if (this.y == 5)
        {
          i = a5.cY.getHeight();
          paramGraphics.setColor(bm.aS);
          paramGraphics.drawRect(this.k, this.j, this.a - 1, i - 1);
          paramGraphics.setColor(bm.cv);
          paramGraphics.fillRect(this.k + 1, this.j + 1, this.a - 2, i - 2);
          paramGraphics.drawImage(a5.cY, this.k, this.j, 20);
          b5.a(paramGraphics, a5.cY, this.k + this.a - a5.cY.getWidth(), this.j, 2);
          if ((this.aS != null) && (!this.aS.equals("")))
          {
            j = this.j + (i - a5.iG) / 2;
            b5.jdMethod_do(paramGraphics, this.aS, this.a, this.k, j, this.aH);
          }
          return;
        }
        if (this.y == 6)
        {
          i = 0;
          switch (this.aK)
          {
          case 1:
            i = 0;
            break;
          case 4:
            i = 2;
            break;
          case 3:
            i = 4;
            break;
          case 2:
            i = 1;
            break;
          case 6:
            i = 3;
            break;
          case 5:
            i = 5;
          }
          if (this.aK != 0)
            a5.b9.jdMethod_if(paramGraphics, this.k, this.j, i);
          if (this.d)
            paramGraphics.setColor(bm.try);
          else
            paramGraphics.setColor(bm.bP);
          j = this.aK == 0 ? 0 : a5.eq.jdField_try;
          if (this.a2)
          {
            if (this.d)
            {
              a(paramGraphics, this.aS, this.k + j, this.j, this.aN, 1, 3, false);
              return;
            }
            a(paramGraphics, this.aS, this.k + j, this.j, this.aN);
            return;
          }
          paramGraphics.drawString(this.aS, this.k + j, this.j, 20);
        }
      }
    }
  }

  public final void a(Graphics paramGraphics, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    paramInt = null;
    if (a5.ht % 8 < 4)
      paramInt = paramArrayOfInt1;
    else
      paramInt = paramArrayOfInt2;
    switch (this.y)
    {
    case 4:
      paramArrayOfInt1 = this.k;
      paramArrayOfInt2 = this.a;
      paramGraphics.setColor(paramInt[0]);
      paramGraphics.drawRect(paramArrayOfInt1, this.j, paramArrayOfInt2 - 1, this.jdField_int - 1);
      paramGraphics.setColor(paramInt[1]);
      paramGraphics.fillRect(paramArrayOfInt1 + 1, this.j + 1, paramArrayOfInt2 - 2, this.jdField_int - 2);
      paramArrayOfInt1 = (short)(this.k + (this.a / 2 - a5.fq.stringWidth(this.aS) / 2));
      if ((this.aS == null) || (this.aS.equals("")))
        break;
      paramGraphics.setColor(paramInt[2]);
      paramGraphics.drawString(this.aS, paramArrayOfInt1, this.j + 2, 20);
    }
  }

  public final void a(Graphics paramGraphics, int paramInt)
  {
    paramGraphics.setColor(paramInt);
    paramGraphics.drawString(this.aS, this.k, this.j, 20);
  }

  public final String aj()
  {
    if (this.aS == null)
      this.aS = "";
    return this.aS;
  }

  public final void a(String paramString)
  {
    this.aS = paramString;
    if (this.y == 0)
      jdMethod_do((short)b5.jdMethod_do(paramString));
  }

  public static int ad()
  {
    return a5.cY.getHeight();
  }

  public final void jdMethod_char(int paramInt)
  {
    this.aH = paramInt;
  }

  public final void b(boolean paramBoolean)
  {
    jdMethod_new((short)((a5.es.jdMethod_for() - this.a) / 2));
  }

  public final int ag()
  {
    return this.aG;
  }

  public final void jdMethod_case(int paramInt)
  {
    this.aG = paramInt;
    if (this.y == 2)
    {
      ah localah = this;
      this.a = (short)b5.jdMethod_do(paramInt, this.aF)[0];
      localah = this;
      this.jdField_int = (short)b5.jdMethod_do(paramInt, this.aF)[1];
      return;
    }
    if (this.y == 3)
    {
      this.a = (short)b5.a(paramInt)[0];
      this.jdField_int = (short)b5.a(paramInt)[1];
    }
  }

  public final void a(long paramLong)
  {
    this.a4 = paramLong;
    this.a = (short)b5.a(this.a4)[0];
    this.jdField_int = (short)b5.a(this.a4)[1];
  }

  public final void jdMethod_byte(int paramInt)
  {
    this.aF = paramInt;
    if (this.y == 2)
    {
      ah localah = this;
      this.a = (short)b5.jdMethod_do(this.aG, paramInt)[0];
      localah = this;
      this.jdField_int = (short)b5.jdMethod_do(this.aG, paramInt)[1];
    }
  }

  public final void jdMethod_void(boolean paramBoolean)
  {
    this.aP = paramBoolean;
  }

  public final void jdMethod_long(boolean paramBoolean)
  {
    this.aJ = paramBoolean;
  }

  public final void jdMethod_goto(boolean paramBoolean)
  {
    this.aR = paramBoolean;
  }

  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, byte paramByte1, byte paramByte2, boolean paramBoolean)
  {
    if ((b5.jdMethod_do(paramString) <= paramInt3) && (!paramBoolean))
    {
      paramGraphics.drawString(paramString, paramInt1, paramInt2, 20);
      return;
    }
    paramByte2 = paramGraphics.getClipX();
    paramBoolean = paramGraphics.getClipY();
    int i = paramGraphics.getClipWidth();
    int j = paramGraphics.getClipHeight();
    paramGraphics.setClip(paramInt1, paramInt2, paramInt3, a5.iG + 3);
    switch (paramByte1)
    {
    case 0:
      if ((paramByte1 = paramInt1 + paramInt3 - 3 * this.aW) + b5.jdMethod_do(paramString) < paramInt1)
        this.aW = 0;
      else
        this.aW += 1;
      paramGraphics.drawString(paramString, paramByte1, paramInt2, 20);
      break;
    case 1:
      if (this.a0)
      {
        paramByte1 = paramInt1 - 3 * this.aW;
        paramGraphics.drawString(paramString, paramByte1, paramInt2, 20);
        this.aW += 1;
        if (paramByte1 + b5.jdMethod_do(paramString) < paramInt1 + paramInt3)
        {
          this.a0 = false;
          this.aW = 0;
        }
      }
      else
      {
        paramByte1 = paramInt1 - (b5.jdMethod_do(paramString) - paramInt3) + 3 * this.aW;
        paramGraphics.drawString(paramString, paramByte1, paramInt2, 20);
        this.aW += 1;
        if (paramByte1 <= paramInt1)
          break;
        this.a0 = true;
        this.aW = 0;
      }
    }
    paramGraphics.setClip(paramByte2, paramBoolean, i, j);
  }

  private static void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    if (b5.jdMethod_do(paramString) <= paramInt3)
    {
      paramGraphics.drawString(paramString, paramInt1, paramInt2, 20);
      return;
    }
    paramInt3 = paramInt3 / a5.iA - 1;
    paramGraphics.drawString(paramString.substring(0, paramInt3) + "...", paramInt1, paramInt2, 20);
  }

  public final void f()
  {
    if (this.jdField_byte)
    {
      if (y() == null)
        return;
      if (a5.jdMethod_try(4096))
        y().c8();
      else if (a5.jdMethod_try(8192))
        y().c9();
      if ((a5.jdMethod_byte(65536)) || (a5.jdMethod_byte(131072)))
      {
        y().dc();
        switch (a5.es.g9)
        {
        case 2555905:
          int i;
          if ((i = ((Integer)y().db().elementAt(y().de())).intValue()) == 2555906)
          {
            az.n = 0;
          }
          else if (i == 2555905)
          {
            if (az.h == 0)
            {
              as.a(0, "您现在处在自己的农场", "确定", "", -1, -2);
              this.jdField_byte = false;
              return;
            }
            if (az.m != 0)
            {
              az.m = 0;
              a5.eQ.a(2555952);
            }
            az.else = 0;
          }
          a5.eQ.a(i);
          this.jdField_byte = false;
        }
        return;
      }
      if (a5.jdMethod_byte(262144))
      {
        this.jdField_byte = false;
        y().da();
        return;
      }
    }
    else if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
    {
      af();
    }
  }

  public final void af()
  {
    switch (a5.es.g9)
    {
    case 2555905:
      Object localObject1 = (ah)a5.es.cf().elementAt(35);
      Object localObject2 = (ah)a5.es.cf().elementAt(36);
      Object localObject3 = (ah)a5.es.cf().elementAt(37);
      if (((ba)localObject1).q())
      {
        localObject1 = new br(0);
        if (az.h == 0)
        {
          localObject2 = new int[] { 2555906, 2555911, 2555907, 2555915, 2555910, 2555914, 2555976 };
          localObject3 = new int[] { 2, 2, 2, 2, 2, 2, 2 };
          arrayOfString = new String[] { "详情", "仓库", "种子背包", "道具背包", "公告板", "农场动态", "农场帮助" };
          ((br)localObject1).a(arrayOfString, localObject2, localObject3);
        }
        else if (az.h == 1)
        {
          localObject2 = new int[] { 2555906, 2555914, 2555976 };
          localObject3 = new int[] { 2, 2, 2 };
          arrayOfString = new String[] { "详情", "农场动态", "农场帮助" };
          ((br)localObject1).a(arrayOfString, localObject2, localObject3);
        }
        a((br)localObject1);
        this.jdField_byte = true;
        y().da();
        return;
      }
      if (((ba)localObject2).q())
      {
        localObject1 = new br(0);
        localObject2 = new int[] { 2555908, 2555957 };
        localObject3 = new int[] { 2, 2 };
        arrayOfString = new String[] { "种子商店", "道具商店" };
        ((br)localObject1).a(arrayOfString, localObject2, localObject3);
        a((br)localObject1);
        this.jdField_byte = true;
        y().da();
        return;
      }
      if (!((ba)localObject3).q())
        break;
      localObject1 = new br(0);
      localObject2 = new int[] { 2555905, 2555912, 2555913 };
      localObject3 = new int[] { 3, 2, 2 };
      String[] arrayOfString = { "自家农场", "去偷好友", "去偷仇人" };
      ((br)localObject1).a(arrayOfString, localObject2, localObject3);
      a((br)localObject1);
      this.jdField_byte = true;
      y().da();
    }
  }

  public final long al()
  {
    return this.a4;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     ah
 * JD-Core Version:    0.6.0
 */
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class as extends ba
{
  public byte dl = 0;
  public byte y = 0;
  private String cJ = "";
  private String dO = "";
  private int dP = -1;
  private int dp = -1;
  private int dc = 0;
  private short dw = 0;
  private short ds = 0;
  public static String dM = "确认充值并扣费请继续，否则请点击返回不扣费。";
  private String[] cK = { "#" };
  private short[][] c1;
  private short di;
  private short dh;
  private short cS;
  private static int c0 = 16711680;
  private short cM;
  private short da;
  public static boolean dX = false;
  private static String cN = "0123456789";
  StringBuffer dJ;
  public byte cA;
  public static int cH = 20;
  private static byte dy = 0;
  private int c3;
  private int[] cy;
  private String[] cP;
  private int cV;
  public int cR;
  public static int dV = -1;
  public static int c4 = -1;
  private static byte dU = -1;
  private static byte cW = -1;
  private byte[][] cG;
  public static String[] db;
  public static byte cu = 0;
  public static boolean cY;
  public static byte cB;
  public static byte cX;
  public static int dk;

  private as(short paramShort1, short paramShort2, short paramShort3, short paramShort4, be parambe)
  {
    super(0, 0, 0, 0, parambe);
    new int[1][0] = 16711935;
    this.c1 = null;
    this.di = 0;
    this.dh = 0;
    this.cS = 0;
    this.cM = -1;
    this.da = -1;
    this.dJ = null;
    this.cA = 10;
    this.c3 = 0;
    this.cy = new int[4];
    this.cV = 0;
    this.cR = -1;
  }

  public as(byte paramByte, be parambe)
  {
    this(0, 0, 0, 0, null);
    byte b = paramByte;
    parambe = this;
    this.y = b;
    switch (paramByte)
    {
    case 0:
      return;
    case 1:
    case 13:
      this.dJ = new StringBuffer();
      this.dJ.append("0");
    case 4:
    case 16:
    }
  }

  public final void a(byte paramByte, int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, int paramInt3)
  {
    this.dl = paramByte;
    paramInt1 = paramInt1;
    paramByte = this;
    c0 = paramInt1;
    paramString3 = paramInt3;
    paramString2 = paramInt2;
    paramString1 = paramString3;
    this = paramString2;
    paramInt1 = paramString1;
    paramByte = this;
    this.dP = paramString2;
    paramByte.dp = paramString3;
    switch ((paramString2 = paramByte).y)
    {
    case 1:
      paramByte.jdMethod_new(0);
      paramByte.jdMethod_do((short)a5.ic);
      paramByte.dc = (paramByte.a - 28 - 6 - 2 - 2);
      paramByte.jdMethod_new(paramInt1);
      paramByte.jdMethod_for((short)(a5.il - paramByte.z() >> 1));
      paramByte.a(this, paramString1);
      paramByte.di = (short)(paramByte.k + 4 + 10 + 3 + 1 + 1 + 1);
      paramByte.dh = (short)(paramByte.j + 5 + 1 + 1 + 1);
      return;
    case 4:
      paramByte.jdMethod_new(0);
      paramByte.jdMethod_do((short)a5.ic);
      paramByte.dc = (paramByte.a - 28 - 6 - 2 - 2);
      paramInt1 = a5.gZ ? "玩家死亡，$触摸弹板$复活！" : "玩家死亡，按$#$键复活！";
      paramByte.jdMethod_new(paramInt1);
      paramByte.jdMethod_for((short)((a5.il - paramByte.ds) / 2));
      paramByte.di = (short)(paramByte.k + 4 + 10 + 3 + 1 + 1 + 1);
      paramByte.dh = (short)(paramByte.j + 5 + 1 + 1 + 1);
      paramInt1 = paramByte.cK;
      paramByte = paramInt1;
      (this = paramByte).c1 = b5.a(paramByte, paramInt1, this.dc, a5.fq);
      for (paramByte = 0; paramByte < this.c1.length; paramByte++)
      {
        int tmp320_319 = 0;
        short[] tmp320_318 = this.c1[paramByte];
        tmp320_318[tmp320_319] = (short)(tmp320_318[tmp320_319] + this.di);
        this.c1[paramByte][1] = (short)(this.dh + a5.iG * (this.c1[paramByte][1] - 1));
      }
      this.dw = (short)(this.cP.length * (a5.iG + 1) + 5);
      this.ds = (short)(this.dw + 2 + 2 + 2 + 10 + 4);
      this.cS = (short)(this.ds - 5 - 1 - 1 - 1);
      a(this.ds);
      return;
    }
    paramByte.jdMethod_new(0);
    paramByte.jdMethod_do((short)a5.ic);
    paramByte.dc = (paramByte.a - 28 - 6 - 2 - 2);
    paramByte.jdMethod_new(paramInt1);
    paramByte.jdMethod_for((short)((a5.il - paramByte.ds) / 2));
    paramByte.a(this, paramString1);
    paramByte.di = (short)(paramByte.k + 4 + 10 + 3 + 1 + 1 + 1);
    paramByte.dh = (short)(paramByte.j + 5 + 1 + 1 + 1);
  }

  private void jdMethod_new(String paramString)
  {
    if (paramString == null)
      return;
    Font localFont = a5.fq;
    int j = this.dc;
    Object localObject = paramString;
    paramString = this;
    int m = (localObject = ((String)localObject).toCharArray()).length;
    int[] arrayOfInt3 = new int[34];
    int i1 = 0;
    StringBuffer localStringBuffer = new StringBuffer();
    Vector localVector2 = new Vector();
    int i4 = 0;
    if (localObject[i4] != '\n')
      localVector2.addElement(new Character(localObject[i4]));
    if (localObject[i4] != '$')
      localStringBuffer.append(localObject[i4]);
    i4++;
    i4 = 0;
    int i = localVector2.size();
    while (i4 < i)
    {
      if (localVector2.elementAt(i4).toString().charAt(0) == '$')
      {
        arrayOfInt3[i1] = i4;
        i1++;
      }
      i4++;
    }
    m = (arrayOfString = b5.a(localStringBuffer.toString(), j, localFont)).length;
    paramString.cG = new byte[m][];
    int[][] arrayOfInt = new int[m][2];
    for (j = 0; j < m; j++)
    {
      k = arrayOfString[j].length();
      paramString.cG[j] = new byte[k];
      if (j == 0)
      {
        arrayOfInt[j][0] = 0;
        arrayOfInt[j][1] = (k - 1);
      }
      else
      {
        arrayOfInt[j][0] = (arrayOfInt[(j - 1)][1] + 1);
        arrayOfInt[j][1] = (arrayOfInt[j][0] + k - 1);
      }
    }
    Vector localVector1 = new Vector(4);
    if (i1 % 2 != 0)
      i1--;
    for (int k = 0; k < i1; k += 2)
    {
      arrayOfInt3[k] -= k;
      arrayOfInt3[(k + 1)] -= k + 1 + 1;
      int i2 = b5.a(arrayOfInt3[k], arrayOfInt);
      i3 = b5.a(arrayOfInt3[(k + 1)], arrayOfInt);
      if (i2 == i3)
      {
        int[] arrayOfInt4;
        (arrayOfInt4 = new int[3])[0] = i2;
        arrayOfInt4[1] = (arrayOfInt3[k] - arrayOfInt[i2][0]);
        arrayOfInt4[2] = (arrayOfInt3[(k + 1)] - arrayOfInt[i2][0]);
        localVector1.addElement(arrayOfInt4);
      }
      else
      {
        if ((i5 = i3 - i2) > 1)
          for (int i6 = i2 + 1; i6 < i3; i6++)
          {
            int[] arrayOfInt2;
            (arrayOfInt2 = new int[3])[0] = i6;
            arrayOfInt2[1] = 0;
            arrayOfInt2[2] = (arrayOfString[i6].length() - 1);
            localVector1.addElement(arrayOfInt2);
          }
        int[] arrayOfInt5;
        (arrayOfInt5 = new int[3])[0] = i2;
        arrayOfInt5[1] = (arrayOfInt3[k] - arrayOfInt[i2][0]);
        arrayOfInt5[2] = (arrayOfInt[i2][1] - arrayOfInt[i2][0]);
        localVector1.addElement(arrayOfInt5);
        (arrayOfInt5 = new int[3])[0] = i3;
        arrayOfInt5[1] = 0;
        arrayOfInt5[2] = (arrayOfInt3[(k + 1)] - arrayOfInt[i3][0]);
        localVector1.addElement(arrayOfInt5);
      }
    }
    int n;
    int[][] arrayOfInt1 = new int[n = localVector1.size()][];
    Enumeration localEnumeration = localVector1.elements();
    for (int i3 = 0; localEnumeration.hasMoreElements(); i3++)
      arrayOfInt1[i3] = ((int[])(int[])localEnumeration.nextElement());
    for (int i5 = 0; i5 < n; i5++)
      for (int i7 = arrayOfInt1[i5][1]; i7 <= arrayOfInt1[i5][2]; i7++)
        paramString.cG[arrayOfInt1[i5][0]][i7] = 1;
  }

  private void a(String paramString1, String paramString2)
  {
    if (paramString1 == null)
      this.cJ = "";
    else
      this.cJ = paramString1;
    if (paramString2 == null)
    {
      this.dO = "";
      return;
    }
    this.dO = paramString2;
  }

  private void jdMethod_for(Graphics paramGraphics)
  {
    int i = this.cP.length;
    if (this.cP != null)
      for (int j = 0; j < i; j++)
      {
        int k = 0;
        char[] arrayOfChar = this.cP[j].toCharArray();
        int m = a5.fq.stringWidth(this.cP[j]) >> 1;
        for (int n = 0; n < arrayOfChar.length; n++)
        {
          if (this.cG[j][n] == 0)
            paramGraphics.setColor(bm.bP);
          else
            paramGraphics.setColor(c0);
          paramGraphics.drawChar(arrayOfChar[n], a5.ic / 2 - m + k, this.dh + a5.iG * j, 20);
          k += a5.fq.charWidth(arrayOfChar[n]);
        }
      }
  }

  public static int a2()
  {
    return 16711680;
  }

  public final void a(Graphics paramGraphics)
  {
    Graphics localGraphics;
    Object localObject;
    int j;
    int k;
    int m;
    int n;
    int i1;
    String str;
    switch (this.y)
    {
    case 1:
      paramGraphics = paramGraphics;
      this = this;
      jdMethod_void(paramGraphics);
      jdMethod_int(paramGraphics);
      localGraphics = paramGraphics;
      localObject = this;
      j = 14 > a5.iG + 1 ? 14 : a5.iG + 1;
      k = ((ba)localObject).k + (((ba)localObject).a - 75 >> 1);
      m = ((ba)localObject).j + 5 + 1 + 1 + 1 + ((as)localObject).cP.length * (a5.iG + 3) + 3;
      localGraphics.setColor(bm.dw);
      localGraphics.fillRect(k, m, 75, j);
      localGraphics.setColor(bm.jdField_dt_of_type_Int);
      localGraphics.drawRect(k, m, 75, j);
      j = 0;
      localGraphics.setColor(bm.F);
      n = ((as)localObject).dJ.toString().trim().length();
      i1 = 0;
      str = ((as)localObject).dJ.toString().trim();
      for (j = a5.fq.stringWidth(str); (j + 4 > ((ba)localObject).a) && (i1 <= n - 1); j = a5.fq.stringWidth(str))
      {
        i1++;
        str = ((as)localObject).dJ.toString().substring(i1).trim();
      }
      localGraphics.drawString(str, k + 5, m, 20);
      if (++localObject.c3 > 5)
        ((as)localObject).c3 = 0;
      if (((as)localObject).c3 < 3)
      {
        ((as)localObject).cV = (k + 5 + j + 2);
        localGraphics.setColor(bm.F);
        localGraphics.drawLine(((as)localObject).cV, m + 1, ((as)localObject).cV, m + 12);
      }
      c(paramGraphics);
      return;
    case 4:
      paramGraphics = paramGraphics;
      this = this;
      jdMethod_void(paramGraphics);
      jdMethod_for(paramGraphics);
      return;
    case 13:
      paramGraphics = paramGraphics;
      this = this;
      jdMethod_void(paramGraphics);
      jdMethod_int(paramGraphics);
      localGraphics = paramGraphics;
      localObject = this;
      k = this.a - 75 >> 1;
      m = ((ba)localObject).j + 5 + 1 + 1 + 1 + ((as)localObject).cP.length * (a5.iG + 3) + 3;
      localGraphics.setColor(bm.dw);
      localGraphics.fillRect(k, m, 75, 13);
      localGraphics.setColor(bm.jdField_dt_of_type_Int);
      localGraphics.drawRect(k, m, 75, 13);
      j = 0;
      localGraphics.setColor(bm.F);
      n = ((as)localObject).dJ.toString().trim().length();
      i1 = 0;
      str = ((as)localObject).dJ.toString().trim();
      for (j = a5.fq.stringWidth(str); (j + 4 > ((ba)localObject).a) && (i1 <= n - 1); j = a5.fq.stringWidth(str))
      {
        i1++;
        str = ((as)localObject).dJ.toString().substring(i1).trim();
      }
      localGraphics.drawString(str, k + 5, m, 20);
      if (++localObject.c3 > 5)
        ((as)localObject).c3 = 0;
      if (((as)localObject).c3 < 3)
      {
        ((as)localObject).cV = (k + 5 + j + 2);
        localGraphics.setColor(bm.F);
        localGraphics.drawLine(((as)localObject).cV, m + 1, ((as)localObject).cV, m + 12);
      }
      c(paramGraphics);
      return;
    case 10:
    case 31:
      paramGraphics = paramGraphics;
      this = this;
      d(paramGraphics);
      localObject = a5.gZ ? "触摸此处查看" : "按0键查看";
      int i = this.cP.length;
      this = this.dh + a5.iG * i;
      paramGraphics.drawString((String)localObject, a5.ic >> 1, this, 17);
      return;
    }
    d(paramGraphics);
  }

  public final void a7()
  {
    aV();
    if (a5.jdMethod_else() == 5)
    {
      this = this;
      switch (this.y)
      {
      case 1:
      case 13:
        int i = 0;
        int k = a5.eT.length;
        while (i < k)
        {
          if (a5.jdMethod_byte(a5.eT[i]))
            jdMethod_void(a5.eT[i]);
          i++;
        }
        if (a5.jdMethod_byte(131072))
        {
          if (this.dP == -1610612640)
          {
            bk.char = aT();
            if (bk.f())
              a5.eQ.a(2425012);
            return;
          }
          if (this.dP == -1610612639)
          {
            bk.char = aT();
            if (bk.f())
              a5.eQ.a(2425013);
            return;
          }
          if (this.dP == -1610612617)
          {
            if ((byte)aT() == 0)
            {
              a(0, "请您输入数量", "确定", "", -1, -2);
              break;
            }
            aj.void = (byte)aT();
            a5.gQ = null;
            aj.jdMethod_if();
            return;
          }
        }
        if ((a5.jdMethod_byte(1048576)) || (a5.jdMethod_try(16384)))
        {
          aU();
          return;
        }
        if (aS())
        {
          c4 = aT();
          switch (a5.es.g9)
          {
          case 1376263:
            if (this.dJ.toString().equals("0"))
              break;
            r.md[dU] = (byte)c4;
            r.mG[dU] = cW;
            break;
          case 1179649:
          case 1179650:
          case 1179652:
          case 1179654:
          case 1179655:
          case 1179657:
          case 1638423:
            r.ny = c4;
            break;
          case 1703946:
            if (c4 <= 0)
            {
              r.mE[dU][0] = -1;
              r.mE[dU][1] = -1;
              r.mE[dU][2] = -1;
              r.mE[dU][3] = -1;
              if (q.j > 0)
                q.j = (byte)(q.j - 1);
              a5.gQ = null;
              return;
            }
            r.mE[dU][3] = (byte)c4;
            break;
          case 1900547:
            if (c4 > 0)
              bw.a((byte)c4);
            else
              a5.gQ = null;
            break;
          case 1900546:
            bw.if = c4;
          }
          if (this.dP >= 0)
          {
            a5.gQ = null;
            if ((this.dP == 458756) || (this.dP == 1179656))
            {
              at.new = (byte)aT();
            }
            else if ((this.dP == 1179651) || (this.dP == 1179653))
            {
              if ((bs.if = (byte)aT()) == 0)
                return;
            }
            else if (((this.dP == 2555963) || (this.dP == 2555943) || (this.dP == 2555970) || (this.dP == 2555954) || (this.dP == 2555945) || (this.dP == 2555971) || (this.dP == 2555940) || (this.dP == 2555941) || (this.dP == 2555909) || (this.dP == 2555958) || (this.dP == 2555975)) && ((byte)aT() == 0))
            {
              a(0, "请您输入数量", "确定", "", -1, -2);
              if (((this.dP == 2555943) || (this.dP == 2555945) || (this.dP == 2555941)) && (a5.d6.size() > 0))
                a5.d6.removeElementAt(a5.d6.size() - 1);
              return;
            }
            a5.eQ.a(this.dP);
            return;
          }
          if (this.dP != -1)
            break;
          a5.gQ = null;
          return;
        }
        else
        {
          if (!a5.jdMethod_byte(262144))
            break;
          if (this.dp >= 0)
          {
            a5.gQ = null;
            a5.eQ.a(this.dp);
            return;
          }
          if (this.dp == -1)
          {
            a5.gQ = null;
            switch (a5.es.g9)
            {
            case 1703946:
              for (i = 0; i < r.mE.length; i++)
              {
                if (r.mE[i][0] != cW)
                  continue;
                r.mE[i][0] = -1;
                r.mE[i][1] = -1;
                r.mE[i][2] = -1;
                r.mE[i][3] = -1;
                break;
              }
              if (q.j <= 0)
                break;
              q.j = (byte)(q.j - 1);
            }
            return;
          }
          if (this.dp != -16)
            break;
          a5.gQ = null;
          if (a5.d6.size() <= 0)
            break;
          a5.d6.removeElementAt(a5.d6.size() - 1);
        }
        break;
      case 4:
        if (a5.jdMethod_byte(2048))
        {
          a5.A();
          a5.aj();
          a8();
          l.jdMethod_for();
          a5.jdMethod_do(2);
          a5.eQ.a(196621);
        }
        break;
      case 6:
        this = this;
        if (aS())
          ((bv)a5.es.cf().elementAt(2)).s(this.dP);
        else if (a5.jdMethod_byte(262144))
          ((bv)a5.es.cf().elementAt(2)).s(this.dp);
        break;
      case 11:
        this = this;
        if (aS())
        {
          a5.A();
          a5.gQ = null;
          a5.jdMethod_try(a5.cg);
          a5.eQ.a(196627);
        }
        else if (a5.jdMethod_byte(262144))
        {
          a5.A();
          a5.gQ = null;
          a5.jdMethod_try(a5.cg);
          a5.eQ.a(196628);
        }
        break;
      case 15:
        this = this;
        if (aS())
        {
          a5.gQ = null;
          a5.d6.removeElementAt(a5.d6.size() - 1);
          be.cr();
        }
        break;
      case 16:
        this = this;
        if (a5.jdMethod_byte(262144))
        {
          a5.gQ = null;
          if (this.dp >= 0)
            a5.eQ.a(this.dp);
        }
        break;
      case 14:
        if (aS())
        {
          if (this.dP != 624776)
            break;
          a5.eQ.a(624776);
          a5.gQ = null;
          bp.ag();
          if (bp.ag().ct != 25)
            break;
          a(4, "", "", "", -2, -2);
          return;
        }
        else
        {
          if ((!a5.jdMethod_byte(262144)) || (this.dp != -1))
            break;
          a5.gQ = null;
          bp.ag();
          if (bp.ag().ct != 25)
            break;
          a(4, "", "", "", -2, -2);
        }
        break;
      case 17:
        if ((!aS()) || (this.dP != -1))
          break;
        a5.iB = 0;
        a5.C();
        break;
      case 35:
        this = this;
        if (aS())
        {
          ao.ci = false;
          a5.gQ = null;
          be.cn();
        }
        else if (a5.jdMethod_byte(262144))
        {
          a5.gQ = null;
        }
        break;
      case 2:
      case 3:
      case 5:
      case 7:
      case 8:
      case 9:
      case 10:
      case 12:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      default:
        if (aS())
        {
          b5.jdMethod_case("默认弹板leftCmd = " + Integer.toHexString(this.dP));
          if (this.dP >= 0)
          {
            dV = this.cR;
            b5.jdMethod_case("curTaskID=============" + dV);
            a5.gQ = null;
            if (this.dP == 1638447)
            {
              be.cn();
              return;
            }
            if (this.dP == 3342345)
            {
              if (a5.d6.size() > 0)
                a5.d6.removeElementAt(a5.d6.size() - 1);
              return;
            }
            a5.eQ.a(this.dP);
            switch (this = this.dP)
            {
            case 1966085:
              if (!((this = a5.d6.elementAt(0)) instanceof be))
                break;
              this = (be)this;
              a5.d6.setElementAt(new Integer(this.g9), 0);
              break;
            case 65547:
              a0();
              break;
            case 65549:
              a5.gQ = null;
              a5.eQ.a(131071);
              a5.jdMethod_do(2);
              ad.a("");
              a5.e8.a(0);
              bp.ag().cA = false;
              if (a5.hQ != 0)
                a5.hQ = 0;
              a5.eQ.a(65551);
              if (a5.eQ.e)
                a5.eQ.e = false;
              a5.hH = true;
            }
            return;
          }
          if (this.dP == -1)
          {
            if ((a5.es != null) && ((a5.es.g9 == 131078) || (a5.es.g9 == 131079)))
              a5.eQ.e = false;
            a5.gQ = null;
            return;
          }
          if (this.dP == -250)
          {
            a5.gQ = null;
            a(0, "部分邮件可能含有附件，你确认删除？", "是", "否", 1703944, -1);
            return;
          }
          if (this.dP == -260)
          {
            a5.gQ = null;
            bo.jdMethod_if();
            return;
          }
          if (this.dP == -3)
          {
            a5.gQ = null;
            r.ed();
            q.a();
            a5.eQ.a(1703955);
            return;
          }
          if ((this.dP == -4) || (this.dP == -5))
          {
            a5.gQ = null;
            aq.jdMethod_if();
            return;
          }
          if (this.dP == -6)
          {
            a5.gQ = null;
            aq.a(4, false, 3, true);
            a5.eQ.a(2031622);
            return;
          }
          if (this.dP == -7)
          {
            a5.gQ = null;
            if (a5.cC)
            {
              a5.cC = false;
              return;
            }
            aq.a(6, false, 1, true);
            return;
          }
          if (this.dP == -8)
          {
            a5.gQ = null;
            if (a5.cC)
            {
              a5.cC = false;
              return;
            }
            aq.a(8, false, 2, true);
            return;
          }
          if (this.dP == -10)
          {
            a5.gQ = null;
            aq.a = (byte)r.mY[0];
            a5.eQ.a(2031637);
            return;
          }
          if (this.dP == -11)
          {
            a5.gQ = null;
            aj.a();
            return;
          }
          if (this.dP == -12)
          {
            a5.gQ = null;
            aj.do = (byte)(aj.do - ((Byte)aj.a.elementAt(aj.a.size() - 1)).byteValue());
            if (aj.new.size() <= 0)
              break;
            aj.new.removeElementAt(aj.new.size() - 1);
            aj.a.removeElementAt(aj.a.size() - 1);
            aj.byte = ((Byte)(Byte)aj.new.elementAt(aj.new.size() - 1)).byteValue();
            return;
          }
          else
          {
            Object localObject1;
            Object localObject2;
            if (this.dP == -13)
            {
              a5.gQ = null;
              au.int = (byte)r.mY[0];
              localObject1 = (a7)a5.es.cf().elementAt(4);
              localObject2 = (r)a5.es.cf().elementAt(7);
              ((ba)localObject1).a(true, a5.es);
              ((ba)localObject2).a(false, a5.es);
              a5.eQ.a(1966098);
              return;
            }
            if (this.dP == -14)
            {
              a5.gQ = null;
              au.try = (byte)r.mY[0];
              localObject1 = (a7)a5.es.cf().elementAt(6);
              localObject2 = (r)a5.es.cf().elementAt(7);
              ((a7)localObject1).a(true, 1);
              ((a7)localObject1).fC = (byte)r.mY[2];
              this = r.mY[1];
              ((a7)localObject1).ft = true;
              ((a7)localObject1).jdMethod_if(this, true);
              ((a7)localObject1).a(a5.gg);
              ((ba)localObject1).a(false, a5.es);
              ((ba)localObject2).a(true, a5.es);
              return;
            }
            if (this.dP == -15)
            {
              a5.gQ = null;
              au.do = 1;
              return;
            }
            if (this.dP == -16)
            {
              a5.gQ = null;
              au.int = -1;
              (localObject1 = (a7)a5.es.cf().elementAt(4)).g(false);
              ((a7)localObject1).ft = false;
              ((a7)localObject1).a(null);
              return;
            }
            if (this.dP == -17)
            {
              a5.gQ = null;
              localObject1 = (a7)a5.es.cf().elementAt(4);
              localObject2 = (a7)a5.es.cf().elementAt(6);
              this = (r)a5.es.cf().elementAt(7);
              ((ba)localObject1).a(false, a5.es);
              ((ba)localObject2).a(true, a5.es);
              a(false, a5.es);
              if (a5.d6.size() > 0)
                a5.d6.removeElementAt(a5.d6.size() - 1);
              return;
            }
            if (this.dP == -18)
            {
              a5.gQ = null;
              (localObject1 = (ah)a5.es.cf().elementAt(32)).a(true, a5.es);
              return;
            }
            if (this.dP == -19)
            {
              a8();
              if (a5.ea != null)
              {
                a5.ea.l6.removeAllElements();
                a5.ea = null;
              }
              a5.hH = true;
              a5.eQ.a(65542);
              a5.jdMethod_do(2);
              ad.a("");
              a5.e8.a(0);
              bp.ag().cA = false;
              if (bu.d != 0)
                bu.d = 0;
              if (z.case)
                z.case = false;
              if (l.goto != 3)
                l.goto = 3;
              z.ag = new Vector();
              return;
            }
            if (this.dP == -20)
            {
              a8();
              if (bp.ag() != null)
                bp.ag().jdMethod_if(false);
              if (a5.ea != null)
              {
                a5.ea.l6.removeAllElements();
                a5.ea = null;
              }
              a5.q();
              bp.ag().cA = false;
              ad.a("");
              if (bu.d != 0)
                bu.d = 0;
              if (z.case)
                z.case = false;
              if (l.goto != 3)
                l.goto = 3;
              z.ag = new Vector();
              return;
            }
            if (this.dP == -21)
            {
              a5.gQ = null;
              a5.A();
              return;
            }
            if (this.dP == -22)
            {
              a5.gQ = null;
              au.case = 0;
              return;
            }
            if (this.dP == -23)
            {
              a5.gQ = null;
              bo.jdMethod_if(bo.C = 1);
              bo.jdMethod_int();
              (localObject1 = new Thread()
              {
                public final void run()
                {
                  bo.a(bo.e);
                }
              }).start();
              bo.long = 2;
              a(0, "正在充值，请您稍候...", "", "", -2, -2);
              return;
            }
            if (this.dP == -24)
            {
              localObject1 = (a9)a5.es.cf().elementAt(9);
              localObject2 = (a9)a5.es.cf().elementAt(10);
              ((a9)localObject1).a(new StringBuffer(bk.aa));
              ((a9)localObject2).a(new StringBuffer(bk.aa));
              a5.gQ = null;
              return;
            }
            if (this.dP == -25)
            {
              a5.gQ = null;
              a5.A();
              if (a5.ea != null)
              {
                a5.ea.l6.removeAllElements();
                a5.ea = null;
              }
              b5.a(a5.hC, "name_password");
              a5.jdMethod_try(0);
              a5.hQ = 2;
              a5.eQ.a(65548);
              return;
            }
            if (this.dP == -26)
            {
              a5.gQ = null;
              be.cn();
              return;
            }
            if (this.dP == -27)
            {
              a0();
              return;
            }
            if (this.dP == -28)
            {
              a5.gQ = null;
              localObject1 = "请稍候...";
              a5.a(0, (String)localObject1, "", "", -120, -120);
              localObject2 = null;
              (localObject2 = new bk(bk.q, bk.jdMethod_do(0), a5.dU ? 0 : 1, 2)).a(0);
              return;
            }
            if (this.dP != -29)
              break;
            a5.gQ = null;
            a5.eQ.a(2555955);
            return;
          }
        }
        else if (a5.jdMethod_byte(262144))
        {
          if (this.dp >= 0)
          {
            dV = this.cR;
            a5.gQ = null;
            a5.eQ.a(this.dp);
            return;
          }
          if (this.dp == -1)
          {
            a5.gQ = null;
            return;
          }
          if ((this.dp == -4) || (this.dp == -5))
          {
            a5.gQ = null;
            aq.jdMethod_if();
            return;
          }
          if (this.dp == -9)
          {
            a5.gQ = null;
            for (int j = 0; j < r.mY.length; j++)
              r.mY[j] = -1;
            return;
          }
          if (this.dp == -11)
          {
            a5.gQ = null;
            aj.a();
            return;
          }
          if (this.dp == -12)
          {
            a8();
            if (bp.ag() != null)
              bp.ag().jdMethod_if(false);
            if (a5.ea != null)
            {
              a5.ea.l6.removeAllElements();
              a5.ea = null;
            }
            a5.q();
            bp.ag().cA = false;
            ad.a("");
            a5.hQ = 0;
            return;
          }
          if (this.dp == -15)
          {
            a5.gQ = null;
            au.do = 1;
            return;
          }
          if (this.dp != -18)
            break;
          a5.gQ = null;
          c4 = 0;
          return;
        }
        else
        {
          if (!a5.jdMethod_byte(1))
            break;
          switch (this.y)
          {
          case 10:
            br.c6();
            a5.eQ.a(720913);
            a5.gQ = null;
            break;
          case 31:
            br.c6();
            a5.eQ.a(720915);
            a5.gQ = null;
          }
        }
      }
      return;
    }
    aM();
  }

  private void d(Graphics paramGraphics)
  {
    jdMethod_void(paramGraphics);
    jdMethod_for(paramGraphics);
    paramGraphics = paramGraphics;
    this = this;
    paramGraphics.setColor(bm.bP);
    paramGraphics.drawString(this.cJ, this.di, this.j + this.cS + 1, 36);
    paramGraphics.drawString(this.dO, this.di + this.dc - 2, this.j + this.cS + 1, 40);
  }

  private void jdMethod_void(Graphics paramGraphics)
  {
    if ((i = (short)(this.a - 8)) <= 0)
      throw new IllegalArgumentException("控件宽度初始值不够长");
    paramGraphics.setColor(bm.try);
    paramGraphics.fillRect(this.k + 4 + 2, this.j + 2, i - 4, this.jdField_int - 4);
    paramGraphics.setColor(bm.dw);
    paramGraphics.drawRect(this.k + 4 + 1, this.j + 1, i - 3, this.jdField_int - 3);
    paramGraphics.setColor(bm.dx);
    paramGraphics.drawRect(this.k + 4, this.j, i - 1, this.jdField_int - 1);
    paramGraphics.drawImage(a5.gu, this.k, this.j + 5, 20);
    paramGraphics.drawImage(a5.gu, this.k, this.j + this.jdField_int - 5 - a5.gu.getHeight(), 20);
    b5.a(paramGraphics, a5.gu, this.k + this.a - a5.gu.getWidth(), this.j + 5, 2);
    b5.a(paramGraphics, a5.gu, this.k + this.a - a5.gu.getWidth(), this.j + this.jdField_int - 5 - a5.gu.getHeight(), 2);
    int i = this.k + 4 + 10;
    int j = 0;
    if (this.da == -1)
      j = this.j + 5;
    else
      j = this.j + 5 + this.da;
    int k = this.a - 28;
    int m = 0;
    if (this.cM == -1)
      m = this.jdField_int - 10;
    else
      m = this.cM;
    paramGraphics.setColor(bm.jdField_dt_of_type_Int);
    paramGraphics.fillRect(i, j, k, m);
    i += 3;
    j += 1;
    k -= 6;
    m -= 2;
    paramGraphics.setColor(bm.try);
    paramGraphics.fillRect(i, j, k, m);
    i += 1;
    j += 1;
    k -= 2;
    m -= 2;
    paramGraphics.setColor(bm.jdField_dt_of_type_Int);
    paramGraphics.fillRect(i, j, k, m);
    i += 1;
    j += 1;
    k -= 2;
    m -= 2;
    this.cy[0] = (i + 1);
    this.cy[1] = (j + m - a5.iG - 3);
    this.cy[2] = (i + k - 2 * a5.iA);
    this.cy[3] = (j + m - a5.iG - 3);
    paramGraphics.setColor(bm.try);
    paramGraphics.fillRect(i, j, k, m);
  }

  private void aM()
  {
    Object localObject1;
    Object localObject3;
    switch (this.y)
    {
    case 17:
      if ((!aS()) || (this.dP != -1))
        break;
      a5.iB = 0;
      a5.C();
      break;
    case 1:
      int i = 0;
      int k = a5.eT.length;
      while (i < k)
      {
        if (a5.jdMethod_byte(a5.eT[i]))
          jdMethod_void(a5.eT[i]);
        i++;
      }
      if ((a5.jdMethod_byte(1048576)) || (a5.jdMethod_try(16384)))
        aU();
      if (!a5.jdMethod_byte(131072))
        break;
      if (this.dP == -1610612640)
      {
        bk.char = aT();
        if (!bk.f())
          break;
        if (bk.m())
        {
          localObject1 = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + a5.ik + "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100 + "&qtype=7&qtime=" + bk.if + "&qmonth=" + bk.char;
          a5.a(0, "请稍候...", "", "", -120, -120);
          (localObject3 = new bk(bk.void, (String)localObject1, a5.dU ? 0 : 1, 3)).a(8);
        }
        else
        {
          a5.a(0, "请稍候...", "", "", -120, -120);
          bk.b = true;
          (localObject1 = new bk(bk.aG, bk.aQ, a5.dU ? 0 : 1, 1)).a(8);
        }
      }
      else
      {
        if (this.dP != -1610612639)
          break;
        bk.char = aT();
        if (!bk.f())
          break;
        if (bk.m())
        {
          localObject1 = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + a5.ik + "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100 + "&qtype=" + bk.ay + "&qtime=" + bk.if + "&qmonth=" + bk.char;
          a5.a(0, "请稍候...", "", "", -120, -120);
          (localObject3 = new bk(bk.void, (String)localObject1, a5.dU ? 0 : 1, 3)).a(9);
        }
        else
        {
          a5.a(0, "请稍候...", "", "", -120, -120);
          bk.b = true;
          (localObject1 = new bk(bk.aG, bk.aQ, a5.dU ? 0 : 1, 1)).a(9);
        }
      }
    }
    if (aS())
    {
      if (this.dP >= 0)
      {
        a5.gQ = null;
        a5.eQ.a(this.dP);
        return;
      }
      if (this.dP == -1)
      {
        a5.gQ = null;
        if ((a5.jdMethod_else() != 21) && (a5.jdMethod_else() != 22) && (a5.jdMethod_else() != 23) && (a5.jdMethod_else() != 17))
        {
          a5.jdMethod_do(4);
          return;
        }
      }
      else if (this.dP != -2)
      {
        if ((this.dP == -3) || (this.dP == -5))
        {
          a5.gQ = null;
          return;
        }
        if (this.dP == -4)
        {
          a5.gQ = null;
          if (a5.jdMethod_else() == 14)
          {
            b5.a(a5.hC, "name_password");
            a5.fr = null;
            a5.I();
            a5.eQ.a(65537);
            return;
          }
          if (a5.jdMethod_else() == 18)
          {
            a5.eQ.a(131071);
            localObject1 = "请稍候...";
            a5.a(0, (String)localObject1, "", "", -120, -120);
            a5.e8.cP[0] = 1;
            a5.ah();
            a5.G();
            a5.gx = 0;
            a5.eg = 1;
            return;
          }
          if (a5.jdMethod_else() == 15)
          {
            a5.I();
            a5.jdMethod_do(11);
            return;
          }
          if (a5.jdMethod_else() == 19)
          {
            a5.ah();
            a5.G();
            a5.eg = 2;
            a5.eQ.a(131071);
            a5.jdMethod_do(17);
            return;
          }
          if (a5.jdMethod_else() == 17)
          {
            a5.a(be.gU[0], be.gU[1]);
            localObject1 = "请稍候...";
            a5.a(0, (String)localObject1, "", "", -120, -120);
            a5.eQ.a(131071);
            a5.jdMethod_do(17);
            a5.h6 = 0;
            return;
          }
        }
        else
        {
          if (this.dP == -6)
          {
            a5.gQ = null;
            a5.eQ.jdMethod_for();
            a5.jdMethod_do(11);
            return;
          }
          if (this.dP == -7)
          {
            a5.gQ = null;
            return;
          }
          if (this.dP == -8)
          {
            a5.gQ = null;
            bq.a(a5.dI, 0);
            return;
          }
          if (this.dP == -9)
          {
            localObject1 = (a9)a5.es.cf().elementAt(9);
            localObject3 = (a9)a5.es.cf().elementAt(10);
            ((a9)localObject1).a(new StringBuffer(bk.aa));
            ((a9)localObject3).a(new StringBuffer(bk.aa));
            a5.gQ = null;
            return;
          }
          if (this.dP == -10)
          {
            a5.gQ = null;
            be.g8 = true;
            a5.jdMethod_do(8);
            return;
          }
          if (this.dP == -11)
          {
            if (a5.f6 == null)
              a5.f6 = new byte[1];
            a5.f6[0] = 0;
            b5.a(a5.f6, "login_type");
            localObject1 = "请稍候...";
            a5.a(0, (String)localObject1, "", "", -120, -120);
            localObject3 = null;
            (localObject3 = new bk(bk.q, bk.jdMethod_do(0), a5.dU ? 0 : 1, 2)).a(0);
            return;
          }
          Object localObject2;
          if (this.dP == -19)
          {
            a5.gQ = null;
            a5.iC[a5.hg] = ((a7)a5.es.cf().elementAt(a5.hg + 3));
            a5.iC[a5.hg].eo = null;
            for (int j = 0; j < a5.iD.length; j++)
            {
              a5.iD[j] = ((ah)a5.es.cf().elementAt(j + 11));
              a5.iD[j].a("");
            }
            a5.e0[a5.hg] = null;
            a5.im[a5.hg] = 0;
            a5.fZ[a5.hg] = 0;
            a5.hE[a5.hg] = 0;
            a5.d3[a5.hg] = null;
            (localObject2 = (ak)a5.es.cf().elementAt(16)).jdMethod_if("删除角色");
            return;
          }
          if ((this.dP == -30) || (this.dP == -31))
          {
            if (this.dP == -31)
            {
              if (bk.d)
                bk.d = false;
              a5.hY = 1;
            }
            b5.a(a5.hC, "name_password");
            localObject2 = null;
            localObject2 = new bk(bk.q, bk.jdMethod_do(1), a5.dU ? 0 : 1, 2);
            if (a5.hM)
              be.gd = System.currentTimeMillis();
            ((bk)localObject2).a(1);
            localObject3 = "请稍候...";
            a5.a(0, (String)localObject3, "", "", -120, -120);
            return;
          }
        }
      }
    }
    else if (a5.jdMethod_byte(262144))
    {
      if (this.dp >= 0)
      {
        a5.gQ = null;
        a5.eQ.a(this.dp);
        return;
      }
      if (this.dp == -1)
      {
        a5.gQ = null;
        return;
      }
      if (this.dp == -2)
      {
        a5.jdMethod_do(12);
        return;
      }
      if (this.dp == -3)
      {
        a5.gQ = null;
        return;
      }
      if (this.dp == -17)
      {
        a5.gQ = null;
        if (bk.d)
          bk.d = false;
      }
    }
  }

  public static void a6()
  {
    a5.gQ = null;
  }

  public static void aL()
  {
    if (a5.gR.length > 0)
    {
      byte[] arrayOfByte = a5.gR[0];
      int i = 0;
      switch (arrayOfByte[0])
      {
      case 0:
        i = 1;
        break;
      case 1:
        if ((a5.V() != 0) || (a5.fR == true))
          break;
        i = 1;
      }
      if (i != 0)
      {
        a5.gQ = e.a(arrayOfByte);
        a5.gR = b5.a(a5.gR, 0);
      }
    }
  }

  public static void a8()
  {
    a5.gR = new byte[0][];
    a5.gQ = null;
  }

  private void c(Graphics paramGraphics)
  {
    paramGraphics.setColor(bm.bP);
    paramGraphics.drawString(this.cJ, this.cy[0], this.cy[1], 20);
    paramGraphics.drawString(this.dO, this.cy[2], this.cy[3], 20);
  }

  private void jdMethod_int(Graphics paramGraphics)
  {
    paramGraphics.setColor(bm.bP);
    if (this.cP != null)
    {
      int i = this.j + 5 + 1 + 1 + 1;
      for (int j = 0; j < this.cP.length; j++)
      {
        int k = b5.jdMethod_do(this.cP[j]);
        k = (this.a - k) / 2;
        paramGraphics.drawString(this.cP[j], k, i + j * (a5.iG + 3), 20);
      }
    }
  }

  private void jdMethod_void(int paramInt)
  {
    for (int i = 0; i < 10; i++)
    {
      if (1 << i != paramInt)
        continue;
      if ((this.y != 1) && (this.y != 13))
        break;
      a(cN.charAt(i));
      return;
    }
  }

  public final void a(char paramChar)
  {
    if (this.dJ.length() < this.cA)
    {
      if ((this.dJ.length() == 1) && (this.dJ.toString().equals("0")))
        this.dJ.deleteCharAt(0);
      this.dJ.append(paramChar);
      long l = Long.parseLong(this.dJ.toString());
      if (cH >= 0)
        try
        {
          if ((l = Long.parseLong(this.dJ.toString())) > cH)
            jdMethod_for(Long.toString(cH));
          else
            jdMethod_for(Long.toString(l));
        }
        catch (Exception localException)
        {
        }
      if (l < 0L)
        jdMethod_for(0 + "");
    }
  }

  private void aU()
  {
    if (this.dJ.length() > 0)
    {
      this.dJ.deleteCharAt(this.dJ.length() - 1);
      if ((this.dJ.length() == 0) || (aT() < 0))
        jdMethod_for(0 + "");
    }
    this.c3 = 0;
  }

  private int aT()
  {
    try
    {
      if (this.dJ.toString().trim().equals(""))
        return 0;
      return this = Integer.parseInt(this.dJ.toString());
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public final void jdMethod_goto(int paramInt)
  {
    this.dJ = new StringBuffer();
    this.dJ.append(paramInt);
  }

  private void jdMethod_for(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      this = this;
      this.dJ.delete(0, this.dJ.length());
      return;
    }
    int i = 0;
    int j = paramString.length();
    while (i < j)
    {
      if (!Character.isDigit(paramString.charAt(i)))
        return;
      i++;
    }
    this.dJ.delete(0, this.dJ.length());
    this.dJ.append(paramString);
  }

  public final byte jdMethod_char()
  {
    return this.y;
  }

  public final void a(byte paramByte)
  {
    this.y = paramByte;
  }

  public static void a(byte paramByte, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    (a5.gQ = new as(paramByte, null)).a(5, c0, paramString1, paramString2, paramString3, paramInt1, paramInt2);
  }

  public static void aY()
  {
    a(0, "您当前的联网方式不支持此功能，请返回游戏主菜单修改联网方式为CMWAP后重新尝试", "确定", "", -1, -2);
  }

  public static void a(byte paramByte, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(1, paramString1, paramString2, paramString3, paramInt1, -1);
    dU = (byte)paramInt3;
    cW = (byte)paramInt4;
  }

  public static void a(byte paramByte, String[] paramArrayOfString, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    paramInt2 = -1;
    paramInt1 = paramInt1;
    paramString2 = paramString2;
    paramString1 = paramString1;
    paramArrayOfString = paramArrayOfString;
    (paramByte = a5.gQ = new as(13, null)).dP = paramInt1;
    paramByte.dp = paramInt2;
    paramInt1 = paramByte;
    if (paramByte.y == 13)
    {
      paramByte.jdMethod_new(0);
      paramByte.jdMethod_do((short)a5.ic);
      paramInt2 = paramArrayOfString.length;
      paramInt1 = paramByte;
      paramByte.dw = (short)((a5.iG + 3) * (paramInt2 + 2));
      paramInt1.ds = (short)((paramInt1.dw + 2 + 2 + 2 + 10 + 4) * a5.il / 208);
      paramInt1.cS = (short)(paramInt1.ds - 5 - 1 - 1 - 1);
      paramInt1.a(paramInt1.ds);
      paramByte.dc = (paramByte.a - 28 - 6 - 2 - 2);
      paramByte.jdMethod_for((short)(a5.il - paramByte.z() >> 1));
      paramByte.a(paramString1, paramString2);
      paramInt2 = paramArrayOfString;
      paramInt1 = paramByte;
      paramByte.cP = paramInt2;
    }
  }

  public final void aV()
  {
    if ((a5.gZ) && (a5.jdMethod_byte(268435456)))
    {
      int i = 0;
      i = 0;
      i = a5.fq.stringWidth(this.cJ);
      int n = this.y == 13 ? this.cy[0] : this.di;
      int i1 = this.y == 13 ? this.cy[1] : this.j + this.cS + 1 - a5.iG;
      boolean bool1;
      if (((bool1 = a5.jdMethod_for(n, i1, i, a5.iG))) && (this.cJ != null))
        a5.a(131072);
      int j = a5.fq.stringWidth(this.dO);
      n = this.y == 13 ? this.cy[2] : this.di + this.dc - 2 - j;
      i1 = this.y == 13 ? this.cy[3] : this.j + this.cS + 1 - a5.iG;
      boolean bool2;
      if (((bool2 = a5.jdMethod_for(n, i1, j, a5.iG))) && (this.dO != null))
        a5.a(262144);
      int k;
      switch (this.y)
      {
      case 4:
        k = (short)(this.a - 8);
        n = this.k + 4;
        i1 = this.j;
        k -= 1;
        this = this.jdField_int - 1;
        if (!a5.a(n, i1, k, this))
          break;
        a5.a(2048);
        return;
      case 1:
      case 13:
        k = this.k + (this.a - 75 >> 1);
        this = this.j + 5 + 1 + 1 + 1 + this.cP.length * (a5.iG + 3) + 3;
        if (!a5.a(k, this, 75, 13))
          break;
        b5.jdMethod_for();
        return;
      case 10:
      case 31:
        String str = a5.gZ ? "触摸此处查看" : "按0键查看";
        n = this.cP.length;
        int m = a5.fq.stringWidth(str);
        i1 = (a5.ic >> 1) - (m >> 1);
        this = this.dh + a5.iG * n;
        m = m;
        n = a5.iG;
        if (!a5.a(i1, this, m, n))
          break;
        a5.a(1);
      }
    }
  }

  private boolean aS()
  {
    int i = 0;
    if (a5.jdMethod_byte(131072))
      i = 1;
    else if (a5.jdMethod_byte(65536))
      if ((this.dO == null) || (this.dO.equals("")))
        i = 1;
      else
        i = 0;
    return i;
  }

  public static void a0()
  {
    a5.gQ = null;
    a(0, "请您稍候...", "", "", -2, -2);
    bk.d = true;
    a5.hC[0] = "tjuser";
    a5.hC[1] = "121212";
    bk localbk;
    (localbk = new bk(bk.q, bk.jdMethod_do(5), a5.dU ? 0 : 1, 2)).a(0);
  }

  public static void b(Graphics paramGraphics)
  {
    if (cu == 0)
      return;
    int i = (i = a5.iA * b5.a(db) + 30) > a5.ic ? a5.ic : i;
    int j = (a5.iG + 2) * db.length + 30;
    int m = (k = (short)(2 + b2.if + a5.iG + 2)) + (j - (a5.iG + 2) * db.length >> 1);
    int n = cu * 1000 / 120;
    int[][] arrayOfInt = { { 16765320, 13740650, 8023640, 4866613, 4866613, 8023640, 13740650, 16765320 }, { 1461506, 2392068, 3455750, 4718344, 4718344, 3455750, 2392068, 1461506 }, { 5046786, 8389892, 12257286, 16714504, 16714504, 12257286, 8389892, 5046786 }, { 5064450, 8418820, 12299782, 16772360, 16772360, 12299782, 8418820, 5064450 } };
    int i2 = a5.ic - i >> 1;
    int k = k;
    if (cY)
    {
      if ((as.cB = (byte)(cB + 1)) == n)
      {
        cu = 0;
        cB = 0;
        cY = false;
        cX = 0;
      }
      else if ((cB < 4) || (cB < 4) || (cB >= n - 4))
      {
        cX = (byte)(cX + 1);
      }
      paramGraphics.setColor(bm.aG);
      paramGraphics.fillRect(i2 + 1, k + 1, i - 2, j - 2);
      int[] arrayOfInt1 = { bm.cW, bm.cV, bm.cU };
      for (int i3 = 0; i3 < 3; i3++)
      {
        paramGraphics.setColor(arrayOfInt1[i3]);
        paramGraphics.drawRect(i2 + i3, k + i3, i - i3 * 2, j - i3 * 2);
      }
      int[] arrayOfInt2 = { bm.a9, bm.a8, bm.a7, bm.a5 };
      for (int i1 = 0; i1 < 4; i1++)
      {
        paramGraphics.setColor(arrayOfInt2[i1]);
        paramGraphics.drawRect(i2 + 3 + 2 + i1, k + 3 + 2 + i1, i - 4 - 2 * (5 + i1), j - 4 - 2 * (5 + i1));
      }
      for (i1 = 0; i1 < db.length; i1++)
      {
        i = 0;
        char[] arrayOfChar = db[i1].toCharArray();
        k = a5.fq.stringWidth(db[i1]) >> 1;
        if (((i2 = b5.jdMethod_if(db[i1], '$')) > 0) && (i2 % 2 == 0))
          k -= a5.fq.stringWidth("$") * (i2 / 2);
        i2 = 0;
        for (int i4 = 0; i4 < arrayOfChar.length; i4++)
          if ((arrayOfChar[i4] == '$') && (i2 == 0))
          {
            i2 = 1;
          }
          else if ((arrayOfChar[i4] == '$') && (i2 != 0))
          {
            i2 = 0;
          }
          else
          {
            if (i2 != 0)
            {
              if (cX == 3)
                paramGraphics.setColor(dk);
              else
                paramGraphics.setColor(arrayOfInt[0][cX]);
            }
            else
              paramGraphics.setColor(arrayOfInt[0][cX]);
            paramGraphics.drawChar(arrayOfChar[i4], a5.ic / 2 - k + i, m + (a5.iG + 2) * i1, 20);
            i += a5.fq.charWidth(arrayOfChar[i4]);
          }
      }
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     as
 * JD-Core Version:    0.6.0
 */
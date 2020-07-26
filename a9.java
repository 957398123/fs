import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public final class a9 extends ba
{
  private long gb = 0L;
  private long f4 = 1000L;
  private int ga = 0;
  private int f8 = -1;
  private int f1 = 0;
  private long fR = -1L;
  private long fW = 0L;
  private byte fS = 0;
  private byte f9 = 0;
  private short f7 = 0;
  private StringBuffer fP = null;
  private StringBuffer f6 = null;
  private String fZ;
  private static String[] f5;
  private static String fY;
  private int fQ = 0;
  private boolean f2 = true;

  public final void jdMethod_if(long paramLong)
  {
    this.fR = paramLong;
  }

  public final void j(boolean paramBoolean)
  {
    this.f2 = false;
  }

  private a9(short paramShort1, short paramShort2, short paramShort3, short paramShort4, String paramString1, String paramString2, byte paramByte, short paramShort5, be parambe)
  {
    super(paramShort1, paramShort2, paramShort3, 0, parambe);
    if (paramString1 != null)
      this.fP = new StringBuffer(paramString1);
    else
      this.fP = new StringBuffer();
    this.fZ = paramString2;
    this.f9 = paramByte;
    this.f7 = paramShort5;
    if (paramByte == 2)
    {
      this.f6 = new StringBuffer();
      int i = 0;
      int j = this.fP.length();
      while (i < j)
      {
        this.f6.append('*');
        i++;
      }
    }
    else if (paramByte == 1)
    {
      long l = 0L;
      for (paramShort1 = 0; paramShort1 < this.f7; paramShort1++)
        l = l *= 10L + 1L;
      this.fR = (l * 9L);
    }
    if (be.gf == null)
      (paramShort1 = a5.dI).notifyDestroyed();
    if (this.jdField_int <= 0)
      this.jdField_int = (short)(a5.iG + 2);
    this.b = true;
  }

  public a9(short paramShort1, short paramShort2, short paramShort3, String paramString, byte paramByte, short paramShort4, be parambe)
  {
    this(paramShort1, paramShort2, paramShort3, 0, paramString, "", paramByte, paramShort4, parambe);
  }

  public final void a(Graphics paramGraphics)
  {
    int i = 0;
    if (this.fZ != null)
    {
      paramGraphics.setColor(bm.bP);
      paramGraphics.drawString(this.fZ, this.k, this.j + 1, 20);
    }
    int j = this.k;
    int k = this.a;
    if ((this.fZ != null) && (!this.fZ.equals("")))
    {
      j = (short)(j + (this.fZ.length() * a5.iA + 2));
      k = (short)(k - (this.fZ.length() * a5.iA + 2));
    }
    paramGraphics.setColor(bm.ci);
    paramGraphics.drawRect(j, this.j, k - 1, this.jdField_int - 1);
    paramGraphics.setColor(bm.y);
    paramGraphics.fillRect(j + 1, this.j + 1, k - 2, this.jdField_int - 2);
    int m = this.k + 2;
    if ((this.fZ != null) && (!this.fZ.equals("")))
      m += this.fZ.length() * a5.iA + 2;
    int n;
    int i1;
    String str;
    switch (this.f9)
    {
    case 1:
      paramGraphics.setColor(bm.F);
      n = this.fP.toString().trim().length();
      i1 = 0;
      str = this.fP.toString().trim();
      for (i = a5.fq.stringWidth(str); (i + 4 > k) && (i1 <= n - 1); i = a5.fq.stringWidth(str))
      {
        i1++;
        str = this.fP.toString().substring(i1).trim();
      }
      if (this.f9 == 1)
        paramGraphics.drawString(str, m, this.j + 2, 20);
      break;
    case 0:
    case 2:
      paramGraphics.setColor(bm.F);
      if (this.f9 == 2)
      {
        if (this.fS > 0)
        {
          this.fS = (byte)(this.fS - 1);
          if ((this.fS == 0) && (this.f6.length() > 0))
            this.f6.setCharAt(this.f6.length() - 1, '*');
        }
        n = this.f6.toString().trim().length();
        i1 = 0;
        str = this.f6.toString().trim();
        for (i = a5.fq.stringWidth(str); (i + 4 > k) && (i1 <= n - 1); i = a5.fq.stringWidth(str))
        {
          i1++;
          str = this.f6.toString().substring(i1).trim();
        }
        paramGraphics.drawString(str, m, this.j + 2, 20);
      }
      else
      {
        n = this.fP.toString().trim().length();
        i1 = 0;
        str = this.fP.toString().trim();
        for (i = a5.fq.stringWidth(str); (i + 4 > k) && (i1 <= n - 1); i = a5.fq.stringWidth(str))
        {
          i1++;
          str = this.fP.toString().substring(i1).trim();
        }
        if ((a5.es.g9 == 1638401) || (a5.es.g9 == 1703941))
          b5.a(paramGraphics, this.fP.toString().trim(), m, this.j + 2, k - 4, 0, 3);
        else
          paramGraphics.drawString(str, m, this.j + 2, 20);
      }
    }
    if (q())
    {
      if (((a5.es.g9 != 1703937) && (a5.es.g9 != 1703938) && (a5.es.g9 != 1703952)) || ((this != (ba)a5.es.cf().elementAt(13)) || (a5.es.g9 == 1703940) || (a5.es.g9 == 1703941)))
      {
        b5.jdMethod_int(paramGraphics, j, this.j, k, this.jdField_int);
        return;
      }
      if (++this.ga > 5)
        this.ga = 0;
      if (this.ga < 3)
      {
        this.fQ = (this.k + 4 + i);
        if ((this.fZ != null) && (!this.fZ.equals("")))
          this.fQ += this.fZ.length() * a5.iA + 2;
        if (this.f2)
        {
          if (this.f9 == 1)
          {
            paramGraphics.setColor(bm.F);
            paramGraphics.drawLine(this.fQ, this.j + 1, this.fQ, this.j + 12);
            return;
          }
          paramGraphics.setColor(bm.F);
          paramGraphics.drawLine(this.fQ, this.j + 2, this.fQ, this.j + a5.iG);
        }
      }
    }
  }

  public final short b9()
  {
    return this.f7;
  }

  public final byte b2()
  {
    return this.f9;
  }

  public final StringBuffer cc()
  {
    return this.fP;
  }

  public final void a(StringBuffer paramStringBuffer)
  {
    this.fP = paramStringBuffer;
    if (this.f9 == 2)
    {
      this.f6 = new StringBuffer();
      StringBuffer localStringBuffer = 0;
      paramStringBuffer = paramStringBuffer.length();
      while (localStringBuffer < paramStringBuffer)
      {
        this.f6.append('*');
        localStringBuffer++;
      }
    }
  }

  public final String b8()
  {
    return this.fZ;
  }

  public final void b(String paramString)
  {
    this.fZ = paramString;
  }

  public final void a(boolean paramBoolean, be parambe)
  {
    super.a(paramBoolean, parambe);
    this.ga = 0;
    this.f8 = 0;
    this.f1 = 0;
  }

  private void l(int paramInt)
  {
    for (int i = 0; i < 10; i++)
    {
      if (1 << i != paramInt)
        continue;
      if ((this.f9 == 0) || (this.f9 == 2))
      {
        if ((this.f8 != paramInt) || (System.currentTimeMillis() - this.gb > this.f4))
        {
          this.f1 = 0;
          if (this.fP.length() < this.f7)
          {
            jdMethod_if(f5[i].charAt(this.f1));
            this.f8 = paramInt;
          }
          else
          {
            this.f8 = 0;
          }
        }
        else
        {
          if (this.fP.length() > 0)
            this.fP.deleteCharAt(this.fP.length() - 1);
          if (++this.f1 >= f5[i].length())
            this.f1 = 0;
          jdMethod_if(f5[i].charAt(this.f1));
        }
        this.gb = System.currentTimeMillis();
        return;
      }
      jdMethod_if(fY.charAt(i));
      return;
    }
  }

  private void jdMethod_if(char paramChar)
  {
    if (this.fP.length() < this.f7)
    {
      if ((this.f9 == 1) && (this.fP.length() == 1) && (this.fP.toString().equals("0")))
        this.fP.deleteCharAt(0);
      this.fP.append(paramChar);
      if (this.f9 == 2)
      {
        this.f6.delete(0, this.f6.length());
        int i = this.fP.length();
        for (int j = 0; j < i - 1; j++)
          this.f6.append('*');
        if (i > 0)
          this.f6.append(this.fP.charAt(this.fP.length() - 1));
        this.fS = 10;
        return;
      }
      if (this.f9 == 1)
      {
        long l = Long.parseLong(this.fP.toString());
        if (this.fR >= 0L)
          try
          {
            if ((l = Long.parseLong(this.fP.toString())) > this.fR)
              jdMethod_void(Long.toString(this.fR));
            else
              jdMethod_void(Long.toString(l));
          }
          catch (Exception localException)
          {
          }
        if (l < 0L)
          jdMethod_void(0L + "");
      }
    }
  }

  private void b6()
  {
    if (this.fP.length() > 0)
    {
      this.fP.deleteCharAt(this.fP.length() - 1);
      if (this.f9 == 2)
        this.f6.deleteCharAt(this.f6.length() - 1);
      else if ((this.f9 == 1) && ((this.fP.length() == 0) || (b3() < 0L)))
        jdMethod_void(0L + "");
    }
    this.ga = 0;
    this.f8 = 0;
    this.f1 = 0;
  }

  public final int b3()
  {
    try
    {
      if (this.fP.toString().trim().equals(""))
        return 0;
      return this = Integer.parseInt(this.fP.toString());
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public final void jdMethod_void(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      this = this;
      this.fP.delete(0, this.fP.length());
      if (this.f9 == 2)
        this.f6.delete(0, this.f6.length());
      return;
    }
    if (this.f9 == 1)
    {
      int i = 0;
      int j = paramString.length();
      while (i < j)
      {
        if (!Character.isDigit(paramString.charAt(i)))
          return;
        i++;
      }
    }
    this.fP.delete(0, this.fP.length());
    this.fP.append(paramString);
  }

  public final void f()
  {
    if (((a5.es.g9 == 1376260) || (a5.es.g9 == 1376265) || (a5.es.g9 == 1376268) || (a5.es.g9 == 1376267) || (a5.es.g9 == 1376261)) && (a7.ej))
      return;
    int i = 0;
    int k = a5.eT.length;
    Object localObject11;
    Object localObject7;
    while (i < k)
    {
      if ((this.f2) && (a5.jdMethod_else() != 18))
        if (a5.jdMethod_byte(a5.eT[i]))
        {
          Object localObject3;
          if ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952) || (a5.es.g9 == 1703938))
          {
            if ((this.f9 == 1) && (q()))
            {
              if (a5.es.g9 == 1703937)
              {
                if (q.void <= 0)
                {
                  as.a(0, "金钱不足！", "确定", "", -1, -2);
                  return;
                }
                if (q.void - q.e <= 10)
                {
                  as.a(0, "您所剩下的金钱不足以支付邮费了！", "确定", "", -1, -2);
                  return;
                }
              }
              else if (((a5.es.g9 == 1703938) || (a5.es.g9 == 2424843)) && (q()))
              {
                localObject11 = this;
                if (this.fP.toString().trim().length() == 8)
                {
                  a(new StringBuffer("99999999"));
                  return;
                }
              }
              l(a5.eT[i]);
              if ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952))
                if (!(localObject11 = localObject3 = (a9)a5.es.cf().elementAt(13)).fP.toString().trim().equals("0"))
                {
                  q.q = true;
                  q.jdMethod_if();
                }
            }
          }
          else
          {
            if (a5.es.g9 == 2097155)
            {
              if (Integer.parseInt((localObject3 = (ah)a5.es.cf().elementAt(37)).aj()) <= 0)
              {
                as.a(0, "您的代币不足", "确定", "", -1, -2);
                return;
              }
              by.a(2);
            }
            else if (a5.es.g9 == 1900547)
            {
              if (q())
              {
                localObject11 = this;
                if (this.fP.toString().trim().length() == 8)
                {
                  a(new StringBuffer("99999999"));
                  return;
                }
              }
            }
            else if (a5.es.g9 == 2424836)
            {
              localObject11 = this;
              int m;
              if ((m = Integer.parseInt(this.fP.toString().trim())) >= 9)
              {
                a(new StringBuffer("9"));
                return;
              }
            }
            l(a5.eT[i]);
            Object localObject4;
            if (a5.es.g9 == 1376260)
            {
              (localObject4 = (ao)a5.es.cf().elementAt(1)).a("修改", 0);
            }
            else if (a5.es.g9 == 2097155)
            {
              localObject4 = (ah)a5.es.cf().elementAt(37);
              localObject11 = this;
              if (Integer.parseInt(this.fP.toString().trim()) > Integer.parseInt(((ah)localObject4).aj()))
                a(new StringBuffer(((ah)localObject4).aj()));
              by.a(1);
            }
            else
            {
              Object localObject8;
              if (a5.jdMethod_else() == 11)
              {
                localObject4 = (a9)a5.es.cf().elementAt(4);
                localObject7 = (a9)a5.es.cf().elementAt(5);
                localObject8 = (ao)a5.es.cf().elementAt(1);
                if (((localObject11 = localObject4).fP.toString().trim() != null) && (!(localObject11 = localObject4).fP.toString().trim().equals("")) && ((localObject11 = localObject7).fP.toString().trim() != null) && (!(localObject11 = localObject7).fP.toString().trim().equals("")))
                  ((ao)localObject8).a("登录", 0);
              }
              else if (a5.es.g9 == 2297358)
              {
                localObject4 = (a9)a5.es.cf().elementAt(4);
                localObject7 = (ao)a5.es.cf().elementAt(1);
                if (((localObject11 = localObject4).fP.toString().trim() != null) && (!(localObject11 = localObject4).fP.toString().trim().equals("")))
                  ((ao)localObject7).a("确定", 0);
              }
              else if (a5.jdMethod_else() == 19)
              {
                localObject4 = (a9)a5.es.cf().elementAt(9);
                localObject7 = (ao)a5.es.cf().elementAt(1);
                if (((localObject11 = localObject4).fP.toString().trim() != null) && (!(localObject11 = localObject4).fP.toString().trim().equals("")))
                  ((ao)localObject7).a("确定", 0);
              }
              else if (a5.jdMethod_else() == 14)
              {
                localObject4 = (a9)a5.es.cf().elementAt(9);
                localObject7 = (a9)a5.es.cf().elementAt(10);
                localObject8 = (ao)a5.es.cf().elementAt(1);
                if (((localObject11 = localObject4).fP.toString().trim() != null) && (!(localObject11 = localObject4).fP.toString().trim().equals("")) && ((localObject11 = localObject7).fP.toString().trim() != null) && (!(localObject11 = localObject7).fP.toString().trim().equals("")))
                  ((ao)localObject8).a("确定", 0);
              }
              else
              {
                Object localObject10;
                if (a5.jdMethod_else() == 15)
                {
                  localObject4 = (a9)a5.es.cf().elementAt(10);
                  localObject7 = (a9)a5.es.cf().elementAt(11);
                  localObject8 = (a9)a5.es.cf().elementAt(12);
                  localObject10 = (a9)a5.es.cf().elementAt(13);
                  ao localao = (ao)a5.es.cf().elementAt(1);
                  if (((localObject11 = localObject4).fP.toString().trim() != null) && (!(localObject11 = localObject4).fP.toString().trim().equals("")) && ((localObject11 = localObject7).fP.toString().trim() != null) && (!(localObject11 = localObject7).fP.toString().trim().equals("")) && ((localObject11 = localObject10).fP.toString().trim() != null) && (!(localObject11 = localObject10).fP.toString().trim().equals("")) && ((localObject11 = localObject8).fP.toString().trim() != null) && (!(localObject11 = localObject8).fP.toString().trim().equals("")))
                    localao.a("确定", 0);
                }
                else if (a5.es.g9 == 2424836)
                {
                  localObject11 = this;
                  int n;
                  if ((n = Integer.parseInt(this.fP.toString().trim())) >= 9)
                  {
                    a(new StringBuffer("9"));
                    return;
                  }
                }
                else
                {
                  Object localObject5;
                  if (a5.es.g9 == -1610612638)
                  {
                    localObject5 = (a9)a5.es.cf().elementAt(10);
                    localObject7 = (a9)a5.es.cf().elementAt(11);
                    localObject8 = (a9)a5.es.cf().elementAt(12);
                    localObject10 = (ao)a5.es.cf().elementAt(1);
                    if (((localObject11 = localObject5).fP.toString().trim() != null) && (!(localObject11 = localObject5).fP.toString().trim().equals("")) && ((localObject11 = localObject7).fP.toString().trim() != null) && (!(localObject11 = localObject7).fP.toString().trim().equals("")) && ((localObject11 = localObject7).fP.toString().trim() != null) && (!(localObject11 = localObject7).fP.toString().trim().equals("")) && ((localObject11 = localObject8).fP.toString().trim() != null) && (!(localObject11 = localObject8).fP.toString().trim().equals("")))
                      ((ao)localObject10).a("确定", 0);
                  }
                  else if (a5.es.g9 == 1638427)
                  {
                    localObject11 = this;
                    localObject5 = this.fP.toString();
                    int i2 = (localObject7 = (ah)a5.es.cf().elementAt(4)).ag();
                    if ((localObject5 == null) || (((String)localObject5).equals("")))
                      localObject5 = "0";
                    localObject11 = this;
                    int i3;
                    if ((i3 = Integer.parseInt(this.fP.toString().trim())) > i2)
                      a(new StringBuffer(String.valueOf(i2)));
                    else
                      a(new StringBuffer((String)localObject5));
                  }
                }
              }
            }
          }
        }
        else if ((a5.jdMethod_byte(1024)) || (a5.jdMethod_byte(1048576)))
        {
          if (a5.es.g9 == 2097155)
            by.a(2);
          b6();
          if (a5.es.g9 == 2097155)
            by.a(1);
          a5.D();
        }
      i++;
    }
    Object localObject2;
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
        if ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952) || (a5.es.g9 == 1703938))
        {
          a9 locala9 = (a9)a5.es.cf().elementAt(3);
          localObject2 = (a9)a5.es.cf().elementAt(4);
          if ((locala9.q()) && ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703938)));
          int i1;
          switch (i1 = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case -1610612709:
            q.jdMethod_do();
            break;
          case -1610612711:
            q.jdMethod_for();
            break;
          default:
            q.t = 1;
            a5.eQ.a(i1);
            break;
            if ((locala9.q()) && (a5.es.g9 == 1703952));
            switch (i1 = ((Integer)y().db().elementAt(y().de())).intValue())
            {
            case -1610612709:
              q.jdMethod_do();
              break;
            case -1610612711:
              q.jdMethod_for();
            default:
              break;
              if (((ba)localObject2).q())
              {
                switch (i1 = ((Integer)y().db().elementAt(y().de())).intValue())
                {
                case -1610612709:
                  q.jdMethod_do();
                  break;
                case -1610612711:
                  q.jdMethod_for();
                default:
                  break;
                }
              }
              else
              {
                if ((this.f9 != 1) || (!q()))
                  break;
                switch (i1 = ((Integer)y().db().elementAt(y().de())).intValue())
                {
                case -1610612709:
                  q.jdMethod_do();
                  break;
                case -1610612711:
                  q.jdMethod_for();
                }
              }
            }
          }
          this.jdField_byte = false;
          return;
        }
        int j;
        if ((a5.es.g9 == 1703940) || (a5.es.g9 == 1703941))
        {
          if ((j = ((Integer)y().db().elementAt(y().de())).intValue()) == 1703952)
          {
            q.l = true;
            a5.eQ.a(j);
            this.jdField_byte = false;
          }
          else
          {
            if (j != -1)
            {
              a5.eQ.a(j);
              this.jdField_byte = false;
            }
            return;
          }
        }
        else
        {
          switch (a5.es.g9)
          {
          case 1638401:
            bt.jdMethod_for(j = ((Integer)y().db().elementAt(y().de())).intValue());
            break;
          case 1835009:
            i.a(j = ((Integer)y().db().elementAt(y().de())).intValue());
            break;
          case 1900547:
            if (bw.a == 1)
            {
              switch (j = ((Integer)y().db().elementAt(y().de())).intValue())
              {
              case -1610612713:
                bw.jdMethod_do();
                break;
              case -1610612714:
                bw.jdMethod_if(1);
              }
              this.jdField_byte = false;
            }
          }
          return;
        }
      }
      else if (a5.jdMethod_byte(262144))
      {
        this.jdField_byte = false;
        return;
      }
    }
    else if ((a5.jdMethod_byte(65536)) || (a5.jdMethod_byte(131072)))
    {
      Object localObject1;
      Object localObject6;
      Object localObject9;
      if ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952) || (a5.es.g9 == 1703938))
      {
        localObject1 = (a9)a5.es.cf().elementAt(3);
        localObject2 = (a9)a5.es.cf().elementAt(4);
        if ((((ba)localObject1).q()) && ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703938)))
        {
          localObject6 = new br(0);
          localObject7 = new int[] { 1703945, -1610612709, -1610612711 };
          localObject9 = new int[] { 2, 3, 3 };
          ((br)localObject6).a(bm.cj, localObject7, localObject9);
          a((br)localObject6);
          y().da();
          this.jdField_byte = true;
        }
        else if ((((ba)localObject1).q()) && (a5.es.g9 == 1703952))
        {
          localObject6 = new br(0);
          localObject7 = new int[] { -1610612709, -1610612711 };
          localObject9 = new int[] { 3, 3 };
          ((br)localObject6).a(bm.cb, localObject7, localObject9);
          a((br)localObject6);
          y().da();
          this.jdField_byte = true;
        }
        else if (((ba)localObject2).q())
        {
          localObject6 = new br(0);
          localObject7 = new int[] { -1610612709, -1610612711 };
          localObject9 = new int[] { 3, 3 };
          ((br)localObject6).a(bm.cb, localObject7, localObject9);
          a((br)localObject6);
          y().da();
          this.jdField_byte = true;
        }
        else
        {
          if ((this.f9 == 1) && (q()))
          {
            localObject6 = new br(0);
            localObject7 = new int[] { -1610612709, -1610612711 };
            localObject9 = new int[] { 3, 3 };
            ((br)localObject6).a(bm.cb, localObject7, localObject9);
            a((br)localObject6);
            y().da();
            this.jdField_byte = true;
          }
          return;
        }
      }
      else if ((a5.es.g9 == 1703940) || (a5.es.g9 == 1703941))
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
        switch (a5.es.g9)
        {
        case 1638427:
          bt.b = (localObject1 = (a9)a5.es.cf().elementAt(6)).b3();
          a5.eQ.a(1638429);
          return;
        case 1638401:
          a(bt.jdMethod_for());
          this.jdField_byte = true;
          return;
        case 1835009:
          a(i.a());
          this.jdField_byte = true;
          return;
        case 1900547:
          if (bw.a != 1)
            break;
          localObject1 = new br(0);
          localObject2 = new int[] { -1610612713, -1610612714 };
          localObject6 = new int[] { 3, 3 };
          ((br)localObject1).a(bm.at, localObject2, localObject6);
          a((br)localObject1);
          y().da();
          this.jdField_byte = true;
          return;
        case 1376260:
          localObject11 = this;
          b5.a("请输入金钱", "请输入金额", 8, this.fP.toString().trim(), 27, 6);
          return;
        case 2424836:
          localObject11 = this;
          bo.e = Integer.parseInt(this.fP.toString());
          if ((this.f9 != 1) || (!q()))
            break;
          if (bo.e == 0)
          {
            as.a(0, "请输入要发送短信的条数", "确定", "", -1, -2);
            return;
          }
          as.a(0, "您确实要消费" + (bo.e << 1) + "元购买" + bo.e * 20 + "猛犸币吗？", "确定", "取消", -23, -1);
          return;
        case 2424843:
          localObject11 = this;
          if (this.fP.toString().trim().equals("0"))
          {
            as.a(0, "请输入兑换的金额", "确定", "", -1, -2);
            return;
          }
          localObject11 = this;
          bo.w = Integer.parseInt(this.fP.toString().trim());
          a5.eQ.a(2424996);
          return;
        case 1703959:
          localObject1 = (a9)a5.es.cf().elementAt(4);
          localObject2 = (a9)a5.es.cf().elementAt(6);
          if (((localObject11 = localObject1).fP.toString().trim() == null) || ((localObject11 = localObject1).fP.toString().trim().equals("")) || ((localObject11 = localObject2).fP.toString().trim() == null) || ((localObject11 = localObject2).fP.toString().trim().equals("")))
          {
            b5.jdMethod_if(4, 6);
            return;
          }
          if (((localObject11 = localObject1).fP.length() < 6) || ((localObject11 = localObject1).fP.length() > 16) || ((localObject11 = localObject2).fP.length() < 6) || ((localObject11 = localObject2).fP.length() > 16))
          {
            a5.a(0, "请您正确输入用户名及密码", "确定", "", -1, -120);
            return;
          }
          localObject6 = a5.hC[0];
          localObject7 = a5.hC[1];
          Object tmp3851_3850 = localObject1;
          localObject11 = tmp3851_3850;
          a5.hC[0] = tmp3851_3850.fP.toString().trim();
          Object tmp3869_3868 = localObject2;
          localObject11 = tmp3869_3868;
          a5.hC[1] = tmp3869_3868.fP.toString().trim();
          bo.C = 2;
          localObject9 = null;
          localObject9 = new bk(bk.q, bk.jdMethod_do(1), a5.dU ? 0 : 1, 0);
          bk.b = true;
          ((bk)localObject9).a(4);
          a5.a(0, "请稍候...", "", "", -120, -120);
          a5.hC[0] = localObject6;
          a5.hC[1] = localObject7;
          return;
        case 1703960:
          localObject1 = (a9)a5.es.cf().elementAt(4);
          localObject2 = (a9)a5.es.cf().elementAt(6);
          if (((localObject11 = localObject1).fP.toString().trim() == null) || ((localObject11 = localObject1).fP.toString().trim().equals("")) || ((localObject11 = localObject2).fP.toString().trim() == null) || ((localObject11 = localObject2).fP.toString().trim().equals("")))
          {
            b5.jdMethod_if(4, 6);
            return;
          }
          if (((localObject11 = localObject1).fP.length() < 6) || ((localObject11 = localObject1).fP.length() > 16) || ((localObject11 = localObject2).fP.length() < 6) || ((localObject11 = localObject2).fP.length() > 16))
          {
            a5.a(0, "请您正确输入用户名及密码", "确定", "", -1, -120);
            return;
          }
          localObject6 = a5.hC[0];
          localObject7 = a5.hC[1];
          Object tmp4157_4156 = localObject1;
          localObject11 = tmp4157_4156;
          a5.hC[0] = tmp4157_4156.fP.toString().trim();
          Object tmp4175_4174 = localObject2;
          localObject11 = tmp4175_4174;
          a5.hC[1] = tmp4175_4174.fP.toString().trim();
          bo.C = 3;
          localObject9 = null;
          localObject9 = new bk(bk.q, bk.jdMethod_do(1), a5.dU ? 0 : 1, 0);
          bk.b = true;
          ((bk)localObject9).a(4);
          a5.a(0, "请稍候...", "", "", -120, -120);
          a5.hC[0] = localObject6;
          a5.hC[1] = localObject7;
          return;
        case 1703961:
          if (((localObject11 = localObject1 = (a9)a5.es.cf().elementAt(4)).fP.toString().trim() == null) || ((localObject11 = localObject1).fP.toString().trim().equals("")))
          {
            b5.a("请输入用户名", "请输入您的用户名", 16, (localObject11 = localObject1).fP.toString().trim(), 4, 1);
            return;
          }
          if (((localObject11 = localObject1).fP.length() < 6) || ((localObject11 = localObject1).fP.length() > 16))
          {
            a5.a(0, "请您正确输入用户名", "确定", "", -1, -120);
            return;
          }
          localObject2 = a5.hC[0];
          Object tmp4392_4391 = localObject1;
          localObject11 = tmp4392_4391;
          a5.hC[0] = tmp4392_4391.fP.toString().trim();
          a5.a(0, "请稍候...", "", "", -120, -120);
          bo.jdMethod_do(4);
          a5.hC[0] = localObject2;
          return;
        case -1610612697:
          localObject11 = this;
          if (Integer.parseInt(this.fP.toString().trim()) == 0)
          {
            a5.a(0, "请您输入金额", "确定", "", -1, -120);
            return;
          }
          a5.eQ.a(2425009);
          return;
        case 1638445:
          localObject11 = this;
          if (this.fP.toString().trim() != null)
          {
            localObject11 = this;
            if (!this.fP.toString().trim().equals(""))
            {
              localObject11 = this;
              bt.if = this.fP.toString().trim();
              a5.eQ.a(1638446);
              return;
            }
          }
          localObject11 = this;
          if (this.fP.toString().trim() != null)
          {
            localObject11 = this;
            if (!this.fP.toString().trim().equals(""))
              break;
          }
          else
          {
            localObject11 = this;
            b5.a("氏族改名", "请您输入名称", 6, this.fP.toString().trim(), 6, 3);
          }
        }
      }
    }
  }

  public final byte jdMethod_if(byte paramByte)
  {
    ao localao;
    if ((paramByte == 2) && (a5.es.g9 != 2097155) && (a5.jdMethod_else() != 18))
    {
      if (((a5.es.g9 == 1376260) || (a5.es.g9 == 1376265) || (a5.es.g9 == 1376268) || (a5.es.g9 == 1376267) || (a5.es.g9 == 1376261)) && (a7.ej))
        return -1;
      if (this.f2)
      {
        b6();
        if (((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952)) && (b3() == 0))
        {
          q.q = false;
          q.jdMethod_if();
        }
        else if ((a5.jdMethod_else() == 11) || (a5.jdMethod_else() == 14) || (a5.jdMethod_else() == 15) || (a5.jdMethod_else() == 21) || (a5.jdMethod_else() == 22) || (a5.jdMethod_else() == 23) || (a5.jdMethod_else() == 18) || (a5.jdMethod_else() == 19) || (a5.es.g9 == 2297615) || (a5.es.g9 == -1610612638))
        {
          localao = (ao)a5.es.cf().elementAt(1);
          if (this.fP.length() == 0)
            localao.a("输入", 0);
        }
      }
      return -1;
    }
    if (a5.es.g9 == 2097155)
      (localao = (ao)a5.es.cf().elementAt(1)).a("", 0);
    return super.jdMethod_if(paramByte);
  }

  public final boolean b()
  {
    int i = 0;
    int k;
    if ((a5.gZ) && (a5.a(this.k, this.j, this.a, this.jdField_int)))
    {
      int j;
      switch (a5.jdMethod_else())
      {
      case 11:
        b5.jdMethod_for(4, 5);
        i = 1;
        break;
      case 14:
        b5();
        i = 1;
        break;
      case 21:
      case 22:
        b5.jdMethod_for(4, 6);
        i = 1;
        break;
      case 23:
        a9 locala91 = this;
        b5.a("请输入用户名", "请输入您的用户名", 16, this.fP.toString().trim(), 4, 1);
        j = 1;
        break;
      case 15:
        a5.fc[0] = null;
        a5.fc[1] = null;
        a5.fc[2] = null;
        a5.fc[3] = null;
        b5.jdMethod_if();
        j = 1;
      case 12:
      case 13:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      }
      switch (a5.es.g9)
      {
      case 1900547:
        b5.jdMethod_new();
        j = 1;
        break;
      case 2424836:
        b5.jdMethod_try();
        j = 1;
        break;
      case 1703937:
      case 1703938:
        a9 locala93;
        if (((locala93 = (a9)a5.es.cf().elementAt(13)).v() != this.k) || (locala93.jdMethod_long() != this.j))
          break;
        b5.jdMethod_case();
        j = 1;
        break;
      case 1703959:
      case 1703960:
        b5.jdMethod_if(4, 6);
        j = 1;
        break;
      case 1703961:
        a9 locala92 = this;
        b5.a("请输入用户名", "请输入您的用户名", 16, this.fP.toString().trim(), 4, 1);
        k = 1;
        break;
      case -2145124351:
        b5.jdMethod_case("兑换触摸还没做呢！！！！！！兑换触摸还没做呢！！");
        break;
      case -1610612638:
        b5();
        k = 1;
        break;
      case 1638427:
        b5.a(new int[] { 6 });
        k = 1;
        break;
      case 2621443:
      case 2621445:
        b5.a(4, 6, "请输入充值卡卡号和密码", "请输入充值卡卡号", "请输入充值卡密码");
        k = 1;
        break;
      case 2621447:
        b5.a(5, 7, "请输入", "您要充值的通行证", "确认您的通行证");
        k = 1;
      }
    }
    return k;
  }

  private static void b5()
  {
    a5.fr = null;
    a5.hC[0] = null;
    a5.hC[1] = null;
    a9 locala9 = (a9)a5.es.cf().elementAt(9);
    locala9 = locala9;
    a5.hC[0] = locala9.fP.toString().trim();
    locala9 = (a9)a5.es.cf().elementAt(10);
    locala9 = locala9;
    a5.hC[1] = locala9.fP.toString().trim();
    b5.a();
  }

  static
  {
    { "任意", "数字", "密码" }[3] = "字母";
    f5 = new String[] { "0", "1,.+_)(*&^%$#@", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9" };
    fY = "0123456789";
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     a9
 * JD-Core Version:    0.6.0
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ay extends ba
{
  public String d7;
  public Vector d9;
  public boolean[] ef;
  private byte eb;
  private byte ee;
  public boolean[] d1;
  private boolean d5 = true;
  private byte d2;
  public static byte[] d4 = new byte[5];
  public boolean eg = false;
  public boolean ec = false;

  public final boolean bl()
  {
    return this.d5;
  }

  public final void e(boolean paramBoolean)
  {
    this.d5 = paramBoolean;
  }

  public final byte bj()
  {
    return this.ee;
  }

  public final void jdMethod_char(byte paramByte)
  {
    this.ee = paramByte;
  }

  private ay(short paramShort1, short paramShort2, short paramShort3, short paramShort4, byte paramByte, String paramString, be parambe)
  {
    super(paramShort1, paramShort2, 0, 0, parambe);
    this.y = paramByte;
    this.d7 = paramString;
    this.d9 = new Vector();
    this.a = bg();
    this.jdField_int = bb();
    this.b = true;
    this.eb = (this.ee = 0);
  }

  public ay(short paramShort1, short paramShort2, byte paramByte, String paramString, be parambe)
  {
    this(paramShort1, paramShort2, 0, 0, paramByte, paramString, parambe);
  }

  public final void a(Graphics paramGraphics)
  {
    if ((this.d7 != null) && (!this.d7.equals("")))
    {
      if (q())
        paramGraphics.setColor(bm.try);
      else
        paramGraphics.setColor(bm.bP);
      if (this.y == 2)
        paramGraphics.setColor(bm.bP);
      paramGraphics.drawString(this.d7, this.k, this.j, 20);
    }
    int i = this.k;
    if ((this.d7 != null) && (!this.d7.equals("")))
      i += this.d7.length() * a5.iA + 8;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    if ((this.y == 0) && (!this.d9.isEmpty()))
    {
      if (this.d5)
      {
        j = this.j + (this.jdField_int - 8) / 2;
        for (k = 0; k < this.d9.size(); k++)
        {
          if ((k == this.ee) && (this.ef[k] != 0))
          {
            paramGraphics.setColor(bm.else);
            paramGraphics.drawRect(i + e(k), j, 7, 7);
            paramGraphics.setColor(bm.v);
            paramGraphics.drawRect(i + e(k) + 1, j + 1, 5, 5);
            paramGraphics.setColor(bm.else);
            paramGraphics.fillRect(i + e(k) + 2, j + 2, 4, 4);
          }
          else if (this.ef[k] != 0)
          {
            paramGraphics.setColor(bm.v);
            paramGraphics.drawRect(i + e(k), j, 7, 7);
            paramGraphics.setColor(bm.v);
            paramGraphics.fillRect(i + e(k) + 1, j + 1, 6, 6);
          }
          else
          {
            paramGraphics.setColor(bm.else);
            paramGraphics.drawRect(i + e(k), j, 7, 7);
            paramGraphics.setColor(bm.aV);
            paramGraphics.fillRect(i + e(k) + 1, j + 1, 6, 6);
            paramGraphics.setColor(bm.else);
            paramGraphics.drawLine(i + e(k), j, i + e(k) + 8 - 1, j + 8 - 1);
            paramGraphics.drawLine(i + e(k) + 8 - 1, j, i + e(k), j + 8 - 1);
          }
          if ((k == this.eb) && (q()))
          {
            paramGraphics.setColor(bm.cP);
            m = i + 8 + 4 + e(k) - 1;
            n = this.j - 1;
            i1 = ((String)this.d9.elementAt(k)).length() * a5.iA + 2;
            i2 = a5.iG + 2;
            paramGraphics.fillRect(m, n, i1, i2);
            paramGraphics.setColor(bm.v);
          }
          else
          {
            paramGraphics.setColor(bm.bP);
          }
          paramGraphics.drawString((String)this.d9.elementAt(k), i + 8 + 4 + e(k), this.j, 20);
        }
        return;
      }
      j = this.j + (a5.iG - 8) / 2;
      for (k = 0; k < this.d9.size(); k++)
      {
        if ((k == this.ee) && (this.ef[k] != 0))
        {
          paramGraphics.setColor(bm.else);
          paramGraphics.drawRect(i, j + d(k), 7, 7);
          paramGraphics.setColor(bm.v);
          paramGraphics.drawRect(i + 1, j + d(k) + 1, 5, 5);
          paramGraphics.setColor(bm.else);
          paramGraphics.fillRect(i + 2, j + d(k) + 2, 4, 4);
        }
        else if (this.ef[k] != 0)
        {
          paramGraphics.setColor(bm.else);
          paramGraphics.drawRect(i, j + d(k), 7, 7);
          paramGraphics.setColor(bm.v);
          paramGraphics.fillRect(i + 1, j + d(k) + 1, 6, 6);
        }
        else
        {
          paramGraphics.setColor(bm.else);
          paramGraphics.drawRect(i, j + d(k), 7, 7);
          paramGraphics.setColor(bm.aV);
          paramGraphics.fillRect(i + 1, j + d(k) + 1, 6, 6);
          paramGraphics.setColor(bm.else);
          paramGraphics.drawLine(i, j + d(k), i + 8 - 1, j + d(k) + 8 - 1);
          paramGraphics.drawLine(i + 8 - 1, j + d(k), i, j + d(k) + 8 - 1);
        }
        if (k == this.eb)
        {
          paramGraphics.setColor(bm.cP);
          m = i + 8 + 4 - 1;
          n = this.j + f(k) - 1;
          i1 = ((String)this.d9.elementAt(k)).length() * a5.iA + 2;
          i2 = a5.iG + 2;
          paramGraphics.fillRect(m, n, i1, i2);
          paramGraphics.setColor(bm.v);
        }
        else
        {
          paramGraphics.setColor(bm.bP);
        }
        paramGraphics.drawString((String)this.d9.elementAt(k), i + 8 + 4, this.j + f(k), 20);
      }
      return;
    }
    if ((this.y == 1) && (!this.d9.isEmpty()))
    {
      if (q())
      {
        this.a = bg();
        paramGraphics.setColor(bm.bP);
        paramGraphics.fillRect(this.k - 2, this.j - 1, this.a + 3, a5.iG + 1);
      }
      if ((this.d7 != null) && (!this.d7.equals("")))
      {
        if (q())
          paramGraphics.setColor(bm.try);
        else
          paramGraphics.setColor(bm.bP);
        paramGraphics.drawString(this.d7, this.k, this.j, 20);
      }
      paramGraphics.drawImage(a5.eb, i, this.j, 20);
      if (q())
        paramGraphics.setColor(bm.try);
      else
        paramGraphics.setColor(bm.bP);
      paramGraphics.drawString((String)this.d9.elementAt(this.eb), i + a5.eb.getWidth() + 4, this.j, 20);
      b5.a(paramGraphics, a5.eb, i + a5.eb.getWidth() + 8 + b5.jdMethod_do((String)this.d9.elementAt(this.eb)), this.j, 2);
      return;
    }
    if ((this.y == 2) && (!this.d9.isEmpty()))
    {
      j = this.j + (a5.iG - 8) / 2;
      for (k = 0; k < this.d9.size(); k++)
      {
        if (this.d1[k] != 0)
        {
          paramGraphics.setColor(bm.else);
          paramGraphics.drawRect(i, j + d(k), 7, 7);
          paramGraphics.setColor(bm.v);
          paramGraphics.drawRect(i + 1, j + d(k) + 1, 5, 5);
          paramGraphics.setColor(bm.else);
          paramGraphics.fillRect(i + 2, j + d(k) + 2, 4, 4);
        }
        else
        {
          paramGraphics.setColor(bm.else);
          paramGraphics.drawRect(i, j + d(k), 7, 7);
          paramGraphics.setColor(bm.v);
          paramGraphics.fillRect(i + 1, j + d(k) + 1, 6, 6);
        }
        if (k == this.eb)
        {
          paramGraphics.setColor(bm.cP);
          m = i + 8 + 4 - 1;
          n = this.j + f(k) - 1;
          i1 = ((String)this.d9.elementAt(k)).length() * a5.iA + 2;
          i2 = a5.iG + 2;
          paramGraphics.fillRect(m, n, i1, i2);
          paramGraphics.setColor(bm.v);
        }
        else
        {
          paramGraphics.setColor(bm.bP);
        }
        paramGraphics.drawString((String)this.d9.elementAt(k), i + 8 + 4, this.j + f(k), 20);
      }
    }
  }

  public final short bb()
  {
    switch (this.y)
    {
    case 0:
    case 2:
      if (this.d5)
        return (short)a5.iG;
      return (short)((a5.iG + 2) * this.d9.size() - 2);
    case 1:
      return (short)a5.eb.getHeight();
    }
    throw new IllegalArgumentException("类型不匹配");
  }

  public final void jdMethod_byte(String paramString)
  {
    this.d7 = paramString;
  }

  public final byte bm()
  {
    return this.eb;
  }

  public final void jdMethod_case(byte paramByte)
  {
    if ((paramByte < 0) || (paramByte >= this.d9.size()))
      throw new IllegalArgumentException("参数不符合");
    this.eb = paramByte;
  }

  public final String[] be()
  {
    String[] arrayOfString = new String[this.d9.size()];
    for (int i = 0; i < arrayOfString.length; i++)
      arrayOfString[i] = ((String)this.d9.elementAt(i));
    return arrayOfString;
  }

  public final void jdMethod_try(String paramString)
  {
    if (paramString != null)
    {
      this.d9.addElement(paramString);
      this.a = bg();
      this.jdField_int = bb();
    }
  }

  private short e(int paramInt)
  {
    int i = 0;
    for (int j = 0; j < paramInt; j++)
      i = (short)(i + (12 + ((String)this.d9.elementAt(j)).length() * a5.iA + 7));
    return i;
  }

  private static short d(int paramInt)
  {
    int i = 0;
    for (int j = 0; j < paramInt; j++)
      i = (short)(i + (10 + (a5.iG - 8)));
    return i;
  }

  private static short f(int paramInt)
  {
    int i = 0;
    for (int j = 0; j < paramInt; j++)
      i = (short)(i + (a5.iG + 2));
    return i;
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt > this.ef.length - 1))
      throw new IndexOutOfBoundsException("index下标越界");
    this.ef[paramInt] = paramBoolean;
  }

  public final short bg()
  {
    i = 0;
    j = a5.iA;
    if ((this.d7 != null) && (!this.d7.equals("")))
      i = (short)(0 + (j * this.d7.length() + 8));
    switch (this.y)
    {
    case 0:
    case 2:
      int k;
      if (this.d5)
      {
        k = 0;
        int m = this.d9.size();
        while (k < m)
        {
          i = (short)(i + (12 + j * ((String)this.d9.elementAt(k)).length()));
          if (k != m - 1)
            i = (short)(i + 7);
          k++;
        }
      }
      else
      {
        this = this;
        i = a5.iA;
        j = 0;
        k = 1;
        if (k < this.d9.size())
        {
          String str1 = (String)this.d9.elementAt(k);
          String str2 = (String)this.d9.elementAt(j);
          if (str1.length() > str2.length())
            j = k;
          k++;
          tmpTernaryOp = 12;
          while (true);
        }
      }
    case 1:
    }
  }

  public final void f()
  {
    Object localObject4;
    if (this.jdField_byte)
    {
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        int i;
        if ((this.y == 0) && (!this.d9.isEmpty()))
        {
          switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case 0:
            localObject4 = this;
            i = this.eb;
            localObject4 = this;
            this.ee = i;
          }
          this.jdField_byte = false;
        }
        else if (this.y == 2)
        {
          switch (a5.es.g9)
          {
          case -1610612632:
            int k;
            switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
            {
            case -1610612631:
              if (this.d1[this.eb] != 0)
                break;
              this.d1[this.eb] = true;
              break;
            case -1610612624:
              if (this.d1[this.eb] == 0)
                break;
              this.d1[this.eb] = false;
              break;
            case -1610612623:
              for (k = 0; k < u.long; k = (byte)(k + 1))
                this.d1[k] = true;
              break;
            case -1610612621:
              for (k = 0; k < u.long; k = (byte)(k + 1))
                this.d1[k] = false;
              break;
            case 2686980:
              for (k = 0; k < u.long; k = (byte)(k + 1))
                u.r[k] = this.d1[k];
              a5.eQ.a(2686980);
              as.a(0, "请您稍候，正在进行操作", "", "", -2, -2);
            }
          }
        }
        else if (this.y == 1)
        {
          switch (a5.es.g9)
          {
          case 1900547:
            if (bw.a != 1)
              break;
            switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
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
        this.jdField_byte = false;
        return;
      }
      if ((!a5.jdMethod_try(16384)) && (!a5.jdMethod_try(32768)))
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
        if (a5.jdMethod_byte(262144))
        {
          this.jdField_byte = false;
          return;
        }
      }
    }
    else
    {
      Object localObject2;
      Object localObject1;
      Object localObject3;
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        if (!this.d9.isEmpty())
          if (this.y == 0)
          {
            int j;
            switch (a5.es.g9)
            {
            case 720910:
              br localbr = new br(0);
              localObject2 = new String[] { "选择" };
              int[] arrayOfInt = { 0 };
              localObject4 = new int[] { 3 };
              localbr.a(localObject2, arrayOfInt, localObject4);
              a(localbr);
              this.jdField_byte = true;
              break;
            case 1703972:
              localObject4 = this;
              if (this.ee == 0)
              {
                q.b = 4;
              }
              else
              {
                localObject4 = this;
                if (this.ee == 1)
                {
                  q.b = 3;
                }
                else
                {
                  localObject4 = this;
                  if (this.ee == 2)
                  {
                    q.b = 2;
                  }
                  else
                  {
                    localObject4 = this;
                    if (this.ee == 3)
                    {
                      q.b = 1;
                    }
                    else
                    {
                      localObject4 = this;
                      if (this.ee == 4)
                        q.b = 5;
                    }
                  }
                }
              }
              a5.eQ.a(1703970);
              break;
            case 720920:
              localObject4 = this;
              j = this.eb;
              localObject4 = this;
              this.ee = j;
              localObject4 = this;
              bu.d = this.ee;
              a5.eQ.a(720921);
              break;
            case 3145730:
              for (j = 0; j < aa.try.length; j++)
              {
                if ((localObject2 = (a7)a5.es.cf().elementAt(j + 3)).bE() != null)
                  continue;
                this.d2 = (byte)(this.d2 + 1);
              }
              if (this.d2 == 8)
              {
                as.a(0, "请您先设置守护技能", "确定", "", -1, -2);
                this.d2 = 0;
                return;
              }
              localObject4 = this;
              aa.if = this.eb;
              this.d2 = 0;
              break;
            case 3145731:
              localObject2 = new ay[(localObject1 = new int[] { 6, 10, 12 }).length];
              for (int m = 0; m < localObject1.length; m++)
              {
                localObject2[m] = ((ay)a5.es.cf().elementAt(localObject1[m]));
                 tmp985_984 = localObject2[m];
                localObject4 = tmp985_984;
                aa.for[m] = tmp985_984.ee;
              }
              a5.eQ.a(3145740);
              be.ci();
            }
            if (this.d5)
            {
              this.ee = this.eb;
              return;
            }
          }
          else
          {
            if (this.y == 2)
            {
              switch (a5.es.g9)
              {
              case -1610612632:
                localObject1 = new br(0);
                localObject2 = new String[] { "选   择", "取   消", "全部选择", "全部取消", "继续包月" };
                localObject3 = new int[] { -1610612631, -1610612624, -1610612623, -1610612621, 2686980 };
                localObject4 = new int[] { 3, 3, 3, 3, 3 };
                ((br)localObject1).a(localObject2, localObject3, localObject4);
                a((br)localObject1);
                this.jdField_byte = true;
              }
              return;
            }
            if (this.y == 1)
            {
              switch (a5.es.g9)
              {
              case 1900547:
                if (bw.a != 1)
                  break;
                localObject1 = new br(0);
                localObject2 = new int[] { -1610612713, -1610612714 };
                localObject3 = new int[] { 3, 3 };
                ((br)localObject1).a(bm.at, localObject2, localObject3);
                a((br)localObject1);
                y().da();
                this.jdField_byte = true;
              }
              return;
            }
          }
      }
      else if (a5.jdMethod_try(16384))
      {
        if ((this.y == 1) && (!this.d9.isEmpty()))
        {
          if (q())
          {
            if (a5.jdMethod_else() == 18)
            {
              localObject1 = (ay)a5.es.cf().elementAt(5);
              localObject2 = (ay)a5.es.cf().elementAt(6);
              localObject3 = (ay)a5.es.cf().elementAt(7);
              localObject4 = (ay)a5.es.cf().elementAt(8);
              if (((ba)localObject1).q())
              {
                Object tmp1379_1378 = localObject1;
                tmp1379_1378.eb = (byte)(tmp1379_1378.eb - 1);
                d4[1] = 0;
                if (((ay)localObject1).eb < 0)
                {
                  ((ay)localObject1).eb = 0;
                  int tmp1411_1410 = 0;
                  byte[] tmp1411_1407 = d4;
                  tmp1411_1407[tmp1411_1410] = (byte)(tmp1411_1407[tmp1411_1410] + 1);
                }
                a5.ci = (byte)(((ay)localObject1).eb + 1);
                if ((((ay)localObject1).eb != 0) || (d4[0] != 0))
                  break label1849;
                ((ay)localObject2).eb = 0;
                ((ay)localObject4).eb = 0;
                a5.ck = (byte)(((ay)localObject2).eb + 1);
              }
              else
              {
                if (((ba)localObject2).q())
                {
                  Object tmp1474_1473 = localObject2;
                  tmp1474_1473.eb = (byte)(tmp1474_1473.eb - 1);
                  d4[3] = 0;
                  d4[4] = 0;
                  if (((ay)localObject1).eb == 0)
                  {
                    if (((ay)localObject2).eb < 0)
                    {
                      ((ay)localObject2).eb = 0;
                      int tmp1519_1518 = 2;
                      byte[] tmp1519_1515 = d4;
                      tmp1519_1515[tmp1519_1518] = (byte)(tmp1519_1515[tmp1519_1518] + 1);
                    }
                  }
                  else if ((((ay)localObject1).eb == 1) && (((ay)localObject2).eb < 2))
                  {
                    ((ay)localObject2).eb = 2;
                    int tmp1553_1552 = 2;
                    byte[] tmp1553_1549 = d4;
                    tmp1553_1549[tmp1553_1552] = (byte)(tmp1553_1549[tmp1553_1552] + 1);
                  }
                  a5.ck = (byte)(((ay)localObject2).eb + 1);
                  if (((((ay)localObject2).eb == 0) || (((ay)localObject2).eb == 2) || (((ay)localObject2).eb == 3)) && (d4[2] == 0))
                    ((ay)localObject4).eb = 0;
                  else if (((ay)localObject2).eb == 1)
                    ((ay)localObject4).eb = 1;
                  a5.ig = (byte)(((ay)localObject4).eb + 1);
                  break label1849;
                }
                if (((ba)localObject3).q())
                {
                  Object tmp1645_1644 = localObject3;
                  tmp1645_1644.eb = (byte)(tmp1645_1644.eb - 1);
                  if (((ay)localObject3).eb < 0)
                    ((ay)localObject3).eb = 0;
                  a5.fW = ((ay)localObject3).eb;
                  break label1849;
                }
                if (!((ba)localObject4).q())
                  break label1849;
                Object tmp1687_1685 = localObject4;
                tmp1687_1685.eb = (byte)(tmp1687_1685.eb - 1);
                if ((((ay)localObject2).eb == 0) || (((ay)localObject2).eb == 2))
                {
                  if (((ay)localObject4).eb < 0)
                    ((ay)localObject4).eb = 0;
                  else if ((((ay)localObject2).eb == 0) && (((ay)localObject4).eb == 4))
                    ((ay)localObject4).eb = 3;
                }
                else if (((ay)localObject2).eb == 1)
                {
                  if (((ay)localObject4).eb < 1)
                    ((ay)localObject4).eb = 1;
                }
                else if (((ay)localObject2).eb == 3)
                  if (((ay)localObject4).eb < 0)
                    ((ay)localObject4).eb = 0;
                  else if (((ay)localObject4).eb == 4)
                    ((ay)localObject4).eb = 3;
                  else if (((ay)localObject4).eb == 2)
                    ((ay)localObject4).eb = 1;
              }
              a5.ig = (byte)(((ay)localObject4).eb + 1);
              label1849: this.a = bg();
              a5.iC[0].eo = new b(0, 0, a5.ck, a5.ig, a5.fW);
              a5.a(false);
              return;
            }
            switch (a5.es.g9)
            {
            case -1610612734:
              if (!bc())
                break;
              b2.a();
              localObject4 = this;
              av.a((byte)(this.eb + 1));
              break;
            case 1900547:
              if (!bc())
                break;
              bw.d = this.eb;
              break;
            case -1610612728:
              d(true);
              break;
            case -1610612727:
              localObject1 = (ay)a5.es.cf().elementAt(3);
              if ((bp.ag().r() >= 20) && (((ba)localObject1).q()))
                break;
              bc();
              break;
            default:
              bc();
            }
            return;
          }
        }
        else if (((this.y == 0) || (this.y == 2)) && (!this.d9.isEmpty()) && (this.d5))
        {
          bc();
          if (a5.es.g9 == 3145731)
          {
            byte b1 = this.eb;
            localObject4 = this;
            this.ee = b1;
            return;
          }
        }
      }
      else
      {
        label2830: byte b2;
        if (a5.jdMethod_try(32768))
        {
          if ((this.y == 1) && (!this.d9.isEmpty()))
          {
            if (q())
            {
              ay localay;
              if (a5.jdMethod_else() == 18)
              {
                localay = (ay)a5.es.cf().elementAt(5);
                localObject2 = (ay)a5.es.cf().elementAt(6);
                localObject3 = (ay)a5.es.cf().elementAt(7);
                localObject4 = (ay)a5.es.cf().elementAt(8);
                if (localay.q())
                {
                  ay tmp2205_2204 = localay;
                  tmp2205_2204.eb = (byte)(tmp2205_2204.eb + 1);
                  d4[0] = 0;
                  if (localay.eb > localay.d9.size() - 1)
                  {
                    localay.eb = (byte)(localay.d9.size() - 1);
                    int tmp2255_2254 = 1;
                    byte[] tmp2255_2251 = d4;
                    tmp2255_2251[tmp2255_2254] = (byte)(tmp2255_2251[tmp2255_2254] + 1);
                  }
                  a5.ci = (byte)(localay.eb + 1);
                  if ((localay.eb != 1) || (d4[1] != 0))
                    break label2830;
                  ((ay)localObject2).eb = 2;
                  ((ay)localObject4).eb = 0;
                  a5.ck = (byte)(((ay)localObject2).eb + 1);
                }
                else
                {
                  if (((ba)localObject2).q())
                  {
                    Object tmp2319_2318 = localObject2;
                    tmp2319_2318.eb = (byte)(tmp2319_2318.eb + 1);
                    d4[2] = 0;
                    if (localay.eb == 0)
                    {
                      if (((ay)localObject2).eb > ((ay)localObject2).d9.size() - 3)
                      {
                        ((ay)localObject2).eb = (byte)(((ay)localObject2).d9.size() - 3);
                        int tmp2376_2375 = 3;
                        byte[] tmp2376_2372 = d4;
                        tmp2376_2372[tmp2376_2375] = (byte)(tmp2376_2372[tmp2376_2375] + 1);
                      }
                    }
                    else if ((localay.eb == 1) && (((ay)localObject2).eb > ((ay)localObject2).d9.size() - 1))
                    {
                      ((ay)localObject2).eb = (byte)(((ay)localObject2).d9.size() - 1);
                      int tmp2427_2426 = 4;
                      byte[] tmp2427_2423 = d4;
                      tmp2427_2423[tmp2427_2426] = (byte)(tmp2427_2423[tmp2427_2426] + 1);
                    }
                    a5.ck = (byte)(((ay)localObject2).eb + 1);
                    if (((((ay)localObject2).eb == 0) || (((ay)localObject2).eb == 2) || (((ay)localObject2).eb == 3)) && (d4[4] == 0))
                      ((ay)localObject4).eb = 0;
                    else if ((((ay)localObject2).eb == 1) && (d4[3] == 0))
                      ((ay)localObject4).eb = 1;
                    a5.ig = (byte)(((ay)localObject4).eb + 1);
                    break label2830;
                  }
                  if (((ba)localObject3).q())
                  {
                    Object tmp2527_2526 = localObject3;
                    tmp2527_2526.eb = (byte)(tmp2527_2526.eb + 1);
                    if (((ay)localObject3).eb > ((ay)localObject3).d9.size() - 1)
                      ((ay)localObject3).eb = (byte)(((ay)localObject3).d9.size() - 1);
                    a5.fW = ((ay)localObject3).eb;
                    break label2830;
                  }
                  if (!((ba)localObject4).q())
                    break label2830;
                  Object tmp2587_2585 = localObject4;
                  tmp2587_2585.eb = (byte)(tmp2587_2585.eb + 1);
                  if (((ay)localObject2).eb == 0)
                  {
                    if (((ay)localObject4).eb > ((ay)localObject4).d9.size() - 3)
                      ((ay)localObject4).eb = (byte)(((ay)localObject4).d9.size() - 1);
                  }
                  else if (((ay)localObject2).eb == 2)
                  {
                    if (((ay)localObject4).eb > ((ay)localObject4).d9.size() - 3)
                      ((ay)localObject4).eb = (byte)(((ay)localObject4).d9.size() - 2);
                  }
                  else if (((ay)localObject2).eb == 1)
                  {
                    if (((ay)localObject4).eb > ((ay)localObject4).d9.size() - 2)
                      ((ay)localObject4).eb = (byte)(((ay)localObject4).d9.size() - 2);
                  }
                  else if (((ay)localObject2).eb == 3)
                    if (((ay)localObject4).eb > 3)
                      ((ay)localObject4).eb = (byte)(((ay)localObject4).d9.size() - 1);
                    else if (((ay)localObject4).eb > 1)
                      ((ay)localObject4).eb = 3;
                    else if (((ay)localObject4).eb > ((ay)localObject4).d9.size() - 1)
                      ((ay)localObject4).eb = (byte)(((ay)localObject4).d9.size() - 1);
                }
                a5.ig = (byte)(((ay)localObject4).eb + 1);
                this.a = bg();
                a5.iC[0].eo = new b(0, 0, a5.ck, a5.ig, a5.fW);
                a5.a(false);
                return;
              }
              switch (a5.es.g9)
              {
              case -1610612734:
                if (!bd())
                  break;
                b2.a();
                localObject4 = this;
                av.a((byte)(this.eb + 1));
                break;
              case 1900547:
                if (!bd())
                  break;
                bw.d = this.eb;
                break;
              case -1610612728:
                d(false);
                break;
              case -1610612727:
                localay = (ay)a5.es.cf().elementAt(3);
                if ((bp.ag().r() >= 20) && (localay.q()))
                  break;
                bd();
                break;
              default:
                bd();
              }
              return;
            }
          }
          else if (((this.y == 0) || (this.y == 2)) && (!this.d9.isEmpty()) && (this.d5))
          {
            bd();
            if (a5.es.g9 == 3145731)
            {
              b2 = this.eb;
              localObject4 = this;
              this.ee = b2;
              return;
            }
          }
        }
        else if (a5.jdMethod_try(4096))
        {
          if (((this.y == 0) || (this.y == 2)) && (!this.d9.isEmpty()) && (!this.d5))
          {
            bc();
            if (a5.es.g9 == 1703972)
            {
              b2 = this.eb;
              localObject4 = this;
              this.ee = b2;
              return;
            }
          }
        }
        else if ((a5.jdMethod_try(8192)) && ((this.y == 0) || (this.y == 2)) && (!this.d9.isEmpty()) && (!this.d5))
        {
          bd();
          if (a5.es.g9 == 1703972)
          {
            b2 = this.eb;
            localObject4 = this;
            this.ee = b2;
          }
        }
      }
    }
  }

  private void d(boolean paramBoolean)
  {
    ay localay1 = (ay)a5.es.cf().elementAt(3);
    ay localay2 = (ay)a5.es.cf().elementAt(4);
    ay localay3 = (ay)a5.es.cf().elementAt(5);
    ay localay4 = (ay)a5.es.cf().elementAt(6);
    ay localay5 = (ay)a5.es.cf().elementAt(7);
    if (localay1.q())
    {
      if (paramBoolean)
      {
        ay tmp87_86 = localay1;
        tmp87_86.eb = (byte)(tmp87_86.eb - 1);
        if (localay1.eb < 0)
          localay1.eb = 0;
      }
      else
      {
        ay tmp113_112 = localay1;
        tmp113_112.eb = (byte)(tmp113_112.eb + 1);
        if (localay1.eb > localay1.d9.size() - 1)
          localay1.eb = (byte)(localay1.d9.size() - 1);
      }
      a5.gn = localay1.eb;
      switch (localay1.eb)
      {
      case 0:
        localay2.eb = 1;
        localay3.eb = 1;
        localay4.eb = 1;
        localay5.eb = 1;
        break;
      case 1:
        localay2.eb = 1;
        localay3.eb = 0;
        localay4.eb = 1;
        localay5.eb = 1;
        break;
      case 2:
        localay2.eb = 0;
        localay3.eb = 0;
        localay4.eb = 0;
        localay5.eb = 0;
      default:
        return;
      }
    }
    else
    {
      if (paramBoolean)
      {
        bc();
        return;
      }
      bd();
    }
  }

  private boolean bd()
  {
    this.eb = (byte)(this.eb + 1);
    this.ec = false;
    if (this.eb > this.d9.size() - 1)
    {
      this.eg = true;
      this.eb = (byte)(this.d9.size() - 1);
      return false;
    }
    this.eg = false;
    return true;
  }

  private boolean bc()
  {
    this.eb = (byte)(this.eb - 1);
    this.eg = false;
    if (this.eb < 0)
    {
      this.ec = true;
      this.eb = 0;
      return false;
    }
    this.ec = false;
    return true;
  }

  public final boolean b()
  {
    if (a5.gZ)
    {
      int i;
      int n;
      int i1;
      int i2;
      int i3;
      int i4;
      int i5;
      int m;
      switch (this.y)
      {
      case 0:
        i = 0;
        int j = this.d9.size();
        ay localay2;
        ay localay1;
        if (!this.d5)
        {
          if (a5.a(this.k, this.j, this.a, this.j + d(j)))
          {
            i = this.eb;
            for (localay2 = 0; localay2 < j; localay2++)
            {
              n = a5.cV;
              i1 = a5.cU;
              i2 = this.k;
              i3 = this.j;
              i4 = this.a;
              i5 = d(localay2 + 1);
              if ((n < i2) || (n > i2 + i4) || (i1 < i3) || (i1 > i3 + i5))
                continue;
              this.eb = (byte)localay2;
              localay2 = this.eb;
              localay1 = this;
              this.ee = localay2;
              break;
            }
            if (i == this.eb)
              a5.a(131072);
            return true;
          }
        }
        else if (a5.a(this.k, this.j, this.k + e(localay1), this.jdField_int))
        {
          i = this.eb;
          for (localay2 = 0; localay2 < localay1; m++)
          {
            n = a5.cV;
            i1 = a5.cU;
            i2 = this.k;
            i3 = this.j;
            i4 = e(localay2 + 1);
            i5 = this.jdField_int;
            if ((n < i2) || (n > i2 + i4) || (i1 < i3) || (i1 > i3 + i5))
              continue;
            this.eb = (byte)localay2;
            m = this.eb;
            localay1 = this;
            this.ee = m;
            break;
          }
          if (i == this.eb)
            a5.a(131072);
          return true;
        }
        break;
      case 1:
        i = this.k;
        if ((this.d7 != null) && (!this.d7.equals("")))
          i += this.d7.length() * a5.iA + 8;
        if (a5.a(i, this.j, a5.eb.getWidth(), a5.eb.getHeight()))
        {
          a5.a(16384);
          return true;
        }
        if (!a5.a(i + a5.eb.getWidth() + 8 + b5.jdMethod_do((String)this.d9.elementAt(this.eb)), this.j, a5.eb.getWidth(), a5.eb.getHeight()))
          break;
        a5.a(32768);
        return true;
      case 2:
        i = 0;
        int k = this.d9.size();
        if (!a5.a(this.k, this.j, this.a, this.j + d(k)))
          break;
        i = this.eb;
        for (m = 0; m < k; m++)
        {
          n = a5.cV;
          i1 = a5.cU;
          i2 = this.k;
          i3 = this.j;
          i4 = this.a;
          i5 = d(m + 1);
          if ((n < i2) || (n > i2 + i4) || (i1 < i3) || (i1 > i3 + i5))
            continue;
          this.eb = (byte)m;
          this.d1[m] = (this.d1[m] == 0 ? 1 : false);
          break;
        }
        if (i == this.eb)
          a5.a(131072);
        return true;
      }
    }
    return false;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     ay
 * JD-Core Version:    0.6.0
 */
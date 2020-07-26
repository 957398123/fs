import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public final class ao extends ba
{
  private String cj;
  private String[] cs = new String[2];
  public static String bX = "";
  public static int b3 = 0;
  public static boolean ct = false;
  public byte b6 = 0;
  public byte ca = 0;
  public byte cl = 0;
  private byte b0 = 0;
  private byte b4 = 0;
  public short b1 = 0;
  private short cn = 0;
  public short cr = 0;
  public af cq = null;
  private static byte cc = 0;
  public byte cb = 0;
  public static boolean ci = false;
  private int bW = z.au;
  private byte cm;
  private static int bZ = a5.ic - 2 * (4 + 2 * a5.iA + 8);
  static boolean cf;
  static boolean cg = true;
  static int ch;
  private static int b7 = bZ / 2;
  private static int cp = a5.fq.stringWidth(bX);
  private static int bY;
  static boolean cd = false;

  private ao(short paramShort1, short paramShort2, short paramShort3, short paramShort4, byte paramByte, be parambe)
  {
    super(0, 0, 0, 0, parambe);
    this.y = paramByte;
    if (this.k <= 0)
      this.k = 0;
    if (this.j <= 0)
    {
      paramShort1 = this;
      paramShort2 = 0;
      if (paramShort1.y == 1)
        paramShort2 = (short)(0 + (short)(a5.il - 18));
      this.j = paramShort2;
    }
    if (this.a <= 0)
      this.a = (paramShort1 = (short)a5.ic);
    if (this.jdField_int <= 0)
      this.jdField_int = 18;
    if (this.y == 1)
      jdMethod_do(bm.byte);
    try
    {
      be.gf.toString();
      return;
    }
    catch (Exception localException)
    {
      (this = a5.dI).notifyDestroyed();
    }
  }

  public ao(byte paramByte, be parambe)
  {
    this(0, 0, 0, 0, paramByte, parambe);
  }

  public final void a(Graphics paramGraphics)
  {
    int i = this.jdField_int;
    Graphics localGraphics = this.j;
    paramGraphics.setColor(bm.aD);
    paramGraphics.drawRect(this.k, localGraphics, this.a - 1, i - 1);
    paramGraphics.setColor(bm.aB);
    paramGraphics.drawRect(this.k + 1, localGraphics + 1, this.a - 3, i - 3);
    paramGraphics.setColor(bm.A);
    paramGraphics.fillRect(this.k + 2, localGraphics + 2, this.a - 4, i - 4);
    if (this.y == 0)
    {
      if (this.cj != null)
      {
        b5.jdMethod_do(paramGraphics, this.cj, this.a, this.k, this.j, bm.bP);
        return;
      }
    }
    else if (this.y == 1)
    {
      paramGraphics.setColor(7755053);
      paramGraphics.drawLine(9, this.j, 9, this.j + this.jdField_int);
      paramGraphics.drawLine(this.k + this.a - 9 - 1, this.j, this.k + this.a - 9 - 1, this.j + this.jdField_int);
      paramGraphics.setColor(14728078);
      paramGraphics.fillRect(1, this.j + 1, 8, this.jdField_int - 2);
      paramGraphics.fillRect(this.k + this.a - 9, this.j + 1, 8, this.jdField_int - 2);
      paramGraphics.setColor(16637613);
      paramGraphics.fillRect(3, this.j + 3, 4, this.jdField_int - 6);
      paramGraphics.fillRect(this.k + this.a - 7, this.j + 3, 4, this.jdField_int - 6);
      if (this.cs != null)
      {
        paramGraphics.setColor(bm.bP);
        paramGraphics.drawString(this.cs[0], this.k + 4 + 7, this.j, 20);
        paramGraphics.setColor(bm.bP);
        i = this.cs[1].length() * a5.iA;
        paramGraphics.drawString(this.cs[1], this.k + this.a - 4 - i - 7, this.j, 20);
      }
      bY = i = this.k + 4 + 2 * a5.iA + 8;
      if (bX.length() != 0)
      {
        paramGraphics.setColor(bm.aD);
        paramGraphics.drawRect(i, this.j, bZ - 1, this.jdField_int - 1);
        paramGraphics.setColor(bm.aB);
        paramGraphics.drawRect(i + 1, this.j + 1, bZ - 3, this.jdField_int - 3);
        paramGraphics.setColor(bm.cQ);
        paramGraphics.fillRect(i + 2, this.j + 2, bZ - 4, this.jdField_int - 4);
        int j = this.jdField_int - 4;
        localGraphics = bZ - 4;
        i = this.j + 2;
        paramGraphics = i + 2;
        this = paramGraphics;
        cp = a5.fq.stringWidth(bX);
        setClip(paramGraphics, i, localGraphics, j);
        setColor(bm.bR[7]);
        setFont(a5.fq);
        if (!cd)
        {
          if (cg)
          {
            if ((j = paramGraphics + localGraphics + b3) + cp + b7 < bY + bZ)
              cf = true;
            ad.a(this, bX, bm.bR[7], j, i, null, null, null);
          }
          if (cf)
          {
            if ((j = paramGraphics + localGraphics + ch) + cp + b7 < bY + bZ)
              cg = true;
            ad.a(this, bX, bm.bR[7], j, i, null, null, null);
          }
        }
        else
        {
          setColor(16711680);
          if (a5.ht % 4 < 2)
          {
            j = paramGraphics + (localGraphics - b5.jdMethod_do(bX)) / 2;
            ad.a(this, bX, bm.bR[7], j, i, null, null, null);
          }
        }
        setClip(0, 0, a5.ic, a5.il);
      }
    }
  }

  protected final void f()
  {
    ao localao1 = this;
    int i14;
    if ((a5.gZ) && (a5.jdMethod_byte(268435456)))
      switch (a5.es.g9)
      {
      case 131078:
      case 131079:
        int i5 = a5.ic;
        int i10 = a5.il - 36;
        int m = localao1.bW;
        if ((!a5.a(0, 18, i5, i10)) || (!localao1.aJ()))
          break;
        if (m == localao1.bW)
          a5.a(131072);
        if ((i10 = z.a(z.ay[localao1.bW])) != -1)
        {
          z.au = i10;
          String str1 = z.o[z.au];
          ao localao2;
          (localao2 = localao1).cj = str1;
        }
        break;
      case 524292:
        bp localbp;
        int n = (localbp = bp.ag()).e1;
        int i6 = localbp.e0;
        int i13 = localbp.e3;
        int i15 = localbp.fb;
        int i16 = localao1.cm;
        if ((a5.a(n, i6, i13, i15)) && (localao1.aJ()))
        {
          if (i16 == localao1.cm)
            a5.a(65536);
          be localbe1;
          i6 = (localbe1 = (be)a5.fE.elementAt(0)).ht;
          localbp.fC[i6] = localbp.fc[i6][localao1.cm];
          a5.es.c(localbp.fl[i6][localbp.a(i6, localbp.fC[i6])]);
          ah localah2;
          (localah2 = (ah)a5.es.cf().elementAt(6)).a(localbp.eF[i6][localbp.a(i6, localbp.fC[i6])]);
        }
        int i1 = localbp.e1 + localbp.e3 - a5.ca.getWidth() - 5;
        int i7 = localbp.e0 + 3;
        i14 = a5.ca.getWidth();
        int i11 = a5.ca.getHeight();
        if (a5.a(i1, i7, i14, i11))
          a5.a(4096);
        int i = i7 + localao1.cq.z() - a5.ca.getHeight();
        if (!a5.a(i1, i, i14, i11))
          break;
        a5.a(8192);
      }
    Object localObject6;
    int k;
    Object localObject4;
    Object localObject5;
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
        Object localObject2;
        int j;
        switch (a5.es.g9)
        {
        case 393219:
          switch (y().de())
          {
          case 0:
            ah localah1 = (ah)a5.es.cf().elementAt(33);
            localObject2 = (ah)a5.es.cf().elementAt(35);
            if (localah1.al() >= ((ah)localObject2).al())
              (a5.gQ = new as(0, null)).a(5, as.a2(), "此次升级将扣除您 $" + ((ah)localObject2).al() + "$" + " 经验，是否升级？", "确定", "返回", 393228, -1);
            else
              as.a(0, "您尚未达到升级所需的经验！", "确定", "返回", -1, -1);
            this.jdField_byte = false;
            break;
          case 1:
            a5.eQ.a(393217);
            this.jdField_byte = false;
          }
          break;
        case 131079:
          if ((j = ((Integer)y().db().elementAt(y().de())).intValue()) == -1)
          {
            this.jdField_byte = false;
            b5.jdMethod_case("退出菜单");
          }
          else
          {
            if (j == 131079)
            {
              localObject2 = new int[] { 131080, 131081 };
              a5.eQ.a(localObject2);
              b5.jdMethod_case("查看地图详情和怪物分布");
              ct = true;
            }
            else if (j == 131078)
            {
              a5.eQ.a(j);
              b5.jdMethod_case("转入世界地图");
            }
            this.jdField_byte = false;
          }
          break;
        case 524292:
          int i2;
          if ((i2 = ((Integer)y().db().elementAt(y().de())).intValue()) == -1)
            break;
          Object localObject3;
          if (i2 == 524289)
          {
            j = cc;
            String str2 = "天赋详情";
            (localObject3 = localObject3 = (ao)(a5.es = e.a("/ui/skilldetail.ui")).cf().elementAt(0)).cj = str2;
            (localObject3 = (ah)a5.es.cf().elementAt(3)).a(5);
            int i8 = bp.ag().a(j, bp.ag().fC[j]);
            localObject6 = bp.ag().eF[j][i8];
            ((ah)localObject3).a((String)localObject6);
            localObject3 = (ak)a5.es.cf().elementAt(4);
            localObject6 = bp.ag().fl[j][i8];
            ((ak)localObject3).jdMethod_if((String)localObject6);
            ((ak)localObject3).ap();
            localObject3 = (a7)a5.es.cf().elementAt(5);
            i8 = bp.ag().fO[j][i8];
            ((a7)localObject3).fC = (byte)(i8 / 1000 - 1);
            ((a7)localObject3).ft = true;
            i14 = (short)(i8 % 1000);
            ((a7)localObject3).jdMethod_if(i14, true);
            ((a7)localObject3).a(a5.gg);
          }
          else if (localObject3 == 1572869)
          {
            ci = false;
            a5.eQ.a(localObject3);
          }
          else if ((localObject3 == 524291) && (ci))
          {
            ci = false;
            int i3;
            for (k = 0; k < bp.ag().eR; k++)
              for (i3 = 0; i3 < bp.ag().ee[k].length; i3++)
              {
                bp tmp1090_1087 = bp.ag();
                tmp1090_1087.e7 = (byte)(tmp1090_1087.e7 + bp.ag().fL[k][i3]);
                int tmp1118_1117 = i3;
                byte[] tmp1118_1116 = bp.ag().ee[k];
                tmp1118_1116[tmp1118_1117] = (byte)(tmp1118_1116[tmp1118_1117] - bp.ag().fL[k][i3]);
                int tmp1140_1139 = k;
                short[] tmp1140_1136 = bp.ag().ez;
                tmp1140_1136[tmp1140_1139] = (short)(tmp1140_1136[tmp1140_1139] - bp.ag().fL[k][i3]);
                bp.ag().fL[k][i3] = 0;
              }
            for (k = 0; k < bp.ag().eR; k++)
              for (i3 = 0; i3 < bp.ag().ee[k].length; i3++)
                bp.ag().jdMethod_if(k, i3);
            for (k = 0; k < bp.ag().eR; k = (byte)(k + 1))
              (localObject5 = (ah)(localObject4 = (be)a5.fE.elementAt(k)).cf().elementAt(8)).a(bp.ag().e7 + "");
          }
          this.jdField_byte = false;
          break;
        case 2490386:
          k = ((Integer)y().db().elementAt(y().de())).intValue();
          bg.hP = c.do;
          if (k == -268435452)
          {
            a3.a(c.do, c.if, true);
          }
          else
          {
            if (k == 720897)
              bu.k = c.do;
            a5.eQ.a(k);
          }
          this.jdField_byte = false;
        }
        y().dc();
        return;
      }
      if (a5.jdMethod_byte(262144))
      {
        this.jdField_byte = false;
        y().da();
        return;
      }
    }
    else
    {
      if (a5.jdMethod_try(4096))
        switch (a5.es.g9)
        {
        case 131078:
        case 131079:
          if ((k = z.a(z.v[z.au][0])) == -1)
            break;
          z.au = k;
          localObject5 = z.o[z.au];
          localObject4 = this;
          this.cj = ((String)localObject5);
          break;
        case 524292:
          bp.ag().jdMethod_goto(0);
          this.b4 = (byte)(this.b4 - 1);
          if (this.b4 >= 0)
            break;
          this.b4 = 0;
          this.cb = this.cl;
        }
      else if (a5.jdMethod_try(8192))
        switch (a5.es.g9)
        {
        case 131078:
        case 131079:
          if ((k = z.a(z.v[z.au][1])) == -1)
            break;
          z.au = k;
          localObject5 = z.o[z.au];
          localObject4 = this;
          this.cj = ((String)localObject5);
          break;
        case 524292:
          bp.ag().jdMethod_goto(1);
          this.b4 = (byte)(this.b4 + 1);
          if (this.b4 >= this.ca)
          {
            this.b4 = (byte)(this.ca - 1);
            this.cb = (byte)(this.cl - (this.ca - 1));
          }
          if (this.cl >= this.ca)
          {
            this.cn = (short)(this.cn + this.b1);
            b5.jdMethod_case("scrollPositionY= " + this.cn + "slipperEndY = " + this.cr);
          }
          if (this.cn <= this.cr)
            break;
          this.cn = this.cr;
        }
      else if (a5.jdMethod_try(16384))
        switch (a5.es.g9)
        {
        case 131078:
        case 131079:
          if ((k = z.a(z.v[z.au][2])) == -1)
            break;
          z.au = k;
          localObject5 = z.o[z.au];
          localObject4 = this;
          this.cj = ((String)localObject5);
          break;
        case 524292:
          if (this.b0 < 0)
          {
            this.b0 = 0;
            break;
          }
          bp.ag().jdMethod_goto(2);
        }
      else if (a5.jdMethod_try(32768))
        switch (a5.es.g9)
        {
        case 131078:
        case 131079:
          if ((k = z.a(z.v[z.au][3])) == -1)
            break;
          z.au = k;
          localObject5 = z.o[z.au];
          localObject4 = this;
          this.cj = ((String)localObject5);
          break;
        case 524292:
          if (this.b0 >= 3)
            this.b0 = 2;
          else
            bp.ag().jdMethod_goto(3);
        }
      if ((a5.jdMethod_byte(65536)) || (a5.jdMethod_byte(131072)))
      {
        Object localObject1;
        switch (a5.es.g9)
        {
        case 393219:
          localObject1 = new br(0);
          localObject4 = new int[] { 393228, 393217 };
          ((br)localObject1).a(bm.dF, localObject4, bm.b7);
          a((br)localObject1);
          this.jdField_byte = true;
          y().da();
          return;
        case 131078:
          a5.fR = true;
          z.p = z.ay[z.au];
          a5.eQ.a(131079);
          return;
        case 131079:
          localObject1 = new br(0);
          localObject4 = new String[] { "地图详情", "世　界" };
          localObject5 = new int[] { 131079, 131078 };
          localObject6 = new int[] { 1, 1 };
          ((br)localObject1).a(localObject4, localObject5, localObject6);
          a((br)localObject1);
          this.jdField_byte = true;
          y().da();
          return;
        case 524292:
          if (a5.jdMethod_byte(131072))
          {
            cc = (localObject1 = (be)a5.fE.elementAt(0)).ht;
            localObject1 = new br(0);
            localObject4 = new String[] { "天赋详情", "确认升级", "恢复操作" };
            localObject5 = new int[] { 524289, 1572869, 524291 };
            localObject6 = new int[] { 2, 3, 3 };
            ((br)localObject1).a(localObject4, localObject5, localObject6);
            a((br)localObject1);
            this.jdField_byte = true;
            y().da();
            return;
          }
          if (!a5.jdMethod_byte(65536))
            break;
          byte b = (localObject1 = (be)a5.fE.elementAt(0)).ht;
          int i4 = bp.ag().a(b, bp.ag().fC[b]);
          if ((bp.ag().ee[b][i4] < bp.ag().eH[b][i4]) && (bp.ag().e7 != 0) && (bp.ag().eO[b][i4] != 0))
          {
            ci = true;
            int tmp2431_2430 = i4;
            byte[] tmp2431_2429 = bp.ag().ee[b];
            tmp2431_2429[tmp2431_2430] = (byte)(tmp2431_2429[tmp2431_2430] + 1);
            int tmp2446_2445 = i4;
            byte[] tmp2446_2444 = bp.ag().fL[b];
            tmp2446_2444[tmp2446_2445] = (byte)(tmp2446_2444[tmp2446_2445] + 1);
            byte tmp2459_2458 = b;
            short[] tmp2459_2455 = bp.ag().ez;
            tmp2459_2455[tmp2459_2458] = (short)(tmp2459_2455[tmp2459_2458] + 1);
            bp tmp2468_2465 = bp.ag();
            tmp2468_2465.e7 = (byte)(tmp2468_2465.e7 - 1);
            for (i9 = 0; i9 < bp.ag().eR; i9++)
              for (int i12 = 0; i12 < bp.ag().ee[i9].length; i12++)
                bp.ag().jdMethod_if(i9, i12);
          }
          for (int i9 = 0; i9 < bp.ag().eR; i9 = (byte)(i9 + 1))
          {
            be localbe2;
            (this = (ah)(localbe2 = (be)a5.fE.elementAt(i9)).cf().elementAt(8)).a(bp.ag().e7 + "");
          }
          return;
        case 2490386:
          br localbr;
          (localbr = new br(0)).a("加为好友", 589835, 3);
          if (c.int)
            localbr.a("私　聊", -268435452, 2);
          if ((c.int) && (bu.e == 0))
            localbr.a("组队邀请", 720897, 3);
          a(localbr);
          this.jdField_byte = true;
          y().da();
        }
      }
    }
  }

  private boolean aJ()
  {
    int i = 0;
    int j;
    switch (a5.es.g9)
    {
    case 131078:
    case 131079:
      j = 0;
    case 524292:
      while (true)
      {
        int m;
        int i1;
        int i2;
        if (j < z.b)
        {
          m = z.a3[j] - z.do;
          int n = z.a1[j] - z.if;
          i1 = z.ak.getWidth();
          i2 = z.ak.getHeight();
          if ((a5.cV >= m) && (a5.cV <= m + i1) && (a5.cU >= n) && (a5.cU <= n + i2))
          {
            i = 1;
            this.bW = j;
          }
          else
          {
            j++;
            continue;
          }
        }
        else
        {
          break;
          be localbe;
          m = (localbe = (be)a5.fE.elementAt(0)).ht;
          bp localbp;
          i1 = (localbp = bp.ag()).fc[m].length;
          i2 = (short)((a5.ic >> 1) - 27 - (a5.gg.jdField_try >> 1));
          for (int k = 0; k < i1; k++)
          {
            int i3 = (short)(i2 + (localbp.fc[m][k] - 1) % 3 * 27);
            int i4 = (short)(8 + localbp.e0 + ((localbp.fc[m][k] - 1) / 3 - this.cb) * 27);
            if ((a5.cV < i3) || (a5.cV > i3 + 16) || (a5.cU < i4) || (a5.cU > i4 + 16))
              continue;
            i = 1;
            this.cm = (byte)k;
            this.b4 = (byte)((i4 - 8 - localbp.e0) / 25);
            if (this.cl >= this.ca - 1)
            {
              this.cl = (byte)(this.cl + 1 - this.ca + this.b4);
              break;
            }
            this.cl = this.b4;
            break;
          }
        }
      }
    }
    return i;
  }

  public static void aH()
  {
    if (bX.length() == 0)
      return;
    if ((cg) && ((ao.b3 = b3 - 3) < -(cp + bZ - 4)))
    {
      cg = false;
      b3 = 0;
    }
    if ((cf) && ((ao.ch = ch - 3) < -(cp + bZ - 4)))
    {
      cf = false;
      ch = 0;
    }
  }

  public final String aC()
  {
    return this.cj;
  }

  public final void jdMethod_do(String paramString)
  {
    this.cj = paramString;
  }

  public final void jdMethod_do(String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length == this.cs.length))
      System.arraycopy(paramArrayOfString, 0, this.cs, 0, paramArrayOfString.length);
  }

  public final void a(String paramString, int paramInt)
  {
    if ((paramString != null) && (paramInt >= 0) && (paramInt < 2))
      this.cs[paramInt] = paramString;
  }

  public static int aA()
  {
    return a5.iG + 4 + 3;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     ao
 * JD-Core Version:    0.6.0
 */
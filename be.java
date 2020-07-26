import java.io.PrintStream;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;

public final class be extends ba
{
  public byte hD = 0;
  private Vector hc = new Vector();
  public int g9 = 0;
  public byte ht = 0;
  private String gE = "";
  public static byte gL = -1;
  public static short gp = 0;
  private static String gn;
  private static String gl;
  public static boolean g8 = false;
  public static boolean g1;
  public ba hf = null;
  private static byte[] g4 = { -1, -1 };
  private static int[] gw = { -1, -1 };
  public static int gs = 0;
  public static int hm = 0;
  public static boolean hd = false;
  public static byte hH = 0;
  public static boolean hC = false;
  public static int gG = 0;
  private byte hB = 0;
  private byte g6 = 0;
  private byte gz = 0;
  private boolean gV;
  private int gS;
  public static Image gf = null;
  static long gd;
  bk gT = null;
  public static a3 gu;
  public static boolean gJ;
  public static boolean hp = false;
  private static int[] hy = { 16777215, 16711680 };
  public static String[] gU = new String[2];
  public static int[] hl;
  public static int[] hk;
  public static byte[] gq;
  public static String[] gM;
  public static byte[] hE;
  public static int g3 = 0;

  public be(short paramShort1, short paramShort2, short paramShort3, short paramShort4)
  {
    super(0, 0, paramShort3, paramShort4, null);
    gL = -1;
  }

  public final void c(String paramString)
  {
    if (!a5.gZ)
    {
      this.gE = paramString;
      ck();
    }
  }

  public final void ck()
  {
    if (this.gE.length() > 0)
    {
      ad.a(this.gE);
      return;
    }
    ad.a("");
  }

  public static byte[] ct()
  {
    return g4;
  }

  public static int[] cj()
  {
    return gw;
  }

  public static void a(byte paramByte, int paramInt)
  {
    if (gw[0] == -1)
    {
      g4[0] = paramByte;
      gw[0] = paramInt;
      switch (a5.es.g9)
      {
      case 1245185:
      case 1245186:
        return;
      }
      a5.eQ.a(1245185);
      return;
    }
    g4[1] = paramByte;
    gw[1] = paramInt;
    a5.eQ.a(1245186);
  }

  public static void cr()
  {
    for (int i = 0; i < 2; i++)
    {
      g4[i] = -1;
      gw[i] = -1;
    }
  }

  public final void cg()
  {
    int i = 0;
    int j = at.int.length;
    while (i < j)
    {
      at.int[i] = -1;
      i++;
    }
    for (i = 0; i < this.hc.size(); i++)
    {
      if (!((ba)this.hc.elementAt(i) instanceof r))
        continue;
      r localr;
      byte tmp77_76 = -1;
      localr.mF[1] = tmp77_76;
      (localr = (r)this.hc.elementAt(i)).mF[0] = tmp77_76;
      if ((localr.r == 6) && (localr.el() == 2))
        bs.jdMethod_if(true);
      if (localr.r != 29)
        continue;
      bs.jdMethod_if(true);
    }
    at.new = 0;
  }

  public static void cx()
  {
    be localbe;
    switch (r.dS())
    {
    case 1:
      ((a7)(localbe = a5.es).hc.elementAt(9)).h(true);
      ((a7)(localbe = a5.es).hc.elementAt(10)).h(true);
      return;
    case 2:
      ((a7)(localbe = a5.es).hc.elementAt(16)).h(true);
      ((a7)(localbe = a5.es).hc.elementAt(17)).h(true);
      return;
    case 3:
      ((a7)(localbe = a5.es).hc.elementAt(18)).h(true);
      ((a7)(localbe = a5.es).hc.elementAt(19)).h(true);
    }
  }

  public static void ch()
  {
    gs = 0;
    hm = 0;
    r.dX();
    a7.ej = false;
    a7.em = false;
    hH = 0;
    hd = false;
  }

  public final void a(Graphics paramGraphics)
  {
    try
    {
      ba.j();
      ba.r();
      ba.jdMethod_int();
      ba.jdMethod_byte();
      ba.jdMethod_goto();
      ba.jdMethod_void();
      ba.x();
      ba.a();
    }
    catch (Exception localException1)
    {
    }
    paramGraphics.setColor(bm.bY);
    paramGraphics.fillRect(0, 0, a5.ic, a5.il);
    ba localba1 = null;
    ba localba2 = null;
    ba localba3 = null;
    Object localObject1 = null;
    z.a().jdMethod_if(paramGraphics, this.g9);
    int j = 0;
    int k = this.hc.size();
    Object localObject3;
    Object localObject5;
    while (j < k)
    {
      if (((localObject3 = (ba)this.hc.elementAt(j)) instanceof y))
        localObject1 = (y)localObject3;
      ah localah1;
      if ((this != null) && ((this.g9 == 393225) || (this.g9 == 393229) || (g1)))
      {
        if (((localObject3 instanceof ah)) || ((localObject3 instanceof ak)))
        {
          paramGraphics.setClip(localObject1.I[0], localObject1.I[1] + 2, localObject1.I[2], localObject1.I[3] - 10);
          ((ba)localObject3).a(paramGraphics);
          paramGraphics.setClip(0, 0, a5.ic, a5.il);
        }
        else
        {
          paramGraphics.setClip(0, 0, a5.ic, a5.il);
          ((ba)localObject3).a(paramGraphics);
        }
      }
      else if ((this != null) && (this.g9 == 2293873) && (j == 4))
      {
        if ((localObject3 instanceof ah))
        {
          localah1 = (ah)localObject3;
          if (!"".equals(localah1.aj()))
          {
            paramGraphics.setColor(8519935);
            paramGraphics.fillRect(12, localah1.jdMethod_long(), a5.ic - 24, a5.iG);
            paramGraphics.setColor(16777215);
            localah1.a(paramGraphics, localah1.aj(), 24, localah1.jdMethod_long(), a5.ic - 48, 0, 3, true);
          }
        }
      }
      else if ((this != null) && (a5.jdMethod_else() == 18) && (j == 4))
        ((ah)localObject3).a(paramGraphics, 16711680);
      else if ((this != null) && (a5.jdMethod_else() == 17) && (j == 16))
      {
        if ((localObject3 instanceof ah))
          if (!(localah1 = (ah)localObject3).q())
          {
            if (localah1.aj().equals("修改昵称"))
              ((ah)localObject3).a(paramGraphics, 16711680);
            else
              ((ah)localObject3).a(paramGraphics, 6045209);
          }
          else
            localah1.a(paramGraphics);
      }
      else
        ((ba)this.hc.elementAt(j)).a(paramGraphics);
      if ((((ba)this.hc.elementAt(j)).jdField_byte) && (((ba)this.hc.elementAt(j)).q()))
        localba1 = (ba)this.hc.elementAt(j);
      if ((((ba)this.hc.elementAt(j) instanceof r)) && (((ba)this.hc.elementAt(j)).q()))
        localba2 = (ba)this.hc.elementAt(j);
      if ((((ba)this.hc.elementAt(j) instanceof a7)) && (((ba)this.hc.elementAt(j)).q()))
        localba3 = (ba)this.hc.elementAt(j);
      try
      {
        switch (this.g9)
        {
        case 393219:
          localah1 = (ah)this.hc.elementAt(36);
          localObject5 = (ah)this.hc.elementAt(33);
          ah localah2 = (ah)this.hc.elementAt(35);
          if (((ah)localObject5).al() >= localah2.al())
          {
            localObject5 = new int[] { bm.ci, bm.y, bm.F };
            localObject3 = new int[] { bm.ci, bm.ci, bm.try };
            localah1.a(paramGraphics, localObject5, localObject3, 4);
          }
        }
      }
      catch (Exception localException2)
      {
      }
      j++;
    }
    j = 0;
    k = this.hc.size();
    while (j < k)
    {
      if (((localObject3 = (ba)this.hc.elementAt(j)).q()) && (((ba)localObject3).jdMethod_if()) && (((ba)localObject3).jdField_else_of_type_Boolean) && (a5.gQ == null))
      {
        if (((((ba)localObject3).m != 0L) && (System.currentTimeMillis() - ((ba)localObject3).m > 4000L)) || (((ba)localObject3).jdField_if))
          ((ba)localObject3).jdField_else_of_type_Boolean = false;
        if ((((ba)localObject3).n != 0L) && (System.currentTimeMillis() - ((ba)localObject3).n > 2000L))
        {
          ((ba)localObject3).jdMethod_if(paramGraphics);
          if (((ba)localObject3).e)
          {
            ((ba)localObject3).m = System.currentTimeMillis();
            ((ba)localObject3).e = false;
          }
          if (a5.jdMethod_byte(-1))
            ((ba)localObject3).jdField_if = true;
        }
      }
      j++;
    }
    if (bp.ag().al())
    {
      localObject1 = paramGraphics;
      if (a5.ht % 4 < 2)
        ((Graphics)localObject1).setColor(hy[0]);
      else
        ((Graphics)localObject1).setColor(hy[1]);
      ((Graphics)localObject1).drawRect(0, 0, a5.ic - 1, a5.il - 1);
      ((Graphics)localObject1).drawRect(1, 1, a5.ic - 3, a5.il - 3);
    }
    Object localObject2;
    a7 locala7;
    if (this.g9 == 2097155)
    {
      localObject2 = (a7)(localObject5 = a5.es).hc.elementAt(8);
      locala7 = (a7)(localObject5 = a5.es).hc.elementAt(7);
      localObject3 = (a7)(localObject5 = a5.es).hc.elementAt(9);
      if (by.do == true)
        a5.gg.jdMethod_if(paramGraphics, ((ba)localObject2).k + (((ba)localObject2).jdMethod_for() >> 1) - 7, ((ba)localObject2).j + (((ba)localObject2).z() >> 1) - 7, by.byte[by.jdField_new_of_type_Int]);
      if (!by.d)
      {
        if ((by.do == true) && (by.f == true))
        {
          if (by.long > by.e)
          {
            if (a5.ht % 9 == 1)
            {
              by.jdField_new_of_type_Int = by.a;
              this.hB = (byte)(this.hB + 1);
            }
            if (this.hB >= 4)
            {
              this.hB = 0;
              by.a();
            }
          }
          else if ((by.long >= 0) && (by.long < by.e / 2))
          {
            by.jdField_new_of_type_Int += 1;
          }
          else if ((by.long >= by.e / 2) && (by.long < by.e - 1))
          {
            if (a5.ht % 3 == 1)
              by.jdField_new_of_type_Int += b5.a(0, 6);
          }
          else if ((by.long >= by.e - 1) && (a5.ht % 7 == 1))
          {
            by.jdField_new_of_type_Int += b5.a(0, 6);
          }
          if (by.jdField_new_of_type_Int > 6)
          {
            by.long += 1;
            by.jdField_new_of_type_Int = 0;
          }
        }
      }
      else
      {
        paramGraphics.setColor(bm.cE);
        if (this.g6 % 2 == 0)
          paramGraphics.drawString("阴", locala7.k + (16 - b5.jdMethod_do("阴")) / 2, locala7.j + (16 - a5.iG) / 2, 20);
        else if (this.g6 % 2 == 1)
          paramGraphics.drawString("阳", ((ba)localObject3).k + (16 - b5.jdMethod_do("阳")) / 2, ((ba)localObject3).j + (16 - a5.iG) / 2, 20);
        if ((this.g6 >= 0) && (this.g6 <= 20))
        {
          if (a5.ht % 2 == 1)
            this.g6 = (byte)(this.g6 + 1);
        }
        else if ((this.g6 >= 20) && (this.g6 < 40) && (a5.ht % 6 == 1))
          this.g6 = (byte)(this.g6 + 1);
        if (this.g6 >= 35)
        {
          by.d = false;
          this.gV = true;
          if (by.void)
          {
            if (by.case == 1)
            {
              locala7.a(true, a5.es);
              ((ba)localObject3).a(false, a5.es);
            }
            else if (by.case == 2)
            {
              ((ba)localObject3).a(true, a5.es);
              locala7.a(false, a5.es);
            }
          }
          else if (by.case == 1)
          {
            locala7.a(false, a5.es);
            ((ba)localObject3).a(true, a5.es);
          }
          else if (by.case == 2)
          {
            ((ba)localObject3).a(false, a5.es);
            locala7.a(true, a5.es);
          }
        }
      }
      if (this.g6 == 35)
        this.gz = (byte)(this.gz + 1);
      if ((this.gV) && (this.gz > 15))
      {
        this.gV = false;
        by.case = 0;
        this.g6 = 0;
        by.a();
        this.gz = 0;
      }
    }
    else if (this.g9 == 1376260)
    {
      localObject2 = (a7)(localObject5 = a5.es).hc.elementAt(14);
      locala7 = (a7)(localObject5 = a5.es).hc.elementAt(15);
      if (a7.ej)
        paramGraphics.setColor(16746240);
      else
        paramGraphics.setColor(6154240);
      paramGraphics.fillTriangle(((ba)localObject2).v() - 3, ((ba)localObject2).jdMethod_long() + 6, ((ba)localObject2).v() + 6, ((ba)localObject2).jdMethod_long() + 16, ((ba)localObject2).v() + 16, ((ba)localObject2).jdMethod_long() + 6);
      paramGraphics.fillRect(((ba)localObject2).v() + 1, ((ba)localObject2).jdMethod_long() - 4, 11, 10);
      if (a7.em)
        paramGraphics.setColor(16746240);
      else
        paramGraphics.setColor(6154240);
      paramGraphics.fillTriangle(locala7.v() - 4, locala7.jdMethod_long() + 10, locala7.v() + 6, ((ba)localObject2).jdMethod_long() - 2, locala7.v() + 16, locala7.jdMethod_long() + 10);
      paramGraphics.fillRect(locala7.v() + 1, locala7.jdMethod_long() + 9, 11, 10);
    }
    else
    {
      int m;
      if (this.g9 == 1703939)
      {
        localObject2 = (bg)(localObject5 = a5.es).hc.elementAt(3);
        paramGraphics.setClip(((ba)localObject2).v(), ((ba)localObject2).jdMethod_long(), ((ba)localObject2).jdMethod_for(), ((ba)localObject2).z() - 10);
        for (m = 0; m < gq.length; m++)
          a(paramGraphics, hl[m], hk[m], gq[m]);
        paramGraphics.setClip(0, 0, a5.ic, a5.il);
      }
      else if ((this.g9 == 2425024) || (this.g9 == 2425077))
      {
        localObject2 = paramGraphics;
        localObject1 = this;
        m = a5.iA * b5.a(gM) + 70;
        int n = (a5.ic - m) / 2;
        int i1 = a5.iG * gM.length + 16;
        int i = (((ba)(localObject5 = localObject1).hc.elementAt(3)).jdMethod_long() - ((ba)(localObject5 = localObject1).hc.elementAt(2)).jdMethod_long() - i1) / 2 + ((ba)(localObject5 = localObject1).hc.elementAt(2)).jdMethod_long();
        int i2 = n + 4 + 10 - 1;
        i = i + 5 - 1;
        int i3 = m - 28 + 2;
        i1 = i1 - 10 + 2;
        ((Graphics)localObject2).setColor(14527877);
        ((Graphics)localObject2).fillRect(i2 + 1, i + 1, i3 - 1, i1 - 1);
        ((Graphics)localObject2).setColor(4930874);
        ((Graphics)localObject2).drawRect(i2, i, i3, i1);
        i2 += 2;
        i += 2;
        i3 -= 4;
        i1 -= 4;
        ((Graphics)localObject2).setColor(16575691);
        ((Graphics)localObject2).fillRect(i2 + 1, i + 1, i3 - 1, i1 - 1);
        ((Graphics)localObject2).setColor(4930874);
        ((Graphics)localObject2).drawRect(i2, i, i3, i1);
        i2 += 2;
        i += 2;
        i3 -= 4;
        i1 -= 4;
        ((Graphics)localObject2).setColor(14397060);
        ((Graphics)localObject2).drawRect(i2, i, i3, i1);
        i1 = i2 + 1;
        i += 1;
        int i4 = 0;
        int i5 = i - 1;
        for (int i6 = 0; i6 < gM.length; i6++)
        {
          int i7 = i1;
          int i8 = i + i6 * a5.iG;
          int i9 = i3 - 1;
          int i10 = a5.iG;
          if (i6 % 2 == 0)
          {
            ((Graphics)localObject2).setColor(bm.y);
            ((Graphics)localObject2).fillRect(i7, i8, i9, i10);
          }
          if (i6 == g3)
          {
            i4 = bm.try;
            i7 += 1;
            i8 += 1;
            i9 -= 1;
            i10 -= 2;
            ((Graphics)localObject2).setColor(bm.bo);
            ((Graphics)localObject2).fillRect(i7, i8, i9, i10);
          }
          else
          {
            i4 = bm.bP;
          }
          b5.jdMethod_do((Graphics)localObject2, gM[i6], m, n, i5 + 2 + i6 * a5.iG - 1, i4);
          if (i6 == gM.length - 1)
            continue;
          i7 = i2 + 1;
          i8 = i5 + (i6 + 1) * a5.iG;
          i9 = i7 + i3 - 2;
          i10 = i8;
          ((Graphics)localObject2).setColor(bm.bY);
          ((Graphics)localObject2).drawLine(i7, i8, i9, i10);
        }
      }
      else
      {
        Object localObject6;
        a9 locala9;
        ao localao;
        Object localObject4;
        String str;
        if (this.g9 == 2621443)
        {
          localObject2 = (a9)(localObject6 = a5.es).hc.elementAt(4);
          locala9 = (a9)(localObject6 = a5.es).hc.elementAt(6);
          localObject6 = this;
          localao = (ao)this.hc.elementAt(1);
          localObject6 = this;
          localObject4 = (ay)this.hc.elementAt(7);
          localObject6 = this;
          localObject6 = (ak)this.hc.elementAt(8);
          if ((((ba)localObject2).q()) || (locala9.q()))
          {
            str = ((a9)localObject2).cc().toString().trim();
            localObject6 = locala9.cc().toString().trim();
            if ((str == null) || ("".equals(str)) || (localObject6 == null) || ("".equals(localObject6)))
            {
              localao.a("输入", 0);
            }
            else
            {
              localao.a("充值", 0);
              break label3361;
            }
          }
          else
          {
            if (((ba)localObject4).q())
            {
              if (((ay)localObject4).bm() == ((ay)localObject4).bj())
              {
                localao.a("充值 ", 0);
                break label3361;
              }
              localao.a("选择", 0);
              break label3361;
            }
            if (((ba)localObject6).q())
              localao.a("", 0);
          }
        }
        else if (this.g9 == 2621445)
        {
          localObject2 = (a9)(localObject6 = a5.es).hc.elementAt(4);
          locala9 = (a9)(localObject6 = a5.es).hc.elementAt(6);
          localObject6 = this;
          localao = (ao)this.hc.elementAt(1);
          localObject6 = this;
          localObject4 = (ay)this.hc.elementAt(7);
          localObject6 = this;
          localObject6 = (ay)this.hc.elementAt(8);
          if ((((ba)localObject2).q()) || (locala9.q()))
          {
            str = ((a9)localObject2).cc().toString().trim();
            localObject6 = locala9.cc().toString().trim();
            if ((str == null) || ("".equals(str)) || (localObject6 == null) || ("".equals(localObject6)))
            {
              localao.a("输入", 0);
            }
            else
            {
              localao.a("充值", 0);
              break label3361;
            }
          }
          else
          {
            if (((ba)localObject4).q())
            {
              if (((ay)localObject4).bm() == ((ay)localObject4).bj())
              {
                localao.a("充值 ", 0);
                break label3361;
              }
              localao.a("选择", 0);
              break label3361;
            }
            if (((ba)localObject6).q())
              localao.a("", 0);
          }
        }
        else if (this.g9 == 2621447)
        {
          localObject2 = (a9)(localObject6 = a5.es).hc.elementAt(5);
          locala9 = (a9)(localObject6 = a5.es).hc.elementAt(7);
          localObject6 = this;
          localao = (ao)this.hc.elementAt(1);
          if ((((ba)localObject2).q()) || (locala9.q()))
          {
            localObject4 = ((a9)localObject2).cc().toString().trim();
            localObject6 = locala9.cc().toString().trim();
            if ((localObject4 == null) || ("".equals(localObject4)) || (localObject6 == null) || ("".equals(localObject6)))
            {
              localao.a("输入", 0);
              break label3361;
            }
            localao.a("充值", 0);
          }
        }
        else if (this.g9 == 131079)
        {
          paramGraphics.setColor(16777215);
          paramGraphics.drawString("欢迎访问ko.cn", a5.ic - 5, a5.il - 18 - 5, 40);
        }
      }
    }
    label3361: if ((localba2 != null) && ((localba2 instanceof r)) && (localba2.q()))
      (localObject2 = (r)localba2).p(paramGraphics);
    bp.ag().jdMethod_do(paramGraphics, this.g9);
    if ((localba1 != null) && (localba1.jdField_byte) && (localba1.y() != null))
      localba1.y().a(paramGraphics);
    if ((this.jdField_byte) && (y() != null))
      y().a(paramGraphics);
    if ((localba3 != null) && ((localba3 instanceof a7)) && (localba3.q()) && (((localObject2 = (a7)localba3).jdMethod_char() == 3) || ((((ba)localObject2).jdMethod_char() == 1) && ((this.g9 == 1376260) || (this.g9 == 1376261))) || (this.g9 == 1376265) || (this.g9 == 1376268) || (this.g9 == 1376264)))
      ((a7)localObject2).f(paramGraphics);
    if ((this.g9 == 1900546) && (!cl()))
    {
      if (bw.c > 1)
        if (bw.void == 1)
          bw.a(this, paramGraphics, false, true);
        else if (bw.void == bw.c)
          bw.a(this, paramGraphics, true, false);
        else
          bw.a(this, paramGraphics, true, true);
    }
    else if ((this.g9 == 2621442) && (!cl()) && (bo.long == 2) && (bo.jdMethod_for()))
    {
      if (bo.H == 0)
        localObject2 = "充值失败";
      else
        localObject2 = "您已成功发送" + bo.H + "条短信，得到猛犸币" + bo.x + "个，是否进入商城？";
      as.a(0, (String)localObject2, "是", "否", 2621450, -1);
      bo.long = 1;
    }
    if (this.g9 == -1610612687)
      i(paramGraphics);
  }

  private void i(Graphics paramGraphics)
  {
    int i = a5.cJ.jdField_try;
    int j = a5.cJ.a;
    int k = (a5.ic - i * 3) / 4;
    int m = (a5.il - 40 - i * 4) / 5;
    int n = i + k;
    int i1 = j + m;
    k = k;
    m += 16;
    int i2 = a5.cJ.jdField_int;
    for (int i3 = 0; i3 < i2; i3++)
    {
      int i4 = i3 / 3;
      int i5 = i3 % 3;
      i5 = k + n * i5;
      i4 = m + i4 * i1;
      paramGraphics.setColor(5450263);
      if (i3 == this.gS)
        paramGraphics.drawRect(i5 - 8, i4 - 8, i + 16, j + 8 + a5.iG);
      paramGraphics.drawString("" + i3, i5 + (i >> 1), i4 + j + 1, 17);
      a5.cJ.jdMethod_if(paramGraphics, i5, i4, i3);
    }
  }

  public static final int cA()
  {
    try
    {
      if (gf == null)
        gf = b5.jdMethod_if("/special/mm.pkg", "tt.png");
      return gf.getWidth() + 110;
    }
    catch (Exception localException)
    {
      a locala;
      (locala = a5.dI).notifyDestroyed();
    }
    return gf.getWidth() + 110;
  }

  public final Vector cf()
  {
    return this.hc;
  }

  public final void jdMethod_if(ba paramba)
  {
    this.hc.addElement(paramba);
  }

  public final void cy()
  {
    this.hc.removeAllElements();
  }

  private final void ce()
  {
    if ((a5.gZ) && (a5.es != null) && (!a5.eQ.e) && (a5.jdMethod_byte(268435456)))
    {
      int i = 0;
      br localbr;
      if ((this.hf != null) && ((localbr = this.hf.y()) != null) && (this.hf.jdField_byte) && (localbr.df()))
      {
        a5.a(131072);
        i = 1;
      }
      label1029: int j;
      int n;
      int i2;
      if (i == 0)
      {
        int k = a5.ic - (a5.iA + 4 << 1);
        int i1 = 0;
        int i3 = a5.il - 18;
        i1 = a5.iA + 4 << 1;
        if (a5.a(k, i3, i1, 18))
        {
          a5.a(262144);
          i = 1;
        }
        if (a5.a(0, i3, i1, 18))
        {
          a5.a(131072);
          i = 1;
        }
        if (!cl())
        {
          be localbe2;
          int i5;
          Object localObject;
          switch (a5.jdMethod_else())
          {
          case 18:
            localbe2 = this;
            ah localah1;
            i1 = (localah1 = (ah)this.hc.elementAt(4)).v();
            i3 = localah1.jdMethod_long();
            i5 = localah1.jdMethod_for();
            int m = localah1.z();
            if (!a5.a(i1, i3, i5, m))
              break;
            a5.a(65536);
            i = 1;
            break;
          case 17:
            if ((!a5.a((localObject = (ah)(localbe2 = a5.es).hc.elementAt(16)).k, ((ba)localObject).j, ((ba)localObject).jdMethod_for(), ((ba)localObject).z())) || (((ba)localObject).q()))
              break;
            a5.a(8192);
            i = 1;
          }
          int i7;
          int i8;
          int i9;
          int i10;
          int i11;
          int i13;
          int i15;
          int i14;
          be localbe4;
          int i4;
          int i6;
          switch (this.g9)
          {
          case 1900546:
            localbe2 = this;
            i1 = (localObject = (ah)this.hc.elementAt(15)).jdMethod_long();
            i3 = ((ba)localObject).v() - 5 - 6;
            i5 = ((ba)localObject).v() + ((ba)localObject).jdMethod_for() + 5;
            if (a5.a(i3, i1, 6, 8))
            {
              a5.a(16384);
            }
            else
            {
              if (!a5.a(i5, i1, 6, 8))
                break;
              a5.a(32768);
            }
            break;
          case 2097155:
            be localbe1 = this;
            localObject = (ao)(localbe2 = a5.es).hc.elementAt(1);
            a7 locala71 = (a7)(localbe2 = a5.es).hc.elementAt(31);
            ah localah2 = (ah)(localbe2 = a5.es).hc.elementAt(32);
            a7 locala73 = (a7)(localbe2 = a5.es).hc.elementAt(33);
            i7 = localah2.v();
            i8 = localah2.jdMethod_long();
            i9 = localah2.jdMethod_for();
            i10 = localah2.z();
            i11 = localah2.aj().equals("结算");
            if ((by.d) || (by.f) || (!localbe1.gV))
            {
              int i18;
              int i19;
              if (i11 == 0)
              {
                b5.jdMethod_case("开局界面-----开局界面");
                for (i13 = 0; i13 < 7; i13++)
                {
                  a9 locala9;
                  i15 = (locala9 = (a9)(localbe2 = a5.es).hc.elementAt(i13 + 24)).v();
                  int i16 = locala9.jdMethod_long();
                  i18 = locala9.jdMethod_for();
                  i19 = locala9.z();
                  if (!a5.a(i15, i16, i18, i19))
                    continue;
                  locala9.a(true, localbe1);
                  for (i14 = 0; i14 < 7; i14++)
                  {
                    if (i14 == i13)
                      continue;
                    be localbe3;
                    ((a9)(localbe3 = a5.es).hc.elementAt(i14 + 24)).a(false, localbe1);
                  }
                  b5.jdMethod_try(i13);
                  localah2.a(false, localbe1);
                  ((ao)localObject).a("", 0);
                  break;
                }
              }
              else
              {
                b5.jdMethod_case("结算界面-----结算界面");
                i13 = locala71.v();
                i14 = locala71.jdMethod_long();
                i15 = locala73.v();
                int i17 = locala73.jdMethod_long();
                i18 = locala71.jdMethod_for();
                i19 = locala71.z();
                if (a5.a(i13, i14, i18, i19))
                {
                  by.case = 1;
                  if (locala71.q())
                  {
                    a5.a(65536);
                    break label1029;
                  }
                  ((ao)localObject).a("开始", 0);
                  locala71.a(true, localbe1);
                  locala73.a(false, localbe1);
                  localah2.a(false, localbe1);
                  break label1029;
                }
                if (a5.a(i15, i17, i18, i19))
                {
                  by.case = 2;
                  if (locala73.q())
                  {
                    a5.a(65536);
                    break label1029;
                  }
                  ((ao)localObject).a("开始", 0);
                  locala71.a(false, localbe1);
                  locala73.a(true, localbe1);
                  localah2.a(false, localbe1);
                  break label1029;
                }
              }
              if (a5.a(i7, i8, i9, i10))
                if (localah2.q())
                {
                  a5.a(65536);
                }
                else
                {
                  if (i11 == 0)
                    ((ao)localObject).a("开局", 0);
                  else
                    ((ao)localObject).a("结算", 0);
                  localah2.a(true, localbe1);
                  locala71.a(false, localbe1);
                  locala73.a(false, localbe1);
                  for (i13 = 0; i13 < 7; i13++)
                    ((a9)(localbe4 = a5.es).hc.elementAt(i13 + 24)).a(false, localbe1);
                }
            }
            j = 1;
            break;
          case -1610612687:
            n = a5.cJ.jdField_try;
            i2 = a5.cJ.a;
            i4 = (a5.ic - n * 3) / 4;
            i6 = (a5.il - 40 - n * 4) / 5;
            i7 = n + i4;
            i8 = i2 + i6;
            i4 = i4;
            i6 += 16;
            i9 = a5.cJ.jdField_int;
            i10 = this.gS;
            i11 = 0;
          case 2425024:
          case 2425077:
            while (true)
            {
              if (i11 < i9)
              {
                i13 = i11 / 3;
                i14 = i11 % 3;
                i15 = i4 + i7 * i14;
                i14 = i6 + i13 * i8;
                if (a5.a(i15 - 8, i14 - 8, n + 16, i2 + 8 + a5.iG))
                {
                  this.gS = i11;
                  if (i10 == this.gS)
                  {
                    a5.a(131072);
                    break;
                  }
                }
                else
                {
                  i11++;
                  continue;
                }
              }
              break;
              int i12 = a5.iA * b5.a(gM) + 70;
              i13 = a5.iG;
              i14 = a5.iG * gM.length + 16;
              i15 = (a5.ic - i12) / 2;
              localbe4 = this;
              localbe4 = this;
              localbe4 = this;
              i14 = (((ba)this.hc.elementAt(3)).jdMethod_long() - ((ba)this.hc.elementAt(2)).jdMethod_long() - i14) / 2 + ((ba)this.hc.elementAt(2)).jdMethod_long();
              for (n = 0; n < gM.length; n++)
              {
                if (!a5.a(i15, i14 + n * i13 + 8, i12, i13))
                  continue;
                g3 = n;
                cz();
              }
            }
          }
        }
      }
      if (j == 0)
      {
        n = 0;
        i2 = this.hc.size();
        while (n < i2)
        {
          ba localba;
          if ((localba = (ba)this.hc.elementAt(n)).k())
          {
            if (a5.a(localba.v(), localba.jdMethod_long(), localba.jdMethod_for(), localba.z()))
            {
              if (this.hf == localba)
              {
                boolean bool;
                if ((bool = localba.b()))
                  this.hf.jdField_byte = false;
                else if (!localba.jdField_byte)
                {
                  if (a5.jdMethod_else() == 18)
                    a5.a(65536);
                  else
                    a5.a(131072);
                }
                else
                  break;
              }
              else
              {
                a7 locala72;
                if ((this.g9 == 2555905) && ((localba instanceof a7)) && ((locala72 = (a7)localba).bN() == 0))
                  return;
                this.hf.jdField_byte = false;
                this.hf.a(false, this);
                localba.a(true, this);
                if (localba.jdMethod_if())
                {
                  localba.e();
                  localba.m();
                }
                if (((this.hf instanceof r)) || ((this.hf instanceof ay)))
                  this.hf.b();
              }
              return;
            }
          }
          else if ((((localba instanceof ak)) || ((localba instanceof bv)) || ((localba instanceof a9))) && (a5.a(localba.v(), localba.jdMethod_long(), localba.jdMethod_for(), localba.z())))
            switch (this.g9)
            {
            case 1703969:
              a5.a(2048);
              break;
            case 1703971:
              a5.a(131072);
            }
          n++;
        }
      }
    }
  }

  public final void cw()
  {
    ce();
    Object localObject1;
    Object localObject7;
    Object localObject10;
    Object localObject11;
    Object localObject13;
    Object localObject3;
    Object localObject4;
    Object localObject8;
    int m;
    Object localObject5;
    Object localObject9;
    Object localObject12;
    Object localObject14;
    switch (a5.jdMethod_else())
    {
    case 11:
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        localObject1 = (a9)a5.es.cf().elementAt(4);
        a9 locala9 = (a9)a5.es.cf().elementAt(5);
        localObject7 = (ah)a5.es.cf().elementAt(6);
        localObject10 = (ah)a5.es.cf().elementAt(7);
        localObject11 = (ah)a5.es.cf().elementAt(8);
        if ((((ba)localObject1).q()) || (locala9.q()))
        {
          a5.hC[0] = ((a9)localObject1).cc().toString().trim();
          a5.hC[1] = locala9.cc().toString().trim();
          if ((a5.hC[0] == null) || (a5.hC[0].equals("")) || (a5.hC[1] == null) || (a5.hC[1].equals("")))
          {
            b5.jdMethod_for(4, 5);
            return;
          }
          b5.a(a5.hC, "name_password");
          if (a5.hC[0].equals(""))
          {
            localObject13 = "您输入的账号或密码有错误，请重新输入！";
            a5.a(0, (String)localObject13, "确定", "", -3, -120);
            return;
          }
          if (a5.hC[1].equals(""))
          {
            localObject13 = "您输入的账号或密码有错误，请重新输入！";
            a5.a(0, (String)localObject13, "确定", "", -3, -120);
            return;
          }
          a5.r();
          localObject13 = "请等待服务器认证...";
          a5.a(0, (String)localObject13, "", "", -120, -120);
          a5.eg = 0;
          a5.hg = 0;
          a5.ah();
          bk.y = 1;
          if (a5.da)
          {
            a5.eQ.a(117502);
            return;
          }
          this.gT = new bk(bk.q, bk.jdMethod_do(1), a5.dU ? 0 : 1, 2);
          if (bk.ao == 1)
            bk.b();
          if (a5.hM)
            gd = System.currentTimeMillis();
          this.gT.a(1);
          return;
        }
        if (((ba)localObject7).q())
        {
          if (a5.e8.g0 == 1)
          {
            a5.a(0, "测试人员不能注册", "确定", "", -7, -120);
            return;
          }
          a5.jdMethod_do(14);
          a5.e8.cT = 1;
        }
        else if (((ba)localObject10).q())
        {
          if (a5.e8.g0 == 1)
          {
            a5.a(0, "测试人员不能注册", "确定", "", -7, -120);
            return;
          }
          if ((localObject13 = (ay)a5.es.cf().elementAt(10)).bm() == 1)
            ((ay)localObject13).jdMethod_case(0);
          a5.e8.cT = 1;
          localObject7 = "请您稍候...";
          a5.a(0, (String)localObject7, "", "", -120, -120);
          bk.d = true;
          (localObject1 = new bk(bk.q, bk.jdMethod_do(5), a5.dU ? 0 : 1, 2)).a(0);
        }
        else if (((ba)localObject11).q())
        {
          if ((localObject13 = (ay)a5.es.cf().elementAt(10)).bm() == 1)
          {
            a5.a(0, "空中网账号不能修改密码，请登录kong.net进行修改", "确定", "", -7, -120);
            return;
          }
          a5.jdMethod_do(15);
        }
        else
        {
          localObject13 = (ah)a5.es.cf().elementAt(9);
          localObject7 = (ay)a5.es.cf().elementAt(10);
          if ((((ba)localObject13).q()) && (((ay)localObject7).bm() == 1))
          {
            a5.a(0, "空中网账号不能账号绑定，请登录kong.net进行账号绑定", "确定", "", -7, -120);
            return;
          }
          if ((((ba)localObject13).q()) && (!((ah)localObject13).aj().equals("")) && (((ah)localObject13).aj() != null))
          {
            a5.e8.cT = 4;
            a5.jdMethod_do(16);
          }
        }
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        a5.jdMethod_do(4);
      }
      break;
    case 8:
      if ((cl()) || (!a5.jdMethod_byte(262144)))
        break;
      ai.jdMethod_if();
      break;
    case 12:
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        int j;
        if (bk.jdMethod_if(j = (localObject1 = (bv)a5.es.cf().elementAt(2)).dw()))
          return;
        bk.y = 2;
        localObject7 = "网络连接中，请等候...";
        a5.a(0, (String)localObject7, "", "", -120, -120);
        if (!bk.G)
        {
          a5.is = Byte.parseByte(bk.jdMethod_if(j));
          f.f = "socket://" + bk.jdMethod_do(j) + ":" + bk.a(j);
          if (a5.e8.g0 != 1)
            b5.a(bk.g[j], "last_time_login");
        }
        else
        {
          a5.is = a5.hs[j];
          f.f = "socket://" + a5.hR[j];
          a5.fS[0] = j;
          b5.jdMethod_if(a5.fS, "serverlist");
        }
        a5.G();
        br.c6();
        if (a5.hQ == 1)
          a5.eQ.a(65546);
        else
          a5.eQ.a(131071);
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        a5.jdMethod_do(4);
      }
      break;
    case 14:
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        a5.hC[0] = null;
        a5.hC[1] = null;
        localObject1 = (a9)a5.es.cf().elementAt(9);
        a5.hC[0] = ((a9)localObject1).cc().toString().trim();
        localObject3 = (a9)a5.es.cf().elementAt(10);
        a5.hC[1] = ((a9)localObject3).cc().toString().trim();
        a5.fc[0] = a5.hC[0];
        a5.fc[1] = a5.hC[1];
        if ((a5.hC[0] == null) || (a5.hC[0].equals("")) || (a5.hC[1] == null) || (a5.hC[1].equals("")))
        {
          b5.a();
          return;
        }
        localObject7 = "账号：" + a5.hC[0] + "\n" + "密码：" + a5.hC[1] + "\n" + "是否确定此账号、密码？";
        a5.a(0, (String)localObject7, "确定", "修改", -11, -1);
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        if (a5.e8.cT == 1)
          a5.jdMethod_do(11);
        else if (a5.e8.cT == 2)
          a5.jdMethod_do(4);
        a5.I();
        a5.t();
      }
      break;
    case 15:
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        localObject1 = null;
        localObject3 = null;
        a5.hC[0] = null;
        a5.hC[1] = null;
        localObject7 = (a9)a5.es.cf().elementAt(10);
        a5.hC[0] = ((a9)localObject7).cc().toString().trim();
        localObject10 = (a9)a5.es.cf().elementAt(11);
        a5.hC[1] = ((a9)localObject10).cc().toString().trim();
        localObject3 = (localObject11 = (a9)a5.es.cf().elementAt(12)).cc().toString().trim();
        localObject1 = (localObject13 = (a9)a5.es.cf().elementAt(13)).cc().toString().trim();
        a5.fc[0] = a5.hC[0];
        a5.fc[1] = a5.hC[1];
        a5.fc[2] = localObject3;
        a5.fc[3] = localObject1;
        if ((a5.fc[0] == null) || (a5.fc[0].equals("")) || (a5.fc[1] == null) || (a5.fc[1].equals("")) || (a5.fc[2] == null) || (a5.fc[2].equals("")) || (a5.fc[3] == null) || (a5.fc[3].equals("")))
        {
          b5.jdMethod_if();
          return;
        }
        localObject7 = null;
      }
      switch (a5.a(a5.hC[1], (String)localObject3, (String)localObject1))
      {
      case 0:
        localObject7 = "请稍候...";
        a5.a(0, (String)localObject7, "", "", -120, -120);
        localObject1 = null;
        (localObject1 = new bk(bk.q, bk.jdMethod_do(2), a5.dU ? 0 : 1, 2)).a(2);
        break;
      case 1:
        localObject7 = "账号或密码不能为空，请重新输入!";
        a5.a(0, (String)localObject7, bm.a2[2], "", -3, -120);
        b5.jdMethod_case("用户名或密码不能为空，请重新输入!");
        break;
      case 2:
        localObject7 = "密码长度不符合要求，请重新输入!";
        a5.a(0, (String)localObject7, bm.a2[2], "", -3, -120);
        b5.jdMethod_case("用户名或密码长度不符合要求，请重新输入!");
        break;
      case 3:
        localObject7 = "密码输入有误，请重新输入！";
        a5.a(0, (String)localObject7, bm.a2[2], "", -3, -120);
        b5.jdMethod_case("密码输入有误，请重新输入！");
      default:
        break;
        if (!a5.jdMethod_byte(262144))
          break;
        a5.jdMethod_do(11);
        a5.I();
      }
      break;
    case 16:
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        if (a5.e8.cQ == 0)
          a5.jdMethod_do(21);
        else if (a5.e8.cQ == 1)
          a5.jdMethod_do(22);
        else if (a5.e8.cQ == 2)
          a5.jdMethod_do(23);
        if ((a5.hC[0] != null) && (!a5.hC[0].equals("")))
        {
          gn = a5.hC[0];
          a5.hC[0] = null;
        }
        if ((a5.hC[1] == null) || (a5.hC[1].equals("")))
          break;
        gl = a5.hC[1];
        a5.hC[1] = null;
      }
      else if (a5.jdMethod_byte(262144))
      {
        if (a5.e8.cT == 3)
        {
          a5.jdMethod_do(4);
        }
        else
        {
          if (a5.e8.cT != 4)
            break;
          a5.jdMethod_do(11);
        }
      }
      else
      {
        if (!a5.jdMethod_byte(2048))
          break;
        localObject1 = (bv)cf().elementAt(3);
        localObject3 = (ak)cf().elementAt(4);
        if (((ba)localObject1).q())
        {
          ((ba)localObject1).a(false, this);
          ((ba)localObject3).a(true, this);
          ((ak)localObject3).ap();
        }
        else if (((ba)localObject3).q())
        {
          ((ba)localObject1).a(true, this);
          ((ba)localObject3).a(false, this);
        }
      }
      break;
    case 17:
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        if (((localObject1 = (ah)a5.es.cf().elementAt(16)).q()) && (a5.e0[a5.hg] != null))
        {
          if (((a5.hV[a5.hg] == 0) || (a5.hV[a5.hg] == 2)) && (a5.g3[a5.hg] == 0))
          {
            a5.jdMethod_do(19);
            break;
          }
          if ((a5.hV[a5.hg] == 0) && (a5.g3[a5.hg] != 0))
            cq();
        }
      }
      else
      {
        if ((cl()) || (!a5.jdMethod_byte(262144)))
          break;
        a5.jdMethod_do(4);
        a5.eQ.jdMethod_for();
        a5.ah();
        a5.G();
        a5.eg = 0;
        a5.hg = 0;
      }
      break;
    case 18:
      if (a5.jdMethod_byte(65536))
      {
        if (((localObject1 = (a9)a5.es.cf().elementAt(9)).cc().toString().trim() == null) || (((a9)localObject1).cc().toString().trim().trim().equals("")))
        {
          b5.a("输入昵称", "输入昵称，最多输入六个汉字或字母（包括数字）", 6, ((a9)localObject1).cc().toString().trim(), 9, 2);
        }
        else
        {
          if (!a5.fY.equals(((a9)localObject1).cc().toString().trim()))
            a5.fY.equals(((a9)localObject1).cc().toString().trim());
          localObject3 = null;
          localObject3 = "请稍候...";
          a5.a(0, (String)localObject3, "", "", -120, -120);
          a5.eQ.a(1114114);
          for (int i1 = 0; i1 < 5; i1++)
            ay.d4[i1] = 0;
        }
      }
      else if (a5.jdMethod_byte(262144))
      {
        localObject1 = null;
        localObject1 = "请稍候...";
        a5.a(0, (String)localObject1, "", "", -120, -120);
        a5.eQ.a(131071);
        a5.ah();
        a5.G();
        a5.gx = 0;
        for (int k = 0; k < 5; k++)
          ay.d4[k] = 0;
      }
      else
      {
        if (!a5.jdMethod_byte(131072))
          break;
        localObject1 = (ay)a5.es.cf().elementAt(5);
        localObject4 = (ay)a5.es.cf().elementAt(6);
        localObject8 = (ay)a5.es.cf().elementAt(8);
        if ((localObject10 = (a9)a5.es.cf().elementAt(9)).q())
        {
          if ((((a9)localObject10).cc().toString().trim() == null) || (((a9)localObject10).cc().toString().trim().trim().equals("")) || ((((a9)localObject10).cc().toString().trim() != null) && (!((a9)localObject10).cc().toString().trim().equals(""))))
          {
            b5.a("输入昵称", "输入昵称，最多输入六个汉字或字母（包括数字）", 6, ((a9)localObject10).cc().toString().trim(), 9, 2);
            break;
          }
        }
        else
        {
          if (((ba)localObject1).q())
          {
            a5.jdMethod_do(27);
            localObject11 = (ao)a5.es.cf().elementAt(0);
            localObject13 = (ak)a5.es.cf().elementAt(4);
            if (a5.ci == 1)
            {
              ((ao)localObject11).jdMethod_do("天人");
              ((ak)localObject13).jdMethod_if(bm.aU[0]);
            }
            else if (a5.ci == 2)
            {
              ((ao)localObject11).jdMethod_do("修罗");
              ((ak)localObject13).jdMethod_if(bm.aU[1]);
            }
            ((ak)localObject13).ap();
            break;
          }
          if (((ba)localObject4).q())
          {
            a5.jdMethod_do(27);
            localObject11 = (ao)a5.es.cf().elementAt(0);
            localObject13 = (ak)a5.es.cf().elementAt(4);
            if (a5.ck == 1)
            {
              ((ao)localObject11).jdMethod_do("人族");
              ((ak)localObject13).jdMethod_if(bm.aU[2]);
            }
            else if (a5.ck == 2)
            {
              ((ao)localObject11).jdMethod_do("仙族");
              ((ak)localObject13).jdMethod_if(bm.aU[3]);
            }
            else if (a5.ck == 3)
            {
              ((ao)localObject11).jdMethod_do("妖族");
              ((ak)localObject13).jdMethod_if(bm.aU[4]);
            }
            else if (a5.ck == 4)
            {
              ((ao)localObject11).jdMethod_do("魔族");
              ((ak)localObject13).jdMethod_if(bm.aU[5]);
            }
            ((ak)localObject13).ap();
            break;
          }
          if (((ba)localObject8).q())
          {
            a5.jdMethod_do(27);
            localObject11 = (ao)a5.es.cf().elementAt(0);
            localObject13 = (ak)a5.es.cf().elementAt(4);
            if (a5.ig == 1)
            {
              ((ao)localObject11).jdMethod_do("剑客");
              ((ak)localObject13).jdMethod_if(bm.aU[6]);
            }
            else if (a5.ig == 2)
            {
              ((ao)localObject11).jdMethod_do("刺客");
              ((ak)localObject13).jdMethod_if(bm.aU[7]);
            }
            else if (a5.ig == 3)
            {
              ((ao)localObject11).jdMethod_do("道士");
              ((ak)localObject13).jdMethod_if(bm.aU[8]);
            }
            else if (a5.ig == 4)
            {
              ((ao)localObject11).jdMethod_do("医师");
              ((ak)localObject13).jdMethod_if(bm.aU[9]);
            }
            else if (a5.ig == 5)
            {
              ((ao)localObject11).jdMethod_do("幻术师");
              ((ak)localObject13).jdMethod_if(bm.aU[10]);
            }
            else if (a5.ig == 6)
            {
              ((ao)localObject11).jdMethod_do("暗巫");
              ((ak)localObject13).jdMethod_if(bm.aU[11]);
            }
            ((ak)localObject13).ap();
          }
        }
      }
      break;
    case 19:
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        localObject1 = null;
        if (((localObject4 = (a9)a5.es.cf().elementAt(9)).cc().toString().trim() == null) || (((a9)localObject4).cc().toString().trim().equals("")))
        {
          b5.a("删除角色", "请输入del确认删除", 3, null, 9, 5);
          return;
        }
        localObject1 = ((a9)localObject4).cc().toString().trim();
        if ("del".equals(localObject1))
        {
          if (a5.hV[a5.hg] == 2)
            a5.eQ.a(1114118);
          else
            a5.eQ.a(1114116);
        }
        else
        {
          localObject1 = "输入有误，请重新输入";
          a5.a(0, (String)localObject1, bm.a2[2], "", -3, -120);
        }
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        localObject1 = null;
        localObject1 = "请稍候...";
        a5.a(0, (String)localObject1, "", "", -120, -120);
        a5.ah();
        a5.jdMethod_do(17);
        a5.eQ.a(131071);
      }
      break;
    case 21:
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        localObject1 = (a9)a5.es.cf().elementAt(4);
        localObject4 = (a9)a5.es.cf().elementAt(6);
        if ((((a9)localObject1).cc().toString().trim() == null) || (((a9)localObject1).cc().toString().trim().equals("")) || (((a9)localObject4).cc().toString().trim() == null) || (((a9)localObject4).cc().toString().trim().equals("")))
        {
          b5.jdMethod_for(4, 6);
          return;
        }
        a5.hC[0] = ((a9)localObject1).cc().toString().trim();
        a5.hC[1] = ((a9)localObject4).cc().toString().trim();
        bo.C = 2;
        localObject8 = null;
        localObject8 = new bk(bk.q, bk.jdMethod_do(1), a5.dU ? 0 : 1, 0);
        bk.jdField_b_of_type_Boolean = true;
        ((bk)localObject8).a(4);
        a5.a(0, "请稍候...", "", "", -120, -120);
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        if ((gn != null) && (!gn.equals("")))
          a5.hC[0] = gn;
        if ((gl != null) && (!gl.equals("")))
          a5.hC[1] = gl;
        a5.e8.cQ = 0;
        a5.jdMethod_do(a5.jdMethod_case());
        (localObject1 = (bv)a5.es.cf().elementAt(3)).a(true, a5.es);
      }
      break;
    case 22:
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        localObject1 = (a9)a5.es.cf().elementAt(4);
        localObject4 = (a9)a5.es.cf().elementAt(6);
        if ((((a9)localObject1).cc().toString().trim() == null) || (((a9)localObject1).cc().toString().trim().equals("")) || (((a9)localObject4).cc().toString().trim() == null) || (((a9)localObject4).cc().toString().trim().equals("")))
        {
          b5.jdMethod_for(4, 6);
          return;
        }
        a5.hC[0] = ((a9)localObject1).cc().toString().trim();
        a5.hC[1] = ((a9)localObject4).cc().toString().trim();
        bo.C = 3;
        localObject8 = null;
        localObject8 = new bk(bk.q, bk.jdMethod_do(1), a5.dU ? 0 : 1, 0);
        bk.jdField_b_of_type_Boolean = true;
        ((bk)localObject8).a(4);
        a5.a(0, "请稍候...", "", "", -120, -120);
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        if ((gn != null) && (!gn.equals("")))
          a5.hC[0] = gn;
        if ((gl != null) && (!gl.equals("")))
          a5.hC[1] = gl;
        a5.e8.cQ = 0;
        a5.jdMethod_do(a5.jdMethod_case());
        (localObject1 = (bv)a5.es.cf().elementAt(3)).a(true, a5.es);
      }
      break;
    case 23:
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        if (((localObject1 = (a9)a5.es.cf().elementAt(4)).cc().toString().trim() == null) || (((a9)localObject1).cc().toString().trim().equals("")))
        {
          b5.a("请输入用户名", "请输入您的用户名", 16, ((a9)localObject1).cc().toString().trim(), 4, 1);
          return;
        }
        a5.a(0, "请稍候...", "", "", -120, -120);
        bo.jdMethod_do(4);
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        a5.e8.cQ = 0;
        a5.jdMethod_do(a5.jdMethod_case());
        (localObject1 = (bv)a5.es.cf().elementAt(3)).a(true, a5.es);
        if ((gn != null) && (!gn.equals("")))
          a5.hC[0] = gn;
      }
      break;
    case 10:
      if (!a5.jdMethod_byte(262144))
        break;
      a5.jdMethod_do(a5.jdMethod_case());
      break;
    case 27:
      if (!a5.jdMethod_byte(262144))
        break;
      a5.jdMethod_do(a5.jdMethod_case());
      cu();
      break;
    case 6:
      if (a5.jdMethod_byte(196608))
      {
        a5.jdMethod_do(29);
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        a5.jdMethod_do(4);
      }
      break;
    case 29:
      if (!a5.jdMethod_byte(262144))
        break;
      a5.jdMethod_do(6);
      (localObject1 = (bv)a5.es.cf().elementAt(2)).y(a5.f3);
      break;
    case 30:
      if (a5.jdMethod_byte(196608))
      {
        switch (m = (localObject1 = (bv)a5.es.cf().elementAt(2)).dw())
        {
        case 0:
          a5.jdMethod_do(31);
          break;
        case 1:
          cp();
          break;
        case 2:
          co();
          break;
        case 3:
          a5.jdMethod_do(37);
        default:
          break;
        }
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        a5.jdMethod_do(4);
      }
      break;
    case 31:
      if (a5.jdMethod_byte(196608))
      {
        localObject1 = (a9)a5.es.cf().elementAt(5);
        m = 0;
        try
        {
          m = Integer.parseInt(((a9)localObject1).cc().toString());
        }
        catch (Exception localException)
        {
          (localObject8 = localException).printStackTrace();
        }
        if ((m >= 1) && (m <= 100))
        {
          bk.ai = m;
          if (bk.m())
          {
            localObject8 = "/judgeserver/charge?&userId=" + a5.ik + "&key=" + a5.iM + "&game=fengshen&money=" + m + "&from=kong";
            (localObject10 = new bk(bk.void, (String)localObject8, a5.dU ? 0 : 1, 3)).a(3);
          }
          else
          {
            bk.jdField_b_of_type_Boolean = true;
            (localObject8 = new bk(bk.aG, bk.aQ, a5.dU ? 0 : 1, 1)).a(3);
          }
          a5.a(0, "请稍候...", "", "", -120, -120);
        }
        else
        {
          localObject8 = "输入非法，请重新输入“1-100”之间整数";
          a5.a(0, (String)localObject8, bm.a2[2], "", -3, -120);
        }
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        a5.jdMethod_do(30);
      }
      break;
    case 34:
      if (a5.jdMethod_byte(196608))
      {
        localObject1 = (ah)a5.es.cf().elementAt(4);
        localObject5 = (ah)a5.es.cf().elementAt(5);
        if (((ba)localObject1).q())
          a5.jdMethod_do(35);
        else if (((ba)localObject5).q())
          a5.jdMethod_do(36);
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        a5.jdMethod_do(30);
      }
      break;
    case 35:
      if (a5.jdMethod_byte(196608))
      {
        if ((bk.jdField_if_of_type_Byte = (byte)((localObject1 = (ay)a5.es.cf().elementAt(3)).bm() + 1)) == 2)
        {
          as.cH = 999999;
          as.a(1, "请输入查询年月：\n（例：200906）", "确定", "取消", -1610612640, -1, -1, -1);
          a5.gQ.cA = 6;
        }
        else if (bk.m())
        {
          localObject5 = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + a5.ik + "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100 + "&qtype=7&qtime=" + bk.jdField_if_of_type_Byte + "&qmonth=" + bk.char;
          a5.a(0, "请稍候...", "", "", -120, -120);
          (localObject8 = new bk(bk.void, (String)localObject5, a5.dU ? 0 : 1, 3)).a(8);
        }
        else
        {
          a5.a(0, "请稍候...", "", "", -120, -120);
          bk.jdField_b_of_type_Boolean = true;
          (localObject5 = new bk(bk.aG, bk.aQ, a5.dU ? 0 : 1, 1)).a(8);
        }
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        a5.jdMethod_do(34);
      }
      break;
    case 36:
      if (a5.jdMethod_byte(196608))
      {
        localObject1 = (ay)a5.es.cf().elementAt(3);
        bk.jdField_if_of_type_Byte = (byte)((localObject5 = (ay)a5.es.cf().elementAt(5)).bm() + 1);
        switch (((ay)localObject1).bm())
        {
        case 0:
          bk.ay = 3;
          break;
        case 1:
          bk.ay = 5;
          break;
        case 2:
          bk.ay = 13;
        }
        if (bk.jdField_if_of_type_Byte == 2)
        {
          as.cH = 999999;
          as.a(1, "请输入查询年月：\n（例：200906）", "确定", "取消", -1610612639, -1, -1, -1);
          a5.gQ.cA = 6;
        }
        else if (bk.m())
        {
          localObject8 = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + a5.ik + "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100 + "&qtype=" + bk.ay + "&qtime=" + bk.jdField_if_of_type_Byte + "&qmonth=" + bk.char;
          a5.a(0, "请稍候...", "", "", -120, -120);
          (localObject10 = new bk(bk.void, (String)localObject8, a5.dU ? 0 : 1, 3)).a(9);
        }
        else
        {
          a5.a(0, "请稍候...", "", "", -120, -120);
          bk.jdField_b_of_type_Boolean = true;
          (localObject8 = new bk(bk.aG, bk.aQ, a5.dU ? 0 : 1, 1)).a(9);
        }
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        a5.jdMethod_do(34);
      }
      break;
    case 37:
      if (!a5.jdMethod_byte(262144))
        break;
      a5.jdMethod_do(30);
      break;
    case 32:
      if (a5.jdMethod_byte(196608))
      {
        localObject1 = (ah)a5.es.cf().elementAt(4);
        localObject5 = (ah)a5.es.cf().elementAt(5);
        localObject8 = (ah)a5.es.cf().elementAt(6);
        localObject10 = (ah)a5.es.cf().elementAt(7);
        if (((ba)localObject1).q())
          a5.jdMethod_do(31);
        else if (((ba)localObject5).q())
          cp();
        else if (((ba)localObject8).q())
          co();
        else if (((ba)localObject10).q())
          a5.jdMethod_do(37);
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        a5.jdMethod_do(30);
      }
      break;
    case 33:
      if (a5.jdMethod_byte(196608))
      {
        localObject1 = (ah)a5.es.cf().elementAt(4);
        localObject5 = (ah)a5.es.cf().elementAt(5);
        localObject8 = (ah)a5.es.cf().elementAt(6);
        if (((ba)localObject1).q())
          a5.jdMethod_do(31);
        else if (((ba)localObject5).q())
          co();
        else if (((ba)localObject8).q())
          a5.jdMethod_do(37);
      }
      else
      {
        if (!a5.jdMethod_byte(262144))
          break;
        a5.jdMethod_do(30);
      }
      break;
    case 38:
      if (!a5.jdMethod_byte(262144))
        break;
      a5.jdMethod_do(34);
      break;
    case 7:
    case 9:
    case 13:
    case 20:
    case 24:
    case 25:
    case 26:
    case 28:
    default:
      if (a5.jdMethod_byte(262144))
      {
        b5.jdMethod_case("---------当前命令号------- = " + Integer.toHexString(this.g9));
        if ((a5.jdMethod_else() == 4) || (cl()))
          break;
        new br(0, 0, 0, 0, 0);
        localObject1 = null;
        b5.jdMethod_case("当前状态是： " + a5.V());
        cr();
        q.a = -1;
        b5.p = 0;
        b5.d = 0;
        if ((this.g9 == 1376260) || (this.g9 == 1376265) || (this.g9 == 1376264) || (this.g9 == 1376268) || (this.g9 == 1376261))
        {
          (a5.gQ = new as(0, null)).a(5, bm.dt, "是否确认取消交易？", "确定", "取消", 1376274, -1);
          return;
        }
        if (this.g9 == 1376263)
        {
          a5.eQ.a(1376261);
          return;
        }
        if (this.g9 == 1376267)
        {
          a5.eQ.a(1376273);
          if (am.jdField_new_of_type_Int > 0)
            am.jdField_new_of_type_Int = 0;
          if (am.jdField_else_of_type_Boolean)
            am.jdField_else_of_type_Boolean = false;
          if (!am.a)
            am.a = true;
          return;
        }
        if ((this.g9 == 458760) && (at.byte))
        {
          (localObject5 = (ao)cf().elementAt(1)).a("返回", 1);
          at.a(true);
          at.byte = false;
          return;
        }
        if ((this.g9 == 1179658) && (at.byte))
        {
          (localObject5 = (ao)cf().elementAt(1)).a("返回", 1);
          bs.a(true);
          at.byte = false;
          return;
        }
        if (this.g9 == 262152)
        {
          a7.e3 = -1;
        }
        else if (this.g9 == 458755)
        {
          b5.jdMethod_case("退出当前界面");
          a7.bF();
        }
        if (gL == -1)
          ci();
      }
      else if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        if (this.g9 == 2097155)
        {
          localObject1 = (ao)a5.es.cf().elementAt(1);
          localObject5 = (ah)this.hc.elementAt(32);
          localObject8 = (ah)this.hc.elementAt(36);
          localObject10 = (ah)this.hc.elementAt(37);
          int i3;
          if ((((ba)localObject5).q()) && (((ah)localObject5).aj().equals("开局")))
          {
            if (!by.do)
            {
              for (i3 = 0; i3 < 7; i3++)
              {
                by.try[i3] = ((a9)a5.es.cf().elementAt(i3 + 24));
                if (by.try[i3].b3() != 0)
                  continue;
                by.int = (byte)(by.int + 1);
              }
              if (by.int == 7)
              {
                as.a(0, "请输入金额", "确定", "", -1, -2);
                by.int = 0;
                return;
              }
              ((ba)localObject5).a(false, a5.es);
              by.e = b5.a(5, 8);
              b5.jdMethod_case("---------PCGamble.m_nCircle----------=" + by.e);
              a5.eQ.a(2097153);
              by.jdField_else_of_type_Boolean = true;
              break;
            }
          }
          else if ((((ba)localObject5).q()) && (((ah)localObject5).aj().equals("结算")))
          {
            i3 = Integer.parseInt(((ah)localObject8).aj());
            int i4 = (i4 = Integer.parseInt(((ah)localObject10).aj())) + i3;
            ((ah)localObject8).a("0");
            ((ah)localObject10).a("" + i4);
            ((ah)localObject5).a("开局");
            ((ao)localObject1).a("开局", 0);
            by.do = false;
            by.f = false;
            by.e = 0;
            by.long = 0;
            for (int i2 = 0; i2 < 7; i2++)
              by.try[i2].jdMethod_void("0");
            by.jdField_new_of_type_Int = 0;
            by.a = 0;
            by.jdField_b_of_type_Boolean = false;
            by.void = false;
            by.jdField_if_of_type_Byte = 0;
          }
        }
        else if (this.g9 == 2621443)
        {
          localObject1 = (a9)a5.es.cf().elementAt(4);
          localObject5 = (a9)a5.es.cf().elementAt(6);
          localObject9 = (ay)cf().elementAt(7);
          localObject10 = ((a9)localObject1).cc().toString().trim();
          localObject12 = ((a9)localObject5).cc().toString().trim();
          if ((((ba)localObject1).q()) || (((ba)localObject5).q()))
          {
            if ((localObject10 != null) && (!((String)localObject10).equals("")) && (localObject12 != null) && (!((String)localObject12).equals("")))
            {
              b4.d = (String)localObject10;
              b4.if = (String)localObject12;
              if (((ay)localObject9).bj() == 0)
              {
                b4.byte = b4.goto = a5.n();
                a5.eQ.a(2621451);
                break;
              }
              if (((ay)localObject9).bj() == 1)
              {
                a5.eQ.a(2621447);
                br.c6();
                break;
              }
            }
            else
            {
              b5.a(4, 6, "请输入充值卡卡号和密码", "请输入充值卡卡号", "请输入充值卡密码");
              break;
            }
          }
          else if (((ba)localObject9).q())
            if (((ay)localObject9).bm() == ((ay)localObject9).bj())
            {
              if ((localObject10 != null) && (!((String)localObject10).equals("")) && (localObject12 != null) && (!((String)localObject12).equals("")))
              {
                b4.d = (String)localObject10;
                b4.if = (String)localObject12;
                if (((ay)localObject9).bj() == 0)
                {
                  b4.byte = b4.goto = a5.n();
                  a5.eQ.a(2621451);
                  break;
                }
                if (((ay)localObject9).bj() == 1)
                {
                  a5.eQ.a(2621447);
                  br.c6();
                  break;
                }
              }
              else
              {
                as.a(0, "请输入充值卡卡号或密码", "确定", "", -1, -2);
                break;
              }
            }
            else
              ((ay)localObject9).jdMethod_char(((ay)localObject9).bm());
        }
        else if (this.g9 == 2621445)
        {
          localObject1 = (a9)a5.es.cf().elementAt(4);
          localObject5 = (a9)a5.es.cf().elementAt(6);
          localObject9 = (ay)cf().elementAt(7);
          localObject10 = (ay)cf().elementAt(8);
          localObject12 = ((a9)localObject1).cc().toString().trim();
          localObject14 = ((a9)localObject5).cc().toString().trim();
          if ((((ba)localObject1).q()) || (((ba)localObject5).q()))
          {
            if ((localObject12 != null) && (!((String)localObject12).equals("")) && (localObject14 != null) && (!((String)localObject14).equals("")))
            {
              b4.d = (String)localObject12;
              b4.if = (String)localObject14;
              b4.case = Integer.parseInt(localObject10.be()[localObject10.bm()]);
              if (((ay)localObject9).bj() == 0)
              {
                b4.byte = b4.goto = a5.n();
                a5.eQ.a(2621451);
                break;
              }
              if (((ay)localObject9).bj() == 1)
              {
                a5.eQ.a(2621447);
                br.c6();
                break;
              }
            }
            else
            {
              b5.a(4, 6, "请输入充值卡卡号和密码", "请输入充值卡卡号", "请输入充值卡密码");
              break;
            }
          }
          else if (((ba)localObject9).q())
            if (((ay)localObject9).bm() == ((ay)localObject9).bj())
            {
              if ((localObject12 != null) && (!((String)localObject12).equals("")) && (localObject14 != null) && (!((String)localObject14).equals("")))
              {
                b4.d = (String)localObject12;
                b4.if = (String)localObject14;
                b4.case = Integer.parseInt(localObject10.be()[localObject10.bm()]);
                if (((ay)localObject9).bj() == 0)
                {
                  b4.byte = b4.goto = a5.n();
                  a5.eQ.a(2621451);
                  break;
                }
                if (((ay)localObject9).bj() == 1)
                {
                  a5.eQ.a(2621447);
                  br.c6();
                  break;
                }
              }
              else
              {
                as.a(0, "请输入充值卡卡号或密码", "确定", "", -1, -2);
                break;
              }
            }
            else
              ((ay)localObject9).jdMethod_char(((ay)localObject9).bm());
        }
        else if (this.g9 == 2621447)
        {
          localObject1 = (a9)a5.es.cf().elementAt(5);
          localObject5 = (a9)a5.es.cf().elementAt(7);
          localObject9 = (ay)a5.es.cf().elementAt(8);
          localObject10 = ((a9)localObject1).cc().toString().trim();
          localObject12 = ((a9)localObject5).cc().toString().trim();
          if ((((ba)localObject1).q()) || (((ba)localObject5).q()))
          {
            if ((localObject10 != null) && (!((String)localObject10).equals("")) && (localObject12 != null) && (!((String)localObject12).equals("")))
            {
              b4.byte = (String)localObject10;
              b4.goto = a5.n();
              if (((ay)localObject9).bm() == 0)
                b4.char = true;
              else if (((ay)localObject9).bm() == 1)
                b4.char = false;
              if (!((String)localObject10).equals(localObject12))
              {
                as.a(0, "您输入的通行证账号不正确", "确定", "", -1, -100);
                break;
              }
              a5.eQ.a(2621451);
              break;
            }
            b5.a(5, 7, "请输入", "您要充值的通行证", "确认您的通行证");
          }
        }
        else
        {
          if (((this.g9 != 3342337) && (this.g9 != 3342338) && (this.g9 != 3342339) && (this.g9 != 1900552) && (this.g9 != 1703954) && (this.g9 != 1703948) && (this.g9 != 1376267) && (this.g9 != 655363) && (this.g9 != 393231)) || (!am.jdField_else_of_type_Boolean))
            break;
          a5.eQ.a(3342340);
          br.c6();
        }
      }
      else if (a5.jdMethod_byte(2))
      {
        switch (this.g9)
        {
        case 2555905:
          r(35);
        }
      }
      else if (a5.jdMethod_byte(4))
      {
        switch (this.g9)
        {
        case 2555905:
          if (az.h == 1)
            return;
          r(36);
        }
      }
      else
      {
        if (!a5.jdMethod_byte(8))
          break;
        switch (this.g9)
        {
        case 2555905:
          r(37);
        }
      }
    }
    if ((a5.es != null) && (!a5.eQ.e))
    {
      int i = 0;
      int n = this.hc.size();
      while (i < n)
      {
        if (((localObject9 = (ba)this.hc.elementAt(i)) instanceof ae))
          ((ae)localObject9).U();
        if ((localObject9 instanceof bn))
          ((bn)localObject9).cZ();
        i++;
      }
      if (this.hf != null)
        if ((this.hf instanceof r))
        {
          this.hf.f();
        }
        else
        {
          this.hf.f();
          this.hf.a(this);
        }
      Object localObject2;
      Object localObject6;
      if ((this != null) && ((this.g9 == 262147) || (this.g9 == 262176)) && (a5.jdMethod_byte(2048)))
      {
        localObject2 = (ba)a5.es.cf().elementAt(4);
        localObject6 = (ba)a5.es.cf().elementAt(5);
        if (((ba)localObject2).q())
        {
          ((ba)localObject2).a(false, this);
          ((ba)localObject6).a(true, this);
        }
        else if (((ba)localObject6).q())
        {
          ((ba)localObject6).a(false, this);
          ((ba)localObject2).a(true, this);
        }
      }
      if ((this.g9 == 1900548) && (a5.jdMethod_byte(2048)))
        a5.eQ.a(1900548);
      if (this.g9 == 1900546)
      {
        if (a5.jdMethod_byte(2048))
        {
          if (bw.e)
            a5.eQ.a(1900546);
          else
            a5.eQ.a(1900554);
        }
        else if ((a5.jdMethod_try(16384)) && (!cl()))
        {
          if ((bw.void = (short)(bw.void - 1)) < 1)
            bw.void = 1;
          else if (bw.e)
            a5.eQ.a(1900546);
          else
            a5.eQ.a(1900554);
        }
        else if ((a5.jdMethod_try(32768)) && (!cl()))
          if ((bw.void = (short)(bw.void + 1)) > bw.c)
            bw.void = bw.c;
          else if (bw.e)
            a5.eQ.a(1900546);
          else
            a5.eQ.a(1900554);
      }
      else if ((this.g9 == 2425024) || (this.g9 == 2425077))
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
          cz();
        else if (a5.jdMethod_try(4096))
        {
          if (--g3 < 0)
            g3 = hE.length - 1;
        }
        else if ((a5.jdMethod_try(8192)) && (++g3 > hE.length - 1))
          g3 = 0;
      }
      else if (this.g9 == 2621446)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          localObject2 = (ah)cf().elementAt(4);
          localObject6 = (ah)cf().elementAt(5);
          if (((ba)localObject2).q())
          {
            a5.eQ.a(2621449);
          }
          else if (((ba)localObject6).q())
          {
            a5.eQ.a(2621448);
            br.c6();
          }
        }
      }
      else if (this.g9 == 2424839)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          bo.char = 20;
          if (bo.t == 0)
          {
            if ((a5.dU) || ((bo.q != 3) && (bo.q != 8)))
            {
              as.cH = 20;
              as.a(1, "请您输入数量", "确定", "返回", 2424993, -1, -1, -1);
              a5.gQ.jdMethod_goto(1);
            }
            else
            {
              as.aY();
            }
          }
          else if (bo.t == 1)
            if ((a5.dU) || ((bo.q != 3) && (bo.q != 8)))
              a5.eQ.a(2424993);
            else
              as.aY();
        }
      }
      else if (this.g9 == 2424995)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          bo.D = true;
          bo.char = 20;
          if (bo.g[bo.N] == 0)
          {
            if ((a5.dU) || ((bo.q != 3) && (bo.q != 8)))
            {
              as.cH = 20;
              as.a(1, "请您输入数量", "确定", "返回", 2424993, -1, -1, -1);
              a5.gQ.jdMethod_goto(1);
            }
            else
            {
              as.aY();
            }
          }
          else if (bo.g[bo.N] == 1)
            if ((a5.dU) || ((bo.q != 3) && (bo.q != 8)))
            {
              if (a5.jdMethod_for((localObject2 = (ak)cf().elementAt(15)).v(), ((ba)localObject2).jdMethod_long(), ((ba)localObject2).jdMethod_for(), ((ba)localObject2).z()))
                return;
              a5.eQ.a(2424993);
            }
            else
            {
              as.aY();
            }
        }
      }
      else if (this.g9 == 2297615)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          localObject2 = (a9)cf().elementAt(4);
          localObject6 = (a9)cf().elementAt(5);
          if ((((ba)localObject2).q()) || (((ba)localObject6).q()))
          {
            a5.hC[0] = ((a9)localObject2).cc().toString().trim();
            a5.hC[1] = ((a9)localObject6).cc().toString().trim();
            if ((a5.hC[0] == null) || (a5.hC[0].equals("")) || (a5.hC[1] == null) || (a5.hC[1].equals("")))
            {
              b5.jdMethod_for(4, 5);
              return;
            }
            if (a5.hC[0].equals(""))
            {
              localObject9 = "您输入的账号或密码有错误，请重新输入！";
              a5.a(0, (String)localObject9, "确定", "", -3, -120);
              return;
            }
            if (a5.hC[1].equals(""))
            {
              localObject9 = "您输入的账号或密码有错误，请重新输入！";
              a5.a(0, (String)localObject9, "确定", "", -3, -120);
              return;
            }
            a5.eQ.a(2297615);
          }
        }
      }
      else if (this.g9 == 2297358)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
          if ((localObject2 = (a9)cf().elementAt(4)).q())
          {
            a5.hC[0] = ((a9)localObject2).cc().toString().trim();
            a5.hC[1] = "";
            if ((a5.hC[0] == null) || (a5.hC[0].equals("")))
            {
              b5.jdMethod_if(4);
              return;
            }
            if (a5.hC[0].equals(""))
            {
              localObject6 = "您输入的账号或密码有错误，请重新输入！";
              a5.a(0, (String)localObject6, "确定", "", -3, -120);
              return;
            }
            a5.eQ.a(2297615);
          }
      }
      else if (this.g9 == 1703958)
      {
        if (a5.jdMethod_byte(2048))
        {
          localObject2 = (bv)cf().elementAt(3);
          localObject6 = (ak)cf().elementAt(4);
          if (((ba)localObject2).q())
          {
            ((ba)localObject2).a(false, this);
            ((ba)localObject6).a(true, this);
            ((ak)localObject6).ap();
          }
          else if (((ba)localObject6).q())
          {
            ((ba)localObject2).a(true, this);
            ((ba)localObject6).a(false, this);
          }
        }
      }
      else if (this.g9 == 2425008)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          br.c6();
          localObject2 = (ah)a5.es.cf().elementAt(3);
          localObject6 = (ah)a5.es.cf().elementAt(4);
          localObject9 = (ah)a5.es.cf().elementAt(5);
          localObject10 = (ah)a5.es.cf().elementAt(6);
          localObject12 = (ah)a5.es.cf().elementAt(7);
          if (((ba)localObject2).q())
          {
            a5.eQ.a(2425029);
          }
          else if (((ba)localObject6).q())
          {
            (a5.es = e.a("/cm/ui/charge.ui")).g9 = -1610612697;
            (localObject14 = (a9)a5.es.cf().elementAt(5)).jdMethod_if(100L);
          }
          else if (((ba)localObject9).q())
          {
            a5.eQ.a(2425010);
            a5.a(0, "请稍候...", "", "", -120, -120);
            (a5.es = e.a("/cm/ui/remain.ui")).g9 = -1610612696;
            (localObject14 = (ak)a5.es.cf().elementAt(3)).jdMethod_if("");
          }
          else if (((ba)localObject10).q())
          {
            a5.eQ.a(2425011);
            a5.a(0, "请稍候...", "", "", -120, -120);
            (a5.es = e.a("/cm/ui/detail.ui")).g9 = -1610612695;
            (localObject14 = (ak)a5.es.cf().elementAt(3)).jdMethod_if("");
          }
          else if (((ba)localObject12).q())
          {
            (a5.es = e.a("/cm/ui/phelp.ui")).g9 = -1610612686;
            (localObject14 = (ak)a5.es.cf().elementAt(3)).ap();
          }
        }
      }
      else if (this.g9 == -1610612688)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          localObject2 = (ah)a5.es.cf().elementAt(4);
          localObject6 = (ah)a5.es.cf().elementAt(5);
          localObject9 = (ah)a5.es.cf().elementAt(6);
          localObject10 = (ah)a5.es.cf().elementAt(7);
          if (((ba)localObject2).q())
          {
            ci();
          }
          else if (((ba)localObject6).q())
          {
            br.c6();
            a5.eQ.a(2425010);
            a5.a(0, "请稍候...", "", "", -120, -120);
            (a5.es = e.a("/cm/ui/remain.ui")).g9 = -1610612696;
            (localObject12 = (ak)a5.es.cf().elementAt(3)).jdMethod_if("");
          }
          else if (((ba)localObject9).q())
          {
            br.c6();
            a5.eQ.a(2425011);
            a5.a(0, "请稍候...", "", "", -120, -120);
            (a5.es = e.a("/cm/ui/detail.ui")).g9 = -1610612695;
            (localObject12 = (ak)a5.es.cf().elementAt(3)).jdMethod_if("");
          }
          else if (((ba)localObject10).q())
          {
            ci();
            ci();
          }
        }
      }
      else if (this.g9 == -1610612696)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          localObject2 = (ah)a5.es.cf().elementAt(4);
          localObject6 = (ah)a5.es.cf().elementAt(5);
          localObject9 = (ah)a5.es.cf().elementAt(6);
          if (((ba)localObject2).q())
          {
            br.c6();
            (a5.es = e.a("/cm/ui/charge.ui")).g9 = -1610612697;
            (localObject10 = (a9)a5.es.cf().elementAt(5)).jdMethod_if(100L);
          }
          else if (((ba)localObject6).q())
          {
            br.c6();
            a5.eQ.a(2425011);
            a5.a(0, "请稍候...", "", "", -120, -120);
            (a5.es = e.a("/cm/ui/detail.ui")).g9 = -1610612695;
            (localObject10 = (ak)a5.es.cf().elementAt(3)).jdMethod_if("");
          }
          else if (((ba)localObject9).q())
          {
            ci();
          }
        }
      }
      else if (this.g9 == -1610612695)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          br.c6();
          localObject2 = (ah)a5.es.cf().elementAt(4);
          localObject6 = (ah)a5.es.cf().elementAt(5);
          if (((ba)localObject2).q())
            (a5.es = e.a("/cm/ui/pcrecord.ui")).g9 = -1610612640;
          else if (((ba)localObject6).q())
            (a5.es = e.a("/cm/ui/pbrecord.ui")).g9 = -1610612639;
        }
      }
      else if (this.g9 == -1610612640)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
          if ((bk.jdField_if_of_type_Byte = (byte)((localObject2 = (ay)a5.es.cf().elementAt(3)).bm() + 1)) == 2)
          {
            as.cH = 999999;
            as.a(1, "请输入查询年月：\n（例：200906）", "确定", "取消", -1610612640, -1, -1, -1);
            a5.gQ.cA = 6;
          }
          else
          {
            a5.a(0, "请稍候...", "", "", -120, -120);
            a5.eQ.a(2425012);
          }
      }
      else if (this.g9 == -1610612639)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          localObject2 = (ay)a5.es.cf().elementAt(3);
          bk.jdField_if_of_type_Byte = (byte)((localObject6 = (ay)a5.es.cf().elementAt(5)).bm() + 1);
          switch (((ay)localObject2).bm())
          {
          case 0:
            bk.ay = 3;
            break;
          case 1:
            bk.ay = 5;
            break;
          case 2:
            bk.ay = 13;
          }
          if (bk.jdField_if_of_type_Byte == 2)
          {
            as.cH = 999999;
            as.a(1, "请输入查询年月：\n（例：200906）", "确定", "取消", -1610612639, -1, -1, -1);
            a5.gQ.cA = 6;
          }
          else
          {
            a5.a(0, "请稍候...", "", "", -120, -120);
            a5.eQ.a(2425013);
          }
        }
      }
      else if (this.g9 == 2424993)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          localObject2 = (ah)a5.es.cf().elementAt(4);
          localObject6 = (ah)a5.es.cf().elementAt(5);
          if (((ba)localObject2).q())
            ci();
          else if (((ba)localObject6).q())
            a5.A();
        }
      }
      else if (this.g9 == -1610612638)
      {
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          a5.hC[0] = null;
          a5.hC[1] = null;
          localObject2 = (a9)a5.es.cf().elementAt(9);
          a5.hC[0] = ((a9)localObject2).cc().toString().trim();
          localObject6 = (a9)a5.es.cf().elementAt(10);
          a5.hC[1] = ((a9)localObject6).cc().toString().trim();
          a5.fc[0] = a5.hC[0];
          a5.fc[1] = a5.hC[1];
          if ((a5.hC[0] == null) || (a5.hC[0].equals("")) || (a5.hC[1] == null) || (a5.hC[1].equals("")))
          {
            b5.a();
            return;
          }
          localObject9 = "账号：" + a5.hC[0] + "\n" + "密码：" + a5.hC[1] + "\n" + "是否确定此账号、密码？";
          as.a(0, (String)localObject9, "确定", "修改", -28, -1);
        }
      }
      else if ((this.g9 == 2425079) && (a5.jdMethod_byte(196608)))
        a5.eQ.a(2425080);
      if (this.g9 == -1610612687)
        if (a5.jdMethod_byte(4096))
        {
          if (this.gS >= 3)
          {
            this.gS -= 3;
            return;
          }
        }
        else if (a5.jdMethod_byte(8192))
        {
          if (this.gS <= a5.cJ.jdField_int - 1 - 3)
          {
            this.gS += 3;
            return;
          }
        }
        else if (a5.jdMethod_byte(16384))
        {
          this.gS -= 1;
          if (this.gS < 0)
          {
            this.gS = 0;
            return;
          }
        }
        else if (a5.jdMethod_byte(32768))
        {
          this.gS += 1;
          if (this.gS > a5.cJ.jdField_int - 1)
          {
            this.gS = (a5.cJ.jdField_int - 1);
            return;
          }
        }
        else if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          if (gu.B.length() + 4 >= 30)
          {
            as.a(5, "您输入的聊天字数已达上限！", "确定", "", -1, -2);
            return;
          }
          a3 tmp10504_10501 = gu;
          tmp10504_10501.B = (tmp10504_10501.B + "#" + a5.es.gS);
          gu.jdMethod_if(false);
        }
    }
  }

  public static void ci()
  {
    try
    {
      if (at.int[0] != -1)
      {
        a5.es.cg();
      }
      else
      {
        int i = 1;
        int j;
        int i1;
        Object localObject2;
        ay localay2;
        ay localay1;
        Object localObject1;
        switch (a5.es.g9)
        {
        case 1638421:
          bt.a();
          break;
        case 458773:
          gu.jdMethod_if(false);
          i = 0;
          break;
        case 262193:
          gu.jdMethod_if(false);
          i = 0;
          break;
        case -1610612687:
          gu.jdMethod_if(false);
          i = 0;
          break;
        case 1703969:
          i = 0;
          break;
        case -1610612728:
          j = 0;
          i1 = 0;
          for (int i2 = 0; i2 < 5; i2++)
          {
            localObject2 = (ay)(localObject2 = a5.es).hc.elementAt(i2 + 3);
            if (i2 == 0)
              i1 = (short)((ay)localObject2).bm();
            else
              j = (short)(j | ((ay)localObject2).bm() << i2 - 1);
          }
          a5.dM = j;
          a5.gn = (byte)i1;
          b5.a(new short[] { a5.dM, i1 }, "showSetup");
          a5.J();
          if ((l.a().jdField_try == 1) && (l.a() != bp.ag()) && (i1 == 2))
          {
            l.jdMethod_do(bp.ag());
            bp.ag().aA();
          }
          a5.eQ.a(196632);
          break;
        case 458760:
          au.a = 0;
          am.a();
          break;
        case 917505:
          au.int = -1;
          au.a = 0;
          break;
        case -1610612699:
          j = 0;
          for (i1 = 0; i1 < 5; i1++)
          {
            localay2 = (ay)(localObject2 = a5.es).hc.elementAt(i1 + 4);
            j = (short)(j | localay2.bm() << i1);
          }
          ad.I = j;
          a5.eQ.a(655362);
          break;
        case -1610612727:
          a5.gK = i1 = (localay1 = (ay)(localObject2 = a5.es).hc.elementAt(3)).bm();
          if (bp.ag().r() < 20)
            a5.eQ.a(196635);
          a5.hi = (byte)((localay2 = (ay)(localObject2 = a5.es).hc.elementAt(9)).bm() ^ 0x1);
          b5.a(new byte[] { a5.hi }, "quantitySetup");
          b5.a(new byte[] { a5.gK }, "pvpSetup" + a5.gG);
          a5.eQ.a(196637);
          break;
        case -1610612734:
          b2.a();
          b2.try.jdMethod_else();
          break;
        case -1610612735:
          b5.a(bv.ju, "gameKey" + a5.gG);
          a5.iq = b5.jdMethod_int("gameKey" + a5.gG, a5.iH.length);
          break;
        case 1703937:
        case 1703938:
        case 1703952:
          r.ed();
          q.a();
          break;
        case 1703945:
          q.t = 0;
          break;
        case 720910:
          bu.q = (localay1 = (ay)(localObject2 = a5.es).hc.elementAt(3)).bj();
          a5.eQ.a(720903);
          break;
        case 720913:
          a5.eQ.a(720912);
          break;
        case 720915:
        case 720916:
          a5.eQ.a(720917);
          break;
        case 1900547:
          bw.jdMethod_if(2);
          break;
        case 1638401:
          bt.else = "";
          bt.case = "";
          break;
        case 1835009:
          i.goto = "";
          i.int = "";
          break;
        case 1966081:
          if (au.jdField_if_of_type_Byte == 2)
          {
            a5.eQ.a(917507);
          }
          else if (au.jdField_if_of_type_Byte == 1)
          {
            r.mp = au.int;
            a5.eQ.a(458753);
          }
          au.int = -1;
          au.try = -1;
          break;
        case 1966087:
        case 1966089:
          for (int k = 0; k < a5.d6.size() - 1; k++)
            a5.d6.removeElementAt(a5.d6.size() - 1);
          au.int = -1;
          au.try = -1;
          break;
        case 1703946:
          r localr1 = (r)(localObject2 = a5.es).hc.elementAt(10);
          if ((localObject1 = (be)a5.d6.elementAt(a5.d6.size() - 1)) == null)
            break;
          for (int i3 = 0; i3 < q.int.length; i3++)
          {
            (localObject2 = (a7)(localObject2 = localObject1).hc.elementAt(i3 + 7)).fC = (byte)q.int[i3][2];
            short s = q.int[i3][1];
            ((a7)localObject2).ft = true;
            ((a7)localObject2).jdMethod_if(s, false);
            ((a7)localObject2).a(a5.gg);
            if (q.int[i3][3] == 1)
            {
              if (localr1.nv[q.int[i3][0]] != 0)
                ((a7)localObject2).a(true, 1);
              else
                ((a7)localObject2).g(false);
            }
            else
            {
              localr1.nv[i3] = true;
              if (q.int[i3][3] > 0)
                ((a7)localObject2).a(true, (byte)q.int[i3][3]);
              else
                ((a7)localObject2).g(false);
            }
          }
          break;
        case 917525:
        case 2031621:
        case 2031636:
        case 3342356:
          aq.jdMethod_if();
          break;
        case 2228225:
        case 2228256:
          aj.a();
          break;
        case 1966100:
          au.for = 0;
          for (int m = 0; m < r.mY.length; m++)
            r.mY[m] = -1;
          au.int = -1;
          au.try = -1;
          au.char = -1;
          au.for = 0;
          au.byte = -1;
          au.do = -1;
          break;
        case 1966097:
          a7 locala7 = (a7)(localObject2 = a5.es).hc.elementAt(4);
          localObject1 = (a7)(localObject2 = a5.es).hc.elementAt(6);
          r localr2 = (r)(localObject2 = a5.es).hc.elementAt(7);
          for (int i4 = 0; i4 < r.mY.length; i4++)
            r.mY[i4] = -1;
          locala7.g(false);
          locala7.ft = false;
          locala7.a(null);
          ((a7)localObject1).g(false);
          ((a7)localObject1).ft = false;
          ((a7)localObject1).a(null);
          localr2.a(false, a5.es);
          locala7.a(true, a5.es);
          ((ba)localObject1).a(false, a5.es);
          locala7.g(false);
          locala7.ft = false;
          locala7.a(null);
          ((a7)localObject1).g(false);
          ((a7)localObject1).ft = false;
          ((a7)localObject1).a(null);
          au.int = -1;
          au.try = -1;
          au.char = -1;
          au.for = 0;
          au.byte = -1;
          break;
        case 2097155:
          if (by.jdField_else_of_type_Boolean)
            break;
          by.do = false;
          by.int = 0;
          by.e = 0;
          by.c = 0;
          by.jdField_b_of_type_Boolean = false;
          by.void = false;
          by.f = false;
          by.d = false;
          by.jdField_if_of_type_Byte = 0;
          by.case = 0;
          by.jdField_new_of_type_Int = 0;
          by.a = 0;
          by.long = 0;
          by.c = 0;
          for (int n = 0; n < 7; n++)
            by.try[n] = null;
          break;
        case 524292:
          if (!ao.ci)
            break;
          as.a(35, "已有天赋增加了点数，是否退出？", "是", "否", -2, -2);
          i = 0;
          break;
        case 1703959:
        case 1703960:
        case 1703961:
          a5.iE = false;
          break;
        case 1703972:
          i = 0;
          break;
        case 393225:
        case 393229:
          y.S = false;
          break;
        case 1245185:
          g1 = false;
          y.S = false;
          y.M = false;
          break;
        case 1703971:
          if (q.b != 5)
            break;
          i = 0;
          break;
        case 2555905:
          if (az.else != 0)
            az.else = 0;
          az.m = 0;
          a5.eQ.a(2555952);
          break;
        case 2555936:
          if (az.for != 1)
            break;
          az.for = -1;
          break;
        case 2555908:
        case 2555911:
        case 2555957:
          a5.eQ.a(2555973);
          break;
        case 2555941:
        case 2555943:
        case 2555945:
          if (a5.es.g9 == 2555945)
            az.char = 1;
          else if (a5.es.g9 == 2555943)
            az.char = 2;
          else if (a5.es.g9 == 2555941)
            az.char = 3;
          a5.eQ.a(2555974);
          break;
        case 2555906:
          az.byte = new String[3];
          az.n = 0;
          break;
        case 2425024:
        case 2425029:
        case 2425072:
          bo.q = 0;
          System.out.println("清空购买类型变量！！！");
          if ((a5.es.g9 == 2425029) && (a5.d6.size() > 1))
            a5.d6.removeElementAt(1);
          if (bo.p)
          {
            bo.p = false;
            i = 0;
            a5.eQ.a(1179658);
          }
          if (!bo.j)
            break;
          bo.j = false;
          i = 0;
          cn();
          (be.gu = new a3(6)).jdMethod_byte();
          a5.jdMethod_case(3);
          break;
        case 196641:
        case 196642:
          if (l.d)
            l.d = false;
          else
            as.a(0, "您确定退出战场吗？", "确定", "取消", 852005, -1);
          break;
        case 852020:
          l.d = false;
          if (l.goto == 3)
            break;
          l.goto = 3;
          break;
        case 2621442:
          if (bo.e <= 0)
            break;
          bo.e = 0;
          a5.eQ.a(2425024);
          break;
        case -1610612632:
          u.byte = false;
          break;
        case 3145729:
          a5.eQ.a(3145736);
          break;
        case 3145730:
          a5.eQ.a(3145737);
          break;
        case 262154:
          if (bf.if)
            bf.if = false;
          bv.jP = true;
          break;
        case 393231:
        case 655363:
        case 1703948:
        case 1703954:
        case 1900552:
        case 3342337:
        case 3342338:
        case 3342339:
          if (am.jdField_new_of_type_Int > 0)
            am.jdField_new_of_type_Int = 0;
          if (am.jdField_else_of_type_Boolean)
            am.jdField_else_of_type_Boolean = false;
          if (am.a)
            break;
          am.a = true;
          break;
        case 3342340:
          if (am.try == 0)
            break;
          am.try = 0;
        }
        if (i != 0)
        {
          if ((a5.es.g9 == 589834) || (a5.es.g9 == 655363) || (gJ))
          {
            gJ = false;
            a5.jdMethod_case(3);
            cn();
          }
          else
          {
            if ((a5.es.g9 == 2097155) && (by.jdField_else_of_type_Boolean))
              return;
            if (((a5.es.g9 == 196642) || (a5.es.g9 == 196641)) && (a5.gQ != null))
              return;
            cn();
          }
        }
        else
          return;
      }
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).getMessage();
    }
  }

  public static final void cn()
  {
    ad.jdMethod_new();
    int i;
    if ((i = a5.d6.size()) > 0)
    {
      Object localObject = a5.d6.elementAt(i - 1);
      a5.d6.removeElementAt(i - 1);
      if ((localObject instanceof Integer))
      {
        a5.fE.removeAllElements();
        if ((i = ((Integer)localObject).intValue()) == 0)
        {
          a5.A();
        }
        else
        {
          a5.eQ.a(i);
          return;
        }
      }
      else
      {
        if ((localObject instanceof be))
        {
          a5.fE.removeAllElements();
          (a5.es = (be)localObject).ck();
          return;
        }
        if ((localObject instanceof Vector))
        {
          a5.fE.removeAllElements();
          Vector localVector;
          if (((localObject = (localVector = (Vector)localObject).elementAt(0)) instanceof be))
          {
            a5.fE = localVector;
            (a5.es = (be)localVector.elementAt(((be)localObject).ht)).ck();
          }
          else
          {
            if ((localObject instanceof Integer))
              a5.eQ.a(localVector);
            return;
          }
        }
        else if ((localObject instanceof Byte))
        {
          byte b = ((Byte)localObject).byteValue();
          a5.es = (be)a5.fE.elementAt(b);
          ((be)a5.fE.elementAt(0)).ht = b;
          a5.es.ck();
        }
      }
      return;
    }
    else
    {
      a5.A();
      if (br.iW != null)
        a5.jdMethod_try(5);
    }
  }

  private boolean cl()
  {
    for (int i = 0; i < this.hc.size(); i++)
    {
      ba localba;
      if ((localba = (ba)this.hc.elementAt(i)).jdField_byte)
        return true;
    }
    return false;
  }

  public final void cs()
  {
    for (int i = 0; i < this.hc.size(); i++)
    {
      ba localba;
      (localba = (ba)this.hc.elementAt(i)).jdField_byte = false;
    }
  }

  private void cq()
  {
    Form localForm = new Form("修改昵称");
    TextField localTextField = new TextField("修改昵称，最多输入六个汉字或字母（包括数字）", "", 6, 0);
    localForm.append(localTextField);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    localForm.addCommand(localCommand1);
    localForm.addCommand(localCommand2);
    localForm.setCommandListener(new CommandListener(localCommand1, localTextField, localForm, localCommand2)
    {
      private final Command val$okCmd;
      private final TextField val$tf;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        if (paramCommand == this.val$okCmd)
        {
          if (a5.e0[a5.hg].equals(this.val$tf.getString()))
          {
            this.val$tf.setString("");
            paramCommand = new Alert(bm.a2[9], "请您更换昵称！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          if (!a5.a(this.val$tf.getString(), 2))
          {
            paramCommand = new Alert(bm.a2[9], "您输入的内容不符合要求，请您重新输入！", null, AlertType.ERROR);
            this.val$tf.setString("");
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          if ((this.val$tf.getString() == null) || (this.val$tf.getString().equals("")))
          {
            paramCommand = new Alert(bm.a2[9], "请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          be.gU[0] = a5.e0[a5.hg];
          be.gU[1] = this.val$tf.getString();
          a5.eQ.a(1114119);
          a5.dI.display.setCurrent(a5.e8);
          paramCommand = "请稍候...";
          a5.a(0, paramCommand, "", "", -120, -120);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$tf.setString("");
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(localForm);
  }

  private static void cp()
  {
    a5.a(0, "请稍候...", "", "", -120, -120);
    bk.Q = false;
    Object localObject;
    if (bk.m())
    {
      localObject = "/judgeserver/QueryBalance?usr=&userId=" + a5.ik + "&game=fengshen&subgame=" + "fengshen" + "&from=kong";
      (localObject = new bk(bk.void, (String)localObject, a5.dU ? 0 : 1, 3)).a(7);
      return;
    }
    bk.jdField_b_of_type_Boolean = true;
    (localObject = new bk(bk.aG, bk.aQ, a5.dU ? 0 : 1, 1)).a(7);
  }

  private static void co()
  {
    a5.a(0, "请稍候...", "", "", -120, -120);
    bk.Q = true;
    Object localObject;
    if (bk.m())
    {
      localObject = "/judgeserver/QueryBalance?usr=&userId=" + a5.ik + "&game=fengshen&subgame=" + "fengshen" + "&from=kong";
      (localObject = new bk(bk.void, (String)localObject, a5.dU ? 0 : 1, 3)).a(7);
      return;
    }
    bk.jdField_b_of_type_Boolean = true;
    (localObject = new bk(bk.aG, bk.aQ, a5.dU ? 0 : 1, 1)).a(7);
  }

  public static void cu()
  {
    ay localay1 = (ay)(localObject = a5.es).hc.elementAt(5);
    ay localay2 = (ay)(localObject = a5.es).hc.elementAt(6);
    ay localay3 = (ay)(localObject = a5.es).hc.elementAt(8);
    ak localak = (ak)(localObject = a5.es).hc.elementAt(10);
    Object localObject = (a9)(localObject = a5.es).hc.elementAt(9);
    if (localay1.q())
    {
      if (a5.ci == 1)
      {
        localak.jdMethod_if(bm.bp[0]);
        return;
      }
      if (a5.ci == 2)
      {
        localak.jdMethod_if(bm.bp[1]);
        return;
      }
    }
    else if (localay2.q())
    {
      if (a5.ck == 1)
      {
        localak.jdMethod_if(bm.bp[2]);
        return;
      }
      if (a5.ck == 2)
      {
        localak.jdMethod_if(bm.bp[3]);
        return;
      }
      if (a5.ck == 3)
      {
        localak.jdMethod_if(bm.bp[4]);
        return;
      }
      if (a5.ck == 4)
      {
        localak.jdMethod_if(bm.bp[5]);
        return;
      }
    }
    else if (localay3.q())
    {
      if (a5.ig == 1)
      {
        localak.jdMethod_if(bm.bp[6]);
        return;
      }
      if (a5.ig == 2)
      {
        localak.jdMethod_if(bm.bp[7]);
        return;
      }
      if (a5.ig == 3)
      {
        localak.jdMethod_if(bm.bp[8]);
        return;
      }
      if (a5.ig == 4)
      {
        localak.jdMethod_if(bm.bp[9]);
        return;
      }
      if (a5.ig == 5)
      {
        localak.jdMethod_if(bm.bp[10]);
        return;
      }
      if (a5.ig == 6)
      {
        localak.jdMethod_if(bm.bp[11]);
        return;
      }
    }
    else if (((ba)localObject).q())
    {
      localak.jdMethod_if("请输入昵称");
    }
  }

  private static void r(byte paramByte)
  {
    be localbe;
    for (int i = 0; i < 3; i++)
    {
      ah localah2;
      if (((localah2 = (ah)(localbe = a5.es).hc.elementAt(i + 35)).q()) && (localah2.jdField_byte))
        return;
      if (!localah2.q())
        continue;
      localah2.a(false, a5.es);
    }
    ah localah1;
    if (!(localah1 = (ah)(localbe = a5.es).hc.elementAt(paramByte)).q())
    {
      localah1.a(true, a5.es);
      localah1.af();
    }
    else if ((localah1.q()) && (!localah1.jdField_byte))
    {
      localah1.af();
    }
    for (int j = 0; j < 12; j++)
    {
      if (!(paramByte = (a7)(localbe = a5.es).hc.elementAt(j + 11)).q())
        continue;
      paramByte.a(false, a5.es);
    }
    for (j = 0; j < 6; j++)
    {
      if (!(paramByte = (a7)(localbe = a5.es).hc.elementAt(j + 25)).q())
        continue;
      paramByte.a(false, a5.es);
    }
  }

  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, byte paramByte)
  {
    if (paramByte == 1)
    {
      paramGraphics.setColor(7934208);
      paramGraphics.fillRect(paramInt1, paramInt2, 10, 8);
      paramGraphics.setColor(16721152);
      paramGraphics.fillRect(paramInt1 + 1, paramInt2 + 1, 8, 6);
      paramGraphics.setColor(7934208);
      paramGraphics.drawLine(paramInt1, paramInt2, paramInt1 + 5, paramInt2 + 5);
      paramGraphics.drawLine(paramInt1 + 9, paramInt2, paramInt1 + 4, paramInt2 + 5);
    }
    if (paramByte == 2)
    {
      paramGraphics.setColor(4144959);
      paramGraphics.fillRect(paramInt1 - 3, paramInt2, 13, 8);
      paramGraphics.fillTriangle(paramInt1 - 3, paramInt2, paramInt1 + 3, paramInt2 - 5, paramInt1 + 10, paramInt2);
      paramGraphics.setColor(8947848);
      paramGraphics.fillRect(paramInt1 - 2, paramInt2 + 1, 11, 6);
      paramGraphics.fillTriangle(paramInt1 - 2, paramInt2 + 1, paramInt1 + 3, paramInt2 - 4, paramInt1 + 10, paramInt2 + 2);
      paramGraphics.setColor(4144959);
      paramGraphics.drawLine(paramInt1 - 3, paramInt2, paramInt1 - 3 + 12, paramInt2);
      paramGraphics.drawLine(paramInt1 - 3, paramInt2, paramInt1 + 2, paramInt2 + 5);
      paramGraphics.drawLine(paramInt1 - 3 + 12, paramInt2, paramInt1 + 4, paramInt2 + 5);
      paramGraphics.fillRect(paramInt1 + 2 + 1, paramInt2 + 5, 1, 1);
    }
  }

  private static void cz()
  {
    switch (bo.q = hE[g3])
    {
    case 0:
      br.dm();
      a5.eQ.a(2425029);
      return;
    case 1:
      br.dm();
      a5.eQ.a(2425029);
      return;
    case 2:
      a5.eQ.a(2425029);
      br.c6();
      return;
    case 3:
      a5.eQ.a(2425029);
      br.c6();
      return;
    case 4:
      br.dm();
      a5.eQ.a(2621441);
      return;
    case 5:
      br.dm();
      a5.eQ.a(2621442);
      return;
    case 6:
      a5.eQ.a(new int[] { 2424834, 2424842 });
      br.c6();
      return;
    case 7:
      br.dm();
      a5.eQ.a(2425077);
      return;
    case 8:
    case 9:
    case 10:
      br.c6();
      a5.eQ.a(2425078);
      return;
    }
    System.out.println("未知消费类型！");
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     be
 * JD-Core Version:    0.6.0
 */
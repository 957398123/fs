import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bg extends ba
{
  private Vector h2;
  private v ib = null;
  private byte hT;
  private af hZ;
  private byte hN = -1;
  public boolean h5 = false;
  public static int hP = -1;
  public boolean ie = false;
  public byte h0 = -1;
  private int hQ = 0;
  private boolean hU = true;

  public bg(short paramShort1, short paramShort2, short paramShort3, short paramShort4, byte paramByte, v paramv, be parambe)
  {
    super(paramShort1, paramShort2, paramShort3, paramShort4, parambe);
    this.a = (short)(a5.ic - (this.k << 1));
    this.hT = paramByte;
    this.ib = paramv;
    this.b = true;
    if (paramv != null)
      this.hN = 0;
    this.h2 = new Vector();
  }

  public final void a(Graphics paramGraphics)
  {
    int i = this.k;
    int j = this.j;
    int k = this.a;
    int n = this.jdField_int;
    paramGraphics.setColor(bm.dt);
    paramGraphics.fillRect(i, j, k, n);
    i += 3;
    j += 1;
    k -= 6;
    n -= 2;
    paramGraphics.setColor(bm.try);
    paramGraphics.fillRect(i, j, k, n);
    i += 1;
    j += 1;
    k -= 2;
    n -= 2;
    paramGraphics.setColor(bm.dt);
    paramGraphics.fillRect(i, j, k, n);
    i += 1;
    j += 1;
    k -= 2;
    n -= 2;
    paramGraphics.setColor(bm.try);
    paramGraphics.fillRect(i, j, k, n);
    v localv2;
    if (this.ib != null)
    {
      paramGraphics.setColor(bm.ad);
      paramGraphics.fillRect(this.k + 3 + 1 + 1, this.j + 1 + 1 + 1, this.a - 10, (localv2 = this.ib).b);
      this.ib.a(paramGraphics, false);
    }
    i = this.h2.size() < cU() ? this.h2.size() : cU() + this.hQ;
    for (j = this.hQ; j < i; j++)
    {
      v localv1 = (v)this.h2.elementAt(j);
      if ((j == this.hN) && (this.hU))
      {
        paramGraphics.setColor(bm.ab);
        paramGraphics.fillRect(localv1.jdMethod_try(), localv1.jdMethod_byte(), cG() - a5.ca.getWidth(), (localv2 = localv1).b);
        localv1.a(paramGraphics, true);
      }
      else
      {
        localv1.a(paramGraphics, false);
      }
    }
    if (this.ib != null)
    {
      paramGraphics.setColor(bm.dt);
      paramGraphics.drawLine(this.k + 3 + 1 + 1, this.j + 1 + 1 + 1 + (short)(a5.iG + 2) - 1, this.k + 3 + 1 + 1 + this.a - 10, this.j + 1 + 1 + 1 + (short)(a5.iG + 2) - 1);
    }
    if (this.h2.size() > 0)
    {
      j = 1;
      int m = (localv2 = (v)this.h2.elementAt(0)).jdField_if.size();
      while (j < m)
      {
        paramGraphics.setColor(bm.dt);
        paramGraphics.drawLine(this.k + (5 + ((v)this.h2.elementAt(0)).jdMethod_if((byte)j) - 1) * a5.ic / 176, this.j + 1 + 1 + 1, this.k + (5 + ((v)this.h2.elementAt(0)).jdMethod_if((byte)j) - 1) * a5.ic / 176, this.j + 1 + 1 + 1 + cH());
        j++;
      }
    }
    if (this.hZ != null)
      this.hZ.a(paramGraphics);
  }

  public final void f()
  {
    Object localObject5;
    Object localObject9;
    Object localObject12;
    Object localObject13;
    Object localObject8;
    if (this.jdField_byte)
    {
      if (a5.jdMethod_try(4096))
      {
        if ((this.h2.size() == 0) && (this.h0 != 19) && (a5.es.g9 != 196642))
          return;
        y().c8();
        return;
      }
      if (a5.jdMethod_try(8192))
      {
        if ((this.h2.size() == 0) && (this.h0 != 19) && (a5.es.g9 != 196642))
          return;
        y().c9();
        return;
      }
      if ((a5.jdMethod_byte(65536)) || (a5.jdMethod_byte(131072)))
      {
        y().dc();
        int i3;
        Object localObject7;
        int j;
        Object localObject1;
        int k;
        v localv2;
        Object localObject2;
        int m;
        switch (this.h0)
        {
        case 0:
          int i = ((Integer)y().db().elementAt(y().de())).intValue();
          if (this.h2.size() == 0)
          {
            if (i == 1)
              ar.a("添加好友", "请输入好友昵称：", 589833);
            return;
          }
          i3 = ((v)this.h2.elementAt(this.hN)).jdField_new;
          a9 locala9;
          switch (i)
          {
          case -1610612726:
            localObject9 = (localObject7 = (ah)(localObject7 = localObject5 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj();
            a3.a(i3, (String)localObject9, true);
            break;
          case 720897:
            bu.k = i3;
            a5.eQ.a(i);
            break;
          case 589827:
          case 589829:
            hP = i3;
            a5.eQ.a(i);
            break;
          case 589831:
            hP = i3;
            a5.eQ.a(i);
            break;
          case -1610612729:
            int i12 = ((v)this.h2.elementAt(this.hN)).jdField_new;
            localObject13 = (ah)(localObject7 = localObject12 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2);
            q.n = i12;
            q.f[0] = ((ah)localObject13).aj();
            be.cn();
            (locala9 = (a9)a5.es.cf().elementAt(3)).jdMethod_void(q.f[0]);
            break;
          case 589846:
            a5.A();
            a5.aj();
            hP = i3;
            a5.eQ.a(locala9);
            break;
          case 1:
            ar.a("添加好友", "请输入好友昵称：", 589833);
          }
          this.jdField_byte = false;
          break;
        case 15:
          j = ((Integer)y().db().elementAt(y().de())).intValue();
          hP = i3 = ((v)this.h2.elementAt(this.hN)).jdField_new;
          if (j == -1610612726)
          {
            localObject9 = (localObject7 = (ah)(localObject7 = localObject5 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj();
            a3.a(i3, (String)localObject9, true);
          }
          else
          {
            if (j == 720897)
              bu.k = i3;
            if (j == 589831)
              hP = i3;
            if ((j == 2490407) || (j == 2490417))
              c.a = i3;
            a5.eQ.a(j);
          }
          this.jdField_byte = false;
          break;
        case 1:
          if ((j = ((Integer)y().db().elementAt(y().de())).intValue()) == 1)
          {
            ar.a("添加黑名单", "请输入玩家昵称：", 589847);
          }
          else
          {
            hP = ((v)this.h2.elementAt(this.hN)).jdField_new;
            b5.jdMethod_case("选中玩家ID：" + hP);
            a5.eQ.a(j);
          }
          this.jdField_byte = false;
          break;
        case 2:
          hP = ((v)this.h2.elementAt(this.hN)).jdField_new;
          b5.jdMethod_case("选中玩家ID：" + hP);
          switch (j = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case 720897:
            bu.k = hP;
            break;
          case 1638405:
            bt.f = hP;
            break;
          case 1835013:
            i.long = hP;
            break;
          case -1610612726:
            localObject1 = (v)this.h2.elementAt(this.hN);
            a3.a(hP, ((ah)(localObject7 = localObject1).jdField_if.elementAt(2)).aj(), true);
            break;
          }
          a5.eQ.a(j);
          this.jdField_byte = false;
          break;
        case 3:
          break;
        case 5:
          v localv1;
          localObject5 = (localObject1 = (ah)(localObject7 = localv1 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj();
          be.cn();
          a3.a(((v)this.h2.elementAt(this.hN)).jdField_new, (String)localObject5, false);
          break;
        case 7:
          k = ((Integer)y().db().elementAt(y().de())).intValue();
          int i4 = ((v)this.h2.elementAt(this.hN)).jdField_new;
          if (k != -1)
          {
            localObject5 = (v)this.h2.elementAt(this.hN);
            switch (k)
            {
            case -1610612726:
              a3.a(i4, ((ah)(localObject7 = localObject5).jdField_if.elementAt(2)).aj(), true);
              break;
            case 589835:
              hP = i4;
              a5.eQ.a(k);
              break;
            case 589831:
            case 1638444:
              hP = i4;
              a5.eQ.a(k);
              break;
            case 1638411:
            case 1638412:
            case 1638415:
              bt.f = i4;
              a5.eQ.a(k);
              break;
            case 1638409:
            case 1638410:
              bt.f = i4;
              bt.jdMethod_if(k);
              break;
            case 1638408:
            case 1638413:
            case 1638416:
              bt.jdMethod_if(k);
              break;
            case 1835030:
              i.long = i4;
              a5.eQ.a(k);
              break;
            case 1835035:
              i.long = i4;
              i.jdMethod_if(k);
            }
          }
          this.jdField_byte = false;
          break;
        case 6:
          q.g = this.hN;
          q.long = ((v)this.h2.elementAt(this.hN)).jdField_try;
          if ((k = ((Integer)y().db().elementAt(y().de())).intValue()) == -1)
            break;
          if (k == 0)
          {
            this.jdField_byte = false;
            as.a(0, "您确定要删除所有邮件？", "是", "否", -250, -1);
            return;
          }
          a5.eQ.a(k);
          this.jdField_byte = false;
          break;
        case 8:
          k = ((Integer)y().db().elementAt(y().de())).intValue();
          if (this.h2.size() == 0)
          {
            if (k == -1610612703)
              ar.a("添加仇人", "请输入仇人昵称：", 589848);
          }
          else
          {
            hP = ((v)this.h2.elementAt(this.hN)).jdField_new;
            if (k == -1610612708)
              as.a(0, "您确定要从仇人列表中删除此人吗？", "确定", "取消", 589842, -1);
            else if (k == -1610612703)
              ar.a("添加仇人", "请输入仇人昵称：", 589848);
            else
              a5.eQ.a(k);
          }
          this.jdField_byte = false;
          break;
        case 10:
          k = ((Integer)y().db().elementAt(y().de())).intValue();
          a5.eQ.a(k);
          this.jdField_byte = false;
          break;
        case 11:
          if ((localObject5 = (localObject2 = (ah)(localObject7 = localv2 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj()).equals(""))
            break;
          int i9;
          if ((i9 = ((Integer)y().db().elementAt(y().de())).intValue()) == 1966082)
            au.else = 1;
          a5.eQ.a(i9);
          this.jdField_byte = false;
          break;
        case 12:
          v localv5;
          if ((localObject5 = (localObject2 = (ah)(localv5 = localv2 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj()).equals(""))
            break;
          int i10;
          if ((i10 = ((Integer)y().db().elementAt(y().de())).intValue()) == 1966092)
            au.else = 1;
          a5.eQ.a(i10);
          this.jdField_byte = false;
          break;
        case 13:
          switch (m = ((Integer)y().db().elementAt(y().de())).intValue())
          {
          case 1966101:
            au.for = this.hN;
            a5.eQ.a(1966101);
            break;
          case 1966102:
            if (!(localObject8 = (localObject5 = (ah)(localObject8 = localObject2 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj()).equals(""))
            {
              au.for = this.hN;
              a5.eQ.a(1966102);
            }
            else
            {
              as.a(0, "您所选的位置上没有宝石，请您重新选择！", "确定", "", -1, -2);
            }
            break;
          case 2031651:
            a5.eQ.a(2031651);
          }
          this.jdField_byte = false;
          break;
        case 16:
        case 17:
          m = ((Integer)y().db().elementAt(y().de())).intValue();
          az.else = ((v)this.h2.elementAt(this.hN)).jdField_new;
          if (m == 2555905)
          {
            az.m = 0;
            a5.eQ.a(2555952);
          }
          a5.eQ.a(m);
          this.jdField_byte = false;
          break;
        case 19:
          ao localao;
          if ((localao = (ao)a5.es.cf().elementAt(0)).aC().equals("总排名"))
            l.goto = y().de();
          else if (localao.aC().equals("天人排名"))
            l.goto = (byte)(y().de() + 1);
          else if ((localao.aC().equals("修罗排名")) && ((l.goto = y().de()) == 2))
            l.goto = 3;
          int i5;
          if (((i5 = ((Integer)y().db().elementAt(y().de())).intValue()) == 196641) && (this.h2.size() == 0))
          {
            as.a(0, "该排名榜没有信息！", "确定", "", -1, -2);
            this.jdField_byte = false;
            return;
          }
          a5.eQ.a(i5);
          this.ie = false;
          this.jdField_byte = false;
          break;
        case 20:
          int n = ((Integer)y().db().elementAt(y().de())).intValue();
          bt.l = ((v)this.h2.elementAt(this.hN)).jdField_new;
          a5.eQ.a(n);
          this.jdField_byte = false;
        case 4:
        case 9:
        case 14:
        case 18:
        }
        return;
      }
      if (a5.jdMethod_byte(262144))
      {
        this.jdField_byte = false;
        return;
      }
    }
    else
    {
      Object localObject3;
      if (a5.jdMethod_try(4096))
      {
        this.hN = (byte)(this.hN - 1);
        if (this.hN < 0)
        {
          this.hN = 0;
          this.h5 = true;
        }
        else
        {
          this.h5 = false;
        }
        if ((this.h0 == 11) || (this.h0 == 12))
        {
          v localv3;
          localObject5 = (localObject3 = (ah)(localObject8 = localv3 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj();
          if (au.case == 1)
          {
            localObject8 = (ao)a5.es.cf().elementAt(1);
            if (!((String)localObject5).equals(""))
              ((ao)localObject8).a("查看", 0);
            else
              ((ao)localObject8).a("", 0);
          }
          else if (((String)localObject5).equals(""))
          {
            (localObject8 = (ao)a5.es.cf().elementAt(1)).a("镶嵌", 0);
          }
          else
          {
            (localObject8 = (ao)a5.es.cf().elementAt(1)).a("操作", 0);
          }
        }
        localObject8 = this;
        if (this.hZ == null)
          return;
        int i1;
        int i7;
        if (this.hU)
        {
          localObject8 = this;
          if (this.hN < this.hZ.aj)
          {
            this.hQ -= 1;
            for (i1 = 0; i1 < this.h2.size(); i1++)
            {
              (localObject3 = (v)this.h2.elementAt(i1)).a((short)(((v)localObject3).jdMethod_byte() + (localObject8 = localObject3).b));
              for (i7 = 0; i7 < (localObject8 = localObject3).jdField_if.size(); i7++)
                (localObject8 = (ba)(localObject8 = localObject3).jdField_if.elementAt(i7)).jdMethod_for((short)(((ba)localObject8).jdMethod_long() + (localObject8 = localObject3).b));
            }
          }
        }
        else
        {
          this.hQ -= 1;
          if (this.hQ < 0)
            this.hQ = 0;
          else
            for (i1 = 0; i1 < this.h2.size(); i1++)
            {
              (localObject3 = (v)this.h2.elementAt(i1)).a((short)(((v)localObject3).jdMethod_byte() + (localObject8 = localObject3).b));
              for (i7 = 0; i7 < (localObject8 = localObject3).jdField_if.size(); i7++)
                (localObject8 = (ba)(localObject8 = localObject3).jdField_if.elementAt(i7)).jdMethod_for((short)(((ba)localObject8).jdMethod_long() + (localObject8 = localObject3).b));
            }
          localObject8 = this;
          i1 = (short)this.hQ;
          (localObject8 = this.hZ).aj = i1;
        }
        if (a5.es.g9 == 1703939)
          for (i1 = 0; i1 < this.h2.size(); i1++)
          {
            localObject3 = (v)this.h2.elementAt(i1);
            be.hk[i1] = (((v)localObject3).jdMethod_byte() + 9);
          }
        if (a5.es.g9 == 262157)
          bf.jdMethod_if();
        if (a5.es.g9 == 262154)
          bf.a();
      }
      else if (a5.jdMethod_try(8192))
      {
        this.hN = (byte)(this.hN + 1);
        this.h5 = false;
        if ((this.hU) && (this.hN > this.h2.size() - 1))
          this.hN = (byte)(this.h2.size() - 1);
        if ((this.h0 == 11) || (this.h0 == 12))
        {
          v localv4;
          String str = (localObject3 = (ah)(localObject8 = localv4 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj();
          if (au.case == 1)
          {
            localObject8 = (ao)a5.es.cf().elementAt(1);
            if (!str.equals(""))
              ((ao)localObject8).a("查看", 0);
            else
              ((ao)localObject8).a("", 0);
          }
          else if (str.equals(""))
          {
            (localObject8 = (ao)a5.es.cf().elementAt(1)).a("镶嵌", 0);
          }
          else
          {
            (localObject8 = (ao)a5.es.cf().elementAt(1)).a("操作", 0);
          }
        }
        localObject8 = this;
        if (this.hZ == null)
          return;
        int i2;
        int i8;
        if (this.hU)
        {
          localObject8 = this;
          localObject8 = this;
          if (this.hN >= this.hZ.aj + this.hZ.ay)
          {
            this.hQ += 1;
            for (i2 = 0; i2 < this.h2.size(); i2++)
            {
              (localObject3 = (v)this.h2.elementAt(i2)).a((short)(((v)localObject3).jdMethod_byte() - (localObject8 = localObject3).b));
              for (i8 = 0; i8 < (localObject8 = localObject3).jdField_if.size(); i8++)
                (localObject8 = (ba)(localObject8 = localObject3).jdField_if.elementAt(i8)).jdMethod_for((short)(((ba)localObject8).jdMethod_long() - (localObject8 = localObject3).b));
            }
          }
        }
        else
        {
          this.hQ += 1;
          localObject8 = this;
          if (this.hQ > this.h2.size() - cU())
          {
            localObject8 = this;
            this.hQ = (this.h2.size() - cU());
          }
          else
          {
            for (i2 = 0; i2 < this.h2.size(); i2++)
            {
              (localObject3 = (v)this.h2.elementAt(i2)).a((short)(((v)localObject3).jdMethod_byte() - (localObject8 = localObject3).b));
              for (i8 = 0; i8 < (localObject8 = localObject3).jdField_if.size(); i8++)
                (localObject8 = (ba)(localObject8 = localObject3).jdField_if.elementAt(i8)).jdMethod_for((short)(((ba)localObject8).jdMethod_long() - (localObject8 = localObject3).b));
            }
          }
          localObject8 = this;
          i2 = (short)this.hQ;
          (localObject8 = this.hZ).aj = i2;
        }
        if (a5.es.g9 == 1703939)
          for (i2 = 0; i2 < this.h2.size(); i2++)
          {
            localObject3 = (v)this.h2.elementAt(i2);
            be.hk[i2] = (((v)localObject3).jdMethod_byte() + 9);
          }
        if (a5.es.g9 == 262157)
          bf.jdMethod_if();
        if (a5.es.g9 == 262154)
          bf.a();
      }
      else if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        br localbr = new br(0);
        Object localObject6;
        Object localObject11;
        Object localObject4;
        Object localObject10;
        switch (this.h0)
        {
        case 0:
          localObject3 = null;
          localObject6 = null;
          localObject8 = null;
          if (a5.es.g9 == 1703945)
          {
            if (this.h2.size() == 0)
              return;
            localObject3 = new String[] { "收件人" };
            localObject6 = new int[] { -1610612729 };
            localObject8 = new int[] { 3 };
            localbr.a(localObject3, localObject6, localObject8);
          }
          else if (this.h2.size() == 0)
          {
            localObject3 = new String[] { "添加好友" };
            localObject6 = new int[] { 1 };
            localObject8 = new int[] { 3 };
            localbr.a(localObject3, localObject6, localObject8);
          }
          else
          {
            localObject9 = (v)this.h2.elementAt(this.hN);
            localbr.a("查看详情", 589831, 2);
            if (((v)localObject9).jdField_else)
              localbr.a("私　聊", -1610612726, 2);
            if (((bu.e == 0) || (bu.h == bp.ag().jdMethod_new())) && (((v)localObject9).jdField_else))
              localbr.a("组队邀请", 720897, 3);
            localbr.a("删除好友", 589827, 3);
            localbr.a("屏蔽此人", 589829, 0);
            if (((v)localObject9).jdField_else)
              localbr.a("传　送", 589846, 0);
            localbr.a("添加好友", 1, 3);
          }
          break;
        case 15:
          if (this.h2.size() == 0)
            break;
          localObject3 = (v)this.h2.elementAt(this.hN);
          if (a5.es.g9 == 2490390)
            localbr.a("拜　师", 2490407, 3);
          else if (a5.es.g9 == 2490391)
            localbr.a("收　徒", 2490417, 3);
          localbr.a("查　看", 589831, 2);
          if (((bu.e == 0) || (bu.h == bp.ag().jdMethod_new())) && (((v)localObject3).jdField_else))
            localbr.a("组队邀请", 720897, 3);
          if (((v)localObject3).jdField_else)
            localbr.a("私　聊", -1610612726, 2);
          localbr.a("加为好友", 589826, 3);
          break;
        case 1:
          if (this.h2.size() == 0)
          {
            localObject3 = new int[] { 1 };
            localObject6 = new int[] { 3 };
            localbr.a(new String[] { "添加黑名单" }, localObject3, localObject6);
          }
          else
          {
            localObject3 = new int[] { 589831, 589830, 1 };
            localObject6 = new int[] { 2, 3, 3 };
            localbr.a(bm.aX, localObject3, localObject6);
          }
          break;
        case 2:
          if (this.h2.size() == 0)
            return;
          int i6 = ((v)this.h2.elementAt(this.hN)).jdField_byte;
          b5.jdMethod_case("camp=" + i6);
          b5.jdMethod_case("Player.getInstance().getCamp()=" + bp.ag().o());
          if (bp.ag().o() == i6)
          {
            localObject6 = new String[] { bm.a2[6], "私聊", "加为好友", "屏蔽此人" };
            localObject8 = new int[] { 589831, -1610612726, 589826, 589829 };
            localObject9 = new int[] { 2, 2, 3, 2 };
            if ((bu.e == 0) || (bu.h == bp.ag().jdMethod_new()))
            {
              localObject11 = new String[] { "组队邀请" };
              localObject12 = new int[] { 720897 };
              localObject13 = new int[] { 3 };
              localObject6 = b5.a(localObject6, localObject6.length, localObject11);
              localObject8 = b5.a(localObject8, localObject8.length, localObject12);
              localObject9 = b5.a(localObject9, localObject9.length, localObject13);
            }
            if ((bp.ag().as() == i.for) || (bp.ag().as() == i.void))
            {
              localObject11 = new String[] { "招入麾下" };
              localObject12 = new int[] { 1835013 };
              localObject13 = new int[] { 3 };
              localObject6 = b5.a(localObject6, localObject6.length, localObject11);
              localObject8 = b5.a(localObject8, localObject8.length, localObject12);
              localObject9 = b5.a(localObject9, localObject9.length, localObject13);
            }
            else if ((bp.ag().aT() == bt.d) || (bp.ag().aT() == bt.long))
            {
              localObject11 = new String[] { "招入麾下" };
              localObject12 = new int[] { 1638405 };
              localObject13 = new int[] { 3 };
              localObject6 = b5.a(localObject6, localObject6.length, localObject11);
              localObject8 = b5.a(localObject8, localObject8.length, localObject12);
              localObject9 = b5.a(localObject9, localObject9.length, localObject13);
            }
            localbr.a(localObject6, localObject8, localObject9);
          }
          else
          {
            localObject6 = null;
            localObject8 = "添加仇人";
            localObject6 = new String[] { bm.a2[6], localObject8 };
            localObject9 = new int[] { 589831, 589841 };
            localObject11 = new int[] { 2, 3 };
            localbr.a(localObject6, localObject9, localObject11);
          }
          break;
        case 3:
          if (this.h2.size() != 0)
            break;
          return;
        case 4:
          if (this.h2.size() == 0)
            return;
          if (a5.es.g9 == 851978)
            return;
          b5.jdMethod_case("寻径！！！！！！！！！！！！！！！！！！");
          localObject4 = (v)this.h2.elementAt(this.hN);
          bp.ag().aA = new b0().a(bp.ag().l, bp.ag().q, ((v)localObject4).jdField_void, ((v)localObject4).jdField_goto);
          bp.ag().jdMethod_do(104);
          a5.A();
          a5.aj();
          return;
        case 5:
          if (this.h2.size() == 0)
            return;
          localObject4 = new int[] { -1 };
          localObject6 = new int[] { 3 };
          localbr.a(bm.S, localObject4, localObject6);
          break;
        case 7:
          if (this.h2.size() == 0)
            return;
          localObject4 = null;
          localObject6 = null;
          localObject8 = null;
          int i11 = ((v)this.h2.elementAt(this.hN)).jdField_new;
          switch (a5.es.g9)
          {
          case 1638404:
            if (i11 == bp.ag().jdMethod_new())
            {
              localObject4 = new String[] { "退出氏族" };
              localObject6 = new int[] { 1638413 };
              localObject8 = new int[] { 0 };
              if (bp.ag().aT() == bt.d)
              {
                localObject11 = new String[] { "解散氏族" };
                localObject12 = new int[] { 1638408 };
                localObject13 = new int[] { 0 };
                localObject4 = b5.a(localObject4, localObject4.length, localObject11);
                localObject6 = b5.a(localObject6, localObject6.length, localObject12);
                localObject8 = b5.a(localObject8, localObject8.length, localObject13);
              }
              else
              {
                if ((bp.ag().aT() != bt.long) && (bp.ag().aT() != 15))
                  break;
                localObject11 = new String[] { "卸任职务" };
                localObject12 = new int[] { 1638416 };
                localObject13 = new int[] { 3 };
                localObject4 = b5.a(localObject4, localObject4.length, localObject11);
                localObject6 = b5.a(localObject6, localObject6.length, localObject12);
                localObject8 = b5.a(localObject8, localObject8.length, localObject13);
              }
            }
            else
            {
              localObject4 = new String[] { "查看", "加为好友", "私聊" };
              localObject6 = new int[] { 1638444, 589835, -1610612726 };
              localObject8 = new int[] { 2, 3, 2 };
              if (bp.ag().aT() == bt.d)
              {
                localObject11 = new String[] { "升副族长", "升为长老", "降低职位", "禅让族长", "开除此人" };
                localObject12 = new int[] { 1638411, 1638415, 1638412, 1638410, 1638409 };
                localObject13 = new int[] { 3, 3, 3, 3, 3 };
                localObject4 = b5.a(localObject4, localObject4.length, localObject11);
                localObject6 = b5.a(localObject6, localObject6.length, localObject12);
                localObject8 = b5.a(localObject8, localObject8.length, localObject13);
              }
              else
              {
                if (bp.ag().aT() != bt.long)
                  break;
                localObject11 = new String[] { "升为长老", "降低职位", "开除此人" };
                localObject12 = new int[] { 1638415, 1638412, 1638409 };
                localObject13 = new int[] { 3, 3, 3 };
                localObject4 = b5.a(localObject4, localObject4.length, localObject11);
                localObject6 = b5.a(localObject6, localObject6.length, localObject12);
                localObject8 = b5.a(localObject8, localObject8.length, localObject13);
              }
            }
            break;
          case 1835028:
            if (bp.ag().jdMethod_new() == i11)
              break;
            localObject4 = new String[] { "查看", "加为好友", "私聊" };
            localObject6 = new int[] { 1638444, 589835, -1610612726 };
            localObject8 = new int[] { 2, 3, 2 };
            if (bp.ag().as() != i.for)
              break;
            localObject11 = new String[] { "给予职务", "禅让侯主" };
            localObject12 = new int[] { 1835030, 1835035 };
            localObject13 = new int[] { 2, 3 };
            localObject4 = b5.a(localObject4, localObject4.length, localObject11);
            localObject6 = b5.a(localObject6, localObject6.length, localObject12);
            localObject8 = b5.a(localObject8, localObject8.length, localObject13);
          }
          localbr.a(localObject4, localObject6, localObject8);
          break;
        case 6:
          if (this.h2.size() == 0)
            return;
          localObject4 = new int[] { 1703942, 1703943, 1703944 };
          localObject6 = new int[] { 1, 3, 3 };
          localbr.a(bm.h, localObject4, localObject6);
          break;
        case 8:
          if (this.h2.size() == 0)
          {
            localObject4 = new int[] { -1610612703 };
            localObject6 = new int[] { 3 };
            localbr.a(bm.ch, localObject4, localObject6);
          }
          else if ((localObject4 = (v)this.h2.elementAt(this.hN)).jdField_else)
          {
            localObject6 = new int[] { 589843, -1610612708, -1610612703, 589844 };
            localObject8 = new int[] { 2, 3, 3, 3 };
            localbr.a(bm.c3, localObject6, localObject8);
          }
          else
          {
            localObject6 = new int[] { 589843, -1610612708, -1610612703 };
            localObject8 = new int[] { 2, 3, 3 };
            localbr.a(bm.q, localObject6, localObject8);
          }
          break;
        case 10:
          switch (a5.es.g9)
          {
          case 262154:
            if (this.h2.size() == 0)
              break;
            if ((localObject8 = localObject4 = (v)this.h2.elementAt(this.hN)).c == 1)
            {
              bf.int = (byte)(this.hN + 1);
              localObject6 = new String[] { "接受任务", "查看物品" };
              localObject8 = new int[] { 262149, 262189 };
              localObject10 = new int[] { 6, 2 };
              localbr.a(localObject6, localObject8, localObject10);
            }
            else
            {
              br.dk();
              a5.eQ.a(262149);
            }
            break;
          case 262157:
            if (this.h2.size() == 0)
              break;
            localObject4 = (v)this.h2.elementAt(this.hN);
            if (bv.jp)
            {
              if ((localObject8 = localObject4).c == 1)
              {
                bf.int = (byte)(this.hN + 1);
                localObject6 = new String[] { "完成任务", "查看物品" };
                localObject8 = new int[] { 262188, 262189 };
                localObject10 = new int[] { bf.for ? 2 : 0, 2 };
                localbr.a(localObject6, localObject8, localObject10);
              }
              else
              {
                if (bf.for)
                  br.c6();
                a5.eQ.a(262188);
              }
            }
            else if ((localObject8 = localObject4).c == 1)
            {
              bf.int = (byte)(this.hN + 1);
              br.c6();
              a5.eQ.a(262189);
            }
            break;
          case 262159:
            if (this.h2.size() == 0)
              break;
            if ((localObject8 = localObject4 = (v)this.h2.elementAt(this.hN)).c == 1)
            {
              bf.int = (byte)(this.hN + 1);
              localObject6 = new String[] { "查看物品" };
              localObject8 = new int[] { 262189 };
              localObject10 = new int[] { 2 };
              localbr.a(localObject6, localObject8, localObject10);
            }
            break;
          case 262178:
            if (this.h2.size() == 0)
              break;
            if ((localObject8 = localObject4 = (v)this.h2.elementAt(this.hN)).c == 1)
            {
              bf.int = (byte)(this.hN + 1);
              localObject6 = new String[] { "刷　新", "查看物品" };
              localObject8 = new int[] { 262179, 262189 };
              localObject10 = new int[] { 0, 2 };
              localbr.a(localObject6, localObject8, localObject10);
            }
            else
            {
              localObject6 = new String[] { "刷　新" };
              localObject8 = new int[] { 262179 };
              localObject10 = new int[] { 0 };
              localbr.a(localObject6, localObject8, localObject10);
            }
            break;
          case 458754:
            if (this.h2.size() == 0)
              break;
            if ((localObject8 = localObject4 = (v)this.h2.elementAt(this.hN)).c == 1)
            {
              bf.int = (byte)(this.hN + 1);
              localObject6 = new String[] { "接受任务", "查看物品" };
              localObject8 = new int[] { 262180, 262182 };
              localObject10 = new int[] { 0, 2 };
              localbr.a(localObject6, localObject8, localObject10);
            }
            else
            {
              localObject6 = new String[] { "接受任务" };
              localObject8 = new int[] { 262180 };
              localObject10 = new int[] { 0 };
              localbr.a(localObject6, localObject8, localObject10);
            }
          }
          break;
        case 11:
          au.for = this.hN;
          localObject8 = (localObject6 = (ah)(localObject8 = localObject4 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj();
          if (au.case == 1)
          {
            if (((String)localObject8).equals(""))
              break;
            br.c6();
            a5.eQ.a(1966083);
          }
          else if (((String)localObject8).equals(""))
          {
            au.else = 0;
            br.c6();
            a5.eQ.a(1966082);
          }
          else
          {
            localObject10 = new int[] { 1966083, 1966082 };
            localObject11 = new int[] { 2, 2 };
            localbr.a(bm.co, localObject10, localObject11);
          }
          break;
        case 12:
          au.for = this.hN;
          localObject8 = (localObject6 = (ah)(localObject8 = localObject4 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj();
          if (au.case == 1)
          {
            if (((String)localObject8).equals(""))
              break;
            br.c6();
            a5.eQ.a(1966083);
          }
          else if (((String)localObject8).equals(""))
          {
            au.else = 0;
            a5.eQ.a(1966088);
          }
          else
          {
            localObject10 = new int[] { 1966083, 1966092 };
            localObject11 = new int[] { 2, 3 };
            localbr.a(bm.co, localObject10, localObject11);
          }
          break;
        case 13:
          localObject8 = (localObject6 = (ah)(localObject8 = localObject4 = (v)this.h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj();
          if (au.do == -1)
          {
            localObject10 = new String[] { "查看详情", "宝石解除", "解除说明" };
            localObject11 = new int[] { 1966101, 1966102, 2031651 };
            localObject12 = new int[] { ((String)localObject8).equals("") ? 3 : 2, 3, 2 };
            localbr.a(localObject10, localObject11, localObject12);
          }
          else
          {
            if (au.do != 1)
              break;
            localObject10 = new String[] { "查看详情", "解除说明" };
            localObject11 = new int[] { 1966101, 2031651 };
            localObject12 = new int[] { ((String)localObject8).equals("") ? 3 : 2, 2 };
            localbr.a(localObject10, localObject11, localObject12);
          }
          break;
        case 14:
          if (this.h2.size() <= 0)
            break;
          al.if = (localObject4 = (v)this.h2.elementAt(this.hN)).jdField_new;
          br.c6();
          a5.eQ.a(2293874);
          break;
        case 16:
        case 17:
          if (this.h2.size() == 0)
            break;
          localObject4 = new int[] { 2555905, this.h0 == 16 ? 2555964 : 2555965 };
          localObject6 = new int[] { 3, 2 };
          localObject8 = new String[] { "去他农场", "查看详情" };
          localbr.a(localObject8, localObject4, localObject6);
          break;
        case 18:
          if (this.h2.size() == 0)
            break;
          az.d = (localObject4 = (v)this.h2.elementAt(this.hN)).jdField_new;
          if (a5.es.g9 == 2555941)
            a5.eQ.a(2555942);
          else if (a5.es.g9 == 2555943)
            a5.eQ.a(2555944);
          else if (a5.es.g9 == 2555945)
            a5.eQ.a(2555946);
          break;
        case 19:
          if ((localObject4 = (ao)a5.es.cf().elementAt(0)).aC().equals("总排名"))
          {
            localObject6 = new int[] { 196641, 196642, 196642 };
            localObject8 = new int[] { 3, 3, 3 };
            localObject10 = new String[] { "人物详情", "天人排名", "修罗排名" };
            localbr.a(localObject10, localObject6, localObject8);
          }
          else if (((ao)localObject4).aC().equals("天人排名"))
          {
            localObject6 = new int[] { 196641, 196642, 196642 };
            localObject8 = new int[] { 3, 3, 3 };
            localObject10 = new String[] { "人物详情", "修罗排名", "总排名" };
            localbr.a(localObject10, localObject6, localObject8);
          }
          else if (((ao)localObject4).aC().equals("修罗排名"))
          {
            localObject6 = new int[] { 196641, 196642, 196642 };
            localObject8 = new int[] { 3, 3, 3 };
            localObject10 = new String[] { "人物详情", "天人排名", "总排名" };
            localbr.a(localObject10, localObject6, localObject8);
          }
          if (this.h2.size() == 0)
            break;
          a4.a = ((v)this.h2.elementAt(this.hN)).jdField_for;
          break;
        case 20:
          if (this.h2.size() == 0)
            break;
          localObject4 = new int[] { 1638449 };
          localObject6 = new int[] { 3 };
          localObject8 = new String[] { "申请挑战" };
          localbr.a(localObject8, localObject4, localObject6);
        case 9:
        }
        switch (a5.es.g9)
        {
        case 1638421:
          localObject10 = (localObject8 = (ah)(localObject8 = localObject6 = (v)(localObject8 = localObject4 = (bg)(bg)a5.es.cf().elementAt(3)).h2.elementAt(this.hN)).jdField_if.elementAt(2)).aj();
          ((ah)localObject8).a(localObject10 == "无" ? "有" : "无");
        }
        if (localbr.dj().size() > 0)
        {
          a(localbr);
          y().da();
          this.jdField_byte = true;
        }
      }
      localObject8 = this;
      if (this.hZ != null)
      {
        localObject8 = this;
        this.hZ.a((short)this.hN, this.hU);
      }
    }
  }

  public final byte cJ()
  {
    return this.hN;
  }

  public final Vector cD()
  {
    return this.h2;
  }

  public final void jdMethod_if(v paramv)
  {
    if (paramv != null)
    {
      this.h2.addElement(paramv);
      this = this;
      paramv = this;
      if (this.h2.size() * (paramv = (v)paramv.h2.elementAt(0)).b + (this.ib == null ? 0 : (paramv = this.ib).b) > cH())
      {
        this.hZ = new af((short)(this.k + this.a - 5 - a5.ca.getWidth()), (short)(this.j + 1 + 1 + 1), 0, cH(), 0, !this.hU, null);
        return;
      }
      this.hZ = null;
    }
  }

  public final void cM()
  {
    for (int i = 0; i < this.h2.size(); i++)
    {
      v localv = (v)this.h2.elementAt(i);
      Object localObject;
      for (int j = 0; j < (localObject = localv).jdField_if.size(); j++)
      {
        if (!((localObject = (ba)(localObject = localv).jdField_if.elementAt(j)) instanceof ah))
          continue;
        ((ah)localObject).jdMethod_long(((v)this.h2.elementAt(i)).jdField_byte == bp.ag().o());
      }
    }
  }

  public final void cS()
  {
    for (int i = 0; i < this.h2.size(); i++)
    {
      v localv = (v)this.h2.elementAt(i);
      Object localObject;
      for (int j = 0; j < (localObject = localv).jdField_if.size(); j++)
      {
        if (!((localObject = (ba)(localObject = localv).jdField_if.elementAt(j)) instanceof ah))
          continue;
        ((ah)localObject).jdMethod_goto(((v)this.h2.elementAt(i)).jdField_else);
      }
    }
  }

  public final void cN()
  {
    if (this.h2.size() == 0)
      return;
    Object localObject = this;
    localObject = this;
    bg localbg = new bg(v(), jdMethod_long(), jdMethod_for(), z(), this.hT, this.ib, c());
    Vector localVector1 = new Vector();
    Vector localVector2 = new Vector();
    for (int j = 0; j < this.h2.size(); j++)
    {
      v localv1 = (v)this.h2.elementAt(j);
      boolean bool;
      if ((bool = ((v)(v)this.h2.elementAt(j)).jdField_else))
        localVector1.addElement(localv1);
      else
        localVector2.addElement(localv1);
    }
    localObject = this;
    localObject = this;
    j = (short)(jdMethod_long() + 1 + 1 + 1 + (this.ib == null ? 0 : (localObject = this.ib).b));
    for (int k = 0; k < localVector1.size(); k++)
    {
      b5.jdMethod_case("add ol");
      v localv3 = (v)localVector1.elementAt(k);
      for (int n = 0; n < (localObject = localv3).jdField_if.size(); n++)
        a(localv3, k, n, j);
      localbg.jdMethod_if(localv3);
    }
    v localv2 = null;
    if (localVector1.size() > 0)
      localv2 = (v)localVector1.elementAt(0);
    else if (localVector2.size() > 0)
      localv2 = (v)localVector2.elementAt(0);
    short s = (short)(j + localVector1.size() * (localObject = localv2).b);
    for (int m = 0; m < localVector2.size(); m++)
    {
      b5.jdMethod_case("add off");
      v localv4 = (v)localVector2.elementAt(m);
      for (int i = 0; i < (localObject = localv4).jdField_if.size(); i++)
        a(localv4, m, i, s);
      localbg.jdMethod_if(localv4);
    }
    cE();
    for (m = 0; m < (localObject = localbg).h2.size(); m++)
      jdMethod_if((v)(localObject = localbg).h2.elementAt(m));
  }

  private static void a(v paramv, int paramInt1, int paramInt2, short paramShort)
  {
    v localv = paramv;
    paramInt2 = (ba)paramv.jdField_if.elementAt(paramInt2);
    localv = paramv;
    paramv.a((short)(paramShort + paramInt1 * paramv.b));
    if ((paramInt2 instanceof a7))
    {
      localv = paramv;
      localv = paramv;
      (paramInt2 = (a7)paramInt2).jdMethod_for((short)(paramShort + paramInt1 * paramv.b + (paramv.b - paramInt2.bE().a) / 2));
      return;
    }
    if ((paramInt2 instanceof ah))
    {
      b5.jdMethod_case("in resetTableItemPositionY uic instanceof UILabel");
      if ((paramInt2 = (ah)paramInt2).jdMethod_char() == 0)
      {
        localv = paramv;
        localv = paramv;
        paramInt2.jdMethod_for((short)(paramShort + paramInt1 * paramv.b + (paramv.b - a5.iG) / 2));
        return;
      }
      if (paramInt2.jdMethod_char() == 2)
      {
        localv = paramv;
        localv = paramv;
        paramInt2.jdMethod_for((short)(paramShort + paramInt1 * paramv.b + (paramv.b - a5.dY.a) / 2 + 1));
      }
    }
  }

  public final void k(boolean paramBoolean)
  {
    this.hU = paramBoolean;
  }

  public final void cE()
  {
    for (int i = 0; i < this.h2.size(); i++)
      this.h2.removeElementAt(i);
    this.h2 = new Vector();
    if (this.hZ != null)
      this.hZ = null;
  }

  private byte cU()
  {
    int i = 0;
    int j = 0;
    int k;
    if (this.h2.size() > 0)
    {
      v localv;
      k = (localv = (v)this.h2.elementAt(0)).b;
    }
    else
    {
      k = (short)(a5.iG + 2);
    }
    int m = k;
    if (this.ib != null);
    for (m = (short)(m + k); m <= cH(); m = (short)(m + k))
      i = (byte)(i + 1);
    return i;
  }

  private short cH()
  {
    return (short)(this.jdField_int - 6);
  }

  private short cG()
  {
    return (short)(this.a - 10);
  }

  public final byte cF()
  {
    return this.hT;
  }

  public final void jdMethod_new(short paramShort)
  {
    super.jdMethod_new(paramShort);
    Object localObject2;
    Object localObject1;
    if (this.ib != null)
      for (i = 0; i < (localObject2 = this.ib).jdField_if.size(); i++)
        (localObject1 = (ba)(localObject2 = this.ib).jdField_if.elementAt(i)).jdMethod_new((short)(paramShort + 3 + 1 + 1 + this.ib.jdMethod_if((byte)i) + (this.ib.jdMethod_case()[i] - ((ba)localObject1).jdMethod_for()) / 2));
    for (int i = 0; i < this.h2.size(); i++)
    {
      (localObject1 = (v)this.h2.elementAt(i)).jdMethod_if((short)(paramShort + 3 + 1 + 1));
      for (int j = 0; j < (localObject2 = localObject1).jdField_if.size(); j++)
      {
        localObject2 = (ba)(localObject2 = localObject1).jdField_if.elementAt(j);
        int k = 0;
        if (localObject1.jdMethod_if()[j] != 0)
          k = (short)((localObject1.jdMethod_case()[j] - ((ba)localObject2).jdMethod_for()) / 2);
        ((ba)localObject2).jdMethod_new((short)(paramShort + 3 + 1 + 1 + ((v)localObject1).jdMethod_if((byte)j) + k + 1));
      }
    }
    if (this.hZ != null)
      this.hZ.jdMethod_new((short)(paramShort + this.a - 5 - a5.ca.getWidth()));
  }

  public final void jdMethod_for(short paramShort)
  {
    super.jdMethod_for(paramShort);
    Object localObject2;
    Object localObject1;
    if (this.ib != null)
      for (i = 0; i < (localObject2 = this.ib).jdField_if.size(); i++)
        (localObject1 = (ba)(localObject2 = this.ib).jdField_if.elementAt(i)).jdMethod_for((short)(paramShort + 1 + 1 + 1));
    for (int i = 0; i < this.h2.size(); i++)
    {
      int j = (localObject2 = localObject1 = (v)this.h2.elementAt(i)).b;
      localObject2 = this;
      localObject2 = this;
      ((v)localObject1).a((short)(paramShort + 1 + 1 + 1 + (this.ib == null ? 0 : (localObject2 = this.ib).b) + i * j));
      for (j = 0; j < (localObject2 = localObject1).jdField_if.size(); j++)
        (localObject2 = (ba)(localObject2 = localObject1).jdField_if.elementAt(j)).jdMethod_for(((v)localObject1).jdMethod_byte());
    }
    if (this.hZ != null)
    {
      this.hZ.jdMethod_for((short)(paramShort + 1 + 1 + 1));
      this.hZ.aa();
    }
  }

  public final v cI()
  {
    return this.ib;
  }

  public final void a(v paramv)
  {
    this.ib = null;
  }

  public final void cP()
  {
    Object localObject = this;
    if (this.hZ == null)
      return;
    localObject = this;
    this.hZ.az = (short)this.h2.size();
    localObject = this;
    this.hZ.ay = (short)cU();
    localObject = this;
    this = 0;
    (localObject = this.hZ).aj = this;
  }

  public final boolean b()
  {
    if (a5.gZ)
    {
      Object localObject = this;
      if (this.hZ != null)
      {
        localObject = this;
        if (this.hZ.b())
          return true;
      }
      int i = this.h2.size() < cU() ? this.h2.size() : cU() + this.hQ;
      for (int j = this.hQ; j < i; j++)
      {
        if (!a5.a((localObject = (v)this.h2.elementAt(j)).jdMethod_try(), ((v)localObject).jdMethod_byte(), cG() - a5.ca.getWidth(), (localObject = localObject).b))
          continue;
        if (this.hN == j)
          return false;
        this.hN = (byte)j;
        return true;
      }
    }
    return true;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bg
 * JD-Core Version:    0.6.0
 */
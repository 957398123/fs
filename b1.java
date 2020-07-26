import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public final class b1 extends ba
{
  private static final String[] lY = { "人物", "背包", "能力", "社交", "商城", "地图", "队伍", "任务", "设置", "服务", "离开", "活动" };
  private static final String[] l9 = { "人物", "背包", "能力", "社交", "注册", "地图", "队伍", "任务", "设置", "服务", "离开", "活动" };
  private static final String[] lG = { "人物", "背包", "能力", "社交", "改昵称", "地图", "队伍", "任务", "设置", "服务", "离开", "活动" };
  private static final String[] lP = { "基础", "攻防", "装备", "声望", "战绩", "资料", "时间", "排行榜", "挂机" };
  private static final String[] lX = { "菜单选项", "能　力", "社　交", "地　图", "设　置", "服　务", "人　物", "离开", "氏族", "诸侯", "生产", "采集", "任务", "商      城", "客      服", "师　徒", "宝　石", "挂　机" };
  private static final String[] l3 = { "天赋树", "技能栏", "快捷键", "生产", "采集", "宝石", "铭刻", "强化" };
  private static final String[] lI = { "搜索", "交友", "好友", "黑名单", "氏族", "诸侯", "聊天", "仇人", "伴侣", "师徒", "论坛", "兄弟" };
  private static final String[] l8 = { "创建", "氏族", "详情", "权限", "个人", "上交", "公告", "成员" };
  private static final String[] lJ = { "详情", "编制", "公告", "职位" };
  private static final String[] l4 = { "锻造", "铸甲", "制革", "裁缝", "凝元", "分解" };
  private static final String[] lE = { "可接", "任务", "可重置", "收藏夹" };
  private static final String[] ln = { "采矿", "采药", "织布", "剥皮" };
  private static final String[] lA = { "本地", "寻路", "世界", "农场", "战场" };
  private static final String[] lF = { "按键", "快捷键", "显示", "聊天", "其他" };
  private static final String[] lo = { "论坛", "客服", "帮助", "绑定" };
  private static final String[] l2 = { "客服", "帮助" };
  private static final String[] l1 = { "提问", "回复" };
  private static final String[] lW = { "换角色", "主菜单", "活动", "官网" };
  private static final String[] lR = { "师傅", "徒弟" };
  private static final String[] lV = { "开封", "雕琢", "合成", "解除", "还原" };
  private static final String[] lp = { "挂机", "攻击技", "守护技", "帮助" };
  public Stack l6 = new Stack();
  public static String lN = "";
  int lB = 0;
  int lz = 0;
  int lC = 0;
  int lK = 0;
  public static b1.a lx = null;
  private b1.a lM = null;
  private b1.a l7 = null;
  private b1.a lv = null;
  private b1.a lu = null;
  private b1.a lS = null;
  private b1.a l0 = null;
  private b1.a lU = null;
  private b1.a lL = null;
  private b1.a lZ = null;
  private b1.a lw = null;
  private b1.a lH = null;
  private b1.a lT = null;
  private b1.a lr = null;
  private b1.a ls = null;
  private b1.a lq = null;
  private b1.a ma = null;
  private b1.a mb = null;
  private b1.a l5 = null;

  public b1()
  {
    super(0, 0, 0, 0, null);
    b1 localb1 = this;
    if (a5.hQ == 1)
      localb1.lM = new b1.a(lX[0], l9);
    else if (a5.hQ == 2)
      localb1.lM = new b1.a(lX[0], lG);
    else
      localb1.lM = new b1.a(lX[0], lY);
    localb1.lv = new b1.a(lX[1], l3);
    localb1.lu = new b1.a(lX[2], lI);
    localb1.lS = new b1.a(lX[3], lA);
    localb1.l0 = new b1.a(lX[4], lF);
    localb1.lU = new b1.a(lX[5], lo);
    localb1.l7 = new b1.a(lX[6], lP);
    localb1.lL = new b1.a(lX[7], lW);
    localb1.lZ = new b1.a(lX[8], l8);
    localb1.lw = new b1.a(lX[9], lJ);
    localb1.lH = new b1.a(lX[10], l4);
    localb1.lT = new b1.a(lX[11], ln);
    localb1.ls = new b1.a(lX[12], lE);
    localb1.lq = new b1.a(lX[14], l1);
    localb1.ma = new b1.a(lX[15], lR);
    localb1.mb = new b1.a(lX[16], lV);
    localb1.l5 = new b1.a(lX[17], lp);
    if (bp.ag().aS() == 0)
      localb1.lr = new b1.a("聊天频道", new String[] { "综合", "私聊", "世界", "氏族", "场景", "队伍", "系统", "喇叭" });
    else
      localb1.lr = new b1.a("聊天频道", new String[] { "综合", "私聊", "世界", "诸侯", "场景", "队伍", "系统", "喇叭" });
    localb1.lM.a(3, localb1.lv);
    localb1.lM.a(4, localb1.lu);
    localb1.lM.a(6, localb1.lS);
    localb1.lM.a(9, localb1.l0);
    localb1.lM.a(10, localb1.lU);
    localb1.lM.a(1, localb1.l7);
    localb1.lM.a(11, localb1.lL);
    localb1.lM.a(8, localb1.ls);
    localb1.lu.a(5, localb1.lZ);
    localb1.lu.a(6, localb1.lw);
    localb1.lu.a(7, localb1.lr);
    localb1.lv.a(4, localb1.lH);
    localb1.lv.a(5, localb1.lT);
    localb1.lv.a(6, localb1.mb);
    localb1.lU.a(2, localb1.lq);
    localb1.lu.a(10, localb1.ma);
    localb1.l7.a(9, localb1.l5);
    (b1.lx = localb1.lM).jdMethod_if(5);
    this.j = (short)(a5.il >> 3);
    a(true, null);
  }

  public final void f()
  {
    if (lx == null)
      return;
    if ((lx != null) && (a5.V() == 1))
    {
      b1 localb1 = (this = lx).this$0;
      if ((a5.gZ) && (a5.jdMethod_byte(268435456)))
      {
        int j = localb1.j + (a5.iG + 14) * a5.il / 208;
        int k = 166 * a5.ic / 176;
        int m = 81 * a5.il / 208;
        k -= 21;
        int n = m - 13;
        int i1 = a5.ic - k >> 1;
        j += (m - n >> 1);
        m = a5.ic;
        int i2 = a5.il;
        if (a5.a(i1, j, k, n))
        {
          k = a5.cV;
          m = a5.cU;
          int i = (k - i1) / localb1.lC + (m - j) / localb1.lK * 3 + 1;
          lx.jdMethod_if((byte)i);
          lx.jdMethod_char();
        }
        else if (a5.a(0, 0, m, i2))
        {
          a5.a(262144);
        }
      }
      Object localObject;
      if (a5.jdMethod_try(4096))
      {
        switch (this.jdField_for)
        {
        case 1:
        case 2:
        case 3:
          return;
        }
        jdMethod_if((byte)(this.jdField_for - 3));
        if (!(localObject = this.jdField_do[(this.jdField_for - 1)]).jdField_for)
        {
          jdMethod_if(this.jdField_byte);
          return;
        }
      }
      else if (a5.jdMethod_try(8192))
      {
        localObject = this;
        switch (this.jdField_for)
        {
        case 10:
        case 11:
        case 12:
          return;
        }
        jdMethod_if((byte)(this.jdField_for + 3));
        if (!(localObject = this.jdField_do[(this.jdField_for - 1)]).jdField_for)
        {
          jdMethod_if(this.jdField_byte);
          return;
        }
      }
      else if (a5.jdMethod_try(16384))
      {
        localObject = this;
        switch (this.jdField_for)
        {
        case 1:
          return;
        }
        jdMethod_if((byte)(this.jdField_for - 1));
        if (!(localObject = this.jdField_do[(this.jdField_for - 1)]).jdField_for)
        {
          jdMethod_if(this.jdField_byte);
          return;
        }
      }
      else if (a5.jdMethod_try(32768))
      {
        localObject = this;
        switch (this.jdField_for)
        {
        case 12:
          return;
        }
        jdMethod_if((byte)(this.jdField_for + 1));
        if (!(localObject = this.jdField_do[(this.jdField_for - 1)]).jdField_for)
        {
          jdMethod_if(this.jdField_byte);
          return;
        }
      }
      else
      {
        if (a5.jdMethod_byte(2))
        {
          jdMethod_if(1);
          jdMethod_char();
          return;
        }
        if (a5.jdMethod_byte(4))
        {
          jdMethod_if(2);
          jdMethod_char();
          return;
        }
        if (a5.jdMethod_byte(8))
        {
          jdMethod_if(3);
          jdMethod_char();
          b5.jdMethod_case("positionIndex = " + this.jdField_for);
          return;
        }
        if (a5.jdMethod_byte(16))
        {
          jdMethod_if(4);
          jdMethod_char();
          return;
        }
        if (a5.jdMethod_byte(32))
        {
          jdMethod_if(5);
          jdMethod_char();
          return;
        }
        if (a5.jdMethod_byte(64))
        {
          jdMethod_if(6);
          jdMethod_char();
          return;
        }
        if (a5.jdMethod_byte(128))
        {
          jdMethod_if(7);
          jdMethod_char();
          return;
        }
        if (a5.jdMethod_byte(256))
        {
          jdMethod_if(8);
          jdMethod_char();
          return;
        }
        if (a5.jdMethod_byte(512))
        {
          jdMethod_if(9);
          jdMethod_char();
          return;
        }
        if (a5.jdMethod_byte(1))
        {
          jdMethod_if(11);
          jdMethod_char();
          return;
        }
        if (a5.jdMethod_byte(1024))
        {
          jdMethod_if(10);
          jdMethod_char();
          return;
        }
        if (a5.jdMethod_byte(2048))
        {
          jdMethod_if(12);
          jdMethod_char();
          return;
        }
        if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
        {
          jdMethod_byte();
          return;
        }
        if (a5.jdMethod_byte(262144))
        {
          if ((localObject = lx).jdField_new)
          {
            localObject = this;
            lx = this.jdField_if;
            this.this$0.l6.pop();
            return;
          }
          this.this$0.a(false, null);
          a5.aj();
        }
      }
    }
  }

  public final void a(Graphics paramGraphics)
  {
    if (lx == null)
      return;
    Object localObject1 = paramGraphics;
    b1 localb11 = this;
    Object localObject2 = (4 * a5.iA + 22) * a5.ic / 176;
    int j = (a5.iG + 12) * a5.il / 208;
    int k = a5.ic - localObject2 >> 1;
    ((Graphics)localObject1).setColor(bm.ay);
    ((Graphics)localObject1).drawRect(k, localb11.j - 1, localObject2, j);
    ((Graphics)localObject1).setColor(bm.ax);
    ((Graphics)localObject1).drawRect(k + 1, localb11.j, localObject2 - 2, j - 2);
    ((Graphics)localObject1).setColor(bm.aw);
    ((Graphics)localObject1).fillRect(k + 2, localb11.j + 1, localObject2 - 3, j - 3);
    ((Graphics)localObject1).setColor(bm.ay);
    ((Graphics)localObject1).drawRect(k + 5, localb11.j + 2, localObject2 - 10, j - 6);
    ((Graphics)localObject1).drawRect(k + 6, localb11.j + 2, localObject2 - 12, j - 6);
    ((Graphics)localObject1).drawRect(k + 7, localb11.j + 2, localObject2 - 14, j - 6);
    ((Graphics)localObject1).drawRect(k + 9, localb11.j + 4, localObject2 - 18, j - 10);
    localObject1 = paramGraphics;
    localb11 = this;
    localObject2 = this.j + (a5.iG + 14) * a5.il / 208;
    j = 166 * a5.ic / 176;
    k = a5.ic - j >> 1;
    this = 81 * a5.il / 208;
    ((Graphics)localObject1).setColor(bm.ay);
    ((Graphics)localObject1).drawRect(k, localObject2, j, this);
    ((Graphics)localObject1).setColor(bm.ax);
    ((Graphics)localObject1).drawRect(k + 1, localObject2 + 1, j - 2, this - 2);
    ((Graphics)localObject1).setColor(bm.aw);
    ((Graphics)localObject1).fillRect(k + 2, localObject2 + 2, j - 3, this - 3);
    ((Graphics)localObject1).setColor(bm.ay);
    k = j - 13;
    b1 localb12 = this - 9;
    ((Graphics)localObject1).drawRect(a5.ic - k >> 1, localObject2 + (this - localb12 >> 1), k, localb12);
    k = j - 15;
    b1 localb13 = this - 9;
    ((Graphics)localObject1).drawRect(a5.ic - k >> 1, localObject2 + (this - localb13 >> 1), k, localb13);
    k = j - 17;
    b1 localb14 = this - 9;
    ((Graphics)localObject1).drawRect(a5.ic - k >> 1, localObject2 + (this - localb14 >> 1), k, localb14);
    k = j - 21;
    b1 localb15 = this - 13;
    j = a5.ic - k >> 1;
    b1 localb16 = localObject2 + (this - localb15 >> 1);
    ((Graphics)localObject1).setColor(14602158);
    int m = (localb15 + 1) / 4;
    int n = (k + 1) / 3;
    localb11.lB = j;
    localb11.lz = localb16;
    localb11.lC = n;
    localb11.lK = m;
    for (int i = 0; i < 12; i++)
    {
      if (i % 2 != 0)
        continue;
      int i1 = i / 3;
      int i2 = i % 3;
      ((Graphics)localObject1).fillRect(j + i2 * n, localb16 + i1 * m, n + 1, m);
    }
    ((Graphics)localObject1).setColor(bm.ay);
    ((Graphics)localObject1).drawRect(a5.ic - k >> 1, localObject2 + (this - localb15 >> 1), k, localb15);
    ((Graphics)localObject1).drawImage(a5.gu, -2, localObject2 + 4, 20);
    ((Graphics)localObject1).drawImage(a5.gu, -2, localObject2 + this - a5.gu.getHeight() - 4, 20);
    b5.a((Graphics)localObject1, a5.gu, a5.ic - a5.gu.getWidth() + 2, localObject2 + 4, 2);
    b5.a((Graphics)localObject1, a5.gu, a5.ic - a5.gu.getWidth() + 2, localObject2 + this - a5.gu.getHeight() - 4, 2);
    ((Graphics)localObject1).setColor(bm.ay);
    for (i = 0; i < 3; i++)
      ((Graphics)localObject1).drawLine(j, localb16 + m * (i + 1), j + k, localb16 + m * (i + 1));
    for (i = 0; i < 2; i++)
      ((Graphics)localObject1).drawLine(j + n * (i + 1), localb16, j + n * (i + 1), localb16 + localb15);
    Graphics localGraphics = paramGraphics;
    if (lx != null)
    {
      lx.jdMethod_for(localGraphics);
      localObject2 = localGraphics;
      localObject1 = lx;
      for (j = 0; j < ((b1.a)localObject1).a.length; j++)
      {
        k = j / 3;
        this = j % 3;
        if ((localObject1.a[j].equals("改昵称")) || (localObject1.a[j].equals("注册")) || (localObject1.a[j].equals("喇叭")))
          ((Graphics)localObject2).setColor(16711680);
        else
          ((Graphics)localObject2).setColor(bm.aZ);
        access$200(((b1.a)localObject1).this$0, (Graphics)localObject2, localObject1.a[j], ((b1.a)localObject1).this$0.lB + this * ((b1.a)localObject1).this$0.lC, ((b1.a)localObject1).this$0.lz + k * ((b1.a)localObject1).this$0.lK, ((b1.a)localObject1).this$0.lC, ((b1.a)localObject1).this$0.lK, a5.fq);
      }
      localObject2 = localGraphics;
      localObject1 = lx;
      ((Graphics)localObject2).setColor(bm.ay);
      j = (((b1.a)localObject1).jdField_for - 1) / 3;
      k = (((b1.a)localObject1).jdField_for - 1) % 3;
      ((Graphics)localObject2).fillRect(((b1.a)localObject1).this$0.lB + k * ((b1.a)localObject1).this$0.lC + 2, ((b1.a)localObject1).this$0.lz + j * ((b1.a)localObject1).this$0.lK + 2, ((b1.a)localObject1).this$0.lC - (k == 2 ? 2 : 3), ((b1.a)localObject1).this$0.lK - 3);
      if ((localObject1.a[(localObject1.jdField_for - 1)].equals("改昵称")) || (localObject1.a[(localObject1.jdField_for - 1)].equals("注册")))
        ((Graphics)localObject2).setColor(16711680);
      else
        ((Graphics)localObject2).setColor(bm.aw);
      access$200(((b1.a)localObject1).this$0, (Graphics)localObject2, localObject1.a[(localObject1.jdField_for - 1)], ((b1.a)localObject1).this$0.lB + k * ((b1.a)localObject1).this$0.lC, ((b1.a)localObject1).this$0.lz + j * ((b1.a)localObject1).this$0.lK, ((b1.a)localObject1).this$0.lC, ((b1.a)localObject1).this$0.lK, a5.fq);
    }
  }

  public static void v(int paramInt)
  {
    dN();
    String str;
    for (int i = (str = new String(paramInt + "")).length() - 1; i >= 0; i--)
    {
      int j = 1;
      for (int k = 0; k < i; k++)
        j <<= 4;
      k = paramInt / j;
      paramInt %= j;
      lx.jdMethod_if((byte)k);
      lx.jdMethod_char();
      k = 0;
      b1.a locala;
      (locala = lx).jdField_new = k;
    }
  }

  public static void dN()
  {
    a5.ea = new b1();
    a5.jdMethod_try(1);
  }

  public final int dR()
  {
    int i = 0;
    int j = this.l6.size();
    int k = 0;
    j = j;
    while (k < j)
    {
      i = (i << 4) + ((Byte)this.l6.elementAt(k)).byteValue();
      k++;
    }
    return i;
  }

  public static final void dK()
  {
    switch (bu.e)
    {
    case 0:
      as.a(0, "您不在队伍中", bm.a2[2], "", -1, -2);
      return;
    case 1:
      a5.eQ.a(720904);
      return;
    case 2:
      a5.eQ.a(new int[] { 720905, 720906, 720907 });
    }
  }

  public static final void w(int paramInt)
  {
    (a5.es = e.a("/ui/skillbar.ui")).g9 = paramInt;
    if (paramInt == -1610612732)
      (paramInt = (ao)a5.es.cf().elementAt(1)).a("选择", 0);
    (paramInt = (r)a5.es.cf().elementAt(3)).F(1);
    paramInt.j((short)(bp.ag().aj() + 1));
    paramInt.mQ[0] = bp.fj[0];
    paramInt.mW[0] = 1000;
    paramInt.mV[0] = bp.eQ[0];
    paramInt.mI[0] = r.k((short)(bp.eD[0] % 1000));
    paramInt.mo[0] = 0;
    paramInt.ne[0] = 1;
    for (int i = 1; i <= bp.ag().aj(); i = (byte)(i + 1))
    {
      if ((bp.ag().fG[(i - 1)] == 0) || ((s = bp.jdMethod_void(bp.ag().fG[(i - 1)])) == -1))
        continue;
      paramInt.mQ[i] = bp.fj[s];
      paramInt.mV[i] = bp.eQ[s];
      b5.jdMethod_case("stuffImageId=" + bp.eD[s] % 1000 + "--stuffQuality=" + (bp.eD[s] / 1000 - 1));
      bp.ag();
      paramInt.mW[i] = bp.eD[s];
      paramInt.mI[i] = r.k((short)(bp.eD[s] % 1000));
      paramInt.mo[i] = (byte)(bp.eD[s] / 1000 - 1);
      paramInt.ne[i] = 1;
    }
    paramInt.jdMethod_if(paramInt.mV[paramInt.ep()], r.E(paramInt.ne[paramInt.ep()]));
    paramInt.ei().az = 8;
    paramInt.ei().ay = 4;
    short s = 0;
    af localaf;
    (localaf = paramInt.ei()).aj = s;
    paramInt.d1();
    a5.es.c("#键切换查看技能描述");
  }

  public static void dM()
  {
    a5.a("/ui/keysetup.ui");
    a5.es.g9 = -1610612735;
    bv localbv;
    (localbv = (bv)a5.es.cf().elementAt(2)).a(2);
    Vector localVector;
    bv.ju = new int[(localVector = localbv.dt()).size()];
    for (int i = 0; i < localVector.size(); i++)
    {
      m localm;
      (localm = (m)localVector.elementAt(i)).a(4);
      bv.ju[i] = a5.iq[i];
      localm.jdMethod_if(m.a(bv.ju[i]));
    }
    bv.a(localbv, 4);
    if (!a5.gZ)
      a5.es.c("*键清空本键，#键进行设置");
  }

  public static final void x(int paramInt)
  {
    (a5.es = e.a("/ui/skillbar.ui")).g9 = paramInt;
    (paramInt = (ao)a5.es.cf().elementAt(1)).a("选择", 0);
    (paramInt = (r)a5.es.cf().elementAt(3)).F(1);
    paramInt.j(aa.f);
    for (int i = 0; i < aa.f; i++)
    {
      paramInt.mQ[i] = aa.e[i];
      paramInt.mV[i] = aa.else[i];
      paramInt.mW[i] = aa.byte[i];
      paramInt.mI[i] = r.k(aa.c[i]);
      paramInt.mo[i] = aa.char[i];
      paramInt.ne[i] = 1;
    }
    paramInt.jdMethod_if(paramInt.mV[paramInt.ep()], r.E(paramInt.ne[paramInt.ep()]));
    paramInt.ei().az = 8;
    paramInt.ei().ay = 4;
    short s = 0;
    af localaf;
    (localaf = paramInt.ei()).aj = s;
    paramInt.d1();
    a5.es.c("#键切换查看技能描述");
  }

  public class b
  {
    boolean jdField_for = true;
    boolean a = false;

    public b(String arg2)
    {
    }
  }

  public class a
  {
    b1.b[] jdField_do = null;
    String[] a = null;
    private String jdField_else = null;
    private Hashtable jdField_case = new Hashtable();
    a jdField_if = null;
    boolean jdField_new = false;
    byte jdField_for = 1;
    public byte jdField_byte = 1;
    private boolean jdField_char = false;

    public a(String paramArrayOfString, String[] arg3)
    {
      this.jdField_else = paramArrayOfString;
      Object localObject;
      this.a = localObject;
      this.jdField_do = new b1.b[localObject.length];
      paramArrayOfString = 0;
      String[] arrayOfString = this.jdField_do.length;
      while (paramArrayOfString < arrayOfString)
      {
        this.jdField_do[paramArrayOfString] = new b1.b(b1.this, localObject[paramArrayOfString]);
        paramArrayOfString++;
      }
      this = this;
      jdField_if(1);
      b1.lx = this;
    }

    public final void a(byte paramByte, a parama)
    {
      boolean bool = true;
      Object localObject;
      (localObject = this.jdField_do[(paramByte - 1)]).a = true;
      bool = true;
      (localObject = parama).jdField_new = bool;
      a locala = this;
      (localObject = parama).jdField_if = locala;
      this.jdField_case.put(new Byte(paramByte), parama);
    }

    public final void jdField_if(byte paramByte)
    {
      this.jdField_byte = this.jdField_for;
      if (a(paramByte - 1))
      {
        this.jdField_for = paramByte;
        this.jdField_char = false;
        return;
      }
      this.jdField_char = true;
    }

    private boolean a(int paramInt)
    {
      return paramInt < this.jdField_do.length;
    }

    public final void jdField_char()
    {
      if (this.jdField_char)
        return;
      super.jdField_byte();
    }

    void jdField_byte()
    {
      a(false);
      if ((localObject = this.jdField_do[(this.jdField_for - 1)]).a)
      {
        if ((b1.lx = (a)(a)this.jdField_case.get(new Byte(this.jdField_for))).a(4))
          b1.lx.jdField_if(5);
        else if (b1.lx.a(1))
          b1.lx.jdField_if(2);
        else
          b1.lx.jdField_if(1);
        a(true);
        return;
      }
      Object localObject = this;
      jdMethod_goto();
    }

    private void a(boolean paramBoolean)
    {
      if (!paramBoolean)
      {
        if (!b1.this.l6.empty())
          b1.this.l6.pop();
        b1.this.l6.push(new Byte(b1.lx.jdField_for));
        return;
      }
      b1.this.l6.push(new Byte(b1.lx.jdField_for));
    }

    private void jdMethod_goto()
    {
      ay localay;
      switch (b1.this.dR())
      {
      case 17:
        a5.eQ.a(393219);
        return;
      case 18:
        a5.eQ.a(393220);
        return;
      case 19:
        au.a = 0;
        a5.eQ.a(917505);
        return;
      case 20:
        a5.eQ.a(393223);
        return;
      case 21:
        a5.eQ.a(393224);
        return;
      case 22:
        a5.eQ.a(393225);
        return;
      case 23:
        a5.eQ.a(393234);
        return;
      case 24:
        a5.eQ.a(1507331);
        return;
      case 401:
        a5.eQ.a(3145732);
        return;
      case 402:
        a5.eQ.a(3145729);
        return;
      case 403:
        a5.eQ.a(3145730);
        return;
      case 404:
        a5.eQ.a(3145741);
        return;
      case 2:
        a5.eQ.a(458760);
        return;
      case 49:
        a5.eQ.a(1572868);
        return;
      case 50:
        b1.w(-1610612733);
        a5.jdMethod_try(4);
        return;
      case 52:
        return;
      case 53:
        return;
      case 833:
        a5.eQ.a(new int[] { 2162689, 2162691 });
        return;
      case 834:
        a5.eQ.a(new int[] { 2162702, 2162703 });
        return;
      case 835:
        a5.eQ.a(new int[] { 2162713, 2162714 });
        return;
      case 836:
        a5.eQ.a(new int[] { 2162724, 2162725 });
        return;
      case 837:
        a5.eQ.a(new int[] { 2162735, 2162736 });
        return;
      case 838:
        a5.eQ.a(new int[] { 2162744, 2162745 });
        return;
      case 839:
        return;
      case 840:
        return;
      case 841:
        return;
      case 842:
        b5.jdField_case("养生");
        return;
      case 849:
        a5.eQ.a(new int[] { 2162756, 2162757 });
        return;
      case 850:
        as.a(0, "此功能暂未开放！", "确定", "", -1, -2);
        if (!a5.eQ.e)
          break;
        a5.eQ.e = false;
        return;
      case 851:
        a5.eQ.a(new int[] { 2162770, 2162771 });
        return;
      case 852:
        a5.eQ.a(new int[] { 2162777, 2162778 });
        return;
      case 51:
        jdField_for();
        return;
      case 865:
        r.nf = false;
        a5.eQ.a(2031636);
        return;
      case 866:
        a5.eQ.a(2031621);
        return;
      case 867:
        a5.eQ.a(2228225);
        return;
      case 868:
        a5.eQ.a(1966097);
        return;
      case 869:
        a5.eQ.a(2228256);
        return;
      case 55:
        a5.eQ.a(3342356);
        return;
      case 56:
        a5.eQ.a(917525);
        return;
      case 65:
        a5.eQ.a(589832);
        return;
      case 66:
        ar.a("添加好友", "请输入好友昵称：", 589833);
        return;
      case 67:
        a5.eQ.a(589825);
        return;
      case 68:
        a5.eQ.a(589828);
        return;
      case 69:
        return;
      case 1105:
        a5.eQ.a(1638401);
        return;
      case 1106:
        a5.eQ.a(1638426);
        return;
      case 1107:
        a5.eQ.a(1638403);
        return;
      case 1108:
        a5.eQ.a(1638419);
        return;
      case 1109:
        a5.eQ.a(1638425);
        return;
      case 1110:
        a5.eQ.a(1638427);
        return;
      case 1111:
        a5.eQ.a(1638417);
        return;
      case 1112:
        a5.eQ.a(1638404);
        return;
      case 70:
        return;
      case 1121:
        a5.eQ.a(1835011);
        return;
      case 1122:
        a5.eQ.a(1835012);
        return;
      case 1123:
        a5.eQ.a(1835021);
        return;
      case 1124:
        a5.eQ.a(1835027);
        return;
      case 71:
        return;
      case 1137:
        if (b1.this.dR() != 1)
          b1.this.dR();
        (be.gu = new a3(100)).jdField_byte();
        a5.jdMethod_try(3);
        return;
      case 1138:
        (be.gu = new a3(0)).jdField_byte();
        a5.jdMethod_try(3);
        return;
      case 1139:
        (be.gu = new a3(1)).jdField_byte();
        a5.jdMethod_try(3);
        return;
      case 1140:
        (be.gu = new a3(2)).jdField_byte();
        a5.jdMethod_try(3);
        return;
      case 1141:
        (be.gu = new a3(3)).jdField_byte();
        a5.jdMethod_try(3);
        return;
      case 1142:
        (be.gu = new a3(4)).jdField_byte();
        a5.jdMethod_try(3);
        return;
      case 1143:
        (be.gu = new a3(5)).jdField_byte();
        a5.jdMethod_try(3);
        return;
      case 1144:
        (be.gu = new a3(6)).jdField_byte();
        a5.jdMethod_try(3);
        return;
      case 72:
        a5.eQ.a(589845);
        b5.jdField_case("**************社交-仇人**********************");
        return;
      case 73:
        a5.eQ.a(1441805);
        return;
      case 1185:
        a5.eQ.a(2490386);
        return;
      case 1186:
        a5.eQ.a(2490385);
        return;
      case 75:
        b1.access$000(1);
        return;
      case 76:
        a5.eQ.a(3407878);
        return;
      case 130:
        a5.eQ.a(262187);
        return;
      case 131:
        a5.eQ.a(262165);
        return;
      case 129:
        a5.eQ.a(262168);
        return;
      case 132:
        a5.eQ.a(262185);
        return;
      case 97:
        z.F = false;
        z.T = 1;
        a5.eQ.a(131079);
        return;
      case 98:
        a5.eQ.a(851976);
        return;
      case 99:
        z.T = 2;
        a5.eQ.a(131078);
        return;
      case 100:
        a5.eQ.a(2555905);
        return;
      case 101:
        a5.eQ.a(852020);
        return;
      case 7:
        b1.dK();
        return;
      case 145:
        a5.jdMethod_try(4);
        b1.dM();
        return;
      case 146:
        jdField_for();
        return;
      case 147:
        a5.a("/ui/showsetup.ui");
        a5.es.g9 = -1610612728;
        this = a5.es.cf().size();
        a5.es.cf().removeElementAt(this - 1);
        for (this = 0; this < 5; this++)
        {
          localay = (ay)a5.es.cf().elementAt(this + 3);
          if (this == 0)
            localay.jdField_case(a5.gn);
          else
            localay.jdField_case((byte)((a5.dM >> this - 1) % 2));
        }
        a5.jdMethod_try(4);
        return;
      case 148:
        a5.a("/ui/chatsetup.ui");
        a5.es.g9 = -1610612699;
        for (this = 0; this < 5; this++)
          (localay = (ay)a5.es.cf().elementAt(this + 4)).jdField_case((byte)((ad.I >> this) % 2));
        a5.jdMethod_try(4);
        return;
      case 149:
        a5.a("/ui/elsesetup.ui");
        a5.es.g9 = -1610612727;
        this = (ay)a5.es.cf().elementAt(3);
        if (bp.ag().r() >= 20)
          a5.gK = 0;
        jdField_case(a5.gK);
        (localay = (ay)a5.es.cf().elementAt(9)).jdField_case((byte)(a5.hi ^ 0x1));
        a5.jdMethod_try(4);
        return;
      case 161:
        b1.access$000(1);
        return;
      case 2577:
        return;
      case 2578:
        return;
      case 162:
        return;
      case 2593:
        a5.eQ.a(1703968);
        return;
      case 2594:
        a5.eQ.a(1703969);
        return;
      case 163:
        a5.eQ.a(458772);
        return;
      case 164:
        a5.eQ.a(1703958);
        return;
      case 5:
        if (a5.hQ == 0)
        {
          a5.eQ.a(2425024);
          return;
        }
        if (a5.hQ == 1)
        {
          as.a0();
          return;
        }
        if (a5.hQ != 2)
          break;
        as.a(0, "您确定要修改昵称吗？", "确定", "取消", 65549, -1);
        return;
      case 177:
        if ((a5.hQ == 0) || (a5.hQ == 2))
        {
          a5.eQ.a(65544);
          return;
        }
        as.a(0, "此功能不对游客开放", bm.a2[2], "", -1, -2);
        return;
      case 178:
        if ((a5.hQ == 0) || (a5.hQ == 2))
        {
          a5.eQ.a(65545);
          return;
        }
        a5.eQ.a(65550);
        return;
      case 179:
        a5.eQ.a(2355697);
        return;
      case 180:
        b1.access$100();
        return;
      case 12:
        a5.eQ.a(2355697);
      }
    }

    private static void jdField_for()
    {
      a5.es = e.a("/ui/shortcutkey.ui");
      a5.fE.addElement(a5.es);
      a5.fE.addElement(null);
      a5.fE.addElement(null);
      a5.es.g9 = -1610612734;
      b2.a();
      b2.a();
      b2.try.jdField_if(b2.try.p);
      ay localay;
      b2.a();
      (localay = (ay)a5.es.cf().elementAt(6)).jdField_case((byte)(b2.try.p - 1));
      if (!a5.gZ)
        a5.es.c("*键设置技能，#键设置物品");
      a5.jdMethod_try(4);
    }

    public final void jdField_for(Graphics paramGraphics)
    {
      int i = 76 * a5.ic / 176;
      int j = 25 * a5.il / 208;
      int k = a5.ic - i >> 1;
      paramGraphics.setColor(bm.aZ);
      b1.access$200(b1.this, paramGraphics, this.jdField_else, k, b1.this.j, i, j, a5.fq);
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     b1
 * JD-Core Version:    0.6.0
 */
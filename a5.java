import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public final class a5 extends Canvas
  implements Runnable
{
  public static boolean gB = false;
  public static String ik = "";
  public static String iM = "";
  byte g0 = 0;
  public static String gd = "kong";
  public static String it = "";
  public static boolean hG = false;
  public static boolean d8;
  public static f eQ;
  public static bc gD;
  public static int ix;
  public static String[] gH;
  public static String[] hC;
  public static byte[] hs;
  public static byte is;
  public static String fr;
  public static String[] hR;
  private static byte[] fm;
  public static byte[] f6;
  public static byte fN = 0;
  public static b1 ea = null;
  static boolean cf = true;
  static boolean g9 = true;
  static boolean fA = true;
  static boolean gW = true;
  private static boolean en = false;
  private int fe = 0;
  public static boolean ir = false;
  public static a dI = null;
  public static int ic = 0;
  public static int il = 0;
  public static int cX = 0;
  public static int iA = 0;
  public static int iG = 0;
  public static Font fq = null;
  public static int dA = 0;
  public static byte fF = a1.a();
  private static byte gh = 0;
  public static byte cg = 0;
  private static boolean de = false;
  private static byte iK = 0;
  public static byte df = 0;
  public static a5 e8;
  private static int d5;
  private long el;
  private volatile Thread dQ;
  private long[] ee = new long[1];
  private Image gm = null;
  private Image eH = null;
  private byte c6 = 0;
  private static Image hf = null;
  private static Image c1 = null;
  private static Image cS = null;
  private int[] ij = { 13440024, 16165675, 14952962, 16432904 };
  private byte hW = 0;
  private byte eW = 0;
  private byte ct = 0;
  public static Image ge;
  public static Image ed;
  public static Image e4;
  private static Image dP;
  private static Image h1;
  public static bi gF = null;
  public static bi dF = null;
  public static bi fj = null;
  public static bi ch;
  public static bi b9;
  public static bi hN;
  public static bi cJ;
  public static bi hk;
  public static bi dE;
  public static bi eh;
  public static bi cO;
  public static bi fQ;
  public static Image fh;
  public static Image gu;
  public static Image hI;
  public static Image ca;
  public static Image ec;
  public static Image iJ;
  public static Image gU;
  public static Image eb;
  public static Image cY;
  public static Image e3;
  public static Image fz;
  public static Image gr;
  public static Image e9;
  public static Image f7;
  public static bi cG;
  public static Image fv = null;
  public static bi dY;
  public static Image fT = null;
  public static bi eR;
  public static bi dx;
  private static Image f5;
  public static bi hL;
  public static bi gz;
  public static Image eP;
  public static be es;
  public static be h4;
  public static be dS;
  public static Vector fE = new Vector();
  public static byte dK = -1;
  public static byte c9 = -1;
  public static Vector d6 = new Vector();
  private static String fu = "";
  private static int gO = 0;
  public static bi gg = null;
  public static boolean fR = false;
  public static boolean ep = false;
  public static Image gA;
  public static bi eq;
  public static int ht;
  public static byte[] h7 = null;
  public static byte[] h2 = null;
  public static byte[] gb = null;
  public static byte[][] gV = new byte[0][];
  public static byte[] dW = new byte[0];
  public static byte[] dO = null;
  public static int dh = -1;
  public static boolean dU;
  public static boolean hM = false;
  public static boolean cn = false;
  public static byte ci = 1;
  public static byte ck = 1;
  public static byte fW = 0;
  public static byte ig = 1;
  public static String fY = null;
  public static byte h6 = 0;
  public static byte hg = 0;
  public static a7[] iC = new a7[3];
  public static ah[] iD = new ah[5];
  public static int[] cy = new int[3];
  public static String[] e0 = new String[3];
  public static int[] im = new int[3];
  public static byte[] fZ = new byte[3];
  public static byte[] hE = new byte[3];
  public static byte[] eI = new byte[3];
  public static String[] d3 = new String[3];
  public static byte[] hV = new byte[3];
  public static boolean[] g3 = new boolean[3];
  public static boolean hw;
  public static String[] fc = new String[4];
  public byte cQ = 0;
  public static int gx;
  public static byte em = 0;
  public static byte eg = 0;
  public static boolean hH = false;
  public boolean ia = false;
  public byte[] cP;
  public byte[] fo;
  public static byte hq = 0;
  public byte cT = 0;
  public static byte iB = 0;
  public static byte[] fS;
  public static short[][] eS;
  public static short[] eJ;
  public static Image fM;
  public static short[][] g8;
  public static byte hQ = 0;
  public static boolean cC;
  public static boolean iE;
  private static boolean gE;
  public static byte hY;
  public static boolean dJ = false;
  private long cv;
  private long cB;
  public static int ek;
  private int h0;
  private long dz;
  private static a5.a ff = null;
  public static String gG = null;
  public static short dM;
  public static byte gK = 1;
  public static byte hi = 1;
  public static byte dv = 0;
  public static final String[] f9 = { "数字键0", "数字键1", "数字键2", "数字键3", "数字键4", "数字键5", "数字键6", "数字键7", "数字键8", "数字键9", "*键", "#键", "方向键上", "方向键下", "方向键左", "方向键右", "确认键" };
  public static final int[] iH = { 4096, 8192, 16384, 32768, 0, 65536, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1, 1024, 2048, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  public static int[] iq = null;
  public static final int[] eT = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 };
  private static int hh = 0;
  private static int eL = 0;
  private static int cl = 0;
  private static int cD = 0;
  public static int et = 0;
  private static int hl = 0;
  private static boolean in = false;
  public static short cV;
  public static short cU;
  private static boolean dk = false;
  public static short eF;
  public static short eD;
  static int[] gw;
  private static int e5;
  public static byte f3 = 0;
  public static boolean da = false;
  public static boolean gZ;
  private Image eN = null;
  private Image[] cI = new Image[3];
  private byte ds = 0;
  private static boolean d9 = false;
  private static boolean ie;
  private static String[] fC = new String[bm.cI.length];
  private static boolean cF = true;
  private int gc;
  private int cd;
  public static as gQ = null;
  public static byte[][] gR = new byte[0][];
  static byte gn = 1;
  private static boolean cu = false;
  private static boolean iy = false;
  public static byte c3 = 0;
  private static byte[] hO = { 1, 2, 3, 4, 6 };
  private static byte[] gy = { 1, 2, 4, 6 };
  private Image dG = null;
  private Image c4 = null;
  private Image[] g2 = new Image[2];

  public a5(a parama)
  {
    try
    {
      dI = parama;
      e8 = this;
      eQ = f.jdMethod_byte();
      gD = bc.jdMethod_if();
      bk.v = false;
      if ((a5.hC = b5.jdMethod_do("name_password", 2)) == null)
      {
        parama = dI.getAppProperty("username");
        String str1 = dI.getAppProperty("userpsw");
        if ((parama != null) && (!"".equals(parama)) && (str1 != null) && (!"".equals(str1)))
          b5.a(a5.hC = new String[] { parama, str1 }, "name_password");
      }
      if (((bk.B = System.getProperty("com.nokia.mid.imei")) == null) || ("".equals(bk.B.trim())))
      {
        bk.B = String.valueOf(System.currentTimeMillis());
      }
      else
      {
        parama = new StringBuffer();
        for (int i = 0; i < bk.B.length(); i++)
        {
          if (((bk.B.charAt(i) < '0') || (bk.B.charAt(i) > '9')) && ((bk.B.charAt(i) < 'a') || (bk.B.charAt(i) > 'z')) && ((bk.B.charAt(i) < 'A') || (bk.B.charAt(i) > 'Z')))
            continue;
          parama.append(bk.B.charAt(i));
        }
        bk.B = parama.toString();
      }
      b5.jdMethod_case("PassPort.imei = " + bk.B);
      ad();
      g();
      try
      {
        parama = null;
        if (((parama = dI.getAppProperty("isTest")) != null) && (!"".equals(parama.trim())))
          this.g0 = (byte)Integer.parseInt(parama.trim());
      }
      catch (Exception parama)
      {
      }
      try
      {
        if (((parama = dI.getAppProperty("passport")) != null) && ("true".equals(parama)))
        {
          bk.q = "202.108.44.149:9081";
          bk.aJ = "/judgeserver/judge?ver=2&";
          bk.ao = 2;
        }
      }
      catch (Exception localException1)
      {
      }
      try
      {
        if (((bk.aK = dI.getAppProperty("fid")) == null) || ("".equals(bk.aK.trim())))
          bk.aK = "1000";
      }
      catch (Exception localException2)
      {
      }
      parama = this;
      gZ = hasPointerMotionEvents();
      parama.setFullScreenMode(true);
      ic = parama.getWidth();
      if ((a5.il = parama.getHeight()) >= 300)
        d8 = true;
      else
        d8 = false;
      iG = (a5.fq = Font.getFont(0, 0, 8)).getHeight();
      iA = fq.stringWidth("正");
      String str2;
      if (((str2 = dI.getAppProperty("nativeserver")) == null) || (str2.equals("")))
      {
        bk.G = false;
        System.out.println("没有得到nativeserver");
      }
      else if (str2.equals("true"))
      {
        bk.G = true;
      }
      else if (str2.equals("false"))
      {
        bk.G = false;
      }
      if (((this = dI.getAppProperty("round")) == null) || (equals("")))
        da = false;
      else if (equals("true"))
        da = true;
      else if (equals("false"))
        da = false;
      gw = b5.jdMethod_int("keyValue", ai.if.length);
      bk.g();
      try
      {
        if (((parama = dI.getAppProperty("Ver")) != null) && (!parama.equals("")) && (jdMethod_int(parama) != 0))
          a1.for = jdMethod_int(parama.trim());
      }
      catch (Exception localException3)
      {
      }
      try
      {
        if (((a5.gd = dI.getAppProperty("JarSrc")) == null) || (gd.equals("")))
          gd = "kong";
        else
          gd = gd.trim();
      }
      catch (Exception localException4)
      {
        b5.jdMethod_case("Can not get platform!! May be a phoneEmu!");
      }
      System.out.println("jarFrom = " + gd);
      b5.jdMethod_byte();
    }
    catch (Exception localException5)
    {
      (parama = localException5).printStackTrace();
    }
    b5.a("mammoth.png");
    jdMethod_do(3);
  }

  public final synchronized void H()
  {
    this.dQ = new Thread(this);
    this.dQ.start();
  }

  private synchronized void jdMethod_goto()
  {
    this.dQ = null;
  }

  public final void run()
  {
    this.h0 = be.cA();
    Thread localThread = Thread.currentThread();
    b5.jdMethod_case("main:" + localThread);
    while (localThread == this.dQ)
      try
      {
        long l1 = l();
        et = eL;
        cD = hh;
        hl = cl;
        eL = 0;
        cl = 0;
        if ((ff != null) || ((fR) && (bp.ag().jdMethod_do() != 9)))
          D();
        if (gZ)
        {
          dk = in;
          eF = cV;
          eD = cU;
        }
        synchronized (this)
        {
          eQ.jdMethod_do();
          if (!eQ.jdMethod_char())
            jdMethod_goto();
          if (iy)
          {
            iy = false;
            f.jdMethod_byte().jdMethod_for();
          }
        }
        if ((ir) && (iK == 2))
          ir = false;
        this.el += 120L;
        ??? = this;
        if (++ht >= 6000)
          ht = 0;
        b5.int += 1;
        ???.jdMethod_byte();
        if (a1.do)
        {
          String str;
          if (a1.if == 1)
          {
            str = "您输入的账号或密码有错误，请重新输入";
            a(0, str, bm.a2[2], "", -6, -120);
          }
          else if (a1.if == 2)
          {
            str = "您的客户端与当前服务器版本号不符";
            a(0, str, bm.a2[2], "", -6, -120);
          }
          else if ((a1.if == 3) || (a1.if == 4))
          {
            str = "您的通行证验证未通过";
            a(0, str, bm.a2[2], "", -6, -120);
          }
          a1.do = false;
        }
        if (((iK == 5) || (iK == 17) || (iK == 18) || (iK == 19) || (iK == 27)) && (ht % 50 == 0))
          eQ.a(3);
        w.P();
        long l2;
        if ((l2 = (System.currentTimeMillis() - ak.bu) / 1000L) >= 1L)
        {
          ak.bu = System.currentTimeMillis();
          if (ak.bJ > 0)
          {
            ak.bJ = (byte)(ak.bJ - 1);
          }
          else if (ak.bP > 0)
          {
            ak.bP = (byte)(ak.bP - 1);
            ak.bJ = 59;
          }
        }
        Object localObject4 = ???;
        if (bk.aP)
        {
          if (!a1.new.equals(""))
          {
            if (gQ != null)
              gQ = null;
            if (localObject4.g0 != 1)
              a(0, "版本号已不是最新，但仍能使用，请选择是否更新", "下载", "继续", -8, -2);
          }
          else
          {
            jdMethod_do(12);
          }
          bk.aP = false;
        }
        Object localObject6;
        if (bk.ax)
        {
          if (gQ != null)
            gQ = null;
          if (bk.jdField_d_of_type_Boolean)
          {
            hC[0] = bk.aa;
            hC[1] = bk.aa;
          }
          if (hQ == 1)
          {
            localObject6 = "您的账号为:" + hC[0] + "\n" + "您的密码为:" + hC[1] + "\n";
            a(0, (String)localObject6, "确定", "", -25, -2);
          }
          else if (bk.jdField_d_of_type_Boolean)
          {
            localObject6 = "您的账号为:" + hC[0] + "\n" + "您的密码为:" + hC[1] + "\n";
            a(0, (String)localObject6, "确定", "取消", -31, -17);
          }
          else
          {
            a(0, bk.az, bm.a2[2], "", -30, -120);
          }
          bk.ax = false;
        }
        if (bk.V)
        {
          if (gQ != null)
            gQ = null;
          b5.jdMethod_do("name_password", hC.length);
          b5.a(hC, "name_password");
          a(0, bk.az, bm.a2[2], "", -6, -120);
          bk.V = false;
        }
        Object localObject7;
        if (bk.e)
        {
          if (gQ != null)
            gQ = null;
          if (hQ == 1)
          {
            localObject6 = (a9)es.cf().elementAt(9);
            localObject7 = (a9)es.cf().elementAt(10);
            if (bk.jdField_d_of_type_Boolean)
            {
              ((a9)localObject6).a(new StringBuffer(bk.aa));
              ((a9)localObject7).a(new StringBuffer(bk.aa));
              hC[0] = ((a9)localObject6).cc().toString();
              hC[1] = ((a9)localObject7).cc().toString();
              bk.jdField_d_of_type_Boolean = false;
            }
          }
          else
          {
            jdMethod_do(14);
          }
          bk.e = false;
        }
        if (bk.k)
          if (bo.C == 2)
          {
            if (bk.h())
            {
              a(0, "您的帐号已经绑定", "确定", "", -1, -120);
              bk.k = false;
              break label1148;
            }
            bo.jdMethod_do(2);
            bk.k = false;
          }
          else if (bo.C == 3)
          {
            if (!bk.h())
            {
              a(0, "您的帐号未绑定", "确定", "", -1, -120);
              bk.k = false;
              break label1148;
            }
            bo.jdMethod_do(3);
            bk.k = false;
          }
        if (bk.at)
        {
          if (gQ != null)
            gQ = null;
          jdMethod_do(32);
          bk.at = false;
        }
        if (bk.p)
        {
          if (gQ != null)
            gQ = null;
          if (bk.Q)
            jdMethod_do(34);
          else
            jdMethod_do(33);
          bk.p = false;
        }
        if (bk.ae)
        {
          if (gQ != null)
            gQ = null;
          jdMethod_do(38);
          bk.ae = false;
        }
        if (bk.ak)
        {
          if (gQ != null)
            gQ = null;
          jdMethod_do(38);
          bk.ak = false;
        }
        label1148: if (hG)
        {
          jdMethod_do(12);
          hG = false;
          if (hY == 1)
            hY = 0;
        }
        if (es != null)
          z.jdMethod_do(es.g9);
        localObject4 = ???;
        if ((gZ) && (jdMethod_byte(268435456)))
          switch (iK)
          {
          case 8:
            ai.a();
            break;
          case 4:
            localObject4.Y();
            break;
          case 5:
            switch (gh)
            {
            case 5:
              if ((br.iW == null) || (fR) || (!br.iW.df()))
                break;
              a(131072);
              break;
            case 6:
              if ((br.iZ == null) || (!br.iZ.df()))
                break;
              a(131072);
            }
            if ((h4 == null) || ((localObject6 = (ak)h4.cf().elementAt(3)).b()) || (!a(0, 0, ic, il)))
              break;
            a(262144);
          case 6:
          case 7:
          }
        switch (iK)
        {
        case 8:
          if (e5 == 0)
            break;
          if (gZ)
            ai.jdMethod_do(e5);
          else
            ai.jdMethod_for(e5);
          e5 = 0;
          break;
        case 28:
          if (e5 != 0)
          {
            ai.a(e5);
            e5 = 0;
          }
          ai.jdMethod_for();
          break;
        case 4:
          localObject4 = ???;
          if (gQ != null)
          {
            gQ.a7();
          }
          else if (jdMethod_byte(196608))
          {
            switch ((localObject6 = localObject4).hW)
            {
            case 0:
              if (cF)
              {
                ((a5)localObject6).x();
                break;
              }
              ((a5)localObject6).K();
              break;
            case 1:
              if (cF)
              {
                ((a5)localObject6).Z();
                break;
              }
              ((a5)localObject6).x();
              break;
            case 2:
              if (cF)
              {
                ((a5)localObject6).K();
                break;
              }
              ((a5)localObject6).Z();
              break;
            case 3:
              localObject7 = localObject6;
              if (hC == null)
                hC = new String[2];
              ((a5)localObject7).cT = 3;
              jdMethod_do(16);
              hQ = 0;
              break;
            case 4:
              h();
              break;
            case 5:
              s();
              break;
            case 6:
              X();
              break;
            case 7:
              ((a5)localObject6).L();
              break;
            case 8:
              a(0, "请等待服务器认证...", "", "", -120, -120);
              if (hC == null)
                hC = new String[2];
              hC[0] = "1241506146031";
              hC[1] = "1241506146031";
              localObject7 = null;
              (localObject7 = new bk(bk.q, bk.jdMethod_do(1), dU ? 0 : 1, 2)).a(1);
              hQ = 1;
            default:
              break;
            }
          }
          else if (jdMethod_try(4096))
          {
            if (gQ == null)
            {
              Object tmp1905_1903 = localObject4;
              tmp1905_1903.hW = (byte)(tmp1905_1903.hW - 1);
              if (localObject4.hW < 0)
                localObject4.hW = (byte)(fC.length - 1);
              Object tmp1937_1935 = localObject4;
              tmp1937_1935.ct = (byte)(tmp1937_1935.ct - 1);
              if (localObject4.ct < 0)
              {
                localObject4.ct = 0;
                Object tmp1963_1961 = localObject4;
                tmp1963_1961.eW = (byte)(tmp1963_1961.eW - 1);
                if (localObject4.eW < 0)
                {
                  localObject4.eW = (byte)(fC.length - 1);
                  break;
                }
              }
            }
          }
          else if ((jdMethod_try(8192)) && (gQ == null))
          {
            Object tmp2013_2011 = localObject4;
            tmp2013_2011.hW = (byte)(tmp2013_2011.hW + 1);
            if (localObject4.hW == fC.length)
              localObject4.hW = 0;
            Object tmp2043_2041 = localObject4;
            tmp2043_2041.ct = (byte)(tmp2043_2041.ct + 1);
            if (localObject4.ct == 5)
            {
              localObject4.ct = 4;
              Object tmp2070_2068 = localObject4;
              tmp2070_2068.eW = (byte)(tmp2070_2068.eW + 1);
              if (localObject4.eW == fC.length)
                localObject4.eW = 0;
            }
          }
          break;
        case 5:
          de = false;
          if (bp.fI != null)
          {
            z.a();
            z.jdMethod_do(bp.ag().c, bp.ag().jdField_void);
          }
          l.jdMethod_do();
          l.jdMethod_if();
          b2.a();
          b2.jdMethod_do();
          if (aa.int)
          {
            if ((gh == 3) && (gQ == null))
            {
              ao.aH();
              be.gu.jdMethod_for();
            }
            else if ((gh == 4) && (gQ == null))
            {
              es.cw();
              ao.aH();
            }
            else if (gQ != null)
            {
              gQ.a7();
            }
            else if (ea != null)
            {
              ea.f();
            }
            else
            {
              if (!jdMethod_byte(1024))
              {
                int n;
                int i;
                int j;
                int k;
                int m;
                if ((gZ) && (ea == null))
                {
                  n = ic - gF.jdField_if.getWidth() >> 1;
                  i = gF.a;
                  j = il - 36 - ad.long.getHeight();
                  k = ic;
                  m = ad.long.getHeight();
                }
                if (((jdMethod_for(n, 2, 196, i)) || (jdMethod_for(0, j, k, m)) ? 1 : 0) == 0);
              }
              else
              {
                b1.v(71);
                break;
              }
              if ((jdMethod_byte(1024)) || (!jdMethod_byte(-1)))
                break;
              eQ.a(3145734);
            }
          }
          else
            ???.aa();
          break;
        case 7:
          break;
        case 11:
        case 12:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 21:
        case 22:
        case 23:
        case 30:
        case 31:
        case 32:
        case 33:
        case 34:
        case 35:
        case 36:
        case 37:
          if ((es != null) && (gQ != null))
          {
            gQ.a7();
          }
          else if ((es != null) && (gQ == null))
          {
            es.cw();
            ao.aH();
          }
          long l3;
          if ((iK == 11) && (hM) && (!bk.ap) && (be.gd != 0L) && ((l3 = System.currentTimeMillis() - be.gd) > 30000L))
          {
            es.gT.N = true;
            be.gd = 0L;
            es.gT.jdMethod_for(0);
            (localObject7 = new bk(bk.q, bk.jdMethod_do(1), 1, 2)).a(1);
          }
          break;
        case 6:
        case 9:
        case 10:
        case 13:
        case 20:
        case 24:
        case 25:
        case 26:
        case 27:
        case 29:
        default:
          if (es == null)
            break;
          es.cw();
          ao.aH();
        }
        e5 = 0;
        if ((es != null) && (gQ == null))
        {
          Object localObject3;
          if (es.g9 == 196641)
          {
            localObject3 = (ak)es.cf().elementAt(3);
            if ((ht % 300 == 1) && (!l.jdField_d_of_type_Boolean) && (((ak)localObject3).bv))
              as.a(0, "您确定退出战场吗？", "确定", "取消", 852005, -1);
          }
          else if (es.g9 == 196642)
          {
            localObject3 = (bg)es.cf().elementAt(3);
            if ((ht % 300 == 1) && (!l.jdField_d_of_type_Boolean) && (((bg)localObject3).ie))
              as.a(0, "您确定退出战场吗？", "确定", "取消", 852005, -1);
          }
        }
        Object localObject5 = ???;
        if (fR)
        {
          if (localObject5.dz > 0L)
          {
            long l4;
            if ((l4 = System.currentTimeMillis() - localObject5.dz) >= 60000L)
            {
              fR = false;
              localObject5.dz = 0L;
              as.a(0, "请求服务器连接超时，请重新尝试", "确定", "", -1, -2);
            }
          }
          else
          {
            localObject5.dz = System.currentTimeMillis();
          }
        }
        else
          localObject5.dz = 0L;
        repaint();
        if (!dJ)
        {
          this.cB = System.currentTimeMillis();
        }
        else
        {
          this.cv = (System.currentTimeMillis() - this.cB);
          if (this.cv > 6000000L)
          {
            ik = "";
            dJ = false;
            bk.l();
          }
        }
        d5 = (int)(l() - localObject1);
        synchronized (this)
        {
          wait(Math.max(1, this.h0 - d5));
        }
        ek = (int)(l() - localObject2);
        if ((fF != 0) && (ek < this.h0))
          this.h0 = (this.h0 * be.cA() / ek);
      }
      catch (Exception localException2)
      {
        Exception localException1;
        (localException1 = localException2).printStackTrace();
      }
  }

  public static void jdMethod_void()
  {
    ff = new a5.a();
  }

  public static void B()
  {
    if (ff != null)
    {
      a5.a locala;
      (locala = ff).a = null;
      ff = null;
    }
  }

  public final void paint(Graphics paramGraphics)
  {
    try
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, ic, il);
      paramGraphics.setFont(fq);
      Object localObject2;
      Object localObject1;
      switch (iK)
      {
      case 3:
        localObject2 = paramGraphics;
        localObject1 = this;
        ((Graphics)localObject2).setColor(16777215);
        ((Graphics)localObject2).fillRect(0, 0, ic, il);
        if (((a5)localObject1).gm != null)
          if (((a5)localObject1).c6 == 1)
          {
            ((Graphics)localObject2).drawImage(((a5)localObject1).gm, ic >> 1, il >> 1, 3);
          }
          else if (((a5)localObject1).c6 == 2)
          {
            ((Graphics)localObject2).drawImage(((a5)localObject1).gm, ic >> 1, il >> 2, 17);
            if (((a5)localObject1).eH == null)
              ((a5)localObject1).eH = b5.a("/logo_ko.png");
            ((Graphics)localObject2).drawImage(((a5)localObject1).eH, ic >> 1, (il >> 1) + (((a5)localObject1).eH.getHeight() >> 1), 17);
          }
        if (((a5)localObject1).c6 >= 0)
        {
          this = 0;
          this = ((a5)localObject1).c6 == 1 ? 1000 : ((a5)localObject1).c6 == 0 ? 0 : 2000;
          Object localObject3;
          localObject3.ee[0] = 0L;
          if (((localObject3 = localObject1).ee[0] + this > localObject3.el ? 0 : 1) != 0)
          {
            if (((a5)localObject1).c6 < 2)
            {
              this = 0;
              (localObject3 = localObject1).ee[0] = localObject3.el;
              ((a5)localObject1).gm = b5.a("/logo_" + ((a5)localObject1).c6 + ".png");
              Object tmp451_450 = localObject1;
              tmp451_450.c6 = (byte)(tmp451_450.c6 + 1);
              break;
            }
            ((a5)localObject1).gm = null;
            ((a5)localObject1).eH = null;
            ((a5)localObject1).c6 = 0;
            hf = b5.a("/logo.png");
            jdMethod_do(24);
          }
        }
        break;
      case 24:
        d(paramGraphics);
        break;
      case 28:
        (localObject1 = paramGraphics).setColor(0);
        ((Graphics)localObject1).fillRect(0, 0, ic, il);
        ai.a((Graphics)localObject1);
        break;
      case 2:
        jdMethod_byte(paramGraphics);
        break;
      case 5:
        localObject2 = paramGraphics;
        localObject1 = this;
        switch (gh)
        {
        case 0:
          ((a5)localObject1).jdMethod_void((Graphics)localObject2);
          w.jdMethod_new((Graphics)localObject2);
          break;
        case 1:
          ((a5)localObject1).jdMethod_void((Graphics)localObject2);
          localObject1 = localObject2;
          if (ea != null)
            ea.a((Graphics)localObject1);
          w.jdMethod_new((Graphics)localObject2);
          break;
        case 3:
          be.gu.jdMethod_if((Graphics)localObject2);
          break;
        case 4:
          if (!fR)
          {
            if (ep)
            {
              localObject1 = localObject2;
              if ((es != null) && (ep))
                es.a((Graphics)localObject1);
            }
            else
            {
              ((a5)localObject1).jdMethod_void((Graphics)localObject2);
            }
          }
          else
          {
            localObject1 = localObject2;
            if (dS != null)
              dS.a((Graphics)localObject1);
          }
          w.jdMethod_new((Graphics)localObject2);
          break;
        case 5:
          ((a5)localObject1).jdMethod_void((Graphics)localObject2);
          if (br.iW != null)
            br.iW.a((Graphics)localObject2);
          w.jdMethod_new((Graphics)localObject2);
          break;
        case 6:
          ((a5)localObject1).jdMethod_void((Graphics)localObject2);
          if (br.iZ == null)
            break;
          br.iZ.a((Graphics)localObject2);
        case 2:
        }
        if (gQ != null)
          jdMethod_if((Graphics)localObject2);
        if ((h4 != null) && (ep))
          h4.a((Graphics)localObject2);
        if ((gh == 4) || (h4 != null))
        {
          ad.a((Graphics)localObject2, true);
          ad.jdMethod_if((Graphics)localObject2, true);
        }
        else
        {
          ad.a((Graphics)localObject2, false);
          ad.jdMethod_if((Graphics)localObject2, false);
        }
        break;
      case 4:
        localObject2 = paramGraphics;
        localObject1 = this;
        ((Graphics)localObject2).setColor(0);
        ((Graphics)localObject2).fillRect(0, 0, ic, il);
        ((a5)localObject1).jdMethod_long();
        ((Graphics)localObject2).drawImage(cS, 0, 0, 20);
        ((Graphics)localObject2).setColor(16498698);
        (localObject1 = new StringBuffer(4)).append("版本:");
        int i = a1.for;
        ((StringBuffer)localObject1).append(String.valueOf(i >>> 24)).append(".");
        i = a1.for;
        ((StringBuffer)localObject1).append(String.valueOf(i >>> 16 & 0xFF)).append(".");
        i = a1.for;
        ((StringBuffer)localObject1).append(String.valueOf(i >>> 8 & 0xFF)).append(".");
        i = a1.for;
        ((StringBuffer)localObject1).append(String.valueOf(i & 0xFF));
        ((Graphics)localObject2).drawString(((StringBuffer)localObject1).toString(), ic - ((Graphics)localObject2).getFont().stringWidth(((StringBuffer)localObject1).toString()) - 2, 5, 20);
        jdMethod_char(paramGraphics);
        jdMethod_if(paramGraphics);
        break;
      case 7:
        break;
      case 11:
      case 12:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 21:
      case 22:
      case 23:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
        if (es == null)
          break;
        es.a(paramGraphics);
        jdMethod_if(paramGraphics);
        break;
      case 6:
      case 8:
      case 9:
      case 10:
      case 13:
      case 20:
      case 25:
      case 26:
      case 27:
      case 29:
      default:
        if (es == null)
          break;
        es.a(paramGraphics);
      }
      if ((iK == 5) && (fR))
      {
        jdMethod_case(paramGraphics);
      }
      else if ((iK == 21) || (iK == 22) || (iK == 23) || ((iK == 5) && (iE)))
      {
        (localObject1 = paramGraphics).setColor(16711680);
        ((Graphics)localObject1).drawString("此操作将以短信形", ic >> 1, il - (iG << 1) - 25, 17);
        ((Graphics)localObject1).drawString("式发送", ic >> 1, il - (iG << 1) - 10, 17);
      }
      else if (gE == true)
      {
        localObject1 = paramGraphics;
        localObject2 = (a9)es.cf().elementAt(9);
        ((Graphics)localObject1).setColor(6045209);
        ((Graphics)localObject1).drawString("请输入", (ic >> 1) - (iA << 1) - 5, ((ba)localObject2).jdMethod_long() + ((ba)localObject2).z() - 10 - (iG << 1), 17);
        ((Graphics)localObject1).setColor(16711680);
        ((Graphics)localObject1).drawString("DEL", ic >> 1, ((ba)localObject2).jdMethod_long() + ((ba)localObject2).z() - 10 - (iG << 1), 17);
        ((Graphics)localObject1).setColor(6045209);
        ((Graphics)localObject1).drawString("确认", (ic >> 1) + (iA << 1), ((ba)localObject2).jdMethod_long() + ((ba)localObject2).z() - 10 - (iG << 1), 17);
      }
      this = 0;
      paramGraphics.setColor(255);
      return;
    }
    catch (Exception localException)
    {
      (this = localException).printStackTrace();
    }
  }

  private static void jdMethod_case(Graphics paramGraphics)
  {
    for (int i = 0; i < 3; i++)
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(ic - 60 + i * 12 + 2, iG + 5, 6, 6);
      paramGraphics.setColor(51204);
      paramGraphics.fillRect(ic - 60 + i * 12 + 3, iG + 5 + 1, 4, 4);
    }
    if (gO == 0)
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(ic - 60, iG + 3, 10, 10);
      paramGraphics.setColor(51204);
      paramGraphics.fillRect(ic - 60 + 1, iG + 4, 8, 8);
    }
    else if (gO == 1)
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(ic - 60 + 12, iG + 3, 10, 10);
      paramGraphics.setColor(51204);
      paramGraphics.fillRect(ic - 60 + 13, iG + 4, 8, 8);
    }
    else if (gO == 2)
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(ic - 60 + 24, iG + 3, 10, 10);
      paramGraphics.setColor(51204);
      paramGraphics.fillRect(ic - 60 + 25, iG + 4, 8, 8);
    }
    if (++gO > 2)
      gO = 0;
  }

  private static final int jdMethod_case(int paramInt)
  {
    if (gw != null)
    {
      if (paramInt == gw[0])
        return 131072;
      if (paramInt == gw[1])
        return 262144;
      if (paramInt == gw[2])
        return 65536;
    }
    switch (paramInt)
    {
    case 48:
      return 1;
    case 49:
      return 2;
    case 50:
      return 4;
    case 51:
      return 8;
    case 52:
      return 16;
    case 53:
      return 32;
    case 54:
      return 64;
    case 55:
      return 128;
    case 56:
      return 256;
    case 57:
      return 512;
    case 35:
      return 2048;
    case 42:
      return 1024;
    case -1:
    case 1:
      return 4096;
    case -2:
    case 6:
      return 8192;
    case -3:
    case 2:
      return 16384;
    case -4:
    case 5:
      return 32768;
    case -20:
    case -5:
    case 20:
      return 65536;
    case -21:
    case -6:
    case 21:
      return 131072;
    case -22:
    case -11:
    case -7:
    case 22:
      return 262144;
    case -8:
      return 135266304;
    case -30:
    case -9:
      return 67108864;
    case -31:
      return 134217728;
    case -23:
    case 23:
      return 16777216;
    case -10:
    case 10:
      return 2097152;
    case -12:
      return 33554432;
    case -50:
      return 8388608;
    case -49:
    case -48:
    case -47:
    case -46:
    case -45:
    case -44:
    case -43:
    case -42:
    case -41:
    case -40:
    case -39:
    case -38:
    case -37:
    case -36:
    case -35:
    case -34:
    case -33:
    case -32:
    case -29:
    case -28:
    case -27:
    case -26:
    case -25:
    case -24:
    case -19:
    case -18:
    case -17:
    case -16:
    case -15:
    case -14:
    case -13:
    case 0:
    case 3:
    case 4:
    case 7:
    case 8:
    case 9:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
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
    case 36:
    case 37:
    case 38:
    case 39:
    case 40:
    case 41:
    case 43:
    case 44:
    case 45:
    case 46:
    case 47:
    }
    return -2147483648;
  }

  public static void a(int paramInt)
  {
    et |= paramInt;
    cD |= paramInt;
  }

  private static void jdMethod_for(int paramInt)
  {
    hl |= 8192;
    et &= -8193;
    cD &= -8193;
  }

  public final void keyPressed(int paramInt)
  {
    b5.a(paramInt);
    e5 = paramInt;
    this = jdMethod_case(paramInt);
    eL |= this;
    hh |= this;
  }

  public final void keyReleased(int paramInt)
  {
    this = jdMethod_case(paramInt);
    cl |= this;
    hh &= (this ^ 0xFFFFFFFF);
  }

  protected final void pointerPressed(int paramInt1, int paramInt2)
  {
    if (gZ)
    {
      eL |= 268435456;
      hh |= 268435456;
      in = false;
      cV = (short)paramInt1;
      cU = (short)paramInt2;
    }
  }

  protected final void pointerReleased(int paramInt1, int paramInt2)
  {
    if (gZ)
    {
      cl |= 268435456;
      hh &= -268435457;
      cV = (short)paramInt1;
      cU = (short)paramInt2;
    }
  }

  protected final void pointerDragged(int paramInt1, int paramInt2)
  {
    if (gZ)
    {
      in = true;
      cV = (short)paramInt1;
      cU = (short)paramInt2;
    }
  }

  public static final void D()
  {
    eL = 0;
    hh = 0;
    cl = 0;
    et = 0;
    cD = 0;
    hl = 0;
    if (gZ)
    {
      in = false;
      dk = false;
    }
  }

  public static final boolean jdMethod_byte(int paramInt)
  {
    return (et & paramInt) != 0;
  }

  public static final boolean jdMethod_if(int paramInt)
  {
    return (hl & paramInt) != 0;
  }

  public static final boolean jdMethod_try(int paramInt)
  {
    return ((et | cD) & paramInt) != 0;
  }

  public static final boolean jdMethod_char()
  {
    if (gZ)
      return dk;
    return false;
  }

  public static final boolean jdMethod_for(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (gZ)
      return (jdMethod_byte(268435456)) && (a(paramInt1, paramInt2, paramInt3, paramInt4));
    return false;
  }

  public static final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (eF >= paramInt1) && (eF <= paramInt1 + paramInt3) && (eD >= paramInt2) && (eD <= paramInt2 + paramInt4);
  }

  protected final void hideNotify()
  {
    D();
  }

  public static final void jdMethod_do(byte paramByte)
  {
    df = iK;
    if ((a5.iK = paramByte) == 5)
      a(null);
    Object localObject4;
    Object localObject2;
    Object localObject3;
    switch (iK)
    {
    case 4:
      if (gQ != null)
        gQ = null;
      if (c1 != null)
        break;
      c1 = b5.a("/mammoth.png");
      z();
      return;
    case 11:
      if (gQ != null)
        gQ = null;
      a("/ui/debarkation.ui");
      paramByte = (a9)es.cf().elementAt(4);
      Object localObject1 = (ao)es.cf().elementAt(1);
      t();
      if ((a5.f6 = b5.jdMethod_byte("login_type")) == null)
        f6 = new byte[1];
      else if (f6[0] == 1)
        (localObject4 = (ay)es.cf().elementAt(10)).jdMethod_case(1);
      if ((paramByte.cc().toString().trim() == null) || (paramByte.cc().toString().trim().equals("")))
        ((ao)localObject1).a("输入", 0);
      else
        ((ao)localObject1).a("登录", 0);
      (paramByte = (ah)es.cf().elementAt(3)).jdMethod_new((short)(ic >> 1));
      paramByte.jdMethod_void(true);
      (paramByte = (ay)es.cf().elementAt(10)).jdMethod_new((short)(ic - paramByte.jdMethod_for() >> 1));
      for (paramByte = 0; paramByte < 4; paramByte++)
      {
        (localObject1 = (ah)es.cf().elementAt(paramByte + 6)).jdMethod_new((short)(ic >> 1));
        ((ah)localObject1).jdMethod_void(true);
      }
      return;
    case 12:
      as.a6();
      a("/ui/list.ui");
      (paramByte = (bv)es.cf().elementAt(2)).dy();
      if (!bk.G)
      {
        if ((bk.g == null) || (bk.g[0][0] == null))
        {
          jdMethod_do(4);
          return;
        }
        cS = null;
        c1 = null;
        hf = null;
        jdMethod_try();
        for (int i = 0; i < bk.g.length; i++)
        {
          b5.jdMethod_case("serverListContent[i][0] = " + bk.g[i][0]);
          paramByte.a(new m(bk.g[i][0], 0, 0, paramByte.dF()));
        }
        ao localao1;
        (localao1 = (ao)es.cf().elementAt(0)).jdMethod_do("请选择服务器");
      }
      else
      {
        if ((a5.fS = b5.jdMethod_if("serverlist", 1)) == null)
          fS = new byte[1];
        if (gH == null)
        {
          jdMethod_do(4);
          return;
        }
        cS = null;
        c1 = null;
        hf = null;
        jdMethod_try();
        for (int j = 0; j < gH.length; j++)
          paramByte.a(new m(gH[j], 0, 0, paramByte.dF()));
      }
      y localy;
      if ((paramByte.dt().size() > paramByte.z$132bd3()) && ((localy = paramByte.dr()).U == null))
        paramByte.dr().jdMethod_new(false);
      paramByte.dr().a((short)paramByte.dt().size(), (short)paramByte.z$132bd3());
      if (!bk.G)
        break;
      for (int k = 0; k < fS[0]; k = (short)(k + 1))
      {
        a(8192);
        paramByte.f();
        jdMethod_for(8192);
      }
      return;
    case 5:
      jdMethod_try(0);
      return;
    case 8:
      ai.jdMethod_do();
      a("/ui/networksetup.ui");
      es.cf().elementAt(2);
      if ((paramByte = b5.jdMethod_byte("gamemount")) == null)
        ai.byte = 2;
      else
        ai.byte = paramByte[0];
      ai.jdMethod_int();
      if (!gZ)
        break;
      paramByte = (ah)es.cf().elementAt(3);
      localObject2 = (ah)es.cf().elementAt(4);
      localObject4 = (ah)es.cf().elementAt(5);
      paramByte.a("");
      ((ah)localObject2).a("");
      ((ah)localObject4).a("");
      return;
    case 14:
      a("/ui/login.ui");
      paramByte = (a9)es.cf().elementAt(9);
      localObject2 = (a9)es.cf().elementAt(10);
      if (bk.jdField_d_of_type_Boolean)
      {
        paramByte.a(new StringBuffer(bk.aa));
        ((a9)localObject2).a(new StringBuffer(bk.aa));
        hC[0] = paramByte.cc().toString();
        hC[1] = ((a9)localObject2).cc().toString();
        bk.jdField_d_of_type_Boolean = false;
      }
      localObject4 = (ao)es.cf().elementAt(1);
      if ((paramByte.cc().toString().trim() == null) || (paramByte.cc().toString().trim().equals("")))
      {
        ((ao)localObject4).a("输入", 0);
        return;
      }
      ((ao)localObject4).a("确定", 0);
      return;
    case 13:
      return;
    case 15:
      a("/ui/amendcipher.ui");
      paramByte = (a9)es.cf().elementAt(10);
      localObject2 = (ao)es.cf().elementAt(1);
      if ((paramByte.cc().toString().trim() == null) || (paramByte.cc().toString().trim().equals("")))
      {
        ((ao)localObject2).a("输入", 0);
        return;
      }
      ((ao)localObject2).a("确定", 0);
      return;
    case 16:
      a("/ui/seizing.ui");
      es.c("#键切换选项和内容");
      if ((paramByte = (bv)es.cf().elementAt(3)).jl < 0)
        paramByte.jl = 0;
      if ((paramByte.dt().size() > paramByte.z$132bd3()) && ((localObject2 = paramByte.dr()).U == null))
        paramByte.dr().jdMethod_new(false);
      bv.a(paramByte, 0);
      (paramByte = (ak)es.cf().elementAt(4)).jdMethod_if(bm.bd[0]);
      bk.jdMethod_new();
      return;
    case 18:
      a("/ui/found_role.ui");
      for (paramByte = 0; paramByte < 5; paramByte++)
        ay.d4[paramByte] = 0;
      (paramByte = (ao)es.cf().elementAt(1)).a("介绍", 0);
      paramByte = (a7)es.cf().elementAt(3);
      iC[0] = paramByte;
      iC[0].eo = new b(0, 0, ck, ig, fW);
      a(true);
      paramByte = (ah)es.cf().elementAt(4);
      if (gZ)
        paramByte.a("触摸此处确定所选角色");
      paramByte.jdMethod_new((short)(ic - paramByte.jdMethod_for() >> 1));
      (paramByte = (ak)es.cf().elementAt(10)).jdMethod_if(bm.bp[(ci - 1)]);
      return;
    case 19:
      a("/ui/delete_part.ui");
      for (paramByte = 0; paramByte < 5; paramByte++)
      {
        (localObject2 = (ah)es.cf().elementAt(paramByte + 3)).jdMethod_new(20);
        (localObject4 = (ah)es.cf().elementAt(paramByte + 10)).jdMethod_new((short)(17 + ((ba)localObject2).jdMethod_for()));
      }
      es.cf().setElementAt(new bd(0, 0, 0, 0, es), 8);
      jdMethod_if(10);
      paramByte = (a9)es.cf().elementAt(9);
      localObject2 = (ao)es.cf().elementAt(1);
      if ((paramByte.cc().toString().trim() == null) || (paramByte.cc().toString().trim().equals("")))
        ((ao)localObject2).a("输入", 0);
      else
        ((ao)localObject2).a("确定", 0);
      gE = true;
      return;
    case 21:
      a("/ui/seed_seizing.ui");
      localObject4 = (a9)es.cf().elementAt(4);
      paramByte = (ao)es.cf().elementAt(1);
      if ((((a9)localObject4).cc().toString().trim() == null) || (((a9)localObject4).cc().toString().trim().equals("")))
      {
        paramByte.a("输入", 0);
        return;
      }
      paramByte.a("确定", 0);
      return;
    case 22:
      a("/ui/seed_colligation.ui");
      paramByte = (a9)es.cf().elementAt(4);
      localObject2 = (ao)es.cf().elementAt(1);
      if ((paramByte.cc().toString().trim() == null) || (paramByte.cc().toString().trim().equals("")))
      {
        ((ao)localObject2).a("输入", 0);
        return;
      }
      ((ao)localObject2).a("确定", 0);
      return;
    case 23:
      a("/ui/seed_password.ui");
      paramByte = (a9)es.cf().elementAt(4);
      localObject2 = (ao)es.cf().elementAt(1);
      if ((paramByte.cc().toString().trim() == null) || (paramByte.cc().toString().trim().equals("")))
      {
        ((ao)localObject2).a("输入", 0);
        return;
      }
      ((ao)localObject2).a("确定", 0);
      return;
    case 10:
      a("/ui/about.ui");
      (paramByte = (ak)es.cf().elementAt(3)).ap();
      return;
    case 27:
      a("/ui/introduce.ui");
      return;
    case 6:
      a("/ui/list.ui");
      (paramByte = (ao)es.cf().elementAt(0)).jdMethod_do("帮　助");
      (paramByte = (bv)es.cf().elementAt(2)).dy();
      for (int m = 0; m < bm.bL.length; m++)
        paramByte.a(new m(bm.bL[m], 0, 0, paramByte.dF()));
      return;
    case 29:
      paramByte = (bv)es.cf().elementAt(2);
      a("/ui/about.ui");
      ao localao2 = (ao)es.cf().elementAt(0);
      f3 = paramByte.dw();
      localao2.jdMethod_do(bm.bL[f3]);
      (paramByte = (ak)es.cf().elementAt(3)).jdMethod_if(bm.c9[f3]);
      paramByte.ap();
      return;
    case 30:
      a("/ui/list.ui");
      (paramByte = (ao)es.cf().elementAt(0)).jdMethod_do("点数专区");
      (paramByte = (bv)es.cf().elementAt(2)).dy();
      for (int n = 0; n < bm.c1.length; n++)
        paramByte.a(new m(bm.c1[n], 0, 0, paramByte.dF()));
      return;
    case 31:
      a("/cm/ui/charge.ui");
      (localObject3 = (a9)es.cf().elementAt(5)).jdMethod_if(100L);
      return;
    case 32:
      a("/cm/ui/charger.ui");
      paramByte = null;
      if (bk.aw)
        paramByte = "恭喜您，充值" + bk.ai + "元成功，您已获得" + bk.ai * 100 + "点点数！您目前的点数余额为" + bk.R + "点！";
      else
        paramByte = "对不起，充值失败，请尝试重新充值或联系客服！";
      (localObject3 = (ak)es.cf().elementAt(3)).jdMethod_if(paramByte);
      return;
    case 33:
      a("/cm/ui/remain.ui");
      paramByte = null;
      if (bk.aw)
        paramByte = "您当前的点数余额为" + bk.R + "点！";
      else
        paramByte = "对不起，查询失败，请尝试重新查询或联系客服！";
      (localObject3 = (ak)es.cf().elementAt(3)).jdMethod_if(paramByte);
      return;
    case 34:
      a("/cm/ui/detail.ui");
      paramByte = null;
      if (bk.aw)
        paramByte = "您当前的点数余额为" + bk.R + "点！";
      else
        paramByte = "对不起，查询失败，请尝试重新查询或联系客服！";
      (localObject3 = (ak)es.cf().elementAt(3)).jdMethod_if(paramByte);
      return;
    case 35:
      a("/cm/ui/pcrecord.ui");
      return;
    case 36:
      a("/cm/ui/pbrecord.ui");
      return;
    case 37:
      a("/cm/ui/phelp.ui");
      return;
    case 38:
      a("/cm/ui/result.ui");
      (paramByte = (ak)es.cf().elementAt(3)).jdMethod_if(bk.X);
      paramByte.ap();
      return;
    case 17:
      if (!bk.W)
      {
        eQ.a(2425014);
        System.out.println("send C_CM_GET_ADDRESS");
        bk.W = true;
      }
      eQ.a(65557);
      eQ.a(65558);
      if ((f6 == null) || (f6[0] != 1))
        break;
      eQ.a(65568);
    case 7:
    case 9:
    case 20:
    case 24:
    case 25:
    case 26:
    case 28:
    }
  }

  public static void a(String paramString)
  {
    if (es != null)
    {
      es.cy();
      es = null;
      fE.removeAllElements();
    }
    es = e.a(paramString);
  }

  public static final byte jdMethod_else()
  {
    return iK;
  }

  public static void a(String paramString1, String paramString2)
  {
    int[] arrayOfInt = b5.jdMethod_int(paramString1 = "gameKey" + paramString1, iH.length);
    b5.jdMethod_try(paramString1);
    paramString1 = "gameKey" + paramString2;
    b5.a(arrayOfInt, paramString1);
  }

  public static void jdMethod_for(String paramString)
  {
    gG = paramString;
    paramString = "gameKey" + gG;
    int k;
    try
    {
      iq = b5.jdMethod_int(paramString, iH.length);
    }
    catch (Exception localException1)
    {
      iq = b5.jdMethod_int(paramString, iH.length - 1);
      int[] arrayOfInt = new int[iH.length];
      int j = 0;
      k = iH.length;
      while (j < k)
      {
        if (j < 4)
          arrayOfInt[j] = iq[j];
        else if (j == 4)
          arrayOfInt[j] = iH[4];
        else
          arrayOfInt[j] = iq[(j - 1)];
        j++;
      }
      iq = new int[iH.length];
      iq = arrayOfInt;
    }
    if (iq == null)
    {
      b5.a(iH, paramString);
      iq = b5.jdMethod_int(paramString, iH.length);
    }
    short[] arrayOfShort1 = { 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int i = 0;
    try
    {
      short[] arrayOfShort2;
      if ((arrayOfShort2 = b5.a("showSetup", 2)) == null)
      {
        gn = 1;
        for (k = 0; k < 5; k++)
          i = (short)(i | arrayOfShort1[k] << k);
        dM = i;
        b5.a(new short[] { i, (short)gn }, "showSetup");
      }
      else
      {
        dM = b5.a("showSetup", 2)[0];
        gn = (byte)b5.a("showSetup", 2)[1];
      }
    }
    catch (Exception localException2)
    {
      gn = 1;
      for (k = 0; k < 5; k++)
        i = (short)(i | arrayOfShort1[k] << k);
      dM = i;
      b5.a(new short[] { i, (short)gn }, "showSetup");
    }
    J();
    Object localObject;
    try
    {
      if ((localObject = b5.jdMethod_if("quantitySetup", 1)) == null)
      {
        hi = 1;
        b5.a(new byte[] { hi }, "quantitySetup");
      }
      else
      {
        hi = b5.jdMethod_byte("quantitySetup")[0];
      }
    }
    catch (Exception localException3)
    {
      hi = 1;
      b5.a(new byte[] { hi }, "quantitySetup");
    }
    b2.a();
    b2.try.jdMethod_goto();
    try
    {
      byte[] arrayOfByte;
      if ((arrayOfByte = b5.jdMethod_if(localObject = "pvpSetup" + gG, 1)) == null)
      {
        if (bp.ag().r() >= 20)
          gK = 0;
        else
          gK = 1;
        b5.a(new byte[] { gK }, (String)localObject);
      }
      else
      {
        gK = arrayOfByte[0];
        return;
      }
    }
    catch (Exception localException4)
    {
    }
  }

  public static final void J()
  {
    l.long = dM % 2 != 0;
    l.for = (dM >> 1) % 2 != 0;
    l.new = (dM >> 3) % 2 != 0;
    bu.c = (dM >> 2) % 2 != 0;
  }

  private static void z()
  {
    Image[] arrayOfImage;
    f5 = (arrayOfImage = b5.jdMethod_if(fu, new String[] { "b_a2.png", "smenu.png", "menu_j.png" }))[0];
    dP = arrayOfImage[1];
    h1 = arrayOfImage[2];
  }

  private static void jdMethod_try()
  {
    f5 = null;
    dP = null;
    h1 = null;
  }

  private final void d(Graphics paramGraphics)
  {
    paramGraphics.setColor(5508390);
    paramGraphics.fillRect(0, 0, ic, il);
    paramGraphics.setColor(16513768);
    paramGraphics.drawString("请稍候5到10秒钟...", ic >> 1, il - (iG << 1) - 10, 17);
    for (int i = 0; i < bm.bn.length; i++)
      paramGraphics.drawString(bm.bn[i], (ic >> 1) - (iA * bm.bn[i].length() >> 1), iG * i + (il >> 1) - 50, 20);
    repaint();
    try
    {
      switch (dA)
      {
      case 0:
        break;
      case 5:
        break;
      case 10:
        gA = b5.a("/cursor.png");
        break;
      case 15:
        if (fM != null)
          break;
        fM = b5.a("/special/TJ2.png");
        break;
      case 50:
        if (eS != null)
          break;
        eS = b5.a("/special/TJ2.fdat", 0, true);
        break;
      case 55:
        if (eJ != null)
          break;
        eJ = b5.jdMethod_for("/special/TJ2.pdat", true);
        break;
      case 60:
        if (g8 != null)
          break;
        g8 = b5.jdMethod_if("/special/TJ2.mdat", true);
        break;
      case 70:
        if (!gZ)
          break;
        gF = new bi("/special/touchMenu.png", 15, 15);
        break;
      case 75:
        new a3(1);
        Object localObject = null;
        if ((a5.fm = b5.jdMethod_byte("gamemount")) == null)
          (a5.fm = new byte[1])[0] = 2;
        if (fm[0] == 0)
        {
          hM = false;
          dU = true;
          b5.jdMethod_case("m_bCMWAPorCMNERT=" + dU);
        }
        else if (fm[0] == 1)
        {
          hM = false;
          dU = false;
          b5.jdMethod_case("m_bCMWAPorCMNERT=" + dU);
        }
        else if (fm[0] == 2)
        {
          hM = true;
          dU = true;
        }
        this = 0;
        this = b5.jdMethod_if(a5.fu = "/ui_1.pkg", new String[] { "cao.png", "hua.png", "b_l.png", "b_s.png", "b_a.png", null, "b_b.png", "f_x.png", "f_j.png", "a_a.png", "gx1.png", "gx2.png", "l_b.png", null, "k_f.png", "dong.png", "taiji.png", "num.png", "num_data.png", "arr.png", "num_lv.png", "p_j.png", null, "newnum_lv.png" });
        z();
        ge = this[0];
        ed = this[1];
        gu = this[2];
        hI = this[3];
        ca = this[4];
        ec = this[6];
        iJ = this[7];
        gU = this[8];
        eb = this[9];
        e9 = this[10];
        f7 = this[11];
        cY = this[12];
        e3 = this[14];
        fz = this[15];
        fv = this[16];
        gr = this[21];
        cG = new bi(this[17], 5, 7);
        dY = new bi(this[18], 4, 8);
        new bi(this[19], 8, 4);
        eR = new bi(this[20], 10, 9);
        dx = new bi(this[23], 6, 9);
        break;
      case 80:
        b.dJ = a4.d.jdMethod_if(a4.d.jdMethod_for(0));
        new b1();
        break;
      case 94:
        e.a("/ui/list.ui");
        break;
      case 96:
        break;
      case 98:
        c1 = b5.a("/mammoth.png");
        jdMethod_long();
        break;
      case 100:
        if (((a5.hC = b5.jdMethod_do("name_password", 2)) == null ? 0 : 1) != 0)
        {
          cF = true;
          fC = bm.cI;
        }
        else
        {
          cF = false;
          fC = bm.Y;
        }
        if (gw == null)
        {
          if (gZ)
            jdMethod_do(4);
          else
            jdMethod_do(28);
        }
        else
          jdMethod_do(4);
      }
      dA += 1;
      paramGraphics.drawRect(ic - 100 >> 1, il - (iG << 1) + iG, 102, 6);
      for (int j = 0; j < dA / 5; j = (byte)(j + 1))
      {
        paramGraphics.setColor(16579274);
        paramGraphics.fillRect((ic - 100 >> 1) + 2 + j * 5, il - (iG << 1) + 2 + iG, 4, 3);
        paramGraphics.setColor(460544);
        paramGraphics.drawLine((ic - 100 >> 1) + 2 + j * 5 + 1, il - (iG << 1) + 2 + 1 + iG, (ic - 100 >> 1) + 2 + j * 5 + 1 + 1, il - (iG << 1) + 2 + 1 + iG);
      }
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
    paramGraphics.drawImage(hf, 5, 5, 0);
  }

  public static void ae()
  {
    if (!d9)
    {
      b.S();
      b.ac();
      b.T();
      d9 = true;
    }
  }

  private final void jdMethod_long()
  {
    if (cS == null)
    {
      Graphics localGraphics;
      (localGraphics = (a5.cS = Image.createImage(ic, il)).getGraphics()).setColor(this.ij[0]);
      localGraphics.fillRect(0, 0, ic, il);
      this = 1;
      int i = il;
      this = this.ij[1];
      int k;
      int[] arrayOfInt = new int[i = (k = i) << 2];
      for (int i1 = 0; i1 < k; i1++)
      {
        int m;
        if ((m = i1) > 255)
          m = 255;
        int n = this | m << 24;
        arrayOfInt[(i1 << 2)] = n;
        arrayOfInt[((i1 << 2) + 1)] = n;
        arrayOfInt[((i1 << 2) + 2)] = n;
        arrayOfInt[((i1 << 2) + 3)] = n;
      }
      this = arrayOfInt;
      for (int j = 0; j < ic; j += 4)
      {
        k = (k = 0 + ic - j) > 4 ? 4 : k;
        localGraphics.drawRGB(this, 0, 4, j, 0, k, il, true);
      }
    }
  }

  private static void jdMethod_byte(Graphics paramGraphics)
  {
    paramGraphics.setColor(5508390);
    paramGraphics.fillRect(0, 0, ic, il);
    paramGraphics.setColor(16513768);
    paramGraphics.drawString("请稍候5到10秒钟...", ic >> 1, il - (iG << 1) - 10 - iG, 17);
    paramGraphics.drawRect(ic - 100 >> 1, il - (iG << 1), 102, 6);
    for (int i = 0; i < dA / 5; i = (byte)(i + 1))
    {
      paramGraphics.setColor(16579274);
      paramGraphics.fillRect((ic - 100 >> 1) + 2 + i * 5, il - (iG << 1) + 2, 4, 3);
      paramGraphics.setColor(460544);
      paramGraphics.drawLine((ic - 100 >> 1) + 2 + i * 5 + 1, il - (iG << 1) + 2 + 1, (ic - 100 >> 1) + 2 + i * 5 + 1 + 1, il - (iG << 1) + 2 + 1);
    }
    if (dA >= 100)
      B();
  }

  public static void jdMethod_if()
  {
    if (ie)
      return;
    if (!ie)
    {
      gg = new bi("/special/stuff.png", 14, 14);
      hL = new bi("/zy.png", 10, 10);
      fT = b5.a("/shadow.png");
      eq = new bi("/taskicon.png", 10, 12);
      b9 = new bi("/special/mark.png", 11, 15);
      gz = new bi("/special/task.png", 28, 10);
      hN = new bi("/special/mouse.png", 14, 7);
      cJ = new bi("/special/face.png", 12, 12);
      b5.a("/special/star.png");
      e4 = b5.a("/HPMP.png");
      fj = new bi("/special/bf.png", 10, 10);
      ch = new bi("/special/passive.png", 24, 20);
      hk = new bi("/special/flag_red.png", 33, 52);
      dE = new bi("/special/flag_blue.png", 33, 52);
      eh = new bi("/special/flag_gray.png", 33, 52);
      cO = new bi("/special/small_redflag.png", 16, 14);
      fQ = new bi("/special/small_blueflag.png", 16, 14);
      eP = b5.a("/special/upgrade.png");
      fh = b5.a("/special/treasure1.png");
      z.ak = b5.jdMethod_if("/wm/wm.pkg", "city1.png");
      for (int i = 0; i < z.ao.length; i++)
        z.ao[i] = b5.jdMethod_if("/wm/wm.pkg", i + ".png");
      for (i = 0; i < z.m.length; i++)
        if (i == 6)
          z.m[i] = b5.jdMethod_if("/wm/wm.pkg", "rt4.png");
        else if (i == 7)
          z.m[i] = b5.jdMethod_if("/wm/wm.pkg", "rt6.png");
        else
          z.m[i] = b5.jdMethod_if("/wm/wm.pkg", "rt" + i + ".png");
      ie = true;
    }
  }

  public static String jdMethod_int(int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer(4);
    int i = paramInt;
    localStringBuffer.append(String.valueOf(i >>> 24)).append(".");
    i = paramInt;
    localStringBuffer.append(String.valueOf(i >>> 16 & 0xFF)).append(".");
    i = paramInt;
    localStringBuffer.append(String.valueOf(i >>> 8 & 0xFF)).append(".");
    i = paramInt;
    localStringBuffer.append(String.valueOf(i & 0xFF));
    return localStringBuffer.toString();
  }

  private void jdMethod_char(Graphics paramGraphics)
  {
    int i = (iA << 2) + 40;
    int j = (ic - i) / 2;
    int k = (iG + 4) * 5 + 16;
    int m = (il - k) / 2;
    int n = j + 4 + 10 - 1;
    int i1 = m + 5 - 1;
    int i2 = i - 28 + 2;
    int i3 = k - 10 + 2;
    paramGraphics.setColor(14527877);
    paramGraphics.fillRect(n + 1, i1 + 1, i2 - 1, i3 - 1);
    paramGraphics.setColor(4930874);
    paramGraphics.drawRect(n, i1, i2, i3);
    int i4 = n + 2;
    int i5 = i1 + 2;
    int i6 = i2 - 4;
    int i7 = i3 - 4;
    paramGraphics.setColor(16575691);
    paramGraphics.fillRect(i4 + 1, i5 + 1, i6 - 1, i7 - 1);
    paramGraphics.setColor(4930874);
    paramGraphics.drawRect(i4, i5, i6, i7);
    i4 += 2;
    i5 += 2;
    i6 -= 4;
    i7 -= 4;
    paramGraphics.setColor(14397060);
    paramGraphics.drawRect(i4, i5, i6, i7);
    i7 = i4 + 1;
    i5 += 1;
    b5.a(paramGraphics, dP, n - dP.getWidth(), i1 + (iG + 3 >> 1) - 5, 2);
    b5.a(paramGraphics, dP, n + i2, i1 + 4 * (iG + 3) + 2, 0);
    b5.a(paramGraphics, h1, n + i2 - 6, i1 - h1.getHeight() + 7, 3);
    b5.a(paramGraphics, h1, n - h1.getWidth() + 7, i1 + i3 - 6, 0);
    n = 0;
    i1 = i5 - 1;
    br.jdMethod_new(fC);
    for (i2 = 0; i2 < 5; i2++)
    {
      if (i2 != fC.length - 1)
      {
        i3 = i4 + 1;
        i8 = i1 + (i2 + 1) * (iG + 4);
        i9 = i3 + i6 - 2;
        i10 = i8;
        paramGraphics.setColor(bm.bY);
        paramGraphics.drawLine(i3, i8, i9, i10);
      }
      i3 = i7;
      int i8 = i5 + i2 * (iG + 4);
      int i9 = i6 - 1;
      int i10 = iG + 3;
      if (i2 % 2 == 0)
      {
        paramGraphics.setColor(bm.y);
        paramGraphics.fillRect(i3, i8, i9, i10);
      }
      int i11;
      if ((i11 = this.eW + i2) >= fC.length)
        i11 -= fC.length;
      if (i11 == this.hW)
      {
        n = bm.try;
        i3 += 1;
        i8 += 1;
        i9 -= 1;
        i10 -= 2;
        paramGraphics.setColor(bm.bo);
        paramGraphics.fillRect(i3, i8, i9, i10);
      }
      else
      {
        n = bm.bP;
      }
      b5.jdMethod_do(paramGraphics, fC[i11], i, j, i1 + 4 + i2 * (iG + 4), n);
    }
    i2 = j + (i - f5.getWidth() >> 1);
    i3 = m + k - f5.getHeight() + 1;
    this.gc ^= 1;
    paramGraphics.drawImage(f5, i2, m - 3 - this.gc, 20);
    b5.a(paramGraphics, f5, i2, i3 + 3 + this.gc, 1);
    paramGraphics.drawImage(c1, ic >> 1, il - c1.getHeight(), 17);
    this = paramGraphics;
    paramGraphics = il - 4 - 2 * iG;
    setColor(11809066);
    drawRoundRect(ic - 4 - 2 * iA, paramGraphics - 2, 2 * iA + 2, 2 * (iG + 1) + 2, 6, 6);
    setColor(16710106);
    fillRoundRect(ic - 4 - 2 * iA + 1, paramGraphics - 2 + 1, 2 * iA + 2 - 1, 2 * (iG + 1) + 2 - 1, 6, 6);
    String[] arrayOfString = { "永久", "免费" };
    for (j = 0; j < 2; j++)
    {
      setColor(11809066);
      drawString(arrayOfString[j], ic - 4 - 2 * iA + 2, paramGraphics + j * (iG + 1), 20);
    }
  }

  private void Y()
  {
    if ((gZ) && (jdMethod_byte(268435456)))
    {
      if (gQ != null)
      {
        gQ.aV();
        return;
      }
      a5 locala5 = (iA << 2) + 40;
      int i = (ic - locala5) / 2;
      int j = (iG + 4) * 5 + 16;
      int k = (il - j) / 2;
      int m = i + 4 + 10 + 3 + 1 + 1;
      int n = k + 5 + 1 + 1 + 1;
      int i1 = br.jdMethod_new(bm.cI);
      m = m;
      i1 = i1 * iA + 2;
      int i2 = iG + 3;
      for (int i3 = 0; i3 < 5; i3 = (byte)(i3 + 1))
      {
        i4 = n + i3 * (iG + 4);
        if (!a(m, i4, i1, i2))
          continue;
        this.hW = (byte)(this.eW + i3);
        if (this.hW >= bm.cI.length)
          this.hW = (byte)(this.hW - bm.cI.length);
        this.ct = i3;
        a(131072);
        return;
      }
      i3 = ca.getHeight();
      int i4 = i;
      this = locala5;
      locala5 = k + i3;
      i = k + j - i3;
      j = il - i;
      if (a(i4, 0, this, locala5))
        a(4096);
      if (a(i4, i, this, j))
        a(8192);
    }
  }

  private void x()
  {
    jdMethod_do(11);
    hQ = 0;
  }

  private void K()
  {
    if (this.g0 == 1)
    {
      a(0, "测试人员不能注册", "确定", "", -7, -120);
      return;
    }
    this.cT = 2;
    if (hC == null)
      hC = new String[2];
    this = "请您稍候...";
    a(0, this, "", "", -120, -120);
    bk.jdField_d_of_type_Boolean = true;
    this = null;
    this = bk.q;
    (this = new bk(this, bk.jdMethod_do(5), dU ? 0 : 1, 2)).a(0);
    hQ = 0;
  }

  private void Z()
  {
    if (this.g0 == 1)
    {
      a(0, "测试人员不能注册", "确定", "", -7, -120);
      return;
    }
    jdMethod_do(14);
    this.cT = 2;
    if (hC == null)
      hC = new String[2];
    hQ = 0;
  }

  private static void h()
  {
    jdMethod_do(8);
    hQ = 0;
  }

  private static void s()
  {
    jdMethod_do(6);
    hQ = 0;
  }

  private static void X()
  {
    jdMethod_do(10);
    hQ = 0;
  }

  private void L()
  {
    jdMethod_goto();
    try
    {
      this = null;
      if (("2dcn".equals(gd)) || (gd.indexOf("dj") != -1))
      {
        this = "http://zt.d.cn/a091111_netgame_forum_promotion/index.pih?fid=3973&cid=108";
      }
      else if ("2sna".equals(gd))
      {
        this = "http://3g.sina.com.cn/game/s/3g/?from=60755";
      }
      else
      {
        if (hC == null)
          hC = b5.jdMethod_do("name_password", 2);
        if ((hC != null) && (!"".equals(hC[0])) && (!"".equals(hC[1])))
          this = "http://g.ko.cn/gk/fswap/popup.jsp?wun=" + hC[0] + "&wpw=" + hC[1] + "&wtp=" + (((a5.f6 = b5.jdMethod_byte("login_type")) != null) && (f6[0] == 1) ? "k" : "ko") + "&from=" + gd;
        else
          this = "http://g.ko.cn/gk/fswap/popup.jsp?from=" + gd;
      }
      b5.jdMethod_case("popURL = " + this);
      dI.platformRequest(this);
    }
    catch (Exception localException)
    {
      (this = localException).printStackTrace();
    }
    (this = dI).notifyDestroyed();
  }

  public static void jdMethod_try(byte paramByte)
  {
    cg = gh;
    gh = paramByte;
    de = true;
  }

  public static void jdMethod_case(byte paramByte)
  {
    gh = paramByte;
    de = true;
  }

  public static final byte V()
  {
    return gh;
  }

  private void jdMethod_void(Graphics paramGraphics)
  {
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, ic, il);
    z.a().jdMethod_for(paramGraphics);
    b2.a();
    b2.a(paramGraphics);
    paramGraphics = paramGraphics;
    this = this;
    if (cu)
    {
      this.cd += 1;
      if (this.cd > 15)
      {
        cu = false;
        this.cd = 0;
      }
      paramGraphics.setColor(16711680);
      paramGraphics.drawString(bm.aJ[gn], ic >> 1, 20, 17);
    }
  }

  private static void jdMethod_if(Graphics paramGraphics)
  {
    if (gQ != null)
      gQ.a(paramGraphics);
  }

  public static void aj()
  {
    if (ea != null)
    {
      ea = null;
      b5.jdMethod_case("离开右键菜单");
      jdMethod_try(0);
    }
  }

  private final void aa()
  {
    if (de)
      return;
    short s2;
    Object localObject;
    if (h4 != null)
    {
      ao.aH();
      if (jdMethod_byte(458752))
      {
        h4 = null;
        if (bp.ag().r() < 20)
        {
          eQ.a(196635);
          System.out.println("发送新手保护命令！！！");
        }
        if (u.byte)
        {
          a("/ui/maturity.ui");
          es.g9 = -1610612632;
          jdMethod_try(4);
          (this = (ak)es.cf().elementAt(3)).jdMethod_else(u.l);
          jdMethod_if(u.d);
          ap();
          short s1 = (short)(v() + 2);
          s2 = (short)(z() + 2);
          localObject = "请您选择：";
          short s3 = u.long;
          ay localay;
          (localay = new ay(s1, s2, 2, (String)localObject, es)).d1 = new boolean[s3];
          for (s2 = 0; s2 < s3; s2 = (byte)(s2 + 1))
          {
            localObject = u.u[s2];
            localay.jdMethod_try((String)localObject);
            localay.d1[s2] = false;
          }
          es.jdMethod_if(localay);
          a(1, 5);
          localay.a(0, 4);
          return;
        }
      }
      else if (jdMethod_byte(12288))
      {
        (this = (ak)h4.cf().elementAt(3)).f();
      }
      return;
    }
    if (gQ != null)
    {
      gQ.a7();
      return;
    }
    as.aL();
    int i;
    switch (gh)
    {
    case 0:
      if (jdMethod_byte(262144))
      {
        ea = new b1();
        b5.jdMethod_case("创建右键菜单");
        jdMethod_try(1);
      }
      else if (jdMethod_byte(iq[15]))
      {
        this.cd = 0;
        cu = true;
        if ((a5.gn = (byte)(gn + 1)) > 2)
          gn = 0;
        this = gn;
        i = 0;
        s2 = (short)this;
        localObject = null;
        switch (this)
        {
        case 0:
          localObject = new short[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
          break;
        case 1:
          localObject = new short[] { 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
          break;
        case 2:
          localObject = new short[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        }
        for (this = 0; this < 5; this++)
          i = (short)(i | localObject[this] << this);
        dM = i;
        b5.a(new short[] { dM, s2 }, "showSetup");
        J();
        if ((gn == 2) && (l.a().jdField_try == 1) && (l.a() != bp.ag()))
        {
          l.jdMethod_do(bp.ag());
          bp.ag().aA();
        }
        b5.jdMethod_case("----------" + bm.aJ[gn] + "-------------");
        eQ.a(196632);
      }
      else if (jdMethod_byte(iq[16]))
      {
        b1.v(71);
      }
      else if (jdMethod_byte(iq[21]))
      {
        b1.v(6);
      }
      else if (jdMethod_byte(iq[22]))
      {
        eQ.a(851976);
      }
      else if (jdMethod_byte(iq[23]))
      {
        eQ.a(458760);
      }
      else if (jdMethod_byte(iq[24]))
      {
        b1.v(1);
      }
      else if (jdMethod_byte(iq[25]))
      {
        b1.dK();
      }
      else if (jdMethod_byte(iq[26]))
      {
        eQ.a(262187);
      }
      else if (jdMethod_byte(iq[27]))
      {
        b1.v(4);
      }
      else if (jdMethod_byte(iq[28]))
      {
        b1.v(3);
      }
      else
      {
        if (!jdMethod_byte(iq[29]))
          break;
        b1.v(9);
      }
      break;
    case 1:
      if (ea == null)
        break;
      ea.f();
      break;
    case 3:
      ao.aH();
      be.gu.jdMethod_for();
      break;
    case 4:
      if (es == null)
        break;
      es.cw();
      ao.aH();
      break;
    case 5:
      if ((br.iW == null) || (fR))
        break;
      if (jdMethod_byte(262144))
      {
        br.iW = null;
        jdMethod_try(0);
      }
      else if (jdMethod_byte(4096))
      {
        br.iW.c8();
      }
      else if (jdMethod_byte(8192))
      {
        br.iW.c9();
      }
      else
      {
        if (!jdMethod_byte(196608))
          break;
        this = ((Integer)br.iW.db().elementAt(br.iW.de())).intValue();
        if ((br.iW.iV == 2) && (al.for != null))
          ah.aQ = al.for[br.iW.de()];
        if (br.iW.iV == 3)
        {
          bv.jI = bf.do[br.iW.de()];
          if ((i = bf.new[br.iW.de()]) == 2)
            bv.jP = false;
          else if (i == 1)
            bv.jP = true;
          else if (i == 4)
            bv.jp = false;
          else if (i == 3)
            bv.jp = true;
          if (this == 0)
          {
            jdMethod_try(0);
            return;
          }
        }
        if (this == 0)
        {
          ad.jdMethod_int(7, "此功能尚未开启。", -1, "", null, null);
          jdMethod_try(0);
          return;
        }
        if (br.iW.iV != 2)
          br.iW = null;
        eQ.a(this);
        b5.jdMethod_case("cmdcmdcmdcmd" + Integer.toHexString(this));
        jdMethod_try(0);
      }
      break;
    case 6:
      if (br.iZ == null)
        break;
      if (jdMethod_byte(262144))
      {
        br.iZ = null;
        jdMethod_try(0);
      }
      else if (jdMethod_byte(4096))
      {
        br.iZ.c8();
      }
      else if (jdMethod_byte(8192))
      {
        br.iZ.c9();
      }
      else
      {
        if (!jdMethod_byte(196608))
          break;
        bp.ag().aq();
      }
    case 2:
    }
    if ((jdMethod_byte(-1)) && (w.ca))
      w.cd = true;
  }

  public static final boolean a(String paramString, byte paramByte)
  {
    for (int i = 0; i < paramString.length(); i++)
    {
      int j = paramString.charAt(i);
      if (paramByte == 1)
      {
        if (!jdMethod_char(j))
          return false;
      }
      else if (paramByte == 2)
      {
        if ((!jdMethod_char(j)) && (!jdMethod_do(j)))
          return false;
      }
      else if (paramByte == 3)
      {
        if ((jdMethod_char(j)) || (jdMethod_do(j)))
          continue;
        j = j;
        for (int k = 0; k < bm.c5.length; k++);
        if ((j == bm.c5[k] ? 1 : 0) == 0)
          return false;
      }
      else
      {
        if (paramByte != 4)
          continue;
        if (jdMethod_char(j))
        {
          String str = paramString;
          if (((paramString.length() >= 6) && (str.length() <= 16) ? 1 : 0) != 0)
            continue;
        }
        else
        {
          return false;
        }
      }
    }
    return true;
  }

  private static final boolean jdMethod_char(int paramInt)
  {
    return ((paramInt >= 65) && (paramInt <= 90)) || ((paramInt >= 97) && (paramInt <= 122)) || ((paramInt >= 48) && (paramInt <= 57));
  }

  private static final boolean jdMethod_do(int paramInt)
  {
    return (paramInt >= 19968) && (paramInt <= 40868);
  }

  public static void a(be parambe)
  {
    if (parambe == null)
    {
      es = a5.dS = null;
      return;
    }
    dS = es;
    es = parambe;
  }

  private static void af()
  {
    a9 locala9 = (a9)es.cf().elementAt(27);
    StringBuffer localStringBuffer;
    (localStringBuffer = new StringBuffer()).append(be.gs);
    locala9.a(localStringBuffer);
  }

  private static void O()
  {
    ah localah = (ah)es.cf().elementAt(5);
    int i = 0;
    int j = es.cf().size();
    while (i < j)
    {
      a7 locala7;
      if ((((ba)es.cf().elementAt(i) instanceof a7)) && (((ba)es.cf().elementAt(i)).jdMethod_char() == 1) && (((ba)es.cf().elementAt(i)).q()) && ((locala7 = (a7)es.cf().elementAt(i)).r == 34))
      {
        be.hd = false;
        localah.a(locala7.bv());
        be.hH = (byte)(i - 7);
        localah.jdMethod_char(r.E(locala7.bD()));
      }
      i++;
    }
  }

  private void jdMethod_byte()
  {
    if (h7 != null)
    {
      b5.jdMethod_case("uiDatacountTick" + ht);
      a(e.a(h7, true));
      h7 = null;
      if (fE.size() > 0)
        if (dK == -1)
          es = (be)fE.elementAt(0);
        else
          es = (be)fE.elementAt(dK);
    }
    if (h2 != null)
    {
      b5.jdMethod_case("userDatacountTick" + ht);
      Object localObject1 = h2;
      Object localObject6;
      try
      {
        e.a(localObject6 = new DataInputStream(new ByteArrayInputStream(localObject1)));
      }
      catch (Exception localException1)
      {
        (localObject6 = localException1).printStackTrace();
      }
      N();
      h2 = null;
      ep = true;
      if ((es.g9 != 1900548) && (es.g9 != 1900546))
        fR = false;
      if (eQ.e)
        if (eQ.jdField_int.length > 0)
        {
          fR = true;
          eQ.jdMethod_if();
        }
        else
        {
          if (c9 != -1)
          {
            ((be)fE.elementAt(0)).ht = c9;
            a((be)fE.elementAt(c9));
            c9 = -1;
          }
          eQ.e = false;
        }
      dK = -1;
      if (gh != 4)
        if (gh != 3)
          jdMethod_try(4);
        else
          jdMethod_case(4);
      if ((iK == 12) || ((da) && (iK == 11)) || (iK == 18))
      {
        gQ = null;
        jdMethod_do(17);
      }
      if (es.g9 == 1638421)
        (localObject1 = (ao)es.cf().elementAt(0)).jdMethod_do(bt.do);
      if ((es.g9 == 262147) || (es.g9 == 262176))
      {
        es.c("#键切换任务详情和任务提示");
        (localObject1 = (ao)es.cf().elementAt(1)).a("移动", 0);
      }
      if (es.g9 == 262157)
        bf.jdMethod_if();
      if (es.g9 == 262154)
        bf.a();
      Object localObject8;
      if ((es.g9 == 1638401) || (es.g9 == 1835009))
      {
        (localObject1 = (a9)es.cf().elementAt(3)).j(false);
        localObject6 = (ah)es.cf().elementAt(6);
        (localObject8 = (ah)es.cf().elementAt(7)).jdMethod_new((short)(((ba)localObject6).v() + iA * 6 + 2));
      }
      if ((es.g9 == 393219) || (es.g9 == 2490386))
      {
        (localObject1 = (ao)es.cf().elementAt(0)).jdMethod_for(true);
        ((ba)localObject1).a(true, es);
        ((ba)localObject1).w();
      }
      if (es.g9 == 1376260)
      {
        b5.jdMethod_case("curForm.clientCommand == CommandList.C_TRADE_VIEW");
        af();
        O();
      }
      if (es.g9 == 1376268)
        (localObject1 = (a9)es.cf().elementAt(27)).a(new StringBuffer(be.gs + ""));
      if (es.g9 == 1703939)
      {
        b5.jdMethod_case("curForm.clientCommand == CommandList.C_MAIL_INBOX");
        if ((localObject1 = (bg)es.cf().elementAt(3)).cD().size() > 0)
        {
          if (q.g >= ((bg)localObject1).cD().size())
            q.g = (byte)(((bg)localObject1).cD().size() - 1);
          for (int n = 0; n < q.g; n++)
          {
            a(8192);
            ((bg)localObject1).f();
            jdMethod_for(8192);
          }
          q.g = 0;
        }
      }
      if ((es.g9 == 1703954) || ((es.g9 == 458753) && (q.m == 1)))
      {
        if ((es.g9 == 1703954) && (am.else))
          return;
        (localObject1 = (ao)es.cf().elementAt(1)).a("", 0);
      }
      if (es.g9 == 851978)
        (localObject1 = (ao)es.cf().elementAt(1)).a("", 0);
      if (es.g9 == 1703958)
        es.c("#键切换选项和内容");
      if (es.g9 == 2490390)
        (localObject1 = (ao)es.cf().elementAt(0)).jdMethod_do("寻找师傅");
      if (es.g9 == 2490391)
        (localObject1 = (ao)es.cf().elementAt(0)).jdMethod_do("寻找徒弟");
      Object localObject7;
      if ((es.g9 == 458755) || (es.g9 == 458768))
      {
        (localObject1 = (ba)es.cf().elementAt(4)).a(false, es);
        (localObject7 = (ba)es.cf().elementAt(at.do)).a(true, es);
      }
      if (((es.g9 == 2424839) || (es.g9 == 2424994) || (es.g9 == 2425072)) && (bo.q != 1))
      {
        bk.jdMethod_byte();
        if (!bk.v)
          bk.a();
      }
      if ((es.g9 == 2031636) && (r.nf) && ((aq.a != -1) || (aq.int != -1)))
      {
        localObject1 = (r)es.cf().elementAt(9);
        if (aq.int != -1)
        {
          aq.for = 2;
          ((r)localObject1).K(aq.int);
          ((r)localObject1).dU();
        }
        if (aq.a != -1)
        {
          aq.for = 1;
          ((r)localObject1).K(aq.a);
          ((r)localObject1).dU();
        }
        if ((localObject7 = (a7)es.cf().elementAt(6)).q())
        {
          ((ba)localObject7).a(false, es);
          (localObject8 = (a7)es.cf().elementAt(4)).a(true, es);
        }
      }
      if (es.g9 == 2621443)
        (localObject1 = (ao)es.cf().elementAt(0)).jdMethod_do(b4.f);
      if (es.g9 == 2621445)
      {
        (localObject1 = (ao)es.cf().elementAt(0)).jdMethod_do(b4.f);
        (localObject7 = (ay)es.cf().elementAt(8)).jdMethod_case(1);
      }
      if (es.g9 == 2621442)
        bk.jdMethod_new();
      if ((es.g9 == 2162692) || (es.g9 == 2162694) || (es.g9 == 2162698) || (es.g9 == 2162699) || (es.g9 == 2162705) || (es.g9 == 2162707) || (es.g9 == 2162704) || (es.g9 == 2162706) || (es.g9 == 2162716) || (es.g9 == 2162718) || (es.g9 == 2162715) || (es.g9 == 2162717) || (es.g9 == 2162727) || (es.g9 == 2162729) || (es.g9 == 2162726) || (es.g9 == 2162728) || (es.g9 == 2162738) || (es.g9 == 2162737) || (es.g9 == 2162746) || (es.g9 == 2162758) || (es.g9 == 2162759) || (es.g9 == 2162765) || (es.g9 == 2162766) || (es.g9 == 2162772) || (es.g9 == 2162773) || (es.g9 == 2162779) || (es.g9 == 2162780))
        (localObject1 = (ao)es.cf().elementAt(0)).jdMethod_do(bb.int);
      if (es.g9 == 1703969)
        es.c("#键切换选项和内容");
      if ((es.g9 == 1703959) || (es.g9 == 1703960) || (es.g9 == 1703961))
        iE = true;
      int i3;
      if (es.g9 == 2097155)
      {
        (localObject1 = (ah)es.cf().elementAt(38)).jdMethod_new((short)(ic - ((ba)localObject1).jdMethod_for() >> 1));
        (localObject7 = (ah)es.cf().elementAt(34)).jdMethod_new((short)((ic >> 1) - ((ba)localObject7).jdMethod_for() >> 1));
        (localObject8 = (ah)es.cf().elementAt(35)).jdMethod_new((short)((ic << 1) - (ic >> 1) - ((ba)localObject8).jdMethod_for() >> 1));
        (localObject7 = (ah)es.cf().elementAt(36)).jdMethod_new((short)((ic >> 1) - ((ba)localObject7).jdMethod_for() >> 1));
        (localObject1 = (ah)es.cf().elementAt(37)).jdMethod_new((short)((ic << 1) - (ic >> 1) - ((ba)localObject1).jdMethod_for() >> 1));
        for (i3 = 0; i3 < 7; i3++)
        {
          localObject7 = (ah)es.cf().elementAt(i3 + 17);
          a7 locala71 = (a7)es.cf().elementAt(i3 + 10);
          ((ba)localObject7).jdMethod_new((short)(locala71.v() + (locala71.jdMethod_for() >> 1) - (((ba)localObject7).jdMethod_for() >> 1) + 4));
          if (i3 == 0)
          {
            ((ah)localObject7).a("2");
          }
          else if (i3 == 1)
          {
            ((ah)localObject7).a("3");
          }
          else if (i3 == 2)
          {
            ((ah)localObject7).a("5");
          }
          else if (i3 == 3)
          {
            ((ah)localObject7).a("10");
          }
          else if (i3 == 4)
          {
            ((ah)localObject7).a("15");
          }
          else if (i3 == 5)
          {
            ((ah)localObject7).a("25");
          }
          else
          {
            if (i3 != 6)
              continue;
            ((ah)localObject7).a("30");
          }
        }
      }
      if (hH)
      {
        b5.jdMethod_case("接收完数据后退到选人界面");
        jdMethod_do(17);
        hH = false;
      }
      if (iK == 17)
      {
        if (gQ != null)
          gQ = null;
        this.cP = b5.jdMethod_byte("debarkation");
        if (this.cP == null)
          this.cP = new byte[3];
        this.fo = b5.jdMethod_byte("debarkation1");
        if (this.fo == null)
          this.fo = new byte[3];
        gE = false;
        localObject1 = (ah)es.cf().elementAt(16);
        localObject7 = (ao)es.cf().elementAt(1);
        for (i3 = 0; i3 < iC.length; i3++)
        {
          iC[i3] = ((a7)es.cf().elementAt(i3 + 3));
          if (i3 == hg)
          {
            iC[i3].a(true, es);
            if (iC[hg].eo != null)
              ((ao)localObject7).a("确定", 0);
            else
              ((ao)localObject7).a("创建", 0);
            if ((hV[hg] == 1) && (iC[hg].eo != null))
            {
              ((ah)localObject1).a("三天后可以删除");
              ((ba)localObject1).jdMethod_new((short)(ic - ((ba)localObject1).jdMethod_for() >> 1));
            }
            else if ((hV[hg] == 2) && (iC[hg].eo != null))
            {
              ((ah)localObject1).a("删除角色且不可恢复");
              ((ba)localObject1).jdMethod_new((short)(ic - ((ba)localObject1).jdMethod_for() >> 1));
            }
            else if (g3[hg] == 1)
            {
              ((ah)localObject1).a("修改昵称");
              ((ba)localObject1).jdMethod_new((short)(ic - ((ba)localObject1).jdMethod_for() >> 1));
            }
            else
            {
              ((ah)localObject1).a("删除角色");
              ((ba)localObject1).jdMethod_new((short)(ic - ((ba)localObject1).jdMethod_for() >> 1));
            }
          }
          else
          {
            iC[i3].a(false, es);
          }
        }
      }
      int i;
      if ((e0[hg] == null) && (iK == 17))
        for (i = 0; i < 5; i++)
          (localObject7 = (ah)es.cf().elementAt(i + 11)).a("");
      if ((iC[hg] != null) && (iC[hg].eo != null) && (iK == 17))
      {
        iC[hg].eo.jdMethod_do(1);
        jdMethod_if(11);
        for (i = 0; i < 5; i++)
          (localObject7 = (ah)es.cf().elementAt(i + 11)).jdMethod_new((short)(((ba)localObject7).v() + 1));
      }
      Object localObject2;
      if (es.g9 == 2097155)
      {
        by.c = Integer.parseInt((localObject2 = (ah)es.cf().elementAt(37)).aj());
        if (gZ)
          (localObject7 = (ah)es.cf().elementAt(38)).a("");
      }
      if (es.g9 == 1966100)
        as.a(0, "请选择想要解除的宝石。", "确定", "", -1, -2);
      if (es.g9 == 1966086)
      {
        (localObject2 = (ao)es.cf().elementAt(0)).jdMethod_do("宝石镶嵌");
        as.a(0, "请选择一件想要镶嵌宝石的装备。", "确定", "", -1, -2);
      }
      if (es.g9 == 939349)
      {
        (localObject2 = (ao)es.cf().elementAt(0)).jdMethod_do("修理装备");
        as.a(0, "请选择一件想要修理的装备。", "确定", "", -1, -2);
      }
      Object localObject9;
      if ((es.g9 == 2031636) || (es.g9 == 2031621))
      {
        (localObject2 = (ah)es.cf().elementAt(14)).jdMethod_char(bm.bP);
        ((ah)localObject2).a("此处放置开封的装备");
        localObject7 = (ah)es.cf().elementAt(5);
        (localObject9 = (a7)es.cf().elementAt(6)).jdMethod_new((short)(((ba)localObject7).v() + ((ba)localObject7).jdMethod_for() + 2));
      }
      if (es.g9 == 3342356)
      {
        (localObject2 = (ah)es.cf().elementAt(14)).jdMethod_char(bm.bP);
        ((ah)localObject2).a("此处放置需要铭刻的法宝");
        localObject7 = (ah)es.cf().elementAt(5);
        (localObject9 = (a7)es.cf().elementAt(6)).jdMethod_new((short)(((ba)localObject7).v() + ((ba)localObject7).jdMethod_for() + 2));
      }
      if (es.g9 == 917525)
      {
        (localObject2 = (ah)es.cf().elementAt(14)).jdMethod_char(bm.bP);
        ((ah)localObject2).a("此处放置需要强化的装备");
        localObject7 = (ah)es.cf().elementAt(5);
        (localObject9 = (a7)es.cf().elementAt(6)).jdMethod_new((short)(((ba)localObject7).v() + ((ba)localObject7).jdMethod_for() + 2));
      }
      if (es.g9 == 2031621)
      {
        (localObject2 = (ah)es.cf().elementAt(14)).jdMethod_char(bm.bP);
        ((ah)localObject2).a("此处放置原石");
      }
      if (es.g9 == 2228225)
      {
        (localObject2 = (ah)es.cf().elementAt(14)).jdMethod_char(bm.bP);
        ((ah)localObject2).a("此处放置原石");
      }
      if (es.g9 == 1966097)
      {
        (localObject2 = (ah)es.cf().elementAt(10)).jdMethod_char(bm.bP);
        ((ah)localObject2).a("此处放置装备");
      }
      if (es.g9 == 1900547)
      {
        (localObject2 = (a9)es.cf().elementAt(4)).jdMethod_for((short)(((ba)localObject2).jdMethod_long() + 5));
        (localObject7 = (a9)es.cf().elementAt(5)).jdMethod_for((short)(((ba)localObject7).jdMethod_long() + 5));
        bw.jdMethod_if(2);
      }
      if (es.g9 == 393224)
      {
        localObject2 = (ah)es.cf().elementAt(6);
        (localObject7 = (ah)es.cf().elementAt(12)).jdMethod_new((short)(((ba)localObject2).v() + iA * 7 + 2));
        (localObject9 = (ah)es.cf().elementAt(13)).jdMethod_new((short)(((ba)localObject2).v() + iA * 7 + 2));
        (localObject7 = (ah)es.cf().elementAt(14)).jdMethod_new((short)(((ba)localObject2).v() + iA * 7 + 2));
      }
      Object localObject3;
      if (es.g9 == 2424833)
      {
        for (int j = 0; j < 5; j++)
          (localObject7 = (ah)es.cf().elementAt(j + 3)).jdMethod_new((short)(ic - ((ba)localObject7).jdMethod_for() >> 1));
        (localObject3 = (ah)es.cf().elementAt(9)).jdMethod_new((short)(ic - ((ba)localObject3).jdMethod_for() >> 1));
      }
      if (es.g9 == 2424836)
        (localObject3 = (ah)es.cf().elementAt(3)).jdMethod_new((short)(ic - ((ba)localObject3).jdMethod_for() >> 1));
      if (es.g9 == 2424840)
      {
        (localObject3 = (ah)es.cf().elementAt(3)).jdMethod_new((short)(ic - ((ba)localObject3).jdMethod_for() >> 1));
        (localObject7 = (ah)es.cf().elementAt(4)).jdMethod_new((short)(ic - ((ba)localObject7).jdMethod_for() >> 1));
      }
      if (((es.g9 == 2424839) || (es.g9 == 2424995)) && (bo.q != 3))
      {
        localObject3 = (ah)es.cf().elementAt(18);
        (localObject7 = (ah)es.cf().elementAt(19)).jdMethod_new((short)(((ba)localObject3).v() + (iA << 1) + 4));
      }
      if (es.g9 == 2424994)
      {
        localObject3 = (ah)es.cf().elementAt(5);
        (localObject7 = (ah)es.cf().elementAt(6)).jdMethod_new((short)(((ba)localObject3).v() + (iA << 1) + 4));
      }
      if (es.g9 == 1703972)
      {
        (localObject3 = (ay)es.cf().elementAt(4)).jdMethod_case(1);
        ((ay)localObject3).jdMethod_char(1);
      }
      if (es.g9 == 1703971)
      {
        localObject3 = (ao)es.cf().elementAt(1);
        if (q.b == 5)
          ((ao)localObject3).a("", 1);
      }
      if (es.g9 == 720920)
      {
        localObject3 = (ay)es.cf().elementAt(3);
        if (bu.d != 0)
        {
          ((ay)localObject3).jdMethod_char(bu.d);
          ((ay)localObject3).jdMethod_case(bu.d);
        }
      }
      if (es.g9 == 3145731)
      {
        aa.a();
        localObject7 = new ay[(localObject3 = new int[] { 6, 10, 12 }).length];
        for (int i4 = 0; i4 < localObject3.length; i4++)
        {
          localObject7[i4] = ((ay)es.cf().elementAt(localObject3[i4]));
          localObject7[i4].jdMethod_char(aa.for[i4]);
          localObject7[i4].jdMethod_case(aa.for[i4]);
        }
        ak localak;
        (localak = (ak)es.cf().elementAt(13)).jdMethod_if(aa.a[0]);
      }
      Object localObject10;
      if ((es.g9 == 3145729) || (es.g9 == 3145730))
      {
        short s2;
        for (int k = 0; k < aa.new; k++)
        {
          localObject7 = (a7)es.cf().elementAt(k + 3);
          if (((es.g9 != 3145729) || (aa.goto[k] == -1)) && ((es.g9 != 3145730) || (aa.try[k] == -1)))
            continue;
          ((a7)localObject7).a(false, 1);
          if (aa.b[k] != 0)
            ((a7)localObject7).fC = (byte)(aa.b[k] / 1000 - 1);
          else
            ((a7)localObject7).fC = 0;
          s2 = r.k((short)(aa.b[k] % 1000));
          ((a7)localObject7).ft = true;
          ((a7)localObject7).jdMethod_if(s2, false);
          ((a7)localObject7).a(gg);
        }
        if (es.g9 == 3145730)
        {
          ah localah1;
          int i1 = (localah1 = (ah)es.cf().elementAt(11)).v();
          s2 = (short)(localah1.z() + localah1.jdMethod_long());
          short s1 = (byte)aa.long.length;
          ba.q = false;
          localObject10 = new ay(i1, s2, 0, "", es);
          ba.q = true;
          for (i1 = 0; i1 < s1; i1 = (byte)(i1 + 1))
          {
            ((ay)localObject10).jdMethod_try(aa.long[i1]);
            ((ay)localObject10).e(true);
            ((ba)localObject10).jdMethod_do(((ay)localObject10).bg());
            ((ba)localObject10).a(((ay)localObject10).bb());
            ((ay)localObject10).ef = new boolean[s1];
            for (short s3 = 0; s3 < s1; s3++)
              ((ay)localObject10).a(s3, true);
          }
          ((ay)localObject10).jdMethod_char(aa.if);
          ((ay)localObject10).jdMethod_case(aa.if);
          es.jdMethod_if((ba)localObject10);
          for (i1 = 0; i1 < aa.try.length; i1++)
          {
            a7 locala72;
            (locala72 = (a7)es.cf().elementAt(i1 + 3)).a(1, 14);
          }
        }
      }
      if (es.g9 == 3145739)
        (localObject4 = (ah)es.cf().elementAt(5)).b(true);
      if (es.g9 == 3145738)
        (localObject4 = (ah)es.cf().elementAt(9)).b(true);
      if ((es.g9 == 2031648) || (es.g9 == 2031649) || (es.g9 == 2031650) || (es.g9 == 2031651) || (es.g9 == 3211269) || (es.g9 == 3342361) || (es.g9 == 917530) || (es.g9 == 2228260))
      {
        localObject4 = (ao)es.cf().elementAt(0);
        if (es.g9 == 2031648)
          ((ao)localObject4).jdMethod_do("开封说明");
        else if (es.g9 == 2031649)
          ((ao)localObject4).jdMethod_do("雕琢说明");
        else if (es.g9 == 2031650)
          ((ao)localObject4).jdMethod_do("合成说明");
        else if (es.g9 == 2031651)
          ((ao)localObject4).jdMethod_do("解除说明");
        else if (es.g9 == 3211269)
          ((ao)localObject4).jdMethod_do("道具兑换说明");
        else if (es.g9 == 2228260)
          ((ao)localObject4).jdMethod_do("还原说明");
        else if (es.g9 == 3342361)
          ((ao)localObject4).jdMethod_do("铭刻说明");
        else if (es.g9 == 917530)
          ((ao)localObject4).jdMethod_do("强化说明");
      }
      if (((es.g9 == 3342337) || (es.g9 == 3342338) || (es.g9 == 3342339) || (es.g9 == 1900552) || (es.g9 == 1703954) || (es.g9 == 1703948) || (es.g9 == 1376267) || (es.g9 == 655363) || (es.g9 == 393231)) && (am.else))
      {
        localObject4 = (ah)es.cf().elementAt(6);
        ah localah2 = (ah)es.cf().elementAt(8);
        localObject10 = (a7)es.cf().elementAt(3);
        ((ah)localObject4).a(7);
        localah2.a(7);
        ((ah)localObject4).a(am.if);
        localah2.a(am.c);
        ((a7)localObject10).jdMethod_void(am.byte);
      }
      if ((es.g9 == 3342340) && (!am.a))
        (localObject4 = (ao)es.cf().elementAt(1)).a("", 0);
      if (es.g9 == 3342341)
        (localObject4 = (ao)es.cf().elementAt(1)).a("使用", 0);
      if (es.g9 == 3342341)
        as.a(0, "请选择一本技能书。", "确定", "", -1, -2);
      Object localObject4 = this;
      b5.jdMethod_case("curForm.clientCommand = " + Integer.toHexString(es.g9));
      switch (es.g9)
      {
      case 1376265:
        af();
        break;
      case 458755:
        be.cx();
      }
      if (es != null)
        switch (es.g9)
        {
        case 1376263:
          es.c("按*键选择物品，按#键确认放置。");
          break;
        case 1703946:
          es.c("按*键选择邮寄物品，按#键放置物品");
        }
      if (es.g9 == 655364)
      {
        h4 = es;
        if (gZ)
          (localObject4 = (ah)h4.cf().elementAt(4)).a("触摸任意处进入游戏");
        es = null;
        jdMethod_try(0);
      }
    }
    else
    {
      if (iK == 17)
        for (int m = 0; m < iC.length; m++)
        {
          if ((iC[m] == null) || (iC[m].eo == null))
            continue;
          iC[m].eo.d();
        }
      if (iK == 18)
        iC[0].eo.d();
    }
    if (gb != null)
    {
      es = e.a(gb, dh);
      N();
      dh = -1;
      gb = null;
      ep = true;
      fR = false;
      if (eQ.e)
      {
        fE.addElement(es);
        a((be)fE.elementAt(0));
        if (eQ.jdField_int.length > 0)
        {
          fR = true;
          eQ.jdMethod_if();
        }
        else
        {
          eQ.e = false;
        }
      }
      if (gh != 4)
        if (gh != 3)
          jdMethod_try(4);
        else
          jdMethod_case(4);
    }
    Object localObject5;
    while (gV.length != 0)
    {
      localObject5 = gV[0];
      int i2 = dW[0];
      gV = b5.a(gV, 0);
      dW = b5.jdMethod_if(dW, 0);
      if (iK != 5)
      {
        if (((iK == 14) || (iK == 15) || (iK == 18)) && (gQ != null))
          gQ = null;
        gQ = e.a(localObject5);
        continue;
      }
      int i5 = 0;
      switch (i2)
      {
      case 0:
        if (gQ != null);
        break;
      case 1:
        if ((gQ != null) || (iK != 5) || (gh != 0));
        break;
      case 2:
        if ((gQ == null) && (iK == 5) && ((gh == 0) || (gh == 1)))
        {
          i5 = 1;
        }
        else
        {
          e.a(localObject5);
          i5 = 2;
        }
        break;
      case 3:
      case 4:
        if ((gQ == null) || (gQ.dl != 4))
          break;
        i5 = 2;
        break label5479;
        i5 = 1;
      }
      label5479: b5.jdMethod_case("popDatapopDatapopDatapopDatapopData" + dW);
      switch (i5)
      {
      case 1:
        gQ = e.a(localObject5);
        break;
      case 0:
        gR = b5.a(gR, gR.length, localObject5);
      }
      if (i2 == 4)
        gR = new byte[0][];
    }
    if (dO != null)
    {
      byte[] arrayOfByte = dO;
      localObject5 = es;
      try
      {
        this = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
        e.a((be)localObject5, this);
      }
      catch (Exception localException2)
      {
        (this = localException2).printStackTrace();
      }
      dO = null;
    }
  }

  public static byte jdMethod_case()
  {
    return df;
  }

  public static void t()
  {
    if ((a5.hC = b5.jdMethod_do("name_password", 2)) == null)
      hC = new String[2];
    Object localObject1 = null;
    Object localObject2 = null;
    int i = 0;
    int j = es.cf().size();
    while (i < j)
    {
      Object localObject3;
      if (((localObject3 = (ba)es.cf().elementAt(i)) instanceof a9))
        if ((localObject3 = (a9)localObject3).b2() == 0)
          localObject1 = localObject3;
        else if (((a9)localObject3).b2() == 2)
          localObject2 = localObject3;
      i++;
    }
    if ((localObject1 == null) || (localObject2 == null))
    {
      b5.jdMethod_case("找不到对应控件");
      return;
    }
    localObject1.a(new StringBuffer(hC[0] == null ? "" : hC[0]));
    localObject2.a(new StringBuffer(hC[1] == null ? "" : hC[1]));
  }

  public static void r()
  {
    ay localay = (ay)es.cf().elementAt(10);
    if (f6 == null)
      f6 = new byte[1];
    f6[0] = localay.bm();
    b5.a(f6, "login_type");
  }

  public static byte a(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1.equals("")) || (paramString2.equals("")) || (paramString3.equals("")))
      return 1;
    if ((!b5.jdMethod_int(paramString1)) || (!b5.jdMethod_int(paramString2)))
      return 2;
    if (!paramString2.equals(paramString3))
      return 3;
    if (!a(paramString1, 1))
      return 4;
    if (!a(paramString2, 1))
      return 5;
    return 0;
  }

  public static void a(byte paramByte, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    (a5.gQ = new as(0, null)).a(5, bm.dt, paramString1, paramString2, paramString3, paramInt1, paramInt2);
  }

  public static void q()
  {
    iy = true;
    eQ.a(65543);
    e8.a(1);
  }

  public final void a(byte paramByte)
  {
    if (ea != null)
    {
      ea.l6.removeAllElements();
      ea = null;
    }
    if (hQ == 0)
    {
      if ((e8.cP[0] == 1) && (e8.fo[0] == 1))
        e8.ia = false;
      e8.cP[0] = 0;
      e8.fo[0] = 0;
      b5.jdMethod_if(this.cP, "debarkation");
      b5.jdMethod_if(this.fo, "debarkation1");
    }
    else
    {
      hQ = 0;
    }
    ad.b = ic;
    z.jdMethod_do();
    l.jdMethod_for();
    A();
    bp.af();
    b2.jdMethod_if();
    ah();
    G();
    switch (paramByte)
    {
    case 0:
      return;
    case 1:
      jdMethod_do(4);
    }
  }

  public static void C()
  {
    if (hQ != 0)
      hQ = 0;
    if (ea != null)
    {
      ea.l6.removeAllElements();
      ea = null;
    }
    ad.b = ic;
    z.jdMethod_do();
    l.jdMethod_for();
    bp.af();
    b2.jdMethod_if();
    A();
    f.jdMethod_byte().jdMethod_for();
    bw.jdMethod_int();
    au.a();
    q.jdMethod_int();
    aq.a();
    az.jdMethod_if();
    gV = new byte[0][];
    dW = new byte[0];
    jdMethod_do(4);
    if (gQ != null)
      as.a8();
    ad();
    if (z.case)
      z.case = false;
    if (l.goto != 3)
      l.goto = 3;
    z.ag = new Vector();
    if (bu.d != 0)
      bu.d = 0;
    if (aa.int)
      aa.int = false;
    am.jdMethod_if();
    am.a();
  }

  public static void ad()
  {
    try
    {
      String str;
      if (((str = dI.getAppProperty("url")) == null) || (str.trim().equals("")))
      {
        f.f = "socket://218.206.77.164:30000";
      }
      else
      {
        f.f = str.trim();
        return;
      }
    }
    catch (Exception localException)
    {
    }
  }

  public static void g()
  {
    try
    {
      String str;
      if (((str = dI.getAppProperty("jumpID")) == null) || (str.trim().equals("")))
      {
        c3 = 22;
      }
      else
      {
        c3 = Byte.parseByte(str);
        return;
      }
    }
    catch (Exception localException)
    {
    }
  }

  public static void A()
  {
    jdMethod_try(cg);
    d6.removeAllElements();
    ep = true;
    fE.removeAllElements();
    es = null;
    dK = -1;
    c9 = -1;
    be.gL = -1;
    fR = false;
    if (bp.ag() != null)
      bp.ag().jdMethod_if(false);
    w.ca = false;
    at.byte = false;
  }

  public static void ah()
  {
    h6 = 0;
    for (int i = 0; i < iC.length; i++)
    {
      cy[i] = 0;
      e0[i] = null;
      im[i] = 0;
      fZ[i] = 0;
      hE[i] = 0;
      d3[i] = null;
      hV[i] = 0;
      g3[i] = false;
    }
  }

  public static void G()
  {
    ci = 1;
    ck = 1;
    fW = 0;
    ig = 1;
    fY = null;
  }

  public static void d()
  {
    if ((a5.ci = (byte)b5.a(1, 2)) == 1)
      ck = (byte)b5.a(1, 2);
    else if (ci == 2)
      ck = (byte)b5.a(3, 4);
    fW = (byte)b5.a(0, 1);
    switch (ck)
    {
    case 1:
      ig = hO[b5.a(0, hO.length - 1)];
      return;
    case 3:
      ig = (byte)b5.a(1, 5);
      return;
    case 2:
      ig = (byte)b5.a(2, 5);
      return;
    case 4:
      ig = gy[b5.a(0, gy.length - 1)];
    }
  }

  public static void I()
  {
    for (int i = 0; i < 4; i++)
      fc[i] = null;
  }

  public static void jdMethod_if(byte paramByte)
  {
    (localObject = (ah)es.cf().elementAt(paramByte)).a(e0[hg]);
    Object localObject = "" + im[hg];
    ah localah;
    (localah = (ah)es.cf().elementAt(paramByte + 1)).a((String)localObject);
    localObject = null;
    localObject = bm.aW[(fZ[hg] - 1)];
    (localah = (ah)es.cf().elementAt(paramByte + 2)).a((String)localObject);
    localObject = null;
    localObject = bm.bh[(hE[hg] - 1)];
    (localah = (ah)es.cf().elementAt(paramByte + 3)).a((eI[hg] == 0 ? "男" : "女") + (String)localObject);
    (paramByte = (ah)es.cf().elementAt(paramByte + 4)).a(d3[hg]);
  }

  public static void a(boolean paramBoolean)
  {
    if (paramBoolean == true)
    {
      paramBoolean = (ao)es.cf().elementAt(1);
      ay localay1 = (ay)es.cf().elementAt(5);
      ay localay2 = (ay)es.cf().elementAt(6);
      ay localay3 = (ay)es.cf().elementAt(7);
      ay localay4 = (ay)es.cf().elementAt(8);
      a9 locala9 = (a9)es.cf().elementAt(9);
      localay1.jdMethod_case((byte)(ci - 1));
      localay2.jdMethod_case((byte)(ck - 1));
      localay3.jdMethod_case(fW);
      localay4.jdMethod_case((byte)(ig - 1));
      if (gx == 0)
      {
        localay1.a(true, es);
        localay2.a(false, es);
        localay3.a(false, es);
        localay4.a(false, es);
        locala9.a(false, es);
      }
      else if (gx == 1)
      {
        localay1.a(false, es);
        localay2.a(true, es);
        localay3.a(false, es);
        localay4.a(false, es);
        locala9.a(false, es);
      }
      else if (gx == 2)
      {
        localay1.a(false, es);
        localay2.a(false, es);
        localay3.a(true, es);
        localay4.a(false, es);
        locala9.a(false, es);
        paramBoolean.a("", 0);
      }
      else if (gx == 3)
      {
        localay1.a(false, es);
        localay2.a(false, es);
        localay3.a(false, es);
        localay4.a(true, es);
        locala9.a(false, es);
        localay4.a = localay4.bg();
      }
      else if (gx == 4)
      {
        localay1.a(false, es);
        localay2.a(false, es);
        localay3.a(false, es);
        localay4.a(false, es);
        locala9.a(true, es);
        if ((locala9.cc().toString().trim() == null) || (locala9.cc().toString().trim().trim().equals("")))
          paramBoolean.a("输入", 0);
        else
          paramBoolean.a("修改", 0);
      }
      if ((fY == null) || (fY.equals("")))
      {
        locala9.a(new StringBuffer(""));
        return;
      }
      locala9.a(new StringBuffer(fY));
    }
  }

  private static int jdMethod_int(String paramString)
  {
    b5.jdMethod_case("in transformVerStr");
    int i = 0;
    if ((paramString != null) && (!paramString.equals("")))
    {
      byte[] arrayOfByte = new byte[(paramString = b5.a(paramString, '.')).length];
      try
      {
        for (i = 0; i < paramString.length; i++)
          arrayOfByte[i] = Byte.parseByte(paramString[i]);
      }
      catch (Exception localException)
      {
        return 0;
      }
      i = (i = (i = (i = arrayOfByte[0] << 24) + (arrayOfByte[1] << 16)) + (arrayOfByte[2] << 8)) + arrayOfByte[3];
      b5.jdMethod_case("The result is " + Integer.toHexString(i));
    }
    return i;
  }

  private static void N()
  {
    be localbe = null;
    if (fE.size() != 0)
    {
      if (dK != -1)
        localbe = (be)fE.elementAt(dK);
      else
        localbe = (be)fE.elementAt(fE.size() - 1);
    }
    else
      localbe = es;
    Object localObject3;
    for (int i = 0; i < localbe.cf().size(); i++)
    {
      localObject3 = (ba)localbe.cf().elementAt(i);
      if ((bb.a(localbe)) && ((localObject3 instanceof ah)) && (((ba)localObject3).jdMethod_char() == 2))
      {
        ((ba)localObject3).a(12);
        ((ba)localObject3).jdMethod_for(3);
      }
      if (!bb.jdMethod_if(localbe))
        continue;
      if (i == 4)
      {
        ((ba)localObject3).jdMethod_for(4);
        ((ba)localObject3).jdMethod_do(-2);
      }
      if (i != 5)
        continue;
      ((ba)localObject3).jdMethod_for(4);
    }
    b5.jdMethod_case("in adjustUI tmpForm.clientCommand = " + localbe.g9);
    Object localObject5;
    Object localObject7;
    Object localObject8;
    ah localah2;
    Object localObject9;
    Object localObject10;
    Object localObject11;
    Object localObject2;
    int m;
    Object localObject4;
    Object localObject6;
    ah localah1;
    int i1;
    switch (localbe.g9)
    {
    case 393219:
      (localObject1 = (ah)localbe.cf().elementAt(3)).jdMethod_for(-2);
      (localObject3 = (a7)localbe.cf().elementAt(8)).jdMethod_for(3);
      localObject5 = (ah)localbe.cf().elementAt(33);
      localObject7 = (ah)localbe.cf().elementAt(35);
      ((ba)localObject5).a(8);
      ((ba)localObject7).a(8);
      ((ba)localObject5).jdMethod_for(3);
      ((ba)localObject7).jdMethod_for(5);
      (localObject8 = (ah)localbe.cf().elementAt(34)).jdMethod_for(3);
      localbe.cf().setElementAt(new bd(0, 0, 0, 0, localbe), 10);
      (localah2 = (ah)localbe.cf().elementAt(36)).jdMethod_do(5);
      localObject8 = (ah)localbe.cf().elementAt(18);
      localObject9 = (ah)localbe.cf().elementAt(19);
      ((ba)localObject8).a(3);
      ((ba)localObject9).a(5);
      ((ba)localObject8).jdMethod_for(3);
      ((ba)localObject9).jdMethod_for(3);
      localObject8 = (ah)localbe.cf().elementAt(20);
      localObject10 = (ah)localbe.cf().elementAt(22);
      ((ba)localObject8).a(11);
      ((ba)localObject10).a(11);
      ((ba)localObject8).jdMethod_for(3);
      ((ba)localObject10).jdMethod_for(3);
      localObject11 = (ah)localbe.cf().elementAt(12);
      Object localObject1 = (ah)localbe.cf().elementAt(14);
      ah localah3 = (ah)localbe.cf().elementAt(16);
      localObject7 = (ah)localbe.cf().elementAt(21);
      localObject5 = (ah)localbe.cf().elementAt(23);
      ((ba)localObject1).jdMethod_new(((ba)localObject11).v());
      localah3.jdMethod_new(((ba)localObject11).v());
      ((ba)localObject7).jdMethod_new((short)(((ba)localObject9).v() + 5));
      ((ba)localObject5).jdMethod_new((short)(((ba)localObject9).v() + 5));
      ((ba)localObject7).jdMethod_for(3);
      ((ba)localObject5).jdMethod_for(3);
      localbe.cf().setElementAt(new bd(0, 0, 0, 0, localbe), 25);
      localObject1 = new ah[6];
      for (int k = 0; k < localObject1.length; k++)
      {
        localObject1[k] = ((ah)localbe.cf().elementAt(k + 37));
        localObject1[k].jdMethod_for(-2);
      }
      ah[] arrayOfah = new ah[6];
      for (int j = 0; j < arrayOfah.length; j++)
      {
        arrayOfah[j] = ((ah)localbe.cf().elementAt(j + 26));
        if ((j == 0) || (j == 3))
          arrayOfah[j].a(4);
        else
          arrayOfah[j].a(3);
      }
      return;
    case 458760:
    case 458761:
      localObject2 = new a7[4];
      for (m = 0; m < localObject2.length; m++)
      {
        localObject2[m] = ((a7)localbe.cf().elementAt((m << 1) + 3));
        localObject2[m].a(8);
        localObject2[m].jdMethod_for(4);
      }
      return;
    case 655364:
      (localObject2 = (ah)localbe.cf().elementAt(4)).a(-15);
      ((ba)localObject2).jdMethod_for(-4);
      return;
    case 1703937:
    case 1703938:
      (localObject2 = (ak)localbe.cf().elementAt(5)).jdMethod_for(4);
      for (m = 0; m < 6; m++)
      {
        (localObject5 = (a7)localbe.cf().elementAt(m + 7)).jdMethod_for(3);
        ((ba)localObject5).a(6);
      }
      (localObject4 = (a9)localbe.cf().elementAt(13)).jdMethod_for(-3);
      return;
    case 1900546:
    case 1900548:
      (localObject2 = (ah)localbe.cf().elementAt(6)).a("最高价");
      localObject4 = (ah)localbe.cf().elementAt(9);
      localObject5 = (ah)localbe.cf().elementAt(11);
      localObject7 = (ah)localbe.cf().elementAt(13);
      ((ba)localObject4).jdMethod_new(((ba)localObject2).v());
      ((ba)localObject5).jdMethod_new(((ba)localObject2).v());
      ((ba)localObject7).jdMethod_new(((ba)localObject2).v());
      (localObject8 = (a7)localbe.cf().elementAt(5)).jdMethod_for(-4);
      (localah2 = (ah)localbe.cf().elementAt(8)).jdMethod_for(-4);
      (localObject8 = (ah)localbe.cf().elementAt(16)).jdMethod_for(-6);
      localObject9 = (a9)localbe.cf().elementAt(7);
      localObject8 = (a9)localbe.cf().elementAt(10);
      localObject10 = (a9)localbe.cf().elementAt(12);
      localObject11 = (a9)localbe.cf().elementAt(14);
      localObject2 = new ba[] { localObject2, localObject4, localObject5, localObject7, localObject9, localObject8, localObject10, localObject11 };
      for (int i3 = 0; i3 < localObject2.length; i3++)
        localObject2[i3].jdMethod_for(-6);
      ((ba)localObject4).jdMethod_for(1);
      ((ba)localObject8).jdMethod_for(1);
      ((ba)localObject5).jdMethod_for(2);
      ((ba)localObject10).jdMethod_for(4);
      ((ba)localObject7).jdMethod_for(5);
      ((ba)localObject11).jdMethod_for(6);
      return;
    case 2031621:
      localObject2 = (ah)localbe.cf().elementAt(3);
      localObject4 = (ah)localbe.cf().elementAt(5);
      ((ba)localObject2).jdMethod_for(-4);
      ((ba)localObject4).jdMethod_for(-4);
      localObject5 = (a7)localbe.cf().elementAt(4);
      localObject7 = (a7)localbe.cf().elementAt(6);
      ((ba)localObject5).a(8);
      ((ba)localObject7).a(12);
      return;
    case 2228225:
      (localObject2 = (a7)localbe.cf().elementAt(4)).a(7);
      ((ba)localObject2).jdMethod_for(3);
      (localObject4 = (ah)localbe.cf().elementAt(12)).a(3);
      (localObject5 = (ah)localbe.cf().elementAt(11)).jdMethod_for(-2);
      ((ba)localObject5).a(14);
      return;
    case 1966097:
      (localObject2 = (a7)localbe.cf().elementAt(4)).a(7);
      ((ba)localObject2).jdMethod_for(3);
      (localObject4 = (ah)localbe.cf().elementAt(5)).jdMethod_for(-2);
      (localObject5 = (a7)localbe.cf().elementAt(6)).a(20);
      ((ba)localObject5).jdMethod_for(2);
      return;
    case 917525:
    case 2031636:
    case 3342356:
      localObject2 = (a7)localbe.cf().elementAt(4);
      localObject4 = (a7)localbe.cf().elementAt(6);
      ((ba)localObject2).a(7);
      ((ba)localObject2).jdMethod_for(3);
      ((ba)localObject4).a(18);
      ((ba)localObject4).jdMethod_for(3);
      return;
    case 2162693:
    case 2162708:
    case 2162719:
    case 2162730:
    case 2162739:
    case 2162747:
    case 2162760:
    case 2162767:
    case 2162774:
    case 2162781:
      localObject2 = (ah)localbe.cf().elementAt(6);
      localObject4 = (ah)localbe.cf().elementAt(8);
      localObject5 = (ah)localbe.cf().elementAt(10);
      localObject7 = (ah)localbe.cf().elementAt(12);
      ((ba)localObject2).a(12);
      ((ba)localObject2).jdMethod_for(3);
      ((ba)localObject4).a(12);
      ((ba)localObject4).jdMethod_for(3);
      ((ba)localObject5).a(12);
      ((ba)localObject5).jdMethod_for(3);
      ((ba)localObject7).a(12);
      ((ba)localObject7).jdMethod_for(3);
      return;
    case 2162758:
    case 2162765:
    case 2162772:
    case 2162779:
      (localObject2 = (ah)localbe.cf().elementAt(6)).jdMethod_do(6);
      return;
    case 589831:
      localObject4 = new ah[(localObject2 = new int[] { 4, 6, 8, 9, 11, 13, 15, 17, 19 }).length];
      for (int n = 0; n < localObject4.length; n++)
      {
        localObject4[n] = ((ah)localbe.cf().elementAt(localObject2[n]));
        localObject4[n].a(6);
        if (n != 3)
          continue;
        localObject4[n].a(8);
      }
      localObject4 = new ah[(localObject6 = new int[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 }).length];
      for (int i2 = 0; i2 < localObject6.length; i2++)
      {
        localObject4[i2] = ((ah)localbe.cf().elementAt(localObject6[i2]));
        localObject4[i2].jdMethod_for(i2 + 2);
      }
      return;
    case 1900547:
      localObject2 = (a9)localbe.cf().elementAt(4);
      localObject4 = (a9)localbe.cf().elementAt(5);
      ((ba)localObject2).jdMethod_for(-3);
      ((ba)localObject4).jdMethod_for(-3);
      (localObject6 = (ay)localbe.cf().elementAt(6)).jdMethod_byte("持续时间");
      return;
    case 2555905:
      if (d6.size() > 0)
        d6.removeAllElements();
      (localObject2 = (ao)localbe.cf().elementAt(0)).jdMethod_do(az.new);
      localObject4 = (a7)localbe.cf().elementAt(11);
      (localObject6 = (ah)localbe.cf().elementAt(5)).jdMethod_new((short)(((ba)localObject6).v() - 12));
      ((ba)localObject6).jdMethod_for((short)(((ba)localObject6).jdMethod_long() - 1));
      (localah1 = (ah)localbe.cf().elementAt(6)).jdMethod_new((short)(((ba)localObject6).v() + ((ba)localObject6).jdMethod_for() + 1));
      localah1.jdMethod_case(((a7)localObject4).bz());
      localObject8 = (ah)localbe.cf().elementAt(7);
      localah2 = (ah)localbe.cf().elementAt(8);
      ((ba)localObject8).jdMethod_new((short)(ic - (localah2.jdMethod_for() + ((ba)localObject8).jdMethod_for() + 36)));
      ((ba)localObject8).jdMethod_for((short)(((ba)localObject8).jdMethod_long() - 1));
      localah2.jdMethod_for((short)(localah2.jdMethod_long() - 1));
      (localObject8 = (ah)localbe.cf().elementAt(9)).jdMethod_new((short)(((ba)localObject8).v() - 5));
      ((ba)localObject8).jdMethod_for((short)(((ba)localObject8).jdMethod_long() - 1));
      (localObject9 = (ah)localbe.cf().elementAt(10)).jdMethod_new((short)(((ba)localObject8).v() + ((ba)localObject8).jdMethod_for() + 1));
      ((ba)localObject9).jdMethod_for(((ba)localObject8).jdMethod_long());
      ((ah)localObject9).a(((a7)localObject4).by());
      (localObject8 = (ah)localbe.cf().elementAt(24)).jdMethod_new((short)(((ba)localObject8).v() - 5));
      ((ba)localObject8).jdMethod_for((short)(((ba)localObject8).jdMethod_long() - 1));
      localObject10 = (ah)localbe.cf().elementAt(32);
      localObject11 = (ah)localbe.cf().elementAt(31);
      ((ba)localObject10).jdMethod_new((short)(((ba)localObject11).v() + ((ba)localObject11).jdMethod_for() + 1));
      (localObject2 = (ah)localbe.cf().elementAt(3)).jdMethod_for((short)(((ba)localObject2).jdMethod_long() - 2));
      ((ba)localObject2).jdMethod_new((short)((ic >> 1) - ((ba)localObject2).jdMethod_for() >> 1));
      ((ah)localObject2).a(((a7)localObject4).bY());
      ah localah4;
      (localah4 = (ah)localbe.cf().elementAt(4)).jdMethod_for((short)(localah4.jdMethod_long() - 2));
      localah4.jdMethod_new((short)(ic + (ic >> 1) - localah4.jdMethod_for() >> 1));
      localah4.a(((a7)localObject4).bY());
      (localah1 = (ah)localbe.cf().elementAt(38)).a(az.c);
      localah1.a((short)(((ba)localObject6).z() + 5));
      localah1.jdMethod_for((short)(localah1.jdMethod_long() - 2));
      if (az.h == 1)
        (localObject6 = (ah)localbe.cf().elementAt(36)).a("");
      if (((a7)localObject4).bJ() == -1)
        localah2.a(az.i[0]);
      else if (((a7)localObject4).bJ() == 0)
        localah2.a(az.i[1]);
      else if ((((a7)localObject4).bJ() >= 1) && (((a7)localObject4).bJ() <= 30))
        localah2.a(az.i[2]);
      else if ((((a7)localObject4).bJ() >= 31) && (((a7)localObject4).bJ() <= 70))
        localah2.a(az.i[3]);
      else if ((((a7)localObject4).bJ() >= 71) && (((a7)localObject4).bJ() <= 100))
        localah2.a(az.i[4]);
      az.m = 1;
      eQ.a(2555952);
      return;
    case 2555906:
      localObject2 = (ah)localbe.cf().elementAt(7);
      (localObject4 = (ah)localbe.cf().elementAt(8)).jdMethod_new((short)(((ba)localObject2).v() + ((ba)localObject2).jdMethod_for() + 1));
      localObject6 = (ah)localbe.cf().elementAt(16);
      (localah1 = (ah)localbe.cf().elementAt(17)).jdMethod_new((short)(((ba)localObject6).v() + ((ba)localObject6).jdMethod_for() + 1));
      localObject8 = (ah)localbe.cf().elementAt(9);
      (localah2 = (ah)localbe.cf().elementAt(10)).jdMethod_new((short)(((ba)localObject8).v() + ((ba)localObject8).jdMethod_for() + 1));
      localah2.a(az.byte[0]);
      if (az.h == 1)
        (localObject8 = (ao)localbe.cf().elementAt(1)).a("查看", 0);
      localObject8 = (ah)localbe.cf().elementAt(4);
      (localObject9 = (ah)localbe.cf().elementAt(19)).jdMethod_new((short)(((ba)localObject8).v() + ((ba)localObject8).jdMethod_for() + 1));
      return;
    case 2555911:
      (localObject2 = (ah)localbe.cf().elementAt(13)).jdMethod_new((short)(((ba)localObject2).v() - 5));
      ((ba)localObject2).jdMethod_for((short)(((ba)localObject2).jdMethod_long() - 3));
      localObject4 = (ah)localbe.cf().elementAt(11);
      (localObject6 = (ah)localbe.cf().elementAt(12)).jdMethod_new((short)(((ba)localObject4).v() + ((ba)localObject4).jdMethod_for() + 1));
      return;
    case 2555907:
    case 2555915:
      localObject2 = (ah)localbe.cf().elementAt(4);
      (localObject4 = (ah)localbe.cf().elementAt(5)).jdMethod_new((short)(((ba)localObject2).v() + ((ba)localObject2).jdMethod_for() + 1));
      return;
    case 2555908:
    case 2555957:
      (localObject2 = (ah)localbe.cf().elementAt(6)).jdMethod_for((short)(((ba)localObject2).jdMethod_long() - 5));
      (localObject4 = (ah)localbe.cf().elementAt(8)).jdMethod_for((short)(((ba)localObject4).jdMethod_long() - 3));
      (localObject6 = (ah)localbe.cf().elementAt(7)).jdMethod_new((short)(((ba)localObject2).v() + ((ba)localObject2).jdMethod_for() + 1));
      (localah1 = (ah)localbe.cf().elementAt(9)).jdMethod_new((short)(((ba)localObject4).v() + ((ba)localObject4).jdMethod_for() + 1));
      if (localbe.g9 != 2555908)
        break;
      (localObject8 = (ao)localbe.cf().elementAt(0)).jdMethod_do("种子商店");
      return;
    case 2555936:
      if ((az.o == 0) || (az.o == 10))
      {
        localObject2 = (ah)localbe.cf().elementAt(4);
        (localObject4 = (ah)localbe.cf().elementAt(5)).jdMethod_new((short)(((ba)localObject2).v() + ((ba)localObject2).jdMethod_for() + 1));
        return;
      }
      if (az.o != 4)
        break;
      localObject2 = (ah)localbe.cf().elementAt(4);
      (localObject4 = (ah)localbe.cf().elementAt(5)).jdMethod_new((short)(((ba)localObject2).v() + ((ba)localObject2).jdMethod_for() + 1));
      localObject6 = (ah)localbe.cf().elementAt(6);
      (localah1 = (ah)localbe.cf().elementAt(7)).jdMethod_new((short)(((ba)localObject6).v() + ((ba)localObject6).jdMethod_for() + 1));
      localObject8 = (ah)localbe.cf().elementAt(8);
      (localah2 = (ah)localbe.cf().elementAt(9)).jdMethod_new((short)(((ba)localObject8).v() + ((ba)localObject8).jdMethod_for() + 1));
      return;
    case 1507330:
      (localObject2 = (ah)localbe.cf().elementAt(3)).a((short)(((ba)localObject2).z() + 5));
      return;
    case 1638427:
      localObject2 = (ah)localbe.cf().elementAt(3);
      (localObject4 = (ah)localbe.cf().elementAt(4)).jdMethod_new((short)(((ba)localObject2).v() + ((ba)localObject2).jdMethod_for() + 1));
      (localObject6 = (ah)localbe.cf().elementAt(5)).jdMethod_new((short)(((ba)localObject6).v() - 18));
      return;
    case 2424995:
    case 2425079:
      (localObject2 = (ak)es.cf().elementAt(15)).a(true, es);
      if (((es.g9 != 2424995) || (bo.q != 3)) && ((es.g9 != 2425079) || (bo.q != 8)))
        break;
      es.cf().removeElementAt(es.cf().size() - 1);
      es.cf().removeElementAt(17);
      localObject4 = (ah)es.cf().elementAt(17);
      (localObject6 = (ah)es.cf().elementAt(18)).jdMethod_for(((ba)localObject4).jdMethod_long());
      return;
    case 2424839:
    case 2424994:
    case 2425072:
      if (es.g9 == 2424839)
        (localObject2 = (ak)es.cf().elementAt(15)).a(true, es);
      if (bo.q != 3)
        break;
      if ((es.g9 == 2424994) || (es.g9 == 2425072))
      {
        es.cf().removeElementAt(es.cf().size() - 1);
        es.cf().removeElementAt(es.cf().size() - 1);
        localObject2 = (ah)es.cf().elementAt(5);
        (localObject4 = (ah)es.cf().elementAt(6)).jdMethod_for(((ba)localObject2).jdMethod_long());
        return;
      }
      if (es.g9 != 2424839)
        break;
      es.cf().removeElementAt(es.cf().size() - 1);
      es.cf().removeElementAt(17);
      localObject2 = (ah)es.cf().elementAt(17);
      (localObject4 = (ah)es.cf().elementAt(18)).jdMethod_for(((ba)localObject2).jdMethod_long());
      return;
    case 2425024:
      be.g3 = 0;
      return;
    case 196641:
      localObject2 = (ao)es.cf().elementAt(0);
      localObject4 = (ak)es.cf().elementAt(3);
      ((ao)localObject2).jdMethod_do("人物详情");
      localObject6 = (ao)es.cf().elementAt(1);
      if (l.jdField_d_of_type_Boolean)
      {
        ((ao)localObject6).a("返回", 1);
        ((ak)localObject4).bv = false;
      }
      else
      {
        ((ao)localObject6).a("退出", 1);
        ((ak)localObject4).bv = true;
      }
      ((ao)localObject6).a("操作", 0);
      return;
    case 196642:
      localObject2 = (ao)es.cf().elementAt(0);
      localObject4 = (bg)es.cf().elementAt(3);
      localObject6 = (ao)es.cf().elementAt(1);
      if (l.goto == 1)
        ((ao)localObject2).jdMethod_do("天人排名");
      else if (l.goto == 2)
        ((ao)localObject2).jdMethod_do("修罗排名");
      else if (l.goto == 3)
        ((ao)localObject2).jdMethod_do("总排名");
      if (l.jdField_d_of_type_Boolean)
      {
        ((ao)localObject6).a("返回", 1);
        ((bg)localObject4).ie = false;
        return;
      }
      ((ao)localObject6).a("退出", 1);
      ((bg)localObject4).ie = true;
      return;
    case 852022:
      localObject4 = new ah[(localObject2 = new int[] { 3, 4 }).length];
      for (i1 = 0; i1 < localObject2.length; i1++)
      {
        localObject4[i1] = ((ah)es.cf().elementAt(localObject2[i1]));
        localObject4[i1].b(true);
      }
      return;
    case 2425078:
      if (bo.q == 8)
      {
        es.cf().removeElementAt(es.cf().size() - 1);
        es.cf().removeElementAt(es.cf().size() - 1);
        localObject2 = (ah)es.cf().elementAt(5);
        (localObject4 = (ah)es.cf().elementAt(6)).jdMethod_for(((ba)localObject2).jdMethod_long());
      }
      (localObject2 = (ao)es.cf().elementAt(0)).jdMethod_do(be.gM[(bo.q - 8)]);
      return;
    case 1638445:
      localObject4 = new ah[(localObject2 = new int[] { 3, 4, 5 }).length];
      for (i1 = 0; i1 < localObject2.length; i1++)
      {
        localObject4[i1] = ((ah)es.cf().elementAt(localObject2[i1]));
        localObject4[i1].b(true);
      }
    }
  }

  public static String n()
  {
    if (f6 == null)
      return hC[0];
    if (f6[0] == 1)
      return bk.F;
    return hC[0];
  }

  private static long l()
  {
    long l = 0L;
    if (fF != 0)
      l = new Date().getTime();
    else
      l = System.currentTimeMillis();
    return l;
  }

  private static class a
    implements Runnable
  {
    Thread a = new Thread(this);

    public a()
    {
      this.a.start();
    }

    public final void run()
    {
      Thread localThread = Thread.currentThread();
      while (this.a == localThread)
        try
        {
          a5.e8.repaint();
          synchronized (this)
          {
            wait(101L);
          }
        }
        catch (Exception localException)
        {
        }
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     a5
 * JD-Core Version:    0.6.0
 */
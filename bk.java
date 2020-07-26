import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Vector;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.ContentConnection;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.io.OutputConnection;
import javax.microedition.midlet.MIDlet;

public final class bk
  implements Runnable
{
  private static String[] jdField_do = { "", "1", "1" };
  private static String[] c = { "SMSPRICE", "PROVICE_NO_FOUND", "MOBILE_NO_FOUND" };
  private static String P = "";
  private static String au = "";
  private static String ab = "";
  public static String R = "";
  public static String az = null;
  public static String aa = "";
  private static String j = "";
  public static String F = "";
  private static String aV = "";
  public static String a5 = "";
  public static String a0 = "";
  private static String[][] Z;
  private static String[] aO;
  private String s;
  private String af;
  private int av = 0;
  public static int aj = -1;
  private byte aW = 0;
  private byte jdField_byte = 0;
  public static boolean b = true;
  public static boolean G = false;
  public static String[][] g;
  private static String[] Y;
  private static String[] an = new String[4];
  private byte[] t;
  private static String a4 = "";
  public static int ao = 2;
  public static String aJ = "/mammoth/judgeserver/judge?ver=" + ao + "&";
  public static String q = "61.135.147.34";
  public static String aG = "gmp.i139.cn";
  public static String jdField_void = "221.179.216.39";
  public static String aQ = "/bizcontrol/LoginWapOnlineGame?sender=202&cpId=C00042&cpServiceId=220121871000&channelId=15042000&p=client";
  public static String al;
  public static String U;
  public static String aH;
  public static String aX;
  private static String jdField_for = "";
  public static byte aT = 0;
  public static String aK = "1000";
  public static int ai = 0;
  public static boolean aw = false;
  public static boolean Q = false;
  public static String X = "";
  public static byte ay = 0;
  public static byte jdField_if = 0;
  public static int jdField_char = 0;
  public static byte y = 0;
  private byte aZ = 0;
  private String J;
  private String aq;
  private byte aI;
  public static boolean aP = false;
  public static boolean ax = false;
  public static boolean V = false;
  public static boolean e = false;
  public static boolean k = false;
  public static boolean at = false;
  public static boolean p = false;
  public static boolean ae = false;
  public static boolean ak = false;
  public static String B = "";
  private static String x = "";
  public static boolean d = false;
  public static boolean ap = false;
  public boolean N;
  private static int K;
  private static int ag;
  static boolean v = false;
  public static boolean W = false;
  public static String aB;
  public static String a;
  public static String m;
  public static String f;
  static long S;
  private static Thread C = null;
  public static bk H = null;
  private String[][] l = null;

  public bk(String paramString1, String paramString2, byte paramByte1, byte paramByte2)
  {
    b5.jdMethod_case("登录通行证服务器");
    if (((bk.x = a5.dI.getAppProperty("suggest")) == null) || ("".equals(x.trim())))
      x = "";
    this.J = paramString1;
    this.aq = paramString2;
    this.aZ = paramByte1;
    this.jdField_byte = paramByte2;
    this.aI = 0;
  }

  public final void a(byte paramByte)
  {
    this.aI = 1;
    this.aW = paramByte;
    (this = new Thread(this)).start();
  }

  public final void run()
  {
    bk localbk1 = this;
    String str;
    Object localObject2;
    try
    {
      localObject1 = null;
      if (localbk1.aZ == 0)
        localObject1 = "http://10.0.0.172" + localbk1.aq;
      else if (localbk1.aZ == 1)
        localObject1 = "http://" + localbk1.J + localbk1.aq;
      b5.jdMethod_case("tempAddress = " + (String)localObject1);
      (localObject1 = (HttpConnection)Connector.open((String)localObject1, 3)).setRequestProperty("X-Online-Host", localbk1.J);
      localbk1.jdField_if((HttpConnection)localObject1);
      if (localbk1.aW == 13)
        a((HttpConnection)localObject1);
      int i;
      while (((i = ((HttpConnection)localObject1).getResponseCode()) == 302) && (localbk1.aW == 20))
      {
        String[] arrayOfString = b5.a(str = ((HttpConnection)localObject1).getHeaderField("location"), '/');
        u.m = str;
        localObject2 = arrayOfString[2];
        new StringBuffer().append("/").append(str.substring(str.indexOf(arrayOfString[3]))).toString();
        (localObject1 = (HttpConnection)Connector.open(str)).setRequestProperty("X-Online-Host", (String)localObject2);
        localbk1.jdField_if((HttpConnection)localObject1);
      }
      if (localObject2 == 200)
      {
        ap = true;
        str = ((HttpConnection)localObject1).getHeaderField("Content-Type");
        int n = 0;
        if ((str != null) && (str.indexOf("vnd.wap.wml") != -1))
          n = 1;
        if (n != 0)
        {
          ((Connection)localObject1).close();
          (localObject2 = (HttpConnection)Connector.open("http://10.0.0.172" + localbk1.aq, 3)).setRequestProperty("X-Online-Host", localbk1.J);
          localbk1.jdField_if((HttpConnection)localObject2);
          if (localbk1.aW == 13)
            a((HttpConnection)localObject2);
          if (((HttpConnection)localObject2).getResponseCode() == 200)
          {
            if (localbk1.aW == 12)
            {
              if ((aT == 2) || (aT == 0))
              {
                e();
                break label662;
              }
              if ((aT == 3) || (aT == 0))
                jdField_void();
              break label662;
            }
            if (localbk1.aW == 13)
            {
              v = true;
              break label662;
            }
            if (localbk1.aW == 14)
            {
              v = true;
              e();
              break label662;
            }
            localbk1.jdField_if((HttpConnection)localObject2, (int)((ContentConnection)localObject2).getLength());
            localbk1.aI = 2;
          }
        }
        else
        {
          if (localbk1.aW == 12)
          {
            if ((aT == 2) || (aT == 0))
            {
              e();
              break label662;
            }
            if ((aT == 3) || (aT == 0))
              jdField_void();
            break label662;
          }
          if (localbk1.aW == 13)
          {
            v = true;
            break label662;
          }
          if (localbk1.aW == 14)
          {
            v = true;
            e();
            break label662;
          }
          if (localbk1.a((HttpConnection)localObject1, localObject2))
            break label662;
          localbk1.jdField_if((HttpConnection)localObject1, 0);
          localbk1.aI = 2;
          break label662;
        }
      }
      else
      {
        if (localObject2 == 302)
        {
          localbk1.a((HttpConnection)localObject1, localObject2);
          break label662;
        }
        if (localbk1.N)
        {
          localbk1.N = false;
          localbk1.aI = 0;
          break label662;
        }
        localbk1.aI = 3;
      }
    }
    catch (Exception localException)
    {
      Object localObject1;
      (localObject1 = localException).printStackTrace();
      b5.jdMethod_case("--------------------http连接错误---------------------------");
      if (localbk1.N)
      {
        localbk1.N = false;
        localbk1.aI = 0;
      }
      else
      {
        localbk1.aI = 3;
      }
    }
    label662: k();
    localbk1 = this;
    if (this.aI == 2)
    {
      if (localbk1.aW == 1)
        a5.ae();
      if ((G) && (aj == 1) && (localbk1.aW == 1))
      {
        a5.ad();
        a5.g();
        a5.eQ.a(65537);
        return;
      }
      bk localbk3;
      switch ((localObject2 = localbk1).aW)
      {
      case 0:
        if (!b)
          break;
        b = false;
        break;
      case 1:
        if (!b)
          break;
        b = false;
        break;
      case 2:
        if (!b)
          break;
        b = false;
        break;
      case 3:
        if (!b)
          break;
        a5.ik = ((bk)localObject2).jdField_do();
        a5.iM = ((bk)localObject2).jdMethod_long();
        str = "/judgeserver/charge?&userId=" + a5.ik + "&key=" + a5.iM + "&game=fengshen&money=" + ai + "&from=kong";
        (localbk3 = new bk(jdField_void, str, a5.dU ? 0 : 1, 3)).a(3);
        b = false;
        break;
      case 7:
        if (!b)
          break;
        a5.ik = ((bk)localObject2).jdField_do();
        a5.iM = ((bk)localObject2).jdMethod_long();
        str = "/judgeserver/QueryBalance?usr=&userId=" + a5.ik + "&game=fengshen&subgame=" + "fengshen" + "&from=kong";
        (localbk3 = new bk(jdField_void, str, a5.dU ? 0 : 1, 3)).a(7);
        b = false;
        break;
      case 8:
        if (!b)
          break;
        a5.ik = ((bk)localObject2).jdField_do();
        a5.iM = ((bk)localObject2).jdMethod_long();
        str = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + a5.ik + "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100 + "&qtype=7&qtime=" + jdField_if + "&qmonth=" + jdField_char;
        (localbk3 = new bk(jdField_void, str, a5.dU ? 0 : 1, 3)).a(8);
        b = false;
        break;
      case 9:
        if (!b)
          break;
        a5.ik = ((bk)localObject2).jdField_do();
        a5.iM = ((bk)localObject2).jdMethod_long();
        str = "/judgeserver/QueryChargeUpRecord?usr=&userId=" + a5.ik + "&game=fengshen&subgame=fengshen&from=kong&sdate=&edate=&sseq=0&rcount=" + 100 + "&qtype=" + ay + "&qtime=" + jdField_if + "&qmonth=" + jdField_char;
        (localbk3 = new bk(jdField_void, str, a5.dU ? 0 : 1, 3)).a(9);
        b = false;
        break;
      case 10:
        if (!b)
          break;
        a5.ik = ((bk)localObject2).jdField_do();
        a5.iM = ((bk)localObject2).jdMethod_long();
        str = "/judgeserver/BuyGameTool?usr=&userId=" + a5.ik + "&game=fengshen&subgame=fengshen&from=kong&consumeCode=120122006001";
        (localbk3 = new bk(jdField_void, str, a5.dU ? 0 : 1, 3)).a(10);
        b = false;
        break;
      case 6:
        if (!b)
          break;
        a5.ik = ((bk)localObject2).jdField_do();
        a5.iM = ((bk)localObject2).jdMethod_long();
        b = false;
        break;
      case 20:
        if (b)
        {
          u.t = 0;
          if ((this = localObject2).t != null)
            if ((this = localObject2).t.length % 256 != 0)
              u.t = (this = localObject2).t.length / 256 + 1;
            else
              u.t = (this = localObject2).t.length / 256;
          b = false;
        }
        a5.eQ.a(2686977);
      case 4:
      case 5:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      }
      if ((aj != -1) && (((localObject2 = localObject2).aW != 1) || (!G) || (aj != 1)))
        switch (aj)
        {
        case 1:
          switch ((this = localObject2).aW)
          {
          case 0:
            ax = true;
            break;
          case 1:
            jdMethod_try();
            aP = true;
            break;
          case 2:
            a5.jdField_do(11);
            V = true;
            break;
          case 3:
            aw = true;
            at = true;
            break;
          case 7:
            aw = true;
            p = true;
            break;
          case 8:
            ae = true;
            break;
          case 9:
            ak = true;
            break;
          case 4:
            k = true;
            break;
          case 10:
            a5.a(0, "购买成功！", "确定", "", -1, -120);
          case 5:
          case 6:
          case 11:
          }
          break;
        case 11:
          if (a5.gQ != null)
            a5.gQ = null;
          a5.a(0, "您好，游戏正在更新最新内容，需要下载最新客户端，欢迎您提前体验！", "下载", "返回", -8, -3);
          break;
        case 4:
          if (!"".equals(aa))
          {
            if (d)
            {
              e = true;
              return;
            }
            if (a5.hQ == 1)
            {
              as.a(0, "此账号已存在，建议您修改为：" + aa, bm.a2[2], "", -24, -2);
              System.out.println("//glacier 游客转换为正式玩家的实验性代码");
            }
            else
            {
              a5.a(0, "此账号已存在，建议您修改为：" + aa, bm.a2[2], "", -9, -120);
            }
            if (a5.hC == null)
              a5.hC = new String[2];
            a5.hC[0] = aa;
            a5.hC[1] = aa;
            return;
          }
          if (d)
          {
            a5.a(0, "快速注册失败，请重试", bm.a2[2], "", -7, -120);
            return;
          }
          a5.a(0, az, bm.a2[2], "", -7, -120);
          break;
        case 100:
          aw = false;
          if (((bk)localObject2).aW == 3)
          {
            at = true;
            return;
          }
          if (((bk)localObject2).aW != 7)
            break;
          p = true;
          break;
        case 101:
          a5.a(0, "对不起，操作失败，请重新尝试或联系客服！", bm.a2[2], "", -7, -30);
          break;
        default:
          if (a5.gQ != null)
            a5.gQ = null;
          if (az == null)
          {
            az = "操作失败，请重新尝试";
            b5.jdMethod_case("错误码：" + aj);
          }
          a5.a(0, az, bm.a2[2], "", -7, -30);
          a5.cC = true;
        }
      return;
    }
    if (localbk1.aI == 3)
    {
      if ((a5.hM) && (localbk1.aZ == 0))
      {
        byte b1 = 1;
        switch (localbk1.aW)
        {
        case 1:
          b1 = 1;
          break;
        case 0:
          if (d)
          {
            if (a5.hQ == 1)
            {
              b1 = 0;
              a5.hC[0] = "tjuser";
              a5.hC[1] = "121212";
            }
            else
            {
              b1 = 5;
            }
          }
          else
            b1 = 0;
          break;
        case 2:
          b1 = 2;
        }
        bk localbk2 = new bk(q, jdField_do(b1), 1, 2);
        b = true;
        localbk2.a(localbk1.aW);
        return;
      }
      jdMethod_goto();
      if (a5.gQ != null)
        a5.gQ = null;
      if (localbk1.aW == 1)
      {
        a5.a(0, "登录失败，请修改网络设置后重试", bm.a2[2], "", -10, -120);
        return;
      }
      b5.jdMethod_case("连接失败，请重新尝试");
      if ((localbk1.aW != 6) && (localbk1.aW != 11) && (localbk1.aW != 5))
        a5.a(0, "连接失败，请重新尝试", bm.a2[2], "", -7, -120);
    }
  }

  private boolean a(HttpConnection paramHttpConnection, int paramInt)
    throws IOException
  {
    if ((this.jdField_byte == 1) && (this.aW == 6))
    {
      int n;
      int i;
      if ((paramInt == 200) && (aT != 0))
      {
        paramInt = paramHttpConnection.openDataInputStream();
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        n = 0;
        while ((n = paramInt.read()) != -1)
          localByteArrayOutputStream.write(n);
        byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
        localByteArrayOutputStream.close();
        StringBuffer localStringBuffer = new StringBuffer();
        for (paramInt = 0; paramInt < arrayOfByte.length; paramInt++)
          localStringBuffer.append((char)arrayOfByte[paramInt]);
        paramHttpConnection = (paramInt = localStringBuffer.toString()).indexOf("userId=");
        i = paramInt.indexOf("\r", paramHttpConnection);
        if ((paramHttpConnection == -1) || (i == -1))
        {
          this.s = (this.af = "");
        }
        else
        {
          this.s = paramInt.substring(paramHttpConnection + 7, i);
          paramHttpConnection = paramInt.indexOf("key=", i);
          i = paramInt.indexOf("\r", paramHttpConnection);
          this.af = paramInt.substring(paramHttpConnection + 4, i);
          if ((!"".equals(this.s)) && (!a5.dJ))
            a5.dJ = true;
        }
        if (this.s != null)
          a5.ik = this.s;
        if (this.af != null)
          a5.iM = this.af;
        if ((!"".equals(this.s)) && (!a5.dJ))
          a5.dJ = true;
        aT = 0;
        aQ = "/bizcontrol/LoginOnlineGame?sender=202&cpId=C00002&cpServiceId=120120438000&channelId=1000&fid=1000";
        jdField_byte();
        return true;
      }
      if (paramInt == 302)
      {
        if ((paramInt = paramHttpConnection.getHeaderField("Location")) != null)
        {
          i = paramInt.indexOf("userId");
          n = paramInt.indexOf("key");
          int i1 = paramInt.indexOf('&', 0);
          int i2 = paramInt.indexOf('&', i1 + 1);
          if (i != -1)
          {
            this.s = paramInt.substring(i + 7, i1);
            this.af = paramInt.substring(n + 4, i2);
            a5.ik = this.s;
            a5.iM = this.af;
          }
          paramHttpConnection.close();
          if ((("".equals(this.s)) || (this.s == null)) && ((paramInt = (paramHttpConnection = (HttpConnection)Connector.open(paramInt, 3)).getResponseCode()) == 200))
          {
            ap = true;
            this.s = paramHttpConnection.getHeaderField("userId");
            this.af = paramHttpConnection.getHeaderField("key");
            if (this.s != null)
              a5.ik = this.s;
            if (this.af != null)
              a5.iM = this.af;
          }
          aT = 0;
          aQ = "/bizcontrol/LoginOnlineGame?sender=202&cpId=C00002&cpServiceId=120120438000&channelId=1000&fid=1000";
          jdField_byte();
          if ((!"".equals(this.s)) && (!a5.dJ))
            a5.dJ = true;
        }
        else
        {
          aT = 0;
          aQ = "/bizcontrol/LoginOnlineGame?sender=202&cpId=C00002&cpServiceId=120120438000&channelId=1000&fid=1000";
          jdField_byte();
        }
        return true;
      }
      return false;
    }
    return false;
  }

  private void k()
  {
    if (this.aI == 2)
    {
      Object localObject1;
      Object localObject2;
      int i2;
      int i3;
      switch (this.jdField_byte)
      {
      case 1:
        if ((aT == 1) && (this.aW == 6))
        {
          aj = -1;
          b5.jdMethod_case("userId = " + this.s);
          b5.jdMethod_case("key = " + this.af);
          return;
        }
        try
        {
          localObject1 = new StringBuffer();
          for (int i = 0; i < this.t.length; i++)
            ((StringBuffer)localObject1).append((char)this.t[i]);
          int n = (localObject2 = ((StringBuffer)localObject1).toString()).indexOf("userId=");
          i2 = ((String)localObject2).indexOf("\r", n);
          if ((n == -1) || (i2 == -1))
          {
            this.s = (this.af = "");
          }
          else
          {
            this.s = ((String)localObject2).substring(n + 7, i2);
            i3 = ((String)localObject2).indexOf("key=", i2);
            n = ((String)localObject2).indexOf("\r", i3);
            this.af = ((String)localObject2).substring(i3 + 4, n);
            if ((!"".equals(this.s)) && (!a5.dJ))
              a5.dJ = true;
          }
          aj = -1;
          b5.jdMethod_case("userId = " + this.s);
          b5.jdMethod_case("key = " + this.af);
        }
        catch (Exception localException1)
        {
          (localObject1 = localException1).printStackTrace();
        }
      case 2:
        localObject1 = new ByteArrayInputStream(this.t);
        localObject2 = new DataInputStream((InputStream)localObject1);
        try
        {
          if (ao == 1)
          {
            String str = "";
            i2 = ((DataInputStream)localObject2).readShort();
            aj = ((DataInputStream)localObject2).readByte();
            b5.jdMethod_case("PassPort-----kongFirstResult: " + aj);
            for (i3 = 0; i3 < 32; i3++)
              str = str + ((DataInputStream)localObject2).readChar();
            a5.it = str;
            b5.jdMethod_case("PassPort-----kongMD5: " + a5.it);
            StringBuffer localStringBuffer = new StringBuffer();
            localObject3 = 0;
            this = i2 - 1 - 64 >> 1;
            while (localObject3 < this)
            {
              localStringBuffer.append(((DataInputStream)localObject2).readChar());
              localObject3++;
            }
            a4 = localStringBuffer.toString();
            b5.jdMethod_case("PassPort-----serverListString: " + a4);
          }
          else if (ao == 2)
          {
            b5.jdMethod_case(localObject3 = ((DataInputStream)localObject2).readUTF());
            jdField_if((String)localObject3);
            jdField_if();
          }
          ((DataInputStream)localObject2).close();
          ((ByteArrayInputStream)localObject1).close();
        }
        catch (Exception localException2)
        {
          Object localObject3;
          (localObject3 = localException2).printStackTrace();
        }
      case 3:
        aj = -1;
        if ((au == null) || (au.equals("1")))
        {
          this.aI = 3;
          return;
        }
        if (ab == null)
        {
          this.aI = 3;
          return;
        }
        switch (this.aW)
        {
        case 3:
          if (ab.equals("1100"))
          {
            aj = 1;
            break;
          }
          aj = 100;
          break;
        case 7:
          if (ab.equals("1105"))
          {
            aj = 1;
            break;
          }
          aj = 101;
          break;
        case 8:
          if ((ab.equals("1104")) || (ab.equals("1102")))
          {
            aj = 1;
            i();
            break;
          }
          aj = 101;
          break;
        case 9:
          if (ab.equals("1102"))
          {
            aj = 1;
            i();
            break;
          }
          aj = 101;
          break;
        case 10:
          aj = 1;
          break;
        case 4:
        case 5:
        case 6:
        }
        break;
      case 0:
        localObject1 = new ByteArrayInputStream(this.t);
        localObject2 = new DataInputStream((InputStream)localObject1);
        try
        {
          if (ao == 1)
          {
            ((DataInputStream)localObject2).readShort();
            int i1 = 0;
            aj = ((DataInputStream)localObject2).readByte();
          }
          else if (ao == 2)
          {
            b5.jdMethod_case(localObject4 = ((DataInputStream)localObject2).readUTF());
            jdField_if((String)localObject4);
            jdField_if();
          }
        }
        catch (Exception localException3)
        {
          Object localObject4;
          (localObject4 = localException3).printStackTrace();
        }
      }
      return;
    }
    else if (this.aI == 3)
    {
      this.s = (this.af = null);
    }
  }

  private void jdMethod_try()
  {
    if ((bk.Y = b5.a(a4, a4.length(), ';'))[0].indexOf("[荐]") != -1)
    {
      an = b5.a(this = Y[0], length(), ',');
      b5.jdMethod_case("~~~~~~~~~~~~~~~~目前共有" + (Y.length - 1) + "个分区~~~~~~~~~~~~");
    }
    else
    {
      b5.jdMethod_case("~~~~~~~~~~~~~~~~目前共有" + Y.length + "个分区~~~~~~~~~~~~");
      an = null;
    }
    for (this = 0; this < Y.length; this++)
      a(Y[this], this);
  }

  private static void a(String paramString, int paramInt)
  {
    int i = (byte)((paramString = b5.a(paramString, paramString.length(), ',')).length / 4);
    if ((paramInt != 0) || (an == null))
    {
      if ((((paramInt = b5.jdField_do("last_time_login", 4)) == null) && (an == null)) || (a5.e8.g0 == 1))
        g = new String[i - 1][4];
      else if ((paramInt != null) && (an != null))
        g = new String[i + 1][4];
      else
        g = new String[i][4];
      i = 0;
      if ((paramInt == null) || (a5.e8.g0 == 1))
      {
        if (an == null)
          break label250;
        g[0] = an;
      }
      else
      {
        String str;
        i = (str = paramInt[0]).indexOf('(');
        int i1 = str.indexOf(']');
        if (i != -1)
          str = str.substring(i1 != -1 ? i1 + 1 : 0, i) + "(上次登录)";
        else
          str = str + "(上次登录)";
        paramInt[0] = str;
        g[0] = paramInt;
        if (an != null)
        {
          g[1] = an;
          i = 2;
          break label250;
        }
      }
      i = 1;
      label250: for (int n = 0; n < g.length - i; n++)
      {
        g[(n + i)][0] = paramString[(n + 1 << 2)];
        g[(n + i)][1] = paramString[((n + 1 << 2) + 1)];
        g[(n + i)][2] = paramString[((n + 1 << 2) + 2)];
        g[(n + i)][3] = paramString[((n + 1 << 2) + 3)];
      }
    }
  }

  private static void n()
  {
    if ((aV != null) && (!aV.equals("")))
    {
      String[] arrayOfString;
      int i = (arrayOfString = b5.a(aV, aV.length(), '|', false)).length / 3;
      System.out.println("~~~~~~~~~~~~~~processServerUpdateInfo num = " + i);
      Z = new String[i][3];
      aO = new String[i];
      for (int n = 0; n < i; n++)
      {
        Z[n][0] = arrayOfString[(n * 3)];
        Z[n][1] = arrayOfString[(n * 3 + 1)];
        Z[n][2] = arrayOfString[(n * 3 + 2)];
        aO[n] = Z[n][0];
      }
      return;
    }
    Z = null;
  }

  public static String jdField_do(int paramInt)
  {
    return g[paramInt][1];
  }

  public static String a(int paramInt)
  {
    return g[paramInt][2];
  }

  public static String jdField_if(int paramInt)
  {
    return g[paramInt][3];
  }

  public static String jdField_do(byte paramByte)
  {
    String str = "";
    if (paramByte == 0)
    {
      str = aJ + "usr=" + a5.hC[0] + "&pwd=" + a5.hC[1] + "&cmd=r" + "&game=fengshen&subgame=" + "fengshen" + "&from=" + a5.gd + "&cver=" + a5.jdMethod_int(a1.jdField_for) + "&jar=" + "GOH_ALL2.jar" + "&imei=" + B + "&charged=" + 0 + "&istest=" + a5.e8.g0 + "&reuid=" + x;
    }
    else if (paramByte == 1)
    {
      str = aJ + "usr=" + a5.hC[0] + "&pwd=" + a5.hC[1] + "&cmd=l" + "&game=fengshen&subgame=" + "fengshen" + "&from=" + a5.gd + "&cver=" + a5.jdMethod_int(a1.jdField_for) + "&jar=" + "GOH_ALL2.jar" + "&imei=" + B + "&charged=" + 0 + "&istest=" + a5.e8.g0;
      try
      {
        if ((paramByte = (ay)a5.es.cf().elementAt(10)).bm() == 1)
          str = str + "&auth=ko";
      }
      catch (Exception localException)
      {
      }
    }
    else if (paramByte == 2)
    {
      str = aJ + "usr=" + a5.fc[0] + "&pwd=" + a5.fc[1] + "&topd=" + a5.fc[2] + "&cmd=c";
    }
    else if (paramByte == 3)
    {
      str = "/reportip/r.jsp?usr=" + a5.hC[0] + "&game=fengshen&from=" + a5.gd + "&cver=" + a5.jdMethod_int(a1.jdField_for) + "&jar=" + "GOH_ALL2.jar" + "&dest=";
    }
    else if (paramByte == 4)
    {
      str = aJ + "usr=" + a5.hC[0] + "&pwd=" + a5.hC[1] + "&cmd=l" + "&game=fengshen&subgame=" + "fengshen" + "&from=" + a5.gd + "&cver=" + a5.jdMethod_int(a1.jdField_for) + "&jar=" + "GOH_ALL2.jar" + "&imei=" + B;
    }
    else if (paramByte == 5)
    {
      str = aJ + "cmd=k" + "&game=fengshen&subgame=" + "fengshen" + "&from=" + a5.gd + "&cver=" + a5.jdMethod_int(a1.jdField_for) + "&jar=" + "GOH_ALL2.jar" + "&imei=" + B + "&reuid=" + x;
    }
    else if (paramByte == 6)
    {
      str = aJ + "cmd=s&game=fengshen";
    }
    return str;
  }

  private void jdField_if(HttpConnection paramHttpConnection)
    throws IOException
  {
    String str1 = "";
    String str2 = "fengshen";
    try
    {
      if ((str1 = System.getProperty("microedition.platform")) != null)
        str1 = str1.trim();
      else
        str1 = "";
      b5.jdMethod_case("--platform:" + str1);
    }
    catch (Exception localException)
    {
      b5.jdMethod_case("Can not get platform!! May be a Phone Emulator!");
    }
    paramHttpConnection.setRequestProperty("mammoth_ua", str1);
    paramHttpConnection.setRequestProperty("from", a5.gd);
    paramHttpConnection.setRequestProperty("game-service", str2);
    if (this.aW == 12)
    {
      jdField_for = U.substring(U.indexOf("uaStr=") + "uaStr=".length(), U.length());
      System.out.println("~~~~~~userAgent = " + jdField_for);
      paramHttpConnection.setRequestProperty("user-agent", jdField_for);
    }
    if (this.aW == 13)
    {
      paramHttpConnection.setRequestProperty("user-agent", jdField_for);
      paramHttpConnection.setRequestProperty("content-length", "11");
      paramHttpConnection.setRequestProperty("content-type", "text/plain");
      paramHttpConnection.setRequestProperty("accept", "*/*");
    }
    if (this.aW == 20)
    {
      paramHttpConnection.setRequestProperty("User-Agent", "NokiaN73");
      paramHttpConnection.setRequestProperty("accept-encoding", "deflate,gzip,x-gzip");
    }
  }

  public static String jdMethod_int(String paramString)
  {
    return paramString.substring(paramString.indexOf('@') + 1, paramString.length());
  }

  private void jdField_if(HttpConnection paramHttpConnection, int paramInt)
    throws IOException
  {
    if (paramHttpConnection != null)
    {
      if (ao == 1)
      {
        for (int i = 0; i < jdField_do.length; i++)
          jdField_do[i] = paramHttpConnection.getHeaderField(c[i]);
        P = paramHttpConnection.getHeaderField("PASSPORT_BOND");
        az = a(bk.az = paramHttpConnection.getHeaderField("resultmsg"));
        if ((a1.new = paramHttpConnection.getHeaderField("download")) == null)
          a1.new = "";
        b5.jdMethod_case("GameLogin.downloadAddress = " + a1.new);
        if ((bk.aa = paramHttpConnection.getHeaderField("suggestion")) == null)
          aa = paramHttpConnection.getHeaderField("PASS_NAME");
        if ((bk.j = paramHttpConnection.getHeaderField("PASSPORT_ID")) == null)
          j = "";
        if ((bk.aV = paramHttpConnection.getHeaderField("SERVERCONTENT")) != null)
        {
          aV = a(aV);
          b5.jdMethod_case("~~~~~~~~~~~~~~~~~serverContent:~~~~~~~~~~~~~" + aV);
        }
        if (this.aW == 11)
          if ((bk.a5 = paramHttpConnection.getHeaderField("region")) == null)
            a5 = "";
          else
            a5 = a(a5);
        String str1;
        String str2;
        if (this.aW == 20)
        {
          localObject = new StringBuffer();
          this.av = 0;
          while (true)
          {
            str1 = paramHttpConnection.getHeaderFieldKey(this.av);
            str2 = null;
            if (str1 != null)
            {
              str2 = paramHttpConnection.getHeaderField(str1);
              ((StringBuffer)localObject).append("" + str1 + "|" + str2 + "~");
            }
            if (paramHttpConnection.getHeaderFieldKey(this.av) == null)
            {
              u.jdField_if().jdField_case = ((StringBuffer)localObject).toString();
              this.av = 0;
              break;
            }
            this.av += 1;
          }
        }
        if ((this.aW == 15) || (this.aW == 1) || (this.aW == 0))
        {
          localObject = paramHttpConnection.getHeaderField("SMS_COIN");
          str1 = paramHttpConnection.getHeaderField("SMS_BOND");
          str2 = paramHttpConnection.getHeaderField("SMS_SEEK");
          String str3 = paramHttpConnection.getHeaderField("SMS_DEL");
          if (localObject != null)
            aB = (String)localObject;
          if (str1 != null)
            a = str1;
          if (str2 != null)
            m = str2;
          if (str3 != null)
            f = str3;
        }
        n();
      }
      Object localObject = paramHttpConnection.openDataInputStream();
      if (paramInt > 0)
      {
        this.t = new byte[paramInt];
        for (int n = 0; n < paramInt; n++)
          this.t[n] = (byte)((DataInputStream)localObject).read();
      }
      else
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        int i1 = 0;
        while ((i1 = ((DataInputStream)localObject).read()) != -1)
          localByteArrayOutputStream.write(i1);
        this.t = null;
        this.t = localByteArrayOutputStream.toByteArray();
        localByteArrayOutputStream.close();
      }
      ((DataInputStream)localObject).close();
      paramHttpConnection.close();
    }
  }

  private static String a(String paramString)
  {
    if (paramString == null)
      return null;
    StringBuffer localStringBuffer = new StringBuffer();
    for (int n = 0; n < paramString.length(); n++)
    {
      int i1;
      if ((i1 = paramString.charAt(n)) == '%')
      {
        int i = n;
        n++;
        if (paramString.length() >= n + 4)
        {
          i1 = Integer.parseInt(paramString.substring(n, n + 4), 16);
          n += 3;
        }
        else
        {
          n = i;
        }
      }
      localStringBuffer.append((char)i1);
    }
    return localStringBuffer.toString();
  }

  public final void jdField_for(byte paramByte)
  {
    this.aI = 0;
  }

  private String jdField_do()
  {
    if (this.s == null)
      return "";
    return this.s;
  }

  private String jdMethod_long()
  {
    if (this.af == null)
      return "";
    return this.af;
  }

  public final byte[] d()
  {
    return this.t;
  }

  public static void l()
  {
    if (!a5.dU)
    {
      a5.a(0, "您当前连接设置错误，请使用cmwap连接方式！", bm.a2[2], "", -7, -120);
      return;
    }
    if ((a5.ik != null) && (!"".equals(a5.ik.trim())))
      return;
    jdField_byte();
  }

  public static boolean h()
  {
    if (P == null)
      return false;
    return P.toLowerCase().equals("true");
  }

  public static void jdField_byte()
  {
    Thread localThread;
    (localThread = new Thread(new Runnable()
    {
      public final void run()
      {
        if (((a5.ik == null) || ("".equals(a5.ik.trim()))) && (a5.dU))
        {
          this = new bk(bk.aG, bk.aQ, a5.dU ? 0 : 1, 1);
          bk.b = true;
          a(6);
        }
      }
    })).start();
  }

  public static void a()
  {
    if (!a5.dU)
      return;
    Thread localThread;
    (localThread = new Thread(new Runnable()
    {
      public final void run()
      {
        while ((a5.ik == null) || ("".equals(a5.ik.trim())))
          try
          {
            Thread.sleep(150L);
          }
          catch (Exception localException)
          {
            (this = localException).printStackTrace();
          }
        if (a5.gD.a() != null)
        {
          bk.S = System.currentTimeMillis();
          bk.access$000();
        }
        this = new bk(bk.al, bk.U, a5.dU ? 0 : 1, 1);
        bk.b = true;
        a(12);
      }
    })).start();
  }

  private static void e()
  {
    if (!a5.dU)
      return;
    Thread localThread;
    (localThread = new Thread(new Runnable()
    {
      public final void run()
      {
        this = new bk(bk.al, bk.aH, a5.dU ? 0 : 1, 1);
        bk.b = true;
        a(13);
      }
    })).start();
  }

  private static void jdField_void()
  {
    if (!a5.dU)
      return;
    Thread localThread;
    (localThread = new Thread(new Runnable()
    {
      public final void run()
      {
        this = new bk(bk.al, bk.aX, a5.dU ? 0 : 1, 1);
        bk.b = true;
        a(14);
      }
    })).start();
  }

  public static boolean jdField_if(byte paramByte)
  {
    if (Z == null)
      return false;
    Object localObject = null;
    String str;
    if (!G)
    {
      int i = paramByte;
      i = paramByte;
      i = paramByte;
      str = g[i][1] + ":" + g[i][2] + ":" + g[i][3];
    }
    else
    {
      str = a5.hR[paramByte] + ":" + a5.is;
    }
    for (paramByte = 0; paramByte < aO.length; paramByte++)
    {
      if (!str.equals(aO[paramByte]))
        continue;
      a5.a(0, Z[paramByte][1] + "\n\n" + Z[paramByte][2], bm.a2[2], "", -1, -120);
      return true;
    }
    return false;
  }

  public static void jdMethod_goto()
  {
    if (y == 0)
    {
      b5.jdMethod_case("error in loseConnect()...");
      return;
    }
    if (!a5.dU)
    {
      y = 0;
      b5.jdMethod_case("loseConnect is not CMWAP");
      return;
    }
    Object localObject = "";
    switch (y)
    {
    case 1:
      localObject = "passport";
      break;
    case 2:
      localObject = "" + a5.is;
    }
    localObject = jdField_do(3) + (String)localObject;
    b5.jdMethod_case("loseURL = " + (String)localObject);
    (localObject = new bk("61.135.154.43", (String)localObject, a5.dU ? 0 : 1, 0)).a(5);
    y = 0;
  }

  public static boolean m()
  {
    return (!"".equals(a5.ik)) && (!"".equals(a5.iM));
  }

  public static void g()
  {
    Object localObject;
    K = (localObject = Calendar.getInstance(localObject = TimeZone.getDefault())).get(1);
    ag = ((Calendar)localObject).get(2) + 1;
  }

  private void i()
  {
    if (this.t == null)
      return;
    try
    {
      X = new String(this.t, "gb2312");
      return;
    }
    catch (Exception localException)
    {
      (this = localException).printStackTrace();
    }
  }

  public static boolean f()
  {
    int i = jdField_char / 100;
    int n = jdField_char % 100;
    if ((i >= 2009) && (i <= K))
    {
      if (i == K)
      {
        if ((n > 0) && (n <= ag))
          return true;
        a5.a(0, "请输入正确的月份,不要超出当前月份", bm.a2[2], "", -7, -120);
        return false;
      }
      if ((n > 0) && (n <= 12))
        return true;
      a5.a(0, "请输入正确的月份", bm.a2[2], "", -7, -120);
      return false;
    }
    a5.a(0, "输入年份错误，请输入2009年至今的年份。", bm.a2[2], "", -7, -120);
    return false;
  }

  public static void a(String paramString1, String paramString2)
  {
    if (!a5.dU)
      return;
    paramString1 = paramString1;
    paramString2 = paramString2;
    (paramString1 = new Thread(new Runnable(paramString1, paramString2)
    {
      private final String val$mip;
      private final String val$murl;

      public final void run()
      {
        bk.H = new bk(this.val$mip, this.val$murl, a5.dU ? 0 : 1, 0);
        bk.b = true;
        bk.H.a(20);
      }
    })).start();
  }

  public static void b()
  {
    if (a5.dU)
    {
      bk localbk;
      (localbk = new bk(q, jdField_do(4), a5.dU ? 0 : 1, 2)).a(11);
    }
  }

  public static void jdMethod_new()
  {
    if (aB == null)
    {
      bk localbk;
      (localbk = new bk(q, jdField_do(6), a5.dU ? 0 : 1, 2)).a(15);
    }
  }

  private static void a(HttpConnection paramHttpConnection)
    throws IOException
  {
    String str = "900 Success";
    OutputStream localOutputStream = null;
    paramHttpConnection.setRequestMethod("POST");
    localOutputStream = paramHttpConnection.openOutputStream();
    paramHttpConnection = str.getBytes();
    for (int i = 0; i < paramHttpConnection.length; i++)
      localOutputStream.write(paramHttpConnection[i]);
    localOutputStream.close();
  }

  private void jdField_if(String paramString)
  {
    String[] arrayOfString = null;
    arrayOfString = b5.a(paramString, '\n');
    this.l = new String[arrayOfString.length][2];
    for (paramString = 0; paramString < arrayOfString.length; paramString++)
    {
      if (arrayOfString[paramString].indexOf(':') == -1)
        continue;
      this.l[paramString][0] = arrayOfString[paramString].substring(0, arrayOfString[paramString].indexOf(58)).trim();
      this.l[paramString][1] = arrayOfString[paramString].substring(arrayOfString[paramString].indexOf(58, 0) + 1).trim();
      System.out.println("body key = " + this.l[paramString][0]);
      System.out.println("body value = " + this.l[paramString][1]);
    }
  }

  private String jdField_for(String paramString)
  {
    try
    {
      for (int i = 0; i < this.l.length; i++)
        if (paramString.equals(this.l[i][0]))
          return this.l[i][1];
      return "";
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private void jdField_if()
  {
    try
    {
      aj = Integer.parseInt(jdField_for("result"));
      System.out.println("PassPort-----kongFirstResult: " + aj);
    }
    catch (Exception localException1)
    {
      aj = -1;
      this.aI = 3;
    }
    az = a(bk.az = jdField_for("resultmsg"));
    n();
    a5.it = jdField_for("md5");
    for (int i = 0; i < jdField_do.length; i++)
      jdField_do[i] = jdField_for(c[i]);
    aV = jdField_for("SERVERCONTENT");
    P = jdField_for("PASSPORT_BOND");
    jdField_for("MOBILE_VIP");
    a1.new = jdField_for("download");
    aa = jdField_for("suggestion");
    if ("".equals(aa))
      aa = jdField_for("PASS_NAME");
    jdField_for("charged");
    j = jdField_for("PASSPORT_ID");
    a5 = jdField_for("REGION");
    a5 = a(bk.a5 = jdField_for("REGION"));
    aB = jdField_for("SMS_COIN");
    a = jdField_for("SMS_BOND");
    f = jdField_for("SMS_DEL");
    m = jdField_for("SMS_SEEK");
    try
    {
      localObject = jdField_for("GHEART");
      if (!"".equals(localObject))
      {
        localObject = b5.a((String)localObject, ':');
        a5.gD.a(localObject[0]);
        a5.gD.jdField_do(localObject[1]);
        a5.gD.jdField_if(localObject[2]);
      }
    }
    catch (Exception localException2)
    {
      Object localObject;
      (localObject = localException2).printStackTrace();
    }
    if ((a5.f6 != null) && (a5.f6[0] == 1))
      F = jdField_for("VIR_USER");
    a0 = jdField_for("SMSPRICE");
    if ((bk.a4 = jdField_for("body")) != null)
      a4 = a(a4);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bk
 * JD-Core Version:    0.6.0
 */
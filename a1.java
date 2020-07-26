import java.io.PrintStream;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public final class a1
{
  public static int jdField_for = 67109379;
  public static String jdField_new = "";
  private static boolean jdField_int = true;
  public static boolean jdField_do = false;
  public static byte jdField_if = -1;

  public static byte a()
  {
    String str = null;
    try
    {
      if (Class.forName("javax.microedition.lcdui.a") != null)
        return 5;
    }
    catch (Exception localException1)
    {
    }
    try
    {
      if (Class.forName("emulator.Emulator") != null)
        return 1;
    }
    catch (Exception localException2)
    {
    }
    try
    {
      if (Runtime.getRuntime().totalMemory() == 8000000L)
        return 2;
    }
    catch (Exception localException3)
    {
    }
    try
    {
      if (((str = System.getProperty("microedition.platform")) != null) && (str.equals("SunMicrosystems_wtk")))
        return 3;
    }
    catch (Exception localException4)
    {
    }
    try
    {
      if (Class.forName("java.applet.Applet") != null)
        return 4;
    }
    catch (Exception localException5)
    {
    }
    return 0;
  }

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    int i;
    switch (paramInt)
    {
    case 4:
      localac.a(a5.eQ.jdField_try);
      break;
    case 65537:
      if (!jdField_int)
      {
        i = 18;
        (paramInt = localac).a((byte)i);
      }
      localac.a(a5.c3);
      localac.jdField_if(a5.n());
      localac.jdField_if(a5.hC[1]);
      b5.jdMethod_case("GameLogin-cmd-C_LOGIN_FIRST");
      break;
    case 131071:
      if (!jdField_int)
      {
        i = 18;
        (paramInt = localac).a((byte)i);
      }
      localac.a(a5.is);
      localac.jdField_do(jdField_for);
      localac.a(6);
      localac.jdField_if(a5.n());
      localac.jdField_if(a5.hC[1]);
      localac.jdField_if("l");
      i = bk.aj;
      (paramInt = localac).a((byte)i);
      localac.jdField_if(a5.it);
      localac.jdField_if(a5.hC[0]);
      b5.jdMethod_case("GameLogin-cmd-C_LOGIN_GAME");
      break;
    case 65539:
      bp.fz = bp.fM = 0;
      try
      {
        be.gf.getHeight();
      }
      catch (Exception localException)
      {
        (paramInt = a5.dI).notifyDestroyed();
      }
      localac.a(a5.hg);
      localac.jdField_if(a5.gd);
      localac.jdField_if(bk.B);
      localac.jdField_if(a5.ik);
      localac.a(a5.fF);
      localac.a(Runtime.getRuntime().totalMemory());
      b5.jdMethod_case("GameLogin-cmd-C_LOGIN_ROLE");
      break;
    case 3:
      localac.jdField_do(a5.ek);
      break;
    case 1114113:
      localac.jdField_if(a5.hC[0]);
      localac.jdField_if(a5.hC[1]);
      localac.jdField_if(null);
      b5.jdMethod_case("GameLogin-cmd-C_GAME_ENROL");
      break;
    case 1114114:
      b5.jdMethod_case("MainCanvas.m_bChoose=" + a5.hg);
      b5.jdMethod_case("MainCanvas.m_bCamp=" + a5.ci);
      b5.jdMethod_case("MainCanvas.m_bPhyle=" + a5.ck);
      b5.jdMethod_case("MainCanvas.m_bGender=" + a5.fW);
      b5.jdMethod_case("MainCanvas.m_bVocation=" + a5.ig);
      b5.jdMethod_case("MainCanvas.m_sName=" + a5.fY);
      localac.a(a5.hg);
      localac.a(a5.ck);
      localac.a(a5.fW);
      localac.a(a5.ig);
      localac.jdField_if(a5.fY);
      break;
    case 1114115:
      localac.jdField_if(a5.fc[0]);
      localac.jdField_if(a5.fc[1]);
      localac.jdField_if(a5.fc[2]);
      localac.jdField_if(a5.fc[3]);
      break;
    case 1114116:
    case 1114118:
    case 1114120:
      localac.a(a5.hg);
      break;
    case 117502:
      if (!jdField_int)
      {
        i = 18;
        (paramInt = localac).a((byte)i);
      }
      localac.a(a5.c3);
      localac.jdField_do(jdField_for);
      localac.a(6);
      localac.jdField_if(a5.n());
      localac.jdField_if(a5.hC[1]);
      break;
    case 65546:
      localac.a(a5.is);
      localac.jdField_do(jdField_for);
      localac.a(6);
      localac.jdField_if(a5.gd);
      break;
    case 1114119:
      localac.a(a5.hg);
      localac.jdField_if(be.gU[1]);
      break;
    case 65547:
      break;
    case 65548:
      localac.jdField_if(a5.hC[0]);
      localac.jdField_if(a5.hC[1]);
      localac.jdField_if(a5.it);
      break;
    case 65544:
    case 65545:
    case 65550:
      a5.fR = true;
      break;
    case 65551:
      break;
    case 65557:
      localac.jdField_if(bk.a5);
      break;
    case 65558:
      localac.jdField_if(bk.a0);
      break;
    case 65568:
      localac.jdField_if(bk.F);
      break;
    case 65569:
      localac.jdField_if(a5.ik);
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    int i;
    String str;
    Object localObject;
    switch (paramInt)
    {
    case -2147483644:
      a5.eQ.jdField_try = paramac.jdField_new();
      a5.eQ.a(4);
      try
      {
        a5.eQ.jdMethod_char();
      }
      catch (Exception paramInt)
      {
        b5.jdMethod_case("加密命令出错");
      }
      paramInt = paramac.jdField_if();
      a5.eQ.j = new byte[paramInt];
      for (i = 0; i < paramInt; i++)
        a5.eQ.j[i] = paramac.jdField_if();
      return;
    case -2147418111:
      jdField_if = paramac.jdField_if();
      jdField_do = true;
      return;
    case -2147418093:
      bq.byte = paramac.jdMethod_goto();
      System.out.println("testDownloadUrl = " + bq.byte);
      a5.a(0, "版本号已不是最新，但仍能使用，请选择是否更新", "下载", "继续", -8, -2);
      return;
    case -2147418089:
      as.dM = paramac.jdMethod_goto();
      bo.x = paramac.jdMethod_byte();
      return;
    case -2147418107:
      b5.jdMethod_case("GameLogin-cmd-S_SERVERLIST");
      a5.gH = new String[a5.fN = i = paramac.jdField_if()];
      a5.hR = new String[a5.fN];
      a5.hs = new byte[a5.fN];
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        str = paramac.jdMethod_goto();
        localObject = paramac.jdMethod_goto();
        b5.jdMethod_case("----serverip----" + (String)localObject);
        a5.hs[paramInt] = paramac.jdField_if();
        b5.jdMethod_case("--------------m_bjumpIP--------------" + 0);
        a5.gH[paramInt] = str;
        a5.hR[paramInt] = localObject;
      }
      f.jdMethod_byte().jdField_for();
      return;
    case 1114117:
      b5.jdMethod_case("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      return;
    case -2147418109:
      paramInt = paramac.jdField_if();
      b5.jdMethod_case("GameLogin-cmd-S_ROLERESULT=" + paramInt);
      return;
    case -2146369531:
      str = null;
      str = paramac.jdMethod_goto();
      a5.hC[0] = str;
      a5.hC[1] = str;
      a5.jdField_do(14);
      as.a8();
      localObject = (a9)a5.es.cf().elementAt(10);
      paramInt = (a9)a5.es.cf().elementAt(11);
      paramac = (a9)a5.es.cf().elementAt(12);
      ((a9)localObject).a(new StringBuffer(a5.hC[0]));
      paramInt.a(new StringBuffer(a5.hC[1]));
      paramac.a(new StringBuffer(str));
      b5.jdMethod_case("MainCanvas.name_password[0]=" + a5.hC[0]);
      b5.jdMethod_case("MainCanvas.name_password[1]=" + a5.hC[1]);
      return;
    case -2147418098:
      paramInt = null;
      paramInt = paramac.jdMethod_goto();
      if (a5.ea != null)
      {
        a5.ea.l6.removeAllElements();
        a5.ea = null;
      }
      if (a5.V() != 0)
        a5.jdMethod_try(0);
      as.a(0, paramInt, "注册", "退出", -27, -12);
      return;
    case -2147418078:
      a5.eQ.a(65569);
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     a1
 * JD-Core Version:    0.6.0
 */
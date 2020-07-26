import java.io.PrintStream;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.midlet.MIDlet;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public final class bo
{
  public static String[] n;
  public static byte[] l;
  public static int[] G;
  public static String[] P;
  public static byte[] g;
  public static int[] K;
  public static byte[] I;
  public static byte q = 0;
  public static byte b = 0;
  public static byte[] s = new byte[2];
  public static String o;
  public static boolean D;
  private static byte jdField_try = 0;
  public static int N = 0;
  private static int jdField_void;
  public static byte t;
  public static int w = 0;
  public static byte jdField_char = 0;
  private static String jdField_byte = "106633552";
  public static byte C = 0;
  public static boolean y = false;
  public static String jdField_new;
  public static int e;
  private static String L;
  private static MessageConnection B;
  private static TextMessage E;
  public static int H;
  public static int x;
  private static int h;
  public static byte jdField_long;
  private static String A;
  public static boolean p = false;
  public static boolean j = false;

  public static byte[] jdMethod_if(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdMethod_do(paramInt);
    int i;
    switch (paramInt)
    {
    case 2424833:
    case 2424834:
    case 2424836:
    case 2424840:
    case 2424841:
    case 2424842:
    case 2424843:
    case 2425008:
    case 2425026:
      a5.fR = true;
      break;
    case 2425024:
      a5.fR = true;
      localac.jdMethod_if(a5.ik);
      break;
    case 2424835:
    case 2425029:
      a5.fR = true;
      localac.a(q);
      break;
    case 2424839:
      a5.fR = true;
      localac.a(0);
      break;
    case 2424993:
      a5.fR = true;
      localac.a(q);
      localac.jdMethod_if(a5.gd);
      if (!D)
      {
        localac.jdMethod_do(jdField_void);
        if (t == 0)
          localac.a((byte)as.c4);
      }
      else
      {
        localac.jdMethod_do(K[N]);
        if (g[N] == 1)
          localac.a(I[N]);
        else if (g[N] == 0)
          localac.a((byte)as.c4);
      }
      localac.a(jdField_char);
      localac.jdMethod_if(a5.ik);
      break;
    case 2424994:
      a5.fR = true;
      localac.a(s[0]);
      break;
    case 2424995:
      a5.fR = true;
      localac.a(s[0]);
      i = N;
      (paramInt = localac).a((byte)i);
      break;
    case 2424996:
      a5.fR = true;
      localac.jdMethod_do(w);
      break;
    case 2424998:
      a5.fR = true;
      localac.a(b);
      paramInt = null;
      paramInt = b5.jdMethod_do("name_password", 2);
      localac.jdMethod_if(paramInt[1]);
      break;
    case 2425009:
      a5.a(0, "请稍候...", "", "", -120, -120);
      paramInt = (a9)a5.es.cf().elementAt(5);
      localac.jdMethod_if(a5.ik);
      localac.jdMethod_if(a5.iM);
      localac.jdMethod_do(Integer.parseInt(paramInt.cc().toString().trim()));
      break;
    case 2425010:
      localac.jdMethod_if(a5.ik);
      break;
    case 2425011:
      localac.jdMethod_if(a5.ik);
      break;
    case 2425012:
      localac.jdMethod_if(a5.ik);
      localac.a(7);
      localac.a(bk.if);
      localac.jdMethod_do(bk.jdField_char);
      break;
    case 2425013:
      localac.jdMethod_if(a5.ik);
      localac.a(bk.ay);
      localac.a(bk.if);
      localac.jdMethod_do(bk.jdField_char);
      break;
    case 2424997:
      a5.fR = true;
      localac.jdMethod_if(a5.ik);
      break;
    case 2425072:
      a5.fR = true;
      if (a7.fF == 22)
        p = true;
      if (a7.fF == 23)
        j = true;
      localac.a(a7.fF);
      localac.jdMethod_if(a5.ik);
      break;
    case 2425076:
      a5.fR = true;
      localac.a(aa.jdField_void[aa.do]);
      localac.a(aa.d);
      break;
    case 2425077:
      a5.fR = true;
      localac.jdMethod_if(a5.ik);
      break;
    case 2425078:
      a5.fR = true;
      localac.a(q);
      break;
    case 2425079:
    case 2425080:
      a5.fR = true;
      localac.a(q);
      i = N;
      (paramInt = localac).a((byte)i);
    }
    return localac.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    String str;
    switch (paramInt)
    {
    case -2145058656:
      jdField_void = paramac.jdField_byte();
      t = paramac.jdMethod_if();
      paramac.jdMethod_if();
      return;
    case -2145058650:
      jdField_new = paramac.jdMethod_goto();
      b5.jdMethod_case("大额充值地址 = " + jdField_new);
      if ((jdField_new != null) || (!jdField_new.equals("")))
      {
        a5.fR = false;
        if (b == 0)
        {
          a("猛犸币大额充值", "点击“确定”转到猛犸币大额充值充值网页，点击“返回”返回游戏");
          return;
        }
        if (b != 1)
          break;
        a("元宝充值", "点击“确定”转到元宝充值网页，点击“返回”返回游戏");
        if (a5.d6.size() <= 0)
          break;
        a5.d6.removeElementAt(a5.d6.size() - 1);
        return;
      }
      else
      {
        b5.jdMethod_case("没有接收到大额充值地址，地址为空");
        return;
      }
    case -2145058649:
      A = paramac.jdMethod_goto();
      return;
    case -2145058639:
      if (a5.gQ != null)
        a5.gQ = null;
      br.c6();
      paramInt = paramac.jdField_byte();
      paramac = paramac.jdField_byte();
      (a5.es = e.a("/cm/ui/charger.ui")).g9 = -1610612688;
      str = null;
      if (paramInt != 0)
        str = "恭喜您，充值" + paramInt + "元成功，您已获得" + paramInt * 100 + "点点数！您目前的点数余额为" + paramac + "点！";
      else
        str = "对不起，充值失败，请尝试重新充值或联系客服！";
      (paramInt = (ak)a5.es.cf().elementAt(3)).jdMethod_if(str);
      return;
    case -2145058638:
      if (a5.gQ != null)
        a5.gQ = null;
      paramInt = paramac.jdField_byte();
      str = null;
      if (paramInt >= 0)
        str = "您当前的点数余额为" + paramInt + "点！";
      else
        str = "对不起，查询失败，请尝试重新查询或联系客服！";
      (paramInt = (ak)a5.es.cf().elementAt(3)).jdMethod_if(str);
      return;
    case -2145058637:
      if (a5.gQ != null)
        a5.gQ = null;
      paramInt = paramac.jdField_byte();
      str = null;
      if (paramInt >= 0)
        str = "您当前的点数余额为" + paramInt + "点！";
      else
        str = "对不起，查询失败，请尝试重新查询或联系客服！";
      (paramInt = (ak)a5.es.cf().elementAt(3)).jdMethod_if(str);
      return;
    case -2145058636:
    case -2145058635:
      if (a5.gQ != null)
        a5.gQ = null;
      paramac = paramac.jdMethod_goto();
      br.c6();
      a5.es = e.a("/cm/ui/result.ui");
      if (paramInt == -2145058636)
        a5.es.g9 = -1610612640;
      else if (paramInt == -2145058635)
        a5.es.g9 = -1610612639;
      (paramInt = (ak)a5.es.cf().elementAt(3)).jdMethod_if(paramac);
      paramInt.ap();
      return;
    case -2145058634:
      bk.aG = paramac.jdMethod_goto();
      bk.jdField_void = paramac.jdMethod_goto();
      bk.aQ = paramac.jdMethod_goto();
      if ((bk.aT = paramac.jdMethod_if()) == 2)
      {
        bk.al = paramac.jdMethod_goto();
        bk.U = paramac.jdMethod_goto();
        bk.aH = paramac.jdMethod_goto();
      }
      else if (bk.aT == 3)
      {
        bk.al = paramac.jdMethod_goto();
        bk.U = paramac.jdMethod_goto();
        bk.aH = paramac.jdMethod_goto();
        bk.aX = paramac.jdMethod_goto();
      }
      bk.jdField_byte();
      bk.a();
      return;
    case -2145058623:
      be.gM = new String[paramInt = paramac.jdMethod_if()];
      be.hE = new byte[paramInt];
      for (int i = 0; i < paramInt; i++)
      {
        be.hE[i] = paramac.jdMethod_if();
        be.gM[i] = paramac.jdMethod_goto();
      }
      return;
    case -2145058575:
      q = paramac.jdMethod_if();
      o = paramac.jdMethod_goto();
      s[0] = paramac.jdMethod_if();
      System.out.println("S_INCREMENT_GET_PAY = " + q + " 标题: " + o);
      return;
    case -2145058620:
      System.out.println("重新获取UserID");
      a5.ik = "";
      bk.jdField_byte();
    }
  }

  // ERROR //
  public static void jdMethod_if(byte paramByte)
  {
    // Byte code:
    //   0: iload_0
    //   1: iconst_1
    //   2: if_icmpne +21 -> 23
    //   5: getstatic 97	bk:aB	Ljava/lang/String;
    //   8: ifnull +30 -> 38
    //   11: getstatic 97	bk:aB	Ljava/lang/String;
    //   14: invokestatic 160	bk:int	(Ljava/lang/String;)Ljava/lang/String;
    //   17: putstatic 122	bo:jdField_byte	Ljava/lang/String;
    //   20: goto +18 -> 38
    //   23: getstatic 96	bk:a	Ljava/lang/String;
    //   26: ifnull +12 -> 38
    //   29: getstatic 96	bk:a	Ljava/lang/String;
    //   32: invokestatic 160	bk:int	(Ljava/lang/String;)Ljava/lang/String;
    //   35: putstatic 122	bo:jdField_byte	Ljava/lang/String;
    //   38: new 66	java/lang/StringBuffer
    //   41: dup
    //   42: invokespecial 176	java/lang/StringBuffer:<init>	()V
    //   45: ldc 25
    //   47: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   50: getstatic 122	bo:jdField_byte	Ljava/lang/String;
    //   53: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   56: invokevirtual 181	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   59: dup
    //   60: putstatic 119	bo:L	Ljava/lang/String;
    //   63: invokestatic 187	javax/microedition/io/Connector:open	(Ljava/lang/String;)Ljavax/microedition/io/Connection;
    //   66: checkcast 76	javax/wireless/messaging/MessageConnection
    //   69: dup
    //   70: putstatic 112	bo:B	Ljavax/wireless/messaging/MessageConnection;
    //   73: ldc 26
    //   75: invokeinterface 194 2 0
    //   80: checkcast 77	javax/wireless/messaging/TextMessage
    //   83: dup
    //   84: putstatic 115	bo:E	Ljavax/wireless/messaging/TextMessage;
    //   87: iload_0
    //   88: istore_1
    //   89: aconst_null
    //   90: astore_2
    //   91: new 66	java/lang/StringBuffer
    //   94: dup
    //   95: iconst_4
    //   96: invokespecial 177	java/lang/StringBuffer:<init>	(I)V
    //   99: astore_2
    //   100: iload_1
    //   101: iconst_1
    //   102: if_icmpne +122 -> 224
    //   105: getstatic 97	bk:aB	Ljava/lang/String;
    //   108: ifnull +66 -> 174
    //   111: getstatic 97	bk:aB	Ljava/lang/String;
    //   114: ldc 21
    //   116: invokestatic 141	a5:n	()Ljava/lang/String;
    //   119: invokestatic 154	b5:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   122: dup
    //   123: astore 4
    //   125: ldc 20
    //   127: ldc 23
    //   129: invokestatic 154	b5:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   132: dup
    //   133: astore 4
    //   135: ldc 19
    //   137: getstatic 111	bo:A	Ljava/lang/String;
    //   140: invokestatic 154	b5:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   143: dup
    //   144: astore 4
    //   146: bipush 64
    //   148: invokevirtual 173	java/lang/String:indexOf	(I)I
    //   151: ifle +18 -> 169
    //   154: aload 4
    //   156: iconst_0
    //   157: aload 4
    //   159: bipush 64
    //   161: invokevirtual 173	java/lang/String:indexOf	(I)I
    //   164: invokevirtual 174	java/lang/String:substring	(II)Ljava/lang/String;
    //   167: astore 4
    //   169: aload 4
    //   171: goto +4 -> 175
    //   174: aconst_null
    //   175: dup
    //   176: astore_1
    //   177: ifnonnull +35 -> 212
    //   180: aload_2
    //   181: ldc 17
    //   183: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   186: invokestatic 141	a5:n	()Ljava/lang/String;
    //   189: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   192: ldc 9
    //   194: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   197: ldc 8
    //   199: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   202: getstatic 111	bo:A	Ljava/lang/String;
    //   205: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   208: pop
    //   209: goto +463 -> 672
    //   212: new 66	java/lang/StringBuffer
    //   215: dup
    //   216: aload_1
    //   217: invokespecial 178	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   220: astore_2
    //   221: goto +451 -> 672
    //   224: iload_1
    //   225: iconst_2
    //   226: if_icmpne +165 -> 391
    //   229: getstatic 81	a5:es	Lbe;
    //   232: invokevirtual 157	be:cf	()Ljava/util/Vector;
    //   235: iconst_4
    //   236: invokevirtual 184	java/util/Vector:elementAt	(I)Ljava/lang/Object;
    //   239: checkcast 46	a9
    //   242: astore_1
    //   243: getstatic 81	a5:es	Lbe;
    //   246: invokevirtual 157	be:cf	()Ljava/util/Vector;
    //   249: bipush 6
    //   251: invokevirtual 184	java/util/Vector:elementAt	(I)Ljava/lang/Object;
    //   254: checkcast 46	a9
    //   257: astore_3
    //   258: aload_1
    //   259: invokevirtual 142	a9:cc	()Ljava/lang/StringBuffer;
    //   262: invokevirtual 181	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   265: invokevirtual 175	java/lang/String:trim	()Ljava/lang/String;
    //   268: astore_1
    //   269: aload_3
    //   270: invokevirtual 142	a9:cc	()Ljava/lang/StringBuffer;
    //   273: invokevirtual 181	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   276: invokevirtual 175	java/lang/String:trim	()Ljava/lang/String;
    //   279: astore_3
    //   280: aload_1
    //   281: aload_3
    //   282: astore 5
    //   284: astore 4
    //   286: getstatic 96	bk:a	Ljava/lang/String;
    //   289: ifnull +54 -> 343
    //   292: getstatic 96	bk:a	Ljava/lang/String;
    //   295: ldc 21
    //   297: aload 4
    //   299: invokestatic 154	b5:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   302: dup
    //   303: astore 4
    //   305: ldc 22
    //   307: aload 5
    //   309: invokestatic 154	b5:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   312: dup
    //   313: astore 4
    //   315: bipush 64
    //   317: invokevirtual 173	java/lang/String:indexOf	(I)I
    //   320: ifle +18 -> 338
    //   323: aload 4
    //   325: iconst_0
    //   326: aload 4
    //   328: bipush 64
    //   330: invokevirtual 173	java/lang/String:indexOf	(I)I
    //   333: invokevirtual 174	java/lang/String:substring	(II)Ljava/lang/String;
    //   336: astore 4
    //   338: aload 4
    //   340: goto +4 -> 344
    //   343: aconst_null
    //   344: dup
    //   345: astore 4
    //   347: ifnonnull +31 -> 378
    //   350: aload_2
    //   351: ldc 14
    //   353: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   356: ldc 13
    //   358: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   361: aload_1
    //   362: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   365: ldc 13
    //   367: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   370: aload_3
    //   371: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   374: pop
    //   375: goto +297 -> 672
    //   378: new 66	java/lang/StringBuffer
    //   381: dup
    //   382: aload 4
    //   384: invokespecial 178	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   387: astore_2
    //   388: goto +284 -> 672
    //   391: iload_1
    //   392: iconst_3
    //   393: if_icmpne +165 -> 558
    //   396: getstatic 81	a5:es	Lbe;
    //   399: invokevirtual 157	be:cf	()Ljava/util/Vector;
    //   402: iconst_4
    //   403: invokevirtual 184	java/util/Vector:elementAt	(I)Ljava/lang/Object;
    //   406: checkcast 46	a9
    //   409: astore_1
    //   410: getstatic 81	a5:es	Lbe;
    //   413: invokevirtual 157	be:cf	()Ljava/util/Vector;
    //   416: bipush 6
    //   418: invokevirtual 184	java/util/Vector:elementAt	(I)Ljava/lang/Object;
    //   421: checkcast 46	a9
    //   424: astore_3
    //   425: aload_1
    //   426: invokevirtual 142	a9:cc	()Ljava/lang/StringBuffer;
    //   429: invokevirtual 181	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   432: invokevirtual 175	java/lang/String:trim	()Ljava/lang/String;
    //   435: astore_1
    //   436: aload_3
    //   437: invokevirtual 142	a9:cc	()Ljava/lang/StringBuffer;
    //   440: invokevirtual 181	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   443: invokevirtual 175	java/lang/String:trim	()Ljava/lang/String;
    //   446: astore_3
    //   447: aload_1
    //   448: aload_3
    //   449: astore 5
    //   451: astore 4
    //   453: getstatic 106	bk:f	Ljava/lang/String;
    //   456: ifnull +54 -> 510
    //   459: getstatic 106	bk:f	Ljava/lang/String;
    //   462: ldc 21
    //   464: aload 4
    //   466: invokestatic 154	b5:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   469: dup
    //   470: astore 4
    //   472: ldc 22
    //   474: aload 5
    //   476: invokestatic 154	b5:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   479: dup
    //   480: astore 4
    //   482: bipush 64
    //   484: invokevirtual 173	java/lang/String:indexOf	(I)I
    //   487: ifle +18 -> 505
    //   490: aload 4
    //   492: iconst_0
    //   493: aload 4
    //   495: bipush 64
    //   497: invokevirtual 173	java/lang/String:indexOf	(I)I
    //   500: invokevirtual 174	java/lang/String:substring	(II)Ljava/lang/String;
    //   503: astore 4
    //   505: aload 4
    //   507: goto +4 -> 511
    //   510: aconst_null
    //   511: dup
    //   512: astore 4
    //   514: ifnonnull +31 -> 545
    //   517: aload_2
    //   518: ldc 16
    //   520: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   523: ldc 13
    //   525: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   528: aload_1
    //   529: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   532: ldc 13
    //   534: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   537: aload_3
    //   538: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   541: pop
    //   542: goto +130 -> 672
    //   545: new 66	java/lang/StringBuffer
    //   548: dup
    //   549: aload 4
    //   551: invokespecial 178	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   554: astore_2
    //   555: goto +117 -> 672
    //   558: iload_1
    //   559: iconst_4
    //   560: if_icmpne +112 -> 672
    //   563: getstatic 81	a5:es	Lbe;
    //   566: invokevirtual 157	be:cf	()Ljava/util/Vector;
    //   569: iconst_4
    //   570: invokevirtual 184	java/util/Vector:elementAt	(I)Ljava/lang/Object;
    //   573: checkcast 46	a9
    //   576: dup
    //   577: astore_1
    //   578: invokevirtual 142	a9:cc	()Ljava/lang/StringBuffer;
    //   581: invokevirtual 181	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   584: invokevirtual 175	java/lang/String:trim	()Ljava/lang/String;
    //   587: dup
    //   588: astore_3
    //   589: astore 4
    //   591: getstatic 108	bk:m	Ljava/lang/String;
    //   594: ifnull +44 -> 638
    //   597: getstatic 108	bk:m	Ljava/lang/String;
    //   600: ldc 21
    //   602: aload 4
    //   604: invokestatic 154	b5:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   607: dup
    //   608: astore 5
    //   610: bipush 64
    //   612: invokevirtual 173	java/lang/String:indexOf	(I)I
    //   615: ifle +18 -> 633
    //   618: aload 5
    //   620: iconst_0
    //   621: aload 5
    //   623: bipush 64
    //   625: invokevirtual 173	java/lang/String:indexOf	(I)I
    //   628: invokevirtual 174	java/lang/String:substring	(II)Ljava/lang/String;
    //   631: astore 5
    //   633: aload 5
    //   635: goto +4 -> 639
    //   638: aconst_null
    //   639: dup
    //   640: astore_1
    //   641: ifnonnull +22 -> 663
    //   644: aload_2
    //   645: ldc 15
    //   647: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   650: ldc 13
    //   652: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   655: aload_3
    //   656: invokevirtual 180	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   659: pop
    //   660: goto +12 -> 672
    //   663: new 66	java/lang/StringBuffer
    //   666: dup
    //   667: aload_1
    //   668: invokespecial 178	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   671: astore_2
    //   672: aload_2
    //   673: invokevirtual 181	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   676: invokevirtual 175	java/lang/String:trim	()Ljava/lang/String;
    //   679: dup
    //   680: astore_2
    //   681: invokeinterface 196 2 0
    //   686: iload_0
    //   687: iconst_2
    //   688: if_icmpeq +13 -> 701
    //   691: iload_0
    //   692: iconst_3
    //   693: if_icmpeq +8 -> 701
    //   696: iload_0
    //   697: iconst_4
    //   698: if_icmpne +18 -> 716
    //   701: getstatic 112	bo:B	Ljavax/wireless/messaging/MessageConnection;
    //   704: getstatic 115	bo:E	Ljavax/wireless/messaging/TextMessage;
    //   707: invokeinterface 195 2 0
    //   712: iconst_1
    //   713: putstatic 138	bo:y	Z
    //   716: return
    //   717: dup
    //   718: astore_1
    //   719: invokevirtual 183	java/lang/Throwable:printStackTrace	()V
    //   722: iload_0
    //   723: iconst_2
    //   724: if_icmpeq +13 -> 737
    //   727: iload_0
    //   728: iconst_3
    //   729: if_icmpeq +8 -> 737
    //   732: iload_0
    //   733: iconst_4
    //   734: if_icmpne +7 -> 741
    //   737: iconst_0
    //   738: putstatic 138	bo:y	Z
    //   741: return
    //
    // Exception table:
    //   from	to	target	type
    //   0	716	717	java/lang/Exception
  }

  public static void a(int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      try
      {
        H += 1;
        B.send(E);
      }
      catch (Exception localException)
      {
        H -= 1;
        localException.printStackTrace();
      }
      finally
      {
        h += 1;
      }
  }

  public static void jdMethod_int()
  {
    H = 0;
    h = 0;
  }

  public static boolean jdMethod_for()
  {
    return h >= e;
  }

  private static void a(String paramString1, String paramString2)
  {
    paramString1 = new Form(paramString1);
    paramString2 = paramString2;
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    paramString1.append(paramString2);
    paramString1.addCommand(localCommand1);
    paramString1.addCommand(localCommand2);
    paramString1.setCommandListener(new CommandListener(localCommand1, localCommand2, paramString1)
    {
      private final Command val$okCmd;
      private final Command val$exitCmd;
      private final Form val$form;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        if (paramCommand == this.val$okCmd)
          try
          {
            a5.dI.platformRequest(bo.new);
            return;
          }
          catch (Exception localException)
          {
            return;
          }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(paramString1);
  }

  public static void jdMethod_do(byte paramByte)
  {
    C = paramByte;
    (paramByte = new Thread()
    {
      public final void run()
      {
        bo.jdMethod_if(bo.C);
        a5.a(0, bo.y ? "命令已发送，请及时查收短信查看结果" : "发送失败", bm.a2[2], "", -1, -120);
      }
    }).start();
  }

  public static void jdMethod_if()
  {
    jdMethod_if(bo.C = 1);
    jdMethod_int();
    bo.3 local3;
    (local3 = new Thread()
    {
      public final void run()
      {
        bo.a(bo.e);
      }
    }).start();
    jdField_long = 2;
    as.a(0, "正在充值，请您稍候...", "", "", -2, -2);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bo
 * JD-Core Version:    0.6.0
 */
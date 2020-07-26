import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class q
{
  public static String[] f = new String[3];
  public static long n = -1L;
  private static int i = 0;
  private static boolean d;
  private static int jdField_if = 0;
  public static boolean l;
  public static byte j;
  private static byte c = -1;
  private static byte p;
  public static byte e = 10;
  public static boolean q;
  public static byte t = 0;
  public static int jdField_void = 0;
  public static long jdField_long = -1L;
  public static byte g = 0;
  public static byte a = -1;
  public static boolean h = false;
  public static boolean jdField_else = false;
  public static long s = 0L;
  public static String jdField_new = "";
  public static String jdField_try = "";
  public static byte m = 0;
  public static short[][] jdField_int = { { -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1, -1, -1 } };
  private static byte jdField_goto = 0;
  public static boolean r = false;
  public static int jdField_char = 0;
  public static boolean jdField_for = false;
  public static String[] jdField_byte;
  public static byte o;
  public static int[] u;
  public static String[] jdField_case;
  public static byte b;
  public static byte[] k;
  private static int jdField_do;

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 1703937:
      a5.fR = true;
      localac.jdField_do(l.g.jdField_new());
      b5.jdField_case("Mail.snd_Parse() C_MAIL_SEND_NORMAL...");
      break;
    case 1703938:
      a5.fR = true;
      localac.jdField_do(l.g.jdField_new());
      b5.jdField_case("Mail.snd_Parse() C_MAIL_SEND_COST...");
      break;
    case 1703939:
      a5.fR = true;
      localac.jdField_do(l.g.jdField_new());
      b5.jdField_case("Mail.snd_Parse() C_MAIL_INBOX...");
      break;
    case 1703942:
      a5.fR = true;
      localac.a(jdField_long);
      b5.jdField_case("Mail.snd_Parse() C_MAIL_INBOX_VIEW...");
      break;
    case 1703943:
      a5.fR = true;
      localac.a(jdField_long);
      b5.jdField_case("Mail.snd_Parse() C_MAIL_INBOX_DEL...");
      break;
    case 1703944:
      a5.fR = true;
      b5.jdField_case("Mail.snd_Parse() C_MAIL_INBOX_CLEAR...");
      break;
    case 1703947:
      b5.jdField_case("m_nPostage=" + e);
      a5.fR = true;
      if (!l)
        localac.a(n);
      else
        localac.a(s);
      localac.jdField_if(f[0]);
      localac.jdField_if(f[1]);
      localac.jdField_if(f[2]);
      localac.jdField_do(i);
      localac.a(d);
      b5.jdField_case("--------------------------------------m_bComeDownWith=" + d);
      localac.jdField_do(jdField_if);
      localac.a(l);
      localac.a(j);
      if (j > 0)
        for (paramInt = 0; paramInt < jdField_int.length; paramInt++)
        {
          if (jdField_int[paramInt][0] == -1)
            continue;
          c = (byte)jdField_int[paramInt][0];
          p = (byte)jdField_int[paramInt][3];
          localac.a(c);
          localac.a(p);
        }
      b5.jdField_case("Mail.snd_Parse() C_MAIL_SEND...");
      break;
    case 1703948:
      a5.fR = true;
      localac.a(a);
      am.a = false;
      b5.jdField_case("Mail.snd_Parse() C_MAIL_VIEW_GOODS...");
      break;
    case 1703949:
      a5.fR = true;
      localac.a(a);
      b5.jdField_case("Mail.snd_Parse() C_MAIL_GET_ONE...");
      break;
    case 1703951:
      a5.fR = true;
      b5.jdField_case("Mail.snd_Parse() C_MAIL_GET_MONEY...");
      break;
    case 1703950:
      a5.fR = true;
      b5.jdField_case("Mail.snd_Parse() C_MAIL_GET_ALL...");
      break;
    case 1703952:
      a5.fR = true;
      b5.jdField_case("Mail.snd_Parse() C_MAIL_RETURN...");
      break;
    case 1703954:
      a5.fR = true;
      localac.a((byte)r.mE[a5.em][0]);
      am.a = false;
      break;
    case 1703957:
      b5.jdField_case("Mail.snd_Parse() C_MAIL_BACK_MAIL...");
      break;
    case 1703946:
      a5.fR = true;
      break;
    case 1703945:
    case 1703958:
    case 1703959:
    case 1703960:
    case 1703961:
    case 1703968:
    case 1703969:
    case 1703971:
    case 1703972:
      a5.fR = true;
      break;
    case 1703956:
      a5.fR = true;
      (paramInt = new StringBuffer(4)).append("小屏幕通用版:");
      int i1 = a1.jdField_for;
      paramInt.append(String.valueOf(i1 >>> 24)).append(".");
      i1 = a1.jdField_for;
      paramInt.append(String.valueOf(i1 >>> 16 & 0xFF)).append(".");
      i1 = a1.jdField_for;
      paramInt.append(String.valueOf(i1 >>> 8 & 0xFF)).append(".");
      i1 = a1.jdField_for;
      paramInt.append(String.valueOf(i1 & 0xFF));
      ak localak = (ak)a5.es.cf().elementAt(3);
      a9 locala9 = (a9)a5.es.cf().elementAt(4);
      localac.a(o);
      localac.jdField_if(localak.as());
      localac.jdField_if(paramInt.toString());
      localac.jdField_if(locala9.cc().toString().trim());
      if (b != 5)
      {
        localac.jdField_do(0);
      }
      else
      {
        localac.jdField_do(jdField_do);
        b = 0;
      }
      break;
    case 1703970:
      a5.fR = true;
      jdField_do = u[o];
      localac.jdField_do(jdField_do);
      localac.a(b);
      if (b != 5)
        break;
      o = k[o];
      a5.eQ.a(1703971);
      break label888;
      be.cn();
    case 1703940:
    case 1703941:
    case 1703953:
    case 1703955:
    case 1703962:
    case 1703963:
    case 1703964:
    case 1703965:
    case 1703966:
    case 1703967:
    }
    label888: return localac.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2145779711:
    case -2145779710:
    case -2145779707:
      b5.jdField_case("Mail.rec_Parse() S_MAIL_RECEIVE_NORMAL or COST...");
      a5.dh = paramInt;
      a5.gb = paramac.jdField_int((paramInt = paramac).jdField_do.length - 6);
      return;
    case -2145779709:
      b5.jdField_case("Mail.rec_Parse() S_MAIL_NEW...");
      if ((paramInt = paramac.jdField_if()) == 0)
      {
        b5.jdField_case("没有新邮件！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        h = false;
        return;
      }
      if (paramInt != 1)
        break;
      b5.jdField_case("有新邮件！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
      h = true;
      return;
    case -2145779708:
      jdField_else = paramac.jdField_case();
      b5.jdField_case("Mail.rec_Parse() S_MAIL_PAY_STATE..." + (jdField_else ? "已付费" : "未付费"));
      if ((paramInt = (a9)a5.es.cf().elementAt(13)) == null)
        break;
      paramInt.a(new StringBuffer("0"));
      return;
    case -2145779693:
      jdField_void = paramac.jdField_byte();
      b5.jdField_case("-----------------------m_nBackpackMoney--------------=" + jdField_void);
    case -2145779706:
    case -2145779705:
    case -2145779704:
    case -2145779703:
    case -2145779702:
    case -2145779701:
    case -2145779700:
    case -2145779699:
    case -2145779698:
    case -2145779697:
    case -2145779696:
    case -2145779695:
    case -2145779694:
    }
  }

  public static void jdField_do()
  {
    Form localForm = new Form("编辑邮件");
    TextField localTextField1 = new TextField("请输入收件人姓名", "", 6, 0);
    TextField localTextField2 = new TextField("请输入邮件主题", "", 6, 0);
    TextField localTextField3 = new TextField("请输入邮件内容", "", 50, 0);
    localForm.append(localTextField1);
    localForm.append(localTextField2);
    localForm.append(localTextField3);
    if (f[0] != null)
      localTextField1.setString(f[0]);
    if (f[1] != null)
      localTextField2.setString(f[1]);
    if (f[2] != null)
      localTextField3.setString(f[2]);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    localForm.addCommand(localCommand1);
    localForm.addCommand(localCommand2);
    localForm.setCommandListener(new CommandListener(localCommand1, localTextField1, localTextField2, localTextField3, localForm, localCommand2)
    {
      private final Command val$okCmd;
      private final TextField val$tf;
      private final TextField val$tf1;
      private final TextField val$tf2;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = (a9)a5.es.cf().elementAt(3);
        a9 locala9 = (a9)a5.es.cf().elementAt(4);
        ak localak = (ak)a5.es.cf().elementAt(5);
        if (paramCommand == this.val$okCmd)
        {
          if ((q.t == 1) && (!q.f[0].equals(this.val$tf.getString())))
            q.n = -1L;
          q.f[0] = this.val$tf.getString();
          q.f[1] = this.val$tf1.getString();
          if (this.val$tf2.getString().equals(""))
            q.f[2] = "";
          else
            q.f[2] = this.val$tf2.getString();
          if (!a5.a(this.val$tf.getString(), 2))
          {
            paramCommand = new Alert(bm.a2[9], "您输入的玩家名称含有非法字符请重新输入", null, AlertType.ERROR);
            this.val$tf.setString("");
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            if (!q.f[0].equals(""))
              q.f[0] = "";
            q.access$002(1);
            return;
          }
          if (!a5.a(this.val$tf1.getString(), 2))
          {
            paramCommand = new Alert(bm.a2[9], "您输入的邮件主题含有非法字符请重新输入", null, AlertType.ERROR);
            this.val$tf1.setString("");
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            if (!q.f[1].equals(""))
              q.f[1] = "";
            return;
          }
          if (!a5.a(this.val$tf2.getString(), 3))
          {
            paramCommand = new Alert(bm.a2[9], "您输入的邮件内容含有非法字符请重新输入", null, AlertType.ERROR);
            this.val$tf2.setString("");
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            if (!q.f[2].equals(""))
              q.f[2] = "";
            return;
          }
          paramDisplayable.a(new StringBuffer(q.f[0]));
          locala9.a(new StringBuffer(q.f[1]));
          localak.jdMethod_if(q.f[2]);
          localak.ap();
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          if (q.goto == 1)
          {
            paramDisplayable.a(new StringBuffer(""));
            q.access$002(0);
          }
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(localForm);
  }

  public static void jdField_for()
  {
    Object localObject = (a9)a5.es.cf().elementAt(3);
    a9 locala91 = (a9)a5.es.cf().elementAt(4);
    ak localak = (ak)a5.es.cf().elementAt(5);
    a9 locala92 = (a9)a5.es.cf().elementAt(13);
    if (((((a9)localObject).cc().toString().trim().equals("")) && (locala91.cc().toString().trim().equals(""))) || (((a9)localObject).cc().toString().trim().equals("")))
    {
      as.a(0, "请填写收件人", "确定", "", -1, -2);
      return;
    }
    if (locala91.cc().toString().trim().equals(""))
    {
      as.a(0, "请填写邮件主题", "确定", "", -1, -2);
      return;
    }
    if (localak.as().equals(""))
      f[2] = "";
    if ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952))
    {
      d = false;
      i = Integer.parseInt(locala92.cc().toString().trim());
      if (jdField_void - i < e)
      {
        b5.jdField_case("m_nPostage=" + e);
        b5.jdField_case("m_nBackpackMoney=" + jdField_void);
        b5.jdField_case("m_nRemit=" + i);
        as.a(0, "您已经没有足够的金钱支付邮费了！", "确定", "", -1, -2);
        return;
      }
      try
      {
        if ((q.i = Integer.parseInt(locala92.cc().toString().trim())) >= jdField_void - e)
        {
          localObject = "";
          try
          {
            localObject = Integer.toString(i);
          }
          catch (NumberFormatException localNumberFormatException3)
          {
          }
          locala92.jdField_void((String)localObject);
          if ((i > 0) && (i >= jdField_void - e))
          {
            as.a(0, "您是否要汇出您的全部金钱？", "确定", "取消", 1703947, -1);
            return;
          }
          a5.eQ.a(1703947);
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        i = 0;
      }
    }
    else if (a5.es.g9 == 1703938)
    {
      if (j <= 0)
      {
        as.a(0, "您的付费邮件中没有物品", "确定", "", -1, -2);
        return;
      }
      if (((Integer.parseInt(locala92.cc().toString().trim()) == 0) && (j <= 0)) || (Integer.parseInt(locala92.cc().toString().trim()) == 0))
      {
        as.a(0, "请您设定收款金额", "确定", "", -1, -2);
        return;
      }
      d = true;
      try
      {
        jdField_if = Integer.parseInt(locala92.cc().toString().trim());
      }
      catch (NumberFormatException localNumberFormatException4)
      {
        NumberFormatException localNumberFormatException2;
        (localNumberFormatException2 = localNumberFormatException4).printStackTrace();
      }
    }
    a5.eQ.a(1703947);
  }

  public static void a()
  {
    a9 locala91 = (a9)a5.es.cf().elementAt(3);
    a9 locala92 = (a9)a5.es.cf().elementAt(4);
    ak localak = (ak)a5.es.cf().elementAt(5);
    a9 locala93 = (a9)a5.es.cf().elementAt(13);
    ah localah = (ah)a5.es.cf().elementAt(15);
    locala91.jdField_void("");
    locala92.jdField_void("");
    localak.jdField_if("");
    locala93.jdField_void("0");
    localah.a("10");
    for (int i1 = 0; i1 < f.length; i1++)
      f[i1] = null;
    a5.em = 0;
    t = 0;
    l = false;
    n = -1L;
    i = 0;
    d = false;
    jdField_if = 0;
    j = 0;
    c = 0;
    p = 0;
    q = false;
    m = 0;
  }

  public static void jdField_if()
  {
    Object localObject = (ah)a5.es.cf().elementAt(15);
    if (j > 0)
      e = (byte)(q ? 10 * j + 20 : 10 * j + 10);
    else
      e = q ? 20 : 10;
    try
    {
      ((ah)localObject).a(Integer.toString(e));
    }
    catch (NumberFormatException localNumberFormatException)
    {
      (localObject = localNumberFormatException).printStackTrace();
    }
    int i1;
    if ((i1 = Integer.parseInt((localObject = (a9)a5.es.cf().elementAt(13)).cc().toString().trim())) <= 0)
    {
      ((a9)localObject).a(new StringBuffer(Integer.toString(0)));
      return;
    }
    if ((i1 + e >= jdField_void) && ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952)))
    {
      if ((i1 = jdField_void - e) > 0)
      {
        ((a9)localObject).a(new StringBuffer(Integer.toString(i1)));
        return;
      }
      ((a9)localObject).a(new StringBuffer(Integer.toString(0)));
    }
  }

  public static void jdField_int()
  {
    n = -1L;
    i = 0;
    d = false;
    jdField_if = 0;
    l = false;
    j = 0;
    c = -1;
    p = 0;
    e = 0;
    q = false;
    t = 0;
    jdField_void = 0;
    jdField_long = -1L;
    g = 0;
    a = -1;
    h = false;
    jdField_else = false;
    s = 0L;
    jdField_new = "";
    jdField_try = "";
    m = 0;
    jdField_goto = 0;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     q
 * JD-Core Version:    0.6.0
 */
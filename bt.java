import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class bt
{
  static String jdField_else = "";
  static String jdField_case = "";
  static String e = "";
  static int b = 0;
  static byte jdField_long = 2;
  static byte d = 3;
  public static int f = 0;
  public static int jdField_for = 0;
  public static byte h = 0;
  public static String jdField_do = "";
  private static int[] j = null;
  private static boolean[] i = null;
  static String jdField_if = "";
  public static int g;
  public static int l;
  public static int c;

  public static byte[] jdField_do(int paramInt)
  {
    ac localac1;
    (localac1 = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 1638401:
      localac1.jdField_do(l.g.jdMethod_new());
      a5.fR = true;
      break;
    case 1638402:
      localac1.jdField_if(jdField_else);
      localac1.jdField_if(jdField_case);
      break;
    case 1638406:
    case 1638407:
      localac1.jdField_do(jdField_for);
      break;
    case 1638414:
      localac1.jdField_do(bp.em);
      break;
    case 1638404:
    case 1638417:
    case 1638419:
    case 1638420:
    case 1638445:
      a5.fR = true;
      break;
    case 1638405:
      localac1.jdField_do(f);
      break;
    case 1638409:
    case 1638410:
    case 1638411:
    case 1638412:
    case 1638415:
      localac1.jdField_do(f);
      a5.fR = true;
      break;
    case 1638408:
    case 1638413:
      break;
    case 1638403:
    case 1638416:
      a5.fR = true;
      break;
    case 1638418:
      localac1.jdField_if(e);
      a5.fR = true;
      break;
    case 1638421:
      localac1.a(h);
      a5.fR = true;
      break;
    case 1638422:
      localac1.a(h);
      paramInt = j.length;
      int m = paramInt;
      ac localac2;
      (localac2 = localac1).a((byte)m);
      for (int k = 0; k < paramInt; k++)
      {
        localac1.jdField_do(j[k]);
        localac1.a(i[k]);
      }
      j = null;
      i = null;
      break;
    case 1638423:
    case 1638425:
    case 1638426:
    case 1638427:
    case 1638428:
      a5.fR = true;
      break;
    case 1638444:
      a5.fR = true;
      localac1.jdField_do(bg.hP);
      break;
    case 1638424:
      break;
    case 1638429:
      a5.fR = true;
      localac1.jdField_do(b);
      break;
    case 1638430:
    case 1638434:
      break;
    case 1638431:
      break;
    case 1638432:
    case 1638433:
      localac1.a(a7.fF);
      break;
    case 1638446:
      a5.fR = true;
      localac1.jdField_if(jdField_if);
      break;
    case 1638449:
      localac1.jdField_do(l);
      break;
    case 1638450:
    case 1638451:
      localac1.jdField_do(g);
      localac1.jdField_do(l);
      localac1.jdField_do(c);
    case 1638435:
    case 1638436:
    case 1638437:
    case 1638438:
    case 1638439:
    case 1638440:
    case 1638441:
    case 1638442:
    case 1638443:
    case 1638447:
    case 1638448:
    }
    return localac1.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2145845247:
      bp.ag().b(paramac.jdMethod_byte());
      bp.ag().i(paramac.jdField_if());
      return;
    case -2145845246:
      a5.A();
    }
  }

  public static void jdField_for(int paramInt)
  {
    switch (paramInt)
    {
    case 0:
      paramInt = new Form("创建氏族");
      TextField localTextField1 = new TextField("请输入氏族名称", jdField_else, 6, 0);
      TextField localTextField2 = new TextField("请输入氏族简介", jdField_case, 50, 0);
      paramInt.append(localTextField1);
      paramInt.append(localTextField2);
      Command localCommand1 = new Command(bm.a2[2], 4, 0);
      Command localCommand2 = new Command(bm.a2[1], 3, 1);
      paramInt.addCommand(localCommand1);
      paramInt.addCommand(localCommand2);
      paramInt.setCommandListener(new CommandListener(localCommand1, localTextField1, localTextField2, localCommand2, paramInt)
      {
        private final Command val$okCmd;
        private final TextField val$tf1;
        private final TextField val$tf2;
        private final Command val$exitCmd;
        private final Form val$form;

        public final void commandAction(Command paramCommand, Displayable paramDisplayable)
        {
          if (paramCommand == this.val$okCmd)
          {
            bt.else = this.val$tf1.getString();
            bt.case = this.val$tf2.getString();
            this = (a9)a5.es.cf().elementAt(3);
            paramCommand = (ak)a5.es.cf().elementAt(5);
            jdMethod_void(bt.else);
            paramCommand.jdMethod_if(bt.case);
            paramCommand.ap();
            a5.dI.display.setCurrent(a5.e8);
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
      a5.dI.display.setCurrent(paramInt);
      return;
    case 1638402:
      if (jdField_else.length() > 0)
      {
        a5.eQ.a(1638402);
        jdField_else = "";
        jdField_case = "";
        a5.A();
        return;
      }
      as.a(0, "氏族名称不能为空！", "确定", "", -1, -2);
    }
  }

  public static void a(int paramInt)
  {
    switch (paramInt)
    {
    case 1638418:
      e = (paramInt = (ak)a5.es.cf().elementAt(3)).as().trim();
      paramInt = new Form("氏族公告");
      TextField localTextField = new TextField("请输入公告内容", e, 100, 0);
      paramInt.append(localTextField);
      Command localCommand1 = new Command("更新", 4, 0);
      Command localCommand2 = new Command(bm.a2[1], 3, 1);
      paramInt.addCommand(localCommand1);
      paramInt.addCommand(localCommand2);
      paramInt.setCommandListener(new CommandListener(localCommand1, localTextField, localCommand2, paramInt)
      {
        private final Command val$okCmd;
        private final TextField val$tf;
        private final Command val$exitCmd;
        private final Form val$form;

        public final void commandAction(Command paramCommand, Displayable paramDisplayable)
        {
          if (paramCommand == this.val$okCmd)
          {
            bt.e = this.val$tf.getString();
            a5.eQ.a(1638418);
            a5.dI.display.setCurrent(a5.e8);
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
      a5.dI.display.setCurrent(paramInt);
    }
  }

  public static br jdField_for()
  {
    br localbr = new br(0);
    String[] arrayOfString = { "编辑详情", "申请创建" };
    int[] arrayOfInt1 = { 0, 1638402 };
    int[] arrayOfInt2 = { 3, 3 };
    localbr.a(arrayOfString, arrayOfInt1, arrayOfInt2);
    return localbr;
  }

  public static br jdMethod_new()
  {
    br localbr = new br(0);
    String[] arrayOfString = { "更新公告" };
    int[] arrayOfInt1 = { 1638418 };
    int[] arrayOfInt2 = { 3 };
    localbr.a(arrayOfString, arrayOfInt1, arrayOfInt2);
    return localbr;
  }

  public static br jdField_if()
  {
    br localbr = new br(0);
    String[] arrayOfString = { "管理权限" };
    int[] arrayOfInt1 = { 1638420 };
    int[] arrayOfInt2 = { 2 };
    localbr.a(arrayOfString, arrayOfInt1, arrayOfInt2);
    return localbr;
  }

  public static void jdField_if(int paramInt)
  {
    String str = "";
    switch (paramInt)
    {
    case 1638410:
      str = "是否将族长禅让给此人？";
      break;
    case 1638409:
      str = "是否开除此人？";
      break;
    case 1638413:
      str = "是否退出氏族？";
      break;
    case 1638408:
      str = "是否解散氏族？";
      break;
    case 1638416:
      str = "是否卸任氏族内的职务?";
    case 1638411:
    case 1638412:
    case 1638414:
    case 1638415:
    }
    as.a(0, str, "是", "否", paramInt, -1);
  }

  public static void a()
  {
    bg localbg;
    int k;
    j = new int[k = (localbg = (bg)(bg)a5.es.cf().elementAt(3)).cD().size()];
    i = new boolean[k];
    for (int m = 0; m < k; m++)
    {
      Object localObject = (v)localbg.cD().elementAt(m);
      j[m] = ((v)localObject).jdField_new;
      localObject = (ah)(localObject = localObject).jdField_if.elementAt(2);
      i[m] = (((ah)localObject).aj() == "有" ? 1 : false);
    }
    a5.eQ.a(1638422);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bt
 * JD-Core Version:    0.6.0
 */
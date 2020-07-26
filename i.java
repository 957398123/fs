import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class i
{
  static String jdField_goto = "";
  static String jdField_int = "";
  static String jdField_case = "";
  static String jdField_if = "";
  private static int jdField_try = -1;
  static byte jdField_char = 1;
  static byte jdField_void = 2;
  static byte jdField_for = 3;
  public static int jdField_long = 0;
  public static int jdField_do = 0;

  public static byte[] jdField_do(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 1835009:
      localac.jdField_do(l.g.jdMethod_new());
      a5.fR = true;
      break;
    case 1835010:
      localac.jdField_if(jdField_goto);
      localac.jdField_if(jdField_int);
      break;
    case 1835014:
    case 1835015:
      localac.jdField_do(jdField_do);
      break;
    case 1835032:
      localac.jdField_do(bp.em);
      break;
    case 1835012:
    case 1835027:
      a5.fR = true;
      break;
    case 1835013:
      localac.jdField_do(jdField_long);
      break;
    case 1835017:
    case 1835028:
    case 1835029:
      localac.jdField_do(bv.jI);
      a5.fR = true;
      break;
    case 1835035:
      localac.jdField_do(jdField_long);
      break;
    case 1835030:
    case 1835031:
    case 1835034:
      a5.fR = true;
      break;
    case 1835018:
      localac.jdField_do(jdField_long);
      localac.jdField_do(bv.jI);
      a5.fR = true;
      break;
    case 1835019:
      localac.jdField_do(bv.jI);
      a5.fR = true;
      break;
    case 1835016:
    case 1835020:
      break;
    case 1835011:
      a5.fR = true;
      break;
    case 1835021:
      a5.fR = true;
      break;
    case 1835022:
      localac.jdField_do(bv.jI);
      a5.fR = true;
      break;
    case 1835025:
      localac.jdField_do(bv.jI);
      localac.a(bv.le);
      a5.fR = true;
      break;
    case 1835026:
      localac.jdField_do(bv.jI);
      localac.a(bv.le);
      break;
    case 1835023:
      localac.jdField_if(jdField_case);
      localac.jdField_if(jdField_if);
      jdField_case = "";
      jdField_if = "";
      break;
    case 1835024:
      localac.jdField_do(jdField_try);
      localac.a(bv.le);
      localac.jdField_if(jdField_case);
      localac.jdField_if(jdField_if);
      jdField_case = "";
      jdField_if = "";
    case 1835033:
    }
    return localac.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2145648639:
      bp.ag().d(paramac.jdMethod_byte());
      bp.ag().h(paramac.jdField_if());
      return;
    case -2145648638:
      a5.A();
      return;
    case -2145648637:
      jdField_try = paramac.jdMethod_byte();
      a(1835024, paramac.jdField_goto(), paramac.jdField_goto());
    }
  }

  public static void a(int paramInt, String paramString1, String paramString2)
  {
    Form localForm = new Form("公告详情");
    paramString1 = new TextField("请输入公告标题", paramString1, 6, 0);
    paramString2 = new TextField("请输入公告内容", paramString2, 30, 0);
    localForm.append(paramString1);
    localForm.append(paramString2);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    localForm.addCommand(localCommand1);
    localForm.addCommand(localCommand2);
    localForm.setCommandListener(new CommandListener(localCommand1, paramString1, paramString2, paramInt, localCommand2, localForm)
    {
      private final Command val$okCmd;
      private final TextField val$tf1;
      private final TextField val$tf2;
      private final int val$cmds;
      private final Command val$exitCmd;
      private final Form val$form;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        if (paramCommand == this.val$okCmd)
        {
          i.case = this.val$tf1.getString();
          i.if = this.val$tf2.getString();
          a5.eQ.a(this.val$cmds);
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
    a5.dI.display.setCurrent(localForm);
  }

  public static void a(int paramInt)
  {
    switch (paramInt)
    {
    case 0:
      paramInt = new Form("创建诸侯");
      TextField localTextField1 = new TextField("请输入诸侯名称", jdField_goto, 6, 0);
      TextField localTextField2 = new TextField("请输入诸侯简介", jdField_int, 50, 0);
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
            i.goto = this.val$tf1.getString();
            i.int = this.val$tf2.getString();
            this = (a9)a5.es.cf().elementAt(3);
            paramCommand = (ak)a5.es.cf().elementAt(5);
            jdMethod_void(i.goto);
            paramCommand.jdMethod_if(i.int);
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
    case 1835010:
      if (jdField_goto.length() > 0)
      {
        a5.eQ.a(1835010);
        jdField_goto = "";
        jdField_int = "";
        a5.A();
        return;
      }
      as.a(0, "诸侯名称不能为空！", "确定", "", -1, -2);
    }
  }

  public static br a()
  {
    br localbr = new br(0);
    String[] arrayOfString = { "编辑详情", "申请创建" };
    int[] arrayOfInt1 = { 0, 1835010 };
    int[] arrayOfInt2 = { 3, 3 };
    localbr.a(arrayOfString, arrayOfInt1, arrayOfInt2);
    return localbr;
  }

  public static void jdField_if(int paramInt)
  {
    String str = "";
    switch (paramInt)
    {
    case 1835035:
      str = "是否将侯主禅让给此人？";
      break;
    case 1835017:
      str = "是否开除此氏族？";
      break;
    case 1835020:
      str = "是否退出诸侯？";
      break;
    case 1835016:
      str = "是否解散诸侯？";
      break;
    case 1835034:
      str = "是否卸任诸侯内的职务?";
    }
    as.a(0, str, "是", "否", paramInt, -1);
  }
}
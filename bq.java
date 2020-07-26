import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.midlet.MIDlet;

public final class bq
  implements CommandListener
{
  private static bq jdField_new = null;
  private static byte jdField_try;
  private static a a;
  private static Form jdField_for;
  private static Command jdField_case = new Command("确定", 4, 0);
  private static Command jdField_int = new Command("退出", 3, 1);
  private static Command jdField_if = new Command("返回", 2, 1);
  public static String jdField_byte = "";

  public final void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    if (paramCommand == jdField_case)
      try
      {
        if (jdField_try == 0)
        {
          if (a5.e8.g0 == 1)
            a.platformRequest(jdField_byte);
          else
            a.platformRequest(a1.jdField_new);
          a.destroyApp(true);
        }
      }
      catch (Exception localException1)
      {
      }
    else if (paramCommand == jdField_if)
      try
      {
        if ((jdField_try == 0) || (jdField_try == 9))
        {
          a.display.setCurrent(a5.e8);
          a5.jdMethod_do(4);
          jdField_for = null;
        }
      }
      catch (Exception localException2)
      {
      }
    else if (paramCommand == jdField_int)
      a.destroyApp(true);
    a1.jdField_new = null;
  }

  public static void a(a parama, byte paramByte)
  {
    String str;
    if ((bq.jdField_try = 0) == 0)
    {
      paramByte = "新版客户端下载";
      str = "点击“确定”下载新的客户端，点击“返回”返回游戏。";
    }
    else if (jdField_try == 1)
    {
      paramByte = "内测号注册";
      str = "点击“确定”注册内测帐号，点击“返回”返回游戏。";
    }
    else if (jdField_try == 2)
    {
      paramByte = "明细查询";
      str = "点击“确定”转到查询明细网页，点击“返回”返回游戏";
    }
    else if (jdField_try == 3)
    {
      paramByte = "天劫论坛";
      str = "点击“确定”转到天劫论坛网页，点击“返回”返回游戏";
    }
    else if (jdField_try == 4)
    {
      paramByte = "大额充值";
      str = "点击“确定”转到大额充值网页，点击“返回”返回游戏";
    }
    else if (jdField_try == 5)
    {
      paramByte = "骏网一卡通充值";
      str = "点击“确定”转到骏网一卡通充值网页，点击“返回”返回游戏";
    }
    else if (jdField_try == 6)
    {
      paramByte = "当乐平台";
      str = "更多精彩游戏尽在当乐网D.cn";
    }
    else if (jdField_try == 7)
    {
      paramByte = "天劫论坛";
      str = "点击“确定”转到天劫论坛网页，点击“退出”退出游戏";
    }
    else if (jdField_try == 8)
    {
      paramByte = "我的积分";
      str = "点击“确定”转到我的积分网页，点击“返回”返回游戏";
    }
    else if (jdField_try == 9)
    {
      paramByte = "搜狐游戏中心";
      str = "点击“确定”转到搜狐游戏中心，点击“返回”返回游戏";
    }
    else
    {
      paramByte = "未知类型";
      str = "";
    }
    try
    {
      a = parama;
      (bq.jdField_for = new Form(paramByte)).deleteAll();
      jdField_for.append(str);
      jdField_for.addCommand(jdField_case);
      if ((jdField_try == 1) || (jdField_try == 6) || (jdField_try == 7))
        jdField_for.addCommand(jdField_int);
      else
        jdField_for.addCommand(jdField_if);
      if (jdField_new == null)
        jdField_new = new bq();
      jdField_for.setCommandListener(jdField_new);
      a.display.setCurrent(jdField_for);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bq
 * JD-Core Version:    0.6.0
 */
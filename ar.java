import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class ar
{
  public static void a(String paramString1, String paramString2, int paramInt)
  {
    paramString1 = new Form(paramString1);
    paramString2 = new TextField(paramString2, "", 6, 0);
    paramString1.append(paramString2);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    paramString1.addCommand(localCommand1);
    paramString1.addCommand(localCommand2);
    paramString1.setCommandListener(new CommandListener(localCommand1, paramString2, paramString1, paramInt, localCommand2)
    {
      private final Command val$okCmd;
      private final TextField val$tf;
      private final Form val$form;
      private final int val$commID;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        if (paramCommand == this.val$okCmd)
        {
          if (((b1.lN = this.val$tf.getString()) != null) && (!b1.lN.equals("")))
          {
            for (paramCommand = 0; paramCommand < this.val$tf.getString().length(); paramCommand++)
            {
              if (a5.a(this.val$tf.getString(), 2))
                continue;
              paramCommand = new Alert(bm.a2[9], "您输入的玩家昵称含有非法字符请重新输入", null, AlertType.ERROR);
              this.val$tf.setString("");
              b1.lN = "";
              a5.dI.display.setCurrent(paramCommand, this.val$form);
              return;
            }
            a5.eQ.a(this.val$commID);
            a5.e8.setFullScreenMode(true);
            a5.dI.display.setCurrent(a5.e8);
            return;
          }
          paramCommand = new Alert(bm.a2[9], "玩家名称不能为空", null, AlertType.ERROR);
          a5.dI.display.setCurrent(paramCommand, this.val$form);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(paramString1);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     ar
 * JD-Core Version:    0.6.0
 */
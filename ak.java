import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

public final class ak extends ba
{
  private byte br = 0;
  private byte bz = 0;
  private String bk = null;
  private String[] bV = null;
  private short bg = 0;
  private short bx = 0;
  private short bo = 0;
  private Font bm = null;
  private af bj = null;
  private short bi = 0;
  private short bh = 0;
  private short bl = 0;
  private short bq = 0;
  private int bD = -1;
  public boolean bv = false;
  private short bR = 3;
  private short bc = 1;
  public byte bQ = -1;
  private String bt = "";
  public static byte bP;
  public static byte bJ;
  public static long bu;
  private static String bG;
  private byte[][] bN;

  public ak(short paramShort1, short paramShort2, short paramShort3, short paramShort4, be parambe)
  {
    super(paramShort1, paramShort2, paramShort3, paramShort4, parambe);
    this.b = true;
    this.bm = a5.fq;
    this.bj = new af(this.k, this.j, this.a, this.jdField_int, 0, true, parambe);
    paramShort1 = 0;
    this = this;
    this.br = paramShort1;
  }

  public final boolean b()
  {
    ak localak = this;
    if (this.bj != null)
    {
      localak = this;
      if (this.bj.b())
        return true;
    }
    return false;
  }

  public final void f()
  {
    Object localObject7;
    if (this.jdField_byte)
    {
      if (y() == null)
        return;
      if (a5.jdMethod_try(4096))
      {
        y().c8();
        return;
      }
      if (a5.jdMethod_try(8192))
      {
        y().c9();
        return;
      }
      if ((a5.jdMethod_byte(65536)) || (a5.jdMethod_byte(131072)))
        y().dc();
      int i;
      switch (a5.es.g9)
      {
      case 1703937:
      case 1703938:
      case 1703952:
        switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
        {
        case -1610612709:
          q.jdMethod_do();
          break;
        case -1610612711:
          q.jdMethod_for();
        }
        this.jdField_byte = false;
        return;
      case 1638426:
        switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
        {
        case 1638428:
          a5.eQ.a(i);
        }
        this.jdField_byte = false;
        return;
      case 1638401:
        bt.jdMethod_for(i = ((Integer)y().db().elementAt(y().de())).intValue());
        this.jdField_byte = false;
        return;
      case 1638417:
        bt.a(i = ((Integer)y().db().elementAt(y().de())).intValue());
        this.jdField_byte = false;
        return;
      case 1638419:
        switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
        {
        case 1638420:
          a5.eQ.a(i);
        }
        this.jdField_byte = false;
        return;
      case 720913:
        a5.eQ.a(720911);
        be.cn();
        return;
      case 458753:
        if ((i = ((Integer)y().db().elementAt(y().de())).intValue()) == 1966081)
        {
          au.if = 1;
          au.int = r.mv;
        }
        a5.eQ.a(i);
        this.jdField_byte = false;
        return;
      case 917507:
        if (au.a != 1)
          break;
        au.int = a7.fF;
        i = ((Integer)y().db().elementAt(y().de())).intValue();
        a5.eQ.a(i);
        this.jdField_byte = false;
        return;
      case 1835009:
        i.a(i = ((Integer)y().db().elementAt(y().de())).intValue());
        this.jdField_byte = false;
        return;
      case 1835027:
        switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
        {
        case 1835031:
          a5.eQ.a(i);
          break;
        case 1835034:
          i.jdMethod_if(i);
        }
        this.jdField_byte = false;
        return;
      case 1441805:
        switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
        {
        case 589831:
          bg.hP = bp.ag().an();
          a5.eQ.a(i);
          break;
        case -1610612726:
          a3.a(bp.ag().an(), bp.ag().ah(), true);
          break;
        case 1441808:
          a5.A();
          a5.aj();
          a5.eQ.a(i);
          break;
        case 720897:
          bu.k = bp.ag().an();
          a5.eQ.a(i);
          break;
        case 1441804:
          as.a(0, "真的要解除伴侣吗！", "确定", "取消", 1441804, -1);
        }
        this.jdField_byte = false;
        return;
      case 1703971:
        switch (i = ((Integer)y().db().elementAt(y().de())).intValue())
        {
        case -1610612698:
          an();
          break;
        case 1703956:
          if ((bG != null) && (!bG.equals("")))
          {
            localObject7 = this;
            if (this.bk != null)
            {
              localObject7 = this;
              if (!this.bk.equals(""))
              {
                localObject7 = this;
                if ((bG.equals(this.bk)) && (q.b != 5))
                {
                  as.a(0, "请您不要发送相同的内容！", "确定", "", -1, -2);
                  this.jdField_byte = false;
                  return;
                }
              }
            }
          }
          localObject7 = this;
          if (!bG.equals(this.bk))
          {
            localObject7 = this;
            bG = this.bk;
          }
          a5.eQ.a(1703956);
        }
        this.jdField_byte = false;
        return;
      case 196641:
        l.goto = (byte)(y().de() + 1);
        i = ((Integer)y().db().elementAt(y().de())).intValue();
        a5.eQ.a(i);
        this.bv = false;
        this.jdField_byte = false;
        return;
      default:
        if (this.bQ == 1)
          break;
        if ((i = ((Integer)y().db().elementAt(y().de())).intValue()) == -1)
        {
          this.jdField_byte = false;
          break;
        }
        this.jdField_byte = false;
        a5.eQ.a(i);
        return;
        if (!a5.jdMethod_byte(262144))
          break;
        this.jdField_byte = false;
        return;
      }
    }
    else
    {
      Object localObject3;
      if ((a5.jdMethod_byte(131072)) || (a5.jdMethod_byte(65536)))
      {
        br localbr;
        Object localObject4;
        Object localObject5;
        if (this.bQ != 1)
        {
          localbr = new br(0);
          if (this.bQ != 0)
            if (this.bQ == 2)
            {
              switch (a5.es.g9)
              {
              case 262154:
                if (!bv.jP)
                  break;
                br.dk();
                a5.eQ.a(262149);
                break;
              case 262157:
                if (!bv.jp)
                  break;
                if (bf.for)
                  br.c6();
                a5.eQ.a(262188);
                break;
              case 262178:
                localObject3 = new String[] { "刷　新" };
                localObject4 = new int[] { 262179 };
                localObject5 = new int[] { 0 };
                localbr.a(localObject3, localObject4, localObject5);
              }
            }
            else if (this.bQ == 6)
            {
              localObject3 = new String[] { "重　置", "查看报酬" };
              localObject4 = new int[] { 262173, 262175 };
              localObject5 = new int[] { 0, 2 };
              localbr.a(localObject3, localObject4, localObject5);
            }
            else if (this.bQ != 7)
            {
              if (this.bQ == 8)
              {
                localObject3 = new String[] { "接受任务" };
                localObject4 = new int[] { 262180 };
                localObject5 = new int[] { 0 };
                localbr.a(localObject3, localObject4, localObject5);
              }
              else if (this.bQ == 10)
              {
                a5.eQ.a(2162696);
              }
              else if (this.bQ == 11)
              {
                a5.eQ.a(2162709);
              }
              else if (this.bQ == 12)
              {
                a5.eQ.a(2162720);
              }
              else if (this.bQ == 13)
              {
                a5.eQ.a(2162731);
              }
              else if (this.bQ == 14)
              {
                a5.eQ.a(2162740);
              }
              else if (this.bQ == 15)
              {
                a5.eQ.a(2162748);
              }
              else if (this.bQ == 16)
              {
                a5.eQ.a(2162761);
              }
              else if (this.bQ == 17)
              {
                a5.eQ.a(2162768);
              }
              else if (this.bQ == 18)
              {
                a5.eQ.a(2162775);
              }
              else if (this.bQ == 19)
              {
                a5.eQ.a(2162782);
              }
            }
          if (localbr.dj().size() > 0)
          {
            a(localbr);
            this.jdField_byte = true;
            if (y() != null)
              y().da();
          }
        }
        Object localObject1;
        Object localObject6;
        switch (a5.es.g9)
        {
        case 1703937:
        case 1703938:
        case 1703952:
          localbr = new br(0);
          localObject3 = new int[] { -1610612709, -1610612711 };
          localObject4 = new int[] { 3, 3 };
          localbr.a(bm.cb, localObject3, localObject4);
          a(localbr);
          y().da();
          this.jdField_byte = true;
          break;
        case 1703940:
        case 1703941:
          if (this.jdField_byte)
          {
            if (a5.jdMethod_try(4096))
            {
              y().c8();
            }
            else if (a5.jdMethod_try(8192))
            {
              y().c9();
            }
            else if (a5.jdMethod_byte(262144))
            {
              this.jdField_byte = false;
            }
            else
            {
              if ((!a5.jdMethod_byte(131072)) && (!a5.jdMethod_byte(65536)))
                break;
              int j;
              if ((j = ((Integer)y().db().elementAt(y().de())).intValue()) == 1703952)
              {
                q.l = true;
                a5.eQ.a(j);
                this.jdField_byte = false;
              }
              else if (j != -1)
              {
                a5.eQ.a(j);
                this.jdField_byte = false;
              }
            }
          }
          else
          {
            if ((!a5.jdMethod_byte(131072)) && (!a5.jdMethod_byte(65536)))
              break;
            if (a5.es.g9 == 1703940)
            {
              localObject1 = new br(0);
              if (q.char > 0)
                ((br)localObject1).a("接收金钱", 1703951, 3);
              if ((q.for) || (q.char > 0))
                ((br)localObject1).a("接收所有", 1703950, 3);
              if (q.r)
                ((br)localObject1).a("回复邮件", 1703952, 2);
              if (((br)localObject1).dj().size() > 0)
              {
                a((br)localObject1);
                y().da();
                this.jdField_byte = true;
              }
            }
            else
            {
              if (a5.es.g9 != 1703941)
                break;
              localObject1 = new br(0);
              if (q.else)
              {
                if ((q.for) || (q.char > 0))
                  ((br)localObject1).a("接收所有", 1703950, 3);
                if (q.r)
                  ((br)localObject1).a("回复邮件", 1703952, 2);
              }
              else
              {
                ((br)localObject1).a("付　款", 1703953, 3);
                ((br)localObject1).a("退　信", 1703957, 0);
                if (q.r)
                  ((br)localObject1).a("回复邮件", 1703952, 2);
              }
              if (((br)localObject1).dj().size() > 0)
              {
                a((br)localObject1);
                y().da();
                this.jdField_byte = true;
              }
            }
          }
          break;
        case 1638426:
          localObject1 = new br(0);
          localObject3 = new String[] { "上交详情" };
          localObject4 = new int[] { 1638428 };
          localObject5 = new int[] { 2 };
          ((br)localObject1).a(localObject3, localObject4, localObject5);
          a((br)localObject1);
          this.jdField_byte = true;
          break;
        case 1638401:
          a(bt.jdMethod_for());
          this.jdField_byte = true;
          break;
        case 1638417:
          a(bt.jdMethod_new());
          this.jdField_byte = true;
          break;
        case 1638419:
          if ((bp.ag().aT() != bt.d) && (bp.ag().aT() != bt.long))
            break;
          a(bt.jdMethod_if());
          this.jdField_byte = true;
          break;
        case 1835009:
          a(i.a());
          this.jdField_byte = true;
          break;
        case 1835027:
          b5.jdMethod_case("Player.getInstance().getKingRight()" + bp.ag().as());
          if (bp.ag().as() == i.for)
          {
            localObject1 = new br(0);
            localObject3 = new String[] { "变更职位" };
            localObject4 = new int[] { 1835031 };
            localObject5 = new int[] { 1 };
            ((br)localObject1).a(localObject3, localObject4, localObject5);
            a((br)localObject1);
            y().da();
            this.jdField_byte = true;
          }
          else
          {
            if (bp.ag().as() == i.char)
              break;
            localObject1 = new br(0);
            localObject3 = new String[] { "卸任职位" };
            localObject4 = new int[] { 1835034 };
            localObject5 = new int[] { 3 };
            ((br)localObject1).a(localObject3, localObject4, localObject5);
            a((br)localObject1);
            y().da();
            this.jdField_byte = true;
          }
          break;
        case 1441805:
          if (bp.ag().aR() == 0)
            break;
          localObject1 = new br(0);
          localObject3 = new String[0];
          localObject4 = new int[0];
          localObject5 = new int[0];
          localObject6 = new String[] { "查看详情", "私聊 ", "传送" };
          localObject7 = new int[] { 589831, -1610612726, 1441808 };
          int[] arrayOfInt = { 2, 2, 3 };
          if ((bu.e == 0) || (bu.h == bp.ag().jdMethod_new()))
          {
            localObject6 = b5.a(localObject6, localObject6.length, "组队邀请");
            localObject7 = b5.a(localObject7, localObject7.length, 720897);
            arrayOfInt = b5.a(arrayOfInt, arrayOfInt.length, 2);
          }
          if (bp.ag().aR() == 1)
          {
            localObject6 = b5.a(localObject6, localObject6.length, "解除伴侣");
            localObject7 = b5.a(localObject7, localObject7.length, 1441804);
            arrayOfInt = b5.a(arrayOfInt, arrayOfInt.length, 3);
          }
          localObject3 = b5.a(localObject3, 0, localObject6);
          localObject4 = b5.a(localObject4, 0, localObject7);
          localObject5 = b5.a(localObject5, 0, arrayOfInt);
          ((br)localObject1).a(localObject3, localObject4, localObject5);
          a((br)localObject1);
          y().da();
          this.jdField_byte = true;
          break;
        case 720913:
          a5.eQ.a(720911);
          be.cn();
          break;
        case 458753:
          if ((q.m == 1) || (bw.do == 1))
            return;
          if ((r.m3 / 10000 < 101) || (r.m3 / 10000 > 120) || (au.a != 1))
            break;
          localObject1 = new br(0);
          localObject3 = new String[] { "宝石镶嵌" };
          localObject4 = new int[] { 1966081 };
          localObject5 = new int[] { 2 };
          ((br)localObject1).a(localObject3, localObject4, localObject5);
          a((br)localObject1);
          y().da();
          this.jdField_byte = true;
          break;
        case 917507:
          if (au.a != 1)
            break;
          localObject1 = new br(0);
          localObject3 = new String[] { "宝石镶嵌" };
          localObject4 = new int[] { 1966081 };
          localObject5 = new int[] { 2 };
          ((br)localObject1).a(localObject3, localObject4, localObject5);
          a((br)localObject1);
          y().da();
          this.jdField_byte = true;
          break;
        case 720915:
          b5.jdMethod_case("CommandList.C_TEAM_EQUIP_VIEW_HEADER://队长查看分配");
          a5.eQ.a(720916);
          break;
        case 851975:
          be.cn();
          break;
        case 1703971:
          localObject7 = this;
          if (this.bk.toString().trim().equals(""))
          {
            an();
          }
          else
          {
            localObject1 = new br(0);
            localObject3 = new String[] { "修改", "发送" };
            localObject4 = new int[] { -1610612698, 1703956 };
            localObject5 = new int[] { 3, 3 };
            ((br)localObject1).a(localObject3, localObject4, localObject5);
            a((br)localObject1);
            y().da();
            this.jdField_byte = true;
          }
          break;
        case 1703969:
          if (!q())
            break;
          localObject7 = this;
          if (this.bk.equals(""))
            break;
          localObject7 = this;
          if (this.bk == null)
            break;
          q.o = (localObject1 = (bv)a5.es.cf().elementAt(4)).la;
          a5.eQ.a(1703972);
          break;
        case 2555906:
          if ((!q()) || (az.h != 0))
            break;
          localObject1 = new Form("农场宣言");
          localObject3 = new Command(bm.a2[2], 4, 0);
          localObject4 = new Command(bm.a2[1], 3, 1);
          localObject5 = new TextField("请您输入内容", "", 100, 0);
          ((Displayable)localObject1).addCommand((Command)localObject3);
          ((Displayable)localObject1).addCommand((Command)localObject4);
          ((Form)localObject1).append((Item)localObject5);
          if (((localObject7 = localObject6 = (ak)a5.es.cf().elementAt(15)).bk != null) && (!(localObject7 = localObject6).bk.equals("")))
            ((TextField)localObject5).setString((localObject7 = localObject6).bk);
          ((Displayable)localObject1).setCommandListener(new CommandListener((TextField)localObject5, (Form)localObject1, (Command)localObject4)
          {
            private final Command val$okCmd;
            private final TextField val$tf;
            private final Form val$form;
            private final Command val$exitCmd;

            public final void commandAction(Command paramCommand, Displayable paramDisplayable)
            {
              if (paramCommand == this.val$okCmd)
              {
                if (!a5.a(this.val$tf.getString(), 3))
                {
                  paramCommand = new Alert(bm.a2[9], "您输入的内容含有非法字符，请您重新输入！", null, AlertType.ERROR);
                  a5.dI.display.setCurrent(paramCommand, this.val$form);
                  return;
                }
                (paramCommand = (ak)a5.es.cf().elementAt(15)).jdMethod_if(this.val$tf.getString());
                if ((this.val$tf.getString().equals("")) || (this.val$tf.getString() == null))
                  az.try = "";
                else
                  az.try = this.val$tf.getString();
                a5.eQ.a(2555920);
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
          a5.dI.display.setCurrent((Displayable)localObject1);
          break;
        case 196641:
          localObject1 = new br(0);
          localObject3 = new int[] { 196642, 196642, 196642 };
          localObject4 = new int[] { 3, 3, 3 };
          localObject5 = new String[] { "天人排名", "修罗排名", "总排名" };
          ((br)localObject1).a(localObject5, localObject3, localObject4);
          a((br)localObject1);
          y().da();
          this.jdField_byte = true;
        }
        if (a5.jdMethod_else() == 27)
          a5.jdMethod_do(a5.jdMethod_case());
      }
      else
      {
        short s;
        if (a5.jdMethod_try(4096))
        {
          if (!au())
            return;
          if (this.bo <= 0)
            this.bo = 0;
          else
            this.bo = (short)(this.bo - 1);
          localObject7 = this;
          s = this.bo;
          (localObject7 = this.bj).aj = s;
        }
        else if (a5.jdMethod_try(8192))
        {
          if (!au())
            return;
          b5.jdMethod_case("----------in UITextArea down--------------");
          if (this.bo >= this.bg - this.bx)
            this.bo = (short)(this.bg - this.bx);
          else
            this.bo = (short)(this.bo + 1);
          localObject7 = this;
          s = this.bo;
          (localObject7 = this.bj).aj = s;
        }
        else if (a5.jdMethod_byte(2048))
        {
          Object localObject2 = this;
          switch (this.br)
          {
          case 1:
            if ((localObject2 = (r)a5.es.cf().elementAt(3)) == null)
              break;
            a(false, a5.es);
            ((ba)localObject2).a(true, a5.es);
            break;
          case 2:
            localObject3 = (bv)a5.es.cf().elementAt(4);
            if (!q())
              break;
            a(false, a5.es);
            ((ba)localObject3).a(true, a5.es);
          }
        }
      }
      localObject7 = this;
      if (this.bj != null)
      {
        localObject7 = this;
        this.bj.a(this.bo, false);
      }
    }
  }

  public final void a(Graphics paramGraphics)
  {
    paramGraphics.setColor(bm.try);
    paramGraphics.fillRect(this.k, this.j, this.a, this.jdField_int);
    switch (this.bz)
    {
    case 0:
      break;
    case 1:
      paramGraphics.setColor(bm.try);
      paramGraphics.fillRect(this.k + 1, this.j + 1, this.a - 2, this.jdField_int - 2);
      paramGraphics.setColor(bm.dt);
      paramGraphics.drawRect(this.k, this.j, this.a - 1, this.jdField_int - 1);
      break;
    case 2:
      paramGraphics.setColor(bm.dt);
      paramGraphics.drawRect(this.k, this.j, this.a - 1, this.jdField_int - 1);
      paramGraphics.fillRect(this.k, this.j, this.bR, this.jdField_int);
      paramGraphics.fillRect(this.k + this.a - this.bR, this.j, this.bR, this.jdField_int);
      paramGraphics.drawRect(this.k + this.bR + 1, this.j + this.bc + 1, this.a - 2 * (this.bR + 1) - 1, this.jdField_int - 2 * (this.bc + 1) - 1);
    }
    Graphics localGraphics = paramGraphics;
    ak localak = this;
    if (this.bV != null)
    {
      switch (localak.bz)
      {
      case 0:
        localak.bi = localak.k;
        localak.bh = localak.j;
        localak.bl = localak.a;
        localak.bq = localak.jdField_int;
        break;
      case 1:
        localak.bi = (short)(localak.k + 1);
        localak.bh = (short)(localak.j + 1);
        localak.bl = (short)(localak.a - 2);
        localak.bq = (short)(localak.jdField_int - 2);
        break;
      case 2:
        localak.bi = (short)(localak.k + localak.bR + 1 + 1);
        localak.bh = (short)(localak.j + localak.bc + 1 + 1);
        localak.bl = (short)(localak.a - 2 * (localak.bR + 1 + 1));
        localak.bq = (short)(localak.jdField_int - 2 * (localak.bc + 1 + 1));
      }
      int i = 0;
      if ((i = localak.bV.length) > localak.bx)
        i = localak.bo + localak.bx;
      int j = localak.bo;
      for (int k = 0; j < i; k++)
      {
        int m = 0;
        char[] arrayOfChar = localak.bV[j].toCharArray();
        StringBuffer localStringBuffer;
        for (int i1 = 0; i1 < arrayOfChar.length; localStringBuffer++)
        {
          Object localObject;
          if (localak.bN[j][i1] == 0)
          {
            localGraphics.setColor(bm.dt);
          }
          else
          {
            if ((localObject = localak).bD == -1)
              ((ak)localObject).bD = bm.F;
            localGraphics.setColor(((ak)localObject).bD);
          }
          int n;
          if (arrayOfChar[i1] == 'ε')
          {
            n = localak.bh + 3 + k * (a5.iG + 1);
            m = localak.bi + m + 4 + 1;
            localObject = localGraphics;
            (localStringBuffer = new StringBuffer()).append(bP).append(":").append(bJ);
            if ((bP == 0) && (bJ == 0))
              ((Graphics)localObject).setColor(16711680);
            else
              ((Graphics)localObject).setColor(bm.dt);
            ((Graphics)localObject).drawString(localStringBuffer.toString(), m, n, 20);
            break;
          }
          localGraphics.drawChar(n[localStringBuffer], localak.bi + m + 4 + 1, localak.bh + 3 + k * (a5.iG + 1), 20);
          m += localak.bm.charWidth(n[localStringBuffer]);
        }
        j++;
      }
      if (a5.jdMethod_else() == 18)
      {
        ay localay = (ay)a5.es.cf().elementAt(7);
        if ((a5.ht % 50 == 1) && (!localay.q()))
          if (localak.bo >= localak.bg - localak.bx)
          {
            localak.bo = 0;
          }
          else
          {
            ak tmp845_844 = localak;
            tmp845_844.bo = (short)(tmp845_844.bo + 1);
          }
      }
    }
    if ((this.bj != null) && (au()) && (a5.jdMethod_else() != 18))
      this.bj.a(paramGraphics);
    if (a5.es != null)
      if (q())
      {
        if ((a5.jdMethod_else() == 8) || (a5.es.g9 == 1703937) || (a5.es.g9 == 1703938) || (a5.es.g9 == 1703940) || (a5.es.g9 == 1703941) || (a5.es.g9 == 262147) || (a5.es.g9 == 1703952) || (a5.es.g9 == 262176) || (a5.es.g9 == 393230) || (a5.es.g9 == 262157) || (a5.es.g9 == 262154) || (a5.es.g9 == 458754) || (a5.es.g9 == 458775) || (a5.es.g9 == 262178) || (a5.es.g9 == 2293874) || (a5.es.g9 == 1703969) || (a5.es.g9 == 2490385) || (a5.es.g9 == 262188) || (a5.es.g9 == 2555906) || (a5.es.g9 == 2621443) || (a5.es.g9 == 2621442) || (a5.es.g9 == 2621446) || (a5.es.g9 == -1610612632))
        {
          b5.jdMethod_int(paramGraphics, this.k, this.j, this.a, this.jdField_int);
          return;
        }
      }
      else if ((a5.es != null) && (a5.es.g9 == 393230))
        az();
  }

  public final String as()
  {
    return this.bk;
  }

  public final void jdMethod_if(String paramString)
  {
    this.bk = paramString;
    if (this.bk == null)
      this.bk = " ";
    this.bV = a(this.bk, this.bl - this.bm.charWidth('正') / 2 - a5.ca.getWidth(), this.bm);
    if (this.bV != null)
      this.bg = (short)this.bV.length;
    this.bx = (short)(this.bq / (a5.iG + 1));
    b5.jdMethod_case("总行数 = " + this.bg);
    b5.jdMethod_case("能够显示的行数 = " + this.bx);
    b5.jdMethod_case("文本区域宽度 = " + this.bl);
    b5.jdMethod_case("文本区域高度 = " + this.bq);
    az();
  }

  private void az()
  {
    this.bo = 0;
    this = this;
    this.bj.aa();
  }

  private boolean au()
  {
    return this.bx < this.bg;
  }

  public final void jdMethod_try(byte paramByte)
  {
    this.bz = paramByte;
    paramByte = 0;
    short s1 = 0;
    short s2 = 0;
    switch (this.bz)
    {
    case 0:
      this.bi = this.k;
      this.bh = this.j;
      this.bl = this.a;
      this.bq = this.jdField_int;
      paramByte = (short)(this.bi + this.bl - a5.ca.getWidth());
      s1 = this.bh;
      s2 = this.bq;
      break;
    case 1:
      this.bi = (short)(this.k + 1);
      this.bh = (short)(this.j + 1);
      this.bl = (short)(this.a - 2);
      this.bq = (short)(this.jdField_int - 2);
      paramByte = (short)(this.k + this.a - a5.ca.getWidth());
      s1 = this.j;
      s2 = this.jdField_int;
      break;
    case 2:
      this.bi = (short)(this.k + this.bR + 1 + 1);
      this.bh = (short)(this.j + this.bc + 1 + 1);
      this.bl = (short)(this.a - 2 * (this.bR + 1 + 1));
      this.bq = (short)(this.jdField_int - 2 * (this.bc + 1 + 1));
      paramByte = (short)(this.k + this.a - this.bR - 1 - a5.ca.getWidth());
      s1 = (short)(this.j + this.bc + 1);
      s2 = (short)(this.jdField_int - 2 * (this.bc + 1));
    }
    this.bj.jdMethod_new(paramByte);
    this.bj.jdMethod_for(s1);
    this.bj.jdMethod_do(0);
    this.bj.a(s2);
  }

  public final void jdMethod_else(int paramInt)
  {
    this.bD = paramInt;
  }

  public final short ax()
  {
    return this.bg;
  }

  public final short ao()
  {
    return this.bx;
  }

  public final void jdMethod_new(byte paramByte)
  {
    this.br = paramByte;
  }

  private String[] a(String paramString, int paramInt, Font paramFont)
  {
    int i = (paramString = paramString.toCharArray()).length;
    int[] arrayOfInt2 = new int[34];
    String str = 0;
    Object localObject1 = new StringBuffer();
    Vector localVector1 = new Vector();
    for (int n = 0; n < i; n++)
    {
      if (paramString[n] != '\n')
        localVector1.addElement(new Character(paramString[n]));
      if (paramString[n] == '$')
        continue;
      ((StringBuffer)localObject1).append(paramString[n]);
    }
    n = 0;
    paramString = new StringBuffer();
    int i2 = 0;
    int i3 = localVector1.size();
    while (i2 < i3)
    {
      if (localVector1.elementAt(i2).toString().charAt(0) == '$')
      {
        arrayOfInt2[str] = i2;
        str++;
      }
      if (n == 1)
      {
        paramString.append(localVector1.elementAt(i2).toString().charAt(0));
      }
      else if (n == 2)
      {
        paramString.setLength(paramString.length() - 1);
        this.bt = paramString.toString();
        b5.jdMethod_case("~~~~~~~~~~~~~~~~~~ timeStr = " + this.bt);
        try
        {
          bP = (byte)((n = Integer.parseInt(this.bt)) / 60);
          bJ = (byte)(n % 60);
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          NumberFormatException localNumberFormatException1;
          (localNumberFormatException1 = localNumberFormatException2).printStackTrace();
          bP = 0;
          bJ = 0;
        }
        i1 = 0;
      }
      if (localVector1.elementAt(i2).toString().charAt(0) == 'ε')
        i1++;
      i2++;
    }
    String[] arrayOfString;
    i = (arrayOfString = b5.a(((StringBuffer)localObject1).toString(), paramInt, paramFont)).length;
    this.bN = new byte[i][];
    int[][] arrayOfInt = new int[i][2];
    for (int i1 = 0; i1 < i; i1++)
    {
      paramString = arrayOfString[i1].length();
      this.bN[i1] = new byte[paramString];
      if (i1 == 0)
      {
        arrayOfInt[i1][0] = 0;
        arrayOfInt[i1][1] = (paramString - 1);
      }
      else
      {
        arrayOfInt[i1][0] = (arrayOfInt[(i1 - 1)][1] + 1);
        arrayOfInt[i1][1] = (arrayOfInt[i1][0] + paramString - 1);
      }
    }
    Vector localVector2 = new Vector(4);
    if (str % 2 != 0)
      str--;
    for (paramString = 0; paramString < str; paramString += 2)
    {
      arrayOfInt2[paramString] -= paramString;
      arrayOfInt2[(paramString + 1)] -= paramString + 1 + 1;
      paramInt = b5.a(arrayOfInt2[paramString], arrayOfInt);
      paramFont = b5.a(arrayOfInt2[(paramString + 1)], arrayOfInt);
      if (paramInt == paramFont)
      {
        (localObject1 = new int[3])[0] = paramInt;
        localObject1[1] = (arrayOfInt2[paramString] - arrayOfInt[paramInt][0]);
        localObject1[2] = (arrayOfInt2[(paramString + 1)] - arrayOfInt[paramInt][0]);
        localVector2.addElement(localObject1);
      }
      else
      {
        Object localObject2;
        if ((k = paramFont - paramInt) > 1)
          for (localObject2 = paramInt + 1; localObject2 < paramFont; localObject2++)
          {
            int[] arrayOfInt1;
            (arrayOfInt1 = new int[3])[0] = localObject2;
            arrayOfInt1[1] = 0;
            arrayOfInt1[2] = (arrayOfString[localObject2].length() - 1);
            localVector2.addElement(arrayOfInt1);
          }
        (localObject2 = new int[3])[0] = paramInt;
        localObject2[1] = (arrayOfInt2[paramString] - arrayOfInt[paramInt][0]);
        localObject2[2] = (arrayOfInt[paramInt][1] - arrayOfInt[paramInt][0]);
        localVector2.addElement(localObject2);
        (localObject2 = new int[3])[0] = paramFont;
        localObject2[1] = 0;
        localObject2[2] = (arrayOfInt2[(paramString + 1)] - arrayOfInt[paramFont][0]);
        localVector2.addElement(localObject2);
      }
    }
    int j;
    paramString = new int[j = localVector2.size()][];
    paramInt = localVector2.elements();
    for (paramFont = 0; paramInt.hasMoreElements(); paramFont++)
      paramString[paramFont] = ((int[])(int[])paramInt.nextElement());
    for (int k = 0; k < j; k++)
      for (int m = paramString[k][1]; m <= paramString[k][2]; m++)
        this.bN[paramString[k][0]][m] = 1;
    for (k = 0; k < arrayOfString.length; k++)
      arrayOfString[k] = arrayOfString[k].trim();
    return (String)(String)arrayOfString;
  }

  public final void ap()
  {
    Object localObject = this;
    if (this.bj == null)
      return;
    localObject = this;
    localObject = this;
    this.bj.az = this.bg;
    localObject = this;
    localObject = this;
    this.bj.ay = this.bx;
    localObject = this;
    this = 0;
    (localObject = this.bj).aj = this;
  }

  public final short ar()
  {
    return this.bo;
  }

  private static final void an()
  {
    Form localForm = new Form("客服中心");
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    TextField localTextField1 = new TextField("请输入问题内容", "", 100, 0);
    TextField localTextField2 = new TextField("请输入机型", "", 20, 0);
    localForm.addCommand(localCommand1);
    localForm.addCommand(localCommand2);
    localForm.append(localTextField2);
    localForm.append(localTextField1);
    ak localak1 = (ak)a5.es.cf().elementAt(3);
    a9 locala9 = (a9)a5.es.cf().elementAt(4);
    ak localak2;
    if (((localak2 = localak1).bk != null) && (!(localak2 = localak1).bk.equals("")))
      localTextField1.setString((localak2 = localak1).bk);
    if ((locala9.cc().toString().trim() != null) && (!locala9.cc().toString().trim().equals("")))
      localTextField2.setString(locala9.cc().toString().trim());
    localForm.setCommandListener(new CommandListener(localCommand1, localTextField2, localForm, localTextField1, localCommand2)
    {
      private final Command val$okCmd;
      private final TextField val$jixing;
      private final Form val$form;
      private final TextField val$tf;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        ao localao;
        if (paramCommand == this.val$okCmd)
        {
          if ((this.val$jixing.getString().equals("")) || (this.val$jixing.getString() == null))
          {
            paramCommand = new Alert(bm.a2[9], "请您输入机型内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          if ((this.val$tf.getString().equals("")) || (this.val$tf.getString() == null))
          {
            paramCommand = new Alert(bm.a2[9], "请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          if ((ak.bG.equals(this.val$tf.getString())) && (q.b != 5))
          {
            paramCommand = new Alert(bm.a2[9], "请您不要输入相同的内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          if ((!a5.a(this.val$tf.getString(), 3)) || (!a5.a(this.val$jixing.getString(), 3)))
          {
            paramCommand = new Alert(bm.a2[9], "您输入的内容含有非法字符，请您重新输入！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          paramCommand = (ak)a5.es.cf().elementAt(3);
          paramDisplayable = (a9)a5.es.cf().elementAt(4);
          localao = (ao)a5.es.cf().elementAt(1);
          paramCommand.jdMethod_if(this.val$tf.getString());
          paramDisplayable.a(new StringBuffer(this.val$jixing.getString()));
          paramCommand.ap();
          localao.a("操作", 0);
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          (paramCommand = (ak)a5.es.cf().elementAt(3)).jdMethod_if("");
          (paramDisplayable = (a9)a5.es.cf().elementAt(4)).a(new StringBuffer(""));
          (localao = (ao)a5.es.cf().elementAt(1)).a("输入", 0);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(localForm);
  }

  static
  {
    System.getProperty("line.separator");
    bP = 0;
    bJ = 0;
    bu = 0L;
    bG = "";
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     ak
 * JD-Core Version:    0.6.0
 */
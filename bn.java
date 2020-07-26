import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextField;

public final class bn extends ba
{
  private Vector ip = null;
  private short iB = 0;
  private static short iz = 13;
  private Form iy = null;
  private String iw = "资料";
  private Command iD = null;
  private Command iF = null;
  private ChoiceGroup in = null;
  private String[] iE = { "好友可见", "完全公开", "完全保密" };
  private TextField ix = null;
  private ChoiceGroup is = null;
  private String[] im = { "女", "男" };
  private TextField iq = null;
  private TextField iH = null;
  private TextField iG = null;
  private TextField it = null;
  private TextField ir = null;
  private TextField iu = null;
  private TextField io = null;
  public static final String[] iv = { "以下资料", "昵称", "性别", "年龄", "血型", "生肖", "星座", "城市", "职业", "个人说明" };
  public String[] iA = new String[iv.length];
  public static Vector iI = new Vector();

  private bn(short paramShort1, short paramShort2, short paramShort3, short paramShort4, be parambe)
  {
    super(0, 0, 0, 0, parambe);
  }

  public bn(int paramInt, be parambe)
  {
    this(0, 0, 0, 0, parambe);
    switch (paramInt)
    {
    case 393218:
    case 393225:
    case 393229:
    case 1245185:
      this.b = true;
      a(true, parambe);
    }
    this = this;
    if (this.ip != null)
    {
      this.ip.removeAllElements();
      return;
    }
    b5.jdMethod_case("Vector已经为空，删除完毕！");
  }

  public final void cZ()
  {
    bn localbn1 = this;
    int k;
    Object localObject2;
    if ((a5.gZ) && (a5.jdMethod_byte(268435456)) && (!localbn1.jdField_byte))
    {
      k = 0;
      int n = localbn1.ip.size();
      while (k < n)
      {
        if (((localObject2 = (ba)(ba)localbn1.ip.elementAt(k)) instanceof af))
        {
          ((af)localObject2).b();
          break;
        }
        k++;
      }
    }
    Object localObject1;
    short s;
    af localaf;
    int j;
    int m;
    switch (a5.es.g9)
    {
    case 393225:
    case 393229:
      if (this.jdField_byte)
      {
        if (a5.jdMethod_try(4096))
          y().c8();
        else if (a5.jdMethod_try(8192))
          y().c9();
        else if ((a5.jdMethod_byte(65536)) || (a5.jdMethod_byte(131072)))
        {
          if (a5.es.g9 == 393225)
          {
            y().dc();
            switch (y().de())
            {
            case 0:
              localbn1 = this;
              this.iy = new Form(localbn1.iw);
              localbn1.iD = new Command("保存", 4, 2);
              localbn1.iF = new Command(bm.a2[3], 3, 2);
              localbn1.in = new ChoiceGroup("资料权限", 1, localbn1.iE, null);
              localbn1.ix = new TextField("昵称", "", 6, 0);
              localbn1.is = new ChoiceGroup("性别", 1, localbn1.im, null);
              localbn1.iq = new TextField("年龄", "", 6, 0);
              localbn1.iH = new TextField("血型", "", 6, 0);
              localbn1.iG = new TextField("生肖", "", 6, 0);
              localbn1.it = new TextField("星座", "", 6, 0);
              localbn1.ir = new TextField("城市", "", 6, 0);
              localbn1.iu = new TextField("职业", "", 6, 0);
              localbn1.io = new TextField("个人说明", "", 50, 0);
              localbn1.cY();
              localbn1.iy.append(localbn1.in);
              localbn1.iy.append(localbn1.ix);
              localbn1.iy.append(localbn1.is);
              localbn1.iy.append(localbn1.iq);
              localbn1.iy.append(localbn1.iH);
              localbn1.iy.append(localbn1.iG);
              localbn1.iy.append(localbn1.it);
              localbn1.iy.append(localbn1.ir);
              localbn1.iy.append(localbn1.iu);
              localbn1.iy.append(localbn1.io);
              localbn1.iy.addCommand(localbn1.iD);
              localbn1.iy.addCommand(localbn1.iF);
              localbn1.iy.setCommandListener(new CommandListener()
              {
                public final void commandAction(Command paramCommand, Displayable paramDisplayable)
                {
                  if (paramCommand == bn.this.iD)
                  {
                    bn.iI.addElement(bn.this.in.getString(bn.this.in.getSelectedIndex()));
                    bn.this.iA[0] = bn.access$100(bn.this).getString(bn.access$100(bn.this).getSelectedIndex());
                    bn.iI.addElement(bn.this.ix.getString());
                    bn.this.iA[1] = bn.access$200(bn.this).getString();
                    bn.iI.addElement(bn.this.is.getString(bn.this.is.getSelectedIndex()));
                    bn.this.iA[2] = bn.access$300(bn.this).getString(bn.access$300(bn.this).getSelectedIndex());
                    bn.iI.addElement(bn.this.iq.getString());
                    bn.this.iA[3] = bn.access$400(bn.this).getString();
                    bn.iI.addElement(bn.this.iH.getString());
                    bn.this.iA[4] = bn.access$500(bn.this).getString();
                    bn.iI.addElement(bn.this.iG.getString());
                    bn.this.iA[5] = bn.access$600(bn.this).getString();
                    bn.iI.addElement(bn.this.it.getString());
                    bn.this.iA[6] = bn.access$700(bn.this).getString();
                    bn.iI.addElement(bn.this.ir.getString());
                    bn.this.iA[7] = bn.access$800(bn.this).getString();
                    bn.iI.addElement(bn.this.iu.getString());
                    bn.this.iA[8] = bn.access$900(bn.this).getString();
                    bn.iI.addElement(bn.this.io.getString());
                    bn.this.iA[9] = bn.access$1000(bn.this).getString();
                    paramCommand = 0;
                    paramDisplayable = bn.this.c1().size();
                    while (paramCommand < paramDisplayable)
                    {
                      if (paramCommand % 2 != 0)
                      {
                        Object localObject;
                        if ((bn.this.q(paramCommand) instanceof ah))
                          (localObject = (ah)bn.this.q(paramCommand)).a(bn.iI.elementAt(paramCommand >> 1).toString());
                        else if ((bn.this.q(paramCommand) instanceof ak))
                          (localObject = (ak)bn.this.q(paramCommand)).jdMethod_if(bn.iI.elementAt(paramCommand >> 1).toString());
                      }
                      paramCommand++;
                    }
                    a5.eQ.a(393226);
                    a5.e8.setFullScreenMode(true);
                    a5.dI.display.setCurrent(a5.e8);
                    bn.this.c5();
                    return;
                  }
                  if (paramCommand == bn.this.iF)
                  {
                    a5.e8.setFullScreenMode(true);
                    a5.dI.display.setCurrent(a5.e8);
                    bn.this.c5();
                  }
                }
              });
              a5.dI.display.setCurrent(localbn1.iy);
            }
            this.jdField_byte = false;
          }
        }
        else if (a5.jdMethod_byte(262144))
          this.jdField_byte = false;
        b5.jdMethod_case("clientCommand = " + Integer.toHexString(a5.es.g9));
        return;
      }
      int i;
      if (a5.jdMethod_try(4096))
      {
        if (this.iB <= 0)
        {
          this.iB = 0;
          return;
        }
        this.iB = (short)(this.iB - 1);
        if (this.ip == null)
          break;
        i = 0;
        k = this.ip.size();
        while (i < k)
        {
          if (((localObject1 = (ba)(ba)this.ip.elementAt(i)) instanceof af))
          {
            s = this.iB;
            (localaf = (af)localObject1).aj = s;
            ((af)localObject1).a(this.iB, false);
          }
          else
          {
            ((ba)localObject1).j = (short)(((ba)localObject1).j + 16);
          }
          i++;
        }
        return;
      }
      else if (a5.jdMethod_try(8192))
      {
        if (this.iB >= iz)
        {
          this.iB = iz;
          return;
        }
        this.iB = (short)(this.iB + 1);
        if (this.ip == null)
          break;
        i = 0;
        k = this.ip.size();
        while (i < k)
        {
          if (((localObject1 = (ba)(ba)this.ip.elementAt(i)) instanceof af))
          {
            s = this.iB;
            (localaf = (af)localObject1).aj = s;
            ((af)localObject1).a(this.iB, false);
          }
          else
          {
            ((ba)localObject1).j = (short)(((ba)localObject1).j - 16);
          }
          i++;
        }
        return;
      }
      else
      {
        if ((!a5.jdMethod_byte(65536)) && (!a5.jdMethod_byte(131072)))
          break;
        bn localbn2 = this;
        br localbr = new br(0);
        if (a5.es.g9 == 393225)
        {
          localObject1 = new int[] { 1 };
          localObject2 = new int[] { 3 };
          localbr.a(bm.b3, localObject1, localObject2);
          localbn2.a(localbr);
          localbn2.jdField_byte = true;
          localbn2.y().da();
        }
        return;
      }
    case 393218:
      if (a5.jdMethod_try(4096))
      {
        this.iB = (short)(this.iB - 1);
        if (this.iB < 0)
        {
          this.iB = 0;
          return;
        }
        if (this.ip == null)
          break;
        j = 0;
        m = this.ip.size();
        while (j < m)
        {
          if (((localObject1 = (ba)(ba)this.ip.elementAt(j)) instanceof af))
          {
            s = this.iB;
            (localaf = (af)localObject1).aj = s;
            ((af)localObject1).a(this.iB, false);
          }
          else
          {
            ((ba)localObject1).j = (short)(((ba)localObject1).j + 16 * a5.il / 208);
          }
          j++;
        }
        return;
      }
      else
      {
        if (!a5.jdMethod_try(8192))
          break;
        this.iB = (short)(this.iB + 1);
        j = 0;
        int i1;
        if (this.ip != null)
        {
          m = 0;
          i1 = this.ip.size();
          while (m < i1)
          {
            if (((localObject2 = (ba)this.ip.elementAt(m)) instanceof af))
              j = ((af)localObject2).az - ((af)localObject2).ay;
            m++;
          }
        }
        if (this.iB > j)
        {
          this.iB = (short)j;
          return;
        }
        if (this.ip != null)
        {
          m = 0;
          i1 = this.ip.size();
          while (m < i1)
          {
            if (((localObject2 = (ba)(ba)this.ip.elementAt(m)) instanceof af))
            {
              s = this.iB;
              (localaf = (af)localObject2).aj = s;
              ((af)localObject2).a(this.iB, false);
            }
            else
            {
              ((ba)localObject2).j = (short)(((ba)localObject2).j - 16 * a5.il / 208);
            }
            m++;
          }
        }
        return;
      }
    case 1245185:
      if (a5.jdMethod_try(4096))
      {
        this.iB = (short)(this.iB - 1);
        if (this.iB < 0)
        {
          this.iB = 0;
          return;
        }
        if (this.ip == null)
          break;
        j = 0;
        m = this.ip.size();
        while (j < m)
        {
          ba localba;
          if (((localba = (ba)(ba)this.ip.elementAt(j)) instanceof af))
          {
            s = this.iB;
            (localaf = (af)localba).aj = s;
            ((af)localba).a(this.iB, false);
          }
          else if ((localba instanceof ah))
          {
            localba.j = (short)(localba.j + a5.iG);
          }
          j++;
        }
        return;
      }
      else
      {
        if (!a5.jdMethod_try(8192))
          break;
        this.iB = (short)(this.iB + 1);
        j = 0;
        if (this.ip != null)
        {
          m = 0;
          i2 = this.ip.size();
          while (m < i2)
          {
            if (((localObject2 = (ba)this.ip.elementAt(m)) instanceof af))
              j = ((af)localObject2).az - ((af)localObject2).ay;
            m++;
          }
        }
        if (this.iB > j)
        {
          this.iB = (short)j;
          return;
        }
        if (this.ip == null)
          break;
        m = 0;
        int i2 = this.ip.size();
        while (m < i2)
        {
          if (((localObject2 = (ba)(ba)this.ip.elementAt(m)) instanceof af))
          {
            s = this.iB;
            (localaf = (af)localObject2).aj = s;
            ((af)localObject2).a(this.iB, false);
          }
          else if ((localObject2 instanceof ah))
          {
            ((ba)localObject2).j = (short)(((ba)localObject2).j - a5.iG);
          }
          m++;
        }
      }
    }
  }

  public final void a(Graphics paramGraphics)
  {
    int j;
    switch (a5.es.g9)
    {
    case 393218:
      int i = 0;
      j = c1().size();
      while (i < j)
      {
        ba localba;
        if ((((localba = q(i)) instanceof ah)) && (i >= this.iB << 1) && (i < 8 + this.iB << 1))
          localba.a(paramGraphics);
        i++;
      }
      return;
    case 1245185:
      y localy1 = null;
      j = 0;
      int k = 0;
      int m = c1().size();
      while (k < m)
      {
        Object localObject;
        if (((localObject = q(k)) instanceof y))
        {
          localy1 = (y)localObject;
          ((ba)localObject).a(paramGraphics);
          paramGraphics.setColor(bm.ad);
          paramGraphics.fillRect(localy1.I[0] - 4, localy1.I[1] + 2, (a5.iA << 1) + 2, localy1.I[3] - 5);
          paramGraphics.setColor(bm.b4);
          paramGraphics.drawLine(localy1.I[0] + (a5.iA << 1) + 2 - 4, localy1.I[1] + 2, localy1.I[0] + (a5.iA << 1) + 2 - 4, localy1.I[1] + localy1.I[3] - 3);
          j = localy1.I[0] + (localy1.I[2] + ((a5.iA << 1) + 2 + 1)) / 2 + 4;
          paramGraphics.drawLine(j - 4, localy1.I[1] + 2, j - 4, localy1.I[1] + localy1.I[3] - 3);
        }
        else if ((localObject instanceof ah))
        {
          localObject = (ah)localObject;
          y localy2;
          if (((k - 4) / 3 >= this.iB) && ((k - 4) / 3 < this.iB + (localy2 = localy1).G));
          switch (k)
          {
          case 5:
          case 23:
          case 26:
          case 29:
          case 32:
            b5.a(paramGraphics, ((ah)localObject).aj(), localy1.I[0] + (a5.iA << 1) + 2, ((ba)localObject).jdMethod_long(), j - (localy1.I[0] + (a5.iA << 1) + 2) - 3, 0, 1);
            break;
          case 6:
          case 24:
          case 27:
          case 30:
          case 33:
            b5.a(paramGraphics, ((ah)localObject).aj(), j + 2, ((ba)localObject).jdMethod_long(), j - (localy1.I[0] + (a5.iA << 1) + 2) - 3, 0, 1);
            break;
          case 7:
          case 8:
          case 9:
          case 10:
          case 11:
          case 12:
          case 13:
          case 14:
          case 15:
          case 16:
          case 17:
          case 18:
          case 19:
          case 20:
          case 21:
          case 22:
          case 25:
          case 28:
          case 31:
          default:
            ((ah)localObject).a(paramGraphics);
            break;
          }
        }
        else
        {
          ((ba)localObject).a(paramGraphics);
        }
        k++;
      }
    }
  }

  public final Vector c1()
  {
    if (this.ip == null)
      this.ip = new Vector();
    return this.ip;
  }

  public final void jdMethod_do(ba paramba)
  {
    if (this.ip == null)
      this.ip = new Vector();
    this.ip.addElement(paramba);
  }

  public final ba q(int paramInt)
  {
    if (this.ip != null)
      return (ba)(ba)this.ip.elementAt(paramInt);
    return null;
  }

  public final void c5()
  {
    this.iy = null;
    this.iD = null;
    this.iF = null;
    this.in = null;
    this.ix = null;
    this.iq = null;
    this.iH = null;
    this.iG = null;
    this.it = null;
    this.ir = null;
    this.iu = null;
    this.io = null;
    iI.removeAllElements();
  }

  private void cY()
  {
    int i;
    if (this.iA[0] != null)
    {
      b5.jdMethod_case("saveStr[0] = " + this.iA[0]);
      for (i = 0; i < this.iE.length; i++)
      {
        if (!this.iA[0].equals(this.iE[i]))
          continue;
        this.in.setSelectedIndex(i, true);
      }
    }
    if (this.iA[1] != null)
      this.ix.setString(this.iA[1]);
    if (this.iA[2] != null)
      for (i = 0; i < this.im.length; i++)
      {
        if (!this.iA[2].equals(this.im[i]))
          continue;
        this.is.setSelectedIndex(i, true);
      }
    if (this.iA[3] != null)
      this.iq.setString(this.iA[3]);
    if (this.iA[4] != null)
      this.iH.setString(this.iA[4]);
    if (this.iA[5] != null)
      this.iG.setString(this.iA[5]);
    if (this.iA[6] != null)
      this.it.setString(this.iA[6]);
    if (this.iA[7] != null)
      this.ir.setString(this.iA[7]);
    if (this.iA[8] != null)
      this.iu.setString(this.iA[8]);
    if (this.iA[9] != null)
      this.io.setString(this.iA[9]);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bn
 * JD-Core Version:    0.6.0
 */
import java.io.PrintStream;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

public final class bv extends ba
{
  private y i3;
  private Vector kN;
  private int[] j4;
  private byte jJ;
  private boolean jy;
  public byte la;
  public static byte kq;
  public static byte kT;
  public static int ks;
  public static byte k6;
  public static int jI = -1;
  public static long le = -1L;
  public static short j9;
  public static short j8;
  public byte jE;
  private int kD;
  private int kC;
  private boolean kV;
  private boolean kX;
  public static boolean jP = true;
  public static boolean jp = true;
  public static int[] ju = new int[0];
  private int jT;
  private int ku;
  private static String lh = "";
  public boolean kl;
  public int jl;
  public byte j7;

  public bv(short paramShort1, short paramShort2, short paramShort3, short paramShort4, byte paramByte, be parambe)
  {
    super(paramShort1, paramShort2, paramShort3, paramShort4, parambe);
    new Vector();
    this.jy = false;
    this.jE = -1;
    this.kD = 0;
    this.kC = 0;
    this.kV = true;
    this.kX = true;
    this.jT = -1;
    this.ku = -1;
    this.kl = false;
    this.jl = 0;
    this.j7 = 0;
    this.y = paramByte;
    this.b = true;
    this.kN = new Vector();
    this.i3 = new y(paramShort1, paramShort2, paramShort3, paramShort4, 1, parambe);
    this.kD = (this.k + 10 + 3 + 1 + 1 + 3);
    this.kC = (this.j + 5 + 1 + 1 + 1 + 2);
    this.la = 0;
    a(paramByte);
  }

  public final int t(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.j4.length - 1))
      throw new IndexOutOfBoundsException("越界");
    return this.j4[paramInt];
  }

  public final void jdMethod_if(int[] paramArrayOfInt)
  {
    this.j4 = paramArrayOfInt;
  }

  public final void a(Graphics paramGraphics)
  {
    if (this.i3 != null)
      this.i3.a(paramGraphics);
    Object localObject;
    if ((localObject = this.i3).U != null)
      (localObject = this.i3).U.a(paramGraphics);
    int i;
    int j;
    switch (this.y)
    {
    case 0:
    case 3:
    case 4:
    case 5:
      paramGraphics = paramGraphics;
      this = this;
      i = this.jl;
      j = this.kN.size() < this.jJ ? this.kN.size() : this.jJ + this.jl;
      while (i < j)
      {
        localObject = (m)this.kN.elementAt(i);
        int k;
        if ((this.kX) && (i == this.la) && (q()))
          if (this.kV)
          {
            paramGraphics.setColor(bm.bP);
            paramGraphics.fillRect(this.kD + 1, this.kC + (i + 1 - this.jl) + (i - this.jl) * dp(), dF(), dp() - 2);
          }
          else
          {
            paramGraphics.setColor(bm.bP);
            if (this.jy)
            {
              k = this.k;
              if ((this.a - 30 - b5.jdMethod_do(((m)localObject).jdMethod_case())) / 2 > 0)
                k += (this.a - b5.jdMethod_do(((m)localObject).jdMethod_case())) / 2;
              else
                k = this.kD + 6;
              paramGraphics.fillRect(k - 1, this.kC + (i + 1 - this.jl) + (i - this.jl) * dp() + 6 - 4 + 1, ((m)localObject).jdMethod_int() + 1, dp() + 1);
            }
            else
            {
              paramGraphics.fillRect(this.kD + 4, this.kC + (i + 1 - this.jl) + (i - this.jl) * dp() + 6 - 4 + 1, ((m)localObject).jdMethod_int() + 1, dp() + 1);
            }
          }
        if (this.kV)
        {
          if (this.jy)
          {
            k = this.k;
            if ((this.a - 30 - b5.jdMethod_do(((m)localObject).jdMethod_case())) / 2 > 0)
              k += (this.a - b5.jdMethod_do(((m)localObject).jdMethod_case())) / 2;
            else
              k = this.kD + 6;
            localObject = this;
            ((m)localObject).a(paramGraphics, k, this.kC + (i - this.jl) + (i - this.jl) * dp() + 3, dF(), (localObject = this.i3).U, (i == this.la) && (this.kX) && (q()), false);
          }
          else
          {
            localObject = this;
            ((m)localObject).a(paramGraphics, this.kD + 6, this.kC + (i - this.jl) + (i - this.jl) * dp() + 3, dF(), (localObject = this.i3).U, (i == this.la) && (this.kX) && (q()), false);
          }
          paramGraphics.setColor(bm.bY);
          paramGraphics.drawLine(this.kD, this.kC + (i - this.jl) + (i - this.jl + 1) * dp(), this.kD + dF(), this.kC + (i - this.jl) + (i - this.jl + 1) * dp());
        }
        else if (this.jy)
        {
          k = this.k;
          if ((this.a - 30 - b5.jdMethod_do(((m)localObject).jdMethod_case())) / 2 > 0)
            k += (this.a - b5.jdMethod_do(((m)localObject).jdMethod_case())) / 2;
          else
            k = this.kD + 6;
          localObject = this;
          ((m)localObject).a(paramGraphics, k, this.kC + (i - this.jl) + (i - this.jl) * dp() + 6 - 4, dF(), (localObject = this.i3).U, (i == this.la) && (this.kX) && (q()), false);
        }
        else
        {
          localObject = this;
          ((m)localObject).a(paramGraphics, this.kD + 6, this.kC + (i - this.jl) + (i - this.jl) * dp() + 6 - 4, dF(), (localObject = this.i3).U, (i == this.la) && (this.kX) && (q()), false);
        }
        i++;
      }
      return;
    case 1:
      paramGraphics = paramGraphics;
      this = this;
      i = this.jl;
      j = this.kN.size() < this.jJ ? this.kN.size() : this.jJ + this.jl;
      while (i < j)
      {
        localObject = this;
        (localObject = (m)this.kN.elementAt(i)).a(paramGraphics, this.kD, this.kC + (i - this.jl) + (i - this.jl) * m.jdMethod_else(), dF(), (localObject = this.i3).U, i == this.la, false);
        i++;
      }
      return;
    case 2:
      paramGraphics = paramGraphics;
      this = this;
      i = this.jl;
      j = this.kN.size() < this.jJ ? this.kN.size() : this.jJ + this.jl;
      while (i < j)
      {
        localObject = this;
        (localObject = (m)this.kN.elementAt(i)).a(paramGraphics, this.kD, this.kC + (i - this.jl) + (i - this.jl) * m.jdMethod_do(), dF(), (localObject = this.i3).U, i == this.la, i == be.gL);
        i++;
      }
    }
  }

  public final Vector dt()
  {
    return this.kN;
  }

  public final void a(m paramm)
  {
    this.kN.addElement(paramm);
    this = this;
    paramm = 0;
    (paramm = this.kN.size() * dp());
  }

  public final y dr()
  {
    return this.i3;
  }

  public final byte z$132bd3()
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      bv localbv = this;
      if (j > (this.kV ? (short)(localbv.jdField_int - 24) : (short)(localbv.jdField_int - 24 - 12)))
        break;
      switch (this.y)
      {
      case 0:
      case 3:
      case 4:
      case 5:
        j = (short)(j + dp());
        break;
      case 1:
        j = (short)(j + m.jdMethod_else());
        break;
      case 2:
        j = (short)(j + m.jdMethod_do());
      }
      i = (byte)(i + 1);
    }
    return i = (byte)(i - 1);
  }

  public final short dF()
  {
    int i = 0;
    Object localObject = this;
    int j;
    if ((localObject = this.i3).U != null)
      j = (short)(this.a - 38 - 10);
    else
      j = (short)(this.a - 38);
    return j;
  }

  public final void jdMethod_new(short paramShort)
  {
    super.jdMethod_new(paramShort);
    this.i3.jdMethod_new(paramShort);
  }

  public final void jdMethod_for(short paramShort)
  {
    super.jdMethod_for(paramShort);
    this.i3.jdMethod_for(paramShort);
  }

  public final void jdMethod_do(short paramShort)
  {
    super.jdMethod_do(paramShort);
    this.i3.jdMethod_do(paramShort);
  }

  public final void a(short paramShort)
  {
    super.a(paramShort);
    this.i3.a(paramShort);
  }

  public final void o(boolean paramBoolean)
  {
    this.jy = paramBoolean;
  }

  public final byte dw()
  {
    return this.la;
  }

  public final void y(byte paramByte)
  {
    this.la = paramByte;
  }

  public final void s(int paramInt)
  {
    m localm;
    switch (paramInt)
    {
    case -1:
      as.a6();
      return;
    case -3:
      paramInt = (m)this.kN.elementAt(this.ku);
      ju[this.ku] = 0;
      this.ku = -1;
      paramInt.jdMethod_if("");
      paramInt = (m)this.kN.elementAt(be.gL);
      ju[be.gL] = this.jT;
      paramInt.jdMethod_if(m.a(ju[be.gL]));
      be.gL = -1;
      break;
    case -5:
      for (paramInt = 0; paramInt < this.kN.size(); paramInt++)
      {
        localm = (m)this.kN.elementAt(paramInt);
        ju[paramInt] = 0;
        localm.jdMethod_if("");
      }
      as.a6();
      return;
    case -6:
      for (paramInt = 0; paramInt < this.kN.size(); paramInt++)
      {
        localm = (m)this.kN.elementAt(paramInt);
        ju[paramInt] = a5.iH[paramInt];
        localm.jdMethod_if(m.a(ju[paramInt]));
      }
      as.a6();
    case -4:
    case -2:
    }
  }

  public final void f()
  {
    Object localObject1;
    int i;
    m localm5;
    if (be.gL != -1)
    {
      localObject1 = this;
      if (a5.et != 0)
      {
        if ((a5.et >= 1) && (a5.et <= 65536))
        {
          i = 1;
          for (int i4 = 0; i4 < ju.length; i4++)
          {
            if ((be.gL == i4) || ((ju[i4] & a5.et) == 0))
              continue;
            ((bv)localObject1).ku = i4;
            ((bv)localObject1).jT = ju[i4];
            i = 0;
            as.a(6, "您所输入的按键已经作用于其他功能上，是否确定操作", "是", "否", -3, -1);
            break;
          }
          if (i != 0)
          {
            localm5 = (m)((bv)localObject1).kN.elementAt(be.gL);
            ju[be.gL] = a5.et;
            localm5.jdMethod_if(m.a(ju[be.gL]));
            be.gL = -1;
          }
          break label7720;
        }
        if (a5.et == 262144)
        {
          be.gL = -1;
          break label7720;
        }
        as.a(0, "不能设置您所输入的按键！", "确定", "", -1, -2);
      }
    }
    else
    {
      Object localObject2;
      int i7;
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
        else
        {
          if ((a5.jdMethod_byte(65536)) || (a5.jdMethod_byte(131072)))
          {
            localObject1 = this;
            y().dc();
            if (((ba)localObject1).y == 2)
            {
              switch (i = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue())
              {
              case -7:
                be.gL = ((bv)localObject1).la;
                break;
              case -8:
                localm5 = (m)((bv)localObject1).kN.elementAt(((bv)localObject1).la);
                ju[localObject1.la] = 0;
                localm5.jdMethod_if("");
                break;
              case -5:
                as.a(6, "是否清空当前设置的所有按键?", "是", "否", -5, -1);
                break;
              case -6:
                as.a(6, "是否恢复到默认设置的按键?", "是", "否", -6, -1);
              }
              ((ba)localObject1).jdField_byte = false;
              break label7720;
            }
            if (((ba)localObject1).y == 3)
            {
              if ((i = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue()) != -1)
                if (i == -1610612730)
                  a(i, (short)((bv)localObject1).t(((bv)localObject1).la));
                else if (i == 1572867)
                  a5.eQ.a(i);
              ((ba)localObject1).jdField_byte = false;
              break label7720;
            }
            if (((ba)localObject1).y == 4)
            {
              if (((i = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue()) != -1) && (i == -1610612731))
                ((bv)localObject1).u(i);
              ((ba)localObject1).jdField_byte = false;
              break label7720;
            }
            if (((ba)localObject1).y == 5)
            {
              if (((i = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue()) != -1) && (i == -1610612730))
                a(i, (short)((bv)localObject1).t(((bv)localObject1).la));
              ((ba)localObject1).jdField_byte = false;
              break label7720;
            }
          }
          m localm3;
          int i5;
          switch (a5.es.g9)
          {
          case 1441793:
            if ((i = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue()) >= 0)
              switch (i)
              {
              case 1441794:
              case 1441795:
              case 1441796:
              case 1441797:
                a5.eQ.a(i);
              }
            ((ba)localObject1).jdField_byte = false;
            break;
          case 1835021:
            if (((bv)localObject1).dt().size() > 0)
            {
              m localm1;
              jI = (localm1 = (m)((bv)localObject1).dt().elementAt(((bv)localObject1).la)).q;
              le = localm1.aa;
            }
            int j;
            if ((j = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue()) >= 0)
              switch (j)
              {
              case 1835022:
              case 1835025:
                a5.eQ.a(j);
                break;
              case 1835024:
                a5.eQ.a(1835026);
                break;
              case 1835023:
                i.a(1835023, "", "");
              }
            ((ba)localObject1).jdField_byte = false;
            break;
          case 1835030:
          case 1835031:
            if (((bv)localObject1).dt().size() > 0)
            {
              m localm2;
              jI = (localm2 = (m)((bv)localObject1).dt().elementAt(((bv)localObject1).la)).q;
            }
            int k;
            if ((k = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue()) >= 0)
              switch (k)
              {
              case 1835018:
              case 1835019:
                a5.eQ.a(k);
              }
            ((ba)localObject1).jdField_byte = false;
            break;
          case 1835012:
            jI = (localm3 = (m)((bv)localObject1).dt().elementAt(((bv)localObject1).la)).q;
            if ((i5 = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue()) >= 0)
              switch (i5)
              {
              case 1835028:
              case 1835029:
                a5.eQ.a(i5);
                break;
              case 1835016:
              case 1835017:
              case 1835020:
                i.jdMethod_if(i5);
              case 1835018:
              case 1835019:
              case 1835021:
              case 1835022:
              case 1835023:
              case 1835024:
              case 1835025:
              case 1835026:
              case 1835027:
              }
            ((ba)localObject1).jdField_byte = false;
            break;
          case 2490385:
            localm3 = (m)((bv)localObject1).dt().elementAt(((bv)localObject1).la);
            i5 = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue();
            bg.hP = localm3.J;
            if (i5 == -268435452)
            {
              a3.a(localm3.J, localm3.jdMethod_case(), true);
            }
            else
            {
              if (i5 == 720897)
                bu.k = localm3.J;
              if (i5 == 196638)
                l.try = localm3.J;
              a5.eQ.a(i5);
            }
            ((ba)localObject1).jdField_byte = false;
            break;
          default:
            int m;
            m localm6;
            m localm4;
            int i6;
            switch (((bv)localObject1).jE)
            {
            case 2:
            case 9:
            case 12:
            case 15:
            case 29:
              if (((bv)localObject1).j4 != null)
                jI = localObject1.j4[localObject1.la];
              b5.jdMethod_case("选中任务ID：" + jI);
              if ((m = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue()) == -1)
              {
                ((ba)localObject1).jdField_byte = false;
                break label7720;
              }
              if ((m == 262148) || (m == 262155))
              {
                as.a(0, "您确定要放弃此任务？", "确定", "取消", m, -1);
                ((ba)localObject1).jdField_byte = false;
                break label7720;
              }
              a5.eQ.a(m);
              ((ba)localObject1).jdField_byte = false;
              break;
            case 4:
              if ((m = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue()) != -1)
              {
                localm6 = (m)((bv)localObject1).dt().elementAt(((bv)localObject1).la);
                switch (m)
                {
                case -1610612726:
                  a3.a(localm6.L, localm6.m, true);
                  break;
                case 589831:
                case 589835:
                  bg.hP = localm6.L;
                  break;
                case 720899:
                case 720900:
                case 720901:
                case 720902:
                case 720908:
                case 720910:
                  if ((bu.e == 2) && (a5.fE.size() > 0))
                    a5.c9 = ((be)a5.fE.elementAt(0)).ht;
                  bu.k = localm6.L;
                case 720919:
                case 720920:
                  a5.eQ.a(m);
                }
              }
              ((ba)localObject1).jdField_byte = false;
              break;
            case 5:
              switch (m = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue())
              {
              case 393218:
                a5.eQ.a(m);
                break;
              case 393227:
                be.cn();
                a5.eQ.a(m);
              }
              ((ba)localObject1).jdField_byte = false;
              break;
            case 18:
              m = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue();
              bw.goto = (localm6 = (m)(m)((bv)localObject1).kN.elementAt(((bv)localObject1).la)).jdField_char;
              bw.jdField_i_of_type_Int = localm6.r;
              bw.int = localm6.jdField_i_of_type_Int;
              if (m == 1)
              {
                if (bw.int < bw.case)
                  as.cH = bw.int;
                else
                  as.cH = bw.case;
                as.a(13, new String[] { "当前最高价：" + bw.jdField_i_of_type_Int, "一口价：" + bw.int, "请输入你的出价" }, "确定", "取消", bw.e ? 1900553 : 1900555, -1);
                ((ba)localObject1).jdField_byte = false;
                break label7720;
              }
              a5.eQ.a(m);
              ((ba)localObject1).jdField_byte = false;
              break;
            case 32:
            case 38:
            case 44:
            case 50:
            case 56:
            case 63:
            case 67:
            case 75:
            case 79:
              bb.new = (localm4 = (m)((bv)localObject1).kN.elementAt(((bv)localObject1).la)).Y;
              bb.int = localm4.jdMethod_case();
              i6 = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue();
              break;
            case 36:
            case 41:
            case 47:
            case 53:
            case 57:
            case 61:
              bb.char = (localm4 = (m)((bv)localObject1).kN.elementAt(((bv)localObject1).la)).q;
              i6 = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue();
              break;
            case 59:
              bb.new = (localm4 = (m)((bv)localObject1).kN.elementAt(((bv)localObject1).la)).Y;
              bb.int = localm4.jdMethod_case();
              i6 = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue();
              break;
            case 82:
              at.for = (localm4 = (m)((bv)localObject1).kN.elementAt(((bv)localObject1).la)).q;
              i6 = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue();
              break;
            case 86:
              if ((al.a = (localm4 = (m)((bv)localObject1).kN.elementAt(((bv)localObject1).la)).q) >= 0)
              {
                j9 = localm4.K;
                j8 = localm4.I;
                i6 = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue();
                a5.eQ.a(i6);
              }
              ((ba)localObject1).jdField_byte = false;
              break;
            case 87:
              int n = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue();
              m localm7;
              az.else = (localm7 = (m)((bv)localObject1).kN.elementAt(((bv)localObject1).la)).e();
              az.o = ((Byte)az.g.elementAt(((ba)localObject1).y().de())).byteValue();
              a5.eQ.a(n);
              ((ba)localObject1).jdField_byte = false;
              break;
            case 89:
              localObject2 = (m)((bv)localObject1).kN.elementAt(((bv)localObject1).la);
              switch (i7 = ((Integer)((ba)localObject1).y().db().elementAt(((ba)localObject1).y().de())).intValue())
              {
              case 852021:
              case 852023:
                l.void = ((m)localObject2).w;
                break;
              case -1610612633:
                as.a(0, "是否退出战场？强行退出后会有短暂的惩罚时间不能进入战场！", "确定", "取消", 852001, -1);
                break;
              case 196642:
                l.d = true;
                l.goto = ((ba)localObject1).y().de();
              }
              a5.eQ.a(i7);
              ((ba)localObject1).jdField_byte = false;
            case 3:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
            case 31:
            case 33:
            case 34:
            case 35:
            case 37:
            case 39:
            case 40:
            case 42:
            case 43:
            case 45:
            case 46:
            case 48:
            case 49:
            case 51:
            case 52:
            case 54:
            case 55:
            case 58:
            case 60:
            case 62:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 83:
            case 84:
            case 85:
            case 88:
            }
            break;
            if (!a5.jdMethod_byte(262144))
              break;
            b5.jdMethod_case("in uilist soft2");
            this.jdField_byte = false;
            a(null);
            break;
          }
        }
      }
      else
      {
        if (a5.jdMethod_try(4096))
        {
          if (this.kN.size() == 0)
            return;
          if (this.kX)
          {
            this.la = (byte)(this.la - 1);
            if (this.la < 0)
            {
              this.la = 0;
              this.kl = true;
            }
            else
            {
              b5.p = 0;
              b5.d = 0;
              this.kl = false;
            }
          }
          if (a5.jdMethod_else() == 16)
          {
            dI();
          }
          else if (a5.es.g9 == 2359297)
          {
            o.int = this.la;
            (localObject1 = (ah)a5.es.cf().elementAt(6)).a(o.if[this.la]);
            ((ba)localObject1).jdMethod_new((short)(a5.ic - ((ba)localObject1).jdMethod_for() >> 1));
            (localObject2 = (ah)a5.es.cf().elementAt(7)).a(o.do[this.la]);
            (localObject2 = (ah)a5.es.cf().elementAt(8)).a(o.a[this.la]);
          }
          else if ((a5.es.g9 == 2424994) || (a5.es.g9 == 2425072))
          {
            B(this.la);
          }
          else if (a5.es.g9 == 1703958)
          {
            (localObject1 = (ak)a5.es.cf().elementAt(4)).jdMethod_if(q.byte[this.la]);
          }
          else if (a5.es.g9 == 1703969)
          {
            (localObject1 = (ak)a5.es.cf().elementAt(6)).jdMethod_if(q.case[this.la]);
          }
          if ((a5.es.g9 == 1900548) || (a5.es.g9 == 1900546))
            dE();
          if ((a5.es.g9 == 262153) && (dt().size() > 0))
            C(((m)dt().elementAt(this.la)).jdMethod_char());
          if (a5.es.g9 == 852020)
          {
            localObject1 = (m)dt().elementAt(this.la);
            localObject2 = (ao)a5.es.cf().elementAt(1);
            if (((m)localObject1).jdField_else == 4125)
              ((ao)localObject2).a("", 0);
            else
              ((ao)localObject2).a("操作", 0);
          }
          if (dr().L() == null)
            return;
          if (this.kX)
          {
            if (this.la < dr().L().aj)
              this.jl -= 1;
          }
          else
          {
            this.jl -= 1;
            if (this.jl < 0)
              this.jl = 0;
            dr().L().jdMethod_char((short)this.jl);
          }
          b5.jdMethod_case("selectedIndex = " + this.la + "  startIndex = " + this.jl);
        }
        else if (a5.jdMethod_try(8192))
        {
          if (this.kN.size() == 0)
            return;
          if (this.kX)
          {
            this.la = (byte)(this.la + 1);
            this.kl = false;
            if (this.la > this.kN.size() - 1)
            {
              this.la = (byte)(this.kN.size() - 1);
            }
            else
            {
              b5.p = 0;
              b5.d = 0;
            }
          }
          if (a5.jdMethod_else() == 16)
          {
            dI();
          }
          else if (a5.es.g9 == 2359297)
          {
            o.int = this.la;
            (localObject1 = (ah)a5.es.cf().elementAt(6)).a(o.if[this.la]);
            ((ba)localObject1).jdMethod_new((short)(a5.ic - ((ba)localObject1).jdMethod_for() >> 1));
            (localObject2 = (ah)a5.es.cf().elementAt(7)).a(o.do[this.la]);
            (localObject2 = (ah)a5.es.cf().elementAt(8)).a(o.a[this.la]);
          }
          else if ((a5.es.g9 == 2424994) || (a5.es.g9 == 2425072))
          {
            B(this.la);
          }
          else if (a5.es.g9 == 1703958)
          {
            (localObject1 = (ak)a5.es.cf().elementAt(4)).jdMethod_if(q.byte[this.la]);
          }
          else if (a5.es.g9 == 1703969)
          {
            (localObject1 = (ak)a5.es.cf().elementAt(6)).jdMethod_if(q.case[this.la]);
          }
          if ((a5.es.g9 == 1900548) || (a5.es.g9 == 1900546))
            dE();
          if (a5.es.g9 == 262153)
            C(((m)dt().elementAt(this.la)).jdMethod_char());
          if (a5.es.g9 == 852020)
          {
            localObject1 = (m)dt().elementAt(this.la);
            localObject2 = (ao)a5.es.cf().elementAt(1);
            if (((m)localObject1).jdField_else == 4125)
              ((ao)localObject2).a("", 0);
            else
              ((ao)localObject2).a("操作", 0);
          }
          if (dr().L() == null)
            return;
          if (this.kX)
          {
            if (this.la >= dr().L().aj + dr().L().ay)
              this.jl += 1;
          }
          else
          {
            this.jl += 1;
            if (this.jl > dr().L().az - dr().L().ay)
              this.jl = (dr().L().az - dr().L().ay);
            dr().L().jdMethod_char((short)this.jl);
          }
          b5.jdMethod_case("selectedIndex = " + this.la + "  startIndex = " + this.jl);
        }
        else if ((a5.jdMethod_byte(65536)) || (a5.jdMethod_byte(131072)))
        {
          b5.jdMethod_case("clientCommand = " + a5.es.g9);
          if (this.jE == 8)
          {
            k6 = (localObject1 = (m)dt().elementAt(this.la)).jdMethod_long();
            a5.eQ.a(131076);
            return;
          }
          if (this.jE == 10)
          {
            if (dt().size() == 0)
              return;
            bf.a = this.j4[this.la];
            a5.eQ.a(262166);
            a5.d6.addElement(a5.es);
            return;
          }
          if (this.jE == 11)
          {
            if (dt().size() == 0)
              return;
            bf.a = this.j4[this.la];
            a5.eQ.a(262167);
            a5.d6.addElement(a5.es);
            return;
          }
          if (this.jE == 13)
          {
            if (dt().size() == 0)
              return;
            bf.a = this.j4[this.la];
            a5.eQ.a(262169);
            a5.d6.addElement(a5.es);
            return;
          }
          if (this.jE == 14)
          {
            if (dt().size() == 0)
              return;
            bf.a = this.j4[this.la];
            a5.eQ.a(262170);
            a5.d6.addElement(a5.es);
            return;
          }
          if (this.jE == 7)
          {
            bf.if = false;
            kT = (byte)(this.la + 1);
            j9 = (localObject1 = (m)this.kN.elementAt(this.la)).K;
            j8 = ((m)localObject1).I;
            int i1;
            if (a5.es.g9 == 655363)
              i1 = 262194;
            else
              i1 = 262162;
            a5.eQ.a(i1);
          }
          else if (this.jE == 17)
          {
            ax.a = (localObject1 = (m)this.kN.elementAt(this.la)).A;
            a5.eQ.a(1507330);
            a5.d6.addElement(a5.es);
          }
          else
          {
            Object localObject3;
            if (this.jE == 19)
            {
              switch (this.la)
              {
              case 0:
                a5.d6.addElement(a5.es);
                bw.for = 0;
                bw.long = -1;
                bw.try = -1;
                bw.else = -1;
                bw.b = -1;
                bw.a();
                a5.eQ.a(1900546);
                break;
              case 1:
                bw.for = 1;
                bw.long = -1;
                bw.try = -1;
                bw.else = -1;
                bw.b = -1;
                a5.d6.addElement(a5.es);
                (a5.es = e.a("/ui/ulist.ui")).g9 = -1610612724;
                (localObject1 = (ao)a5.es.cf().elementAt(0)).jdMethod_do("武　器");
                (localObject3 = (ao)a5.es.cf().elementAt(1)).a("确定", 0);
                (localObject3 = (bv)a5.es.cf().elementAt(2)).dy();
                for (i7 = 0; i7 < bm.Z.length; i7++)
                  ((bv)localObject3).a(new m(bm.Z[i7], 0, 0, ((bv)localObject3).dF()));
                ((bv)localObject3).jE = 20;
                a((bv)localObject3, 0);
                break;
              case 2:
                bw.for = 2;
                bw.long = -1;
                bw.try = -1;
                bw.else = -1;
                bw.b = -1;
                a5.d6.addElement(a5.es);
                (a5.es = e.a("/ui/ulist.ui")).g9 = -1610612723;
                (localObject1 = (ao)a5.es.cf().elementAt(0)).jdMethod_do("防　具");
                (localObject3 = (ao)a5.es.cf().elementAt(1)).a("确定", 0);
                (localObject3 = (bv)a5.es.cf().elementAt(2)).dy();
                for (i7 = 0; i7 < bm.aO.length; i7++)
                  ((bv)localObject3).a(new m(bm.aO[i7], 0, 0, ((bv)localObject3).dF()));
                ((bv)localObject3).jE = 21;
                a((bv)localObject3, 0);
                break;
              case 3:
                bw.for = 3;
                bw.long = -1;
                bw.try = -1;
                bw.else = -1;
                bw.b = -1;
                a5.d6.addElement(a5.es);
                (a5.es = e.a("/ui/ulist.ui")).g9 = -1610612722;
                (localObject1 = (ao)a5.es.cf().elementAt(0)).jdMethod_do("素　材");
                (localObject3 = (ao)a5.es.cf().elementAt(1)).a("确定", 0);
                (localObject3 = (bv)a5.es.cf().elementAt(2)).dy();
                for (i7 = 0; i7 < bm.bG.length; i7++)
                  ((bv)localObject3).a(new m(bm.bG[i7], 0, 0, ((bv)localObject3).dF()));
                ((bv)localObject3).jE = 22;
                a((bv)localObject3, 0);
                break;
              case 4:
                bw.for = 4;
                bw.long = -1;
                bw.try = -1;
                bw.else = -1;
                bw.b = -1;
                a5.d6.addElement(a5.es);
                (a5.es = e.a("/ui/ulist.ui")).g9 = -1610612721;
                (localObject1 = (ao)a5.es.cf().elementAt(0)).jdMethod_do("消　耗");
                (localObject3 = (ao)a5.es.cf().elementAt(1)).a("确定", 0);
                (localObject3 = (bv)a5.es.cf().elementAt(2)).dy();
                for (i7 = 0; i7 < bm.cn.length; i7++)
                  ((bv)localObject3).a(new m(bm.cn[i7], 0, 0, ((bv)localObject3).dF()));
                ((bv)localObject3).jE = 23;
                a((bv)localObject3, 0);
                break;
              case 5:
                a5.d6.addElement(a5.es);
                bw.for = 5;
                bw.long = 0;
                bw.try = -1;
                bw.else = -1;
                bw.b = -1;
                bw.a();
                a5.eQ.a(1900546);
              default:
                break;
              }
            }
            else
            {
              int i9;
              if ((this.jE == 20) || (this.jE == 21))
              {
                a5.d6.addElement(a5.es);
                bw.long = this.la;
                bw.try = -1;
                bw.else = -1;
                bw.b = -1;
                if (this.la == 0)
                {
                  bw.a();
                  a5.eQ.a(1900546);
                  return;
                }
                lh = localObject1 = ((m)this.kN.elementAt(this.la)).jdMethod_case();
                a5.es = e.a("/ui/ulist.ui");
                if (this.jE == 20)
                  a5.es.g9 = -1610612720;
                else if (this.jE == 21)
                  a5.es.g9 = -1610612718;
                (localObject3 = (ao)a5.es.cf().elementAt(0)).jdMethod_do((String)localObject1);
                (localObject3 = (ao)a5.es.cf().elementAt(1)).a("确定", 0);
                bv localbv;
                (localbv = (bv)a5.es.cf().elementAt(2)).dy();
                localObject1 = new String[] { "所有等级" + (String)localObject1, "1-10级", "11-20级", "21-30级", "31-40级", "41-50级", "51-60级", "61-70级" };
                for (i9 = 0; i9 < localObject1.length; i9++)
                  localbv.a(new m(localObject1[i9], 0, 0, localbv.dF()));
                if (this.jE == 20)
                  localbv.jE = 24;
                else if (this.jE == 21)
                  localbv.jE = 26;
                a(localbv, 0);
              }
              else if (this.jE == 22)
              {
                a5.d6.addElement(a5.es);
                bw.long = this.la;
                bw.try = -1;
                bw.else = -1;
                bw.b = -1;
                if (this.la == 0)
                {
                  bw.a();
                  a5.eQ.a(1900546);
                }
                else if (this.la == 5)
                {
                  (a5.es = e.a("/ui/ulist.ui")).g9 = -1610612719;
                  (localObject1 = (ao)a5.es.cf().elementAt(0)).jdMethod_do("宝　石");
                  (localObject3 = (ao)a5.es.cf().elementAt(1)).a("确定", 0);
                  (localObject3 = (bv)a5.es.cf().elementAt(2)).dy();
                  for (int i8 = 0; i8 < bm.ck.length; i8++)
                    ((bv)localObject3).a(new m(bm.ck[i8], 0, 0, ((bv)localObject3).dF()));
                  ((bv)localObject3).jE = 25;
                  a((bv)localObject3, 0);
                }
                else
                {
                  bw.a();
                  a5.eQ.a(1900546);
                }
              }
              else if (this.jE == 23)
              {
                a5.d6.addElement(a5.es);
                bw.long = this.la;
                bw.try = -1;
                bw.else = -1;
                bw.b = -1;
                bw.a();
                a5.eQ.a(1900546);
              }
              else if ((this.jE == 24) || (this.jE == 26))
              {
                a5.d6.addElement(a5.es);
                bw.try = this.la;
                bw.else = -1;
                bw.b = -1;
                if (this.la == 0)
                {
                  bw.a();
                  a5.eQ.a(1900546);
                  return;
                }
                a5.es = e.a("/ui/ulist.ui");
                if (this.jE == 24)
                  a5.es.g9 = -1610612717;
                else if (this.jE == 26)
                  a5.es.g9 = -1610612716;
                localObject1 = (ao)a5.es.cf().elementAt(0);
                if (this.jE == 24)
                  ((ao)localObject1).jdMethod_do("武　器");
                else if (this.jE == 26)
                  ((ao)localObject1).jdMethod_do("防　具");
                (localObject3 = (ao)a5.es.cf().elementAt(1)).a("确定", 0);
                (localObject3 = (bv)a5.es.cf().elementAt(2)).dy();
                String[] arrayOfString = new String[bm.cu.length + 1];
                localObject1 = ((m)this.kN.elementAt(this.la)).jdMethod_case();
                arrayOfString[0] = ((String)localObject1 + "所有" + lh);
                System.arraycopy(bm.cu, 0, arrayOfString, 1, bm.cu.length);
                for (i9 = 0; i9 < arrayOfString.length; i9++)
                  ((bv)localObject3).a(new m(arrayOfString[i9], 0, 0, ((bv)localObject3).dF()));
                if (this.jE == 24)
                  ((bv)localObject3).jE = 27;
                else if (this.jE == 26)
                  ((bv)localObject3).jE = 28;
                a((bv)localObject3, 0);
              }
              else if ((this.jE == 27) || (this.jE == 28))
              {
                a5.d6.addElement(a5.es);
                bw.else = this.la;
                bw.b = -1;
                bw.a();
                a5.eQ.a(1900546);
              }
              else if (this.jE == 25)
              {
                a5.d6.addElement(a5.es);
                bw.b = this.la;
                bw.a();
                a5.eQ.a(1900546);
              }
              else
              {
                int i2;
                if ((this.jE == 31) || (this.jE == 37) || (this.jE == 43) || (this.jE == 49) || (this.jE == 55) || (this.jE == 62) || (this.jE == 66) || (this.jE == 74) || (this.jE == 78))
                {
                  if (this.kN.size() == 0)
                    return;
                  br.c6();
                  bb.new = (localObject1 = (m)this.kN.elementAt(this.la)).Y;
                  bb.int = ((m)localObject1).jdMethod_case();
                  i2 = 0;
                  if (this.jE == 31)
                    i2 = 2162698;
                  else if (this.jE == 37)
                    i2 = 2162704;
                  else if (this.jE == 43)
                    i2 = 2162715;
                  else if (this.jE == 49)
                    i2 = 2162726;
                  else if (this.jE == 55)
                    i2 = 2162737;
                  else if (this.jE == 62)
                    i2 = 2162758;
                  else if (this.jE == 66)
                    i2 = 2162765;
                  else if (this.jE == 74)
                    i2 = 2162772;
                  else if (this.jE == 78)
                    i2 = 2162779;
                  a5.eQ.a(i2);
                }
                else if ((this.jE == 33) || (this.jE == 40) || (this.jE == 46) || (this.jE == 52))
                {
                  if (this.kN.size() == 0)
                    return;
                  br.c6();
                  bb.try = (localObject1 = (m)this.kN.elementAt(this.la)).q;
                  i2 = 0;
                  if (this.jE == 33)
                    i2 = 2162694;
                  else if (this.jE == 40)
                    i2 = 2162707;
                  else if (this.jE == 46)
                    i2 = 2162718;
                  else if (this.jE == 52)
                    i2 = 2162729;
                  a5.eQ.a(i2);
                }
                else if ((this.jE == 35) || (this.jE == 39) || (this.jE == 45) || (this.jE == 51))
                {
                  if (this.kN.size() == 0)
                    return;
                  br.c6();
                  bb.try = (localObject1 = (m)this.kN.elementAt(this.la)).q;
                  if (this.jE == 35)
                    a5.eQ.a(2162699);
                  else if (this.jE == 39)
                    a5.eQ.a(2162706);
                  else if (this.jE == 45)
                    a5.eQ.a(2162717);
                  else if (this.jE == 51)
                    a5.eQ.a(2162728);
                }
                else if ((this.jE == 34) || (this.jE == 42) || (this.jE == 48) || (this.jE == 54) || (this.jE == 58))
                {
                  if (this.kN.size() == 0)
                    return;
                  br.c6();
                  bb.char = (localObject1 = (m)this.kN.elementAt(this.la)).q;
                  a5.eQ.a(2162695);
                }
                else if (this.jE == 60)
                {
                  br.c6();
                  bb.new = (localObject1 = (m)this.kN.elementAt(this.la)).Y;
                  bb.int = ((m)localObject1).jdMethod_case();
                  a5.eQ.a(2162747);
                }
                else if (this.jE == 70)
                {
                  br.c6();
                  at.for = (localObject1 = (m)this.kN.elementAt(this.la)).q;
                  a5.eQ.a(458771);
                }
                else if (this.jE == 71)
                {
                  localObject1 = (m)this.kN.elementAt(this.la);
                  as.cH = o.for[this.la];
                  as.a(1, "您要兑换多少" + ((m)localObject1).jdMethod_case() + "?", "确定", "返回", 2359298, -1, -1, -1);
                  a5.gQ.jdMethod_goto(0);
                }
                else if (this.jE == 72)
                {
                  localObject1 = (m)this.kN.elementAt(this.la);
                  bo.s[0] = this.la;
                  bo.o = ((m)localObject1).jdMethod_case();
                  a5.eQ.a(2424994);
                  br.c6();
                }
              }
            }
          }
          if (a5.es.g9 == 851974)
          {
            a5.d6.addElement(a5.es);
          }
          else
          {
            if (a5.es.g9 == 720916)
            {
              kq = this.la;
              a5.eQ.a(720918);
              a5.A();
              return;
            }
            if (a5.es.g9 == 262193)
            {
              if (dt().size() != 0)
              {
                if (be.gu.B.length() + 4 >= 30)
                {
                  as.a(5, "您输入的聊天字数已达上限！", "确定", "", -1, -2);
                  return;
                }
                a3 tmp7165_7162 = be.gu;
                tmp7165_7162.B = (tmp7165_7162.B + "[r" + (this.la + 1) + "]");
                be.gu.jdMethod_if(false);
              }
              return;
            }
            if (a5.es.g9 == 2621441)
            {
              b4.e = (localObject1 = (m)this.kN.elementAt(this.la)).q;
              if (((m)localObject1).q == -100)
              {
                a5.eQ.a(2621444);
              }
              else
              {
                b4.f = ((m)localObject1).jdMethod_case();
                a5.eQ.a(2621443);
              }
              br.c6();
              return;
            }
            if (a5.es.g9 == 2621444)
            {
              b4.do = (localObject1 = (m)this.kN.elementAt(this.la)).q;
              b4.f = ((m)localObject1).jdMethod_case();
              a5.eQ.a(2621445);
              br.c6();
              return;
            }
            if (a5.es.g9 == 2621442)
            {
              bo.e = b4.e = (localObject1 = (m)this.kN.elementAt(this.la)).q;
              System.out.println("需要发送" + bo.e + "条短信");
              if (b4.else)
                as.a(0, as.dM, "确认", "返回", -260, -1);
              else
                bo.jdMethod_if();
            }
          }
          if (this.r == 130)
          {
            bf.try = this.la;
            a5.eQ.a(262192);
            return;
          }
          if ((this.y == 0) && (a5.es.g9 == 1900545))
          {
            dA();
            return;
          }
          if ((this.y == 0) && (a5.es.g9 == 3145738))
          {
            aa.do = this.la;
            a5.eQ.a(3145739);
            br.c6();
            return;
          }
          if ((this.y == 0) && (a5.es.g9 == 3145739))
          {
            aa.d = this.la;
            a5.eQ.a(2425076);
            return;
          }
          t();
        }
        else if (a5.es.g9 == 1703969)
        {
          if (a5.jdMethod_byte(2048))
          {
            localObject1 = (ak)a5.es.cf().elementAt(6);
            if (q())
            {
              a(false, a5.es);
              ((ba)localObject1).a(true, a5.es);
              ((ak)localObject1).jdMethod_new(2);
              ((ak)localObject1).ap();
            }
          }
        }
        else if (this.y == 2)
        {
          if (a5.jdMethod_byte(2048))
          {
            be.gL = this.la;
          }
          else if (a5.jdMethod_byte(1024))
          {
            localObject1 = (m)this.kN.elementAt(this.la);
            ju[this.la] = 0;
            ((m)localObject1).jdMethod_if("");
          }
        }
        if (dr().L() != null)
          dr().L().a((short)this.la, this.kX);
      }
    }
    label7720: kq = this.la;
  }

  private void t()
  {
    br localbr = new br(0);
    Object localObject3;
    Object localObject4;
    if (this.y == 2)
    {
      String[] arrayOfString1 = { "设置", "清空", "清空所有", "恢复默认" };
      localObject3 = new int[] { -7, -8, -5, -6 };
      localObject4 = new int[] { 3, 3, 3, 3 };
      localbr.a(arrayOfString1, localObject3, localObject4);
    }
    else
    {
      Object localObject5;
      if (this.y == 3)
      {
        localObject5 = this;
        int i;
        if ((i = this.kN.size()) != 0)
        {
          localObject3 = new String[] { "学　习", "查　看" };
          localObject4 = new int[] { 1572867, -1610612730 };
          localObject5 = new int[] { 3, 2 };
          localbr.a(localObject3, localObject4, localObject5);
        }
      }
      else if (this.y == 4)
      {
        String[] arrayOfString2 = { "查　看" };
        localObject3 = new int[] { -1610612731 };
        localObject4 = new int[] { 2 };
        localbr.a(arrayOfString2, localObject3, localObject4);
      }
      else if (this.y == 5)
      {
        localObject5 = this;
        int j;
        if ((j = this.kN.size()) != 0)
        {
          localObject3 = new String[] { "查　看" };
          localObject4 = new int[] { -1610612730 };
          localObject5 = new int[] { 2 };
          localbr.a(localObject3, localObject4, localObject5);
        }
      }
      else
      {
        Object localObject1;
        switch (a5.es.g9)
        {
        case 1638420:
          localObject5 = this;
          if (this.kN.size() > 0)
          {
            localObject5 = this;
            bt.h = (byte)(localObject1 = (m)this.kN.elementAt(this.la)).q;
            bt.do = ((m)localObject1).jdMethod_case();
          }
          br.c6();
          a5.eQ.a(1638421);
          break;
        case 1441793:
          localObject5 = this;
          if (this.kN.size() == 0)
            return;
          localObject5 = this;
          this.kN.elementAt(this.la);
          localObject1 = null;
          localObject3 = null;
          localObject4 = null;
          localObject5 = null;
          switch (this.la)
          {
          case 0:
            localObject3 = new String[] { "结为伴侣" };
            localObject4 = new int[] { 1441794 };
            localObject5 = new int[] { 3 };
            break;
          case 1:
            localObject3 = new String[] { "注册结婚" };
            localObject4 = new int[] { 1441795 };
            localObject5 = new int[] { 3 };
            break;
          case 2:
            localObject3 = new String[] { "协议离婚", "强制离婚" };
            localObject4 = new int[] { 1441796, 1441797 };
            localObject5 = new int[] { 3, 3 };
          }
          localbr.a(localObject3, localObject4, localObject5);
          break;
        case 1835021:
          localObject1 = null;
          localObject3 = null;
          localObject4 = null;
          b5.a(bp.ag().as());
          if ((bp.ag().as() == i.for) || (bp.ag().as() == i.void))
          {
            localObject5 = this;
            if (this.kN.size() == 0)
            {
              localObject1 = new String[] { "添加公告" };
              localObject3 = new int[] { 1835023 };
              localObject4 = new int[] { 3 };
            }
            else
            {
              localObject1 = new String[] { "查看公告", "添加公告", "修改公告", "删除公告" };
              localObject3 = new int[] { 1835022, 1835023, 1835024, 1835025 };
              localObject4 = new int[] { 2, 3, 3, 3 };
            }
          }
          else
          {
            localObject5 = this;
            if (this.kN.size() == 0)
              return;
            localObject1 = new String[] { "查看公告" };
            localObject3 = new int[] { 1835022 };
            localObject4 = new int[] { 2 };
          }
          localbr.a(localObject1, localObject3, localObject4);
          break;
        case 1835030:
          localObject1 = new String[] { "给予职务" };
          localObject3 = new int[] { 1835018 };
          localObject4 = new int[] { 3 };
          localbr.a(localObject1, localObject3, localObject4);
          break;
        case 1835031:
          localObject1 = new String[] { "撤销职务" };
          localObject3 = new int[] { 1835019 };
          localObject4 = new int[] { 3 };
          localbr.a(localObject1, localObject3, localObject4);
          break;
        case 1835012:
          localObject1 = new String[] { "查看详情", "查看成员" };
          localObject3 = new int[] { 1835029, 1835028 };
          localObject4 = new int[] { 2, 2 };
          localObject5 = this;
          localObject5 = (m)this.kN.elementAt(this.la);
          b5.jdMethod_case("Player.getInstance().getKingRight()" + bp.ag().as());
          b5.jdMethod_case("Player.getInstance().getKingId()" + bp.ag().aS());
          b5.jdMethod_case("item.itemId" + ((m)localObject5).q);
          int[] arrayOfInt1;
          int[] arrayOfInt2;
          if (bp.ag().ai() == ((m)localObject5).q)
          {
            if (bp.ag().as() == i.for)
            {
              localObject5 = new String[] { "解散诸侯" };
              arrayOfInt1 = new int[] { 1835016 };
              arrayOfInt2 = new int[] { 0 };
              localObject1 = b5.a(localObject1, localObject1.length, localObject5);
              localObject3 = b5.a(localObject3, localObject3.length, arrayOfInt1);
              localObject4 = b5.a(localObject4, localObject4.length, arrayOfInt2);
            }
            else if (bp.ag().aT() == bt.d)
            {
              localObject5 = new String[] { "退出诸侯" };
              arrayOfInt1 = new int[] { 1835020 };
              arrayOfInt2 = new int[] { 0 };
              localObject1 = b5.a(localObject1, localObject1.length, localObject5);
              localObject3 = b5.a(localObject3, localObject3.length, arrayOfInt1);
              localObject4 = b5.a(localObject4, localObject4.length, arrayOfInt2);
            }
          }
          else if ((bp.ag().as() == i.for) || (bp.ag().as() == i.void))
          {
            localObject5 = new String[] { "开除氏族" };
            arrayOfInt1 = new int[] { 1835017 };
            arrayOfInt2 = new int[] { 3 };
            localObject1 = b5.a(localObject1, localObject1.length, localObject5);
            localObject3 = b5.a(localObject3, localObject3.length, arrayOfInt1);
            localObject4 = b5.a(localObject4, localObject4.length, arrayOfInt2);
          }
          localbr.a(localObject1, localObject3, localObject4);
          break;
        case 2490385:
          localObject5 = this;
          if (this.kN.size() == 0)
            return;
          localObject5 = this;
          localObject1 = (m)this.kN.elementAt(this.la);
          localbr.a("查　看", 2490403, 2);
          localbr.a("加为好友", 589835, 3);
          localbr.a("屏蔽玩家", 589836, 3);
          if (((m)localObject1).jdMethod_new())
            localbr.a("私　聊", -268435452, 2);
          localbr.a("举　报", 196638, 3);
          if ((!((m)localObject1).jdMethod_new()) || (bu.e != 0))
            break;
          localbr.a("组队邀请", 720897, 3);
          break;
        case 2490389:
          localObject5 = this;
          if (this.kN.size() == 0)
            return;
          c.for = this.la;
          a5.eQ.a(2490421);
          break;
        default:
          Object localObject2;
          switch (this.jE)
          {
          case 9:
            localObject5 = this;
            if (this.kN.size() == 0)
              return;
            localObject5 = this;
            localObject1 = (m)this.kN.elementAt(this.la);
            localbr.a("查看详情", 262147, 2);
            localbr.a("查看报酬", 262159, 2);
            if (bu.e != 0)
              localbr.a("共　享", 262151, 3);
            localbr.a("放　弃", 262148, 3);
            if ((((m)localObject1).g() == 1) && (((m)localObject1).a()))
              localbr.a("刷　新", 262178, 2);
            localbr.a("收　藏", 262184, 3);
            break;
          case 2:
            localObject5 = this;
            if (this.kN.size() == 0)
              return;
            localObject5 = this;
            localObject1 = (m)this.kN.elementAt(this.la);
            localObject3 = null;
            localObject4 = null;
            localObject5 = null;
            if (this.j4 != null)
              jI = this.j4[this.la];
            if (((m)localObject1).jdMethod_char() == 2)
            {
              jP = false;
            }
            else if (((m)localObject1).jdMethod_char() == 1)
            {
              jP = true;
              a5.eQ.a(262154);
              br.c6();
            }
            else if (((m)localObject1).jdMethod_char() == 4)
            {
              jp = false;
              a5.eQ.a(262157);
              a5.d6.addElement(a5.es);
            }
            else if (((m)localObject1).jdMethod_char() == 3)
            {
              jp = true;
              a5.eQ.a(262157);
              br.dm();
            }
            break;
          case 3:
            b5.X = this.la;
            b5.jdMethod_case("Util.m_nTalkId=" + b5.X);
            a5.eQ.a(851975);
            break;
          case 4:
            localObject5 = this;
            if (this.kN.size() == 0)
              return;
            localObject5 = this;
            localObject1 = (m)this.kN.elementAt(this.la);
            localObject3 = null;
            localObject4 = null;
            localObject5 = null;
            if (bu.e == 0)
            {
              a5.A();
              as.a(0, "你的队伍已解散！", bm.a2[2], "", -1, -2);
            }
            else if (bp.ag().jdMethod_new() == bu.f)
            {
              if (bp.ag().jdMethod_new() == ((m)localObject1).L)
              {
                switch (bu.e)
                {
                case 1:
                  localObject3 = new String[] { "分配方式", "副本难度", "组建军团", "重置副本", "解散队伍", "退出队伍" };
                  localObject4 = new int[] { 720910, 720920, 720908, 720919, 720900, 720899 };
                  localObject5 = new int[] { 2, z.aK ? 3 : 2, 3, 3, 3, 3 };
                  break;
                case 2:
                  localObject3 = new String[] { "分配方式", "副本难度", "重置副本", "解散军团", "退出军团" };
                  localObject4 = new int[] { 720910, 720920, 720919, 720900, 720899 };
                  localObject5 = new int[] { 2, z.aK ? 3 : 2, 3, 3, 3 };
                }
                localbr.a(localObject3, localObject4, localObject5);
              }
              else
              {
                switch (bu.e)
                {
                case 1:
                  localObject3 = new String[] { "查看信息", "私聊", "加为好友", "给予队长", "移除队员", "退出队伍" };
                  localObject4 = new int[] { 589831, -1610612726, 589835, 720902, 720901, 720899 };
                  localObject5 = new int[] { 2, 2, 3, 3, 3, 3 };
                  break;
                case 2:
                  localObject3 = new String[] { "查看信息", "私聊", "加为好友", "给予团长", "移除团员", "退出军团" };
                  localObject4 = new int[] { 589831, -1610612726, 589835, 720902, 720901, 720899 };
                  localObject5 = new int[] { 2, 2, 2, 3, 3, 3 };
                }
                localbr.a(localObject3, localObject4, localObject5);
              }
            }
            else if (bp.ag().jdMethod_new() == ((m)localObject1).L)
            {
              switch (bu.e)
              {
              case 1:
                localObject3 = new String[] { "退出队伍" };
                localObject4 = new int[] { 720899 };
                break;
              case 2:
                localObject3 = new String[] { "退出军团" };
                localObject4 = new int[] { 720899 };
              }
              localbr.a(localObject3, localObject4);
            }
            else
            {
              switch (bu.e)
              {
              case 1:
                localObject3 = new String[] { "查看信息", "私聊", "加为好友", "退出队伍" };
                localObject4 = new int[] { 589831, -1610612726, 589835, 720899 };
                localObject5 = new int[] { 2, 2, 3, 3 };
                break;
              case 2:
                localObject3 = new String[] { "查看信息", "私聊", "加为好友", "退出军团" };
                localObject4 = new int[] { 589831, -1610612726, 589835, 720899 };
                localObject5 = new int[] { 2, 2, 3, 3 };
              }
              localbr.a(localObject3, localObject4, localObject5);
            }
            break;
          case 5:
            localObject5 = this;
            if (this.kN.size() == 0)
              return;
            localObject1 = new int[] { 393227, 393218 };
            localObject3 = new int[] { 3, 2 };
            localObject4 = new String[] { "确　定", "查　看" };
            localbr.a(localObject4, localObject1, localObject3);
            break;
          case 12:
            b5.jdMethod_case("add menu in SERVER_TYPE_TASK_RESET_DETAIL");
            if (this.kN.size() == 0)
              return;
            localObject1 = new String[] { "重　置", "查看详情", "查看报酬" };
            localObject3 = new int[] { 262173, 262147, 262159 };
            localObject4 = new int[] { 3, 2, 2 };
            localbr.a(localObject1, localObject3, localObject4);
            break;
          case 15:
            if (this.kN.size() == 0)
              return;
            localObject1 = new String[] { "任务详情", "任务报酬" };
            localObject3 = new int[] { 262147, 262159 };
            localObject4 = new int[] { 2, 2 };
            localbr.a(localObject1, localObject3, localObject4);
            break;
          case 18:
            if (this.kN.size() == 0)
              return;
            if (a5.es.g9 == 1900548)
            {
              localbr.a("查看信息", 1900552, 2);
              localbr.a("刷　新", 1900548, 3);
            }
            else
            {
              if (a5.es.g9 != 1900546)
                break;
              localbr.a("查看信息", 1900552, 2);
              localbr.a("出　价", 1, 3);
              int k = 0;
              if (bw.e)
                k = 1900546;
              else
                k = 1900554;
              localbr.a("刷　新", k, 3);
            }
            break;
          case 29:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "查看详情", "查看报酬", "删　除" };
            localObject3 = new int[] { 262147, 262159, 262186 };
            localObject4 = new int[] { 2, 2, 3 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 32:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "学习", "详细" };
            localObject3 = new int[] { 2162693, 2162692 };
            localObject4 = new int[] { 2, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 36:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "锻造", "查看" };
            localObject3 = new int[] { 2162700, 2162695 };
            localObject4 = new int[] { 3, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 38:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "学习", "详细" };
            localObject3 = new int[] { 2162708, 2162705 };
            localObject4 = new int[] { 2, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 41:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "铸甲", "查看" };
            localObject3 = new int[] { 2162711, 2162695 };
            localObject4 = new int[] { 3, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 44:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "学习", "详细" };
            localObject3 = new int[] { 2162719, 2162716 };
            localObject4 = new int[] { 2, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 47:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "制革", "查看" };
            localObject3 = new int[] { 2162722, 2162695 };
            localObject4 = new int[] { 3, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 50:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "学习", "详细" };
            localObject3 = new int[] { 2162730, 2162727 };
            localObject4 = new int[] { 2, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 53:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "裁缝", "查看" };
            localObject3 = new int[] { 2162733, 2162695 };
            localObject4 = new int[] { 3, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 56:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "学习", "详细" };
            localObject3 = new int[] { 2162739, 2162738 };
            localObject4 = new int[] { 2, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 57:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "凝元", "查看" };
            localObject3 = new int[] { 2162742, 2162695 };
            localObject4 = new int[] { 3, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 61:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "分解", "查看" };
            localObject3 = new int[] { 2162750, 2162752 };
            localObject4 = new int[] { 3, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 59:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "分解", "查看" };
            localObject3 = new int[] { 2162746, 2162753 };
            localObject4 = new int[] { 2, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 63:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "学习", "详细" };
            localObject3 = new int[] { 2162760, 2162759 };
            localObject4 = new int[] { 2, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 67:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "学习", "详细" };
            localObject3 = new int[] { 2162767, 2162766 };
            localObject4 = new int[] { 2, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 75:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "学习", "详细" };
            localObject3 = new int[] { 2162774, 2162773 };
            localObject4 = new int[] { 2, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 79:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "学习", "详细" };
            localObject3 = new int[] { 2162781, 2162780 };
            localObject4 = new int[] { 2, 2 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 82:
            if (this.kN.size() == 0)
              return;
            localObject2 = new String[] { "查看", "传送" };
            localObject3 = new int[] { 851978, 458771 };
            localObject4 = new int[] { 2, 3 };
            localbr.a(localObject2, localObject3, localObject4);
            break;
          case 83:
            if (this.la == 0)
              a5.eQ.a(1703959);
            else if (this.la == 1)
              a5.eQ.a(1703960);
            else if (this.la == 2)
              a5.eQ.a(1703961);
            br.c6();
            break;
          case 84:
            q.o = (byte)(this.la + 1);
            a5.eQ.a(1703971);
            br.c6();
            break;
          case 85:
            q.o = this.la;
            a5.eQ.a(1703972);
            break;
          case 86:
            if ((localObject2 = (m)this.kN.elementAt(this.la)).q < 0)
              break;
            localbr.a("移动", 2293875, 3);
            break;
          case 87:
            dG();
            break;
          case 88:
            if (this.kN.size() == 0)
              return;
            az.case = (byte)(localObject2 = (m)this.kN.elementAt(this.la)).q;
            az.k = ((m)localObject2).jdMethod_case();
            a5.eQ.a(2555977);
            br.c6();
            break;
          case 89:
            if (this.kN.size() == 0)
              return;
            if ((localObject2 = (m)this.kN.elementAt(this.la)).jdField_else == 4122)
            {
              localObject3 = new String[] { "战况查看", "天人排名", "修罗排名", "总排名", "退出战场" };
              localObject4 = new int[] { 852022, 196642, 196642, 196642, -1610612633 };
              localObject5 = new int[] { 2, 2, 2, 2, 3 };
              localbr.a(localObject3, localObject4, localObject5);
            }
            else if (((m)localObject2).jdField_else == 4123)
            {
              localObject3 = new String[] { "放弃排队" };
              localObject4 = new int[] { 852023 };
              localObject5 = new int[] { 3 };
              localbr.a(localObject3, localObject4, localObject5);
            }
            else
            {
              if (((m)localObject2).jdField_else != 4124)
                break;
              localObject3 = new String[] { "战场排队" };
              localObject4 = new int[] { 852021 };
              localObject5 = new int[] { 3 };
              localbr.a(localObject3, localObject4, localObject5);
            }
          case 6:
          case 7:
          case 8:
          case 10:
          case 11:
          case 13:
          case 14:
          case 16:
          case 17:
          case 19:
          case 20:
          case 21:
          case 22:
          case 23:
          case 24:
          case 25:
          case 26:
          case 27:
          case 28:
          case 30:
          case 31:
          case 33:
          case 34:
          case 35:
          case 37:
          case 39:
          case 40:
          case 42:
          case 43:
          case 45:
          case 46:
          case 48:
          case 49:
          case 51:
          case 52:
          case 54:
          case 55:
          case 58:
          case 60:
          case 62:
          case 64:
          case 65:
          case 66:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 76:
          case 77:
          case 78:
          case 80:
          case 81:
          }
        }
      }
    }
    if (localbr.dj().size() > 0)
      a(localbr);
    if ((this.jE != 3) && (localbr.dj().size() > 0))
    {
      this.jdField_byte = true;
      y().da();
    }
  }

  private void dI()
  {
    ak localak;
    (localak = (ak)a5.es.cf().elementAt(4)).jdMethod_if(bm.bd[this.la]);
    a5.e8.cQ = this.la;
  }

  public final void dy()
  {
    if (this.kN != null)
      this.kN.removeAllElements();
  }

  public final void x(byte paramByte)
  {
    this.jJ = paramByte;
  }

  public final void a(byte paramByte)
  {
    super.a(paramByte);
    switch (this.y)
    {
    case 0:
    case 3:
    case 4:
    case 5:
      this.jJ = z$132bd3();
      return;
    case 1:
      this.jJ = z$132bd3();
      return;
    case 2:
      this.jJ = z$132bd3();
    }
  }

  public final void p(boolean paramBoolean)
  {
    this.kV = paramBoolean;
  }

  public final void n(boolean paramBoolean)
  {
    this.kX = paramBoolean;
  }

  public final boolean b()
  {
    if (a5.gZ)
    {
      Object localObject;
      if ((this.i3 != null) && ((localObject = (localObject = this.i3).U) != null) && (((af)localObject).b()))
        return true;
      int i = 0;
      switch (this.y)
      {
      case 0:
      case 3:
      case 4:
      case 5:
        i = dp();
        break;
      case 1:
        i = m.jdMethod_else();
        break;
      case 2:
        i = m.jdMethod_do();
      }
      int j = this.jl;
      int k = this.kN.size() < this.jJ ? this.kN.size() : this.jJ + this.jl;
      while (j < k)
      {
        if (a5.a(this.kD, this.kC + (j - this.jl) + (j - this.jl) * i, dF(), i))
        {
          if (this.la == j)
            return false;
          b5.p = 0;
          b5.d = 0;
          this.la = (byte)j;
          if (a5.es.g9 == 262153)
          {
            bv localbv = this;
            if (this.kN.size() > 0)
            {
              localbv = this;
              C(((m)this.kN.elementAt(this.la)).jdMethod_char());
            }
          }
          else if ((a5.es.g9 == 1900548) || (a5.es.g9 == 1900546))
          {
            dE();
          }
          if (a5.jdMethod_else() == 16)
            dI();
          return true;
        }
        j++;
      }
    }
    return true;
  }

  private short dp()
  {
    int i = 0;
    if (this.kV)
      i = (short)(a5.iG + 6);
    else
      i = (short)a5.iG;
    return i;
  }

  public static final void a(bv parambv, byte paramByte)
  {
    if (parambv.kN.size() > parambv.z$132bd3())
    {
      localObject = parambv;
      if ((localObject = parambv.i3).U == null)
      {
        localObject = parambv;
        parambv.i3.jdMethod_new(false);
        break label139;
      }
    }
    if (parambv.kN.size() <= parambv.z$132bd3())
    {
      localObject = parambv;
      if ((localObject = parambv.i3).U != null)
      {
        b5.jdMethod_case("list.items.size()" + parambv.kN.size() + "   list.getCanShowCol(" + paramByte + ")=" + parambv.z$132bd3());
        paramByte = parambv;
        localObject = parambv;
        if ((paramByte = parambv.i3).U != null)
          paramByte.U = null;
      }
    }
    label139: Object localObject = parambv;
    if ((localObject = parambv.i3).U != null)
    {
      localObject = parambv;
      paramByte = 0;
      (localObject = (localObject = parambv.i3).U).aj = paramByte;
      localObject = parambv;
      (localObject = parambv.i3).U.az = (short)parambv.kN.size();
      localObject = parambv;
      (localObject = parambv.i3).U.ay = (short)parambv.z$132bd3();
    }
  }

  private void u(int paramInt)
  {
    (a5.es = e.a("/ui/unlearn.ui")).g9 = paramInt;
    (paramInt = (bv)a5.es.cf().elementAt(2)).dy();
    paramInt.a(5);
    this = this;
    this = bp.ag().m((byte)t(this.la));
    for (int i = 0; i < this.length; i = (byte)(i + 1))
    {
      bp.ag();
      m localm;
      bp.ag();
      (localm = new m("" + bp.eQ[this[i]], 8, 0, paramInt.dF())).jdMethod_if(bp.eD[this[i]]);
      paramInt.a(localm);
    }
    bv localbv = this;
    (this = paramInt).j4 = localbv;
    a(paramInt, 0);
  }

  public static final void a(int paramInt, short paramShort)
  {
    (a5.es = e.a("/ui/skilldetail.ui")).g9 = paramInt;
    (paramInt = (ah)a5.es.cf().elementAt(3)).a(5);
    bp.ag();
    paramInt.a(bp.eQ[paramShort]);
    paramInt = (ak)a5.es.cf().elementAt(4);
    String str = bp.fu[paramShort] + "\n\n" + "习得技能需要:" + bp.en[paramShort] + "级\n\n" + bm.bB[bp.eW[paramShort]] + bp.fN[paramShort];
    paramInt.jdMethod_if(str);
    paramInt.ap();
    paramInt = (a7)a5.es.cf().elementAt(5);
    paramShort = bp.eD[paramShort];
    paramInt.fC = (byte)(paramShort / 1000 - 1);
    if (paramInt.fC == -1)
      paramInt.fC = 1;
    paramInt.ft = true;
    paramShort = (short)(paramShort % 1000);
    paramInt.jdMethod_if(paramShort, true);
    paramInt.a(a5.gg);
  }

  private void dA()
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (this.la == 0)
    {
      bw.e = true;
      a5.d6.addElement(a5.es);
      (a5.es = e.a("/ui/ulist.ui")).g9 = -1610612725;
      (localObject1 = (ao)a5.es.cf().elementAt(0)).jdMethod_do("拍　卖");
      (localObject2 = (ao)a5.es.cf().elementAt(1)).a("确定", 0);
      (localObject3 = (bv)a5.es.cf().elementAt(2)).dy();
      for (int i = 0; i < bm.bH.length; i++)
        ((bv)localObject3).a(new m(bm.bH[i], 0, 0, ((bv)localObject3).dF()));
      ((bv)localObject3).jE = 19;
      a((bv)localObject3, 0);
      return;
    }
    if (this.la == 1)
    {
      a5.d6.addElement(a5.es);
      a5.eQ.a(1900547);
      return;
    }
    if (this.la == 2)
    {
      a5.d6.addElement(a5.es);
      a5.eQ.a(1900548);
      return;
    }
    if (this.la == 3)
    {
      localObject1 = new Form("搜索物品");
      localObject2 = new TextField("请输入物品名称:", "", 6, 0);
      ((Form)localObject1).append((Item)localObject2);
      localObject3 = new Command("搜索", 4, 0);
      Command localCommand = new Command("返回", 3, 1);
      ((Displayable)localObject1).addCommand((Command)localObject3);
      ((Displayable)localObject1).addCommand(localCommand);
      ((Displayable)localObject1).setCommandListener(new CommandListener((Command)localObject3, (TextField)localObject2, (Form)localObject1, localCommand)
      {
        private final Command val$okCmd;
        private final TextField val$tf;
        private final Form val$form;
        private final Command val$exitCmd;

        public final void commandAction(Command paramCommand, Displayable paramDisplayable)
        {
          if (paramCommand == this.val$okCmd)
          {
            if (((bw.new = this.val$tf.getString()) != null) && (!bw.new.equals("")))
            {
              bw.e = false;
              bw.a();
              a5.eQ.a(1900554);
              a5.e8.setFullScreenMode(true);
              a5.dI.display.setCurrent(a5.e8);
              a5.d6.addElement(a5.es);
              return;
            }
            paramCommand = new Alert(bm.a2[9], "物品名称不能为空", null, AlertType.ERROR);
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
      a5.dI.display.setCurrent((Displayable)localObject1);
    }
  }

  private void dE()
  {
    Object localObject = this;
    localObject = this;
    this = (m)this.kN.elementAt(this.la);
    localObject = (a7)a5.es.cf().elementAt(5);
    ah localah = (ah)a5.es.cf().elementAt(8);
    a9 locala91 = (a9)a5.es.cf().elementAt(7);
    a9 locala92 = (a9)a5.es.cf().elementAt(10);
    a9 locala93 = (a9)a5.es.cf().elementAt(12);
    ((a7)localObject).g(this.B);
    ((a7)localObject).jdMethod_if((short)(this.B % 1000), true);
    r.E(this.v);
    if (this.y == 1)
      ((a7)localObject).g(false);
    else
      ((a7)localObject).a(true, this.g);
    localah.jdMethod_case(this.f);
    locala91.a(new StringBuffer(this.r + ""));
    locala92.a(new StringBuffer(this.jdField_i_of_type_Int + ""));
    locala93.a(new StringBuffer(this.l));
  }

  private static void B(byte paramByte)
  {
    ah localah;
    (localah = (ah)a5.es.cf().elementAt(6)).jdMethod_case(null[paramByte]);
  }

  public static void C(byte paramByte)
  {
    ao localao = (ao)a5.es.cf().elementAt(1);
    String str = "";
    if (paramByte == 1)
      str = "选择";
    else if (paramByte == 2)
      str = "";
    else if (paramByte == 3)
      str = "选择";
    else if (paramByte == 4)
      str = "查看";
    localao.a(str, 0);
  }

  private void dG()
  {
    az.g = new Vector();
    for (int i = 0; i < az.do.length; i++)
    {
      if ((((m)this.kN.elementAt(this.la)).b() & 1 << i) != 0)
        az.g.addElement(new Byte((byte)i));
      int[] arrayOfInt1 = new int[az.g.size()];
      int[] arrayOfInt2 = new int[az.g.size()];
      String[] arrayOfString = new String[az.g.size()];
      for (int j = 0; j < az.g.size(); j++)
      {
        arrayOfInt1[j] = 2555966;
        arrayOfInt2[j] = az.b[((Byte)az.g.elementAt(j)).byteValue()];
        arrayOfString[j] = az.l[((Byte)az.g.elementAt(j)).byteValue()];
      }
      br localbr;
      (localbr = new br(0)).a(arrayOfString, arrayOfInt1, arrayOfInt2);
      a(localbr);
      this.jdField_byte = true;
      y().da();
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bv
 * JD-Core Version:    0.6.0
 */
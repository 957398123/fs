import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public abstract class ba
{
  public static boolean q = true;
  protected byte y;
  protected short a;
  protected short jdField_int;
  protected short k;
  protected short j;
  protected boolean b;
  private boolean jdField_char;
  protected be jdField_new;
  private byte g;
  private byte o;
  private byte f;
  private byte u;
  protected short r = -1;
  private boolean h = false;
  protected boolean d = false;
  private br s = null;
  public boolean jdField_byte = false;
  private boolean jdField_long = false;
  public boolean jdField_else = true;
  public long n;
  public long m;
  public boolean e = true;
  public boolean jdField_if = false;

  public ba(short paramShort1, short paramShort2, short paramShort3, short paramShort4, be parambe)
  {
    this.jdField_new = parambe;
    if (q)
    {
      this.k = (short)(paramShort1 * a5.ic / 176);
      this.j = (short)(paramShort2 * a5.il / 208);
      this.a = (short)(paramShort3 * a5.ic / 176);
      this.jdField_int = (short)(paramShort4 * a5.il / 208);
      return;
    }
    this.k = paramShort1;
    this.j = paramShort2;
    this.a = paramShort3;
    this.jdField_int = paramShort4;
  }

  public final void a(byte paramByte1, byte paramByte2)
  {
    switch (paramByte1)
    {
    case 0:
      this.g = paramByte2;
      return;
    case 1:
      this.o = paramByte2;
      return;
    case 2:
      this.f = paramByte2;
      return;
    case 3:
      this.u = paramByte2;
    }
  }

  public final void w()
  {
    a(0, -1);
    a(1, -1);
    a(2, -1);
    a(3, -1);
  }

  public byte jdField_if(byte paramByte)
  {
    switch (paramByte)
    {
    case 0:
      return this.g;
    case 1:
      return this.o;
    case 2:
      return this.f;
    case 3:
      return this.u;
    }
    return -1;
  }

  private ba a(be parambe, byte paramByte)
  {
    if (((this = jdField_if(paramByte)) >= 1) && (this - 1 < parambe.cf().size()))
      return (ba)parambe.cf().elementAt(this - 1);
    return null;
  }

  public abstract void a(Graphics paramGraphics);

  public final void jdField_if(Graphics paramGraphics)
  {
    paramGraphics.setColor(5450262);
    paramGraphics.drawRoundRect(0, 0, 0, 0, 8, 8);
    paramGraphics.setColor(16117971);
    paramGraphics.fillRoundRect(1, 1, -1, -1, 8, 8);
  }

  protected void f()
  {
  }

  public static void jdMethod_goto()
  {
    switch (a5.es.g9)
    {
    case 1245185:
      Object localObject = null;
      r localr = null;
      int i = 0;
      int i1 = a5.es.cf().size();
      while (i < i1)
      {
        if ((((ba)a5.es.cf().elementAt(i) instanceof a7)) && (((ba)a5.es.cf().elementAt(i)).jdField_char() == 3) && (((ba)a5.es.cf().elementAt(i)).jdField_char))
        {
          a7 locala7;
          (locala7 = (a7)a5.es.cf().elementAt(i)).k(1);
          a7.fF = locala7.bC();
          if ((((ba)a5.es.cf().elementAt(22) instanceof ah)) && ((localObject = (ah)a5.es.cf().elementAt(22)).jdField_char() == 1))
          {
            ((ah)localObject).a(locala7.bv());
            ((ah)localObject).jdField_char(r.E(locala7.bD()));
          }
        }
        if ((((ba)a5.es.cf().elementAt(23) instanceof r)) && ((localObject = (ba)a5.es.cf().elementAt(23)).r == 6) && ((localObject = (ba)a5.es.cf().elementAt(23)).jdField_char))
          localr = (r)a5.es.cf().elementAt(23);
        if ((localr != null) && (((ba)a5.es.cf().elementAt(22) instanceof ah)) && ((localObject = (ah)a5.es.cf().elementAt(22)).jdField_char() == 1))
        {
          ((ah)localObject).a(localr.mV[0]);
          if (localr.mQ[localr.ep()] != -1)
          {
            ((ah)localObject).a(localr.mV[localr.ep()]);
            ((ah)localObject).jdField_char(r.E(localr.ne[localr.ep()]));
          }
          else
          {
            ((ah)localObject).a("");
          }
        }
        i++;
      }
    }
  }

  public static void jdField_byte()
  {
    switch (a5.es.g9)
    {
    case 393230:
      ah localah = null;
      int i = 0;
      int i1 = a5.es.cf().size();
      while (i < i1)
      {
        if ((((ba)a5.es.cf().elementAt(i) instanceof a7)) && (((ba)a5.es.cf().elementAt(i)).jdField_char() == 3) && (((ba)a5.es.cf().elementAt(i)).jdField_char))
        {
          a7 locala7;
          (locala7 = (a7)a5.es.cf().elementAt(i)).k(2);
          a7.fF = locala7.bC();
          (localah = (ah)a5.es.cf().elementAt(4)).a(locala7.bv());
          if (locala7.bD() == -1)
            localah.jdField_char(bm.bP);
          else
            localah.jdField_char(r.E(locala7.bD()));
        }
        i++;
      }
    }
  }

  public static void r()
  {
    switch (a5.es.g9)
    {
    case 458755:
    case 458817:
    case 917505:
    case 917506:
    case 917509:
    case 917510:
    case 917511:
    case 939349:
    case 1966086:
      null;
      ah localah = (ah)a5.es.cf().elementAt(22);
      ao localao = (ao)a5.es.cf().elementAt(1);
      Object localObject;
      if (((a5.es.hf instanceof a7)) && (a5.es.hf.jdField_char() == 3))
      {
        if (a5.es.g9 == 1966086)
          localao.a("操作", 0);
        (localObject = (a7)a5.es.hf).k(0);
        a7.fF = ((a7)localObject).bC();
        localah.a(((a7)localObject).bv());
        if (((a7)localObject).bD() == -1)
        {
          localah.jdField_char(bm.bP);
        }
        else
        {
          localah.jdField_char(r.E(((a7)localObject).bD()));
          return;
        }
      }
      else
      {
        if (!(a5.es.hf instanceof r))
          break;
        localObject = (r)a5.es.hf;
        a7.fF = -1;
        localah = (ah)a5.es.cf().elementAt(22);
        if (localObject.mQ[localObject.ep()] != -1)
        {
          localah.a(localObject.mV[localObject.ep()]);
          localah.jdField_char(r.E(localObject.ne[localObject.ep()]));
          return;
        }
        localah.a("");
        if (a5.es.g9 != 1966086)
          break;
        localao.a("", 0);
      }
    }
  }

  public static void jdField_int()
  {
    switch (a5.es.g9)
    {
    case 917520:
    case 917521:
    case 917522:
    case 1638431:
    case 1638432:
    case 1638433:
      ah localah = null;
      localah = null;
      localah = null;
      localah = null;
      int i = 0;
      int i1 = 0;
      int i2 = a5.es.cf().size();
      a7 locala7;
      while (i1 < i2)
      {
        if ((((ba)a5.es.cf().elementAt(i1) instanceof a7)) && (((ba)a5.es.cf().elementAt(i1)).jdField_char() == 3))
        {
          locala7 = (a7)a5.es.cf().elementAt(i1);
          i += locala7.bo();
        }
        i1++;
      }
      i1 = 0;
      i2 = a5.es.cf().size();
      while (i1 < i2)
      {
        if ((((ba)a5.es.cf().elementAt(i1) instanceof a7)) && (((ba)a5.es.cf().elementAt(i1)).jdField_char() == 3) && (((ba)a5.es.cf().elementAt(i1)).jdField_char))
        {
          (locala7 = (a7)a5.es.cf().elementAt(i1)).k(0);
          a7.fF = locala7.bC();
          if ((localah = (ah)a5.es.cf().elementAt(22)).jdField_char() == 1)
          {
            localah.a(locala7.bv());
            if (locala7.bD() == -1)
              localah.jdField_char(bm.bP);
            else
              localah.jdField_char(r.E(locala7.bD()));
          }
          localah = (ah)a5.es.cf().elementAt(25);
          if (locala7.bK() != -1)
            localah.a(locala7.bH() + "/" + locala7.br());
          else
            localah.a("");
          (localah = (ah)a5.es.cf().elementAt(27)).a(i + "");
          localah = (ah)a5.es.cf().elementAt(29);
          if (locala7.bK() != -1)
            localah.a(locala7.bo() + "");
          else
            localah.a("0");
        }
        i1++;
      }
    }
  }

  public static void a()
  {
    switch (a5.es.g9)
    {
    case 1376260:
    case 1376261:
    case 1376265:
    case 1376268:
      ah localah;
      (localah = (ah)a5.es.cf().elementAt(4)).jdMethod_void(true);
      localah.jdField_new((short)(a5.ic >> 1));
      (localah = (ah)a5.es.cf().elementAt(16)).jdMethod_void(true);
      localah.jdField_new((short)(a5.ic >> 1));
    case 1376262:
    case 1376263:
    case 1376264:
    case 1376266:
    case 1376267:
    }
  }

  public static void i()
  {
    switch (a5.es.g9)
    {
    case 1376260:
    case 1376261:
    case 1376265:
    case 1376268:
      ah localah1 = (ah)a5.es.cf().elementAt(5);
      ah localah2 = (ah)a5.es.cf().elementAt(17);
      if (((ba)a5.es.cf().elementAt(27) instanceof a9))
      {
        a9 locala9;
        (locala9 = (a9)a5.es.cf().elementAt(27)).jdField_if(be.gG);
        be.gs = locala9.b3();
        if (be.hC)
        {
          be.gs = 0;
          be.hC = false;
        }
        locala9.jdMethod_void(Integer.toString(be.gs));
      }
      int i = 0;
      int i1 = a5.es.cf().size();
      while (i < i1)
      {
        if ((((ba)a5.es.cf().elementAt(i) instanceof a7)) && (((ba)a5.es.cf().elementAt(i)).jdField_char() == 1) && (((ba)a5.es.cf().elementAt(i)).jdField_char))
        {
          b5.jdMethod_case("？！？！？！------------交易图片索引：  " + i);
          a7 locala7;
          if ((locala7 = (a7)a5.es.cf().elementAt(i)).r == 34)
          {
            localah1.a(locala7.bv());
            be.hd = false;
            be.hH = (byte)(i - 7);
            localah1.jdField_char(r.E(locala7.bD()));
          }
          else if (locala7.r == 35)
          {
            localah2.a(locala7.bv());
            be.hd = true;
            be.hH = (byte)(i - 20);
            localah2.jdField_char(r.E(locala7.bD()));
          }
        }
        else if ((((ba)a5.es.cf().elementAt(i)).jdField_char) && (!((ba)a5.es.cf().elementAt(i) instanceof a7)))
        {
          localah1.a("");
          localah2.a("");
        }
        i++;
      }
    case 1376262:
    case 1376263:
    case 1376264:
    case 1376266:
    case 1376267:
    }
  }

  public static void j()
  {
    switch (a5.es.g9)
    {
    case 1769473:
    case 1769474:
    case 1769476:
    case 1769478:
    case 1769479:
    case 1769480:
    case 1769488:
    case 1769489:
    case 1769490:
    case 1769491:
    case 1769492:
      r localr = null;
      ah localah = null;
      if (((ba)a5.es.cf().elementAt(3)).jdField_char)
        localr = (r)a5.es.cf().elementAt(3);
      else if (((ba)a5.es.cf().elementAt(5)).jdField_char)
        localr = (r)a5.es.cf().elementAt(5);
      if (localr == null)
        break;
      (localah = (ah)a5.es.cf().elementAt(4)).a(localr.mV[0]);
      if (localr.mQ[localr.ep()] != -1)
      {
        localah.a(localr.mV[localr.ep()]);
        localah.jdField_char(r.E(localr.ne[localr.ep()]));
        return;
      }
      localah.a("");
    case 1769475:
    case 1769477:
    case 1769481:
    case 1769482:
    case 1769483:
    case 1769484:
    case 1769485:
    case 1769486:
    case 1769487:
    }
  }

  public static void jdMethod_void()
  {
    switch (a5.es.g9)
    {
    case 983041:
    case 983042:
    case 983043:
    case 983044:
    case 983045:
    case 983046:
    case 983047:
    case 983048:
    case 983049:
    case 983056:
    case 983057:
    case 983058:
      r localr = null;
      ah localah = null;
      localah = null;
      localah = null;
      localah = (ah)a5.es.cf().elementAt(11);
      ba localba;
      if ((((ba)a5.es.cf().elementAt(3) instanceof r)) && (((localba = (ba)a5.es.cf().elementAt(3)).r == 15) || ((localba = (ba)a5.es.cf().elementAt(3)).r == 42)) && ((localba = (ba)a5.es.cf().elementAt(3)).jdField_char))
      {
        localr = (r)a5.es.cf().elementAt(3);
        localah.a(localah.a1[0]);
      }
      else if ((((ba)a5.es.cf().elementAt(5) instanceof r)) && ((localba = (ba)a5.es.cf().elementAt(5)).r == 6) && ((localba = (ba)a5.es.cf().elementAt(5)).jdField_char))
      {
        localr = (r)a5.es.cf().elementAt(5);
        localah.a(localah.a1[1]);
      }
      if (localr == null)
        break;
      if ((((ba)a5.es.cf().elementAt(4) instanceof ah)) && ((localah = (ah)a5.es.cf().elementAt(4)).jdField_char() == 1))
        if (localr.mQ[localr.ep()] != -1)
        {
          localah.a(localr.mV[localr.ep()]);
          localah.jdField_char(r.E(localr.ne[localr.ep()]));
        }
        else
        {
          localah.a("");
        }
      if ((((ba)a5.es.cf().elementAt(10) instanceof ah)) && ((localah = (ah)a5.es.cf().elementAt(10)).jdField_char() == 4))
      {
        localah.a(Integer.toString(localr.mN[0]));
        if (localr.mQ[localr.ep()] != -1)
          localah.a(Integer.toString(localr.mN[localr.ep()]));
        else
          localah.a("");
      }
      if (!((ba)a5.es.cf().elementAt(7) instanceof ah))
        break;
      a5.es.cf().elementAt(7);
    case 983050:
    case 983051:
    case 983052:
    case 983053:
    case 983054:
    case 983055:
    }
  }

  public static void x()
  {
    switch (a5.es.g9)
    {
    case 1179649:
    case 1179650:
    case 1179651:
    case 1179652:
    case 1179653:
    case 1179654:
    case 1179655:
    case 1179657:
    case 1638423:
      r localr = null;
      Object localObject = null;
      if ((localObject = (ba)a5.es.cf().elementAt(6)).jdField_char)
        localr = (r)a5.es.cf().elementAt(6);
      else if ((localObject = (ba)a5.es.cf().elementAt(8)).jdField_char)
        localr = (r)a5.es.cf().elementAt(8);
      if (localr == null)
        break;
      localObject = (ah)a5.es.cf().elementAt(7);
      if (localr.mQ[localr.ep()] != -1)
      {
        ((ah)localObject).a(localr.mV[localr.ep()]);
        ((ah)localObject).jdField_char(r.E(localr.ne[localr.ep()]));
        return;
      }
      ((ah)localObject).a("");
    }
  }

  public static void g()
  {
    if (a5.es != null)
      try
      {
        j();
        i();
        r();
        jdField_int();
        jdField_byte();
        jdMethod_goto();
        jdMethod_void();
        x();
        Object localObject1 = (ao)a5.es.cf().elementAt(1);
        Object localObject2;
        Object localObject3;
        Object localObject6;
        Object localObject7;
        Object localObject9;
        Object localObject8;
        Object localObject4;
        Object localObject5;
        int i2;
        switch (a5.es.g9)
        {
        case 917525:
        case 2031621:
        case 2031636:
        case 3342356:
          localObject2 = (ah)a5.es.cf().elementAt(14);
          localObject3 = (a7)a5.es.cf().elementAt(4);
          localObject6 = (a7)a5.es.cf().elementAt(6);
          if ((localObject9 = localObject7 = (r)a5.es.cf().elementAt(9)).jdField_char)
          {
            if (localObject7.mQ[localObject7.ep()] != -1)
            {
              ((ao)localObject1).a("操作", 0);
              ((ah)localObject2).a(localObject7.mV[localObject7.ep()]);
              ((ah)localObject2).jdField_char(r.E(localObject7.ne[localObject7.ep()]));
            }
            else
            {
              ((ao)localObject1).a("", 0);
              ((ah)localObject2).a("");
            }
          }
          else
          {
            ((ao)localObject1).a("操作", 0);
            if ((localObject9 = localObject3).jdField_char)
            {
              if (aq.a != -1)
              {
                ((ah)localObject2).a(localObject7.mV[aq.a]);
                ((ah)localObject2).jdField_char(r.E(localObject7.ne[aq.a]));
              }
              else
              {
                ((ah)localObject2).jdField_char(bm.bP);
                if (a5.es.g9 == 2031636)
                {
                  ((ah)localObject2).a("此处放置开封的装备");
                }
                else if (a5.es.g9 == 2031621)
                {
                  ((ah)localObject2).a("此处放置原石");
                }
                else if (a5.es.g9 == 3342356)
                {
                  ((ah)localObject2).a("此处放置需要铭刻的法宝");
                }
                else
                {
                  if (a5.es.g9 != 917525)
                    break;
                  ((ah)localObject2).a("此处放置需要强化的装备");
                }
              }
            }
            else
            {
              if (!(localObject9 = localObject6).jdField_char)
                break;
              if (aq.jdField_int != -1)
              {
                ((ah)localObject2).a(localObject7.mV[aq.jdField_int]);
                ((ah)localObject2).jdField_char(r.E(localObject7.ne[aq.jdField_int]));
              }
              else
              {
                ((ah)localObject2).jdField_char(bm.bP);
                if (a5.es.g9 == 2031636)
                {
                  ((ah)localObject2).a("此处放置开封卷轴");
                }
                else if (a5.es.g9 == 2031621)
                {
                  ((ah)localObject2).a("此处放置雕琢符");
                }
                else if (a5.es.g9 == 3342356)
                {
                  ((ah)localObject2).a("此处放置法宝铭文");
                }
                else
                {
                  if (a5.es.g9 != 917525)
                    break;
                  ((ah)localObject2).a("此处放置装备强化符");
                }
              }
            }
          }
          break;
        case 2228225:
          localObject2 = (ah)a5.es.cf().elementAt(14);
          localObject3 = (a7)a5.es.cf().elementAt(4);
          if ((localObject9 = localObject6 = (r)a5.es.cf().elementAt(7)).jdField_char)
          {
            if (localObject6.mQ[localObject6.ep()] != -1)
            {
              ((ao)localObject1).a("操作", 0);
              ((ah)localObject2).a(localObject6.mV[localObject6.ep()]);
              ((ah)localObject2).jdField_char(r.E(localObject6.ne[localObject6.ep()]));
            }
            else
            {
              ((ao)localObject1).a("", 0);
              ((ah)localObject2).a("");
            }
          }
          else
          {
            ((ao)localObject1).a("操作", 0);
            if (!(localObject9 = localObject3).jdField_char)
              break;
            if (aj.jdField_byte != -1)
            {
              if (localObject6.mQ[aj.jdField_byte] != -1)
              {
                ((ah)localObject2).a(localObject6.mV[aj.jdField_byte]);
                ((ah)localObject2).jdField_char(r.E(localObject6.ne[aj.jdField_byte]));
              }
              else
              {
                ((ah)localObject2).a(aj.try);
                ((ah)localObject2).jdField_char(r.E(aj.jdField_char));
              }
            }
            else
            {
              ((ah)localObject2).jdField_char(bm.bP);
              ((ah)localObject2).a("此处放置原石");
            }
          }
          break;
        case 1966097:
          localObject2 = (ah)a5.es.cf().elementAt(10);
          localObject3 = (a7)a5.es.cf().elementAt(4);
          localObject6 = (a7)a5.es.cf().elementAt(6);
          if ((localObject9 = localObject7 = (r)a5.es.cf().elementAt(7)).jdField_char)
          {
            if (localObject7.mQ[localObject7.ep()] != -1)
            {
              ((ao)localObject1).a("操作", 0);
              ((ah)localObject2).a(localObject7.mV[localObject7.ep()]);
              ((ah)localObject2).jdField_char(r.E(localObject7.ne[localObject7.ep()]));
            }
            else
            {
              ((ao)localObject1).a("", 0);
              ((ah)localObject2).a("");
            }
          }
          else
          {
            ((ao)localObject1).a("操作", 0);
            if ((localObject9 = localObject3).jdField_char)
            {
              if (au.jdField_int != -1)
              {
                ((ah)localObject2).a(localObject7.mV[au.jdField_int]);
                ((ah)localObject2).jdField_char(r.E(localObject7.ne[au.jdField_int]));
              }
              else
              {
                ((ah)localObject2).jdField_char(bm.bP);
                ((ah)localObject2).a("此处放置装备");
              }
            }
            else
            {
              if (!(localObject9 = localObject6).jdField_char)
                break;
              if (au.try != -1)
              {
                ((ah)localObject2).a(localObject7.mV[au.try]);
                ((ah)localObject2).jdField_char(r.E(localObject7.ne[au.try]));
              }
              else
              {
                ((ah)localObject2).jdField_char(bm.bP);
                ((ah)localObject2).a("此处放置解除符");
              }
            }
          }
          break;
        case 1900547:
          localObject2 = (a7)a5.es.cf().elementAt(3);
          localObject3 = (a9)a5.es.cf().elementAt(4);
          localObject6 = (ay)a5.es.cf().elementAt(6);
          localObject7 = (r)a5.es.cf().elementAt(8);
          if (((localObject9 = localObject2).jdField_char) || ((localObject9 = localObject3).jdField_char) || ((localObject9 = localObject6).jdField_char))
          {
            if (bw.a == 1)
            {
              ((ao)localObject1).a("操作", 0);
            }
            else
            {
              if (bw.a != 0)
                break;
              ((ao)localObject1).a("", 0);
            }
          }
          else
          {
            if (!(localObject9 = localObject7).jdField_char)
              break;
            ((ao)localObject1).a("操作", 0);
          }
          break;
        case 1376260:
          if (((localObject9 = localObject2 = (a9)a5.es.cf().elementAt(27)).jdField_char) && (((a9)localObject2).cc().toString().equals("0")))
            ((ao)localObject1).a("输入", 0);
          else if (((localObject9 = localObject2).jdField_char) && (!((a9)localObject2).cc().toString().equals("0")))
            ((ao)localObject1).a("修改", 0);
          else
            ((ao)localObject1).a("操作", 0);
          break;
        case 2424833:
          localObject2 = (ah)a5.es.cf().elementAt(3);
          localObject3 = (ah)a5.es.cf().elementAt(4);
          localObject6 = (ah)a5.es.cf().elementAt(5);
          localObject7 = (ah)a5.es.cf().elementAt(6);
          localObject1 = (ah)a5.es.cf().elementAt(7);
          ah localah = (ah)a5.es.cf().elementAt(9);
          localObject8 = (ak)a5.es.cf().elementAt(8);
          if ((localObject9 = localObject2).jdField_char)
          {
            ((ak)localObject8).jdField_if(bo.n[0]);
          }
          else if ((localObject9 = localObject3).jdField_char)
          {
            ((ak)localObject8).jdField_if(bo.n[1]);
          }
          else if ((localObject9 = localObject6).jdField_char)
          {
            ((ak)localObject8).jdField_if(bo.n[2]);
          }
          else if ((localObject9 = localObject7).jdField_char)
          {
            ((ak)localObject8).jdField_if(bo.n[3]);
          }
          else
          {
            localObject9 = localObject1;
            if (localObject1.jdField_char)
            {
              ((ak)localObject8).jdField_if(bo.n[4]);
            }
            else
            {
              if (!(localObject9 = localah).jdField_char)
                break;
              ((ak)localObject8).jdField_if(bo.n[5]);
            }
          }
          break;
        case 2424840:
          localObject2 = (ah)a5.es.cf().elementAt(3);
          localObject3 = (ah)a5.es.cf().elementAt(4);
          localObject6 = (ak)a5.es.cf().elementAt(5);
          if ((localObject9 = localObject2).jdField_char)
          {
            ((ak)localObject6).jdField_if(bo.n[0]);
          }
          else
          {
            if (!(localObject9 = localObject3).jdField_char)
              break;
            ((ak)localObject6).jdField_if(bo.n[1]);
          }
          break;
        case 2555905:
          localObject2 = (ah)a5.es.cf().elementAt(3);
          localObject3 = (ah)a5.es.cf().elementAt(4);
          localObject6 = (ah)a5.es.cf().elementAt(6);
          localObject7 = (ah)a5.es.cf().elementAt(10);
          localObject1 = (ah)a5.es.cf().elementAt(8);
          for (int i3 = 0; i3 < 12; i3++)
          {
            if ((!(localObject9 = localObject8 = (a7)a5.es.cf().elementAt(i3 + 11)).jdField_char) || (((a7)localObject8).bN() == 0))
              continue;
            ((ah)localObject2).a(((a7)localObject8).bn());
            ((ah)localObject3).a(((a7)localObject8).bY());
            ((ah)localObject6).jdMethod_case(((a7)localObject8).bz());
            ((ah)localObject7).a(((a7)localObject8).by());
            if (((a7)localObject8).bJ() == -1)
            {
              ((ah)localObject1).a(az.i[0]);
            }
            else if (((a7)localObject8).bJ() == 0)
            {
              ((ah)localObject1).a(az.i[1]);
            }
            else if ((((a7)localObject8).bJ() >= 1) && (((a7)localObject8).bJ() <= 30))
            {
              ((ah)localObject1).a(az.i[2]);
            }
            else if ((((a7)localObject8).bJ() >= 31) && (((a7)localObject8).bJ() <= 70))
            {
              ((ah)localObject1).a(az.i[3]);
            }
            else
            {
              if ((((a7)localObject8).bJ() < 71) || (((a7)localObject8).bJ() > 100))
                continue;
              ((ah)localObject1).a(az.i[4]);
            }
          }
          for (i3 = 0; i3 < 6; i3++)
          {
            if ((!(localObject9 = localObject8 = (a7)a5.es.cf().elementAt(i3 + 25)).jdField_char) || (((a7)localObject8).bN() == 0))
              continue;
            ((ah)localObject2).a(((a7)localObject8).bn());
            ((ah)localObject3).a(((a7)localObject8).bY());
            ((ah)localObject6).jdMethod_case(((a7)localObject8).bz());
            ((ah)localObject7).a(((a7)localObject8).by());
            if (((a7)localObject8).bJ() == -1)
            {
              ((ah)localObject1).a(az.i[0]);
            }
            else if (((a7)localObject8).bJ() == 0)
            {
              ((ah)localObject1).a(az.i[1]);
            }
            else if ((((a7)localObject8).bJ() >= 1) && (((a7)localObject8).bJ() <= 30))
            {
              ((ah)localObject1).a(az.i[2]);
            }
            else if ((((a7)localObject8).bJ() >= 31) && (((a7)localObject8).bJ() <= 70))
            {
              ((ah)localObject1).a(az.i[3]);
            }
            else
            {
              if ((((a7)localObject8).bJ() < 71) || (((a7)localObject8).bJ() > 100))
                continue;
              ((ah)localObject1).a(az.i[4]);
            }
          }
          break;
        case 2555906:
          localObject2 = (ah)a5.es.cf().elementAt(10);
          for (int i = 0; i < 3; i++)
          {
            if (!(localObject9 = localObject6 = (a7)a5.es.cf().elementAt(i + 11)).jdField_char)
              continue;
            ((ah)localObject2).a(az.jdField_byte[i]);
          }
          if ((localObject9 = localObject4 = (ak)a5.es.cf().elementAt(15)).jdField_char)
          {
            if (az.h == 0)
              ((ao)localObject1).a("编辑", 0);
            else
              ((ao)localObject1).a("", 0);
          }
          else if (az.h == 0)
            ((ao)localObject1).a("操作", 0);
          else
            ((ao)localObject1).a("查看", 0);
          break;
        case 2555908:
        case 2555957:
          localObject2 = (ah)a5.es.cf().elementAt(4);
          localObject4 = (ah)a5.es.cf().elementAt(7);
          localObject6 = (r)a5.es.cf().elementAt(3);
          localObject7 = (r)a5.es.cf().elementAt(5);
          if ((localObject9 = localObject6).jdField_char)
          {
            ((ah)localObject2).a(localObject6.mV[localObject6.ep()]);
            ((ah)localObject2).jdField_char(r.E(localObject6.ne[localObject6.ep()]));
            ((ah)localObject4).jdMethod_case(az.a[localObject6.ep()]);
            if ((!localObject6.mV[localObject6.mz].equals("")) && (localObject6.mV[localObject6.mz] != null))
              ((ao)localObject1).a("操作", 0);
            else
              ((ao)localObject1).a("", 0);
          }
          else
          {
            if (!(localObject9 = localObject7).jdField_char)
              break;
            ((ah)localObject2).a(localObject7.mV[localObject7.ep()]);
            ((ah)localObject2).jdField_char(r.E(localObject7.ne[localObject7.ep()]));
            if ((!localObject7.mV[localObject7.mz].equals("")) && (localObject7.mV[localObject7.mz] != null))
            {
              ((ah)localObject4).jdMethod_case(localObject7.mN[localObject7.ep()]);
              ((ao)localObject1).a("操作", 0);
            }
            else
            {
              ((ah)localObject4).jdMethod_case(0);
              ((ao)localObject1).a("", 0);
            }
          }
          break;
        case 2555911:
          if ((localObject2 = (r)a5.es.cf().elementAt(10)).mQ[localObject2.mz] != -1)
            ((ao)localObject1).a("操作", 0);
          else
            ((ao)localObject1).a("整理", 0);
          for (int i1 = 0; i1 < 10; i1 += 2)
          {
            if (!(localObject9 = localObject6 = (a7)a5.es.cf().elementAt(i1 + 3)).jdField_char)
              continue;
            ((ba)localObject6).a(false, a5.es);
            ((ba)localObject2).a(true, a5.es);
          }
          break;
        case 2555907:
        case 2555915:
          if ((!(localObject2 = (r)a5.es.cf().elementAt(3)).mV[localObject2.mz].equals("")) && (localObject2.mV[localObject2.mz] != null))
            ((ao)localObject1).a("操作", 0);
          else
            ((ao)localObject1).a("", 0);
          break;
        case 2555936:
          if ((localObject9 = (ba)a5.es.cf().elementAt(3)).r == 164)
          {
            if ((!(localObject2 = (r)a5.es.cf().elementAt(3)).mV[localObject2.mz].equals("")) && (localObject2.mV[localObject2.mz] != null))
              ((ao)localObject1).a("操作", 0);
            else
              ((ao)localObject1).a("", 0);
          }
          else
          {
            if ((localObject9 = (ba)a5.es.cf().elementAt(3)).r != 167)
              break;
            if ((!(localObject2 = (r)a5.es.cf().elementAt(3)).mV[localObject2.mz].equals("")) && (localObject2.mV[localObject2.mz] != null))
              ((ao)localObject1).a("操作", 0);
            else
              ((ao)localObject1).a("", 0);
          }
          break;
        case 3145731:
          localObject2 = (ak)a5.es.cf().elementAt(13);
          localObject6 = new ay[(localObject5 = new int[] { 4, 6, 10, 12 }).length];
          for (i2 = 0; i2 < localObject5.length; i2++)
          {
            localObject6[i2] = ((ay)a5.es.cf().elementAt(localObject5[i2]));
            if (!(localObject9 = localObject6[i2]).jdField_char)
              continue;
            ((ak)localObject2).jdField_if(aa.a[i2]);
          }
          break;
        case 3145730:
          localObject2 = (ay)a5.es.cf().elementAt(13);
          localObject6 = new a7[(localObject5 = new int[] { 3, 4, 5, 6, 7, 8, 9, 10 }).length];
          for (i2 = 0; i2 < localObject5.length; i2++)
          {
            localObject6[i2] = ((a7)a5.es.cf().elementAt(localObject5[i2]));
            if (!(localObject9 = localObject6[i2]).jdField_char)
              continue;
            aa.case = (byte)i2;
          }
          if ((localObject9 = localObject2).jdField_char)
            ((ao)localObject1).a("确定", 0);
          else
            ((ao)localObject1).a("操作", 0);
          break;
        case 2228256:
          localObject2 = (ah)a5.es.cf().elementAt(14);
          localObject5 = (a7)a5.es.cf().elementAt(4);
          if ((localObject9 = localObject6 = (r)a5.es.cf().elementAt(7)).jdField_char)
          {
            if (localObject6.mQ[localObject6.ep()] != -1)
            {
              ((ao)localObject1).a("操作", 0);
              ((ah)localObject2).a(localObject6.mV[localObject6.ep()]);
              ((ah)localObject2).jdField_char(r.E(localObject6.ne[localObject6.ep()]));
            }
            else
            {
              ((ao)localObject1).a("", 0);
              ((ah)localObject2).a("");
            }
          }
          else
          {
            ((ao)localObject1).a("操作", 0);
            if (!(localObject9 = localObject5).jdField_char)
              break;
            if (aj.jdField_byte != -1)
            {
              if (localObject6.mQ[aj.jdField_byte] != -1)
              {
                ((ah)localObject2).a(localObject6.mV[aj.jdField_byte]);
                ((ah)localObject2).jdField_char(r.E(localObject6.ne[aj.jdField_byte]));
              }
              else
              {
                ((ah)localObject2).a(aj.try);
                ((ah)localObject2).jdField_char(r.E(aj.jdField_char));
              }
            }
            else
            {
              ((ah)localObject2).jdField_char(bm.bP);
              ((ah)localObject2).a("此处放置宝石");
            }
          }
          break;
        case 3342340:
          localObject2 = (ak)a5.es.cf().elementAt(13);
          localObject6 = new a7[(localObject5 = new int[] { 3, 5, 7, 9, 11 }).length];
          for (i2 = 0; i2 < localObject5.length; i2++)
          {
            localObject6[i2] = ((a7)a5.es.cf().elementAt(localObject5[i2]));
            if (!(localObject9 = localObject6[i2]).jdField_char)
              continue;
            ((ak)localObject2).jdField_if(am.case[i2]);
          }
        }
        if (a5.jdField_else() == 18)
          be.cu();
        return;
      }
      catch (Exception localException)
      {
      }
  }

  private static void a(ba paramba)
  {
    if (a5.jdField_else() == 11)
      if ((paramba instanceof ay))
      {
        ay localay;
        if ((localay = paramba = (ay)paramba).jdField_char)
        {
          if (paramba.bm() == 0)
          {
            ad.a("使用天劫|封神|梦天通行证均可登录");
            return;
          }
          if (paramba.bm() == 1)
          {
            ad.a("使用Kong.net账号登录");
            return;
          }
        }
        else
        {
          ad.jdField_new();
        }
        return;
      }
      else
      {
        ad.jdField_new();
      }
  }

  public final void a(be parambe)
  {
    if ((!this.jdField_char) || (a5.es == null) || (this.jdField_byte))
      return;
    Object localObject7;
    Object localObject1;
    Object localObject6;
    if ((a5.gZ) && (a5.jdField_byte(268435456)))
    {
      Object localObject2;
      if ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952) || (a5.es.g9 == 1703938))
      {
        for (int i = 0; i < 6; i++)
        {
          if (!(localObject7 = localObject2 = (a7)a5.es.cf().elementAt(i + 7)).jdField_char)
            continue;
          a5.em = (byte)i;
        }
      }
      else if (a5.es.g9 == 852020)
      {
        localObject2 = (m)(localObject1 = (bv)a5.es.cf().elementAt(2)).dt().elementAt(((bv)localObject1).la);
        localObject6 = (ao)a5.es.cf().elementAt(1);
        if (((m)localObject2).jdField_else == 4125)
          ((ao)localObject6).a("", 0);
        else
          ((ao)localObject6).a("操作", 0);
      }
      else if (a5.es.g9 == 3145730)
      {
        localObject1 = (ay)a5.es.cf().elementAt(13);
        for (int i1 = 0; i1 < aa.try.length; i1++)
          if ((!(localObject7 = localObject6 = (a7)a5.es.cf().elementAt(i1 + 3)).jdField_char) && ((localObject7 = localObject1).jdField_char))
          {
            if (!a5.a((localObject7 = localObject6).k, (localObject7 = localObject6).j, (localObject7 = localObject6).a, (localObject7 = localObject6).jdField_int))
              continue;
            ((ba)localObject6).a(true, a5.es);
          }
          else
          {
            if (((localObject7 = localObject1).jdField_char) || (!(localObject7 = localObject6).jdField_char) || (!a5.a((localObject7 = localObject1).k, (localObject7 = localObject1).j, (localObject7 = localObject1).a, (localObject7 = localObject1).jdField_int)))
              continue;
            ((ba)localObject6).a(false, a5.es);
            ((ba)localObject1).a(true, a5.es);
            ((ay)localObject1).b();
          }
      }
    }
    Object localObject3;
    if (a5.jdMethod_try(4096))
    {
      if ((this instanceof ak))
      {
        if ((localObject1 = (ak)this).ar() > 0)
          return;
      }
      else if ((this instanceof bg))
      {
        if (((localObject1 = (bg)this).cJ() > 0) || (!((bg)localObject1).h5))
          return;
      }
      else if ((this instanceof bv))
      {
        if (((localObject1 = (bv)this).dw() > 0) || (!((bv)localObject1).kl))
          return;
      }
      else if (((this instanceof ay)) && ((this.y == 0) || (this.y == 2)) && (!((ay)this).bl()))
      {
        if (!(localObject1 = (ay)this).ec)
          return;
      }
      else if ((a5.es.g9 == 2097155) && ((localObject1 = (ah)a5.es.cf().elementAt(32)).aj().equals("结算")))
        return;
      if ((localObject1 = jdField_if(a5.es, 0)) != null)
      {
        a(false, parambe);
        if (a5.jdField_else() == 17)
          ((ba)localObject1).a(false, parambe);
        else
          ((ba)localObject1).a(true, parambe);
        a((ba)localObject1);
        ao localao;
        if (a5.es.g9 == 2097155)
        {
          localao = (ao)a5.es.cf().elementAt(1);
          if ((localObject1 instanceof a9))
            localao.a("", 0);
        }
        else if (a5.jdField_else() == 18)
        {
          localao = (ao)a5.es.cf().elementAt(1);
          localObject6 = (ay)a5.es.cf().elementAt(7);
          this = (ay)a5.es.cf().elementAt(8);
          if ((localObject7 = localObject6).jdField_char)
            localao.a("", 0);
          else
            localao.a("介绍", 0);
          localObject7 = this;
          if (this.jdField_char)
            this.a = bg();
        }
        else if ((a5.jdField_else() == 17) && ((localObject1 instanceof a7)))
        {
          for (int i2 = 0; i2 < a5.iC.length; i2++)
          {
            a5.iC[i2] = ((a7)a5.es.cf().elementAt(i2 + 3));
            if (i2 == a5.hg)
              a5.iC[i2].a(true, a5.es);
            else
              a5.iC[i2].a(false, a5.es);
          }
        }
        else if ((a5.jdField_else() == 11) || (a5.es.g9 == 2297615))
        {
          localObject3 = (a9)a5.es.cf().elementAt(4);
          localObject6 = (a9)a5.es.cf().elementAt(5);
          this = (ao)a5.es.cf().elementAt(1);
          if (((localObject7 = localObject3).jdField_char) || ((localObject7 = localObject6).jdField_char))
          {
            if ((((a9)localObject3).cc().toString().equals("")) || (((a9)localObject3).cc().toString() == null) || (((a9)localObject6).cc().toString().equals("")) || (((a9)localObject6).cc().toString() == null))
              a("输入", 0);
            else if (a5.jdField_else() == 11)
              a("登录", 0);
            else
              a("确定", 0);
          }
          else
            a("确定", 0);
        }
        else if (a5.es.g9 == 2555905)
        {
          localObject3 = (a7)a5.es.cf().elementAt(11);
          if (((localObject1 instanceof a7)) && ((localObject6 = (a7)localObject1).bN() == 0))
          {
            a(false, parambe);
            ((ba)localObject1).a(false, parambe);
            ((ba)localObject3).a(true, parambe);
          }
        }
        else if (a5.es.g9 == 3145730)
        {
          localObject3 = (a7)a5.es.cf().elementAt(aa.case + 3);
          ((ba)localObject1).a(false, parambe);
          ((ba)localObject3).a(true, parambe);
        }
      }
      if ((a5.jdField_else() == 18) && (--a5.gx < 0))
        a5.gx = 0;
      return;
    }
    if (a5.jdMethod_try(8192))
    {
      if ((this instanceof ak))
      {
        if ((localObject1 = (ak)this).ar() < ((ak)localObject1).ax() - ((ak)localObject1).ao())
          return;
      }
      else if (((this instanceof ay)) && ((this.y == 0) || (this.y == 2)) && (!((ay)this).bl()))
      {
        if (!(localObject1 = (ay)this).eg)
          return;
      }
      else if (a5.jdField_else() == 17)
      {
        localObject1 = (ah)a5.es.cf().elementAt(16);
        if (a5.iC[a5.hg].eo == null)
          return;
        if (((ah)localObject1).aj().equals("三天后可以删除"))
          return;
      }
      if ((localObject1 = jdField_if(a5.es, 1)) != null)
      {
        a(false, parambe);
        ((ba)localObject1).a(true, parambe);
        a((ba)localObject1);
        if (a5.es.g9 == 2097155)
        {
          localObject3 = (ah)a5.es.cf().elementAt(32);
          localObject6 = (ao)a5.es.cf().elementAt(1);
          if (((ah)localObject3).aj().equals("开局"))
            ((ao)localObject6).a("开局", 0);
        }
        else if (a5.jdField_else() == 17)
        {
          localObject3 = (ao)a5.es.cf().elementAt(1);
          if (a5.g3[a5.hg] != 0)
            ((ao)localObject3).a("修改", 0);
          else
            ((ao)localObject3).a("确定", 0);
        }
        else if (a5.jdField_else() == 18)
        {
          localObject3 = (ao)a5.es.cf().elementAt(1);
          localObject6 = (a9)a5.es.cf().elementAt(9);
          this = (ay)a5.es.cf().elementAt(7);
          parambe = (ay)a5.es.cf().elementAt(8);
          if (((localObject7 = localObject6).jdField_char) && ((((a9)localObject6).cc().toString().trim() == null) || (((a9)localObject6).cc().toString().trim().equals(""))))
          {
            ((ao)localObject3).a("输入", 0);
          }
          else if (((localObject7 = localObject6).jdField_char) && (((a9)localObject6).cc().toString().trim() != null) && (!((a9)localObject6).cc().toString().trim().equals("")))
          {
            ((ao)localObject3).a("修改", 0);
          }
          else
          {
            localObject7 = this;
            if (this.jdField_char)
              ((ao)localObject3).a("", 0);
            else
              ((ao)localObject3).a("介绍", 0);
          }
          if ((localObject7 = parambe).jdField_char)
            parambe.a = parambe.bg();
        }
        else if ((a5.jdField_else() == 11) || (a5.es.g9 == 2297615))
        {
          localObject3 = (a9)a5.es.cf().elementAt(4);
          localObject6 = (a9)a5.es.cf().elementAt(5);
          this = (ao)a5.es.cf().elementAt(1);
          if (((localObject7 = localObject3).jdField_char) || ((localObject7 = localObject6).jdField_char))
          {
            if ((((a9)localObject3).cc().toString().equals("")) || (((a9)localObject3).cc().toString() == null) || (((a9)localObject6).cc().toString().equals("")) || (((a9)localObject6).cc().toString() == null))
              a("输入", 0);
            else if (a5.jdField_else() == 11)
              a("登录", 0);
            else
              a("确定", 0);
          }
          else
            a("确定", 0);
        }
        else if (a5.es.g9 == 2555905)
        {
          localObject3 = (ah)a5.es.cf().elementAt(35);
          localObject6 = (a7)a5.es.cf().elementAt(25);
          if (((localObject1 instanceof a7)) && ((this = (a7)localObject1).bN() == 0))
          {
            ((ba)localObject1).a(false, parambe);
            if (((a7)localObject6).bN() == 0)
              ((ba)localObject3).a(true, parambe);
            else
              ((ba)localObject6).a(true, parambe);
          }
        }
      }
      if ((a5.jdField_else() == 18) && (++a5.gx > 4))
        a5.gx = 4;
      return;
    }
    if (a5.jdMethod_try(16384))
    {
      if ((a5.es.g9 == 2097155) && ((localObject1 = (ah)a5.es.cf().elementAt(32)).aj().equals("开局")) && ((localObject7 = localObject1).jdField_char))
        return;
      if ((localObject1 = jdField_if(a5.es, 2)) != null)
      {
        a(false, parambe);
        ((ba)localObject1).a(true, parambe);
        a((ba)localObject1);
        if ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952) || (a5.es.g9 == 1703938))
        {
          for (int i3 = 0; i3 < 6; i3++)
          {
            if ((!(localObject7 = localObject6 = (a7)a5.es.cf().elementAt(i3 + 7)).jdField_char) || ((a5.em = (byte)(a5.em - 1)) >= 0))
              continue;
            a5.em = 0;
          }
          return;
        }
        Object localObject4;
        if (a5.es.g9 == 2097155)
        {
          localObject4 = (ao)a5.es.cf().elementAt(1);
          localObject6 = (a7)a5.es.cf().elementAt(31);
          this = (ah)a5.es.cf().elementAt(32);
          if (((localObject7 = localObject6).jdField_char) && (aj().equals("结算")))
          {
            ((ao)localObject4).a("开始", 0);
          }
          else
          {
            if (aj().equals("结算"))
            {
              localObject7 = this;
              if (this.jdField_char)
                ((ao)localObject4).a("结算", 0);
            }
            return;
          }
        }
        else if (a5.es.g9 == 2555905)
        {
          if ((az.h == 1) && ((this instanceof ah)))
          {
            localObject4 = (ah)a5.es.cf().elementAt(35);
            a(false, parambe);
            ((ba)localObject1).a(false, parambe);
            ((ba)localObject4).a(true, parambe);
          }
          if (((localObject1 instanceof a7)) && ((localObject4 = (a7)localObject1).bN() == 0))
          {
            a(true, parambe);
            ((ba)localObject1).a(false, parambe);
          }
        }
      }
      return;
    }
    else if (a5.jdMethod_try(32768))
    {
      if (a5.es.g9 == 2097155)
      {
        if (((localObject1 = (ah)a5.es.cf().elementAt(32)).aj().equals("开局")) && ((localObject7 = localObject1).jdField_char))
          return;
      }
      else if ((a5.es.g9 == 2555905) && ((this instanceof a7)) && ((localObject1 = (a7)this).bN() == 0))
        return;
      if ((localObject1 = jdField_if(a5.es, 3)) != null)
      {
        a(false, parambe);
        ((ba)localObject1).a(true, parambe);
        a((ba)localObject1);
        if ((a5.es.g9 == 1703937) || (a5.es.g9 == 1703952) || (a5.es.g9 == 1703938))
        {
          for (int i4 = 0; i4 < 6; i4++)
          {
            if ((!(localObject7 = localObject6 = (a7)a5.es.cf().elementAt(i4 + 7)).jdField_char) || ((a5.em = (byte)(a5.em + 1)) <= 5))
              continue;
            a5.em = 5;
          }
          return;
        }
        Object localObject5;
        if (a5.es.g9 == 2097155)
        {
          localObject5 = (ao)a5.es.cf().elementAt(1);
          localObject6 = (a7)a5.es.cf().elementAt(33);
          this = (ah)a5.es.cf().elementAt(32);
          if ((localObject7 = localObject6).jdField_char)
          {
            ((ao)localObject5).a("开始", 0);
          }
          else
          {
            if (aj().equals("结算"))
            {
              localObject7 = this;
              if (this.jdField_char)
                ((ao)localObject5).a("结算", 0);
            }
            return;
          }
        }
        else if (a5.es.g9 == 2555905)
        {
          if ((az.h == 1) && ((this instanceof ah)))
          {
            localObject5 = (ah)a5.es.cf().elementAt(37);
            a(false, parambe);
            ((ba)localObject1).a(false, parambe);
            ((ba)localObject5).a(true, parambe);
          }
          if (((localObject1 instanceof a7)) && ((localObject5 = (a7)localObject1).bN() == 0))
          {
            a(true, parambe);
            ((ba)localObject1).a(false, parambe);
          }
        }
      }
    }
  }

  public final void e()
  {
    this.jdField_else = true;
    this.e = true;
    this.jdField_if = false;
    this.n = (this.m = 0L);
  }

  public final boolean k()
  {
    ba localba = this;
    if (this.jdField_char)
      return true;
    for (byte b1 = 0; b1 <= 3; b1 = (byte)(b1 + 1))
      if (a(a5.es, b1) != null)
        return true;
    return false;
  }

  public final ba jdField_if(be parambe, byte paramByte)
  {
    ba localba = this;
    do
      if ((localba = localba.a(parambe, paramByte)) == null)
        return this;
    while (!localba.b);
    return localba;
  }

  public final boolean u()
  {
    return this.b;
  }

  public final void jdMethod_for(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public final short z()
  {
    return this.jdField_int;
  }

  public void a(short paramShort)
  {
    this.jdField_int = paramShort;
  }

  public final boolean q()
  {
    return this.jdField_char;
  }

  public void a(boolean paramBoolean, be parambe)
  {
    this.jdField_char = paramBoolean;
    if ((paramBoolean) && (parambe != null))
    {
      parambe.hf = this;
      switch (a5.jdField_else())
      {
      case 17:
        this = (ah)a5.es.cf().elementAt(16);
        paramBoolean = (ao)a5.es.cf().elementAt(1);
        Object localObject;
        for (parambe = 0; parambe < a5.iC.length; parambe++)
        {
          a5.iC[parambe] = ((a7)a5.es.cf().elementAt(parambe + 3));
          if (!(localObject = a5.iC[parambe]).jdField_char)
            continue;
          a5.hg = (byte)parambe;
        }
        if (a5.iC[a5.hg].eo == null)
        {
          paramBoolean.a("创建", 0);
          for (parambe = 0; parambe < a5.iD.length; parambe++)
          {
            a5.iD[parambe] = ((ah)a5.es.cf().elementAt(parambe + 11));
            a5.iD[parambe].a("");
          }
        }
        else
        {
          paramBoolean.a("确定", 0);
          a5.jdField_if(11);
        }
        for (parambe = 0; parambe < a5.iC.length; parambe++)
        {
          a5.iC[parambe] = ((a7)a5.es.cf().elementAt(parambe + 3));
          if (a5.iC[parambe].eo == null)
            continue;
          if (parambe == a5.hg)
            a5.iC[parambe].eo.jdMethod_do(1);
          else
            a5.iC[parambe].eo.jdMethod_do(0);
        }
        if ((a5.iC[a5.hg].eo != null) && (a5.hV[a5.hg] == 1))
        {
          a("三天后可以删除");
          localObject = this;
          jdField_new((short)(a5.ic - this.a >> 1));
        }
        else if ((a5.iC[a5.hg].eo != null) && (a5.hV[a5.hg] == 2))
        {
          a("删除角色且不可恢复");
          localObject = this;
          jdField_new((short)(a5.ic - this.a >> 1));
        }
        else
        {
          if ((a5.iC[a5.hg].eo != null) && ((a5.iC[a5.hg].eo == null) || (a5.hV[a5.hg] != 0)))
            break;
          if (a5.g3[a5.hg] == 1)
          {
            a("修改昵称");
            localObject = this;
            jdField_new((short)(a5.ic - this.a >> 1));
          }
          else
          {
            a("删除角色");
            localObject = this;
            jdField_new((short)(a5.ic - this.a >> 1));
          }
        }
      }
      if (a5.es != null)
        switch (a5.es.g9)
        {
        case 458760:
        case 2555911:
          r.d6();
        }
      g();
    }
  }

  public final short v()
  {
    return this.k;
  }

  public boolean b()
  {
    return false;
  }

  public void jdField_new(short paramShort)
  {
    this.k = paramShort;
  }

  public final short jdField_long()
  {
    return this.j;
  }

  public void jdMethod_for(short paramShort)
  {
    this.j = paramShort;
  }

  public final void a(int paramInt)
  {
    jdField_new((short)(this.k + paramInt));
  }

  public final void jdMethod_for(int paramInt)
  {
    jdMethod_for((short)(this.j + paramInt));
  }

  public final void jdMethod_do(int paramInt)
  {
    a((short)(this.jdField_int + paramInt));
  }

  public final short jdMethod_for()
  {
    return this.a;
  }

  public void jdMethod_do(short paramShort)
  {
    this.a = paramShort;
  }

  public byte jdField_char()
  {
    return this.y;
  }

  public void a(byte paramByte)
  {
    this.y = paramByte;
  }

  public final boolean o()
  {
    return this.h;
  }

  public final void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public final void jdField_if(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public final br y()
  {
    return this.s;
  }

  public final void a(br parambr)
  {
    this.s = parambr;
  }

  public final short p()
  {
    return this.r;
  }

  public final void jdField_int(short paramShort)
  {
    this.r = paramShort;
  }

  public final be c()
  {
    return this.jdField_new;
  }

  public final void m()
  {
    this.n = System.currentTimeMillis();
  }

  public final boolean jdField_if()
  {
    return false;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     ba
 * JD-Core Version:    0.6.0
 */
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bu
{
  public static byte q = 0;
  public static int g = 0;
  public static boolean c = true;
  public static byte e = 0;
  public static int k = -1;
  public static int h = -1;
  public static int f = -1;
  public static b[] n;
  private static int jdField_new;
  private static int jdField_for;
  private static int b;
  private static int jdField_if;
  private static int a;
  public static byte d = 0;
  private Image m = null;

  public bu()
  {
    this = this;
    this.m = Image.createImage(48, 14);
    Graphics localGraphics;
    b5.a(localGraphics = this.m.getGraphics(), 0, 0, this.m.getWidth(), this.m.getHeight(), 0);
    b5.jdField_if(localGraphics, 0, 0, this.m.getHeight(), this.m.getHeight(), bm.dw);
    a5.cG.jdField_if(localGraphics, this.m.getHeight(), 0, 10);
    a5.cG.jdField_if(localGraphics, this.m.getHeight() + a5.cG.jdField_try - 1, 0, 11);
    int i = this.m.getHeight() + (a5.cG.jdField_try << 1) - 2;
    int j = this.m.getWidth() - i;
    this = this.m.getHeight() >> 1;
    b5.jdField_if(localGraphics, i, 0, j, this, bm.aR);
    b5.jdField_if(localGraphics, i + 1, 1, j - 2, this - 2, bm.aP);
    b5.jdField_if(localGraphics, i, this, j, this, bm.aR);
    b5.jdField_if(localGraphics, i + 1, this + 1, j - 2, this - 2, bm.aP);
    jdField_new = i + 2;
    jdField_for = 2;
    b = this + 2;
    jdField_if_of_type_Int = j - 4;
    a = this - 4;
  }

  public static void jdField_if()
  {
    e = 0;
    k = -1;
    h = -1;
    f = -1;
    n = null;
  }

  public static int jdMethod_do()
  {
    if ((n != null) && (n.length > 0))
      return n[0].jdField_new();
    return 0;
  }

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdMethod_do(paramInt);
    switch (paramInt)
    {
    case 720897:
      localac.jdMethod_do(k);
      break;
    case 720901:
    case 720902:
      localac.jdMethod_do(k);
      a5.fR = true;
      break;
    case 720898:
    case 720909:
      localac.jdMethod_do(h);
      break;
    case 720914:
      localac.jdMethod_do(bp.em);
      break;
    case 720899:
    case 720900:
    case 720908:
      break;
    case 720904:
    case 720905:
    case 720906:
    case 720907:
      a5.fR = true;
      break;
    case 720903:
      localac.a(q);
      break;
    case 720910:
      a5.fR = true;
      break;
    case 720917:
      b5.jdMethod_case("CommandList.C_TEAM_EQUIP_VIEW_HEADER" + g);
      localac.jdMethod_do(g);
      break;
    case 720913:
    case 720915:
    case 720916:
      a5.fR = true;
      localac.jdMethod_do(g);
      break;
    case 720918:
      localac.jdMethod_do(g);
      localac.a(bv.kq);
      break;
    case 720911:
    case 720912:
      localac.jdMethod_do(g);
      break;
    case 720919:
      break;
    case 720920:
      a5.fR = true;
      break;
    case 720921:
      if (d == 0)
      {
        localac.jdMethod_do(4122);
      }
      else if (d == 1)
      {
        localac.jdMethod_do(4123);
      }
      else
      {
        if (d != 2)
          break;
        localac.jdMethod_do(4124);
      }
    }
    b5.a((paramInt = localac).jdField_do.length);
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    int i;
    int j;
    switch (paramInt)
    {
    case -2146762751:
      a5.A();
      return;
    case -2146762750:
      e = paramac.jdField_if();
      b5.jdMethod_case("teamState" + e);
      n = new b[paramac.jdField_if() - 1];
      b5.jdMethod_case("teamMates.length" + n.length);
      h = paramac.jdMethod_byte();
      for (i = 0; i < n.length; i++)
      {
        n[i] = new b();
        n[i].e = paramac.jdMethod_goto();
        n[i].jdField_goto = paramac.jdMethod_byte();
        n[i].aq = paramac.jdField_if();
        n[i].aO = paramac.jdField_new();
        n[i].a2 = paramac.jdMethod_byte();
        n[i].L = paramac.jdMethod_byte();
        n[i].bg = paramac.jdMethod_byte();
        n[i].ad = paramac.jdMethod_byte();
        n[i].jdMethod_do(paramac.jdField_new());
        n[i].c = paramac.jdField_new();
        n[i].jdField_void = paramac.jdField_new();
        for (j = 0; j < 12; j = (byte)(j + 1))
          n[i].aH[j] = paramac.jdField_if();
      }
      return;
    case -2146762749:
      n = null;
      e = 0;
      if (d == 0)
        break;
      d = 0;
      return;
    case -2146762748:
    case -2146762747:
    case -2146762746:
    case -2146762745:
    case -2146762740:
      i = paramac.jdMethod_byte();
      j = 0;
    case -2146762743:
    case -2146762741:
    case -2146762742:
    case -2146762738:
      while (true)
      {
        if (j < n.length)
          if (n[j].jdField_new() == i)
          {
            switch (paramInt)
            {
            case -2146762748:
              n[j].aO = paramac.jdField_new();
              n[j].a2 = paramac.jdMethod_byte();
              n[j].L = paramac.jdMethod_byte();
              n[j].bg = paramac.jdMethod_byte();
              n[j].ad = paramac.jdMethod_byte();
              break;
            case -2146762747:
              n[j].a2 = paramac.jdMethod_byte();
              n[j].bg = paramac.jdMethod_byte();
              break;
            case -2146762746:
              b5.jdMethod_case("1BUFFBUFFBUFFBUFFBUFFBUFFBUFFBUFFBUFFBUFFBUFFBUFF");
              for (paramInt = 0; paramInt < 12; paramInt = (byte)(paramInt + 1))
                n[j].aH[paramInt] = paramac.jdField_if();
              break;
            case -2146762745:
              n[j].jdMethod_do(paramac.jdField_new());
              n[j].c = paramac.jdField_new();
              n[j].jdField_void = paramac.jdField_new();
              break;
            case -2146762740:
              n[j].aq = paramac.jdField_if();
            case -2146762744:
            case -2146762743:
            case -2146762742:
            case -2146762741:
            default:
              break;
            }
          }
          else
          {
            j++;
            continue;
          }
        return;
        a5.eQ.a(new int[] { 720905, 720906, 720907 });
        return;
        h = paramac.jdMethod_byte();
        return;
        b5.jdMethod_case("CommandList.S_TEAM_DIVIDE接收分配方式");
        a5.dh = paramInt;
        a5.gb = paramac.jdMethod_int((paramInt = paramac).jdField_do.length - 6);
      }
    case -2146762744:
    case -2146762739:
    }
  }

  public final void a(Graphics paramGraphics)
  {
    if (l.g != null)
    {
      Object localObject1;
      Object localObject3;
      if (l.g.jdField_new() == bp.ag().jdField_new())
      {
        localObject1 = paramGraphics;
        localObject3 = z.a().jdMethod_try() + "(" + z.jdField_if(bp.ag().jdField_void, bp.ag().c) + "," + z.a(bp.ag().jdField_void, bp.ag().c) + ")";
        b5.jdField_if((Graphics)localObject1, (String)localObject3, a5.ic - ((Graphics)localObject1).getFont().stringWidth((String)localObject3) - 1, 2 + b2.jdField_if_of_type_Int, 16777215, 0);
      }
      else if ((l.g.jdField_for() == 1) || (l.g.jdField_for() == 3) || (l.g.jdField_for() == 2))
      {
        localObject3 = paramGraphics;
        localObject1 = this;
        i2 = (short)(2 + a5.iG + b2.jdField_if_of_type_Int);
        ((Graphics)localObject3).drawImage(((bu)localObject1).m, a5.ic - 48 - 2, i2, 20);
        b5.jdField_if((Graphics)localObject3, a5.ic - 48 - 2 - 1, i2 - 1, 16, 16, bm.aR);
        if (((bz)l.g).jdField_for() == 3)
        {
          if ((((bz)l.g).m() == -4) || (((bz)l.g).m() == -3) || (((bz)l.g).m() == -2))
            b5.jdField_if((Graphics)localObject3, ((bz)l.g).jdMethod_byte(), a5.ic - ((Graphics)localObject3).getFont().stringWidth(((bz)l.g).jdMethod_byte()) - 2, 2 + b2.jdField_if_of_type_Int, bz.jdMethod_do(((bz)l.g).m()), 0);
          else
            b5.jdField_if((Graphics)localObject3, ((bz)l.g).jdMethod_byte(), a5.ic - ((Graphics)localObject3).getFont().stringWidth(((bz)l.g).jdMethod_byte()) - 2, 2 + b2.jdField_if_of_type_Int, 55551, 0);
        }
        else
          b5.jdField_if((Graphics)localObject3, ((bz)l.g).jdMethod_byte(), a5.ic - ((Graphics)localObject3).getFont().stringWidth(((bz)l.g).jdMethod_byte()) - 2, 2 + b2.jdField_if_of_type_Int, bz.jdMethod_do(((bz)l.g).m()), 0);
        i3 = i2;
        int i = 2;
        Object localObject2 = localObject3;
        switch (l.g.jdField_for())
        {
        case 1:
          a5.hL.jdField_if(localObject2, a5.ic - 48 - 2 + 1 + (12 - a5.hL.jdField_try >> 1), i3 + 1 + (12 - a5.hL.a >> 1), ((bz)(bz)l.g).i());
          break;
        case 3:
          a5.hL.jdField_if(localObject2, a5.ic - 48 - 2 + 1 + (12 - a5.hL.jdField_try >> 1), i3 + 1 + (12 - a5.hL.a >> 1), 7);
          break;
        case 2:
          t localt = (t)l.g;
          a5.hL.jdField_if(localObject2, a5.ic - 48 - 2 + 1 + (12 - a5.hL.jdField_try >> 1), i3 + 1 + (12 - a5.hL.a >> 1), localt.O());
        }
        a5.cG.jdField_if((Graphics)localObject3, a5.ic - 48 - 2 + 14, i2 + 7, ((bz)l.g).r() / 10);
        a5.cG.jdField_if((Graphics)localObject3, a5.ic - 48 - 2 + 14 + a5.cG.jdField_try - 1, i2 + 7, ((bz)l.g).r() % 10);
        b5.a((Graphics)localObject3, a5.ic - 48 - 2 + jdField_new, i2 + jdField_for, ((bz)l.g).J() * jdField_if_of_type_Int / Math.max(1, ((bz)l.g).s()), a, 15728640);
        j = 0;
        if (((bz)l.g).N() != 0)
          j = ((bz)l.g).v() * jdField_if_of_type_Int / Math.max(1, ((bz)l.g).N());
        b5.a((Graphics)localObject3, a5.ic - 48 - 2 + jdField_new, i2 + b, j, a, 18416);
        a((Graphics)localObject3, (bz)l.g, a5.ic - 48 - 2, i2);
      }
    }
    if (n == null)
      return;
    int j = 2 + b2.jdField_if_of_type_Int;
    int i1 = 26;
    int i2 = j;
    if (c)
    {
      i1 = 26 + a5.iG;
      i2 += a5.iG;
    }
    for (int i3 = 0; i3 < n.length; i3++)
    {
      if (c)
        b5.jdField_if(paramGraphics, n[i3].jdMethod_byte(), 2, j + i3 * i1, bm.cf[3], 0);
      paramGraphics.drawImage(this.m, 2, i2 + i3 * i1, 20);
      b5.jdField_if(paramGraphics, 1, i2 + i3 * i1 - 1, 16, 16, bm.aR);
      a5.hL.jdField_if(paramGraphics, 3 + (12 - a5.hL.jdField_try >> 1), i2 + i3 * i1 + 1 + (12 - a5.hL.a >> 1), n[i3].i());
      a5.cG.jdField_if(paramGraphics, 16, i2 + i3 * i1 + 7, n[i3].r() / 10);
      a5.cG.jdField_if(paramGraphics, 16 + a5.cG.jdField_try - 1, i2 + i3 * i1 + 7, n[i3].r() % 10);
      if ((i4 = n[i3].a2 * jdField_if_of_type_Int / n[i3].L) > jdField_if_of_type_Int)
        i4 = jdField_if_of_type_Int;
      b5.a(paramGraphics, 2 + jdField_new, i2 + i3 * i1 + jdField_for, i4, a, 15728640);
      int i4 = 0;
      if ((i4 = n[i3].bg * jdField_if_of_type_Int / n[i3].ad) > jdField_if_of_type_Int)
        i4 = jdField_if_of_type_Int;
      b5.a(paramGraphics, 2 + jdField_new, i2 + i3 * i1 + b, i4, a, 18416);
      a(paramGraphics, n[i3], 2, i2 + i3 * i1);
    }
  }

  private static void a(Graphics paramGraphics, bz parambz, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < a5.fj.jdField_int; i = (byte)(i + 1))
    {
      if (parambz.aH[i] == 0)
        continue;
      if (i < 6)
        a5.fj.jdField_if(paramGraphics, paramInt1 + 14 + i * 9, paramInt2 + b + a + 3, parambz.aH[i] - 1);
      else
        a5.fj.jdField_if(paramGraphics, paramInt1 + 14 + (i - 6) * 9, paramInt2 + b + a + 3 + 9, parambz.aH[i] - 1);
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bu
 * JD-Core Version:    0.6.0
 */
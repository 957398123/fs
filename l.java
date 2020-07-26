import java.util.Vector;

public final class l
{
  public static boolean jdField_long;
  public static boolean jdField_for;
  public static boolean jdField_new;
  private static l f = null;
  static a4 g = null;
  static a6 jdField_char = null;
  private static a4[] jdField_byte = new a4[0];
  public static a4[] jdField_else = new a4[0];
  private byte c = 0;
  private long a = 0L;
  private long b = 0L;
  private static short jdField_int = 0;
  private static short jdField_do = 0;
  static int jdField_try;
  public static byte jdField_goto = 3;
  public static boolean d;
  private static int jdField_case;
  public static short jdField_void = 0;
  public static short jdField_if;

  public static l jdField_do()
  {
    if (f == null)
      f = new l();
    return f;
  }

  public static void jdField_if()
  {
    jdField_else = jdField_byte;
    if ((g == null) || (bp.ag().aF()))
    {
      g = bp.ag();
      jdField_char.a(g, 0, -1);
      if (br.iZ != null)
      {
        br.iZ = null;
        a5.jdField_try(0);
      }
    }
    for (int i = jdField_else.length - 1; i >= 0; i--)
    {
      jdField_else[i].jdField_case();
      jdField_else[i].a(-1);
    }
  }

  public static void a(a4 parama4)
  {
    if (parama4 == null)
      return;
    if (b5.jdField_if(jdField_byte, parama4) == -1)
      jdField_byte = b5.a(jdField_byte, parama4);
  }

  private static void jdField_if(int paramInt)
  {
    if ((paramInt = jdField_for(paramInt)) == -1)
      return;
    if (jdField_byte[paramInt] == g)
    {
      g = null;
      if (bp.ag().jdField_byte == 102)
        bp.ag().jdField_do(0);
    }
    if (jdField_byte[paramInt].jdField_try == 1)
    {
      b localb = (b)jdField_byte[paramInt];
      jdField_byte = b5.a(jdField_byte, paramInt);
      jdField_if(localb.W);
      return;
    }
    jdField_byte = b5.a(jdField_byte, paramInt);
  }

  public static void jdField_if(a4 parama4)
  {
    if (parama4 == null)
      return;
    if ((parama4 = b5.jdField_if(jdField_byte, parama4)) == -1)
      return;
    if (jdField_byte[parama4] == g)
      g = null;
    jdField_byte = b5.a(jdField_byte, parama4);
  }

  public static void jdField_for()
  {
    g = null;
    jdField_byte = new a4[0];
    jdField_else = new a4[0];
  }

  public static a4 a(int paramInt)
  {
    jdField_do();
    if ((paramInt = jdField_for(paramInt)) == -1)
      return null;
    return jdField_byte[paramInt];
  }

  private static int jdField_for(int paramInt)
  {
    for (int i = jdField_byte.length - 1; i >= 0; i--)
      if (paramInt == jdField_byte[i].jdField_new())
        return i;
    return -1;
  }

  public static void jdField_do(a4 parama4)
  {
    if (parama4 == null)
      return;
    g = parama4;
  }

  public static a4 a()
  {
    return g;
  }

  public final byte[] jdField_do(int paramInt)
  {
    ac localac1;
    (localac1 = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 196612:
      localac1.a(bp.ag().c);
      localac1.a(bp.ag().jdField_void);
      break;
    case 196614:
      localac1.a(bp.ag().Y());
      localac1.jdField_do(bp.ag().eU);
      bp.ag().jdField_int(0);
      b5.jdField_case("GOManager-cmd-USE_SKILL=" + bp.ag().eU);
      break;
    case 196621:
      b5.jdField_case("GOManager-cmd-C_PLAYER_REVIVE");
      break;
    case 851969:
      a5.fR = true;
      b5.jdField_case("Gffffffffffffffffffffff");
      b5.jdField_case("GOManager-cmd-C_PLAYER_NPC_TALK=" + g.jdField_new());
      localac1.jdField_do(g.jdField_new());
      b5.jdField_case("NPCID" + g.jdField_new());
      break;
    case 852071:
      a5.fR = true;
      localac1.jdField_do(g.jdField_new());
      b5.jdField_case("NPCID" + g.jdField_new());
      break;
    case 851974:
      a5.fR = true;
      b5.jdField_case("GOManager-cmd-C_PLAYER_NPC_TALK=" + g.jdField_new());
      localac1.jdField_do(g.jdField_new());
      break;
    case 851975:
      a5.fR = true;
      b5.jdField_case("GOManager-cmd-C_PLAYER_NPC_TALK=" + g.jdField_new());
      localac1.jdField_do(g.jdField_new());
      localac1.a(b5.X);
      break;
    case 851976:
      a5.fR = true;
      b5.jdField_case("GOManager-cmd-C_UI_NPC_LOCATION");
      break;
    case 196626:
      localac1.jdField_do(g.jdField_new());
      b5.jdField_case("GOManager-cmd-C_PLAYER_DUEL");
      break;
    case 196627:
    case 196628:
      localac1.jdField_do(bp.ag().fS);
      b5.jdField_case("GOManager-cmd-C_ACCEPT_DUEL=" + bp.ag().fS);
      break;
    case 196630:
      localac1.jdField_do(bp.em);
      break;
    case 196632:
      localac1.a(a5.gn);
      break;
    case 196633:
      b2.a();
      localac1.jdField_if(b2.jdField_try.jdField_case());
      break;
    case 196634:
      paramInt = (this = b2.jdField_try.jdField_new()).length;
      int j = paramInt;
      ac localac2;
      (localac2 = localac1).a((byte)j);
      for (int i = 0; i < paramInt; i++)
        localac1.jdField_do(this[i]);
      break;
    case 196635:
      localac1.a(a5.gK == 0);
      break;
    case 851978:
      localac1.jdField_do(at.jdField_for);
      break;
    case 196637:
      localac1.a(a5.hi);
      break;
    case 196638:
      localac1.jdField_do(jdField_try);
      break;
    case 196639:
      localac1.a(this.c);
      if (this.b < 0L)
        localac1.jdField_do(120000);
      else
        localac1.jdField_do((int)(this.b - this.a));
      this.c = (byte)(this.c + 1);
      this.a = System.currentTimeMillis();
      this.b = -1L;
      break;
    case 851992:
      bp.ag().jdField_if(false);
      bp.ag().ei = 1;
      bp.ag().jdField_do(3);
      localac1.jdField_do(g.jdField_new());
      break;
    case 852072:
      bp.ag().jdField_if(false);
      bp.ag().jdField_do(3);
      localac1.jdField_do(g.jdField_new());
      break;
    case 851993:
    case 852009:
      localac1.jdField_do(g.jdField_new());
      break;
    case 852000:
      localac1.jdField_do(g.jdField_new());
      break;
    case 852003:
      localac1.jdField_do(g.jdField_new());
      break;
    case 852001:
    case 852005:
      a5.fR = true;
      z.jdField_case = false;
      if (jdField_goto != 3)
        jdField_goto = 3;
      z.ag = new Vector();
      break;
    case 196641:
      a5.fR = true;
      localac1.a(a4.a);
      break;
    case 196642:
      a5.fR = true;
      localac1.a(jdField_goto);
      break;
    case 852006:
      a5.fR = true;
      d = true;
      break;
    case 852008:
      a5.fR = true;
      localac1.jdField_do(g.jdField_new());
      break;
    case 852016:
    case 852017:
      bp.ag().jdField_if(false);
      if (paramInt == 852016)
        bp.ag().ei = 2;
      else if (paramInt == 852017)
        bp.ag().ei = 3;
      bp.ag().jdField_do(3);
      break;
    case 852021:
    case 852023:
      a5.fR = true;
      localac1.a(jdField_void);
      break;
    case 852020:
    case 852022:
      a5.fR = true;
      break;
    case 851988:
    case 851989:
    case 852018:
    case 852019:
    case 852033:
    case 852034:
    case 852035:
    case 852036:
      if (paramInt == 852018)
      {
        if (a5.es != null)
          a5.es = null;
        if (a5.ea != null)
        {
          a5.ea.l6.removeAllElements();
          a5.ea = null;
          a5.jdField_try(0);
        }
      }
      localac1.a(jdField_if);
    }
    return localac1.jdField_long();
  }

  public final void a(int paramInt, ac paramac)
  {
    int i = 0;
    int i1;
    byte b1;
    int i2;
    int i4;
    int i7;
    Object localObject3;
    l locall;
    Object localObject5;
    Object localObject4;
    boolean bool3;
    int i5;
    Object localObject2;
    int i9;
    int n;
    byte b2;
    int i8;
    int i10;
    int i6;
    switch (paramInt)
    {
    case -2147287024:
      paramac.jdField_if();
      paramac.jdField_if();
      this = paramac.jdField_byte();
      bp.ag().jdField_if(this);
      b5.jdField_case("GOManager-cmd-S_ADD_SHOWPLAYER=" + bp.ag().jdField_goto);
      this = paramac.jdField_goto();
      paramInt = paramac.jdField_goto();
      bp.ag().jdField_if(this);
      bp.ag().a(paramInt);
      paramInt = paramac.jdField_if();
      bp.ag().jdField_byte(paramInt);
      paramInt = paramac.jdField_if();
      bp.ag().jdField_char(paramInt);
      paramInt = paramac.jdField_if();
      bp.ag().jdField_case(paramInt);
      paramInt = paramac.jdField_if();
      bp.ag().b(paramInt);
      paramInt = paramac.jdField_byte();
      bp.ag().g(paramac.jdField_if());
      bp.ag().jdField_do(paramac.jdField_goto());
      bp.ag().jdField_long(paramInt);
      paramInt = paramac.jdField_byte();
      bp.ag().b(paramInt);
      paramInt = paramac.jdField_if();
      bp.ag().i(paramInt);
      paramInt = paramac.jdField_byte();
      b5.jdField_case("kingId" + paramInt);
      bp.ag().d(paramInt);
      paramInt = paramac.jdField_if();
      b5.jdField_case("kingRight" + paramInt);
      bp.ag().h(paramInt);
      bp.ag().jdField_void(4);
      jdField_int = paramac.jdField_new();
      jdField_do = paramac.jdField_new();
      b5.jdField_case("Player ADD --x=" + jdField_int + "--y=" + jdField_do);
      bp.ag().jdField_int(paramac.jdField_byte());
      bp.ag().jdField_for(paramac.jdField_byte());
      bp.ag().c = (bp.ag().bm = jdField_int);
      bp.ag().jdField_void = (bp.ag().bi = jdField_do);
      bp.ag().q = (bp.ag().bt = z.jdField_if(bp.ag().jdField_void, bp.ag().c));
      bp.ag().l = (bp.ag().ax = z.a(bp.ag().jdField_void, bp.ag().c));
      bp.ag().W();
      bp.ag().cA = true;
      bp.ag().f(bp.ag().K());
      bp.ag();
      paramInt = b.a(bp.ag().C(), bp.ag().K());
      bp.ag().d(paramInt);
      bp.ag().jdField_do(0);
      bp.ag().jdField_new(1);
      paramInt = new long[4];
      for (i = 0; i < 4; i = (byte)(i + 1))
        paramInt[i] = paramac.jdField_char();
      boolean bool1 = paramac.jdField_case();
      bp.ag().cH = paramac.jdField_case();
      if (bool1)
      {
        bp.ag().jdField_do(9);
        i1 = 0;
        if (bp.ag().ad() == 4)
          i1 = 3;
        else
          i1 = (short)(bp.ag().cL * 3);
        bp.ag();
        bp.ag().ct = 25;
        bp.ag().dt = (short)(bp.ag().ct + i1);
      }
      else
      {
        as.a6();
      }
      if (a5.hQ == 1)
      {
        a5.jdField_for(this);
        bp.a(bp.ag().i(), paramac);
      }
      bp.ag().a(paramInt);
      a(bp.ag());
      a5.jdField_do(5);
      a5.B();
      a5.dA = 0;
      jdField_char = new a6(bp.ag(), 0, -1, 2);
      a5.eQ.a(196637);
      return;
    case -2147287039:
      int j;
      byte b7;
      b localb;
      Object localObject1;
      int i3;
      String str2;
      int k;
      switch (j = paramac.jdField_if())
      {
      case 1:
        paramac.jdField_if();
        i1 = paramac.jdField_byte();
        this = paramac.jdField_goto();
        paramInt = paramac.jdField_goto();
        b5.jdField_case("GOManager-ID=" + i1 + "--其他玩家=" + this + "--称号=" + paramInt);
        byte b3 = paramac.jdField_if();
        byte b4 = paramac.jdField_if();
        byte b5 = paramac.jdField_if();
        b7 = paramac.jdField_if();
        short s = paramac.jdField_new();
        jdField_int = paramac.jdField_new();
        jdField_do = paramac.jdField_new();
        (localb = new b(jdField_int, jdField_do, b4, b5, b7)).jdField_int(paramac.jdField_byte());
        localb.jdField_for(paramac.jdField_byte());
        localb.jdField_try(paramac.jdField_byte());
        localb.jdField_byte(paramac.jdField_byte());
        boolean bool6 = paramac.jdField_case();
        localb.cH = paramac.jdField_case();
        localb.jdField_if(i1);
        localb.jdField_if(this);
        localb.a(paramInt);
        localb.jdField_void(b3);
        localb.jdField_char(b4);
        localb.jdField_case(b5);
        localb.b(b7);
        localb.jdField_if(s);
        if (bool6)
        {
          localb.jdField_do(9);
          this = 0;
          if (localb.ad() == 4)
            this = 3;
          else
            this = (short)(localb.cL * 3);
          localb.ct = 25;
          localb.dt = (short)(localb.ct + this);
        }
        this = 0;
        try
        {
          this = paramac.jdField_case();
        }
        catch (Exception paramInt)
        {
        }
        localb.a(this);
        if (this != 0)
        {
          paramInt = null;
          localObject1 = null;
          localObject1 = new short[b3 = paramac.jdField_if()][];
          paramInt = new byte[b3];
          for (b4 = 0; b4 < b3; b4 = (byte)(b4 + 1))
          {
            paramInt[b4] = paramac.jdField_if();
            b5 = paramac.jdField_if();
            localObject1[b4] = new short[b5];
            for (b7 = 0; b7 < b5; b7 = (byte)(b7 + 1))
              localObject1[b4][b7] = paramac.jdField_new();
          }
          localb.a(paramInt, localObject1);
        }
        a(localb);
        b5.jdField_case("---P1.x=" + localb.c + "---P1.y=" + localb.jdField_void + "---P1.ID=" + localb.jdField_goto);
        break;
      case 2:
        paramInt = paramac.jdField_if();
        (localObject1 = new t(localb, paramInt)).bH = paramInt;
        i3 = paramac.jdField_byte();
        str2 = paramac.jdField_goto();
        String str3 = paramac.jdField_goto();
        b7 = paramac.jdField_if();
        this = paramac.jdField_if();
        paramInt = paramac.jdField_if();
        k = paramac.jdField_new();
        jdField_int = paramac.jdField_new();
        jdField_do = paramac.jdField_new();
        ((a4)localObject1).c = (((bz)localObject1).bm = jdField_int);
        ((a4)localObject1).jdField_void = (((bz)localObject1).bi = jdField_do);
        ((a4)localObject1).q = (((bz)localObject1).bt = z.jdField_if(((a4)localObject1).jdField_void, ((a4)localObject1).c));
        ((a4)localObject1).l = (((bz)localObject1).ax = z.a(((a4)localObject1).jdField_void, ((a4)localObject1).c));
        ((bz)localObject1).jdField_int(paramac.jdField_byte());
        ((bz)localObject1).jdField_for(paramac.jdField_byte());
        try
        {
          ((t)localObject1).jdField_case(paramac.jdField_byte() + 8);
        }
        catch (Exception localException)
        {
        }
        ((a4)localObject1).jdField_if(i3);
        ((a4)localObject1).jdField_if(str2);
        ((a4)localObject1).a(str3);
        ((bz)localObject1).jdField_void(b7);
        ((bz)localObject1).jdField_char(this);
        ((bz)localObject1).jdField_case(paramInt);
        ((bz)localObject1).jdField_if(k);
        a((a4)localObject1);
        break;
      case 3:
        byte b8 = paramac.jdField_if();
        (localObject1 = new w(k, b8)).bH = b8;
        i3 = paramac.jdField_byte();
        paramInt = paramac.jdField_goto();
        str2 = paramac.jdField_goto();
        byte b6 = paramac.jdField_if();
        b7 = paramac.jdField_if();
        b8 = paramac.jdField_if();
        this = paramac.jdField_new();
        jdField_int = paramac.jdField_new();
        jdField_do = paramac.jdField_new();
        ((a4)localObject1).c = (((bz)localObject1).bm = jdField_int);
        ((a4)localObject1).jdField_void = (((bz)localObject1).bi = jdField_do);
        ((a4)localObject1).q = (((bz)localObject1).bt = z.jdField_if(((a4)localObject1).jdField_void, ((a4)localObject1).c));
        ((a4)localObject1).l = (((bz)localObject1).ax = z.a(((a4)localObject1).jdField_void, ((a4)localObject1).c));
        ((bz)localObject1).jdField_int(paramac.jdField_byte());
        ((bz)localObject1).jdField_for(paramac.jdField_byte());
        b1 = paramac.jdField_if();
        ((w)localObject1).jdField_goto(b1);
        ((a4)localObject1).jdField_if(i3);
        ((a4)localObject1).jdField_if(paramInt);
        ((a4)localObject1).a(str2);
        ((bz)localObject1).jdField_void(b6);
        ((bz)localObject1).jdField_char(b7);
        ((bz)localObject1).jdField_case(b8);
        ((bz)localObject1).jdField_if(this);
        ((t)localObject1).jdField_do(0);
        ((t)localObject1).jdField_new(1);
        a((a4)localObject1);
        break;
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
        this = new ag(b1);
        paramInt = paramac.jdField_if();
        i2 = paramac.jdField_byte();
        String str1 = paramac.jdField_goto();
        jdField_int(paramInt);
        jdField_if(i2);
        jdField_if(str1);
        jdField_int = paramac.jdField_new();
        jdField_do = paramac.jdField_new();
        this.c = jdField_int;
        this.jdField_void = jdField_do;
        this.q = z.jdField_if(this.jdField_void, this.c);
        this.l = z.a(this.jdField_void, this.c);
        a(this);
        if (b1 != 10)
          break;
        z.ag.addElement(new Integer(i2));
      case 9:
      }
      return;
    case -2147287038:
      switch (b1 = paramac.jdField_if())
      {
      case 0:
        b5.jdField_case("Wrong Player delete");
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
        i2 = paramac.jdField_byte();
        if (b1 == 10)
          for (this = 0; this < z.ag.size(); this++)
          {
            if (a(i2) != a(((Integer)z.ag.elementAt(this)).intValue()))
              continue;
            z.ag.removeElementAt(this);
          }
        jdField_do();
        jdField_if(i2);
      case 9:
      default:
        return;
      }
    case -2147287037:
      b1 = paramac.jdField_if();
      i2 = paramac.jdField_byte();
      this = paramac.jdField_goto();
      paramInt = paramac.jdField_if();
      jdField_int = paramac.jdField_new();
      jdField_do = paramac.jdField_new();
      i4 = paramac.jdField_byte();
      i7 = paramac.jdField_byte();
      localObject3 = null;
      if ((a(i2) instanceof bz))
        localObject3 = (bz)a(i2);
      if (localObject3 == null)
      {
        b5.jdField_case("**********NO Player***********=" + i2);
        return;
      }
      ((a4)localObject3).jdField_if(this);
      ((bz)localObject3).jdField_void(paramInt);
      ((bz)localObject3).jdField_int(i4);
      ((bz)localObject3).jdField_for(i7);
      ((bz)localObject3).jdField_try(jdField_int, jdField_do);
      boolean bool4;
      if (((bool4 = ((bz)localObject3).jdField_case(z.jdField_if(jdField_do, jdField_int), z.a(jdField_do, jdField_int)))) && (((a4)localObject3).jdField_do() != 9))
        ((bz)localObject3).u();
      if (g == localObject3)
        bp.ag().aA();
      switch (b1)
      {
      case 1:
        int i12 = paramac.jdField_byte();
        locall = paramac.jdField_byte();
        localObject5 = paramac.jdField_goto();
        ((bz)localObject3).jdField_try(i12);
        ((bz)localObject3).jdField_byte(locall);
        ((a4)localObject3).a((String)localObject5);
        try
        {
          ((b)localObject3).cH = paramac.jdField_case();
        }
        catch (Exception this)
        {
        }
      case 3:
        this = paramac.jdField_if();
        ((bz)localObject3).jdField_goto(this);
      default:
        return;
      }
    case -2147287036:
      jdField_for();
      jdField_int = paramac.jdField_new();
      jdField_do = paramac.jdField_new();
      bp.ag().c = (bp.ag().bm = jdField_int);
      bp.ag().jdField_void = (bp.ag().bi = jdField_do);
      bp.ag().q = (bp.ag().bt = z.jdField_if(bp.ag().jdField_void, bp.ag().c));
      bp.ag().l = (bp.ag().ax = z.a(bp.ag().jdField_void, bp.ag().c));
      bp.ag().jdField_do(0);
      return;
    case -2147287035:
      localObject4 = null;
      short[][] arrayOfShort = null;
      locall = paramac.jdField_byte();
      b5.jdField_case("GOManager-cmd-S_UPD_CHANGEEQUIPOBJECT--oit=" + locall);
      if ((localObject5 = (b)a(locall)) == null)
      {
        b5.jdField_case("**********NO Found Player***********");
        return;
      }
      arrayOfShort = new short[locall = paramac.jdField_if()][];
      localObject4 = new byte[locall];
      for (this = 0; this < locall; this = (byte)(this + 1))
      {
        paramac.jdField_if();
        localObject4[this] = paramac.jdField_if();
        if (localObject4[this] > 0)
        {
          paramInt = paramac.jdField_if();
          arrayOfShort[this] = new short[paramInt];
          for (i2 = 0; i2 < paramInt; i2 = (byte)(i2 + 1))
            arrayOfShort[this][i2] = paramac.jdField_new();
        }
        else if (localObject4[this] < 0)
        {
          paramInt = (byte)bz.aL[(java.lang.Math.abs(localObject4[this]) - 1 + localObject5.K() * (bz.aL.length / 2))].length;
          arrayOfShort[this] = new short[paramInt];
          for (i2 = 0; i2 < paramInt; i2 = (byte)(i2 + 1))
            arrayOfShort[this][i2] = bz.aL[(java.lang.Math.abs(localObject4[this]) - 1 + localObject5.K() * (bz.aL.length / 2))][i2];
        }
        else
        {
          b5.jdField_case("出错了，不应该有0数值传输！");
        }
      }
      if ((this = paramac.jdField_if()) != 4)
        ((b)localObject5).a(this, false);
      else
        ((b)localObject5).a(this, true);
      ((b)localObject5).a(localObject4, arrayOfShort);
      return;
    case -2147287033:
      this = paramac.jdField_byte();
      paramInt = paramac.jdField_byte();
      i2 = paramac.jdField_byte();
      i4 = paramac.jdField_byte();
      i7 = paramac.jdField_if();
      localObject3 = null;
      if ((a(this) instanceof bz))
        localObject3 = (bz)a(this);
      if (localObject3 == null)
      {
        b5.jdField_case("**********NO Found hp_change***********");
        return;
      }
      ((bz)localObject3).jdField_int(paramInt);
      ((bz)localObject3).jdField_for(i2);
      localObject4 = new int[3];
      if ((i7 & 0x80) != 0)
        localObject4[0] = 1;
      else
        localObject4[0] = 0;
      localObject4[1] = 0;
      localObject4[2] = i4;
      ((bz)localObject3).a(localObject4);
      i7 = (byte)(i7 & 0x7F);
      ((bz)localObject3).jdField_else(i7);
      if ((this == bp.ag().jdField_new()) && (localObject4[2] < 0))
        bp.ag().jdField_if(true);
      return;
    case -2147287026:
      int i11;
      this = (bz)a(i11 = paramac.jdField_byte());
      b5.jdField_case("S_OBJECT_BUFFCHANGE___OBGID" + i11);
      if (this == null)
      {
        b5.jdField_case("**********NO Found BUFF_change***********");
        return;
      }
      for (paramInt = 0; paramInt < 12; paramInt = (byte)(paramInt + 1))
        this.aH[paramInt] = paramac.jdField_if();
      paramInt = paramac.jdField_new();
      boolean bool2 = paramac.jdField_case();
      this.aB = paramac.jdField_case();
      this.B = paramac.jdField_case();
      if ((i11 == bp.ag().jdField_new()) && ((this.aB) || (this.B) || (bool2)))
        bp.ag().jdField_if(true);
      int i13 = paramac.jdField_if();
      this.J = (this.A = 0);
      jdField_new(jdField_new());
      this.bq = 0;
      this.a4 = false;
      for (i2 = 0; i2 < i13; i2 = (byte)(i2 + 1))
      {
        i4 = paramac.jdField_new();
        b5.jdField_case("持续特效   speID=" + i4);
        if ((i4 == 79) || (i4 == 80) || (i4 == 81))
        {
          this.J = true;
          a(this, i4, -2, 0);
          if (i11 != bp.ag().jdField_new())
            continue;
          bp.ag().jdField_if(true);
        }
        else if (i4 == 13)
        {
          this.A = true;
          a(this, i4, -2, 1);
        }
        else if ((i4 == -1) || (i4 == -2) || (i4 == -3) || (i4 == -4))
        {
          this.bq = (byte)(-i4);
          this.a4 = false;
          if (jdField_do() == 3)
            continue;
          jdField_do(0);
        }
        else
        {
          if (i4 != -5)
            continue;
          this.bq = 0;
          this.a4 = true;
        }
      }
      if (paramInt == 200)
        this.aT = 18;
      else if (paramInt == 100)
        this.aT = 49;
      else if (paramInt > 100)
        this.aT = 58;
      else if (paramInt < 100)
        this.aT = 43;
      if (bool2)
        this.aT = 27;
      if ((bool3 = paramac.jdField_case()))
      {
        i5 = 0;
        paramInt = this.ap;
        this.ap = paramac.jdField_if();
        b5.jdField_case("上、下马走buff命令 horc=" + this.ap);
        if (this.ap == 1)
        {
          if (paramInt == 0)
          {
            this.al = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 }, { 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 }, { 607, 608 } };
          }
          else if ((paramInt == 1) && (this.W != null))
          {
            localObject2 = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 }, { 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 }, { 607, 608 }, { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 }, { 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
            a$7efcb6ee(13, localObject2);
            localObject3 = new short[][] { this.al[0], this.al[1], this.al[2], this.al[3], this.al[4], this.al[5] };
            this.al = ((S)localObject3);
          }
          i5 = 6;
          k();
        }
        else if (this.ap == 2)
        {
          if (this.W == null)
            if (paramInt == 0)
            {
              this.al = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 }, { 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 }, { 607, 608 }, { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 }, { 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
            }
            else if (paramInt == 1)
            {
              localObject2 = new short[][] { this.al[0], this.al[1], this.al[2], this.al[3], this.al[4], this.al[5], { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 }, { 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
              this.al = ((S)localObject2);
            }
          i5 = 13;
          j();
        }
        localObject2 = null;
        int m;
        localObject2 = new short[m = paramac.jdField_if()][];
        for (i9 = 0; i9 < m; i9 = (byte)(i9 + 1))
        {
          paramac.jdField_if();
          i11 = paramac.jdField_if();
          localObject2[i9] = new short[i11];
          for (i13 = 0; i13 < i11; i13 = (byte)(i13 + 1))
            localObject2[i9][i13] = paramac.jdField_new();
        }
        a$7efcb6ee(i5, localObject2);
      }
      else
      {
        if (this.ap != 0)
          p();
        return;
      }
    case -2147287032:
      if ((paramInt = paramac.jdField_byte()) == bp.ag().jdField_new())
      {
        bp.ag().J = (bp.ag().A = 0);
        if (bp.ag().jdField_do() == 9)
          break;
        bp.ag().bq = 0;
        bp.ag().a4 = false;
        bp.ag().jdField_do(9);
        bp.fq = false;
        return;
      }
      else
      {
        bz localbz1;
        if ((localbz1 = (bz)a(paramInt)) == null)
        {
          b5.jdField_case("**********NO Found dier***********");
        }
        else
        {
          localbz1.J = (localbz1.A = 0);
          localbz1.jdField_new(localbz1.jdField_new());
          if (localbz1.jdField_do() != 9)
          {
            localbz1.jdField_do(9);
            if (g == localbz1)
            {
              bp.ag();
              if (bp.el[0] == 0)
                bp.fq = false;
              if (bp.ag().jdField_do() != 2)
              {
                if (bp.ag().jdField_do() != 9)
                  bp.ag().jdField_do(0);
                g = bp.ag();
                jdField_char.a(g, 0, -1);
              }
            }
          }
          return;
        }
      }
    case -2147287031:
      paramac.jdField_if();
      paramac.jdField_new();
      paramac.jdField_new();
      return;
    case -2147287030:
      i5 = paramac.jdField_if();
      if ((localObject2 = (bz)a(paramInt = paramac.jdField_byte())) == null)
      {
        b5.jdField_case("**********NO Found dier***********");
        return;
      }
      ((bz)localObject2).a((a4)localObject2, (short)i5, 1, 2);
      return;
    case -2147287029:
      i9 = paramac.jdField_byte();
      boolean bool5 = paramac.jdField_case();
      bz localbz2;
      if ((localbz2 = (bz)a(i9)) == null)
      {
        b5.jdField_case("**********NO Found dier***********");
        return;
      }
      if (bool5)
        localbz2.jdField_do(4);
      else
        localbz2.jdField_do(2);
      localbz2.jdField_for(0);
      return;
    case -2147287028:
      this = paramac.jdField_new();
      if ((bp.ag().r() != 0) && (this > bp.ag().r()))
        bp.ag().fK = true;
      bp.ag().jdField_if(this);
      bp.ag().jdField_int(paramac.jdField_byte());
      bp.ag().jdField_for(paramac.jdField_byte());
      bp.ag().jdField_try(paramac.jdField_byte());
      bp.ag().jdField_byte(paramac.jdField_byte());
      bp.ag().a(paramac.jdField_char());
      bp.ag().jdField_if(paramac.jdField_char());
      bp.ag().n(paramac.jdField_if());
      bp.ag().ep = paramac.jdField_case();
      b5.jdField_case("***GOManager-cmd-S_PLAYER_XP_HP_CHANGE****" + bp.ag().aI());
      return;
    case -2147287023:
      bp.ag();
      bp.fg[0] = paramac.jdField_byte();
      return;
    case -2147287019:
      if ((this = (b)a(n = paramac.jdField_byte())) == null)
      {
        b5.jdField_case("**********NO Found HORSECART***********");
        return;
      }
      paramInt = paramac.jdField_if();
      b5.jdField_case("S_OBJECT_HORSECART***t=" + paramInt);
      if (paramInt == 1)
      {
        this.bq = 0;
        this.a4 = false;
        bool3 = false;
        i5 = this.ap;
        this.ap = paramac.jdField_if();
        b5.jdField_case("S_OBJECT_HORSECART***horc=" + this.ap);
        if (this.ap == 1)
        {
          if (i5 == 0)
          {
            this.al = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 }, { 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 }, { 607, 608 } };
          }
          else if ((i5 == 1) && (this.W != null))
          {
            paramInt = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 }, { 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 }, { 607, 608 }, { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 }, { 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
            a$7efcb6ee(13, paramInt);
            localObject2 = new short[][] { this.al[0], this.al[1], this.al[2], this.al[3], this.al[4], this.al[5] };
            this.al = ((S)localObject2);
          }
          b2 = 6;
          k();
        }
        else if (this.ap == 2)
        {
          if (this.W == null)
            if (i5 == 0)
            {
              this.al = new short[][] { { 580, 581 }, { 582, 583 }, { 584, 585, 586, 587 }, { 588, 589 }, { 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606 }, { 607, 608 }, { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 }, { 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
            }
            else if (i5 == 1)
            {
              paramInt = new short[][] { this.al[0], this.al[1], this.al[2], this.al[3], this.al[4], this.al[5], { 609, 610, 611, 612, 613, 614 }, { 615, 616, 617, 618, 619 }, { 620, 621 }, { 571, 572, 573 }, { 574 }, { 575, 576, 577 }, { 578, 579 } };
              this.al = paramInt;
            }
          b2 = 13;
          j();
        }
        paramInt = null;
        paramInt = new short[n = paramac.jdField_if()][];
        for (i8 = 0; i8 < n; i8 = (byte)(i8 + 1))
        {
          paramac.jdField_if();
          i5 = paramac.jdField_if();
          paramInt[i8] = new short[i5];
          for (i9 = 0; i9 < i5; i10 = (byte)(i9 + 1))
            paramInt[i8][i9] = paramac.jdField_new();
        }
        a$7efcb6ee(b2, paramInt);
      }
      else
      {
        if (paramInt == 0)
        {
          this.ap = paramac.jdField_if();
          if (this.al != null)
          {
            if (this.ap == 1)
            {
              this.ap = 0;
              E();
              this.al = null;
              break;
            }
            if (this.ap == 2)
            {
              this.ap = 0;
              g();
              this.al = null;
              break;
            }
          }
          else
          {
            this.ap = 0;
          }
        }
        return;
      }
    case -2147287018:
      bp.ag().eK = false;
      return;
    case -2147287015:
      paramInt = paramac.jdField_goto();
      if (b2.jdField_try == null)
        b2.jdField_try = new av();
      b2.jdField_try.jdField_try = 0;
      if (paramInt.length() == 0)
      {
        b2.a();
        b2.jdField_try.jdField_if();
        return;
      }
      b2.jdField_try.a(paramInt);
      return;
    case -2147287014:
      b5.a(b2 = paramac.jdField_if());
      for (i5 = 0; i5 < b2; i5++)
        b2.jdField_try.a(paramac.jdField_byte(), paramac.jdField_new(), paramac.jdField_goto(), paramac.jdField_if(), paramac.jdField_byte());
      b2.jdField_try.jdField_goto();
      return;
    case -2147287012:
      i6 = paramac.jdField_byte();
      b5.jdField_case("GOManager-cmd-S_SKILL_CD_OK=" + i6);
      paramInt = b2.jdField_try;
      bp.ag();
      if ((i8 = bp.jdField_void(i6)) == -1)
      {
        b5.jdField_case("GOManager-cmd-S_技能ID没有找到！");
        return;
      }
      bp.ag();
      bp.et[i8] = 0L;
      paramInt.a(1, i6, false);
      paramInt.jdField_goto();
      return;
    case -2146631679:
      b5.jdField_case("玩家与NPC交谈isWaiting========" + a5.fR);
      i6 = paramac.jdField_if();
      b5.jdField_case("GOManager-cmd-S_PLAYER_NPC_TALK");
      b5.jdField_case("fc = " + i6);
      i10 = 0;
      this = new int[i6];
      paramInt = new String[i6];
      for (n = 0; n < i6; n++)
      {
        this[n] = paramac.jdField_byte();
        i10 = 1;
        paramInt[n] = paramac.jdField_goto();
        b5.jdField_case("*find-＝" + this[n] + "--centent=" + paramInt[n]);
      }
      b5.jdField_case("haveMapMenu = " + i10);
      if (i10 != 0)
      {
        (br.iW = new br(1)).a(paramInt, this);
        a5.jdField_try(5);
        a5.fR = false;
        return;
      }
      a5.fR = false;
      return;
    case -2147155967:
      a5.h7 = paramac.jdField_int(paramac.jdField_do() - 6);
      b5.jdField_case("********商店，收到UI界面*********");
      return;
    case -2147090433:
      a5.h2 = paramac.jdField_int(paramac.jdField_do() - 6);
      a5.fR = false;
      b5.jdField_case("********商店，收到UI数据*********");
      return;
    case -2147287009:
      paramac.jdField_if();
      this.b = System.currentTimeMillis();
      return;
    case -2146631644:
      if ((l.jdField_case = paramac.jdField_byte()) == 0)
        return;
      (this = (b)a(jdField_case)).eb = paramac.jdField_case();
      this.dp = paramac.jdField_if();
      if (this.dp == 1)
      {
        z.ad[0] = jdField_case;
        return;
      }
      if (this.dp != 2)
        break;
      z.ad[1] = jdField_case;
      return;
    case -2146631624:
      z.jdField_case = false;
      if (jdField_goto != 3)
        jdField_goto = 3;
      z.ag = new Vector();
      if (a5.gQ == null)
        break;
      as.a8();
      return;
    case -2147287005:
      bp.ag().jdField_char(paramac.jdField_byte());
      return;
    case -2147287004:
      this = (b)a(this = paramac.jdField_byte());
      paramInt = paramac.jdField_byte();
      if (this == null)
        return;
      jdField_char(paramInt);
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     l
 * JD-Core Version:    0.6.0
 */
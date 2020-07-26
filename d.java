import java.io.PrintStream;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class d
{
  private static boolean a = false;

  public static byte[] jdMethod_do(int paramInt)
  {
    ac localac1;
    (localac1 = new ac()).jdMethod_do(paramInt);
    switch (paramInt)
    {
    case 1572865:
      a5.fR = true;
      localac1.jdMethod_do(l.a().jdMethod_new());
      b5.jdMethod_case("GOManager-cmd-C_SKILL_SHOW=" + l.a().jdMethod_new());
      break;
    case 1572866:
      localac1.jdMethod_do(l.a().jdMethod_new());
      b5.jdMethod_case("GOManager-cmd-C_COLLECT=" + l.a().jdMethod_new());
      break;
    case 1572867:
      a5.fR = true;
      a = true;
      localac1.jdMethod_do(l.a().jdMethod_new());
      paramInt = (short)(paramInt = (bv)a5.es.cf().elementAt(3)).t(paramInt.dw());
      localac1.a(bp.fj[paramInt]);
      b5.jdMethod_case("GOManager-cmd-C_STUDY_SKILL=" + l.a().jdMethod_new() + "--SkillID=" + bp.fj[paramInt]);
      break;
    case 1572868:
      a5.fR = true;
      break;
    case 1572869:
      localac1.a(bp.ag().eR);
      for (paramInt = 0; paramInt < bp.ag().eR; paramInt = (byte)(paramInt + 1))
      {
        int i = bp.ag().ee[paramInt].length;
        ac localac2;
        (localac2 = localac1).a((byte)i);
        localac1.jdMethod_if(bp.ag().ee[paramInt]);
        b5.jdMethod_case("GOManager-cmd-C_CHANGE_GENIUS=" + bp.ag().ee[paramInt]);
      }
    }
    return localac1.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2145910783:
      paramInt = paramac.jdMethod_case();
      b5.jdMethod_case("GOManager-cmd-S_SKILL_SHOW=" + paramInt);
      a(-1610612731);
      a5.jdMethod_try(4);
      break;
    case -2145910781:
      paramInt = new long[4];
      for (int i = 0; i < 4; i = (byte)(i + 1))
        paramInt[i] = paramac.jdMethod_char();
      bp.ag().a(paramInt);
      b2.a();
      b2.try.jdMethod_do();
      if (!a)
        break;
      a = false;
      bv localbv;
      paramInt = (localbv = (bv)a5.es.cf().elementAt(3)).dt().size();
      paramac = localbv.jl;
      localbv.dy();
      localbv.jl = 0;
      localbv.a(3);
      int[] arrayOfInt = bp.ag().aH();
      for (int k = 0; k < arrayOfInt.length; k = (short)(k + 1))
      {
        bp.ag();
        m localm;
        bp.ag();
        (localm = new m("" + bp.eQ[arrayOfInt[k]], 8, 0, localbv.dF())).jdMethod_if(bp.eD[arrayOfInt[k]]);
        localbv.a(localm);
      }
      k = localbv.dt().size();
      localbv.jdMethod_if(arrayOfInt);
      bv.a(localbv, 0);
      if (paramInt > k)
      {
        localbv.jl = paramac;
        if (localbv.jl >= k)
        {
          localbv.jl -= 1;
          if (localbv.jl < 0)
            localbv.jl = 0;
        }
        if (localbv.dw() == (byte)k)
        {
          localbv.y((byte)(k - 1));
          localbv.jl -= 1;
          if (localbv.jl < 0)
            localbv.jl = 0;
        }
        if (k - localbv.jl < localbv.z$132bd3())
        {
          localbv.jl -= 1;
          if (localbv.jl < 0)
            localbv.jl = 0;
        }
      }
      else if (paramInt == k)
      {
        localbv.jl = paramac;
      }
      if ((paramInt = localbv.dr()).U != null)
        (paramInt = localbv.dr()).U.a((short)k, (short)localbv.z$132bd3(), (short)localbv.jl);
      break;
    case -2145910780:
      bp.ag().jdMethod_do(paramac);
      jdMethod_if(524292);
      a5.jdMethod_try(4);
      break;
    case -2145910777:
      bp.ag().jdMethod_if(paramac);
      break;
    case -2145910776:
      System.out.println("222222222222222222");
      int j;
      bp.a(j = paramac.jdMethod_if(), paramac);
      break;
    case -2145910775:
      System.out.println("111111111111111");
      paramInt = paramac.jdMethod_case();
      bp.a(paramac, paramInt);
    case -2145910782:
    case -2145910779:
    case -2145910778:
    }
    a5.fR = false;
  }

  private static void a(int paramInt)
  {
    Object localObject1 = e.a("/ui/learnskill.ui");
    be localbe = e.a("/ui/learnskill.ui");
    (a5.es = localObject1).g9 = paramInt;
    a5.fE.addElement(localObject1);
    a5.fE.addElement(localbe);
    (paramInt = (bv)a5.es.cf().elementAt(3)).dy();
    paramInt.a(3);
    localObject1 = bp.ag().aH();
    for (int i = 0; i < localObject1.length; i = (short)(i + 1))
    {
      bp.ag();
      bp.ag();
      (localObject2 = new m("" + bp.eQ[localObject1[i]], 8, 0, paramInt.dF())).jdMethod_if(bp.eD[localObject1[i]]);
      paramInt.a((m)localObject2);
    }
    paramInt.jdMethod_if(localObject1);
    bv.a(paramInt, 0);
    bv localbv;
    (localbv = (bv)localbe.cf().elementAt(3)).dy();
    localbv.a(4);
    localbv.a(new m("1-10级", 0, 0, localbv.dF()));
    localbv.a(new m("11-20级", 0, 0, localbv.dF()));
    localbv.a(new m("21-30级", 0, 0, localbv.dF()));
    localbv.a(new m("31-40级", 0, 0, localbv.dF()));
    localbv.a(new m("41-50级", 0, 0, localbv.dF()));
    localbv.a(new m("51-60级", 0, 0, localbv.dF()));
    localbv.a(new m("61-70级", 0, 0, localbv.dF()));
    Object localObject2 = { 1, 2, 3, 4, 5, 6, 7 };
    localbv.jdMethod_if(localObject2);
    bv.a(localbv, 0);
  }

  private static void jdMethod_if(int paramInt)
  {
    Vector localVector = new Vector();
    for (byte b = 0; b < bp.ag().eR; b = (byte)(b + 1))
    {
      be localbe;
      ah localah;
      (localah = (ah)(localbe = e.a("/ui/geniustree.ui")).cf().elementAt(8)).a(20);
      Object localObject2;
      if (b == 0)
      {
        for (int j = 0; j < bp.ag().eR; j++)
        {
          localVector.addElement(bp.ag().ff[j] + "天赋");
          for (int k = 0; k < bp.ag().fL[j].length; k++)
            bp.ag().fL[j][k] = 0;
        }
        localObject1 = (ah)localbe.cf().elementAt(6);
        localObject2 = (ah)localbe.cf().elementAt(7);
        bp.ag().e0 = (short)(3 + ((ba)localObject1).jdMethod_long() + ah.ad());
        bp.ag().fb = (short)(((ba)localObject2).jdMethod_long() - bp.ag().e0);
      }
      localbe.g9 = paramInt;
      (localObject1 = (ae)localbe.cf().elementAt(4)).a(localVector);
      a5.fE.addElement(localbe);
      (localObject2 = (ao)localbe.cf().elementAt(0)).jdMethod_for(true);
      ((ba)localObject2).a(true, localbe);
      ((ba)localObject2).w();
      Object localObject1 = (ah)localbe.cf().elementAt(6);
      bp.ag().e1 = ((ba)localObject1).v();
      bp.ag().e3 = ((ba)localObject1).jdMethod_for();
      int m;
      if ((m = bp.ag().a(b, bp.ag().fC[b])) == -1)
        m = 0;
      String str = bp.ag().eF[b][m];
      localbe.c(bp.ag().fl[b][m]);
      ((ah)localObject1).a(str);
      (localObject1 = (ah)localbe.cf().elementAt(8)).a(bp.ag().e7 + "");
      int i = bp.ag().fc[b][(bp.ag().fc[b].length - 1)];
      ((ao)localObject2).b6 = (byte)((i - 1) / 3 + 1);
      ((ao)localObject2).ca = (byte)(bp.ag().fb / 27);
      ((ao)localObject2).cl = 0;
      i = (short)((i = (short)(bp.ag().fb + (a5.ca.getHeight() << 1))) - a5.hI.getHeight());
      ((ao)localObject2).b1 = (short)(i / (((ao)localObject2).b6 - ((ao)localObject2).ca + 2));
      ((ao)localObject2).cr = (short)(bp.ag().e0 + 3 + a5.ca.getHeight() + i);
      ((ao)localObject2).cq = new af((short)(bp.ag().e1 + bp.ag().e3 - a5.ca.getWidth() - 5), (short)(bp.ag().e0 + 3), 0, i, 0, true, null);
      ((ao)localObject2).cq.a((short)((ao)localObject2).b6, (short)((ao)localObject2).ca, (short)((ao)localObject2).cl);
    }
    (a5.es = (be)a5.fE.elementAt(0)).ck();
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     d
 * JD-Core Version:    0.6.0
 */
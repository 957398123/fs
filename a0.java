import java.io.PrintStream;

public final class a0
{
  private static a0 F = null;
  private static int D = 0;

  public static a0 a()
  {
    if (F == null)
      F = new a0();
    return F;
  }

  public static byte[] a(int paramInt)
  {
    byte[] arrayOfByte = null;
    int j;
    int i = (byte)((j = paramInt) >> 16);
    a5.dS = a5.es;
    try
    {
      ac localac;
      switch (i)
      {
      case 0:
      case 1:
      case 17:
        arrayOfByte = a1.a(paramInt);
        break;
      case 2:
        arrayOfByte = z.a(paramInt);
        break;
      case 3:
      case 13:
        arrayOfByte = l.jdMethod_do().jdMethod_do(paramInt);
        break;
      case 4:
        arrayOfByte = bf.a(paramInt);
        break;
      case 9:
        paramInt = paramInt;
        b5.jdMethod_case("UITable.selectedPlayerId:" + bg.hP);
        (localac = new ac()).jdMethod_do(paramInt);
        switch (paramInt)
        {
        case 589826:
          a5.fR = true;
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("PCSocial.snd_Parse()...add:" + l.g.e);
          break;
        case 589827:
          a5.fR = true;
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("PCSocial.snd_Parse()...del:" + l.g.e);
          break;
        case 589825:
          a5.fR = true;
          b5.jdMethod_case("PCSocial.snd_Parse()...friend list.");
          break;
        case 589829:
          a5.fR = true;
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("PCSocial.snd_Parse()...blackadd:" + l.g.e);
          break;
        case 589830:
          a5.fR = true;
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("PCSocial.snd_Parse()...blackdel:" + l.g.e);
          break;
        case 589828:
          a5.fR = true;
          b5.jdMethod_case("PCSocial.snd_Parse()...black list.");
          break;
        case 589831:
          a5.fR = true;
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("PCSocial.snd_Parse()...player detail.");
          break;
        case 589833:
          localac.jdMethod_if(b1.lN);
          b5.jdMethod_case("PCSocial.snd_Parse()...C_UI_SOCIAL_ADD_FRIEND_FORM.");
          break;
        case 589847:
          localac.jdMethod_if(b1.lN);
          b5.jdMethod_case("PCSocial.snd_Parse()...C_UI_SOCIAL_ADD_BLACK_FORM.");
          break;
        case 589832:
          a5.fR = true;
          b5.jdMethod_case("PCSocial.snd_Parse()...SOCIAL_SEARCH.");
          break;
        case 589834:
          a5.fR = true;
          b5.jdMethod_case("PCSocial.snd_Parse()...C_UI_SOCIAL_TALK_FL.");
          break;
        case 589835:
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("PCSocial.snd_Parse()...C_TOPFORM_SOCIAL_FRIENDADD.");
          break;
        case 589836:
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("PCSocial.snd_Parse()...C_TOPFORM_SOCIAL_BLACKADD.");
          break;
        case 589841:
          a5.fR = true;
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("将当前玩家加为仇人");
          break;
        case 589842:
          a5.fR = true;
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("将当前玩家从仇人列表中删除出去");
          break;
        case 589843:
          a5.fR = true;
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("查看当前仇人的信息");
          break;
        case 589844:
          a5.fR = true;
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("传送到该仇人的身边");
          break;
        case 589845:
          a5.fR = true;
          b5.jdMethod_case("向服务器索要仇人列表");
          break;
        case 589846:
          a5.fR = true;
          localac.jdMethod_do(bg.hP);
          b5.jdMethod_case("好友传送");
          break;
        case 624776:
          localac.jdMethod_do(bp.ag().eC);
          break;
        case 589848:
          a5.fR = true;
          localac.jdMethod_if(b1.lN);
          b5.jdMethod_case("--------------发送仇人昵称--------------------");
        }
        arrayOfByte = localac.jdMethod_long();
        break;
      case 10:
        arrayOfByte = ad.a(paramInt);
        break;
      case 11:
        arrayOfByte = bu.a(paramInt);
        break;
      case 7:
        arrayOfByte = at.a(paramInt);
        break;
      case 14:
        arrayOfByte = bx.a(paramInt);
        break;
      case 15:
        paramInt = paramInt;
        a5.fR = true;
        (localac = new ac()).jdMethod_do(paramInt);
        Object localObject;
        switch (paramInt)
        {
        case 983046:
        case 983047:
        case 983048:
        case 983057:
          a5.fR = true;
          b5.jdMethod_case("********商店，发送命令*********");
          break;
        case 983041:
          localac.jdMethod_do(l.g.jdMethod_new());
          localac.a(r.mp);
          b5.jdMethod_case("发送 商店->查看 命令！！！！");
          break;
        case 983042:
          localac.jdMethod_do(l.g.jdMethod_new());
          localac.a(r.mp);
          b5.jdMethod_case("------- 买了第 " + r.mp + "格的物品");
          paramInt = as.c4;
          (localObject = localac).a((byte)paramInt);
          b5.jdMethod_case("发送 商店->买入 命令 - 买了" + as.c4 + " 个");
          as.c4 = 0;
          break;
        case 983043:
          localac.a(r.mp);
          paramInt = as.c4;
          (localObject = localac).a((byte)paramInt);
          b5.jdMethod_case("发送 商店->卖出 命令 - 卖出" + as.c4 + " 个");
          as.c4 = 0;
          b5.jdMethod_case("发送 商店->卖出 命令！！！！");
          break;
        case 983044:
          a5.fR = true;
          b5.jdMethod_case("发送 商店->整理 命令！！！！");
          break;
        case 983045:
          localac.a(r.mp);
          b5.jdMethod_case("发送 商店->丢弃 命令！！！！");
          break;
        case 983049:
          localac.jdMethod_do(l.g.jdMethod_new());
          break;
        case 983056:
        case 983058:
          localac.jdMethod_do(l.g.jdMethod_new());
        case 983050:
        case 983051:
        case 983052:
        case 983053:
        case 983054:
        case 983055:
        }
        arrayOfByte = localac.jdMethod_long();
        break;
      case 6:
        arrayOfByte = b3.a(paramInt);
        break;
      case 18:
        arrayOfByte = bs.a(paramInt);
        break;
      case 19:
        arrayOfByte = an.a(paramInt);
        break;
      case 21:
        arrayOfByte = a2.a(paramInt);
        break;
      case 26:
        arrayOfByte = q.a(paramInt);
        break;
      case 22:
        arrayOfByte = n.a(paramInt);
        break;
      case 24:
        arrayOfByte = d.jdMethod_do(paramInt);
        break;
      case 27:
        paramInt = paramInt;
        a5.fR = true;
        (localac = new ac()).jdMethod_do(paramInt);
        switch (paramInt)
        {
        case 1769473:
        case 1769478:
        case 1769479:
        case 1769480:
        case 1769488:
        case 1769489:
        case 1769490:
        case 1769491:
        case 1769492:
          localac.jdMethod_do(l.g.jdMethod_new());
          b5.jdMethod_case("********兑换界面*********");
          break;
        case 1769475:
        case 1769481:
          localac.jdMethod_do(l.g.jdMethod_new());
          localac.a(r.mp);
          break;
        case 1769474:
          localac.jdMethod_do(l.g.jdMethod_new());
          localac.a(r.mp);
          localac.jdMethod_do(as.c4);
          b5.jdMethod_case("C_CHANGE_FINISH");
          break;
        case 1769476:
          localac.jdMethod_do(l.g.jdMethod_new());
          localac.a(r.mp);
          b5.jdMethod_case("C_CHANGE_POPFORM");
        case 1769477:
        case 1769482:
        case 1769483:
        case 1769484:
        case 1769485:
        case 1769486:
        case 1769487:
        }
        arrayOfByte = localac.jdMethod_long();
        break;
      case 25:
        arrayOfByte = bt.jdMethod_do(paramInt);
        break;
      case 28:
        arrayOfByte = i.jdMethod_do(paramInt);
        break;
      case 29:
        arrayOfByte = bw.a(paramInt);
        break;
      case 23:
        paramInt = paramInt;
        a5.fR = true;
        (localac = new ac()).jdMethod_do(paramInt);
        switch (paramInt)
        {
        case 1507329:
          localac.jdMethod_do(l.g.jdMethod_new());
          b5.jdMethod_case("Rank.snd_Parse() C_RANK_LIST...");
          break;
        case 1507330:
          localac.a(ax.a);
          b5.jdMethod_case("Rank.snd_Parse() C_RANK_DETAIL_LIST...");
          break;
        case 1507331:
          b5.jdMethod_case("Rank.snd_Parse() C_RANK_NONE_NPC_LIST...");
        }
        arrayOfByte = localac.jdMethod_long();
        break;
      case 30:
        arrayOfByte = au.a(paramInt);
        break;
      case 31:
        arrayOfByte = aq.a(paramInt);
        break;
      case 33:
        arrayOfByte = bb.a(paramInt);
        break;
      case 34:
        arrayOfByte = aj.a(paramInt);
        break;
      case 32:
        arrayOfByte = by.a(paramInt);
        break;
      case 35:
        arrayOfByte = al.a(paramInt);
        break;
      case 36:
        arrayOfByte = o.a(paramInt);
        break;
      case 37:
        arrayOfByte = bo.jdMethod_if(paramInt);
        break;
      case 38:
        paramInt = paramInt;
        (localac = new ac()).jdMethod_do(paramInt);
        a5.fR = true;
        switch (paramInt)
        {
        case 2490369:
          localac.jdMethod_do(bu.jdMethod_do());
          break;
        case 2490373:
        case 2490420:
          localac.jdMethod_do(bu.jdMethod_do());
          break;
        case 2490375:
        case 2490422:
          localac.jdMethod_do(bu.jdMethod_do());
          break;
        case 2490386:
          break;
        case 2490385:
          b5.jdMethod_case("请求徒弟列表");
          break;
        case 2490402:
        case 2490421:
          localac.a(c.for);
          break;
        case 2490403:
          localac.jdMethod_do(bg.hP);
          break;
        case 2490404:
          localac.jdMethod_do(as.c4);
          a5.fR = false;
          break;
        case 2490408:
        case 2490409:
        case 2490416:
          a5.fR = false;
          localac.jdMethod_do(c.a);
          break;
        case 2490407:
        case 2490417:
          localac.jdMethod_do(c.a);
          break;
        case 2490423:
          a5.fR = false;
          localac.jdMethod_do(c.a);
        case 2490370:
        case 2490371:
        case 2490372:
        case 2490374:
        case 2490376:
        case 2490377:
        case 2490378:
        case 2490379:
        case 2490380:
        case 2490381:
        case 2490382:
        case 2490383:
        case 2490384:
        case 2490387:
        case 2490388:
        case 2490389:
        case 2490390:
        case 2490391:
        case 2490392:
        case 2490393:
        case 2490394:
        case 2490395:
        case 2490396:
        case 2490397:
        case 2490398:
        case 2490399:
        case 2490400:
        case 2490401:
        case 2490405:
        case 2490406:
        case 2490410:
        case 2490411:
        case 2490412:
        case 2490413:
        case 2490414:
        case 2490415:
        case 2490418:
        case 2490419:
        }
        arrayOfByte = localac.jdMethod_long();
        break;
      case 39:
        arrayOfByte = az.a(paramInt);
        break;
      case 40:
        arrayOfByte = b4.a(paramInt);
        break;
      case 41:
        arrayOfByte = u.a(paramInt);
        break;
      case 48:
        arrayOfByte = aa.a(paramInt);
        break;
      case 49:
        paramInt = paramInt;
        (localac = new ac()).jdMethod_do(paramInt);
        switch (paramInt)
        {
        case 3211265:
        case 3211266:
        case 3211267:
        case 3211268:
        case 3211269:
          a5.fR = true;
        }
        arrayOfByte = localac.jdMethod_long();
        break;
      case 51:
        arrayOfByte = am.a(paramInt);
        break;
      case 52:
        paramInt = paramInt;
        (localac = new ac()).jdMethod_do(paramInt);
        arrayOfByte = localac.jdMethod_long();
      case 5:
      case 8:
      case 12:
      case 16:
      case 20:
      case 42:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 50:
      }
    }
    catch (Exception localException)
    {
    }
    return arrayOfByte;
  }

  public static void a(ac paramac)
  {
    paramac.jdMethod_new();
    D = paramac.jdMethod_byte();
    try
    {
      int i;
      ac localac1;
      int m;
      switch ((byte)((i = D) >> 16))
      {
      case 0:
      case 1:
      case 17:
        a1.a(D, paramac);
        break;
      case 2:
        z.a(D, paramac);
        break;
      case 3:
      case 13:
        l.jdMethod_do().a(D, paramac);
        break;
      case 4:
        bf.a(D, paramac);
        break;
      case 9:
        localac1 = paramac;
        int k;
        switch (paramac = D)
        {
        case -2146893822:
          b5.jdMethod_case("PCSocial.rec_Parse()...add return:" + localac1.jdMethod_if());
          break;
        case -2146893821:
          b5.jdMethod_case("PCSocial.rec_Parse()...del return:" + localac1.jdMethod_if());
          break;
        case -2146893823:
          paramac = localac1.jdMethod_if();
          for (ac localac2 = 0; localac2 < paramac; k = (byte)(localac2 + 1))
          {
            b5.jdMethod_case("PCSocial.rec_Parse()..name:" + localac1.jdMethod_goto());
            b5.jdMethod_case("PCSocial.rec_Parse()..id:" + localac1.jdMethod_new());
            b5.jdMethod_case("PCSocial.rec_Parse()..race:" + localac1.jdMethod_if());
            b5.jdMethod_case("PCSocial.rec_Parse()..pro:" + localac1.jdMethod_if());
            b5.jdMethod_case("PCSocial.rec_Parse()..online:" + localac1.jdMethod_case());
          }
          break;
        case -2146893819:
          b5.jdMethod_case("PCSocial.rec_Parse()...badd return:" + localac1.jdMethod_if());
          break;
        case -2146893818:
          b5.jdMethod_case("PCSocial.rec_Parse()...bdel return:" + localac1.jdMethod_if());
          break;
        case -2146893820:
          k = localac1.jdMethod_if();
          for (m = 0; m < k; m = (byte)(m + 1))
          {
            b5.jdMethod_case("PCSocial.rec_Parse().b.name:" + localac1.jdMethod_goto());
            b5.jdMethod_case("PCSocial.rec_Parse().b.id:" + localac1.jdMethod_new());
            b5.jdMethod_case("PCSocial.rec_Parse().b.race:" + localac1.jdMethod_if());
            b5.jdMethod_case("PCSocial.rec_Parse().b.pro:" + localac1.jdMethod_if());
            b5.jdMethod_case("PCSocial.rec_Parse().b.online:" + localac1.jdMethod_case());
          }
        }
        break;
      case 10:
        ad.a(D, paramac);
        break;
      case 11:
        bu.a(D, paramac);
        break;
      case 5:
        bl.a(D, paramac);
        break;
      case 6:
        localac1 = paramac;
        switch (paramac = D)
        {
        case -2147090423:
          a5.dh = paramac;
          a5.gb = localac1.jdMethod_int((localac1 = localac1).jdField_do.length - 6);
          break;
        case -2147090429:
          System.out.println("接收人物经验");
          a5.dh = paramac;
          a5.gb = localac1.jdMethod_int((localac1 = localac1).jdField_do.length - 6);
        }
        break;
      case 19:
        an.a(D, paramac);
        break;
      case 21:
        a2.a(D, paramac);
        break;
      case 26:
        q.a(D, paramac);
        break;
      case 22:
        n.a(D, paramac);
        break;
      case 24:
        d.a(D, paramac);
        break;
      case 27:
        localac1 = paramac;
        switch (paramac = D)
        {
        case -2145714175:
          a5.fR = false;
          System.out.println("~~~~~~~~~兑换弹板~~~~~~~~~~~~~S_CHANGE_TOP_FORM");
          paramac = localac1.jdMethod_byte();
          String str = localac1.jdMethod_goto();
          m = localac1.jdMethod_byte();
          as.cH = paramac;
          as.a(1, str, "确定", "返回", m, -1);
          a5.gQ.jdMethod_goto(paramac);
        }
        break;
      case 25:
        bt.a(D, paramac);
        break;
      case 28:
        i.a(D, paramac);
        break;
      case 29:
        bw.a(D, paramac);
        break;
      case 23:
        break;
      case 7:
        at.a(D, paramac);
        break;
      case 14:
        bx.a(D, paramac);
        break;
      case 30:
        au.a(D, paramac);
        break;
      case 18:
        bs.a(D, paramac);
        break;
      case 31:
        aq.a(D, paramac);
        break;
      case 33:
        bb.a(D, paramac);
        break;
      case 34:
        aj.a(D, paramac);
        break;
      case 32:
        by.a(D, paramac);
        break;
      case 35:
        al.a(D, paramac);
        break;
      case 36:
        o.a(D, paramac);
        break;
      case 37:
        bo.a(D, paramac);
        break;
      case 38:
        localac1 = paramac;
        switch (paramac = D)
        {
        case -2144993279:
          c.if = localac1.jdMethod_goto();
          c.do = localac1.jdMethod_byte();
          c.int = localac1.jdMethod_case();
          break;
        case -2144993278:
          as.cH = 100;
          as.a(1, "请给师傅打分：", "确定", "", 2490404, -2);
          a5.gQ.jdMethod_goto(100);
        }
        break;
      case 39:
        az.a(D, paramac);
        break;
      case 40:
        b4.a(D, paramac);
        break;
      case 41:
        u.a(D, paramac);
        break;
      case 48:
        aa.a(D, paramac);
        break;
      case 49:
        break;
      case 51:
        am.a(D, paramac);
      case 8:
      case 12:
      case 15:
      case 16:
      case 20:
      case 42:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 50:
      case 52:
      }
      return;
    }
    catch (Exception paramac)
    {
      int j;
      b5.jdMethod_case("getType(nCmd)=" + (byte)((j = D) >> 16));
      paramac.printStackTrace();
    }
  }

  public static byte jdMethod_if(int paramInt)
  {
    return (byte)(paramInt >> 16);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     a0
 * JD-Core Version:    0.6.0
 */
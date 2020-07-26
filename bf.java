import java.io.PrintStream;
import java.util.Vector;

public final class bf
{
  public static boolean jdField_for = false;
  public static int a = -1;
  public static byte jdField_int = -1;
  public static byte jdField_try = -1;
  public static boolean jdField_if = false;
  public static int[] jdField_do;
  public static byte[] jdField_new;

  public static byte[] a(int paramInt)
  {
    a5.fR = true;
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 262187:
      b5.jdMethod_case("Task.snd_Parse() C_TASK_SELF...");
      break;
    case 262147:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_UI_TASK_VIEW...");
      break;
    case 262154:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_UI_TASK_VIEW_NO...");
      break;
    case 262152:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_GET...");
      break;
    case 262153:
      localac.jdField_do(l.g.jdField_new());
      b5.jdMethod_case("Task.snd_Parse() C_UI_TASK_NPCLIST...");
      break;
    case 262148:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_UI_UTASK_DROP...");
      break;
    case 262155:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_UI_QTASK_DROP...");
      break;
    case 262149:
      localac.jdField_do(bv.jI);
      localac.jdField_do(l.g.jdField_new());
      jdField_if = true;
      b5.jdMethod_case("Task.snd_Parse() C_UI_TASK_RECEIVE...");
      break;
    case 262150:
      localac.jdField_do(bv.jI);
      localac.jdField_do(l.g.jdField_new());
      b5.jdMethod_case("选择的任务报酬索引：" + a7.e3);
      localac.a(a7.e3);
      a7.e3 = -1;
      b5.jdMethod_case("Task.snd_Parse() C_UI_TASK_OVER...");
      break;
    case 262156:
      localac.jdField_do(bv.jI);
      localac.a(a7.fs);
      localac.a(a7.eB);
      b5.jdMethod_case("任务ID:" + bv.jI);
      b5.jdMethod_case("物品所在组:" + a7.fs);
      b5.jdMethod_case("物品所在行:" + a7.eB);
      b5.jdMethod_case("Task.snd_Parse() C_UI_TASK_GOODS...");
      break;
    case 262157:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_UI_TASK_TURNIN_VIEW...");
      break;
    case 262158:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_GET_JIE...");
      break;
    case 262159:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_GET_SELF...");
      break;
    case 262162:
      localac.jdField_do(bv.jI);
      localac.a(bv.kT);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_FIND_PATH...");
      break;
    case 262151:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_SHARE...");
      break;
    case 262164:
      b5.jdMethod_case("??????????????接收taskID = " + as.dV);
      localac.jdField_do(as.dV);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_SHARE_ACCEPT...");
      break;
    case 262172:
      localac.jdField_do(as.dV);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_SHARE_CANCEL...");
      break;
    case 262171:
      b5.jdMethod_case("Task.snd_Parse() C_TASK_ALL_LIST...");
      break;
    case 262173:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_RESET...");
      break;
    case 262174:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_RESET_VIEW...");
      break;
    case 262175:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_RESET_GET...");
      break;
    case 262176:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_ACCEPT_VIEW...");
      break;
    case 262177:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_ACCEPT_GET...");
      break;
    case 263168:
      localac.jdField_do(l.g.jdField_new());
      b5.jdMethod_case("Task.snd_Parse() C_TASK_VIEW_NPC...");
      break;
    case 262166:
      localac.jdField_do(a);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_CAN_RESET_MAP...");
      break;
    case 262167:
      localac.jdField_do(a);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_CAN_RESET_TASK...");
      break;
    case 262169:
      localac.jdField_do(a);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_CAN_ACCEPT_MAP...");
      break;
    case 262170:
      localac.jdField_do(a);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_CAN_ACCEPT_TASK...");
      break;
    case 262178:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_REFESH_VIEW...");
      break;
    case 262179:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_REFESH...");
      break;
    case 262180:
      b5.jdMethod_case("Task.snd_Parse() C_TASK_GOODS_RECEIVE...");
      break;
    case 262181:
      b5.jdMethod_case("Task.snd_Parse() C_TASK_GOODS_GET...");
      break;
    case 262182:
      localac.a(a7.fs);
      localac.a(a7.eB);
      b5.jdMethod_case("UIPicture.sGroupIndex = " + a7.fs);
      b5.jdMethod_case("UIPicture.sColIndex = " + a7.eB);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_GOODS_VIEW_GOODS...");
      break;
    case 262184:
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_COLLECT...");
      break;
    case 262185:
      b5.jdMethod_case("Task.snd_Parse() C_TASK_FAVORITE...");
      break;
    case 262186:
      b5.jdMethod_case("UIList.selectedListId: " + bv.jI);
      localac.jdField_do(bv.jI);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_FAVORITE_DEL...");
      break;
    case 262189:
      localac.jdField_do(bv.jI);
      localac.a(jdField_int);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_VIEW_MUST_GOODS...");
      break;
    case 262188:
      localac.jdField_do(bv.jI);
      localac.jdField_do(l.g.jdField_new());
      b5.jdMethod_case("Task.snd_Parse() C_TASK_CHECK_MAYBE_OVER...");
      break;
    case 262190:
      localac.jdField_do(bv.jI);
      localac.jdField_do(l.g.jdField_new());
      b5.jdMethod_case("Task.snd_Parse() C_TASK_JIE_MAYBE_GOODS...");
      break;
    case 262192:
      localac.a(jdField_try);
      b5.jdMethod_case("Task.snd_Parse() C_TASK_ANSWER...");
      break;
    case 262193:
      b5.jdMethod_case("Task.snd_Parse() C_TASK_INSERTCHAT...");
      break;
    case 262194:
      localac.jdField_do(bv.jI);
      localac.a(bv.kT);
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    int i;
    switch (paramInt)
    {
    case -2147221500:
    case -2147221499:
    case -2147221498:
    case -2147221493:
    case -2147221492:
    case -2147221490:
      b5.jdMethod_case("Task.rec_Parse() S_TASK_JIAO or S_TASK_JIE or S_TASK_SELF...");
      a5.dh = paramInt;
      a5.gb = paramac.jdField_int((paramInt = paramac).jdField_do.length - 6);
      return;
    case -2147221495:
      b5.jdMethod_case("Task.rec_Parse() S_TASK_GUIDE_LOCALE...");
      a5.A();
      a5.aj();
      bp.ag().aA = new b0().a(bp.ag().l, bp.ag().q, bv.j9, bv.j8);
      bp.ag().jdField_do(104);
      break;
    case -2147221491:
      b5.jdMethod_case("Task.rec_Parse() S_TASK_ID...");
      bv.jI = paramac.jdMethod_byte();
      b5.jdMethod_case(" S_TASK_ID = " + Integer.toHexString(bv.jI));
      return;
    case -2147221489:
      paramInt = paramac.jdField_if();
      b5.jdMethod_case(" S_TASK_TYPE = " + paramInt);
      if (paramInt == 1)
      {
        jdField_for = false;
        return;
      }
      jdField_for = true;
      return;
    case -2147221488:
      a5.A();
      b5.jdMethod_case(" S_TASK_SUCCESS_OVER ");
      return;
    case -2147221453:
      for (paramInt = (paramInt = paramac.jdField_if()) - 1; paramInt >= 0; paramInt--)
      {
        i = paramac.jdMethod_byte();
        byte b = paramac.jdField_if();
        for (int j = l.else.length - 1; j >= 0; j--)
        {
          if (l.else[j].jdField_new() != i)
            continue;
          b localb;
          (localb = (b)l.else[j]).dw = b;
          localb.cK = 48;
          break;
        }
      }
      return;
    case -2147221487:
      System.out.println("玩家点击任务========");
      paramInt = paramac.jdField_if();
      i = 0;
      int[] arrayOfInt = new int[paramInt];
      String[] arrayOfString = new String[paramInt];
      jdField_do = new int[paramInt];
      jdField_new = new byte[paramInt];
      for (int k = 0; k < paramInt; k++)
      {
        arrayOfInt[k] = paramac.jdMethod_byte();
        i = 1;
        arrayOfString[k] = paramac.jdMethod_goto();
        jdField_do[k] = paramac.jdMethod_byte();
        jdField_new[k] = paramac.jdField_if();
        System.out.println("功能ID: " + jdField_do[k]);
      }
      if (i == 0)
        break;
      (br.iW = new br(3)).a(arrayOfString, arrayOfInt);
      br.iW.m(false);
      a5.jdField_try(5);
      a5.fR = false;
    case -2147221497:
    case -2147221496:
    case -2147221494:
    case -2147221486:
    case -2147221485:
    case -2147221484:
    case -2147221483:
    case -2147221482:
    case -2147221481:
    case -2147221480:
    case -2147221479:
    case -2147221478:
    case -2147221477:
    case -2147221476:
    case -2147221475:
    case -2147221474:
    case -2147221473:
    case -2147221472:
    case -2147221471:
    case -2147221470:
    case -2147221469:
    case -2147221468:
    case -2147221467:
    case -2147221466:
    case -2147221465:
    case -2147221464:
    case -2147221463:
    case -2147221462:
    case -2147221461:
    case -2147221460:
    case -2147221459:
    case -2147221458:
    case -2147221457:
    case -2147221456:
    case -2147221455:
    case -2147221454:
    }
  }

  public static void jdField_if()
  {
    ao localao = (ao)a5.es.cf().elementAt(1);
    if (bv.jp)
    {
      localao.a("完成", 0);
      return;
    }
    localao.a("", 0);
  }

  public static void a()
  {
    ao localao = (ao)a5.es.cf().elementAt(1);
    if (bv.jP)
    {
      localao.a("接受", 0);
      return;
    }
    localao.a("", 0);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bf
 * JD-Core Version:    0.6.0
 */
public final class a2
{
  private static int a = 0;

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdMethod_do(paramInt);
    switch (paramInt)
    {
    case 1376257:
      localac.jdMethod_do(a);
      b5.jdMethod_case("--------------- 发送 请求交易 命令-------------");
      break;
    case 1376269:
      localac.jdMethod_do(l.g.jdMethod_new());
      a5.fR = true;
      b5.jdMethod_case("--------------- 发送 请求交易检测 命令-------------");
      break;
    case 1376260:
      be.ch();
      a5.fR = true;
      b5.jdMethod_case("--------------- 发送 请求交易界面 命令-------------");
      break;
    case 1376259:
      b5.jdMethod_case("--------------- 发送 拒绝交易界面 命令-------------");
      break;
    case 1376262:
    case 1376274:
      be.ch();
      a5.fR = true;
      b5.jdMethod_case("--------------- 发送 取消交易界面 命令-------------");
      break;
    case 1376261:
      paramInt = 0;
      for (int i = 0; i < r.mG.length; i++)
      {
        if (r.mG[i] <= -1)
          continue;
        paramInt = (byte)(paramInt + 1);
      }
      localac.a(paramInt);
      b5.jdMethod_case("UIGrid.tradeSign.length = " + r.mG.length);
      i = 0;
      paramInt = r.mG.length;
      while (i < paramInt)
      {
        if (r.mG[i] > -1)
        {
          localac.a(r.mG[i]);
          localac.a(r.md[i]);
          b5.jdMethod_case("UIGrid.tradeSignNum[" + i + "] = " + r.md[i]);
        }
        i++;
      }
      a5.fR = true;
      b5.jdMethod_case("--------------- 发送 确定选择物品，请求交易界面 命令-------------");
      break;
    case 1376263:
      a5.fR = true;
      b5.jdMethod_case("--------------- 发送 进背包选择物品 命令-------------");
      break;
    case 1376265:
      localac.jdMethod_do(be.gs);
      a5.fR = true;
      b5.jdMethod_case("--------------- 发送 锁定物品 命令-------------");
      break;
    case 1376266:
      if (be.gs > be.hm)
      {
        localac.a(true);
        b5.jdMethod_case("$$$$$$$$$$$$$ 大宗交易小心点！！！！ $$$$$$$$$$$$");
      }
      else
      {
        localac.a(false);
      }
      be.ch();
      a5.fR = true;
      b5.jdMethod_case("--------------- 发送 完成 命令-------------");
      break;
    case 1376268:
      localac.a(be.hH);
      a5.fR = true;
      b5.jdMethod_case("--------------- 发送 取回 命令-------------");
      break;
    case 1376267:
      localac.a(be.hd);
      b5.jdMethod_case("UIForm.curPicNum = " + be.hH);
      localac.a(be.hH);
      am.a = false;
      a5.fR = true;
      b5.jdMethod_case("--------------- 发送 物品查看 命令-------------");
      break;
    case 1376264:
      be.hC = true;
      r.dX();
      be.gs = 0;
      a5.fR = true;
      b5.jdMethod_case("--------------- 发送 清除物品 命令-------------");
      break;
    case 1376273:
      a5.fR = true;
      b5.jdMethod_case("--------------- 发送 交易查看物品信息后返回 命令 -------------");
    case 1376258:
    case 1376270:
    case 1376271:
    case 1376272:
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2146107388:
      be.gG = paramac.jdMethod_byte();
      b5.jdMethod_case("--------------- 接收交易界面获取人物金钱 命令-------------");
      return;
    case -2146107386:
      be.ch();
      if (a5.V() == 4)
        a5.A();
      b5.jdMethod_case("--------------- 取消交易界面 命令-------------");
      return;
    case -2146107385:
      b5.jdMethod_case("--------------- 接收交易界面标识 命令-------------");
      return;
    case -2146107383:
      be.hm = paramac.jdMethod_byte();
      be.gs = paramac.jdMethod_byte();
      b5.jdMethod_case("--------------- 接收大宗交易警戒线 命令-------------");
      return;
    case -2146107382:
      be.ch();
      b5.jdMethod_case("--------------- 交易成功 命令-------------");
      return;
    case -2146107380:
      paramInt = paramac.jdMethod_if();
      b5.jdMethod_case("取回的第 " + paramInt + " 个物品");
      r.mG[paramInt] = -1;
      r.md[paramInt] = 1;
      b5.jdMethod_case("--------------- 删除背包里的某个标记 命令-------------");
      return;
    case -2146107379:
      b5.jdMethod_case("--------------- 接收 请求交易检测 命令-------------");
      a = paramac.jdMethod_byte();
      if ((a5.V() == 0) && (!a5.hH) && (a5.gQ == null))
      {
        a5.eQ.a(1376257);
        b5.jdMethod_case("--------------- 发送 CommandList.C_TRADE 命令-------------");
        return;
      }
      a5.eQ.a(1376270);
      b5.jdMethod_case("--------------- 发送 CommandList.C_TRADE_DENY_REQ 命令-------------");
    case -2146107387:
    case -2146107384:
    case -2146107381:
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     a2
 * JD-Core Version:    0.6.0
 */
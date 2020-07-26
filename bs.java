import java.util.Vector;

public final class bs
{
  public static byte jdField_if = 0;
  public static byte a = -1;

  public static byte[] a(int paramInt)
  {
    a5.fR = true;
    ac localac;
    (localac = new ac()).jdMethod_do(paramInt);
    switch (paramInt)
    {
    case 1179650:
      localac.a(r.mp);
      b5.jdMethod_case("发送 仓库->查看物品 命令！！！！");
      break;
    case 1179651:
      localac.a(r.mp);
      localac.a(jdField_if);
      b5.jdMethod_case("发送 仓库->存物品 命令！！！！");
      break;
    case 1179653:
      localac.a(r.mp);
      localac.a(jdField_if);
      b5.jdMethod_case("发送 仓库->取物品 命令！！！！");
      break;
    case 1179657:
      b5.jdMethod_case("发送 仓库->整理 命令！！！！");
      break;
    case 1179652:
      localac.jdMethod_do(r.ny);
      b5.jdMethod_case("存入 " + r.ny + " 金币");
      r.ny = 0;
      b5.jdMethod_case("发送 仓库->存钱 命令！！！！");
      break;
    case 1179654:
      localac.jdMethod_do(r.ny);
      b5.jdMethod_case("取出 " + r.ny + " 金币");
      r.ny = 0;
      b5.jdMethod_case("发送 仓库->取钱 命令！！！！");
      break;
    case 1179658:
      b5.jdMethod_case("发送 仓库->扩容UI 命令！！！！");
      break;
    case 1179659:
      localac.a(r.mp);
      b5.jdMethod_case("发送 仓库->扩容使用物品 命令！！！！");
      break;
    case 1179661:
      localac.a(r.mp);
      localac.a(at.try);
      at.byte = false;
      (paramInt = (ao)a5.es.cf().elementAt(1)).a("返回", 1);
      a(true);
      break;
    case 1179662:
      localac.a(at.try);
      break;
    case 1179656:
      localac.a(a);
      int i = at.int[0];
      (paramInt = localac).a((byte)i);
      i = at.int[1];
      (paramInt = localac).a((byte)i);
      localac.a(at.new);
      a5.es.cg();
    case 1179655:
      a5.fR = true;
    case 1179660:
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    Object localObject1;
    Object localObject2;
    switch (paramInt)
    {
    case -2146303988:
      b5.jdMethod_case("--------------- 接收仓库冻结或解冻命令-------------");
      paramInt = paramac.jdMethod_case();
      localObject1 = paramac.jdField_if();
      paramac = paramac.jdField_if();
      localObject2 = null;
      if (a5.es == null)
        break;
      if (a5.es.g9 == 1179649)
        localObject2 = (r)a5.es.cf().elementAt(6);
      if (localObject2 == null)
        break;
      for (localObject1 = localObject1; localObject1 < paramac; localObject1++)
        if (paramInt != 0)
          localObject2.mZ[localObject1] = false;
        else
          localObject2.mZ[localObject1] = true;
      break;
    case -2146303987:
      b5.jdMethod_case("--------------- 接收仓库扩容结果-------------");
      paramInt = paramac.jdField_if();
      b5.jdMethod_case("result = " + paramInt);
      if (paramInt == 0)
      {
        at.byte = false;
      }
      else
      {
        at.byte = true;
        localObject1 = new a7[] { (a7)a5.es.cf().elementAt(7), (a7)a5.es.cf().elementAt(8), (a7)a5.es.cf().elementAt(9), (a7)a5.es.cf().elementAt(10) };
        for (paramac = 0; paramac < localObject1.length; paramac++)
          localObject1[paramac].eY = ((paramInt & b5.jdMethod_int(2, paramac)) != 0);
        paramac = (r)a5.es.cf().elementAt(3);
        localObject1[0].a(true, a5.es);
        paramac.a(false, a5.es);
        (localObject2 = (ao)a5.es.cf().elementAt(1)).a("取消", 1);
        a(false);
      }
    }
    a5.fR = false;
  }

  public static byte a()
  {
    if (((a7)a5.es.cf().elementAt(7)).q())
      return 0;
    if (((a7)a5.es.cf().elementAt(8)).q())
      return 1;
    if (((a7)a5.es.cf().elementAt(9)).q())
      return 2;
    if (((a7)a5.es.cf().elementAt(10)).q())
      return 3;
    b5.jdMethod_case("获取扩容背包索引错误！！！！");
    return -1;
  }

  public static void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ((a7)a5.es.cf().elementAt(7)).a(1, 4);
      ((a7)a5.es.cf().elementAt(8)).a(1, 4);
      ((a7)a5.es.cf().elementAt(9)).a(1, 4);
      ((a7)a5.es.cf().elementAt(10)).a(1, 4);
      return;
    }
    ((a7)a5.es.cf().elementAt(7)).a(1, -1);
    ((a7)a5.es.cf().elementAt(8)).a(1, -1);
    ((a7)a5.es.cf().elementAt(9)).a(1, -1);
    ((a7)a5.es.cf().elementAt(10)).a(1, -1);
  }

  public static void jdField_if(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ((r)a5.es.cf().elementAt(6)).a(1, 9);
      ((r)a5.es.cf().elementAt(8)).a(0, 7);
      return;
    }
    ((r)a5.es.cf().elementAt(6)).a(1, -1);
    ((r)a5.es.cf().elementAt(8)).a(0, -1);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bs
 * JD-Core Version:    0.6.0
 */
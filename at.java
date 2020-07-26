import java.io.PrintStream;
import java.util.Vector;

public final class at
{
  public static boolean jdField_byte = false;
  public static byte jdField_try = 0;
  public static int jdField_for = 0;
  public static int jdField_if = 0;
  public static int a = 0;
  public static byte jdField_do = 4;
  public static byte jdField_new = 0;
  public static int[] jdField_int = { -1, -1 };

  public static byte[] a(int paramInt)
  {
    ac localac = new ac();
    b5.jdMethod_case("发送UI命令");
    localac.jdField_do(paramInt);
    int i;
    switch (paramInt)
    {
    case 458756:
      i = jdField_int[0];
      (paramInt = localac).a((byte)i);
      i = jdField_int[1];
      (paramInt = localac).a((byte)i);
      localac.a(jdField_new);
      a5.es.cg();
      break;
    case 458759:
      i = r.m8;
      (paramInt = localac).a((byte)i);
      break;
    case 458753:
      b5.jdMethod_case("in C_UI_PACKAGE_VIEW UIGrid.severGridIndex = " + r.mp);
      localac.a(r.mp);
      break;
    case 458755:
    case 458768:
      localac.a(r.mp);
      break;
    case 458754:
    case 458775:
      localac.a(r.mp);
      break;
    case 458762:
      a5.fR = true;
    case 458763:
      localac.jdField_do(av.g);
      break;
    case 458760:
      a5.fR = true;
      break;
    case 458766:
      break;
    case 458769:
      localac.a(r.mp);
      localac.a(jdField_try);
      jdField_byte = false;
      (paramInt = (ao)a5.es.cf().elementAt(1)).a("返回", 1);
      a(true);
      break;
    case 458770:
      localac.a(jdField_try);
      break;
    case 458771:
      paramInt = (bv)a5.es.cf().elementAt(2);
      localac.a(paramInt.j7);
      localac.jdField_do(jdField_for);
      break;
    case 458772:
      a5.fR = true;
      break;
    case 458758:
      a5.fR = true;
      break;
    case 458773:
      a5.fR = true;
    case 458757:
    case 458761:
    case 458764:
    case 458765:
    case 458767:
    case 458774:
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    Object localObject1;
    int k;
    ac localac1;
    ac localac2;
    switch (paramInt)
    {
    case -2147024884:
      paramInt = paramac.jdMethod_case();
      int i;
      int[] arrayOfInt = new int[i = paramac.jdField_new()];
      for (int j = 0; j < i; j++)
        arrayOfInt[j] = paramac.jdField_byte();
      b2.a();
      localObject1 = b2.jdField_try;
      for (k = 0; k < i; k++)
      {
        localac1 = arrayOfInt[k];
        ((av)localObject1).a(2, localac1, paramInt);
      }
      ((av)localObject1).jdMethod_goto();
      if (a5.es != null)
      {
        a(a5.es, i, paramInt, arrayOfInt);
        k = a5.fE.size();
        for (localac1 = 0; localac1 < k; localac1++)
        {
          if ((paramac = (be)(be)a5.fE.elementAt(localac1)) == null)
            continue;
          a(paramac, i, paramInt, arrayOfInt);
        }
        k = a5.d6.size();
        for (localac1 = 0; localac1 < k; localac1++)
          if (((paramac = a5.d6.elementAt(localac1)) instanceof be))
          {
            a(localObject1 = (be)paramac, i, paramInt, arrayOfInt);
          }
          else
          {
            if (!(paramac instanceof Vector))
              continue;
            localac2 = (localObject1 = (Vector)paramac).size();
            for (paramac = 0; paramac < localac2; paramac++)
            {
              Object localObject2;
              if (!((localObject2 = ((Vector)localObject1).elementAt(paramac)) instanceof be))
                continue;
              a(localObject2 = (be)localObject2, i, paramInt, arrayOfInt);
            }
          }
      }
      b5.jdMethod_case("--------------- 接收背包物品CD时间 命令-------------");
      break;
    case -2147024881:
      k = paramac.jdField_byte();
      b5.jdMethod_case("东西没了" + k);
      b2.a();
      b2.jdField_try.a(k);
      break;
    case -2147024883:
      b5.jdMethod_case("--------------- 接收背包冻结或解冻命令-------------");
      boolean bool = paramac.jdMethod_case();
      localac1 = paramac.jdField_if();
      paramac = paramac.jdField_if();
      b5.jdMethod_case("a = " + bool + "   beginIndex = " + localac1 + "   endIndex = " + paramac);
      if (bool)
        b5.jdMethod_case("解冻");
      else
        b5.jdMethod_case("冻结");
      localObject1 = null;
      if (a5.es == null)
        break;
      if (a5.es.g9 == 458760)
        localObject1 = (r)a5.es.cf().elementAt(10);
      else if (a5.es.g9 == 1179649)
        localObject1 = (r)a5.es.cf().elementAt(8);
      else if (a5.es.g9 == 917505)
        localObject1 = (r)a5.es.cf().elementAt(23);
      else if ((a5.es.g9 == 983046) || (a5.es.g9 == 983057) || (a5.es.g9 == 983049) || (a5.es.g9 == 983058) || (a5.es.g9 == 983056))
        localObject1 = (r)a5.es.cf().elementAt(5);
      else if ((a5.es.g9 == 1769473) || (a5.es.g9 == 1769478) || (a5.es.g9 == 1769479) || (a5.es.g9 == 1769480) || (a5.es.g9 == 1769488) || (a5.es.g9 == 1769489) || (a5.es.g9 == 1769490) || (a5.es.g9 == 1769491) || (a5.es.g9 == 1769492))
        localObject1 = (r)a5.es.cf().elementAt(5);
      else if (a5.es.g9 == 1179658)
        localObject1 = (r)a5.es.cf().elementAt(3);
      if (localObject1 != null)
      {
        b5.jdMethod_case("背包冻结或解冻不为空");
        for (localac2 = localac1; localac2 < paramac; localac2++)
          if (bool)
            localObject1.mZ[localac2] = false;
          else
            localObject1.mZ[localac2] = true;
      }
      else
      {
        b5.jdMethod_case("空的");
      }
      break;
    case -2147024880:
      b5.jdMethod_case("--------------- 接收背包扩容结果-------------");
      int m = paramac.jdField_if();
      b5.jdMethod_case("result = " + m);
      if (m == 0)
      {
        jdField_byte = false;
      }
      else
      {
        jdField_byte = true;
        a7[] arrayOfa7 = { (a7)a5.es.cf().elementAt(3), (a7)a5.es.cf().elementAt(5), (a7)a5.es.cf().elementAt(7), (a7)a5.es.cf().elementAt(9) };
        for (paramac = 0; paramac < arrayOfa7.length; paramac++)
          arrayOfa7[paramac].eY = ((m & b5.jdField_int(2, paramac)) != 0);
        paramac = (r)a5.es.cf().elementAt(10);
        arrayOfa7[0].a(true, a5.es);
        paramac.a(false, a5.es);
        (localObject1 = (ao)a5.es.cf().elementAt(1)).a("取消", 1);
        a(false);
      }
      break;
    case -2147024874:
      jdField_do = (byte)(paramac.jdField_if() + 4);
      System.out.println("~~~~~~~~~~~~~服务器发送装备索引： " + jdField_do);
    case -2147024882:
    case -2147024879:
    case -2147024878:
    case -2147024877:
    case -2147024876:
    case -2147024875:
    }
    a5.fR = false;
  }

  private static void a(be parambe, int paramInt, boolean paramBoolean, int[] paramArrayOfInt)
  {
    int j;
    int k;
    switch (parambe.g9)
    {
    case 458754:
    case 458756:
    case 458758:
    case 458759:
    case 458760:
    case 458761:
    case 458775:
      if (!(parambe.cf().elementAt(10) instanceof r))
        break;
      r localr1 = (r)(r)parambe.cf().elementAt(10);
      for (j = 0; j < paramInt; j++)
      {
        k = paramArrayOfInt[j];
        for (int m = 0; m < localr1.mt; m++)
        {
          if (localr1.mQ[m] != k)
            continue;
          localr1.m4[m] = paramBoolean;
        }
      }
      return;
    case -1610612734:
      for (int i = 0; i < paramInt; i++)
      {
        j = paramArrayOfInt[i];
        for (k = 0; k < 3; k++)
        {
          r localr2 = (r)parambe.cf().elementAt(k + 3);
          for (int n = 0; n < localr2.dY(); n++)
          {
            if ((localr2.A(n) != 2) || (localr2.G(n) != j))
              continue;
            localr2.jdField_if(n, paramBoolean);
          }
        }
      }
    }
  }

  public static byte a()
  {
    if (((a7)a5.es.cf().elementAt(3)).q())
      return 0;
    if (((a7)a5.es.cf().elementAt(5)).q())
      return 1;
    if (((a7)a5.es.cf().elementAt(7)).q())
      return 2;
    if (((a7)a5.es.cf().elementAt(9)).q())
      return 3;
    b5.jdMethod_case("获取扩容背包索引错误！！！！");
    return -1;
  }

  public static void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ((a7)a5.es.cf().elementAt(3)).a(1, 11);
      ((a7)a5.es.cf().elementAt(5)).a(1, 11);
      ((a7)a5.es.cf().elementAt(7)).a(1, 11);
      ((a7)a5.es.cf().elementAt(9)).a(1, 11);
      return;
    }
    ((a7)a5.es.cf().elementAt(3)).a(1, -1);
    ((a7)a5.es.cf().elementAt(5)).a(1, -1);
    ((a7)a5.es.cf().elementAt(7)).a(1, -1);
    ((a7)a5.es.cf().elementAt(9)).a(1, -1);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     at
 * JD-Core Version:    0.6.0
 */
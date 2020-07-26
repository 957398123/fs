public final class bx
{
  public static byte jdField_for = -1;
  public static byte jdField_if = -1;
  public static byte a = -1;

  public static byte[] a(int paramInt)
  {
    a5.fR = true;
    ac localac;
    (localac = new ac()).jdMethod_do(paramInt);
    switch (paramInt)
    {
    case 917506:
      b5.jdMethod_case("发送 ui装备-卸下 命令");
      localac.a(a7.fF);
      break;
    case 917507:
      b5.jdMethod_case("发送 ui装备-查看 命令");
      localac.a(a7.fF);
      break;
    case 917509:
    case 917523:
      localac.a(r.mp);
      localac.a(a7.fF);
      b5.jdMethod_case("发送 ui装备-穿上 命令");
      b5.jdMethod_case("---背包里第 " + r.mp + "格---");
      b5.jdMethod_case("---装备里第 " + a7.fF + "格---");
      break;
    case 917508:
      b5.jdMethod_case("发送 ui装备-比较 命令");
      break;
    case 917511:
      int i = r.m8;
      (paramInt = localac).a((byte)i);
      b5.jdMethod_case("发送 ui装备-丢弃 命令");
      break;
    case 917520:
      b5.jdMethod_case("发送 ui装备-修理装备UI 命令");
      break;
    case 917521:
      b5.jdMethod_case("发送 ui装备-修理装备 单个 命令");
      localac.a(a7.fF);
      break;
    case 917522:
      b5.jdMethod_case("发送 ui装备-修理装备 全部 命令");
      localac.a(a7.fF);
      break;
    case 917524:
      localac.a(jdField_for);
      localac.a(a);
      localac.a(jdField_if);
      b5.jdMethod_case("m_bEquipIndex所修物品索引=" + jdField_for);
      b5.jdMethod_case("m_bOrigin物品来源=" + a);
      b5.jdMethod_case("m_bPropIndex修补道具索引=" + jdField_if);
      break;
    case 917525:
    case 917530:
      a5.fR = true;
      break;
    case 917526:
    case 917527:
      localac.a(am.do);
      a5.fR = true;
      break;
    case 917528:
      a5.fR = true;
      localac.a(aq.a);
      localac.a(aq.int);
      break;
    case 917529:
      a5.fR = true;
      localac.a(aq.a);
      localac.a(aq.int);
      aq.jdField_if();
    case 917510:
    case 917512:
    case 917513:
    case 917514:
    case 917515:
    case 917516:
    case 917517:
    case 917518:
    case 917519:
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2146565984:
      paramac.jdField_if();
      return;
    case -2146566141:
      aq.a = paramac.jdField_if();
      aq.a(4, true, 0, false);
      return;
    case -2146566140:
      aq.int = paramac.jdField_if();
      aq.a(6, true, 0, true);
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bx
 * JD-Core Version:    0.6.0
 */
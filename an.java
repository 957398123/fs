public final class an
{
  public static boolean a = false;

  public static byte[] a(int paramInt)
  {
    a5.fR = true;
    ac localac;
    (localac = new ac()).jdMethod_do(paramInt);
    switch (paramInt)
    {
    case 1245185:
      b5.jdMethod_case("--------------- 比较选择界面 -------------");
      break;
    case 1245186:
      if (a)
      {
        localac.jdMethod_do(bp.ag().jdMethod_new());
        b5.jdMethod_case("任务比较 自身ID " + bp.ag().jdMethod_new());
      }
      else if (be.ct()[0] == 2)
      {
        localac.jdMethod_do(l.g.jdMethod_new());
      }
      else
      {
        localac.jdMethod_do(bp.ag().jdMethod_new());
      }
      for (paramInt = 0; paramInt < be.cj().length; paramInt++)
      {
        localac.a(be.ct()[paramInt]);
        localac.jdMethod_do(be.cj()[paramInt]);
        b5.jdMethod_case("任务比较 IndexType " + paramInt + ":" + be.ct()[paramInt]);
        b5.jdMethod_case("任务比较 CompareIndex " + paramInt + ":" + be.cj()[paramInt]);
      }
      if (a)
      {
        localac.jdMethod_do(bv.jI);
        b5.jdMethod_case("任务比较 任务ID " + bv.jI);
        a = false;
      }
      b5.jdMethod_case("--------------- 请求 比较界面 -------------");
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2146238462:
      a5.dh = paramInt;
      a5.gb = paramac.jdMethod_int((paramInt = paramac).jdField_do.length - 6);
      b5.jdMethod_case("--------------- 接收 比较界面 -------------");
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     an
 * JD-Core Version:    0.6.0
 */
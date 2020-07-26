import java.util.Vector;

public final class o
{
  public static String[] jdField_if;
  public static String[] jdField_do;
  public static String[] a;
  public static byte jdField_int = 0;
  public static int[] jdField_for;

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 2359297:
      a5.fR = true;
      break;
    case 2359298:
    case 2359299:
      if (as.c4 == 0)
      {
        as.a(0, "请您输入数量", "确定", "", -1, -2);
      }
      else
      {
        a5.fR = true;
        int i = jdField_int + 1;
        (paramInt = localac).a((byte)i);
        localac.jdField_do(as.c4);
        b5.jdMethod_case("-------------------------=" + as.c4);
      }
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2145124351:
      paramInt = paramac.jdMethod_goto();
      paramac = paramac.jdMethod_goto();
      jdField_do[jdField_int] = paramInt;
      a[jdField_int] = paramac;
      (paramInt = (ah)a5.es.cf().elementAt(7)).a(jdField_do[jdField_int]);
      (paramInt = (ah)a5.es.cf().elementAt(8)).a(a[jdField_int]);
      b5.jdMethod_case("555555555555555555555555555555");
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     o
 * JD-Core Version:    0.6.0
 */
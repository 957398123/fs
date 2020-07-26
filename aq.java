import java.util.Vector;

public final class aq
{
  public static byte a = -1;
  public static byte jdField_int = -1;
  public static byte jdField_if = -1;
  public static byte jdField_do = -1;
  public static byte jdField_for = -1;

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 2031633:
      a5.fR = true;
      localac.a(a);
      localac.a(jdField_int);
      break;
    case 2031617:
    case 2031635:
      a5.fR = true;
      localac.a(jdField_do);
      break;
    case 2031622:
      a5.fR = true;
      localac.a(a);
      break;
    case 2031623:
      localac.a(a);
      localac.a(jdField_int);
      break;
    case 2031624:
    case 2031634:
      a5.fR = true;
      localac.a(a);
      localac.a(jdField_int);
      localac.a(jdField_if);
      break;
    case 2031625:
      a5.fR = true;
      localac.a(a);
      localac.a(jdField_int);
      break;
    case 2031637:
      a5.fR = true;
      localac.a(a);
      break;
    case 2031619:
      a5.fR = true;
      localac.a(a);
      break;
    case 2031618:
    case 2031620:
      a5.fR = true;
      localac.a(a);
      localac.a(jdField_int);
      localac.a(jdField_if);
      break;
    case 2031621:
    case 2031636:
    case 2031648:
    case 2031649:
    case 2031650:
    case 2031651:
      a5.fR = true;
    case 2031626:
    case 2031627:
    case 2031628:
    case 2031629:
    case 2031630:
    case 2031631:
    case 2031632:
    case 2031638:
    case 2031639:
    case 2031640:
    case 2031641:
    case 2031642:
    case 2031643:
    case 2031644:
    case 2031645:
    case 2031646:
    case 2031647:
    }
    return localac.jdMethod_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2145452017:
      if ((paramInt = paramac.jdMethod_case()) != true)
        break;
      a(4, true, 0, false);
    }
  }

  public static void a()
  {
    a = -1;
    jdField_int = -1;
    jdField_if = -1;
    jdField_do = -1;
  }

  public static void jdField_if()
  {
    a(4, true);
    a(6, false);
    r localr = (r)a5.es.cf().elementAt(9);
    a = -1;
    jdField_int = -1;
    jdField_if = -1;
    jdField_for = -1;
    localr.a(false, a5.es);
    jdField_do = -1;
    for (int i = 0; i < r.mY.length; i++)
      r.mY[i] = -1;
  }

  private static void a(int paramInt, boolean paramBoolean)
  {
    (paramInt = (a7)a5.es.cf().elementAt(paramInt)).a(paramBoolean, a5.es);
    paramInt.g(false);
    paramInt.ft = false;
    paramInt.a(null);
  }

  public static void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    paramInt1 = (a7)a5.es.cf().elementAt(paramInt1);
    r localr = (r)a5.es.cf().elementAt(9);
    if (paramInt2 == 1)
      jdField_int = (byte)r.mY[0];
    else if (paramInt2 == 2)
      jdField_if = (byte)r.mY[0];
    else if (paramInt2 == 3)
      a = (byte)r.mY[0];
    paramInt1.a(paramBoolean2, 1);
    paramInt1.fC = (byte)r.mY[2];
    paramInt2 = r.mY[1];
    paramInt1.ft = true;
    paramInt1.jdField_if(paramInt2, false);
    paramInt1.a(a5.gg);
    paramInt1.a(paramBoolean1, a5.es);
    localr.a(!paramBoolean1, a5.es);
    jdField_for = -1;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     aq
 * JD-Core Version:    0.6.0
 */
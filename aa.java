import java.util.Vector;

public final class aa
{
  public static boolean jdField_int;
  public static byte[] jdField_for;
  public static byte jdField_case;
  public static int[] jdField_goto;
  public static int[] jdField_try;
  public static byte jdField_if;
  public static String[] jdField_long;
  public static String[] a;
  public static short f = 0;
  public static int[] e;
  public static String[] jdField_else;
  public static short[] jdField_byte;
  public static short[] c;
  public static byte[] jdField_char;
  public static short[] b;
  public static byte jdField_new;
  public static byte jdField_do;
  public static byte d;
  public static byte[] jdField_void;

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 3145729:
    case 3145730:
    case 3145731:
    case 3145732:
    case 3145734:
    case 3145735:
    case 3145738:
    case 3145741:
      a5.fR = true;
      break;
    case 3145733:
      a5.fR = true;
      if (a5.ea == null)
        break;
      a5.ea.l6.removeAllElements();
      a5.ea = null;
      a5.jdField_try(0);
      break;
    case 3145736:
      localac.a((byte)jdField_goto.length);
      for (paramInt = 0; paramInt < jdField_goto.length; paramInt++)
        localac.jdField_do(jdField_goto[paramInt]);
      break;
    case 3145737:
      localac.a((byte)jdField_try.length);
      for (paramInt = 0; paramInt < jdField_try.length; paramInt++)
        localac.jdField_do(jdField_try[paramInt]);
      localac.a(jdField_if);
      break;
    case 3145739:
      a5.fR = true;
      localac.a(jdField_do);
      break;
    case 3145740:
      a();
      int i = jdField_for.length;
      (paramInt = localac).a((byte)i);
      for (paramInt = 0; paramInt < jdField_for.length; paramInt++)
        localac.a(jdField_for[paramInt]);
    }
    return localac.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    int i;
    switch (paramInt)
    {
    case -2144337919:
      a = new String[i = paramac.jdField_if()];
      for (paramInt = 0; paramInt < i; paramInt++)
        a[paramInt] = paramac.jdField_goto();
      jdField_for = new byte[paramInt = paramac.jdField_if()];
      for (i = 0; i < paramInt; i++)
        jdField_for[i] = paramac.jdField_if();
      return;
    case -2144337918:
    case -2144337917:
      e = new int[aa.f = paramac.jdField_new()];
      jdField_else = new String[f];
      jdField_byte = new short[f];
      c = new short[f];
      jdField_char = new byte[f];
      for (i = 0; i < f; i++)
      {
        e[i] = paramac.jdField_byte();
        jdField_else[i] = paramac.jdField_goto();
        jdField_byte[i] = paramac.jdField_new();
        c[i] = (short)(jdField_byte[i] % 1000);
        jdField_char[i] = (byte)(jdField_byte[i] / 1000 - 1);
      }
      jdField_new = paramac.jdField_if();
      if (paramInt == -2144337918)
        jdField_goto = new int[jdField_new];
      else if (paramInt == -2144337917)
        jdField_try = new int[jdField_new];
      b = new short[jdField_new];
      for (i = 0; i < jdField_new; i++)
      {
        if (paramInt == -2144337918)
          jdField_goto[i] = paramac.jdField_byte();
        else if (paramInt == -2144337917)
          jdField_try[i] = paramac.jdField_byte();
        b[i] = paramac.jdField_new();
      }
      if (paramInt != -2144337917)
        break;
      jdField_if = paramac.jdField_if();
      jdField_long = new String[i = paramac.jdField_if()];
      for (paramInt = 0; paramInt < i; paramInt++)
        jdField_long[paramInt] = paramac.jdField_goto();
      return;
    case -2144337916:
    case -2144337915:
      jdField_int = paramac.jdField_case();
    }
  }

  public static void a()
  {
    if (jdField_for == null)
    {
      jdField_for = new byte[3];
      for (int i = 0; i < jdField_for.length; i++)
        jdField_for[i] = 1;
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     aa
 * JD-Core Version:    0.6.0
 */
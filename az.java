import java.util.Vector;

public final class az
{
  public static byte n = 0;
  public static String[] jdField_byte = new String[3];
  public static String jdField_new;
  public static String c;
  public static int[] a;
  public static String jdField_try = "";
  public static byte jdField_if;
  public static byte f;
  public static byte o;
  public static Vector g;
  public static byte m;
  public static byte h;
  public static int jdField_else;
  public static byte jdField_int = 0;
  public static byte jdField_for = -1;
  private static byte jdField_goto;
  public static byte jdField_long;
  public static int d;
  public static byte jdField_char;
  public static String k;
  public static byte jdField_case;
  public static final String[] jdField_do = { "播种", "犁地", "收获", "偷窃", "查看", "除草", "浇水", "捉虫", "种杂草", "放虫", "使用道具" };
  public static final int[] e = { 2, 3, 3, 3, 2, 3, 3, 3, 3, 3, 2 };
  public static final String[] l = { "查看详情", "发送信息", "加为好友", "屏蔽此人", "加为仇人" };
  public static final int[] b = { 2, 3, 3, 3, 3 };
  public static final String[] i = { "", "龟裂", "干燥", "正常", "湿润" };
  private static int j = 0;

  public static byte[] a(int paramInt)
  {
    ac localac;
    (localac = new ac()).jdField_do(paramInt);
    switch (paramInt)
    {
    case 2555905:
    case 2555906:
      a5.fR = true;
      localac.jdField_do(jdField_else);
      break;
    case 2555907:
    case 2555908:
    case 2555910:
    case 2555911:
    case 2555912:
    case 2555913:
    case 2555915:
    case 2555955:
    case 2555957:
    case 2555959:
    case 2555960:
    case 2555961:
    case 2555972:
    case 2555976:
      a5.fR = true;
      break;
    case 2555909:
    case 2555958:
      a5.fR = true;
      localac.a(jdField_long);
      localac.a((byte)as.c4);
      break;
    case 2555920:
      localac.jdField_if(jdField_try);
      break;
    case 2555936:
      a5.fR = true;
      localac.jdField_do(j);
      localac.a(jdField_if);
      localac.a(f);
      localac.a(o);
      break;
    case 2555937:
      a5.fR = true;
      localac.jdField_do(j);
      localac.a(jdField_if);
      localac.a(f);
      localac.a(jdField_long);
      break;
    case 2555952:
      localac.jdField_do(j);
      localac.a(m);
      break;
    case 2555914:
      a5.fR = true;
      localac.jdField_do(j);
      break;
    case 2555954:
    case 2555975:
      a5.fR = true;
      localac.a(jdField_int);
      localac.a((byte)as.c4);
      break;
    case 2555939:
    case 2555956:
    case 2555962:
    case 2555968:
    case 2555969:
      a5.fR = true;
      localac.a(jdField_long);
      break;
    case 2555938:
      a5.fR = true;
      localac.jdField_do(j);
      localac.a(jdField_if);
      localac.a(f);
      localac.a(jdField_long);
      break;
    case 2555940:
    case 2555963:
    case 2555970:
    case 2555971:
      a5.fR = true;
      localac.a(jdField_long);
      localac.a((byte)as.c4);
      break;
    case 2555941:
    case 2555943:
    case 2555945:
      a5.fR = true;
      jdField_goto = (byte)as.c4;
      break;
    case 2555942:
    case 2555944:
    case 2555946:
      a5.fR = true;
      localac.jdField_do(d);
      localac.a(jdField_long);
      localac.a(jdField_goto);
      break;
    case 2555964:
    case 2555965:
      a5.fR = true;
      localac.jdField_do(jdField_else);
      break;
    case 2555966:
      a5.fR = true;
      localac.jdField_do(jdField_else);
      localac.jdField_do(o);
      break;
    case 2555973:
      localac.jdField_do(j);
      break;
    case 2555974:
      localac.a(jdField_char);
      break;
    case 2555977:
      a5.fR = true;
      localac.a(jdField_case);
    case 2555916:
    case 2555917:
    case 2555918:
    case 2555919:
    case 2555921:
    case 2555922:
    case 2555923:
    case 2555924:
    case 2555925:
    case 2555926:
    case 2555927:
    case 2555928:
    case 2555929:
    case 2555930:
    case 2555931:
    case 2555932:
    case 2555933:
    case 2555934:
    case 2555935:
    case 2555947:
    case 2555948:
    case 2555949:
    case 2555950:
    case 2555951:
    case 2555953:
    case 2555967:
    }
    return localac.jdField_long();
  }

  public static void a(int paramInt, ac paramac)
  {
    Object localObject;
    int i4;
    switch (paramInt)
    {
    case -2144927743:
      c = paramac.jdField_goto();
      jdField_new = paramac.jdField_goto();
      j = paramac.jdField_byte();
      h = paramac.jdField_if();
      return;
    case -2144927695:
      paramInt = paramac.jdField_if();
      for (int i3 = 0; i3 < paramInt; i3++)
      {
        int i2 = paramac.jdField_if();
        if (a5.d6.size() > 0)
        {
          be localbe1;
          localObject = (a7)(localbe1 = (be)a5.d6.elementAt(0)).cf().elementAt(i2);
        }
        else
        {
          localObject = (a7)a5.es.cf().elementAt(localObject);
        }
        byte b1 = paramac.jdField_if();
        ((a7)localObject).jdField_goto(b1);
        if (b1 == 0)
        {
          ((a7)localObject).jdField_long("");
          ((a7)localObject).jdField_goto("");
          ((a7)localObject).d(0);
          ((a7)localObject).jdField_char("");
          ((a7)localObject).m(0);
          ((a7)localObject).i(0);
          ((a7)localObject).j(0);
        }
        else
        {
          String str1 = paramac.jdField_goto();
          ((a7)localObject).jdField_long(str1);
          str1 = paramac.jdField_goto();
          ((a7)localObject).jdField_goto(str1);
          byte b2 = paramac.jdField_if();
          ((a7)localObject).d(b2);
          paramac.jdField_if();
          paramac.jdField_if();
          String str2 = paramac.jdField_goto();
          ((a7)localObject).jdField_char(str2);
          byte b3 = paramac.jdField_if();
          ((a7)localObject).m(b3);
          short s = paramac.jdField_new();
          int i1 = paramac.jdField_byte();
          ((a7)localObject).i(i1);
          i1 = paramac.jdField_byte();
          ((a7)localObject).j(i1);
          ((a7)localObject).g(s);
          ((a7)localObject).ft = true;
          s = (short)(s % 1000);
          ((a7)localObject).jdField_if(s, true);
          ((a7)localObject).a(a5.gg);
        }
      }
      ah localah1;
      ah localah2;
      ah localah3;
      if (a5.d6.size() > 0)
      {
        be localbe2;
        paramInt = (ah)(localbe2 = (be)a5.d6.elementAt(0)).cf().elementAt(3);
        paramac = (ah)localbe2.cf().elementAt(4);
        localah1 = (ah)localbe2.cf().elementAt(6);
        localah2 = (ah)localbe2.cf().elementAt(10);
        localah3 = (ah)localbe2.cf().elementAt(8);
      }
      else
      {
        paramInt = (ah)a5.es.cf().elementAt(3);
        paramac = (ah)a5.es.cf().elementAt(4);
        localah1 = (ah)a5.es.cf().elementAt(6);
        localah2 = (ah)a5.es.cf().elementAt(10);
        localah3 = (ah)a5.es.cf().elementAt(8);
      }
      for (i4 = 0; i4 < 12; i4++)
      {
        if (a5.d6.size() > 0)
          localObject = (a7)(localObject = (be)a5.d6.elementAt(0)).cf().elementAt(i4 + 11);
        else
          localObject = (a7)a5.es.cf().elementAt(i4 + 11);
        if ((!((ba)localObject).q()) || (((a7)localObject).bN() == 0))
          continue;
        paramInt.a(((a7)localObject).bn());
        paramac.a(((a7)localObject).bY());
        localah1.jdField_case(((a7)localObject).bz());
        localah2.a(((a7)localObject).by());
        if (((a7)localObject).bJ() == -1)
        {
          localah3.a(i[0]);
        }
        else if (((a7)localObject).bJ() == 0)
        {
          localah3.a(i[1]);
        }
        else if ((((a7)localObject).bJ() >= 1) && (((a7)localObject).bJ() <= 30))
        {
          localah3.a(i[2]);
        }
        else if ((((a7)localObject).bJ() >= 31) && (((a7)localObject).bJ() <= 70))
        {
          localah3.a(i[3]);
        }
        else
        {
          if ((((a7)localObject).bJ() < 71) || (((a7)localObject).bJ() > 100))
            continue;
          localah3.a(i[4]);
        }
      }
      for (i4 = 0; i4 < 6; i4++)
      {
        if (a5.d6.size() > 0)
          localObject = (a7)(localObject = (be)a5.d6.elementAt(0)).cf().elementAt(i4 + 25);
        else
          localObject = (a7)a5.es.cf().elementAt(i4 + 25);
        if ((!((ba)localObject).q()) || (((a7)localObject).bN() == 0))
          continue;
        paramInt.a(((a7)localObject).bn());
        paramac.a(((a7)localObject).bY());
        localah1.jdField_case(((a7)localObject).bz());
        localah2.a(((a7)localObject).by());
        if (((a7)localObject).bJ() == -1)
        {
          localah3.a(i[0]);
        }
        else if (((a7)localObject).bJ() == 0)
        {
          localah3.a(i[1]);
        }
        else if ((((a7)localObject).bJ() >= 1) && (((a7)localObject).bJ() <= 30))
        {
          localah3.a(i[2]);
        }
        else if ((((a7)localObject).bJ() >= 31) && (((a7)localObject).bJ() <= 70))
        {
          localah3.a(i[3]);
        }
        else
        {
          if ((((a7)localObject).bJ() < 71) || (((a7)localObject).bJ() > 100))
            continue;
          localah3.a(i[4]);
        }
      }
      return;
    case -2144927675:
      i4 = paramac.jdField_byte();
      (localObject = (ah)a5.es.cf().elementAt(32)).jdField_case(i4);
    }
  }

  public static void jdField_if()
  {
    if (h != 0)
      h = 0;
    if (m != 0)
      m = 0;
    if (jdField_else != 0)
      jdField_else = 0;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     az
 * JD-Core Version:    0.6.0
 */
import java.io.PrintStream;
import java.util.Vector;

public final class bl
{
  public static void a(int paramInt, ac paramac)
  {
    switch (paramInt)
    {
    case -2147155967:
      if (ao.ct)
      {
        ao.ct = false;
        z.ai = 1;
        ad.jdMethod_new();
        br.dm();
      }
      a5.h7 = paramac.jdMethod_int((paramInt = paramac).jdField_do.length - 6);
      b5.jdMethod_case("-------------------接收UI界面");
      return;
    case -2147090433:
      a5.h2 = paramac.jdMethod_int((paramInt = paramac).jdField_do.length - 6);
      return;
    case -2147151599:
      a5.gV = b5.a(a5.gV, a5.gV.length, paramac.jdMethod_int((paramInt = paramac).jdField_do.length - 6));
      a5.dW = b5.a(a5.dW, a5.dW.length, a5.gV[(a5.gV.length - 1)][0]);
      b5.jdMethod_case("接收UI弹板");
      return;
    case -2147147230:
      as.db = new String[paramInt = paramac.jdMethod_if()];
      System.out.println("悬浮版收到" + paramInt + "行内容");
      for (int i = 0; i < paramInt; i++)
      {
        as.db[i] = paramac.jdMethod_goto();
        System.out.println("第" + (i + 1) + "行内容:" + as.db[i]);
      }
      as.cu = paramac.jdMethod_if();
      System.out.println("停留" + as.cu + "秒");
      as.dk = paramac.jdMethod_byte();
      as.cB = 0;
      as.cX = 0;
      as.cY = true;
      return;
    case -2147112278:
      a5.fR = false;
      if (a5.es == null)
        return;
      if (((a5.es.g9 != 1900548) && (a5.es.g9 != 1900546) && (a5.es.g9 != 458753) && (a5.es.g9 != 917507) && (a5.es.g9 != 983041) && (a5.es.g9 != 458760) && (a5.es.g9 != 1179650) && (a5.es.g9 != 1179658) && (a5.es.g9 != 393230) && (a5.es.g9 != 262187) && (a5.es.g9 != 458771) && (a5.es.g9 != 589825) && (a5.es.g9 != 589828) && (a5.es.g9 != 589833) && (a5.es.g9 != 2424840) && (a5.es.g9 != 2424833) && (a5.es.g9 != 1966097) && (a5.es.g9 != 589845) && (a5.es.g9 != 589832) && (a5.es.g9 != 2424835) && (a5.es.g9 != 2425029) && (a5.es.g9 != 393217) && (a5.es.g9 != 2490390) && (a5.es.g9 != 2490391)) || (a5.d6.size() <= 0))
        break;
      a5.d6.removeElementAt(a5.d6.size() - 1);
      return;
    case -2147107909:
      a5.fR = true;
      return;
    case -2147121016:
      as.a6();
      return;
    case -2147129754:
      as.a8();
      return;
    case -2147155966:
      a5.dO = paramac.jdMethod_int((paramInt = paramac).jdField_do.length - 6);
      a5.fR = false;
      return;
    case -2147155965:
      b5.jdMethod_case("接收NPC提示");
      String str;
      w.cc = (w.b6 = b5.jdMethod_if(str = paramac.jdMethod_goto(), w.b7, a5.fq)).length * (a5.iG + 2) + 8;
      paramInt = w.b7 / 10;
      paramac = w.cc / 10;
      for (int j = 0; j < 10; j++)
      {
        w.b9[j] = ((j + 1) * paramInt);
        w.b3[j] = ((j + 1) * paramac);
      }
      w.ca = true;
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bl
 * JD-Core Version:    0.6.0
 */
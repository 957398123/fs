import java.util.Vector;

public final class b3
{
  public static byte[] a(int paramInt)
  {
    a5.fR = true;
    ac localac;
    (localac = new ac()).jdMethod_do(paramInt);
    switch (paramInt)
    {
    case 393229:
      localac.jdMethod_do(l.g.jdMethod_new());
      b5.jdMethod_case("-----发送好友资料命令-----");
      break;
    case 393226:
      paramInt = bn.iI.size();
      for (int i = 0; i < paramInt; i++)
        localac.jdMethod_if(bn.iI.elementAt(i).toString());
      break;
    case 393227:
      localac.a(bv.kq);
      break;
    case 393230:
      localac.jdMethod_do(l.g.jdMethod_new());
      b5.jdMethod_case("-----发送 查看对方属性命令-----");
      break;
    case 393231:
      localac.jdMethod_do(l.g.jdMethod_new());
      localac.a(a7.fF);
      am.a = false;
      break;
    case 393233:
      localac.jdMethod_do(l.g.jdMethod_new());
      localac.a(bp.ag().eS);
      a5.fR = false;
      break;
    case 393232:
      localac.jdMethod_do(at.if);
      localac.jdMethod_do(at.a);
      b5.jdMethod_case("---------------------------------PCPackage.m_nGrade=" + at.if);
      b5.jdMethod_case("---------------------------------PCPackage.m_nClanGrade=" + at.a);
      break;
    case 393218:
      bv localbv = (bv)a5.es.cf().elementAt(2);
      localac.a(localbv.la);
    case 393219:
    case 393220:
    case 393221:
    case 393222:
    case 393223:
    case 393224:
    case 393225:
    case 393228:
    }
    return localac.jdMethod_long();
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     b3
 * JD-Core Version:    0.6.0
 */
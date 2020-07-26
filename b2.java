import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class b2
{
  static av jdField_try;
  private static ad jdField_do;
  private static bu jdField_int;
  public static int jdField_new;
  public static int jdField_if = 0;
  private static b2 a = null;

  public b2()
  {
    if (a5.gZ)
    {
      jdField_if = 2 + a5.gF.a;
      jdField_new = a5.ic - a5.gF.jdField_if.getWidth() >> 1;
    }
    jdField_try = new av();
    jdField_do = new ad();
    jdField_int = new bu();
    if (a5.d8)
    {
      ad.a = 0;
      return;
    }
    ad.a = 1;
  }

  public static b2 a()
  {
    if (a == null)
      a = new b2();
    return a;
  }

  public static void jdField_if()
  {
    a = null;
    if (jdField_do != null)
      ad.jdField_int();
    if (jdField_int != null)
      bu.jdField_if();
  }

  public static void jdField_do()
  {
    jdField_do.jdField_if();
  }

  public static void a(Graphics paramGraphics)
  {
    ad.jdField_if(paramGraphics);
    jdField_try.a(paramGraphics);
    jdField_int.a(paramGraphics);
    ad.a(paramGraphics);
    if (a5.gZ)
      a5.gF.a(paramGraphics, jdField_new, 2, 0);
    switch (bp.ag().jdField_byte)
    {
    case 3:
      bp.ag().jdMethod_char(paramGraphics);
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     b2
 * JD-Core Version:    0.6.0
 */
import javax.microedition.lcdui.Graphics;

public abstract class a4
{
  public static final p d = new p();
  public boolean g = false;
  public int jdField_goto = 0;
  private int jdField_case = -1;
  byte jdField_try = -1;
  public byte jdField_byte;
  short c = 0;
  short jdField_void = 0;
  short o = 0;
  short n = 0;
  public byte h = 0;
  public short q;
  public short l;
  public short jdField_new;
  public short jdField_int;
  String e = "";
  private String p = "";
  public static long a;

  public final void jdMethod_if(int paramInt)
  {
    this.jdField_goto = paramInt;
  }

  public final int jdField_new()
  {
    return this.jdField_goto;
  }

  public final void a(int paramInt)
  {
    this.jdField_case = paramInt;
  }

  public final int jdMethod_char()
  {
    return this.jdField_case;
  }

  public final byte jdMethod_for()
  {
    return this.jdField_try;
  }

  public final byte jdMethod_do()
  {
    return this.jdField_byte;
  }

  public final short jdField_try()
  {
    return this.c;
  }

  public final short b()
  {
    return this.jdField_void;
  }

  public final short jdMethod_long()
  {
    return this.o;
  }

  public final short a()
  {
    return this.n;
  }

  public final void jdMethod_for(byte paramByte)
  {
    this.h = 0;
  }

  public final void jdMethod_if(short paramShort1, short paramShort2)
  {
    this.q = paramShort1;
    this.l = paramShort2;
  }

  public final short e()
  {
    return this.q;
  }

  public final short jdField_void()
  {
    return this.l;
  }

  public static short jdMethod_for(short paramShort1, short paramShort2)
  {
    return z.jdMethod_if(paramShort2, paramShort1);
  }

  public static short jdField_int(short paramShort1, short paramShort2)
  {
    return z.a(paramShort2, paramShort1);
  }

  public final void jdMethod_if(String paramString)
  {
    this.e = paramString;
  }

  public final String jdField_byte()
  {
    return this.e;
  }

  public final void a(String paramString)
  {
    if (((paramString != null ? 1 : 0) & (paramString.length() > 0 ? 1 : 0)) != 0)
      paramString = "<" + paramString + ">";
    this.p = paramString;
  }

  public final String jdField_int()
  {
    return this.p;
  }

  public abstract void a(Graphics paramGraphics);

  public abstract void a(Graphics paramGraphics, short paramShort1, short paramShort2);

  public abstract void jdMethod_if(Graphics paramGraphics);

  public abstract void jdField_case();
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     a4
 * JD-Core Version:    0.6.0
 */
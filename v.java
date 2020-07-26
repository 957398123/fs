import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class v
{
  private short jdField_char;
  private short jdField_case;
  Vector jdField_if = new Vector();
  private short[] a;
  private boolean[] jdField_int;
  short b = (short)(a5.iG + 2);
  public short jdField_void = -1;
  public short jdField_goto = -1;
  public int jdField_new = -1;
  public byte jdField_byte = -1;
  public boolean jdField_else = false;
  public long jdField_try = 0L;
  byte c = -1;
  public long jdField_for = -1L;

  public final Vector a()
  {
    return this.jdField_if;
  }

  public final void a(ba paramba)
  {
    this.jdField_if.addElement(paramba);
  }

  public final void a(int paramInt)
  {
    this.a = new short[paramInt];
  }

  public final void a(String paramString, byte paramByte)
  {
    if (((this = (ba)this.jdField_if.elementAt(1)) instanceof ah))
      ((ah)this).a(paramString);
  }

  public final void a(Graphics paramGraphics, boolean paramBoolean)
  {
    for (int i = 0; i < this.jdField_if.size(); i++)
    {
      ba localba;
      (localba = (ba)this.jdField_if.elementAt(i)).jdField_if(paramBoolean);
      localba.a(paramGraphics);
    }
  }

  public final short[] jdField_case()
  {
    return this.a;
  }

  public final void a(short[] paramArrayOfShort)
  {
    this.a = paramArrayOfShort;
  }

  public final short jdField_if(byte paramByte)
  {
    int i = 0;
    int j;
    for (byte b1 = 0; b1 < paramByte; b1++)
    {
      v localv = this;
      j = (short)(i + this.a[b1]);
    }
    return j;
  }

  public final boolean[] jdField_if()
  {
    return this.jdField_int;
  }

  public final void a(boolean[] paramArrayOfBoolean)
  {
    this.jdField_int = paramArrayOfBoolean;
  }

  public final short jdField_for()
  {
    return this.b;
  }

  public final void jdField_int(short paramShort)
  {
    this.b = paramShort;
  }

  public final short jdField_try()
  {
    return this.jdField_char;
  }

  public final void jdField_if(short paramShort)
  {
    this.jdField_char = paramShort;
  }

  public final short jdField_byte()
  {
    return this.jdField_case;
  }

  public final void a(short paramShort)
  {
    this.jdField_case = paramShort;
  }

  public final void a(byte paramByte)
  {
    this.c = paramByte;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     v
 * JD-Core Version:    0.6.0
 */
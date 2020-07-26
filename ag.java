import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class ag extends a4
{
  public byte r = 0;
  private byte s = 0;

  public ag(byte paramByte)
  {
    this.jdField_try = paramByte;
    this.h = 0;
  }

  public final void jdMethod_int(byte paramByte)
  {
    this.r = paramByte;
  }

  public final void a(Graphics paramGraphics)
  {
    a(paramGraphics, this.o, this.n);
    if (z.case)
      jdMethod_if(paramGraphics, this.o, this.n);
    if (this.jdField_try == 11)
      jdMethod_if(paramGraphics, this.o, this.n);
  }

  public final void a(Graphics paramGraphics, short paramShort1, short paramShort2)
  {
    this = this;
    a5.ch.jdMethod_if(paramGraphics, paramShort1 - (a5.ch.jdField_try >> 1), paramShort2 - (a5.ch.a >> 1), this.r);
  }

  public final void jdMethod_if(Graphics paramGraphics)
  {
    b5.jdMethod_if(paramGraphics, jdMethod_byte(), this.o - (paramGraphics.getFont().stringWidth(jdMethod_byte()) >> 1), this.n - ((z.case) || (this.jdField_try == 11) ? (a5.hk.a >> 1) + 15 : a5.ch.a >> 1) - a5.iG, 65280, 0);
  }

  private void jdMethod_if(Graphics paramGraphics, short paramShort1, short paramShort2)
  {
    ag localag = this;
    if (this.r == 5)
    {
      a5.hk.jdMethod_if(paramGraphics, paramShort1 - (a5.hk.jdField_try >> 1) + 2, paramShort2 - (a5.hk.a >> 1) - 18, this.s);
      return;
    }
    localag = this;
    if (this.r == 6)
    {
      a5.dE.jdMethod_if(paramGraphics, paramShort1 - (a5.dE.jdField_try >> 1) + 2, paramShort2 - (a5.dE.a >> 1) - 18, this.s);
      return;
    }
    localag = this;
    if (this.r == 7)
      a5.eh.jdMethod_if(paramGraphics, paramShort1 - (a5.eh.jdField_try >> 1) + 2, paramShort2 - (a5.eh.a >> 1) - 18, this.s);
  }

  public final void jdMethod_case()
  {
    this.o = (short)(this.c - z.aE);
    this.n = (short)(this.jdField_void - z.aD + 3);
    if (z.case)
    {
      this.s = (byte)(this.s + 1);
      if (this.s > 3)
        this.s = 0;
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     ag
 * JD-Core Version:    0.6.0
 */
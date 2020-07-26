import javax.microedition.lcdui.Graphics;

public final class bj extends ba
{
  boolean il = true;
  short ii = 0;

  public bj(short paramShort1, short paramShort2, be parambe)
  {
    super(paramShort1, paramShort2, 0, 0, parambe);
    paramShort1 = this;
    if (this.il)
    {
      jdMethod_do((short)(this.ii * a5.ic / 176));
      return;
    }
    a((short)(this.ii * a5.il / 208));
  }

  public final void a(Graphics paramGraphics)
  {
    bj localbj = this;
    if (this.il)
    {
      jdMethod_do(this.ii);
      a(0);
    }
    else
    {
      jdMethod_do(0);
      a(this.ii);
    }
    paramGraphics.setColor(bm.b4);
    localbj = this;
    if (this.il)
    {
      paramGraphics.drawLine(v(), jdMethod_long(), v() + jdMethod_for() - 1, jdMethod_long());
      return;
    }
    paramGraphics.drawLine(v(), jdMethod_long(), v(), jdMethod_long() + z() - 1);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bj
 * JD-Core Version:    0.6.0
 */
import javax.microedition.lcdui.Graphics;

public final class a6
{
  public byte a;
  public short jdField_if;
  private byte jdField_for;
  private byte jdField_int;
  private boolean jdField_do;
  public a4 jdField_byte;

  public a6(a4 parama4, short paramShort, byte paramByte1, byte paramByte2)
  {
    this.jdField_byte = parama4;
    this.jdField_if = paramShort;
    this.jdField_for = -1;
    this.jdField_int = paramByte1;
    this.jdField_do = false;
    this.a = paramByte2;
  }

  final boolean jdField_if()
  {
    if (this.jdField_for >= a5.g8[this.jdField_if].length)
    {
      this.jdField_for = 0;
      a6 locala6 = this;
      byte b;
      if (this.jdField_int > 1)
      {
        locala6 = this;
        b = (byte)(this.jdField_int - 1);
        locala6 = this;
        this.jdField_int = b;
        this.jdField_do = false;
      }
      else
      {
        locala6 = this;
        if (this.jdField_int < 0)
        {
          this.jdField_do = false;
        }
        else
        {
          locala6 = this;
          if (this.jdField_int == 1)
          {
            b = 0;
            locala6 = this;
            this.jdField_int = b;
            this.jdField_do = true;
          }
        }
      }
    }
    return this.jdField_do;
  }

  public final void a(a4 parama4, short paramShort, byte paramByte)
  {
    this.jdField_byte = parama4;
    this.jdField_if = paramShort;
    this.jdField_for = -1;
    this.jdField_int = -1;
    this.jdField_do = false;
    b5.a(this.jdField_if);
  }

  public final void jdField_do()
  {
    if (bp.ag() != null)
    {
      bp.ag();
      if ((bp.c(this.jdField_if)) && ((a5.V() != 0) || (a5.gQ != null)));
    }
    else
    {
      this.jdField_for = (byte)(this.jdField_for + 1);
    }
  }

  public final void a(Graphics paramGraphics)
  {
    if (this.jdField_for < 0)
      this.jdField_for = 0;
    if (this.jdField_byte == null)
    {
      b5.a(a5.fM, paramGraphics, a5.eS[a5.g8[this.jdField_if][this.jdField_for]], a5.eJ, 0 - z.aE, 0 - z.aD, false);
      return;
    }
    b5.a(a5.fM, paramGraphics, a5.eS[a5.g8[this.jdField_if][this.jdField_for]], a5.eJ, this.jdField_byte.jdMethod_long(), this.jdField_byte.a() - 3, this.jdField_byte.g);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     a6
 * JD-Core Version:    0.6.0
 */
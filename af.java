import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class af extends ba
{
  private short an = 0;
  private short ao = 0;
  private short aw = 0;
  private short au = 0;
  private short al = 0;
  private short ak = 0;
  private boolean at = false;
  private boolean am = false;
  private int aq = 0;
  private short ap = 0;
  private short as = 0;
  public short az = 0;
  public short ay = 0;
  private short ah = 0;
  public short aj = 0;

  public af(short paramShort1, short paramShort2, short paramShort3, short paramShort4, byte paramByte, boolean paramBoolean, be parambe)
  {
    super(paramShort1, paramShort2, paramShort3, paramShort4, parambe);
    this.k = paramShort1;
    this.j = paramShort2;
    this.a = paramShort3;
    this.jdField_int = paramShort4;
    this.aw = (short)(this.j + a5.ca.getHeight());
    paramShort1 = this;
    this.au = (short)(jdMethod_char(this.at) - 1);
    this.al = (short)(this.k + a5.ca.getWidth());
    paramShort1 = this;
    this.ak = (short)(jdMethod_else(this.am) - 1);
    a(0);
    if (jdMethod_char() == 0)
    {
      this.a = (short)a5.ca.getWidth();
      aa();
      a(this.aw, this.au + 1);
      return;
    }
    if (jdMethod_char() == 1)
    {
      this.jdField_int = (short)a5.ca.getHeight();
      paramShort1 = this;
      this.ao = (short)(paramShort1.k + a5.ca.getWidth());
      a(this.al, this.ak + 1);
    }
  }

  private int jdMethod_char(boolean paramBoolean)
  {
    if (paramBoolean)
      return this.j + this.jdField_int - 2 * a5.ca.getHeight();
    return this.j + this.jdField_int - a5.ca.getHeight();
  }

  private int jdMethod_else(boolean paramBoolean)
  {
    if (paramBoolean)
      return this.k + this.a - 2 * a5.ca.getWidth();
    return this.k + this.a - a5.ca.getHeight();
  }

  public final void a(Graphics paramGraphics)
  {
    af localaf;
    if (jdMethod_char() == 0)
    {
      paramGraphics.drawImage(a5.ca, this.k, this.j, 20);
      localaf = this;
      b5.a(paramGraphics, a5.ca, this.k, jdMethod_char(this.at), 1);
      paramGraphics.setColor(bm.cE);
      paramGraphics.drawLine(this.k + 2, this.ap, this.k + 2, this.au);
      paramGraphics.setColor(bm.cB);
      paramGraphics.drawLine(this.k + 2 + 1, this.ap, this.k + 2 + 1, this.au);
      paramGraphics.setColor(bm.cz);
      paramGraphics.drawLine(this.k + 2 + 2, this.ap, this.k + 2 + 2, this.au);
      paramGraphics.setColor(bm.cE);
      paramGraphics.drawLine(this.k + 2 + 3, this.ap, this.k + 2 + 3, this.au);
      paramGraphics.drawImage(a5.hI, this.k, this.an, 20);
      return;
    }
    if (jdMethod_char() == 1)
    {
      b5.a(paramGraphics, a5.ca, this.k, this.j, 6);
      localaf = this;
      b5.a(paramGraphics, a5.ca, jdMethod_else(this.am), this.j, 5);
      paramGraphics.setColor(bm.cE);
      paramGraphics.drawLine(this.al, this.j + 2, this.ak, this.j + 2);
      paramGraphics.setColor(bm.cz);
      paramGraphics.drawLine(this.al, this.j + 2 + 1, this.ak, this.j + 2 + 1);
      paramGraphics.setColor(bm.cB);
      paramGraphics.drawLine(this.al, this.j + 2 + 2, this.ak, this.j + 2 + 2);
      paramGraphics.setColor(bm.cE);
      paramGraphics.drawLine(this.al, this.j + 2 + 3, this.ak, this.j + 2 + 3);
      b5.a(paramGraphics, a5.hI, this.ao, this.j, 6);
    }
  }

  public final void aa()
  {
    af localaf = this;
    this.au = (short)(jdMethod_char(this.at) - 1);
    this.an = (short)(this.j + a5.ca.getHeight());
    this.ap = this.an;
    this.as = (short)(this.j + this.jdField_int - a5.ca.getHeight() - W());
  }

  public final void a(short paramShort, boolean paramBoolean)
  {
    if (paramBoolean)
      if (a5.jdMethod_try(20480))
      {
        if (paramShort < this.aj)
          this.aj = paramShort;
      }
      else if ((a5.jdMethod_try(40960)) && (paramShort >= this.aj + this.ay))
        this.aj = (short)(paramShort - this.ay + 1);
    this.ah = (short)(this.az - this.ay);
    if (this.ah > 0)
    {
      if (this.aj == this.az - 1)
      {
        this.an = this.as;
        return;
      }
      this.an = (short)(this.j + a5.ca.getHeight() + this.aj * (this.aq - W()) / this.ah);
      return;
    }
    this.an = (short)(this.j + a5.ca.getHeight());
  }

  private void a(int paramInt1, int paramInt2)
  {
    this.aq = Math.abs(paramInt1 - paramInt2);
    b5.jdMethod_case("轨道长度 = " + this.aq);
    if (jdMethod_char() == 0)
    {
      this.as = (short)(this.j + a5.ca.getHeight() + this.aq - W());
      return;
    }
    if (jdMethod_char() == 1)
    {
      a5.ca.getHeight();
      W();
    }
  }

  private static int W()
  {
    if (a5.hI != null)
      return a5.hI.getHeight();
    return 0;
  }

  public final void jdMethod_char(short paramShort)
  {
    this.aj = paramShort;
  }

  public final void a(short paramShort1, short paramShort2, short paramShort3)
  {
    this.az = paramShort1;
    this.ay = paramShort2;
    this.aj = paramShort3;
    this.ah = (short)(paramShort1 - paramShort2);
    if (this.ah > 0)
    {
      if (paramShort3 == paramShort1 - 1)
      {
        this.an = this.as;
        return;
      }
      this.an = (short)(this.j + a5.ca.getHeight() + paramShort3 * (this.aq - W()) / this.ah);
      return;
    }
    this.an = (short)(this.j + a5.ca.getHeight());
  }

  public final boolean b()
  {
    if (a5.jdMethod_for(this.k, this.j, a5.hI.getWidth(), this.an - this.j))
    {
      a5.a(4096);
      return true;
    }
    if (a5.jdMethod_for(this.k, this.an + a5.hI.getHeight(), a5.hI.getWidth(), this.j + this.jdField_int - this.an - a5.hI.getHeight()))
    {
      a5.a(8192);
      return true;
    }
    return false;
  }
}
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ae extends ba
{
  private Vector ad;
  private byte ab;
  private byte ae = 0;

  public ae(short paramShort1, short paramShort2, short paramShort3, short paramShort4, byte paramByte, be parambe)
  {
    super(paramShort1, paramShort2, paramShort3, 0, parambe);
    this.ae = paramByte;
    this.ad = new Vector();
    if (paramShort1 <= 0)
      this.k = 0;
    this.a = paramShort3;
    this.jdField_int = (short)(a5.iG + 8);
  }

  public final void a(Graphics paramGraphics)
  {
    if (a5.fE.size() > 0)
      this.ab = ((be)a5.fE.elementAt(0)).ht;
    int i = 0;
    if (this.ad.size() > this.ae)
      i = this.ab < this.ae - 1 ? 0 : this.ab - this.ae + 1;
    int j = 0;
    int k = this.ae * (b5.jdMethod_do((String)this.ad.elementAt(i)) + 2 + 2) - 2 + 6;
    int m = a5.ic - k >> 1;
    paramGraphics.setColor(bm.H);
    paramGraphics.drawRect(m, this.j, k - 4, this.jdField_int - 1);
    paramGraphics.setColor(bm.G);
    paramGraphics.drawRect(m + 1, this.j + 1, k - 3, this.jdField_int - 3);
    k = m + 2 + 1;
    int n = this.j + 4 - 2 + 1;
    int i1 = this.jdField_int - 6;
    for (int i2 = i; i2 < i + this.ae; i2++)
    {
      i3 = ((String)this.ad.elementAt(i2)).length() * a5.iA + 2;
      if (i2 - i > 0)
        j += b5.jdMethod_do((String)this.ad.elementAt(i2 - 1)) + 2;
      if (i2 - i == (this.ab > this.ae - 1 ? this.ae - 1 : this.ab))
      {
        paramGraphics.setColor(bm.E);
        paramGraphics.fillRect(k + j + (i2 - i << 1), n, i3, i1);
        paramGraphics.setColor(bm.af);
        paramGraphics.drawRect(k + j + (i2 - i << 1) - 1, n - 1, i3 + 1, i1 + 1);
      }
      else
      {
        paramGraphics.setColor(bm.i);
        paramGraphics.fillRect(k + j + (i2 - i << 1), n, i3, i1);
        paramGraphics.setColor(bm.bF);
        paramGraphics.drawRect(k + j + (i2 - i << 1) - 1, n - 1, i3 + 1, i1 + 1);
      }
      paramGraphics.setColor(bm.W);
      if (((this.ad.size() > this.ae) && (i2 == i + this.ae - 1) && (this.ab < this.ae - 1)) || ((this.ad.size() > this.ae) && (i2 == i) && (this.ab >= this.ae - 1)))
        paramGraphics.drawString("……", k + 1 + j + (i2 - i << 1), n, 20);
      else
        paramGraphics.drawString((String)this.ad.elementAt(i2 > i + this.ae - 1 ? i + this.ae - 1 : i2), k + 1 + j + (i2 - i << 1), n, 20);
    }
    i2 = (short)(this.j + (this.jdField_int - a5.ec.getHeight()) / 2);
    m -= a5.ec.getWidth();
    int i3 = 0;
    if (a5.ht % 4 > 2)
      i3 = 2;
    paramGraphics.drawImage(a5.ec, m - i3, i2, 20);
    b5.a(paramGraphics, a5.ec, a5.ic - m - a5.ec.getWidth() + i3, i2, 2);
    paramGraphics.drawImage(a5.iJ, m + 3 - i3, i2 + 2, 20);
    paramGraphics.drawImage(a5.gU, a5.ic - m - 3 - a5.gU.getWidth() + i3, i2 + 2, 20);
  }

  public final void a(Vector paramVector)
  {
    this.ad = paramVector;
  }

  public final void f()
  {
  }

  public final void U()
  {
    ae localae = this;
    if ((a5.gZ) && (a5.jdMethod_byte(268435456)))
    {
      int j = localae.ae * (b5.jdMethod_do((String)localae.ad.elementAt(0)) + 2 + 2) - 2 + 6;
      j = a5.ic - j >> 1;
      i = (short)(localae.j + (localae.jdField_int - a5.ec.getHeight()) / 2);
      if (a5.a(j -= a5.ec.getWidth(), i, a5.ec.getWidth(), a5.ec.getHeight()))
        a5.a(1024);
      else if (a5.a(a5.ic - j - a5.ec.getWidth(), i, a5.ec.getWidth(), a5.ec.getHeight()))
        a5.a(2048);
    }
    int i = 1;
    if (a5.jdMethod_byte(1024))
    {
      this.ab = ((be)a5.fE.elementAt(0)).ht;
      this.ab = (byte)(this.ab - 1);
      if (this.ab < 0)
      {
        this.ab = 0;
        i = 0;
      }
      ((be)a5.fE.elementAt(0)).ht = this.ab;
      if (i != 0)
        a5.es.cs();
      (a5.es = (be)a5.fE.elementAt(this.ab)).ck();
      return;
    }
    if (a5.jdMethod_byte(2048))
    {
      this.ab = ((be)a5.fE.elementAt(0)).ht;
      this.ab = (byte)(this.ab + 1);
      if (this.ab > a5.fE.size() - 1)
      {
        this.ab = (byte)(a5.fE.size() - 1);
        i = 0;
      }
      ((be)a5.fE.elementAt(0)).ht = this.ab;
      if (i != 0)
        a5.es.cs();
      (a5.es = (be)a5.fE.elementAt(this.ab)).ck();
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     ae
 * JD-Core Version:    0.6.0
 */
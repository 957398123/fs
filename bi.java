import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bi
{
  public Image jdField_if;
  public short jdField_try = 0;
  public short a = 0;
  public byte jdField_int = 0;
  private byte jdField_for = 0;
  public byte jdField_new = 0;

  public bi(Image paramImage, int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0))
      return;
    this.jdField_try = (short)paramInt1;
    this.a = (short)paramInt2;
    this.jdField_if = paramImage;
    this.jdField_int = (byte)(paramImage.getWidth() / this.jdField_try);
    this.jdField_for = (byte)(paramImage.getHeight() / this.a);
    this.jdField_new = (byte)(this.jdField_int * this.jdField_for);
  }

  public bi(String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0))
      return;
    this.jdField_try = (short)paramInt1;
    this.a = (short)paramInt2;
    if (!paramString.equals(""))
    {
      this.jdField_if = b5.a(paramString);
      paramString.substring(1, paramString.length());
    }
    this.jdField_int = (byte)(this.jdField_if.getWidth() / this.jdField_try);
    this.jdField_for = (byte)(this.jdField_if.getHeight() / this.a);
    this.jdField_new = (byte)(this.jdField_int * this.jdField_for);
  }

  public final void jdField_if(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    this = 0;
    paramInt3 = paramInt3;
    paramInt2 = paramInt2;
    paramInt1 = paramInt1;
    paramGraphics = paramGraphics;
    this = this;
    if (this.jdField_if != null)
    {
      int i = this.jdField_try * (paramInt3 % this.jdField_int);
      paramInt3 = this.a * (paramInt3 / this.jdField_int);
      b5.a(paramGraphics, this.jdField_if, i, paramInt3, this.jdField_try, this.a, paramInt1, paramInt2, 0);
    }
  }

  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    b5.a(paramGraphics, this.jdField_if, paramInt1, paramInt2, paramInt3);
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bi
 * JD-Core Version:    0.6.0
 */
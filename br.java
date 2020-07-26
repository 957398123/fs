import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class br extends ba
{
  private Vector iY;
  private Vector iO;
  private Vector iU;
  private byte iQ = 0;
  public byte iV = -1;
  private boolean iR = true;
  public static br iZ = null;
  public static br iW = null;

  public br(short paramShort1, short paramShort2, short paramShort3, short paramShort4, byte paramByte)
  {
    super(0, 0, 0, 0, null);
    this.iV = paramByte;
    this.iY = new Vector();
    this.iO = new Vector();
    this.iU = new Vector();
    dg();
  }

  public br(byte paramByte)
  {
    this(0, 0, 0, 0, paramByte);
  }

  private void dg()
  {
    this.k = dn();
    this.j = c7();
    this.a = dl();
    this.jdField_int = dd();
  }

  public final void a(Graphics paramGraphics)
  {
    paramGraphics.setColor(7755053);
    paramGraphics.fillRect(this.k, this.j, this.a, this.jdField_int);
    paramGraphics.setColor(11241821);
    paramGraphics.fillRect(this.k + 1, this.j + 1, this.a - 2, this.jdField_int - 2);
    paramGraphics.setColor(15255701);
    paramGraphics.fillRect(this.k + 2, this.j + 2, this.a - 4, this.jdField_int - 4);
    paramGraphics.setColor(11241821);
    paramGraphics.fillRect(this.k + 3, this.j + 3, this.a - 6, this.jdField_int - 6);
    paramGraphics.setColor(12952181);
    paramGraphics.fillRect(this.k + 4, this.j + 4, this.a - 8, this.jdField_int - 8);
    paramGraphics.setColor(15255701);
    paramGraphics.fillRect(this.k + 5, this.j + 5, this.a - 10, this.jdField_int - 10);
    paramGraphics.setColor(bm.try);
    paramGraphics.fillRect(this.k + 6, this.j + 6, this.a - 12, this.jdField_int - 12);
    int i = 0;
    for (int j = 0; j < this.iY.size(); j++)
    {
      int m;
      if (j == this.iQ)
      {
        i = bm.try;
        k = this.k + (this.a - b5.jdMethod_do((String)this.iY.elementAt(dh()))) / 2 - 4;
        m = this.j + 3 + 2 + 5 + j * (a5.iG + 2) - 1;
        int n = b5.jdMethod_do((String)this.iY.elementAt(dh())) + 8;
        int i1 = a5.iG + 2;
        paramGraphics.setColor(bm.bo);
        paramGraphics.fillRect(k, m, n, i1);
      }
      else
      {
        i = bm.bP;
      }
      int k = 0;
      if (this.iV == 3)
      {
        m = -1;
        switch (bf.new[j])
        {
        case 2:
          m = 6;
          break;
        case 1:
          m = 5;
          break;
        case 4:
          m = 4;
          break;
        case 3:
          m = 3;
          break;
        case 5:
          m = 0;
          break;
        case 6:
          m = 1;
          break;
        case 7:
          m = 2;
          break;
        case 8:
          m = 6;
        }
        a5.eq.jdMethod_if(paramGraphics, this.k + 10, this.j + 3 + 2 + 5 + j * (a5.iG + 2), m);
        k = 10;
      }
      if (this.iR)
      {
        b5.jdMethod_do(paramGraphics, (String)this.iY.elementAt(j), this.a, this.k, this.j + 3 + 2 + 5 + j * (a5.iG + 2), i);
      }
      else
      {
        paramGraphics.setColor(i);
        paramGraphics.drawString((String)this.iY.elementAt(j), this.k + 10 + k, this.j + 3 + 2 + 5 + j * (a5.iG + 2), 20);
      }
    }
  }

  public final Vector dj()
  {
    return this.iY;
  }

  public final byte de()
  {
    return this.iQ;
  }

  public final void c9()
  {
    this.iQ = (byte)(this.iQ + 1);
    if (this.iQ > this.iY.size() - 1)
      this.iQ = 0;
  }

  public final void c8()
  {
    this.iQ = (byte)(this.iQ - 1);
    if (this.iQ < 0)
      this.iQ = (byte)(this.iY.size() - 1);
  }

  public final boolean df()
  {
    if ((a5.gZ) && (a5.jdMethod_byte(268435456)))
    {
      int i = this.iY.size();
      int k;
      int m;
      int n;
      for (int j = 0; j < i; j = (byte)(j + 1))
      {
        k = this.k + (this.a - b5.jdMethod_do((String)this.iY.elementAt(dh()))) / 2 - 4;
        m = this.j + 3 + 2 + 5 + j * (a5.iG + 2) - 1;
        n = b5.jdMethod_do((String)this.iY.elementAt(dh())) + 8;
        int i1 = a5.iG + 2;
        if (!a5.a(k, m, n, i1))
          continue;
        this.iQ = j;
        return true;
      }
      if ((this == iZ) || (this == iW))
      {
        j = dn();
        k = c7();
        m = dl();
        n = dd();
        if ((!a5.a(j, k, m, n)) && (a5.a(0, 0, a5.ic, a5.il)))
        {
          a5.a(262144);
          return false;
        }
      }
    }
    return false;
  }

  private short dn()
  {
    int i = 0;
    if (this.iV == 0)
      i = 0;
    else if ((this.iV == 1) || (this.iV == 2) || (this.iV == 3))
      i = (short)((a5.ic - dl()) / 2);
    return i;
  }

  private short c7()
  {
    int i = 0;
    if (this.iV == 0)
      i = (short)(a5.il - dd() - 18);
    else if ((this.iV == 1) || (this.iV == 2) || (this.iV == 3))
      i = (short)((a5.il - dd()) / 2);
    return i;
  }

  private short dd()
  {
    int i = a5.iG;
    return (short)(this.iY.size() * i + (this.iY.size() - 1 << 1) + 20);
  }

  private short dl()
  {
    if (this.iY.size() == 0)
      return 0;
    return (short)(b5.jdMethod_do((String)this.iY.elementAt(dh())) + 26);
  }

  private int dh()
  {
    if (this.iY.size() == 0)
      return 0;
    int i = 0;
    int j = ((String)this.iY.elementAt(0)).length();
    for (int k = 1; k < this.iY.size(); k++)
    {
      if (((String)this.iY.elementAt(k)).length() <= j)
        continue;
      j = ((String)this.iY.elementAt(k)).length();
      i = k;
    }
    return i;
  }

  public static int jdMethod_new(String[] paramArrayOfString)
  {
    int i = 0;
    for (int j = 0; j < paramArrayOfString.length; j++)
    {
      if (paramArrayOfString[j].length() <= i)
        continue;
      i = paramArrayOfString[j].length();
    }
    return i;
  }

  public final Vector db()
  {
    return this.iO;
  }

  public final void a(String paramString, int paramInt1, int paramInt2)
  {
    if ((paramString != null) && (!paramString.equals("")))
    {
      this.iY.addElement(paramString);
      this.iO.addElement(new Integer(paramInt1));
      this.iU.addElement(new Integer(paramInt2));
      dg();
    }
  }

  public final void a(String[] paramArrayOfString, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if ((paramArrayOfString == null) || (paramArrayOfInt1 == null) || (paramArrayOfString.length != paramArrayOfInt1.length))
      return;
    for (int i = 0; i < paramArrayOfString.length; i++)
      a(paramArrayOfString[i], paramArrayOfInt1[i], paramArrayOfInt2[i]);
  }

  public final void a(String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramArrayOfString == null) || (paramArrayOfInt == null) || (paramArrayOfString.length != paramArrayOfInt.length))
      return;
    for (int i = 0; i < paramArrayOfString.length; i++)
      a(paramArrayOfString[i], paramArrayOfInt[i], 3);
  }

  public final void dc()
  {
    switch (((Integer)(Integer)this.iU.elementAt(this.iQ)).intValue())
    {
    case 0:
      ad.jdMethod_new();
      a5.d6.removeAllElements();
      a5.d6.addElement(new Integer(0));
      a5.fE.removeAllElements();
      return;
    case 1:
      switch (a5.es.g9)
      {
      case 131079:
        if (ao.ct)
          break;
        ad.jdMethod_new();
        dm();
        return;
      default:
        ad.jdMethod_new();
        dm();
        return;
      }
    case 2:
      ad.jdMethod_new();
      c6();
      return;
    case 3:
      return;
    case 4:
      ad.jdMethod_new();
      return;
    case 5:
      ad.jdMethod_new();
      if (a5.d6.size() == 0)
      {
        a5.d6.addElement(new Integer(a5.es.g9));
        return;
      }
      a5.d6.removeElementAt(0);
      return;
    case 6:
      dk();
    }
  }

  public static void c6()
  {
    if (a5.fE.size() > 0)
    {
      Vector localVector = new Vector();
      for (int i = 0; i < a5.fE.size(); i++)
        localVector.addElement(a5.fE.elementAt(i));
      a5.d6.addElement(localVector);
      a5.fE.removeAllElements();
      return;
    }
    if (a5.es != null)
      a5.d6.addElement(a5.es);
  }

  public static void dm()
  {
    if (a5.fE.size() > 0)
    {
      Vector localVector = new Vector();
      for (int i = 0; i < a5.fE.size(); i++)
        localVector.addElement(new Integer(((be)a5.fE.elementAt(i)).g9));
      a5.d6.addElement(localVector);
      a5.fE.removeAllElements();
      return;
    }
    if (a5.es != null)
      a5.d6.addElement(new Integer(a5.es.g9));
  }

  public static void dk()
  {
    if (a5.d6.size() > 0)
      a5.d6.removeElementAt(a5.d6.size() - 1);
  }

  public final void da()
  {
    this.iQ = 0;
  }

  public final void m(boolean paramBoolean)
  {
    this.iR = false;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     br
 * JD-Core Version:    0.6.0
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public final class p
{
  private Vector jdField_do = null;
  private byte jdField_for = -1;
  private byte jdField_if = -1;

  public final g jdField_if(byte paramByte)
  {
    return (g)this.jdField_do.elementAt(paramByte);
  }

  public final byte jdField_for(byte paramByte)
  {
    if ((this.jdField_for == paramByte) && (this.jdField_if != -1))
      return this.jdField_if;
    int i = -1;
    byte b;
    if (this.jdField_do != null)
    {
      int j = this.jdField_do.size();
      for (int k = 0; k < j; k++)
      {
        if (((g)this.jdField_do.elementAt(k)).jdField_if != paramByte)
          continue;
        i = (byte)k;
        break;
      }
      if (i == -1)
      {
        j = paramByte;
        p localp = this;
        g localg;
        (localg = new g()).jdField_if = (short)j;
        Object localObject = null;
        localObject = null;
        localObject = "/bfm/m_body";
        if (j < 10)
          localObject = (String)localObject + "0";
        localObject = (String)localObject + j;
        localObject = b5.int$3b9f0c8(localObject = (String)localObject + ".dat");
        localObject = new DataInputStream((InputStream)localObject);
        int i1;
        int i2;
        int i3;
        try
        {
          int m = ((DataInputStream)localObject).readShort();
          localg.jdField_do = new short[m][];
          for (i1 = 0; i1 < m; i1 = (short)(i1 + 1))
          {
            ((DataInputStream)localObject).readShort();
            i2 = (byte)((i2 = ((DataInputStream)localObject).readByte()) << 1);
            localg.jdField_do[i1] = new short[i2];
            i3 = 0;
            while (i3 < i2)
            {
              i3 = (byte)(i3 + 1);
              localg.jdField_do[i1][i3] = ((DataInputStream)localObject).readShort();
              i3 = (byte)(i3 + 1);
              localg.jdField_do[i1][i3] = ((DataInputStream)localObject).readShort();
            }
          }
          ((DataInputStream)localObject).close();
        }
        catch (IOException localIOException1)
        {
          b5.jdMethod_case("SAManager.LoadData()...读入骨架文件");
          localIOException1.printStackTrace();
        }
        localObject = "/bfm/m_motion";
        if (j < 10)
          localObject = (String)localObject + "0";
        localObject = (String)localObject + j;
        localObject = b5.int$3b9f0c8(localObject = (String)localObject + ".dat");
        localObject = new DataInputStream((InputStream)localObject);
        try
        {
          int n = ((DataInputStream)localObject).readShort();
          localg.jdField_for = new short[n][];
          for (i1 = 0; i1 < n; i1 = (short)(i1 + 1))
          {
            ((DataInputStream)localObject).readByte();
            i2 = ((DataInputStream)localObject).readByte();
            localg.jdField_for[i1] = new short[i2];
            i3 = 0;
            while (i3 < i2)
            {
              i3 = (byte)(i3 + 1);
              localg.jdField_for[i1][i3] = ((DataInputStream)localObject).readShort();
            }
          }
          ((DataInputStream)localObject).close();
        }
        catch (IOException localIOException2)
        {
          b5.jdMethod_case("SAManager.LoadData()...读入动作文件");
          localIOException2.printStackTrace();
        }
        localp.jdField_do.addElement(localg);
        b = (byte)(this.jdField_do.size() - 1);
      }
    }
    this.jdField_for = paramByte;
    this.jdField_if = b;
    return b;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     p
 * JD-Core Version:    0.6.0
 */
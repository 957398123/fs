import java.io.PrintStream;

public final class ac
{
  private int jdField_try = 0;
  byte[] jdField_do;

  public ac()
  {
    this(16);
  }

  private ac(int paramInt)
  {
    this.jdField_do = new byte[16];
    this.jdField_try = 0;
  }

  public ac(byte[] paramArrayOfByte)
  {
    this.jdField_do = paramArrayOfByte;
    this.jdField_try = 0;
  }

  public final void a(boolean paramBoolean)
  {
    jdMethod_if(1);
    this.jdField_do[(this.jdField_try++)] = (byte)(paramBoolean ? 1 : 0);
  }

  public final void a(byte paramByte)
  {
    jdMethod_if(1);
    this.jdField_do[(this.jdField_try++)] = paramByte;
  }

  public final void a(short paramShort)
  {
    jdMethod_if(2);
    this.jdField_do[(this.jdField_try + 1)] = (byte)paramShort;
    this.jdField_do[this.jdField_try] = (byte)(paramShort >>> 8);
    this.jdField_try += 2;
  }

  public final void jdField_do(int paramInt)
  {
    jdMethod_if(4);
    this.jdField_do[(this.jdField_try + 3)] = (byte)paramInt;
    this.jdField_do[(this.jdField_try + 2)] = (byte)(paramInt >>> 8);
    this.jdField_do[(this.jdField_try + 1)] = (byte)(paramInt >>> 16);
    this.jdField_do[this.jdField_try] = (paramInt >> 24);
    this.jdField_try += 4;
  }

  public final void a(long paramLong)
  {
    jdMethod_if(8);
    this.jdField_do[(this.jdField_try + 7)] = (byte)(int)paramLong;
    this.jdField_do[(this.jdField_try + 6)] = (byte)(int)(paramLong >>> 8);
    this.jdField_do[(this.jdField_try + 5)] = (byte)(int)(paramLong >>> 16);
    this.jdField_do[(this.jdField_try + 4)] = (byte)(int)(paramLong >>> 24);
    this.jdField_do[(this.jdField_try + 3)] = (byte)(int)(paramLong >>> 32);
    this.jdField_do[(this.jdField_try + 2)] = (byte)(int)(paramLong >>> 40);
    this.jdField_do[(this.jdField_try + 1)] = (byte)(int)(paramLong >>> 48);
    this.jdField_do[this.jdField_try] = (byte)(int)(paramLong >>> 56);
    this.jdField_try += 8;
  }

  public final void jdMethod_if(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return;
    jdMethod_if(paramArrayOfByte.length);
    System.arraycopy(paramArrayOfByte, 0, this.jdField_do, this.jdField_try, paramArrayOfByte.length);
    this.jdField_try += paramArrayOfByte.length;
  }

  public final void jdMethod_if(String paramString)
  {
    paramString = (this = paramString).length();
    String str = 0;
    int j = 0;
    int i;
    for (localObject = 0; localObject < paramString; localObject++)
    {
      str++;
      if (i > 2047)
        str += 3;
      else
        str += 2;
    }
    j++;
    (localObject = new byte[str + 2])[0] = (byte)(str >>> 8);
    j++;
    localObject[1] = (byte)str;
    str = 0;
    for (str = 0; (str < paramString) && ((i = charAt(str)) >= '\001') && (i <= 127); str++)
      localObject[(j++)] = (byte)i;
    while (str < paramString)
    {
      if (((i = charAt(str)) >= '\001') && (i <= 127))
      {
        localObject[(j++)] = (byte)i;
      }
      else if (i > 2047)
      {
        localObject[(j++)] = (byte)(0xE0 | i >> 12 & 0xF);
        localObject[(j++)] = (byte)(0x80 | i >> 6 & 0x3F);
        localObject[(j++)] = (byte)(0x80 | i & 0x3F);
      }
      else
      {
        localObject[(j++)] = (byte)(0xC0 | i >> 6 & 0x1F);
        localObject[(j++)] = (byte)(0x80 | i & 0x3F);
      }
      str++;
    }
  }

  public final boolean jdMethod_case()
  {
    return this.jdField_do[(this.jdField_try++)] != 0;
  }

  public final byte jdMethod_if()
  {
    return this.jdField_do[(this.jdField_try++)];
  }

  public final short jdMethod_new()
  {
    int i = (short)((this.jdField_do[(this.jdField_try + 1)] & 0xFF) + ((this.jdField_do[this.jdField_try] & 0xFF) << 8));
    this.jdField_try += 2;
    return i;
  }

  public final int jdMethod_byte()
  {
    int i = (this.jdField_do[(this.jdField_try + 3)] & 0xFF) + ((this.jdField_do[(this.jdField_try + 2)] & 0xFF) << 8) + ((this.jdField_do[(this.jdField_try + 1)] & 0xFF) << 16) + ((this.jdField_do[this.jdField_try] & 0xFF) << 24);
    this.jdField_try += 4;
    return i;
  }

  public final long jdMethod_char()
  {
    long l = (this.jdField_do[(this.jdField_try + 7)] & 0xFF) + ((this.jdField_do[(this.jdField_try + 6)] & 0xFF) << 8) + ((this.jdField_do[(this.jdField_try + 5)] & 0xFF) << 16) + ((this.jdField_do[(this.jdField_try + 4)] & 0xFF) << 24) + ((this.jdField_do[(this.jdField_try + 3)] & 0xFF) << 32) + ((this.jdField_do[(this.jdField_try + 2)] & 0xFF) << 40) + ((this.jdField_do[(this.jdField_try + 1)] & 0xFF) << 48) + ((this.jdField_do[this.jdField_try] & 0xFF) << 56);
    this.jdField_try += 8;
    return l;
  }

  public final byte[] jdMethod_int(int paramInt)
  {
    if ((paramInt == -1) || (this.jdField_try + paramInt > this.jdField_do.length))
      paramInt = this.jdField_do.length - this.jdField_try;
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(this.jdField_do, this.jdField_try, arrayOfByte, 0, paramInt);
    this.jdField_try += paramInt;
    return arrayOfByte;
  }

  public final String jdMethod_goto()
  {
    ac localac = this;
    int j = jdMethod_else();
    int i = localac.jdMethod_else();
    if ((i = (j | i) < 0 ? -1 : (j << 8) + i) == -1)
    {
      System.err.println("Error!! ByteArray: readUTF()");
      return "ERROR";
    }
    byte[] arrayOfByte = null;
    char[] arrayOfChar = null;
    arrayOfByte = jdMethod_int(i);
    if (i > arrayOfByte.length)
      return null;
    arrayOfChar = new char[i];
    int n = 0;
    int i1 = 0;
    while ((n < i) && ((this = arrayOfByte[n] & 0xFF) <= 127))
    {
      n++;
      arrayOfChar[(i1++)] = (char)this;
    }
    while (n < i)
    {
      int k;
      switch ((this = arrayOfByte[n] & 0xFF) >> 4)
      {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
        n++;
        arrayOfChar[(i1++)] = (char)this;
        break;
      case 12:
      case 13:
        n += 2;
        k = arrayOfByte[(n - 1)];
        arrayOfChar[(i1++)] = (char)((this & 0x1F) << 6 | k & 0x3F);
        break;
      case 14:
        n += 3;
        k = arrayOfByte[(n - 2)];
        int m = arrayOfByte[(n - 1)];
        arrayOfChar[(i1++)] = (char)((this & 0xF) << 12 | (k & 0x3F) << 6 | m & 0x3F);
        continue;
      case 8:
      case 9:
      case 10:
      case 11:
      }
    }
    return new String(arrayOfChar, 0, i1);
  }

  private void jdMethod_if(int paramInt)
  {
    if (this.jdField_try + paramInt >= this.jdField_do.length)
    {
      paramInt = new byte[this.jdField_do.length + paramInt * 2];
      System.arraycopy(this.jdField_do, 0, paramInt, 0, this.jdField_do.length);
      this.jdField_do = paramInt;
    }
  }

  private int jdMethod_else()
  {
    return this.jdField_do[(this.jdField_try++)] & 0xFF;
  }

  public final byte[] jdMethod_long()
  {
    if (this.jdField_try < this.jdField_do.length)
    {
      int i = this.jdField_try;
      this = 0;
      this = this;
      if ((i == -1) || (i + 0 > this.jdField_do.length))
        i = this.jdField_do.length;
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.jdField_do, 0, arrayOfByte, 0, i);
      return arrayOfByte;
    }
    return this.jdField_do;
  }

  public final int jdField_do()
  {
    return this.jdField_do.length;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     ac
 * JD-Core Version:    0.6.0
 */
import java.io.IOException;

public final class bh
{
  private static final int[] d = { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 99, 99 };
  private static final int[] e = { 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0 };
  private static final int[] jdField_long = { 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13 };
  private static final int[] jdField_try = { 1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577 };
  private static final int[] jdField_new = { 16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15 };
  private static int jdField_else;
  private static int jdField_if;
  private static int a;

  public static byte[] a(byte[] paramArrayOfByte)
    throws IOException
  {
    jdField_else = bh.jdField_if = bh.a = 0;
    if ((jdField_if(paramArrayOfByte, 16) != 35615) || (jdField_if(paramArrayOfByte, 8) != 8))
      throw new IOException("Invalid GZIP format");
    int i = jdField_if(paramArrayOfByte, 8);
    jdField_else += 6;
    if ((i & 0x4) != 0)
      jdField_else += jdField_if(paramArrayOfByte, 16);
    while (((i & 0x8) != 0) && (paramArrayOfByte[(jdField_else++)] != 0));
    while (((i & 0x10) != 0) && (paramArrayOfByte[(jdField_else++)] != 0));
    if ((i & 0x2) != 0)
      jdField_else += 2;
    i = jdField_else;
    jdField_else = paramArrayOfByte.length - 4;
    byte[] arrayOfByte1 = new byte[jdField_if(paramArrayOfByte, 16) | jdField_if(paramArrayOfByte, 16) << 16];
    int j = 0;
    jdField_else = i;
    i = 0;
    int k = 0;
    do
    {
      i = jdField_if(paramArrayOfByte, 1);
      if ((k = jdField_if(paramArrayOfByte, 2)) == 0)
      {
        a = 0;
        k = jdField_if(paramArrayOfByte, 16);
        jdField_if(paramArrayOfByte, 16);
        int m = 0;
        System.arraycopy(paramArrayOfByte, jdField_else, arrayOfByte1, j, k);
        jdField_else += k;
        j += k;
      }
      else
      {
        int i2;
        int i4;
        int[] arrayOfInt1;
        int[] arrayOfInt2;
        if (k == 2)
        {
          int n = jdField_if(paramArrayOfByte, 5) + 257;
          i2 = jdField_if(paramArrayOfByte, 5) + 1;
          i4 = jdField_if(paramArrayOfByte, 4) + 4;
          byte[] arrayOfByte4 = new byte[19];
          for (int i6 = 0; i6 < i4; i6++)
            arrayOfByte4[jdField_new[i6]] = (byte)jdField_if(paramArrayOfByte, 3);
          int[] arrayOfInt3 = a(arrayOfByte4, 18);
          arrayOfInt1 = a(a(paramArrayOfByte, arrayOfInt3, n), n - 1);
          arrayOfInt2 = a(a(paramArrayOfByte, arrayOfInt3, i2), i2 - 1);
        }
        else
        {
          byte[] arrayOfByte2 = new byte[288];
          for (i2 = 0; i2 < 144; i2++)
            arrayOfByte2[i2] = 8;
          for (i2 = 144; i2 < 256; i2++)
            arrayOfByte2[i2] = 9;
          for (i2 = 256; i2 < 280; i2++)
            arrayOfByte2[i2] = 7;
          for (i2 = 280; i2 < 288; i2++)
            arrayOfByte2[i2] = 8;
          arrayOfInt1 = a(arrayOfByte2, 287);
          byte[] arrayOfByte3 = new byte[32];
          for (i4 = 0; i4 < arrayOfByte3.length; i4++)
            arrayOfByte3[i4] = 5;
          arrayOfInt2 = a(arrayOfByte3, 31);
        }
        int i1 = 0;
        int i3 = 0;
        while ((i1 = a(paramArrayOfByte, arrayOfInt1)) != 256)
        {
          if (i1 > 256)
          {
            i1 -= 257;
            int i5 = e[i1];
            if ((i3 = d[i1]) > 0)
              i5 += jdField_if(paramArrayOfByte, i3);
            i1 = a(paramArrayOfByte, arrayOfInt2);
            int i7 = jdField_try[i1];
            if ((i4 = jdField_long[i1]) > 0)
              i7 += jdField_if(paramArrayOfByte, i4);
            i1 = j - i7;
            while (i7 < i5)
            {
              System.arraycopy(arrayOfByte1, i1, arrayOfByte1, j, i7);
              j += i7;
              i5 -= i7;
              i7 <<= 1;
            }
            System.arraycopy(arrayOfByte1, i1, arrayOfByte1, j, i5);
            j += i5;
            continue;
          }
          arrayOfByte1[(j++)] = (byte)i1;
        }
      }
    }
    while (i == 0);
    return arrayOfByte1;
  }

  private static int jdField_if(byte[] paramArrayOfByte, int paramInt)
  {
    int i = a == 0 ? (bh.jdField_if = paramArrayOfByte[(jdField_else++)] & 0xFF) : jdField_if >> a;
    for (int j = 8 - a; j < paramInt; j += 8)
    {
      jdField_if = paramArrayOfByte[(jdField_else++)] & 0xFF;
      i |= jdField_if << j;
    }
    a = a + paramInt & 0x7;
    return i & (1 << paramInt) - 1;
  }

  private static int a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    while (i >= 0)
    {
      if (a == 0)
        jdField_if = paramArrayOfByte[(jdField_else++)] & 0xFF;
      i = (jdField_if & 1 << a) == 0 ? paramArrayOfInt[(i >> 16)] : paramArrayOfInt[(i & 0xFFFF)];
      a = a + 1 & 0x7;
    }
    return i & 0xFFFF;
  }

  private static byte[] a(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    int j = 0;
    for (int k = 0; i < paramInt; k = j)
      if ((j = a(paramArrayOfByte, paramArrayOfInt)) >= 16)
      {
        int m = 0;
        if (j == 16)
        {
          m = 3 + jdField_if(paramArrayOfByte, 2);
          j = k;
        }
        else
        {
          if (j == 17)
            m = 3 + jdField_if(paramArrayOfByte, 3);
          else
            m = 11 + jdField_if(paramArrayOfByte, 7);
          j = 0;
        }
        while (m-- > 0)
          arrayOfByte[(i++)] = (byte)j;
      }
      else
      {
        arrayOfByte[(i++)] = (byte)j;
      }
    return arrayOfByte;
  }

  private static int[] a(byte[] paramArrayOfByte, int paramInt)
  {
    int[] arrayOfInt1 = new int[17];
    for (int j = 0; j < paramArrayOfByte.length; j++)
      arrayOfInt1[paramArrayOfByte[j]] += 1;
    j = 0;
    arrayOfInt1[0] = 0;
    int[] arrayOfInt2 = new int[17];
    for (int k = 1; k <= 16; k++)
    {
      int tmp64_63 = (j + arrayOfInt1[(k - 1)] << 1);
      j = tmp64_63;
      arrayOfInt2[k] = tmp64_63;
    }
    int[] arrayOfInt3 = new int[(paramInt << 1) + 16];
    int i = 1;
    for (int m = 0; m <= paramInt; m++)
    {
      int n;
      if ((n = paramArrayOfByte[m]) == 0)
        continue;
      int tmp108_106 = n;
      int[] tmp108_104 = arrayOfInt2;
      int tmp110_109 = tmp108_104[tmp108_106];
      tmp108_104[tmp108_106] = (tmp110_109 + 1);
      j = tmp110_109;
      int i1 = 0;
      n -= 1;
      while (n >= 0)
      {
        int i2;
        if ((i2 = j & 1 << n) == 0)
        {
          if ((i2 = arrayOfInt3[i1] >> 16) == 0)
          {
            arrayOfInt3[i1] |= i << 16;
            i1 = i++;
          }
          else
          {
            i1 = i2;
          }
        }
        else if ((i2 = arrayOfInt3[i1] & 0xFFFF) == 0)
        {
          arrayOfInt3[i1] |= i;
          i1 = i++;
        }
        else
        {
          i1 = i2;
        }
        n--;
      }
      arrayOfInt3[i1] = (0x80000000 | m);
    }
    return arrayOfInt3;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bh
 * JD-Core Version:    0.6.0
 */
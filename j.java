import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

public final class j
{
  private static int a(int paramInt1, int paramInt2)
  {
    while (paramInt2-- > 0)
      paramInt1 <<= 1;
    return paramInt1;
  }

  private static int a(int paramInt)
  {
    int i = 0;
    int j = paramInt - 1;
    while (j != 0)
    {
      i++;
      j >>= 1;
    }
    return i = paramInt == 1 ? 1 : i;
  }

  public static final Image jdMethod_if(byte[] paramArrayOfByte)
  {
    Object localObject1 = null;
    int i = 0;
    int j = 0;
    int k = 0;
    int[] arrayOfInt = null;
    byte[] arrayOfByte1 = 0;
    byte[] arrayOfByte3 = null;
    Object localObject2 = null;
    paramArrayOfByte = new ByteArrayInputStream(paramArrayOfByte);
    localObject2 = new DataInputStream(paramArrayOfByte);
    try
    {
      ((DataInputStream)localObject2).readInt();
      int n = 0;
      i = ((DataInputStream)localObject2).readInt();
      j = ((DataInputStream)localObject2).readInt();
      arrayOfInt = new int[k = ((DataInputStream)localObject2).readInt()];
      for (arrayOfByte4 = 0; arrayOfByte4 < k; arrayOfByte4++)
        arrayOfInt[arrayOfByte4] = ((DataInputStream)localObject2).readInt();
      arrayOfByte1 = ((DataInputStream)localObject2).readByte();
      arrayOfByte3 = new byte[arrayOfByte4 = ((DataInputStream)localObject2).readInt()];
      ((DataInputStream)localObject2).read(arrayOfByte3, 0, arrayOfByte3.length);
      ((DataInputStream)localObject2).close();
      paramArrayOfByte.close();
    }
    catch (Exception localException)
    {
    }
    int i1;
    localObject2 = new int[i1 = i * j];
    byte[] arrayOfByte4 = a(k);
    paramArrayOfByte = a(1, arrayOfByte4) - 1;
    int i2 = 0;
    int i3 = 0;
    switch (arrayOfByte1)
    {
    case 1:
      i3 = 0;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
      while (i3 < i1)
      {
        localObject2[i3] = arrayOfInt[(arrayOfByte3[i3] & 0xFF)];
        i3++;
        continue;
        while (i3 < i1)
        {
          localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] & 0x1)];
          if (i3 >= i1)
            break;
          localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 1 & 0x1)];
          if (i3 >= i1)
            break;
          localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 2 & 0x1)];
          if (i3 >= i1)
            break;
          localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 3 & 0x1)];
          if (i3 >= i1)
            break;
          localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 4 & 0x1)];
          if (i3 >= i1)
            break;
          localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 5 & 0x1)];
          if (i3 >= i1)
            break;
          localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 6 & 0x1)];
          if (i3 >= i1)
            break;
          localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 7 & 0x1)];
          i2++;
          continue;
          while (i3 < i1)
          {
            localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] & 0x3)];
            if (i3 >= i1)
              break;
            localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 2 & 0x3)];
            if (i3 >= i1)
              break;
            localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 4 & 0x3)];
            if (i3 >= i1)
              break;
            localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 6 & 0x3)];
            i2++;
            continue;
            while (i3 < i1)
            {
              localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] & 0x7)];
              if (i3 >= i1)
                break;
              localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 3 & 0x7)];
              if (i3 >= i1)
                break;
              i2++;
              localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 6 & 0x3 | arrayOfByte3[i2] << 2 & 0x4)];
              if (i3 >= i1)
                break;
              localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 1 & 0x7)];
              if (i3 >= i1)
                break;
              localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 4 & 0x7)];
              if (i3 >= i1)
                break;
              i2++;
              localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 7 & 0x1 | arrayOfByte3[i2] << 1 & 0x6)];
              if (i3 >= i1)
                break;
              localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 2 & 0x7)];
              if (i3 >= i1)
                break;
              localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 5 & 0x7)];
              i2++;
              continue;
              while (i3 < i1)
              {
                localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] & 0xF)];
                if (i3 < i1)
                  localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] >> 4 & 0xF)];
                i2++;
                continue;
                while (i3 < i1)
                {
                  arrayOfByte1 = arrayOfByte3[(i2++)] & 0xFF;
                  k = arrayOfInt[(arrayOfByte1 & paramArrayOfByte)];
                  byte[] arrayOfByte2;
                  arrayOfByte1 >>= arrayOfByte4;
                  while (arrayOfByte2-- > -1)
                    localObject2[(i3++)] = k;
                  continue;
                  while (i3 < i1)
                  {
                    arrayOfByte2 = 0;
                    if ((arrayOfByte2 = arrayOfByte3[(i2++)] & 0xFF) < k)
                    {
                      localObject2[(i3++)] = arrayOfInt[arrayOfByte2];
                      continue;
                    }
                    while (arrayOfByte2-- > -1)
                      localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] & 0xFF)];
                    i2++;
                    continue;
                    while (i3 < i1)
                    {
                      arrayOfByte2 = arrayOfByte3[(i2++)] & 0xFF;
                      k = arrayOfInt[(arrayOfByte3[(i2++)] & 0xFF)];
                      while (arrayOfByte2-- > -1)
                        localObject2[(i3++)] = k;
                      continue;
                      while (i2 < arrayOfByte3.length)
                      {
                        k = (arrayOfByte2 = arrayOfByte3[(i2++)] & 0xFF) >> 7;
                        arrayOfByte2 &= 127;
                        int m;
                        if (k == 0)
                        {
                          k = arrayOfInt[(arrayOfByte2 & paramArrayOfByte)];
                          arrayOfByte2 >>= arrayOfByte4;
                          while (m-- > -1)
                            localObject2[(i3++)] = k;
                          continue;
                        }
                        while (m-- > -1)
                          localObject2[(i3++)] = arrayOfInt[(arrayOfByte3[i2] & 0xFF)];
                        i2++;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    Image localImage;
    return (Image)(localImage = Image.createRGBImage(localObject2, i, j, true));
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     j
 * JD-Core Version:    0.6.0
 */
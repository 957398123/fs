import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public abstract class b5
{
  public static Vector Q = new Vector();
  public static Vector I = new Vector();
  public static Vector M = new Vector();
  public static byte X = 0;
  private static boolean C = false;
  private static Random P;
  private static short j;
  private static int[] m;
  public static int jdField_int;
  private static int[] h;
  public static byte[][] c;
  public static int p;
  public static int d;
  private static boolean E;
  private static String jdField_case;
  static int o;

  public static void jdField_case(String paramString)
  {
  }

  public static void a(int paramInt)
  {
  }

  public static byte[] a$1cf9d9ca(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = null;
    try
    {
      arrayOfByte = bh.a(paramArrayOfByte);
    }
    catch (Exception localException)
    {
      (paramArrayOfByte = localException).printStackTrace();
    }
    return arrayOfByte;
  }

  public static int jdMethod_new(int paramInt)
  {
    int i;
    return (i = P.nextInt() << 1 >>> 1) % paramInt;
  }

  public static final int a(int paramInt1, int paramInt2)
  {
    int i;
    return (i = P.nextInt() << 1 >>> 1) % (paramInt2 - paramInt1 + 1) + paramInt1;
  }

  private static byte[] a(boolean paramBoolean, byte[] paramArrayOfByte, String paramString)
  {
    byte[] arrayOfByte = null;
    if ((paramArrayOfByte == null) && (!paramBoolean))
      return null;
    if (!paramBoolean)
      try
      {
        RecordStore.deleteRecordStore(paramString);
      }
      catch (Exception localException1)
      {
      }
    try
    {
      RecordStore localRecordStore;
      if ((localRecordStore = RecordStore.openRecordStore(paramString, true)).getNumRecords() == 0)
      {
        if (!paramBoolean)
          localRecordStore.addRecord(paramArrayOfByte, 0, paramArrayOfByte.length);
      }
      else if (paramBoolean)
        arrayOfByte = localRecordStore.getRecord(1);
      else
        localRecordStore.setRecord(1, paramArrayOfByte, 0, paramArrayOfByte.length);
      localRecordStore.closeRecordStore();
    }
    catch (Exception localException2)
    {
    }
    return arrayOfByte;
  }

  static void jdMethod_if(byte[] paramArrayOfByte, String paramString)
  {
    a(false, paramArrayOfByte, paramString);
  }

  static void a(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte == null)
      return;
    Object localObject = null;
    ac localac = new ac();
    for (int i = 0; i < paramArrayOfByte.length; i++)
      localac.a(paramArrayOfByte[i]);
    byte[] arrayOfByte = localac.jdMethod_long();
    (paramArrayOfByte = localac).jdField_do = null;
    a(false, arrayOfByte, paramString);
  }

  static void a(int[] paramArrayOfInt, String paramString)
  {
    if (paramArrayOfInt == null)
      return;
    Object localObject = null;
    ac localac = new ac();
    for (int i = 0; i < paramArrayOfInt.length; i++)
      localac.jdMethod_do(paramArrayOfInt[i]);
    byte[] arrayOfByte = localac.jdMethod_long();
    (paramArrayOfInt = localac).jdField_do = null;
    a(false, arrayOfByte, paramString);
  }

  static void a(short[] paramArrayOfShort, String paramString)
  {
    Object localObject = null;
    ac localac = new ac();
    for (int i = 0; i < paramArrayOfShort.length; i++)
      localac.a(paramArrayOfShort[i]);
    byte[] arrayOfByte = localac.jdMethod_long();
    (paramArrayOfShort = localac).jdField_do = null;
    a(false, arrayOfByte, paramString);
  }

  static void a(String[] paramArrayOfString, String paramString)
  {
    if (paramArrayOfString == null)
      return;
    Object localObject = null;
    ac localac = new ac();
    for (int i = 0; i < paramArrayOfString.length; i++)
      localac.jdMethod_if(paramArrayOfString[i]);
    byte[] arrayOfByte = localac.jdMethod_long();
    (paramArrayOfString = localac).jdField_do = null;
    a(false, arrayOfByte, paramString);
  }

  static final byte[] jdMethod_byte(String paramString)
  {
    return a(true, null, paramString);
  }

  static final byte[] jdMethod_if(String paramString, int paramInt)
  {
    paramInt = new byte[1];
    if ((paramString = a(true, null, paramString)) == null)
      return null;
    paramString = new ac(paramString);
    for (int i = 0; i < 1; i++)
      paramInt[0] = paramString.jdMethod_if();
    return paramInt;
  }

  static final int[] jdField_int(String paramString, int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    if ((paramString = a(true, null, paramString)) == null)
      return null;
    paramString = new ac(paramString);
    for (int i = 0; i < paramInt; i++)
      arrayOfInt[i] = paramString.jdMethod_byte();
    return arrayOfInt;
  }

  static final short[] a(String paramString, int paramInt)
  {
    paramInt = new short[2];
    if ((paramString = a(true, null, paramString)) == null)
      return null;
    paramString = new ac(paramString);
    for (int i = 0; i < 2; i++)
      paramInt[i] = paramString.jdMethod_new();
    return paramInt;
  }

  static final String[] jdMethod_do(String paramString, int paramInt)
  {
    String[] arrayOfString = new String[paramInt];
    if ((paramString = a(true, null, paramString)) == null)
      return null;
    paramString = new ac(paramString);
    for (int i = 0; i < paramInt; i++)
      arrayOfString[i] = paramString.jdMethod_goto();
    return arrayOfString;
  }

  public static short[] jdMethod_for(String paramString, boolean paramBoolean)
  {
    paramBoolean = new short[0];
    try
    {
      paramString = int$3b9f0c8(paramString);
      int i;
      if ((i = (paramString = new DataInputStream(paramString)).readShort()) != j)
        String str1 = "Util.readPicFile() error: wrong version!";
      int k = paramString.readBoolean();
      int i1;
      paramBoolean = new short[(i1 = paramString.readShort()) << 2];
      if (k != 0)
        for (k = 0; k < i1 << 2; k++)
          paramBoolean[k] = paramString.readShort();
      else
        for (int n = 0; n < i1 << 2; n++)
          paramBoolean[n] = (short)(paramString.readByte() & 0xFF);
      paramString.close();
    }
    catch (Exception localException)
    {
      (paramString = localException).printStackTrace();
      String str2 = "Util.readPdatFile() exception!";
    }
    return paramBoolean;
  }

  public static short[][] a(String paramString, int paramInt, boolean paramBoolean)
  {
    paramInt = new short[0][0];
    try
    {
      paramString = int$3b9f0c8(paramString);
      if ((paramBoolean = (paramString = new DataInputStream(paramString)).readShort()) != j)
        paramBoolean = "Util.readFdatFile() error: wrong version!";
      paramBoolean = paramString.readBoolean();
      boolean bool;
      paramInt = new short[bool = paramString.readShort()][];
      int i = 0;
      if (paramBoolean)
        for (paramBoolean = false; paramBoolean < bool; paramBoolean++)
        {
          i = (short)(paramString.readByte() & 0xFF);
          paramInt[paramBoolean] = new short[i << 2];
          for (i = 0; i < paramInt[paramBoolean].length; i++)
            if (i == 0)
              paramInt[paramBoolean][i] = (short)paramString.readShort();
            else
              paramInt[paramBoolean][i] = paramString.readShort();
        }
      else
        for (paramBoolean = false; paramBoolean < bool; paramBoolean++)
        {
          i = (short)(paramString.readByte() & 0xFF);
          paramInt[paramBoolean] = new short[i << 2];
          for (i = 0; i < paramInt[paramBoolean].length; i += 4)
          {
            paramInt[paramBoolean][i] = (short)(paramString.readByte() & 0xFF);
            paramInt[paramBoolean][(i + 1)] = (short)paramString.readByte();
            paramInt[paramBoolean][(i + 2)] = (short)paramString.readByte();
            paramInt[paramBoolean][(i + 3)] = (short)paramString.readByte();
          }
        }
      paramString.close();
    }
    catch (Exception localException)
    {
      (paramString = localException).printStackTrace();
      paramBoolean = "Util.readFdatFile() exception!";
    }
    return paramInt;
  }

  public static short[][] jdMethod_if(String paramString, boolean paramBoolean)
  {
    paramBoolean = new short[0][0];
    try
    {
      paramString = int$3b9f0c8(paramString);
      int i;
      if ((i = (paramString = new DataInputStream(paramString)).readShort()) != j)
        String str1 = "Util.readMdatFile() error: wrong version!";
      int k = paramString.readBoolean();
      int n;
      paramBoolean = new short[n = paramString.readShort()][];
      int i1 = 0;
      if (k != 0)
        for (k = 0; k < n; k++)
        {
          i1 = (short)(paramString.readByte() & 0xFF);
          paramBoolean[k] = new short[i1];
          for (i1 = 0; i1 < paramBoolean[k].length; i1++)
            paramBoolean[k][i1] = paramString.readShort();
        }
      else
        for (k = 0; k < n; k++)
        {
          i1 = (short)(paramString.readByte() & 0xFF);
          paramBoolean[k] = new short[i1];
          for (i1 = 0; i1 < paramBoolean[k].length; i1++)
            paramBoolean[k][i1] = (short)(paramString.readByte() & 0xFF);
        }
      paramString.close();
    }
    catch (Exception localException)
    {
      (paramString = localException).printStackTrace();
      String str2 = "Util.readMdatFile() exception!";
    }
    return paramBoolean;
  }

  public static void a(Image paramImage, Graphics paramGraphics, short[] paramArrayOfShort1, short[] paramArrayOfShort2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i4 = 0;
    for (int i5 = 0; i5 < paramArrayOfShort1.length; i5 += 4)
    {
      int k = paramArrayOfShort1[(i5 + 1)];
      int i = paramArrayOfShort1[i5];
      if ((k & 0x1) != 0)
        continue;
      int n = (k & 0x8) >> 3;
      if ((k = (k = (k & 0x6) >> 1) + (n == 0 ? 0 : n + 1 << 1)) == 8)
        k = 4;
      else if (k == 9)
        k = 5;
      if (paramBoolean)
        if ((k == 0) || (k == 4))
          k = 4 - k;
        else
          k = 8 - k;
      i = (short)(i << 2);
      n = paramArrayOfShort2[i];
      int i1 = paramArrayOfShort2[(i + 1)];
      int i2 = paramArrayOfShort2[(i + 2)];
      int i3 = paramArrayOfShort2[(i + 3)];
      i = i2;
      switch (k)
      {
      case 0:
        i4 = 0;
        i = i2;
        break;
      case 1:
        i4 = 6;
        i = i3;
        break;
      case 2:
        i4 = 3;
        i = i2;
        break;
      case 3:
        i4 = 5;
        i = i3;
        break;
      case 4:
        i4 = 2;
        i = i2;
        break;
      case 5:
        i4 = 4;
        i = i3;
        break;
      case 6:
        i4 = 1;
        i = i2;
        break;
      case 7:
        i4 = 7;
        i = i3;
      }
      if (!paramBoolean)
        i = paramInt1 + paramArrayOfShort1[(i5 + 2)];
      else
        i = paramInt1 - (paramArrayOfShort1[(i5 + 2)] + i);
      k = paramInt2 + paramArrayOfShort1[(i5 + 3)];
      a(paramGraphics, paramImage, n, i1, i2, i3, i, k, i4);
    }
    paramGraphics.setClip(0, 0, a5.ic, a5.il);
  }

  public static String[] a(String paramString, int paramInt, Font paramFont)
  {
    if (paramInt == 0)
    {
      (localObject = new String[1])[0] = paramString;
      return localObject;
    }
    Object localObject = null;
    localObject = new String(paramString);
    paramString = 0;
    int i = 0;
    int k = 0;
    int n = ((String)localObject).length();
    Vector localVector = null;
    localVector = new Vector(paramFont.stringWidth((String)localObject) / paramInt, 4);
    char c1 = '\000';
    while (i < n)
    {
      c1 = '\000';
      while ((k < n) && ((c2 = ((String)localObject).charAt(k)) != '\n'))
      {
        String str = 0;
        str = paramFont.charWidth(c2);
        if (paramString + str > paramInt)
          break;
        paramString += str;
        k++;
      }
      char c2 = '\000';
      if (k < n)
        switch (((String)localObject).charAt(k))
        {
        case '\n':
          break;
        default:
          c2 = '\001';
          c1 = ((String)localObject).charAt(k);
        }
      localVector.addElement(k > i ? ((String)localObject).substring(i, k) : "");
      k++;
      i = k;
      if (c2 != 0)
      {
        i--;
        paramString = paramFont.charWidth(c1);
        continue;
      }
      paramString = 0;
    }
    String[] arrayOfString = new String[localVector.size()];
    for (i = 0; i < arrayOfString.length; i++)
      arrayOfString[i] = ((String)localVector.elementAt(i));
    return (String)arrayOfString;
  }

  public static short[][] a(String paramString, String[] paramArrayOfString, int paramInt, Font paramFont)
  {
    String str1 = null;
    str1 = new String(paramString + "  ");
    paramString = 0;
    int i = 0;
    int k = 0;
    int n = str1.length();
    Vector localVector = null;
    localVector = new Vector(paramFont.stringWidth(str1) / paramInt, 4);
    char c1 = '\000';
    int i1 = 1;
    int i2;
    short[][] arrayOfShort = new short[i2 = (short)paramArrayOfString.length][2];
    while (i < n)
    {
      c1 = '\000';
      while ((k < n) && ((c2 = str1.charAt(k)) != '\n'))
      {
        str2 = 0;
        str2 = paramFont.charWidth(c2);
        if (paramString + str2 > paramInt)
          break;
        paramString += str2;
        k++;
      }
      char c2 = '\000';
      if (k < n)
        switch (str1.charAt(k))
        {
        case '\n':
        case ' ':
          break;
        default:
          c2 = '\001';
          c1 = str1.charAt(k);
        }
      localVector.addElement(k > i ? str1.substring(i, k) : "");
      String str2 = k > i ? str1.substring(i, k) : "";
      for (paramString = 0; paramString < str2.length(); paramString++)
      {
        i = str2.charAt(paramString);
        for (int i3 = 0; i3 < i2; i3 = (short)(i3 + 1))
        {
          int i4 = paramArrayOfString[i3].charAt(0);
          if (i != i4)
            continue;
          arrayOfShort[i3][0] = (short)(paramString * a5.iA);
          arrayOfShort[i3][1] = i1;
        }
      }
      i1 = (short)(i1 + 1);
      k++;
      i = k;
      if (c2 != 0)
      {
        i--;
        paramString = paramFont.charWidth(c1);
        continue;
      }
      paramString = 0;
    }
    return arrayOfShort;
  }

  public static final int a(int paramInt, int[][] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int k = -1;
    for (int n = 0; n < i; n++)
    {
      if ((paramInt < paramArrayOfInt[n][0]) || (paramInt > paramArrayOfInt[n][1]))
        continue;
      k = n;
      break;
    }
    return k;
  }

  private static final byte[][] a(String paramString, String[] paramArrayOfString)
  {
    byte[][] arrayOfByte = new byte[paramArrayOfString.length][];
    int i = 0;
    try
    {
      paramString = new Object().getClass().getResourceAsStream(paramString);
      String str = (paramString = new DataInputStream(paramString)).readUTF();
      if (0 != str.compareTo("PKG0"))
        return null;
      int k;
      short[] arrayOfShort = new short[k = paramString.readInt()];
      String[] arrayOfString = new String[k];
      for (int n = 0; n < k; n++)
      {
        arrayOfString[n] = paramString.readUTF();
        arrayOfShort[n] = (short)paramString.readInt();
      }
      for (n = 0; n < k; n++)
      {
        for (int i1 = 0; (i1 < paramArrayOfString.length) && ((paramArrayOfString[i1] == null) || (paramArrayOfString[i1].compareTo(arrayOfString[n]) != 0)); i1++);
        if (i1 >= paramArrayOfString.length)
        {
          paramString.skip(arrayOfShort[n]);
        }
        else
        {
          arrayOfByte[i1] = new byte[arrayOfShort[n]];
          paramString.readFully(arrayOfByte[i1]);
        }
      }
      paramString.close();
    }
    catch (Exception localException)
    {
      (paramString = localException).printStackTrace();
    }
    return arrayOfByte;
  }

  private static byte[] a(String paramString1, String paramString2)
  {
    byte[] arrayOfByte = null;
    int i = 0;
    int n = 0;
    int i1 = -1;
    String str2 = null;
    try
    {
      paramString1 = new Object().getClass().getResourceAsStream(paramString1);
      String str1 = (paramString1 = new DataInputStream(paramString1)).readUTF();
      if (0 != str1.compareTo("PKG0"))
        return null;
      int k = paramString1.readInt();
      int i2 = 0;
      for (int i3 = 0; i3 < k; i3++)
      {
        str2 = paramString1.readUTF();
        n = paramString1.readInt();
        if (paramString2.compareTo(str2) == 0)
          i1 = n;
        if (i1 != -1)
          continue;
        i2 += n;
      }
      if (i1 == -1)
        return null;
      arrayOfByte = new byte[i1];
      paramString1.skip(i2);
      paramString1.readFully(arrayOfByte);
      paramString1.close();
    }
    catch (Exception localException)
    {
    }
    return arrayOfByte;
  }

  public static void jdMethod_try(String paramString)
  {
    if ((paramString == null) || (paramString.trim().equals("")))
      return;
    try
    {
      RecordStore.deleteRecordStore(paramString);
      return;
    }
    catch (RecordStoreNotFoundException localRecordStoreNotFoundException)
    {
      return;
    }
    catch (RecordStoreException localRecordStoreException)
    {
    }
  }

  public static boolean jdField_int(String paramString)
  {
    return ((paramString = paramString.trim().length()) >= 6) && (paramString <= 16);
  }

  public static String[] a(String paramString, int paramInt, char paramChar)
  {
    return a(paramString, paramInt, paramChar, true);
  }

  public static String[] a(String paramString, int paramInt, char paramChar, boolean paramBoolean)
  {
    int i = paramString.length();
    Vector localVector = new Vector();
    for (int k = 0; k < i; k++)
    {
      String str = "";
      for (int i1 = 0; i1 < paramInt; i1++)
      {
        char c1 = paramString.charAt(k);
        str = str + c1;
        if (k == i - 1)
        {
          localVector.addElement(str);
          break;
        }
        if (((c1 == '\n') && (paramBoolean)) || (c1 == paramChar))
        {
          localVector.addElement(str);
          break;
        }
        if (i1 == paramInt - 1)
        {
          if (paramBoolean)
            str = str + "\n";
          localVector.addElement(str);
          break;
        }
        k++;
      }
    }
    String[] arrayOfString = new String[localVector.size()];
    for (int n = 0; n < arrayOfString.length; n++)
      arrayOfString[n] = ((String)localVector.elementAt(n)).replace(paramChar, ' ').trim();
    return arrayOfString;
  }

  public static String[] a(String paramString, char paramChar)
  {
    int i = paramString.length();
    Vector localVector = new Vector();
    for (int k = 0; k < i; k++)
    {
      String str = "";
      for (int i1 = 0; i1 < i; i1++)
      {
        char c1 = paramString.charAt(k);
        str = str + c1;
        if (k == i - 1)
        {
          localVector.addElement(str);
          break;
        }
        if (c1 == paramChar)
        {
          localVector.addElement(str);
          break;
        }
        k++;
      }
    }
    String[] arrayOfString = new String[localVector.size()];
    for (int n = 0; n < arrayOfString.length; n++)
      arrayOfString[n] = ((String)localVector.elementAt(n)).replace(paramChar, ' ').trim();
    return arrayOfString;
  }

  public static final int[][][] a(int[][][] paramArrayOfInt1, int paramInt, int[][][] paramArrayOfInt2)
  {
    int k = paramArrayOfInt2.length;
    int i = paramInt;
    paramArrayOfInt1 = paramArrayOfInt1;
    int n = paramArrayOfInt1.length;
    int[][][] arrayOfInt = paramArrayOfInt1;
    paramArrayOfInt1 = new int[n + k][][];
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt1, 0, i);
    if (k > 0)
      System.arraycopy(arrayOfInt, i, paramArrayOfInt1, i + k, n - i);
    else
      System.arraycopy(arrayOfInt, i - k, paramArrayOfInt1, i, n + k - i);
    paramArrayOfInt1 = paramArrayOfInt1;
    System.arraycopy(paramArrayOfInt2, 0, paramArrayOfInt1, paramInt, paramArrayOfInt2.length);
    return paramArrayOfInt1;
  }

  private static int[][] a(int[][] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfInt.length;
    int[][] arrayOfInt = paramArrayOfInt;
    paramArrayOfInt = new int[i + paramInt2][];
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, paramInt1);
    if (paramInt2 > 0)
      System.arraycopy(arrayOfInt, paramInt1, paramArrayOfInt, paramInt1 + paramInt2, i - paramInt1);
    else
      System.arraycopy(arrayOfInt, paramInt1 - paramInt2, paramArrayOfInt, paramInt1, i + paramInt2 - paramInt1);
    return paramArrayOfInt;
  }

  public static final int[][] a(int[][] paramArrayOfInt, int paramInt, int[] paramArrayOfInt1)
  {
    (paramArrayOfInt = a(paramArrayOfInt, paramInt, 1))[paramInt] = paramArrayOfInt1;
    return paramArrayOfInt;
  }

  public static final int[][] a(int[][] paramArrayOfInt, int paramInt)
  {
    return paramArrayOfInt = a(paramArrayOfInt, 0, -1);
  }

  public static final short[][] a(short[][] paramArrayOfShort, short[] paramArrayOfShort1)
  {
    paramArrayOfShort = 1;
    int i = paramArrayOfShort.length;
    paramArrayOfShort = paramArrayOfShort;
    int k = paramArrayOfShort.length;
    short[][] arrayOfShort = paramArrayOfShort;
    paramArrayOfShort = new short[k + 1][];
    System.arraycopy(arrayOfShort, 0, paramArrayOfShort, 0, i);
    System.arraycopy(arrayOfShort, i, paramArrayOfShort, i + 1, k - i);
    paramArrayOfShort = paramArrayOfShort;
    paramArrayOfShort[(paramArrayOfShort.length - 1)] = paramArrayOfShort1;
    return paramArrayOfShort;
  }

  private static byte[][] a(byte[][] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte.length;
    byte[][] arrayOfByte = paramArrayOfByte;
    paramArrayOfByte = new byte[i + paramInt2][];
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, 0, paramInt1);
    if (paramInt2 > 0)
      System.arraycopy(arrayOfByte, paramInt1, paramArrayOfByte, paramInt1 + paramInt2, i - paramInt1);
    else
      System.arraycopy(arrayOfByte, paramInt1 - paramInt2, paramArrayOfByte, paramInt1, i + paramInt2 - paramInt1);
    return paramArrayOfByte;
  }

  public static final byte[][] a(byte[][] paramArrayOfByte, int paramInt, byte[] paramArrayOfByte1)
  {
    (paramArrayOfByte = a(paramArrayOfByte, paramInt, 1))[paramInt] = paramArrayOfByte1;
    return paramArrayOfByte;
  }

  public static final byte[][] a(byte[][] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte = a(paramArrayOfByte, 0, -1);
  }

  private static Object[] a(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfObject.length;
    Object[] arrayOfObject = paramArrayOfObject;
    paramArrayOfObject = new Object[i + paramInt2];
    System.arraycopy(arrayOfObject, 0, paramArrayOfObject, 0, paramInt1);
    if (paramInt2 > 0)
      System.arraycopy(arrayOfObject, paramInt1, paramArrayOfObject, paramInt1 + paramInt2, i - paramInt1);
    else
      System.arraycopy(arrayOfObject, paramInt1 - paramInt2, paramArrayOfObject, paramInt1, i + paramInt2 - paramInt1);
    return paramArrayOfObject;
  }

  public static final Object[] a(Object[] paramArrayOfObject, int paramInt, Object paramObject)
  {
    (paramArrayOfObject = a(paramArrayOfObject, 0, 1))[0] = paramObject;
    return paramArrayOfObject;
  }

  public static final Object[] a(Object[] paramArrayOfObject, int paramInt)
  {
    return paramArrayOfObject = a(paramArrayOfObject, paramInt, -1);
  }

  private static a4[] a(a4[] paramArrayOfa4, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfa4.length;
    a4[] arrayOfa4 = paramArrayOfa4;
    paramArrayOfa4 = new a4[i + paramInt2];
    System.arraycopy(arrayOfa4, 0, paramArrayOfa4, 0, paramInt1);
    if (paramInt2 > 0)
      System.arraycopy(arrayOfa4, paramInt1, paramArrayOfa4, paramInt1 + paramInt2, i - paramInt1);
    else
      System.arraycopy(arrayOfa4, paramInt1 - paramInt2, paramArrayOfa4, paramInt1, i + paramInt2 - paramInt1);
    return paramArrayOfa4;
  }

  public static final a4[] a(a4[] paramArrayOfa4, a4 parama4)
  {
    (paramArrayOfa4 = a(paramArrayOfa4, paramArrayOfa4.length, 1))[(paramArrayOfa4.length - 1)] = parama4;
    return paramArrayOfa4;
  }

  public static final a4[] a(a4[] paramArrayOfa4, int paramInt)
  {
    return paramArrayOfa4 = a(paramArrayOfa4, paramInt, -1);
  }

  public static final int jdMethod_if(a4[] paramArrayOfa4, a4 parama4)
  {
    for (int i = paramArrayOfa4.length - 1; i >= 0; i--)
      if (paramArrayOfa4[i].jdMethod_new() == parama4.jdMethod_new())
        return i;
    return -1;
  }

  private static String[] a(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfString.length;
    String[] arrayOfString = paramArrayOfString;
    paramArrayOfString = new String[i + paramInt2];
    System.arraycopy(arrayOfString, 0, paramArrayOfString, 0, paramInt1);
    if (paramInt2 > 0)
      System.arraycopy(arrayOfString, paramInt1, paramArrayOfString, paramInt1 + paramInt2, i - paramInt1);
    else
      System.arraycopy(arrayOfString, paramInt1 - paramInt2, paramArrayOfString, paramInt1, i + paramInt2 - paramInt1);
    return paramArrayOfString;
  }

  public static final String[] a(String[] paramArrayOfString, int paramInt, String paramString)
  {
    (paramArrayOfString = a(paramArrayOfString, paramInt, 1))[paramInt] = paramString;
    return paramArrayOfString;
  }

  public static final String[] a(String[] paramArrayOfString1, int paramInt, String[] paramArrayOfString2)
  {
    paramArrayOfString1 = a(paramArrayOfString1, paramInt, paramArrayOfString2.length);
    System.arraycopy(paramArrayOfString2, 0, paramArrayOfString1, paramInt, paramArrayOfString2.length);
    return paramArrayOfString1;
  }

  public static final String[] a(String[] paramArrayOfString, int paramInt)
  {
    return paramArrayOfString = a(paramArrayOfString, paramInt, -1);
  }

  private static int[] jdMethod_if(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfInt.length;
    int[] arrayOfInt = paramArrayOfInt;
    paramArrayOfInt = new int[i + paramInt2];
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, 0, paramInt1);
    if (paramInt2 > 0)
      System.arraycopy(arrayOfInt, paramInt1, paramArrayOfInt, paramInt1 + paramInt2, i - paramInt1);
    else
      System.arraycopy(arrayOfInt, paramInt1 - paramInt2, paramArrayOfInt, paramInt1, i + paramInt2 - paramInt1);
    return paramArrayOfInt;
  }

  public static final int[] a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    (paramArrayOfInt = jdMethod_if(paramArrayOfInt, paramInt1, 1))[paramInt1] = paramInt2;
    return paramArrayOfInt;
  }

  public static final int[] a(int[] paramArrayOfInt1, int paramInt, int[] paramArrayOfInt2)
  {
    paramArrayOfInt1 = jdMethod_if(paramArrayOfInt1, paramInt, paramArrayOfInt2.length);
    System.arraycopy(paramArrayOfInt2, 0, paramArrayOfInt1, paramInt, paramArrayOfInt2.length);
    return paramArrayOfInt1;
  }

  public static final int[] a(int[] paramArrayOfInt, int paramInt)
  {
    return paramArrayOfInt = jdMethod_if(paramArrayOfInt, paramInt, -1);
  }

  private static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte.length;
    byte[] arrayOfByte = paramArrayOfByte;
    paramArrayOfByte = new byte[i + paramInt2];
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, 0, paramInt1);
    if (paramInt2 > 0)
      System.arraycopy(arrayOfByte, paramInt1, paramArrayOfByte, paramInt1 + paramInt2, i - paramInt1);
    else
      System.arraycopy(arrayOfByte, paramInt1 - paramInt2, paramArrayOfByte, paramInt1, i + paramInt2 - paramInt1);
    return paramArrayOfByte;
  }

  public static final byte[] a(byte[] paramArrayOfByte, int paramInt, byte paramByte)
  {
    (paramArrayOfByte = a(paramArrayOfByte, paramInt, 1))[paramInt] = paramByte;
    return paramArrayOfByte;
  }

  public static final byte[] jdMethod_if(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte = a(paramArrayOfByte, paramInt, -1);
  }

  private static char[] a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfChar.length;
    char[] arrayOfChar = paramArrayOfChar;
    paramArrayOfChar = new char[i + paramInt2];
    System.arraycopy(arrayOfChar, 0, paramArrayOfChar, 0, paramInt1);
    if (paramInt2 > 0)
      System.arraycopy(arrayOfChar, paramInt1, paramArrayOfChar, paramInt1 + paramInt2, i - paramInt1);
    else
      System.arraycopy(arrayOfChar, paramInt1 - paramInt2, paramArrayOfChar, paramInt1, i + paramInt2 - paramInt1);
    return paramArrayOfChar;
  }

  public static final char[] a(char[] paramArrayOfChar1, int paramInt, char[] paramArrayOfChar2)
  {
    paramArrayOfChar1 = a(paramArrayOfChar1, paramInt, paramArrayOfChar2.length);
    System.arraycopy(paramArrayOfChar2, 0, paramArrayOfChar1, paramInt, paramArrayOfChar2.length);
    return paramArrayOfChar1;
  }

  public static final char[] jdMethod_if(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    return paramArrayOfChar = a(paramArrayOfChar, paramInt1, -paramInt2);
  }

  public static final Vector[] a(Vector[] paramArrayOfVector, int paramInt, Vector paramVector)
  {
    paramArrayOfVector = 1;
    int i = paramInt;
    paramArrayOfVector = paramArrayOfVector;
    int k = paramArrayOfVector.length;
    Vector[] arrayOfVector = paramArrayOfVector;
    paramArrayOfVector = new Vector[k + 1];
    System.arraycopy(arrayOfVector, 0, paramArrayOfVector, 0, i);
    System.arraycopy(arrayOfVector, i, paramArrayOfVector, i + 1, k - i);
    paramArrayOfVector = paramArrayOfVector;
    paramArrayOfVector[paramInt] = paramVector;
    return paramArrayOfVector;
  }

  public static final void jdMethod_byte()
  {
    try
    {
      byte[] arrayOfByte;
      if ((arrayOfByte = a(true, null, "setup")) == null)
        return;
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void jdMethod_do(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(paramInt4);
    paramInt1 = (paramInt1 - jdMethod_do(paramString)) / 2;
    paramGraphics.drawString(paramString, paramInt2 + paramInt1, paramInt3, 20);
  }

  public static int jdMethod_do(String paramString)
  {
    int i = 0;
    for (int k = 0; k < paramString.length(); k++)
      i += a5.fq.charWidth(paramString.charAt(k));
    return i;
  }

  public static int jdMethod_do(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = a5.dY.jdField_try;
    int k = 0;
    String str1 = String.valueOf(paramInt1);
    String str2 = String.valueOf(paramInt2);
    int i1 = 0;
    int i2 = String.valueOf(paramInt1).length();
    while (i1 < i2)
    {
      i3 = Byte.parseByte(String.valueOf(str1.charAt(i1)));
      a5.dY.jdMethod_if(paramGraphics, paramInt3 + (i + 1) * i1, paramInt4, i3);
      i1++;
    }
    i1 = (i + 1) * String.valueOf(paramInt1).length() + 1;
    a5.dY.jdMethod_if(paramGraphics, paramInt3 + i1, paramInt4, 10);
    i2 = 0;
    int i3 = String.valueOf(paramInt2).length();
    while (i2 < i3)
    {
      paramInt1 = Byte.parseByte(String.valueOf(str2.charAt(i2)));
      a5.dY.jdMethod_if(paramGraphics, paramInt3 + i1 + i + 2 + (i + 1) * i2, paramInt4, paramInt1);
      i2++;
    }
    int n;
    return n = i1 + i + 2 + (i + 1) * String.valueOf(paramInt2).length();
  }

  public static int[] jdMethod_do(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = new int[2];
    paramInt1 = (a5.dY.jdField_try + 1) * String.valueOf(paramInt1).length() + 1 + a5.dY.jdField_try + 2 + (a5.dY.jdField_try + 1) * String.valueOf(paramInt2).length();
    paramInt2 = a5.dY.a;
    arrayOfInt[0] = paramInt1;
    arrayOfInt[1] = paramInt2;
    return arrayOfInt;
  }

  public static void a(Graphics paramGraphics, short paramShort, int paramInt1, int paramInt2)
  {
    int i = a5.eR.jdField_try;
    if (paramShort < 10)
    {
      a5.eR.jdMethod_if(paramGraphics, paramInt1, paramInt2, 0);
      a5.eR.jdMethod_if(paramGraphics, paramInt1 + i + 2, paramInt2, paramShort);
      return;
    }
    int k = 0;
    int n = String.valueOf(paramShort).length();
    while (k < n)
    {
      int i1 = String.valueOf(paramShort).charAt(k);
      a5.eR.jdMethod_if(paramGraphics, paramInt1 + (i + 2) * k, paramInt2, i1 - 48);
      k++;
    }
  }

  public static void jdMethod_for(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt1 - paramInt2;
    paramInt1 += paramInt2;
    paramInt2 = a5.ge.getHeight() - 7;
    paramGraphics.setColor(m[paramInt4]);
    paramGraphics.fillTriangle(i - 8, paramInt3, i - 8 + 7, paramInt3, i - 8, paramInt3 + 7);
    paramGraphics.fillTriangle(paramInt1 + 1, paramInt3, paramInt1 + 1 + 7, paramInt3, paramInt1 + 1 + 7, paramInt3 + 7);
    paramGraphics.fillTriangle(i - 8, paramInt3 + paramInt2 - 1, i - 8, paramInt3 + paramInt2 + 7, i - 8 + 7, paramInt3 + paramInt2 + 7);
    paramGraphics.fillTriangle(paramInt1, paramInt3 + paramInt2 + 7, paramInt1 + 1 + 7, paramInt3 + paramInt2 + 7, paramInt1 + 1 + 7, paramInt3 + paramInt2 - 1);
  }

  public static void a(Graphics paramGraphics, long paramLong, int paramInt1, int paramInt2)
  {
    a(paramGraphics, a5.dY, paramLong, paramInt1, paramInt2);
  }

  public static void a(Graphics paramGraphics, bi parambi, long paramLong, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 163	bi:try	S
    //   4: istore 6
    //   6: lload_2
    //   7: lstore 7
    //   9: lload_2
    //   10: invokestatic 250	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   13: astore 9
    //   15: iconst_0
    //   16: istore 10
    //   18: aload 9
    //   20: iconst_0
    //   21: invokevirtual 239	java/lang/String:charAt	(I)C
    //   24: bipush 45
    //   26: if_icmpne +39 -> 65
    //   29: iload 6
    //   31: iconst_1
    //   32: iadd
    //   33: istore 10
    //   35: lload_2
    //   36: invokestatic 233	java/lang/Math:abs	(J)J
    //   39: dup2
    //   40: lstore 7
    //   42: invokestatic 250	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   45: astore 9
    //   47: aload_1
    //   48: aload_0
    //   49: iload 4
    //   51: iload 5
    //   53: aload_1
    //   54: getfield 162	bi:new	B
    //   57: iconst_1
    //   58: isub
    //   59: invokevirtual 219	bi:if	(Ljavax/microedition/lcdui/Graphics;III)V
    //   62: goto +6 -> 68
    //   65: iconst_0
    //   66: istore 10
    //   68: iconst_0
    //   69: istore_2
    //   70: lload 7
    //   72: invokestatic 250	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   75: invokevirtual 243	java/lang/String:length	()I
    //   78: istore_3
    //   79: iload_2
    //   80: iload_3
    //   81: if_icmpge +44 -> 125
    //   84: aload 9
    //   86: iload_2
    //   87: invokevirtual 239	java/lang/String:charAt	(I)C
    //   90: invokestatic 248	java/lang/String:valueOf	(C)Ljava/lang/String;
    //   93: invokestatic 230	java/lang/Byte:parseByte	(Ljava/lang/String;)B
    //   96: istore 7
    //   98: aload_1
    //   99: aload_0
    //   100: iload 4
    //   102: iload 10
    //   104: iadd
    //   105: iload 6
    //   107: iconst_1
    //   108: iadd
    //   109: iload_2
    //   110: imul
    //   111: iadd
    //   112: iload 5
    //   114: iload 7
    //   116: invokevirtual 219	bi:if	(Ljavax/microedition/lcdui/Graphics;III)V
    //   119: iinc 2 1
    //   122: goto -43 -> 79
    //   125: return
  }

  public static int[] a(long paramLong)
  {
    int[] arrayOfInt;
    (arrayOfInt = new int[2])[0] = ((a5.dY.jdField_try + 1) * String.valueOf(paramLong).length());
    arrayOfInt[1] = a5.dY.a;
    return arrayOfInt;
  }

  public static void for$505cff1c(String paramString)
  {
    paramString = paramString;
  }

  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramGraphics.setColor(paramInt5);
    paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static final void jdMethod_if(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramGraphics.setColor(paramInt5);
    paramGraphics.drawRect(paramInt1, paramInt2, paramInt3 - 1, paramInt4 - 1);
  }

  public static final void jdMethod_if(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(0);
    paramGraphics.drawString(paramString, paramInt1 + 1, paramInt2 + 1, 0);
    paramGraphics.setColor(paramInt3);
    paramGraphics.drawString(paramString, paramInt1, paramInt2, 0);
  }

  public static void jdField_int(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(h[(jdField_int % 5)]);
    paramGraphics.drawRect(paramInt1, paramInt2, paramInt3 - 1, paramInt4 - 1);
  }

  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(bm.bo);
    paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (a5.ht % 2 == 0)
      paramGraphics.setColor(paramInt3);
    else if (a5.ht % 2 == 1)
      paramGraphics.setColor(paramInt4);
    paramGraphics.drawString(paramString, paramInt1, paramInt2, 20);
  }

  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    paramGraphics.drawImage(a5.gA, paramInt1, paramInt2, 20);
  }

  public static String[] jdMethod_if(String paramString, int paramInt, Font paramFont)
  {
    int i = (paramString = paramString.toCharArray()).length;
    int[] arrayOfInt2 = new int[34];
    Font localFont = 0;
    StringBuffer localStringBuffer = new StringBuffer();
    Vector localVector = new Vector();
    for (int i2 = 0; i2 < i; i2++)
    {
      if (paramString[i2] != '\n')
        localVector.addElement(new Character(paramString[i2]));
      if (paramString[i2] == '$')
        continue;
      localStringBuffer.append(paramString[i2]);
    }
    i2 = 0;
    paramString = localVector.size();
    while (i2 < paramString)
    {
      if (localVector.elementAt(i2).toString().charAt(0) == '$')
      {
        arrayOfInt2[localFont] = i2;
        localFont++;
      }
      i2++;
    }
    String[] arrayOfString;
    c = new byte[i = (arrayOfString = a(localStringBuffer.toString(), paramInt, paramFont)).length][];
    paramString = new int[i][2];
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      paramFont = arrayOfString[paramInt].length();
      c[paramInt] = new byte[paramFont];
      if (paramInt == 0)
      {
        paramString[paramInt][0] = 0;
        paramString[paramInt][1] = (paramFont - 1);
      }
      else
      {
        paramString[paramInt][0] = (paramString[(paramInt - 1)][1] + 1);
        paramString[paramInt][1] = (paramString[paramInt][0] + paramFont - 1);
      }
    }
    paramInt = new Vector(4);
    if (localFont % 2 != 0)
      localFont--;
    for (paramFont = 0; paramFont < localFont; paramFont += 2)
    {
      arrayOfInt2[paramFont] -= paramFont;
      arrayOfInt2[(paramFont + 1)] -= paramFont + 1 + 1;
      int n = a(arrayOfInt2[paramFont], paramString);
      i1 = a(arrayOfInt2[(paramFont + 1)], paramString);
      if (n == i1)
      {
        int[] arrayOfInt3;
        (arrayOfInt3 = new int[3])[0] = n;
        arrayOfInt3[1] = (arrayOfInt2[paramFont] - paramString[n][0]);
        arrayOfInt3[2] = (arrayOfInt2[(paramFont + 1)] - paramString[n][0]);
        paramInt.addElement(arrayOfInt3);
      }
      else
      {
        if ((i3 = i1 - n) > 1)
          for (int i4 = n + 1; i4 < i1; i4++)
          {
            int[] arrayOfInt1;
            (arrayOfInt1 = new int[3])[0] = i4;
            arrayOfInt1[1] = 0;
            arrayOfInt1[2] = (arrayOfString[i4].length() - 1);
            paramInt.addElement(arrayOfInt1);
          }
        int[] arrayOfInt4;
        (arrayOfInt4 = new int[3])[0] = n;
        arrayOfInt4[1] = (arrayOfInt2[paramFont] - paramString[n][0]);
        arrayOfInt4[2] = (paramString[n][1] - paramString[n][0]);
        paramInt.addElement(arrayOfInt4);
        (arrayOfInt4 = new int[3])[0] = i1;
        arrayOfInt4[1] = 0;
        arrayOfInt4[2] = (arrayOfInt2[(paramFont + 1)] - paramString[i1][0]);
        paramInt.addElement(arrayOfInt4);
      }
    }
    int k;
    paramFont = new int[k = paramInt.size()][];
    Enumeration localEnumeration = paramInt.elements();
    for (int i1 = 0; localEnumeration.hasMoreElements(); i1++)
      paramFont[i1] = ((int[])(int[])localEnumeration.nextElement());
    for (int i3 = 0; i3 < k; i3++)
      for (int i5 = paramFont[i3][1]; i5 <= paramFont[i3][2]; i5++)
        c[paramFont[i3][0]][i5] = 1;
    return arrayOfString;
  }

  public static void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, byte paramByte1, byte paramByte2)
  {
    if (jdMethod_do(paramString) <= paramInt3)
    {
      paramGraphics.drawString(paramString, paramInt1, paramInt2, 20);
      return;
    }
    int i = paramGraphics.getClipX();
    int k = paramGraphics.getClipY();
    int n = paramGraphics.getClipWidth();
    int i1 = paramGraphics.getClipHeight();
    paramGraphics.setClip(paramInt1, paramInt2, paramInt3, a5.iG + 3);
    switch (paramByte1)
    {
    case 0:
      if ((paramByte1 = paramInt1 - paramByte2 * p) + jdMethod_do(paramString) < paramInt1)
        p = -(paramInt1 + paramInt3) / paramByte2 + 2;
      else if (d < 3)
        d += 1;
      else
        p += 1;
      paramGraphics.drawString(paramString, paramByte1, paramInt2, 20);
      break;
    case 1:
      if (E)
      {
        paramByte1 = paramInt1 - paramByte2 * p;
        paramGraphics.drawString(paramString, paramByte1, paramInt2, 20);
        p += 1;
        if (paramByte1 + jdMethod_do(paramString) < paramInt1 + paramInt3)
        {
          E = false;
          p = 0;
        }
      }
      else
      {
        paramByte1 = paramInt1 - (jdMethod_do(paramString) - paramInt3) + paramByte2 * p;
        paramGraphics.drawString(paramString, paramByte1, paramInt2, 20);
        p += 1;
        if (paramByte1 <= paramInt1)
          break;
        E = true;
        p = 0;
      }
    }
    paramGraphics.setClip(i, k, n, i1);
  }

  public static final void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3)
  {
    paramGraphics = 20;
    paramInt3 = paramInt3;
    paramInt2 = paramInt2;
    paramInt1 = paramInt1;
    paramImage = paramImage;
    paramGraphics = paramGraphics;
    if (paramInt3 == 0)
    {
      paramGraphics.drawImage(paramImage, paramInt1, paramInt2, 20);
      return;
    }
    paramGraphics.drawRegion(paramImage, 0, 0, paramImage.getWidth(), paramImage.getHeight(), paramInt3, paramInt1, paramInt2, 20);
  }

  public static final void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    a(paramGraphics, paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, 0);
  }

  public static final void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    try
    {
      paramGraphics.drawRegion(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt7, paramInt5, paramInt6, 20);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
  }

  public static Image a(String paramString)
  {
    return do$5170543f(paramString);
  }

  private static Image do$5170543f(String paramString)
  {
    try
    {
      return paramString = Image.createImage(paramString);
    }
    catch (IOException localIOException)
    {
      (paramString = localIOException).printStackTrace();
      paramString = "此图片加载异常！！";
    }
    return null;
  }

  public static final Image jdMethod_if(String paramString1, String paramString2)
  {
    try
    {
      return paramString1 = Image.createImage(paramString1 = a(paramString1, paramString2), 0, paramString1.length);
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static final Image[] jdMethod_if(String paramString, String[] paramArrayOfString)
  {
    try
    {
      localObject = new Image[paramArrayOfString.length];
      paramString = a(paramString, paramArrayOfString);
      for (paramArrayOfString = 0; paramArrayOfString < paramString.length; paramArrayOfString++)
      {
        if ((localObject[paramArrayOfString] != null) || (paramString[paramArrayOfString] == null))
          continue;
        localObject[paramArrayOfString] = Image.createImage(paramString[paramArrayOfString], 0, paramString[paramArrayOfString].length);
      }
      return localObject;
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
    }
    return (Image)null;
  }

  public static final Image[] a(Image[] paramArrayOfImage, String paramString, String[] paramArrayOfString)
  {
    try
    {
      int i = 0;
      paramString = a(paramString, paramArrayOfString);
      for (paramArrayOfString = 0; paramArrayOfString < paramString.length; paramArrayOfString++)
      {
        if ((paramArrayOfImage[paramArrayOfString] != null) || (paramString[paramArrayOfString] == null))
          continue;
        paramArrayOfImage[paramArrayOfString] = j.jdMethod_if(paramString[paramArrayOfString]);
      }
      return paramArrayOfImage;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
    return null;
  }

  public static final Image[] jdMethod_if(Image[] paramArrayOfImage, String paramString, String[] paramArrayOfString)
  {
    try
    {
      paramString = a(paramString, paramArrayOfString);
      for (paramArrayOfString = 0; paramArrayOfString < paramString.length; paramArrayOfString++)
      {
        if ((paramArrayOfImage[paramArrayOfString] != null) || (paramString[paramArrayOfString] == null))
          continue;
        paramArrayOfImage[paramArrayOfString] = j.jdMethod_if(paramString[paramArrayOfString]);
      }
      return paramArrayOfImage;
    }
    catch (Exception localException)
    {
      (paramString = localException).printStackTrace();
    }
    return null;
  }

  public static InputStream int$3b9f0c8(String paramString)
  {
    try
    {
      return paramString = new Object().getClass().getResourceAsStream(paramString);
    }
    catch (Exception localException)
    {
      (paramString = localException).printStackTrace();
    }
    return null;
  }

  public static void a(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    Object localObject = (ao)a5.es.cf().elementAt(0);
    localObject = new Form(((ao)localObject).aC());
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    ((Displayable)localObject).addCommand(localCommand1);
    ((Displayable)localObject).addCommand(localCommand2);
    TextField[] arrayOfTextField = new TextField[i];
    a9[] arrayOfa9 = new a9[i];
    int[] arrayOfInt = new int[i];
    for (int k = 0; k < i; k++)
    {
      arrayOfa9[k] = ((a9)a5.es.cf().elementAt(paramArrayOfInt[k]));
      arrayOfInt[k] = arrayOfa9[k].b2();
      int n = arrayOfa9[k].b9();
      String str1 = arrayOfa9[k].b8();
      String str2 = arrayOfa9[k].cc().toString();
      arrayOfTextField[k] = new TextField(str1, str2, n, 2);
      ((Form)localObject).append(arrayOfTextField[k]);
    }
    ((Displayable)localObject).setCommandListener(new CommandListener(localCommand1, i, arrayOfTextField, (Form)localObject, arrayOfa9, arrayOfInt, localCommand2)
    {
      private final Command val$okCmd;
      private final int val$widgetNum;
      private final TextField[] val$tf;
      private final Form val$form;
      private final a9[] val$textfield;
      private final int[] val$restrictLev;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        if (paramCommand == this.val$okCmd)
        {
          for (paramCommand = 0; paramCommand < this.val$widgetNum; paramCommand++)
          {
            if (((paramDisplayable = this.val$tf[paramCommand].getString()).equals("")) || (paramDisplayable == null))
            {
              paramDisplayable = new Alert(bm.a2[9], "请您输入内容！", null, AlertType.ERROR);
              this.val$tf[paramCommand].setString("");
              a5.dI.display.setCurrent(paramDisplayable, this.val$form);
              return;
            }
            if (paramDisplayable.length() > this.val$textfield[paramCommand].b9())
            {
              paramDisplayable = new Alert(bm.a2[9], "您输入的内容过长！", null, AlertType.ERROR);
              this.val$tf[paramCommand].setString("");
              a5.dI.display.setCurrent(paramDisplayable, this.val$form);
              return;
            }
            int i;
            if (this.val$restrictLev[paramCommand] == 1)
              for (paramDisplayable = 0; paramDisplayable < this.val$tf[paramCommand].getString().length(); paramDisplayable++)
              {
                if (((i = this.val$tf[paramCommand].getString().charAt(paramDisplayable)) >= '0') && (i <= 57))
                  continue;
                paramDisplayable = new Alert(bm.a2[9], "请您正确输入！", null, AlertType.ERROR);
                this.val$tf[paramCommand].setString("");
                a5.dI.display.setCurrent(paramDisplayable, this.val$form);
                return;
              }
            if (a5.es.g9 == 1638427)
            {
              i = (paramDisplayable = (ah)a5.es.cf().elementAt(4)).ag();
              if (Long.parseLong(this.val$tf[paramCommand].getString()) > i)
                this.val$textfield[paramCommand].a(new StringBuffer(String.valueOf(i)));
              else
                this.val$textfield[paramCommand].a(new StringBuffer(this.val$tf[paramCommand].getString()));
            }
            else
            {
              this.val$textfield[paramCommand].a(new StringBuffer(this.val$tf[paramCommand].getString()));
            }
          }
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent((Displayable)localObject);
  }

  public static final void a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, byte paramByte)
  {
    jdField_case = null;
    paramString1 = new Form(paramString1);
    paramString2 = new TextField(paramString2, "", paramInt1, 0);
    paramString1.append(paramString2);
    if ((a5.es.g9 == 1376260) && (!paramString3.equals("0")) && (!paramString3.equals("")) && (paramString3 != null))
      paramString2.setString(paramString3);
    else if ((a5.es.g9 != 1376260) && (paramString3 != null) && (!paramString3.equals("")))
      paramString2.setString(paramString3);
    paramInt1 = new Command(bm.a2[2], 4, 0);
    Command localCommand = new Command(bm.a2[1], 3, 1);
    paramString1.addCommand(paramInt1);
    paramString1.addCommand(localCommand);
    paramString1.setCommandListener(new CommandListener(paramInt2, paramInt1, paramString2, paramString1, paramByte, localCommand)
    {
      private final int val$number;
      private final Command val$okCmd;
      private final TextField val$tf;
      private final Form val$form;
      private final byte val$error;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = (a9)a5.es.cf().elementAt(this.val$number);
        ao localao = (ao)a5.es.cf().elementAt(1);
        if (paramCommand == this.val$okCmd)
        {
          b5.access$002(this.val$tf.getString());
          if (this.val$tf.getString().equals(""))
            b5.case.equals("");
          else
            b5.case.equals(this.val$tf.getString());
          if ((this.val$tf.getString().equals("")) || (this.val$tf.getString() == null))
          {
            paramCommand = new Alert(bm.a2[9], "请您输入内容！", null, AlertType.ERROR);
            this.val$tf.setString("");
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          if (!a5.a(this.val$tf.getString(), this.val$error))
          {
            paramCommand = new Alert(bm.a2[9], "您输入的内容不符合要求，请您重新输入！", null, AlertType.ERROR);
            this.val$tf.setString("");
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            b5.access$002(this.val$tf.getString());
            if (!b5.case.equals(""))
              b5.case.equals("");
            return;
          }
          if (this.val$error == 5)
          {
            if (((!this.val$tf.getString().trim().equals("DEL")) && (!this.val$tf.getString().trim().equals("del"))) || (this.val$tf.getString().trim().length() < 3))
            {
              paramCommand = new Alert(bm.a2[9], "请您正确输入！", null, AlertType.ERROR);
              this.val$tf.setString("");
              a5.dI.display.setCurrent(paramCommand, this.val$form);
              b5.access$002(this.val$tf.getString());
              if (!b5.case.equals(""))
                b5.case.equals("");
              return;
            }
          }
          else if (this.val$error == 6)
          {
            for (paramCommand = 0; paramCommand < this.val$tf.getString().length(); paramCommand++)
            {
              int i;
              if (((i = this.val$tf.getString().charAt(paramCommand)) >= '0') && (i <= 57))
                continue;
              paramCommand = new Alert(bm.a2[9], "请您正确输入！", null, AlertType.ERROR);
              this.val$tf.setString("");
              a5.dI.display.setCurrent(paramCommand, this.val$form);
              b5.access$002(this.val$tf.getString());
              if (!b5.case.equals(""))
                b5.case.equals("");
              return;
            }
            if ((paramCommand = Integer.parseInt(this.val$tf.getString().toString().trim())) > be.gG)
            {
              Alert localAlert = new Alert(bm.a2[9], "您输入的数目已经超过当前上限，请您重新输入！", null, AlertType.ERROR);
              this.val$tf.setString("");
              a5.dI.display.setCurrent(localAlert, this.val$form);
              b5.access$002(this.val$tf.getString());
              if (!b5.case.equals(""))
                b5.case.equals("");
              return;
            }
          }
          if (a5.jdMethod_else() == 19)
            b5.access$002(b5.jdMethod_for(b5.case));
          paramDisplayable.a(new StringBuffer(b5.case));
          if (a5.jdMethod_else() == 18)
          {
            a5.fY = b5.case;
            paramCommand = (ay)a5.es.cf().elementAt(7);
            if (paramDisplayable.q())
              localao.a("修改", 0);
            else if (paramCommand.q())
              localao.a("", 0);
            else
              localao.a("介绍", 0);
          }
          else if (a5.es.g9 == 1376260)
          {
            localao.a("修改", 0);
          }
          else
          {
            localao.a("确定", 0);
          }
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    if ((jdField_case != null) && (!jdField_case.equals("")))
      paramString3.equals(jdField_case);
    a5.dI.display.setCurrent(paramString1);
  }

  public static final void jdMethod_for(int paramInt1, int paramInt2)
  {
    paramInt1 = new Form("请输入账号及其密码");
    TextField localTextField1 = new TextField("请输入账号", "", 16, 0);
    TextField localTextField2 = new TextField("请输入密码", "", 16, 0);
    paramInt1.append(localTextField1);
    paramInt1.append(localTextField2);
    if ((a5.jdMethod_else() == 21) || (a5.jdMethod_else() == 22) || (a5.jdMethod_else() == 11))
    {
      localObject1 = (a9)a5.es.cf().elementAt(4);
      localObject2 = (a9)a5.es.cf().elementAt(paramInt2);
      if ((((a9)localObject1).cc().toString().trim() != null) && (!((a9)localObject1).cc().toString().trim().equals("")))
        localTextField1.setString(((a9)localObject1).cc().toString().trim());
      if ((((a9)localObject2).cc().toString().trim() != null) && (!((a9)localObject2).cc().toString().trim().equals("")))
        localTextField2.setString(((a9)localObject2).cc().toString().trim());
    }
    else
    {
      if ((a5.hC[0] != null) && (!a5.hC[0].equals("")))
        localTextField1.setString(a5.hC[0]);
      if ((a5.hC[1] != null) && (!a5.hC[1].equals("")))
        localTextField2.setString(a5.hC[1]);
    }
    Object localObject1 = new Command(bm.a2[2], 4, 0);
    Object localObject2 = new Command(bm.a2[1], 3, 1);
    paramInt1.addCommand((Command)localObject1);
    paramInt1.addCommand((Command)localObject2);
    paramInt1.setCommandListener(new CommandListener(4, paramInt2, (Command)localObject1, localTextField1, localTextField2, paramInt1, (Command)localObject2)
    {
      private final int val$number_1;
      private final int val$number_2;
      private final Command val$okCmd;
      private final TextField val$tf;
      private final TextField val$tf_1;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = (a9)a5.es.cf().elementAt(this.val$number_1);
        a9 locala9 = (a9)a5.es.cf().elementAt(this.val$number_2);
        ao localao = (ao)a5.es.cf().elementAt(1);
        if (paramCommand == this.val$okCmd)
        {
          if ((this.val$tf.getString().equals("")) || (this.val$tf.getString() == null) || (this.val$tf_1.getString().equals("")) || (this.val$tf_1.getString() == null))
          {
            paramCommand = new Alert(bm.a2[9], "请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          a5.hC[0] = this.val$tf.getString();
          a5.hC[1] = this.val$tf_1.getString();
          a5.hC[0] = b5.jdMethod_for(a5.hC[0]);
          a5.hC[1] = b5.jdMethod_for(a5.hC[1]);
          paramDisplayable.a(new StringBuffer(a5.hC[0]));
          locala9.a(new StringBuffer(a5.hC[1]));
          if (a5.jdMethod_else() == 11)
            localao.a("登录", 0);
          else
            localao.a("确定", 0);
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(paramInt1);
  }

  public static final void jdMethod_if(int paramInt)
  {
    paramInt = new Form("请输入兑换码");
    TextField localTextField = new TextField("请输入兑换码", "", 16, 0);
    paramInt.append(localTextField);
    if ((a5.jdMethod_else() != 21) && (a5.jdMethod_else() != 22) && (a5.jdMethod_else() != 23) && (a5.hC[0] != null) && (!a5.hC[0].equals("")))
      localTextField.setString(a5.hC[0]);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    paramInt.addCommand(localCommand1);
    paramInt.addCommand(localCommand2);
    paramInt.setCommandListener(new CommandListener(4, localCommand1, localTextField, paramInt, localCommand2)
    {
      private final int val$number_1;
      private final Command val$okCmd;
      private final TextField val$tf;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = (a9)a5.es.cf().elementAt(this.val$number_1);
        ao localao = (ao)a5.es.cf().elementAt(1);
        if (paramCommand == this.val$okCmd)
        {
          if ((this.val$tf.getString().equals("")) || (this.val$tf.getString() == null))
          {
            paramCommand = new Alert(bm.a2[9], "请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          a5.hC[0] = this.val$tf.getString();
          if (!a5.a(this.val$tf.getString(), 4))
          {
            paramCommand = new Alert(bm.a2[9], "您输入的账号不符合要求，请您重新输入！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          a5.hC[0] = b5.jdMethod_for(a5.hC[0]);
          paramDisplayable.a(new StringBuffer(a5.hC[0]));
          localao.a("确定", 0);
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(paramInt);
  }

  public static final void a()
  {
    Form localForm = new Form("请输入账号及其密码");
    TextField localTextField1 = new TextField("请输入账号", "", 16, 0);
    TextField localTextField2 = new TextField("请输入密码", "", 16, 0);
    localForm.append(localTextField1);
    localForm.append(localTextField2);
    if ((a5.hC[0] != null) && (!a5.hC[0].equals("")))
      localTextField1.setString(a5.hC[0]);
    if ((a5.hC[1] != null) && (!a5.hC[1].equals("")))
      localTextField2.setString(a5.hC[1]);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    localForm.addCommand(localCommand1);
    localForm.addCommand(localCommand2);
    localForm.setCommandListener(new CommandListener(localCommand1, localTextField1, localTextField2, localForm, localCommand2)
    {
      private final Command val$okCmd;
      private final TextField val$tf;
      private final TextField val$tf_1;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = (a9)a5.es.cf().elementAt(9);
        a9 locala9 = (a9)a5.es.cf().elementAt(10);
        ao localao = (ao)a5.es.cf().elementAt(1);
        if (paramCommand == this.val$okCmd)
        {
          if ((this.val$tf.getString().equals("")) || (this.val$tf.getString() == null) || (this.val$tf_1.getString().equals("")) || (this.val$tf_1.getString() == null))
          {
            paramCommand = new Alert(bm.a2[9], "请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          a5.hC[0] = this.val$tf.getString();
          a5.hC[1] = this.val$tf_1.getString();
          a5.hC[0] = b5.jdMethod_for(a5.hC[0]);
          a5.hC[1] = b5.jdMethod_for(a5.hC[1]);
          paramDisplayable.a(new StringBuffer(a5.hC[0]));
          locala9.a(new StringBuffer(a5.hC[1]));
          localao.a("确定", 0);
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(localForm);
  }

  public static final void jdMethod_if()
  {
    Form localForm = new Form("请输入账号及其密码");
    TextField localTextField1 = new TextField("请输入账号", "", 16, 0);
    TextField localTextField2 = new TextField("请输入原密码", "", 16, 0);
    TextField localTextField3 = new TextField("请输入新密码", "", 16, 0);
    TextField localTextField4 = new TextField("请输入确认密码", "", 16, 0);
    localForm.append(localTextField1);
    localForm.append(localTextField2);
    localForm.append(localTextField3);
    localForm.append(localTextField4);
    if ((a5.fc[0] != null) && (!a5.fc[0].equals("")))
      localTextField1.setString(a5.fc[0]);
    if ((a5.fc[1] != null) && (!a5.fc[1].equals("")))
      localTextField2.setString(a5.fc[1]);
    if ((a5.fc[2] != null) && (!a5.fc[2].equals("")))
      localTextField3.setString(a5.fc[2]);
    if ((a5.fc[3] != null) && (!a5.fc[3].equals("")))
      localTextField4.setString(a5.fc[3]);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    localForm.addCommand(localCommand1);
    localForm.addCommand(localCommand2);
    localForm.setCommandListener(new CommandListener(localCommand1, localTextField1, localTextField2, localTextField3, localTextField4, localForm, localCommand2)
    {
      private final Command val$okCmd;
      private final TextField val$tf;
      private final TextField val$tf_1;
      private final TextField val$tf_2;
      private final TextField val$tf_3;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = (a9)a5.es.cf().elementAt(10);
        a9 locala91 = (a9)a5.es.cf().elementAt(11);
        a9 locala92 = (a9)a5.es.cf().elementAt(12);
        a9 locala93 = (a9)a5.es.cf().elementAt(13);
        ao localao = (ao)a5.es.cf().elementAt(1);
        if (paramCommand == this.val$okCmd)
        {
          if ((this.val$tf.getString().equals("")) || (this.val$tf.getString() == null) || (this.val$tf_1.getString().equals("")) || (this.val$tf_1.getString() == null) || (this.val$tf_2.getString().equals("")) || (this.val$tf_2.getString() == null) || (this.val$tf_3.getString().equals("")) || (this.val$tf_3.getString() == null))
          {
            paramCommand = new Alert(bm.a2[9], "请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          a5.fc[0] = this.val$tf.getString().trim();
          a5.fc[1] = this.val$tf_1.getString().trim();
          a5.fc[2] = this.val$tf_2.getString().trim();
          a5.fc[3] = this.val$tf_3.getString().trim();
          if (!a5.fc[2].equals(a5.fc[3]))
          {
            paramCommand = new Alert(bm.a2[9], "确认密码输入有误，请您重新输入！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          a5.fc[0] = b5.jdMethod_for(a5.fc[0]);
          a5.fc[1] = b5.jdMethod_for(a5.fc[1]);
          a5.fc[2] = b5.jdMethod_for(a5.fc[2]);
          a5.fc[3] = b5.jdMethod_for(a5.fc[3]);
          paramDisplayable.a(new StringBuffer(a5.fc[0]));
          locala91.a(new StringBuffer(a5.fc[1]));
          locala92.a(new StringBuffer(a5.fc[2]));
          locala93.a(new StringBuffer(a5.fc[3]));
          localao.a("确定", 0);
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(localForm);
  }

  public static final void jdMethod_for()
  {
    Form localForm = new Form("请输入要操作的数字");
    TextField localTextField = new TextField("请输入数字", "", 9, 0);
    localForm.append(localTextField);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    localForm.addCommand(localCommand1);
    localForm.addCommand(localCommand2);
    localForm.setCommandListener(new CommandListener(localCommand1, localTextField, localForm, localCommand2)
    {
      private final Command val$okCmd;
      private final TextField val$tf;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = null;
        if (paramCommand == this.val$okCmd)
        {
          if ((this.val$tf.getString().equals("")) || (this.val$tf.getString() == null))
          {
            paramCommand = new Alert(bm.a2[9], "请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          paramDisplayable = this.val$tf.getString();
          paramCommand = 0;
          Command localCommand1 = paramDisplayable.length();
          char c;
          while (paramCommand < localCommand1)
          {
            if (((c = paramDisplayable.charAt(paramCommand)) < '0') || (c > '9'))
            {
              paramCommand = new Alert(bm.a2[9], "您输入的内容不符合要求，请您重新输入！", null, AlertType.ERROR);
              a5.dI.display.setCurrent(paramCommand, this.val$form);
              return;
            }
            paramCommand++;
          }
          a5.gQ.dJ = new StringBuffer();
          paramCommand = 0;
          Command localCommand2 = paramDisplayable.length();
          while (paramCommand < localCommand2)
          {
            c = paramDisplayable.charAt(paramCommand);
            a5.gQ.a(c);
            paramCommand++;
          }
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(localForm);
  }

  public static final void jdMethod_new()
  {
    Form localForm = new Form("请输入竞拍价格和一口价格");
    TextField localTextField1 = new TextField("请输入竞拍价", "", 9, 0);
    TextField localTextField2 = new TextField("请输入一口价", "", 9, 0);
    localForm.append(localTextField1);
    localForm.append(localTextField2);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    localForm.addCommand(localCommand1);
    localForm.addCommand(localCommand2);
    localForm.setCommandListener(new CommandListener(localCommand1, localTextField1, localTextField2, localForm, localCommand2)
    {
      private final Command val$okCmd;
      private final TextField val$tf;
      private final TextField val$tf1;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = (a9)a5.es.cf().elementAt(4);
        a9 locala9 = (a9)a5.es.cf().elementAt(5);
        String str1 = null;
        String str2 = null;
        if (paramCommand == this.val$okCmd)
        {
          if ((this.val$tf.getString().equals("")) || (this.val$tf.getString() == null) || (this.val$tf1.getString().equals("")) || (this.val$tf1.getString() == null))
          {
            paramCommand = new Alert(bm.a2[9], "内容不能为空，请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          str1 = this.val$tf.getString();
          str2 = this.val$tf1.getString();
          paramCommand = 0;
          Command localCommand1 = str1.length();
          int i;
          while (paramCommand < localCommand1)
          {
            if (((i = str1.charAt(paramCommand)) < '0') || (i > 57))
            {
              paramCommand = new Alert(bm.a2[9], "您输入的内容不符合要求，请您重新输入！", null, AlertType.ERROR);
              a5.dI.display.setCurrent(paramCommand, this.val$form);
              return;
            }
            paramCommand++;
          }
          paramCommand = 0;
          Command localCommand2 = str2.length();
          while (paramCommand < localCommand2)
          {
            if (((i = str2.charAt(paramCommand)) < '0') || (i > 57))
            {
              paramCommand = new Alert(bm.a2[9], "您输入的内容不符合要求，请您重新输入！", null, AlertType.ERROR);
              a5.dI.display.setCurrent(paramCommand, this.val$form);
              return;
            }
            paramCommand++;
          }
          if (str1.toString().trim().length() > 8)
            str1 = "99999998";
          if (str2.toString().trim().length() > 8)
            str2 = "99999999";
          paramDisplayable.a(new StringBuffer(str1));
          locala9.a(new StringBuffer(str2));
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(localForm);
  }

  public static final void jdMethod_try()
  {
    Form localForm = new Form("请输入发送短信的条数");
    TextField localTextField;
    (localTextField = new TextField("请输入数字", "", 1, 0)).setString("5");
    localForm.append(localTextField);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    localForm.addCommand(localCommand1);
    localForm.addCommand(localCommand2);
    localForm.setCommandListener(new CommandListener(localTextField, localCommand1, localForm, localCommand2)
    {
      private final TextField val$tf;
      private final Command val$okCmd;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = (a9)a5.es.cf().elementAt(4);
        String str = this.val$tf.getString();
        if (paramCommand == this.val$okCmd)
        {
          if ((str.equals("")) || (str == null))
          {
            paramCommand = new Alert(bm.a2[9], "内容不能为空，请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          paramCommand = 0;
          Command localCommand = str.length();
          while (paramCommand < localCommand)
          {
            int i;
            if (((i = str.charAt(paramCommand)) < '0') || (i > 57))
            {
              paramCommand = new Alert(bm.a2[9], "您输入的内容不符合要求，请您重新输入！", null, AlertType.ERROR);
              a5.dI.display.setCurrent(paramCommand, this.val$form);
              return;
            }
            paramCommand++;
          }
          if (Integer.parseInt(str) > 9)
          {
            paramCommand = new Alert(bm.a2[9], "您最多可以输入9条，请您重新输入！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          paramDisplayable.a(new StringBuffer(str));
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(localForm);
  }

  public static final void jdField_case()
  {
    Form localForm = new Form("请输入汇款金额");
    TextField localTextField = new TextField("请输入数字", "", 8, 0);
    localForm.append(localTextField);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    localForm.addCommand(localCommand1);
    localForm.addCommand(localCommand2);
    localForm.setCommandListener(new CommandListener(localTextField, localCommand1, localForm, localCommand2)
    {
      private final TextField val$tf;
      private final Command val$okCmd;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = (a9)a5.es.cf().elementAt(13);
        String str = this.val$tf.getString();
        if (paramCommand == this.val$okCmd)
        {
          while (str.startsWith("0"))
            str = str.substring(1);
          if ((str.equals("")) || (str == null))
          {
            paramDisplayable.a(new StringBuffer(Integer.toString(0)));
            q.q = false;
            q.jdMethod_if();
            a5.dI.display.setCurrent(a5.e8);
            return;
          }
          int i = 0;
          int j = str.length();
          while (i < j)
          {
            if (((paramCommand = str.charAt(i)) < '0') || (paramCommand > 57))
            {
              paramCommand = new Alert(bm.a2[9], "您输入的内容不符合要求，请您重新输入！", null, AlertType.ERROR);
              a5.dI.display.setCurrent(paramCommand, this.val$form);
              return;
            }
            i++;
          }
          long l;
          if ((l = Long.parseLong(str)) <= 0L)
          {
            paramDisplayable.a(new StringBuffer(Integer.toString(0)));
            return;
          }
          if (l + q.e >= q.void)
            if (a5.es.g9 != 1703937)
              if (a5.es.g9 != 1703952)
                break label291;
        }
      }
    });
    a5.dI.display.setCurrent(localForm);
  }

  public static final void jdMethod_try(int paramInt)
  {
    o = paramInt;
    paramInt = new Form("请输入代币金额");
    TextField localTextField = new TextField("请输入数字", "", 2, 0);
    paramInt.append(localTextField);
    Command localCommand1 = new Command(bm.a2[2], 4, 0);
    Command localCommand2 = new Command(bm.a2[1], 3, 1);
    paramInt.addCommand(localCommand1);
    paramInt.addCommand(localCommand2);
    paramInt.setCommandListener(new CommandListener(localTextField, localCommand1, paramInt, localCommand2)
    {
      private final TextField val$tf;
      private final Command val$okCmd;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        String str1 = (paramDisplayable = (a9)a5.es.cf().elementAt(24 + b5.o)).cc().toString();
        String str2 = this.val$tf.getString();
        if (paramCommand == this.val$okCmd)
        {
          while ((str2.startsWith("0")) && (str2.length() > 1))
            str2 = str2.substring(1);
          if ((str2.equals("")) || (str2 == null))
          {
            paramCommand = new Alert(bm.a2[9], "内容不能为空，请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          paramCommand = 0;
          Command localCommand = str2.length();
          while (paramCommand < localCommand)
          {
            int j;
            if (((j = str2.charAt(paramCommand)) < '0') || (j > 57))
            {
              paramCommand = new Alert(bm.a2[9], "您输入的内容不符合要求，请您重新输入！", null, AlertType.ERROR);
              a5.dI.display.setCurrent(paramCommand, this.val$form);
              return;
            }
            paramCommand++;
          }
          int i;
          if ((i = (i = (i = Integer.parseInt((paramCommand = (ah)a5.es.cf().elementAt(37)).aj())) + Integer.parseInt(str1)) - Integer.parseInt(str2)) < 0)
          {
            paramDisplayable.a(new StringBuffer("0"));
            as.a(0, "您的代币不足", "确定", "", -1, -2);
          }
          else
          {
            paramCommand.a("" + i);
            paramDisplayable.a(new StringBuffer(str2));
          }
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(paramInt);
  }

  public static final void jdMethod_if(int paramInt1, int paramInt2)
  {
    paramInt1 = new Form("请输入账号及其密码");
    paramInt2 = new TextField("请输入账号", "", 16, 0);
    TextField localTextField = new TextField("请输入密码", "", 16, 0);
    paramInt1.append(paramInt2);
    paramInt1.append(localTextField);
    Object localObject1 = (a9)a5.es.cf().elementAt(4);
    Object localObject2 = (a9)a5.es.cf().elementAt(6);
    if ((localObject1 != null) && (!localObject1.equals("")))
      paramInt2.setString(((a9)localObject1).cc().toString().trim());
    if ((localObject2 != null) && (!localObject2.equals("")))
      localTextField.setString(((a9)localObject2).cc().toString().trim());
    localObject1 = new Command(bm.a2[2], 4, 0);
    localObject2 = new Command(bm.a2[1], 3, 1);
    paramInt1.addCommand((Command)localObject1);
    paramInt1.addCommand((Command)localObject2);
    paramInt1.setCommandListener(new CommandListener(4, 6, (Command)localObject1, paramInt2, localTextField, paramInt1, (Command)localObject2)
    {
      private final int val$number_1;
      private final int val$number_2;
      private final Command val$okCmd;
      private final TextField val$tf;
      private final TextField val$tf_1;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = (a9)a5.es.cf().elementAt(this.val$number_1);
        a9 locala9 = (a9)a5.es.cf().elementAt(this.val$number_2);
        ao localao = (ao)a5.es.cf().elementAt(1);
        if (paramCommand == this.val$okCmd)
        {
          if ((this.val$tf.getString().equals("")) || (this.val$tf.getString() == null) || (this.val$tf_1.getString().equals("")) || (this.val$tf_1.getString() == null))
          {
            paramCommand = new Alert(bm.a2[9], "请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          paramDisplayable.a(new StringBuffer(this.val$tf.getString()));
          locala9.a(new StringBuffer(this.val$tf_1.getString()));
          localao.a("确定", 0);
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(paramInt1);
  }

  public static final void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    paramString1 = new Form(paramString1);
    paramString2 = new TextField(paramString2, "", 17, 0);
    paramString3 = new TextField(paramString3, "", 18, 0);
    paramString1.append(paramString2);
    paramString1.append(paramString3);
    Object localObject1 = (a9)a5.es.cf().elementAt(paramInt1);
    Object localObject2 = (a9)a5.es.cf().elementAt(paramInt2);
    if (localObject1 != null)
      paramString2.setString(((a9)localObject1).cc().toString().trim());
    if (localObject2 != null)
      paramString3.setString(((a9)localObject2).cc().toString().trim());
    localObject1 = new Command(bm.a2[2], 4, 0);
    localObject2 = new Command(bm.a2[1], 3, 1);
    paramString1.addCommand((Command)localObject1);
    paramString1.addCommand((Command)localObject2);
    paramString1.setCommandListener(new CommandListener(paramInt1, paramInt2, (Command)localObject1, paramString2, paramString3, paramString1, (Command)localObject2)
    {
      private final int val$number_1;
      private final int val$number_2;
      private final Command val$okCmd;
      private final TextField val$tf;
      private final TextField val$tf_1;
      private final Form val$form;
      private final Command val$exitCmd;

      public final void commandAction(Command paramCommand, Displayable paramDisplayable)
      {
        paramDisplayable = (a9)a5.es.cf().elementAt(this.val$number_1);
        a9 locala9 = (a9)a5.es.cf().elementAt(this.val$number_2);
        if (paramCommand == this.val$okCmd)
        {
          if ((this.val$tf.getString().equals("")) || (this.val$tf.getString() == null) || (this.val$tf_1.getString().equals("")) || (this.val$tf_1.getString() == null))
          {
            paramCommand = new Alert(bm.a2[9], "请您输入内容！", null, AlertType.ERROR);
            a5.dI.display.setCurrent(paramCommand, this.val$form);
            return;
          }
          paramDisplayable.a(new StringBuffer(this.val$tf.getString()));
          locala9.a(new StringBuffer(this.val$tf_1.getString()));
          a5.dI.display.setCurrent(a5.e8);
          return;
        }
        if (paramCommand == this.val$exitCmd)
        {
          this.val$form.removeCommand(this.val$okCmd);
          this.val$form.removeCommand(this.val$exitCmd);
          a5.e8.setFullScreenMode(true);
          a5.dI.display.setCurrent(a5.e8);
        }
      }
    });
    a5.dI.display.setCurrent(paramString1);
  }

  public static int jdField_int(int paramInt1, int paramInt2)
  {
    paramInt1 = 1;
    for (int i = 0; i < paramInt2; i++)
      paramInt1 <<= 1;
    return paramInt1;
  }

  public static void jdField_int()
  {
    for (int i = 0; i < Q.size(); i++)
    {
      a7 locala7;
      (locala7 = (a7)Q.elementAt(i)).h(false);
    }
  }

  public static String jdMethod_for(String paramString)
  {
    for (int i = 0; i < paramString.length(); i++)
    {
      char c1;
      if (((c1 = paramString.charAt(i)) < 'A') || (c1 > 'Z'))
        continue;
      char c2 = (char)(c1 + ' ');
      paramString = paramString.replace(c1, c2);
    }
    return paramString;
  }

  public static int a(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      return 0;
    int i = paramArrayOfString[0].length();
    for (int k = 1; k < paramArrayOfString.length; k++)
    {
      if (paramArrayOfString[k].length() <= i)
        continue;
      i = paramArrayOfString[k].length();
    }
    return i;
  }

  public static String a(String paramString1, String paramString2, String paramString3)
  {
    int i;
    if (((i = paramString1.indexOf(paramString2)) == -1) || (paramString3 == null))
      return paramString1;
    paramString2 = paramString1.indexOf(paramString2) + paramString2.length();
    StringBuffer localStringBuffer;
    (localStringBuffer = new StringBuffer()).append(paramString1.substring(0, i)).append(paramString3).append(paramString1.substring(paramString2, paramString1.length()));
    return localStringBuffer.toString();
  }

  public static int jdMethod_if(String paramString, char paramChar)
  {
    paramChar = '\000';
    paramString = paramString.toCharArray();
    for (int i = 0; i < paramString.length; i++)
    {
      if (paramString[i] != '$')
        continue;
      paramChar++;
    }
    return paramChar;
  }

  static
  {
    new short[] { 19, 20, 21, 22, 23 }[5] = 24;
    { "新游戏", "继续游戏", "调出记录", "游戏设置", "帮助说明", "关于", bm.a2[4], "天津猛犸科技\nwww.mammothworld.com\n", "游戏简介", "使用规则", "操作方法", "客服信息", "......1The implementation indicates its support for traversal internal to a CustomItem by setting one or both of the TRAVERSE_HORIZONTAL or TRAVERSE_VERTICAL bits in the value returned by getInteractionModes(). If neither of these bits is set, the implementation is unwilling to let CustomItems traverse internally, or the implementation does not support traversal at all. If the implementation does support traversal but has declined to permit traversal internal to CustomItems, the implementation will supply its own highlighting outside the CustomItem's content area.游戏简介具体内容", "......2使用规则具体内容", "......3操作方法具体内容", "......4客服信息具体内容", bm.a2[1], "声音", "请稍候...", "简体中文", "英文", "法文", "德文", "意大利文", "西班牙文", "开", "关", "按5键更改", "语言" }[29] = "返回主封面";
    P = new Random();
    j = 100;
    m = new int[] { 1479680, 1683200, 10289152, 15335424, 11499522, 11703296 };
    jdField_int = 0;
    h = new int[] { 16711680, 16711424, 65409, 31999, 8585471, 6045209 };
    p = 0;
    d = 0;
    E = true;
    new short[] { 0, 16384, 8192, 180, 16474, 270, 90 }[7] = 8282;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     b5
 * JD-Core Version:    0.6.0
 */
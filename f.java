import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.InputConnection;
import javax.microedition.io.OutputConnection;
import javax.microedition.io.SocketConnection;

public final class f
{
  private Random m = new Random();
  public static String f = "socket://218.206.77.164:30000";
  public static SocketConnection jdField_else = null;
  private DataInputStream jdField_goto = null;
  private DataOutputStream b = null;
  private Vector jdField_long = new Vector();
  private f.a d = null;
  private Vector jdField_case = new Vector();
  private byte jdField_void = -1;
  private static f k = null;
  public int[] jdField_int = new int[0];
  public boolean e = false;
  short jdField_try = 0;
  byte[] j = null;

  private f()
  {
    this.m.setSeed(System.currentTimeMillis());
  }

  public static f jdMethod_byte()
  {
    if (k == null)
      k = new f();
    return k;
  }

  private synchronized boolean jdMethod_new()
  {
    try
    {
      (f.jdField_else = (SocketConnection)Connector.open(f, 3, false)).setSocketOption(2, 0);
      jdField_else.setSocketOption(0, 10);
      jdField_else.setSocketOption(1, 5);
      this.jdField_goto = jdField_else.openDataInputStream();
      this.b = jdField_else.openDataOutputStream();
      this.d = new f.a();
    }
    catch (Exception localException)
    {
      if (this.jdField_long != null)
        this.jdField_long = new Vector();
      b5.jdField_case("first close KEmulator");
      localException.printStackTrace();
      a5.C();
      return false;
    }
    return true;
  }

  public final void jdMethod_for()
  {
    try
    {
      if (this.d != null)
      {
        f.a locala;
        (locala = this.d).a = null;
        this.d = null;
      }
      if (jdField_else != null)
      {
        jdField_else.close();
        jdField_else = null;
      }
      jdField_else = null;
      if (this.jdField_goto != null)
      {
        this.jdField_goto.close();
        this.jdField_goto = null;
      }
      if (this.b != null)
      {
        this.b.close();
        this.b = null;
      }
      this.jdField_void = -1;
      this.jdField_try = 0;
      this.j = null;
    }
    catch (Exception localException)
    {
    }
    if (((a5.jdField_else() == 11) && (a5.gQ != null)) || (a5.jdField_else() == 14) || ((a5.hQ == 1) && (a5.jdField_else() == 4)) || (a5.hY == 1))
    {
      a5.hG = true;
      b5.jdField_case("MainCanvas.isFullClose=" + a5.hG);
    }
  }

  public final void a(int[] paramArrayOfInt)
  {
    this.jdField_int = paramArrayOfInt;
    a5.fE.removeAllElements();
    if (this.jdField_int.length > 0)
    {
      jdMethod_if();
      this.e = true;
    }
  }

  public final void a(Vector paramVector)
  {
    paramVector = paramVector;
    this.jdField_int = new int[paramVector.size()];
    for (int i = 0; i < paramVector.size(); i++)
      this.jdField_int[i] = ((Integer)paramVector.elementAt(i)).intValue();
    a5.fE.removeAllElements();
    if (this.jdField_int.length > 0)
    {
      jdMethod_if();
      this.e = true;
    }
  }

  public final void jdMethod_if()
  {
    if (this.jdField_int.length > 0)
    {
      a(this.jdField_int[0]);
      this.jdField_int = b5.a(this.jdField_int, 0);
    }
  }

  // ERROR //
  public final void a(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: iload_1
    //   4: istore_2
    //   5: astore_1
    //   6: aconst_null
    //   7: astore_3
    //   8: iconst_0
    //   9: istore 4
    //   11: aconst_null
    //   12: astore 5
    //   14: invokestatic 53	a0:a	()La0;
    //   17: pop
    //   18: iload_2
    //   19: invokestatic 54	a0:a	(I)[B
    //   22: dup
    //   23: astore 5
    //   25: ifnull +13 -> 38
    //   28: aload 5
    //   30: dup
    //   31: astore_3
    //   32: arraylength
    //   33: iconst_4
    //   34: iadd
    //   35: i2s
    //   36: istore 4
    //   38: new 10	ac
    //   41: dup
    //   42: invokespecial 58	ac:<init>	()V
    //   45: astore_2
    //   46: iconst_0
    //   47: istore 6
    //   49: iconst_0
    //   50: istore 7
    //   52: iload 7
    //   54: aload 5
    //   56: arraylength
    //   57: if_icmpge +20 -> 77
    //   60: iload 6
    //   62: aload 5
    //   64: iload 7
    //   66: baload
    //   67: iadd
    //   68: i2b
    //   69: istore 6
    //   71: iinc 7 1
    //   74: goto -22 -> 52
    //   77: aload_2
    //   78: iload 6
    //   80: invokevirtual 60	ac:a	(B)V
    //   83: aload_3
    //   84: ifnull +8 -> 92
    //   87: aload_2
    //   88: aload_3
    //   89: invokevirtual 62	ac:if	([B)V
    //   92: new 10	ac
    //   95: dup
    //   96: invokespecial 58	ac:<init>	()V
    //   99: dup
    //   100: astore 7
    //   102: iload 4
    //   104: iconst_1
    //   105: iadd
    //   106: istore 4
    //   108: dup
    //   109: astore_3
    //   110: iload 4
    //   112: i2s
    //   113: invokevirtual 61	ac:a	(S)V
    //   116: aload 7
    //   118: bipush 65
    //   120: invokevirtual 60	ac:a	(B)V
    //   123: aload_1
    //   124: dup
    //   125: getfield 51	f:jdField_void	B
    //   128: iconst_1
    //   129: iadd
    //   130: i2b
    //   131: putfield 51	f:jdField_void	B
    //   134: aload 7
    //   136: aload_1
    //   137: getfield 51	f:jdField_void	B
    //   140: invokevirtual 60	ac:a	(B)V
    //   143: aload 7
    //   145: aload_2
    //   146: invokevirtual 63	ac:jdField_long	()[B
    //   149: aload_1
    //   150: getfield 46	f:j	[B
    //   153: aload_1
    //   154: getfield 51	f:jdField_void	B
    //   157: istore_1
    //   158: astore 4
    //   160: dup
    //   161: astore_3
    //   162: ifnonnull +7 -> 169
    //   165: aload_3
    //   166: goto +192 -> 358
    //   169: aload 4
    //   171: ifnonnull +7 -> 178
    //   174: aload_3
    //   175: goto +183 -> 358
    //   178: aload 4
    //   180: arraylength
    //   181: ifne +7 -> 188
    //   184: aload_3
    //   185: goto +173 -> 358
    //   188: aload_3
    //   189: arraylength
    //   190: newarray byte
    //   192: astore_2
    //   193: iload_1
    //   194: aload 4
    //   196: arraylength
    //   197: istore 5
    //   199: dup
    //   200: istore_1
    //   201: i2b
    //   202: sipush 256
    //   205: iadd
    //   206: iload 5
    //   208: iconst_1
    //   209: ishr
    //   210: irem
    //   211: iconst_1
    //   212: ishl
    //   213: istore_1
    //   214: iconst_0
    //   215: istore 5
    //   217: iload_1
    //   218: istore_1
    //   219: iload 5
    //   221: aload_3
    //   222: arraylength
    //   223: if_icmpge +134 -> 357
    //   226: iload_1
    //   227: aload 4
    //   229: arraylength
    //   230: if_icmplt +5 -> 235
    //   233: iconst_0
    //   234: istore_1
    //   235: aload 4
    //   237: iload_1
    //   238: baload
    //   239: lookupswitch	default:+93->332, 38:+60->299, 75:+41->280, 80:+79->318, 123:+93->332
    //   281: iload 5
    //   283: aload_3
    //   284: iload 5
    //   286: baload
    //   287: aload 4
    //   289: iload_1
    //   290: iconst_1
    //   291: iadd
    //   292: baload
    //   293: iadd
    //   294: i2b
    //   295: bastore
    //   296: goto +52 -> 348
    //   299: aload_2
    //   300: iload 5
    //   302: aload_3
    //   303: iload 5
    //   305: baload
    //   306: aload 4
    //   308: iload_1
    //   309: iconst_1
    //   310: iadd
    //   311: baload
    //   312: isub
    //   313: i2b
    //   314: bastore
    //   315: goto +33 -> 348
    //   318: aload_2
    //   319: iload 5
    //   321: aload_3
    //   322: iload 5
    //   324: baload
    //   325: iconst_m1
    //   326: ixor
    //   327: i2b
    //   328: bastore
    //   329: goto +19 -> 348
    //   332: aload_2
    //   333: iload 5
    //   335: aload_3
    //   336: iload 5
    //   338: baload
    //   339: aload 4
    //   341: iload_1
    //   342: iconst_1
    //   343: iadd
    //   344: baload
    //   345: ixor
    //   346: i2b
    //   347: bastore
    //   348: iinc 5 1
    //   351: iinc 1 2
    //   354: goto -135 -> 219
    //   357: aload_2
    //   358: invokevirtual 62	ac:if	([B)V
    //   361: aload 7
    //   363: invokevirtual 63	ac:jdField_long	()[B
    //   366: astore_2
    //   367: aload_0
    //   368: getfield 48	f:jdField_long	Ljava/util/Vector;
    //   371: aload_2
    //   372: invokevirtual 90	java/util/Vector:addElement	(Ljava/lang/Object;)V
    //   375: aload_0
    //   376: dup
    //   377: astore_1
    //   378: monitorenter
    //   379: getstatic 42	f:jdField_else	Ljavax/microedition/io/SocketConnection;
    //   382: ifnonnull +17 -> 399
    //   385: ldc 6
    //   387: invokestatic 65	b5:jdField_case	(Ljava/lang/String;)V
    //   390: aload_0
    //   391: invokespecial 71	f:new	()Z
    //   394: pop
    //   395: goto +4 -> 399
    //   398: pop
    //   399: aload_1
    //   400: monitorexit
    //   401: return
    //   402: astore_0
    //   403: aload_1
    //   404: monitorexit
    //   405: aload_0
    //   406: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   385	395	398	java/lang/Exception
    //   379	401	402	finally
    //   402	405	402	finally
  }

  public final void jdMethod_do()
  {
    if (this.jdField_case.size() > 0)
      while (this.jdField_case.size() != 0)
      {
        ac localac = new ac((byte[])(byte[])this.jdField_case.elementAt(0));
        a0.a();
        a0.a(localac);
        this.jdField_case.removeElementAt(0);
      }
  }

  private boolean a()
  {
    try
    {
      int i = 0;
      i = this.jdField_goto.readShort();
      while (i > 0)
      {
        byte[] arrayOfByte = new byte[i - 2];
        int i1 = 0;
        while (i1 - arrayOfByte.length != 0)
          i1 += this.jdField_goto.read(arrayOfByte, i1, arrayOfByte.length - i1);
        this.jdField_case.addElement(arrayOfByte);
        try
        {
          int n = this.jdField_goto.readShort();
        }
        catch (Exception localException2)
        {
          return true;
        }
      }
    }
    catch (Exception localException1)
    {
      b5.jdField_case("in receive info error!");
      if (a5.iB == 0)
      {
        bk.jdField_goto();
        a5.C();
      }
      localException1.printStackTrace();
      return false;
    }
    return true;
  }

  public final boolean jdMethod_char()
  {
    if (this.b == null)
      return true;
    try
    {
      if (this.jdField_long.size() != 0)
        while (this.jdField_long.size() != 0)
        {
          if ((localObject = (byte[])(byte[])this.jdField_long.elementAt(0)) != null)
          {
            this.b.write(localObject);
            a5.ix = 0;
          }
          this.jdField_long.removeElementAt(0);
        }
      a5.ix += 1;
      this.b.flush();
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
      return false;
    }
    return true;
  }

  public static String jdField_case()
  {
    if (jdField_else == null)
      return "";
    try
    {
      return jdField_else.getLocalAddress();
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  private class a
    implements Runnable
  {
    Thread a = new Thread(this);

    a()
    {
      this.a.start();
    }

    public final void run()
    {
      Thread localThread = Thread.currentThread();
      while (this.a == localThread)
        try
        {
          if (!f.this.a())
          {
            a locala = this;
            this.a = null;
          }
          synchronized (this)
          {
            wait(100L);
          }
          Thread.yield();
        }
        catch (Exception localException)
        {
          ( = localException).printStackTrace();
        }
      f.jdMethod_byte().jdMethod_for();
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     f
 * JD-Core Version:    0.6.0
 */
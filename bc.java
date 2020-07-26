import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.OutputConnection;
import javax.microedition.io.SocketConnection;

public final class bc
{
  private Random jdField_long = new Random();
  private static SocketConnection b = null;
  private DataOutputStream a = null;
  private bc.a jdField_int = null;
  private Vector jdField_try = new Vector();
  private String jdField_char;
  private String jdField_else;
  private String jdField_case;
  private static bc jdField_void = null;

  private bc()
  {
    this.jdField_long.setSeed(System.currentTimeMillis());
  }

  public static bc jdMethod_if()
  {
    if (jdField_void == null)
      jdField_void = new bc();
    return jdField_void;
  }

  private synchronized boolean jdMethod_new()
  {
    try
    {
      String str = "socket://" + this.jdField_char + ":" + this.jdField_else;
      System.out.println("url = " + str);
      (bc.b = (SocketConnection)Connector.open(str, 3, false)).setSocketOption(2, 0);
      b.setSocketOption(0, 10);
      b.setSocketOption(1, 5);
      this.a = b.openDataOutputStream();
      this.jdField_int = new bc.a();
    }
    catch (Exception localException)
    {
      if (this.jdField_try != null)
        this.jdField_try = new Vector();
      b5.jdField_case("first close KEmulator");
      localException.printStackTrace();
      return false;
    }
    return true;
  }

  public final void jdField_int()
  {
    try
    {
      if (this.jdField_int != null)
      {
        bc.a locala;
        (locala = this.jdField_int).a = null;
        this.jdField_int = null;
      }
      if (b != null)
      {
        b.close();
        b = null;
      }
      b = null;
      if (this.a != null)
      {
        this.a.close();
        this.a = null;
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void a(int arg1)
  {
    byte[] arrayOfByte = null;
    System.out.println("gi send " + ???);
    arrayOfByte = jdMethod_if(???);
    this.jdField_try.addElement(arrayOfByte);
    synchronized (this)
    {
      if (b == null)
        try
        {
          b5.jdField_case("socket_start");
          jdMethod_new();
        }
        catch (Exception localException)
        {
          (this = localException).printStackTrace();
        }
      return;
    }
  }

  public final boolean jdField_case()
  {
    if (this.a == null)
      return true;
    try
    {
      if (this.jdField_try.size() != 0)
        while (this.jdField_try.size() != 0)
        {
          if ((localObject = (byte[])(byte[])this.jdField_try.elementAt(0)) != null)
            this.a.write(localObject);
          this.jdField_try.removeElementAt(0);
        }
      this.a.flush();
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
      return false;
    }
    return true;
  }

  private static byte[] jdMethod_if(int paramInt)
  {
    ac localac = new ac();
    if (paramInt == 1)
    {
      paramInt = new byte[10];
      for (int i = 0; i < paramInt.length; i++)
      {
        bc tmp31_28 = a5.gD;
        bc localbc = tmp31_28;
        paramInt[i] = (byte)Integer.parseInt(tmp31_28.jdField_case);
      }
      localac.jdMethod_if(paramInt);
    }
    else
    {
      paramInt = a5.ik;
      byte[] arrayOfByte = new byte[10];
      for (int j = 0; j < arrayOfByte.length; j++)
        arrayOfByte[j] = 32;
      if ((j = paramInt.getBytes().length) < arrayOfByte.length)
        System.arraycopy(paramInt.getBytes(), 0, arrayOfByte, 0, j);
      else
        arrayOfByte = paramInt.getBytes();
      paramInt = "CMCCGAME_userId=" + new String(arrayOfByte);
      System.out.println("s = " + paramInt);
      localac.jdMethod_if(paramInt.getBytes());
    }
    return localac.jdField_long();
  }

  public final String a()
  {
    return this.jdField_char;
  }

  public final void a(String paramString)
  {
    this.jdField_char = paramString;
  }

  public final void jdMethod_do(String paramString)
  {
    this.jdField_else = paramString;
  }

  public final void jdMethod_if(String paramString)
  {
    this.jdField_case = paramString;
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
          if (!bc.this.jdMethod_case())
          {
            a locala1 = this;
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
          a locala2 = this;
          this.a = null;
          localException.printStackTrace();
        }
      bc.jdMethod_if().jdMethod_int();
    }
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     bc
 * JD-Core Version:    0.6.0
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Vector;

public final class e
{
  public static be a(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      return null;
    try
    {
      paramString = b5.int$3b9f0c8(paramString);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      int i = 0;
      while ((i = paramString.read()) != -1)
        localByteArrayOutputStream.write(i);
      paramString = null;
      paramString = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.close();
      return a(paramString, false);
    }
    catch (Exception localException)
    {
      (paramString = localException).printStackTrace();
    }
    return null;
  }

  public static be a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (bp.ag() != null)
    {
      bp.ag().jdMethod_if(false);
      be.hp = false;
    }
    try
    {
      return a(paramArrayOfByte = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte)), paramBoolean);
    }
    catch (Exception localException)
    {
      (paramArrayOfByte = localException).printStackTrace();
    }
    return null;
  }

  private static be a(DataInputStream paramDataInputStream, boolean paramBoolean)
  {
    System.currentTimeMillis();
    be localbe = null;
    int i = 0;
    try
    {
      if (paramBoolean)
      {
        i = paramDataInputStream.readInt() & 0xFFFFFFF;
        b5.jdMethod_case("************************************************* = " + Integer.toHexString(i));
      }
      if ((j = paramDataInputStream.readInt()) != 10461087)
      {
        b5.jdMethod_case("介四冒充的吧，小样！");
        paramDataInputStream.close();
        return null;
      }
      paramDataInputStream.readByte();
      int j = paramDataInputStream.readShort();
      short s1 = paramDataInputStream.readShort();
      paramDataInputStream.readByte();
      localbe = new be(0, 0, j, s1);
      if (paramBoolean)
        localbe.g9 = i;
      i = paramDataInputStream.readByte();
      b5.jdMethod_case("本界面共有 " + i + " 个控件");
      for (int k = 0; k < i; k++)
      {
        Object localObject1 = null;
        int m = paramDataInputStream.readByte();
        b5.jdMethod_case("第 " + (k + 1) + " 个UI界面类型 = " + m);
        Object localObject2;
        byte b3;
        int n;
        short s3;
        int i2;
        short s4;
        Object localObject4;
        short s2;
        Object localObject6;
        int i6;
        int i3;
        int i1;
        switch (m)
        {
        case 0:
          localObject2 = localbe;
          localObject1 = paramDataInputStream;
          byte b2 = paramDataInputStream.readByte();
          ao localao = new ao(b2, (be)localObject2);
          String str2;
          switch (b2)
          {
          case 0:
            b5.jdMethod_case("开始解析Title控件...");
            str2 = ((DataInputStream)localObject1).readUTF();
            b5.jdMethod_case("TEXTTEXTTEXTTEXT = " + str2);
            localao.jdMethod_do(str2);
            break;
          case 1:
            str2 = ((DataInputStream)localObject1).readUTF();
            String str3 = ((DataInputStream)localObject1).readUTF();
            localao.a(str2, 0);
            localao.a(str3, 1);
          }
          localObject1 = localObject2 = localao;
          localbe.jdMethod_if((ba)localObject2);
          String str1;
          switch (localbe.g9)
          {
          case 983056:
            str1 = "师德商店";
            ((ao)localObject2).jdMethod_do(str1);
            break;
          case 983057:
            str1 = "氏族商店";
            ((ao)localObject2).jdMethod_do(str1);
            break;
          case 983058:
            str1 = "族贡商店";
            ((ao)localObject2).jdMethod_do(str1);
          }
          break;
        case 1:
          localObject1 = localObject2 = jdMethod_do(paramDataInputStream, localbe);
          localbe.jdMethod_if((ba)localObject2);
          break;
        case 2:
          localObject2 = localbe;
          localObject1 = paramDataInputStream;
          b3 = paramDataInputStream.readByte();
          n = ((DataInputStream)localObject1).readShort();
          s3 = ((DataInputStream)localObject1).readShort();
          i2 = ((DataInputStream)localObject1).readShort();
          String str4 = ((DataInputStream)localObject1).readUTF();
          short s5 = ((DataInputStream)localObject1).readShort();
          String str5 = ((DataInputStream)localObject1).readUTF();
          (localObject2 = new a9(n, s3, i2, str4, b3, s5, (be)localObject2)).b(str5);
          localObject1 = localObject2 = localObject2;
          localbe.jdMethod_if((ba)localObject2);
          break;
        case 3:
          localObject1 = localObject2 = jdMethod_char(paramDataInputStream, localbe);
          localbe.jdMethod_if((ba)localObject2);
          break;
        case 4:
          localObject1 = localObject2 = jdMethod_int(paramDataInputStream, localbe);
          localbe.jdMethod_if((ba)localObject2);
          break;
        case 5:
          localObject2 = localbe;
          localObject1 = paramDataInputStream;
          b3 = paramDataInputStream.readByte();
          n = ((DataInputStream)localObject1).readShort();
          s3 = ((DataInputStream)localObject1).readShort();
          i2 = ((DataInputStream)localObject1).readShort();
          s4 = ((DataInputStream)localObject1).readShort();
          y localy = new y(n, s3, i2, s4, b3, (be)localObject2);
          Object localObject3;
          switch (b3)
          {
          case 0:
            break;
          case 1:
            short s7 = ((DataInputStream)localObject1).readShort();
            ((DataInputStream)localObject1).readShort();
            localObject3 = 0;
            ((DataInputStream)localObject1).readBoolean();
            ((DataInputStream)localObject1).readBoolean();
            localy.jdMethod_try(s7);
            localy.jdMethod_case(-1);
            break;
          case 2:
            Object localObject8 = ((DataInputStream)localObject1).readInt();
            localObject3 = ((DataInputStream)localObject1).readInt();
            localObject1 = localObject8;
            Object localObject5;
            (localObject5 = localy).T = localObject1;
            localObject1 = localObject3;
            (localObject5 = localy).F = localObject1;
          }
          localObject1 = localObject4 = localy;
          localbe.jdMethod_if((ba)localObject4);
          break;
        case 6:
          break;
        case 7:
          localObject1 = localObject4 = jdMethod_if(paramDataInputStream, localbe);
          localbe.jdMethod_if((ba)localObject4);
          break;
        case 8:
          localObject4 = localbe;
          localObject1 = paramDataInputStream;
          s2 = paramDataInputStream.readShort();
          n = ((DataInputStream)localObject1).readShort();
          localObject6 = ((DataInputStream)localObject1).readUTF();
          i2 = ((DataInputStream)localObject1).readShort();
          s4 = ((DataInputStream)localObject1).readShort();
          short s6 = ((DataInputStream)localObject1).readShort();
          i6 = ((DataInputStream)localObject1).readBoolean();
          (localObject4 = new r(s2, n, (String)localObject6, i2, s4, s6, 0, (be)localObject4)).q(i6);
          localObject1 = localObject4 = localObject4;
          localbe.jdMethod_if((ba)localObject4);
          break;
        case 9:
          localObject4 = localbe;
          localObject1 = paramDataInputStream;
          s2 = paramDataInputStream.readShort();
          n = ((DataInputStream)localObject1).readShort();
          localObject6 = new bj(s2, n, (be)localObject4);
          i2 = ((DataInputStream)localObject1).readShort();
          int i4;
          if ((i4 = ((DataInputStream)localObject1).readBoolean()))
            i3 = (short)(i2 * a5.ic / 176);
          else
            i3 = (short)(i3 * a5.il / 208);
          i6 = i3;
          Object localObject7;
          (localObject7 = localObject6).ii = i6;
          i6 = i4;
          (localObject7 = localObject6).il = i6;
          localObject1 = localObject4 = localObject6;
          localbe.jdMethod_if((ba)localObject4);
          break;
        case 10:
          localObject1 = localObject4 = jdMethod_byte(paramDataInputStream, localbe);
          localbe.jdMethod_if((ba)localObject4);
          break;
        case 11:
          localObject4 = localbe;
          localObject1 = paramDataInputStream;
          s2 = paramDataInputStream.readShort();
          n = ((DataInputStream)localObject1).readShort();
          i1 = ((DataInputStream)localObject1).readShort();
          i3 = ((DataInputStream)localObject1).readShort();
          byte b5 = ((DataInputStream)localObject1).readByte();
          ((DataInputStream)localObject1).readShort();
          ((DataInputStream)localObject1).readShort();
          ((DataInputStream)localObject1).readShort();
          int i5 = ((DataInputStream)localObject1).readInt();
          localObject1 = ((DataInputStream)localObject1).readUTF();
          ak localak;
          (localak = new ak(s2, n, i1, i3, (be)localObject4)).jdMethod_try(b5);
          localak.jdMethod_else(i5);
          localak.jdMethod_if((String)localObject1);
          localak.ap();
          localObject1 = localObject4 = localak;
          localbe.jdMethod_if((ba)localObject4);
          break;
        case 12:
          localObject1 = localObject4 = jdMethod_new(paramDataInputStream, localbe);
          localbe.jdMethod_if((ba)localObject4);
          break;
        case 99:
          localObject1 = localbe;
          localObject1 = localObject4 = new bd(0, 0, 0, 0, (be)localObject1);
          localbe.jdMethod_if((ba)localObject4);
        }
        if (localObject1 == null)
          continue;
        if (((ba)localObject1).u())
        {
          byte b1 = paramDataInputStream.readByte();
          byte b4 = paramDataInputStream.readByte();
          n = paramDataInputStream.readByte();
          i1 = paramDataInputStream.readByte();
          boolean bool2 = paramDataInputStream.readBoolean();
          ((ba)localObject1).a(0, b1);
          ((ba)localObject1).a(1, b4);
          ((ba)localObject1).a(2, n);
          ((ba)localObject1).a(3, i1);
          if (((localObject1 instanceof a7)) && (((ba)localObject1).jdMethod_char() == 0) && ((a5.df == 18) || (a5.df == 19) || (a5.eg == 1) || (a5.eg == 2)))
            ((ba)localObject1).a(false, localbe);
          else
            ((ba)localObject1).a(bool2, localbe);
        }
        boolean bool1 = paramDataInputStream.readBoolean();
        ((ba)localObject1).a(bool1);
      }
      paramDataInputStream.close();
      if (paramBoolean)
      {
        if (a5.eQ.e)
        {
          a5.fE.addElement(localbe);
          break label1553;
        }
        if (a5.dK != -1)
        {
          a5.fE.removeElementAt(a5.dK);
          a5.fE.insertElementAt(localbe, a5.dK);
        }
      }
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
    label1553: localbe.ck();
    return (be)(be)(be)(be)(be)(be)localbe;
  }

  static void a(be parambe, DataInputStream paramDataInputStream)
  {
    try
    {
      if (parambe != null)
      {
        b5.jdMethod_case("----进入部分更新解析方法----");
        int i = paramDataInputStream.readByte();
        if ((bo.q == 3) || (bo.q == 8))
          i = (byte)(i - 2);
        for (int j = 0; j < i; j++)
        {
          int k = paramDataInputStream.readByte();
          ba localba;
          Object localObject1;
          byte b2;
          byte b4;
          int i5;
          short s1;
          if ((((localba = (ba)parambe.cf().elementAt(k)) instanceof r)) && (localba.p() == 6))
          {
            localObject1 = (r)localba;
            b2 = paramDataInputStream.readByte();
            ((r)localObject1).l((short)b2);
            b4 = paramDataInputStream.readByte();
            for (byte b6 = 0; b6 < b4; b6++)
            {
              i5 = paramDataInputStream.readByte();
              b5.jdMethod_case("更新索引：" + i5);
              localObject1.mQ[i5] = paramDataInputStream.readInt();
              b5.jdMethod_case("ID：" + localObject1.mQ[i5]);
              s1 = paramDataInputStream.readShort();
              localObject1.mW[i5] = s1;
              localObject1.mI[i5] = r.k((short)(s1 % 1000));
              localObject1.nu[i5] = paramDataInputStream.readByte();
              b5.jdMethod_case("数量：" + localObject1.nu[i5]);
              localObject1.mV[i5] = paramDataInputStream.readUTF();
              b5.jdMethod_case("名称：" + localObject1.mV[i5]);
              localObject1.ne[i5] = paramDataInputStream.readByte();
              localObject1.mM[i5] = paramDataInputStream.readShort();
              localObject1.m5[i5] = paramDataInputStream.readBoolean();
              localObject1.nq[i5] = paramDataInputStream.readBoolean();
              localObject1.nD[i5] = paramDataInputStream.readByte();
              localObject1.mN[i5] = paramDataInputStream.readInt();
              localObject1.nm[i5] = paramDataInputStream.readByte();
              localObject1.mx[i5] = paramDataInputStream.readByte();
              localObject1.m4[i5] = paramDataInputStream.readBoolean();
              localObject1.mS[i5] = paramDataInputStream.readBoolean();
              localObject1.mZ[i5] = paramDataInputStream.readBoolean();
              if (localObject1.nm[i5] == 1)
                localObject1.nv[i5] = false;
              else
                localObject1.nv[i5] = true;
              ((r)localObject1).jdMethod_do(i5, s1);
              ((r)localObject1).jdMethod_if(localObject1.mV[localObject1.ep()], r.E(localObject1.ne[localObject1.ep()]));
            }
            if (a5.es.g9 == 939349)
            {
              bx.for = -1;
              bx.if = -1;
              bx.a = -1;
            }
            else if (a5.es.g9 == 2228256)
            {
              aj.a();
            }
            else if ((a5.es.g9 == 3342341) && (localObject1.mQ[localObject1.mz] == -1))
            {
              ao localao1;
              (localao1 = (ao)a5.es.cf().elementAt(1)).a("", 0);
            }
          }
          else
          {
            byte b7;
            if (((s1 instanceof r)) && ((s1.p() == 42) || (s1.p() == 53)))
            {
              localObject1 = (r)s1;
              b2 = paramDataInputStream.readByte();
              for (b4 = 0; b4 < b2; b4++)
              {
                b7 = paramDataInputStream.readByte();
                localObject1.mQ[b7] = paramDataInputStream.readInt();
                b5.jdMethod_case("--- stuffId[" + b7 + "] = " + localObject1.mQ[b7]);
                i5 = paramDataInputStream.readShort();
                localObject1.mW[b7] = i5;
                b5.jdMethod_case("--- imageFullID = " + i5);
                localObject1.mI[b7] = r.k((short)(i5 % 1000));
                localObject1.mN[b7] = paramDataInputStream.readInt();
                b5.jdMethod_case("--- grid.stuffPrice[" + b7 + "] = " + localObject1.mN[b7]);
                localObject1.nu[b7] = paramDataInputStream.readByte();
                b5.jdMethod_case("--- grid.stuffNumber[" + b7 + "] = " + localObject1.nu[b7]);
                localObject1.mV[b7] = paramDataInputStream.readUTF();
                b5.jdMethod_case("--- grid.stuffName[" + b7 + "] = " + localObject1.mV[b7]);
                localObject1.ne[b7] = paramDataInputStream.readByte();
                localObject1.nv[b7] = paramDataInputStream.readBoolean();
                b5.jdMethod_case("--- stuffShowMiniNum[" + b7 + "] = " + localObject1.nv[b7]);
                localObject1.nm[b7] = paramDataInputStream.readByte();
                b5.jdMethod_case("--- stuffMaxNum[" + b7 + "] = " + localObject1.nm[b7]);
                ((r)localObject1).jdMethod_do(b7, i5);
                if (s1.p() == 53)
                {
                  localObject1.mu[b7] = paramDataInputStream.readByte();
                  b5.jdMethod_case("--- stuffGroupNum[" + b7 + "] = " + localObject1.mu[b7]);
                }
                ((r)localObject1).jdMethod_if(localObject1.mV[localObject1.ep()], r.E(localObject1.ne[localObject1.ep()]));
              }
            }
            else if (((s1 instanceof r)) && (s1.p() == 29))
            {
              localObject1 = (r)s1;
              b2 = paramDataInputStream.readByte();
              ((r)localObject1).l((short)b2);
              b4 = paramDataInputStream.readByte();
              for (b7 = 0; b7 < b4; b7++)
              {
                i5 = paramDataInputStream.readByte();
                localObject1.mQ[i5] = paramDataInputStream.readInt();
                s1 = paramDataInputStream.readShort();
                localObject1.mW[i5] = s1;
                localObject1.mI[i5] = r.k((short)(s1 % 1000));
                localObject1.nu[i5] = paramDataInputStream.readByte();
                localObject1.mV[i5] = paramDataInputStream.readUTF();
                localObject1.nv[i5] = paramDataInputStream.readBoolean();
                localObject1.ne[i5] = paramDataInputStream.readByte();
                ((r)localObject1).jdMethod_do(i5, s1);
                localObject1.mZ[i5] = paramDataInputStream.readBoolean();
              }
            }
            else
            {
              int i3;
              Object localObject2;
              if (((s1 instanceof a7)) && (s1.p() == 16) && (s1.jdMethod_char() == 3))
              {
                localObject1 = (a7)s1;
                b2 = paramDataInputStream.readByte();
                b5.jdMethod_case("equipType = " + b2);
                i3 = paramDataInputStream.readShort();
                b5.jdMethod_case("equipPicID = " + i3);
                ((a7)localObject1).g(i3);
                localObject2 = paramDataInputStream.readUTF();
                b5.jdMethod_case("equipName = " + (String)localObject2);
                i5 = paramDataInputStream.readByte();
                b5.jdMethod_case("equipColorLevel = " + i5);
                s1 = (short)(i3 % 1000);
                ((a7)localObject1).fz = true;
                ((a7)localObject1).e(s1);
                ((a7)localObject1).a(a5.gg);
                ((a7)localObject1).jdMethod_else((String)localObject2);
                ((a7)localObject1).h(b2);
                ((a7)localObject1).l(i5);
              }
              else
              {
                int i9;
                if (((s1 instanceof a7)) && (s1.p() == 115) && (s1.jdMethod_char() == 3))
                {
                  localObject1 = (a7)s1;
                  b2 = paramDataInputStream.readByte();
                  b5.jdMethod_case("equipType = " + b2);
                  i3 = paramDataInputStream.readShort();
                  b5.jdMethod_case("equipPicID = " + i3);
                  ((a7)localObject1).g(i3);
                  localObject2 = paramDataInputStream.readUTF();
                  b5.jdMethod_case("equipName = " + (String)localObject2);
                  byte b9 = paramDataInputStream.readByte();
                  b5.jdMethod_case("equipColorLevel = " + b9);
                  s1 = paramDataInputStream.readShort();
                  short s3 = paramDataInputStream.readShort();
                  k = paramDataInputStream.readInt();
                  i9 = (short)(i3 % 1000);
                  ((a7)localObject1).fz = true;
                  ((a7)localObject1).e(i9);
                  ((a7)localObject1).a(a5.gg);
                  ((a7)localObject1).jdMethod_else((String)localObject2);
                  ((a7)localObject1).h(b2);
                  ((a7)localObject1).l(b9);
                  ((a7)localObject1).f(s1);
                  ((a7)localObject1).d(s3);
                  ((a7)localObject1).h(k);
                }
                else if (((s1 instanceof a7)) && (s1.p() == 5) && (s1.jdMethod_char() == 1))
                {
                  localObject1 = (a7)s1;
                  b2 = paramDataInputStream.readByte();
                  ((a7)localObject1).jdMethod_long(b2);
                  if (a5.es != null)
                    switch (a5.es.g9)
                    {
                    case 458760:
                      r.d6();
                    }
                }
                else
                {
                  int i1;
                  if (((s1 instanceof ah)) && (s1.p() == 4) && (s1.jdMethod_char() == 0))
                  {
                    localObject1 = (ah)s1;
                    i1 = paramDataInputStream.readInt();
                    ((ah)localObject1).a(i1 + "");
                  }
                  else if (((s1 instanceof ah)) && (s1.p() == 4) && (s1.jdMethod_char() == 3))
                  {
                    localObject1 = (ah)s1;
                    i1 = paramDataInputStream.readInt();
                    ((ah)localObject1).jdMethod_case(i1);
                  }
                  else if (((s1 instanceof ah)) && (s1.p() == 4) && (s1.jdMethod_char() == 4))
                  {
                    localObject1 = (ah)s1;
                    i1 = paramDataInputStream.readInt();
                    ((ah)localObject1).a(Integer.toString(i1));
                  }
                  else if (((s1 instanceof ah)) && (s1.jdMethod_char() == 2))
                  {
                    localObject1 = (ah)s1;
                    i1 = paramDataInputStream.readInt();
                    i3 = paramDataInputStream.readInt();
                    ((ah)localObject1).jdMethod_case(i1);
                    ((ah)localObject1).jdMethod_byte(i3);
                    if (a5.es.g9 == 2228225)
                      aj.for = (byte)i1;
                  }
                  else
                  {
                    short[] arrayOfShort;
                    int i6;
                    if ((s1.p() == 67) && ((s1 instanceof bg)))
                    {
                      localObject1 = null;
                      bg localbg;
                      (localbg = (bg)s1).a(null);
                      i3 = paramDataInputStream.readByte();
                      localObject2 = new ba[3];
                      v localv1;
                      arrayOfShort = (localv1 = (v)localbg.cD().elementAt(0)).jdMethod_case();
                      String str4 = null;
                      Object localObject5;
                      for (k = 0; k < (localObject5 = localv1).jdField_if.size(); k++)
                      {
                        v tmp2204_2202 = localv1;
                        localObject5 = tmp2204_2202;
                        localObject2[k] = ((ba)tmp2204_2202.jdField_if.elementAt(k));
                      }
                      k = (localObject5 = localv1).b;
                      localbg.cE();
                      for (i9 = 0; i9 < i3; i9++)
                      {
                        localObject1 = paramDataInputStream.readUTF();
                        i6 = paramDataInputStream.readShort();
                        str4 = paramDataInputStream.readUTF();
                        v localv2;
                        (localv2 = new v()).a(3);
                        short s5 = (short)(k + 6);
                        (localObject5 = localv2).b = s5;
                        localv2.a(arrayOfShort);
                        localv2.jdMethod_if((short)(localbg.v() + 3 + 1 + 1));
                        localv2.a((short)(localbg.jdMethod_long() + 1 + 1 + 1 + i9 * k));
                        for (int i10 = 0; i10 < 3; i10++)
                        {
                          Object localObject6 = null;
                          int i11 = (short)(localbg.v() + 3 + 1 + 1);
                          int i12 = (short)(localbg.jdMethod_long() + 1 + 1 + 1);
                          if (i10 == 0)
                          {
                            localObject6 = (ah)localObject2[i10];
                            (localObject6 = new ah(((ba)localObject6).v(), ((ba)localObject6).jdMethod_long(), ((ba)localObject6).jdMethod_for(), ((ba)localObject6).z(), ((ah)localObject6).jdMethod_char(), ((ah)localObject6).aj(), null)).a2 = true;
                            ((ah)localObject6).aN = (short)(arrayOfShort[i10] * a5.ic / 176);
                            ((ah)localObject6).a((String)localObject1);
                            ((ba)localObject6).jdMethod_new((short)(i11 + (localv2.jdMethod_if((byte)i10) + 1) * a5.ic / 176));
                            ((ba)localObject6).jdMethod_for((short)(i12 + i9 * k + (k - a5.iG) / 2));
                            localObject6 = localObject6;
                          }
                          else if (i10 == 1)
                          {
                            localObject6 = (a7)localObject2[i10];
                            localObject6 = new a7(((ba)localObject6).v(), ((ba)localObject6).jdMethod_long(), ((ba)localObject6).jdMethod_for(), ((ba)localObject6).z(), null, ((ba)localObject6).jdMethod_char(), null);
                            if (i6 != -1)
                            {
                              ((a7)localObject6).g(i6);
                              ((a7)localObject6).ft = true;
                              short s6 = (short)(i6 % 1000);
                              ((a7)localObject6).jdMethod_if(s6, true);
                            }
                            ((a7)localObject6).a(a5.gg);
                            ((ba)localObject6).jdMethod_new((short)(i11 + (localv2.jdMethod_if((byte)i10) + 1) * a5.ic / 176));
                            ((ba)localObject6).jdMethod_for((short)(i12 + i9 * k + (k - ((a7)localObject6).bE().a) / 2));
                            if (i6 == -1)
                              ((a7)localObject6).a(null);
                            localObject6 = localObject6;
                          }
                          else if (i10 == 2)
                          {
                            localObject6 = (ah)localObject2[i10];
                            (localObject6 = new ah(((ba)localObject6).v(), ((ba)localObject6).jdMethod_long(), ((ba)localObject6).jdMethod_for(), ((ba)localObject6).z(), ((ah)localObject6).jdMethod_char(), ((ah)localObject6).aj(), null)).a2 = true;
                            ((ah)localObject6).aN = (short)(arrayOfShort[i10] * a5.ic / 176);
                            ((ah)localObject6).a(str4);
                            ((ba)localObject6).jdMethod_new((short)(i11 + (localv2.jdMethod_if((byte)i10) + 1) * a5.ic / 176));
                            ((ba)localObject6).jdMethod_for((short)(i12 + i9 * k + (k - a5.iG) / 2));
                            localObject6 = localObject6;
                          }
                          else
                          {
                            b5.jdMethod_case("不正确的控件");
                          }
                          localv2.a((ba)localObject6);
                        }
                        localbg.jdMethod_if(localv2);
                      }
                      if (a5.es.g9 == 1966100)
                      {
                        localbg.h0 = 13;
                      }
                      else
                      {
                        localbg.h0 = 12;
                        au.case = 1;
                        ao localao2;
                        (localao2 = (ao)a5.es.cf().elementAt(1)).a("查看", 0);
                      }
                      localbg.cP();
                    }
                    else
                    {
                      String str3;
                      byte b8;
                      byte b1;
                      if (((arrayOfShort instanceof a7)) && ((arrayOfShort.p() == 34) || (arrayOfShort.p() == 35)))
                      {
                        localObject1 = (a7)arrayOfShort;
                        int i2 = paramDataInputStream.readShort();
                        b5.jdMethod_case("AAAAAAAAAAAAAAAAA wpID = " + i2);
                        str3 = paramDataInputStream.readUTF();
                        b5.jdMethod_case("BBBBBBBBBBBBBBBBB name = " + str3);
                        b8 = paramDataInputStream.readByte();
                        b5.jdMethod_case("CCCCCCCCCCCCCCCCC num = " + b8);
                        i6 = paramDataInputStream.readByte();
                        b1 = paramDataInputStream.readByte();
                        b5.jdMethod_case("DDDDDDDDDDDDDDDDD color = " + b1);
                        ((a7)localObject1).g(i2);
                        ((a7)localObject1).ft = true;
                        short s4 = (short)(i2 % 1000);
                        ((a7)localObject1).ft = true;
                        ((a7)localObject1).jdMethod_if(s4, true);
                        ((a7)localObject1).a(a5.gg);
                        ((a7)localObject1).jdMethod_else(str3);
                        ((a7)localObject1).h(i6);
                        ((a7)localObject1).l(b1);
                        if (b8 > 0)
                          ((a7)localObject1).a(true, b8);
                        else
                          ((a7)localObject1).g(false);
                        try
                        {
                          if ((((ba)localObject1).r == 35) && (((ba)localObject1).q()))
                          {
                            ah localah;
                            (localah = (ah)a5.es.cf().elementAt(17)).a(((a7)localObject1).bv());
                            be.hd = true;
                            be.hH = (byte)(j - 20);
                            localah.jdMethod_char(r.E(((a7)localObject1).bD()));
                          }
                        }
                        catch (Exception localException2)
                        {
                        }
                      }
                      else if (((b1 instanceof a7)) && ((b1.p() == 36) || (b1.p() == 37)))
                      {
                        localObject1 = (a7)b1;
                        boolean bool = paramDataInputStream.readBoolean();
                        str3 = null;
                        if (b1.p() == 36)
                        {
                          ((a7)localObject1).fg = 0;
                          a7.ej = bool;
                        }
                        else
                        {
                          ((a7)localObject1).fg = 3;
                          a7.em = bool;
                        }
                      }
                      else
                      {
                        byte b3;
                        byte b5;
                        int i7;
                        String str1;
                        int m;
                        if (((b1.p() == 83) || (b1.p() == 88) || (b1.p() == 95) || (b1.p() == 102) || (b1.p() == 107) || (b1.p() == 113)) && ((b1 instanceof bv)))
                        {
                          b5.jdMethod_case("fffffffffffffffffffff222222222ccccccccccccccccccc");
                          (localObject1 = (bv)b1).dy();
                          b3 = paramDataInputStream.readByte();
                          for (b5 = 0; b5 < b3; b5++)
                          {
                            b8 = paramDataInputStream.readByte();
                            i7 = paramDataInputStream.readInt();
                            str1 = paramDataInputStream.readUTF();
                            m localm = new m(str1, 1, 0, ((bv)localObject1).dF());
                            m = -1;
                            switch (b8)
                            {
                            case 0:
                              m = 6;
                              break;
                            case 1:
                              m = 7;
                              break;
                            case 2:
                              m = 5;
                              break;
                            case 3:
                              m = 8;
                            }
                            b5.jdMethod_case("锻造成功率：" + m);
                            localm.jdMethod_int(m);
                            localm.q = i7;
                            ((bv)localObject1).a(localm);
                          }
                        }
                        else if (((str1 instanceof r)) && ((str1.p() == 164) || (str1.p() == 167)))
                        {
                          localObject1 = (r)str1;
                          b3 = paramDataInputStream.readByte();
                          for (b5 = 0; b5 < b3; b5++)
                          {
                            b8 = paramDataInputStream.readByte();
                            i7 = paramDataInputStream.readShort();
                            localObject1.mW[b8] = i7;
                            localObject1.mI[b8] = r.k((short)(i7 % 1000));
                            localObject1.nu[b8] = paramDataInputStream.readByte();
                            localObject1.mV[b8] = paramDataInputStream.readUTF();
                            localObject1.ne[b8] = paramDataInputStream.readByte();
                            ((r)localObject1).jdMethod_do(b8, i7);
                            localObject1.mN[b8] = paramDataInputStream.readInt();
                          }
                          ((r)localObject1).jdMethod_if(localObject1.mV[localObject1.ep()], r.E(localObject1.ne[localObject1.ep()]));
                        }
                        else
                        {
                          int n;
                          int i8;
                          Object localObject3;
                          if (((str1 instanceof r)) && (str1.p() == 165))
                          {
                            localObject1 = (r)str1;
                            b3 = paramDataInputStream.readByte();
                            ((r)localObject1).l((short)b3);
                            b5 = paramDataInputStream.readByte();
                            for (b8 = 0; b8 < b5; b8++)
                            {
                              i7 = paramDataInputStream.readByte();
                              if ((n = paramDataInputStream.readByte()) == 1)
                              {
                                localObject1.mQ[i7] = paramDataInputStream.readInt();
                                i8 = paramDataInputStream.readShort();
                                localObject1.mW[i7] = i8;
                                localObject1.mI[i7] = r.k((short)(i8 % 1000));
                                ((r)localObject1).jdMethod_do(i7, i8);
                                localObject1.nu[i7] = paramDataInputStream.readByte();
                                localObject1.nv[i7] = true;
                                localObject1.mV[i7] = paramDataInputStream.readUTF();
                                localObject1.ne[i7] = paramDataInputStream.readByte();
                                localObject1.nq[i7] = paramDataInputStream.readBoolean();
                                localObject1.mN[i7] = paramDataInputStream.readInt();
                                localObject1.nm[i7] = paramDataInputStream.readByte();
                                if (localObject1.mQ[i7] != -1)
                                  localObject1.mV[i7] = (localObject1.mV[i7] + "单价" + localObject1.mN[i7] + "菜币");
                              }
                              else
                              {
                                localObject1.mQ[i7] = -1;
                                i8 = 0;
                                localObject1.mW[i7] = -1;
                                localObject1.mI[i7] = r.k(-1);
                                ((r)localObject1).jdMethod_do(i7, -1);
                                localObject1.nu[i7] = 0;
                                localObject1.nv[i7] = false;
                                localObject1.mV[i7] = "";
                                localObject1.ne[i7] = 0;
                                localObject1.nq[i7] = false;
                                localObject1.mN[i7] = 0;
                                localObject1.nm[i7] = 0;
                              }
                            }
                            localObject3 = (ao)a5.es.cf().elementAt(1);
                            if (localObject1.mQ[localObject1.ep()] != -1)
                              ((ao)localObject3).a("操作", 0);
                            else
                              ((ao)localObject3).a("整理", 0);
                            ((r)localObject1).jdMethod_if(localObject1.mV[localObject1.ep()], r.E(localObject1.ne[localObject1.ep()]));
                          }
                          else
                          {
                            Object localObject4;
                            if (((n instanceof bv)) && (n.p() == 170))
                            {
                              (localObject1 = (bv)n).dy();
                              b3 = paramDataInputStream.readByte();
                              for (b5 = 0; b5 < b3; b5++)
                              {
                                localObject3 = paramDataInputStream.readUTF();
                                (localObject4 = new m((String)localObject3, 0, 0, ((bv)localObject1).dF())).w = paramDataInputStream.readShort();
                                ((m)localObject4).jdField_else = paramDataInputStream.readShort();
                                ((bv)localObject1).a((m)localObject4);
                              }
                            }
                            else
                            {
                              int[] arrayOfInt;
                              if (((n instanceof a7)) && (n.p() == 175))
                              {
                                localObject1 = (a7)n;
                                b3 = paramDataInputStream.readByte();
                                ((a7)localObject1).jdMethod_goto(b3);
                                int i4 = paramDataInputStream.readInt();
                                ((a7)localObject1).a(false, 1);
                                ((a7)localObject1).fC = (byte)(i4 / 1000 - 1);
                                short s2 = (short)(i4 % 1000);
                                ((a7)localObject1).ft = true;
                                ((a7)localObject1).jdMethod_if(s2, false);
                                ((a7)localObject1).a(a5.gg);
                                localObject4 = (ak)a5.es.cf().elementAt(13);
                                arrayOfInt = new int[] { 3, 5, 7, 9, 11 };
                                for (i8 = 0; i8 < arrayOfInt.length; i8++)
                                {
                                  if (arrayOfInt[j] != m)
                                    continue;
                                  am.case[j] = paramDataInputStream.readUTF();
                                  ((ak)localObject4).jdMethod_if(am.case[j]);
                                }
                              }
                              else
                              {
                                if ((!(arrayOfInt instanceof ah)) || (arrayOfInt.p() != 1) || (arrayOfInt.jdMethod_char() != 0))
                                  continue;
                                localObject1 = (ah)arrayOfInt;
                                String str2 = paramDataInputStream.readUTF();
                                ((ah)localObject1).a(str2 + "");
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
          }
        }
      }
      else
      {
        b5.jdMethod_case("---当前界面为空，不能更新控件---");
        return;
      }
    }
    catch (Exception localException3)
    {
      Exception localException1;
      (localException1 = localException3).printStackTrace();
    }
  }

  public static void a(DataInputStream paramDataInputStream)
  {
    try
    {
      System.currentTimeMillis();
      long l = 0L;
      b5.jdMethod_case("enter in parseUIData");
      int i = paramDataInputStream.readInt();
      b5.jdMethod_case("fileHeader = " + i);
      if (i == 8289918)
      {
        i = paramDataInputStream.readByte();
        b5.jdMethod_case("用户数据控件数量 = " + i);
        be localbe1 = null;
        if (a5.fE.size() != 0)
        {
          if (a5.dK != -1)
            localbe1 = (be)a5.fE.elementAt(a5.dK);
          else
            localbe1 = (be)a5.fE.elementAt(a5.fE.size() - 1);
        }
        else
          localbe1 = a5.es;
        short[] arrayOfShort = new short[i];
        ba[] arrayOfba = new ba[i];
        for (int j = 0; j < i; j++)
        {
          int k = (byte)(paramDataInputStream.readByte() - 1);
          b5.jdMethod_case("----- " + k);
          if (localbe1 != null)
            b5.jdMethod_case("----- " + localbe1.cf().size());
          arrayOfShort[j] = paramDataInputStream.readShort();
          arrayOfba[j] = ((ba)localbe1.cf().elementAt(k));
          arrayOfba[j].jdMethod_int(arrayOfShort[j]);
        }
        for (j = 0; j < i; j++)
        {
          be localbe2 = localbe1;
          int m = localbe1.g9;
          ba localba = arrayOfba[j];
          short s = arrayOfShort[j];
          DataInputStream localDataInputStream = paramDataInputStream;
          b5.jdMethod_case("clientType = " + s);
          if ((localba instanceof bv))
          {
            a$571480af(localDataInputStream, s, (bv)localba);
          }
          else if ((localba instanceof ah))
          {
            a$470cfd82(localDataInputStream, s, (ah)localba, localbe2);
          }
          else if ((localba instanceof bg))
          {
            a(localDataInputStream, s, (bg)localba, m, localbe2);
          }
          else if ((localba instanceof a7))
          {
            a$1a0c41af(localDataInputStream, s, (a7)localba);
          }
          else if ((localba instanceof ak))
          {
            a$3da4a85(localDataInputStream, s, (ak)localba, m);
          }
          else if ((localba instanceof r))
          {
            a$7aebb325(localDataInputStream, s, (r)localba);
          }
          else
          {
            b5.jdMethod_case("！！！错误：没有相匹配的控件类型");
            b5.jdMethod_case("错误的clientType = " + s);
          }
        }
        a();
        jdMethod_if();
        jdMethod_for();
        paramDataInputStream.close();
      }
      else
      {
        b5.jdMethod_case("用户数据头不对！");
        return;
      }
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }

  private static void jdMethod_for()
  {
    int i = 0;
    int j = a5.es.cf().size();
    while (i < j)
    {
      if ((((ba)a5.es.cf().elementAt(i) instanceof a7)) && (((ba)a5.es.cf().elementAt(i)).jdMethod_char() == 1))
        a5.es.cf().elementAt(i);
      i++;
    }
  }

  private static void a()
  {
    int i = 0;
    int j = a5.es.cf().size();
    while (i < j)
    {
      if ((((ba)a5.es.cf().elementAt(i) instanceof a7)) && (((ba)a5.es.cf().elementAt(i)).jdMethod_char() == 3))
        a5.es.cf().elementAt(i);
      i++;
    }
  }

  private static void jdMethod_if()
  {
    r localr = null;
    int i = 0;
    int j = a5.es.cf().size();
    while (i < j)
    {
      if ((((ba)a5.es.cf().elementAt(i) instanceof r)) && ((localr = (r)a5.es.cf().elementAt(i)).p() == 6))
        switch (a5.es.g9)
        {
        case 458753:
        case 458754:
        case 458756:
        case 458757:
        case 458758:
        case 458759:
        case 458760:
        case 458775:
        case 3342341:
          localr.J(0);
          break;
        case 983041:
        case 983042:
        case 983043:
        case 983044:
        case 983045:
        case 983046:
        case 983047:
        case 983048:
        case 983049:
        case 983056:
        case 983057:
        case 983058:
          localr.J(1);
          break;
        case 1179649:
        case 1179650:
        case 1179651:
        case 1179652:
        case 1179653:
        case 1179654:
        case 1638423:
          localr.J(2);
          break;
        case 1245185:
        case 1245186:
          localr.J(3);
          break;
        case 1376260:
        case 1376263:
        case 1376269:
          localr.J(4);
          break;
        case 1703946:
          localr.J(5);
          break;
        case 1900547:
          localr.J(7);
          break;
        case 1769473:
        case 1769475:
        case 1769478:
        case 1769479:
        case 1769480:
        case 1769488:
        case 1769489:
        case 1769490:
        case 1769491:
        case 1769492:
          localr.J(6);
          break;
        case 458755:
        case 917505:
        case 917506:
        case 917508:
        case 917509:
        case 917510:
        case 917511:
          localr.J(8);
          break;
        case 1179658:
          localr.J(9);
          break;
        case 1966086:
          localr.J(10);
          break;
        case 2031636:
          localr.J(11);
          break;
        case 2031621:
          localr.J(12);
          break;
        case 2228225:
          localr.J(13);
          break;
        case 1966097:
          localr.J(14);
          break;
        case 458817:
          localr.J(15);
          break;
        case 939349:
          localr.J(17);
          break;
        case 2228256:
          localr.J(18);
          break;
        case 3342356:
          localr.J(19);
          break;
        case 917525:
          localr.J(20);
        }
      i++;
    }
  }

  private static void a$7aebb325(DataInputStream paramDataInputStream, short paramShort, r paramr)
    throws IOException
  {
    int i;
    int i5;
    if (paramShort == 6)
    {
      i = paramDataInputStream.readByte();
      b5.jdMethod_case("背包可用的格数 = " + i);
      paramr.j((short)i);
      paramr.d0();
      for (int k = 0; k < i; k++)
      {
        paramr.mQ[k] = paramDataInputStream.readInt();
        b5.jdMethod_case("grid.stuffId[" + k + "] = " + paramr.mQ[k]);
        i5 = paramDataInputStream.readShort();
        paramr.mW[k] = i5;
        paramr.mI[k] = r.k((short)(i5 % 1000));
        paramr.nu[k] = paramDataInputStream.readByte();
        paramr.mV[k] = paramDataInputStream.readUTF();
        paramr.ne[k] = paramDataInputStream.readByte();
        b5.jdMethod_case("物品文字颜色值： " + paramr.ne[k]);
        paramr.mM[k] = paramDataInputStream.readShort();
        b5.jdMethod_case("---------------grid.stuffType[" + k + "] = ------------------" + paramr.mM[k]);
        paramr.m5[k] = paramDataInputStream.readBoolean();
        paramr.nq[k] = paramDataInputStream.readBoolean();
        b5.jdMethod_case("---------------grid.isCanTrade[" + k + "] = ------------------" + paramr.nq[k]);
        paramr.nD[k] = paramDataInputStream.readByte();
        paramr.mN[k] = paramDataInputStream.readInt();
        paramr.nm[k] = paramDataInputStream.readByte();
        paramr.mx[k] = paramDataInputStream.readByte();
        b5.jdMethod_case("物品名称 = " + paramr.mV[k] + " 物品种类 = " + paramr.mx[k]);
        paramr.m4[k] = paramDataInputStream.readBoolean();
        paramr.mS[k] = paramDataInputStream.readBoolean();
        paramr.mZ[k] = paramDataInputStream.readBoolean();
        if (paramr.nm[k] == 1)
          paramr.nv[k] = false;
        else
          paramr.nv[k] = true;
        paramr.jdMethod_do(k, i5);
      }
      paramr.jdMethod_if(paramr.mV[paramr.ep()], r.E(paramr.ne[paramr.ep()]));
      paramr.d9();
      return;
    }
    if ((paramShort == 42) || (paramShort == 53))
    {
      i = paramDataInputStream.readByte();
      paramr.j((short)i);
      for (int m = 0; m < i; m++)
      {
        paramr.mQ[m] = paramDataInputStream.readInt();
        b5.jdMethod_case("--- stuffId[" + m + "] = " + paramr.mQ[m]);
        i5 = paramDataInputStream.readShort();
        paramr.mW[m] = i5;
        b5.jdMethod_case("--- imageFullID = " + i5);
        paramr.mI[m] = r.k((short)(i5 % 1000));
        paramr.mN[m] = paramDataInputStream.readInt();
        b5.jdMethod_case("--- grid.stuffPrice[" + m + "] = " + paramr.mN[m]);
        paramr.nu[m] = paramDataInputStream.readByte();
        b5.jdMethod_case("--- grid.stuffNumber[" + m + "] = " + paramr.nu[m]);
        paramr.mV[m] = paramDataInputStream.readUTF();
        b5.jdMethod_case("--- grid.stuffName[" + m + "] = " + paramr.mV[m]);
        paramr.ne[m] = paramDataInputStream.readByte();
        paramr.nv[m] = paramDataInputStream.readBoolean();
        b5.jdMethod_case("--- stuffShowMiniNum[" + m + "] = " + paramr.nv[m]);
        paramr.nm[m] = paramDataInputStream.readByte();
        b5.jdMethod_case("--- stuffMaxNum[" + m + "] = " + paramr.nm[m]);
        paramr.jdMethod_do(m, i5);
        if (paramShort == 53)
        {
          paramr.mu[m] = paramDataInputStream.readByte();
          b5.jdMethod_case("--- stuffGroupNum[" + m + "] = " + paramr.mu[m]);
        }
        paramr.jdMethod_if(paramr.mV[paramr.ep()], r.E(paramr.ne[paramr.ep()]));
      }
      paramr.d9();
      return;
    }
    if (paramShort == 29)
    {
      i = paramDataInputStream.readByte();
      paramr.j((short)i);
      for (int n = 0; n < i; n++)
      {
        paramr.mQ[n] = paramDataInputStream.readInt();
        i5 = paramDataInputStream.readShort();
        paramr.mW[n] = i5;
        paramr.mI[n] = r.k((short)(i5 % 1000));
        paramr.nu[n] = paramDataInputStream.readByte();
        paramr.mV[n] = paramDataInputStream.readUTF();
        paramr.nv[n] = paramDataInputStream.readBoolean();
        paramr.ne[n] = paramDataInputStream.readByte();
        paramr.jdMethod_do(n, i5);
        paramr.mZ[n] = paramDataInputStream.readBoolean();
      }
      paramr.d9();
      return;
    }
    if (paramShort == 148)
    {
      bo.l = new byte[i = paramDataInputStream.readInt()];
      bo.G = new int[i];
      bo.P = new String[i];
      bo.g = new byte[i];
      bo.K = new int[i];
      bo.I = new byte[i];
      paramr.j((short)i);
      paramr.d0();
      for (int i1 = 0; i1 < i; i1++)
      {
        paramr.mQ[i1] = paramDataInputStream.readInt();
        bo.K[i1] = paramr.mQ[i1];
        b5.jdMethod_case("grid.stuffId[" + i1 + "] = " + paramr.mQ[i1]);
        i5 = paramDataInputStream.readShort();
        paramr.mW[i1] = i5;
        paramr.mI[i1] = r.k((short)(i5 % 1000));
        paramr.nu[i1] = paramDataInputStream.readByte();
        bo.I[i1] = paramr.nu[i1];
        paramr.mV[i1] = paramDataInputStream.readUTF();
        paramr.mo[i1] = paramDataInputStream.readByte();
        paramr.ne[i1] = paramr.mo[i1];
        bo.l[i1] = paramDataInputStream.readByte();
        bo.G[i1] = paramDataInputStream.readInt();
        if ((bo.q == 3) || (bo.q == 8))
          bo.P[i1] = ("" + bo.G[i1] / 10 + "." + bo.G[i1] % 10 + "元");
        b5.jdMethod_case("PCIncrement.m_bBuyShopping[" + i1 + "]=" + bo.G[i1]);
        bo.g[i1] = paramDataInputStream.readByte();
        if (paramr.nu[i1] == 1)
          paramr.nv[i1] = false;
        else
          paramr.nv[i1] = true;
        paramr.jdMethod_do(i1, i5);
        (paramShort = (ao)a5.es.cf().elementAt(0)).jdMethod_do(bo.o);
        paramShort = (ah)a5.es.cf().elementAt(6);
        if ((bo.q != 3) && (bo.q != 8))
        {
          paramShort.jdMethod_case(bo.G[0]);
        }
        else
        {
          paramShort.a(0);
          paramShort.a(bo.P[0]);
        }
      }
      paramr.jdMethod_if(paramr.mV[paramr.ep()], r.E(paramr.ne[paramr.ep()]));
      paramr.d9();
      return;
    }
    if ((paramShort == 164) || (paramShort == 167))
    {
      i = paramDataInputStream.readByte();
      b5.jdMethod_case("背包可用的格数 = " + i);
      paramr.j((short)i);
      paramr.d0();
      for (int i2 = 0; i2 < i; i2++)
      {
        i5 = paramDataInputStream.readShort();
        paramr.mW[i2] = i5;
        paramr.mI[i2] = r.k((short)(i5 % 1000));
        paramr.nu[i2] = paramDataInputStream.readByte();
        paramr.nv[i2] = true;
        paramr.mV[i2] = paramDataInputStream.readUTF();
        paramr.ne[i2] = paramDataInputStream.readByte();
        paramr.jdMethod_do(i2, i5);
        paramr.mN[i2] = paramDataInputStream.readInt();
      }
      if (i != 0)
      {
        paramr.jdMethod_if(paramr.mV[paramr.ep()], r.E(paramr.ne[paramr.ep()]));
        paramr.d9();
        ao localao1;
        switch (a5.es.g9)
        {
        case 2555907:
        case 2555915:
          if ((paramr.mV[0].equals("")) || (paramr.mV[0] == null))
            localao1 = (ao)a5.es.cf().elementAt(1);
          break;
        case 2555936:
          if ((paramShort == 167) || (paramShort == 164))
          {
            localao1 = (ao)a5.es.cf().elementAt(1);
            if ((paramr.mV[0].equals("")) || (paramr.mV[0] == null))
              break;
            localao1.a("操作", 0);
            return;
            localao1.a("", 0);
          }
        }
      }
      return;
    }
    if (paramShort == 160)
    {
      i = paramDataInputStream.readShort();
      paramr.j(i);
      az.a = new int[i];
      for (int i3 = 0; i3 < i; i3++)
      {
        paramr.mQ[i3] = paramDataInputStream.readInt();
        b5.jdMethod_case("grid.stuffId[" + i3 + "] = " + paramr.mQ[i3]);
        i5 = paramDataInputStream.readShort();
        paramr.mW[i3] = i5;
        paramr.mI[i3] = r.k((short)(i5 % 1000));
        paramr.mV[i3] = paramDataInputStream.readUTF();
        paramr.ne[i3] = paramDataInputStream.readByte();
        az.a[i3] = paramDataInputStream.readInt();
        paramr.jdMethod_do(i3, i5);
      }
      ah localah1 = (ah)a5.es.cf().elementAt(4);
      ah localah2 = (ah)a5.es.cf().elementAt(7);
      paramShort = (r)a5.es.cf().elementAt(3);
      localah1.a(paramShort.mV[paramShort.ep()]);
      localah1.jdMethod_char(r.E(paramShort.ne[paramShort.ep()]));
      localah2.jdMethod_case(az.a[paramShort.ep()]);
      return;
    }
    if (paramShort == 165)
    {
      int j = paramDataInputStream.readByte();
      paramr.j((short)j);
      paramr.d0();
      for (int i4 = 0; i4 < j; i4++)
      {
        int i6;
        if ((i6 = paramDataInputStream.readByte()) == 1)
        {
          paramr.mQ[i4] = paramDataInputStream.readInt();
          paramShort = paramDataInputStream.readShort();
          paramr.mW[i4] = paramShort;
          paramr.mI[i4] = r.k((short)(paramShort % 1000));
          paramr.jdMethod_do(i4, paramShort);
          paramr.nu[i4] = paramDataInputStream.readByte();
          paramr.nv[i4] = true;
          paramr.mV[i4] = paramDataInputStream.readUTF();
          paramr.ne[i4] = paramDataInputStream.readByte();
          paramr.nq[i4] = paramDataInputStream.readBoolean();
          paramr.mN[i4] = paramDataInputStream.readInt();
          paramr.nm[i4] = paramDataInputStream.readByte();
          paramr.mV[i4] = (paramr.mV[i4] + "单价" + paramr.mN[i4] + "菜币");
        }
        else
        {
          paramr.mQ[i4] = -1;
          paramr.mW[i4] = -1;
          paramr.mI[i4] = r.k(-1);
          paramr.jdMethod_do(i4, -1);
          paramr.nu[i4] = 0;
          paramr.nv[i4] = false;
          paramr.mV[i4] = "";
          paramr.ne[i4] = 0;
          paramr.nq[i4] = false;
          paramr.mN[i4] = 0;
          paramr.nm[i4] = 0;
        }
      }
      paramr.jdMethod_if(paramr.mV[paramr.ep()], r.E(paramr.ne[paramr.ep()]));
      paramr.d9();
      if (paramr.mQ[0] == -1)
      {
        ao localao2;
        (localao2 = (ao)a5.es.cf().elementAt(1)).a("整理", 0);
      }
    }
  }

  private static void a$3da4a85(DataInputStream paramDataInputStream, short paramShort, ak paramak, int paramInt)
    throws IOException
  {
    int j;
    if ((paramShort == 8) || (paramShort == 17) || (paramShort == 21) || (paramShort == 23) || (paramShort == 22) || (paramShort == 63) || (paramShort == 55) || (paramShort == 57) || (paramShort == 61) || (paramShort == 62) || (paramShort == 68) || (paramShort == 66) || (paramShort == 69) || (paramShort == 81) || (paramShort == 90) || (paramShort == 97) || (paramShort == 104) || (paramShort == 109) || (paramShort == 114) || (paramShort == 120) || (paramShort == 126) || (paramShort == 142) || (paramShort == 147) || (paramShort == 1))
    {
      String str = paramDataInputStream.readUTF();
      b5.jdMethod_case("" + str);
      j = paramDataInputStream.readInt();
      paramak.jdMethod_else(j);
      ak.bu = System.currentTimeMillis();
      paramak.jdMethod_if(str);
      paramak.ap();
      if (paramShort == 17)
        paramak.bQ = 0;
      else if (paramShort == 21)
        paramak.bQ = 1;
      else if (paramShort == 23)
        paramak.bQ = 2;
      else if (paramShort == 22)
        paramak.bQ = 3;
      else if (paramShort == 55)
        paramak.bQ = 4;
      else if (paramShort == 57)
        paramak.bQ = 5;
      else if (paramShort == 61)
        paramak.bQ = 6;
      else if (paramShort == 62)
        paramak.bQ = 7;
      else if (paramShort == 63)
        paramak.bQ = 8;
      else if (paramShort == 68)
        paramak.bQ = 9;
      else if (paramShort == 81)
        paramak.bQ = 10;
      else if (paramShort == 90)
        paramak.bQ = 11;
      else if (paramShort == 97)
        paramak.bQ = 12;
      else if (paramShort == 104)
        paramak.bQ = 13;
      else if (paramShort == 109)
        paramak.bQ = 14;
      else if (paramShort == 114)
        paramak.bQ = 15;
      else if (paramShort == 120)
        paramak.bQ = 16;
      else if (paramShort == 126)
        paramak.bQ = 17;
      else if (paramShort == 142)
        paramak.bQ = 18;
      else if (paramShort == 147)
        paramak.bQ = 19;
      else if (paramShort == 1)
        if (paramInt == 2555977)
        {
          (paramDataInputStream = (ao)a5.es.cf().elementAt(0)).jdMethod_do(az.k);
        }
        else if (paramInt == 2425077)
        {
          paramDataInputStream = paramDataInputStream.readUTF();
          (paramShort = (ao)a5.es.cf().elementAt(0)).jdMethod_do(paramDataInputStream);
          be.g3 = 0;
        }
      paramak.ap();
      return;
    }
    if (paramShort == 135)
    {
      int i;
      bo.n = new String[i = paramDataInputStream.readByte()];
      for (j = 0; j < i; j++)
        bo.n[j] = paramDataInputStream.readUTF();
      ak localak;
      if (paramInt == 2424833)
      {
        (localak = (ak)a5.es.cf().elementAt(8)).jdMethod_if(bo.n[0]);
        return;
      }
      if (paramInt == 2424840)
        (localak = (ak)a5.es.cf().elementAt(5)).jdMethod_if(bo.n[0]);
    }
  }

  private static void a$1a0c41af(DataInputStream paramDataInputStream, short paramShort, a7 parama7)
    throws IOException
  {
    if ((paramShort == 0) || ((paramShort == 19) && (parama7.jdMethod_char() == 0)))
    {
      String str1 = paramDataInputStream.readUTF();
      b5.jdMethod_case("NPC图片名称：" + str1);
      short s1 = paramDataInputStream.readShort();
      paramShort = paramDataInputStream.readInt();
      b5.jdMethod_case("-----------------------targetID : " + paramShort);
      parama7.jdMethod_void(s1);
      parama7.k(paramShort);
      return;
    }
    byte b1;
    if ((paramShort == 5) && (parama7.jdMethod_char() == 1))
    {
      b1 = paramDataInputStream.readByte();
      parama7.jdMethod_long(b1);
      return;
    }
    if ((paramShort == 5) && (parama7.jdMethod_char() == 2))
    {
      b1 = paramDataInputStream.readByte();
      parama7.eT = true;
      parama7.ei = b1;
      parama7.a(a5.hL);
      return;
    }
    if (((paramShort == 36) || (paramShort == 37)) && (parama7.jdMethod_char() == 2))
    {
      boolean bool = paramDataInputStream.readBoolean();
      Object localObject = null;
      if (paramShort == 36)
      {
        parama7.fg = 0;
        a7.ej = bool;
      }
      else
      {
        parama7.fg = 3;
        a7.em = bool;
        return;
      }
    }
    else
    {
      int i;
      short s2;
      if ((paramShort == 3) && (parama7.jdMethod_char() == 1))
      {
        i = paramDataInputStream.readShort();
        parama7.g(i);
        parama7.ft = true;
        s2 = (short)(i % 1000);
        parama7.jdMethod_if(s2, true);
        parama7.a(a5.gg);
        if ((a5.es.g9 == 2424995) || (a5.es.g9 == 2425079))
        {
          if (bo.I[bo.N] == 1)
            parama7.g(false);
          else if (bo.I[bo.N] > 1)
            parama7.a(true, bo.I[bo.N]);
          bo.D = true;
          (paramShort = (ao)a5.es.cf().elementAt(0)).jdMethod_do("商品介绍");
        }
        else
        {
          if (a5.es.g9 == 2555906)
          {
            paramShort = paramDataInputStream.readUTF();
            az.byte[az.n] = paramShort;
            az.n = (byte)(az.n + 1);
          }
          return;
        }
      }
      else
      {
        byte b5;
        int i2;
        if ((paramShort == 16) && (parama7.jdMethod_char() == 3))
        {
          i = paramDataInputStream.readByte();
          s2 = paramDataInputStream.readShort();
          parama7.g(s2);
          paramShort = paramDataInputStream.readUTF();
          b5 = paramDataInputStream.readByte();
          i2 = (short)(s2 % 1000);
          parama7.fz = true;
          parama7.e(i2);
          parama7.a(a5.gg);
          parama7.jdMethod_else(paramShort);
          parama7.h(i);
          parama7.l(b5);
          return;
        }
        a7 locala71;
        if ((paramShort == 115) && (parama7.jdMethod_char() == 3))
        {
          byte b2 = paramDataInputStream.readByte();
          s2 = paramDataInputStream.readShort();
          parama7.g(s2);
          paramShort = paramDataInputStream.readUTF();
          b5 = paramDataInputStream.readByte();
          i2 = paramDataInputStream.readShort();
          locala71 = paramDataInputStream.readShort();
          int i4 = paramDataInputStream.readInt();
          s2 = (short)(s2 % 1000);
          parama7.fz = true;
          parama7.e(s2);
          parama7.a(a5.gg);
          parama7.jdMethod_else(paramShort);
          parama7.h(b2);
          parama7.f(i2);
          parama7.d(locala71);
          parama7.h(i4);
          parama7.l(b5);
          return;
        }
        int j;
        if (((paramShort == 34) || (paramShort == 35)) && (parama7.jdMethod_char() == 1))
        {
          j = paramDataInputStream.readShort();
          b5.jdMethod_case("AAAAAAAAAAAAAAAAA wpID = " + j);
          String str2 = paramDataInputStream.readUTF();
          b5.jdMethod_case("BBBBBBBBBBBBBBBBB name = " + str2);
          paramShort = paramDataInputStream.readByte();
          b5.jdMethod_case("CCCCCCCCCCCCCCCCC num = " + paramShort);
          b5 = paramDataInputStream.readByte();
          i2 = paramDataInputStream.readByte();
          b5.jdMethod_case("DDDDDDDDDDDDDDDDD color = " + i2);
          parama7.g(j);
          parama7.ft = true;
          locala71 = (short)(j % 1000);
          parama7.ft = true;
          parama7.jdMethod_if(locala71, true);
          parama7.a(a5.gg);
          parama7.jdMethod_else(str2);
          parama7.h(b5);
          parama7.l(i2);
          if (paramShort > 0)
          {
            parama7.a(true, paramShort);
          }
          else
          {
            parama7.g(false);
            return;
          }
        }
        else
        {
          if (((paramShort == 40) || (paramShort == 41)) && (parama7.jdMethod_char() == 1))
          {
            j = paramDataInputStream.readShort();
            parama7.g(j);
            parama7.ft = true;
            short s3 = (short)(j % 1000);
            parama7.ft = true;
            parama7.jdMethod_if(s3, true);
            parama7.a(a5.gg);
            return;
          }
          short s4;
          String str5;
          if (paramShort == 27)
          {
            a5.hw = paramDataInputStream.readBoolean();
            b5.jdMethod_case("rec data=" + a5.hw);
            if (a5.hw)
            {
              j = paramDataInputStream.readInt();
              String str3 = paramDataInputStream.readUTF();
              paramShort = paramDataInputStream.readInt();
              b5 = paramDataInputStream.readByte();
              s4 = paramDataInputStream.readByte();
              locala71 = paramDataInputStream.readByte();
              str5 = paramDataInputStream.readUTF();
              a5.cy[a5.h6] = j;
              a5.e0[a5.h6] = str3;
              a5.im[a5.h6] = paramShort;
              a5.fZ[a5.h6] = b5;
              a5.hE[a5.h6] = s4;
              a5.d3[a5.h6] = str5;
              a5.iC[a5.h6] = parama7;
              a5.eI[a5.h6] = locala71;
              parama7.eo = new b(0, 0, a5.fZ[a5.h6], a5.hE[a5.h6], a5.eI[a5.h6]);
              l.a(parama7.eo);
              int m = 0;
              paramShort = null;
              short[][] arrayOfShort = null;
              b localb;
              if ((localb = parama7.eo) == null)
              {
                b5.jdMethod_case("**********NO Found Player***********");
              }
              else
              {
                arrayOfShort = new short[m = paramDataInputStream.readByte()][];
                paramShort = new byte[m];
                b5.jdMethod_case("登录换装数量 :" + m);
                for (s4 = 0; s4 < m; s4 = (byte)(s4 + 1))
                {
                  paramDataInputStream.readByte();
                  paramShort[s4] = paramDataInputStream.readByte();
                  b5.jdMethod_case("-bodywhere[" + s4 + "]=" + paramShort[s4]);
                  a7 locala72;
                  if (paramShort[s4] > 0)
                  {
                    parama7 = paramDataInputStream.readByte();
                    arrayOfShort[s4] = new short[parama7];
                    for (locala71 = 0; locala71 < parama7; locala72 = (byte)(locala71 + 1))
                    {
                      arrayOfShort[s4][locala71] = paramDataInputStream.readShort();
                      b5.jdMethod_case("+++++pf[" + s4 + "][" + locala71 + "]=" + arrayOfShort[s4][locala71]);
                    }
                  }
                  else if (paramShort[s4] < 0)
                  {
                    parama7 = (byte)bz.aL[(Math.abs(paramShort[s4]) - 1 + (localb.C() - 1) * (bz.aL.length / 2))].length;
                    arrayOfShort[s4] = new short[parama7];
                    b5.jdMethod_case("-yyc=" + parama7 + "--ind=" + (Math.abs(paramShort[s4]) - 1 + (localb.C() - 1) * (bz.aL.length / 2)));
                    int i3;
                    for (locala72 = 0; locala72 < parama7; i3 = (byte)(locala72 + 1))
                    {
                      arrayOfShort[s4][locala72] = bz.aL[(Math.abs(paramShort[s4]) - 1 + (localb.C() - 1) * (bz.aL.length / 2))][locala72];
                      b5.jdMethod_case("-----pf[" + s4 + "][" + locala72 + "]=" + arrayOfShort[s4][locala72]);
                    }
                  }
                  else
                  {
                    b5.jdMethod_case("出错了，不应该有0数值传输！");
                  }
                }
              }
              s4 = paramDataInputStream.readByte();
              a5.hV[a5.h6] = s4;
              b5.jdMethod_case("MainCanvas.m_bDelete[MainCanvas.m_bChooseCounter]=" + a5.hV[a5.h6]);
              parama7 = paramDataInputStream.readBoolean();
              a5.g3[a5.h6] = parama7;
              b5.jdMethod_case("MainCanvas.m_bAmendNickname[MainCanvas.m_bChooseCounter]=" + a5.g3[a5.h6]);
            }
            a5.h6 = (byte)(a5.h6 + 1);
            b5.jdMethod_case("MainCanvas.m_bChooseID=" + a5.h6);
            return;
          }
          int k;
          if (paramShort == 161)
          {
            byte b3 = paramDataInputStream.readByte();
            parama7.jdMethod_goto(b3);
            if (b3 == 0)
            {
              parama7.jdMethod_long("");
              parama7.jdMethod_goto("");
              parama7.d(0);
              parama7.jdMethod_char("");
              parama7.m(-1);
              parama7.i(0);
              parama7.j(0);
            }
            else
            {
              String str4 = paramDataInputStream.readUTF();
              parama7.jdMethod_long(str4);
              paramShort = paramDataInputStream.readUTF();
              parama7.jdMethod_goto(paramShort);
              byte b6 = paramDataInputStream.readByte();
              parama7.d(b6);
              paramDataInputStream.readByte();
              paramDataInputStream.readByte();
              str5 = paramDataInputStream.readUTF();
              parama7.jdMethod_char(str5);
              byte b4 = paramDataInputStream.readByte();
              parama7.m(b4);
              paramShort = paramDataInputStream.readShort();
              k = paramDataInputStream.readInt();
              parama7.i(k);
              int i1 = paramDataInputStream.readInt();
              parama7.j(i1);
              parama7.g(paramShort);
              parama7.ft = true;
              s4 = (short)(paramShort % 1000);
              parama7.jdMethod_if(s4, true);
              parama7.a(a5.gg);
              return;
            }
          }
          else if (paramShort == 175)
          {
            k = paramDataInputStream.readByte();
            parama7.jdMethod_goto(k);
            int n = paramDataInputStream.readInt();
            parama7.g(n);
            parama7.ft = true;
            paramShort = (short)(n % 1000);
            parama7.ft = true;
            parama7.jdMethod_if(paramShort, true);
            parama7.a(a5.gg);
            am.case[am.try] = paramDataInputStream.readUTF();
            if ((am.try = (byte)(am.try + 1)) >= 5)
            {
              ak localak;
              (localak = (ak)a5.es.cf().elementAt(13)).jdMethod_if(am.case[0]);
            }
          }
        }
      }
    }
  }

  private static void a(DataInputStream paramDataInputStream, short paramShort, bg parambg, int paramInt, be parambe)
    throws IOException
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i22;
    int i38;
    Object localObject16;
    Object localObject18;
    label788: Object localObject5;
    int j;
    ba[] arrayOfba2;
    Object localObject7;
    Object localObject20;
    Object localObject15;
    int i40;
    int i51;
    int i27;
    if (paramShort == 67)
    {
      parambg.a(null);
      int i = paramDataInputStream.readByte();
      ba[] arrayOfba1 = new ba[3];
      localObject2 = (localObject1 = (v)parambg.cD().elementAt(0)).jdMethod_case();
      localObject3 = null;
      for (int m = 0; m < ((v)localObject1).a().size(); m++)
        arrayOfba1[m] = ((ba)((v)localObject1).a().elementAt(m));
      m = ((v)localObject1).jdMethod_for();
      parambg.cE();
      for (int i8 = 0; i8 < i; i8++)
      {
        String str1 = paramDataInputStream.readUTF();
        i22 = paramDataInputStream.readShort();
        String str6 = paramDataInputStream.readUTF();
        v localv2;
        (localv2 = new v()).a(3);
        localv2.jdMethod_int(m);
        localv2.a(localObject2);
        localv2.jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
        localv2.a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + i8 * m));
        for (int i30 = 0; i30 < 3; i30++)
        {
          Object localObject6 = null;
          int i35 = (short)(parambg.v() + 3 + 1 + 1);
          i38 = (short)(parambg.jdMethod_long() + 1 + 1 + 1);
          Object localObject14;
          if (i30 == 0)
          {
            localObject14 = (ah)arrayOfba1[i30];
            (localObject16 = new ah(((ba)localObject14).v(), ((ba)localObject14).jdMethod_long(), ((ba)localObject14).jdMethod_for(), ((ba)localObject14).z(), ((ah)localObject14).jdMethod_char(), ((ah)localObject14).aj(), parambe)).a2 = true;
            ((ah)localObject16).aN = (short)(localObject2[i30] * a5.ic / 176);
            ((ah)localObject16).a(str1);
            ((ba)localObject16).jdMethod_new((short)(i35 + (localv2.jdMethod_if((byte)i30) + 1) * a5.ic / 176));
            ((ba)localObject16).jdMethod_for((short)(i38 + i8 * m + (m - a5.iG) / 2));
            localObject6 = localObject16;
          }
          else if (i30 == 1)
          {
            localObject14 = (a7)arrayOfba1[i30];
            localObject16 = new a7(((ba)localObject14).v(), ((ba)localObject14).jdMethod_long(), ((ba)localObject14).jdMethod_for(), ((ba)localObject14).z(), null, ((ba)localObject14).jdMethod_char(), parambe);
            if (i22 != -1)
            {
              ((a7)localObject16).g(i22);
              ((a7)localObject16).ft = true;
              short s4 = (short)(i22 % 1000);
              ((a7)localObject16).jdMethod_if(s4, true);
            }
            ((a7)localObject16).a(a5.gg);
            ((ba)localObject16).jdMethod_new((short)(i35 + (localv2.jdMethod_if((byte)i30) + 1) * a5.ic / 176));
            ((ba)localObject16).jdMethod_for((short)(i38 + i8 * m + (m - ((a7)localObject16).bE().a) / 2));
            if (i22 == -1)
              ((a7)localObject16).a(null);
            localObject6 = localObject16;
          }
          else if (i30 == 2)
          {
            localObject14 = (ah)arrayOfba1[i30];
            (localObject16 = new ah(((ba)localObject14).v(), ((ba)localObject14).jdMethod_long(), ((ba)localObject14).jdMethod_for(), ((ba)localObject14).z(), ((ah)localObject14).jdMethod_char(), ((ah)localObject14).aj(), parambe)).a2 = true;
            ((ah)localObject16).aN = (short)(localObject2[i30] * a5.ic / 176);
            ((ah)localObject16).a(str6);
            ((ba)localObject16).jdMethod_new((short)(i35 + (localv2.jdMethod_if((byte)i30) + 1) * a5.ic / 176));
            ((ba)localObject16).jdMethod_for((short)(i38 + i8 * m + (m - a5.iG) / 2));
            localObject6 = localObject16;
            if (i8 == 0)
            {
              if (au.case == 1)
              {
                (localObject18 = (ao)a5.es.cf().elementAt(1)).a("查看", 0);
                break label788;
              }
              if (str6.equals(""))
              {
                (localObject18 = (ao)a5.es.cf().elementAt(1)).a("镶嵌", 0);
                break label788;
              }
              (localObject18 = (ao)a5.es.cf().elementAt(1)).a("操作", 0);
            }
          }
          else
          {
            b5.jdMethod_case("不正确的控件");
          }
          localv2.a(localObject6);
        }
        parambg.jdMethod_if(localv2);
      }
      if (a5.es.g9 == 1966081)
      {
        parambg.h0 = 11;
      }
      else if (a5.es.g9 == 1966087)
      {
        parambg.h0 = 12;
      }
      else if (a5.es.g9 == 1966100)
      {
        parambg.h0 = 13;
        (localObject5 = (ao)a5.es.cf().elementAt(1)).a("操作", 0);
      }
      parambg.cP();
    }
    else
    {
      Object localObject4;
      int i19;
      int i43;
      int i53;
      if ((paramShort == 9) || (paramShort == 12) || (paramShort == 14) || (paramShort == 24) || (paramShort == 72) || (paramShort == 156))
      {
        if (paramShort == 24)
          parambg.k(paramDataInputStream.readBoolean());
        v localv1;
        (localv1 = parambg.cI()).a("族", 1);
        int k = parambg.cF();
        b5.jdMethod_case("showRow = " + k);
        localObject1 = new ba[k];
        localObject3 = (localObject2 = (v)parambg.cD().elementAt(0)).jdMethod_case();
        for (int n = 0; n < localObject3.length; n++)
          b5.jdMethod_case("itemW = " + localObject3[n]);
        localObject4 = new short[k];
        localObject5 = ((v)localObject2).jdMethod_if();
        for (i19 = 0; i19 < ((v)localObject2).a().size(); i19++)
          localObject1[i19] = ((ba)((v)localObject2).a().elementAt(i19));
        i19 = ((v)localObject2).jdMethod_for();
        parambg.cE();
        i22 = paramDataInputStream.readByte();
        b5.jdMethod_case("line = " + i22);
        int i26 = paramDataInputStream.readByte();
        b5.jdMethod_case("subRow = " + i26);
        for (int i28 = 0; i28 < k; i28++)
        {
          localObject4[i28] = paramDataInputStream.readShort();
          System.out.println("userDataType[" + i28 + "] " + localObject4[i28]);
        }
        for (i28 = 0; i28 < i22; i28++)
        {
          v localv7;
          (localv7 = new v()).a(k);
          localv7.jdMethod_int((short)(i19 + 6));
          localv7.a(localObject3);
          localv7.jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
          localv7.a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for() + i28 * i19));
          for (int i33 = 0; i33 < i26; i33++)
          {
            Object localObject9 = null;
            if (i33 < k)
            {
              i38 = (short)(parambg.v() + 3 + 1 + 1);
              i43 = (short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for());
              b5.jdMethod_case("^^^^^^^^^^^^^^^^^^ userDataType[" + i33 + "] = " + localObject4[i33]);
              b5.jdMethod_case("^^^^^^^^^^^^^^^^^^ lineUic[" + i33 + "] = " + localObject1[i33]);
              if ((localObject4[i33] == 5) && ((localObject1[i33] instanceof a7)))
              {
                localObject16 = (a7)localObject1[i33];
                (localObject18 = new a7(((ba)localObject16).v(), ((ba)localObject16).jdMethod_long(), ((ba)localObject16).jdMethod_for(), ((ba)localObject16).z(), null, ((ba)localObject16).jdMethod_char(), parambe)).eT = true;
                byte b3 = paramDataInputStream.readByte();
                b5.jdMethod_case("the picId is " + b3);
                ((a7)localObject18).ei = b3;
                ((a7)localObject18).a(a5.hL);
                i53 = 0;
                if (localObject5[i33] != 0)
                  i53 = (short)((localObject3[i33] - ((a7)localObject18).bE().jdField_try) / 2);
                ((ba)localObject18).jdMethod_new((short)(i38 + localv7.jdMethod_if((byte)i33) + i53 + 1));
                ((ba)localObject18).jdMethod_for((short)(i43 + i28 * i19 + (i19 - ((a7)localObject18).bE().a) / 2));
                localObject9 = localObject18;
              }
              else if ((localObject4[i33] == 1) && ((localObject1[i33] instanceof ah)))
              {
                localObject16 = (ah)localObject1[i33];
                localObject18 = new ah(((ba)localObject16).v(), ((ba)localObject16).jdMethod_long(), ((ba)localObject16).jdMethod_for(), ((ba)localObject16).z(), ((ah)localObject16).jdMethod_char(), ((ah)localObject16).aj(), parambe);
                String str11 = paramDataInputStream.readUTF();
                if (i33 == 1)
                  str11 = str11.substring(0, str11.length() - 1);
                b5.jdMethod_case("the base str is " + str11);
                ((ah)localObject18).a(str11);
                i53 = 0;
                if (localObject5[i33] != 0)
                  i53 = (short)((localObject3[i33] - ((ba)localObject18).jdMethod_for()) / 2);
                ((ba)localObject18).jdMethod_new((short)(i38 + (localv7.jdMethod_if((byte)i33) + i53) * a5.ic / 176 + 1));
                ((ba)localObject18).jdMethod_for((short)(i43 + i28 * i19 + (i19 - a5.iG) / 2));
                localObject9 = localObject18;
              }
              else if ((localObject4[i33] == 2) && ((localObject1[i33] instanceof ah)))
              {
                localObject16 = (ah)localObject1[i33];
                localObject18 = new ah(((ba)localObject16).v(), ((ba)localObject16).jdMethod_long(), ((ah)localObject16).jdMethod_char(), parambe, 0);
                int i52 = paramDataInputStream.readInt();
                i53 = paramDataInputStream.readInt();
                ((ah)localObject18).jdMethod_case(i52);
                ((ah)localObject18).jdMethod_byte(i53);
                j = 0;
                if (localObject5[i33] != 0)
                  j = (short)((localObject3[i33] - b5.jdMethod_do(i52, i53)[0]) / 2 - 3);
                ((ba)localObject18).jdMethod_new((short)(i38 + (localv7.jdMethod_if((byte)i33) + j) * a5.ic / 176));
                ((ba)localObject18).jdMethod_for((short)(i43 + i28 * i19 + (i19 - b5.jdMethod_do(i52, i53)[1]) / 2 + 1));
                localObject9 = localObject18;
              }
              else
              {
                b5.jdMethod_case("不正确的控件");
              }
              localv7.a(localObject9);
            }
            else if (i33 == 3)
            {
              i38 = paramDataInputStream.readInt();
              localv7.jdField_new = i38;
              b5.jdMethod_case("playerId = " + i38);
            }
            else if (i33 == 4)
            {
              boolean bool5 = paramDataInputStream.readBoolean();
              localv7.jdField_else = bool5;
              b5.jdMethod_case("olState = " + bool5);
            }
            else
            {
              if (i33 != 5)
                continue;
              byte b2 = paramDataInputStream.readByte();
              b5.jdMethod_case("--------------------camp-------------------= " + b2);
              localv7.jdField_byte = b2;
            }
          }
          parambg.jdMethod_if(localv7);
        }
        parambg.cM();
        parambg.cN();
        parambg.cS();
        parambg.cP();
        ao localao;
        if (paramShort == 9)
        {
          if (paramInt == 589834)
          {
            parambg.h0 = 5;
            break label5922;
          }
          if ((paramInt == 2555912) || (paramInt == 1703945))
          {
            if (paramInt == 2555912)
              parambg.h0 = 16;
            else if (paramInt == 1703945)
              parambg.h0 = 0;
            if (i22 == 0)
            {
              (localao = (ao)a5.es.cf().elementAt(1)).a("", 0);
              break label5922;
            }
          }
          else if ((paramInt == 2555941) || (paramInt == 2555943) || (paramInt == 2555945))
          {
            parambg.h0 = 18;
            localao = (ao)a5.es.cf().elementAt(1);
            if (i22 == 0)
            {
              localao.a("", 0);
            }
            else
            {
              localao.a("赠送", 0);
              break label5922;
            }
          }
          else
          {
            parambg.h0 = 0;
            break label5922;
          }
        }
        else
        {
          if (paramShort == 12)
          {
            parambg.h0 = 1;
            break label5922;
          }
          if (paramShort == 14)
          {
            parambg.h0 = 2;
            break label5922;
          }
          if (paramShort == 24)
          {
            parambg.h0 = 3;
            break label5922;
          }
          if (paramShort == 72)
          {
            if (paramInt == 589845)
            {
              parambg.h0 = 8;
              break label5922;
            }
            if (paramInt == 2555913)
            {
              parambg.h0 = 17;
              if (i22 == 0)
              {
                (localao = (ao)a5.es.cf().elementAt(1)).a("", 0);
                break label5922;
              }
            }
            else
            {
              parambg.h0 = 8;
              break label5922;
            }
          }
          else if (paramShort == 156)
          {
            parambg.h0 = 15;
          }
        }
      }
      else
      {
        short s3;
        v localv3;
        if ((paramShort == 30) || (paramShort == 74))
        {
          j = paramDataInputStream.readByte();
          b5.jdMethod_case("USER_NPC_TABLE num = " + j);
          arrayOfba2 = new ba[2];
          localObject2 = (localObject1 = (v)parambg.cD().elementAt(0)).jdMethod_case();
          (localObject3 = new short[2])[0] = 1;
          localObject3[1] = 31;
          localObject4 = ((v)localObject1).jdMethod_if();
          for (int i9 = 0; i9 < ((v)localObject1).a().size(); i9++)
            arrayOfba2[i9] = ((ba)((v)localObject1).a().elementAt(i9));
          i9 = ((v)localObject1).jdMethod_for();
          parambg.cE();
          for (i19 = 0; i19 < j; i19++)
          {
            String str3 = paramDataInputStream.readUTF();
            String str7 = paramDataInputStream.readUTF();
            short s1 = paramDataInputStream.readShort();
            short s2 = paramDataInputStream.readShort();
            b5.jdMethod_case("---name= " + str3 + " x= " + s1 + " y= " + s2 + " ----");
            (localObject7 = new v()).a(2);
            ((v)localObject7).jdMethod_int(i9);
            ((v)localObject7).a(localObject2);
            ((v)localObject7).jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
            ((v)localObject7).a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for() + i19 * i9));
            ((v)localObject7).jdField_void = s1;
            ((v)localObject7).jdField_goto = s2;
            for (s3 = 0; s3 < 2; s3++)
            {
              Object localObject11 = null;
              i43 = (short)(parambg.v() + 3 + 1 + 1);
              int i46 = (short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for());
              if ((localObject3[s3] == 1) && ((arrayOfba2[s3] instanceof ah)))
              {
                localObject18 = (ah)arrayOfba2[s3];
                (localObject20 = new ah(((ba)localObject18).v(), ((ba)localObject18).jdMethod_long(), ((ba)localObject18).jdMethod_for(), ((ba)localObject18).z(), 6, ((ah)localObject18).aj(), parambe)).a(str3);
                i53 = 0;
                if (localObject4[s3] != 0)
                  i53 = (short)((localObject2[s3] - ((ba)localObject20).jdMethod_for()) / 2);
                ((ba)localObject20).jdMethod_new((short)((i43 + ((v)localObject7).jdMethod_if((byte)s3) + i53 + 1) * a5.ic / 176));
                ((ba)localObject20).jdMethod_for((short)(i46 + i19 * i9 + (i9 - a5.iG) / 2));
                ((ah)localObject20).a2 = true;
                ((ah)localObject20).aN = (short)(localObject2[s3] * a5.ic / 176);
                localObject11 = localObject20;
              }
              else if ((localObject3[s3] == 31) && ((arrayOfba2[s3] instanceof ah)))
              {
                localObject18 = (ah)arrayOfba2[s3];
                (localObject20 = new ah(((ba)localObject18).v(), ((ba)localObject18).jdMethod_long(), ((ba)localObject18).jdMethod_for(), ((ba)localObject18).z(), ((ah)localObject18).jdMethod_char(), ((ah)localObject18).aj(), parambe)).a(str7);
                i53 = 0;
                if (localObject4[s3] != 0)
                  i53 = (short)((localObject2[s3] - ((ba)localObject20).jdMethod_for()) / 2);
                ((ba)localObject20).jdMethod_new((short)((i43 + ((v)localObject7).jdMethod_if((byte)s3) + i53 + 1) * a5.ic / 176));
                ((ba)localObject20).jdMethod_for((short)(i46 + i19 * i9 + (i9 - a5.iG) / 2));
                ((ah)localObject20).a2 = true;
                ((ah)localObject20).aN = (short)(localObject2[s3] * a5.ic / 176);
                localObject11 = localObject20;
              }
              else
              {
                b5.jdMethod_case("不正确的控件");
              }
              ((v)localObject7).a(localObject11);
            }
            parambg.jdMethod_if((v)localObject7);
          }
          boolean bool1;
          if ((bool1 = paramDataInputStream.readBoolean()))
            for (int i23 = 0; i23 < j; i23++)
            {
              byte b1 = paramDataInputStream.readByte();
              System.out.println(i23 + " ~~~taskIconType = " + b1);
              ah localah1;
              (localah1 = (ah)(localv3 = (v)parambg.cD().elementAt(i23)).a().elementAt(0)).aK = b1;
            }
          if (paramShort == 30)
            parambg.h0 = 4;
          parambg.cP();
        }
        else
        {
          int i20;
          String str8;
          int i31;
          Object localObject17;
          if ((paramShort == 127) || (paramShort == 128))
          {
            j = paramDataInputStream.readByte();
            b5.jdMethod_case("USER_MUST_GET_TASK_TABLE num = " + j);
            arrayOfba2 = new ba[2];
            localObject2 = (localObject1 = (v)parambg.cD().elementAt(0)).jdMethod_case();
            localObject3 = ((v)localObject1).jdMethod_if();
            for (int i1 = 0; i1 < ((v)localObject1).a().size(); i1++)
              arrayOfba2[i1] = ((ba)((v)localObject1).a().elementAt(i1));
            i1 = ((v)localObject1).jdMethod_for();
            parambg.cE();
            for (int i10 = 0; i10 < j; i10++)
            {
              i20 = paramDataInputStream.readByte();
              b5.jdMethod_case("~~~~~~~~~~~~~payType = " + i20);
              int i24 = paramDataInputStream.readShort();
              b5.jdMethod_case("~~~~~~~~~~~~~~~goodsID = " + i24);
              str8 = paramDataInputStream.readUTF();
              b5.jdMethod_case("~~~~~~~~~~~~~~payStr = " + str8);
              (localv3 = new v()).a(2);
              localv3.jdMethod_int(i1);
              localv3.a(localObject2);
              localv3.jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
              localv3.a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for() + i10 * i1));
              localv3.a(i20);
              for (i31 = 0; i31 < 2; i31++)
              {
                localObject7 = null;
                s3 = (short)(parambg.v() + 3 + 1 + 1);
                int i39 = (short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for());
                int i50;
                if (i31 == 0)
                {
                  localObject15 = (a7)arrayOfba2[i31];
                  localObject17 = new a7(((ba)localObject15).v(), ((ba)localObject15).jdMethod_long(), ((ba)localObject15).jdMethod_for(), ((ba)localObject15).z(), null, ((ba)localObject15).jdMethod_char(), parambe);
                  if (i20 == 1)
                  {
                    (localObject17 = new a7(s3, i39, 0, 0, null, 1, parambe)).a(a5.gg);
                    ((a7)localObject17).ft = true;
                    i50 = (short)(i24 % 1000);
                    ((a7)localObject17).jdMethod_if(i50, true);
                  }
                  else if (i20 == 2)
                  {
                    localObject17 = new a7(s3, i39, 0, 0, "exp.png", 1, parambe);
                  }
                  else if (i20 == 3)
                  {
                    localObject17 = new a7(s3, i39, 0, 0, "u-8.png", 1, parambe);
                  }
                  else if (i20 == 4)
                  {
                    localObject17 = new a7(s3, i39, 0, 0, "u-2.png", 1, parambe);
                  }
                  else if (i20 == 5)
                  {
                    localObject17 = new a7(s3, i39, 0, 0, "u-3.png", 1, parambe);
                  }
                  else if (i20 == 6)
                  {
                    localObject17 = new a7(s3, i39, 0, 0, "exp.png", 1, parambe);
                  }
                  else if (i20 == 7)
                  {
                    localObject17 = new a7(s3, i39, 0, 0, "cross.png", 1, parambe);
                  }
                  else if (i20 == 8)
                  {
                    localObject17 = new a7(s3, i39, 0, 0, "long.png", 1, parambe);
                  }
                  ((ba)localObject17).jdMethod_new((short)(s3 + localv3.jdMethod_if((byte)i31) + 1));
                  ((ba)localObject17).jdMethod_for((short)(i39 + i10 * i1 + (i1 - ((a7)localObject17).bE().a) / 2));
                  localObject7 = localObject17;
                }
                else if (i31 == 1)
                {
                  localObject15 = (ah)arrayOfba2[i31];
                  (localObject17 = new ah(((ba)localObject15).v(), ((ba)localObject15).jdMethod_long(), ((ba)localObject15).jdMethod_for(), ((ba)localObject15).z(), ((ah)localObject15).jdMethod_char(), ((ah)localObject15).aj(), parambe)).a2 = true;
                  ((ah)localObject17).aN = (short)((localObject2[i31] - 20) * a5.ic / 176);
                  ((ah)localObject17).a(str8);
                  i50 = 0;
                  if (localObject3[i31] != 0)
                    i50 = (short)((localObject2[i31] - ((ba)localObject17).jdMethod_for()) / 2);
                  ((ba)localObject17).jdMethod_new((short)((s3 + localv3.jdMethod_if((byte)i31) + i50 + 1) * a5.ic / 176));
                  ((ba)localObject17).jdMethod_for((short)(i39 + i10 * i1 + (i1 - a5.iG) / 2));
                  localObject7 = localObject17;
                }
                else
                {
                  b5.jdMethod_case("不正确的控件");
                }
                localv3.a((ba)localObject7);
              }
              parambg.jdMethod_if(localv3);
            }
            if (paramShort == 128)
              parambg.h0 = 10;
            parambg.cP();
          }
          else if (paramShort == 75)
          {
            j = paramDataInputStream.readByte();
            b5.jdMethod_case("USER_NPC_TABLE num = " + j);
            arrayOfba2 = new ba[2];
            localObject2 = (localObject1 = (v)parambg.cD().elementAt(0)).jdMethod_case();
            (localObject3 = new short[2])[0] = 1;
            localObject3[1] = 31;
            boolean[] arrayOfBoolean = ((v)localObject1).jdMethod_if();
            for (int i11 = 0; i11 < ((v)localObject1).a().size(); i11++)
              arrayOfba2[i11] = ((ba)((v)localObject1).a().elementAt(i11));
            i11 = ((v)localObject1).jdMethod_for();
            parambg.cE();
            for (i20 = 0; i20 < j; i20++)
            {
              String str4 = paramDataInputStream.readUTF();
              str8 = paramDataInputStream.readUTF();
              b5.jdMethod_case("---name= " + str4 + " leve = " + str8 + " ----");
              (localv3 = new v()).a(2);
              localv3.jdMethod_int(i11);
              localv3.a(localObject2);
              localv3.jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
              localv3.a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for() + i20 * i11));
              for (i31 = 0; i31 < 2; i31++)
              {
                localObject7 = null;
                s3 = (short)(parambg.v() + 3 + 1 + 1);
                i40 = (short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for());
                if ((localObject3[i31] == 1) && ((arrayOfba2[i31] instanceof ah)))
                {
                  localObject15 = (ah)arrayOfba2[i31];
                  (localObject17 = new ah(((ba)localObject15).v(), ((ba)localObject15).jdMethod_long(), ((ba)localObject15).jdMethod_for(), ((ba)localObject15).z(), ((ah)localObject15).jdMethod_char(), ((ah)localObject15).aj(), parambe)).a(str4);
                  i51 = 0;
                  if (arrayOfBoolean[i31] != 0)
                    i51 = (short)((localObject2[i31] - ((ba)localObject17).jdMethod_for()) / 2);
                  ((ba)localObject17).jdMethod_new((short)((s3 + localv3.jdMethod_if((byte)i31) + i51 + 1) * a5.ic / 176));
                  ((ba)localObject17).jdMethod_for((short)(i40 + i20 * i11 + (i11 - a5.iG) / 2));
                  ((ah)localObject17).a2 = true;
                  ((ah)localObject17).aN = (short)(localObject2[i31] * a5.ic / 176);
                  localObject7 = localObject17;
                }
                else if ((localObject3[i31] == 31) && ((arrayOfba2[i31] instanceof ah)))
                {
                  localObject15 = (ah)arrayOfba2[i31];
                  (localObject17 = new ah(((ba)localObject15).v(), ((ba)localObject15).jdMethod_long(), ((ba)localObject15).jdMethod_for(), ((ba)localObject15).z(), ((ah)localObject15).jdMethod_char(), ((ah)localObject15).aj(), parambe)).a(str8);
                  i51 = 0;
                  if (arrayOfBoolean[i31] != 0)
                    i51 = (short)((localObject2[i31] - ((ba)localObject17).jdMethod_for()) / 2);
                  ((ba)localObject17).jdMethod_new((short)((s3 + localv3.jdMethod_if((byte)i31) + i51 + 1) * a5.ic / 176));
                  ((ba)localObject17).jdMethod_for((short)(i40 + i20 * i11 + (i11 - a5.iG) / 2));
                  ((ah)localObject17).a2 = true;
                  ((ah)localObject17).aN = (short)(localObject2[i31] * a5.ic / 176);
                  localObject7 = localObject17;
                }
                else
                {
                  b5.jdMethod_case("不正确的控件");
                }
                localv3.a((ba)localObject7);
              }
              parambg.jdMethod_if(localv3);
            }
            parambg.cP();
          }
          else if (paramShort == 39)
          {
            parambg.a(null);
            be.hl = new int[j = paramDataInputStream.readByte()];
            be.hk = new int[j];
            be.gq = new byte[j];
            b5.jdMethod_case("USER_MAIL_TABLE num = " + j);
            arrayOfba2 = new ba[3];
            localObject2 = (localObject1 = (v)parambg.cD().elementAt(0)).jdMethod_case();
            localObject3 = null;
            for (int i2 = 0; i2 < ((v)localObject1).a().size(); i2++)
              arrayOfba2[i2] = ((ba)((v)localObject1).a().elementAt(i2));
            i2 = ((v)localObject1).jdMethod_for();
            parambg.cE();
            for (int i12 = 0; i12 < j; i12++)
            {
              long l1 = paramDataInputStream.readLong();
              i27 = paramDataInputStream.readByte();
              boolean bool2 = paramDataInputStream.readBoolean();
              String str10 = paramDataInputStream.readUTF();
              localObject7 = null;
              if (i27 == 0)
                localObject7 = "未读";
              else if (i27 == 1)
                localObject7 = "已读未回复";
              else if (i27 == 2)
                localObject7 = "已读并回复";
              b5.jdMethod_case("---邮件名 " + str10 + " 邮件ID " + l1 + " 是否阅读 " + (String)localObject7 + " 邮件类型 " + (bool2 ? "付费" : "普通") + " ----");
              v localv9;
              (localv9 = new v()).a(3);
              localv9.jdMethod_int(i2);
              localv9.a(localObject2);
              localv9.jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
              localv9.a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + i12 * i2));
              localv9.jdField_try = l1;
              for (i40 = 0; i40 < 3; i40++)
              {
                localObject15 = null;
                int i47 = (short)(parambg.v() + 3 + 1 + 1);
                i51 = (short)(parambg.jdMethod_long() + 1 + 1 + 1);
                Object localObject21;
                if (i40 == 0)
                {
                  localObject20 = (a7)arrayOfba2[i40];
                  localObject21 = new a7(((ba)localObject20).v(), ((ba)localObject20).jdMethod_long(), ((ba)localObject20).jdMethod_for(), ((ba)localObject20).z(), null, ((ba)localObject20).jdMethod_char(), parambe);
                  if (i27 == 0)
                    be.gq[i12] = 1;
                  else if (i27 == 1)
                    be.gq[i12] = 2;
                  else if (i27 == 2)
                    be.gq[i12] = 3;
                  ((a7)localObject21).eT = true;
                  be.hl[i12] = (i47 + localv9.jdMethod_if((byte)i40) + 4);
                  be.hk[i12] = (i51 + i12 * i2 + (i2 - 13) / 2 + 5);
                  localObject15 = localObject21;
                }
                else if (i40 == 1)
                {
                  localObject20 = (ah)arrayOfba2[i40];
                  localObject21 = new ah(((ba)localObject20).v(), ((ba)localObject20).jdMethod_long(), ((ba)localObject20).jdMethod_for(), ((ba)localObject20).z(), ((ah)localObject20).jdMethod_char(), ((ah)localObject20).aj(), parambe);
                  if (bool2)
                    ((ah)localObject21).a("付费");
                  else
                    ((ah)localObject21).a("普通");
                  ((ba)localObject21).jdMethod_new((short)(i47 + (localv9.jdMethod_if((byte)i40) + 1) * a5.ic / 176));
                  ((ba)localObject21).jdMethod_for((short)(i51 + i12 * i2 + (i2 - a5.iG) / 2));
                  localObject15 = localObject21;
                }
                else if (i40 == 2)
                {
                  localObject20 = (ah)arrayOfba2[i40];
                  (localObject21 = new ah(((ba)localObject20).v(), ((ba)localObject20).jdMethod_long(), ((ba)localObject20).jdMethod_for(), ((ba)localObject20).z(), ((ah)localObject20).jdMethod_char(), ((ah)localObject20).aj(), parambe)).a(str10);
                  ((ba)localObject21).jdMethod_new((short)(i47 + (localv9.jdMethod_if((byte)i40) + 1) * a5.ic / 176));
                  ((ba)localObject21).jdMethod_for((short)(i51 + i12 * i2 + (i2 - a5.iG) / 2));
                  localObject15 = localObject21;
                }
                else
                {
                  b5.jdMethod_case("不正确的控件");
                }
                localv9.a((ba)localObject15);
              }
              parambg.jdMethod_if(localv9);
            }
            parambg.h0 = 6;
            parambg.cP();
          }
        }
      }
    }
    label5922: String str2;
    ah localah4;
    if (paramShort == 162)
    {
      j = paramDataInputStream.readByte();
      arrayOfba2 = new ba[3];
      localObject2 = (localObject1 = (v)parambg.cD().elementAt(0)).jdMethod_case();
      localObject3 = null;
      for (int i3 = 0; i3 < ((v)localObject1).a().size(); i3++)
        arrayOfba2[i3] = ((ba)((v)localObject1).a().elementAt(i3));
      i3 = ((v)localObject1).jdMethod_for();
      parambg.cE();
      for (int i13 = 0; i13 < j; i13++)
      {
        str2 = paramDataInputStream.readUTF();
        int i25 = paramDataInputStream.readInt();
        i27 = paramDataInputStream.readInt();
        v localv4;
        (localv4 = new v()).a(3);
        localv4.jdMethod_int(i3);
        localv4.a(localObject2);
        localv4.jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
        localv4.a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for() + i13 * i3));
        localv4.jdField_else = true;
        for (int i32 = 0; i32 < 3; i32++)
        {
          localObject7 = null;
          int i36 = (short)(parambg.v() + 3 + 1 + 1);
          i40 = (short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for());
          if (i32 == 0)
          {
            localObject15 = (ah)arrayOfba2[i32];
            (localah4 = new ah(((ba)localObject15).v(), ((ba)localObject15).jdMethod_long(), ((ba)localObject15).jdMethod_for(), ((ba)localObject15).z(), ((ah)localObject15).jdMethod_char(), ((ah)localObject15).aj(), parambe)).a2 = true;
            localah4.aN = (short)(localObject2[i32] * a5.ic / 176);
            localah4.a(str2);
            i51 = a5.d8 ? -2 : 3;
            localah4.jdMethod_new((short)((i36 + localv4.jdMethod_if((byte)i32) + i51) * a5.ic / 176));
            localah4.jdMethod_for((short)(i40 + i13 * i3 + (i3 - a5.iG) / 2));
            localObject7 = localah4;
          }
          else if (i32 == 1)
          {
            localObject15 = (ah)arrayOfba2[i32];
            (localah4 = new ah(((ba)localObject15).v(), ((ba)localObject15).jdMethod_long(), ((ba)localObject15).jdMethod_for(), ((ba)localObject15).z(), ((ah)localObject15).jdMethod_char(), ((ah)localObject15).aj(), parambe)).a(i25 + "");
            localah4.jdMethod_new((short)((i36 + localv4.jdMethod_if((byte)i32) + 3) * a5.ic / 176));
            localah4.jdMethod_for((short)(i40 + i13 * i3 + (i3 - a5.iG) / 2));
            localObject7 = localah4;
          }
          else if (i32 == 2)
          {
            localObject15 = (ah)arrayOfba2[i32];
            (localah4 = new ah(((ba)localObject15).v(), ((ba)localObject15).jdMethod_long(), ((ba)localObject15).jdMethod_for(), ((ba)localObject15).z(), ((ah)localObject15).jdMethod_char(), ((ah)localObject15).aj(), parambe)).a2 = true;
            localah4.aN = (short)(localObject2[i32] * a5.ic / 176);
            localah4.a(i27 + "");
            i51 = a5.d8 ? -2 : 3;
            localah4.jdMethod_new((short)((i36 + localv4.jdMethod_if((byte)i32) + i51) * a5.ic / 176));
            localah4.jdMethod_for((short)(i40 + i13 * i3 + (i3 - a5.iG) / 2));
            localObject7 = localah4;
          }
          else
          {
            b5.jdMethod_case("不正确的控件");
          }
          localv4.a((ba)localObject7);
        }
        parambg.jdMethod_if(localv4);
      }
      parambg.cN();
      parambg.cS();
      parambg.cP();
      return;
    }
    String str5;
    int i44;
    Object localObject19;
    if (paramShort == 159)
    {
      j = paramDataInputStream.readByte();
      b5.jdMethod_case("USER_CLAN_MEMBER_TABLE num = " + j);
      arrayOfba2 = new ba[3];
      localObject2 = (localObject1 = (v)parambg.cD().elementAt(0)).jdMethod_case();
      localObject3 = null;
      for (int i4 = 0; i4 < ((v)localObject1).a().size(); i4++)
        arrayOfba2[i4] = ((ba)((v)localObject1).a().elementAt(i4));
      i4 = ((v)localObject1).jdMethod_for();
      parambg.cE();
      for (int i14 = 0; i14 < j; i14++)
      {
        str2 = paramDataInputStream.readUTF();
        str5 = paramDataInputStream.readUTF();
        i27 = paramDataInputStream.readInt();
        boolean bool3 = paramDataInputStream.readBoolean();
        v localv8;
        (localv8 = new v()).a(3);
        localv8.jdMethod_int(i4);
        localv8.a(localObject2);
        localv8.jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
        localv8.a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for() + i14 * i4));
        localv8.jdField_else = true;
        for (int i34 = 0; i34 < 3; i34++)
        {
          Object localObject10 = null;
          i40 = (short)(parambg.v() + 3 + 1 + 1);
          i44 = (short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for());
          if (i34 == 0)
          {
            localah4 = (ah)arrayOfba2[i34];
            (localObject19 = new ah(localah4.v(), localah4.jdMethod_long(), localah4.jdMethod_for(), localah4.z(), localah4.jdMethod_char(), localah4.aj(), parambe)).a(str2);
            ((ba)localObject19).jdMethod_new((short)((i40 + localv8.jdMethod_if((byte)i34) + 3) * a5.ic / 176));
            ((ba)localObject19).jdMethod_for((short)(i44 + i14 * i4 + (i4 - a5.iG) / 2));
            localObject10 = localObject19;
          }
          else if (i34 == 1)
          {
            localah4 = (ah)arrayOfba2[i34];
            (localObject19 = new ah(localah4.v(), localah4.jdMethod_long(), localah4.jdMethod_for(), localah4.z(), localah4.jdMethod_char(), localah4.aj(), parambe)).a(str5);
            ((ba)localObject19).jdMethod_new((short)((i40 + localv8.jdMethod_if((byte)i34) + 3) * a5.ic / 176));
            ((ba)localObject19).jdMethod_for((short)(i44 + i14 * i4 + (i4 - a5.iG) / 2));
            localObject10 = localObject19;
          }
          else if (i34 == 2)
          {
            localah4 = (ah)arrayOfba2[i34];
            localObject19 = new ah(localah4.v(), localah4.jdMethod_long(), localah4.jdMethod_for(), localah4.z(), localah4.jdMethod_char(), localah4.aj(), parambe);
            localObject20 = bool3 ? "有" : "无";
            ((ah)localObject19).a((String)localObject20);
            ((ba)localObject19).jdMethod_new((short)((i40 + localv8.jdMethod_if((byte)i34) + 3) * a5.ic / 176));
            ((ba)localObject19).jdMethod_for((short)(i44 + i14 * i4 + (i4 - a5.iG) / 2));
            localObject10 = localObject19;
          }
          else
          {
            b5.jdMethod_case("不正确的控件");
          }
          localv8.jdField_new = i27;
          localv8.a(localObject10);
        }
        parambg.jdMethod_if(localv8);
      }
      parambg.cN();
      parambg.cS();
      parambg.h0 = 7;
      parambg.cP();
      return;
    }
    int i5;
    int i21;
    String str9;
    boolean bool4;
    Object localObject8;
    int i37;
    int i54;
    if ((paramShort == 54) || (paramShort == 64))
    {
      j = paramDataInputStream.readByte();
      b5.jdMethod_case("USER_CLAN_MEMBER_TABLE num = " + j);
      arrayOfba2 = new ba[3];
      localObject2 = (localObject1 = (v)parambg.cD().elementAt(0)).jdMethod_case();
      localObject3 = ((v)localObject1).jdMethod_if();
      for (i5 = 0; i5 < ((v)localObject1).a().size(); i5++)
        arrayOfba2[i5] = ((ba)((v)localObject1).a().elementAt(i5));
      i5 = ((v)localObject1).jdMethod_for();
      parambg.cE();
      for (int i15 = 0; i15 < j; i15++)
      {
        i21 = paramDataInputStream.readByte();
        str5 = paramDataInputStream.readUTF();
        str9 = paramDataInputStream.readUTF();
        int i29 = paramDataInputStream.readInt();
        bool4 = paramDataInputStream.readBoolean();
        (localObject8 = new v()).a(3);
        ((v)localObject8).jdMethod_int((short)(i5 + 6));
        ((v)localObject8).a(localObject2);
        ((v)localObject8).jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
        ((v)localObject8).a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for() + i15 * i5));
        ((v)localObject8).jdField_else = bool4;
        for (i37 = 0; i37 < 3; i37++)
        {
          Object localObject12 = null;
          i44 = (short)(parambg.v() + 3 + 1 + 1);
          int i48 = (short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for());
          if (i37 == 0)
          {
            localObject19 = (a7)arrayOfba2[i37];
            (localObject20 = new a7(((ba)localObject19).v(), ((ba)localObject19).jdMethod_long(), ((ba)localObject19).jdMethod_for(), ((ba)localObject19).z(), null, ((ba)localObject19).jdMethod_char(), parambe)).eT = true;
            ((a7)localObject20).ei = i21;
            ((a7)localObject20).a(a5.hL);
            i54 = 0;
            if (localObject3[i37] != 0)
              i54 = (short)((localObject2[i37] - ((a7)localObject20).bE().jdField_try) / 2);
            ((ba)localObject20).jdMethod_new((short)(i44 + ((v)localObject8).jdMethod_if((byte)i37) + i54 + 1));
            ((ba)localObject20).jdMethod_for((short)(i48 + i15 * i5 + (i5 - ((a7)localObject20).bE().a) / 2));
            localObject12 = localObject20;
          }
          else if (i37 == 1)
          {
            localObject19 = (ah)arrayOfba2[i37];
            (localObject20 = new ah(((ba)localObject19).v(), ((ba)localObject19).jdMethod_long(), ((ba)localObject19).jdMethod_for(), ((ba)localObject19).z(), ((ah)localObject19).jdMethod_char(), ((ah)localObject19).aj(), parambe)).a(str5);
            ((ba)localObject20).jdMethod_new((short)(i44 + (((v)localObject8).jdMethod_if((byte)i37) + 3) * a5.ic / 176));
            ((ba)localObject20).jdMethod_for((short)(i48 + i15 * i5 + (i5 - a5.iG) / 2));
            localObject12 = localObject20;
          }
          else if (i37 == 2)
          {
            localObject19 = (ah)arrayOfba2[i37];
            (localObject20 = new ah(((ba)localObject19).v(), ((ba)localObject19).jdMethod_long(), ((ba)localObject19).jdMethod_for(), ((ba)localObject19).z(), ((ah)localObject19).jdMethod_char(), ((ah)localObject19).aj(), parambe)).a(str9);
            ((ba)localObject20).jdMethod_new((short)(i44 + (((v)localObject8).jdMethod_if((byte)i37) + 3) * a5.ic / 176));
            ((ba)localObject20).jdMethod_for((short)(i48 + i15 * i5 + (i5 - a5.iG) / 2));
            ((ah)localObject20).a2 = true;
            ((ah)localObject20).aN = (short)(localObject2[i37] * a5.ic / 176);
            localObject12 = localObject20;
          }
          else
          {
            b5.jdMethod_case("不正确的控件");
          }
          ((v)localObject8).jdField_new = i29;
          ((v)localObject8).a(localObject12);
        }
        parambg.jdMethod_if((v)localObject8);
      }
      parambg.cN();
      parambg.cS();
      parambg.h0 = 7;
      parambg.cP();
      return;
    }
    if (paramShort == 153)
    {
      j = paramDataInputStream.readByte();
      b5.jdMethod_case("USER_ACT_TABLE num = " + j);
      arrayOfba2 = new ba[2];
      localObject2 = (localObject1 = (v)parambg.cD().elementAt(0)).jdMethod_case();
      localObject3 = null;
      for (i5 = 0; i5 < ((v)localObject1).a().size(); i5++)
        arrayOfba2[i5] = ((ba)((v)localObject1).a().elementAt(i5));
      i5 = ((v)localObject1).jdMethod_for();
      parambg.cE();
      for (int i16 = 0; i16 < j; i16++)
      {
        i21 = paramDataInputStream.readInt();
        str5 = paramDataInputStream.readUTF();
        str9 = paramDataInputStream.readUTF();
        v localv5;
        (localv5 = new v()).jdField_new = i21;
        localv5.a(2);
        localv5.jdMethod_int(i5);
        localv5.a(localObject2);
        localv5.jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
        localv5.a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for() + i16 * i5));
        for (bool4 = false; bool4 < true; bool4++)
        {
          localObject8 = null;
          i37 = (short)(parambg.v() + 3 + 1 + 1);
          int i41 = (short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for());
          ah localah2;
          ah localah5;
          if (!bool4)
          {
            localah2 = (ah)arrayOfba2[bool4];
            (localah5 = new ah(localah2.v(), localah2.jdMethod_long(), localah2.jdMethod_for(), localah2.z(), localah2.jdMethod_char(), localah2.aj(), parambe)).a2 = true;
            localah5.aN = (short)(localObject2[bool4] * a5.ic / 176);
            localah5.a(str5);
            localah5.jdMethod_new((short)(i37 + (localv5.jdMethod_if((byte)bool4) + 3) * a5.ic / 176));
            localah5.jdMethod_for((short)(i41 + i16 * i5 + (i5 - a5.iG) / 2));
            localObject8 = localah5;
          }
          else if (bool4 == true)
          {
            localah2 = (ah)arrayOfba2[bool4];
            (localah5 = new ah(localah2.v(), localah2.jdMethod_long(), localah2.jdMethod_for(), localah2.z(), localah2.jdMethod_char(), localah2.aj(), parambe)).a2 = true;
            localah5.aN = (short)((localObject2[bool4] - 24) * a5.ic / 176);
            localah5.a(str9);
            localah5.jdMethod_new((short)(i37 + (localv5.jdMethod_if((byte)bool4) + 3) * a5.ic / 176));
            localah5.jdMethod_for((short)(i41 + i16 * i5 + (i5 - a5.iG) / 2));
            localObject8 = localah5;
          }
          else
          {
            b5.jdMethod_case("不正确的控件");
          }
          localv5.a((ba)localObject8);
        }
        parambg.jdMethod_if(localv5);
      }
      parambg.h0 = 14;
      parambg.cP();
      return;
    }
    if (paramShort == 169)
    {
      j = paramDataInputStream.readByte();
      arrayOfba2 = new ba[3];
      localObject2 = (localObject1 = (v)parambg.cD().elementAt(0)).jdMethod_case();
      localObject3 = ((v)localObject1).jdMethod_if();
      for (int i6 = 0; i6 < ((v)localObject1).a().size(); i6++)
        arrayOfba2[i6] = ((ba)((v)localObject1).a().elementAt(i6));
      i6 = ((v)localObject1).jdMethod_for();
      parambg.cE();
      for (int i17 = 0; i17 < j; i17++)
      {
        i21 = paramDataInputStream.readInt();
        str5 = paramDataInputStream.readUTF();
        str9 = paramDataInputStream.readUTF();
        long l2 = paramDataInputStream.readLong();
        (localObject8 = new v()).jdField_for = l2;
        ((v)localObject8).a(3);
        ((v)localObject8).jdMethod_int(i6);
        ((v)localObject8).a(localObject2);
        ((v)localObject8).jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
        ((v)localObject8).a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for() + i17 * i6));
        for (i37 = 0; i37 < 3; i37++)
        {
          Object localObject13 = null;
          int i45 = (short)(parambg.v() + 3 + 1 + 1);
          int i49 = (short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for());
          if (i37 == 0)
          {
            localObject19 = (ah)arrayOfba2[i37];
            (localObject20 = new ah(((ba)localObject19).v(), ((ba)localObject19).jdMethod_long(), ((ba)localObject19).jdMethod_for(), ((ba)localObject19).z(), ((ah)localObject19).jdMethod_char(), ((ah)localObject19).aj(), parambe)).a2 = true;
            ((ah)localObject20).aN = (short)(localObject2[i37] * a5.ic / 176);
            ((ah)localObject20).a("" + i21);
            i54 = 0;
            if (localObject3[i37] != 0)
              i54 = (short)((localObject2[i37] - ((ba)localObject20).jdMethod_for()) / 2);
            ((ba)localObject20).jdMethod_new((short)(i45 + (((v)localObject8).jdMethod_if((byte)i37) + i54) * a5.ic / 176 + 3));
            ((ba)localObject20).jdMethod_for((short)(i49 + i17 * i6 + (i6 - a5.iG) / 2));
            localObject13 = localObject20;
          }
          else if (i37 == 1)
          {
            localObject19 = (ah)arrayOfba2[i37];
            (localObject20 = new ah(((ba)localObject19).v(), ((ba)localObject19).jdMethod_long(), ((ba)localObject19).jdMethod_for(), ((ba)localObject19).z(), ((ah)localObject19).jdMethod_char(), ((ah)localObject19).aj(), parambe)).a2 = true;
            ((ah)localObject20).aN = (short)((localObject2[i37] - 24) * a5.ic / 176);
            ((ah)localObject20).a(str5);
            i54 = 0;
            if (localObject3[i37] != 0)
              i54 = (short)((localObject2[i37] - ((ba)localObject20).jdMethod_for()) / 2);
            ((ba)localObject20).jdMethod_new((short)(i45 + (((v)localObject8).jdMethod_if((byte)i37) + i54) * a5.ic / 176 + 3));
            ((ba)localObject20).jdMethod_for((short)(i49 + i17 * i6 + (i6 - a5.iG) / 2));
            localObject13 = localObject20;
          }
          else if (i37 == 2)
          {
            localObject19 = (ah)arrayOfba2[i37];
            (localObject20 = new ah(((ba)localObject19).v(), ((ba)localObject19).jdMethod_long(), ((ba)localObject19).jdMethod_for(), ((ba)localObject19).z(), ((ah)localObject19).jdMethod_char(), ((ah)localObject19).aj(), parambe)).a2 = true;
            ((ah)localObject20).aN = (short)((localObject2[i37] - 24) * a5.ic / 176);
            ((ah)localObject20).a(str9);
            ((ba)localObject20).jdMethod_new((short)(i45 + (((v)localObject8).jdMethod_if((byte)i37) + 3) * a5.ic / 176));
            ((ba)localObject20).jdMethod_for((short)(i49 + i17 * i6 + (i6 - a5.iG) / 2));
            localObject13 = localObject20;
          }
          else
          {
            b5.jdMethod_case("不正确的控件");
          }
          ((v)localObject8).a(localObject13);
        }
        parambg.jdMethod_if((v)localObject8);
      }
      parambg.h0 = 19;
      parambg.cP();
      return;
    }
    if (paramShort == 176)
    {
      j = paramDataInputStream.readByte();
      b5.jdMethod_case("USER_CLAN_FIGHT_TABLE num = " + j);
      arrayOfba2 = new ba[2];
      localObject2 = (localObject1 = (v)parambg.cD().elementAt(0)).jdMethod_case();
      for (int i7 = 0; i7 < ((v)localObject1).a().size(); i7++)
        arrayOfba2[i7] = ((ba)((v)localObject1).a().elementAt(i7));
      i7 = ((v)localObject1).jdMethod_for();
      parambg.cE();
      for (int i18 = 0; i18 < j; i18++)
      {
        i21 = paramDataInputStream.readInt();
        str5 = paramDataInputStream.readUTF();
        str9 = paramDataInputStream.readUTF();
        v localv6;
        (localv6 = new v()).a(3);
        localv6.jdMethod_int(i7);
        localv6.a(localObject2);
        localv6.jdMethod_if((short)(parambg.v() + 3 + 1 + 1));
        localv6.a((short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for() + i18 * i7));
        for (bool4 = false; bool4 < true; bool4++)
        {
          localObject8 = null;
          i37 = (short)(parambg.v() + 3 + 1 + 1);
          int i42 = (short)(parambg.jdMethod_long() + 1 + 1 + 1 + parambg.cI().jdMethod_for());
          ah localah3;
          ah localah6;
          if (!bool4)
          {
            localah3 = (ah)arrayOfba2[bool4];
            (localah6 = new ah(localah3.v(), localah3.jdMethod_long(), localah3.jdMethod_for(), localah3.z(), localah3.jdMethod_char(), localah3.aj(), parambe)).a(str5);
            localah6.jdMethod_new((short)(i37 + (localv6.jdMethod_if((byte)bool4) + 5) * a5.ic / 176));
            localah6.jdMethod_for((short)(i42 + i18 * i7 + (i7 - a5.iG) / 2));
            localObject8 = localah6;
          }
          else if (bool4 == true)
          {
            localah3 = (ah)arrayOfba2[bool4];
            (localah6 = new ah(localah3.v(), localah3.jdMethod_long(), localah3.jdMethod_for(), localah3.z(), localah3.jdMethod_char(), localah3.aj(), parambe)).a(str9);
            localah6.jdMethod_new((short)(i37 + (localv6.jdMethod_if((byte)bool4) + 5) * a5.ic / 176));
            localah6.jdMethod_for((short)(i42 + i18 * i7 + (i7 - a5.iG) / 2));
            localObject8 = localah6;
          }
          else
          {
            b5.jdMethod_case("不正确的控件");
          }
          localv6.jdField_new = i21;
          localv6.a((ba)localObject8);
        }
        parambg.jdMethod_if(localv6);
      }
      parambg.h0 = 20;
      parambg.cP();
    }
  }

  private static void a$470cfd82(DataInputStream paramDataInputStream, short paramShort, ah paramah, be parambe)
    throws IOException
  {
    if ((paramShort == 1) && (paramah.jdMethod_char() == 0))
    {
      paramShort = paramDataInputStream.readUTF();
      ah localah;
      if ((parambe.g9 == 393219) && ((localah = (ah)parambe.cf().elementAt(7)) == paramah))
      {
        paramDataInputStream = localah.jdMethod_for();
        localah.a2 = true;
        localah.aC = true;
        localah.aN = (short)(paramDataInputStream * a5.ic / 176);
      }
      paramah.a(paramShort);
      if (parambe.g9 == 2293873)
      {
        paramah.jdMethod_new((short)(a5.ic >> 1));
        paramah.jdMethod_void(true);
      }
      return;
    }
    short s;
    if (paramShort == 116)
    {
      b5.jdMethod_case("in parse USER_COLOR_STR");
      paramShort = paramDataInputStream.readUTF();
      s = paramDataInputStream.readByte();
      paramah.a(paramShort);
      paramah.jdMethod_char(r.E(s));
      return;
    }
    if ((paramShort == 73) && (paramah.jdMethod_char() == 0))
    {
      paramShort = paramDataInputStream.readInt();
      b5.jdMethod_case("textGroup.length = " + paramShort);
      for (s = 0; s < paramShort; s++)
      {
        paramah.a1 = b5.a(paramah.a1, s, paramDataInputStream.readUTF());
        b5.jdMethod_case("textGroup[" + s + "] = " + paramah.a1[s]);
      }
      paramah.a(paramah.a1[0]);
      return;
    }
    if ((paramShort == 3) && (paramah.jdMethod_char() == 3))
    {
      paramShort = paramDataInputStream.readShort();
      b5.jdMethod_case("labelNum = " + paramShort);
      paramah.jdMethod_case(paramShort);
      return;
    }
    if ((paramShort == 3) && (paramah.jdMethod_char() == 0))
    {
      paramShort = paramDataInputStream.readShort();
      b5.jdMethod_case("labelNum = " + paramShort);
      paramah.a(paramShort + "");
      return;
    }
    if ((paramShort == 4) && (paramah.jdMethod_char() == 3))
    {
      paramShort = paramDataInputStream.readInt();
      if (((a5.es.g9 == 2424995) || (a5.es.g9 == 2424839) || (a5.es.g9 == 2425079)) && ((bo.q == 3) || (bo.q == 8)))
      {
        String str = "" + paramShort / 10 + "." + paramShort % 10 + "元";
        paramah.a(0);
        paramah.a(str);
      }
      else
      {
        paramah.jdMethod_case(paramShort);
        return;
      }
    }
    else
    {
      if ((paramShort == 4) && (paramah.jdMethod_char() == 0))
      {
        paramShort = paramDataInputStream.readInt();
        paramah.a(paramShort + "");
        b5.jdMethod_case("---------------------labelNum-----------------------------=" + paramShort);
        return;
      }
      if ((paramShort == 2) && (paramah.jdMethod_char() == 2))
      {
        paramShort = paramDataInputStream.readInt();
        int i = paramDataInputStream.readInt();
        paramah.jdMethod_case(paramShort);
        paramah.jdMethod_byte(i);
        b5.jdMethod_case("----------num1---------=" + paramShort);
        b5.jdMethod_case("----------num2---------=" + i);
        if (a5.es.g9 == 2228225)
          aj.for = (byte)paramShort;
        return;
      }
      if ((paramShort == 1) && (paramah.jdMethod_char() == 1))
      {
        paramShort = paramDataInputStream.readUTF();
        paramah.a(paramShort);
        if ((a5.es.g9 == 458753) || (a5.es.g9 == 917507) || (a5.es.g9 == 983041) || (a5.es.g9 == 1179650) || (a5.es.g9 == 1900552) || (a5.es.g9 == 1376267) || (a5.es.g9 == 393231) || (a5.es.g9 == 655363) || (a5.es.g9 == 1769475) || (a5.es.g9 == 1703948) || (a5.es.g9 == 2031617) || (a5.es.g9 == 2031635) || (a5.es.g9 == 2228231) || (a5.es.g9 == 1966113) || (a5.es.g9 == 1966093) || (a5.es.g9 == 1966087) || (a5.es.g9 == 1966100))
        {
          if (r.mg == 16777215)
            r.mg = bm.bP;
          paramah.jdMethod_char(r.mg);
        }
        return;
      }
      if ((paramShort == 4) && (paramah.jdMethod_char() == 4))
      {
        paramShort = paramDataInputStream.readInt();
        paramah.a(Integer.toString(paramShort));
        return;
      }
      if ((paramShort == 1) && (paramah.jdMethod_char() == 4))
      {
        paramShort = paramDataInputStream.readUTF();
        paramah.a(paramShort);
      }
    }
  }

  private static void a$571480af(DataInputStream paramDataInputStream, short paramShort, bv parambv)
    throws IOException
  {
    int i;
    int k;
    String str1;
    if ((paramShort == 130) || (paramShort == 137))
    {
      parambv.dy();
      i = paramDataInputStream.readByte();
      for (k = 0; k < i; k++)
      {
        str1 = paramDataInputStream.readUTF();
        m localm2 = new m(str1, 0, 0, parambv.dF());
        parambv.a(localm2);
      }
      bv.a(parambv, 0);
      return;
    }
    boolean bool1;
    if (paramShort == 155)
    {
      parambv.dy();
      i = paramDataInputStream.readByte();
      for (k = 0; k < i; k++)
      {
        str1 = paramDataInputStream.readUTF();
        bool1 = paramDataInputStream.readBoolean();
        int i15 = paramDataInputStream.readInt();
        m localm7;
        (localm7 = new m(str1, 7, 0, parambv.dF())).jdMethod_if(bool1);
        localm7.J = i15;
        parambv.a(localm7);
      }
      bv.a(parambv, 0);
      return;
    }
    m localm3;
    if (paramShort == 157)
    {
      parambv.dy();
      i = paramDataInputStream.readByte();
      for (k = 0; k < i; k++)
      {
        str1 = paramDataInputStream.readUTF();
        bool1 = paramDataInputStream.readBoolean();
        (localm3 = new m(str1, 7, 0, parambv.dF())).jdMethod_if(bool1);
        parambv.a(localm3);
      }
      bv.a(parambv, 0);
      return;
    }
    int i6;
    String str5;
    if ((paramShort == 129) || (paramShort == 149))
    {
      parambv.dy();
      parambv.j7 = paramDataInputStream.readByte();
      i = paramDataInputStream.readByte();
      for (k = 0; k < i; k++)
      {
        i6 = paramDataInputStream.readInt();
        str5 = paramDataInputStream.readUTF();
        (localm3 = new m(str5, 0, 0, parambv.dF())).q = i6;
        parambv.a(localm3);
      }
      if (paramShort == 129)
        parambv.jE = 70;
      else if (paramShort == 149)
        parambv.jE = 82;
      bv.a(parambv, 0);
      return;
    }
    if (paramShort == 154)
    {
      parambv.dy();
      i = paramDataInputStream.readByte();
      for (k = 0; k < i; k++)
      {
        i6 = paramDataInputStream.readInt();
        str5 = paramDataInputStream.readUTF();
        short s1 = paramDataInputStream.readShort();
        short s2 = paramDataInputStream.readShort();
        m localm10;
        (localm10 = new m(str5, 0, 0, parambv.dF())).K = s1;
        localm10.I = s2;
        localm10.q = i6;
        parambv.a(localm10);
      }
      parambv.jE = 86;
    }
    else
    {
      Object localObject8;
      if ((paramShort == 77) || (paramShort == 84) || (paramShort == 91) || (paramShort == 98) || (paramShort == 105) || (paramShort == 111) || (paramShort == 117) || (paramShort == 122) || (paramShort == 138) || (paramShort == 143))
      {
        parambv.dy();
        bb.byte = i = paramDataInputStream.readByte();
        for (k = 0; k < i; k++)
        {
          i6 = paramDataInputStream.readByte();
          str5 = paramDataInputStream.readUTF();
          (localObject8 = new m(str5, 0, 0, parambv.dF())).Y = i6;
          parambv.a((m)localObject8);
        }
        if (paramShort == 77)
          parambv.jE = 31;
        else if (paramShort == 84)
          parambv.jE = 37;
        else if (paramShort == 91)
          parambv.jE = 43;
        else if (paramShort == 98)
          parambv.jE = 49;
        else if (paramShort == 105)
          parambv.jE = 55;
        else if (paramShort == 111)
          parambv.jE = 59;
        else if (paramShort == 117)
          parambv.jE = 62;
        else if (paramShort == 122)
          parambv.jE = 66;
        else if (paramShort == 138)
          parambv.jE = 74;
        else if (paramShort == 143)
          parambv.jE = 78;
        bv.a(parambv, 0);
        return;
      }
      if ((paramShort == 78) || (paramShort == 85) || (paramShort == 92) || (paramShort == 99) || (paramShort == 106) || (paramShort == 112) || (paramShort == 118) || (paramShort == 123) || (paramShort == 139) || (paramShort == 144))
      {
        parambv.dy();
        i = paramDataInputStream.readByte();
        for (k = 0; k < i; k++)
        {
          i6 = paramDataInputStream.readByte();
          str5 = paramDataInputStream.readUTF();
          (localObject8 = new m(str5, 0, 0, parambv.dF())).Y = i6;
          parambv.a((m)localObject8);
        }
        if (paramShort == 78)
          parambv.jE = 32;
        else if (paramShort == 85)
          parambv.jE = 38;
        else if (paramShort == 92)
          parambv.jE = 44;
        else if (paramShort == 99)
          parambv.jE = 50;
        else if (paramShort == 106)
          parambv.jE = 56;
        else if (paramShort == 112)
          parambv.jE = 60;
        else if (paramShort == 118)
          parambv.jE = 63;
        else if (paramShort == 123)
          parambv.jE = 67;
        else if (paramShort == 139)
          parambv.jE = 75;
        else if (paramShort == 144)
          parambv.jE = 79;
        bv.a(parambv, 0);
        return;
      }
      if ((paramShort == 79) || (paramShort == 82) || (paramShort == 86) || (paramShort == 87) || (paramShort == 93) || (paramShort == 94) || (paramShort == 100) || (paramShort == 101) || (paramShort == 141) || (paramShort == 146))
      {
        parambv.dy();
        i = paramDataInputStream.readByte();
        for (k = 0; k < i; k++)
        {
          i6 = paramDataInputStream.readInt();
          str5 = paramDataInputStream.readUTF();
          (localObject8 = new m(str5, 0, 0, parambv.dF())).q = i6;
          parambv.a((m)localObject8);
        }
        if (paramShort == 79)
          parambv.jE = 33;
        else if (paramShort == 82)
          parambv.jE = 35;
        else if (paramShort == 86)
          parambv.jE = 39;
        else if (paramShort == 87)
          parambv.jE = 40;
        else if (paramShort == 93)
          parambv.jE = 45;
        else if (paramShort == 94)
          parambv.jE = 46;
        else if (paramShort == 100)
          parambv.jE = 51;
        else if (paramShort == 101)
          parambv.jE = 52;
        bv.a(parambv, 0);
        return;
      }
      if ((paramShort == 80) || (paramShort == 89) || (paramShort == 96) || (paramShort == 103) || (paramShort == 108) || (paramShort == 121) || (paramShort == 125) || (paramShort == 141) || (paramShort == 146))
      {
        parambv.dy();
        i = paramDataInputStream.readByte();
        for (k = 0; k < i; k++)
        {
          i6 = paramDataInputStream.readInt();
          str5 = paramDataInputStream.readUTF();
          (localObject8 = new m(str5, 0, 0, parambv.dF())).q = i6;
          parambv.a((m)localObject8);
        }
        if (paramShort == 80)
          parambv.jE = 34;
        else if (paramShort == 89)
          parambv.jE = 42;
        else if (paramShort == 96)
          parambv.jE = 48;
        else if (paramShort == 103)
          parambv.jE = 54;
        else if (paramShort == 108)
          parambv.jE = 58;
        else if (paramShort == 121)
          parambv.jE = 65;
        else if (paramShort == 125)
          parambv.jE = 69;
        else if (paramShort == 141)
          parambv.jE = 77;
        else if (paramShort == 146)
          parambv.jE = 81;
        bv.a(parambv, 0);
        return;
      }
      if ((paramShort == 83) || (paramShort == 88) || (paramShort == 95) || (paramShort == 102) || (paramShort == 107) || (paramShort == 113) || (paramShort == 119) || (paramShort == 124) || (paramShort == 140) || (paramShort == 145))
      {
        parambv.dy();
        i = paramDataInputStream.readByte();
        for (k = 0; k < i; k++)
        {
          i6 = paramDataInputStream.readByte();
          int i12 = paramDataInputStream.readInt();
          localObject8 = paramDataInputStream.readUTF();
          m localm8 = new m((String)localObject8, 1, 0, parambv.dF());
          byte b4 = -1;
          switch (i6)
          {
          case 0:
            b4 = 6;
            break;
          case 1:
            b4 = 7;
            break;
          case 2:
            b4 = 5;
            break;
          case 3:
            b4 = 8;
          }
          b5.jdMethod_case("锻造成功率：" + b4);
          localm8.jdMethod_int(b4);
          localm8.q = i12;
          parambv.a(localm8);
        }
        if (paramShort == 83)
          parambv.jE = 36;
        else if (paramShort == 88)
          parambv.jE = 41;
        else if (paramShort == 95)
          parambv.jE = 47;
        else if (paramShort == 102)
          parambv.jE = 53;
        else if (paramShort == 107)
          parambv.jE = 57;
        else if (paramShort == 113)
          parambv.jE = 61;
        else if (paramShort == 119)
          parambv.jE = 64;
        else if (paramShort == 124)
          parambv.jE = 68;
        else if (paramShort == 140)
          parambv.jE = 76;
        else if (paramShort == 145)
          parambv.jE = 80;
        bv.a(parambv, 0);
        return;
      }
      String str2;
      Object localObject4;
      if ((paramShort == 43) || (paramShort == 151))
      {
        parambv.dy();
        i = paramDataInputStream.readByte();
        for (k = 0; k < i; k++)
        {
          str2 = paramDataInputStream.readUTF();
          localObject4 = new m(str2, 0, 0, parambv.dF());
          parambv.a((m)localObject4);
        }
        if (paramShort == 151)
          parambv.jE = 84;
        bv.a(parambv, 0);
        return;
      }
      if (paramShort == 76)
      {
        b5.jdMethod_case("组队列表-----------------------==============组队列表");
        parambv.dy();
        i = paramDataInputStream.readByte();
        b5.jdMethod_case("listNum==" + i);
        for (k = 0; k < i; k++)
        {
          str2 = paramDataInputStream.readUTF();
          b5.jdMethod_case("listItemStr==" + str2);
          localObject4 = new m(str2, 0, 0, parambv.dF());
          parambv.a((m)localObject4);
        }
        return;
      }
      if (paramShort == 26)
      {
        parambv.dy();
        i = paramDataInputStream.readByte();
        for (k = 0; k < i; k++)
        {
          str2 = paramDataInputStream.readUTF();
          localObject4 = new m(str2, 0, 0, parambv.dF());
          parambv.a((m)localObject4);
        }
        if (paramShort == 26)
          parambv.jE = 5;
        bv.a(parambv, 0);
        return;
      }
      int i7;
      m localm9;
      if ((paramShort == 45) || (paramShort == 18) || (paramShort == 33))
      {
        parambv.dy();
        i = paramDataInputStream.readByte();
        b5.jdMethod_case("zbt 任务列表 列表项数量: " + i);
        int[] arrayOfInt1 = new int[i];
        for (i7 = 0; i7 < i; i7++)
        {
          localObject4 = paramDataInputStream.readUTF();
          b5.jdMethod_case("任务名称：" + (String)localObject4);
          arrayOfInt1[i7] = paramDataInputStream.readInt();
          byte b2 = paramDataInputStream.readByte();
          int i19;
          if (paramShort == 33)
          {
            short s3 = paramDataInputStream.readShort();
            i19 = paramDataInputStream.readShort();
            m localm12;
            (localm12 = new m((String)localObject4, 0, 1, parambv.dF())).K = s3;
            localm12.I = i19;
            parambv.a(localm12);
          }
          else if (paramShort == 18)
          {
            (localm9 = new m((String)localObject4, 1, 0, parambv.dF())).jdMethod_int(b2);
            parambv.a(localm9);
          }
          else
          {
            if (paramShort != 45)
              continue;
            localm9 = new m((String)localObject4, 1, 0, parambv.dF());
            i19 = paramDataInputStream.readByte();
            boolean bool3 = paramDataInputStream.readBoolean();
            localm9.jdMethod_for(i19);
            localm9.a(bool3);
            byte b6 = -1;
            switch (b2)
            {
            case 3:
              b6 = 5;
              break;
            case 1:
              b6 = 6;
              break;
            case 2:
              b6 = 7;
            }
            b5.jdMethod_case("自身任务列表难度等级：" + b6);
            localm9.jdMethod_int(b6);
            parambv.a(localm9);
          }
        }
        parambv.jdMethod_if(arrayOfInt1);
        if (paramShort == 45)
        {
          parambv.jE = 9;
        }
        else if (paramShort == 18)
        {
          if (parambv.dt().size() > 0)
            bv.C(((m)parambv.dt().elementAt(0)).jdMethod_char());
          parambv.jE = 2;
        }
        else if (paramShort == 33)
        {
          parambv.jE = 7;
        }
        bv.a(parambv, 0);
        return;
      }
      if (paramShort == 44)
      {
        parambv.dy();
        bv.ks = paramDataInputStream.readInt();
        i = paramDataInputStream.readByte();
        b5.jdMethod_case("传送的d地图ID：" + bv.ks + "==NPC传送列表项数量: " + i);
        for (int m = 0; m < i; m++)
        {
          i7 = paramDataInputStream.readByte();
          localObject4 = paramDataInputStream.readUTF();
          m localm4;
          (localm4 = new m((String)localObject4, 0, 0, parambv.dF())).jdMethod_do(i7);
          parambv.a(localm4);
        }
        parambv.jE = 8;
      }
      else
      {
        m localm5;
        if ((paramShort == 46) || (paramShort == 47) || (paramShort == 49) || (paramShort == 50) || (paramShort == 48) || (paramShort == 51) || (paramShort == 71))
        {
          parambv.dy();
          i = paramDataInputStream.readShort();
          b5.jdMethod_case("任列表项数量: " + i);
          int[] arrayOfInt2 = new int[i];
          for (int i8 = 0; i8 < i; i8++)
          {
            arrayOfInt2[i8] = paramDataInputStream.readInt();
            localObject4 = paramDataInputStream.readUTF();
            b5.jdMethod_case("任务名称：" + (String)localObject4);
            if ((paramShort == 48) || (paramShort == 51))
            {
              int i16 = paramDataInputStream.readByte();
              localm9 = new m((String)localObject4, 1, 0, parambv.dF());
              byte b5 = -1;
              switch (i16)
              {
              case 3:
                b5 = 5;
                break;
              case 1:
                b5 = 6;
                break;
              case 2:
                b5 = 7;
              }
              b5.jdMethod_case("自身任务列表难度等级：" + b5);
              localm9.jdMethod_int(b5);
              parambv.a(localm9);
            }
            else
            {
              localm5 = new m((String)localObject4, 0, 0, parambv.dF());
              parambv.a(localm5);
            }
          }
          parambv.jdMethod_if(arrayOfInt2);
          if (paramShort == 48)
            parambv.jE = 12;
          else if (paramShort == 51)
            parambv.jE = 15;
          else if (paramShort == 46)
            parambv.jE = 10;
          else if (paramShort == 47)
            parambv.jE = 11;
          else if (paramShort == 49)
            parambv.jE = 13;
          else if (paramShort == 50)
            parambv.jE = 14;
          else if (paramShort == 71)
            parambv.jE = 29;
          bv.a(parambv, 0);
          return;
        }
        int n;
        String str3;
        if (paramShort == 56)
        {
          parambv.dy();
          i = paramDataInputStream.readByte();
          for (n = 0; n < i; n++)
          {
            str3 = paramDataInputStream.readUTF();
            b5.jdMethod_case("名称：" + str3);
            (localObject4 = new m(str3, 0, 0, parambv.dF())).q = paramDataInputStream.readInt();
            ((m)localObject4).aa = paramDataInputStream.readLong();
            parambv.a((m)localObject4);
          }
          parambv.jE = 16;
        }
        else if (paramShort == 58)
        {
          parambv.dy();
          i = paramDataInputStream.readByte();
          b5.jdMethod_case("zbt 任务列表 列表项数量: " + i);
          for (n = 0; n < i; n++)
          {
            str3 = paramDataInputStream.readUTF();
            byte b1 = paramDataInputStream.readByte();
            (localm5 = new m(str3, 0, 0, parambv.dF())).A = b1;
            parambv.a(localm5);
          }
          parambv.jE = 17;
        }
        else
        {
          Object localObject5;
          if (paramShort == 60)
          {
            parambv.dy();
            i = paramDataInputStream.readByte();
            b5.jdMethod_case("zbt 任务列表 列表项数量: " + i);
            for (n = 0; n < i; n++)
            {
              str3 = paramDataInputStream.readUTF();
              localObject5 = new m(str3, 0, 0, parambv.dF());
              parambv.a((m)localObject5);
            }
            bv.a(parambv, 0);
            return;
          }
          if ((paramShort == 65) || (paramShort == 70))
          {
            parambv.dy();
            i = paramDataInputStream.readByte();
            for (n = 0; n < i; n++)
            {
              str3 = paramDataInputStream.readUTF();
              b5.jdMethod_case("名称：" + str3);
              (localObject5 = new m(str3, 0, 0, parambv.dF())).q = paramDataInputStream.readInt();
              parambv.a((m)localObject5);
            }
            bv.a(parambv, 0);
            return;
          }
          if (paramShort == 20)
          {
            parambv.dy();
            i = paramDataInputStream.readByte();
            b5.jdMethod_case("npctalk=" + i);
            Object localObject1 = null;
            for (int i9 = 0; i9 < i; i9++)
            {
              localObject5 = paramDataInputStream.readUTF();
              b5.jdMethod_case("对话标题：" + (String)localObject5);
              localm5 = new m((String)localObject5, 0, 0, parambv.dF());
              parambv.a(localm5);
            }
            parambv.jE = 3;
          }
          else
          {
            int i1;
            Object localObject3;
            if (paramShort == 25)
            {
              parambv.a(1);
              parambv.dy();
              i = paramDataInputStream.readByte();
              parambv.jE = 4;
              if (i == 0)
                return;
              bu.f = paramDataInputStream.readInt();
              for (i1 = 0; i1 < i; i1++)
              {
                localObject3 = paramDataInputStream.readUTF();
                int i13 = paramDataInputStream.readInt();
                boolean bool2 = false;
                if (bu.f == i13)
                  bool2 = true;
                byte b3 = paramDataInputStream.readByte();
                short s4 = paramDataInputStream.readShort();
                int i20 = paramDataInputStream.readInt();
                int i21 = paramDataInputStream.readInt();
                paramShort = paramDataInputStream.readInt();
                int i22 = paramDataInputStream.readInt();
                m localm13;
                (localm13 = new m(2)).a((String)localObject3, i13, bool2, b3, s4, i20, i21, paramShort, i22);
                parambv.a(localm13);
              }
              if ((i > parambv.z$132bd3()) && ((paramDataInputStream = parambv.dr()).U == null))
                parambv.dr().jdMethod_new(false);
              bv.a(parambv, 0);
              return;
            }
            Object localObject6;
            int i17;
            if (paramShort == 32)
            {
              parambv.dy();
              i = paramDataInputStream.readByte();
              for (i1 = 0; i1 < i; i1++)
              {
                localObject3 = new m(3);
                localObject6 = paramDataInputStream.readUTF();
                i17 = paramDataInputStream.readInt();
                ((m)localObject3).jdMethod_if(i17);
                ((m)localObject3).a((String)localObject6);
                parambv.a((m)localObject3);
              }
              if ((i > parambv.z$132bd3()) && ((paramDataInputStream = parambv.dr()).U == null))
                parambv.dr().jdMethod_new(true);
              parambv.dr().a((short)i, (short)parambv.z$132bd3());
              return;
            }
            if (paramShort == 158)
            {
              parambv.dy();
              i = paramDataInputStream.readByte();
              for (i1 = 0; i1 < i; i1++)
              {
                (localObject3 = new m(0)).a(paramDataInputStream.readUTF());
                ((m)localObject3).q = paramDataInputStream.readByte();
                parambv.a((m)localObject3);
              }
              parambv.dr().a((short)i, (short)parambv.z$132bd3());
              return;
            }
            if (paramShort == 52)
            {
              parambv.dy();
              i = paramDataInputStream.readByte();
              for (i1 = 0; i1 < i; i1++)
              {
                (localObject3 = new m(0)).L = paramDataInputStream.readInt();
                ((m)localObject3).a(paramDataInputStream.readUTF());
                parambv.a((m)localObject3);
              }
              parambv.dr().a((short)i, (short)parambv.z$132bd3());
              return;
            }
            if (paramShort == 134)
            {
              parambv.dy();
              o.if = new String[i = paramDataInputStream.readShort()];
              o.do = new String[i];
              o.a = new String[i];
              o.for = new int[i];
              for (i1 = 0; i1 < i; i1++)
              {
                localObject3 = paramDataInputStream.readUTF();
                localObject6 = new m((String)localObject3, 0, 0, parambv.dF());
                parambv.a((m)localObject6);
                o.if[i1] = paramDataInputStream.readUTF();
                o.do[i1] = paramDataInputStream.readUTF();
                o.a[i1] = paramDataInputStream.readUTF();
                o.for[i1] = paramDataInputStream.readInt();
              }
              if (paramShort == 134)
                parambv.jE = 71;
              bv.a(parambv, 0);
              ah localah;
              (localah = (ah)a5.es.cf().elementAt(6)).a(o.if[0]);
              localah.jdMethod_new((short)(a5.ic - localah.jdMethod_for() >> 1));
              (localObject3 = (ah)a5.es.cf().elementAt(7)).a(o.do[0]);
              ((ba)localObject3).jdMethod_new((short)(a5.ic - ((ba)localObject3).jdMethod_for() >> 1));
              (localObject6 = (ah)a5.es.cf().elementAt(8)).a(o.a[0]);
              ((ba)localObject6).jdMethod_new((short)(a5.ic - ((ba)localObject6).jdMethod_for() >> 1));
              return;
            }
            int i2;
            if ((paramShort == 133) || (paramShort == 136))
            {
              parambv.dy();
              i = paramDataInputStream.readShort();
              for (i2 = 0; i2 < i; i2++)
              {
                localObject3 = paramDataInputStream.readUTF();
                localObject6 = new m((String)localObject3, 0, 0, parambv.dF());
                parambv.a((m)localObject6);
              }
              bv.a(parambv, 0);
              return;
            }
            if ((paramShort == 131) || (paramShort == 132))
            {
              parambv.dy();
              if (a5.es.g9 == 2425029)
              {
                i = paramDataInputStream.readByte();
                for (i2 = 0; i2 < i; i2++)
                {
                  localObject3 = paramDataInputStream.readUTF();
                  localObject6 = new m((String)localObject3, 0, 0, parambv.dF());
                  parambv.a((m)localObject6);
                }
                parambv.jE = 72;
              }
              bv.a(parambv, 0);
              return;
            }
            if (paramShort == 150)
            {
              parambv.dy();
              q.byte = new String[i = paramDataInputStream.readByte()];
              for (i2 = 0; i2 < i; i2++)
              {
                localObject3 = paramDataInputStream.readUTF();
                localObject6 = new m((String)localObject3, 0, 0, parambv.dF());
                parambv.a((m)localObject6);
                q.byte[i2] = paramDataInputStream.readUTF();
              }
              ak localak1;
              (localak1 = (ak)a5.es.cf().elementAt(4)).jdMethod_if(q.byte[0]);
              bv.a(parambv, 0);
              parambv.jE = 83;
              return;
            }
            if (paramShort == 152)
            {
              parambv.dy();
              q.u = new int[i = paramDataInputStream.readByte()];
              q.case = new String[i];
              q.k = new byte[i];
              for (int i3 = 0; i3 < i; i3++)
              {
                q.u[i3] = paramDataInputStream.readInt();
                localObject3 = paramDataInputStream.readUTF();
                localObject6 = new m((String)localObject3, 0, 0, parambv.dF());
                parambv.a((m)localObject6);
                q.case[i3] = paramDataInputStream.readUTF();
                q.k[i3] = paramDataInputStream.readByte();
              }
              if (i != 0)
              {
                ak localak2;
                (localak2 = (ak)a5.es.cf().elementAt(6)).jdMethod_if(q.case[0]);
                bv.a(parambv, 0);
                parambv.jE = 85;
              }
              return;
            }
            if (paramShort == 166)
            {
              parambv.dy();
              i = paramDataInputStream.readByte();
              for (int i4 = 0; i4 < i; i4++)
              {
                localObject3 = paramDataInputStream.readUTF();
                int i14 = paramDataInputStream.readInt();
                i17 = paramDataInputStream.readInt();
                int i18 = paramDataInputStream.readInt();
                m localm11;
                (localm11 = new m((String)localObject3, 9, 0, parambv.dF())).jdMethod_new(i14);
                localm11.jdMethod_int(i17);
                parambv.a(localm11);
                localm11.jdMethod_do(i18);
              }
              if (i != 0)
              {
                bv.a(parambv, 9);
                parambv.jE = 87;
              }
              else
              {
                (localObject2 = (ao)a5.es.cf().elementAt(1)).a("", 0);
              }
              Object localObject2 = paramDataInputStream.readUTF();
              (localObject3 = (ao)a5.es.cf().elementAt(0)).jdMethod_do((String)localObject2);
              return;
            }
            int i10;
            Object localObject7;
            m localm6;
            if (paramShort == 168)
            {
              parambv.dy();
              i = paramDataInputStream.readByte();
              for (i5 = 0; i5 < i; i5++)
              {
                i10 = paramDataInputStream.readByte();
                localObject7 = paramDataInputStream.readUTF();
                (localm6 = new m((String)localObject7, 0, 0, parambv.dF())).q = i10;
                parambv.a(localm6);
              }
              parambv.jE = 88;
              return;
            }
            if (paramShort == 170)
            {
              ao localao = (ao)a5.es.cf().elementAt(1);
              parambv.dy();
              i5 = paramDataInputStream.readByte();
              for (i10 = 0; i10 < i5; i10++)
              {
                localObject7 = paramDataInputStream.readUTF();
                (localm6 = new m((String)localObject7, 0, 0, parambv.dF())).w = paramDataInputStream.readShort();
                localm6.jdField_else = paramDataInputStream.readShort();
                parambv.a(localm6);
              }
              parambv.jE = 89;
              m localm1;
              if ((localm1 = (m)parambv.dt().elementAt(0)).jdField_else == 4125)
              {
                localao.a("", 0);
                return;
              }
              localao.a("操作", 0);
              return;
            }
            if ((paramShort == 171) || (paramShort == 172) || (paramShort == 173))
            {
              parambv.dy();
              j = paramDataInputStream.readByte();
              for (i5 = 0; i5 < j; i5++)
              {
                int i11 = paramDataInputStream.readInt();
                localObject7 = paramDataInputStream.readUTF();
                (localm6 = new m((String)localObject7, 0, 0, parambv.dF())).q = i11;
                parambv.a(localm6);
              }
              bv.a(parambv, 0);
              return;
            }
            if (paramShort != 174)
              return;
            parambv.dy();
            int j = paramDataInputStream.readByte();
            if (a5.es.g9 == 3145738)
              aa.void = new byte[j];
            for (int i5 = 0; i5 < j; i5++)
            {
              String str4 = paramDataInputStream.readUTF();
              if (a5.es.g9 == 3145738)
                aa.void[i5] = paramDataInputStream.readByte();
              localObject7 = new m(str4, 0, 0, parambv.dF());
              parambv.a((m)localObject7);
            }
          }
        }
      }
    }
    bv.a(parambv, 0);
  }

  private static as jdMethod_if(DataInputStream paramDataInputStream)
  {
    as localas = null;
    try
    {
      b5.jdMethod_case("enter in parseTopForm");
      byte b1 = paramDataInputStream.readByte();
      byte b2 = paramDataInputStream.readByte();
      (localas = new as(b2, null)).a(b1, paramDataInputStream.readInt(), paramDataInputStream.readUTF(), paramDataInputStream.readUTF(), paramDataInputStream.readUTF(), paramDataInputStream.readInt(), paramDataInputStream.readInt());
      b5.jdMethod_case("enter in parseTopForm" + b2);
      switch (b2)
      {
      case 5:
        if (a5.V() == 0)
          break;
        a5.eQ.a(1376259);
        localas = null;
        break;
      case 0:
      case 1:
        break;
      case 2:
        if ((a5.gQ == null) && (a5.jdMethod_else() == 5) && (a5.V() == 0))
        {
          bu.h = paramDataInputStream.readInt();
        }
        else
        {
          bp.em = paramDataInputStream.readInt();
          a5.eQ.a(720914);
          localas = null;
        }
        break;
      case 9:
        if ((a5.gQ == null) && (a5.jdMethod_else() == 5) && (a5.V() == 0))
        {
          bt.for = paramDataInputStream.readInt();
        }
        else
        {
          bp.em = paramDataInputStream.readInt();
          a5.eQ.a(1638414);
          localas = null;
        }
        break;
      case 12:
        if ((a5.gQ == null) && (a5.jdMethod_else() == 5) && (a5.V() == 0))
        {
          i.do = paramDataInputStream.readInt();
        }
        else
        {
          bp.em = paramDataInputStream.readInt();
          a5.eQ.a(1835032);
          localas = null;
        }
        break;
      case 10:
        bu.g = paramDataInputStream.readInt();
        break;
      case 31:
        bu.g = paramDataInputStream.readInt();
        b5.jdMethod_case("rollGoodsID========" + bu.g);
        break;
      case 3:
        switch (b1 = paramDataInputStream.readByte())
        {
        case 0:
          a5.A();
          break;
        case 1:
          switch (bu.e)
          {
          case 0:
            a5.A();
            break;
          case 1:
            a5.eQ.a(720904);
            break;
          case 2:
            a5.eQ.a(new int[] { 720905, 720906, 720907 });
          }
        }
        break;
      case 14:
        b5.jdMethod_case("弹出加为仇人的弹板");
        bp.ag().eC = paramDataInputStream.readInt();
        break;
      case 7:
        n.for = paramDataInputStream.readInt();
        break;
      case 8:
        localas.cR = paramDataInputStream.readInt();
        b5.jdMethod_case("在ParseUI中读取的taskID = " + localas.cR);
        break;
      case 11:
        if ((a5.gQ == null) && (a5.jdMethod_else() == 5) && (a5.V() == 0))
        {
          bp.ag().fS = paramDataInputStream.readInt();
        }
        else
        {
          bp.em = paramDataInputStream.readInt();
          a5.eQ.a(196630);
          localas = null;
        }
        break;
      case 17:
        a5.iB = paramDataInputStream.readByte();
        break;
      case 32:
        bb.if = paramDataInputStream.readByte();
        bb.a = paramDataInputStream.readByte();
        break;
      case 33:
        bb.else = paramDataInputStream.readInt();
        break;
      case 34:
        bb.b = paramDataInputStream.readByte();
        bb.long = paramDataInputStream.readByte();
        bb.goto = paramDataInputStream.readByte();
        break;
      case 36:
        at.if = paramDataInputStream.readInt();
        at.a = paramDataInputStream.readInt();
        break;
      case 37:
        if (!a5.eQ.e)
          break;
        a5.eQ.e = false;
        break;
      case 38:
        if ((a5.gQ == null) && (a5.jdMethod_else() == 5) && (a5.V() == 0))
        {
          c.a = paramDataInputStream.readInt();
        }
        else
        {
          c.a = paramDataInputStream.readInt();
          a5.eQ.a(2490423);
          localas = null;
        }
        break;
      case 40:
        l.if = paramDataInputStream.readShort();
        if (a5.V() == 4)
          a5.A();
        if (a5.ea == null)
          break;
        a5.ea.l6.removeAllElements();
        a5.ea = null;
        a5.jdMethod_try(0);
        break;
      case 41:
        if (!a5.eQ.e)
          break;
        a5.eQ.e = false;
        break;
      case 42:
        bt.g = paramDataInputStream.readInt();
        bt.l = paramDataInputStream.readInt();
        bt.c = paramDataInputStream.readInt();
      case 4:
      case 6:
      case 13:
      case 15:
      case 16:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 35:
      case 39:
      }
      paramDataInputStream.close();
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
    return localas;
  }

  public static as a(byte[] paramArrayOfByte)
  {
    try
    {
      return jdMethod_if(paramArrayOfByte = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte)));
    }
    catch (Exception localException)
    {
      (paramArrayOfByte = localException).printStackTrace();
    }
    return null;
  }

  public static be a(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      return a(paramArrayOfByte = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte)), paramInt);
    }
    catch (Exception localException)
    {
      (paramArrayOfByte = localException).printStackTrace();
    }
    return null;
  }

  private static be a(DataInputStream paramDataInputStream, int paramInt)
  {
    be localbe = null;
    b5.jdMethod_case("parseCmdData------commID" + paramInt);
    try
    {
      Object localObject6;
      Object localObject9;
      int i14;
      int i4;
      Object localObject1;
      Object localObject7;
      Object localObject10;
      int i18;
      int i19;
      Object localObject4;
      Object localObject8;
      byte b2;
      int i21;
      int i10;
      int i12;
      int i;
      int i8;
      int i1;
      int i20;
      short s6;
      Object localObject15;
      Object localObject16;
      Object localObject5;
      ah localah1;
      switch (paramInt)
      {
      case -2147221500:
      case -2147221499:
      case -2147221498:
      case -2147221493:
      case -2147221492:
      case -2147221490:
        ba.q = false;
        be.gp = 0;
        localbe = new be(0, 0, (short)a5.ic, (short)a5.il);
        ao localao1 = new ao(0, localbe);
        Object localObject3 = -1;
        if (paramInt == -2147221500)
        {
          localao1.jdMethod_do("领取报酬");
          localObject3 = 0;
          localbe.g9 = 262152;
        }
        else if (paramInt == -2147221499)
        {
          localao1.jdMethod_do("报酬详情");
          localObject3 = 1;
          localbe.g9 = 262158;
        }
        else if (paramInt == -2147221498)
        {
          localao1.jdMethod_do("报酬详情");
          localObject3 = 2;
          localbe.g9 = 262159;
        }
        else if (paramInt == -2147221493)
        {
          localao1.jdMethod_do("报酬详情");
          localObject3 = 3;
          localbe.g9 = 262175;
        }
        else if (paramInt == -2147221492)
        {
          localao1.jdMethod_do("报酬详情");
          localObject3 = 4;
          localbe.g9 = 262177;
        }
        else if (paramInt == -2147221490)
        {
          localao1.jdMethod_do("报酬详情");
          localObject3 = 5;
          localbe.g9 = 262181;
        }
        b5.jdMethod_case("form.clientCommand = " + localbe.g9);
        b5.jdMethod_case("-------报酬界面类型-------" + localObject3);
        localbe.jdMethod_if(localao1);
        localObject6 = new ao(1, localbe);
        localbe.jdMethod_if((ba)localObject6);
        int i2 = ah.ad();
        y localy1;
        (localy1 = new y(0, (short)(ao.aA() - 10), (short)a5.ic, (short)(a5.il - 18 - ao.aA() + 10), 1, localbe)).jdMethod_case((short)(localy1.M() - i2));
        short s1 = (short)i2;
        (paramInt = localy1).E = s1;
        localbe.jdMethod_if(localy1);
        String str1 = paramDataInputStream.readUTF();
        localObject9 = new ah(15, (short)(localy1.jdMethod_long() + 3), (short)(a5.ic - 30), (short)ah.ad(), 1, str1, localbe);
        localbe.jdMethod_if((ba)localObject9);
        int i6 = 0;
        int i9 = (short)(ao.aA() - 10 + 26);
        b5.Q.removeAllElements();
        b5.I.removeAllElements();
        b5.M.removeAllElements();
        b5.jdMethod_case("before groupNum");
        int i11 = paramDataInputStream.readByte();
        b5.jdMethod_case("after groupNum = " + i11);
        if (i11 > 0)
        {
          bf.for = true;
          String str5 = "请选择一样物品作为";
          String str6 = "您的附加奖励";
          ah localah3 = new ah(18, i9, (short)b5.jdMethod_do(str5), (short)a5.iG, 0, str5, localbe);
          localObject6 = new ah(18, (short)(i9 + 18 * a5.il / 208), (short)b5.jdMethod_do(str6), (short)a5.iG, 0, str6, localbe);
          localbe.jdMethod_if(localah3);
          localbe.jdMethod_if((ba)localObject6);
        }
        else
        {
          bf.for = false;
        }
        a7 locala7;
        for (i14 = 0; i14 < i11; i14++)
        {
          Object localObject13 = paramDataInputStream.readByte();
          b5.jdMethod_case("附加奖励报酬类型: " + localObject13);
          int i17 = i14 + 2;
          b5.jdMethod_case("奖励当前行:" + i17);
          localObject9 = localObject3;
          i4 = (byte)(i14 + 1);
          paramInt = 1;
          short s3 = (short)(i9 + i17 * (18 * a5.il / 208));
          i2 = i17;
          localObject6 = localObject13;
          localObject1 = localbe;
          paramInt = paramDataInputStream;
          try
          {
            i6 = 0;
            Object localObject14;
            int i7;
            switch (localObject6)
            {
            case 1:
              i6 = paramInt.readShort();
              String str7 = paramInt.readUTF();
              paramInt = paramInt.readInt();
              (localObject14 = new a7(33, s3, 0, 0, null, 1, (be)localObject1)).g(i6);
              ((a7)localObject14).a(a5.gg);
              ((a7)localObject14).ft = true;
              ((a7)localObject14).jdMethod_if((short)(i6 % 1000), true);
              ((a7)localObject14).eK = 1;
              ((a7)localObject14).eD = i4;
              ((a7)localObject14).eJ = localObject9;
              ((a7)localObject14).el = localObject6;
              if (paramInt > 1)
                ((a7)localObject14).a(true, (byte)paramInt);
              ((be)localObject1).jdMethod_if((ba)localObject14);
              ((ba)localObject14).w();
              b5.Q.addElement(localObject14);
              b5.I.addElement(new Integer(((be)localObject1).cf().size() - 1));
              b5.M.addElement(new Integer(i2));
              (localObject6 = new ah(53, s3, (short)b5.jdMethod_do(str7), (short)a5.iG, 0, str7, (be)localObject1)).w();
              ((be)localObject1).jdMethod_if((ba)localObject6);
              break;
            case 2:
              String str2 = paramInt.readUTF();
              int i15 = paramInt.readInt();
              (paramInt = new a7(33, s3, 0, 0, "exp.png", 1, (be)localObject1)).eK = 1;
              paramInt.eD = i4;
              paramInt.eJ = localObject9;
              paramInt.el = localObject6;
              paramInt.i(true);
              ((be)localObject1).jdMethod_if(paramInt);
              paramInt.w();
              b5.Q.addElement(paramInt);
              b5.I.addElement(new Integer(((be)localObject1).cf().size() - 1));
              b5.M.addElement(new Integer(i2));
              localObject14 = str2;
              localObject6 = new ah(53, s3, (short)b5.jdMethod_do((String)localObject14), (short)a5.iG, 0, (String)localObject14, (be)localObject1);
              ((be)localObject1).jdMethod_if((ba)localObject6);
              (localObject7 = new ah((short)(53 + b5.jdMethod_do((String)localObject14) + 4), (short)(s3 + 3), 3, (be)localObject1, 0)).jdMethod_case(i15);
              ((be)localObject1).jdMethod_if((ba)localObject7);
              break;
            case 3:
              i7 = paramInt.readInt();
              b5.jdMethod_case("金钱: " + i7);
              (locala7 = new a7(33, s3, 0, 0, "u-8.png", 1, (be)localObject1)).eK = 1;
              locala7.eD = i4;
              locala7.eJ = localObject9;
              locala7.el = localObject6;
              locala7.i(true);
              ((be)localObject1).jdMethod_if(locala7);
              locala7.w();
              b5.Q.addElement(locala7);
              b5.I.addElement(new Integer(((be)localObject1).cf().size() - 1));
              b5.M.addElement(new Integer(localObject7));
              paramInt = "金钱";
              localObject14 = new ah(53, s3, (short)b5.jdMethod_do(paramInt), (short)a5.iG, 0, paramInt, (be)localObject1);
              ((be)localObject1).jdMethod_if((ba)localObject14);
              (localObject6 = new ah((short)(53 + b5.jdMethod_do(paramInt) + 4), (short)(s3 + 3), 3, (be)localObject1, 0)).jdMethod_case(i7);
              ((be)localObject1).jdMethod_if((ba)localObject6);
              break;
            case 4:
              paramInt.readShort();
              i7 = 0;
              paramInt.readUTF();
              locala7 = null;
              paramInt = paramInt.readInt();
              (localObject14 = new a7(33, s3, 0, 0, "u-2.png", 1, (be)localObject1)).eK = 1;
              ((a7)localObject14).eD = i4;
              ((a7)localObject14).eJ = localObject9;
              ((a7)localObject14).el = localObject6;
              ((a7)localObject14).i(true);
              ((be)localObject1).jdMethod_if((ba)localObject14);
              ((ba)localObject14).w();
              b5.Q.addElement(localObject14);
              b5.I.addElement(new Integer(((be)localObject1).cf().size() - 1));
              b5.M.addElement(new Integer(localObject7));
              localObject6 = "技能";
              localObject7 = new ah(53, s3, (short)b5.jdMethod_do((String)localObject6), (short)a5.iG, 0, (String)localObject6, (be)localObject1);
              ((be)localObject1).jdMethod_if((ba)localObject7);
              (localObject6 = new ah((short)(53 + b5.jdMethod_do((String)localObject6) + 4), (short)(s3 + 3), 3, (be)localObject1, 0)).jdMethod_case(paramInt);
              ((be)localObject1).jdMethod_if((ba)localObject6);
              break;
            case 5:
              paramInt.readShort();
              i7 = 0;
              paramInt.readUTF();
              locala7 = null;
              paramInt = paramInt.readInt();
              (localObject14 = new a7(33, s3, 0, 0, "u-3.png", 1, (be)localObject1)).eK = 1;
              ((a7)localObject14).eD = i4;
              ((a7)localObject14).eJ = localObject9;
              ((a7)localObject14).el = localObject6;
              ((be)localObject1).jdMethod_if((ba)localObject14);
              ((a7)localObject14).i(true);
              ((ba)localObject14).w();
              b5.Q.addElement(localObject14);
              b5.I.addElement(new Integer(((be)localObject1).cf().size() - 1));
              b5.M.addElement(new Integer(localObject7));
              localObject6 = "建设";
              localObject7 = new ah(53, s3, (short)b5.jdMethod_do((String)localObject6), (short)a5.iG, 0, (String)localObject6, (be)localObject1);
              ((be)localObject1).jdMethod_if((ba)localObject7);
              (localObject6 = new ah((short)(53 + b5.jdMethod_do((String)localObject6) + 4), (short)(s3 + 3), 3, (be)localObject1, 0)).jdMethod_case(paramInt);
              ((be)localObject1).jdMethod_if((ba)localObject6);
              break;
            case 6:
              i7 = paramInt.readInt();
              b5.jdMethod_case("经验： " + i7);
              (locala7 = new a7(33, s3, 0, 0, "exp.png", 1, (be)localObject1)).eK = 1;
              locala7.eD = i4;
              locala7.eJ = localObject9;
              locala7.el = localObject6;
              locala7.i(true);
              ((be)localObject1).jdMethod_if(locala7);
              locala7.w();
              b5.Q.addElement(locala7);
              b5.I.addElement(new Integer(((be)localObject1).cf().size() - 1));
              b5.M.addElement(new Integer(localObject7));
              paramInt = "经验";
              localObject14 = new ah(53, s3, (short)b5.jdMethod_do(paramInt), (short)a5.iG, 0, paramInt, (be)localObject1);
              ((be)localObject1).jdMethod_if((ba)localObject14);
              (localObject6 = new ah((short)(53 + b5.jdMethod_do(paramInt) + 4), (short)(s3 + 3), 3, (be)localObject1, 0)).jdMethod_case(i7);
              ((be)localObject1).jdMethod_if((ba)localObject6);
              break;
            case 7:
              i7 = paramInt.readInt();
              (locala7 = new a7(33, s3, 0, 0, "cross.png", 1, (be)localObject1)).eK = 1;
              locala7.eD = i4;
              locala7.eJ = localObject9;
              locala7.el = localObject6;
              locala7.i(true);
              ((be)localObject1).jdMethod_if(locala7);
              locala7.w();
              b5.Q.addElement(locala7);
              b5.I.addElement(new Integer(((be)localObject1).cf().size() - 1));
              b5.M.addElement(new Integer(localObject7));
              paramInt = "荣誉";
              localObject14 = new ah(53, s3, (short)b5.jdMethod_do(paramInt), (short)a5.iG, 0, paramInt, (be)localObject1);
              ((be)localObject1).jdMethod_if((ba)localObject14);
              (localObject6 = new ah((short)(53 + b5.jdMethod_do(paramInt) + 4), (short)(s3 + 3), 3, (be)localObject1, 0)).jdMethod_case(i7);
              ((be)localObject1).jdMethod_if((ba)localObject6);
              break;
            case 8:
              localObject10 = paramInt.readUTF();
              (locala7 = new a7(33, s3, 0, 0, "long.png", 1, (be)localObject1)).eK = 1;
              locala7.eD = i4;
              locala7.eJ = localObject9;
              locala7.el = localObject6;
              locala7.i(true);
              ((be)localObject1).jdMethod_if(locala7);
              locala7.w();
              b5.Q.addElement(locala7);
              b5.I.addElement(new Integer(((be)localObject1).cf().size() - 1));
              b5.M.addElement(new Integer(localObject7));
              paramInt = (I)localObject10;
              localObject14 = new ah(53, s3, (short)b5.jdMethod_do(paramInt), (short)a5.iG, 0, paramInt, (be)localObject1);
              ((be)localObject1).jdMethod_if((ba)localObject14);
            }
          }
          catch (Exception localException1)
          {
            (localObject10 = localException1).printStackTrace();
          }
        }
        for (i14 = 0; i14 < b5.Q.size(); i14++)
        {
          locala7 = (a7)b5.Q.elementAt(i14);
          i18 = (byte)((Integer)b5.I.elementAt(i14)).intValue();
          b5.jdMethod_case("picIndex = " + i18);
          if (i14 == 0)
            locala7.a(true, localbe);
          if (i14 <= 0)
            continue;
          localObject6 = (a7)b5.Q.elementAt(i14 - 1);
          i19 = (byte)((Integer)b5.I.elementAt(i14 - 1)).intValue();
          b5.jdMethod_case("prePicIndex = " + i19);
          ((ba)localObject6).a(1, (byte)(i18 + 1));
          locala7.a(0, (byte)(i19 + 1));
        }
        ba.q = true;
        break;
      case -2145779711:
      case -2145779710:
        localbe = a5.es;
        b5.jdMethod_case("in parseCmdData S_MAIL_RECEIVE_NORMAL");
        (localObject1 = (a9)localbe.cf().elementAt(3)).j(false);
        (localObject4 = (a9)localbe.cf().elementAt(4)).j(false);
        localObject6 = (ak)localbe.cf().elementAt(5);
        (localObject7 = (a9)localbe.cf().elementAt(13)).j(false);
        localObject8 = new a7[6];
        for (i4 = 0; i4 < localObject8.length; i4++)
          localObject8[i4] = ((a7)localbe.cf().elementAt(i4 + 7));
        long l1;
        q.r = (l1 = paramDataInputStream.readLong()) != 0L;
        localObject10 = paramDataInputStream.readUTF();
        ((a9)localObject4).a(new StringBuffer((String)localObject10));
        String str3 = paramDataInputStream.readUTF();
        ((a9)localObject1).a(new StringBuffer(str3));
        String str4 = paramDataInputStream.readUTF();
        b5.jdMethod_case("~~~~~~~~~mailContent = " + str4);
        ((ak)localObject6).jdMethod_if(str4);
        ((ak)localObject6).ap();
        ((ak)localObject6).jdMethod_else(16711680);
        paramDataInputStream.readBoolean();
        i14 = 0;
        int i16;
        q.char = i16 = paramDataInputStream.readInt();
        b5.jdMethod_case("付费金额-------------" + i16);
        ((a9)localObject7).a(new StringBuffer(i16 + ""));
        i18 = paramDataInputStream.readByte();
        b5.jdMethod_case("附件数量-----------------" + i18);
        q.for = false;
        for (int n = 0; n < localObject8.length; n++)
        {
          i19 = paramDataInputStream.readShort();
          byte b1 = paramDataInputStream.readByte();
          b2 = paramDataInputStream.readByte();
          byte b3 = paramDataInputStream.readByte();
          localObject8[n].l(b3);
          localObject8[n].c(i19);
          localObject8[n].g(i19);
          localObject8[n].ft = true;
          i21 = (short)(i19 % 1000);
          localObject8[n].jdMethod_if(i21, true);
          localObject8[n].a(a5.gg);
          localObject8[n].jdMethod_long(b1);
          localObject8[n].fd = (byte)n;
          if ((b2 == 1) || (i19 == 0))
            localObject8[n].g(false);
          else
            localObject8[n].g(true);
        }
        for (n = 0; n < localObject8.length; n++)
        {
          if (localObject8[n].bu() <= 0)
            continue;
          q.for = true;
          break;
        }
        if (q.a != -1)
        {
          ((a9)localObject1).a(false, localbe);
          ((a9)localObject4).a(false, localbe);
          localObject8[q.a].a(true, localbe);
        }
        if (paramInt == -2145779711)
        {
          a5.es.g9 = 1703940;
        }
        else
        {
          if (paramInt != -2145779710)
            break;
          a5.es.g9 = 1703941;
        }
        break;
      case -2145779707:
        localbe = a5.es;
        q.s = paramDataInputStream.readLong();
        q.new = paramDataInputStream.readUTF();
        q.try = paramDataInputStream.readUTF();
        q.f[0] = q.new;
        q.f[1] = q.try;
        localObject1 = (a9)localbe.cf().elementAt(3);
        localObject4 = (a9)localbe.cf().elementAt(4);
        ((a9)localObject1).a(new StringBuffer(q.new));
        ((a9)localObject4).a(new StringBuffer(q.try));
        break;
      case -2145583097:
        (localbe = a5.es).c("按#键刷新");
        b5.jdMethod_case("in parseCmdData S_AUCTION_HANG");
        localObject1 = (bv)localbe.cf().elementAt(2);
        localObject4 = (a9)localbe.cf().elementAt(14);
        ah localah2 = (ah)localbe.cf().elementAt(15);
        localObject7 = (a7)localbe.cf().elementAt(5);
        localObject8 = (ah)localbe.cf().elementAt(8);
        a9 locala9 = (a9)localbe.cf().elementAt(7);
        localObject9 = (a9)localbe.cf().elementAt(10);
        localObject10 = (a9)localbe.cf().elementAt(12);
        ((bv)localObject1).dy();
        ((bv)localObject1).jE = 18;
        i10 = paramDataInputStream.readByte();
        b5.jdMethod_case("当前页面物品数来那个" + i10);
        bw.c = i12 = paramDataInputStream.readShort();
        if (i12 < bw.void)
          bw.void = i12;
        localah2.jdMethod_case(bw.void);
        localah2.jdMethod_byte(i12);
        for (i14 = 0; i14 < i10; i14++)
        {
          long l2 = paramDataInputStream.readLong();
          short s2 = paramDataInputStream.readShort();
          i19 = paramDataInputStream.readByte();
          String str8 = paramDataInputStream.readUTF();
          b2 = paramDataInputStream.readByte();
          short s8 = paramDataInputStream.readShort();
          i21 = paramDataInputStream.readByte();
          paramInt = paramDataInputStream.readInt();
          i12 = paramDataInputStream.readInt();
          byte b4 = paramDataInputStream.readByte();
          m localm2;
          (localm2 = new m(5)).a(str8, l2, s2, i19, b2, s8, i21, paramInt, i12, b4);
          ((bv)localObject1).a(localm2);
        }
        bv.a((bv)localObject1, 5);
        bw.case = i14 = paramDataInputStream.readInt();
        if (i10 > 0)
        {
          m localm1 = (m)((bv)localObject1).dt().elementAt(((bv)localObject1).dw());
          ((a7)localObject7).ft = true;
          ((a7)localObject7).a(a5.gg);
          ((a7)localObject7).g(localm1.B);
          ((a7)localObject7).jdMethod_if((short)(localm1.B % 1000), true);
          if (localm1.y == 1)
            ((a7)localObject7).g(false);
          else
            ((a7)localObject7).a(true, localm1.g);
          ((ah)localObject8).jdMethod_case(localm1.f);
          locala9.a(new StringBuffer(localm1.r + ""));
          locala9.j(false);
          ((a9)localObject9).a(new StringBuffer(localm1.i + ""));
          ((a9)localObject9).j(false);
          ((a9)localObject10).a(new StringBuffer(localm1.l));
          ((a9)localObject10).j(false);
          ((a9)localObject4).a(new StringBuffer(i14 + ""));
          ((a9)localObject4).j(false);
        }
        else
        {
          ((a7)localObject7).a(null);
          ((a7)localObject7).g(false);
          ((ah)localObject8).jdMethod_case(0);
          locala9.a(new StringBuffer(""));
          locala9.j(false);
          ((a9)localObject9).a(new StringBuffer(""));
          ((a9)localObject9).j(false);
          ((a9)localObject10).a(new StringBuffer(""));
          ((a9)localObject10).j(false);
          ((a9)localObject4).a(new StringBuffer(i14 + ""));
          ((a9)localObject4).j(false);
        }
        break;
      case -2147090423:
        y.S = true;
        localbe = new be(0, 0, (short)a5.ic, (short)a5.il);
        i = paramDataInputStream.readByte();
        b5.jdMethod_case("self ============ " + i);
        if (i == 0)
          localbe.g9 = 393225;
        else
          localbe.g9 = 393229;
        (localObject4 = new ao(0, localbe)).jdMethod_do("人物资料");
        localbe.jdMethod_if((ba)localObject4);
        ao localao2 = new ao(1, localbe);
        if (i == 1)
          localao2.a("", 0);
        localbe.jdMethod_if(localao2);
        ba.q = false;
        localObject7 = new y(0, 18, (short)a5.ic, (short)(a5.il - 18 - ao.aA() + 7), 1, localbe);
        localbe.jdMethod_if((ba)localObject7);
        int i3 = 0;
        int i5 = (short)(a5.ic / 4 + 4);
        short s4 = (short)((a5.ic << 1) / 3);
        paramInt = (I)localObject7;
        i = 0;
        if (paramInt.E == -1)
          i = paramInt.jdMethod_long() + 5;
        else
          i = paramInt.jdMethod_long() + 5 + paramInt.E;
        i8 = (short)((short)i + 6);
        i10 = (short)(16 * a5.il / 208);
        i12 = (short)(i5 - (a5.iA << 1));
        i14 = (short)(a5.ic * 3 / 4 - 8);
        bn localbn2 = new bn(localbe.g9, localbe);
        i1 = 0;
        i20 = 0;
        s6 = 0;
        while (i20 < 10)
        {
          ah localah4 = new ah(i5, (short)(i8 + i10 * i20), 0, bn.iv[i20], true, localbe);
          localbe.jdMethod_if(localah4);
          localbn2.jdMethod_do(localah4);
          localObject15 = paramDataInputStream.readUTF();
          localbn2.iA[(i1++)] = localObject15;
          if (i20 != 9)
          {
            localObject16 = new ah(s4, (short)(i8 + i10 * i20), 0, (String)localObject15, true, localbe);
            localbe.jdMethod_if((ba)localObject16);
            localbn2.jdMethod_do((ba)localObject16);
          }
          else
          {
            (localObject16 = new ak(i12, (short)(i8 + i10 * 10 + 2), i14, 180, localbe)).jdMethod_try(1);
            ((ak)localObject16).jdMethod_else(-1);
            ((ak)localObject16).jdMethod_if((String)localObject15);
            localbe.jdMethod_if((ba)localObject16);
            localbn2.jdMethod_do((ba)localObject16);
          }
          i20++;
        }
        if ((paramDataInputStream = localObject7).U == null)
        {
          ((y)localObject7).jdMethod_new(true);
          localbn2.jdMethod_do((paramDataInputStream = localObject7).U);
        }
        ((y)localObject7).a(21, 8);
        localbn2.w();
        localbe.jdMethod_if(localbn2);
        ba.q = true;
        break;
      case -2146238462:
        i = paramDataInputStream.readShort();
        int k = paramDataInputStream.readShort();
        i1 = paramDataInputStream.readByte();
        b5.jdMethod_case("-------------------------------- rowNum = " + i1);
        short[] arrayOfShort = new short[i1];
        Object[] arrayOfObject = new Object[i1];
        String[] arrayOfString = new String[i1];
        Object localObject11;
        for (i8 = 0; i8 < i1; i8++)
        {
          arrayOfString[i8] = paramDataInputStream.readUTF();
          if (arrayOfString[i8].length() > 2)
          {
            i10 = arrayOfString[i8].length() - 2;
            arrayOfString[i8] = arrayOfString[i8].substring(i10, arrayOfString[i8].length());
          }
          arrayOfShort[i8] = paramDataInputStream.readShort();
          switch (arrayOfShort[i8])
          {
          case 1:
            localObject11 = new String[] { paramDataInputStream.readUTF(), paramDataInputStream.readUTF() };
            arrayOfObject[i8] = localObject11;
            break;
          case 4:
            int[] arrayOfInt = { paramDataInputStream.readInt(), paramDataInputStream.readInt() };
            arrayOfObject[i8] = arrayOfInt;
          }
          b5.jdMethod_case("********************************************");
          b5.jdMethod_case("firstColStr[" + i8 + "] = " + arrayOfString[i8]);
          b5.jdMethod_case("rowType[" + i8 + "] = " + arrayOfShort[i8]);
          int i13;
          switch (arrayOfShort[i8])
          {
          case 1:
            localObject11 = (String[])(String[])arrayOfObject[i8];
            for (i13 = 0; i13 < localObject11.length; i13++)
              b5.jdMethod_case("rowContent[" + i8 + "]~m[" + i13 + "] = " + localObject11[i13]);
            break;
          case 4:
            localObject11 = (int[])(int[])arrayOfObject[i8];
            for (i13 = 0; i13 < localObject11.length; i13++)
              b5.jdMethod_case("rowContent[" + i8 + "]~m[" + i13 + "] = " + localObject11[i13]);
          }
          b5.jdMethod_case("********************************************");
        }
        (localbe = new be(0, 0, (short)a5.ic, (short)a5.il)).g9 = 1245185;
        be.g1 = true;
        y.S = true;
        y.M = true;
        bn localbn1 = new bn(localbe.g9, localbe);
        (localObject11 = new ao(0, localbe)).jdMethod_do("装备比较");
        localbe.jdMethod_if((ba)localObject11);
        Object localObject12 = new ao(1, localbe);
        localbe.jdMethod_if((ba)localObject12);
        ba.q = false;
        y localy2 = new y(0, 18, (short)a5.ic, (short)(a5.il - 18 - ao.aA() + 7), 1, localbe);
        localbe.jdMethod_if(localy2);
        short s5 = (short)(135 * a5.il / 208 + 5);
        localy2.jdMethod_try(49);
        localy2.jdMethod_case(s5);
        localbn1.jdMethod_do(localy2);
        i20 = (short)(29 * a5.il / 208);
        s6 = (short)(60 * a5.ic / 176);
        short s7 = (short)(125 * a5.ic / 176);
        localObject15 = new a7(21, i20, localbe);
        localbe.jdMethod_if((ba)localObject15);
        localbn1.jdMethod_do((ba)localObject15);
        (localObject16 = new a7(s6, i20, 0, 0, null, 1, localbe)).g(i);
        paramInt = (short)(i % 1000);
        ((a7)localObject16).ft = true;
        ((a7)localObject16).jdMethod_if(paramInt, true);
        ((a7)localObject16).a(a5.gg);
        localbe.jdMethod_if((ba)localObject16);
        localbn1.jdMethod_do((ba)localObject16);
        (localObject12 = new a7(s7, i20, 0, 0, null, 1, localbe)).g(k);
        paramInt = (short)(k % 1000);
        ((a7)localObject12).ft = true;
        ((a7)localObject12).jdMethod_if(paramInt, true);
        ((a7)localObject12).a(a5.gg);
        localbe.jdMethod_if((ba)localObject12);
        localbn1.jdMethod_do((ba)localObject12);
        short s9 = (short)(localy2.I[0] + a5.iA - 3);
        int i22 = (short)localy2.I[1];
        paramInt = (short)((paramDataInputStream = (short)((localy2.I[0] + (localy2.I[0] + (localy2.I[2] + ((a5.iA << 1) + 2 + 1)) / 2 + (a5.iA << 1) + 2 + 1)) / 2 - 1)) - (localy2.I[0] + (a5.iA << 1) + 2) + (localy2.I[0] + (localy2.I[2] + ((a5.iA << 1) + 2 + 1)) / 2) + 4);
        for (i = 0; i < i1; i++)
          switch (arrayOfShort[i])
          {
          case 1:
            localObject5 = (String[])(String[])arrayOfObject[i];
            localObject7 = new ah(s9, (short)(i22 + a5.iG * i), 0, arrayOfString[i], true, localbe);
            localObject11 = new ah(paramDataInputStream, (short)(i22 + a5.iG * i), 0, localObject5[0], true, localbe);
            localObject12 = new ah(paramInt, (short)(i22 + a5.iG * i), 0, localObject5[1], true, localbe);
            localbe.jdMethod_if((ba)localObject7);
            localbn1.jdMethod_do((ba)localObject7);
            localbe.jdMethod_if((ba)localObject11);
            localbn1.jdMethod_do((ba)localObject11);
            localbe.jdMethod_if((ba)localObject12);
            localbn1.jdMethod_do((ba)localObject12);
            break;
          case 4:
            localObject5 = (int[])(int[])arrayOfObject[i];
            localObject7 = new ah(s9, (short)(i22 + a5.iG * i), 0, arrayOfString[i], true, localbe);
            (localObject11 = new ah(paramDataInputStream, (short)(i22 + a5.iG * i), 3, localbe)).jdMethod_case(localObject5[0]);
            ((ba)localObject11).jdMethod_new((short)(paramDataInputStream - ((ba)localObject11).jdMethod_for() / 2));
            ((ba)localObject11).jdMethod_for((short)(i22 + a5.iG * i + ((ba)localObject11).z() / 2));
            (localObject12 = new ah(paramInt, (short)(i22 + a5.iG * i), 3, localbe)).jdMethod_case(localObject5[1]);
            ((ba)localObject12).jdMethod_new((short)(paramInt - ((ba)localObject12).jdMethod_for() / 2));
            ((ba)localObject12).jdMethod_for((short)(i22 + a5.iG * i + ((ba)localObject12).z() / 2));
            localbe.jdMethod_if((ba)localObject7);
            localbn1.jdMethod_do((ba)localObject7);
            localbe.jdMethod_if((ba)localObject11);
            localbn1.jdMethod_do((ba)localObject11);
            localbe.jdMethod_if((ba)localObject12);
            localbn1.jdMethod_do((ba)localObject12);
          }
        if (((paramDataInputStream = localy2).U == null) && ((paramDataInputStream = localy2).G < i1))
        {
          localy2.jdMethod_new(true);
          localbn1.jdMethod_do((paramDataInputStream = localy2).U);
        }
        localy2.a((short)i1, (short)(paramDataInputStream = localy2).G);
        localbn1.w();
        localbe.jdMethod_if(localbn1);
        ba.q = true;
        break;
      case -2146762738:
        localbe = a5.es;
        i = paramDataInputStream.readByte();
        (localObject5 = (ay)localbe.cf().elementAt(3)).jdMethod_char(i);
        ((ay)localObject5).jdMethod_case(i);
        b5.jdMethod_case("CommandList.S_TEAM_DIVIDE" + i);
        break;
      case -2145517536:
        localbe = a5.es;
        int j;
        au.new = new int[j = paramDataInputStream.readByte()];
        for (int m = 0; m < j; m++)
          au.new[m] = paramDataInputStream.readInt();
        (localah1 = (ah)localbe.cf().elementAt(16)).a("" + au.new[au.for]);
        break;
      case -2145583099:
        localbe = a5.es;
        bw.f = paramDataInputStream.readInt();
        (localObject2 = (a9)localbe.cf().elementAt(7)).a(new StringBuffer(Integer.toString(bw.f)));
        ((a9)localObject2).j(false);
        break;
      case -2147090429:
        localbe = a5.es;
        bp.ag().eY = paramDataInputStream.readLong();
        bp.ag().fR = paramDataInputStream.readLong();
        if (a5.es == null)
          break;
        switch (a5.es.g9)
        {
        case 393219:
          System.out.println("人物基础界面接收经验");
          localObject2 = (ah)a5.es.cf().elementAt(33);
          localah1 = (ah)a5.es.cf().elementAt(35);
          ((ah)localObject2).a(7);
          localah1.a(7);
          ((ah)localObject2).a(bp.ag().eY);
          localah1.a(bp.ag().fR);
          a5.fR = false;
          break;
        case 2162693:
        case 2162708:
        case 2162719:
        case 2162730:
        case 2162739:
        case 2162747:
        case 2162760:
        case 2162767:
        case 2162774:
        case 2162781:
          System.out.println("商业技能学习信息接收经验");
          (localObject2 = (ah)a5.es.cf().elementAt(8)).a(7);
          ((ah)localObject2).a(bp.ag().eY);
          a5.fR = false;
          break;
        case 983047:
          System.out.println("经验商店信息接收经验");
          (localObject2 = (ah)a5.es.cf().elementAt(7)).a(7);
          ((ah)localObject2).a(bp.ag().eY);
          a5.fR = false;
        }
      }
    }
    catch (Exception localException2)
    {
      Object localObject2;
      (localObject2 = localException2).printStackTrace();
    }
    return (be)(be)(be)(be)(be)(be)(be)(be)(be)(be)(be)(be)(be)(be)(be)(be)localbe;
  }

  private static ah jdMethod_do(DataInputStream paramDataInputStream, be parambe)
    throws IOException
  {
    byte b = paramDataInputStream.readByte();
    short s1 = paramDataInputStream.readShort();
    short s2 = paramDataInputStream.readShort();
    String str = paramDataInputStream.readUTF();
    ah localah = null;
    int i;
    switch (b)
    {
    case 0:
      localah = new ah(s1, s2, b, str, parambe);
      break;
    case 1:
      short s3 = paramDataInputStream.readShort();
      paramDataInputStream = paramDataInputStream.readInt();
      (localah = new ah(s1, s2, s3, b, str, parambe)).jdMethod_char(paramDataInputStream);
      break;
    case 2:
      i = paramDataInputStream.readInt();
      paramDataInputStream = paramDataInputStream.readInt();
      (localah = new ah(s1, s2, b, parambe, 0)).jdMethod_case(i);
      localah.jdMethod_byte(paramDataInputStream);
      break;
    case 3:
      i = paramDataInputStream.readInt();
      (localah = new ah(s1, s2, b, parambe)).jdMethod_case(i);
      break;
    case 4:
      i = paramDataInputStream.readShort();
      localah = new ah(s1, s2, i, b, str, parambe);
    }
    return localah;
  }

  private static ay jdMethod_char(DataInputStream paramDataInputStream, be parambe)
    throws IOException
  {
    int i = paramDataInputStream.readByte();
    int j = paramDataInputStream.readShort();
    short s = paramDataInputStream.readShort();
    String str2 = paramDataInputStream.readUTF();
    int k = paramDataInputStream.readByte();
    parambe = new ay(j, s, i, str2, parambe);
    for (j = 0; j < k; j = (byte)(j + 1))
    {
      String str1 = paramDataInputStream.readUTF();
      parambe.jdMethod_try(str1);
    }
    j = paramDataInputStream.readByte();
    parambe.jdMethod_char(j);
    switch (i)
    {
    case 0:
      boolean bool2 = paramDataInputStream.readBoolean();
      parambe.e(bool2);
      parambe.jdMethod_do(parambe.bg());
      parambe.a(parambe.bb());
      parambe.ef = new boolean[k];
      for (i = 0; i < k; i++)
      {
        boolean bool1 = paramDataInputStream.readBoolean();
        parambe.a(i, bool1);
      }
    }
    return parambe;
  }

  private static a7 jdMethod_int(DataInputStream paramDataInputStream, be parambe)
    throws IOException
  {
    byte b1 = paramDataInputStream.readByte();
    short s1 = paramDataInputStream.readShort();
    short s2 = paramDataInputStream.readShort();
    String str1 = paramDataInputStream.readUTF();
    b5.jdMethod_case("imgName = " + str1);
    a7 locala7 = null;
    String str2;
    switch (b1)
    {
    case 0:
      short s3 = paramDataInputStream.readShort();
      short s4 = paramDataInputStream.readShort();
      paramDataInputStream = paramDataInputStream.readBoolean();
      (locala7 = new a7(s1, s2, s3, s4, str1, b1, parambe)).f(paramDataInputStream);
      break;
    case 2:
      str2 = null;
      locala7 = new a7(s1, s2, str1, null, b1, parambe);
      break;
    case 3:
      str2 = paramDataInputStream.readUTF();
      Object localObject = null;
      (locala7 = new a7(s1, s2, str1, null, b1, parambe)).jdMethod_case(str2);
      break;
    case 1:
      boolean bool = paramDataInputStream.readBoolean();
      byte b3 = paramDataInputStream.readByte();
      paramDataInputStream = paramDataInputStream.readBoolean();
      (locala7 = new a7(s1, s2, str1, null, b1, parambe)).g(bool);
      locala7.a(bool, b3);
      locala7.i(paramDataInputStream);
      break;
    case 4:
      byte b2 = paramDataInputStream.readByte();
      (locala7 = new a7(s1, s2, str1, null, b1, parambe)).f(b2);
      break;
    case 5:
      locala7 = new a7(s1, s2, str1, null, b1, parambe);
    }
    return locala7;
  }

  private static ae jdMethod_if(DataInputStream paramDataInputStream, be parambe)
    throws IOException
  {
    short s1 = paramDataInputStream.readShort();
    short s2 = paramDataInputStream.readShort();
    int j = paramDataInputStream.readShort();
    byte b = paramDataInputStream.readByte();
    parambe = new ae(s1, s2, j, 0, b, parambe);
    int i = paramDataInputStream.readInt();
    Vector localVector = new Vector();
    j = 0;
    i = i;
    while (j < i)
    {
      String str = paramDataInputStream.readUTF();
      localVector.addElement(str);
      j++;
    }
    parambe.a(localVector);
    return parambe;
  }

  private static bv jdMethod_byte(DataInputStream paramDataInputStream, be parambe)
    throws IOException
  {
    int i = paramDataInputStream.readByte();
    int j = paramDataInputStream.readShort();
    short s1 = paramDataInputStream.readShort();
    short s2 = paramDataInputStream.readShort();
    short s3 = paramDataInputStream.readShort();
    parambe = new bv(j, s1, s2, s3, i, parambe);
    switch (i)
    {
    case 0:
      i = paramDataInputStream.readByte();
      for (j = 0; j < i; j++)
      {
        String str = paramDataInputStream.readUTF();
        parambe.a(new m(str, 0, 0, parambe.dF()));
      }
      boolean bool1 = paramDataInputStream.readBoolean();
      boolean bool2 = paramDataInputStream.readBoolean();
      paramDataInputStream = paramDataInputStream.readBoolean();
      parambe.o(bool1);
      parambe.p(bool2);
      parambe.n(paramDataInputStream);
      parambe.x(parambe.z$132bd3());
      bv.a(parambe, 0);
    }
    return parambe;
  }

  private static bg jdMethod_new(DataInputStream paramDataInputStream, be parambe)
    throws IOException
  {
    int i = paramDataInputStream.readShort();
    short s1 = paramDataInputStream.readShort();
    short s2 = paramDataInputStream.readShort();
    int k = paramDataInputStream.readShort();
    short s3 = paramDataInputStream.readByte();
    int m = paramDataInputStream.readByte();
    int n = paramDataInputStream.readShort();
    v localv3 = new v();
    for (int i2 = 0; i2 < m; i2++)
    {
      paramDataInputStream.readByte();
      int i3 = 0;
      ah localah = jdMethod_do(paramDataInputStream, parambe);
      localv3.a(localah);
    }
    bg localbg = new bg(i, s1, s2, k, m, localv3, parambe);
    short[] arrayOfShort = new short[m];
    for (int i4 = 0; i4 < m; i4++)
      arrayOfShort[i4] = paramDataInputStream.readShort();
    boolean[] arrayOfBoolean = new boolean[m];
    for (i = 0; i < m; i++)
      arrayOfBoolean[i] = paramDataInputStream.readBoolean();
    for (i = 0; i < s3; i++)
    {
      v localv1;
      k = n;
      v localv2;
      (localv2 = localv1 = new v()).b = (short)(k * a5.il / 208);
      for (int j = 0; j < m; j++)
      {
        Object localObject = null;
        int i1;
        switch (i1 = paramDataInputStream.readByte())
        {
        case 1:
          localObject = jdMethod_do(paramDataInputStream, parambe);
          break;
        case 4:
          localObject = jdMethod_int(paramDataInputStream, parambe);
          break;
        default:
          b5.jdMethod_case("列表中的未知控件类型");
        }
        boolean bool = paramDataInputStream.readBoolean();
        ((ba)localObject).a(bool);
        if (((ba)localObject).o())
          paramDataInputStream.readShort();
        localv1.a((ba)localObject);
      }
      localv1.a(arrayOfShort);
      localv1.a(arrayOfBoolean);
      localbg.jdMethod_if(localv1);
    }
    if (localbg.cI() != null)
      localbg.cI().a(arrayOfShort);
    return (bg)localbg;
  }
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     e
 * JD-Core Version:    0.6.0
 */
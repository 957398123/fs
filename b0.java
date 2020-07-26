final class b0
{
  private int jdField_goto;
  private int jdField_int;
  private int jdField_for;
  private int a;
  private int[][] jdField_do;
  private int[][] jdField_new;
  private int[][] jdField_long;

  public final int[][] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.jdField_goto = paramInt1;
    this.jdField_int = paramInt2;
    this.jdField_for = paramInt3;
    this.a = paramInt4;
    this = this;
    this.jdField_long = new int[0][];
    this.jdField_do = new int[2][];
    paramInt1 = jdMethod_if(this.jdField_goto, this.jdField_int);
    this.jdField_do[0] = new int[0];
    this.jdField_do[1] = { this.jdField_goto, this.jdField_int, 0, paramInt1, 0, paramInt1 };
    this.jdField_new = new int[0][];
    while (this.jdField_do.length > 0)
    {
      paramInt1 = this;
      this.jdField_new = a(paramInt1.jdField_new, paramInt1.jdField_new.length, 1);
      paramInt1.jdField_new[(paramInt1.jdField_new.length - 1)] = paramInt1.jdField_do[1];
      paramInt3 = (paramInt2 = paramInt1).jdField_do.length - 1;
      paramInt2.jdField_do[1] = paramInt2.jdField_do[paramInt3];
      paramInt2.jdField_do = a(paramInt2.jdField_do, paramInt3, -1);
      paramInt3 = paramInt2.jdField_do.length - 1;
      for (paramInt4 = 1; (paramInt4 << 1) + 1 <= paramInt3; paramInt4 = k)
      {
        j = (i = paramInt4 << 1) + 1;
        k = paramInt2.jdField_do[i][5] < paramInt2.jdField_do[j][5] ? i : j;
        if (paramInt2.jdField_do[paramInt4][5] <= paramInt2.jdField_do[k][5])
          break;
        int[] arrayOfInt = paramInt2.jdField_do[paramInt4];
        paramInt2.jdField_do[paramInt4] = paramInt2.jdField_do[k];
        paramInt2.jdField_do[k] = arrayOfInt;
      }
      paramInt1 = this.jdField_new.length - 1;
      if ((this.jdField_new[paramInt1][0] == this.jdField_for) && (this.jdField_new[paramInt1][1] == this.a))
      {
        paramInt1 = this;
        this.jdField_long = a(paramInt1.jdField_long, 0, 1);
        paramInt1.jdField_long[(paramInt1.jdField_long.length - 1)] = paramInt1.jdField_new[(paramInt1.jdField_new.length - 1)];
        while (paramInt1.jdField_long[0][2] != 0)
        {
          paramInt1.jdField_long = a(paramInt1.jdField_long, 0, 1);
          paramInt1.jdField_long[0] = paramInt1.jdField_new[paramInt1.jdField_long[1][4]];
        }
        paramInt1.jdField_goto = paramInt1.jdField_for;
        paramInt1.jdField_int = paramInt1.a;
        break;
      }
      paramInt2 = paramInt1;
      paramInt1 = this;
      paramInt3 = this.jdField_new[paramInt2][0];
      paramInt4 = paramInt1.jdField_new[paramInt2][1];
      int i = 0;
      int j = 0;
      int k = 0;
      int m = 0;
      int n = 0;
      int i1 = 0;
      n = paramInt3;
      if (((i1 = paramInt4 - 1) >= 0) && (jdField_do(n, i1)))
      {
        i = 1;
        if ((paramInt1.jdMethod_if(n, i1, paramInt2)) && (paramInt1.a(n, i1)))
          paramInt1.a(n, i1, paramInt2);
      }
      n = paramInt3;
      if (((i1 = paramInt4 + 1) < z.U) && (jdField_do(n, i1)))
      {
        j = 1;
        if ((paramInt1.jdMethod_if(n, i1, paramInt2)) && (paramInt1.a(n, i1)))
          paramInt1.a(n, i1, paramInt2);
      }
      n = paramInt3 - 1;
      i1 = paramInt4;
      if ((n >= 0) && (jdField_do(n, i1)))
      {
        k = 1;
        if ((paramInt1.jdMethod_if(n, i1, paramInt2)) && (paramInt1.a(n, i1)))
          paramInt1.a(n, i1, paramInt2);
      }
      n = paramInt3 + 1;
      i1 = paramInt4;
      if ((n < z.try) && (jdField_do(n, i1)))
      {
        m = 1;
        if ((paramInt1.jdMethod_if(n, i1, paramInt2)) && (paramInt1.a(n, i1)))
          paramInt1.a(n, i1, paramInt2);
      }
      n = paramInt3 - 1;
      i1 = paramInt4 - 1;
      if ((i != 0) && (k != 0) && (jdField_do(n, i1)) && (paramInt1.jdMethod_if(n, i1, paramInt2)) && (paramInt1.a(n, i1)))
        paramInt1.a(n, i1, paramInt2);
      n = paramInt3 + 1;
      i1 = paramInt4 - 1;
      if ((i != 0) && (m != 0) && (jdField_do(n, i1)) && (paramInt1.jdMethod_if(n, i1, paramInt2)) && (paramInt1.a(n, i1)))
        paramInt1.a(n, i1, paramInt2);
      n = paramInt3 + 1;
      i1 = paramInt4 + 1;
      if ((j != 0) && (m != 0) && (jdField_do(n, i1)) && (paramInt1.jdMethod_if(n, i1, paramInt2)) && (paramInt1.a(n, i1)))
        paramInt1.a(n, i1, paramInt2);
      n = paramInt3 - 1;
      i1 = paramInt4 + 1;
      if ((j != 0) && (k != 0) && (jdField_do(n, i1)) && (paramInt1.jdMethod_if(n, i1, paramInt2)) && (paramInt1.a(n, i1)))
        paramInt1.a(n, i1, paramInt2);
    }
    this.jdField_do = null;
    this.jdField_new = null;
    return this.jdField_long;
  }

  private final boolean jdMethod_if(int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = this.jdField_do.length - 1; i > 0; i--)
    {
      if ((this.jdField_do[i][0] != paramInt1) || (this.jdField_do[i][1] != paramInt2))
        continue;
      if ((paramInt1 = jdField_do(paramInt1, paramInt2, paramInt3)) < this.jdField_do[i][2])
      {
        this.jdField_do[i][2] = paramInt1;
        this.jdField_do[i][4] = paramInt3;
        this.jdField_do[i][5] = (this.jdField_do[i][2] + this.jdField_do[i][3]);
        jdMethod_if(i);
      }
      return false;
    }
    return true;
  }

  private final boolean a(int paramInt1, int paramInt2)
  {
    for (int i = this.jdField_new.length - 1; i >= 0; i--)
      if ((this.jdField_new[i][0] == paramInt1) && (this.jdField_new[i][1] == paramInt2))
        return false;
    return true;
  }

  private static boolean jdField_do(int paramInt1, int paramInt2)
  {
    return z.a().jdField_int(paramInt1, paramInt2);
  }

  private final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.jdField_do = a(this.jdField_do, this.jdField_do.length, 1);
    int i = jdField_do(paramInt1, paramInt2, paramInt3);
    int j = jdMethod_if(paramInt1, paramInt2);
    this.jdField_do[(this.jdField_do.length - 1)] = { paramInt1, paramInt2, i, j, paramInt3, i + j };
    this = this;
    jdMethod_if(this.jdField_do.length - 1);
  }

  private final void jdMethod_if(int paramInt)
  {
    int i;
    for (paramInt = paramInt; paramInt > 1; paramInt = i)
    {
      i = paramInt >> 1;
      if (this.jdField_do[paramInt][5] >= this.jdField_do[i][5])
        break;
      int[] arrayOfInt = this.jdField_do[paramInt];
      this.jdField_do[paramInt] = this.jdField_do[i];
      this.jdField_do[i] = arrayOfInt;
    }
  }

  private final int jdField_do(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = this.jdField_new[paramInt3][0];
    int j = this.jdField_new[paramInt3][1];
    this = this.jdField_new[paramInt3][2];
    if ((i - paramInt1 != 0) && (j - paramInt2 != 0))
      return this + 14;
    return this + 10;
  }

  private final int jdMethod_if(int paramInt1, int paramInt2)
  {
    return Math.abs(this.jdField_for - paramInt1) * 10 + Math.abs(this.a - paramInt2) * 10;
  }

  public static final int[][] a(int[][] paramArrayOfInt, int paramInt1, int paramInt2)
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
}

/* Location:           C:\Users\ppz\Desktop\GOH_ALL2.jar
 * Qualified Name:     b0
 * JD-Core Version:    0.6.0
 */
import javax.microedition.lcdui.Graphics;

/**
 * 2020-07-26
 * 
 * @author ppz
 * 
 */
public final class y extends ba {
	private short Q = -1;

	short E = -1;

	af U = null;

	private af R = null;

	int F = 15317892;

	int T = 600869;

	public int[] I = new int[4];

	int G = 0;

	public static boolean S;

	public static boolean M;

	public y(short paramShort1, short paramShort2, short paramShort3,
			short paramShort4, byte paramByte, be parambe) {
		super(paramShort1, paramShort2, paramShort3, paramShort4, parambe);
		y = paramByte;
		I[0] = (k + 10 + 3 + 1 + 1);
		if (E == -1) {
			I[1] = (j + 5 + 1 + 1 + 1);
		} else {
			I[1] = (this.j + 5 + 1 + 1 + 1 + E);
		}
		I[2] = (k + a - 30 - a5.ca.getWidth());
		if (Q == -1) {
			I[3] = (jdField_int - 16);
		} else {
			I[3] = (Q - 6);
		}
		G = (I[3] / a5.iG);
	}

	public final void a(Graphics paramGraphics) {
		if (this.y == 2) {
			paramGraphics.setColor(T);
			paramGraphics.drawRect(k, j, a - 1, jdField_int - 1);
			paramGraphics.setColor(F);
			paramGraphics.fillRect(k + 1, j + 1, a - 2, jdField_int - 2);
			return;
		}
		int i = a;
		paramGraphics.setColor(7755053);
		paramGraphics.fillRect(k, j, i, jdField_int);
		paramGraphics.setColor(11241821);
		paramGraphics.fillRect(k + 1, j + 1, i - 2, jdField_int - 2);
		paramGraphics.setColor(15255701);
		paramGraphics.fillRect(k + 2, j + 2, i - 4, jdField_int - 4);
		paramGraphics.setColor(11241821);
		paramGraphics.fillRect(k + 3, j + 3, i - 6, jdField_int - 6);
		paramGraphics.setColor(12952181);
		paramGraphics.fillRect(k + 4, j + 4, i - 8, jdField_int - 8);
		paramGraphics.setColor(15255701);
		paramGraphics.fillRect(k + 5, j + 5, i - 10, jdField_int - 10);
		paramGraphics.setColor(bm.jdField_try);
		paramGraphics.fillRect(k + 6, j + 6, i - 12, jdField_int - 12);
		if (y == 1) {
			if (M)
			{i = k + 10 - 4;}
			else
			{i = k + 10;}
			int j = 0;
			if (E == -1)
			{j = j + 5 + 2;}
			else
			{j = j + 5 + 2 + E;}
			int k;
			if (M)
			{k = a - 20 + 8;}
			else
			{k = a - 20;}
			int m = 0;
			if (Q == -1)
			{m = jdField_int - 14;}
			else
			{m = Q - 5;}
			paramGraphics.setColor(bm.dt);
			paramGraphics.fillRect(i, j, k, m);
			i += 3;
			j += 1;
			k -= 6;
			m -= 2;
			paramGraphics.setColor(bm.jdField_try);
			paramGraphics.fillRect(i, j, k, m);
			i += 1;
			j += 1;
			k -= 2;
			m -= 2;
			paramGraphics.setColor(bm.dt);
			paramGraphics.fillRect(i, j, k, m);
			i += 1;
			j += 1;
			k -= 2;
			m -= 2;
			paramGraphics.setColor(bm.jdField_try);
			paramGraphics.fillRect(i, j, k, m);
			if (U != null)
			{U.a(paramGraphics);}
		}
	}

	public final void f() {
	}

	public final void jdMethod_new(boolean paramBoolean) {
		if ((y == 1) && (U == null)) {
			int i;
			if (M)
			{i = k + a - 10 - 3 - 1 - 1 - a5.ca.getWidth() + 3;}
			else
			{i = k + a - 10 - 3 - 1 - 1 - a5.ca.getWidth() - 3;}
			int j = 0;
			if (E == -1)
				j = j + 5 + 1 + 1 + 1 + 3;
			else
				j = j + 5 + 1 + 1 + 1 + 3 + E;
			int k = 0;
			if (Q == -1)
				k = jdField_int - 22 - 1;
			else if (S)
				k = Q - 6 - 7;
			else
				k = Q - 6 - 1;
			U = new af((short) i, (short) j, (short) 0, (short) k, (byte) 0,
					paramBoolean, null);
		}
	}

	public final short M() {
		int i = 0;
		if (Q == -1)
			i = jdField_int - 10;
		else
			i = Q;
		return (short) i;
	}

	public final void jdMethod_case(short paramShort) {
		Q = paramShort;
		int i = 0;
		if (paramShort == -1)
			i = jdField_int - 16;
		else
			i = paramShort - 6;
		I[3] = i;
		G = (I[3] / a5.iG);
		if (U != null)
			U.a((short) i);
	}

	public final void jdMethod_try(short paramShort) {
		if (paramShort == jdField_long() + 5) {
			E = -1;
		} else {
			E = (short) ((paramShort - 5) * a5.il / 208 - jdField_long());
			I[1] = (E + jdField_long() + 8);
		}
		jdMethod_for(jdField_long());
	}

	public final af L() {
		return U;
	}

	public final void a(short paramShort1, short paramShort2) {
		if (U != null) {
			U.ay = paramShort2;
			U.az = paramShort1;
			U.aj = 0;
		}
	}
}
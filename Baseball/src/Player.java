
public class Player {
 private int H;
 private int AB;
 private int B2;
 private int B3;
 private int HR;
 private int R;
 private int BB;
 private int SF;
 private int HBP;
 public Player() {
	 H=2873;
	 AB=8399;
	 B2=506;
	 B3=136;
	 HR=714;
	 R=2174;
	 BB=2062;
	 SF=0;
	 HBP=43;
	 
 }
 public Player(int h, int aB, int b2, int b3, int hR, int r, int bB, int sF, int hBP) {
	super();
	H = h;
	AB = aB;
	B2 = b2;
	B3 = b3;
	HR = hR;
	R = r;
	BB = bB;
	SF = sF;
	HBP = hBP;
}

 public double BA() {
	 return (double)H/ AB;
 }
public double OBP() {
	return (double)(H+BB+HBP)/ (AB+BB+HBP+SF);
	}
public double SLG() {
	return (double)(TB())/ AB;
}
public double OPS() {
return OBP()+SLG();
}
public double TB() {
	return (double)(H+(1 * B2)+(2 *B3)+(3 *HR));
}
public int getH() {
	return H;
}
public void setH(int h) {
	H = h;
}
public int getAB() {
	return AB;
}
public void setAB(int aB) {
	AB = aB;
}
public int getB2() {
	return B2;
}
public void setB2(int b2) {
	B2 = b2;
}
public int getB3() {
	return B3;
}
public void setB3(int b3) {
	B3 = b3;
}
public int getHR() {
	return HR;
}
public void setHR(int hR) {
	HR = hR;
}
public int getR() {
	return R;
}
public void setR(int r) {
	R = r;
}
public int getBB() {
	return BB;
}
public void setBB(int bB) {
	BB = bB;
}
public int getSF() {
	return SF;
}
public void setSF(int sF) {
	SF = sF;
}
public int getHBP() {
	return HBP;
}
public void setHBP(int hBP) {
	HBP = hBP;//
}
}

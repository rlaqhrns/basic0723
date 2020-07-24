
public class Caculator2 {
	int korea;
	int eng;
	int math;
	int total;
	int members;
	float avg;
	String ranking;

	public Caculator2() {
	}

	public Caculator2(int i) {
		System.out.println("----�� �� " + (i + 1) + " �� �� ǥ----");
	}

	public Caculator2(int korea, int eng, int math) {
		this.korea = korea;
		this.eng = eng;
		this.math = math;
	}

	void setMembers(int members) {
		this.members = members;
	}

	int getMember() {
		return this.members;
	}

	void setKorea(int korea) {
		this.korea = korea;
	}

	int getKorea() {
		return this.korea;
	}

	void setEng(int eng) {
		this.eng = eng;
	}

	int getEng() {
		return this.eng;
	}

	void setMath(int math) {
		this.math = math;
	}

	int getMath() {
		return this.math;
	}

	int getTotal() {
		this.total = this.korea + this.math + this.eng;
		return this.total;
	}

	float getAvg() {
		this.avg = this.total / 3.0f;
		return this.avg;
	}
	String getRanking() {
		return ranking;
	}
	void setRanking(String ranking) {
		this.ranking = ranking;
	}

	String rating() {
		if (this.avg >= 90)
			return "��";
		else if (this.avg >= 80)
			return "��";
		else if (this.avg >= 70)
			return "��";
		else if (this.avg >= 60)
			return "��";
		else
			return "����";
	}

	void ratingPrint() {
		System.out.println("�� �� : " + getTotal() + "��");
		System.out.println("�� �� : " + getAvg() + "��");
		System.out.println(rating() + " �Դϴ�.");
	}

}

public class Caculator_teacher {
	int korea;// ����
	int eng;// ����
	int math;// ����
	int total;// ����
	float avg;// ���
	String ranking;// ���, "���Դϴ�.","���Դϴ�."

	// 1)������(�⺻)
	Caculator_teacher() {

	}

	// 2)3���� (����, ����, ����) �޴� ������
	// ��� �Ķ���ͷ� ���� ���������� ������� ���������� ����
	// �Ķ���ͷ� ���� ���������� ������� ���������� ����
	// �Ķ���ͷ� ���� ���������� ������� ���������� ����
	Caculator_teacher(int korea, int eng, int math) {
		this.korea = korea;
		this.eng = eng;
		this.math = math;
	}

	// getter�� setter ���弼��
	int getKorea() {
		return this.korea;
	}

	void setKorea(int korea) {
		this.korea = korea;
	}

	int getMath() {
		return this.math;
	}

	void setMath(int math) {
		this.math = math;
	}

	int getEng() {
		return this.eng;
	}

	void setEng(int eng) {
		this.eng = eng;
	}

	int getTotal() {
		return this.total;
	}

	void setTotal(int total) {
		this.total = total;
	}

	float getAvg() {
		return this.avg;
	}

	void setAvg(float avg) {
		this.avg = avg;
	}

	int calcTotal(int korea, int math, int eng) { // ������ ���ϴ� �޼���
		return korea + math + eng;
	}

	float calcAvg(int korea, int math, int eng) {// ����� ���ϴ¸޼���
		int total = korea + math + eng;
		return total / 3.0f;

	}

	String getRanking() {
		return ranking;
	}

	void setRanking(String ranking) {
		this.ranking = ranking;
	}

	// �Ķ���ͷ� ���� ���� ���������� �޾Ƽ� ����� 90���̻��̸� ���ڿ��� "���Դϴ�."
	// 80���̻��̸� "���Դϴ�. 70���̻��̸� "���Դϴ�. �׷��� ������ "�����Դϴ�."�� ��ȯ�ϴ� �Լ�(�޼���)
	// �����ϼ���
	String calcRanking(int korea, int math, int eng) {// ������ �� 3���� �޾Ƽ� ���ڿ��� ��ȯ
		int total = korea + math + eng;
		float avg = total / 3.0f;
		if (avg >= 90)
			return "���Դϴ�.";
		else if (avg >= 80)
			return "���Դϴ�.";
		else if (avg >= 70)
			return "���Դϴ�.";
		else
			return "�����Դϴ�.";
	}

}

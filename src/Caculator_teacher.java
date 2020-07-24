public class Caculator_teacher {
	int korea;// 국어
	int eng;// 영어
	int math;// 수학
	int total;// 총점
	float avg;// 평균
	String ranking;// 등급, "수입니다.","우입니다."

	// 1)생성자(기본)
	Caculator_teacher() {

	}

	// 2)3개의 (국어, 영어, 수학) 받는 생성자
	// 기능 파라미터로 받은 국어점수를 멤버변수 국어점수에 저장
	// 파라미터로 받은 수학점수를 멤버변수 수학점수에 저장
	// 파라미터로 받은 영어점수를 멤버변수 영어점수에 저장
	Caculator_teacher(int korea, int eng, int math) {
		this.korea = korea;
		this.eng = eng;
		this.math = math;
	}

	// getter와 setter 만드세요
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

	int calcTotal(int korea, int math, int eng) { // 총점을 구하는 메서드
		return korea + math + eng;
	}

	float calcAvg(int korea, int math, int eng) {// 평균을 구하는메서드
		int total = korea + math + eng;
		return total / 3.0f;

	}

	String getRanking() {
		return ranking;
	}

	void setRanking(String ranking) {
		this.ranking = ranking;
	}

	// 파라미터로 국어 영어 수학점수를 받아서 평균이 90점이상이면 문자열로 "수입니다."
	// 80점이상이면 "우입니다. 70점이상이면 "미입니다. 그렇지 않으면 "낙제입니다."를 반환하는 함수(메서드)
	// 생성하세요
	String calcRanking(int korea, int math, int eng) {// 정수형 값 3개를 받아서 문자열로 반환
		int total = korea + math + eng;
		float avg = total / 3.0f;
		if (avg >= 90)
			return "수입니다.";
		else if (avg >= 80)
			return "우입니다.";
		else if (avg >= 70)
			return "미입니다.";
		else
			return "낙제입니다.";
	}

}

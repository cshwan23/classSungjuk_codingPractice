// 20201106(2)28:00~
//******************************
// 소속 패키지 선언
//******************************
package com.aaa.erp;

//******************************
// 학생의 성적을 관리하는 클래스 선언.
// <주의> 클래스 이름은 의미있게 주어야하고, 관용적으로 대문자로 시작한다.(2)36:00
//******************************
public class Sungjuk {
	//******************************
	// 속성변수 선언 
	//******************************
	
	// 학생 정보 뭐가 중요한가? (1. 학생 번호 (이름은 중복가능성))
	// 학생 번호를 저장할 속성변수 선언
	// 학생의 번호는 객체화 시킬 때 집어넣을거다.
	// 학생의 성적을 관리하는 클래스이다.
	// (학생의 정보를 관리하는 클래스는 따로 있을거다)
	private int stu_no;
	
	// 왜 점수에 데이터는 안 넣은걸까
	// 어떤 학생의 데이터를 저장할지 모른다
	// 학생의 정보는 객체화 된 후 집어넣거나 과정중에 집어넣을거다.
	// 우리의 최종목적은 객체다 
	private int kor;
	// 국어 점수가 저장되는 속성변수 kor 선언
	private int eng;
	// 영어 점수가 저장되는 속성변수 eng 선언
	private int mat;
	// 수학 점수가 저장되는 속성변수 mat 선언

	public static int cnt;
	// 속성변수 앞에 static을 붙이면 n개의 객체에 공유한다. 
	// 이렇게하면 돼 안돼?
	// 이렇게하면 기본적으로 0이 들어간다.
	// cnt 앞에 static을 빼면 독단적이게 되서 누적되지 않는다.
	
	
	
	
	
	// 클래스를 구성하는 3대멤버 중 생성자를 만들거다.
	// 생성자 하나도 선언안해도 돼 안돼?
	// 코딩상 0개이상만 있어도 된다. 알아서 하나는 만들어주니까
	//************************************************************
	// 생성자 선언 
	// 생성자는 객체 생성 시 단 한번만 호출된다.
	// 생성자 호출 시 외부에서 데이터가 들어올 경우 매개변수를 받아온다.
	// 현재 매개변수는 int sut_no, int kor, int eng, int mat이다.
	// 즉 생성자 호출 시 외부에서 학생번호, 국어점수, 영어점수, 수학점수가 들어온다. 이걸 받는게 매개변수다.
	// <주의> 생성자는 객체 생성 후 인위적으로 다시 호출할 수 없다.
	//************************************************************
	// 매개변수는 이안에서 사용되고 제거될 놈이기 때문에 
	// 이름이 속성변수와 똑같아도 오류 나지 않는다. 신경쓰지마라.
	// 클래스 안에서 매개변수를 생성하는 두 곳(매서드(안), 생성자(안))
	// 매개변수를 어디에 담아놔야 영원히 저장할 수 있을까? 매개변수 안의 변수는 지역변수다. 
	// (3)00:00~
	public Sungjuk(int stu_no, int kor, int eng, int mat) {

		// 매개변수 stu_no로 들어오는 데이터를 속성변수 stu_no에 저장하기
		// 매개변수 속성변수에다 집어넣으려고하는거다. 
		// 이퀄왼쪽은 속성변수 이퀄 오른쪽은 매개변수여야하는데
		//		stu_no = stu_no; 이렇게 하면 누가 속성변수고 매개변수인지 헷갈린다.
		//		속성변수(안에) 매개변수 이름을 어떻게 줘야할까? 
		//그냥 속성변수와 똑같이 주자. 어차피 데이터가 똑같으니까.
		// 헷갈리는걸 방해하기 위해 this를 붙여준다.
		// this.이 붙은 놈이 진짜 자기 속성변수다.(매개변수와 헷갈리니까 붙이는거다)
		// 내 매개변수라고 강조하는것이다.
		// this. 용법은 내거라고 강조하는 것.
		//************************************************************
		
		// 매개변수 stu_no로 들어오는 데이터를 속성변수 stu_no에 저장하기
		// 매개변수명과 속성변수명이 동일할 경우 속성변수 왼쪽에 this를 붙인다.
		// 속성변수의 초기화작업 = 대부분 생성자 안에서 발생한다 **
		// * 생성자의 주 역할은 * 속성변수의 초기화 작업이다.
		// 외부에서 들어온 데이터를 속성변수안에 집어 넣는것이다.
		//************************************************************
		this.stu_no = stu_no;
		//************************************************************
		// 매개변수 stu_no로 들어오는 데이터를 속성변수 stu_no에 저장하기
		// 매개변수명과 속성변수명이 동일할 경우 속성변수 왼쪽에 this를 붙인다.
		//************************************************************
		this.kor = kor;
		//************************************************************
		// 매개변수 kor로 들어오는 데이터를 속성변수 kor에 저장하기
		// 매개변수명과 속성변수명이 동일할 경우 속성변수 왼쪽에 this를 붙인다.
		//************************************************************
		this.eng = eng;
		//************************************************************
		// 매개변수 eng로 들어오는 데이터를 속성변수 eng에 저장하기
		// 매개변수명과 속성변수명이 동일할 경우 속성변수 왼쪽에 this를 붙인다.
		//************************************************************
		this.mat = mat;
		//************************************************************
		// 매개변수 mat로 들어오는 데이터를 속성변수 mat에 저장하기
		// 매개변수명과 속성변수명이 동일할 경우 속성변수 왼쪽에 this를 붙인다.
		//************************************************************
		cnt++;
	
	}
	
	
	
	
	
	
	//************************************************************
	// 메소드 선언
	// 메소드를 통해 얻고자하는것 학생의 정보학생의 국어영어점수 평균 총점 학점..
	//************************************************************
	// 속성변수 stu_no의 데이터를 리턴하는 메소드 선언.
	// 주로 리턴값이 있는 메서드명은 주로 뭘로 많이 시작하냐면 get으로 많이 시작한다.
	public int getStu_no() {
		return stu_no;
	}
	// 속성변수 kor의 데이터를 리턴하는 메소드 선언.
	public int getKor() {
		return kor; // kor 속성변수다. 	
	}
	// 속성변수 eng의 데이터를 리턴하는 메소드 선언.
	public int getEng() {
		return eng; // eng 속성변수다. 	
	}
	// 속성변수 mat의 데이터를 리턴하는 메소드 선언.
	public int getMat() {
		return mat; // mat 속성변수다. 	
	}
	// 총점을 리턴하는 메소드 선언
	public int getTot() {
		return kor+eng+mat; // 이거 다 속성변수를 일컫는 말.
	}
	// 평균을 리턴하는 메소드 선언
	public double getAvg() {
		
//		return (kor+eng+mat)/3.0; //(double)(kor+eng+mat)/3도 상관없다.
		
		return getTot()/3.0; 
		// 동료중에 총점을 리턴해주는 동료를 호출하면 총점을 리턴하기로 되어있다.
	}
	public void xx() {

	}
//	매서드 안에 실행구문 없어도 돼 보이드면 아무것도 없어도돼 리턴형이 있으면 리턴 데이터가 있어야된다.
	// (7) 00:00~
	public String getHakjum() {
		// 국어 영어 수학 90점이상 a 80점 이상 b 70정 이상 c 60점 이상 d 그 이하 f
		
		// 평균 지역 변수
		double Avg = getAvg();
		
		// 학점 지역 변수
		String myHakjum = "F";
		
		if (Avg >= 90 && Avg <= 100 ) {
			myHakjum = "A";
		} else if (Avg >= 80) {
			myHakjum = "B";
		} else if (Avg >= 70) {
			myHakjum = "C";
		} else if (Avg >= 60) {
			myHakjum = "D";
		}
	
		return myHakjum;
		
	}
	// 영어 점수가 수정하는 메소드 선언
	// 국어 점수가 잘못되었을 경우.(수정하는set 디비수정할땐 update)
	// 매개변수 등장 이안에서 벌어지는 일은 뭐야?
	// 국어점수가 들어온다. 
	public void setKor(int kor ) {
		
	this.kor = kor;
	
	}
	// 영어 점수가 수정하는 메소드 선언
	public void setEng(int eng ) {
		
	this.eng = eng;
	
	}

	// 수학 점수가 수정하는 메소드 선언
	public void setMat(int mat ) {
		
	this.mat = mat;
	
	}

	
	// 실행되지 않는다 객체화 하지 않았기 때문.
	
	// 이 클래스를 객체화 시켜줄 클래스를 하나 더 만들어야한다. -> SungjukExe 클래스를 만든다.
	
	
	
	
	
	
	/*
	 //------------------------------------------------------
	 <문1> public class Sungjuk {~}을 class Sungjuk {~}로 고치면?
	 //------------------------------------------------------
	 
	  에러 발생. com.bbb.erp.SungjukExe 클래스에서 import 구문(com.aaa.erp.Sungjuk)에서 에러발생.
	  에러 이유. 수입 대상 클래스 마빡에 public이 없으면 타 패키지에서 수입이 불허하니까. 


	 //------------------------------------------------------
	 <문2> 위 Sungjuk 클래스를 개체화하기 전에
	 	   private int kor; 로 선언된 속성변수 kor 에는 뭐가 들어 있나?
	 //------------------------------------------------------
	  
	  정답 . 0이 저장되어 있다.
	  속성변수는 데이터 저장하지 않으면 디폴트 값이 저장된다.(= 자동 초기화)
	  디폴트값이 자동으로 들어가 있는것을 유식한 말로 자동초기화라고 한다.
	  왜? 메소드 안에 선언되는 지역 변수와 달리 속성변수는 클래스를 구성하는 중요한 요소이므로 자동 초기화 된다.
	
	
	 //------------------------------------------------------
	 <문3> private int kor; 을 private double kor;로 수정하면?
	 //------------------------------------------------------
	 
	 정답 : 에러발생
	 에러위치 =? 
	 public int getKort(){ return kor; } 부분에서 에러 발생.
	 return kor 코드에 실수가 리턴되는데
	 리턴되는 자료형은 int라고 했으므로 에러발생.
	 public int getTot(){ return kor+mat+eng; }부분에서 에러 발생
	 return kor-mat+eng; 코드에 의해 실수가 리턴되는데 리턴되는 자료형은 int f라고 했으므로 에러 발생
	
	 
	 //------------------------------------------------------
	 <문3> public int getKor() { return kor; )를
	 	   public double getKor() { return kor; }로 수정하면?
	 //------------------------------------------------------	 
	 
	 정답 : double이 int 보다 크니까. 변환이 된다.
	 
	 // (5) 00:00~
	 //------------------------------------------------------	
	 <문4> private int kor; 앞에 final 을 붙이면 에러가 날까?
	 //------------------------------------------------------	 
	 
	 정답 : 에러 없음	
	 리턴 자료형이 double이고 실제 리턴되는 데이터가 정수면
	 정수가 실수로 변하므로 형변환이 되어 리턴된다.
	
	
	 //------------------------------------------------------	
	 <문5> public int getKor(){ return kor; } 를
	 	  int getKor() { return kor; }로 수정하면?
	 //------------------------------------------------------		 

	 정답 : 에러 발생.
	 에러 위치 -> 
	 	com.bbb.erp.Sungjuk 클래스의 getKor 메소드 호출 지점
	 에러 이유 ->
	 	메소드 맨 앞의 접근 지정자가 default 면 타 패키지의 타 클래스에서의 호출은 금지한다.

	 //------------------------------------------------------	
	 <문6> public int kor; 를 private final int kor; 로 수정하면?
	 //------------------------------------------------------
	
	 정답 : 에러 없음.
	 final이 붙은 속성변수는 예외로 자동 초기화가 되지 않는다.
	 그러므로 개발자가 수동 초기화하여야한다.
	 수동 초기화는 속성변수 선언할 때 또는 생성자 안에서 해야한다.
	 현재 송성변수 선언할 때는 수동 초기화하지 않았지만 생성자 안에서 
	 수동 초기화 했으므로 에러는 발새하지 않는다.
	 만약 생성자 안의 this.kor = kor; 을 생략하면 에러가 발생한다.
	 
	 
	 //------------------------------------------------------	
	 <문7> public Sungjuk( int stu_no, int kor, int eng, int mat ) { ~ } 를
	 	  Sungjuk( int kor, int eng, int mat ) { ~ } 로 수정하면?
	 //------------------------------------------------------	 
	 
	 정답 : 에러 발생.
	 에러 위치 ->
	 	com.bbb.erp.Sungjuk 클래스의 Sungjuk sjk = new Sungjuk0(1, 99, 88, 77) 지점
	 에러 이유 ->
	    생성자에 접근 지정자가 default 면 동일한 패키지 안의 타 클래스에서만
	    객체화할 때 보이고 타 패키지의 타 클래스에서 안보이게 한다.
	    
	//------------------------------------------------------	
	 <문8>  public Sungjuk( int stu_no, int kor, int eng, int mat ) { ~ } 를
	 	   private Sungjuk( int kor, int eng, int mat ) { ~ } 로 수정하면?
	 //------------------------------------------------------   
	    
	 정답 : 에러발생.
	 에러 위치 ->
	     com.aaa.erp.SungjukExe 클래스의 Sungjuk sjk = new Sungjuk0(1, 99, 88, 77) 지점
	     com.bbb.erp.SungjukExe 클래스의 Sungjuk sjk = new Sungjuk0(1, 99, 88, 77) 지점
	 에러 이유 ->
	     생성자에 private 이 붙으면 그 어떤 타 클래스에 객체 생성과정 중에
	     생성자를 찾을 수 없게 한다. 결국 타 클래스에서 객체 생성을 막는 셈이다.
	     생성자에 private가 붙는 클래스는 대부분 속성변수나 메소드에 static을 붙여
	     객체 생성 없이 호출하도록 설정되어있다.
	     즉 객체 생성없이 그냥 써라라는 의미가 있다.
	     
	     생성자가 존재하나 아무에게도 보이지 않게 한다.
	     Math클라스는 생성자가 다 Private이다 수학적연산에 관련된 클래스. 보안성 필요없다. 
	     생성자 다막아놓고 속성변수 static으로 다 풀어놓았다. 더 빨리 갖다 쓰라고 오히려 

	//------------------------------------------------------	
	 <문9>  public Sungjuk( int stu_no, int kor, int eng, int mat ) { ~ } 를
	 	   삭제하면?
	 //------------------------------------------------------   
	    
	 정답 : 에러발생.
	 에러 위치 ->
	     com.aaa.erp.SungjukExe 클래스의 Sungjuk sjk = new Sungjuk0(1, 99, 88, 77) 지점
	     com.bbb.erp.SungjukExe 클래스의 Sungjuk sjk = new Sungjuk0(1, 99, 88, 77) 지점
	 에러 이유 ->
		Sungjuk( int stu_no, int kor, int eng, int mat ) 가 있는 생성자를 가진 클래스를 찾아
		객체화 하는데 이 생성자를 삭제하면 찾을 수 없어서 객체화에 실패한다.
		만약 : 생성자가 코딩 상 0개면 자바는 default 생성자를 삽입해준다.
		( default 생성자 형태 : public Sungjuk() { } )
		
	 //------------------------------------------------------	
	 <문10>  public Sungjuk { ~ } 를 public final Sungjuk{~}로 수정한다면?
	 //------------------------------------------------------  
		
	  정답 : 에러 없음.
	  클래스 앞의 final은 자식 클래스를 가지지 않겠다는 의미인데.
	  현재 Sungjuk 클래스의 자식 클래스가 없기 때문에 에러가 발생하지 않는다.
	  만약 임의의 어떤 클래스가 부모가 되어 달라고 요청하면 그 쪽에서 에러가 발생한다. 	
	  
	  참고 * 부모자식관계는 자식이 맺는거
	  추후 상속(inheritance)에서 자세히 배운다. 참으세요..
	  // (6)0:00 ~ 
	  상속이 되면 자식이 이득.
	  자식 영역에서 부모의 객체를 멤버로서 가질 수 있다.
	  1. 코드의 중복을 막는다.
      2. 관리하기가 쉽다. (ex 호구조사. 집 호 가구단위로 조사 // 개인으로 조사하는게 아니라)
	  
	  
	  (6)6:00~
	  //------------------------------------------------------	
	 <문11>  public Sungjuk{ ~ } 를  public abstract Sungjuk{ ~ } 로 수정하면? 
	 //------------------------------------------------------   
	    
	 정답 : 에러발생.
	 에러 위치 ->
	     com.aaa.erp.SungjukExe 클래스의 Sungjuk sjk = new Sungjuk0(1, 99, 88, 77) 지점
	     com.bbb.erp.SungjukExe 클래스의 Sungjuk sjk = new Sungjuk0(1, 99, 88, 77) 지점
	 에러 이유 ->  
	   클래스 마빡에 abstract 가 붙는 클래스는 객체 생성이 불가능하다. *중요*
	   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	   *더 중요*
	   클래스 마빡에 abstract 가 붙는 경우
	   		<1> : 소유한 메소드 중에 {~} 바디가 없는 메소드가 1개 이상 존재할 때
	  	   	<2> : 조상 클래스 중에 {~} 바디가 없는 메소드가 1개 이상 존재하는 조상 클래스가 있고
	  	   		  그 후손이 {~} 바디가 없는 메소드를 재정의 하지 않을 경우
	  	   	<3> : <1>,<2> 경우가 아닌 상태에서 그냥 객체 생성을 막을 경우 
	
	  //------------------------------------------------------	
	 <문12>  학점을 리턴하는 메소드 선언 
	 		public String getHakjum() {
	 		    ???
	 		}
	  //------------------------------------------------------  
	  	정 답.  	
	  	public String getHakjum() {
		// 국어 영어 수학 90점이상 a 80점 이상 b 70정 이상 c 60점 이상 d 그 이하 f
		
		// 평균 지역 변수
		double Avg = getAvg();
		
		// 학점 지역 변수
		String myHakjum = "F";
		
		if (Avg >= 90 && Avg <= 100 ) {
			myHakjum = "A";
		} else if (Avg >= 80) {
			myHakjum = "B";
		} else if (Avg >= 70) {
			myHakjum = "C";
		} else if (Avg >= 60) {
			myHakjum = "D";
		}
	
		return myHakjum;
		
	}
	  //지역 변수는 선언하고 바로 데이터를 넣어주는 것이 좋은데 안넣을 경우 else 가 꼭 들어가줘야한다.빈틈이 없어야.

	  
	  
	  //------------------------------------------------------  
	  문제(13) 국어점수를 수정하는 메소드를 선언해달라.
	  //------------------------------------------------------  
	
	정답. 
	// 영어 점수가 수정하는 메소드 선언
	// 국어 점수가 잘못되었을 경우.(수정하는set 디비수정할땐 update)
	// 매개변수 등장 이안에서 벌어지는 일은 뭐야?
	// 국어점수가 들어온다. 
	public void setKor(int kor ) {
		
	this.kor = kor;
	
	}
	// 영어 점수가 수정하는 메소드 선언
	public void setEng(int eng ) {
		
	this.eng = eng;
	
	}

	// 수학 점수가 수정하는 메소드 선언
	public void setMat(int mat ) {
		
	this.mat = mat;
	
	}
	 
	 //------------------------------------------------------  
	  문제(14) 모든 학생의 평균을 구하시오. //전체평균을 구하는 메소드가 필요하다(hint)
	 //------------------------------------------------------  
	  문제(15) 평균이 누적되는 속성변수 만들고 조회수뽑아내듯 전학생의 평균을 누적해서 뽑아보자.
	 //------------------------------------------------------  
 	  문제(16) 총점이 누적되는 속성변수. 
 	 //------------------------------------------------------  

 
 
 
 
 
	 
	 
	 */
	

}

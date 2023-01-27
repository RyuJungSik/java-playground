# java-playground

## 파트2 구구단 
### 요구사항1
- 구구단에서 2단과 3단을 계산해 화면에 출력한다.
- 예를 들어 2단은 2 곱하기 1 계산후 계산 값을 출력, 2 곱하기 2 계산 후 계산 값을 출력 ... 2곱하기 9까지 반복. 3단은 같은 과정을 반복
### 요구사항2
- 구구단에서 4단과 5단을 계산한 결과 값을 변수에 저장한 후 저장한 변수 값을 출력한다.
- 4단과 5단은 한번 결정하면 바뀌지 않는 값이다. 따라서 4단과 5단에 해당하는 상수 값으로 만든 후 프로그램을 구현한다.
- 예를 들어 4단은 4 곱하기 1 계산 결과 값을 i라는 변수에 저장하고, i라는 변수에 저장한 결과 값을 출력한다.
- 사용자가 입력한 숫자 값에 해당하는 단을 출력한다.
    - 예를 들어 사용자가 4라는 숫자를 입력하면 4단 전체를 계산해 출력한다.

### 요구사항3
- 지금까지 2 ~ 5단까지 구현하기 위해 단순, 반복적인 작업이 많았다.
- 이 같은 단순, 반복적인 작업을 변수와 반복문을 활용해 제거하면서 6단과 7단을 구현한다.

### 요구사항4
- 사용자가 입력한 숫자 값에 해당하는 단을 출력한다.
    - 예를 들어 사용자가 8이라는 숫자를 입력하면 8단 전체를 계산해 출력한다.
- 사용자가 2 이상, 9 이하가 아닌 값을 입력하는 경우 "2이상, 9이하의 값만 입력할 수 있습니다."라는 메시지를 출력한다.

### 요구사항5
- 구구단 결과을 배열에 저장한 후 배열의 결과를 출력한다.

### 요구사항6
- 구구단을 구현하기 위해 반복적으로 발생하는 부분이 있다.
- 반복적으로 발생하는 부분을 메소드를 활용해 반복되는 부분을 줄인다.

### 요구사항7
- main() 메소드는 프로그램을 시작하는 역할을 한다.
- 프로그램을 시작하는 클래스와 구구단을 구현하는 클래스를 분리한다.

### 요구사항8
- 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
- 예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)을 계산해 출력한다.
- 이 요구사항은 앞의 실습을 소화했으면 구현할 수 있기 때문에 생략한다.
- 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
- 예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다. 팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.

## 파트3. 캘린더 만들기
### 요구 사항

### 달력 출력

- 3단계와 같지만 년도와 월만 입력받는다.
- 진짜 캘린더에서 나오는 달력과 똑같은 모양의 달력을 출력한다.
- 추가적으로 입력받아야 하는 내용이 있는지 생각해 보자.
```
월을 입력하세요.
> 3
일 월 화 수 목 금 토
--------------------
 1  2  3  4  5  6  7
 8  9 10 11 12 13 14
15 16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31
월을 입력하세요.
> -1
Bye~
```

### 일정 관리

- 간단한 콘솔 기반 사용자 UI를 만든다. (일정 검색용)
- 오늘 날짜를 인식해서 해당 월의 달력을 출력한다.
- 달력에서 일정이 있는 날 아래에는 `.` 을 찍어서 보여준다.
- 일정을 등록, 검색, 변경이 가능하게 해 준다.
- 오늘의 일정을 표시해 준다.
```
+----------------------+
| 1. 일정 등록
| 2. 일정 검색
| 3. 달력 보기
| h. 도움말 q. 종료
+----------------------+
명령 (1, 2, 3, h, q)
> 1
[일정 등록] 날짜를 입력하세요.
> 2016-06-05
일정을 입력하세요.
> 자바지기에게 밥 얻어먹기
일정이 등록되었습니다.
명령 (1, 2, 3, h, q)
> 2
[일정 검색] 날짜를 입력하세요.
> 2016-06-05
1개의 일정이 있습니다.
1. 자바지기에게 밥 얻어먹기
명령 (1, 2, 3, h, q)
q
Bye
```

### 출처
- 만들어 가면서 배우는 JAVA 플레이그라운드 강의를 듣고 작성한 소스코드입니다.
- https://www.inflearn.com/course/java-codesquad

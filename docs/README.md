## 구현 기능 목록

⭐ 핵심 기능 : 자동차를 일정 확률로 전진 시키고 우승(가장 많이 이동)한 자동차를 출력하라.
<br>
<br>

1. (입력) 경주할 자동차 이름들을 입력 받기
   - 자동차 구분 : 쉼표(,)로 구분한다.
   - 자동차 개수 : 2대 이상 ~ 15대 이하
   - 자동차 이름 
      - 5자 이하
      - 특별한 문자, 숫자, 특수 기호, 공백 등의 제한은 없다.
        - 단, 맨 앞의 공백은 자동으로 제거한다. 이는, 이름 자릿 수에 들어가지 않는다.
    - 예외
      - 자동차 1대
        - 공백, 이 들어올 경우
      - 자동차 리스트
        - 동일한 자동차 이름이 들어올 경우
        - 자동차 개수가 2~15대 이하가 아닐 경우        
```markdown
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,woni,jun
```
<br>

2. (입력) 경주 시도 횟수 입력 받기
    - 시도 횟수는 1번 이상, 20번 이하로 한다.
    - 예외
      - 숫자, 자연수, 1~20 이외의 수가 들어올 경우
```markdown
시도할 횟수는 몇 회인가요?
5
```
<br>

3. 경주 실행
   - 입력 받은 횟수만큼 반복 한다.
   - 전진 조건
      - 0~9 사이의 무작위 값을 발생 시키고, 그 값이 4이상일 경우 전진하고 그 미만이면 그 자리에 멈춰 있는다.
      - 한 번에 한 칸만 전진이 가능하다.

4. (출력) 경주 실행 결과 출력
    - 경주 실행 결과를 출력한다.
    - 자동차의 이름과 현재 전진 상황을 함께 출력한다.
```markdown
실행 결과
pobi : -
woni : 
jun : -

pobi : --
woni : -
jun : --

pobi : ---
woni : --
jun : ---

pobi : ----
woni : ---
jun : ----

pobi : -----
woni : ----
jun : -----
```
<br>

5. (출력) 우승 자동차 출력
   - 가장 많이 전진한 자동차가 우승한다.
   - 우승한 자동차는 1대 이상이 될 수 있다.
   - 우승한 자동차가 여러 대일 경우 쉼표(,)로 구분한다.
     - 쉼표(,) 바로 뒤에 띄어 쓰기를 하고 이름을 출력한다.
   - 이후에 곧바로 경주를 종료한다.
```markdown
최종 우승자 : pobi, jun
```

#### 공통 예외 사항

1. 입력 오류
    - 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.
    - 입력 오류가 발생하더라도 종료하지 않고, 오류가 발생한 부분부터 다시 입력을 받는다.

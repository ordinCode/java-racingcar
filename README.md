# java-racingcar

## 기능 요구사항

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.



## 기능 목록
- [x] 사용자로부터 이름을 입력받는다.
  - [x] 이름이 1글자 이상 5글자 이내인지 확인
  - [x] 입력받은 이름을 ',' 기준으로 나누기
  - [x] 자동차 이름을 입력하여 객제로 저장
- [x] 사용자로부터 시도할 횟수를 입력받는다.
  - [x] 입력한 시도할 횟수가 숫자인지 확인
  - [x] 입력한 숫자가 0보다 큰지 확인
- [x] 랜덤으로 1~9 사이의 숫자 생성
- [x] car 객체와 숫자가 입력되면 position +1
- [x] 시도할 횟수만큼 게임 진행
- [x] 포지션을 int 로 입력받으면 그 값만큼 '-' 출력
- [x] 우승자 판별
  - [x] car 리스트를 입력받으면 maxPosition 구하기
  - [x] car 리스트를 입력받으면 우승자 리스트 반환하는 기능
- [x] 우승자 출력





## 예외

- [x] 이름 입력시 ',' 사이에 빈칸 입력
- [x] 이름 입력시 5글자 이상 입력
- [x] 시도할 횟수 입력시 숫자가 아닌 문자 입력
- [x] 시도할 횟수 입력시 0 이하의 숫자 입력

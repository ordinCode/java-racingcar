# 자동차 경주 게임
---
<img src="https://github.com/ordinCode/java_woowacourse/blob/master/%EC%9E%90%EB%8F%99%EC%B0%A8%EA%B2%BD%EC%A3%BC%EA%B2%8C%EC%9E%84/image/%EC%9E%90%EB%8F%99%EC%B0%A8%EA%B2%BD%EC%A3%BC%EA%B2%8C%EC%9E%84_%EA%B8%B0%EB%8A%A5%EC%9A%94%EA%B5%AC%EC%82%AC%ED%95%AD.png?raw=true" width="600"></center>
---
<img src="https://github.com/ordinCode/java_woowacourse/blob/master/%EC%9E%90%EB%8F%99%EC%B0%A8%EA%B2%BD%EC%A3%BC%EA%B2%8C%EC%9E%84/image/%EC%9E%90%EB%8F%99%EC%B0%A8%EA%B2%BD%EC%A3%BC%EA%B2%8C%EC%9E%84_%EC%8B%A4%ED%96%89%EA%B2%B0%EA%B3%BC.png?raw=true" with="400"></center></center>

## 프로그래밍 요구사항
- 다음 Car 객체를 활용하여 구현한다.
- Car 기본 생성자를 추가할 수 없다.
- name, position 변수의 접근 제어자인 private을 변경할 수 없다.

<img src="https://github.com/ordinCode/java_woowacourse/blob/master/%EC%9E%90%EB%8F%99%EC%B0%A8%EA%B2%BD%EC%A3%BC%EA%B2%8C%EC%9E%84/image/%EC%9E%90%EB%8F%99%EC%B0%A8%EA%B2%BD%EC%A3%BC%EA%B2%8C%EC%9E%84_car%ED%81%B4%EB%9E%98%EC%8A%A4.png?raw=true" width="450"></center>


- 3항 연산자를 쓰지 않는다.
- indent depth < 3
- 함수 길이가 15를 넘지 않도록 한다.
- else 예약어를 쓰지 않는다.

## 기능 목록
- [ ] 자동차 이름을 입력받기
- [ ] ',' 기준으로 나누기
- [ ] 입력받은 이름으로 Car 객체 만들기
- [ ] 시도할 횟수 입력받기
- [ ] 랜덤숫자를 발생시켜 그에 따라 정지하거나 전진
- [ ] 시도할 횟수만큼 게임 진행
- [ ] 우승자 판별
- [ ] 우승자 출력

## 클래스
- Car

- Input
  - 자동차 이름 입력
  - 시도할 횟수 입력
  - ...

- Output
  - 자동차 이름 출력
  - 시행결과 출력
  - 최종 우승자 출력 
  - ...

- Dice
  - 랜덤넘버 발생

- GameManager
  - 자동차 리스트 저장
  - 시도할 횟수 저장
  
- Check
  - 예외 검사
  
- Winner
  - 우승자

- Main

## 예외
- 자동차 이릅 입력
  - [v] 0글자 이하, 6글자 이상 입력 예외 처리

- 이동할 횟수 입력
  - [v] 숫자가 아닌 문자 입력
  - [v] 0 이하의 수 입력

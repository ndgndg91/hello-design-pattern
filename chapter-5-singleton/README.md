# chapter 5

- 인스턴스가 하나뿐인 특별한 객체를 만들자.
  - 스레드 풀
  - 캐시
  - 사용자 설정 레지스트리
- 클래스 인스턴스를 하나만 만들고, 인스턴스로의 전역 접근을 제공.
- 멀티스레딩 환경 문제 해결하기
  - getInstance() synchronized
  - eager initialization
  - lazy initialization DCL(Double-checked Locking)
- enum 또한 싱글턴
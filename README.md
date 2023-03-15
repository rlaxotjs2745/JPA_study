# JPA 연습

### 만약 유저들이 어떤 페이지에 오래 머무는지 알고 싶다면?

## 기본 프로젝트 구상

페이지마다 유저들의 EnterTime, ExitTime을 측정하고, 해당 데이터 저장 및 통계를 통해
성별, 연령, 회원 등급 등 서비스에 관련된 정보를 수집하여 다음 프로젝트 기획을 위한 데이터로 활용하기 위함.

#### controller, model(dto) package는 jpa를 사용하지 않은 프로젝트와 동일하게 구현

### entity package

실제 데이터베이스 테이블과 매칭되며, RDBMS에서 테이블을 객체화 한 것과 비슷하다.
@Setter 사용을 금지한다.
만약 변수명과 실제 column명이 다르다면 @Column(name = "컬럼명") 을 사용하여 매칭시켜준다.


** 그럼 어떻게 dto <-> entity 변환? **
1. entity클래스 내에 @Builder 함수 선언
2. dto 내에 entity builder 함수를 사용하는 변환 함수 선언

package hellojpa;

public class DatabaseSchemaAutoCreate {
    /*
        데이터베이스 스키마 자동 생성
        - DDL을 애플리케이션 실행 시점에 자동 생성 (* DDL : 데이터정의어, 테이블관 같은 데이터 구조를 정의하는데 사용되는 명령어들로 (생성, 변경, 삭제, 이름변경) 데이터 구조와 관련된 명령어들을 말함.
        - 테이블 중심 -> 객체 중심
        - 데이터베이스 방언을 활용해서 데이터베이스에 맞는 적절한 DDL 생성
        - 이렇게 생성된 DDL은 개발 장비에서만 사용
        - 생성된 DDL은 운영서버에서는 사용하지 않거나 적절히 다듬은 후 사용.

        hibernate.hdm2ddl.auto
        - create 기존 테이블 삭제 후 다시생성(DROP + CREATE)
        - create-drop create와 같으나 종료시점에 테이블 DROP
        - update 변경분만 반영(운영 DB에는 사용하면 안됨)
        - validate 엔티티와 테이블 정상 매핑되었는지만 확인
        - none 사용하지 않음

        DDL 생성 기능
        - 제약조건 추가 : 회원 이름은 피수, 10자 초과 X
        @Column(nullable = false, length = 10)

        - 유니크 제약조건 추가
        @Table(uniqueConstraints = {@UniqueConstraint(name = "NAME_AGE_UNIQUE", columnNames = {"NAME", "AGE"} )})
        - DDL 생성 기능은 DDL을 자동 생성할 때만 사용되고 JPA의 실행 로직에는 영향을 주지 않는다.
     */
}

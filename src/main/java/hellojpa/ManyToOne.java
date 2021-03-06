package hellojpa;

/*
    다대일
    가장 많이 사용하는 연관관계
    외래 키가 있는 쪽이 연관관계의 주인
    양쪽을 서로 참조하도록 개발
 */
public class ManyToOne {
    /*
        @ManyToMany 실무에서 쓰면 안된다.

        단방향, 양방향
        테이블
        - 외래 키 하나로 양쪽 조인 가능
        - 사실 방향이라는 개념이 없음
        객체
        - 참조용 필드가 있는 쪽으로면 참조 가능
        - 한쪽만 참조하면 단반향
        - 양쪽이 서로 참조하면 양방향
            : 양방향은 없다. 이해하기 쉽게 만든 용어. 단방향이 2개가 있는 거

        연관관계의 주인
        - 테이블은 외래 키 하나로 두 테이블이 연관관계를 맺음
        - 객체 양방향 관계는 A->B, B->A 처럼 참조가 2군데
        - 객체 양방향 관계는 참조가 2군데 있음.
            : 둘 중 테이블의 외래키를 관리할 곳을 지정해야함
        - 연관관계의 주인 : 외래 키를 관리하는 참조
        - 주인의 반대편 : 외래 키에 영향을 주지 않음.
            : 단순 조회만 가능.
     */
}

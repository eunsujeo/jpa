package hellojpa;

import hellojpa.coding.Member;
import hellojpa.coding.Team;

import javax.persistence.*;

public class JpaMain {
    public static void main(String[] args) {
        //EntityManagerFactory db 당 하나만 생성해서 어플리케이션 전체에서 공유
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");

        //EntityManager 요청이 올 때마다 사용하고 버린다. 쓰레드간에 공유 X( 사용하고 버려야 한다.)
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //JPA 모든 데이터 변경은 트랜잭션 안에서 실행해야 한다.
        //우리가 트랜잭션을 안걸어도 DB 내부적으로 트랜잭션을 가지고 있다.

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
            Member member = new Member();
            member.setUsername("memver1");
            entityManager.persist(member);

            Team team = new Team();
            team.setName("TEAM_A");

            team.getMembers().add(member);

            // commit 하기 직전에 체크해서 데이터 변경된 걸 보고 업데이트 쿼리를 날린다.
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            entityManager.close();
        }

        entityManagerFactory.close();
    }
}

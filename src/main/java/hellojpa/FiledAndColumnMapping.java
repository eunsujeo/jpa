package hellojpa;

public class FiledAndColumnMapping {
    /*
        필드와 컬럼 매핑

        @Column - 컬럼 매핑
        @Temporal - 날짜 타입 매핑
        @Enumerated - enum 타임 매핑
        @Lob - BLOB, CLOB 매핑
        @Transient - 특정 필드를 컬럼에 넣고 싶지 않을 때

        insertable = true, updatable = true - 데이터가 변경되었을 때 반영할 건지 여부, default = TRUE
        nullable(DDL) - null 값의 허용 여부를 설정한다. false로 설정하면 DDL 생성 시에 not null 제약조건이 붙는다. 하이버네이트에서 체크를 해주는 거 같다.
        unique(DDL) - @Table의 uniqueConsraints와 같지만 한 컬럼에 간단히 유니크 제약조건을 걸 때 사용한다.
        columnDefinition(DDL) - 데이터베이스 컬럼 정보를 직접 줄 수 있다. 필드의 자바 타입과 방언정보를 사용해
        length(DDL) - 문자 길이 제약조건, String 타입에만 사용한다.
        precision, scale(DDL) - BigDecimal 타입에서 사용한다. (BigInteger도 사용할 수 있다).
                                precision은 소수점을 포함한 전체 자릿수를, scale은 소수의 자릿수다. 참고로 double, float 타입에는 적용되지 않는다.
                                아주 큰 숫자나 정밀한 소수를 다루어야 할 때만 사용한다.

        @Enumerated
        자바 enum 타입을 매핑할 때 사용
        주의! ORDINAL 사용 X

        @Temporal
        날짜 타입(java,util.Date, java.util.Calendar)을 매핑할 때 사용
        참고 : LocalDate, LocalDateTime을 사용할 때는 생략 가능(최신 하이버네이트 지원)
        value   TemporalType.DATE : 날짜, 데이터베이스 date 타입과 매핑
        value   TemporalType.TIME: 시간, 데이터베이스 time 타입과 매핑
        value   TemporalType.TIMESTAMP: 날짜와 시간, 데이터베이스 timestamp 타입과 매핑


     */
}

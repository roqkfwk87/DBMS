# 인덱스의 실제 사용 #

# 1. 인덱스 생성 문법 
# 제약조건(pk, unique) 외에 직접 인덱스 생성
# : create index문 사용

-- 대괄호 안에 작성한 unique 선택사항임 
# create [unique] index 인덱스_이름
#	on 테이블_이름 (열_이름) [asc | desc] 

# unique : 중복이 안되는 고유 인덱스 생성
# >> 생략 시 중복이 허용

# asc | desc : 오름차순 | 내림차순으로 인덱스 정렬 

# 2. 인덱스 제거 문법
# : create index로 생성한 인덱스는
# : , drop index로 제거

# drop index 인덱스_이름 on 테이블_이름
# >> 기본 키, 고유 키로 자동 생성된 인덱스는
#	 drop index로 제거 X

# >> alter table 문으로 기본 키나 고유 키를 제거하면
# :  자동으로 생성된 인덱스도 제거 가능

use market_db;
select * from member;

show index from member;



















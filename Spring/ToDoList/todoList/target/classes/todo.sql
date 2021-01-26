create table todo (
	id number primary key,
	content varchar2(50) not null,
	done number default 0 
);

create sequence todo_seq;

insert into todo(id, content) values(todo_seq.nextval, 'test1: 할일입니다.');

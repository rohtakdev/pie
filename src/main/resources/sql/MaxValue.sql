drop table Test;
create table Test (num integer);

insert into Test values(5);
insert into Test values(23);
insert into Test values(-6);
insert into Test values(7);

commit;

select * from Test;

select Lesser.num , Greater.num
from Test Lesser, Test Greater
where Lesser.num < Greater.num;


Select Distinct num from Test where num Not IN (
select Lesser.num
from Test Lesser, Test Greater
where Lesser.num < Greater.num);

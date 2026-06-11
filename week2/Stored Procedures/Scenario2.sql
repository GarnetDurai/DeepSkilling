create procedure UpdateBonus
(dep in varchar, bp in int)
IS
begin
    update employee
    set salary = salary * ((100 + bp)/100.0)
    where department = dep;
    commit;
end;
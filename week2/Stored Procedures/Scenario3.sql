create procedure Transfer
(src in int, dst in int, amount in int)
IS
BEGIN
    update bank
    set balance = balance - amount
    where accountId = src and balance - amount >= 0;
if sql%rowcount = 1 then
    update bank
    set balance = balance + amount
    where accountId = dst;
    commit;
end if;
end;

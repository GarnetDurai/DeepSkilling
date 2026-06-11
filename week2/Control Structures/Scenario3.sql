declare
cursor cust_loan is
select c.customerId, c.name, l.loanId, l.dueDate
from customer c
join loan l
on l.CUSTOMERID = c.CUSTOMERID
where l.dueDate between sysdate and sysdate + 30;
begin
    FOR cust in cust_loan loop
    DBMS_OUTPUT.PUT_LINE('Dear ' || cust.NAME
    || ' CustomerId : ' || cust.CustomerId
    || ' your LoanId : ' || cust.loanId
    || ' due date is ' || TO_CHAR(cust.dueDate, 'DD-MON-YYYY')
    );
    end loop;
end;


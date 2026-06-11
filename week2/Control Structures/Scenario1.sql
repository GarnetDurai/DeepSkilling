declare
cursor c_customer is
select customerId
from CUSTOMER
where age > 60;
begin
    for cust in c_customer loop
        update loan
        set interest = interest - 1
        where CUSTOMERID = cust.CUSTOMERID;
    end loop
    commit;
DBMS_OUTPUT.PUT_LINE('Interest rate Updated Succesfully');
end;


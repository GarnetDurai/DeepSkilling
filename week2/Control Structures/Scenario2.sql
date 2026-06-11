declare cursor
c_customer is
select customerId
from customer
where balance > 10000;
begin
    for cust in c_customer loop
    update customer
    set isVIP = 'TRUE'
    where cust.customerId = customerId;
    end loop;
    commit;
    DBMS_OUTPUT.PUT_LINE('Updated Successfully');
end;
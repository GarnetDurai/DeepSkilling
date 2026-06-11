create procedure ProcessMonthlyInterest
is
begin
update bank
set balance = balance * (1.01)
where accountType = 'SAVING ACCOUNT';
COMMIT;
END;

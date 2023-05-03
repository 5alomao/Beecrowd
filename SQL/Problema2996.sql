select pa.year, sender.name as sender, receiver.name as receiver from packages pa
inner join users sender on pa.id_user_sender = sender.id
inner join users receiver on pa.id_user_receiver = receiver.id
where (pa.color = 'blue' or pa.year = '2015') 
and (sender.address != 'Taiwan' and receiver.address != 'Taiwan')
order by pa.year desc;

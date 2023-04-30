select a.id, a.password, md5(a.password) as MD5 from account a;

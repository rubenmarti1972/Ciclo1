SELECT username,preg_seguridad FROM Usuarios 
WHERE username REGEXP '^(([0-9]+)[a-zA-Z]+)|(([a-zA-Z]+)[0-9]+)$' ORDER BY username ASC;
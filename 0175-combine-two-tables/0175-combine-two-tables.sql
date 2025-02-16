select p.firstName, p.lastName, a.city, a.state
from Person P Left Join Address A
on p.personId = a.personId;
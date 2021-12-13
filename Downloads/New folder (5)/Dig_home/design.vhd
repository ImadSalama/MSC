-- Code your design here
library IEEE;
use IEEE.std_logic_1164.all;
entity SearchAndReverse is 
port (
clk : in std_logic;
Reset : in std_logic;
Enable : in std_logic;
D : in std_logic_vector(19 downto 0);
x : in std_logic_vector(3 downto 0 );
Q : out std_logic_vector(19 downto 0 );
);
end SearchAndReverse;
architecture be of SearchAndReverse is
begin
process(clk,reset)
variable f: integer range 0 to 3 :=0;
begin
if(reset ='1')then
q<=(others=>'0'); 
elsif(enable='1' and clk'event and clk='1')then
f:=0;
q<=(others=>'0'); 
for i in 0 to 16 loop
if(f=1)then 
f:=2;
next;
end if;
if (f=2) then
f:=3;
next;
end if;
if (f=3) then
f:=0;
next;
end if;
if(d(i)=x(0) and d(i+1)=x(1) and d(i+2)=x(2) and d(i+3)=x(3))
then
f:=1;
q(i)<=(not d(i));
q(i+1)<=(not d(i+1));
q(i+2)<=(not d(i+2));
q(i+3)<=(not d(i+3));
next;
elsif(i=16) then
q(i)<=d(i);
q(i+1)<= d(i+1);
q(i+2)<=not d(i+2);
q(i+3)<=not d(i+3);
exit;
else
q(i)<=d(i);
end if;
 end loop;
 end if; 
end process;
end;
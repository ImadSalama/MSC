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
signal pp: std_logic:='0';
begin
process(clk,reset)
variable f: integer:=0;
begin
if(reset ='1')then
q<=(others=>'0'); 
elsif(enable='1' and clk'event and clk='1')then
f:=0;
q<=(others=>'0'); 
for i in 1 to 17 loop
if(f=1)then 
f:=8;
next;
end if;
if (f=8) then
f:=2;
next;
end if;
if (f=2) then
f:=0;
next;
end if;
 

 
if(d(i-1)=x(0) and d(i )=x(1) and d(i+1)=x(2) and d(i+2)=x(3))
then

q(i-1)<=(not d(i-1));
q(i)<=(not d(i ));
q(i+1)<=(not d(i+1));
q(i+2)<=(not d(i+2));
f:=1;
 elsif(i=17) then
q(i-1)<=d(i-1);
q(i)<= d(i);
q(i+1)<= d(i+1);
q(i+2)<= d(i+2);
 else
q(i-1)<=d(i-1);
end if;
 end loop;
 end if; 
end process;
end;
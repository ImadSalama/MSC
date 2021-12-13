-- Code your testbench here
library IEEE;
use IEEE.std_logic_1164.all;
Entity Testbench is
end Testbench;
architecture behav of Testbench is
component SearchAndReverse 
port (
CLK: in std_logic;
Reset:in std_logic;
Enable: in std_logic;
D: in std_logic_Vector(19 downto 0);
X: in std_logic_Vector(3 downto 0);
Q: out std_logic_Vector(19 downto 0);
);
end component;
signal reset : std_logic :='0';
signal clk : std_logic :='0';
signal enable : std_logic :='0';
signal D : std_logic_vector(19 downto 0):=(others=>'0');
signal X : std_logic_vector(3 downto 0):=(others=>'0');
signal Q : std_logic_vector(19 downto 0);
constant clk_period : time := 10ns;
BEGIN
uut:SearchAndReverse port map(
Reset => Reset,
Enable=>Enable,
CLK => CLK,
Q => Q,
X => X,
D => D
);
 process
begin
clk <= '0';
wait for clk_period/2;
clk <= '1';
wait for clk_period/2;
end process;
process
begin
reset <= '1';
wait for clk_period*3;
reset <= '0';
enable <= '0';
wait for clk_period*3;
reset <= '0';
enable <= '1';
X <= "1010";
D <= "10101010101010101010";
wait for clk_period*3;
reset <= '0';
enable <= '0';
X <= "0101";
D <= "10101010101010101010";
wait for clk_period*3;
reset <= '0';
enable <= '1';
X <= "0000";
D <= (others=>'1');
wait for clk_period*3;
reset <= '0';
enable <= '1';
X <= "0011";
D <= "00001111000011110001";
wait for clk_period*3;
wait;
end process;
end ;

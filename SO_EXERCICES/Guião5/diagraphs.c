#include <stdio.h>
int main()
{
printf( "Without a new line" );
printf( ", with a new line.\n" );
printf( "A string with \"quoted text\".\n\n" );
printf( "Id\tName\tDescription\n" );
printf( "1\toranges\t1kg.\n" );
printf( "2\tbread\t0.250kg.\n" );
printf( "3\tapples\t0.5kg.\n\n" );
printf( "Line that\nspans three lines\nand completes the line\n" );
return 0;
}

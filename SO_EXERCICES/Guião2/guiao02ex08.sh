#!/bin/bash
# Exit code
ping -c 1 www.ua.pt
echo "Exit code: $?" # $? Gives the exit code of the last process
ping -c 1 www.ummaia.pt
echo "Exit code: $?"


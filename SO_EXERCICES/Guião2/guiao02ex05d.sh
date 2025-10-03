#!/bin/bash
echo "Usando \$*:"
for i in $*; do echo "$i"; done
echo "Usando \$@:"
for i in $@; do echo "$i"; done
echo "Usando \"\$*\":"
for i in "$*"; do echo "$i"; done
echo "Usando \"\$@\":"
for i in "$@"; do echo "$i"; done

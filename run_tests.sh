#!/bin/bash
for EXEFILE in executables/valid*.exe; do
  TESTNAME=$(basename -- "$EXEFILE" .exe)
  echo ""
  echo "Nome del test: $TESTNAME"
  echo "./$EXEFILE"

  ./"$EXEFILE"

  for TESTIN in src/test/valid_in_out/$TESTNAME/${TESTNAME}_in.txt; do
    if [ -f "$TESTIN" ]; then
      TESTINNAME=$(basename -- "$TESTIN")
      TESTOUT="src/test/valid_in_out/$TESTNAME/${TESTINNAME/_in/_out}.txt"

      echo ""
      echo "Esecuzione del test con input: $TESTIN"
      echo "Contenuto del file di input $TESTIN:"
      cat "$TESTIN"

      ./"$EXEFILE" <"$TESTIN" &>"$TESTOUT"

      echo ""
      echo "Contenuto del file di output $TESTOUT:"
      cat "$TESTOUT"
    else
      echo "File di input $TESTIN non trovato"
    fi
  done
done

#!/bin/bash

# Assicuriamoci di avere il nome del progetto
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

      ./"$EXEFILE" <"$TESTIN" &>"$TESTOUT"

      echo ""
      echo "diff -w \"$TESTIN\" \"$TESTOUT\""

      if diff -w "$TESTIN" "$TESTOUT"; then
        echo "Test $TESTNAME su $TESTIN superato"
      else
        echo "Test $TESTNAME su $TESTIN fallito"
      fi

      echo ""
      echo "Contenuto del file di output $TESTOUT:"
      cat "$TESTOUT"
    else
      echo "File di input $TESTIN non trovato"
    fi
  done
done






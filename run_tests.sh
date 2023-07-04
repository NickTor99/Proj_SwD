for EXEFILE in executables/valid*.exe; do
  TESTNAME=$(basename -- "$EXEFILE" .exe)
  echo "" >> "$PROJECT_NAME.report.txt"
  echo "" >> "$PROJECT_NAME.report.txt"
  echo "Nome del test: $TESTNAME" >> "$PROJECT_NAME.report.txt"
  echo "./$EXEFILE" >> "$PROJECT_NAME.report.txt"
  echo "Output:" >> "$PROJECT_NAME.report.txt"
  ./"$EXEFILE" >> "$PROJECT_NAME.report.txt" 2>&1
  echo "" >> "$PROJECT_NAME.report.txt"

  for TESTIN in src/test/valid_in_out/$TESTNAME/${TESTNAME}_in.txt; do
    TESTINNAME=$(basename -- "$TESTIN")
    TESTOUT="src/test/valid_in_out/$TESTNAME/${TESTINNAME}_out.txt"
    if [ -s "$EXEFILE" ]; then
      echo "Esecuzione di ./"$EXEFILE" con input da $TESTIN:" >> "$PROJECT_NAME.report.txt"
      ./"$EXEFILE" <"$TESTIN" &>"$TESTOUT"
      cat "$TESTOUT" >> "$PROJECT_NAME.report.txt"
    else
      RESULT=1
    fi
    echo "" >> "$PROJECT_NAME.report.txt"
    echo "diff -w \"${TESTIN/_in/_out}\" $TESTOUT" >> "$PROJECT_NAME.report.txt"
    diff -w "$TESTIN" "$TESTOUT" >> "$PROJECT_NAME.report.txt"
  done
done




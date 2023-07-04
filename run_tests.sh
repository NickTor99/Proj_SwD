for EXEFILE in executables/valid*.exe; do
  TESTNAME=$(basename -- "$EXEFILE" .exe)
  echo "" >> "$PROJECT_NAME.report.txt"
  echo "" >> "$PROJECT_NAME.report.txt"
  echo "Nome del test: $TESTNAME" >> "$PROJECT_NAME.report.txt"
  echo "./$EXEFILE" >> "$PROJECT_NAME.report.txt"
  ./"$EXEFILE" >> "$PROJECT_NAME.report.txt" 2>&1

  for TESTIN in src/test/valid_in_out/$TESTNAME/${TESTNAME}_in.txt; do
    TESTINNAME=$(basename -- "$TESTIN")
    TESTOUT="$OUTPUTDIR/${TESTINNAME/_in/_out}"
    if [ -s "$EXEFILE" ]; then
      ./"$EXEFILE" <"$TESTIN" &>"$TESTOUT"
    else
      RESULT=1
    fi
    echo "" >> "$PROJECT_NAME.report.txt"
    echo "diff -w \"${TESTIN/_in/_out}\" $TESTOUT" >> "$PROJECT_NAME.report.txt"
    diff -w "$TESTIN" "$TESTOUT" >> "$PROJECT_NAME.report.txt"
  done
done

package benchmark;

import nodes.ProgramOp;
import launcher.parser;
import launcher.Lexer;
import org.openjdk.jmh.annotations.*;
import visitors.ScopingVisitor;
import visitors.TypeVisitor;
import visitors.CVisitor;
import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@Fork(5)
@State(Scope.Benchmark)
public class CVisitorBenchmark {

    CVisitor cVisitor;
    private ArrayList<ProgramOp> programList;

    @Setup
    public void setup() throws Exception {
        /// set up the syntax tree that we'll use to benchmark the visitor
        programList = new ArrayList<>();
        for(int i=0;i<50;i++){
            File initialFile = new File("src/test/java/benchmark/benchmark_file.txt");
            InputStream in = new FileInputStream(initialFile);
            if(in == null){
                throw new Error("FILE NOT FOUND!");
            }
            BufferedReader input = new BufferedReader(new InputStreamReader(in));
            parser p = new parser(new Lexer(input));
            ProgramOp programOp = (ProgramOp) p.parse().value;
            ScopingVisitor scopingVisitor = new ScopingVisitor();
            scopingVisitor.visit(programOp);
            TypeVisitor typeVisitor = new TypeVisitor();
            typeVisitor.visit(programOp);
            programList.add(programOp);
        }
        cVisitor = new CVisitor();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
    public void benchmarkVisit(){
        for(ProgramOp programOp: programList){
            cVisitor.visit(programOp);
        }
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}
package benchmark;

import nodes.ProgramOp;
import launcher.parser;
import launcher.Lexer;
import org.openjdk.jmh.annotations.*;
import visitors.ScopingVisitor;
import visitors.TypeVisitor;
import java.io.*;
import java.util.concurrent.TimeUnit;

@Fork(10)
@State(Scope.Benchmark)
public class TypeVisitorBenchmark {

    TypeVisitor typeVisitor;
    private ProgramOp programOp;

    @Setup
    public void setup() throws Exception {
        /// set up the syntax tree that we'll use to benchmark the visitor
        File initialFile = new File("src/main/java/benchmark/benchmark_file.txt");
        InputStream in = new FileInputStream(initialFile);
        if(in == null){
            throw new Error("FILE NOT FOUND!");
        }
        BufferedReader input = new BufferedReader(new InputStreamReader(in));
        parser p = new parser(new Lexer(input));
        programOp = (ProgramOp) p.parse().value;
        ScopingVisitor scopingVisitor = new ScopingVisitor();
        scopingVisitor.visit(programOp);
        typeVisitor = new TypeVisitor();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 5, time = 500, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
    public void benchmarkVisit(){
        typeVisitor.visit(programOp);
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}

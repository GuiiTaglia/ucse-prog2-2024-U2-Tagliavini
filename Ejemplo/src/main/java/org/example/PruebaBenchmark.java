package org.example;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@State(Scope.Benchmark)
public class PruebaBenchmark {
    private List<Integer> Listado;

    @Setup(Level.Trial)
    public void setup() {
        int size = 10000000;
        Random random = new Random();
        Listado = new ArrayList<>();
        for (int x = 0; x < size; x++) {
            Listado.add(random.nextInt(1, 50000));
        }
    }

    @Benchmark
    public List<Integer> sequentialStream(Blackhole blackhole) {
        List<Integer> ListadoSecuencial = Listado.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        return ListadoSecuencial;
    }

    @Benchmark
    public List<Integer> parallelStream(Blackhole blackhole) {
        List<Integer> ListadoParalelo = Listado.parallelStream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        return ListadoParalelo;
    }

        /*public static void main(String[] args) throws RunnerException {
            Options opt = new OptionsBuilder()
                    .include(StreamBenchmark.class.getSimpleName())
                    .warmupIterations(5)
                    .measurementIterations(5)
                    .forks(1)
                    .build();

            new Runner(opt).run();
        }*/


}

package com.thinkInJava.Chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegisteredFactory {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}

class Part {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<>();
    static List<Class> partFactoriesClass = new ArrayList<>();

    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());

        partFactoriesClass.add(FuelFilter.Factory.class);
        partFactoriesClass.add(AirFilter.Factory.class);
        partFactoriesClass.add(CabinAirFilter.Factory.class);
        partFactoriesClass.add(OilFilter.Factory.class);
        partFactoriesClass.add(FanBelt.Factory.class);
        partFactoriesClass.add(PowerSteeringBelt.Factory.class);
        partFactoriesClass.add(GeneratorBelt.Factory.class);
    }

    private static Random rand = new Random(47);

    public static Object createRandom() {
//        int n = rand.nextInt(partFactories.size());
//        return partFactories.get(n).create();

        int k = rand.nextInt(partFactoriesClass.size());

        try {
            return partFactoriesClass.get(k).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
    public static class Factory implements com.thinkInJava.Chapter14.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factory implements com.thinkInJava.Chapter14.Factory<AirFilter> {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory implements com.thinkInJava.Chapter14.Factory<CabinAirFilter> {
        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory implements com.thinkInJava.Chapter14.Factory<OilFilter> {
        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {
}

class FanBelt extends Belt {
    public static class Factory implements com.thinkInJava.Chapter14.Factory<FanBelt> {
        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory implements com.thinkInJava.Chapter14.Factory<GeneratorBelt> {
        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory implements com.thinkInJava.Chapter14.Factory<PowerSteeringBelt> {
        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}


package pl.pgedlek;

class Constants {
    static class TestData {
        final static String EMPTY_INPUT = "";
        final static String EMPTY_OUTPUT = "";

        final static String BASIC_INPUT= "Ala ma kota";
        final static String BASIC_OUTPUT = "a: ala, kota, ma\n" +
                "k: kota\n"+
                "l: ala\n"+
                "m: ma\n"+
                "o: kota\n"+
                "t: kota\n";

        final static String DIFFERENT_LETTER_CASE_INPUT = "Ala mA kOtA";
        final static String DIFFERENT_LETTER_CASE_OUTPUT = "a: ala, kota, ma\n" +
                "k: kota\n"+
                "l: ala\n"+
                "m: ma\n"+
                "o: kota\n"+
                "t: kota\n";

        final static String INPUT_WITH_REPEATS = "kota ala ma kota, kot kota Ala koduje w aLa, Javie kota";
        final static String OUTPUT_WITH_REPEATS = "a: ala, javie, kota, ma\n" +
                "d: koduje\n" +
                "e: javie, koduje\n" +
                "i: javie\n"+
                "j: javie, koduje\n"+
                "k: koduje, kot, kota\n"+
                "l: ala\n"+
                "m: ma\n"+
                "o: koduje, kot, kota\n"+
                "t: kot, kota\n"+
                "u: koduje\n"+
                "v: javie\n"+
                "w: w\n";

        final static String INPUT_WITH_SPECIAL_CHARACTERS = "This $ - text ! has \\ ' /allot # of % special % characters";
        final static String OUTPUT_WITH_SPECIAL_CHARACTERS  = "a: allot, characters, has, special\n" +
                "c: characters, special\n" +
                "e: characters, special, text\n" +
                "f: of\n"+
                "h: characters, has, this\n"+
                "i: special, this\n"+
                "l: allot, special\n"+
                "o: allot, of\n"+
                "p: special\n" +
                "r: characters\n"+
                "s: characters, has, special, this\n"+
                "t: allot, characters, text, this\n"+
                "x: text\n";

        final static String LONG_INPUT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras diam dolor, ornare at mi vitae, fermentum volutpat magna. Sed commodo, urna non interdum congue, dolor dui vulputate ipsum, sed tincidunt massa elit non diam. Suspendisse venenatis bibendum libero eget dignissim. Morbi gravida dapibus faucibus. Suspendisse gravida, libero at aliquet aliquet, dui augue bibendum lacus, sit amet tristique justo erat a ipsum. Etiam rutrum justo lorem, eget viverra orci vulputate ac. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus pharetra venenatis condimentum. Sed interdum nibh et posuere ornare. Sed congue elementum nulla, non consequat leo interdum vel. Sed auctor massa tristique lorem elementum congue. Sed erat mi, egestas a tellus et, lacinia consequat dolor. Morbi at commodo libero. Nulla facilisi.";
        final static String LONG_OUTPUT = "a: a, ac, adipiscing, aliquet, amet, at, auctor, augue, consequat, cras, dapibus, diam, egestas, erat, etiam, facilisi, faucibus, gravida, lacinia, lacus, magna, massa, nulla, ornare, pharetra, urna, venenatis, vitae, vivamus, viverra, volutpat, vulputate\n" +
                "b: bibendum, dapibus, faucibus, libero, morbi, nibh\n" +
                "c: ac, adipiscing, auctor, commodo, condimentum, congue, consectetur, consequat, cras, facilisi, faucibus, lacinia, lacus, orci, tincidunt\n" +
                "d: adipiscing, bibendum, commodo, condimentum, dapibus, diam, dignissim, dolor, dui, gravida, interdum, sed, suspendisse, tincidunt\n" +
                "e: aliquet, amet, augue, bibendum, condimentum, congue, consectetur, consequat, egestas, eget, elementum, elit, erat, et, etiam, fermentum, interdum, leo, libero, lorem, ornare, pharetra, posuere, sed, suspendisse, tellus, tristique, vel, venenatis, vitae, viverra, vulputate\n" +
                "f: facilisi, faucibus, fermentum\n" +
                "g: adipiscing, augue, congue, dignissim, egestas, eget, gravida, magna\n" +
                "h: nibh, pharetra\n" +
                "i: adipiscing, aliquet, bibendum, condimentum, dapibus, diam, dignissim, dui, elit, etiam, facilisi, faucibus, gravida, interdum, ipsum, lacinia, libero, mi, morbi, nibh, orci, sit, suspendisse, tincidunt, tristique, venenatis, vitae, vivamus, viverra\n" +
                "j: justo\n" +
                "l: aliquet, dolor, elementum, elit, facilisi, lacinia, lacus, leo, libero, lorem, nulla, tellus, vel, volutpat, vulputate\n" +
                "m: amet, bibendum, commodo, condimentum, diam, dignissim, elementum, etiam, fermentum, interdum, ipsum, lorem, magna, massa, mi, morbi, rutrum, vivamus\n" +
                "n: adipiscing, bibendum, condimentum, congue, consectetur, consequat, dignissim, elementum, fermentum, interdum, lacinia, magna, nibh, non, nulla, ornare, suspendisse, tincidunt, urna, venenatis\n" +
                "o: auctor, commodo, condimentum, congue, consectetur, consequat, dolor, justo, leo, libero, lorem, morbi, non, orci, ornare, posuere, volutpat\n" +
                "p: adipiscing, dapibus, ipsum, pharetra, posuere, suspendisse, volutpat, vulputate\n" +
                "q: aliquet, consequat, tristique\n" +
                "r: auctor, consectetur, cras, dolor, erat, fermentum, gravida, interdum, libero, lorem, morbi, orci, ornare, pharetra, posuere, rutrum, tristique, urna, viverra\n" +
                "s: adipiscing, consectetur, consequat, cras, dapibus, dignissim, egestas, facilisi, faucibus, ipsum, justo, lacus, massa, posuere, sed, sit, suspendisse, tellus, tristique, venenatis, vivamus\n" +
                "t: aliquet, amet, at, auctor, condimentum, consectetur, consequat, egestas, eget, elementum, elit, erat, et, etiam, fermentum, interdum, justo, pharetra, rutrum, sit, tellus, tincidunt, tristique, venenatis, vitae, volutpat, vulputate\n" +
                "u: aliquet, auctor, augue, bibendum, condimentum, congue, consectetur, consequat, dapibus, dui, elementum, faucibus, fermentum, interdum, ipsum, justo, lacus, nulla, posuere, rutrum, suspendisse, tellus, tincidunt, tristique, urna, vivamus, volutpat, vulputate\n" +
                "v: gravida, vel, venenatis, vitae, vivamus, viverra, volutpat, vulputate\n";
    }
}

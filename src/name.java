public class name {
    enum names {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}

    public static names[] list = names.values();

    public static names getName(int i) {
        return list[i];
    }
}

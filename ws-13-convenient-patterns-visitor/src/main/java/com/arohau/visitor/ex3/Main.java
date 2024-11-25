package com.arohau.visitor.ex3;

public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        String export = exportVisitor.export(shapes);
        System.out.println(EXPECTED.equals(export));
        System.out.println(export);
    }

    private static final String EXPECTED = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<circle>\n" +
            "    <id>2</id>\n" +
            "    <x>23</x>\n" +
            "    <y>15</y>\n" +
            "    <radius>10</radius>\n" +
            "</circle>\n" +
            "<compound_graphic>\n" +
            "   <id>4</id>\n" +
            "    <dot>\n" +
            "        <id>1</id>\n" +
            "        <x>10</x>\n" +
            "        <y>55</y>\n" +
            "    </dot>\n" +
            "    <circle>\n" +
            "        <id>2</id>\n" +
            "        <x>23</x>\n" +
            "        <y>15</y>\n" +
            "        <radius>10</radius>\n" +
            "    </circle>\n" +
            "    <rectangle>\n" +
            "        <id>3</id>\n" +
            "        <x>10</x>\n" +
            "        <y>17</y>\n" +
            "        <width>20</width>\n" +
            "        <height>30</height>\n" +
            "    </rectangle>\n" +
            "    <compound_graphic>\n" +
            "       <id>5</id>\n" +
            "        <dot>\n" +
            "            <id>1</id>\n" +
            "            <x>10</x>\n" +
            "            <y>55</y>\n" +
            "        </dot>\n" +
            "    </compound_graphic>\n" +
            "</compound_graphic>\n";
}

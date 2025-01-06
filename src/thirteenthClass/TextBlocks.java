package thirteenthClass;

public class TextBlocks {
    public static void main(String[] args) {
        String text = "Document doc = Jsoup.connect(\"https://en.wikipedia.org/\").get();\n" +
                "log(doc.title());\n" +
                "Elements newsHeadlines = doc.select(\"#mp-itn b a\");\n" +
                "for (Element headline : newsHeadlines) {\n" +
                "    log(\"%s\\n\\t%s\", \n" +
                "        headline.attr(\"title\"), headline.absUrl(\"href\"));\n" +
                "}";

        String textBlock = """
                Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
                log(doc.title());
                Elements newsHeadlines = doc.select("#mp-itn b a");
                for (Element headline : newsHeadlines) {
                    log("%s\\n\\t%s",\s
                        headline.attr("title"), headline.absUrl("href"));
                }
                """;

        System.out.println(text);
        System.out.println(textBlock);
    }
}

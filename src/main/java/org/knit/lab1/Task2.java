package org.knit.lab1;

/***
 * Задача 2
 * Создайте класс SimpleUrl
 * глядя на URL ниже создайте как можно больше полей в классе SimpleUrl:
 * https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText
 * добавьте геттеры и сеттеры для полей
 * Переопределите метод toString() для вывода информации о полях класса:
 * protocol = https
 * address = test.ru
 * domainZone = ru
 * siteName = test
 * webpageName = page.jsp
 * webPageExtention = jsp
 * ....
 * Распарсите данный URL на переменные, создайте экземпляр класса SimpleUrl и выведите на экран
 * Дополнительно
 * попробуйте с другими URL в сети, подумайте как можно сгруппировать значения.
 *
 */
public class Task2 {
    public void execute() {

        String urlValue = "https://school.sgu.ru/course/view.php?id=29";
        String protocol = urlValue.substring(0, urlValue.indexOf(':'));
        String hostWithPath = urlValue.substring(urlValue.indexOf("://") + 3);
        String host = hostWithPath.split("/")[0];
        String domain = host.contains(".") ? host.substring(0, host.lastIndexOf(".")) : host;
        String domainExtension = host.contains(".") ? host.substring(host.lastIndexOf(".") + 1) : "";
        String pathWithQuery = hostWithPath.split("\\?", 2)[0];
        String path = pathWithQuery.split("/", 2).length > 1 ? pathWithQuery.split("/", 2)[1] : "";
        String fileName = "";
        String fileExtension = "";
        if (path.contains("/")) {
            String[] pathParts = path.split("/");
            String lastPart = pathParts[pathParts.length - 1];
            if (lastPart.contains(".")) {
                fileName = lastPart.substring(0, lastPart.lastIndexOf("."));
                fileExtension = lastPart.substring(lastPart.lastIndexOf(".") + 1);
            }
            else {
                fileName = lastPart;
            }
        }
        SimpleUrl simpleUrl = new SimpleUrl();
        simpleUrl.setProtocol(protocol);
        simpleUrl.setAddress(host);
        simpleUrl.setDomainZone(domainExtension);
        simpleUrl.setSiteName(domain);
        simpleUrl.setWebpageName(fileName);
        simpleUrl.setWebPageExtention(fileExtension);
        System.out.println(simpleUrl);
    }
}

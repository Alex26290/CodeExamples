
package designpatterns.builder.v2;

public class Demo {
    
    public static void main(String[] args) {
   
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello");
        builder.addChild("li", "world");
        System.out.println(builder);
        
        /*
        String hello ="hello";
        System.out.println("<p>" + hello + "</p>");
        String[] words = {"hello", "world"};
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for (String word : words)
        {
           sb.append(String.format("  <li>%s</li>\n", word));
        }
        sb.append("</ul>");
        System.out.println(sb);
*/
       // Вместо:
       // System.out.println(
       //       "<ul>\n"+"<li>"+words[0]
       // );
    }  
}

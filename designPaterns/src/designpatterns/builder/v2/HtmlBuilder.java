/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.builder.v2;

public class HtmlBuilder {

    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlElement getRoot() {
        return root;
    }

    public void setRoot(HtmlElement root) {
        this.root = root;
    }

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.name = rootName;
    }
    
    public void addChild(String childName, String childText){
        HtmlElement e = new HtmlElement(childName, childText);
        root.elements.add(e);
    }
    
    public void clear(){
        root = new HtmlElement();
        root.name = rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }
    
}

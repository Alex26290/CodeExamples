/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.composite.v3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

  class GraphicObject {

        protected String name = "Group";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public GraphicObject() {
        }

        public String color;
        public List<GraphicObject> children = new ArrayList<>();

        private void print(StringBuilder stringBuilder, int depth) {
            stringBuilder.append(String.join("", Collections.nCopies(depth, "*")))
                    .append(depth > 0 ? " " : "")
                    .append((color == null || color.isEmpty()) ? "" : color + " ")
                    .append(getName())
                    .append(System.lineSeparator());
            for (GraphicObject child : children) {
                child.print(stringBuilder, depth + 1);
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            print(sb, 0);
            return sb.toString();
        }
    }

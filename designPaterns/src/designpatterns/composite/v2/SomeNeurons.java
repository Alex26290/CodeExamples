/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.composite.v2;

interface SomeNeurons extends Iterable<Neuron>
{
  default void connectTo(SomeNeurons other)
  {
    if (this == other) return;

    for (Neuron from : this)
      for (Neuron to : other)
      {
        from.out.add(to);
        to.in.add(from);
      }
  }
}
package com.pathdependent.flockers

import scala.reflect.{BeanProperty, BooleanBeanProperty}

import sim.util.Interval

/** 
 * For such a simple simulation, this isn't really nessessary, but I think it
 * is good practice. I want all the parameters of the simulation in one place;
 * it helps me grasp the model easier. 
 *
 * All the parameters are turned into JavaBean properties by the scala compiler
 * when using the @BeanProperty annotation. (Note, this means you can't use
 * the getXXX, setXXX methods in Scala code; the code is generated after the 
 * parsing step.)
 *
 * Sean Luke's implementation handcrafted setter methods that ignored bad 
 * In my version, you can enter bad values. This was mostly out of laziness. 
 * (Although, I don't like the idea of ignoring bad parameters; I would prefer
 * that they generate ArgumentExceptions.)
 */
case class FlockerParameters(
  @BeanProperty var flockSize:                    Int = 200,
  @BeanProperty var width:                        Int = 150,
  @BeanProperty var height:                       Int = 150,
  @BeanProperty var cohesionWeight:            Double = 1.0,
  @BeanProperty var avoidanceWeight:           Double = 1.0,
  @BeanProperty var randomnessWeight:          Double = 1.0,
  @BeanProperty var consistencyWeight:         Double = 1.0,
  @BeanProperty var momentumWeight:            Double = 1.0,
  @BeanProperty var deadFlockerProbability:    Double = 0.1,
  @BeanProperty var neighborhoodRadius:        Double = 10.0,
  @BeanProperty var jumpDistance:              Double = 0.7,
  @BeanProperty var visitationRecordIncrement: Double = 0.01
){
   def domFlockSize():               Object = new Interval(1, 10000)
   def domCohesionWeight():          Object = new Interval(0.0, 1.0)
   def domAvoidanceWeight():         Object = new Interval(0.0, 1.0)
   def domRandomnessWeight():        Object = new Interval(0.0, 1.0)
   def domConsistencyWeight():       Object = new Interval(0.0, 1.0)
   def domMomentumWeight():          Object = new Interval(0.0, 1.0)
   def domDeadFlockerProbability():  Object = new Interval(0.0, 1.0)
   def domNeighborhoodRadius():      Object = new Interval(1.0, 30.0)
   def domJumpDistance():            Object = new Interval(0.0, 1.0)
   def domVisitationRecordIncrement: Object = new Interval(0.0, 0.05)
}


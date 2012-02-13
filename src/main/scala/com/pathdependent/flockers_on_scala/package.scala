package com.pathdependent

/**
 * This example is based on the MASON flockers example, written by Sean Luke.
 * It was ported line-for-line, then rewritten to reflect Scala's strengths.
 *
 * @see http://en.wikipedia.org/wiki/Boids
 * @see http://www.cs.gmu.edu/~eclab/projects/mason/
 *
 * @note Unfortunately, the original line-for-line port was, not committed to 
 *       the repository prior to rewrite. I want to do this for another project, 
 *       because it would be useful to show the code evolution of a 
 *       Java-to-Scala port.
 *
 */
package object flockers {
  val Name       = "Flockers in Scala"
  val Author     = "John Bjorn Nelson"
  val Email      = "jbn@pathdependent.com"
  val IconPath   = getClass.getResource("/flockers/icon.png").toString
  val Repository = "https://github.com/jbn/FlockersInScala"
}


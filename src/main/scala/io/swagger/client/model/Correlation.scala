package io.swagger.client.model

import org.joda.time.DateTime


case class Correlation (
  correlationCoefficient: Number,  // Pearson correlation coefficient between cause and effect measurements
  cause: String,  // ORIGINAL variable name of the cause variable for which the user desires correlations.
  effect: String,  // ORIGINAL variable name of the effect variable for which the user desires correlations.
  onsetDelay: Double,  // User estimated or default time after cause measurement before a perceivable effect is observed
  durationOfAction: Number,  // Time over which the cause is expected to produce a perceivable effect following the onset delay
  numberOfPairs: Number,  // Number of points that went into the correlation calculation
  effectSize: String,  // Magnitude of the effects of a cause indicating whether it&#39;s practically meaningful.
  statisticalSignificance: String,  // A function of the effect size and sample size
  timestamp: Number,  // Time at which correlation was calculated
  reverseCorrelation: Number,  // Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation.
  causalityFactor: Number,  // 
  causeCategory: String,  // Variable category of the cause variable.
  effectCategory: String  // Variable category of the effect variable.
  
)

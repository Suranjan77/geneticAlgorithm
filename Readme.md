<p><font size=12>
================================================================================
                                      Simple Genetic Algorithm Implementation in JAVA
================================================================================
Individual :: Each individual has 10 genes. A gene can be either 0 or 1.
Population :: Population is collection of 20 Individuals. Population is a HashMap with fitness value as key and Individual as value
Fitness function :: Fitness fuction calculates fitness as the number of genes with value 1.
Selection :: Selection is based on highest fitness value
Crossover :: Random crossover point is choosen and either left or right parts of Individual is kept and other half is taken 
             from another parent to form childrens.
Mutation :: Random mutation point is choosen and gene is altered
================================================================================
Childrens and mutant are added on the population while less fit Individual are killed humanly.
================================================================================
</p></font>

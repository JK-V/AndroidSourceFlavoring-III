# AndroidSourceFlavoring-III
Pattern-III

  This is a kind of very easy and efortless flavoring of your java/android source fiels.
  In this pattern we maintina only exposing interfaces in flavored folders and keep them in flavor specific folder. 
  The exposing point and implementation is part of main source folder, so at the time of exposing only specific contract/interface based methods will be exposed to end user regardless of what extactly has been written in it's default implementation.

The only tweak is you neeed to remove @override from default implementation classes so compiler won't cry if your contract/interface hsa 3 methods and default implementation has 5's implementation. In this manner you can refer same source code in more than 1 flavor.

This repo will demonstrate the Pattern-III for java source flavoring.

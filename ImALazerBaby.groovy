def ret=[new Cube(200, 200, 1).toCSG().toXMin().toYMin().move(-5,-5,0)]
for(int i=0;i<4;i++)for(int j=0;j<4;j++)
	ret.add(new RoundedCube(37, 37, 2).cornerRadius(7.5).toCSG().toXMin().toYMin().move(i*42+5,j*42+5,0) )
ret.forEach{it.addExportFormat("svg")}
return ret // Boom! in 5 lines!
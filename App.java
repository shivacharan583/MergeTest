

public class Cell {

	private final int row, col;
	private CellType cellType;

	public Cell(int row, int col)
	{
		this.row = row;
		this.col = col;
	}

	public CellType getCellType() { return cellType; }

	public void setCellType(CellType cellType)
	{
		this.cellType = cellType;
	}

	public int getRow() { return row; }

	public int getCol() { return col; }
}

public class Cube {
    public double side;
    public String color;
    public double getSide()
    {
        return side;
    }
    public String getColor()
    {
        return color;
    }
    public void setSide(double side) 
    {
        this.side = side;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }
    public Cube doubleCube()
    {
        Cube c1=new Cube();
        c1.side=side*2;
        c1.color="Green";
        return c1;
    }
    public Cube(String color, double side)
    {
        this.side = side;
        this.color = color;
    }
    public Cube()
    {
        
    }
    public double getVolume()
    {
        return side*side*side;
    }
    public double getArea()
    {
        return 6*side*side;
    }
    @Override
    public String toString ( )
    {
       return this.getColor() + "\t" + this.getSide() + "\t" + this.getVolume() + "\t" + this.getArea();
    }   
}


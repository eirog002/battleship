class Cell{

    private int row; 
    private int col; 
    private boolean isOccupied; 
    private boolean isVisited; 

    public Cell (int row, int col){
        this.row = row; 
        this.col = col; 
        this.isOccupied = false; 
        this.isVisited = false;
    }

    //getter for row
    public int getRow(){
        return row; 
    }

    //getter for column
    public int getCol(){
        return col;
    }

    //checks if cell is occupied by a ship
    public boolean isOccupied(){
        return isOccupied; 
    }

    //sets the cell to occupied 
    public void occupy(){
        this.isOccupied = true; 
    }

    //checks if the cell has been guessed yet
    public boolean isVisited(){
        return isVisited; 
    }

    //sets the cell to visited 
    public void visit(){
        this.isVisited = true; 
    }

}
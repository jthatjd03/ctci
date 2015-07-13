public class RobotInGrid{
	public List<Point> getPath(boolean[][] maze){
		Map<Point, Boolean> cache = new HashMap<>();
		List<Point> list = new ArrayList();
		if(getPath(list, maze, 0, 0, cache)){
			return list;
		}

		return null;
	}

	public boolean getPath(List<Point> list, boolean[][] canReach, int row, int col, Map<Point, Boolean> cache){
		if(row>=canReach.length|| col >= canReach[0].length || !canReach[row][col]){
			return false;
		}
		Point p = new Point(row, col);
		if(cache.containsKey(p)){
			return cache.get(p);
		}
		boolean success;
		if(canReach[row][col] || getPath(list, canReach, row+1, col) || getPath(list, canReach, row, col+1)){
			list.add(p);
			success = true;
		}
		return success;
	}
	
	public boolean doesPathExist(boolean[][] maze){
		boolean[][] canReach = new boolean[maze.length][maze[0].length];
		canReach[0][0] = maze[0][0];
		for(int row = 1;row<maze.length;row++){			
			canReach[row][0] = canReach[row-1][0] && maze[row][0];			
		}
		for(int col = 1;col<maze[0].length;col++){			
			canReach[0][col] = maze[0][col-1] && maze[0][col];			
		}		
		for(int row = 2;row<maze.length;row++){
			for(int col = 2;col < maze[0].length;col++){
				canReach[row][col] = (canReach[row-1][col] || canReach[row][col-1])&& maze[row][col]
			}
		}
		return canReach[canReach.length-1][canReach[0].length-1];
	}	
}
package edu.neu.csye6200.classRoom;

import edu.neu.csye6200.classRoomGroup.ClassRoomGroup;
import edu.neu.csye6200.classRoomGroup.ClassRoomGroupController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ClassRoom {
        private static final Logger LOGGER = Logger.getLogger(ClassRoom.class.getName());
	private int id;
	private String name;
	private List<ClassRoomGroup> groups;
        private boolean isFull= false;
	
	protected ClassRoom(String data) {
		
            this.id =-1;
            this.name ="";
            this.groups = new ArrayList<>();
	}
        protected ClassRoom (int id, String name, List<ClassRoomGroup> groups)
        {
            this.id = id;
            this.name = name;
            this.groups = groups;
            this.isFull = groups.size()>0;
        }
        
        protected ClassRoom(String csvData, ClassRoomGroupController controller)
        {
            String[] data = csvData.split(",");
            this.id = -1;
            try{
                this.id = Integer.parseInt(data[0]);
            }
            catch(Exception e)
            {
                LOGGER.log(Level.SEVERE,"error while parsing the id",e);
            }
            this.name = data[1];
            this.groups = new ArrayList<>();
            Arrays.asList(data[2].split("_")).stream().map(x -> controller.getClassRoomGroupById()).forEach(groups::add);
        }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIsFull(boolean isFull){
            this.isFull = isFull;
        }
        public boolean getIsFull(){
            return this.isFull;
        }

    public List<ClassRoomGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<ClassRoomGroup> groups) {
        this.groups = groups;
    }
        
    @Override
    public String toString()
    {
        return this.getId()+","+this.getName()+","+this.getGroups().stream().map(x -> ((Integer)x.getId()).toString()).collect(Collectors.joining("_"));
    }
	
}
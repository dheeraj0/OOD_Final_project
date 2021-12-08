/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.classRoomGroup;

import edu.neu.csye6200.FileUtil;
import edu.neu.csye6200.student.StudentController;
import edu.neu.csye6200.teacher.TeacherController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dheeraj
 */
public class ClassRoomGroupModel {

    private final List<ClassRoomGroup> groups;
    private final String inputFilePath;
    public ClassRoomGroupModel(String inputFilePath,TeacherController teacherController, StudentController studentController) {
        groups = new ArrayList<>();
        this.inputFilePath = inputFilePath;
        FileUtil.getFileData(inputFilePath).stream().map(x -> new ClassRoomGroup(x,teacherController, studentController)).forEach(groups::add);
    }
    
    protected void addClassRoomGroup(ClassRoomGroup group)
    {
        this.groups.add(group);
        FileUtil.appendEntryToFile(this.inputFilePath, group.toString());
    }
    
    protected void removeClassGroup(ClassRoomGroup group)
    {
        this.groups.remove(group);
        FileUtil.removeEntryInFile(inputFilePath, group.toString());
    }
    
    protected void updateClassRoomGroup(ClassRoomGroup oldGroup,ClassRoomGroup newGroup)
    {
        this.groups.remove(oldGroup);
        this.groups.add(newGroup);
        FileUtil.modifyEntryInFile(inputFilePath, oldGroup.toString(), newGroup.toString());
    }
    
    protected List<ClassRoomGroup> getUnassignedClassRoomGroup()
    {
        List<ClassRoomGroup> list = new ArrayList<>();
        this.groups.stream().filter(x -> x.getIsAssigned()).forEach(list::add);
        return list;
    }
    
    protected List<ClassRoomGroup> getClassRoomGroup()
    {
        return this.groups;
    }
    
}
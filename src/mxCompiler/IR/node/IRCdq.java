package mxCompiler.IR.node;

import mxCompiler.IR.IRVisitor;
import mxCompiler.IR.operand.IRRegister;
import mxCompiler.IR.operand.StackSlot;
import mxCompiler.Utility.RegCollection;

import java.util.HashMap;
import java.util.LinkedList;

public class IRCdq extends IRInst{
    public IRCdq(BasicBlock parentBB){
        super(parentBB);
    }


    @Override
    public LinkedList<IRRegister> getUsedRegs(){
        LinkedList<IRRegister> list = new LinkedList<>();
        return list;
    }

    @Override
    public LinkedList<IRRegister> getDefRegs(){
        LinkedList<IRRegister> list = new LinkedList<>();
        return list;
    }

    @Override
    public LinkedList<StackSlot> getStackSlots(){
        LinkedList<StackSlot> list = new LinkedList<>();
        return list;
    }

    @Override
    public void renameUsedReg(HashMap<IRRegister, IRRegister> renameMap){
        //do nothing
    }

    @Override
    public void renameDefReg(HashMap<IRRegister, IRRegister> renameMap){
        //do nothing as well
    }

    @Override
    public void accept(IRVisitor visitor){
        visitor.visit(this);
    }

}

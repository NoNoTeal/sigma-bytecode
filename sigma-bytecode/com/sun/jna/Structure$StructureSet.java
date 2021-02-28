public class com.sun.jna.Structure$StructureSet {
    public void Structure$StructureSet() {
        invokespecial:AbstractCollection(AbstractCollection::<init>, this:Structure$StructureSet)
    }
    
    private void ensureCapacity(int size) {
        var_4_2A : Structure[]
        
        if (cmpeq:boolean(getfield:Structure[](Structure$StructureSet::elements, this:Structure$StructureSet), aconstnull:Structure[]())) {
            putfield:Structure[](Structure$StructureSet::elements, this:Structure$StructureSet, newarray:Structure[](com.sun.jna.Structure.class, div:int(mul:int(size:int, ldc:int(3)), ldc:int(2))))
        }
        else {
            if (cmplt:boolean(arraylength:int(getfield:Structure[](Structure$StructureSet::elements, this:Structure$StructureSet)), size:int)) {
                var_4_2A = newarray:Structure[](com.sun.jna.Structure.class, div:int(mul:int(size:int, ldc:int(3)), ldc:int(2)))
                invokestatic:void(System::arraycopy, getfield:Structure[][expected:Object](Structure$StructureSet::elements, this:Structure$StructureSet), ldc:int(0), var_4_2A:Structure[][expected:Object], ldc:int(0), arraylength:int(getfield:Structure[](Structure$StructureSet::elements, this:Structure$StructureSet)))
                putfield:Structure[](Structure$StructureSet::elements, this:Structure$StructureSet, var_4_2A:Structure[])
            }
        }
    }
    
    public com.sun.jna.Structure[] getElements() {
        return:Structure[](getfield:Structure[](Structure$StructureSet::elements, this:Structure$StructureSet))
    }
    
    public int size() {
        return:int(getfield:int(Structure$StructureSet::count, this:Structure$StructureSet))
    }
    
    public boolean contains(java.lang.Object o) {
        return:boolean(cmpne:boolean(invokespecial:int(Structure$StructureSet::indexOf, this:Structure$StructureSet, checkcast:Structure(com.sun.jna.Structure.class, o:Object[expected:Structure])), ldc:int(-1)))
    }
    
    public boolean add(com.sun.jna.Structure o) {
        if (logicalnot:boolean(invokevirtual:boolean(Structure$StructureSet::contains, this:Structure$StructureSet, o:Structure[expected:Object]))) {
            invokespecial:void(Structure$StructureSet::ensureCapacity, this:Structure$StructureSet, add:int(getfield:int(Structure$StructureSet::count, this:Structure$StructureSet), ldc:int(1)))
            storeelement:Structure(getfield:Structure[](Structure$StructureSet::elements, this:Structure$StructureSet), postincrement:int(1, getfield:int(Structure$StructureSet::count, this:Structure$StructureSet)), o:Structure)
        }
        
        return:boolean(ldc:boolean(1))
    }
    
    private int indexOf(com.sun.jna.Structure s1) {
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:136)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public boolean remove(java.lang.Object o) {
        var_4_0B : int
        
        var_4_0B = invokespecial:int(Structure$StructureSet::indexOf, this:Structure$StructureSet, checkcast:Structure(com.sun.jna.Structure.class, o:Object[expected:Structure]))
        
        if (cmpne:boolean(var_4_0B:int, ldc:int(-1))) {
            if (cmpge:boolean(putfield:int(Structure$StructureSet::count, this:Structure$StructureSet, sub:int(getfield:int(Structure$StructureSet::count, this:Structure$StructureSet), ldc:int(1))), ldc:int(0))) {
                storeelement:Structure(getfield:Structure[](Structure$StructureSet::elements, this:Structure$StructureSet), var_4_0B:int, loadelement:Structure(getfield:Structure[](Structure$StructureSet::elements, this:Structure$StructureSet), getfield:int(Structure$StructureSet::count, this:Structure$StructureSet)))
                storeelement:Structure(getfield:Structure[](Structure$StructureSet::elements, this:Structure$StructureSet), getfield:int(Structure$StructureSet::count, this:Structure$StructureSet), aconstnull:Structure())
            }
            
            return:boolean(ldc:boolean(1))
        }
        
        return:boolean(ldc:boolean(0))
    }
    
    public java.util.Iterator<com.sun.jna.Structure> iterator() {
        var_3_0A : Structure[]
        
        var_3_0A = newarray:Structure[](com.sun.jna.Structure.class, getfield:int(Structure$StructureSet::count, this:Structure$StructureSet))
        
        if (cmpgt:boolean(getfield:int(Structure$StructureSet::count, this:Structure$StructureSet), ldc:int(0))) {
            invokestatic:void(System::arraycopy, getfield:Structure[][expected:Object](Structure$StructureSet::elements, this:Structure$StructureSet), ldc:int(0), var_3_0A:Structure[][expected:Object], ldc:int(0), getfield:int(Structure$StructureSet::count, this:Structure$StructureSet))
        }
        
        return:Iterator<Structure>(invokeinterface:Iterator<Structure>(List<Structure>::iterator, invokestatic:List<Structure>(Arrays::asList, var_3_0A:Structure[])))
    }
    
    public boolean add(java.lang.Object p0) {
        return:boolean(invokevirtual:boolean(Structure$StructureSet::add, this:Structure$StructureSet, checkcast:Structure(com.sun.jna.Structure.class, p0:Object[expected:Structure])))
    }
}

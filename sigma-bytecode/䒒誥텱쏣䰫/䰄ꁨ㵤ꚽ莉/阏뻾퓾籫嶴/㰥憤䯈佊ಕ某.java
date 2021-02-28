public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0 {
    public void \u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:DataFix(DataFix::<init>, this:\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private static com.mojang.serialization.Dynamic<T> \uc4d2\u93a2\u946b\u7ce1\ud158\u8cae(java.lang.String p0, com.mojang.serialization.DynamicOps<T> p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private static com.mojang.datafixers.util.Pair<java.lang.Integer, java.lang.String> \uceb8\u385b\u4e72\u62da\uf995\ub70c(java.lang.String p0) {
        var_1_DE : int
        var_3_7E : String[]
        var_4_EB : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_DE = and:int(and:int(ldc:int(2053550019), ldc:int(2112809475)), ldc:int(-857231523))
            var_3_7E = invokevirtual:String[](String::split, p0:String, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(6158), ldc:int(6144))), and:int(ldc:int(30), ldc:int(13155)))
            
            loop {
                if (cmpne:boolean(and:int(var_1_DE:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0201)
                }
                
                if (cmpne:boolean(and:int(var_1_DE:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_DE = and:int(var_1_DE:int, ldc:int(-914887099))
                    
                    if (cmpne:boolean(arraylength:int(var_3_7E:String[]), and:int(ldc:int(5122), ldc:int(16455)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0161:
                
                if (cmpeq:boolean(and:int(var_1_DE:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_DE = and:int(var_1_DE:int, ldc:int(1280656444))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_DE:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_DE = and:int(var_1_DE:int, ldc:int(866869476))
                        loopcontinue()
                    }
                    
                    var_1_DE = and:int(var_1_DE:int, ldc:int(216965063))
                }
                
                try {
                    Label_0201:
                    
                    if (cmpne:boolean(and:int(var_1_DE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0161)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_DE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_DE = and:int(var_1_DE:int, ldc:int(-1426129031))
                        var_4_EB = invokestatic:int(Integer::parseInt, loadelement:String(var_3_7E:String[], and:int(ldc:int(-21696), ldc:int(5167))))
                        var_1_DE = and:int(var_1_DE:int, ldc:int(786954941))
                        return:Pair<Integer, String>(invokestatic:Pair(Pair::of, invokestatic:Integer(Integer::valueOf, var_4_EB:int), loadelement:String[expected:Object](var_3_7E:String[], sub:int(arraylength:int(var_3_7E:String[]), and:int(ldc:int(387), ldc:int(49))))))
                    }
                    
                    loopcontinue()
                }
                catch (java.lang.NumberFormatException var_5_FA) {
                    return:Pair<Integer, String>(aconstnull:Pair<Integer, String>())
                }
                
                looporswitchbreak()
            }
            
            var_4_EB = xor:int(ldc:int(258), ldc:int(259))
            return:Pair<Integer, String>(invokestatic:Pair(Pair::of, invokestatic:Integer(Integer::valueOf, var_4_EB:int), loadelement:String[expected:Object](var_3_7E:String[], sub:int(arraylength:int(var_3_7E:String[]), and:int(ldc:int(387), ldc:int(49))))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List<com.mojang.datafixers.util.Pair<java.lang.Integer, java.lang.String>> \ubb2b\u960f\uf995\u64ab\u946b\u965f(java.lang.String p0) {
        var_1_61 : int
        var_3_65 : ArrayList
        var_5_79 : String[]
        var_6_7E : int
        var_7_87 : int
        var_9_AE : Pair<Integer, String>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_1_61 = and:int(ldc:int(-587590055), ldc:int(-17345319))
        var_3_65 = invokestatic:ArrayList(Lists::newArrayList)
        var_5_79 = invokevirtual:String[](String::split, p0:String, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(18982), ldc:int(8450))))
        var_6_7E = arraylength:int(var_5_79:String[])
        var_7_87 = and:int(ldc:int(-10233), ldc:int(9592))
        
        loop {
            var_1_61 = and:int(var_1_61:int, ldc:int(-562366993))
            
            if (cmpge:boolean(var_7_87:int, var_6_7E:int)) {
                return:List<Pair<Integer, String>>(var_3_65:ArrayList<Pair<Integer, String>>[expected:List<Pair<Integer, String>>])
            }
            
            var_9_AE = invokestatic:Pair<Integer, String>(\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\uceb8\u385b\u4e72\u62da\uf995\ub70c, loadelement:String(var_5_79:String[], var_7_87:int))
            
            if (cmpeq:boolean(var_9_AE:Pair<Integer, String>, aconstnull:Pair<Integer, String>())) {
                return:List<Pair<Integer, String>>(invokestatic:List<Pair<Integer, String>>(Collections::emptyList))
            }
            
            invokeinterface:boolean(List<Pair<Integer, String>>::add, var_3_65:ArrayList<Pair<Integer, String>>[expected:List<Pair<Integer, String>>], var_9_AE:Pair<Integer, String>)
            inc:int(var_7_87, ldc:int(1))
        }
    }
    
    private static com.mojang.datafixers.util.Pair lambda$\u8413\u8d90\uc7fe\ud158\ub83f\ua6bd$6(com.mojang.serialization.DynamicOps p0, java.util.Map.Entry p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private static com.mojang.datafixers.util.Pair lambda$\u5db4\u8389\ud4fe\ufcaf\u8bb0\u76bc$5(com.mojang.serialization.DynamicOps p0, java.util.Map.Entry p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Pair(invokestatic:Pair(Pair::of, invokeinterface:Object(DynamicOps::createString, p0:DynamicOps, checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, V>::getKey, p1:Entry<String, V>))), invokeinterface:Object(DynamicOps::createString, p0:DynamicOps, checkcast:String(java.lang.String.class, invokeinterface:V[expected:String](Entry<K, V>::getValue, p1:Entry<String, V>)))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Object lambda$\u836c\u3bc9\ud158\uae5d\u6c56\u7d52$4(com.mojang.serialization.DynamicOps p0, com.mojang.datafixers.util.Pair p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Object(invokeinterface:Object(DynamicOps::createMap, p0:DynamicOps, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, invokeinterface:Object(DynamicOps::createString, p0:DynamicOps, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(8975), ldc:int(21647)))), invokeinterface:Object(DynamicOps::createInt, p0:DynamicOps, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Object[expected:Integer](Pair::getFirst, p1:Pair)))), invokeinterface:Object(DynamicOps::createString, p0:DynamicOps, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(21), ldc:int(536)))), invokeinterface:Object(DynamicOps::createString, p0:DynamicOps, checkcast:String(java.lang.String.class, invokevirtual:Object[expected:String](Pair::getSecond, p1:Pair))))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.Typed lambda$\ub113\u836c\u4cd9\u5245\u7d52\u965f$3(com.mojang.datafixers.types.Type p0, com.mojang.datafixers.Typed p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private static java.lang.IllegalStateException lambda$\u52d3\u836c\uc3e3\ud12e\u7043\u0b8e$2() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(8223), ldc:int(8206)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.DataResult lambda$null$1(com.mojang.datafixers.types.Type p0, com.mojang.serialization.Dynamic p1) {
        var_2_F9 : int
        var_4_77 : Optional
        var_5_FB : Dynamic
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_F9 = and:int(ldc:int(1513534441), ldc:int(-88083970))
            var_4_77 = invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p1:Dynamic, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-28651), ldc:int(-28665))))))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(19463), ldc:int(19476))), invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p1:Dynamic, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(16916), ldc:int(278)))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(599), ldc:int(578))))))) {
                loop {
                    if (cmpeq:boolean(and:int(var_2_F9:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_F9 = and:int(var_2_F9:int, ldc:int(2071377134))
                        
                        if (invokevirtual:boolean(String::equalsIgnoreCase, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(24610), ldc:int(24628))), invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p1:Dynamic, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(1089), ldc:int(1109)))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(11), ldc:int(30)))))) {
                            if (invokevirtual:boolean(Optional::isPresent, var_4_77:Optional)) {
                                var_5_FB = invokevirtual:Dynamic(Dynamic::set, p1:Dynamic, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(186), ldc:int(3095))), invokevirtual:Dynamic(Dynamic::convert, initobject:Dynamic(Dynamic::<init>, getstatic:JsonOps[expected:DynamicOps](JsonOps::INSTANCE), invokestatic:JsonObject[expected:Object](\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u0a06\u6d99\u71f1\u527a\uc87f\u98a4, checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::get, var_4_77:Optional<String>)), xor:int[expected:boolean](ldc:int(7680), ldc:int(7681)))), invokevirtual:DynamicOps(Dynamic::getOps, p1:Dynamic)))
                                looporswitchbreak()
                            }
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_F9:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_F9 = and:int(var_2_F9:int, ldc:int(1778384879))
                        var_5_FB = p1:Dynamic
                        looporswitchbreak()
                    }
                    
                    var_2_F9 = and:int(var_2_F9:int, ldc:int(-704916343))
                }
            }
            else {
                var_5_FB = invokevirtual:Dynamic(Dynamic::set, p1:Dynamic, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(22546), ldc:int(1046))), invokestatic:Dynamic(\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\uc4d2\u93a2\u946b\u7ce1\ud158\u8cae, checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::orElse, var_4_77:Optional<String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(17431), ldc:int(21))))), invokevirtual:DynamicOps(Dynamic::getOps, p1:Dynamic)))
            }
            
            return:DataResult(invokevirtual:DataResult(Type::readTyped, p0:Type, var_5_FB:Dynamic))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7330\u4f4a\u12cb\u56bd\u8350\u8df4$0(java.util.HashMap p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(87), ldc:int(535))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-32698), ldc:int(-32674))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-32627), ldc:int(-32620))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4833), ldc:int(13))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(12346), ldc:int(1438))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(8208), ldc:int(8203))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(8252), ldc:int(6684))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(29), ldc:int(29245))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(6175), ldc:int(9374))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(25791), ldc:int(287))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(24725), ldc:int(24757))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(16689), ldc:int(4143))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(822), ldc:int(24674))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(24107), ldc:int(8227))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(228), ldc:int(8245))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(25191), ldc:int(5285))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(28710), ldc:int(615))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(2599), ldc:int(21671))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(56), ldc:int(25708))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(8761), ldc:int(299))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(12842), ldc:int(1066))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(10283), ldc:int(1579))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4652), ldc:int(26798))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(284), ldc:int(305))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4142), ldc:int(302))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(513), ldc:int(558))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(8246), ldc:int(2937))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-13265), ldc:int(-13282))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(2673), ldc:int(2627))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(323), ldc:int(368))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(1468), ldc:int(54))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(1141), ldc:int(26685))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(5187), ldc:int(5237))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-30706), ldc:int(-30663))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(133), ldc:int(189))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(300), ldc:int(277))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(698), ldc:int(23610))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(251), ldc:int(4155))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4156), ldc:int(2111))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(12345), ldc:int(12292))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(26672), ldc:int(26638))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-32630), ldc:int(-32587))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(4766), ldc:int(4830))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(833), ldc:int(24661))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(10294), ldc:int(10356))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(46), ldc:int(109))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(1073), ldc:int(1141))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(16494), ldc:int(16427))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(5166), ldc:int(5224))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(15), ldc:int(72))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(2888), ldc:int(4312))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-24305), ldc:int(-24250))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(2266), ldc:int(24906))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(29259), ldc:int(1275))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(18509), ldc:int(8780))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(16477), ldc:int(5453))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(10278), ldc:int(10344))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-32182), ldc:int(-32251))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(4480), ldc:int(4560))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(17745), ldc:int(85))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(2134), ldc:int(346))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(5855), ldc:int(115))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(33), ldc:int(117))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(85), ldc:int(20567))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(5846), ldc:int(86))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-30505), ldc:int(-30592))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(21007), ldc:int(21079))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(2105), ldc:int(2144))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-27647), ldc:int(-27557))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(18523), ldc:int(1275))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-32238), ldc:int(-32178))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(1885), ldc:int(93))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-31448), ldc:int(-31370))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(16394), ldc:int(16469))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-28419), ldc:int(-28515))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(16990), ldc:int(16959))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(8307), ldc:int(23146))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(286), ldc:int(381))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4196), ldc:int(24941))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(25164), ldc:int(25129))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(16998), ldc:int(4214))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(16954), ldc:int(16989))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(374), ldc:int(286))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(747), ldc:int(6521))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(1386), ldc:int(8426))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(843), ldc:int(800))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-28122), ldc:int(-28086))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(393), ldc:int(484))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(25653), ldc:int(25691))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-14271), ldc:int(-14290))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(4401), ldc:int(4417))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-31174), ldc:int(-31157))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(317), ldc:int(335))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(24646), ldc:int(24629))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(2757), ldc:int(2737))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(2173), ldc:int(17909))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(806), ldc:int(848))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(13495), ldc:int(13504))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4474), ldc:int(8440))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-31880), ldc:int(-31999))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(83), ldc:int(41))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(21119), ldc:int(123))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(2428), ldc:int(252))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(290), ldc:int(351))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(2146), ldc:int(2076))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(23167), ldc:int(127))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4740), ldc:int(8385))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(28803), ldc:int(1745))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(2695), ldc:int(162))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(2287), ldc:int(387))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4237), ldc:int(132))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4791), ldc:int(9669))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(8326), ldc:int(3718))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(20911), ldc:int(8327))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(236), ldc:int(13960))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(12628), ldc:int(12765))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(18602), ldc:int(9614))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(1260), ldc:int(1127))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(16588), ldc:int(2220))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(141), ldc:int(20621))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4510), ldc:int(2190))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4255), ldc:int(18063))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(16637), ldc:int(5264))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-23794), ldc:int(-23649))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(16666), ldc:int(16776))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(23263), ldc:int(1171))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(130), ldc:int(22))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(10438), ldc:int(10323))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(406), ldc:int(25791))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(1207), ldc:int(28831))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(12633), ldc:int(12737))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-31610), ldc:int(-31713))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(4538), ldc:int(1179))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(22687), ldc:int(2011))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(17564), ldc:int(8413))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(12445), ldc:int(159))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-32228), ldc:int(-32126))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(-32653), ldc:int(-32532))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(16608), ldc:int(2468))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(225), ldc:int(26029))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(10427), ldc:int(5542))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(12461), ldc:int(12302))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(678), ldc:int(1188))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(11429), ldc:int(4269))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), and:int(ldc:int(230), ldc:int(8870))), loadelement:String(getstatic:String[](\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0::\u6d99\u759a\u9a18\u6cfe\ufcaf\ua3b4), xor:int(ldc:int(4186), ldc:int(4349))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \u8d98\u97b7\u64ab\u7873\u8350\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6DE : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6E9 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_6DE = and:int(ldc:int(-1441817592), ldc:int(-1438147490))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1609382804))
        }
        else {
            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-87040806))
            var_5_8A = and:int(ldc:int(16917), ldc:int(-16918))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-6547), ldc:int(6546)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6DE:int, ldc:int(2014156891))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(-28672), ldc:int(-28671)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(7429), ldc:int(8401)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6DE = and:int(var_3_E3:int, ldc:int(1030990712))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(40), ldc:int(41)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1339453623))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(771010529))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(835905307))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-192903247))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1320215901))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1964017866))
                    }
                    else {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(671337129))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0438:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-126031550))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1626328048))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1225184854))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(743295466))
                            var_11_F4 = and:int(ldc:int(-14277), ldc:int(14020))
                            goto(Label_1625)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1127665966))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(85703931))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1647124086))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(1096681212))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1154753272))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1199432329))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(858223854))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1535676919))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(865407811))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1024207166))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-214228444))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(986599919))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(776972776))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(253808662))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1996090098))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1198749289))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-414729270))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-340885005))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1752803640))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-42735075))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(204), ldc:int(205))
                                goto(Label_1191)
                            }
                        }
                    }
                    
                    Label_1022:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-322641127))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1813076840))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-13667786))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1176885662))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1037006751))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(718384893))
                        var_11_F4 = and:int(ldc:int(10002), ldc:int(-10103))
                    }
                    
                    Label_1191:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1497285352))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(275321925))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(780887080))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(1486032879))
                            goto(Label_1022)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(1498211235))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-598522958))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1159161287))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1827397439))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1461)
                            }
                        }
                    }
                    
                    Label_1343:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(237512962))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-925563556))
                            goto(Label_1191)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-121123714))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1625)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1461:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-399468790))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-434844797))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1438050207))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(170088125))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(773096134))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(265855941))
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(557008252))
                        loopcontinue()
                    }
                    
                    var_3_6DE = and:int(var_3_6DE:int, ldc:int(1859385576))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1625:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6E9 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1636:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-2018629780))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1669533024))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-682779943))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1094021707))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1126436968))
                        var_17_6E9 = add:int(var_16_122:int, xor:int(ldc:int(18435), ldc:int(18434)))
                        looporswitchbreak()
                    }
                    
                    var_3_6DE = and:int(var_3_6DE:int, ldc:int(-398931318))
                }
                
                var_3_6DE = and:int(var_3_6DE:int, ldc:int(1843121611))
                
                if (cmple:boolean(var_5_8A = var_17_6E9:int, sub:int(var_6_91:int, and:int(ldc:int(1091), ldc:int(12817))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-974810544))
            goto(Label_0108)
        }
    }
}

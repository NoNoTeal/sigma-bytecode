public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u6b5f\u0800\u183a\u88c5\u76bc\u59ec {
    private void \u6b5f\u0800\u183a\u88c5\u76bc\u59ec() {
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
    
    public void \u6435\u3e2a\u71ae\u2dcc\u4492\ub102() {
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
            putfield:boolean(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\u6cfe\u3bc9\uc29a\u600f\u40a9\u0b8e, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec, and:int[expected:boolean](ldc:int(2475), ldc:int(16917)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u16f6\uf9c5\u0c95\u62da\u97e6\u76bc() {
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
            putfield:boolean(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\u6cfe\u3bc9\uc29a\u600f\u40a9\u0b8e, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec, and:int[expected:boolean](ldc:int(9409), ldc:int(-9930)))
            invokevirtual:void(Long2IntLinkedOpenHashMap::clear, getfield:Long2IntLinkedOpenHashMap(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec))
            invokevirtual:void(Long2FloatLinkedOpenHashMap::clear, getfield:Long2FloatLinkedOpenHashMap(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\u4975\u5f50\u5bc4\u5fe1\ua61f\u5bc4, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \uc246\ud7e8\u7c6b\ube23\u3e75\u6d99(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
        var_4_61 : int
        var_6_67 : long
        var_8_9D : int
        var_4_75 : int
        var_8_7D : int
        
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
            var_4_61 = and:int(ldc:int(-1066645926), ldc:int(-412559909))
            var_6_67 = invokevirtual:long(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\ubff1\u59ec\u183a\ub32d\u4e72\u0800, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (getfield:boolean(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\u6cfe\u3bc9\uc29a\u600f\u40a9\u0b8e, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec)) {
                var_8_9D = invokevirtual:int(Long2IntLinkedOpenHashMap::get, getfield:Long2IntLinkedOpenHashMap(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec), var_6_67:long)
                
                if (cmpne:boolean(var_8_9D:int, ldc:int(2147483647))) {
                    return:int(var_8_9D:int)
                }
            }
            
            var_4_75 = and:int(var_4_61:int, ldc:int(-107942866))
            var_8_7D = invokestatic:int(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud7e8\u6cfe\ud171\ub18d\ub102\u6198, p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (getfield:boolean(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\u6cfe\u3bc9\uc29a\u600f\u40a9\u0b8e, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec)) {
                if (cmpeq:boolean(invokevirtual:int(Long2IntLinkedOpenHashMap::size, getfield:Long2IntLinkedOpenHashMap(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec)), ldc:int(100))) {
                    invokevirtual:int(Long2IntLinkedOpenHashMap::removeFirstInt, getfield:Long2IntLinkedOpenHashMap(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec))
                }
                
                var_4_75 = and:int(var_4_75:int, ldc:int(-662425766))
                invokevirtual:int(Long2IntLinkedOpenHashMap::put, getfield:Long2IntLinkedOpenHashMap(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec), var_6_67:long, var_8_7D:int)
            }
            
            return:int(var_8_7D:int)
        }
        
        goto(Label_0006)
    }
    
    public float \uc2bd\u718f\u62da\u5fe1\u446c\uceb8(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
        var_4_61 : int
        var_6_67 : long
        var_8_9D : float
        var_4_75 : int
        var_8_7D : float
        
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
            var_4_61 = and:int(ldc:int(1979300266), ldc:int(1946025443))
            var_6_67 = invokevirtual:long(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\ubff1\u59ec\u183a\ub32d\u4e72\u0800, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (getfield:boolean(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\u6cfe\u3bc9\uc29a\u600f\u40a9\u0b8e, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec)) {
                var_8_9D = invokevirtual:float(Long2FloatLinkedOpenHashMap::get, getfield:Long2FloatLinkedOpenHashMap(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\u4975\u5f50\u5bc4\u5fe1\ua61f\u5bc4, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec), var_6_67:long)
                
                if (logicalnot:boolean(invokestatic:boolean(Float::isNaN, var_8_9D:float))) {
                    return:float(var_8_9D:float)
                }
            }
            
            var_4_75 = and:int(var_4_61:int, ldc:int(2111683942))
            var_8_7D = invokevirtual:float(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u2dcc\u0a06\u7006\u446c\u7bad\u4ab3, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (getfield:boolean(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\u6cfe\u3bc9\uc29a\u600f\u40a9\u0b8e, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec)) {
                if (cmpeq:boolean(invokevirtual:int(Long2FloatLinkedOpenHashMap::size, getfield:Long2FloatLinkedOpenHashMap(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\u4975\u5f50\u5bc4\u5fe1\ua61f\u5bc4, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec)), ldc:int(100))) {
                    invokevirtual:float(Long2FloatLinkedOpenHashMap::removeFirstFloat, getfield:Long2FloatLinkedOpenHashMap(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\u4975\u5f50\u5bc4\u5fe1\ua61f\u5bc4, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec))
                }
                
                var_4_75 = and:int(var_4_75:int, ldc:int(-205932085))
                invokevirtual:float(Long2FloatLinkedOpenHashMap::put, getfield:Long2FloatLinkedOpenHashMap(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::\u4975\u5f50\u5bc4\u5fe1\ua61f\u5bc4, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec), var_6_67:long, var_8_7D:float)
            }
            
            return:float(var_8_7D:float)
        }
        
        goto(Label_0006)
    }
    
    private it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap lambda$\uafe7\u0b8e\u74b1\u7873\u76bc\u9af2$1() {
        var_3_6C : \u3e75\u5db4\u9937\u93a2\u12cb\ud523
        
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
            var_3_6C = initobject:\u3e75\u5db4\u9937\u93a2\u12cb\ud523(\u3e75\u5db4\u9937\u93a2\u12cb\ud523::<init>, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec, ldc:int(100), ldc:float(0.25f))
            invokevirtual:void(Long2FloatLinkedOpenHashMap::defaultReturnValue, var_3_6C:\u3e75\u5db4\u9937\u93a2\u12cb\ud523[expected:Long2FloatLinkedOpenHashMap], ldc:float(Float.NaN))
            return:Long2FloatLinkedOpenHashMap(var_3_6C:\u3e75\u5db4\u9937\u93a2\u12cb\ud523[expected:Long2FloatLinkedOpenHashMap])
        }
        
        goto(Label_0006)
    }
    
    private it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap lambda$\u64f2\u385b\u836c\u93a2\ub1b9\ufe34$0() {
        var_3_6C : \uff55\u16f6\uc7fe\u385b\uf94d\u965f
        
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
            var_3_6C = initobject:\uff55\u16f6\uc7fe\u385b\uf94d\u965f(\uff55\u16f6\uc7fe\u385b\uf94d\u965f::<init>, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec, ldc:int(100), ldc:float(0.25f))
            invokevirtual:void(Long2IntLinkedOpenHashMap::defaultReturnValue, var_3_6C:\uff55\u16f6\uc7fe\u385b\uf94d\u965f[expected:Long2IntLinkedOpenHashMap], ldc:int(2147483647))
            return:Long2IntLinkedOpenHashMap(var_3_6C:\uff55\u16f6\uc7fe\u385b\uf94d\u965f[expected:Long2IntLinkedOpenHashMap])
        }
        
        goto(Label_0006)
    }
    
    public void \u6b5f\u0800\u183a\u88c5\u76bc\u59ec(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u3e75\u4492\u4f4a\uc7fe\u4cd9\uc238 p0) {
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
            invokespecial:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec(\u6b5f\u0800\u183a\u88c5\u76bc\u59ec::<init>, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5f50\u92ee\u4179\u8cae\u9937\u36d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A1 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6AC : int
        
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
        var_3_6A1 = and:int(ldc:int(541467456), ldc:int(-438989862))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b5f\u0800\u183a\u88c5\u76bc\u59ec[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(128)), ldc:int(0))) {
            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-594802297))
        }
        else {
            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-318868560))
            var_5_85 = and:int(ldc:int(593), ldc:int(-594))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13121), ldc:int(13120)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6A1:int, ldc:int(-1396329565))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(2340), ldc:int(2341)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-32640), ldc:int(-32639)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6A1 = and:int(var_3_DA:int, ldc:int(1785524594))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1316), ldc:int(1317)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1831943109))
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1478501356))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(255353812))
                        goto(Label_0981)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-992434066))
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1818893652))
                        goto(Label_0579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(2100382525))
                    }
                    else {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1041122237))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0579)
                            }
                            
                            goto(Label_0862)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-887232233))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1874710663))
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0981)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1782399370))
                        goto(Label_0726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1612067791))
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1452911249))
                        var_11_EB = and:int(ldc:int(8763), ldc:int(-8764))
                        goto(Label_1568)
                    }
                    
                    Label_0579:
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1793089401))
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-585088803))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1372176077))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1646575378))
                        goto(Label_0981)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1939439914))
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(546532691))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1661971940))
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-503863309))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0862)
                        }
                    }
                    
                    Label_0726:
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(961561168))
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1179474664))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-213820593))
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(931642017))
                        goto(Label_0981)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1095958117))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0579)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(982283622))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0862:
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1148682025))
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(830015692))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1860812017))
                            goto(Label_0579)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(44420711))
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(546822058))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(-32512), ldc:int(-32511))
                                goto(Label_1147)
                            }
                        }
                    }
                    
                    Label_0981:
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1411995912))
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1070088872))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0862)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1042691955))
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1667409718))
                            goto(Label_0579)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1443092172))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1905151476))
                        var_11_EB = and:int(ldc:int(-30723), ldc:int(30722))
                    }
                    
                    Label_1147:
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0981)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1902352092))
                            goto(Label_0862)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1144144173))
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0579)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1857951868))
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-197156894))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1427)
                            }
                        }
                    }
                    
                    Label_1261:
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1775075037))
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1700857299))
                            goto(Label_1147)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-367856485))
                            goto(Label_0981)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1199987507))
                            goto(Label_0862)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(297805248))
                            goto(Label_0726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1747354004))
                            goto(Label_0579)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(722916437))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-2013317985))
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(871880029))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1568)
                    }
                    
                    Label_1427:
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(804786837))
                        goto(Label_0981)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-2024727083))
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-543511115))
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-734270568))
                        goto(Label_0579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(41498065))
                        goto(Label_0416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-404384861))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1568:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AC = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1579:
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1777000023))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1612611730))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1096778714))
                        goto(Label_0981)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(728454190))
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(494366268))
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-344572987))
                        var_17_6AC = add:int(var_16_119:int, xor:int(ldc:int(712), ldc:int(713)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1075855386))
                
                if (cmple:boolean(var_5_85 = var_17_6AC:int, sub:int(var_6_8C:int, xor:int(ldc:int(20), ldc:int(21))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(166757475))
            goto(Label_0106)
        }
    }
}
